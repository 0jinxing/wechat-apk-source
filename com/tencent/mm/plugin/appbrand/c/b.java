package com.tencent.mm.plugin.appbrand.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.i.h.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Vector;

public final class b
{
  public g.a fFk;
  public Vector<d.b> heu;
  public Vector<d.a> hev;
  public HashMap<String, d.c> hew;
  public h.a hex;

  public b()
  {
    AppMethodBeat.i(129818);
    this.hev = new Vector();
    this.heu = new Vector();
    this.fFk = new b.1(this);
    this.hew = new HashMap();
    this.hex = new h.a()
    {
      public final void a(String paramAnonymousString, int paramAnonymousInt, d paramAnonymousd)
      {
        AppMethodBeat.i(129817);
        ab.i("MicroMsg.AppbrandCdnService", "appbrand cdn service on finish [%s %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt) });
        paramAnonymousd = (d.c)b.this.hew.get(paramAnonymousString);
        if (paramAnonymousd != null)
          paramAnonymousd.ad(paramAnonymousString, paramAnonymousInt);
        AppMethodBeat.o(129817);
      }

      public final void h(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(129816);
        ab.i("MicroMsg.AppbrandCdnService", "appbrand cdn service on progress [%s %d %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        paramAnonymousString = (d.c)b.this.hew.get(paramAnonymousString);
        if (paramAnonymousString != null)
          paramAnonymousString.cT(paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(129816);
      }

      public final void onDataAvailable(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(129815);
        ab.i("MicroMsg.AppbrandCdnService", "appbrand cdn service on data available [%s %d %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        paramAnonymousString = (d.c)b.this.hew.get(paramAnonymousString);
        if (paramAnonymousString != null)
          paramAnonymousString.cS(paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(129815);
      }

      public final void onMoovReady(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(129814);
        ab.i("MicroMsg.AppbrandCdnService", "appbrand cdn service on moov ready [%s %d %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        paramAnonymousString = (d.c)b.this.hew.get(paramAnonymousString);
        if (paramAnonymousString != null)
          paramAnonymousString.cR(paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(129814);
      }
    };
    AppMethodBeat.o(129818);
  }

  public static boolean yC(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(129821);
    a locala = com.tencent.mm.plugin.appbrand.app.f.auX().yE(paramString);
    if (locala == null)
    {
      ab.e("MicroMsg.AppbrandCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", new Object[] { paramString });
      AppMethodBeat.o(129821);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.al.f.afx().rN(locala.cHr);
      AppMethodBeat.o(129821);
    }
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(129820);
    if ((this.hev != null) && (parama != null))
      this.hev.remove(parama);
    AppMethodBeat.o(129820);
  }

  public final void a(d.b paramb)
  {
    AppMethodBeat.i(129819);
    if ((this.heu != null) && (paramb != null))
      this.heu.remove(paramb);
    AppMethodBeat.o(129819);
  }

  public final void yD(String paramString)
  {
    AppMethodBeat.i(129822);
    this.hew.remove(paramString);
    AppMethodBeat.o(129822);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.c.b
 * JD-Core Version:    0.6.2
 */