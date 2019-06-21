package com.tencent.mm.plugin.fav;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ga;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.fav.a.aa;
import com.tencent.mm.plugin.fav.a.ac;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.ah;
import com.tencent.mm.plugin.fav.a.l;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.fav.a.s;
import com.tencent.mm.plugin.fav.a.t;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.protocal.protobuf.aax;
import com.tencent.mm.protocal.protobuf.abi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.List;
import java.util.Map;

public class PluginFav extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.c, ae
{
  private a mej;
  private x mek;
  private q mel;
  private aa mem;
  private t men;
  private s meo;
  private l mep;
  private com.tencent.mm.plugin.fav.b.e.e meq;
  private com.tencent.mm.plugin.fav.b.e.d mer;
  private com.tencent.mm.plugin.fav.b.e.a mes;
  private com.tencent.mm.plugin.fav.b.e.b met;
  private com.tencent.mm.plugin.fav.b.e.c meu;
  private com.tencent.mm.plugin.fav.b.b.a mev;
  private com.tencent.mm.plugin.fav.b.b.b mew;
  private com.tencent.mm.sdk.b.c mex;

  public PluginFav()
  {
    AppMethodBeat.i(5287);
    this.mev = new com.tencent.mm.plugin.fav.b.b.a();
    this.mew = new com.tencent.mm.plugin.fav.b.b.b();
    this.mex = new PluginFav.4(this);
    AppMethodBeat.o(5287);
  }

  private static void checkDir()
  {
    AppMethodBeat.i(5292);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.bum());
    if ((!localb.exists()) || (!localb.isDirectory()))
    {
      ab.i("MicroMsg.Fav.PluginFav", "fav root dir not exists, try to make it");
      localb.mkdirs();
    }
    localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.bue());
    if ((!localb.exists()) || (!localb.isDirectory()))
    {
      ab.i("MicroMsg.Fav.PluginFav", "fav web dir not exists, try to make it");
      localb.mkdirs();
    }
    localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.bul());
    if ((!localb.exists()) || (!localb.isDirectory()))
    {
      ab.i("MicroMsg.Fav.PluginFav", "fav attach dir not exists, try to make it");
      localb.mkdirs();
    }
    localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.bun());
    if ((!localb.exists()) || (!localb.isDirectory()))
    {
      ab.i("MicroMsg.Fav.PluginFav", "fav voice dir not exists, try to make it");
      localb.mkdirs();
    }
    AppMethodBeat.o(5292);
  }

  public void checkFavItem(abi paramabi)
  {
    AppMethodBeat.i(5291);
    al.d(new PluginFav.3(this, new com.tencent.mm.plugin.fav.b.d.a(paramabi)));
    AppMethodBeat.o(5291);
  }

  public void checkFavItem(List<aax> paramList)
  {
    AppMethodBeat.i(5290);
    al.d(new PluginFav.2(this, new com.tencent.mm.plugin.fav.b.d.a(paramList)));
    AppMethodBeat.o(5290);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public com.tencent.mm.plugin.fav.b.e.b getCheckCdnService()
  {
    return this.met;
  }

  public com.tencent.mm.plugin.fav.b.e.c getEditService()
  {
    return this.meu;
  }

  public com.tencent.mm.plugin.fav.b.e.a getFavCdnService()
  {
    return this.mes;
  }

  public q getFavCdnStorage()
  {
    return this.mel;
  }

  public s getFavConfigStorage()
  {
    return this.meo;
  }

  public t getFavEditInfoStorage()
  {
    return this.men;
  }

  public x getFavItemInfoStorage()
  {
    return this.mek;
  }

  public aa getFavSearchStorage()
  {
    return this.mem;
  }

  public l getFavTagSetMgr()
  {
    return this.mep;
  }

  public com.tencent.mm.plugin.fav.b.e.d getModService()
  {
    return this.mer;
  }

  public ac getSendService()
  {
    return this.meq;
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(5288);
    this.mej = new a();
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("uploadfavitem", this.mej);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("resendfavitem", this.mej);
    this.mek = new com.tencent.mm.plugin.fav.b.f.d(ga.HI());
    this.mel = new com.tencent.mm.plugin.fav.b.f.a(ga.HI());
    this.mem = new com.tencent.mm.plugin.fav.b.f.e(ga.HI());
    this.men = new com.tencent.mm.plugin.fav.b.f.c(ga.HI());
    this.meo = new com.tencent.mm.plugin.fav.b.f.b(ga.HI());
    this.meq = new com.tencent.mm.plugin.fav.b.e.e();
    this.mer = new com.tencent.mm.plugin.fav.b.e.d();
    this.mes = new com.tencent.mm.plugin.fav.b.e.a();
    this.met = new com.tencent.mm.plugin.fav.b.e.b();
    this.meu = new com.tencent.mm.plugin.fav.b.e.c();
    this.mep = new l();
    ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSTaskDaemon().a(-86016, new PluginFav.1(this));
    this.mex.dnU();
    this.mev.dnU();
    this.mew.dnU();
    checkDir();
    AppMethodBeat.o(5288);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(5289);
    this.mex.dead();
    this.mev.dead();
    this.mew.dead();
    ah.bvd();
    ((n)com.tencent.mm.kernel.g.M(n.class)).unregisterIndexStorage(256);
    ((n)com.tencent.mm.kernel.g.M(n.class)).unregisterNativeLogic(6);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("uploadfavitem", this.mej);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("resendfavitem", this.mej);
    this.mej = null;
    Object localObject;
    if (this.meq != null)
    {
      localObject = this.meq;
      ab.i("MicroMsg.Fav.FavSendService", "stop");
      ((com.tencent.mm.plugin.fav.b.e.e)localObject).Fb();
      ((com.tencent.mm.plugin.fav.b.e.e)localObject).cra.stopTimer();
      ((com.tencent.mm.plugin.fav.b.e.e)localObject).cqV = 0;
      com.tencent.mm.kernel.g.Rg().b(401, (com.tencent.mm.ai.f)localObject);
      this.meq = null;
    }
    if (this.mer != null)
    {
      localObject = this.mer;
      ab.i("MicroMsg.Fav.FavModService", "stop");
      ((com.tencent.mm.plugin.fav.b.e.d)localObject).Fb();
      ((com.tencent.mm.plugin.fav.b.e.d)localObject).cra.stopTimer();
      ((com.tencent.mm.plugin.fav.b.e.d)localObject).cqV = 0;
      com.tencent.mm.kernel.g.Rg().b(426, (com.tencent.mm.ai.f)localObject);
      this.mer = null;
    }
    if (this.mes != null)
    {
      localObject = this.mes;
      ((com.tencent.mm.plugin.fav.b.e.a)localObject).Fb();
      ((com.tencent.mm.plugin.fav.b.e.a)localObject).cra.stopTimer();
      ((com.tencent.mm.plugin.fav.b.e.a)localObject).cqV = 0;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().b(((com.tencent.mm.plugin.fav.b.e.a)localObject).fyJ);
      this.mes = null;
    }
    if (this.met != null)
    {
      localObject = this.met;
      ab.i("MicroMsg.Fav.FavCheckCdnService", "stop");
      ((com.tencent.mm.plugin.fav.b.e.b)localObject).Fb();
      ((com.tencent.mm.plugin.fav.b.e.b)localObject).cra.stopTimer();
      com.tencent.mm.kernel.g.Rg().b(404, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.RO().b(((com.tencent.mm.plugin.fav.b.e.b)localObject).fyJ);
      this.met = null;
    }
    if (this.meu != null)
    {
      localObject = this.meu;
      ab.i("MicroMsg.Fav.FavEditService", "stop");
      com.tencent.mm.kernel.g.Rg().b(426, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.Rg().b(401, (com.tencent.mm.ai.f)localObject);
      ((com.tencent.mm.plugin.fav.b.e.c)localObject).mhd.clear();
      this.meu = null;
    }
    this.mek = null;
    this.mel = null;
    this.mem = null;
    this.men = null;
    this.meo = null;
    this.mep = null;
    AppMethodBeat.o(5289);
  }

  public void parallelsDependency()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.PluginFav
 * JD-Core Version:    0.6.2
 */