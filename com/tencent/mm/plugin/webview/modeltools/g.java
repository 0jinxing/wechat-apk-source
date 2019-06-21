package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.c;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.g.a.cb;
import com.tencent.mm.g.a.k;
import com.tencent.mm.g.a.vq;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.webview.fts.f.a;
import com.tencent.mm.plugin.webview.fts.g.a;
import com.tencent.mm.plugin.webview.fts.g.b;
import com.tencent.mm.plugin.webview.luggage.s;
import com.tencent.mm.plugin.webview.luggage.s.1;
import com.tencent.mm.plugin.webview.model.ai;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.model.am;
import com.tencent.mm.plugin.webview.model.as;
import com.tencent.mm.plugin.webview.modelcache.e.a;
import com.tencent.mm.plugin.webview.modelcache.r;
import com.tencent.mm.plugin.webview.modelcache.r.a;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.xwalk.core.XWalkEnvironment;

public class g
  implements at
{
  private static final HashMap<Integer, h.d> eaA;
  private com.tencent.mm.sdk.b.c<bf> fAP;
  public boolean isAppActive;
  private bz.a jCX;
  com.tencent.mm.sdk.b.c kBB;
  private com.tencent.mm.network.n mwl;
  private aj uoO;
  private ak uoP;
  private ai uoQ;
  private m uoR;
  private com.tencent.mm.plugin.webview.model.e uoS;
  private am uoT;
  private com.tencent.mm.plugin.webview.b.e uoU;
  private com.tencent.mm.plugin.webview.fts.g uoV;
  private com.tencent.mm.plugin.webview.fts.a uoW;
  private com.tencent.mm.plugin.webview.fts.b uoX;
  private com.tencent.mm.plugin.webview.c.a uoY;
  private final com.tencent.mm.plugin.webview.modelcache.o uoZ;
  private com.tencent.mm.plugin.webview.luggage.a upa;
  private com.tencent.mm.sdk.b.c upb;
  private com.tencent.mm.sdk.b.c upc;
  com.tencent.mm.sdk.b.c upd;
  com.tencent.mm.sdk.b.c upe;
  final com.tencent.mm.sdk.b.c<vq> upf;
  com.tencent.mm.sdk.b.c upg;
  final com.tencent.mm.sdk.b.c<k> uph;
  com.tencent.mm.sdk.b.c upi;
  com.tencent.mm.sdk.b.c upj;
  com.tencent.mm.sdk.b.c upk;
  private com.tencent.mm.sdk.b.c upl;

  static
  {
    AppMethodBeat.i(7006);
    Object localObject = new HashMap();
    eaA = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("WebViewHostsFilterTable".hashCode()), new g.15());
    localObject = new LinkedList();
    ((List)localObject).add(com.tencent.mm.plugin.webview.modelcache.a.cYh());
    ((List)localObject).addAll(com.tencent.mm.plugin.webview.modelcache.l.cYn());
    ((List)localObject).add(com.tencent.mm.plugin.webview.modelcache.i.cYh());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      e.a locala = (e.a)((Iterator)localObject).next();
      eaA.put(Integer.valueOf(locala.id), locala);
    }
    eaA.put(Integer.valueOf("WEBVIEW_JSLOG_BLOCK_LIST_TABLE".hashCode()), new g.16());
    eaA.put(Integer.valueOf("WEBVIEW_LOCAL_DATA".hashCode()), new g.17());
    eaA.put(Integer.valueOf("WEBVIEW_DATA".hashCode()), new g.18());
    eaA.put(Integer.valueOf("WEBVIEW_HISTORY_DATA".hashCode()), new g.19());
    AppMethodBeat.o(7006);
  }

  public g()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 171	java/lang/Object:<init>	()V
    //   4: sipush 6991
    //   7: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: new 173	com/tencent/mm/plugin/webview/modelcache/o
    //   14: dup
    //   15: invokespecial 174	com/tencent/mm/plugin/webview/modelcache/o:<init>	()V
    //   18: putfield 176	com/tencent/mm/plugin/webview/modeltools/g:uoZ	Lcom/tencent/mm/plugin/webview/modelcache/o;
    //   21: aload_0
    //   22: iconst_1
    //   23: putfield 178	com/tencent/mm/plugin/webview/modeltools/g:isAppActive	Z
    //   26: aload_0
    //   27: new 8	com/tencent/mm/plugin/webview/modeltools/g$1
    //   30: dup
    //   31: aload_0
    //   32: invokespecial 181	com/tencent/mm/plugin/webview/modeltools/g$1:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   35: putfield 183	com/tencent/mm/plugin/webview/modeltools/g:upb	Lcom/tencent/mm/sdk/b/c;
    //   38: aload_0
    //   39: new 185	com/tencent/mm/plugin/webview/modeltools/g$12
    //   42: dup
    //   43: aload_0
    //   44: invokespecial 186	com/tencent/mm/plugin/webview/modeltools/g$12:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   47: putfield 188	com/tencent/mm/plugin/webview/modeltools/g:upc	Lcom/tencent/mm/sdk/b/c;
    //   50: aload_0
    //   51: new 190	com/tencent/mm/plugin/webview/modeltools/g$21
    //   54: dup
    //   55: aload_0
    //   56: invokespecial 191	com/tencent/mm/plugin/webview/modeltools/g$21:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   59: putfield 193	com/tencent/mm/plugin/webview/modeltools/g:jCX	Lcom/tencent/mm/model/bz$a;
    //   62: aload_0
    //   63: new 195	com/tencent/mm/plugin/webview/modeltools/g$2
    //   66: dup
    //   67: aload_0
    //   68: invokespecial 196	com/tencent/mm/plugin/webview/modeltools/g$2:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   71: putfield 198	com/tencent/mm/plugin/webview/modeltools/g:upd	Lcom/tencent/mm/sdk/b/c;
    //   74: aload_0
    //   75: new 200	com/tencent/mm/plugin/webview/modeltools/g$3
    //   78: dup
    //   79: aload_0
    //   80: invokespecial 201	com/tencent/mm/plugin/webview/modeltools/g$3:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   83: putfield 203	com/tencent/mm/plugin/webview/modeltools/g:upe	Lcom/tencent/mm/sdk/b/c;
    //   86: aload_0
    //   87: new 205	com/tencent/mm/plugin/webview/modeltools/g$4
    //   90: dup
    //   91: aload_0
    //   92: invokespecial 206	com/tencent/mm/plugin/webview/modeltools/g$4:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   95: putfield 208	com/tencent/mm/plugin/webview/modeltools/g:upf	Lcom/tencent/mm/sdk/b/c;
    //   98: aload_0
    //   99: new 210	com/tencent/mm/plugin/webview/modeltools/g$5
    //   102: dup
    //   103: aload_0
    //   104: invokespecial 211	com/tencent/mm/plugin/webview/modeltools/g$5:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   107: putfield 213	com/tencent/mm/plugin/webview/modeltools/g:upg	Lcom/tencent/mm/sdk/b/c;
    //   110: aload_0
    //   111: new 215	com/tencent/mm/plugin/webview/modeltools/g$6
    //   114: dup
    //   115: aload_0
    //   116: invokespecial 216	com/tencent/mm/plugin/webview/modeltools/g$6:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   119: putfield 218	com/tencent/mm/plugin/webview/modeltools/g:kBB	Lcom/tencent/mm/sdk/b/c;
    //   122: aload_0
    //   123: new 220	com/tencent/mm/plugin/webview/modeltools/g$7
    //   126: dup
    //   127: aload_0
    //   128: invokespecial 221	com/tencent/mm/plugin/webview/modeltools/g$7:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   131: putfield 223	com/tencent/mm/plugin/webview/modeltools/g:uph	Lcom/tencent/mm/sdk/b/c;
    //   134: aload_0
    //   135: new 225	com/tencent/mm/plugin/webview/modeltools/g$8
    //   138: dup
    //   139: aload_0
    //   140: invokespecial 226	com/tencent/mm/plugin/webview/modeltools/g$8:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   143: putfield 228	com/tencent/mm/plugin/webview/modeltools/g:upi	Lcom/tencent/mm/sdk/b/c;
    //   146: aload_0
    //   147: new 230	com/tencent/mm/plugin/webview/modeltools/g$9
    //   150: dup
    //   151: aload_0
    //   152: invokespecial 231	com/tencent/mm/plugin/webview/modeltools/g$9:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   155: putfield 233	com/tencent/mm/plugin/webview/modeltools/g:upj	Lcom/tencent/mm/sdk/b/c;
    //   158: aload_0
    //   159: new 10	com/tencent/mm/plugin/webview/modeltools/g$10
    //   162: dup
    //   163: aload_0
    //   164: invokespecial 234	com/tencent/mm/plugin/webview/modeltools/g$10:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   167: putfield 236	com/tencent/mm/plugin/webview/modeltools/g:upk	Lcom/tencent/mm/sdk/b/c;
    //   170: aload_0
    //   171: new 238	com/tencent/mm/plugin/webview/modeltools/g$11
    //   174: dup
    //   175: aload_0
    //   176: invokespecial 239	com/tencent/mm/plugin/webview/modeltools/g$11:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   179: putfield 241	com/tencent/mm/plugin/webview/modeltools/g:fAP	Lcom/tencent/mm/sdk/b/c;
    //   182: aload_0
    //   183: new 243	com/tencent/mm/plugin/webview/modeltools/g$13
    //   186: dup
    //   187: aload_0
    //   188: invokespecial 244	com/tencent/mm/plugin/webview/modeltools/g$13:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   191: putfield 246	com/tencent/mm/plugin/webview/modeltools/g:upl	Lcom/tencent/mm/sdk/b/c;
    //   194: aload_0
    //   195: new 248	com/tencent/mm/plugin/webview/modeltools/g$14
    //   198: dup
    //   199: aload_0
    //   200: invokespecial 249	com/tencent/mm/plugin/webview/modeltools/g$14:<init>	(Lcom/tencent/mm/plugin/webview/modeltools/g;)V
    //   203: putfield 251	com/tencent/mm/plugin/webview/modeltools/g:mwl	Lcom/tencent/mm/network/n;
    //   206: sipush 6991
    //   209: invokestatic 169	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: return
  }

  public static com.tencent.mm.plugin.webview.c.a cYA()
  {
    AppMethodBeat.i(6993);
    if (cYz().uoY == null)
      cYz().uoY = new com.tencent.mm.plugin.webview.c.a();
    com.tencent.mm.plugin.webview.c.a locala = cYz().uoY;
    AppMethodBeat.o(6993);
    return locala;
  }

  public static com.tencent.mm.plugin.webview.fts.a cYB()
  {
    AppMethodBeat.i(6994);
    if (cYz().uoW == null)
      cYz().uoW = new com.tencent.mm.plugin.webview.fts.a();
    com.tencent.mm.plugin.webview.fts.a locala = cYz().uoW;
    AppMethodBeat.o(6994);
    return locala;
  }

  public static com.tencent.mm.plugin.webview.fts.b cYC()
  {
    AppMethodBeat.i(6995);
    if (cYz().uoX == null)
      cYz().uoX = new com.tencent.mm.plugin.webview.fts.b();
    com.tencent.mm.plugin.webview.fts.b localb = cYz().uoX;
    AppMethodBeat.o(6995);
    return localb;
  }

  public static com.tencent.mm.plugin.webview.fts.g cYD()
  {
    AppMethodBeat.i(6996);
    if (cYz().uoV == null)
      cYz().uoV = new com.tencent.mm.plugin.webview.fts.g();
    com.tencent.mm.plugin.webview.fts.g localg = cYz().uoV;
    AppMethodBeat.o(6996);
    return localg;
  }

  public static aj cYE()
  {
    AppMethodBeat.i(6997);
    if (cYz().uoO == null)
      cYz().uoO = new aj();
    aj localaj = cYz().uoO;
    AppMethodBeat.o(6997);
    return localaj;
  }

  public static ak cYF()
  {
    AppMethodBeat.i(6998);
    if (cYz().uoP == null)
      cYz().uoP = ak.cXM();
    ak localak = cYz().uoP;
    AppMethodBeat.o(6998);
    return localak;
  }

  public static m cYG()
  {
    AppMethodBeat.i(6999);
    if (cYz().uoR == null)
    {
      localObject = cYz();
      com.tencent.mm.kernel.g.RQ();
      ((g)localObject).uoR = new m(com.tencent.mm.kernel.g.RP().eJN);
    }
    Object localObject = cYz().uoR;
    AppMethodBeat.o(6999);
    return localObject;
  }

  public static com.tencent.mm.plugin.webview.model.e cYH()
  {
    AppMethodBeat.i(7000);
    if (cYz().uoS == null)
    {
      localObject = cYz();
      com.tencent.mm.kernel.g.RQ();
      ((g)localObject).uoS = new com.tencent.mm.plugin.webview.model.e(com.tencent.mm.kernel.g.RP().eJN);
    }
    Object localObject = cYz().uoS;
    AppMethodBeat.o(7000);
    return localObject;
  }

  public static am cYI()
  {
    AppMethodBeat.i(7001);
    if (cYz().uoT == null)
    {
      localObject = cYz();
      com.tencent.mm.kernel.g.RQ();
      ((g)localObject).uoT = new am(com.tencent.mm.kernel.g.RP().eJN);
    }
    Object localObject = cYz().uoT;
    AppMethodBeat.o(7001);
    return localObject;
  }

  public static com.tencent.mm.plugin.webview.b.e cYJ()
  {
    AppMethodBeat.i(7002);
    if (cYz().uoU == null)
    {
      localObject = cYz();
      com.tencent.mm.kernel.g.RQ();
      ((g)localObject).uoU = new com.tencent.mm.plugin.webview.b.e(com.tencent.mm.kernel.g.RP().eJN);
    }
    Object localObject = cYz().uoU;
    AppMethodBeat.o(7002);
    return localObject;
  }

  public static g cYz()
  {
    AppMethodBeat.i(6992);
    g localg = (g)q.Y(g.class);
    AppMethodBeat.o(6992);
    return localg;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(7004);
    ab.i("MicroMsg.SubCoreTools", "onAccountPostReset hc:%d", new Object[] { Integer.valueOf(hashCode()) });
    this.upb.dnU();
    com.tencent.mm.sdk.b.a.xxA.c(this.upg);
    com.tencent.mm.sdk.b.a.xxA.c(this.upi);
    com.tencent.mm.sdk.b.a.xxA.c(this.upj);
    com.tencent.mm.sdk.b.a.xxA.c(this.upk);
    com.tencent.mm.sdk.b.a.xxA.c(this.upd);
    com.tencent.mm.sdk.b.a.xxA.c(this.upe);
    com.tencent.mm.sdk.b.a.xxA.c(this.upl);
    com.tencent.mm.sdk.b.a.xxA.c(this.fAP);
    com.tencent.mm.sdk.b.a.xxA.c(this.kBB);
    this.uph.dnU();
    this.upc.dnU();
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("hijackconfig", this.jCX, true);
    com.tencent.mm.kernel.g.RO().a(this.mwl);
    Object localObject1 = this.uoZ;
    Object localObject2 = r.a.cYq();
    com.tencent.mm.sdk.b.a.xxA.c(((r)localObject2).uoc);
    com.tencent.mm.sdk.b.a.xxA.c(((r)localObject2).uod);
    com.tencent.mm.plugin.webview.modelcache.c.cYm();
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("webcache", ((com.tencent.mm.plugin.webview.modelcache.o)localObject1).unU, true);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.modelcache.o)localObject1).unV);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.modelcache.o)localObject1).unW);
    com.tencent.mm.plugin.w.c.qwS.a(new as());
    this.upf.dnU();
    j.c.a(new g.20(this));
    com.tencent.mm.cj.c.iw(ah.getContext());
    com.tencent.mm.kernel.g.RN();
    XWalkEnvironment.setGrayValueByUserId(com.tencent.mm.kernel.a.QF());
    if (com.tencent.mm.m.g.Nu() != null)
      XWalkEnvironment.setIpType(com.tencent.mm.m.g.Nu().getInt("WebKernelMode", -1));
    com.tencent.mm.plugin.webview.fts.f.cWo();
    com.tencent.mm.plugin.webview.fts.f.start();
    ab.d("MicroMsg.CityServiceHelper", "addCheckResUpdateListener");
    if (ab.getLogLevel() <= 0)
    {
      b.c.dif();
      com.tencent.mm.pluginsdk.g.a.a.b.Ky(54);
    }
    localObject2 = new b.1();
    com.tencent.mm.sdk.b.a.xxA.b((com.tencent.mm.sdk.b.c)localObject2);
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.webview.d.a.class, new com.tencent.mm.plugin.webview.ui.tools.bag.m());
    this.upa = new com.tencent.mm.plugin.webview.luggage.a();
    cYE().a(this.upa);
    s.ujG = new s.1();
    localObject2 = com.tencent.mm.plugin.webview.ui.tools.bag.l.uzq;
    localObject1 = s.ujG;
    if (localObject1 != null)
      ((com.tencent.mm.plugin.webview.ui.tools.bag.l)localObject2).uzv.add(localObject1);
    if (com.tencent.mm.plugin.webview.luggage.a.b.ukQ == null)
      com.tencent.mm.plugin.webview.luggage.a.b.ukQ = new com.tencent.mm.plugin.webview.luggage.a.b.1();
    com.tencent.mm.plugin.downloader.b.a.a(com.tencent.mm.plugin.webview.luggage.a.b.ukQ);
    AppMethodBeat.o(7004);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(7003);
    ab.i("MicroMsg.SubCoreTools", "onAccountRelease hc:%d", new Object[] { Integer.valueOf(hashCode()) });
    this.upb.dead();
    com.tencent.mm.sdk.b.a.xxA.d(this.upg);
    com.tencent.mm.sdk.b.a.xxA.d(this.upi);
    com.tencent.mm.sdk.b.a.xxA.d(this.upj);
    com.tencent.mm.sdk.b.a.xxA.d(this.upk);
    com.tencent.mm.sdk.b.a.xxA.d(this.upd);
    com.tencent.mm.sdk.b.a.xxA.d(this.upe);
    com.tencent.mm.sdk.b.a.xxA.d(this.upl);
    com.tencent.mm.sdk.b.a.xxA.d(this.fAP);
    com.tencent.mm.sdk.b.a.xxA.d(this.kBB);
    this.uph.dead();
    this.upc.dead();
    com.tencent.mm.kernel.g.RO().b(this.mwl);
    if (this.uoQ != null)
    {
      localObject1 = this.uoQ;
      if (((ai)localObject1).qVE != null)
      {
        d.bij();
        com.tencent.mm.plugin.downloader.model.b.b(((ai)localObject1).qVE);
      }
      if ((((ai)localObject1).umt != null) && (((ai)localObject1).umt.size() > 0))
      {
        localObject2 = ((ai)localObject1).umt.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (Long)((Iterator)localObject2).next();
          ab.i("MicroMsg.WebViewAutoDownloader", "remove download task : %d", new Object[] { localObject1 });
          d.bij().hl(((Long)localObject1).longValue());
        }
      }
    }
    if (this.uoX != null)
    {
      localObject1 = this.uoX;
      com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.webview.fts.b)localObject1).hAA);
      if (((com.tencent.mm.plugin.webview.fts.b)localObject1).ufk != null)
      {
        com.tencent.mm.kernel.g.Rg().b(1048, (com.tencent.mm.ai.f)localObject1);
        com.tencent.mm.kernel.g.Rg().c(((com.tencent.mm.plugin.webview.fts.b)localObject1).ufk);
        ((com.tencent.mm.plugin.webview.fts.b)localObject1).ufk = null;
      }
      this.uoX = null;
    }
    if (this.uoV != null)
    {
      localObject1 = this.uoV;
      ((com.tencent.mm.plugin.webview.fts.g)localObject1).ufU.dead();
      ((com.tencent.mm.plugin.webview.fts.g)localObject1).ugg.dead();
      localObject2 = ((com.tencent.mm.plugin.webview.fts.g)localObject1).ugi;
      if (((g.a)localObject2).ufZ != null)
        com.tencent.mm.kernel.g.Rg().c(((g.a)localObject2).ufZ);
      if (((g.a)localObject2).ugn != null)
        ((g.a)localObject2).ugn.jxQ = true;
      localObject2 = ((com.tencent.mm.plugin.webview.fts.g)localObject1).ugj;
      if (((g.b)localObject2).ugp != null)
        com.tencent.mm.kernel.g.Rg().b(((g.b)localObject2).ugp.getType(), ((g.b)localObject2).ugk);
      if (((com.tencent.mm.plugin.webview.fts.g)localObject1).mEx != null)
      {
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(((com.tencent.mm.plugin.webview.fts.g)localObject1).mEx);
        ((com.tencent.mm.plugin.webview.fts.g)localObject1).mEx = null;
      }
      this.uoV = null;
    }
    if (this.uoW != null)
    {
      localObject1 = this.uoW;
      ((com.tencent.mm.plugin.webview.fts.a)localObject1).qGl.dead();
      ((com.tencent.mm.plugin.webview.fts.a)localObject1).ufe.dead();
      com.tencent.mm.ah.o.act().d((k.a)localObject1);
      this.uoW = null;
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("hijackconfig", this.jCX, true);
    if (this.uoS != null)
      this.uoS.cXu();
    Object localObject1 = this.uoZ;
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("webcache", ((com.tencent.mm.plugin.webview.modelcache.o)localObject1).unU, true);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.webview.modelcache.o)localObject1).unV);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.webview.modelcache.o)localObject1).unW);
    localObject1 = r.a.cYq();
    com.tencent.mm.sdk.b.a.xxA.d(((r)localObject1).uoc);
    com.tencent.mm.sdk.b.a.xxA.d(((r)localObject1).uod);
    ((r)localObject1).release(true);
    this.upf.dead();
    localObject1 = com.tencent.mm.plugin.webview.fts.f.cWo();
    Object localObject2 = ((com.tencent.mm.plugin.webview.fts.f)localObject1).ufN;
    if (((f.a)localObject2).ufZ != null)
      com.tencent.mm.kernel.g.Rg().c(((f.a)localObject2).ufZ);
    if (((f.a)localObject2).uga != null)
      ((f.a)localObject2).uga.jxQ = true;
    ((com.tencent.mm.plugin.webview.fts.f)localObject1).ufU.dead();
    com.tencent.mm.kernel.g.L(com.tencent.mm.plugin.webview.d.a.class);
    cYE().b(this.upa);
    localObject2 = com.tencent.mm.plugin.webview.ui.tools.bag.l.uzq;
    localObject1 = s.ujG;
    if (localObject1 != null)
      ((com.tencent.mm.plugin.webview.ui.tools.bag.l)localObject2).uzv.remove(localObject1);
    com.tencent.mm.plugin.downloader.b.a.b(com.tencent.mm.plugin.webview.luggage.a.b.ukQ);
    com.tencent.mm.plugin.webview.luggage.a.b.ukQ = null;
    AppMethodBeat.o(7003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.g
 * JD-Core Version:    0.6.2
 */