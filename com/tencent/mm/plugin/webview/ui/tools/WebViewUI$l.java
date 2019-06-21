package com.tencent.mm.plugin.webview.ui.tools;

import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class WebViewUI$l
{
  private static final Pattern hnu;
  public String jVi;
  private LinkedList<String> uxM;
  String[] uxa;

  static
  {
    AppMethodBeat.i(7954);
    hnu = Pattern.compile(".*#.*wechat_redirect");
    AppMethodBeat.o(7954);
  }

  public WebViewUI$l(String paramString)
  {
    AppMethodBeat.i(7951);
    this.jVi = null;
    this.uxM = new LinkedList();
    this.uxa = null;
    this.jVi = paramString;
    AppMethodBeat.o(7951);
  }

  private boolean afW(String paramString)
  {
    AppMethodBeat.i(7953);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(7953);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((this.uxa == null) || (this.uxa.length == 0))
      {
        AppMethodBeat.o(7953);
        bool = false;
      }
      else
      {
        if (!this.uxM.contains(paramString))
          break;
        AppMethodBeat.o(7953);
        bool = false;
      }
    }
    if (URLUtil.isHttpUrl(paramString));
    for (String str1 = paramString.substring(7); ; str1 = paramString)
    {
      String str2 = str1;
      if (URLUtil.isHttpsUrl(str1))
        str2 = paramString.substring(8);
      ab.i("MicroMsg.WebViewUI", "rawUrl = %s, subUrl = %s", new Object[] { paramString, str2 });
      String[] arrayOfString = this.uxa;
      int i = arrayOfString.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label200;
        str1 = arrayOfString[j];
        ab.i("MicroMsg.WebViewUI", "force geta8key path = %s", new Object[] { str1 });
        if (str2.startsWith(str1))
        {
          this.uxM.add(paramString);
          AppMethodBeat.o(7953);
          bool = true;
          break;
        }
      }
      label200: AppMethodBeat.o(7953);
      bool = false;
      break;
    }
  }

  public final int ael(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(7952);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WebViewUI", "getReason fail, url is null");
      AppMethodBeat.o(7952);
    }
    while (true)
    {
      return i;
      if (paramString.equals(this.jVi))
      {
        AppMethodBeat.o(7952);
      }
      else if (hnu.matcher(paramString).find())
      {
        i = 2;
        AppMethodBeat.o(7952);
      }
      else if (afW(paramString))
      {
        i = 8;
        AppMethodBeat.o(7952);
      }
      else
      {
        i = 1;
        AppMethodBeat.o(7952);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.l
 * JD-Core Version:    0.6.2
 */