package com.tencent.mm.plugin.game.commlib;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.game.commlib.a.b;

public class PluginCommLib extends f
  implements com.tencent.mm.kernel.api.bucket.c, b
{
  private com.tencent.mm.sdk.b.c lOc;

  public PluginCommLib()
  {
    AppMethodBeat.i(59412);
    this.lOc = new PluginCommLib.1(this);
    AppMethodBeat.o(59412);
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(59413);
    e.NL(paramg.eHT);
    AppMethodBeat.o(59413);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(59414);
    if (paramg.SG())
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.game.commlib.a.a.class, new d());
    AppMethodBeat.o(59414);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(59415);
    com.tencent.mm.sdk.b.a.xxA.b(this.lOc);
    AppMethodBeat.o(59415);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(59416);
    com.tencent.mm.sdk.b.a.xxA.d(this.lOc);
    com.tencent.mm.plugin.game.commlib.d.a.aNR();
    AppMethodBeat.o(59416);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.commlib.PluginCommLib
 * JD-Core Version:    0.6.2
 */