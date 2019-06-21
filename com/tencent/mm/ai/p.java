package com.tencent.mm.ai;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.e;
import com.tencent.mm.network.i;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import junit.framework.Assert;

public final class p
  implements f
{
  private static int ftK = 1;
  private static p ftz = null;
  public boolean foreground;
  public e ftA;
  public al ftB;
  private Vector<m> ftC;
  private Vector<m> ftD;
  private final Map<Integer, Set<f>> ftE;
  public Boolean ftF;
  private final a ftG;
  private long ftH;
  private boolean ftI;
  private ap ftJ;
  private final ak handler;
  private final Object lock;

  private p(a parama)
  {
    AppMethodBeat.i(58187);
    this.ftB = null;
    this.ftE = new HashMap();
    this.foreground = false;
    this.ftF = null;
    this.lock = new Object();
    this.ftH = 21600000L;
    this.ftI = false;
    this.ftJ = new ap(Looper.getMainLooper(), new ap.a()
    {
      public final boolean BI()
      {
        boolean bool1 = false;
        boolean bool2 = false;
        AppMethodBeat.i(58170);
        if (p.b(p.this) == null)
          AppMethodBeat.o(58170);
        while (true)
        {
          return bool2;
          ab.v("MicroMsg.NetSceneQueue", "onQueueIdle, running=%d, waiting=%d, foreground=%b", new Object[] { Integer.valueOf(p.c(p.this).size()), Integer.valueOf(p.d(p.this).size()), Boolean.valueOf(p.e(p.this)) });
          p.a locala = p.b(p.this);
          p localp = p.this;
          bool2 = bool1;
          if (p.f(p.this))
          {
            bool2 = bool1;
            if (p.c(p.this).isEmpty())
            {
              bool2 = bool1;
              if (p.d(p.this).isEmpty())
                bool2 = true;
            }
          }
          locala.a(localp, bool2);
          AppMethodBeat.o(58170);
          bool2 = true;
        }
      }
    }
    , true);
    this.ftC = new Vector();
    this.ftD = new Vector();
    this.handler = new ak(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(58171);
        p.this.a((m)paramAnonymousMessage.obj, 0);
        AppMethodBeat.o(58171);
      }
    };
    this.ftG = parama;
    AppMethodBeat.o(58187);
  }

  public static p a(a parama)
  {
    AppMethodBeat.i(58189);
    if (ftz == null)
      ftz = new p(parama);
    parama = ftz;
    AppMethodBeat.o(58189);
    return parama;
  }

  private void acU()
  {
    AppMethodBeat.i(58193);
    Vector localVector = this.ftD;
    this.ftD = new Vector();
    Iterator localIterator = localVector.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      ab.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + localm.getType());
      localm.cancel();
      b(3, -1, "doScene failed clearWaitingQueue", localm);
    }
    localVector.clear();
    AppMethodBeat.o(58193);
  }

  private void acX()
  {
    AppMethodBeat.i(58204);
    while (true)
      synchronized (this.lock)
      {
        if (this.ftD.size() > 0)
        {
          m localm = (m)this.ftD.get(0);
          int i = localm.priority;
          int j = 1;
          if (j < this.ftD.size())
          {
            if (((m)this.ftD.get(j)).priority > i)
            {
              this.ftD.get(j);
              if (acY())
              {
                localm = (m)this.ftD.get(j);
                i = localm.priority;
                j++;
              }
            }
          }
          else
          {
            this.ftD.remove(localm);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("waiting2running waitingQueue_size = ");
            ab.i("MicroMsg.NetSceneQueue", this.ftD.size());
            b(localm, 0);
          }
        }
        else
        {
          AppMethodBeat.o(58204);
          return;
        }
      }
  }

  private boolean acY()
  {
    AppMethodBeat.i(58205);
    boolean bool;
    if (this.ftC.size() >= 50)
    {
      bool = false;
      AppMethodBeat.o(58205);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(58205);
    }
  }

  private void acZ()
  {
    AppMethodBeat.i(58207);
    if (this.ftG == null)
    {
      ab.e("MicroMsg.NetSceneQueue", "prepare dispatcher failed, queue idle:%s", new Object[] { this.ftG });
      AppMethodBeat.o(58207);
    }
    while (true)
    {
      return;
      this.ftG.a(this);
      ap localap = new ap(Looper.getMainLooper(), new ap.a()
      {
        private long ftP = 10L;

        public final boolean BI()
        {
          AppMethodBeat.i(58180);
          boolean bool;
          if (p.g(p.this) == null)
          {
            long l = this.ftP;
            this.ftP = (l - 1L);
            if (l > 0L)
            {
              bool = true;
              AppMethodBeat.o(58180);
            }
          }
          while (true)
          {
            return bool;
            p.k(p.this);
            bool = false;
            AppMethodBeat.o(58180);
          }
        }
      }
      , true);
      long l = ftK * 100;
      localap.ae(l, l);
      if (ftK < 512)
        ftK *= 2;
      AppMethodBeat.o(58207);
    }
  }

  private void b(final int paramInt1, final int paramInt2, final String paramString, final m paramm)
  {
    AppMethodBeat.i(58203);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(58179);
        Set localSet = (Set)p.j(p.this).get(Integer.valueOf(paramm.getType()));
        Object localObject1;
        Object localObject2;
        if ((localSet != null) && (localSet.size() > 0))
        {
          localObject1 = new HashSet();
          ((Set)localObject1).addAll(localSet);
          localObject2 = ((Set)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (f)((Iterator)localObject2).next();
            if ((localObject1 != null) && (localSet.contains(localObject1)))
              ((f)localObject1).onSceneEnd(paramInt1, paramInt2, paramString, paramm);
          }
        }
        localSet = (Set)p.j(p.this).get(Integer.valueOf(-1));
        if ((localSet != null) && (localSet.size() > 0))
        {
          localObject1 = new HashSet();
          ((Set)localObject1).addAll(localSet);
          localObject1 = ((Set)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (f)((Iterator)localObject1).next();
            if ((localObject2 != null) && (localSet.contains(localObject2)))
              ((f)localObject2).onSceneEnd(paramInt1, paramInt2, paramString, paramm);
          }
        }
        AppMethodBeat.o(58179);
      }
    });
    AppMethodBeat.o(58203);
  }

  private void b(final m paramm, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(58201);
    boolean bool = acY();
    int j = this.ftC.size();
    int k = paramm.getType();
    int m = paramm.hashCode();
    int n = paramm.acO();
    int i1 = this.ftD.size();
    if (this.ftA == null)
    {
      ab.i("MicroMsg.NetSceneQueue", "doSceneImp start: mmcgi type:%d hash[%d,%d] run:%d wait:%d afterSec:%d canDo:%b autoauth:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(i1), Integer.valueOf(paramInt), Boolean.valueOf(bool), Integer.valueOf(i) });
      if ((paramInt != 0) || (!bool) || (this.ftA == null))
        break label304;
    }
    while (true)
    {
      synchronized (this.lock)
      {
        this.ftC.add(paramm);
        if (j == this.ftC.size())
          ab.w("MicroMsg.NetSceneQueue", "doSceneImp mmcgi  Add to runningQueue wrong  type:%d hash:%d run:[%d ,%d] wait:%d ", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramm.hashCode()), Integer.valueOf(j), Integer.valueOf(this.ftC.size()), Integer.valueOf(this.ftD.size()) });
        this.ftB.aa(new Runnable()
        {
          public final void run()
          {
            int i = 0;
            AppMethodBeat.i(58177);
            paramm.ftj = p.this;
            int j;
            if ((!paramm.bqV) && (p.g(p.this) != null))
            {
              j = paramm.a(p.g(p.this), p.this);
              if (j >= 0);
            }
            for (int k = j; ; k = 0)
            {
              int m = paramm.getType();
              int n = paramm.hashCode();
              int i1 = paramm.acO();
              boolean bool = paramm.bqV;
              int i2 = p.c(p.this).size();
              int i3 = p.d(p.this).size();
              if (p.g(p.this) == null)
                j = i;
              while (true)
              {
                ab.w("MicroMsg.NetSceneQueue", "doscene mmcgi Failed type:%d hash[%d,%d] cancel[%b] run:%d wait:%d ret:%d autoauth:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Boolean.valueOf(bool), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(k), Integer.valueOf(j) });
                paramm.ftj = null;
                synchronized (p.h(p.this))
                {
                  p.c(p.this).remove(paramm);
                  if (paramm.bqV)
                    break;
                  p.i(p.this).post(new Runnable()
                  {
                    public final void run()
                    {
                      AppMethodBeat.i(58176);
                      p.this.onSceneEnd(3, -1, "doScene failed", p.5.this.crb);
                      AppMethodBeat.o(58176);
                    }
                  });
                  AppMethodBeat.o(58177);
                  return;
                  j = p.g(p.this).hashCode();
                }
              }
              i1 = paramm.getType();
              i2 = paramm.hashCode();
              n = paramm.acO();
              i = p.c(p.this).size();
              i3 = p.d(p.this).size();
              if (p.g(p.this) == null);
              for (k = 0; ; k = p.g(p.this).hashCode())
              {
                ab.i("MicroMsg.NetSceneQueue", "On doscene  mmcgi type:%d hash[%d,%d] run:%d wait:%d ret:%d autoauth:%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(n), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(j), Integer.valueOf(k) });
                paramm.ftk = false;
                AppMethodBeat.o(58177);
                break;
              }
            }
          }

          public final String toString()
          {
            AppMethodBeat.i(58178);
            String str = super.toString() + "|doSceneImp_" + paramm + "_type=" + paramm.getType();
            AppMethodBeat.o(58178);
            return str;
          }
        });
        if (this.ftA != null)
          break label499;
        acZ();
        AppMethodBeat.o(58201);
        return;
        i = this.ftA.hashCode();
      }
      label304: if (paramInt > 0)
      {
        ??? = Message.obtain();
        ((Message)???).obj = paramm;
        this.handler.sendMessageDelayed((Message)???, paramInt);
        ab.i("MicroMsg.NetSceneQueue", "timed: type=" + paramm.getType() + " id=" + paramm.hashCode() + " cur_after_sec=" + paramInt);
      }
      else
      {
        ab.i("MicroMsg.NetSceneQueue", "waited: type=" + paramm.getType() + " id=" + paramm.hashCode() + " cur_waiting_cnt=" + this.ftD.size());
        synchronized (this.lock)
        {
          this.ftD.add(paramm);
          ab.i("MicroMsg.NetSceneQueue", "waitingQueue_size = " + this.ftD.size());
        }
        label499: ftK = 1;
        AppMethodBeat.o(58201);
      }
    }
  }

  private boolean e(m paramm)
  {
    AppMethodBeat.i(58206);
    int i = paramm.getType();
    if (paramm.acI());
    synchronized (this.lock)
    {
      Object localObject2 = this.ftC.iterator();
      m localm;
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          localm = (m)((Iterator)localObject2).next();
          if (localm.getType() == i)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("forbid in running: type=");
            ab.i("MicroMsg.NetSceneQueue", paramm.getType() + " id=" + paramm.hashCode() + " cur_running_cnt=" + this.ftC.size());
            if (paramm.b(localm))
            {
              AppMethodBeat.o(58206);
              bool = true;
            }
          }
        }
      while (true)
      {
        return bool;
        if (paramm.a(localm))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("forbid in running diagnostic: type=");
          ab.e("MicroMsg.NetSceneQueue", paramm.getType() + " id=" + paramm.hashCode() + " cur_running_cnt=" + this.ftC.size() + " ---" + localm.hashCode());
          if (!this.foreground)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("forbid in running diagnostic: type=");
            ab.e("MicroMsg.NetSceneQueue", paramm.getType() + "acinfo[" + localm.getInfo() + "] scinfo[" + paramm.getInfo() + "]");
            ab.dot();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("NetsceneQueue forbid in running diagnostic: type=");
            Assert.assertTrue(paramm.getType(), false);
          }
          c(localm);
          AppMethodBeat.o(58206);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(58206);
          bool = false;
          continue;
          localObject2 = this.ftD.iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext())
              break;
            localm = (m)((Iterator)localObject2).next();
          }
          while (localm.getType() != i);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("forbid in waiting: type=");
          ab.i("MicroMsg.NetSceneQueue", paramm.getType() + " id=" + paramm.hashCode() + " cur_waiting_cnt=" + this.ftD.size());
          if (paramm.b(localm))
          {
            AppMethodBeat.o(58206);
            bool = true;
          }
          else if (paramm.a(localm))
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("forbid in waiting diagnostic: type=");
            ab.e("MicroMsg.NetSceneQueue", paramm.getType() + " id=" + paramm.hashCode() + " cur_waiting_cnt=" + this.ftD.size() + " ---" + localm.hashCode());
            if (!this.foreground)
            {
              ab.dot();
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("NetsceneQueue forbid in waiting diagnostic: type=");
              Assert.assertTrue(paramm.getType(), false);
            }
            c(localm);
            AppMethodBeat.o(58206);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(58206);
            bool = false;
          }
        }
      }
      AppMethodBeat.o(58206);
      boolean bool = true;
    }
  }

  public final e Rk()
  {
    return this.ftA;
  }

  public final void a(int paramInt, f paramf)
  {
    AppMethodBeat.i(58190);
    synchronized (this.ftE)
    {
      if (!this.ftE.containsKey(Integer.valueOf(paramInt)))
      {
        Map localMap2 = this.ftE;
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        localMap2.put(Integer.valueOf(paramInt), localHashSet);
      }
      if ((!((Set)this.ftE.get(Integer.valueOf(paramInt))).contains(paramf)) && (((Set)this.ftE.get(Integer.valueOf(paramInt))).add(paramf)))
        ListenerInstanceMonitor.cA(paramf);
      AppMethodBeat.o(58190);
      return;
    }
  }

  public final void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(58182);
    if (this.ftA == null)
    {
      ab.e("MicroMsg.NetSceneQueue", "logUtil autoAuth  == null");
      AppMethodBeat.o(58182);
    }
    while (true)
    {
      return;
      this.ftA.a(paramInt1, paramString, paramInt2, paramBoolean);
      AppMethodBeat.o(58182);
    }
  }

  public final boolean a(m paramm, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(58200);
    if ((paramm != null) || (paramInt >= 0))
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (this.ftB == null)
        break label68;
      bool2 = true;
      label34: Assert.assertTrue("worker thread has not been set", bool2);
      if (e(paramm))
        break label74;
      AppMethodBeat.o(58200);
    }
    for (boolean bool2 = bool1; ; bool2 = true)
    {
      return bool2;
      bool2 = false;
      break;
      label68: bool2 = false;
      break label34;
      label74: b(paramm, paramInt);
      AppMethodBeat.o(58200);
    }
  }

  public final int acS()
  {
    int i = 0;
    AppMethodBeat.i(58184);
    try
    {
      if ((this.ftA != null) && (this.ftA.adh() != null))
      {
        j = this.ftA.adh().amP();
        AppMethodBeat.o(58184);
      }
      while (true)
      {
        return j;
        ab.e("MicroMsg.NetSceneQueue", "[arthurdan.getNetworkStatus] Notice!!! autoAuth and autoAuth.getNetworkEvent() is null!!!!");
        if (!at.isConnected(ah.getContext()))
          break;
        j = 6;
        AppMethodBeat.o(58184);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneQueue", "exception:%s", new Object[] { bo.l(localException) });
        continue;
        AppMethodBeat.o(58184);
        int j = i;
      }
    }
  }

  public final boolean acT()
  {
    AppMethodBeat.i(58185);
    boolean bool;
    if (this.ftA != null)
    {
      bool = this.ftA.acT();
      AppMethodBeat.o(58185);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(58185);
    }
  }

  public final void acV()
  {
    AppMethodBeat.i(58194);
    Vector localVector = this.ftC;
    this.ftC = new Vector();
    Iterator localIterator = localVector.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      ab.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + localm.getType());
      localm.cancel();
      b(3, -1, "doScene failed clearRunningQueue", localm);
    }
    localVector.clear();
    AppMethodBeat.o(58194);
  }

  public final void acW()
  {
    AppMethodBeat.i(58195);
    ab.i("MicroMsg.NetSceneQueue", "resetDispatcher");
    if (this.ftA != null)
    {
      this.ftA.reset();
      this.ftA = null;
    }
    AppMethodBeat.o(58195);
  }

  public final void b(int paramInt, f paramf)
  {
    AppMethodBeat.i(58191);
    try
    {
      synchronized (this.ftE)
      {
        if ((this.ftE.get(Integer.valueOf(paramInt)) != null) && (((Set)this.ftE.get(Integer.valueOf(paramInt))).remove(paramf)))
          ListenerInstanceMonitor.cB(paramf);
        label58: AppMethodBeat.o(58191);
        return;
      }
    }
    catch (Exception paramf)
    {
      break label58;
    }
  }

  public final void c(m paramm)
  {
    AppMethodBeat.i(58198);
    if (paramm == null)
      AppMethodBeat.o(58198);
    while (true)
    {
      return;
      ab.c("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", new Object[] { Integer.valueOf(paramm.hashCode()) });
      paramm.cancel();
      synchronized (this.lock)
      {
        this.ftD.remove(paramm);
        this.ftC.remove(paramm);
        AppMethodBeat.o(58198);
      }
    }
  }

  public final void cD(boolean paramBoolean)
  {
    AppMethodBeat.i(58181);
    this.ftI = paramBoolean;
    if (!this.ftI)
    {
      this.ftJ.stopTimer();
      AppMethodBeat.o(58181);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneQueue", "the working process is ready to be killed");
      ap localap = this.ftJ;
      long l = this.ftH;
      localap.ae(l, l);
      AppMethodBeat.o(58181);
    }
  }

  public final void cE(boolean paramBoolean)
  {
    AppMethodBeat.i(58183);
    this.foreground = paramBoolean;
    this.ftF = Boolean.valueOf(paramBoolean);
    b.cE(paramBoolean);
    com.tencent.mm.hardcoder.WXHardCoderJNI.foreground = paramBoolean;
    if (this.ftA == null)
    {
      ab.e("MicroMsg.NetSceneQueue", "setForeground autoAuth  == null");
      AppMethodBeat.o(58183);
    }
    while (true)
    {
      return;
      this.ftA.cF(paramBoolean);
      AppMethodBeat.o(58183);
    }
  }

  public final void cancel(final int paramInt)
  {
    AppMethodBeat.i(58196);
    ab.c("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", new Object[] { Integer.valueOf(paramInt) });
    this.ftB.aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(58172);
        p.a(p.this, paramInt);
        AppMethodBeat.o(58172);
      }

      public final String toString()
      {
        AppMethodBeat.i(58173);
        String str = super.toString() + "|cancelImp_" + paramInt;
        AppMethodBeat.o(58173);
        return str;
      }
    });
    AppMethodBeat.o(58196);
  }

  public final void d(e parame)
  {
    AppMethodBeat.i(58188);
    this.ftA = parame;
    parame.cF(this.foreground);
    acX();
    AppMethodBeat.o(58188);
  }

  public final boolean d(m paramm)
  {
    AppMethodBeat.i(138430);
    boolean bool = a(paramm, 0);
    AppMethodBeat.o(138430);
    return bool;
  }

  public final String getNetworkServerIp()
  {
    AppMethodBeat.i(58186);
    String str;
    if (this.ftA != null)
    {
      str = this.ftA.getNetworkServerIp();
      AppMethodBeat.o(58186);
    }
    while (true)
    {
      return str;
      str = "unknown";
      AppMethodBeat.o(58186);
    }
  }

  public final void kX(final int paramInt)
  {
    AppMethodBeat.i(58197);
    ab.c("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", new Object[] { Integer.valueOf(paramInt) });
    this.ftB.aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(58174);
        p.b(p.this, paramInt);
        AppMethodBeat.o(58174);
      }

      public final String toString()
      {
        AppMethodBeat.i(58175);
        String str = super.toString() + "|cancelImp_" + paramInt;
        AppMethodBeat.o(58175);
        return str;
      }
    });
    AppMethodBeat.o(58197);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 0;
    AppMethodBeat.i(58202);
    paramm.ftk = true;
    while (true)
    {
      synchronized (this.lock)
      {
        this.ftC.remove(paramm);
        int j = paramm.getType();
        int k = paramm.hashCode();
        int m = paramm.acO();
        int n = this.ftC.size();
        int i1 = this.ftD.size();
        if (this.ftA == null)
        {
          ab.i("MicroMsg.NetSceneQueue", "onSceneEnd mmcgi type:%d hash[%d,%d] run:%d wait:%d autoauth:%d [%d,%d,%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          acX();
          b(paramInt1, paramInt2, paramString, paramm);
          if ((this.ftI) && (this.ftC.isEmpty()) && (this.ftD.isEmpty()))
          {
            paramString = this.ftJ;
            long l = this.ftH;
            paramString.ae(l, l);
          }
          AppMethodBeat.o(58202);
          return;
        }
      }
      i = this.ftA.hashCode();
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(58192);
    if (this.ftA != null)
      this.ftA.reset();
    acV();
    acU();
    AppMethodBeat.o(58192);
  }

  public static abstract interface a
  {
    public abstract void a(p paramp);

    public abstract void a(p paramp, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.p
 * JD-Core Version:    0.6.2
 */