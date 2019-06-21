package com.tencent.mm.plugin.appbrand.jsapi.auth;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/AuthorizeHelper;", "", "()V", "Companion", "GetHeadIconPathCallback", "plugin-appbrand-integration_release"})
public final class e
{
  private static final String TAG = "AuthorizeHelper";
  public static final e.a hBN;

  static
  {
    AppMethodBeat.i(134660);
    hBN = new e.a((byte)0);
    TAG = "AuthorizeHelper";
    AppMethodBeat.o(134660);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/AuthorizeHelper$GetHeadIconPathCallback;", "", "onCallback", "", "path", "", "plugin-appbrand-integration_release"})
  public static abstract interface b
  {
    public abstract void AQ(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.e
 * JD-Core Version:    0.6.2
 */