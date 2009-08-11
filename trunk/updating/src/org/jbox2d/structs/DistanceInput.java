package org.jbox2d.structs;

import org.jbox2d.common.Transform;

/**
 * Input for Distance.
 * You have to option to use the shape radii
 * in the computation.
 *
 */
public class DistanceInput {
	public final DistanceProxy proxyA = new DistanceProxy();
	public final DistanceProxy proxyB = new DistanceProxy();
	public final Transform transformA = new Transform();
	public final Transform transformB = new Transform();
	public boolean useRadii;
}
