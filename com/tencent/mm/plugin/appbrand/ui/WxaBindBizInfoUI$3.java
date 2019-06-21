package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.a;
import com.tencent.mm.protocal.protobuf.arf;
import com.tencent.mm.protocal.protobuf.arg;

final class WxaBindBizInfoUI$3
  implements LoadMoreRecyclerView.a
{
  WxaBindBizInfoUI$3(WxaBindBizInfoUI paramWxaBindBizInfoUI)
  {
  }

  public final void aMC()
  {
    AppMethodBeat.i(133192);
    arf localarf = new arf();
    localarf.csB = WxaBindBizInfoUI.a(this.iJJ);
    localarf.wvh = WxaBindBizInfoUI.b(this.iJJ);
    b.a locala = new b.a();
    locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/getwxabindbizinfo";
    locala.fsI = 1823;
    locala.fsJ = localarf;
    locala.fsK = new arg();
    w.a(locala.acD(), new WxaBindBizInfoUI.3.1(this), false);
    AppMethodBeat.o(133192);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.WxaBindBizInfoUI.3
 * JD-Core Version:    0.6.2
 */