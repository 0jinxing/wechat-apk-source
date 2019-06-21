package com.tencent.mm.plugin.fts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.bc;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.ak;
import com.tencent.mm.model.cc;
import com.tencent.mm.model.cc.a;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.jni.FTSJNIUtils;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

public class PluginFTS extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.c, n
{
  public static boolean mBA;
  private cc.a mBB;
  private com.tencent.mm.sdk.b.c mBC;
  private com.tencent.mm.sdk.b.c mBD;
  private com.tencent.mm.ai.f mBE;
  private com.tencent.mm.sdk.b.c mBF;
  private BroadcastReceiver mBG;
  private ConcurrentHashMap<Integer, com.tencent.mm.plugin.fts.a.i> mBH;
  private f mBI;
  private SparseArray<com.tencent.mm.plugin.fts.a.d.d> mBJ;
  private com.tencent.mm.plugin.fts.a.d.c mBK;
  private SparseArray<com.tencent.mm.plugin.fts.a.d.a.b> mBL;
  private SparseArray<k> mBM;
  private com.tencent.mm.sdk.b.c mBN;
  private volatile g mBr;
  private volatile d mBs;
  private volatile boolean mBt;
  private volatile boolean mBu;
  private boolean mBv;
  private boolean mBw;
  private boolean mBx;
  private Runnable mBy;
  private e mBz;

  public PluginFTS()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 62	com/tencent/mm/kernel/b/f:<init>	()V
    //   4: ldc 63
    //   6: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield 71	com/tencent/mm/plugin/fts/PluginFTS:mBt	Z
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 73	com/tencent/mm/plugin/fts/PluginFTS:mBu	Z
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield 75	com/tencent/mm/plugin/fts/PluginFTS:mBv	Z
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield 77	com/tencent/mm/plugin/fts/PluginFTS:mBw	Z
    //   29: aload_0
    //   30: new 79	com/tencent/mm/plugin/fts/PluginFTS$1
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 82	com/tencent/mm/plugin/fts/PluginFTS$1:<init>	(Lcom/tencent/mm/plugin/fts/PluginFTS;)V
    //   38: putfield 84	com/tencent/mm/plugin/fts/PluginFTS:mBy	Ljava/lang/Runnable;
    //   41: aload_0
    //   42: new 86	com/tencent/mm/plugin/fts/PluginFTS$3
    //   45: dup
    //   46: aload_0
    //   47: invokespecial 87	com/tencent/mm/plugin/fts/PluginFTS$3:<init>	(Lcom/tencent/mm/plugin/fts/PluginFTS;)V
    //   50: putfield 89	com/tencent/mm/plugin/fts/PluginFTS:mBz	Lcom/tencent/mm/plugin/fts/e;
    //   53: aload_0
    //   54: new 14	com/tencent/mm/plugin/fts/PluginFTS$4
    //   57: dup
    //   58: aload_0
    //   59: invokespecial 90	com/tencent/mm/plugin/fts/PluginFTS$4:<init>	(Lcom/tencent/mm/plugin/fts/PluginFTS;)V
    //   62: putfield 92	com/tencent/mm/plugin/fts/PluginFTS:mBB	Lcom/tencent/mm/model/cc$a;
    //   65: aload_0
    //   66: new 94	com/tencent/mm/plugin/fts/PluginFTS$5
    //   69: dup
    //   70: aload_0
    //   71: invokespecial 95	com/tencent/mm/plugin/fts/PluginFTS$5:<init>	(Lcom/tencent/mm/plugin/fts/PluginFTS;)V
    //   74: putfield 97	com/tencent/mm/plugin/fts/PluginFTS:mBC	Lcom/tencent/mm/sdk/b/c;
    //   77: aload_0
    //   78: new 99	com/tencent/mm/plugin/fts/PluginFTS$6
    //   81: dup
    //   82: aload_0
    //   83: invokespecial 100	com/tencent/mm/plugin/fts/PluginFTS$6:<init>	(Lcom/tencent/mm/plugin/fts/PluginFTS;)V
    //   86: putfield 102	com/tencent/mm/plugin/fts/PluginFTS:mBD	Lcom/tencent/mm/sdk/b/c;
    //   89: aload_0
    //   90: new 104	com/tencent/mm/plugin/fts/PluginFTS$7
    //   93: dup
    //   94: aload_0
    //   95: invokespecial 105	com/tencent/mm/plugin/fts/PluginFTS$7:<init>	(Lcom/tencent/mm/plugin/fts/PluginFTS;)V
    //   98: putfield 107	com/tencent/mm/plugin/fts/PluginFTS:mBE	Lcom/tencent/mm/ai/f;
    //   101: aload_0
    //   102: new 109	com/tencent/mm/plugin/fts/PluginFTS$8
    //   105: dup
    //   106: aload_0
    //   107: invokespecial 110	com/tencent/mm/plugin/fts/PluginFTS$8:<init>	(Lcom/tencent/mm/plugin/fts/PluginFTS;)V
    //   110: putfield 112	com/tencent/mm/plugin/fts/PluginFTS:mBF	Lcom/tencent/mm/sdk/b/c;
    //   113: aload_0
    //   114: new 114	com/tencent/mm/plugin/fts/PluginFTS$9
    //   117: dup
    //   118: aload_0
    //   119: invokespecial 115	com/tencent/mm/plugin/fts/PluginFTS$9:<init>	(Lcom/tencent/mm/plugin/fts/PluginFTS;)V
    //   122: putfield 117	com/tencent/mm/plugin/fts/PluginFTS:mBG	Landroid/content/BroadcastReceiver;
    //   125: aload_0
    //   126: new 119	java/util/concurrent/ConcurrentHashMap
    //   129: dup
    //   130: invokespecial 120	java/util/concurrent/ConcurrentHashMap:<init>	()V
    //   133: putfield 122	com/tencent/mm/plugin/fts/PluginFTS:mBH	Ljava/util/concurrent/ConcurrentHashMap;
    //   136: aload_0
    //   137: new 124	android/util/SparseArray
    //   140: dup
    //   141: invokespecial 125	android/util/SparseArray:<init>	()V
    //   144: putfield 127	com/tencent/mm/plugin/fts/PluginFTS:mBJ	Landroid/util/SparseArray;
    //   147: aload_0
    //   148: new 124	android/util/SparseArray
    //   151: dup
    //   152: invokespecial 125	android/util/SparseArray:<init>	()V
    //   155: putfield 129	com/tencent/mm/plugin/fts/PluginFTS:mBL	Landroid/util/SparseArray;
    //   158: aload_0
    //   159: new 124	android/util/SparseArray
    //   162: dup
    //   163: invokespecial 125	android/util/SparseArray:<init>	()V
    //   166: putfield 131	com/tencent/mm/plugin/fts/PluginFTS:mBM	Landroid/util/SparseArray;
    //   169: aload_0
    //   170: new 12	com/tencent/mm/plugin/fts/PluginFTS$2
    //   173: dup
    //   174: aload_0
    //   175: invokespecial 132	com/tencent/mm/plugin/fts/PluginFTS$2:<init>	(Lcom/tencent/mm/plugin/fts/PluginFTS;)V
    //   178: putfield 134	com/tencent/mm/plugin/fts/PluginFTS:mBN	Lcom/tencent/mm/sdk/b/c;
    //   181: ldc 63
    //   183: invokestatic 137	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: return
  }

  private void addCheckLanguageTask()
  {
    AppMethodBeat.i(136640);
    ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSTaskDaemon().a(65536, new PluginFTS.10(this));
    AppMethodBeat.o(136640);
  }

  private void createIndexStorage()
  {
    AppMethodBeat.i(136613);
    ab.i("MicroMsg.FTS.PluginFTS", "Create Index Storage");
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.mBH.values().iterator();
    while (localIterator.hasNext())
      localLinkedList.add((com.tencent.mm.plugin.fts.a.i)localIterator.next());
    Collections.sort(localLinkedList);
    for (int i = 0; i < localLinkedList.size(); i++)
      ((com.tencent.mm.plugin.fts.a.i)localLinkedList.get(i)).create();
    AppMethodBeat.o(136613);
  }

  private void createNativeLogic()
  {
    AppMethodBeat.i(136609);
    ab.i("MicroMsg.FTS.PluginFTS", "Create Native Logic");
    int i = 0;
    while (true)
      if (i < this.mBM.size())
      {
        int j = this.mBM.keyAt(i);
        k localk = (k)this.mBM.get(j);
        if (localk != null);
        try
        {
          localk.create();
          i++;
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", new Object[] { localk.getName(), bo.l(localException) });
        }
      }
    AppMethodBeat.o(136609);
  }

  private void destroyItemClickHandler()
  {
    AppMethodBeat.i(136612);
    this.mBL.clear();
    AppMethodBeat.o(136612);
  }

  private void destroyNativeLogic()
  {
    AppMethodBeat.i(136610);
    ab.i("MicroMsg.FTS.PluginFTS", "Destroy Native Logic");
    int i = 0;
    while (true)
      if (i < this.mBM.size())
      {
        int j = this.mBM.keyAt(i);
        k localk = (k)this.mBM.get(j);
        if (localk != null);
        try
        {
          localk.destroy();
          i++;
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", new Object[] { localk.getName(), bo.l(localException) });
        }
      }
    AppMethodBeat.o(136610);
  }

  private void destroyNativeUILogic()
  {
    AppMethodBeat.i(136611);
    this.mBJ.clear();
    AppMethodBeat.o(136611);
  }

  private void destroyStorage()
  {
    AppMethodBeat.i(136614);
    ab.i("MicroMsg.FTS.PluginFTS", "Destroy Index Storage");
    Iterator localIterator = this.mBH.values().iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fts.a.i locali = (com.tencent.mm.plugin.fts.a.i)localIterator.next();
      if (locali != null)
        locali.destroy();
    }
    AppMethodBeat.o(136614);
  }

  private void registerSearchLogic()
  {
    AppMethodBeat.i(136607);
    registerNativeLogic(1, new com.tencent.mm.plugin.fts.b.e());
    registerNativeLogic(2, new com.tencent.mm.plugin.fts.b.a());
    registerNativeLogic(3, new com.tencent.mm.plugin.fts.b.c());
    registerNativeLogic(4, new com.tencent.mm.plugin.fts.b.b());
    registerNativeLogic(8, new com.tencent.mm.plugin.fts.b.d());
    registerNativeLogic(10000, new com.tencent.mm.plugin.fts.b.g());
    AppMethodBeat.o(136607);
  }

  private void registerStorage()
  {
    AppMethodBeat.i(136608);
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.e());
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.a());
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.b());
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.c());
    registerIndexStorage(new com.tencent.mm.plugin.fts.c.d());
    AppMethodBeat.o(136608);
  }

  private void startDaemon()
  {
    AppMethodBeat.i(136616);
    if (!this.mBr.isStart())
    {
      g localg = this.mBr;
      localg.mBh.start();
      ab.i("MicroMsg.FTS.FTSTaskDaemon", "***** Search daemon started with TID: " + localg.mBh.getId());
    }
    AppMethodBeat.o(136616);
  }

  private void waitAndStartDaemon()
  {
    AppMethodBeat.i(136615);
    com.tencent.mm.kernel.g.RQ();
    boolean bool;
    if (bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(15, null)) != 0)
    {
      bool = true;
      this.mBt = bool;
      if (this.mBt)
        break label111;
      com.tencent.mm.kernel.g.Rg().a(138, this.mBE);
      ab.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for account initialized");
      label66: if (this.mBu)
        break label122;
      ab.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for all account post reset.");
    }
    while (true)
    {
      if ((this.mBt) && (this.mBu))
        startDaemon();
      AppMethodBeat.o(136615);
      return;
      bool = false;
      break;
      label111: ab.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon user is initialized.");
      break label66;
      label122: ab.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon all account post reset.");
    }
  }

  public void addSOSHistory(String paramString)
  {
    AppMethodBeat.i(136620);
    if ((isFTSContextReady()) && (this.mBM.indexOfKey(8) >= 0))
      ((k)this.mBM.get(8)).addSOSHistory(paramString);
    AppMethodBeat.o(136620);
  }

  public void cancelSearchTask(com.tencent.mm.plugin.fts.a.a.a parama)
  {
    AppMethodBeat.i(136618);
    if (isFTSContextReady())
    {
      Object localObject = this.mBr;
      if (((g)localObject).mBh != null)
      {
        localObject = ((g)localObject).mBh;
        parama.mCancelled = true;
        ((g.a)localObject).mBj.remove(parama);
        if (((g.a)localObject).mBl == parama)
          ((g.a)localObject).interrupt();
      }
    }
    AppMethodBeat.o(136618);
  }

  public com.tencent.mm.plugin.fts.a.d.e createFTSUIUnit(int paramInt1, Context paramContext, e.b paramb, int paramInt2)
  {
    AppMethodBeat.i(136631);
    com.tencent.mm.plugin.fts.a.d.d locald = (com.tencent.mm.plugin.fts.a.d.d)this.mBJ.get(paramInt1);
    if (locald != null)
    {
      paramContext = locald.a(paramContext, paramb, paramInt2);
      AppMethodBeat.o(136631);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(136631);
    }
  }

  public LinkedList<com.tencent.mm.plugin.fts.a.d.e> createFTSUIUnitList(HashSet<Integer> paramHashSet, Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(136630);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      paramHashSet = (com.tencent.mm.plugin.fts.a.d.d)this.mBJ.get(i);
      if (paramHashSet != null)
        localLinkedList2.add(paramHashSet);
    }
    Collections.sort(localLinkedList2);
    paramHashSet = localLinkedList2.iterator();
    while (paramHashSet.hasNext())
      localLinkedList1.add(((com.tencent.mm.plugin.fts.a.d.d)paramHashSet.next()).a(paramContext, paramb, paramInt));
    AppMethodBeat.o(136630);
    return localLinkedList1;
  }

  public void deleteSOSHistory()
  {
    AppMethodBeat.i(136621);
    if ((isFTSContextReady()) && (this.mBM.indexOfKey(8) >= 0))
      ((k)this.mBM.get(8)).deleteSOSHistory();
    AppMethodBeat.o(136621);
  }

  public void deleteSOSHistory(String paramString)
  {
    AppMethodBeat.i(136622);
    if ((isFTSContextReady()) && (this.mBM.indexOfKey(8) >= 0))
      ((k)this.mBM.get(8)).deleteSOSHistory(paramString);
    AppMethodBeat.o(136622);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(136603);
    if (paramg.SG())
      com.tencent.mm.kernel.g.a(ak.class, new com.tencent.mm.plugin.fts.b.f());
    AppMethodBeat.o(136603);
  }

  public com.tencent.mm.plugin.fts.a.d.c getFTSImageLoader()
  {
    return this.mBK;
  }

  public d getFTSIndexDB()
  {
    return this.mBs;
  }

  public com.tencent.mm.plugin.fts.a.i getFTSIndexStorage(int paramInt)
  {
    AppMethodBeat.i(136625);
    com.tencent.mm.plugin.fts.a.i locali = (com.tencent.mm.plugin.fts.a.i)this.mBH.get(Integer.valueOf(paramInt));
    AppMethodBeat.o(136625);
    return locali;
  }

  public j getFTSMainDB()
  {
    AppMethodBeat.i(136626);
    if (this.mBI == null)
      this.mBI = new f();
    f localf = this.mBI;
    AppMethodBeat.o(136626);
    return localf;
  }

  public m getFTSTaskDaemon()
  {
    AppMethodBeat.i(136605);
    initFTSTaskDaemon();
    g localg = this.mBr;
    AppMethodBeat.o(136605);
    return localg;
  }

  public com.tencent.mm.plugin.fts.a.d.a.b getItemClickHandler(int paramInt)
  {
    AppMethodBeat.i(136634);
    com.tencent.mm.plugin.fts.a.d.a.b localb = (com.tencent.mm.plugin.fts.a.d.a.b)this.mBL.get(paramInt);
    AppMethodBeat.o(136634);
    return localb;
  }

  public com.tencent.mm.plugin.fts.b.e getTopHitsLogic()
  {
    AppMethodBeat.i(136639);
    com.tencent.mm.plugin.fts.b.e locale = (com.tencent.mm.plugin.fts.b.e)this.mBM.get(1);
    AppMethodBeat.o(136639);
    return locale;
  }

  public void initFTSTaskDaemon()
  {
    AppMethodBeat.i(136604);
    g localg;
    if (this.mBr == null)
    {
      this.mBr = new g();
      localg = this.mBr;
      if ((localg.mBh == null) || (!localg.mBh.isAlive()))
        break label116;
      ab.printErrStackTrace("MicroMsg.FTS.FTSTaskDaemon", new Throwable(), "Duplicated daemon initialization detected, working queue maybe dirty!", new Object[0]);
    }
    while (true)
    {
      localg = this.mBr;
      Object localObject = this.mBy;
      if (localg.mBh != null)
        localg.mBh.mBn = ((Runnable)localObject);
      localg = this.mBr;
      localObject = this.mBz;
      localg.mBh.mBo = ((e)localObject);
      AppMethodBeat.o(136604);
      return;
      label116: localg.mBh = new g.a(localg);
      ab.i("MicroMsg.FTS.FTSTaskDaemon", "***** Search daemon initialized, waiting for starting.");
    }
  }

  public boolean isCharging()
  {
    return this.mBv;
  }

  public boolean isFTSContextReady()
  {
    AppMethodBeat.i(136637);
    boolean bool = getFTSTaskDaemon().isStart();
    AppMethodBeat.o(136637);
    return bool;
  }

  public boolean isFTSIndexReady()
  {
    return this.mBx;
  }

  public boolean isInBackground()
  {
    return this.mBw;
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(136601);
    paramc = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fts.a.c.mCx);
    if (!paramc.exists())
      paramc.mkdirs();
    if (this.mBr != null)
      this.mBr.quit();
    initFTSTaskDaemon();
    paramc = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    paramc = ah.getContext().registerReceiver(null, paramc);
    boolean bool;
    if (paramc != null)
    {
      int i = paramc.getIntExtra("status", -1);
      if ((i == 2) || (i == 5))
        bool = true;
    }
    for (this.mBv = bool; ; this.mBv = false)
    {
      paramc = new IntentFilter();
      paramc.addAction("android.intent.action.ACTION_POWER_CONNECTED");
      paramc.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
      ah.getContext().registerReceiver(this.mBG, paramc);
      com.tencent.mm.kernel.g.RR().a(this.mBB);
      this.mBD.dnU();
      this.mBF.dnU();
      this.mBC.dnU();
      this.mBN.dnU();
      com.tencent.mm.kernel.g.Rg().a(138, this.mBE);
      this.mBr.a(-131072, new PluginFTS.b(this, (byte)0));
      this.mBr.a(-131071, new PluginFTS.a(this, (byte)0));
      this.mBK = new c();
      addCheckLanguageTask();
      AppMethodBeat.o(136601);
      return;
      bool = false;
      break;
    }
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(136602);
    destroyNativeLogic();
    destroyNativeUILogic();
    destroyItemClickHandler();
    destroyStorage();
    if (this.mBr != null)
    {
      this.mBr.quit();
      this.mBr = null;
    }
    if (this.mBs != null)
    {
      this.mBs.close();
      this.mBs = null;
    }
    if (this.mBK != null)
    {
      this.mBK.bAa();
      this.mBK = null;
    }
    try
    {
      ah.getContext().unregisterReceiver(this.mBG);
      label91: this.mBD.dead();
      this.mBC.dead();
      this.mBN.dead();
      this.mBF.dead();
      com.tencent.mm.kernel.g.Rg().b(138, this.mBE);
      com.tencent.mm.kernel.g.RR().b(this.mBB);
      this.mBt = false;
      this.mBu = false;
      AppMethodBeat.o(136602);
      return;
    }
    catch (Exception localException)
    {
      break label91;
    }
  }

  public void parallelsDependency()
  {
    AppMethodBeat.i(136606);
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class));
    AppMethodBeat.o(136606);
  }

  public void registerFTSUILogic(com.tencent.mm.plugin.fts.a.d.d paramd)
  {
    AppMethodBeat.i(136628);
    try
    {
      this.mBJ.put(paramd.getType(), paramd);
      AppMethodBeat.o(136628);
      return;
    }
    catch (Exception paramd)
    {
      while (true)
        AppMethodBeat.o(136628);
    }
  }

  public void registerIndexStorage(com.tencent.mm.plugin.fts.a.i parami)
  {
    AppMethodBeat.i(136623);
    this.mBH.put(Integer.valueOf(parami.getType()), parami);
    AppMethodBeat.o(136623);
  }

  public void registerItemClickHandler(int paramInt, com.tencent.mm.plugin.fts.a.d.a.b paramb)
  {
    AppMethodBeat.i(136632);
    this.mBL.put(paramInt, paramb);
    AppMethodBeat.o(136632);
  }

  public void registerNativeLogic(int paramInt, k paramk)
  {
    AppMethodBeat.i(136635);
    this.mBM.put(paramInt, paramk);
    AppMethodBeat.o(136635);
  }

  public com.tencent.mm.plugin.fts.a.a.a search(int paramInt, com.tencent.mm.plugin.fts.a.a.i parami)
  {
    AppMethodBeat.i(136617);
    if (!isFTSContextReady())
    {
      parami = new b(-2, parami);
      com.tencent.mm.sdk.g.d.post(parami, "FTSExceptionHandler");
      AppMethodBeat.o(136617);
    }
    while (true)
    {
      return parami;
      if (!isFTSIndexReady())
      {
        parami = new b(-4, parami);
        com.tencent.mm.sdk.g.d.post(parami, "FTSExceptionHandler");
        AppMethodBeat.o(136617);
      }
      else if (this.mBM.indexOfKey(paramInt) >= 0)
      {
        k localk = (k)this.mBM.get(paramInt);
        if (localk.isCreated())
        {
          parami = localk.a(parami);
          AppMethodBeat.o(136617);
        }
        else
        {
          parami = new b(-2, parami);
          com.tencent.mm.sdk.g.d.post(parami, "FTSExceptionHandler");
          AppMethodBeat.o(136617);
        }
      }
      else
      {
        ab.e("MicroMsg.FTS.PluginFTS", "Not Found Search Logic, LogicArraySize=%d", new Object[] { Integer.valueOf(this.mBM.size()) });
        parami = new b(-2, parami);
        com.tencent.mm.sdk.g.d.post(parami, "FTSExceptionHandler");
        AppMethodBeat.o(136617);
      }
    }
  }

  public void setFTSImageLoader(com.tencent.mm.plugin.fts.a.d.c paramc)
  {
    this.mBK = paramc;
  }

  public void setFTSIndexReady(boolean paramBoolean)
  {
    AppMethodBeat.i(136638);
    ab.i("MicroMsg.FTS.PluginFTS", "setFTSIndexReady %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mBx = paramBoolean;
    AppMethodBeat.o(136638);
  }

  public int stringCompareUtfBinary(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136627);
    int i = FTSJNIUtils.stringCompareUtfBinary(paramString1, paramString2);
    AppMethodBeat.o(136627);
    return i;
  }

  public void unregisterFTSUILogic(int paramInt)
  {
    AppMethodBeat.i(136629);
    try
    {
      this.mBJ.remove(paramInt);
      AppMethodBeat.o(136629);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(136629);
    }
  }

  public void unregisterIndexStorage(int paramInt)
  {
    AppMethodBeat.i(136624);
    com.tencent.mm.plugin.fts.a.i locali;
    if (this.mBH.containsKey(Integer.valueOf(paramInt)))
      locali = (com.tencent.mm.plugin.fts.a.i)this.mBH.get(Integer.valueOf(paramInt));
    try
    {
      locali.destroy();
      this.mBH.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(136624);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.FTS.PluginFTS", "Destroy Index Storage name=%s \nexception=%s", new Object[] { locali.getName(), bo.l(localException) });
    }
  }

  public void unregisterItemClickHandler(int paramInt)
  {
    AppMethodBeat.i(136633);
    this.mBL.remove(paramInt);
    AppMethodBeat.o(136633);
  }

  public void unregisterNativeLogic(int paramInt)
  {
    AppMethodBeat.i(136636);
    k localk;
    if (this.mBM.indexOfKey(paramInt) >= 0)
      localk = (k)this.mBM.get(paramInt);
    try
    {
      localk.destroy();
      this.mBM.remove(paramInt);
      AppMethodBeat.o(136636);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.FTS.PluginFTS", "Destroy Native Logic name=%s \nexception=%s", new Object[] { localk.getName(), bo.l(localException) });
    }
  }

  public void updateTopHitsRank(String paramString, l paraml, int paramInt)
  {
    AppMethodBeat.i(136619);
    if ((isFTSContextReady()) && (this.mBM.indexOfKey(1) >= 0))
      ((k)this.mBM.get(1)).a(paramString, paraml, paramInt, com.tencent.mm.plugin.fts.a.d.bAi());
    AppMethodBeat.o(136619);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.PluginFTS
 * JD-Core Version:    0.6.2
 */