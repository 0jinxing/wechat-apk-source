package com.tencent.mm.plugin.appbrand.jsapi.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class a$b
{
  String firstName;
  String lastName;
  String middleName;

  public a$b(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(126259);
    this.firstName = bo.nullAsNil(paramString1);
    this.middleName = bo.nullAsNil(paramString2);
    this.lastName = bo.nullAsNil(paramString3);
    AppMethodBeat.o(126259);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.a.b
 * JD-Core Version:    0.6.2
 */