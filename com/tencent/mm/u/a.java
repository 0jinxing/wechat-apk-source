package com.tencent.mm.u;

import a.f.b.j;
import android.os.SystemClock;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.mk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.Map;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/engine/FunctionMsgEngine;", "Lcom/tencent/mm/api/IFunctionMsgEngine;", "Lcom/tencent/mm/engine/ITimerCallback;", "Lcom/tencent/mm/plugin/messenger/foundation/api/IFunctionMsgService;", "()V", "TAG", "", "isInit", "", "isNeedCheckSoon", "lastContinueSync", "", "mDispatcher", "Lcom/tencent/mm/api/IFunctionMsgDispatcher;", "mLastCheckTime", "mTimer", "Lcom/tencent/mm/engine/FunctionMsgTimer;", "afterSyncDoCmd", "", "beforeSyncDoCmd", "checkFromDb", "isNeedCheckTimer", "onInit", "onReceive", "addMsg", "Lcom/tencent/mm/protocal/protobuf/AddMsg;", "values", "", "onTaskExpired", "op", "", "task", "Lcom/tencent/mm/engine/FunctionMsgTask;", "parseAddMsg", "Lcom/tencent/mm/api/FunctionMsgItem;", "functionMsg", "Lcom/tencent/mm/engine/FunctionMsgEngine$FunctionMsg;", "reportException", "isContinueSync", "FunctionMsg", "plugin-functionmsg_release"})
public final class a
  implements com.tencent.mm.api.m, com.tencent.mm.plugin.messenger.foundation.a.h, f
{
  private static boolean bZi;
  private static long cbv;
  public static final a eAA;
  private static long eAw;
  private static final e eAx;
  private static boolean eAy;
  private static final com.tencent.mm.api.l eAz;

  static
  {
    AppMethodBeat.i(35463);
    a locala = new a();
    eAA = locala;
    bZi = true;
    eAx = new e((f)locala);
    eAz = (com.tencent.mm.api.l)new com.tencent.mm.s.a();
    AppMethodBeat.o(35463);
  }

  public final void Pl()
  {
    AppMethodBeat.i(35459);
    if (bZi)
    {
      ab.i("FunctionMsg.FunctionMsgEngine", "[checkFromDb] begin!");
      Object localObject1 = ba.xZa;
      localObject1 = ((Iterable)ba.dtn()).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        com.tencent.mm.api.f localf = (com.tencent.mm.api.f)((Iterator)localObject1).next();
        ab.i("FunctionMsg.FunctionMsgEngine", "[checkFromDb] item:%s", new Object[] { localf });
        if (localf.Ah() != -1)
        {
          Object localObject2 = com.tencent.mm.v.a.eAM;
          localObject2 = com.tencent.mm.v.a.jo(localf.Ah());
          if (localObject2 != null)
            eAx.a(localf.Ah(), localf, (com.tencent.mm.v.b)localObject2);
        }
      }
      localObject1 = ba.xZa;
      ba.dto();
      bZi = false;
    }
    ab.i("FunctionMsg.FunctionMsgEngine", "[beforeSyncDoCmd] isInit:" + bZi);
    AppMethodBeat.o(35459);
  }

  public final void Pm()
  {
    AppMethodBeat.i(35460);
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    long l = ((com.tencent.mm.kernel.e)localObject).Ry().Mm(8196);
    boolean bool1;
    boolean bool2;
    if ((0x7 & l) != 0L)
    {
      bool1 = true;
      if ((!eAy) && (System.currentTimeMillis() - cbv < 15000L))
        break label263;
      bool2 = true;
      label62: ab.i("FunctionMsg.FunctionMsgEngine", "[isNeedCheckTimer] continueFlag:" + l + ", isContinueSync:" + bool1 + ", isNeedCheck:" + bool2 + ", isNeedCheckSoon:" + eAy);
      if (!bool1)
        break label269;
      l = SystemClock.uptimeMillis();
      label123: eAw = l;
      if (0L != eAw)
      {
        l = SystemClock.uptimeMillis();
        if (l - eAw < 1800000L)
          break label274;
        com.tencent.mm.plugin.report.service.h.pYm.a(1021L, 0L, 1L, true);
      }
      label163: if ((bool1) || (!bool2))
        break label330;
    }
    label263: label269: label274: label330: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        localObject = eAx;
        l = System.currentTimeMillis();
        ((e)localObject).eAK.loop();
        ab.i("FunctionMsg.FunctionMsgTimer", "[check] Cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        cbv = System.currentTimeMillis();
        eAy = false;
        ab.i("FunctionMsg.FunctionMsgEngine", "[afterSyncDoCmd] check time:%s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      }
      AppMethodBeat.o(35460);
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label62;
      l = 0L;
      break label123;
      if (l - eAw >= 1200000L)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(1021L, 1L, 1L, true);
        break label163;
      }
      if (l - eAw < 600000L)
        break label163;
      com.tencent.mm.plugin.report.service.h.pYm.a(1021L, 2L, 1L, true);
      break label163;
    }
  }

  public final void a(int paramInt, d paramd)
  {
    AppMethodBeat.i(35462);
    j.p(paramd, "task");
    ab.i("FunctionMsg.FunctionMsgEngine", "[onTaskExpired] id:" + paramd.eAH.Ai() + " op:" + paramInt + " status:" + paramd.eAH.getStatus());
    paramd.eAI.a(eAx, eAz, paramd);
    AppMethodBeat.o(35462);
  }

  public final void a(cm paramcm, Map<String, String> paramMap)
  {
    AppMethodBeat.i(35461);
    j.p(paramcm, "addMsg");
    j.p(paramMap, "values");
    int i = bo.getInt((String)paramMap.get(".sysmsg.functionmsg.op"), 0);
    ab.i("FunctionMsg.FunctionMsgEngine", "[onReceive], addMsg.createTime: %s op:%s", new Object[] { Integer.valueOf(paramcm.pcX), Integer.valueOf(i) });
    eAy = true;
    long l1 = System.currentTimeMillis();
    a.a locala = new a.a(paramcm, paramMap);
    paramMap = locala.values;
    String str1 = (String)paramMap.get(".sysmsg.functionmsg.cgi");
    int j = bo.getInt((String)paramMap.get(".sysmsg.functionmsg.cmdid"), 0);
    String str2 = (String)paramMap.get(".sysmsg.functionmsg.functionmsgid");
    long l2 = bo.getLong((String)paramMap.get(".sysmsg.functionmsg.version"), 0L);
    int k = bo.getInt((String)paramMap.get(".sysmsg.functionmsg.op"), 0);
    int m = bo.getInt((String)paramMap.get(".sysmsg.functionmsg.retryinterval"), 0);
    int n = bo.getInt((String)paramMap.get(".sysmsg.functionmsg.reportid"), 0);
    int i1 = bo.getInt((String)paramMap.get(".sysmsg.functionmsg.successkey"), 0);
    i = bo.getInt((String)paramMap.get(".sysmsg.functionmsg.failkey"), 0);
    int i2 = bo.getInt((String)paramMap.get(".sysmsg.functionmsg.finalfailkey"), 0);
    String str3 = (String)paramMap.get(".sysmsg.functionmsg.custombuff");
    long l3 = bo.getLong((String)paramMap.get(".sysmsg.functionmsg.businessid"), 0L);
    Object localObject = (String)paramMap.get(".sysmsg.functionmsg.businessbuff");
    long l4 = bo.getLong((String)paramMap.get(".sysmsg.functionmsg.actiontime"), 0L);
    long l5 = bo.getLong((String)paramMap.get(".sysmsg.functionmsg.delaytime"), 0L);
    int i3 = bo.getInt((String)paramMap.get(".sysmsg.functionmsg.retrycount"), 0);
    paramMap = aa.a(locala.eAB.vED);
    j.o(paramMap, "content");
    int i4 = a.k.m.a((CharSequence)paramMap, "<addmsg>", 0, false, 6);
    int i5 = a.k.m.a((CharSequence)paramMap, "</addmsg>", 0, false, 6) + 9;
    if ((i5 > i4) && (i5 != -1) && (i4 != -1))
    {
      paramMap = paramMap.substring(i4, i5);
      j.o(paramMap, "(this as java.lang.Strin…ing(startIndex, endIndex)");
    }
    while (true)
    {
      ab.i("FunctionMsg.FunctionMsgEngine", "parseAddMsg,op:%s cgi: %s, cmdId: %s, functionMsgId: %s, version: %s, retryInterval: %s, reportId: %s, successKey: %s, failKey: %s, finalKey: %s, customBuff: %s businessid:%s businessbuff:%s actiontime:%s delaytime:%s retryCount:%s", new Object[] { Integer.valueOf(k), str1, Integer.valueOf(j), str2, Long.valueOf(l2), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i), Integer.valueOf(i2), str3, Long.valueOf(l3), localObject, Long.valueOf(l4), Long.valueOf(l5), Integer.valueOf(i3) });
      com.tencent.mm.api.f localf = new com.tencent.mm.api.f();
      localf.ga(k);
      localf.cD(str1);
      localf.setCmdId(j);
      if (str2 == null)
        j.dWJ();
      localf.cE(str2);
      localf.aG(l2);
      localf.setRetryInterval(m);
      localf.gb(n);
      localf.gc(i1);
      localf.gd(i);
      localf.ge(i2);
      localf.cF(str3);
      localf.Ao();
      localf.a(locala.eAB);
      localf.cG(paramMap);
      paramMap = new mk();
      paramMap.vQj = l3;
      if (!bo.isNullOrNil((String)localObject))
        paramMap.vQk = new com.tencent.mm.bt.b(Base64.decode((String)localObject, 0));
      localf.a(paramMap);
      localf.aJ(l4);
      localf.aI(l5);
      localf.Ap();
      localf.gf(i3);
      paramMap = ba.xZa;
      paramMap = localf.Ai();
      j.o(paramMap, "item.functionMsgId");
      paramMap = ba.apy(paramMap);
      if (paramMap != null)
        ab.i("FunctionMsg.FunctionMsgEngine", "[handleFunctionMsgItem], old functionMsgItem:%s", new Object[] { paramMap });
      while (true)
      {
        localObject = com.tencent.mm.v.a.eAM;
        localObject = com.tencent.mm.v.a.jo(localf.Ah());
        if (localObject != null)
          ((com.tencent.mm.v.b)localObject).a(eAx, eAz, ba.xZa, localf, paramMap, paramcm.pcX);
        ab.i("FunctionMsg.FunctionMsgEngine", "[onReceive] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        AppMethodBeat.o(35461);
        return;
        ab.i("FunctionMsg.FunctionMsgEngine", "[handleFunctionMsgItem], has not exist! id:%s", new Object[] { localf.Ai() });
      }
      paramMap = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.u.a
 * JD-Core Version:    0.6.2
 */