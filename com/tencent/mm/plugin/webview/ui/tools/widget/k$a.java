package com.tencent.mm.plugin.webview.ui.tools.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k$a
{
  private static final Pattern hnu;
  private String jVi = null;

  static
  {
    AppMethodBeat.i(9965);
    hnu = Pattern.compile(".*#.*wechat_redirect");
    AppMethodBeat.o(9965);
  }

  public k$a(String paramString)
  {
    this.jVi = paramString;
  }

  public final int ael(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(9964);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.MMWebViewClient", "getReason fail, url is null");
      AppMethodBeat.o(9964);
    }
    while (true)
    {
      return i;
      if (paramString.equals(this.jVi))
      {
        AppMethodBeat.o(9964);
      }
      else if (hnu.matcher(paramString).find())
      {
        i = 2;
        AppMethodBeat.o(9964);
      }
      else
      {
        i = 1;
        AppMethodBeat.o(9964);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k.a
 * JD-Core Version:    0.6.2
 */