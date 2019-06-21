package com.tencent.mm.plugin.appbrand.jsapi.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class a$a
{
  private String country;
  private String dud;
  private String hIa;
  String hIb;
  private String state;

  public a$a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(126257);
    this.country = bo.nullAsNil(paramString1);
    this.state = bo.nullAsNil(paramString2);
    this.dud = bo.nullAsNil(paramString3);
    this.hIa = bo.nullAsNil(paramString4);
    this.hIb = bo.nullAsNil(paramString5);
    AppMethodBeat.o(126257);
  }

  public final String aDu()
  {
    AppMethodBeat.i(126258);
    Object localObject;
    if ((bo.amT(this.country)) || (bo.amT(this.state)) || (bo.amT(this.dud)) || (bo.amT(this.hIa)) || (bo.amT(this.hIb)))
    {
      localObject = new StringBuilder();
      if (this.country.length() > 0)
        ((StringBuilder)localObject).append(this.country);
      if (this.state.length() > 0)
        ((StringBuilder)localObject).append(this.state);
      if (this.dud.length() > 0)
        ((StringBuilder)localObject).append(this.dud);
      if (this.hIa.length() > 0)
        ((StringBuilder)localObject).append(this.hIa);
      if (this.hIb.length() > 0)
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.hIb);
      }
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(126258);
    }
    while (true)
    {
      return localObject;
      localObject = new StringBuilder();
      if (this.hIa.length() > 0)
      {
        ((StringBuilder)localObject).append(this.hIa);
        ((StringBuilder)localObject).append(" ");
      }
      if (this.dud.length() > 0)
        ((StringBuilder)localObject).append(this.dud + " ");
      if (this.state.length() > 0)
        ((StringBuilder)localObject).append(this.state + " ");
      if (this.country.length() > 0)
        ((StringBuilder)localObject).append(this.country);
      if (this.hIb.length() > 0)
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.hIb);
      }
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(126258);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.a.a
 * JD-Core Version:    0.6.2
 */