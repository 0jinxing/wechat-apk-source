package com.tencent.mm.modelgeo;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class d$1 extends f
{
  d$1(d paramd)
  {
  }

  public final void a(boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt1, double paramDouble3, double paramDouble4, double paramDouble5, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(78125);
    d.a(this.fBV, paramBoolean, paramDouble1, paramDouble2, paramDouble4, true);
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
      this.fBV.fBG = System.currentTimeMillis();
      this.fBV.fBH = true;
      this.fBV.fBI = false;
      d.a(this.fBV, 67592);
    }
    ab.d("MicroMsg.LocationGeo", "onGetLocation fLongitude: %f fLatitude:%f locType:%d %f:spped", new Object[] { Double.valueOf(paramDouble2), Double.valueOf(paramDouble1), Integer.valueOf(paramInt1), Double.valueOf(paramDouble3) });
    new ak(Looper.getMainLooper()).post(new d.1.1(this, paramBoolean, paramDouble1, paramDouble2, paramInt1, paramDouble3, paramDouble4, paramDouble5));
    AppMethodBeat.o(78125);
  }

  public final void onStatusUpdate(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(78126);
    ab.i("MicroMsg.LocationGeo", "onStatusUpdate name %s, status %d", new Object[] { paramString1, Integer.valueOf(paramInt) });
    AppMethodBeat.o(78126);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.d.1
 * JD-Core Version:    0.6.2
 */