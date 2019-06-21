package com.tencent.mm.plugin.webview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import java.util.regex.Pattern;

public final class a
{
  public static final Pattern uet;
  public static final String ueu;

  static
  {
    AppMethodBeat.i(5610);
    uet = Pattern.compile("(http|https)://mp.weixin.qq.com.*");
    ueu = e.eSn + "vproxy";
    AppMethodBeat.o(5610);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.a
 * JD-Core Version:    0.6.2
 */