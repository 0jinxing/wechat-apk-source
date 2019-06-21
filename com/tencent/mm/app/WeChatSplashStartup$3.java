package com.tencent.mm.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.model.av;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.splash.e;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.n;

final class WeChatSplashStartup$3
  implements e
{
  n cfB;

  WeChatSplashStartup$3(WeChatSplashStartup paramWeChatSplashStartup)
  {
    AppMethodBeat.i(137948);
    this.cfB = new n();
    AppMethodBeat.o(137948);
  }

  public final boolean a(Activity paramActivity, int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(137952);
    boolean bool = this.cfB.a(paramActivity, paramInt, paramArrayOfString, paramArrayOfInt);
    AppMethodBeat.o(137952);
    return bool;
  }

  public final boolean a(Activity paramActivity, Runnable paramRunnable)
  {
    boolean bool1 = false;
    AppMethodBeat.i(137950);
    com.tencent.mm.kernel.g.RN();
    boolean bool2 = a.QX();
    String str = av.fly.T("login_user_name", "");
    int i;
    if ((!bool2) && (str.equals("")))
    {
      i = 1;
      if (i != 0)
        break label64;
      AppMethodBeat.o(137950);
    }
    while (true)
    {
      return bool1;
      i = 0;
      break;
      label64: if (com.tencent.mm.sdk.platformtools.g.xyf)
      {
        bool1 = MMAppMgr.a(paramActivity, new WeChatSplashStartup.3.1(this, paramRunnable));
        AppMethodBeat.o(137950);
      }
      else
      {
        AppMethodBeat.o(137950);
      }
    }
  }

  public final boolean b(Activity paramActivity, Runnable paramRunnable)
  {
    AppMethodBeat.i(137951);
    boolean bool = this.cfB.c(paramActivity, paramRunnable);
    AppMethodBeat.o(137951);
    return bool;
  }

  public final boolean n(Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(137949);
    if ((paramIntent != null) && (w.a(paramIntent, "absolutely_exit_pid", 0) == Process.myPid()))
    {
      ab.i("MicroMsg.WeChatSplashStartup", "handle exit intent.");
      MMAppMgr.pQ(w.a(paramIntent, "kill_service", true));
      AppMethodBeat.o(137949);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137949);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WeChatSplashStartup.3
 * JD-Core Version:    0.6.2
 */