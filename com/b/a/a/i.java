package com.b.a.a;

import android.location.Location;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i
{
  static i bDs;
  float bDA;
  boolean bDB = false;
  double bDt;
  double bDu;
  float bDv;
  float bDw;
  float bDx;
  float bDy;
  float bDz;

  final void a(double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(55678);
    float[] arrayOfFloat = new float[1];
    if (paramDouble2 > 179.0D)
    {
      d = -1.E-005D;
      Location.distanceBetween(paramDouble1, paramDouble2, paramDouble1, paramDouble2 + d, arrayOfFloat);
      this.bDA = arrayOfFloat[0];
      if (paramDouble1 <= 89.0D)
        break label129;
    }
    label129: for (double d = -1.E-005D; ; d = 1.E-005D)
    {
      Location.distanceBetween(d + paramDouble1, paramDouble2, paramDouble1, paramDouble2, arrayOfFloat);
      this.bDz = arrayOfFloat[0];
      this.bDt = paramDouble1;
      this.bDu = paramDouble2;
      this.bDv = paramFloat2;
      this.bDw = paramFloat3;
      this.bDy = paramFloat1;
      this.bDx = paramFloat4;
      this.bDB = true;
      AppMethodBeat.o(55678);
      return;
      d = 1.E-005D;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.b.a.a.i
 * JD-Core Version:    0.6.2
 */