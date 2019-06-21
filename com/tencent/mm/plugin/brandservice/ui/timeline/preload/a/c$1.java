package com.tencent.mm.plugin.brandservice.ui.timeline.preload.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.brandservice.d;
import com.tencent.mm.protocal.protobuf.er;
import com.tencent.mm.protocal.protobuf.et;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements w.a
{
  c$1(int paramInt, er paramer)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(14399);
    ab.i("MicroMsg.Preload.BizAppMsgReportMgr", "callback, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramString = (et)paramb.fsH.fsP;
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramString != null))
    {
      if (this.jAZ > 0)
        com.tencent.mm.plugin.webview.preload.a.kT(57);
      ab.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]url:%s", new Object[] { this.jTA.Url });
      com.tencent.mm.plugin.webview.preload.a.kT(51);
    }
    while (true)
    {
      AppMethodBeat.o(14399);
      return 0;
      if (paramInt2 == 50001)
      {
        if (this.jAZ < 3)
        {
          c.a(this.jTA, this.jAZ + 1);
        }
        else
        {
          com.tencent.mm.plugin.webview.preload.a.kT(52);
          com.tencent.mm.plugin.webview.preload.a.kT(59);
          if (d.aVT().a(new a(this.jTA)))
            ab.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]");
          else
            ab.w("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync], insert fail");
        }
      }
      else
      {
        if (this.jAZ > 0)
          com.tencent.mm.plugin.webview.preload.a.kT(58);
        com.tencent.mm.plugin.webview.preload.a.kT(52);
        if (d.aVT().a(new a(this.jTA)))
          ab.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]");
        else
          ab.w("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync], insert fail");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.a.c.1
 * JD-Core Version:    0.6.2
 */