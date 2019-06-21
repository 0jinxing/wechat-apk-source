package com.tencent.mm.plugin.emoji.sync;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.Executor;

public final class BKGLoaderManager
  implements d
{
  int fDe;
  private Vector<c> kXA;
  private Set<Object> kXB;
  public BKGLoaderManager.ConnectivityReceiver kXC;
  long kXD;
  long kXE;
  ap kXF;
  public com.tencent.mm.sdk.b.c kXG;
  public com.tencent.mm.sdk.b.c kXH;
  private int kXm;
  private int kXn;
  private boolean kXo;
  boolean kXp;
  boolean kXq;
  public boolean kXr;
  public boolean kXs;
  private boolean kXt;
  private boolean kXu;
  public boolean kXv;
  private c kXw;
  private b kXx;
  private Vector<c> kXy;
  private Vector<c> kXz;
  int mNetWorkType;

  public BKGLoaderManager(b paramb)
  {
    AppMethodBeat.i(53186);
    this.kXm = 0;
    this.kXn = 0;
    this.kXo = false;
    this.kXp = false;
    this.kXq = false;
    this.kXr = false;
    this.kXs = false;
    this.kXt = false;
    this.kXu = false;
    this.kXv = false;
    this.kXw = null;
    this.kXy = new Vector();
    this.kXz = new Vector();
    this.kXA = new Vector();
    this.kXB = new HashSet();
    this.mNetWorkType = -1;
    this.kXD = 0L;
    this.kXE = 0L;
    this.kXF = new ap(Looper.getMainLooper(), new BKGLoaderManager.1(this), false);
    this.kXG = new BKGLoaderManager.2(this);
    this.kXH = new BKGLoaderManager.3(this);
    this.kXx = paramb;
    this.fDe = Process.myUid();
    this.mNetWorkType = at.getNetType(ah.getContext());
    AppMethodBeat.o(53186);
  }

  static boolean bjI()
  {
    AppMethodBeat.i(53197);
    boolean bool;
    if ((at.is3G(ah.getContext())) || (at.is4G(ah.getContext())) || (at.is2G(ah.getContext())))
    {
      bool = true;
      AppMethodBeat.o(53197);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(53197);
    }
  }

  public static boolean bkJ()
  {
    AppMethodBeat.i(53196);
    long l = SystemClock.uptimeMillis();
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getNetworkInfo(1);
      if (localNetworkInfo != null);
      for (boolean bool = localNetworkInfo.isConnected(); ; bool = false)
      {
        return bool;
        l = SystemClock.uptimeMillis() - l;
        if (l >= 1000L)
          ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[isWifi] cost:%s", new Object[] { Long.valueOf(l) });
        AppMethodBeat.o(53196);
      }
    }
    finally
    {
      l = SystemClock.uptimeMillis() - l;
      if (l >= 1000L)
        ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[isWifi] cost:%s", new Object[] { Long.valueOf(l) });
      AppMethodBeat.o(53196);
    }
  }

  public final void JH(String paramString)
  {
    AppMethodBeat.i(53194);
    ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", new Object[] { paramString });
    AppMethodBeat.o(53194);
  }

  public final void bkF()
  {
    try
    {
      AppMethodBeat.i(53190);
      if (this.kXy != null)
        this.kXy.clear();
      if (this.kXz != null)
        this.kXz.clear();
      if (this.kXA != null)
        this.kXA.clear();
      this.kXo = false;
      AppMethodBeat.o(53190);
      return;
    }
    finally
    {
    }
  }

  public final void bkG()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(53191);
        if ((!at.isWifi(ah.getContext())) && (!this.kXo))
          break label584;
        if ((this.kXy != null) && (this.kXy.size() > 0))
        {
          this.kXu = f.Mo();
          this.kXp = true;
          this.kXq = false;
          this.kXs = false;
          this.kXr = false;
          if (!this.kXu)
          {
            this.kXw = ((c)this.kXy.remove(0));
            this.kXw.a(this);
            this.kXx.kXl.execute(this.kXw);
            ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart task is ruing. key:%s donwload list size:%d", new Object[] { this.kXw.getKey(), Integer.valueOf(this.kXy.size()) });
            bkI();
            if ((this.kXq) || (this.kXp))
              break label638;
            if ((this.kXA == null) || (this.kXA.size() <= 0))
              break label571;
            this.kXr = true;
            this.kXw = ((c)this.kXA.remove(0));
            this.kXw.a(this);
            this.kXx.kXl.execute(this.kXw);
            ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart download store emoji task is runing. productID:%s size:%d", new Object[] { this.kXw.getKey(), Integer.valueOf(this.kXA.size()) });
            AppMethodBeat.o(53191);
            return;
          }
          ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] sdcard is full.");
          continue;
        }
      }
      finally
      {
      }
      if ((this.kXz != null) && (this.kXz.size() > 0))
      {
        this.kXq = true;
        this.kXp = false;
        this.kXt = false;
        this.kXr = false;
        this.kXw = ((c)this.kXz.remove(0));
        this.kXw.a(this);
        this.kXx.kXl.execute(this.kXw);
        ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart task is ruing. key:%s upload list size:%d", new Object[] { this.kXw.getKey(), Integer.valueOf(this.kXz.size()) });
        bkI();
      }
      else
      {
        ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart no task list .");
        if ((this.kXy == null) || (this.kXy.size() <= 0))
        {
          if ((this.kXp) && (this.kXv))
            this.kXs = true;
          this.kXp = false;
        }
        if ((this.kXz == null) || (this.kXz.size() <= 0))
        {
          if ((this.kXq) && (this.kXv))
            this.kXt = true;
          this.kXq = false;
        }
        if (((this.kXy == null) || (this.kXy.size() <= 0)) && ((this.kXz == null) || (this.kXz.size() <= 0)) && ((this.kXp) || (this.kXq)) && (this.kXv))
        {
          this.kXq = false;
          this.kXp = false;
        }
        this.kXo = false;
        bkI();
        continue;
        label571: this.kXr = false;
        AppMethodBeat.o(53191);
        continue;
        label584: if (bjI())
        {
          ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is 3g or 4g]");
          this.kXp = false;
          this.kXq = false;
          this.kXs = false;
          this.kXr = false;
          bkI();
          AppMethodBeat.o(53191);
        }
        else
        {
          ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is not wifi, 3g nor 4g]");
          label638: AppMethodBeat.o(53191);
        }
      }
    }
  }

  public final void bkH()
  {
    try
    {
      AppMethodBeat.i(53192);
      this.kXp = false;
      this.kXq = false;
      this.kXo = false;
      bkI();
      if (this.kXw != null)
        this.kXw.cancel();
      AppMethodBeat.o(53192);
      return;
    }
    finally
    {
    }
  }

  public final void bkI()
  {
    AppMethodBeat.i(53193);
    if ((this.kXB != null) && (this.kXB.size() > 0))
    {
      Iterator localIterator = this.kXB.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    AppMethodBeat.o(53193);
  }

  public final void bs(List<c> paramList)
  {
    AppMethodBeat.i(53187);
    this.kXo = false;
    if (this.kXy == null)
      this.kXy = new Vector();
    if (paramList.size() > 0)
    {
      int i = paramList.size();
      int j = 0;
      if (j < i)
      {
        c localc = (c)paramList.get(j);
        if ((localc != null) && (!this.kXy.contains(localc)))
          this.kXy.add(localc);
        while (true)
        {
          j++;
          break;
          ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist.:%s", new Object[] { localc.getKey() });
        }
      }
    }
    AppMethodBeat.o(53187);
  }

  public final void bt(List<c> paramList)
  {
    AppMethodBeat.i(53188);
    if (this.kXz == null)
      this.kXz = new Vector();
    if (paramList.size() > 0)
    {
      int i = paramList.size();
      int j = 0;
      if (j < i)
      {
        c localc = (c)paramList.get(j);
        if ((localc != null) && (!this.kXz.contains(localc)))
          this.kXz.add(localc);
        while (true)
        {
          j++;
          break;
          ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", new Object[] { localc.getKey() });
        }
      }
    }
    AppMethodBeat.o(53188);
  }

  public final void bu(List<c> paramList)
  {
    try
    {
      AppMethodBeat.i(53189);
      if (this.kXA == null)
      {
        localObject = new java/util/Vector;
        ((Vector)localObject).<init>();
        this.kXA = ((Vector)localObject);
      }
      if ((paramList == null) || (paramList.size() <= 0))
        break label192;
      int i = paramList.size();
      int j = 0;
      if (j >= i)
        break label192;
      localObject = (c)paramList.get(j);
      if ((this.kXw != null) && (this.kXw.equals(localObject)))
        if (localObject == null)
        {
          localObject = "task is null";
          label95: ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] currentTask equals task is has exist:%s", new Object[] { localObject });
        }
      while (true)
      {
        j++;
        break;
        localObject = ((c)localObject).getKey();
        break label95;
        if ((localObject == null) || (this.kXA.contains(localObject)))
          break label157;
        this.kXA.add(localObject);
      }
    }
    finally
    {
    }
    label157: if (localObject == null);
    for (Object localObject = "task is null"; ; localObject = ((c)localObject).getKey())
    {
      ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", new Object[] { localObject });
      break;
    }
    label192: AppMethodBeat.o(53189);
  }

  public final void m(String paramString, int paramInt, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(53195);
        ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is finish. key:%s success:%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
        if ((this.kXw == null) || (bo.isNullOrNil(paramString)))
        {
          ab.e("MicroMsg.BKGLoader.BKGLoaderManager", "CurrentTask or key is null. or key is no equal crrentkey ");
          AppMethodBeat.o(53195);
          return;
        }
        if (this.kXy.contains(this.kXw))
        {
          this.kXy.remove(this.kXw);
          if (!paramBoolean)
            break label208;
          if ((paramInt == 2) || (this.kXB == null) || (this.kXB.size() <= 0))
            break label216;
          paramString = this.kXB.iterator();
          if (!paramString.hasNext())
            break label216;
          paramString.next();
          continue;
        }
      }
      finally
      {
      }
      if (this.kXz.contains(this.kXw))
      {
        this.kXz.remove(this.kXw);
      }
      else if (this.kXA.contains(this.kXw))
      {
        this.kXA.remove(this.kXw);
        continue;
        label208: ab.i("MicroMsg.BKGLoader.BKGLoaderManager", "retry later.");
        label216: if (paramInt == 2)
        {
          this.kXF.ae(5000L, 5000L);
          AppMethodBeat.o(53195);
        }
        else
        {
          this.kXF.ae(1000L, 1000L);
          AppMethodBeat.o(53195);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.sync.BKGLoaderManager
 * JD-Core Version:    0.6.2
 */