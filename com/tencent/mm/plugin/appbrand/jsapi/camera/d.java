package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.f;
import com.tencent.mm.sdk.platformtools.ab;

final class d
  implements MMSightRecordView.f
{
  final p hGU;
  boolean hGV;
  int hGW;
  private final c hzz;

  public d(c paramc)
  {
    AppMethodBeat.i(130968);
    this.hzz = paramc;
    this.hGU = ((p)this.hzz.aBx().af(p.class));
    this.hGW = -2147483648;
    AppMethodBeat.o(130968);
  }

  public final void a(MMSightRecordView paramMMSightRecordView)
  {
    AppMethodBeat.i(130969);
    this.hGV = false;
    if (paramMMSightRecordView != null)
      paramMMSightRecordView.a(null, null);
    if (this.hGW != -2147483648)
    {
      this.hGU.oQ(this.hGW);
      this.hGW = -2147483648;
    }
    AppMethodBeat.o(130969);
  }

  public final void aDr()
  {
    AppMethodBeat.i(130970);
    if (!this.hGV)
    {
      ab.i("MicroMsg.FrameDataCallbackHelper", "onDateUpdate not need callback");
      AppMethodBeat.o(130970);
    }
    while (true)
    {
      return;
      this.hzz.a(new d.a(this));
      AppMethodBeat.o(130970);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.d
 * JD-Core Version:    0.6.2
 */