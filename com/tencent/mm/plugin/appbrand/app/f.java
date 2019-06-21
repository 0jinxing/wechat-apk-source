package com.tencent.mm.plugin.appbrand.app;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.bw;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.jd;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.g.a.jz;
import com.tencent.mm.g.a.k;
import com.tencent.mm.g.a.l;
import com.tencent.mm.g.a.nk;
import com.tencent.mm.g.a.o;
import com.tencent.mm.g.a.tz;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.network.n.a;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.platformtools.t.a;
import com.tencent.mm.plugin.appbrand.appcache.am;
import com.tencent.mm.plugin.appbrand.appcache.av;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.az;
import com.tencent.mm.plugin.appbrand.appcache.ba;
import com.tencent.mm.plugin.appbrand.appusage.r.b;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.appusage.v.a;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.launching.z;
import com.tencent.mm.plugin.appbrand.o.c.a;
import com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.a;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public final class f
  implements at
{
  private static com.tencent.mm.plugin.appbrand.c.b gRA;
  private static volatile com.tencent.mm.plugin.appbrand.appstorage.b gRj;
  private static volatile com.tencent.mm.plugin.appbrand.config.c gRk;
  private static volatile ax gRl;
  private static volatile w gRm;
  private static volatile q gRn;
  private static volatile z gRo;
  private static volatile com.tencent.mm.plugin.appbrand.widget.f gRp;
  private static volatile com.tencent.mm.plugin.appbrand.widget.i gRq;
  private static volatile t.a gRr;
  private static volatile com.tencent.mm.plugin.appbrand.widget.m gRs;
  private static volatile com.tencent.mm.af.a.c gRt;
  private static volatile com.tencent.mm.plugin.appbrand.q.a gRu;
  private static volatile com.tencent.mm.plugin.appbrand.appcache.ab gRv;
  private static volatile com.tencent.mm.plugin.appbrand.game.b.a.c gRw;
  private static volatile am gRx;
  private static volatile ba gRy;
  private static com.tencent.mm.plugin.appbrand.c.c gRz;
  private k.a foI;
  private final com.tencent.mm.network.n fyJ;
  private be.a gRB;
  private com.tencent.mm.vending.b.b gRC;
  private final com.tencent.mm.plugin.auth.a.a gRD;
  private final Set<com.tencent.mm.sdk.b.c> gRE;
  private final com.tencent.mm.sdk.b.c<jl> gRF;
  private final com.tencent.mm.sdk.b.c<tz> gRG;
  private final com.tencent.mm.sdk.b.c<jz> gRH;
  private final com.tencent.mm.sdk.b.c<nk> gRI;
  private final com.tencent.mm.sdk.b.c<l> gRJ;
  private final com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.p> gRK;
  private final com.tencent.mm.sdk.b.c<o> gRL;
  private final com.tencent.mm.sdk.b.c<k> gRM;
  private final com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.n> gRN;
  private final com.tencent.mm.sdk.b.c<bw> gRO;
  private final com.tencent.mm.sdk.b.c<jd> gRP;
  private final bz.a gRQ;
  private com.tencent.mm.sdk.b.c gRR;
  private com.tencent.mm.sdk.b.c gRS;
  private com.tencent.mm.sdk.b.c gRT;
  private final com.tencent.mm.sdk.b.c<k> gRU;
  private k.a gRV;
  private final AppBrandGuideUI.a gRW;

  public f()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 103	java/lang/Object:<init>	()V
    //   4: ldc 104
    //   6: invokestatic 110	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: new 112	com/tencent/mm/plugin/appbrand/p/a
    //   13: dup
    //   14: invokespecial 113	com/tencent/mm/plugin/appbrand/p/a:<init>	()V
    //   17: putfield 115	com/tencent/mm/plugin/appbrand/app/f:gRB	Lcom/tencent/mm/storage/be$a;
    //   20: aload_0
    //   21: aconst_null
    //   22: putfield 117	com/tencent/mm/plugin/appbrand/app/f:gRC	Lcom/tencent/mm/vending/b/b;
    //   25: aload_0
    //   26: new 119	com/tencent/mm/plugin/appbrand/app/f$11
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 122	com/tencent/mm/plugin/appbrand/app/f$11:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   34: putfield 124	com/tencent/mm/plugin/appbrand/app/f:gRD	Lcom/tencent/mm/plugin/auth/a/a;
    //   37: aload_0
    //   38: new 126	com/tencent/mm/plugin/appbrand/app/f$13
    //   41: dup
    //   42: aload_0
    //   43: invokespecial 127	com/tencent/mm/plugin/appbrand/app/f$13:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   46: putfield 129	com/tencent/mm/plugin/appbrand/app/f:gRF	Lcom/tencent/mm/sdk/b/c;
    //   49: aload_0
    //   50: new 8	com/tencent/mm/plugin/appbrand/app/f$14
    //   53: dup
    //   54: aload_0
    //   55: invokespecial 130	com/tencent/mm/plugin/appbrand/app/f$14:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   58: putfield 132	com/tencent/mm/plugin/appbrand/app/f:gRG	Lcom/tencent/mm/sdk/b/c;
    //   61: aload_0
    //   62: new 134	com/tencent/mm/plugin/appbrand/app/f$15
    //   65: dup
    //   66: aload_0
    //   67: invokespecial 135	com/tencent/mm/plugin/appbrand/app/f$15:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   70: putfield 137	com/tencent/mm/plugin/appbrand/app/f:gRH	Lcom/tencent/mm/sdk/b/c;
    //   73: aload_0
    //   74: new 139	com/tencent/mm/plugin/appbrand/app/f$16
    //   77: dup
    //   78: aload_0
    //   79: invokespecial 140	com/tencent/mm/plugin/appbrand/app/f$16:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   82: putfield 142	com/tencent/mm/plugin/appbrand/app/f:gRI	Lcom/tencent/mm/sdk/b/c;
    //   85: aload_0
    //   86: new 144	com/tencent/mm/plugin/appbrand/app/f$17
    //   89: dup
    //   90: aload_0
    //   91: invokespecial 145	com/tencent/mm/plugin/appbrand/app/f$17:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   94: putfield 147	com/tencent/mm/plugin/appbrand/app/f:gRJ	Lcom/tencent/mm/sdk/b/c;
    //   97: aload_0
    //   98: new 149	com/tencent/mm/plugin/appbrand/app/f$18
    //   101: dup
    //   102: aload_0
    //   103: invokespecial 150	com/tencent/mm/plugin/appbrand/app/f$18:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   106: putfield 152	com/tencent/mm/plugin/appbrand/app/f:gRK	Lcom/tencent/mm/sdk/b/c;
    //   109: aload_0
    //   110: new 154	com/tencent/mm/plugin/appbrand/app/f$19
    //   113: dup
    //   114: aload_0
    //   115: invokespecial 155	com/tencent/mm/plugin/appbrand/app/f$19:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   118: putfield 157	com/tencent/mm/plugin/appbrand/app/f:gRL	Lcom/tencent/mm/sdk/b/c;
    //   121: aload_0
    //   122: new 159	com/tencent/mm/plugin/appbrand/app/f$20
    //   125: dup
    //   126: aload_0
    //   127: invokespecial 160	com/tencent/mm/plugin/appbrand/app/f$20:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   130: putfield 162	com/tencent/mm/plugin/appbrand/app/f:gRM	Lcom/tencent/mm/sdk/b/c;
    //   133: aload_0
    //   134: new 164	com/tencent/mm/plugin/appbrand/app/f$21
    //   137: dup
    //   138: aload_0
    //   139: invokespecial 165	com/tencent/mm/plugin/appbrand/app/f$21:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   142: putfield 167	com/tencent/mm/plugin/appbrand/app/f:gRN	Lcom/tencent/mm/sdk/b/c;
    //   145: aload_0
    //   146: new 169	com/tencent/mm/plugin/appbrand/app/f$22
    //   149: dup
    //   150: aload_0
    //   151: invokespecial 170	com/tencent/mm/plugin/appbrand/app/f$22:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   154: putfield 172	com/tencent/mm/plugin/appbrand/app/f:gRO	Lcom/tencent/mm/sdk/b/c;
    //   157: aload_0
    //   158: new 10	com/tencent/mm/plugin/appbrand/app/f$24
    //   161: dup
    //   162: aload_0
    //   163: invokespecial 173	com/tencent/mm/plugin/appbrand/app/f$24:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   166: putfield 175	com/tencent/mm/plugin/appbrand/app/f:gRP	Lcom/tencent/mm/sdk/b/c;
    //   169: aload_0
    //   170: new 177	com/tencent/mm/plugin/appbrand/appcache/av
    //   173: dup
    //   174: invokespecial 178	com/tencent/mm/plugin/appbrand/appcache/av:<init>	()V
    //   177: putfield 180	com/tencent/mm/plugin/appbrand/app/f:gRQ	Lcom/tencent/mm/model/bz$a;
    //   180: aload_0
    //   181: new 12	com/tencent/mm/plugin/appbrand/app/f$25
    //   184: dup
    //   185: aload_0
    //   186: invokespecial 181	com/tencent/mm/plugin/appbrand/app/f$25:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   189: putfield 183	com/tencent/mm/plugin/appbrand/app/f:fyJ	Lcom/tencent/mm/network/n;
    //   192: aload_0
    //   193: new 14	com/tencent/mm/plugin/appbrand/app/f$26
    //   196: dup
    //   197: aload_0
    //   198: invokespecial 184	com/tencent/mm/plugin/appbrand/app/f$26:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   201: putfield 186	com/tencent/mm/plugin/appbrand/app/f:gRR	Lcom/tencent/mm/sdk/b/c;
    //   204: aload_0
    //   205: new 16	com/tencent/mm/plugin/appbrand/app/f$27
    //   208: dup
    //   209: aload_0
    //   210: invokespecial 187	com/tencent/mm/plugin/appbrand/app/f$27:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   213: putfield 189	com/tencent/mm/plugin/appbrand/app/f:gRS	Lcom/tencent/mm/sdk/b/c;
    //   216: aload_0
    //   217: new 191	com/tencent/mm/plugin/appbrand/app/f$28
    //   220: dup
    //   221: aload_0
    //   222: invokespecial 192	com/tencent/mm/plugin/appbrand/app/f$28:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   225: putfield 194	com/tencent/mm/plugin/appbrand/app/f:gRT	Lcom/tencent/mm/sdk/b/c;
    //   228: aload_0
    //   229: new 196	com/tencent/mm/plugin/appbrand/app/f$29
    //   232: dup
    //   233: aload_0
    //   234: invokespecial 197	com/tencent/mm/plugin/appbrand/app/f$29:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   237: putfield 199	com/tencent/mm/plugin/appbrand/app/f:gRU	Lcom/tencent/mm/sdk/b/c;
    //   240: aload_0
    //   241: new 201	com/tencent/mm/plugin/appbrand/app/f$30
    //   244: dup
    //   245: aload_0
    //   246: invokespecial 202	com/tencent/mm/plugin/appbrand/app/f$30:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   249: putfield 204	com/tencent/mm/plugin/appbrand/app/f:gRV	Lcom/tencent/mm/sdk/e/k$a;
    //   252: aload_0
    //   253: new 206	com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$a
    //   256: dup
    //   257: invokespecial 207	com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$a:<init>	()V
    //   260: putfield 209	com/tencent/mm/plugin/appbrand/app/f:gRW	Lcom/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$a;
    //   263: aload_0
    //   264: new 211	com/tencent/mm/plugin/appbrand/app/f$31
    //   267: dup
    //   268: aload_0
    //   269: invokespecial 212	com/tencent/mm/plugin/appbrand/app/f$31:<init>	(Lcom/tencent/mm/plugin/appbrand/app/f;)V
    //   272: putfield 214	com/tencent/mm/plugin/appbrand/app/f:foI	Lcom/tencent/mm/sdk/e/k$a;
    //   275: aload_0
    //   276: new 216	java/util/HashSet
    //   279: dup
    //   280: invokespecial 217	java/util/HashSet:<init>	()V
    //   283: putfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   286: aload_0
    //   287: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   290: aload_0
    //   291: getfield 162	com/tencent/mm/plugin/appbrand/app/f:gRM	Lcom/tencent/mm/sdk/b/c;
    //   294: invokeinterface 225 2 0
    //   299: pop
    //   300: aload_0
    //   301: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   304: new 227	com/tencent/mm/plugin/appbrand/launching/a
    //   307: dup
    //   308: invokespecial 228	com/tencent/mm/plugin/appbrand/launching/a:<init>	()V
    //   311: invokeinterface 225 2 0
    //   316: pop
    //   317: aload_0
    //   318: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   321: aload_0
    //   322: getfield 167	com/tencent/mm/plugin/appbrand/app/f:gRN	Lcom/tencent/mm/sdk/b/c;
    //   325: invokeinterface 225 2 0
    //   330: pop
    //   331: aload_0
    //   332: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   335: aload_0
    //   336: getfield 137	com/tencent/mm/plugin/appbrand/app/f:gRH	Lcom/tencent/mm/sdk/b/c;
    //   339: invokeinterface 225 2 0
    //   344: pop
    //   345: aload_0
    //   346: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   349: aload_0
    //   350: getfield 142	com/tencent/mm/plugin/appbrand/app/f:gRI	Lcom/tencent/mm/sdk/b/c;
    //   353: invokeinterface 225 2 0
    //   358: pop
    //   359: aload_0
    //   360: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   363: aload_0
    //   364: getfield 132	com/tencent/mm/plugin/appbrand/app/f:gRG	Lcom/tencent/mm/sdk/b/c;
    //   367: invokeinterface 225 2 0
    //   372: pop
    //   373: aload_0
    //   374: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   377: new 230	com/tencent/mm/plugin/appbrand/config/e
    //   380: dup
    //   381: invokespecial 231	com/tencent/mm/plugin/appbrand/config/e:<init>	()V
    //   384: invokeinterface 225 2 0
    //   389: pop
    //   390: aload_0
    //   391: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   394: aload_0
    //   395: getfield 129	com/tencent/mm/plugin/appbrand/app/f:gRF	Lcom/tencent/mm/sdk/b/c;
    //   398: invokeinterface 225 2 0
    //   403: pop
    //   404: aload_0
    //   405: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   408: getstatic 236	com/tencent/mm/plugin/appbrand/appusage/i:gZa	Lcom/tencent/mm/sdk/b/c;
    //   411: invokeinterface 225 2 0
    //   416: pop
    //   417: aload_0
    //   418: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   421: aload_0
    //   422: getfield 147	com/tencent/mm/plugin/appbrand/app/f:gRJ	Lcom/tencent/mm/sdk/b/c;
    //   425: invokeinterface 225 2 0
    //   430: pop
    //   431: aload_0
    //   432: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   435: aload_0
    //   436: getfield 152	com/tencent/mm/plugin/appbrand/app/f:gRK	Lcom/tencent/mm/sdk/b/c;
    //   439: invokeinterface 225 2 0
    //   444: pop
    //   445: aload_0
    //   446: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   449: aload_0
    //   450: getfield 157	com/tencent/mm/plugin/appbrand/app/f:gRL	Lcom/tencent/mm/sdk/b/c;
    //   453: invokeinterface 225 2 0
    //   458: pop
    //   459: aload_0
    //   460: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   463: aload_0
    //   464: getfield 186	com/tencent/mm/plugin/appbrand/app/f:gRR	Lcom/tencent/mm/sdk/b/c;
    //   467: invokeinterface 225 2 0
    //   472: pop
    //   473: aload_0
    //   474: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   477: aload_0
    //   478: getfield 172	com/tencent/mm/plugin/appbrand/app/f:gRO	Lcom/tencent/mm/sdk/b/c;
    //   481: invokeinterface 225 2 0
    //   486: pop
    //   487: aload_0
    //   488: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   491: aload_0
    //   492: getfield 175	com/tencent/mm/plugin/appbrand/app/f:gRP	Lcom/tencent/mm/sdk/b/c;
    //   495: invokeinterface 225 2 0
    //   500: pop
    //   501: aload_0
    //   502: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   505: aload_0
    //   506: getfield 189	com/tencent/mm/plugin/appbrand/app/f:gRS	Lcom/tencent/mm/sdk/b/c;
    //   509: invokeinterface 225 2 0
    //   514: pop
    //   515: aload_0
    //   516: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   519: aload_0
    //   520: getfield 194	com/tencent/mm/plugin/appbrand/app/f:gRT	Lcom/tencent/mm/sdk/b/c;
    //   523: invokeinterface 225 2 0
    //   528: pop
    //   529: aload_0
    //   530: getfield 219	com/tencent/mm/plugin/appbrand/app/f:gRE	Ljava/util/Set;
    //   533: aload_0
    //   534: getfield 199	com/tencent/mm/plugin/appbrand/app/f:gRU	Lcom/tencent/mm/sdk/b/c;
    //   537: invokeinterface 225 2 0
    //   542: pop
    //   543: ldc 104
    //   545: invokestatic 239	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   548: return
  }

  public static <T> T E(Class<T> paramClass)
  {
    AppMethodBeat.i(129297);
    if (paramClass == w.class)
    {
      paramClass = gRm;
      AppMethodBeat.o(129297);
    }
    while (true)
    {
      return paramClass;
      paramClass = a.E(paramClass);
      AppMethodBeat.o(129297);
    }
  }

  private HashMap<Integer, h.d> auJ()
  {
    AppMethodBeat.i(129285);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("AppKVStorageDBCreate".hashCode()), new f.1(this));
    localHashMap.put(Integer.valueOf("AppBrandWxaPkgStorageDBCreate".hashCode()), new f.12(this));
    localHashMap.put(Integer.valueOf("AppBrandCommonConfigStorageCreate".hashCode()), new f.23(this));
    localHashMap.put(Integer.valueOf("AppBrandLayoutStorageCreate".hashCode()), new f.32(this));
    localHashMap.put(Integer.valueOf("AppBrandStarAppStorageCreate".hashCode()), new f.33(this));
    localHashMap.put(Integer.valueOf("WxaAttributesTableCreate".hashCode()), new f.34(this));
    localHashMap.put(Integer.valueOf("LaunchWxaAppInfoCreate".hashCode()), new f.35(this));
    localHashMap.put(Integer.valueOf("DynamicMsgCacheDataCreate".hashCode()), new f.36(this));
    localHashMap.put(Integer.valueOf("LaunchWxaWidgetCacheCreate".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return new String[] { com.tencent.mm.plugin.appbrand.widget.i.ihX };
      }
    });
    localHashMap.put(Integer.valueOf("WxaWidgetInfoStorageCreate".hashCode()), new f.2(this));
    localHashMap.put(Integer.valueOf("WxaUpdateableMsgStorageCreate".hashCode()), new f.3(this));
    localHashMap.put(Integer.valueOf("AppBrandCommonKVBinaryDataStorage".hashCode()), new f.4(this));
    localHashMap.put(Integer.valueOf("PkgUpdateStatsStorage".hashCode()), new f.5(this));
    localHashMap.put(Integer.valueOf("MiniGameInfoStorage".hashCode()), new f.6(this));
    localHashMap.put(Integer.valueOf("AppBrandRecommendCardStorage".hashCode()), new f.7(this));
    Iterator localIterator = a.gQL.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String[] arrayOfString = (String[])localEntry.getValue();
      localHashMap.put(Integer.valueOf(((a.a)localEntry.getKey()).hashCode()), new f.8(this, arrayOfString));
    }
    AppMethodBeat.o(129285);
    return localHashMap;
  }

  public static t.a auK()
  {
    return gRr;
  }

  public static f auL()
  {
    AppMethodBeat.i(129286);
    Object localObject = (com.tencent.mm.plugin.appbrand.a.c)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.appbrand.a.c.class);
    if (localObject != null);
    for (localObject = ((PluginAppBrand)localObject).getCore(); ; localObject = null)
    {
      AppMethodBeat.o(129286);
      return localObject;
    }
  }

  public static AppBrandGuideUI.a auN()
  {
    AppMethodBeat.i(129291);
    AppBrandGuideUI.a locala;
    if (auL() == null)
    {
      locala = null;
      AppMethodBeat.o(129291);
    }
    while (true)
    {
      return locala;
      locala = auL().gRW;
      AppMethodBeat.o(129291);
    }
  }

  public static q auO()
  {
    AppMethodBeat.i(129292);
    try
    {
      if (((gRn == null) || (!gRn.ayG())) && (gRr != null) && (!gRr.dpU()))
      {
        localq = new com/tencent/mm/plugin/appbrand/config/q;
        localq.<init>(gRr);
        gRn = localq;
      }
      q localq = gRn;
      AppMethodBeat.o(129292);
      return localq;
    }
    finally
    {
      AppMethodBeat.o(129292);
    }
  }

  public static z auP()
  {
    return gRo;
  }

  public static com.tencent.mm.plugin.appbrand.widget.i auQ()
  {
    return gRq;
  }

  public static com.tencent.mm.plugin.appbrand.widget.m auR()
  {
    return gRs;
  }

  public static com.tencent.mm.af.a.c auS()
  {
    return gRt;
  }

  public static w auT()
  {
    return gRm;
  }

  @Deprecated
  public static s auU()
  {
    AppMethodBeat.i(129294);
    s locals = (s)E(s.class);
    AppMethodBeat.o(129294);
    return locals;
  }

  public static ax auV()
  {
    return gRl;
  }

  public static com.tencent.mm.plugin.appbrand.widget.f auW()
  {
    return gRp;
  }

  public static com.tencent.mm.plugin.appbrand.c.c auX()
  {
    AppMethodBeat.i(129295);
    if (gRz == null)
      gRz = new com.tencent.mm.plugin.appbrand.c.c();
    com.tencent.mm.plugin.appbrand.c.c localc = gRz;
    AppMethodBeat.o(129295);
    return localc;
  }

  public static com.tencent.mm.plugin.appbrand.c.b auY()
  {
    AppMethodBeat.i(129296);
    if (gRA == null)
      gRA = new com.tencent.mm.plugin.appbrand.c.b();
    com.tencent.mm.plugin.appbrand.c.b localb = gRA;
    AppMethodBeat.o(129296);
    return localb;
  }

  public static com.tencent.mm.plugin.appbrand.q.a auZ()
  {
    return gRu;
  }

  public static com.tencent.mm.plugin.appbrand.appcache.ab ava()
  {
    return gRv;
  }

  public static com.tencent.mm.plugin.appbrand.game.b.a.c avb()
  {
    return gRw;
  }

  public static am avc()
  {
    return gRx;
  }

  public static ba avd()
  {
    return gRy;
  }

  public static com.tencent.mm.plugin.appbrand.backgroundfetch.d ave()
  {
    AppMethodBeat.i(129298);
    com.tencent.mm.plugin.appbrand.backgroundfetch.d locald = (com.tencent.mm.plugin.appbrand.backgroundfetch.d)E(com.tencent.mm.plugin.appbrand.backgroundfetch.d.class);
    AppMethodBeat.o(129298);
    return locald;
  }

  public static com.tencent.mm.plugin.appbrand.appstorage.b xG()
  {
    return gRj;
  }

  public static com.tencent.mm.plugin.appbrand.config.c xH()
  {
    AppMethodBeat.i(129293);
    if ((gRk == null) && (gRr != null) && (!gRr.dpU()))
      gRk = new com.tencent.mm.plugin.appbrand.config.c(gRr);
    com.tencent.mm.plugin.appbrand.config.c localc = gRk;
    AppMethodBeat.o(129293);
    return localc;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final t.a auM()
  {
    AppMethodBeat.i(129287);
    Object localObject = com.tencent.mm.kernel.g.RP().cachePath + "AppBrandComm.db";
    if ((gRr != null) && (((String)localObject).equals(gRr.getPath())))
    {
      localObject = gRr;
      AppMethodBeat.o(129287);
    }
    while (true)
    {
      return localObject;
      localObject = t.a(hashCode(), (String)localObject, auJ(), true);
      gRr = (t.a)localObject;
      AppMethodBeat.o(129287);
    }
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(129288);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SubCoreAppBrand", "onAccountPostReset updated %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.gRC = ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(this.gRD);
    Object localObject1 = ah.getContext().getSharedPreferences("app_brand_global_sp", 0);
    if (localObject1 != null)
    {
      localObject2 = ((SharedPreferences)localObject1).getStringSet("uin_set", new HashSet());
      if (localObject2 != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        com.tencent.mm.kernel.g.RN();
        if (((Set)localObject2).add(com.tencent.mm.kernel.a.QF()))
        {
          localObject1 = ((SharedPreferences)localObject1).edit();
          ((SharedPreferences.Editor)localObject1).remove("uin_set");
          ((SharedPreferences.Editor)localObject1).commit();
          ((SharedPreferences.Editor)localObject1).putStringSet("uin_set", (Set)localObject2);
          ((SharedPreferences.Editor)localObject1).commit();
        }
      }
    }
    Object localObject2 = this.gRE.iterator();
    while (((Iterator)localObject2).hasNext())
      ((com.tencent.mm.sdk.b.c)((Iterator)localObject2).next()).dnU();
    localObject2 = av.gUU.keySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a((String)localObject1, this.gRQ, true);
    }
    r.b.axy();
    v.a.axy();
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().c(this.gRB);
    auM();
    gRj = new com.tencent.mm.plugin.appbrand.appstorage.b(gRr);
    gRk = new com.tencent.mm.plugin.appbrand.config.c(gRr);
    gRl = new ax(gRr);
    gRm = new w(gRr);
    gRo = new z(gRr);
    gRp = new com.tencent.mm.plugin.appbrand.widget.f(gRr);
    gRq = new com.tencent.mm.plugin.appbrand.widget.i(gRr);
    gRs = new com.tencent.mm.plugin.appbrand.widget.m(gRr);
    gRt = new com.tencent.mm.af.a.c(gRr);
    gRu = new com.tencent.mm.plugin.appbrand.q.a(gRr);
    gRv = new com.tencent.mm.plugin.appbrand.appcache.ab(gRr);
    gRw = new com.tencent.mm.plugin.appbrand.game.b.a.c(gRr);
    gRx = new am();
    gRy = new ba();
    auO();
    a.a(gRr);
    com.tencent.mm.plugin.appbrand.h.setup();
    com.tencent.mm.plugin.appbrand.config.p.ayH();
    c.a.iDD.prepare();
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).getFTSTaskDaemon().a(-86016, new f.9(this));
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).getFTSTaskDaemon().a(-86016, new f.10(this));
    com.tencent.mm.kernel.g.RO().a(this.fyJ);
    com.tencent.mm.plugin.appbrand.dynamic.g.initialize();
    com.tencent.mm.model.c.c.abi().c(this.foI);
    if (auU() != null)
      auU().c(this.gRV);
    com.tencent.mm.plugin.appbrand.config.f.init();
    localObject2 = this.gRW;
    AppBrandGuideUI.a.aMe().registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
    AppBrandStickyBannerLogic.b.d((com.tencent.mm.plugin.appbrand.ui.banner.f)localObject2);
    ((AppBrandGuideUI.a)localObject2).iGD = false;
    AppMethodBeat.o(129288);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(129289);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SubCoreAppBrand", "onAccountRelease");
    if (this.gRC != null)
    {
      this.gRC.dead();
      this.gRC = null;
    }
    Object localObject = this.gRE.iterator();
    while (((Iterator)localObject).hasNext())
      ((com.tencent.mm.sdk.b.c)((Iterator)localObject).next()).dead();
    com.tencent.mm.plugin.appbrand.h.release();
    Iterator localIterator = av.gUU.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b((String)localObject, this.gRQ, true);
    }
    r.b.unregister();
    v.a.unregister();
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().d(this.gRB);
    az.shutdown();
    gRj = null;
    gRn = null;
    gRk = null;
    gRl = null;
    gRm = null;
    gRo = null;
    gRp = null;
    gRq = null;
    gRs = null;
    gRt = null;
    gRu = null;
    gRv = null;
    gRw = null;
    gRx = null;
    gRy = null;
    a.auD();
    if (gRA != null)
    {
      localObject = gRA;
      ((com.tencent.mm.plugin.appbrand.c.b)localObject).heu.clear();
      ((com.tencent.mm.plugin.appbrand.c.b)localObject).hev.clear();
      gRA = null;
    }
    gRz = null;
    if (gRr != null)
    {
      gRr.mJ(hashCode());
      gRr = null;
    }
    com.tencent.mm.plugin.appbrand.appusage.j.release();
    com.tencent.mm.plugin.appbrand.config.p.release();
    com.tencent.mm.plugin.appbrand.appcache.b.b.i.gWd.cleanup();
    localObject = c.a.iDD;
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WxaFTSSearchCore", "reset");
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.appbrand.o.c)localObject).iDz);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.appbrand.o.c)localObject).iDA);
    ((com.tencent.mm.plugin.appbrand.o.c)localObject).iDB.dead();
    com.tencent.mm.plugin.appbrand.s.e.aNR();
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).unregisterIndexStorage(512);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).unregisterNativeLogic(7);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).unregisterFTSUILogic(144);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).unregisterFTSUILogic(4224);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).unregisterIndexStorage(8);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).unregisterNativeLogic(10);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).unregisterFTSUILogic(208);
    ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).unregisterFTSUILogic(4240);
    com.tencent.mm.kernel.g.RO().b(this.fyJ);
    com.tencent.mm.plugin.appbrand.dynamic.g.release();
    com.tencent.mm.model.c.c.abi().d(this.foI);
    com.tencent.mm.plugin.appbrand.config.f.release();
    localObject = this.gRW;
    AppBrandGuideUI.a.aMe().unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject);
    AppBrandStickyBannerLogic.b.c((com.tencent.mm.plugin.appbrand.ui.banner.f)localObject);
    ((AppBrandGuideUI.a)localObject).iGD = false;
    AppMethodBeat.o(129289);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.f
 * JD-Core Version:    0.6.2
 */