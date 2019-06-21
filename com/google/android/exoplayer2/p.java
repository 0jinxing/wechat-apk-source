package com.google.android.exoplayer2;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p
{
  public static final p aOC;
  public final int aOD;
  public final float pitch;
  public final float speed;

  static
  {
    AppMethodBeat.i(95390);
    aOC = new p(1.0F, 1.0F);
    AppMethodBeat.o(95390);
  }

  public p(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(95387);
    this.speed = paramFloat1;
    this.pitch = paramFloat2;
    this.aOD = Math.round(1000.0F * paramFloat1);
    AppMethodBeat.o(95387);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95388);
    if (this == paramObject)
      AppMethodBeat.o(95388);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95388);
        bool = false;
      }
      else
      {
        paramObject = (p)paramObject;
        if ((this.speed == paramObject.speed) && (this.pitch == paramObject.pitch))
        {
          AppMethodBeat.o(95388);
        }
        else
        {
          AppMethodBeat.o(95388);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95389);
    int i = Float.floatToRawIntBits(this.speed);
    int j = Float.floatToRawIntBits(this.pitch);
    AppMethodBeat.o(95389);
    return (i + 527) * 31 + j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.p
 * JD-Core Version:    0.6.2
 */