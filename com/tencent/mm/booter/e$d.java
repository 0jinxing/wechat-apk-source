package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.ToolsProfile.a;
import com.tencent.mm.ca.b;
import com.tencent.mm.plugin.websearch.api.aj;
import com.tencent.mm.pluginsdk.model.u;
import com.tencent.mm.pluginsdk.model.u.1;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.w;
import com.tencent.xweb.x5.sdk.d;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class e$d
  implements MMReceivers.a
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15844);
    if ((paramContext == null) || (paramIntent == null))
      AppMethodBeat.o(15844);
    while (true)
    {
      return;
      String str1 = paramIntent.getStringExtra("tools_process_action_code_key");
      ab.i("MicroMsg.ToolsProcessReceiver", "onReceive, action = ".concat(String.valueOf(str1)));
      boolean bool;
      if (str1.equals("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS"))
      {
        ab.dou();
        bool = ToolsProfile.a.isLocked();
        ab.i("MicroMsg.ToolsProcessReceiver", "onReceive, ACTION_KILL_TOOLS_PROCESS, x5 kernel video isLocked = %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
          Process.killProcess(Process.myPid());
        AppMethodBeat.o(15844);
      }
      else
      {
        if (str1.equals("com.tencent.mm.intent.ACTION_RELOAD_RESOURCES"))
        {
          str1 = paramIntent.getStringExtra("tools_language");
          ab.i("MicroMsg.ToolsProcessReceiver", "onReceive, language %s", new Object[] { str1 });
          paramIntent = aa.amw(str1);
          if ("language_default".equalsIgnoreCase(str1))
          {
            if (Build.VERSION.SDK_INT < 24)
              break label194;
            paramIntent = aa.xyO;
            Locale.setDefault(paramIntent);
          }
          while (true)
          {
            aa.a(paramContext.getApplicationContext(), paramIntent);
            ah.f(b.a(paramContext.getApplicationContext().getResources(), paramContext.getApplicationContext(), str1));
            AppMethodBeat.o(15844);
            break;
            label194: paramIntent = Locale.getDefault();
          }
        }
        if (str1.equals("com.tencent.mm.intent.ACTION_TOOLS_REMOVE_COOKIE"))
          try
          {
            w.clearAllWebViewCache(paramContext.getApplicationContext(), true);
            AppMethodBeat.o(15844);
          }
          catch (Exception paramContext)
          {
            ab.i("MicroMsg.ToolsProcessReceiver", "clear cookie faild : " + paramContext.getMessage());
            AppMethodBeat.o(15844);
          }
        else if (!str1.equals("com.tencent.mm.intent.ACIONT_TOOLS_LOAD_DEX"))
        {
          if (str1.equals("com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE"))
          {
            bool = paramIntent.getBooleanExtra("tools_clean_webview_cache_ignore_cookie", true);
            ab.i("MicroMsg.ToolsProcessReceiver", "WebViewCacheClearTask, clearAllWebViewCache, includeCookie = %b", new Object[] { Boolean.valueOf(bool) });
            w.clearAllWebViewCache(paramContext.getApplicationContext(), bool);
            AppMethodBeat.o(15844);
          }
          else if (str1.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS"))
          {
            ab.i("MicroMsg.ToolsProcessReceiver", "start tools process task, try to pre load tbs");
            AppMethodBeat.o(15844);
          }
          else if (str1.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS_DO_NOTHING"))
          {
            ab.i("MicroMsg.ToolsProcessReceiver", "start tools process and do nothing");
            AppMethodBeat.o(15844);
          }
          else if (str1.equals("com.tencent.mm.intent.ACTION_CHECK_MINIQB_CAN_OPEN_FILE"))
          {
            str1 = paramIntent.getStringExtra("file_path");
            String str2 = paramIntent.getStringExtra("file_ext");
            Context localContext;
            if ((System.currentTimeMillis() - u.vbI >= 1000L) && (!bo.isNullOrNil(str1)))
            {
              u.vbI = System.currentTimeMillis();
              localContext = ah.getContext();
              paramContext = "";
            }
            try
            {
              paramIntent = new org/json/JSONObject;
              paramIntent.<init>();
              paramIntent.putOpt("path", str1);
              paramIntent.putOpt("ext", str2);
              paramIntent = paramIntent.toString();
              paramContext = paramIntent;
              ab.i("MicroMsg.TBSFileBrowseHelper", "openFileByMiniQB, file pathinfo:%s", new Object[] { paramContext });
              d.a(localContext, paramContext, new u.1(str1, str2, localContext));
              AppMethodBeat.o(15844);
            }
            catch (JSONException paramIntent)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.TBSFileBrowseHelper", paramIntent, "", new Object[0]);
            }
          }
          else if (str1.equals("com.tencent.mm.intent.ACTION_PRELOAD_SET_SWITCH"))
          {
            bool = paramIntent.getBooleanExtra("tools_param_preload_switch", false);
            aj.cVp().nE(bool);
            AppMethodBeat.o(15844);
          }
          else if (str1.equals("com.tencent.mm.intent.ACTION_PRELOAD_SEARCH"))
          {
            aj.cVp().dy(paramIntent.getStringExtra("tools_param_preload_url"), paramIntent.getIntExtra("tools_param_preload_search_biz", -1));
          }
        }
        else
          AppMethodBeat.o(15844);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.e.d
 * JD-Core Version:    0.6.2
 */