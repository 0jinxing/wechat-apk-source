package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.g;

final class as$2
  implements Runnable
{
  as$2(as paramas, WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, aj paramaj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31088);
    ShowMessageFromWX.Req localReq = g.c(as.a(this.yMU), this.kNQ, this.myu);
    g.a(as.a(this.yMU), this.II, this.val$appId, localReq, 0, new as.2.1(this, localReq), null);
    AppMethodBeat.o(31088);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.as.2
 * JD-Core Version:    0.6.2
 */