package com.tencent.mm.plugin.webview.modeltools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.m.e;
import com.tencent.mm.pluginsdk.ui.tools.m;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import org.xwalk.core.XWalkEnvironment;

final class g$8 extends c<cq>
{
  g$8(g paramg)
  {
    AppMethodBeat.i(6973);
    this.xxI = cq.class.getName().hashCode();
    AppMethodBeat.o(6973);
  }

  private static boolean a(cq paramcq)
  {
    AppMethodBeat.i(6974);
    Object localObject;
    String str;
    if ((paramcq instanceof cq))
    {
      localObject = ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
      XWalkEnvironment.setIpType(com.tencent.mm.m.g.Nu().getInt("WebKernelMode", -1));
      str = com.tencent.mm.m.g.Nu().getValue("WebviewDownloadTbs");
      paramcq = com.tencent.mm.m.g.Nu().getValue("WebviewEnableTbs");
      ab.i("MicroMsg.SubCoreTools", "updateWebViewDynamicConfig, tbsDownload = %s, tbsEnable = %s, tbsSupportedVerSec = %s", new Object[] { str, paramcq, com.tencent.mm.m.g.Nu().getValue("WebviewSupportedTbsVersionSection") });
      if (str != null)
        ((SharedPreferences.Editor)localObject).putString("tbs_download", str);
      ((SharedPreferences.Editor)localObject).apply();
      if (("1".equals(str)) && ("1".equals(paramcq)))
        m.kT(1);
      if (str == null);
    }
    try
    {
      if ("0".equals(str))
      {
        ab.i("MicroMsg.SubCoreTools", "tbs download disable, reset tbssdk in sandbox");
        paramcq = new android/content/Intent;
        paramcq.<init>();
        localObject = new android/content/ComponentName;
        ((ComponentName)localObject).<init>(ah.getPackageName(), "com.tencent.mm.booter.MMReceivers$SandBoxProcessReceiver");
        paramcq.setComponent((ComponentName)localObject);
        ah.getContext().sendBroadcast(paramcq);
      }
      AppMethodBeat.o(6974);
      return false;
    }
    catch (Exception paramcq)
    {
      while (true)
        ab.w("MicroMsg.SubCoreTools", "sendbroadcast ,ex = %s", new Object[] { paramcq.getMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.g.8
 * JD-Core Version:    0.6.2
 */