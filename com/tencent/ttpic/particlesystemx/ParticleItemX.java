package com.tencent.ttpic.particlesystemx;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.particlesystem2d.Particle;

public class ParticleItemX
{
  private static final String TAG;
  public float emitterX;
  public float emitterY;
  public Particle[] particles;
  public float screenRatioScale = 1.0F;

  static
  {
    AppMethodBeat.i(83660);
    TAG = ParticleItemX.class.getSimpleName();
    AppMethodBeat.o(83660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.particlesystemx.ParticleItemX
 * JD-Core Version:    0.6.2
 */