package com.tencent.mm.plugin.appbrand.appcache;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class av$b
  implements av.c
{
  private boolean i(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(129434);
    ab.d("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "optDebugInfo, prefix = %s", new Object[] { paramString });
    if (paramMap.get(paramString) == null)
    {
      bool = false;
      AppMethodBeat.o(129434);
      return bool;
    }
    final String str1 = (String)paramMap.get(paramString + ".AppID");
    String str2 = (String)paramMap.get(paramString + ".UserName");
    final int i = bo.getInt((String)paramMap.get(paramString + ".Type"), 1);
    String str3 = (String)paramMap.get(paramString + ".URL");
    long l1 = bo.getLong((String)paramMap.get(paramString + ".StartTime"), bo.anT());
    long l2 = bo.getLong((String)paramMap.get(paramString + ".EndTime"), 7200L + l1);
    paramString = (String)paramMap.get(paramString + ".MD5");
    boolean bool = f.auV().a(str1, i, str3, paramString, l1, l2);
    ab.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle debug notify, appId = %s, username = %s, debugType = %d, url = %s, start = %d, end = %d, md5 = %s, updated = %b", new Object[] { str1, str2, Integer.valueOf(i), str3, Long.valueOf(l1), Long.valueOf(l2), paramString, Boolean.valueOf(bool) });
    if (bool)
    {
      if (999 == i)
        break label406;
      r.zt(str2);
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(129432);
          h.bt(str1, i);
          Toast.makeText(ah.getContext(), ah.getContext().getString(2131296768, new Object[] { bo.bc(this.gUZ, str1) }), 1).show();
          AppMethodBeat.o(129432);
        }
      });
    }
    while (true)
    {
      f.auT().aK(str2, i);
      bool = true;
      AppMethodBeat.o(129434);
      break;
      label406: t.gTk.dy(false);
    }
  }

  public final void u(Map<String, String> paramMap)
  {
    AppMethodBeat.i(129433);
    i(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo", paramMap);
    int i = 0;
    int j;
    do
    {
      j = i + 1;
      i = j;
    }
    while (i(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo".concat(String.valueOf(j)), paramMap));
    AppMethodBeat.o(129433);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.av.b
 * JD-Core Version:    0.6.2
 */