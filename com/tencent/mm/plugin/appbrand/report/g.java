package com.tencent.mm.plugin.appbrand.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.xweb.WebView;

public enum g
{
  static
  {
    AppMethodBeat.i(132568);
    iAq = new g("X5", 0);
    iAr = new g("Sys", 1);
    iAs = new g("XWalk", 2);
    iAt = new g("Invalid", 3);
    iAu = new g[] { iAq, iAr, iAs, iAt };
    AppMethodBeat.o(132568);
  }

  public static g aLe()
  {
    AppMethodBeat.i(132567);
    boolean bool1 = WebView.isSys();
    boolean bool2 = WebView.isXWalk();
    boolean bool3 = WebView.isX5();
    Object localObject;
    if (((!bool1) || (bool2) || (bool3)) && ((bool1) || (!bool2) || (bool3)) && ((bool1) || (bool2) || (!bool3)))
    {
      if (f.DEBUG)
      {
        localObject = new IllegalStateException("WebViewType invalid");
        AppMethodBeat.o(132567);
        throw ((Throwable)localObject);
      }
      localObject = iAt;
      AppMethodBeat.o(132567);
    }
    while (true)
    {
      return localObject;
      if (bool3)
      {
        localObject = iAq;
        AppMethodBeat.o(132567);
      }
      else if (bool2)
      {
        localObject = iAs;
        AppMethodBeat.o(132567);
      }
      else
      {
        localObject = iAr;
        AppMethodBeat.o(132567);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.g
 * JD-Core Version:    0.6.2
 */