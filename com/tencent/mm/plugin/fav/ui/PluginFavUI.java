package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.b.b;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.fts.a.n;

public class PluginFavUI extends f
  implements b, c
{
  private com.tencent.mm.plugin.fav.ui.c.a mkV;
  private a mkW;
  private m mkX;

  public PluginFavUI()
  {
    AppMethodBeat.i(74289);
    this.mkV = new com.tencent.mm.plugin.fav.ui.c.a();
    this.mkW = new a();
    this.mkX = new m();
    AppMethodBeat.o(74289);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(74290);
    this.mkV.dnU();
    this.mkW.dnU();
    this.mkX.dnU();
    ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSTaskDaemon().a(-86016, new PluginFavUI.1(this));
    AppMethodBeat.o(74290);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(74291);
    this.mkV.dead();
    this.mkW.dead();
    this.mkX.dead();
    AppMethodBeat.o(74291);
  }

  public void parallelsDependency()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.PluginFavUI
 * JD-Core Version:    0.6.2
 */