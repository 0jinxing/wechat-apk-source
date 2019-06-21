package com.tencent.xweb;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.b.a;

public final class b
{
  private static b ALR;
  public b.a ALS;

  public static b dTR()
  {
    try
    {
      AppMethodBeat.i(3795);
      if (ALR == null)
      {
        localb = new com/tencent/xweb/b;
        localb.<init>();
        ALR = localb;
      }
      b localb = ALR;
      AppMethodBeat.o(3795);
      return localb;
    }
    finally
    {
    }
  }

  public final void dTS()
  {
    try
    {
      AppMethodBeat.i(3799);
      if (this.ALS != null)
        this.ALS.dTS();
      AppMethodBeat.o(3799);
      return;
    }
    finally
    {
    }
  }

  public final void f(WebView paramWebView)
  {
    try
    {
      AppMethodBeat.i(3800);
      if (this.ALS != null)
        this.ALS.f(paramWebView);
      AppMethodBeat.o(3800);
      return;
    }
    finally
    {
    }
    throw paramWebView;
  }

  public final String getCookie(String paramString)
  {
    AppMethodBeat.i(3797);
    paramString = this.ALS.getCookie(paramString);
    AppMethodBeat.o(3797);
    return paramString;
  }

  public final void removeAllCookie()
  {
    AppMethodBeat.i(3796);
    this.ALS.removeAllCookie();
    AppMethodBeat.o(3796);
  }

  public final void setCookie(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(3798);
      this.ALS.setCookie(paramString1, paramString2);
      AppMethodBeat.o(3798);
      return;
    }
    finally
    {
      paramString1 = finally;
    }
    throw paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.b
 * JD-Core Version:    0.6.2
 */