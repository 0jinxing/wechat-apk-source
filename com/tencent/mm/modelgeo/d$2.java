package com.tencent.mm.modelgeo;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class d$2 extends g
{
  d$2(d paramd)
  {
  }

  public final void a(boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt1, double paramDouble3, double paramDouble4, double paramDouble5, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(78128);
    d.a(this.fBV, paramBoolean, paramDouble1, paramDouble2, paramDouble4, false);
    if (paramBoolean)
    {
      this.fBV.fBJ = paramDouble1;
      this.fBV.fBK = paramDouble2;
      this.fBV.fBL = paramInt1;
      this.fBV.fBM = paramDouble3;
      this.fBV.fBN = paramDouble4;
      this.fBV.bDJ = paramDouble5;
      this.fBV.fBO = paramString1;
      this.fBV.fBP = paramString2;
      this.fBV.fBQ = paramInt2;
      this.fBV.fBI = true;
      this.fBV.fBH = false;
      this.fBV.fBG = System.currentTimeMillis();
      d.a(this.fBV, 67591);
    }
    ab.d("MicroMsg.LocationGeo", "onGetLocationWgs84 fLongitude: %f fLatitude:%f locType:%d %f:spped", new Object[] { Double.valueOf(paramDouble2), Double.valueOf(paramDouble1), Integer.valueOf(paramInt1), Double.valueOf(paramDouble3) });
    new ak(Looper.getMainLooper()).postDelayed(new d.2.1(this, paramBoolean, paramDouble1, paramDouble2, paramInt1, paramDouble3, paramDouble4, paramDouble5), 200L);
    AppMethodBeat.o(78128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.d.2
 * JD-Core Version:    0.6.2
 */