package com.tencent.xweb;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.f;
import java.util.HashMap;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public final class k
{
  static a AMn;
  static a AMo;

  static
  {
    AppMethodBeat.i(3817);
    com.tencent.xweb.c.k.a locala = com.tencent.xweb.c.k.f(WebView.d.ANb);
    AMn = (a)locala.excute("STR_CMD_GET_UPDATER", null);
    AMo = (a)locala.excute("STR_CMD_GET_PLUGIN_UPDATER", null);
    AppMethodBeat.o(3817);
  }

  public static void a(Context paramContext, HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(3813);
    f.dVw();
    if (AMn != null)
    {
      Log.i("WCWebUpdater", "start check runtime update");
      AMn.a(paramContext, paramHashMap);
      if (AMo == null)
        break label68;
      f.dVl();
      AMo.a(paramContext, paramHashMap);
      AppMethodBeat.o(3813);
    }
    while (true)
    {
      return;
      Log.e("WCWebUpdater", "no sWebviewUpdater");
      break;
      label68: Log.e("WCWebUpdater", "no sPluginUpdater");
      AppMethodBeat.o(3813);
    }
  }

  public static void dTX()
  {
    AppMethodBeat.i(3814);
    if (AMn != null)
    {
      Log.i("WCWebUpdater", "start check runtime update");
      HashMap localHashMap = new HashMap();
      localHashMap.put("UpdaterCheckType", "2");
      AMn.a(XWalkEnvironment.getApplicationContext(), localHashMap);
      AppMethodBeat.o(3814);
    }
    while (true)
    {
      return;
      Log.e("WCWebUpdater", "no sWebviewUpdater");
      AppMethodBeat.o(3814);
    }
  }

  public static void dTY()
  {
    AppMethodBeat.i(3815);
    if (AMn != null)
    {
      Log.i("WCWebUpdater", "start check runtime update");
      new HashMap().put("UpdaterCheckType", "3");
      AMn.a(XWalkEnvironment.getApplicationContext(), null);
      AppMethodBeat.o(3815);
    }
    while (true)
    {
      return;
      Log.e("WCWebUpdater", "no sWebviewUpdater");
      AppMethodBeat.o(3815);
    }
  }

  public static boolean isBusy()
  {
    boolean bool1 = false;
    AppMethodBeat.i(3816);
    boolean bool2;
    boolean bool3;
    if (AMn != null)
    {
      bool2 = AMn.isBusy();
      if (AMo == null)
        break label68;
      bool3 = AMo.isBusy();
      label38: if ((!bool2) && (!bool3))
        break label80;
      bool2 = true;
      AppMethodBeat.o(3816);
    }
    while (true)
    {
      return bool2;
      Log.e("WCWebUpdater", "check is busy : no sWebviewUpdater");
      bool2 = false;
      break;
      label68: Log.e("WCWebUpdater", "check is busy : no sPluginUpdater");
      bool3 = false;
      break label38;
      label80: AppMethodBeat.o(3816);
      bool2 = bool1;
    }
  }

  public static abstract interface a
  {
    public abstract void a(Context paramContext, HashMap<String, String> paramHashMap);

    public abstract boolean isBusy();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.k
 * JD-Core Version:    0.6.2
 */