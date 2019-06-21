package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public class ah extends c<ag>
{
  public static final String[] fjY;

  static
  {
    AppMethodBeat.i(59453);
    fjY = new String[] { j.a(ag.fjX, "PushWxaPkgDecryptKeyTable") };
    AppMethodBeat.o(59453);
  }

  public ah(e parame)
  {
    super(parame, ag.fjX, "PushWxaPkgDecryptKeyTable", ag.diI);
  }

  public final ag ap(String paramString, int paramInt)
  {
    AppMethodBeat.i(59452);
    ag localag = new ag();
    localag.field_appId = paramString;
    localag.field_appVersion = paramInt;
    if (b(localag, new String[0]))
    {
      AppMethodBeat.o(59452);
      paramString = localag;
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(59452);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ah
 * JD-Core Version:    0.6.2
 */