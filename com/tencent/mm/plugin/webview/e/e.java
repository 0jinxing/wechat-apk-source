package com.tencent.mm.plugin.webview.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e
{
  public static boolean agF(String paramString)
  {
    AppMethodBeat.i(10147);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(10147);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        paramString = Uri.parse(paramString).getPathSegments();
        if (paramString != null)
        {
          int i = paramString.size();
          if (i > 0);
        }
        else
        {
          AppMethodBeat.o(10147);
          bool = false;
          continue;
        }
        paramString = (String)paramString.get(paramString.size() - 1);
        if (paramString != null)
        {
          bool = paramString.toLowerCase().trim().endsWith(".apk");
          if (bool)
          {
            bool = true;
            AppMethodBeat.o(10147);
          }
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(10147);
        bool = false;
      }
    }
  }

  public static boolean agG(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(10148);
    if (Pattern.compile("^(http|https)://mp.weixin.qq.com/(s|mp/author|mp/appmsg/show)", 2).matcher(paramString).find())
      AppMethodBeat.o(10148);
    while (true)
    {
      return bool;
      if (Pattern.compile("^(http|https)://(sh.|hk.|sz.)?open.weixin.qq.com/connect/(confirm|oauth2/(authorize|explorer_authorize))", 2).matcher(paramString).find())
      {
        AppMethodBeat.o(10148);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(10148);
      }
    }
  }

  public static void h(String paramString, Context paramContext)
  {
    AppMethodBeat.i(10146);
    paramContext = paramContext.getSharedPreferences("webview_url_prefs", 4).edit();
    paramContext.putString("url", paramString);
    paramContext.apply();
    AppMethodBeat.o(10146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.e.e
 * JD-Core Version:    0.6.2
 */