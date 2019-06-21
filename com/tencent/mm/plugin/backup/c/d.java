package com.tencent.mm.plugin.backup.c;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.aa;
import com.tencent.mm.g.a.bp;
import com.tencent.mm.g.a.qo;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.b.d;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.h.a.2;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.protocal.protobuf.gv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.wcdb.DatabaseUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private static boolean jsA = false;
  private static int jsx = 0;
  private static int jsy = 1;
  private static int jsz = 2;
  private boolean eVT;
  private final int jqS;
  private final com.tencent.mm.plugin.backup.b.d jrF;
  private HashMap<String, Pair<Long, Long>> jsB;
  private d.a jsC;
  private boolean jsD;
  private int jsE;
  public boolean jsp;
  private final HashMap<String, String> jsq;
  private HashSet<String> jsr;
  private final int jss;
  private final long jst;
  private long jsu;
  private b.d jsv;
  private int jsw;
  private Object lock;

  public d(com.tencent.mm.plugin.backup.b.d paramd, int paramInt1, b.d paramd1, int paramInt2, boolean paramBoolean, LinkedList<String> paramLinkedList, LinkedList<Long> paramLinkedList1)
  {
    AppMethodBeat.i(17203);
    this.jsp = false;
    this.jsr = new HashSet();
    this.lock = new Object();
    this.jsw = jsx;
    this.jsq = aw.ZK().Yr().dry();
    this.jrF = paramd;
    this.jqS = paramInt1;
    this.jsv = paramd1;
    this.jss = paramInt2;
    jsA = paramBoolean;
    this.jst = DatabaseUtils.longForQuery(aw.ZK().Yr().fni.dvx(), "SELECT COUNT(*) FROM BackupRecoverMsgListDataId", null);
    this.jsB = c(paramLinkedList, paramLinkedList1);
    this.jsr.clear();
    this.jsu = 0L;
    ab.i("MicroMsg.BackupRecoverMerger", "BackupRecoverMerger, msgListDataIdHashMap size[%d], backupMode[%d], totalMsgList[%d], totalSession[%d], isQuickBackup[%b]", new Object[] { Integer.valueOf(this.jsq.size()), Integer.valueOf(paramInt1), Long.valueOf(this.jst), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(17203);
  }

  private int a(String arg1, HashMap<String, Integer> paramHashMap, HashMap<String, LinkedList<Long>> paramHashMap1)
  {
    AppMethodBeat.i(17206);
    long l1 = bo.anU();
    Object localObject1 = com.tencent.mm.vfs.e.e(???, 0, -1);
    while (true)
    {
      Object localObject3;
      Object localObject4;
      int i;
      try
      {
        gv localgv = new com/tencent/mm/protocal/protobuf/gv;
        localgv.<init>();
        localObject3 = (gv)localgv.parseFrom((byte[])localObject1);
        Iterator localIterator = ((gv)localObject3).jBw.iterator();
        if (localIterator.hasNext())
          localObject4 = (gu)localIterator.next();
      }
      catch (Exception localException)
      {
        synchronized (this.lock)
        {
          if (this.eVT)
          {
            ab.i("MicroMsg.BackupRecoverMerger", "backupImp canceled");
            i = -1;
            AppMethodBeat.o(17206);
            return i;
            localException = localException;
            paramHashMap1 = "";
            paramHashMap = paramHashMap1;
          }
        }
      }
      try
      {
        localObject3 = new com/tencent/mm/vfs/b;
        paramHashMap = paramHashMap1;
        ((com.tencent.mm.vfs.b)localObject3).<init>(???);
        paramHashMap = paramHashMap1;
        localObject4 = new java/lang/StringBuilder;
        paramHashMap = paramHashMap1;
        ((StringBuilder)localObject4).<init>();
        paramHashMap = paramHashMap1;
        paramHashMap1 = "" + ((com.tencent.mm.vfs.b)localObject3).exists() + ",";
        paramHashMap = paramHashMap1;
        localObject4 = new java/lang/StringBuilder;
        paramHashMap = paramHashMap1;
        ((StringBuilder)localObject4).<init>();
        paramHashMap = paramHashMap1;
        paramHashMap1 = paramHashMap1 + ((com.tencent.mm.vfs.b)localObject3).canRead() + ",";
        paramHashMap = paramHashMap1;
        localObject4 = new java/lang/StringBuilder;
        paramHashMap = paramHashMap1;
        ((StringBuilder)localObject4).<init>();
        paramHashMap = paramHashMap1;
        paramHashMap1 = paramHashMap1 + ((com.tencent.mm.vfs.b)localObject3).length() + ".";
        paramHashMap = paramHashMap1;
        label249: if (localObject1 == null);
        for (i = -1; ; i = localObject1.length)
        {
          ab.printErrStackTrace("MicroMsg.BackupRecoverMerger", localException, "read mmPath err %s [%s] buflen:%d %s,", new Object[] { ???, paramHashMap, Integer.valueOf(i), localException });
          i = 0;
          AppMethodBeat.o(17206);
          break;
        }
        if ((jsA) && (((gu)localObject4).jCt != 1))
          continue;
        try
        {
          localObject5 = this.jsB;
          str = (String)com.tencent.mm.plugin.backup.h.d.aUr().aUs().Ry().get(2, null);
          localh = com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO();
          localObject1 = ((gu)localObject4).vEB.wVI;
          ??? = ((gu)localObject4).vEC.wVI;
          if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil(???)))
          {
            localObject2 = localObject1;
            if (localObject1 == null)
              localObject2 = "null";
            localObject1 = ???;
            if (??? == null)
              localObject1 = "null";
            ab.w("MicroMsg.BackupMsgLogic", "recoverMsg fromUserName or toUserName is null, fromUserName[%s], toUserName[%s]", new Object[] { localObject2, localObject1 });
            e.rm(((gu)localObject4).jCt);
            aSK().aSR();
            continue;
            paramHashMap = finally;
            AppMethodBeat.o(17206);
            throw paramHashMap;
          }
          ab.i("MicroMsg.BackupMsgLogic", "recoverMsg, type[%d], from[%s], to[%s]", new Object[] { Integer.valueOf(((gu)localObject4).jCt), localObject1, ??? });
          localObject2 = com.tencent.mm.plugin.backup.h.d.aUr().aUs();
          if (((com.tencent.mm.plugin.backup.h.b)localObject2).uin == 0)
          {
            ??? = new com/tencent/mm/model/b;
            ???.<init>();
            AppMethodBeat.o(17206);
            throw ???;
          }
        }
        catch (Exception )
        {
          while (true)
          {
            Object localObject5;
            String str;
            com.tencent.mm.plugin.messenger.foundation.a.a.h localh;
            ab.printErrStackTrace("MicroMsg.BackupRecoverMerger", ???, "readFromSdcard recoverMsg err", new Object[0]);
            continue;
            Object localObject2 = ((com.tencent.mm.plugin.backup.h.b)localObject2).jys;
            bd localbd = com.tencent.mm.plugin.backup.h.d.aUr().aUs().XM();
            if ((((k)localObject2).has((String)localObject1)) || (str.equals(localObject1)))
            {
              i = 1;
              label602: if (i == 0)
                break label759;
              localObject2 = ???;
              label610: if (((gu)localObject4).vJh == 0L)
                break label766;
            }
            label759: label766: for (long l2 = ((gu)localObject4).vJh; ; l2 = ((gu)localObject4).vIZ * 1000L)
            {
              if (localObject5 != null)
              {
                localObject5 = (Pair)((HashMap)localObject5).get(localObject2);
                if ((localObject5 != null) && ((l2 < ((Long)((Pair)localObject5).first).longValue()) || (l2 > ((Long)((Pair)localObject5).second).longValue())))
                  break;
              }
              localObject5 = g.Ko();
              if ((!((List)localObject5).contains(localObject1)) && (!((List)localObject5).contains(???)))
                break label781;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("recoverMsg hit the blockList: ");
              ab.w("MicroMsg.BackupMsgLogic", (String)localObject1 + " " + ???);
              break;
              i = 0;
              break label602;
              localObject2 = localObject1;
              break label610;
            }
            label781: if ((((gu)localObject4).ptF == 0L) && (((gu)localObject4).ptD != 0))
              ((gu)localObject4).ptF = ((gu)localObject4).ptD;
            if (((gu)localObject4).ptF != 0L)
            {
              if (str.equals(localObject1));
              while (true)
              {
                ??? = localh.Q(???, ((gu)localObject4).ptF);
                if (???.field_msgId == 0L)
                  break label883;
                ab.i("MicroMsg.BackupMsgLogic", "recoverMsg msg exist");
                break;
                ??? = (String)localObject1;
              }
            }
            ab.w("MicroMsg.BackupMsgLogic", "recoverMsg drop the item server id < 0");
            continue;
            label883: if (((gu)localObject4).ptF != 0L)
              ???.eI(((gu)localObject4).ptF);
            ???.eL(((gu)localObject4).vJg);
            localObject1 = (LinkedList)paramHashMap1.get(localObject2);
            if ((localObject1 != null) && (((LinkedList)localObject1).size() > 0))
              if (l2 != ((Long)((LinkedList)localObject1).getFirst()).longValue())
              {
                ((LinkedList)localObject1).clear();
                label958: ((LinkedList)localObject1).add(Long.valueOf(l2));
              }
            while (true)
            {
              ???.eJ(l2);
              ???.hY(((gu)localObject4).vJi);
              ???.setType(((gu)localObject4).jCt);
              localObject1 = localbd.aoO((String)localObject2);
              if ((localObject1 == null) || (bo.isNullOrNil(((ap)localObject1).field_username)) || (!((ad)localObject1).dsf()))
                break label1099;
              ab.w("MicroMsg.BackupMsgLogic", "recoverMsg hit the blockList: ".concat(String.valueOf(localObject2)));
              break;
              l2 = ((Long)((LinkedList)localObject1).getLast()).longValue() + 1L;
              break label958;
              localObject1 = new java/util/LinkedList;
              ((LinkedList)localObject1).<init>();
              ((LinkedList)localObject1).add(Long.valueOf(l2));
              paramHashMap1.put(localObject2, localObject1);
            }
            label1099: if (i != 0)
            {
              j = 1;
              label1107: ???.hO(j);
              ???.ju((String)localObject2);
              if (i == 0)
                break label1232;
            }
            label1232: for (int j = ((gu)localObject4).vIY; ; j = 4)
            {
              ???.setStatus(j);
              if (paramHashMap.get(localObject2) == null)
                paramHashMap.put(localObject2, Integer.valueOf(0));
              if ((i == 0) && (((gu)localObject4).vIY == 3))
                paramHashMap.put(localObject2, Integer.valueOf(bo.a((Integer)paramHashMap.get(localObject2), 0) + 1));
              localObject1 = com.tencent.mm.plugin.backup.f.c.aTz().rq(((gu)localObject4).jCt);
              if (localObject1 != null)
                break label1238;
              ab.i("MicroMsg.BackupMsgLogic", "recoverMsg unknown type");
              break;
              j = 0;
              break label1107;
            }
            label1238: ((com.tencent.mm.plugin.backup.f.l)localObject1).a(str, (gu)localObject4, ???);
          }
        }
        e.aSS();
        ab.i("MicroMsg.BackupRecoverMerger", "readFromSdcard merge item time[%d]", new Object[] { Long.valueOf(bo.gb(l1)) });
        i = ((gv)localObject3).jBw.size();
        AppMethodBeat.o(17206);
      }
      catch (Exception paramHashMap1)
      {
        break label249;
      }
    }
  }

  private d.a aSK()
  {
    AppMethodBeat.i(17202);
    if (this.jsC == null)
      this.jsC = new d.a(this, (byte)0);
    d.a locala = this.jsC;
    AppMethodBeat.o(17202);
    return locala;
  }

  private void aSM()
  {
    AppMethodBeat.i(17208);
    this.jsp = false;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      AppMethodBeat.o(17208);
      return;
    }
  }

  public static void aSN()
  {
    AppMethodBeat.i(17210);
    ab.i("MicroMsg.BackupRecoverMerger", "backupFinishMerge");
    com.tencent.mm.sdk.b.a.xxA.m(new bp());
    com.tencent.mm.sdk.b.a.xxA.m(new aa());
    com.tencent.mm.vfs.e.N(g.aSF(), true);
    com.tencent.mm.plugin.backup.h.a locala = com.tencent.mm.plugin.backup.h.d.aUr().aUt();
    locala.handler.post(new a.2(locala));
    aw.ZK();
    com.tencent.mm.model.c.XO().bOA();
    com.tencent.mm.sdk.b.a.xxA.m(new qo());
    com.tencent.mm.sdk.a.b.pf(false);
    AppMethodBeat.o(17210);
  }

  public static void aSO()
  {
    AppMethodBeat.i(17211);
    com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO().QW("BACKUP_MERGE_LOCK");
    AppMethodBeat.o(17211);
  }

  public static void aSP()
  {
    AppMethodBeat.i(17212);
    com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO().QX("BACKUP_MERGE_LOCK");
    AppMethodBeat.o(17212);
  }

  private static HashMap<String, Pair<Long, Long>> c(LinkedList<String> paramLinkedList, LinkedList<Long> paramLinkedList1)
  {
    AppMethodBeat.i(17204);
    HashMap localHashMap = new HashMap();
    paramLinkedList1 = paramLinkedList1.iterator();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      String str = (String)paramLinkedList.next();
      if (paramLinkedList1.hasNext())
      {
        long l1 = ((Long)paramLinkedList1.next()).longValue();
        long l2 = l1;
        if (l1 == 0L)
          l2 = -9223372036854775808L;
        if (!paramLinkedList1.hasNext())
          break;
        long l3 = ((Long)paramLinkedList1.next()).longValue();
        l1 = l3;
        if (l3 == 0L)
          l1 = 9223372036854775807L;
        localHashMap.put(str, new Pair(Long.valueOf(l2), Long.valueOf(l1)));
      }
    }
    AppMethodBeat.o(17204);
    return localHashMap;
  }

  public final void aSL()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(17205);
        if (this.jsp)
        {
          ab.e("MicroMsg.BackupRecoverMerger", "hasStartMerge , return");
          AppMethodBeat.o(17205);
          return;
        }
        this.jsp = true;
        ab.i("MicroMsg.BackupRecoverMerger", "startMerge");
        this.jrF.aSv();
        com.tencent.mm.plugin.backup.h.d.aUr().aUu();
        ab.i("MicroMsg.BackupRecoverMerger", "backupStartMerge");
        com.tencent.mm.sdk.a.b.pf(true);
        aSO();
        this.jsw = jsy;
        if (this.jqS == 1)
        {
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xPD, Boolean.TRUE);
          ab.i("MicroMsg.BackupRecoverMerger", "recoverFromSdcardImp start, mergeState[%d], totalMsgList size[%d], msgListDataIdHashMap size[%d]", new Object[] { Integer.valueOf(this.jsw), Long.valueOf(this.jst), Integer.valueOf(this.jsq.size()) });
          d.1 local1 = new com/tencent/mm/plugin/backup/c/d$1;
          local1.<init>(this);
          com.tencent.mm.sdk.g.d.a(local1, "BackupRecoverMerger_recoverFromSdcard", 1).start();
          AppMethodBeat.o(17205);
          continue;
        }
      }
      finally
      {
      }
      if (this.jqS == 2)
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xPG, Boolean.TRUE);
      }
    }
  }

  public final void l(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(17207);
    synchronized (this.lock)
    {
      ab.i("MicroMsg.BackupRecoverMerger", "cancel, needClearContinueRecoverData[%b], mergeState[%d], updateState[%d]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(this.jsw), Integer.valueOf(paramInt) });
      this.eVT = true;
      this.jsD = paramBoolean;
      this.jsE = paramInt;
      AppMethodBeat.o(17207);
      return;
    }
  }

  public final void rl(int paramInt)
  {
    AppMethodBeat.i(17209);
    if (this.jsv != null)
      this.jsv.rj(paramInt);
    AppMethodBeat.o(17209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.d
 * JD-Core Version:    0.6.2
 */