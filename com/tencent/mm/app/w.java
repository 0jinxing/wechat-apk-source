package com.tencent.mm.app;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.plugin.fcm.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.splash.b;
import com.tencent.mm.splash.c;
import com.tencent.mm.splash.f;
import com.tencent.mm.splash.m;
import com.tencent.mm.splash.n;
import com.tencent.mm.xlog.app.XLogSetup;
import com.tencent.tinker.entry.ApplicationLike;
import java.util.ArrayList;

public final class w
{
  public static com.tencent.mm.kernel.b.h cfw;

  private static void BN()
  {
    AppMethodBeat.i(137946);
    com.tencent.mm.splash.h.a(new c()
    {
      public final void a(Throwable paramAnonymousThrowable, String paramAnonymousString)
      {
        AppMethodBeat.i(137940);
        ab.printErrStackTrace("WxSplash.WeChatSplash", paramAnonymousThrowable, paramAnonymousString, new Object[0]);
        String str = paramAnonymousString;
        if (paramAnonymousString == null)
          str = "";
        paramAnonymousThrowable = str + "  " + Log.getStackTraceString(paramAnonymousThrowable);
        com.tencent.mm.splash.h.drh().xHG.add(paramAnonymousThrowable);
        AppMethodBeat.o(137940);
      }

      public final void g(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        AppMethodBeat.i(137941);
        ab.i(paramAnonymousString1, paramAnonymousString2, paramAnonymousArrayOfObject);
        AppMethodBeat.o(137941);
      }

      public final void n(Activity paramAnonymousActivity)
      {
        AppMethodBeat.i(137939);
        if ((w.cfw != null) && (w.cfw.SG()))
        {
          paramAnonymousActivity = paramAnonymousActivity.getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu());
          if (paramAnonymousActivity.getBoolean("first_launch_weixin", true))
          {
            paramAnonymousActivity.edit().putBoolean("first_launch_weixin", false).commit();
            XLogSetup.realSetupXlog();
          }
        }
        AppMethodBeat.o(137939);
      }
    });
    com.tencent.mm.splash.h.a(new b()
    {
      public final boolean aZ(Context paramAnonymousContext)
      {
        AppMethodBeat.i(137954);
        boolean bool = com.tencent.mm.f.a.bk(paramAnonymousContext);
        AppMethodBeat.o(137954);
        return bool;
      }

      public final boolean ba(Context paramAnonymousContext)
      {
        AppMethodBeat.i(137955);
        boolean bool = com.tencent.mm.f.a.ba(paramAnonymousContext);
        AppMethodBeat.o(137955);
        return bool;
      }

      public final void bb(Context paramAnonymousContext)
      {
        AppMethodBeat.i(137956);
        com.tencent.mm.f.a.bb(paramAnonymousContext);
        AppMethodBeat.o(137956);
      }
    });
    com.tencent.mm.splash.h.a(new f()
    {
      public final void BO()
      {
        AppMethodBeat.i(137968);
        com.tencent.mm.blink.a.BO();
        AppMethodBeat.o(137968);
      }

      public final void BP()
      {
        AppMethodBeat.i(137970);
        com.tencent.mm.blink.a.ig(1);
        AppMethodBeat.o(137970);
      }

      public final void cZ(String paramAnonymousString)
      {
        AppMethodBeat.i(137969);
        com.tencent.mm.blink.a.cZ(paramAnonymousString);
        AppMethodBeat.o(137969);
      }
    });
    AppMethodBeat.o(137946);
  }

  public static void a(com.tencent.mm.kernel.b.h paramh, String paramString)
  {
    AppMethodBeat.i(137947);
    cfw = paramh;
    BN();
    if (paramString == null)
    {
      ab.i("WxSplash.WeChatSplash", "splash callback class is null, return.");
      AppMethodBeat.o(137947);
    }
    while (true)
    {
      return;
      com.tencent.mm.blink.a.t(paramh.eMz.getApplicationStartMillisTime(), paramh.eMz.getApplicationStartElapsedTime());
      com.tencent.mm.splash.h.aob(ah.doy());
      com.tencent.mm.splash.h.ay(WeChatSplashActivity.class);
      com.tencent.mm.splash.h.az(WeChatSplashFallbackActivity.class);
      if (d.e(paramh))
        com.tencent.mm.splash.h.aoa("com.google.firebase.provider.FirebaseInitProvider");
      m.a(paramh.cc, paramh.eHT, paramString);
      AppMethodBeat.o(137947);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.w
 * JD-Core Version:    0.6.2
 */