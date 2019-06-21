package com.tencent.mm.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class WeChatSplashStartup$5
  implements com.tencent.mm.kernel.api.g
{
  WeChatSplashStartup$5(WeChatSplashStartup paramWeChatSplashStartup)
  {
  }

  public final void BR()
  {
    AppMethodBeat.i(137957);
    com.tencent.mm.kernel.g.RQ().b(this);
    com.tencent.mm.blink.a.BO();
    WeChatSplashStartup.a(this.cfx);
    if (this.cfx.profile.SG());
    try
    {
      ah.getContext().getSharedPreferences("system_config_prefs", 0).edit().putInt("launch_last_status", 2).commit();
      if (this.cfx.profile.SG())
      {
        com.tencent.mm.kernel.a locala = com.tencent.mm.kernel.g.RN();
        ab.i("MMKernel.CoreAccount", "summerhardcoder hasInitialized[%b] mHardCoderStartPerformance[%d] stack[%s]", new Object[] { Boolean.valueOf(locala.QY()), Integer.valueOf(locala.eIS), bo.dpG() });
        if ((locala.QY()) && (locala.eIS != 0))
        {
          WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcBootEnable, locala.eIS);
          ab.i("MMKernel.CoreAccount", "summerhardcoder stopPerformance[%s] stack[%s]", new Object[] { Integer.valueOf(locala.eIS), bo.dpG() });
          locala.eIS = 0;
        }
      }
      AppMethodBeat.o(137957);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WeChatSplashStartup", localException, "%s", new Object[] { localException.getMessage() });
    }
  }

  public final void bi(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WeChatSplashStartup.5
 * JD-Core Version:    0.6.2
 */