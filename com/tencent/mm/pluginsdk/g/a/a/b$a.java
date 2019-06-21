package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.n.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class b$a
  implements com.tencent.mm.pluginsdk.g.a.c.g
{
  private final bz.a unU;
  private final com.tencent.mm.sdk.b.c ved;
  private final h vee;

  public b$a()
  {
    AppMethodBeat.i(79481);
    this.ved = new com.tencent.mm.sdk.b.c()
    {
    };
    this.unU = new b.a.2(this);
    this.vee = new h();
    AppMethodBeat.o(79481);
  }

  public final String awa()
  {
    return "CheckResUpdate";
  }

  public final n.a c(l paraml)
  {
    AppMethodBeat.i(79484);
    if (!(paraml instanceof c))
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "get mismatch NetworkRequest type, return null");
      paraml = null;
      AppMethodBeat.o(79484);
    }
    while (true)
    {
      return paraml;
      ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "return CheckResUpdateNetworkRequestHandler");
      paraml = new d((c)paraml);
      AppMethodBeat.o(79484);
    }
  }

  public final void cYt()
  {
    AppMethodBeat.i(79482);
    a.xxA.c(this.ved);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a("resourcemgr", this.unU, true);
    com.tencent.mm.kernel.g.RS().m(new b.a.3(this), 10000L);
    AppMethodBeat.o(79482);
  }

  public final com.tencent.mm.pluginsdk.g.a.c.h cYu()
  {
    return this.vee;
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(79483);
    a.xxA.d(this.ved);
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("resourcemgr", this.unU, true);
    AppMethodBeat.o(79483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.b.a
 * JD-Core Version:    0.6.2
 */