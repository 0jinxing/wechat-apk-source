package com.tencent.mm.plugin.sight.encode.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.encode.a.a;
import com.tencent.mm.plugin.sight.encode.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SightCameraView$1
  implements ap.a
{
  SightCameraView$1(SightCameraView paramSightCameraView)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(25108);
    float f = (float)this.qBI.qBv.clz() / this.qBI.qBC;
    if ((Float.compare(f, 0.0F) <= 0) && (System.currentTimeMillis() - SightCameraView.a(this.qBI) > 20000L))
    {
      ab.e("MicroMsg.SightCameraView", "ERROR record duration, %dms !!!", new Object[] { Long.valueOf(20000L) });
      this.qBI.bty();
      AppMethodBeat.o(25108);
      return bool;
    }
    if ((Float.compare(f, 1.0F) > 0) && (this.qBI.qBv.clA() == a.a.qAe))
      if (!this.qBI.qBv.Cw())
        SightCameraView.b(this.qBI);
    while (true)
    {
      AppMethodBeat.o(25108);
      bool = true;
      break;
      this.qBI.aW(f);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.SightCameraView.1
 * JD-Core Version:    0.6.2
 */