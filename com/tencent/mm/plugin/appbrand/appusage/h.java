package com.tencent.mm.plugin.appbrand.appusage;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"TAG", "", "component1", "Lcom/tencent/mm/plugin/appbrand/appusage/AppIdentity;", "component2", "", "plugin-appbrand-integration_release"})
public final class h
{
  public static final String a(AppIdentity paramAppIdentity)
  {
    AppMethodBeat.i(134537);
    j.p(paramAppIdentity, "receiver$0");
    paramAppIdentity = paramAppIdentity.username;
    AppMethodBeat.o(134537);
    return paramAppIdentity;
  }

  public static final int b(AppIdentity paramAppIdentity)
  {
    AppMethodBeat.i(134538);
    j.p(paramAppIdentity, "receiver$0");
    int i = paramAppIdentity.har;
    AppMethodBeat.o(134538);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.h
 * JD-Core Version:    0.6.2
 */