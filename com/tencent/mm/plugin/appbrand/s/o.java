package com.tencent.mm.plugin.appbrand.s;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.l;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.MalformedURLException;
import java.net.URL;

public final class o
{
  private static String a(q paramq, o.a parama)
  {
    AppMethodBeat.i(133589);
    String str = "";
    if (parama == o.a.iRz)
      str = paramq.auf();
    while (true)
    {
      AppMethodBeat.o(133589);
      return str;
      if (parama == o.a.iRA)
        str = paramq.aug();
    }
  }

  public static void a(com.tencent.mm.plugin.appbrand.i parami, com.tencent.mm.plugin.appbrand.h.i parami1, String paramString1, String paramString2, String paramString3, String paramString4, o.a parama, n.a parama1)
  {
    AppMethodBeat.i(133588);
    if ((parami == null) || (parami.xT() == null))
    {
      ab.i("MicroMsg.JsValidationInjectorWC", "hy: runtime or service is null!");
      AppMethodBeat.o(133588);
    }
    while (true)
    {
      return;
      String str = u.a(parami, paramString1, a(parami.xT(), parama));
      if (!bo.isNullOrNil(str))
        n.a(parami1, str, null);
      a(parami.xT(), parami1, paramString1, paramString2, paramString3, paramString4, parama, parama1);
      AppMethodBeat.o(133588);
    }
  }

  public static void a(q paramq, com.tencent.mm.plugin.appbrand.h.i parami, String paramString1, String paramString2, o.a parama, n.a parama1)
  {
    AppMethodBeat.i(133587);
    a(paramq, parami, paramString1, "", "", paramString2, parama, parama1);
    AppMethodBeat.o(133587);
  }

  public static void a(q paramq, com.tencent.mm.plugin.appbrand.h.i parami, String paramString1, String paramString2, String paramString3, String paramString4, o.a parama, n.a parama1)
  {
    AppMethodBeat.i(133586);
    if (paramq == null)
    {
      ab.w("MicroMsg.JsValidationInjectorWC", "hy: service is null! abort");
      AppMethodBeat.o(133586);
    }
    while (true)
    {
      return;
      parama = a(paramq, parama);
      paramq = paramq.xc(paramString1);
      n.a(parami, parama + paramString1, paramString2, paramString3, paramString4, paramq, parama1);
      AppMethodBeat.o(133586);
    }
  }

  public static void b(q paramq, com.tencent.mm.plugin.appbrand.h.i parami, String paramString1, String paramString2, o.a parama, n.a parama1)
  {
    AppMethodBeat.i(133590);
    if (bo.isNullOrNil(paramString2))
    {
      parama1.lo("isNullOrNil script");
      AppMethodBeat.o(133590);
    }
    while (true)
    {
      return;
      parami = (l)parami.af(l.class);
      if (parami == null)
      {
        AppMethodBeat.o(133590);
      }
      else
      {
        paramString2 = paramString2 + String.format(";(function(){return %d;})();", new Object[] { Integer.valueOf(11111) });
        try
        {
          URL localURL = new java/net/URL;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localURL.<init>(a(paramq, parama) + paramString1);
          parami.a(paramString2, localURL.toString(), new o.1(parama1));
          AppMethodBeat.o(133590);
        }
        catch (MalformedURLException paramq)
        {
          AppMethodBeat.o(133590);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.o
 * JD-Core Version:    0.6.2
 */