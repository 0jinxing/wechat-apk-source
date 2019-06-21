package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.j;
import com.tencent.mm.g.a.j.a;
import com.tencent.mm.g.a.j.b;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper;
import com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper.NFCEventTransfer;
import com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper.a;
import com.tencent.mm.plugin.webview.modeltools.h;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class e$1 extends m
{
  e$1(e parame)
  {
  }

  public final void e(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(17027);
    ab.d("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "result: ".concat(String.valueOf(paramString2)));
    if ((this.icM.icE == null) || (paramString1 == null) || (!paramString1.equals(this.icM.icE.upr)))
      AppMethodBeat.o(17027);
    while (true)
    {
      return;
      if (paramInt1 != 22)
      {
        AppMethodBeat.o(17027);
      }
      else
      {
        if (this.icM.icE != null)
          this.icM.icE.cYK();
        this.icM.icC = paramInt1;
        this.icM.icD = paramInt2;
        if ((paramString2 == null) || (e.h(this.icM) == null))
        {
          AppMethodBeat.o(17027);
        }
        else
        {
          e.b(this.icM).runOnUiThread(new e.1.1(this, paramString2));
          AppMethodBeat.o(17027);
        }
      }
    }
  }

  public final Bundle g(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(17026);
    Bundle localBundle = new Bundle();
    localBundle.putString("key_webview_container_env", "miniProgram");
    switch (paramInt)
    {
    default:
    case 139:
    case 101:
    case 140:
    case 145:
    case 4001:
    case 4002:
    case 4003:
    case 4004:
    case 4005:
    case 4008:
    }
    while (true)
    {
      AppMethodBeat.o(17026);
      return localBundle;
      Object localObject = paramBundle.getString("info");
      try
      {
        paramBundle = new org/json/JSONObject;
        paramBundle.<init>((String)localObject);
        e.b(this.icM).D(paramBundle);
      }
      catch (Exception paramBundle)
      {
      }
      continue;
      paramBundle.setClassLoader(e.class.getClassLoader());
      d.b(e.g(this.icM), paramBundle.getString("open_ui_with_webview_ui_plugin_name"), paramBundle.getString("open_ui_with_webview_ui_plugin_entry"), new Intent().putExtras(paramBundle.getBundle("open_ui_with_webview_ui_extras")));
      continue;
      localBundle.putInt("key_webview_preverify_info_scene", 1);
      localBundle.putString("key_webview_preverify_info_source_appid", e.b(this.icM).getAppId());
      continue;
      localBundle.putStringArray("key_webview_apbrand_jsapi_report_args", e.b(this.icM).getJsApiReportArgs());
      continue;
      localObject = new j();
      ((j)localObject).csb.context = e.g(this.icM);
      ((j)localObject).csb.actionCode = paramInt;
      if (4003 == paramInt)
      {
        paramBundle = paramBundle.getString("apdu");
        ((j)localObject).csb.csd = paramBundle;
        label313: ab.i("MicroMsg.NFCIPCHelper", "alvinluo nfcInvokeAsResult actionCode: %d", new Object[] { Integer.valueOf(((j)localObject).csb.actionCode) });
      }
      try
      {
        paramBundle = new com/tencent/mm/plugin/webview/modeltools/NFCIPCHelper$NFCEventTransfer;
        paramBundle.<init>((j)localObject);
        paramBundle = (NFCIPCHelper.NFCEventTransfer)XIPCInvoker.a("com.tencent.mm:tools", paramBundle, NFCIPCHelper.a.class);
        if ((paramBundle != null) && (paramBundle.csg != null))
          ((j)localObject).csc.csg = paramBundle.csg;
        while (((j)localObject).csc.csg != null)
        {
          localBundle.putAll(((j)localObject).csc.csg);
          break;
          if (4004 != paramInt)
            break label313;
          String str = paramBundle.getString("apdus");
          boolean bool1 = paramBundle.getBoolean("breakIfFail", true);
          boolean bool2 = paramBundle.getBoolean("breakIfTrue", false);
          ((j)localObject).csb.csd = str;
          ((j)localObject).csb.cse = bool1;
          ((j)localObject).csb.csf = bool2;
          break label313;
          NFCIPCHelper.cYy();
        }
      }
      catch (Exception paramBundle)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.NFCIPCHelper", paramBundle, "alvinluo nfcInvokeAsResult exception", new Object[0]);
          NFCIPCHelper.cYy();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e.1
 * JD-Core Version:    0.6.2
 */