package com.tencent.mm.plugin.clean.c;

import android.database.Cursor;
import android.os.Looper;
import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.clean.c.a.a.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class c
  implements a.a, Runnable
{
  private static final Long clo;
  private static final Long kvU;
  private static final int kwg;
  private long endTime;
  private com.tencent.mm.sdk.platformtools.ak fbD;
  public boolean isStop;
  private long kvW;
  private long kvX;
  private com.tencent.mm.plugin.clean.c.a.b kwh;
  private g kwi;
  private int kwj;
  private int kwk;
  private ConcurrentHashMap<String, b> kwl;
  private long kwm;
  private long kwn;
  private HashSet<String> kwo;
  private HashSet<String> kwp;
  private boolean kwq;
  private int[] kwr;
  private long startTime;

  static
  {
    AppMethodBeat.i(18693);
    clo = Long.valueOf(604800000L);
    kvU = Long.valueOf(7776000000L);
    aw.ZK();
    kwg = com.tencent.mm.model.c.getAccPath().length() - 1;
    AppMethodBeat.o(18693);
  }

  public c(com.tencent.mm.plugin.clean.c.a.b paramb, g paramg)
  {
    AppMethodBeat.i(18679);
    this.kwj = 0;
    this.kwk = 0;
    this.startTime = 0L;
    this.endTime = 0L;
    this.fbD = new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper());
    this.kwo = new HashSet();
    this.kwp = new HashSet();
    this.kwq = true;
    this.kwr = new int[10];
    this.kwl = new ConcurrentHashMap();
    this.kwi = paramg;
    this.kwh = paramb;
    AppMethodBeat.o(18679);
  }

  private static ArrayList<String> HR(String paramString)
  {
    AppMethodBeat.i(18686);
    ArrayList localArrayList = new ArrayList();
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(paramString);
    if (localb.isDirectory())
    {
      String[] arrayOfString = localb.list();
      int i;
      int j;
      if ((arrayOfString != null) && (arrayOfString.length > 0))
      {
        i = arrayOfString.length;
        j = 0;
      }
      while (j < i)
      {
        localb = arrayOfString[j];
        localArrayList.add(paramString + "/" + localb);
        j++;
        continue;
        localArrayList.add(paramString);
      }
    }
    while (true)
    {
      AppMethodBeat.o(18686);
      return localArrayList;
      localArrayList.add(paramString);
    }
  }

  private void bfJ()
  {
    AppMethodBeat.i(18682);
    this.endTime = System.currentTimeMillis();
    ab.i("MicroMsg.CleanController", "totalUserTime:%d", new Object[] { Long.valueOf(bfK()) });
    if ((this.kwi != null) && (!this.isStop))
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.kwl.values().iterator();
      while (localIterator.hasNext())
        localArrayList.add((b)localIterator.next());
      Collections.sort(localArrayList);
      Collections.reverse(localArrayList);
      this.fbD.post(new c.1(this, localArrayList));
    }
    AppMethodBeat.o(18682);
  }

  private long bfK()
  {
    return this.endTime - this.startTime;
  }

  public static long bfL()
  {
    AppMethodBeat.i(18683);
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(com.tencent.mm.compatible.util.e.eSl);
      l = localStatFs.getBlockCount();
      int i = localStatFs.getBlockSize();
      l = i * l;
      if (l <= 0L)
      {
        l = 1L;
        AppMethodBeat.o(18683);
        return l;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l = 0L;
        continue;
        AppMethodBeat.o(18683);
      }
    }
  }

  public static long bfM()
  {
    AppMethodBeat.i(18684);
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(com.tencent.mm.compatible.util.e.eSl);
      l = localStatFs.getAvailableBlocks();
      int i = localStatFs.getBlockSize();
      l = i * l;
      if (l <= 0L)
      {
        l = 1L;
        AppMethodBeat.o(18684);
        return l;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l = 0L;
        continue;
        AppMethodBeat.o(18684);
      }
    }
  }

  private static ArrayList<String> bfN()
  {
    AppMethodBeat.i(18685);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = new LinkedList();
    Object localObject2 = t.fkY;
    int i = localObject2.length;
    for (int j = 0; j < i; j++)
      ((LinkedList)localObject1).add(localObject2[j]);
    aw.ZK();
    localObject1 = com.tencent.mm.model.c.XR().c(t.fkP, (List)localObject1, "*");
    if (((Cursor)localObject1).moveToFirst())
      do
      {
        localObject2 = new com.tencent.mm.storage.ak();
        ((com.tencent.mm.storage.ak)localObject2).d((Cursor)localObject1);
        if (!bo.isNullOrNil(((at)localObject2).field_username))
        {
          aw.ZK();
          if (!ad.Mn(com.tencent.mm.model.c.XM().aoO(((at)localObject2).field_username).field_verifyFlag))
            localArrayList.add(((at)localObject2).field_username);
        }
      }
      while ((((Cursor)localObject1).moveToNext()) && (!((Cursor)localObject1).isAfterLast()));
    ((Cursor)localObject1).close();
    AppMethodBeat.o(18685);
    return localArrayList;
  }

  private void hc(long paramLong)
  {
    try
    {
      AppMethodBeat.i(18687);
      if (paramLong < 0L)
      {
        ab.w("MicroMsg.CleanController", "summerclean file size[%d] overlimit ", new Object[] { Long.valueOf(paramLong) });
        this.kwn += 60L;
        AppMethodBeat.o(18687);
      }
      while (true)
      {
        return;
        this.kwn += paramLong;
        AppMethodBeat.o(18687);
      }
    }
    finally
    {
    }
  }

  public final void a(com.tencent.mm.plugin.clean.c.a.a parama)
  {
    AppMethodBeat.i(18681);
    if ((parama instanceof c.a))
      ab.d("MicroMsg.CleanController", "AnalyseTask is finish [%d] cost[%s]", new Object[] { Integer.valueOf(parama.hashCode()), parama.alb() });
    while (true)
    {
      d.xDG.remove(this);
      this.isStop = true;
      this.kwk += 1;
      if ((this.kwi != null) && (!this.isStop))
        this.fbD.post(new c.2(this));
      if (this.kwk == this.kwj)
        bfJ();
      AppMethodBeat.o(18681);
      return;
      ab.d("MicroMsg.CleanController", "ScanSpaceTask is finish [%d] cost[%s]", new Object[] { Integer.valueOf(parama.hashCode()), parama.alb() });
    }
  }

  public final void run()
  {
    AppMethodBeat.i(18680);
    ab.i("MicroMsg.CleanController", "Start to run clean controller");
    this.startTime = System.currentTimeMillis();
    long l = bo.yz();
    Object localObject1 = com.tencent.mm.compatible.util.e.eSn;
    ab.v("MicroMsg.CleanController", "root path: %s", new Object[] { localObject1 });
    Object localObject2 = new StringBuilder("mm");
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN();
    Object localObject3 = com.tencent.mm.a.g.x(com.tencent.mm.kernel.a.QF().getBytes());
    localObject2 = new ArrayList();
    Object localObject4 = new com.tencent.mm.vfs.b((String)localObject1);
    if (((com.tencent.mm.vfs.b)localObject4).isDirectory())
    {
      localObject4 = ((com.tencent.mm.vfs.b)localObject4).list();
      if (localObject4 != null)
      {
        i = localObject4.length;
        j = 0;
        if (j < i)
        {
          String str = localObject4[j];
          Object localObject5 = (String)localObject1 + str;
          if (str.length() >= 32)
          {
            ab.v("MicroMsg.CleanController", "add subfile list: %s uinPath %s ", new Object[] { str, localObject3 });
            localObject5 = HR((String)localObject5);
            if (((ArrayList)localObject2).size() > 0)
            {
              if (!((String)localObject3).equals(str))
              {
                ab.i("MicroMsg.CleanController", "add other acc tmp path %s", new Object[] { str });
                this.kwo.add(str);
              }
              ((ArrayList)localObject2).addAll(0, (Collection)localObject5);
            }
          }
          while (true)
          {
            j++;
            break;
            ((ArrayList)localObject2).addAll((Collection)localObject5);
            continue;
            ab.v("MicroMsg.CleanController", "subfile: %s", new Object[] { str });
            if (((ArrayList)localObject2).size() > 0)
              ((ArrayList)localObject2).add(0, localObject5);
            else
              ((ArrayList)localObject2).add(localObject5);
          }
        }
      }
    }
    else
    {
      hc(com.tencent.mm.vfs.e.asZ((String)localObject1));
    }
    int i = -1;
    int k = -1;
    for (int j = 0; j < ((ArrayList)localObject2).size(); j++)
    {
      localObject1 = (String)((ArrayList)localObject2).get(j);
      if (((String)localObject1).contains("image2"))
        i = j;
      if (((String)localObject1).contains("voice2"))
        k = j;
    }
    if (k != -1)
      ((ArrayList)localObject2).add(0, (String)((ArrayList)localObject2).remove(k));
    if (i != -1)
      ((ArrayList)localObject2).add(0, (String)((ArrayList)localObject2).remove(i));
    ab.d("MicroMsg.CleanController", "scan is finish [%s]", new Object[] { Long.valueOf(bo.az(l)) });
    l = bo.yz();
    localObject1 = bfN();
    ab.d("MicroMsg.CleanController", "user is finish [%s]", new Object[] { Long.valueOf(bo.az(l)) });
    this.kwj = (((ArrayList)localObject2).size() + ((ArrayList)localObject1).size());
    if (this.kwj == 0)
    {
      ab.i("MicroMsg.CleanController", "Clean Controller totalTaskCount=0");
      bfJ();
      AppMethodBeat.o(18680);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CleanController", "Clean Controller totalTaskCount=%d", new Object[] { Integer.valueOf(this.kwj) });
      for (j = 0; (!this.isStop) && (j < ((ArrayList)localObject2).size()); j++)
      {
        localObject3 = (String)((ArrayList)localObject2).get(j);
        ab.d("MicroMsg.CleanController", "while loop index=%d | filePath=%s", new Object[] { Integer.valueOf(j), localObject3 });
        localObject4 = new c.b(this, (String)localObject3);
        while (!this.kwh.b((com.tencent.mm.plugin.clean.c.a.a)localObject4))
          try
          {
            Thread.sleep(2147483647L);
          }
          catch (InterruptedException localInterruptedException2)
          {
          }
        ab.d("MicroMsg.CleanController", "Start task： filePath＝%s", new Object[] { localObject3 });
      }
      for (j = 0; (!this.isStop) && (j < ((ArrayList)localObject1).size()); j++)
      {
        localObject2 = (String)((ArrayList)localObject1).get(j);
        ab.d("MicroMsg.CleanController", "while loop index=%d | username=%s", new Object[] { Integer.valueOf(j), localObject2 });
        localObject3 = new c.a(this, (String)localObject2);
        while (!this.kwh.b((com.tencent.mm.plugin.clean.c.a.a)localObject3))
          try
          {
            Thread.sleep(2147483647L);
          }
          catch (InterruptedException localInterruptedException1)
          {
          }
        ab.d("MicroMsg.CleanController", "Start task： user＝%s", new Object[] { localObject2 });
      }
      AppMethodBeat.o(18680);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.c
 * JD-Core Version:    0.6.2
 */