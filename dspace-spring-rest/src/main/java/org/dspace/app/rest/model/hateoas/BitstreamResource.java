/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.rest.model.hateoas;

import org.dspace.app.rest.model.BitstreamRest;
import org.dspace.app.rest.utils.Utils;

/**
 * Bitstream Rest HAL Resource. The HAL Resource wraps the REST Resource
 * adding support for the links and embedded resources
 * 
 * @author Andrea Bollini (andrea.bollini at 4science.it)
 *
 */
@RelNameDSpaceResource(BitstreamRest.NAME)
public class BitstreamResource extends DSpaceResource<BitstreamRest> {
	public BitstreamResource(BitstreamRest bs, Utils utils, String... rels) {
		super(bs, utils, rels);
//		if (bs.getFormat() != null) {
//			BitstreamFormatResource bfr = new BitstreamFormatResource(bs.getFormat());
//			this.add(new Link(bfr.getLink(Link.REL_SELF).getHref(), "bitstreamformat"));
//		}
	}
}
