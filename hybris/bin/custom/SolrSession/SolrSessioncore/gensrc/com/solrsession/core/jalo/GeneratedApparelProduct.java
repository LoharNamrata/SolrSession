/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 16, 2019, 11:24:16 AM                   ---
 * ----------------------------------------------------------------
 */
package com.solrsession.core.jalo;

import com.solrsession.core.constants.SolrSessionCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.solrsession.core.jalo.ApparelProduct ApparelProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedApparelProduct extends Product
{
	/** Qualifier of the <code>ApparelProduct.genders</code> attribute **/
	public static final String GENDERS = "genders";
	/** Qualifier of the <code>ApparelProduct.prior</code> attribute **/
	public static final String PRIOR = "prior";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GENDERS, AttributeMode.INITIAL);
		tmp.put(PRIOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, GENDERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders()
	{
		return getGenders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, GENDERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final List<EnumerationValue> value)
	{
		setGenders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.prior</code> attribute.
	 * @return the prior
	 */
	public Integer getPrior(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PRIOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.prior</code> attribute.
	 * @return the prior
	 */
	public Integer getPrior()
	{
		return getPrior( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.prior</code> attribute. 
	 * @return the prior
	 */
	public int getPriorAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPrior( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.prior</code> attribute. 
	 * @return the prior
	 */
	public int getPriorAsPrimitive()
	{
		return getPriorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.prior</code> attribute. 
	 * @param value the prior
	 */
	public void setPrior(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PRIOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.prior</code> attribute. 
	 * @param value the prior
	 */
	public void setPrior(final Integer value)
	{
		setPrior( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.prior</code> attribute. 
	 * @param value the prior
	 */
	public void setPrior(final SessionContext ctx, final int value)
	{
		setPrior( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.prior</code> attribute. 
	 * @param value the prior
	 */
	public void setPrior(final int value)
	{
		setPrior( getSession().getSessionContext(), value );
	}
	
}
