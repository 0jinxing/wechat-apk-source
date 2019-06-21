package com.tencent.mm.plugin.boots;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.b;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.g.a.bh;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public class PluginBoots extends f
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.d, com.tencent.mm.kernel.api.c, com.tencent.mm.plugin.boots.a.d
{
  private com.tencent.mm.plugin.boots.b.a jJi;
  private com.tencent.mm.plugin.hp.b.c jJj;
  private com.tencent.mm.sdk.b.c<bh> jJk;
  private com.tencent.mm.sdk.b.c<bf> jJl;

  public PluginBoots()
  {
    AppMethodBeat.i(90518);
    this.jJj = new com.tencent.mm.plugin.hp.b.c();
    this.jJk = new PluginBoots.1(this);
    this.jJl = new PluginBoots.2(this);
    AppMethodBeat.o(90518);
  }

  private void checkDir()
  {
    AppMethodBeat.i(90528);
    FileOp.tf(getBootsTempPath());
    AppMethodBeat.o(90528);
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(90524);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("ACTIVE_TABLE".hashCode()), new PluginBoots.3(this));
    AppMethodBeat.o(90524);
    return localHashMap;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(90522);
    super.configure(paramg);
    AppMethodBeat.o(90522);
  }

  public void dependency()
  {
    AppMethodBeat.i(90521);
    ab.d("MicroMsg.Boots.PluginBoots", "[cpan] boots dependency");
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    AppMethodBeat.o(90521);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(90523);
    ab.d("MicroMsg.Boots.PluginBoots", "[cpan] boots execute %s", new Object[] { paramg.eHT });
    if (com.tencent.mm.plugin.boots.b.a.jJA == null)
      com.tencent.mm.plugin.boots.b.a.jJA = new com.tencent.mm.plugin.boots.b.a();
    this.jJi = com.tencent.mm.plugin.boots.b.a.jJA;
    if ((paramg.SG()) || (paramg.lQ(":patch")))
    {
      com.tencent.mm.plugin.hp.tinker.d.bGq();
      com.tencent.mm.plugin.hp.tinker.d.b(b.cdV);
      com.tencent.mm.sdk.b.a.xxA.c(this.jJj);
      com.tencent.mm.sdk.b.a.xxA.c(this.jJl);
      com.tencent.mm.sdk.b.a.xxA.c(this.jJk);
    }
    if (paramg.SG())
      com.tencent.mm.kernel.g.a(PluginBoots.a.class, new com.tencent.mm.kernel.c.e(new PluginBoots.a()));
    if (paramg.SG())
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.boots.a.c.class, new com.tencent.mm.kernel.c.e(new a()));
    AppMethodBeat.o(90523);
  }

  public String getBootsPath()
  {
    AppMethodBeat.i(90526);
    String str = com.tencent.mm.kernel.g.RP().eJM + "boots/";
    AppMethodBeat.o(90526);
    return str;
  }

  public String getBootsTempPath()
  {
    AppMethodBeat.i(90527);
    String str = com.tencent.mm.kernel.g.RP().eJM + "boots/temp/";
    AppMethodBeat.o(90527);
    return str;
  }

  public com.tencent.mm.plugin.boots.a.e getTinkerLogic()
  {
    return this.jJi;
  }

  public void installed()
  {
    AppMethodBeat.i(90519);
    ab.d("MicroMsg.Boots.PluginBoots", "[cpan] boots installed");
    alias(com.tencent.mm.plugin.boots.a.d.class);
    AppMethodBeat.o(90519);
  }

  public String name()
  {
    return "plugin-boots";
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(90529);
    checkDir();
    AppMethodBeat.o(90529);
  }

  public void onAccountRelease()
  {
  }

  public void onDataBaseClosed(h paramh1, h paramh2)
  {
  }

  public void onDataBaseOpened(h paramh1, h paramh2)
  {
    AppMethodBeat.i(90525);
    ab.d("MicroMsg.Boots.PluginBoots", "[cpan] boots onDataBaseOpened");
    if (this.jJi != null)
      this.jJi.jJB = new com.tencent.mm.plugin.boots.b.a.a(paramh1);
    AppMethodBeat.o(90525);
  }

  public void uninstalled()
  {
    AppMethodBeat.i(90520);
    ab.d("MicroMsg.Boots.PluginBoots", "uninstalled");
    super.uninstalled();
    AppMethodBeat.o(90520);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.boots.PluginBoots
 * JD-Core Version:    0.6.2
 */