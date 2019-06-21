package com.tencent.mm.cj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.xweb.e;
import com.tencent.xweb.u;
import com.tencent.xweb.util.c;
import org.xwalk.core.WebViewExtensionListener;

public final class a
{
  public static c AiA;
  public static u AiB;
  public static WebViewExtensionListener AiC;
  public static e AiD;

  static
  {
    AppMethodBeat.i(80385);
    AiA = new a.1();
    AiB = new a.2();
    AiC = new a.3();
    AiD = new a.4();
    AppMethodBeat.o(80385);
  }

  public static String dOY()
  {
    AppMethodBeat.i(80384);
    String str = ah.getProcessName();
    if (str == null)
    {
      str = "";
      AppMethodBeat.o(80384);
    }
    while (true)
    {
      return str;
      if (str.contains(":"))
      {
        str = str.substring(str.lastIndexOf(":") + 1).toLowerCase();
        if (str.startsWith("appbrand"))
        {
          str = "appbrand";
          AppMethodBeat.o(80384);
        }
        else
        {
          AppMethodBeat.o(80384);
        }
      }
      else if (str.contains("."))
      {
        str = str.substring(str.lastIndexOf(".") + 1).toLowerCase();
        AppMethodBeat.o(80384);
      }
      else
      {
        AppMethodBeat.o(80384);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cj.a
 * JD-Core Version:    0.6.2
 */