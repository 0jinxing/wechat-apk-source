package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.g;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.backup.bakoldlogic.b.j;
import com.tencent.mm.plugin.backup.i.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.protocal.protobuf.gv;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  implements g
{
  boolean cAY;
  boolean eVT;
  boolean jsp;
  List<t> jzS;
  List<t> jzT;
  int jzU;
  public boolean jzV;
  long jzW;
  long jzX;
  int jzY;
  HashSet<String> jzr;
  e.d jzs;
  private com.tencent.mm.ai.f jzt;
  boolean jzu;
  int jzy;
  Object lock;

  public f()
  {
    AppMethodBeat.i(17868);
    this.lock = new Object();
    this.cAY = false;
    this.eVT = false;
    this.jzr = new HashSet();
    this.jzu = false;
    this.jzU = 0;
    this.jzV = false;
    this.jsp = false;
    this.jzy = 0;
    AppMethodBeat.o(17868);
  }

  public static int aT(List<t> paramList)
  {
    AppMethodBeat.i(17873);
    paramList = paramList.iterator();
    int i = 0;
    while (paramList.hasNext())
    {
      Object localObject1 = (t)paramList.next();
      try
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = com.tencent.mm.a.e.f(com.tencent.mm.plugin.backup.bakoldlogic.a.a.aUy() + "backupItem/" + com.tencent.mm.plugin.backup.bakoldlogic.a.a.Fb(((t)localObject1).ID) + ((t)localObject1).ID, 0, -1);
        localObject2 = new com/tencent/mm/protocal/protobuf/gv;
        ((gv)localObject2).<init>();
        int j = ((gv)((gv)localObject2).parseFrom((byte[])localObject1)).jBw.size();
        i = j + i;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.RecoverPCServer", localException, "", new Object[0]);
      }
    }
    AppMethodBeat.o(17873);
    return i;
  }

  final int a(String arg1, HashMap<String, Integer> paramHashMap, com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.c paramc, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(17875);
    long l1 = System.currentTimeMillis();
    byte[] arrayOfByte = com.tencent.mm.a.e.f(???, 0, -1);
    while (true)
    {
      Object localObject2;
      gv localgv;
      gu localgu;
      try
      {
        localObject2 = new com/tencent/mm/protocal/protobuf/gv;
        ((gv)localObject2).<init>();
        localgv = (gv)((gv)localObject2).parseFrom(arrayOfByte);
        Iterator localIterator = localgv.jBw.iterator();
        if (!localIterator.hasNext())
          break label1052;
        localgu = (gu)localIterator.next();
        if ((!this.cAY) || (this.eVT));
      }
      catch (Exception paramHashMap)
      {
        synchronized (this.lock)
        {
          try
          {
            this.lock.wait();
            if (this.eVT)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "backupImp canceled");
              i = -1;
              AppMethodBeat.o(17875);
              return i;
              paramHashMap = paramHashMap;
              if (arrayOfByte == null)
              {
                i = 0;
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.RecoverPCServer", "read mmPath errr %s, %s, len:%d", new Object[] { ???, paramHashMap, Integer.valueOf(i) });
                com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.RecoverPCServer", paramHashMap, "", new Object[0]);
                i = 0;
                AppMethodBeat.o(17875);
                continue;
              }
              i = arrayOfByte.length;
              continue;
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.RecoverPCServer", localInterruptedException, "", new Object[0]);
            continue;
          }
        }
      }
      try
      {
        str = (String)com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().Ry().get(2, null);
        localh = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().XO();
        localObject1 = localgu.vEB.wVI;
        ??? = localgu.vEC.wVI;
        if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil(???)))
        {
          localObject2 = localObject1;
          if (localObject1 == null)
            localObject2 = "null";
          localObject1 = ???;
          if (??? == null)
            localObject1 = "null";
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BackupPackMsgLogic", "recoverMsg fromUserName or toUserName is null, fromUserName[%s], toUserName[%s]", new Object[] { localObject2, localObject1 });
          this.jzy += 1;
          if (this.jzy % 100 == 0)
            aUT();
          com.tencent.mm.plugin.backup.c.e.rm(localgu.jCt);
          l2 = bo.anU();
          if (l2 - paramc.eRt <= 10000L)
            continue;
          paramc.end();
          paramc.begin();
          paramc.eRt = l2;
          continue;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BackupPackMsgLogic", "recoverMsg, type[%d], from[%s], to[%s]", new Object[] { Integer.valueOf(localgu.jCt), localObject1, ??? });
        localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ();
        if (((com.tencent.mm.plugin.backup.bakoldlogic.d.c)localObject2).uin == 0)
        {
          ??? = new com/tencent/mm/model/b;
          ???.<init>();
          AppMethodBeat.o(17875);
          throw ???;
        }
      }
      catch (Exception )
      {
        while (true)
        {
          String str;
          h localh;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.RecoverPCServer", "readFromSdcard err:" + ???.toString());
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.RecoverPCServer", ???, "", new Object[0]);
          continue;
          localObject2 = ((com.tencent.mm.plugin.backup.bakoldlogic.d.c)localObject2).jys;
          bd localbd = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().XM();
          if ((((k)localObject2).has((String)localObject1)) || (str.equals(localObject1)))
          {
            i = 1;
            label556: if (i == 0)
              break label665;
            localObject2 = ???;
            label564: if (localgu.vJh == 0L)
              break label672;
          }
          label665: label672: for (long l2 = localgu.vJh; ; l2 = localgu.vIZ * 1000L)
          {
            paramHashSet.add(localObject2);
            List localList = com.tencent.mm.plugin.backup.bakoldlogic.a.a.Ko();
            if ((!localList.contains(localObject1)) && (!localList.contains(???)))
              break label687;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("recoverMsg hit the blockList: ");
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BackupPackMsgLogic", (String)localObject1 + " " + ???);
            break;
            i = 0;
            break label556;
            localObject2 = localObject1;
            break label564;
          }
          label687: if ((localgu.ptF == 0L) && (localgu.ptD != 0))
            localgu.ptF = localgu.ptD;
          if (localgu.ptF != 0L)
          {
            if (str.equals(localObject1));
            while (true)
            {
              ??? = localh.Q(???, localgu.ptF);
              if (???.field_msgId == 0L)
                break label789;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BackupPackMsgLogic", "recoverMsg msg exist");
              break;
              ??? = (String)localObject1;
            }
          }
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BackupPackMsgLogic", "recoverMsg drop the item server id < 0");
          continue;
          label789: if (localgu.ptF != 0L)
            ???.eI(localgu.ptF);
          ???.eL(localgu.vJg);
          ???.eJ(l2);
          ???.hY(localgu.vJi);
          ???.setType(localgu.jCt);
          Object localObject1 = localbd.aoO((String)localObject2);
          if ((localObject1 != null) && (!bo.isNullOrNil(((ap)localObject1).field_username)) && (((ad)localObject1).dsf()))
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BackupPackMsgLogic", "recoverMsg hit the blockList: ".concat(String.valueOf(localObject2)));
          }
          else
          {
            if (i != 0)
            {
              j = 1;
              label905: ???.hO(j);
              ???.ju((String)localObject2);
              if (i == 0)
                break label1030;
            }
            label1030: for (int j = localgu.vIY; ; j = 4)
            {
              ???.setStatus(j);
              if (paramHashMap.get(localObject2) == null)
                paramHashMap.put(localObject2, Integer.valueOf(0));
              if ((i == 0) && (localgu.vIY == 3))
                paramHashMap.put(localObject2, Integer.valueOf(bo.a((Integer)paramHashMap.get(localObject2), 0) + 1));
              localObject1 = com.tencent.mm.plugin.backup.bakoldlogic.b.d.aUA().rD(localgu.jCt);
              if (localObject1 != null)
                break label1036;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BackupPackMsgLogic", "recoverMsg unknown type");
              break;
              j = 0;
              break label905;
            }
            label1036: ((j)localObject1).a(str, localgu, ???);
          }
        }
      }
      label1052: com.tencent.mm.plugin.backup.c.e.aSS();
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.RecoverPCServer", "read item time " + (System.currentTimeMillis() - l1));
      int i = localgv.jBw.size();
      AppMethodBeat.o(17875);
    }
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(17877);
    this.jzX += paramInt1;
    if (this.jzW == 0L)
    {
      paramInt1 = 0;
      if (paramInt1 > this.jzY)
      {
        this.jzY = paramInt1;
        com.tencent.mm.plugin.backup.bakoldlogic.c.d.setProgress(this.jzY);
      }
      if ((this.cAY) || (this.eVT) || (this.jzs == null) || (this.jzY < 0) || (this.jzY > 100))
        break label123;
      this.jzs.rI(this.jzY);
      AppMethodBeat.o(17877);
    }
    while (true)
    {
      return;
      paramInt1 = (int)(this.jzX * 100L / this.jzW);
      break;
      label123: com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.RecoverPCServer", "failed to call operatorCallback.onNetProgress:%d", new Object[] { Integer.valueOf(this.jzY) });
      AppMethodBeat.o(17877);
    }
  }

  final void aUS()
  {
    AppMethodBeat.i(17872);
    if ((!this.jzu) || (this.eVT))
      AppMethodBeat.o(17872);
    while (true)
    {
      return;
      synchronized (this.lock)
      {
        if (this.jzr.isEmpty())
        {
          if (this.eVT)
          {
            AppMethodBeat.o(17872);
            continue;
          }
          this.jzV = true;
          this.jzY = 0;
          a.aUB().aUC().jzK = 6;
          a.aUB().aUC().jzL = 5;
          if (this.jzs == null)
            break label146;
          this.jzs.aUP();
          com.tencent.mm.plugin.backup.g.b.b(7, this.jzt);
          dB(0, 0);
          e.aUN();
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "checkRecover publicRestAccUinEven");
        }
        AppMethodBeat.o(17872);
        continue;
        label146: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "operatorCallback is null");
      }
    }
  }

  public final void aUT()
  {
    AppMethodBeat.i(17876);
    System.gc();
    long l1 = Runtime.getRuntime().freeMemory() / 1000L;
    long l2 = Runtime.getRuntime().totalMemory() / 1000L;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "memoryInfo avail/total, dalvik[%dk, %dk, user:%dk], recoverCnt:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l2 - l1), Integer.valueOf(this.jzy) });
    AppMethodBeat.o(17876);
  }

  public final void cancel()
  {
    AppMethodBeat.i(17871);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "cancel");
    this.eVT = true;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      com.tencent.mm.plugin.backup.g.b.b(7, this.jzt);
      this.jzs = null;
      this.jzV = false;
      this.jsp = false;
      this.jzU = 0;
      this.jzY = 0;
      AppMethodBeat.o(17871);
      return;
    }
  }

  final void dB(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(17874);
    long l;
    int i;
    if (paramInt1 == 0)
    {
      l = 0L;
      i = (int)l;
      if (((paramInt1 == 0) && (paramInt2 == 0)) || (i > this.jzU))
        break label53;
      AppMethodBeat.o(17874);
    }
    while (true)
    {
      return;
      l = paramInt1 * 100L / paramInt2;
      break;
      label53: this.jzU = i;
      if ((!this.cAY) && (!this.eVT) && (this.jzs != null) && (this.jzU >= 0) && (this.jzU <= 100))
        this.jzs.rJ(this.jzU);
      com.tencent.mm.plugin.backup.i.ab localab = new com.tencent.mm.plugin.backup.i.ab();
      localab.jBh = 13;
      localab.jCI = 0;
      localab.jCJ = this.jzU;
      try
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "send progress cmd, progress :%d", new Object[] { Integer.valueOf(i) });
        com.tencent.mm.plugin.backup.g.b.K(localab.toByteArray(), 3);
        AppMethodBeat.o(17874);
      }
      catch (IOException localIOException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.RecoverPCServer", localIOException, "", new Object[0]);
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.RecoverPCServer", "buf to PacketCommandRequest err");
        AppMethodBeat.o(17874);
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(17869);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "pause");
    this.cAY = true;
    AppMethodBeat.o(17869);
  }

  public final void resume()
  {
    AppMethodBeat.i(17870);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "resume");
    this.cAY = false;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      AppMethodBeat.o(17870);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.f
 * JD-Core Version:    0.6.2
 */