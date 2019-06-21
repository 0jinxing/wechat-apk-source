package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class ad$b
  implements com.tencent.smtt.export.external.interfaces.HttpAuthHandler
{
  private android.webkit.HttpAuthHandler a;

  ad$b(android.webkit.HttpAuthHandler paramHttpAuthHandler)
  {
    this.a = paramHttpAuthHandler;
  }

  public void cancel()
  {
    AppMethodBeat.i(64210);
    this.a.cancel();
    AppMethodBeat.o(64210);
  }

  public void proceed(String paramString1, String paramString2)
  {
    AppMethodBeat.i(64209);
    this.a.proceed(paramString1, paramString2);
    AppMethodBeat.o(64209);
  }

  public boolean useHttpAuthUsernamePassword()
  {
    AppMethodBeat.i(64211);
    boolean bool = this.a.useHttpAuthUsernamePassword();
    AppMethodBeat.o(64211);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ad.b
 * JD-Core Version:    0.6.2
 */