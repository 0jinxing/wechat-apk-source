package com.tencent.mm.modelgeo;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1$1
  implements Runnable
{
  d$1$1(d.1 param1, boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78124);
    Bundle localBundle = new Bundle();
    localBundle.putString("indoor_building_floor", this.fCd.fBV.fBP);
    localBundle.putString("indoor_building_id", this.fCd.fBV.fBO);
    localBundle.putInt("indoor_building_type", this.fCd.fBV.fBQ);
    d.a(this.fCd.fBV, this.fBW, this.fBX, this.fBY, this.fBZ, this.fCa, this.fCb, this.fCc, localBundle);
    AppMethodBeat.o(78124);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.d.1.1
 * JD-Core Version:    0.6.2
 */