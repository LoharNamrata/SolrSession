/**
 *
 */
package com.solrsession.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.solrsession.core.model.ApparelProductModel;
import com.solrsession.core.model.ApparelSizeVariantProductModel;
import com.solrsession.core.model.ApparelStyleVariantProductModel;


/**
 * @author admin
 *
 */
public class SolrSessionPriorListValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider
{

	private FieldNameProvider fieldNameProvider;

	@Override
	public Collection<FieldValue> getFieldValues(final IndexConfig paramIndexConfig, final IndexedProperty paramIndexedProperty,
			final Object paramObject) throws FieldValueProviderException
	{
		final ApparelProductModel apparelProductModel = getApparelProductModel(paramObject);
		final Collection<FieldValue> fieldValues = new ArrayList<FieldValue>();

		final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(paramIndexedProperty, null);
		final String fieldName = fieldNames.iterator().next();

		if (!apparelProductModel.getPriorList().isEmpty())
		{
			for (final Integer prior : apparelProductModel.getPriorList())
			{
				fieldValues.add(new FieldValue(fieldName, prior));
			}
			return fieldValues;
		}
		else
		{
			return Collections.emptyList();
		}
	}

	protected ApparelProductModel getApparelProductModel(final Object model)
	{
		Object finalModel = model;
		if (model instanceof ApparelSizeVariantProductModel)
		{
			finalModel = ((ApparelSizeVariantProductModel) finalModel).getBaseProduct();
		}

		if (finalModel instanceof ApparelStyleVariantProductModel)
		{
			finalModel = ((ApparelStyleVariantProductModel) finalModel).getBaseProduct();
		}

		if (finalModel instanceof ApparelProductModel)
		{
			return (ApparelProductModel) finalModel;
		}
		else
		{
			return null;
		}
	}

	/**
	 * @return the fieldNameProvider
	 */
	public FieldNameProvider getFieldNameProvider()
	{
		return fieldNameProvider;
	}

	/**
	 * @param fieldNameProvider
	 *           the fieldNameProvider to set
	 */
	public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
	{
		this.fieldNameProvider = fieldNameProvider;
	}
}
