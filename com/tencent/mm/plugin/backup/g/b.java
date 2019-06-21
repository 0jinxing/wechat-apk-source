package com.tencent.mm.plugin.backup.g;

import android.os.Looper;
import com.tencent.mm.ai.m;
import com.tencent.mm.bt.a;
import com.tencent.mm.network.e;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public abstract class b extends m
{
  private static final ak handler = new ak(Looper.getMainLooper());
  static int jqS = -1;
  private static final Map<Integer, Set<com.tencent.mm.ai.f>> jxd = new HashMap();
  private static final LinkedHashMap<Integer, b> jxe = new LinkedHashMap();
  private static d jxf;
  static a jxg;
  private static f jxh = null;
  private static j jxi = null;
  private static g jxj = null;
  private static h jxk = null;
  private static int jxl = new Random(bo.anU()).nextInt(1147483648);
  private static b.c jxm = null;
  private PByteArray jxc = new PByteArray();

  public static boolean K(byte[] paramArrayOfByte, int paramInt)
  {
    PByteArray localPByteArray = new PByteArray();
    synchronized (jxe)
    {
      int i = aUe();
      com.tencent.mm.plugin.backup.f.j.a(paramArrayOfByte, i, (short)paramInt, localPByteArray, jqS);
      if (jxg != null)
        jxg.i(i, localPByteArray.value);
      ab.i("MicroMsg.BackupBaseScene", "sendBuf sendSeq[%d], type[%d], buflen[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(localPByteArray.value.length) });
      return true;
    }
  }

  public static void a(int paramInt, com.tencent.mm.ai.f paramf)
  {
    synchronized (jxd)
    {
      if (!jxd.containsKey(Integer.valueOf(paramInt)))
      {
        Map localMap2 = jxd;
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        localMap2.put(Integer.valueOf(paramInt), localHashSet);
      }
      if (!((Set)jxd.get(Integer.valueOf(paramInt))).contains(paramf))
        ((Set)jxd.get(Integer.valueOf(paramInt))).add(paramf);
      return;
    }
  }

  public static void a(a parama)
  {
    jxg = parama;
  }

  public static void a(b paramb)
  {
    handler.postAtFrontOfQueueV2(new b.3(paramb));
  }

  public static void a(b.c paramc)
  {
    jxm = paramc;
  }

  public static void a(d paramd)
  {
    jxf = paramd;
  }

  public static void a(h.a parama)
  {
    if (jxk != null)
    {
      if (!jxk.jxQ)
      {
        ab.e("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, backupReconnectHandler already running, ignore it.");
        return;
      }
      ab.i("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, old backupReconnectHandler is stopped, new one.");
    }
    while (true)
    {
      parama = new h(parama);
      jxk = parama;
      ab.i("MicroMsg.BackupReconnectHandler", "start backupReconnectTimeHandler.");
      h.index = 0;
      parama.jxQ = false;
      parama.jxP = 1;
      if (parama.jxO == null)
        break;
      parama.jxR.ae(0L, 0L);
      break;
      ab.i("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, no old backupReconnectHandler is stopped, new one.");
    }
  }

  public static void a(j.a parama)
  {
    jxi = new j(parama);
  }

  public static int aSx()
  {
    return jqS;
  }

  public static void aTU()
  {
    if (jxh != null)
      jxh.stop();
    f localf = new f();
    jxh = localf;
    localf.cg(true);
  }

  public static void aTV()
  {
    if (jxh != null)
      jxh.stop();
  }

  public static void aTW()
  {
    int i = 0;
    if (jxi != null)
    {
      j localj = jxi;
      ab.i("MicroMsg.BackupSpeedCalculator", "start backupGetSpeedTimeHandler.");
      localj.jxZ = bo.anU();
      localj.jxY = 0L;
      localj.jxW = 0L;
      localj.jyc.clear();
      localj.jyb = 0;
      localj.jya = 0L;
      while (i < 10)
      {
        localj.jyc.offer(Long.valueOf(204800L));
        i++;
      }
      localj.jyd.ae(1000L, 1000L);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.BackupBaseScene", "startSpeedCalculator backupSpeedCalculator is null!");
    }
  }

  public static void aTX()
  {
    if (jxi != null)
    {
      j localj = jxi;
      ab.i("MicroMsg.BackupSpeedCalculator", "stop backupGetSpeedTimeHandler.");
      localj.jyd.stopTimer();
      localj.jyb = 0;
    }
  }

  public static String aTY()
  {
    String str;
    if (jxi == null)
      str = "0B";
    while (true)
    {
      return str;
      str = j.gz(jxi.jxX);
      ab.i("MicroMsg.BackupSpeedCalculator", "getBackupSpeed[%s]", new Object[] { str });
    }
  }

  public static void aTZ()
  {
    if (jxj == null)
      jxj = new g();
    g localg = jxj;
    try
    {
      ab.i("MicroMsg.BackupLogManager", "start");
      g.init();
      if (localg.jxJ != null)
      {
        localg.jxJ.stopTimer();
        localg.jxJ = null;
      }
      g.startTime = bo.anU();
      g.jxH = localg.gy(g.startTime);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.BackupLogManager", localException, "start exception", new Object[0]);
    }
  }

  public static void aTm()
  {
    if (jxm != null)
      jxm.aTm();
  }

  public static void aUa()
  {
    if (jxk != null)
    {
      jxk.jxP = 0;
      h localh = jxk;
      if (!localh.jxQ)
      {
        ab.i("MicroMsg.BackupReconnectHandler", "stop backupReconnectTimeHandler.");
        localh.jxR.stopTimer();
        localh.jxQ = true;
      }
    }
  }

  public static int aUb()
  {
    if (jxk == null);
    for (int i = 0; ; i = jxk.jxP)
      return i;
  }

  public static int aUe()
  {
    int i = jxl;
    jxl += 1;
    return i;
  }

  public static void b(int paramInt, com.tencent.mm.ai.f paramf)
  {
    synchronized (jxd)
    {
      try
      {
        if (jxd.get(Integer.valueOf(paramInt)) != null)
          ((Set)jxd.get(Integer.valueOf(paramInt))).remove(paramf);
        return;
      }
      catch (Exception paramf)
      {
        while (true)
          ab.e("MicroMsg.BackupBaseScene", "removeSceneEndListener failed:%s", new Object[] { paramf });
      }
    }
  }

  public static void b(boolean paramBoolean, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      ab.i("MicroMsg.BackupBaseScene", "callback receive isLocal[%b], receiveSeq[%d], type[%d], bufLen[%d]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if (!paramBoolean)
        break label122;
    }
    while (true)
    {
      try
      {
        ??? = new java/lang/StringBuilder;
        ((StringBuilder)???).<init>("callback error buf content : ");
        if (paramArrayOfByte == null)
        {
          str = "null";
          ab.w("MicroMsg.BackupBaseScene", str);
          b(paramBoolean, paramInt2, paramArrayOfByte, paramInt1);
          return;
          i = paramArrayOfByte.length;
          break;
        }
        String str = new String(paramArrayOfByte);
        continue;
      }
      catch (Exception localException1)
      {
        continue;
      }
      label122: if (jxh != null)
      {
        jxh.aUl();
        ab.d("MicroMsg.BackupBaseScene", "updateHeartBeatTimeStamp type:%d, current time stamp:%d", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(bo.anU()) });
      }
      Object localObject2;
      synchronized (jxe)
      {
        localObject2 = (b)jxe.remove(Integer.valueOf(paramInt1));
        if (localObject2 == null)
          break label269;
        if (paramArrayOfByte == null)
          try
          {
            paramArrayOfByte = new java/lang/Exception;
            paramArrayOfByte.<init>("buf is null");
            throw paramArrayOfByte;
          }
          catch (Exception paramArrayOfByte)
          {
            ((b)localObject2).l(3, -1, "buf to resq fail");
            ab.printErrStackTrace("MicroMsg.BackupBaseScene", paramArrayOfByte, "%s ", new Object[] { paramArrayOfByte.toString() });
          }
      }
      ((b)localObject2).aTS().parseFrom(paramArrayOfByte);
      ((b)localObject2).rw(paramInt1);
      continue;
      label269: ab.i("MicroMsg.BackupBaseScene", "notify scene null type:%d", new Object[] { Integer.valueOf(paramInt2) });
      if ((localObject2 == null) && (paramInt2 == 16))
      {
        while (true)
        {
          b localb;
          synchronized (jxe)
          {
            localObject2 = new java/util/HashSet;
            ((HashSet)localObject2).<init>(jxe.keySet());
            Iterator localIterator = ((HashSet)localObject2).iterator();
            if (!localIterator.hasNext())
              break;
            Integer localInteger2 = (Integer)localIterator.next();
            localb = (b)jxe.get(localInteger2);
            if (localb == null)
            {
              localObject2 = "null";
              ab.d("MicroMsg.BackupBaseScene", "callback sceneMap seq:%d scene:%s type:%s", new Object[] { localInteger2, localb, localObject2 });
              if ((localb == null) || (localb.getType() != 15))
                continue;
              jxe.remove(localInteger2);
              try
              {
                localb.aTS().parseFrom(paramArrayOfByte);
                localb.rw(paramInt1);
              }
              catch (Exception localException2)
              {
                localb.l(3, -1, "buf to tagResp fail");
                ab.printErrStackTrace("MicroMsg.BackupBaseScene", localException2, "buf to tagResp error, type[%d], errMsg:%s ", new Object[] { Integer.valueOf(localb.getType()), localException2.toString() });
              }
            }
          }
          Integer localInteger1 = Integer.valueOf(localb.getType());
        }
      }
      else
      {
        ab.i("MicroMsg.BackupBaseScene", "notify seq:%d, type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        b(paramBoolean, paramInt2, paramArrayOfByte, paramInt1);
      }
    }
  }

  private static void b(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    handler.post(new b.1(paramBoolean, paramInt1, paramArrayOfByte, paramInt2));
  }

  public static void clear()
  {
    ab.i("MicroMsg.BackupBaseScene", "BackupBaseScene clear.");
    synchronized (jxe)
    {
      jxe.clear();
    }
    synchronized (jxd)
    {
      jxd.clear();
      return;
      localObject2 = finally;
      throw localObject2;
    }
  }

  public static boolean r(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    PByteArray localPByteArray = new PByteArray();
    com.tencent.mm.plugin.backup.f.j.a(paramArrayOfByte, paramInt2, (short)paramInt1, localPByteArray, jqS);
    if (jxg != null)
      jxg.i(paramInt2, localPByteArray.value);
    ab.i("MicroMsg.BackupBaseScene", "sendResp sendSeq[%d], type[%d], len[%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(localPByteArray.value.length) });
    return true;
  }

  public static void rk(int paramInt)
  {
    jqS = paramInt;
  }

  public static void rx(int paramInt)
  {
    g localg;
    if (jxj != null)
      localg = jxj;
    try
    {
      ab.i("MicroMsg.BackupLogManager", "end backupMode[%d]", new Object[] { Integer.valueOf(paramInt) });
      if ((g.startTime == 0L) || (g.jxH == 0L))
        ab.e("MicroMsg.BackupLogManager", "end is zero, startTime[%d], startLogSize[%d], skip report", new Object[] { Long.valueOf(g.startTime), Long.valueOf(g.jxH) });
      while (true)
      {
        return;
        g.endTime = bo.anU();
        g.jxI = localg.B(g.startTime, g.endTime);
        ab.i("MicroMsg.BackupLogManager", "end, backupMode[%d], endTime[%d], startTime[%d], endLogSize[%d], startLogSize[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(g.endTime), Long.valueOf(g.startTime), Long.valueOf(g.jxI), Long.valueOf(g.jxH) });
        if ((g.jxI != 0L) && (g.jxI > g.jxH))
          localg.a(paramInt, g.endTime - g.startTime, g.jxI - g.jxH, false);
        g.init();
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.BackupLogManager", localException, "end exception", new Object[0]);
    }
  }

  public static void ry(int paramInt)
  {
    if (jxk != null)
      jxk.jxP = paramInt;
  }

  public static void rz(int paramInt)
  {
    if (jxi != null)
    {
      j localj = jxi;
      localj.jxY = (paramInt + localj.jxY);
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    return 0;
  }

  public final void a(int paramInt, PByteArray arg2)
  {
    this.jxc = new PByteArray();
    this.jxc.value = ???.value;
    synchronized (jxe)
    {
      jxe.put(Integer.valueOf(paramInt), this);
      return;
    }
  }

  public abstract a aTS();

  public abstract a aTT();

  public boolean aUc()
  {
    boolean bool = true;
    try
    {
      byte[] arrayOfByte = aTT().toByteArray();
      synchronized (jxe)
      {
        int i = aUe();
        com.tencent.mm.plugin.backup.f.j.a(arrayOfByte, i, (short)getType(), this.jxc, jqS);
        if (jxg != null)
          jxg.i(i, this.jxc.value);
        ab.i("MicroMsg.BackupBaseScene", "doScene sendSeq[%d], type[%d], buflen[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(getType()), Integer.valueOf(this.jxc.value.length) });
        jxe.put(Integer.valueOf(i), this);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupBaseScene", localException, "req to buf fail: " + localException.toString(), new Object[0]);
        bool = false;
      }
    }
  }

  public final boolean aUd()
  {
    boolean bool = true;
    try
    {
      byte[] arrayOfByte = aTT().toByteArray();
      synchronized (jxe)
      {
        int i = aUe();
        com.tencent.mm.plugin.backup.f.j.a(arrayOfByte, i, (short)getType(), this.jxc, jqS);
        if (jxg != null)
          jxg.j(i, this.jxc.value);
        ab.i("MicroMsg.BackupBaseScene", "doSceneSameThread sendSeq[%d], type[%d], buflen[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(getType()), Integer.valueOf(this.jxc.value.length) });
        jxe.put(Integer.valueOf(i), this);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupBaseScene", localException, "req to buf fail: " + localException.toString(), new Object[0]);
        bool = false;
      }
    }
  }

  public abstract int getType();

  protected final void l(int paramInt1, int paramInt2, String paramString)
  {
    handler.post(new b.2(this, paramInt1, paramInt2, paramString));
  }

  public abstract void rw(int paramInt);

  public static abstract interface a
  {
    public abstract void i(int paramInt, byte[] paramArrayOfByte);

    public abstract int j(int paramInt, byte[] paramArrayOfByte);
  }

  public static abstract interface b
  {
    public abstract void fo(boolean paramBoolean);
  }

  public static abstract interface d
  {
    public abstract void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.b
 * JD-Core Version:    0.6.2
 */