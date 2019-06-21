package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.splash.o.a;

final class WeChatSplashStartup$2$1
  implements Runnable
{
  WeChatSplashStartup$2$1(WeChatSplashStartup.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138009);
    ab.i("MicroMsg.WeChatSplashStartup", "Replay pending messages.");
    this.cfA.cfz.drj();
    AppMethodBeat.o(138009);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WeChatSplashStartup.2.1
 * JD-Core Version:    0.6.2
 */