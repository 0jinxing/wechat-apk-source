package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class i$1
  implements b.a
{
  i$1(i parami)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(113318);
    if (!paramBoolean)
    {
      paramBoolean = false;
      AppMethodBeat.o(113318);
      return paramBoolean;
    }
    if ((this.nJT.nJP != -1000.0D) && (this.nJT.nJQ != -1000.0D))
      this.nJT.nJS = f.a(this.nJT.nJQ, this.nJT.nJP, paramFloat1, paramFloat2, paramInt, paramDouble1);
    this.nJT.nJP = paramFloat2;
    this.nJT.nJQ = paramFloat1;
    if ((this.nJT.nJO == 900.0D) || (this.nJT.nJN == 900.0D))
    {
      i locali1 = this.nJT;
      i locali2 = this.nJT;
      paramDouble1 = f.h(paramFloat2, paramFloat1);
      locali2.nJN = paramDouble1;
      locali1.nJO = paramDouble1;
    }
    while (true)
    {
      ab.d("MicroMsg.OrientationSensorMgr", "onGetLocation, update headding, mCurrentHeading = %f, mPreviousHeading = %f mIsMove = %b", new Object[] { Double.valueOf(this.nJT.nJN), Double.valueOf(this.nJT.nJO), Boolean.valueOf(this.nJT.nJS) });
      paramBoolean = true;
      AppMethodBeat.o(113318);
      break;
      this.nJT.nJO = this.nJT.nJN;
      this.nJT.nJN = f.h(paramFloat2, paramFloat1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.i.1
 * JD-Core Version:    0.6.2
 */