package com.tencent.mm.plugin.websearch.widget.c.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
  implements a
{
  private boolean b(Context paramContext, String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(91469);
    boolean bool;
    if ((paramContext == null) || (TextUtils.isEmpty(paramString)))
    {
      AppMethodBeat.o(91469);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        paramString = paramContext.getPackageManager().getLaunchIntentForPackage(paramString);
        if (paramString != null)
        {
          Iterator localIterator = paramMap.entrySet().iterator();
          while (localIterator.hasNext())
          {
            paramMap = (Map.Entry)localIterator.next();
            paramString.putExtra((String)paramMap.getKey(), (String)paramMap.getValue());
          }
        }
      }
      catch (Exception paramContext)
      {
        ab.e("OpenAppNativeApp", bo.l(paramContext));
        AppMethodBeat.o(91469);
        bool = false;
      }
      continue;
      paramMap = new com/tencent/mm/plugin/websearch/widget/c/a/c$1;
      paramMap.<init>(this, paramContext, paramString);
      com.tencent.mm.ce.a.post(paramMap);
      bool = true;
      AppMethodBeat.o(91469);
    }
  }

  public final boolean adV(String paramString)
  {
    AppMethodBeat.i(91467);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      bool = false;
      AppMethodBeat.o(91467);
    }
    while (true)
    {
      return bool;
      bool = paramString.startsWith("app://");
      AppMethodBeat.o(91467);
    }
  }

  public final boolean adW(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(91468);
    if (!adV(paramString))
    {
      bool = false;
      AppMethodBeat.o(91468);
    }
    while (true)
    {
      return bool;
      Object localObject = Uri.parse(paramString);
      String str1 = ((Uri)localObject).getQueryParameter("pkgName");
      String str2 = ((Uri)localObject).getQueryParameter("extra");
      paramString = ((Uri)localObject).getQueryParameter("extraIntentKey");
      localObject = ((Uri)localObject).getQueryParameter("fallbackUrl");
      HashMap localHashMap = new HashMap();
      if ((!TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty(paramString)))
        localHashMap.put(paramString, str2);
      if (!b(ah.getContext(), str1, localHashMap))
      {
        paramString = new Intent();
        paramString.putExtra("rawUrl", (String)localObject);
        paramString.putExtra("useJs", true);
        d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", paramString);
      }
      AppMethodBeat.o(91468);
    }
  }

  public final boolean lO(long paramLong)
  {
    AppMethodBeat.i(91466);
    boolean bool = com.tencent.mm.plugin.websearch.widget.c.c.H(paramLong, 1);
    AppMethodBeat.o(91466);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.c.a.c
 * JD-Core Version:    0.6.2
 */