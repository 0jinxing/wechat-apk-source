package com.tencent.mm.plugin.backup.bakoldlogic.d;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.aa;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.bs;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import junit.framework.Assert;

public final class b extends com.tencent.mm.plugin.backup.b.a
{
  private static b jAO;
  private static int jAR = 0;
  private c jAP;
  private a jAQ;
  private c jAS;

  private boolean a(PLong paramPLong1, PLong paramPLong2, PLong paramPLong3, b.a parama, int paramInt)
  {
    AppMethodBeat.i(18017);
    aw.ZK();
    com.tencent.mm.model.c.closeDB();
    ab.d("MicroMsg.BakOldTempDbModel", "bakoldInitTempDBimp after close db");
    aw.ZK();
    long l = e.asZ(com.tencent.mm.model.c.Rv());
    aw.ZK();
    paramPLong3.value = (l + e.asZ(com.tencent.mm.model.c.Rw()));
    l = paramPLong3.value;
    aw.ZK();
    boolean bool;
    if (!com.tencent.mm.plugin.backup.bakoldlogic.a.a.a(l, paramPLong1, paramPLong2, com.tencent.mm.model.c.getAccPath()))
    {
      ab.e("MicroMsg.BakOldTempDbModel", "bakoldInitTempDBimp data free error, len %d", new Object[] { Long.valueOf(paramPLong3.value) });
      parama.jBa = false;
      parama.jBb = paramPLong1.value;
      parama.jBc = paramPLong2.value;
      parama.dbSize = paramPLong3.value;
      bool = false;
      AppMethodBeat.o(18017);
    }
    while (true)
    {
      return bool;
      aw.ZK();
      Object localObject1 = com.tencent.mm.model.c.Rv();
      Object localObject2 = new StringBuilder();
      aw.ZK();
      e.y((String)localObject1, com.tencent.mm.model.c.Rv() + ".tem");
      aw.ZK();
      localObject2 = com.tencent.mm.model.c.Rw();
      localObject1 = new StringBuilder();
      aw.ZK();
      e.y((String)localObject2, com.tencent.mm.model.c.Rw() + ".tem");
      localObject1 = new StringBuilder();
      aw.ZK();
      localObject2 = com.tencent.mm.model.c.Rw() + "-journal";
      localObject1 = new StringBuilder();
      aw.ZK();
      e.y((String)localObject2, com.tencent.mm.model.c.Rw() + ".tem-journal");
      localObject1 = new StringBuilder();
      aw.ZK();
      localObject1 = com.tencent.mm.model.c.Rw() + "-wal";
      localObject2 = new StringBuilder();
      aw.ZK();
      e.y((String)localObject1, com.tencent.mm.model.c.Rw() + ".tem-wal");
      ab.i("MicroMsg.BakOldTempDbModel", "bakoldInitTempDBimp before reset account");
      com.tencent.mm.kernel.g.RN().release();
      com.tencent.mm.kernel.g.RN().initialize();
      ab.i("MicroMsg.BakOldTempDbModel", "bakoldInitTempDBimp before TemAccStg setAccInfo");
      localObject1 = aVc();
      aw.ZK();
      localObject2 = com.tencent.mm.model.c.getAccPath();
      aw.ZK();
      int i = com.tencent.mm.model.c.QF();
      ab.i("MicroMsg.BakOldTempStorage", "accPath:%s, accUin:%d", new Object[] { localObject2, Integer.valueOf(i) });
      ((c)localObject1).uin = i;
      ((c)localObject1).eJM = ((String)localObject2);
      ab.i("MicroMsg.BakOldTempDbModel", "bakoldInitTempDBimp before TemAccStg initDB");
      localObject1 = aVc();
      localObject2 = new StringBuilder();
      aw.ZK();
      localObject2 = com.tencent.mm.model.c.Rv() + ".tem";
      aw.ZK();
      i = com.tencent.mm.model.c.QF();
      Object localObject3 = new StringBuilder();
      aw.ZK();
      localObject3 = com.tencent.mm.model.c.Rw() + ".tem";
      ab.i("MicroMsg.BakOldTempStorage", "bakoldInitDB isTempDB:%s  cache:%s uin:%s db:%s %s", new Object[] { ((c)localObject1).jBf, localObject2, Integer.valueOf(i), localObject3, bo.dpG() });
      if (((c)localObject1).eJN != null)
        ab.e("MicroMsg.BakOldTempStorage", "bakoldInitDB dataDB is already init!!!");
      Object localObject4;
      if (paramInt > 0)
      {
        if ((((c)localObject1).jBf != null) && (!((c)localObject1).jBf.booleanValue()))
        {
          ab.e("MicroMsg.BakOldTempStorage", "bakoldInitDB isTempDB is false!!!");
          ((c)localObject1).aVf();
        }
        localObject4 = "bakoldInitDB here  isTempDb should null :" + ((c)localObject1).jBf;
        if (((c)localObject1).jBf != null)
          break label750;
      }
      label750: for (bool = true; ; bool = false)
      {
        Assert.assertTrue((String)localObject4, bool);
        ((c)localObject1).jBf = Boolean.TRUE;
        ((c)localObject1).eJN = new com.tencent.mm.cd.h(new c.2((c)localObject1));
        localObject4 = ((c)localObject1).eJN;
        l = i;
        q.LK();
        if (((com.tencent.mm.cd.h)localObject4).b((String)localObject2, (String)localObject3, "", l, new HashMap(), false))
          break;
        paramPLong1 = new com.tencent.mm.model.b((byte)0);
        AppMethodBeat.o(18017);
        throw paramPLong1;
      }
      ((c)localObject1).jym = new z(((c)localObject1).eJN);
      localObject2 = (com.tencent.mm.plugin.messenger.foundation.a.k)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.k.class);
      ((c)localObject1).jyn = ((com.tencent.mm.plugin.messenger.foundation.a.k)localObject2).d(((c)localObject1).eJN);
      ((c)localObject1).jyp = ((com.tencent.mm.plugin.messenger.foundation.a.k)localObject2).e(((c)localObject1).eJN);
      ((c)localObject1).jyo = ((com.tencent.mm.plugin.messenger.foundation.a.k)localObject2).a(((c)localObject1).eJN, ((c)localObject1).jyn, ((c)localObject1).jyp);
      ((c)localObject1).jyo.a(new au(((c)localObject1).jyo));
      ((c)localObject1).jyo.a(new o(((c)localObject1).jyo));
      ((c)localObject1).jys = ((com.tencent.mm.plugin.messenger.foundation.a.k)localObject2).f(((c)localObject1).eJN);
      ((c)localObject1).jyq = new com.tencent.mm.at.g(((c)localObject1).eJN);
      if (com.tencent.mm.bp.d.afj("emoji"))
        ((c)localObject1).jyr = new com.tencent.mm.storage.emotion.d(((c)localObject1).eJN);
      ((c)localObject1).jyu = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).c(((c)localObject1).eJN);
      ((c)localObject1).jyt = new t(((c)localObject1).eJN);
      ((c)localObject1).jyv = new com.tencent.mm.pluginsdk.model.app.k(((c)localObject1).eJN);
      ((c)localObject1).jyw = new i(((c)localObject1).eJN);
      ((c)localObject1).jyx = new com.tencent.mm.pluginsdk.model.app.c(((c)localObject1).eJN);
      ((c)localObject1).jBd = new bs(((c)localObject1).jym);
      ((c)localObject1).jBd.c(new c.1((c)localObject1));
      ((c)localObject1).jBd.duo();
      ab.i("MicroMsg.BakOldTempDbModel", "bakoldInitTempDBimp after TemAccStg initDB");
      aVb();
      parama.jBa = true;
      parama.jBb = paramPLong1.value;
      parama.jBc = paramPLong2.value;
      parama.dbSize = paramPLong3.value;
      com.tencent.mm.plugin.backup.bakoldlogic.a.a.Fo(com.tencent.mm.plugin.backup.bakoldlogic.a.a.aUy());
      bool = true;
      AppMethodBeat.o(18017);
    }
  }

  public static b aUY()
  {
    AppMethodBeat.i(18011);
    if (jAO == null)
    {
      localb = new b();
      jAO = localb;
      a(localb);
    }
    b localb = jAO;
    AppMethodBeat.o(18011);
    return localb;
  }

  private static void aVb()
  {
    AppMethodBeat.i(18014);
    aa localaa = new aa();
    com.tencent.mm.sdk.b.a.xxA.m(localaa);
    AppMethodBeat.o(18014);
  }

  private c aVc()
  {
    AppMethodBeat.i(18015);
    if (this.jAS == null)
      this.jAS = new c();
    c localc = this.jAS;
    AppMethodBeat.o(18015);
    return localc;
  }

  public static void aVd()
  {
    AppMethodBeat.i(18018);
    StringBuilder localStringBuilder = new StringBuilder();
    aw.ZK();
    e.deleteFile(com.tencent.mm.model.c.Rv() + ".tem");
    localStringBuilder = new StringBuilder();
    aw.ZK();
    e.deleteFile(com.tencent.mm.model.c.Rv() + ".ini.tem");
    localStringBuilder = new StringBuilder();
    aw.ZK();
    e.deleteFile(com.tencent.mm.model.c.Rw() + ".tem");
    localStringBuilder = new StringBuilder();
    aw.ZK();
    e.deleteFile(com.tencent.mm.model.c.Rw() + ".ini.tem");
    AppMethodBeat.o(18018);
  }

  public final void a(b.a parama)
  {
    AppMethodBeat.i(18016);
    long l = bo.anU();
    ab.i("MicroMsg.BakOldTempDbModel", "initTempDB needSyncPauser:%b %s", new Object[] { Boolean.FALSE, bo.dpG() });
    al.n(new b.1(this, l, parama), 1000L);
    AppMethodBeat.o(18016);
  }

  public final void aSp()
  {
    jAO = null;
  }

  public final c aUZ()
  {
    AppMethodBeat.i(18012);
    if (this.jAP == null)
      this.jAP = new c();
    c localc = this.jAP;
    AppMethodBeat.o(18012);
    return localc;
  }

  public final a aVa()
  {
    AppMethodBeat.i(18013);
    if (this.jAQ == null)
      this.jAQ = new a();
    a locala = this.jAQ;
    AppMethodBeat.o(18013);
    return locala;
  }

  public final void c(Runnable paramRunnable, int paramInt)
  {
    AppMethodBeat.i(18019);
    if ((paramInt < 0) || (jAR == 0))
    {
      if (paramInt < 0)
        ab.e("MicroMsg.BakOldTempDbModel", "closeTempDB no left tryCount!!");
      ab.i("MicroMsg.BakOldTempDbModel", "closeDB before");
      aVc().aVf();
      ab.i("MicroMsg.BakOldTempDbModel", "closeDB after");
      if (paramRunnable == null)
        break label95;
      paramRunnable.run();
      AppMethodBeat.o(18019);
    }
    while (true)
    {
      return;
      new ak(Looper.getMainLooper()).postDelayed(new b.3(this, paramRunnable, paramInt), 500L);
      label95: AppMethodBeat.o(18019);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.b
 * JD-Core Version:    0.6.2
 */