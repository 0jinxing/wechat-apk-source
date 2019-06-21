package com.tencent.mm.audio.mix.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends f
{
  protected final byte[] D(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137085);
    int i = 0;
    if (i < paramInt2)
    {
      int j = 0;
      float f1 = 0.0F;
      float f3;
      for (float f2 = 0.0F; j < paramInt1; f2 = f3 + f2)
      {
        f1 = (float)(f1 + Math.pow(this.cmZ[j][i], 2.0D) * Math.signum(this.cmZ[j][i]));
        f3 = Math.abs(this.cmZ[j][i]);
        j++;
      }
      if (f2 == 0.0F)
      {
        j = 0;
        label108: localObject = this.cnc;
        if (f2 != 0.0F)
          break label149;
      }
      label149: for (j = 0; ; j = gz(j))
      {
        localObject[i] = ((short)j);
        i++;
        break;
        j = (int)(f1 / f2);
        break label108;
      }
    }
    Object localObject = bM(paramInt3, paramInt2);
    AppMethodBeat.o(137085);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.a
 * JD-Core Version:    0.6.2
 */