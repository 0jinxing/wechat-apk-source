package com.tencent.mm.plugin;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.a;
import com.tencent.mm.ai.p;
import com.tencent.mm.api.o;
import com.tencent.mm.bx.a;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentHashMap;

public class MMPhotoEditPlugin extends f
  implements c
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(116300);
    com.tencent.mm.api.s.ccQ = new a.a();
    AppMethodBeat.o(116300);
  }

  public void installed()
  {
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(116301);
    paramc = a.xuc;
    ab.i("MicroMsg.MediaSecurityReport", "init");
    com.tencent.mm.kernel.g.Rg().a(110, paramc);
    com.tencent.mm.kernel.g.Rg().a(149, paramc);
    com.tencent.mm.kernel.g.a(o.class, a.xuc);
    AppMethodBeat.o(116301);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(116302);
    com.tencent.mm.kernel.g.L(o.class);
    a locala = a.xuc;
    ab.i("MicroMsg.MediaSecurityReport", "release");
    com.tencent.mm.kernel.g.Rg().b(110, locala);
    com.tencent.mm.kernel.g.Rg().b(149, locala);
    locala.xud.clear();
    AppMethodBeat.o(116302);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.MMPhotoEditPlugin
 * JD-Core Version:    0.6.2
 */