package com.tencent.mm.cj;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.mm.ui.e.l;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.c;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.x;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;

public final class c
{
  private static void a(Context paramContext, WebView.d paramd, WebView.c paramc)
  {
    AppMethodBeat.i(80417);
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    iw(localContext);
    WebView.initWebviewCore(localContext, paramd, a.dOY(), paramc);
    if (dPa())
      XWalkEnvironment.setUsingCustomContext(true);
    AppMethodBeat.o(80417);
  }

  public static void a(WebView.d paramd)
  {
    AppMethodBeat.i(80415);
    a(paramd, new WebView.c()
    {
      public final void BH()
      {
        AppMethodBeat.i(80408);
        ab.i("XWebUtil", "onCoreInitFailed");
        AppMethodBeat.o(80408);
      }

      public final void onCoreInitFinished()
      {
        AppMethodBeat.i(80407);
        ab.i("XWebUtil", "onCoreInitFinished");
        AppMethodBeat.o(80407);
      }
    });
    AppMethodBeat.o(80415);
  }

  public static void a(WebView.d paramd, WebView.c paramc)
  {
    AppMethodBeat.i(80416);
    a(ah.getContext(), paramd, paramc);
    AppMethodBeat.o(80416);
  }

  public static void aNX()
  {
    AppMethodBeat.i(80409);
    atE("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    atF("com.tencent.mm.intent.ACTION_START_MPTOOLS_PROCESS");
    AppMethodBeat.o(80409);
  }

  public static void aZ(Intent paramIntent)
  {
    AppMethodBeat.i(80411);
    paramIntent.setComponent(new ComponentName(e.l.iRj, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    ah.getContext().sendBroadcast(paramIntent);
    if (com.tencent.mm.bp.d.Qb())
      AppMethodBeat.o(80411);
    while (true)
    {
      return;
      paramIntent.setComponent(new ComponentName(e.l.iRj, "com.tencent.mm.booter.MMReceivers$ToolsMpProcessReceiver"));
      ah.getContext().sendBroadcast(paramIntent);
      AppMethodBeat.o(80411);
    }
  }

  public static void atD(String paramString)
  {
    AppMethodBeat.i(80410);
    atE(paramString);
    atF(paramString);
    AppMethodBeat.o(80410);
  }

  private static void atE(String paramString)
  {
    AppMethodBeat.i(80412);
    if (("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS".equals(paramString)) && (!ah.amz(ah.getPackageName() + ":tools")))
      AppMethodBeat.o(80412);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setComponent(new ComponentName(e.l.iRj, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
      localIntent.putExtra("tools_process_action_code_key", paramString);
      ah.getContext().sendBroadcast(localIntent);
      AppMethodBeat.o(80412);
    }
  }

  public static void atF(String paramString)
  {
    AppMethodBeat.i(80413);
    if (com.tencent.mm.bp.d.Qb())
      AppMethodBeat.o(80413);
    while (true)
    {
      return;
      if (("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS".equals(paramString)) && (!ah.amz(ah.getPackageName() + ":toolsmp")))
      {
        AppMethodBeat.o(80413);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.setComponent(new ComponentName(e.l.iRj, "com.tencent.mm.booter.MMReceivers$ToolsMpProcessReceiver"));
        localIntent.putExtra("tools_process_action_code_key", paramString);
        ah.getContext().sendBroadcast(localIntent);
        AppMethodBeat.o(80413);
      }
    }
  }

  private static void dOZ()
  {
    AppMethodBeat.i(80419);
    HashMap localHashMap = new HashMap();
    localHashMap.put("isgpversion", Boolean.valueOf(g.dnY()));
    localHashMap.put("processname", ah.getProcessName());
    XWalkEnvironment.setXWebInitArgs(localHashMap);
    AppMethodBeat.o(80419);
  }

  public static boolean dPa()
  {
    AppMethodBeat.i(80420);
    boolean bool;
    if (WebView.getCurWebType() == WebView.d.ANb)
    {
      bool = XWalkEnvironment.isCurrentVersionSupportCustomContext();
      AppMethodBeat.o(80420);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80420);
    }
  }

  public static boolean iv(Context paramContext)
  {
    AppMethodBeat.i(80414);
    boolean bool;
    if ((WebView.isX5()) && (WebView.getUsingTbsCoreVersion(paramContext) <= 36541))
    {
      ab.i("XWebUtil", "lower version of x5 not support source type ");
      bool = false;
      AppMethodBeat.o(80414);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(80414);
    }
  }

  public static void iw(Context paramContext)
  {
    AppMethodBeat.i(80418);
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    x.a(localContext, a.AiA, a.AiD, a.AiB, a.AiC);
    if ((com.tencent.mm.protocal.d.vxo <= 654312495) && (com.tencent.mm.protocal.d.vxo >= 654312448))
      MMWebView.zNr = "https://dldir1.qq.com/weixin/android/wxweb/updateConfig_mar_test.xml";
    XWalkEnvironment.setTempUpdateConfigUrl(MMWebView.zNr);
    XWalkEnvironment.setIsForbidDownloadCode(g.dnY());
    dOZ();
    if (g.dnY())
      com.tencent.xweb.x5.sdk.d.forceSysWebView();
    AppMethodBeat.o(80418);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cj.c
 * JD-Core Version:    0.6.2
 */