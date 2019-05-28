import com.google.common.collect.ImmutableSet;

import java.io.File;
import java.util.Set;

/**
 * Created by 5zig.
 * All rights reserved © 2015
 */
public class The5zigModResourcePack extends cee {

	public static final Set<String> resourceDomains = ImmutableSet.of("the5zigmod");

	public The5zigModResourcePack() {
		super(new cec() {
			@Override
			public File a(nd nd) {
				return null;
			}

			@Override
			public boolean b(nd nd) {
				return false;
			}

			@Override
			public File a() {
				return null;
			}
		});
	}

	/**
	 * getResourceDomains
	 *
	 * @return a Set with all resource domains of this resource pack.
	 */
	@Override
	public Set<String> c() {
		return resourceDomains;
	}

	/**
	 * getName
	 *
	 * @return the Name of this Pack.
	 */
	@Override
	public String b() {
		return "The 5zig Mod";
	}
}