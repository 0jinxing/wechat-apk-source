package com.b.a.a;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$d
{
  private float bHQ = 0.0F;
  private float bHR = 0.0F;
  private float bHS = 0.0F;
  private float bHT = 0.0F;
  private float bHU = 0.0F;
  private float bHV = 0.0F;
  private float bHW = 0.0F;
  private float bHX = 0.0F;
  private float bHY = 0.0F;
  private int count = 0;

  final u.b a(float[][] paramArrayOfFloat)
  {
    int i = 0;
    while (true)
    {
      u.b localb;
      try
      {
        AppMethodBeat.i(55631);
        if ((this.count <= 0) || (paramArrayOfFloat.length < 3))
        {
          paramArrayOfFloat = null;
          AppMethodBeat.o(55631);
          return paramArrayOfFloat;
        }
        localb = new com/b/a/a/u$b;
        localb.<init>((byte)0);
        localb.time = SystemClock.elapsedRealtime();
        if (i > 5)
        {
          localb.bHz = (this.bHQ / this.count);
          localb.bHA = (this.bHR / this.count);
          localb.bHB = (this.bHS / this.count);
          localb.bHC = (this.bHT / this.count);
          localb.bHD = (this.bHU / this.count);
          localb.bHE = (this.bHV / this.count);
          localb.bHF = (this.bHW / this.count);
          localb.bHG = (this.bHX / this.count);
          localb.bHH = (this.bHY / this.count);
          localb.bHJ = ((float)Math.sqrt(localb.bHz * localb.bHz + localb.bHA * localb.bHA));
          reset();
          AppMethodBeat.o(55631);
          paramArrayOfFloat = localb;
          continue;
        }
      }
      finally
      {
      }
      localb.bHK[i] = paramArrayOfFloat[i][0];
      localb.bHL[i] = paramArrayOfFloat[i][1];
      localb.bHM[i] = paramArrayOfFloat[i][2];
      localb.bHN[i] = ((float)Math.sin(localb.bHK[i]));
      localb.bHO[i] = ((float)Math.cos(localb.bHK[i]));
      i++;
    }
  }

  final void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    try
    {
      if (paramArrayOfFloat1.length >= 3)
      {
        this.count += 1;
        this.bHQ += paramArrayOfFloat1[0];
        this.bHR += paramArrayOfFloat1[1];
        this.bHS += paramArrayOfFloat1[2];
        this.bHT += paramArrayOfFloat2[0];
        this.bHU += paramArrayOfFloat2[1];
        this.bHV += paramArrayOfFloat2[2];
        this.bHW += paramArrayOfFloat3[0];
        this.bHX += paramArrayOfFloat3[1];
        this.bHY += paramArrayOfFloat3[2];
      }
      return;
    }
    finally
    {
      paramArrayOfFloat1 = finally;
    }
    throw paramArrayOfFloat1;
  }

  final void reset()
  {
    try
    {
      this.count = 0;
      this.bHQ = 0.0F;
      this.bHR = 0.0F;
      this.bHS = 0.0F;
      this.bHT = 0.0F;
      this.bHU = 0.0F;
      this.bHV = 0.0F;
      this.bHW = 0.0F;
      this.bHX = 0.0F;
      this.bHY = 0.0F;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.b.a.a.u.d
 * JD-Core Version:    0.6.2
 */