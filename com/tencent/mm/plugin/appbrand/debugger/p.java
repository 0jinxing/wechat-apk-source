package com.tencent.mm.plugin.appbrand.debugger;

import android.webkit.ValueCallback;
import com.eclipsesource.v8.V8Inspector;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.r;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.protocal.protobuf.cqn;
import com.tencent.mm.protocal.protobuf.cqo;
import com.tencent.mm.protocal.protobuf.cqp;
import com.tencent.mm.protocal.protobuf.cqq;
import com.tencent.mm.protocal.protobuf.cqs;
import com.tencent.mm.protocal.protobuf.cqt;
import com.tencent.mm.protocal.protobuf.cqw;
import com.tencent.mm.protocal.protobuf.cqy;
import com.tencent.mm.protocal.protobuf.cra;
import com.tencent.mm.protocal.protobuf.crc;
import com.tencent.mm.protocal.protobuf.crd;
import com.tencent.mm.protocal.protobuf.cre;
import com.tencent.mm.protocal.protobuf.crg;
import com.tencent.mm.protocal.protobuf.crp;
import com.tencent.mm.protocal.protobuf.crq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import org.json.JSONArray;

public final class p
{
  private static final Map<String, String[]> hkk;
  l hjR;
  s hjT;
  u hjW;
  private ae<Integer, Long> hkl;
  private boolean hkm;
  private long hkn;
  private LinkedList<o> hko;
  private final int hkp;
  private int hkq;
  private long hkr;
  Timer mTimer;

  static
  {
    AppMethodBeat.i(101889);
    HashMap localHashMap = new HashMap();
    hkk = localHashMap;
    localHashMap.put("publishHandler", new String[] { "String", "String", "String" });
    hkk.put("invokeHandler", new String[] { "String", "String", "Number" });
    AppMethodBeat.o(101889);
  }

  public p()
  {
    AppMethodBeat.i(101861);
    this.hkl = new ae(100);
    this.hkm = false;
    this.hko = new LinkedList();
    this.hkp = 5000;
    this.hkq = 0;
    this.hkr = 0L;
    V8Inspector.setServer(new p.1(this));
    AppMethodBeat.o(101861);
  }

  private void a(cqn paramcqn)
  {
    AppMethodBeat.i(101869);
    if (this.hjR.azb() == paramcqn.xos)
    {
      AppMethodBeat.o(101869);
      return;
    }
    if (paramcqn.xos)
      this.hjR.dK(true);
    while (true)
    {
      this.hjW.azs();
      this.hjW.azv();
      AppMethodBeat.o(101869);
      break;
      this.hjR.dK(false);
    }
  }

  private void a(cqo paramcqo)
  {
    AppMethodBeat.i(101863);
    ab.i("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, method: %s, call_id %d", new Object[] { paramcqo.xou, Integer.valueOf(paramcqo.xow) });
    String str = paramcqo.xou;
    LinkedList localLinkedList1 = paramcqo.xov;
    if (!hkk.containsKey(str))
    {
      ab.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, methodWithArgs is null");
      AppMethodBeat.o(101863);
    }
    while (true)
    {
      label67: return;
      localObject = (String[])hkk.get(str);
      if (localLinkedList1.size() >= localObject.length)
        break;
      ab.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, methodArgValueList.size() < methodArgList.size()");
      AppMethodBeat.o(101863);
    }
    LinkedList localLinkedList2 = new LinkedList();
    int i = 0;
    if (i < localObject.length)
    {
      if ("Number".equals(localObject[i]))
        localLinkedList2.add(Integer.valueOf((String)localLinkedList1.get(i)));
      while (true)
      {
        i++;
        break;
        if ("Boolean".equals(localObject[i]))
          localLinkedList2.add(Boolean.valueOf((String)localLinkedList1.get(i)));
        else
          localLinkedList2.add(localLinkedList1.get(i));
      }
    }
    long l = System.currentTimeMillis();
    i = -1;
    switch (str.hashCode())
    {
    default:
    case 574772027:
    case 810169266:
    }
    while (true)
      switch (i)
      {
      default:
        ab.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface callMethod is null");
        AppMethodBeat.o(101863);
        break label67;
        if (str.equals("publishHandler"))
        {
          i = 0;
          continue;
          if (str.equals("invokeHandler"))
            i = 1;
        }
        break;
      case 0:
      case 1:
      }
    this.hjR.hjn.a((String)String.class.cast(localLinkedList2.get(0)), (String)String.class.cast(localLinkedList2.get(1)), zL((String)String.class.cast(localLinkedList2.get(2))));
    Object localObject = null;
    label379: localObject = String.valueOf(localObject);
    if (!bo.isNullOrNil((String)localObject))
      L(paramcqo.xow, (String)localObject);
    int j = paramcqo.computeSize();
    if (localObject == null);
    for (i = 0; ; i = ((String)localObject).length())
    {
      q.a(str, localLinkedList1, l, j, i);
      AppMethodBeat.o(101863);
      break;
      localObject = this.hjR.hjn.n((String)String.class.cast(localLinkedList2.get(0)), (String)String.class.cast(localLinkedList2.get(1)), ((Integer)Integer.class.cast(localLinkedList2.get(2))).intValue());
      break label379;
    }
  }

  private static void a(cqq paramcqq)
  {
    AppMethodBeat.i(101871);
    V8Inspector.onReceiveData(paramcqq.xox, paramcqq.wyn);
    AppMethodBeat.o(101871);
  }

  private void a(cqw paramcqw)
  {
    AppMethodBeat.i(101870);
    ab.d("MicroMsg.RemoteDebugMsgMrg", "onDomOp");
    int i = this.hjR.hjn.xL().asV().getCurrentPage().getCurrentPageView().hashCode();
    if (paramcqw.xoH != i)
    {
      ab.w("MicroMsg.RemoteDebugMsgMrg", "onDomOp id not current webViewId %d/%d", new Object[] { Integer.valueOf(paramcqw.xoH), Integer.valueOf(i) });
      AppMethodBeat.o(101870);
    }
    while (true)
    {
      return;
      this.hjR.hjn.a("remoteDebugCommand", paramcqw.xoG, null);
      AppMethodBeat.o(101870);
    }
  }

  private void a(cqy paramcqy)
  {
    AppMethodBeat.i(101873);
    ab.i("MicroMsg.RemoteDebugMsgMrg", "onEvaluateCallback %d", new Object[] { Integer.valueOf(paramcqy.xoI) });
    int i = paramcqy.xoI;
    String str = paramcqy.cBp;
    b localb = (b)this.hjR.hjI.remove(Integer.valueOf(i));
    if (localb == null)
      AppMethodBeat.o(101873);
    while (true)
    {
      return;
      ValueCallback localValueCallback = localb.hje;
      if (localValueCallback != null)
        localValueCallback.onReceiveValue(str);
      ab.d("MicroMsg.RemoteDebugMsgMrg", "onEvaluateCallback, callback id: " + i + " ret: " + str);
      q.a(localb, paramcqy.computeSize());
      AppMethodBeat.o(101873);
    }
  }

  private void a(crc paramcrc)
  {
    AppMethodBeat.i(101872);
    crd localcrd = new crd();
    localcrd.xoL = paramcrc.xoL;
    localcrd.xoM = q.azq();
    ab.i("MicroMsg.RemoteDebugMsgMrg", "onPing netType %d", new Object[] { Integer.valueOf(localcrd.xoM) });
    a(t.a(localcrd, this.hjR, "pong"));
    AppMethodBeat.o(101872);
  }

  public static void a(cre paramcre)
  {
    AppMethodBeat.i(101862);
    paramcre.xot = "WeixinJSCore";
    Iterator localIterator = hkk.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (((String[])hkk.get(str)).length > 5)
      {
        ab.e("MicroMsg.RemoteDebugMsgMrg", "Interface method only support five arguments!");
      }
      else
      {
        cra localcra = new cra();
        localcra.xou = str;
        for (int i = 0; i < ((String[])hkk.get(str)).length; i++)
          localcra.xov.add(((String[])hkk.get(str))[i]);
        paramcre.xoN.add(localcra);
      }
    }
    AppMethodBeat.o(101862);
  }

  private void a(LinkedList<o> paramLinkedList, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(101876);
      a(paramLinkedList, paramBoolean, false);
      AppMethodBeat.o(101876);
      return;
    }
    finally
    {
      paramLinkedList = finally;
    }
    throw paramLinkedList;
  }

  private void a(LinkedList<o> paramLinkedList, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      AppMethodBeat.i(101877);
      if (bo.ek(paramLinkedList))
      {
        AppMethodBeat.o(101877);
        return;
      }
      localObject = new com/tencent/mm/protocal/protobuf/crg;
      ((crg)localObject).<init>();
      ((crg)localObject).xoU = this.hjR.hjo;
      ((crg)localObject).xoV = this.hjR.ayZ();
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        o localo = (o)localIterator.next();
        ((crg)localObject).xoJ.add(localo.hka);
      }
    }
    finally
    {
    }
    Object localObject = t.a(1006, (a)localObject);
    if ((!this.hjR.isBusy()) || (paramBoolean2))
    {
      ab.d("MicroMsg.RemoteDebugMsgMrg", "sendMsg size %d", new Object[] { Integer.valueOf(paramLinkedList.size()) });
      this.hjT.a((cqs)localObject);
    }
    while (true)
    {
      if (paramBoolean1)
        w(paramLinkedList);
      paramLinkedList = this.hjR;
      paramLinkedList.hjv = System.currentTimeMillis();
      paramLinkedList.hjx = System.currentTimeMillis();
      if (!this.hjR.isBusy())
        this.hkq = 0;
      paramLinkedList = new com/tencent/mm/plugin/appbrand/debugger/k;
      paramLinkedList.<init>();
      paramLinkedList.size = ((cqs)localObject).computeSize();
      paramLinkedList.hjf = System.currentTimeMillis();
      this.hjR.hjG.put(((cqs)localObject).eCq, paramLinkedList);
      AppMethodBeat.o(101877);
      break;
      ab.d("MicroMsg.RemoteDebugMsgMrg", "sendMsg busy");
    }
  }

  private void azi()
  {
    try
    {
      AppMethodBeat.i(101865);
      int i = 0;
      if (i < this.hjR.hjH.size())
      {
        if (i == 0);
        for (int j = this.hjR.ayZ(); ; j = ((cqt)this.hjR.hjH.get(i - 1)).fQi)
        {
          int k = ((cqt)this.hjR.hjH.get(i)).fQi;
          if (j - k != 1)
            cV(j + 1, k - 1);
          i++;
          break;
        }
      }
      AppMethodBeat.o(101865);
      return;
    }
    finally
    {
    }
  }

  private void azj()
  {
    AppMethodBeat.i(101875);
    long l = System.currentTimeMillis();
    while (true)
    {
      synchronized (this.hjR.mLock)
      {
        if ((this.hkm) && (l - this.hkn < 32L))
        {
          AppMethodBeat.o(101875);
          return;
        }
        this.hkn = l;
        if (bo.ek(this.hko))
        {
          AppMethodBeat.o(101875);
          continue;
        }
        this.hkm = true;
        i = (int)(16L - (System.currentTimeMillis() - this.hjR.hjv));
        if (i > 0)
        {
          e.aNS().m(new p.3(this), i);
          AppMethodBeat.o(101875);
        }
      }
      int i = 16;
    }
  }

  private LinkedList<cqt> v(LinkedList<cqt> paramLinkedList)
  {
    while (true)
    {
      LinkedList localLinkedList1;
      LinkedList localLinkedList2;
      int i;
      try
      {
        AppMethodBeat.i(101868);
        if (paramLinkedList == null)
        {
          paramLinkedList = null;
          AppMethodBeat.o(101868);
          return paramLinkedList;
        }
        localLinkedList1 = new java/util/LinkedList;
        localLinkedList1.<init>();
        localLinkedList2 = new java/util/LinkedList;
        localLinkedList2.<init>();
        this.hjR.hjH.addAll(paramLinkedList);
        paramLinkedList = this.hjR.hjH;
        Object localObject = new com/tencent/mm/plugin/appbrand/debugger/p$2;
        ((p.2)localObject).<init>(this);
        Collections.sort(paramLinkedList, (Comparator)localObject);
        i = this.hjR.ayZ();
        localObject = this.hjR.hjH.iterator();
        if (!((Iterator)localObject).hasNext())
          break label172;
        paramLinkedList = (cqt)((Iterator)localObject).next();
        if (paramLinkedList == null)
          continue;
        if (paramLinkedList.fQi <= i)
        {
          localLinkedList2.add(paramLinkedList);
          continue;
        }
      }
      finally
      {
      }
      if (paramLinkedList.fQi - i == 1)
      {
        localLinkedList1.add(paramLinkedList);
        i = paramLinkedList.fQi;
      }
      else
      {
        label172: this.hjR.nG(i);
        this.hjR.hjH.removeAll(localLinkedList1);
        this.hjR.hjH.removeAll(localLinkedList2);
        ab.d("MicroMsg.RemoteDebugMsgMrg", "getHandleMsgList size: %d", new Object[] { Integer.valueOf(localLinkedList1.size()) });
        AppMethodBeat.o(101868);
        paramLinkedList = localLinkedList1;
      }
    }
  }

  private void w(LinkedList<o> paramLinkedList)
  {
    try
    {
      AppMethodBeat.i(101878);
      ab.d("MicroMsg.RemoteDebugMsgMrg", "addToSendingMsg");
      if (bo.ek(paramLinkedList))
        AppMethodBeat.o(101878);
      while (true)
      {
        return;
        this.hjR.hjF.addAll(paramLinkedList);
        AppMethodBeat.o(101878);
      }
    }
    finally
    {
    }
    throw paramLinkedList;
  }

  private static int[] zL(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(101886);
    int[] arrayOfInt1 = new int[0];
    int[] arrayOfInt2 = arrayOfInt1;
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      arrayOfInt2 = arrayOfInt1;
      localJSONArray.<init>(paramString);
      arrayOfInt2 = arrayOfInt1;
      arrayOfInt1 = new int[localJSONArray.length()];
      while (true)
      {
        arrayOfInt2 = arrayOfInt1;
        paramString = arrayOfInt1;
        if (i >= localJSONArray.length())
          break;
        arrayOfInt2 = arrayOfInt1;
        arrayOfInt1[i] = localJSONArray.getInt(i);
        i++;
      }
    }
    catch (Exception paramString)
    {
      ab.e("MicroMsg.RemoteDebugMsgMrg", paramString.getMessage());
      paramString = arrayOfInt2;
      AppMethodBeat.o(101886);
    }
    return paramString;
  }

  public final void L(int paramInt, String paramString)
  {
    AppMethodBeat.i(101864);
    cqp localcqp = new cqp();
    localcqp.xow = paramInt;
    localcqp.cBp = paramString;
    a(t.a(localcqp, this.hjR, "callInterfaceResult"));
    AppMethodBeat.o(101864);
  }

  public final void a(o paramo)
  {
    AppMethodBeat.i(101874);
    if (!this.hjR.aze());
    synchronized (this.hjR.mLock)
    {
      if ((System.currentTimeMillis() - this.hjR.hjv <= 16L) || (this.hkm))
      {
        this.hko.add(paramo);
        azj();
        AppMethodBeat.o(101874);
        return;
      }
      ??? = new LinkedList();
      ((LinkedList)???).add(paramo);
      a((LinkedList)???, true);
      AppMethodBeat.o(101874);
    }
  }

  public final void a(s params, l paraml, u paramu)
  {
    this.hjT = params;
    this.hjR = paraml;
    this.hjW = paramu;
  }

  public final void azk()
  {
    int i = 0;
    while (true)
      try
      {
        AppMethodBeat.i(101879);
        if (this.hjR.isBusy())
        {
          AppMethodBeat.o(101879);
          return;
        }
        long l = System.currentTimeMillis();
        LinkedList localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        Iterator localIterator = this.hjR.hjF.iterator();
        if (localIterator.hasNext())
        {
          o localo = (o)localIterator.next();
          if (l - localo.hjf > 5000L)
          {
            localo.hjf = System.currentTimeMillis();
            localLinkedList.add(localo);
            i = localo.hkb + i;
            if ((i >= 65536L) || (localLinkedList.size() > 800))
            {
              ab.i("MicroMsg.RemoteDebugMsgMrg", "try2ReSendMsg size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
              a(localLinkedList, false);
              localLinkedList.clear();
            }
          }
        }
        else
        {
          if (!bo.ek(localLinkedList))
          {
            ab.i("MicroMsg.RemoteDebugMsgMrg", "try2ReSendMsg size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
            a(localLinkedList, false);
          }
          AppMethodBeat.o(101879);
        }
      }
      finally
      {
      }
  }

  public final boolean azl()
  {
    while (true)
    {
      boolean bool;
      o localo;
      try
      {
        AppMethodBeat.i(101880);
        long l = System.currentTimeMillis();
        if (l - this.hkr < this.hkq)
        {
          AppMethodBeat.o(101880);
          bool = false;
          return bool;
        }
        this.hkr = l;
        if (this.hkq < 5000)
        {
          this.hkq += 1000;
          LinkedList localLinkedList1 = new java/util/LinkedList;
          localLinkedList1.<init>();
          Iterator localIterator = this.hjR.hjF.iterator();
          if (!localIterator.hasNext())
            break label176;
          localo = (o)localIterator.next();
          if (l - localo.hjf <= 5000L)
            continue;
          localo.hjf = System.currentTimeMillis();
          localLinkedList1.add(localo);
          a(localLinkedList1, false, true);
          AppMethodBeat.o(101880);
          bool = true;
          continue;
        }
        this.hkq = 2000;
        continue;
      }
      finally
      {
      }
      label176: if (this.hjR.hjF.size() > 0)
      {
        localo = (o)this.hjR.hjF.get(0);
        localo.hjf = System.currentTimeMillis();
        localLinkedList2.add(localo);
        a(localLinkedList2, false, true);
        AppMethodBeat.o(101880);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(101880);
        bool = false;
      }
    }
  }

  final void azm()
  {
    AppMethodBeat.i(101882);
    this.hjR.setStatus(4);
    this.hjT.zN("quit");
    AppMethodBeat.o(101882);
  }

  public final void azn()
  {
    while (true)
    {
      o localo;
      try
      {
        AppMethodBeat.i(101884);
        ab.d("MicroMsg.RemoteDebugMsgMrg", "removeSendingMsg");
        LinkedList localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        Iterator localIterator = this.hjR.hjF.iterator();
        if (!localIterator.hasNext())
          break;
        localo = (o)localIterator.next();
        if (localo.hka == null)
        {
          localLinkedList.add(localo);
          continue;
        }
      }
      finally
      {
      }
      if (localo.hka.fQi <= this.hjR.aza())
        localCollection.add(localo);
    }
    this.hjR.hjF.removeAll(localCollection);
    AppMethodBeat.o(101884);
  }

  public final void azo()
  {
    AppMethodBeat.i(101885);
    ab.i("MicroMsg.RemoteDebugMsgMrg", "onClose");
    if (this.mTimer != null)
      this.mTimer.cancel();
    AppMethodBeat.o(101885);
  }

  public final void cV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(101866);
    ab.i("MicroMsg.RemoteDebugMsgMrg", "sync minSeq %d, maxSeq %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 > paramInt2)
      AppMethodBeat.o(101866);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      if ((this.hkl.get(Integer.valueOf(paramInt1)) != null) && (l - ((Long)this.hkl.get(Integer.valueOf(paramInt1))).longValue() < 3000L))
      {
        ab.i("MicroMsg.RemoteDebugMsgMrg", "sync too fast!");
        AppMethodBeat.o(101866);
      }
      else
      {
        this.hkl.put(Integer.valueOf(paramInt1), Long.valueOf(l));
        Object localObject = new crq();
        ((crq)localObject).xoU = this.hjR.hjo;
        ((crq)localObject).xph = paramInt1;
        ((crq)localObject).xpi = paramInt2;
        localObject = t.a(1005, (a)localObject);
        this.hjT.a((cqs)localObject);
        this.hjR.hjy = System.currentTimeMillis();
        AppMethodBeat.o(101866);
      }
    }
  }

  public final void cW(int paramInt1, int paramInt2)
  {
    LinkedList localLinkedList;
    while (true)
    {
      try
      {
        AppMethodBeat.i(101883);
        ab.d("MicroMsg.RemoteDebugMsgMrg", "removeSendingMsg with min max");
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        Iterator localIterator = this.hjR.hjF.iterator();
        if (!localIterator.hasNext())
          break;
        o localo = (o)localIterator.next();
        if (localo.hka == null)
        {
          localLinkedList.add(localo);
          continue;
        }
      }
      finally
      {
      }
      if ((localObject.hka.fQi >= paramInt1) && (localObject.hka.fQi <= paramInt2))
        localLinkedList.add(localObject);
    }
    this.hjR.hjF.removeAll(localLinkedList);
    AppMethodBeat.o(101883);
  }

  public final void quit()
  {
    AppMethodBeat.i(101881);
    ab.i("MicroMsg.RemoteDebugMsgMrg", "quit");
    Object localObject = new crp();
    ((crp)localObject).xoU = this.hjR.hjo;
    localObject = t.a(1004, (a)localObject);
    this.hjT.a((cqs)localObject);
    AppMethodBeat.o(101881);
  }

  final void u(LinkedList<cqt> paramLinkedList)
  {
    AppMethodBeat.i(101867);
    if (bo.ek(paramLinkedList))
    {
      ab.w("MicroMsg.RemoteDebugMsgMrg", "handleMsg list is null");
      AppMethodBeat.o(101867);
    }
    while (true)
    {
      return;
      Iterator localIterator = v(paramLinkedList).iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (cqt)localIterator.next();
        byte[] arrayOfByte;
        label78: int i;
        if (t.nJ(((cqt)localObject).wWK))
        {
          arrayOfByte = r.B(((cqt)localObject).wdt.wR);
          localObject = ((cqt)localObject).category;
          i = -1;
          switch (((String)localObject).hashCode())
          {
          default:
          case -1680221061:
          case -217209181:
          case 3441010:
          case 1319027697:
          case 95766211:
          case 52537216:
          }
        }
        while (true)
          switch (i)
          {
          default:
            break;
          case 0:
            a((cqo)new cqo().parseFrom(arrayOfByte));
            break;
            arrayOfByte = ((cqt)localObject).wdt.wR;
            break label78;
            if (((String)localObject).equals("callInterface"))
            {
              i = 0;
              continue;
              if (((String)localObject).equals("evaluateJavascriptResult"))
              {
                i = 1;
                continue;
                if (((String)localObject).equals("ping"))
                {
                  i = 2;
                  continue;
                  if (((String)localObject).equals("breakpoint"))
                  {
                    i = 3;
                    continue;
                    if (((String)localObject).equals("domOp"))
                    {
                      i = 4;
                      continue;
                      if (((String)localObject).equals("chromeDevtools"))
                        i = 5;
                    }
                  }
                }
              }
            }
            break;
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          }
        a((cqy)new cqy().parseFrom(arrayOfByte));
        continue;
        a((crc)new crc().parseFrom(arrayOfByte));
        continue;
        a((cqn)new cqn().parseFrom(arrayOfByte));
        continue;
        a((cqw)new cqw().parseFrom(arrayOfByte));
        continue;
        a((cqq)new cqq().parseFrom(arrayOfByte));
      }
      ab.i("MicroMsg.RemoteDebugMsgMrg", "handleMsg size %d, ack %d", new Object[] { Integer.valueOf(paramLinkedList.size()), Integer.valueOf(this.hjR.ayZ()) });
      this.hjR.nI(paramLinkedList.size());
      azi();
      AppMethodBeat.o(101867);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.p
 * JD-Core Version:    0.6.2
 */