package com.tencent.mm.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WeChatSplashStartup$3$1
  implements DialogInterface.OnClickListener
{
  WeChatSplashStartup$3$1(WeChatSplashStartup.3 param3, Runnable paramRunnable)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(137986);
    this.cfC.run();
    AppMethodBeat.o(137986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WeChatSplashStartup.3.1
 * JD-Core Version:    0.6.2
 */