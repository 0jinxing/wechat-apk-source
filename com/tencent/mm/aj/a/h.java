package com.tencent.mm.aj.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.aj.z;
import com.tencent.mm.protocal.protobuf.acr;
import com.tencent.mm.protocal.protobuf.afm;
import com.tencent.mm.protocal.protobuf.afn;
import com.tencent.mm.protocal.protobuf.afo;
import com.tencent.mm.protocal.protobuf.afp;
import com.tencent.mm.protocal.protobuf.afq;
import com.tencent.mm.protocal.protobuf.afs;
import com.tencent.mm.protocal.protobuf.aiv;
import com.tencent.mm.protocal.protobuf.aiw;
import com.tencent.mm.protocal.protobuf.auq;
import com.tencent.mm.protocal.protobuf.bos;
import com.tencent.mm.protocal.protobuf.cjl;
import com.tencent.mm.protocal.protobuf.cjm;
import com.tencent.mm.protocal.protobuf.cjn;
import com.tencent.mm.protocal.protobuf.cjo;
import com.tencent.mm.protocal.protobuf.kd;
import com.tencent.mm.protocal.protobuf.ke;
import com.tencent.mm.protocal.protobuf.kf;
import com.tencent.mm.protocal.protobuf.kg;
import com.tencent.mm.protocal.protobuf.kk;
import com.tencent.mm.protocal.protobuf.lj;
import com.tencent.mm.protocal.protobuf.uh;
import com.tencent.mm.protocal.protobuf.un;
import com.tencent.mm.protocal.protobuf.uo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class h
  implements com.tencent.mm.ai.f
{
  private HashSet<h.a> fxP;
  private HashSet<h.a> fxQ;
  private final Object fxR;
  private com.tencent.mm.a.f<String, Long> fxS;
  private HashSet<h.a> fxT;
  private HashSet<h.a> fxU;
  private final Object fxV;
  private com.tencent.mm.a.f<String, Long> fxW;

  public h()
  {
    AppMethodBeat.i(11569);
    this.fxP = new HashSet();
    this.fxQ = new HashSet();
    this.fxR = new Object();
    this.fxS = new com.tencent.mm.a.h(64);
    this.fxT = new HashSet();
    this.fxU = new HashSet();
    this.fxV = new Object();
    this.fxW = new com.tencent.mm.a.h(64);
    com.tencent.mm.kernel.g.RO().eJo.a(1352, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1365, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1353, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1354, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1357, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1356, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1355, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1358, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1367, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1361, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1389, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1315, this);
    AppMethodBeat.o(11569);
  }

  public static n a(String paramString, acr paramacr, com.tencent.mm.aj.n paramn)
  {
    AppMethodBeat.i(11584);
    paramString = new n(paramString, paramacr, paramn);
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(11584);
    return paramString;
  }

  public static w a(String paramString, kd paramkd, com.tencent.mm.aj.n paramn)
  {
    AppMethodBeat.i(11586);
    paramString = new w(paramString, paramkd, paramn);
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(11586);
    return paramString;
  }

  public static x a(String paramString1, String paramString2, kg paramkg1, kg paramkg2, com.tencent.mm.aj.n paramn)
  {
    AppMethodBeat.i(11585);
    paramString1 = new x(paramString1, paramString2, paramkg1, paramkg2, paramn);
    com.tencent.mm.kernel.g.RO().eJo.a(paramString1, 0);
    AppMethodBeat.o(11585);
    return paramString1;
  }

  public static void a(String paramString, com.tencent.mm.aj.n paramn)
  {
    AppMethodBeat.i(11583);
    paramString = new q(paramString, paramn);
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(11583);
  }

  public static void a(String paramString1, String paramString2, com.tencent.mm.aj.n paramn)
  {
    AppMethodBeat.i(11582);
    if (paramn == null)
      AppMethodBeat.o(11582);
    while (true)
    {
      return;
      Object localObject = e.rv(paramString2);
      if ((localObject == null) || (((j)localObject).field_userId.equals(paramString1)))
      {
        a(paramString2, paramn);
        AppMethodBeat.o(11582);
      }
      else
      {
        localObject = new LinkedList();
        ((LinkedList)localObject).add(paramString1);
        paramString1 = new lj();
        paramString1.vNb = paramString2;
        paramString1.vOW = ((LinkedList)localObject);
        paramString2 = new LinkedList();
        paramString2.add(paramString1);
        paramString1 = new r(paramString2, paramn);
        com.tencent.mm.kernel.g.RO().eJo.a(paramString1, 0);
        AppMethodBeat.o(11582);
      }
    }
  }

  private static boolean a(acr paramacr, String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(11589);
    ab.d("MicroMsg.BizChatNetworkMgr", "handleGetBizChatInfoSceneEnd");
    if ((paramacr == null) || (paramacr.wku == null) || (bo.isNullOrNil(paramString)))
    {
      ab.w("MicroMsg.BizChatNetworkMgr", "fullBizChat or fullBizChat.chat or brandUserName == null");
      AppMethodBeat.o(11589);
      paramBoolean = bool;
      return paramBoolean;
    }
    Object localObject1 = z.aeT().rq(paramacr.wku.vMV);
    int i;
    if (localObject1 == null)
    {
      ab.w("MicroMsg.BizChatNetworkMgr", "bizChatInfo == null");
      localObject1 = new c();
      ((c)localObject1).field_bizChatServId = paramacr.wku.vMV;
      ((c)localObject1).field_brandUserName = paramString;
      i = 1;
      paramBoolean = true;
    }
    while (true)
    {
      if (paramacr.vNd == null)
      {
        ab.w("MicroMsg.BizChatNetworkMgr", "members==null");
        AppMethodBeat.o(11589);
        paramBoolean = bool;
        break;
      }
      Object localObject2;
      if ((((c)localObject1).afh()) || (paramacr.wku.ver > ((c)localObject1).field_chatVersion))
      {
        ((c)localObject1).field_chatType = paramacr.wku.type;
        ((c)localObject1).field_headImageUrl = paramacr.wku.vMW;
        ((c)localObject1).field_chatName = paramacr.wku.name;
        ((c)localObject1).field_chatVersion = paramacr.wku.ver;
        ((c)localObject1).field_needToUpdate = false;
        ((c)localObject1).field_bitFlag = paramacr.wku.vMX;
        ((c)localObject1).field_maxMemberCnt = paramacr.wku.vMY;
        ((c)localObject1).field_ownerUserId = paramacr.wku.vMZ;
        ((c)localObject1).field_addMemberUrl = paramacr.wku.vNa;
        ((c)localObject1).field_brandUserName = paramString;
        localObject2 = new LinkedList();
        paramString = paramacr.vNd.iterator();
        while (paramString.hasNext())
          ((LinkedList)localObject2).add(((kf)paramString.next()).vNc);
        ((c)localObject1).field_userList = bo.c((List)localObject2, ";");
        if (i == 0)
          break label441;
        z.aeT().a((c)localObject1);
      }
      long l;
      while (true)
      {
        e.h((c)localObject1);
        if (!paramBoolean)
          break label514;
        paramString = new lj();
        paramString.vNb = ((c)localObject1).field_brandUserName;
        localObject1 = new LinkedList();
        localObject2 = paramacr.vNd.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramacr = (kf)((Iterator)localObject2).next();
          l = z.aeV().rC(paramacr.vNc);
          if (paramacr.ver > l)
            ((LinkedList)localObject1).add(paramacr.vNc);
        }
        label441: z.aeT().b((c)localObject1);
      }
      if (((LinkedList)localObject1).size() > 0)
      {
        paramString.vOW = ((LinkedList)localObject1);
        paramacr = new LinkedList();
        paramacr.add(paramString);
        paramacr = new r(paramacr, null);
        com.tencent.mm.kernel.g.RO().eJo.a(paramacr, 0);
      }
      while (true)
      {
        AppMethodBeat.o(11589);
        paramBoolean = true;
        break;
        label514: paramString = z.aeV().bSd;
        l = 0L;
        if ((paramString instanceof com.tencent.mm.cd.h))
          l = ((com.tencent.mm.cd.h)paramString).iV(Thread.currentThread().getId());
        paramacr = paramacr.vNd.iterator();
        while (paramacr.hasNext())
        {
          localObject2 = (kf)paramacr.next();
          j localj = z.aeV().cH(((kf)localObject2).vNc);
          if (localj == null)
          {
            localj = new j();
            localj.field_userId = ((kf)localObject2).vNc;
            localj.field_userName = ((kf)localObject2).kfT;
            localj.field_brandUserName = ((c)localObject1).field_brandUserName;
            localj.field_needToUpdate = true;
            z.aeV().a(localj);
          }
          else if (((kf)localObject2).ver > localj.field_UserVersion)
          {
            localj.field_needToUpdate = true;
            z.aeV().b(localj);
          }
        }
        if ((paramString instanceof com.tencent.mm.cd.h))
          com.tencent.mm.kernel.g.RP().eJN.mB(l);
      }
      i = 0;
    }
  }

  private static boolean a(kk paramkk, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11588);
    if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil(paramkk.vNc)))
      AppMethodBeat.o(11588);
    while (true)
    {
      return bool;
      j localj = new j();
      localj.field_userId = paramkk.vNc;
      localj.field_userName = paramkk.kfT;
      localj.field_brandUserName = paramString;
      localj.field_headImageUrl = paramkk.vMW;
      localj.field_profileUrl = paramkk.vNk;
      localj.field_UserVersion = paramkk.ver;
      localj.field_addMemberUrl = paramkk.vNa;
      if (!z.aeV().b(localj))
        z.aeV().a(localj);
      paramkk = new c();
      paramkk.field_bizChatServId = localj.field_userId;
      paramkk.field_brandUserName = localj.field_brandUserName;
      paramkk.field_chatName = localj.field_userName;
      paramkk.field_chatType = 1;
      if (e.e(paramkk) == null)
      {
        AppMethodBeat.o(11588);
      }
      else
      {
        AppMethodBeat.o(11588);
        bool = true;
      }
    }
  }

  private void aE(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11574);
    long l = System.currentTimeMillis();
    synchronized (this.fxR)
    {
      Object localObject2 = new com/tencent/mm/aj/a/h$a;
      ((h.a)localObject2).<init>(paramString2, paramString1);
      if (this.fxQ.contains(localObject2))
      {
        AppMethodBeat.o(11574);
        return;
      }
      this.fxP.add(localObject2);
      localObject2 = this.fxS;
      paramString2 = new java/lang/Long;
      paramString2.<init>(l);
      ((com.tencent.mm.a.f)localObject2).put(paramString1, paramString2);
      afj();
      AppMethodBeat.o(11574);
    }
  }

  public static void aH(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11581);
    paramString1 = new o(paramString1, paramString2);
    com.tencent.mm.kernel.g.RO().eJo.a(paramString1, 0);
    AppMethodBeat.o(11581);
  }

  private void afj()
  {
    AppMethodBeat.i(11576);
    LinkedList localLinkedList = new LinkedList();
    while (true)
    {
      synchronized (this.fxR)
      {
        if (!this.fxQ.isEmpty())
        {
          AppMethodBeat.o(11576);
          return;
        }
        if (this.fxP.isEmpty())
        {
          AppMethodBeat.o(11576);
          continue;
        }
        Iterator localIterator = this.fxP.iterator();
        if (localIterator.hasNext())
        {
          h.a locala = (h.a)localIterator.next();
          ke localke = new com/tencent/mm/protocal/protobuf/ke;
          localke.<init>();
          localke.vNb = h.a.a(locala);
          localke.vMV = h.a.b(locala);
          localLinkedList.add(localke);
        }
      }
      if (localLinkedList.isEmpty())
      {
        AppMethodBeat.o(11576);
      }
      else
      {
        this.fxQ.addAll(this.fxP);
        this.fxP.clear();
        ??? = new p(localLinkedList);
        com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)???, 0);
        AppMethodBeat.o(11576);
      }
    }
  }

  private void afk()
  {
    AppMethodBeat.i(11580);
    LinkedList localLinkedList = new LinkedList();
    while (true)
    {
      HashMap localHashMap;
      Object localObject2;
      Object localObject3;
      synchronized (this.fxV)
      {
        if (!this.fxU.isEmpty())
        {
          AppMethodBeat.o(11580);
          return;
        }
        if (this.fxT.isEmpty())
        {
          AppMethodBeat.o(11580);
          continue;
        }
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        localIterator = this.fxT.iterator();
        if (localIterator.hasNext())
        {
          localObject2 = (h.a)localIterator.next();
          localObject3 = (LinkedList)localHashMap.get(h.a.a((h.a)localObject2));
          Object localObject4 = localObject3;
          if (localObject3 == null)
          {
            localObject4 = new java/util/LinkedList;
            ((LinkedList)localObject4).<init>();
            localHashMap.put(h.a.a((h.a)localObject2), localObject4);
          }
          ((LinkedList)localObject4).add(h.a.b((h.a)localObject2));
        }
      }
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        localObject6 = (LinkedList)localHashMap.get(localObject2);
        if ((localObject6 != null) && (!((LinkedList)localObject6).isEmpty()))
        {
          localObject3 = new com/tencent/mm/protocal/protobuf/lj;
          ((lj)localObject3).<init>();
          ((lj)localObject3).vNb = ((String)localObject2);
          ((lj)localObject3).vOW = ((LinkedList)localObject6);
          localLinkedList.add(localObject3);
        }
      }
      this.fxU.addAll(this.fxT);
      this.fxT.clear();
      Object localObject6 = new r(localLinkedList, null);
      com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject6, 0);
      AppMethodBeat.o(11580);
    }
  }

  public static void e(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(11587);
    paramString1 = new v(paramString1, paramString2, paramInt);
    com.tencent.mm.kernel.g.RO().eJo.a(paramString1, 0);
    AppMethodBeat.o(11587);
  }

  public static void f(com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(11572);
    com.tencent.mm.kernel.g.RO().eJo.c(paramm);
    AppMethodBeat.o(11572);
  }

  public final void a(LinkedList<String> paramLinkedList, String paramString)
  {
    AppMethodBeat.i(11575);
    long l = System.currentTimeMillis();
    synchronized (this.fxR)
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        String str = (String)paramLinkedList.next();
        Object localObject2 = new com/tencent/mm/aj/a/h$a;
        ((h.a)localObject2).<init>(paramString, str);
        if (!this.fxQ.contains(localObject2))
        {
          this.fxP.add(localObject2);
          com.tencent.mm.a.f localf = this.fxS;
          localObject2 = new java/lang/Long;
          ((Long)localObject2).<init>(l);
          localf.put(str, localObject2);
        }
      }
    }
    afj();
    AppMethodBeat.o(11575);
  }

  public final void aD(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11573);
    Long localLong = (Long)this.fxS.ai(paramString1);
    if ((localLong == null) || (localLong.longValue() + 5000L < System.currentTimeMillis()))
      aE(paramString1, paramString2);
    AppMethodBeat.o(11573);
  }

  public final void aF(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11577);
    Long localLong = (Long)this.fxW.ai(paramString1);
    if ((localLong == null) || (localLong.longValue() + 5000L < System.currentTimeMillis()))
      aG(paramString1, paramString2);
    AppMethodBeat.o(11577);
  }

  public final void aG(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11578);
    long l = System.currentTimeMillis();
    synchronized (this.fxV)
    {
      Object localObject2 = new com/tencent/mm/aj/a/h$a;
      ((h.a)localObject2).<init>(paramString2, paramString1);
      if (this.fxU.contains(localObject2))
      {
        AppMethodBeat.o(11578);
        return;
      }
      this.fxT.add(localObject2);
      localObject2 = this.fxW;
      paramString2 = new java/lang/Long;
      paramString2.<init>(l);
      ((com.tencent.mm.a.f)localObject2).put(paramString1, paramString2);
      afk();
      AppMethodBeat.o(11578);
    }
  }

  public final void b(LinkedList<String> paramLinkedList, String paramString)
  {
    AppMethodBeat.i(11579);
    long l = System.currentTimeMillis();
    while (true)
    {
      synchronized (this.fxV)
      {
        Iterator localIterator = paramLinkedList.iterator();
        if (localIterator.hasNext())
        {
          paramLinkedList = (String)localIterator.next();
          Object localObject2 = new com/tencent/mm/aj/a/h$a;
          ((h.a)localObject2).<init>(paramString, paramLinkedList);
          if (this.fxU.contains(localObject2))
          {
            AppMethodBeat.o(11579);
            return;
          }
          this.fxT.add(localObject2);
          localObject2 = this.fxW;
          Long localLong = new java/lang/Long;
          localLong.<init>(l);
          ((com.tencent.mm.a.f)localObject2).put(paramLinkedList, localLong);
        }
      }
      afk();
      AppMethodBeat.o(11579);
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(11570);
    com.tencent.mm.kernel.g.RO().eJo.b(1352, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1365, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1353, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1354, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1357, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1356, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1355, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1358, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1367, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1361, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1389, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1315, this);
    super.finalize();
    AppMethodBeat.o(11570);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String arg3, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(11571);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:Network not ok");
      if ((paramm.getType() != 1365) && (paramm.getType() != 1353))
        AppMethodBeat.o(11571);
    }
    label156: Object localObject1;
    label209: boolean bool1;
    label325: label331: label348: Object localObject2;
    while (true)
    {
      return;
      switch (paramm.getType())
      {
      default:
        AppMethodBeat.o(11571);
        break;
      case 1352:
        localObject1 = (o)paramm;
        if ((((o)localObject1).ehh != null) && (((o)localObject1).ehh.fsH.fsP != null))
        {
          ??? = (afo)((o)localObject1).ehh.fsH.fsP;
          if ((((o)localObject1).ehh == null) || (((o)localObject1).ehh.fsG.fsP == null))
            break label325;
        }
        for (paramm = (afn)((o)localObject1).ehh.fsG.fsP; ; paramm = null)
        {
          bool1 = ((o)localObject1).fyf;
          if ((??? != null) && (???.vNh != null) && (???.vNh.ret == 0))
            break label348;
          if ((??? == null) || (???.vNh == null))
            break label331;
          ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.vNh.ret) });
          AppMethodBeat.o(11571);
          break;
          ??? = null;
          break label209;
        }
        ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
        AppMethodBeat.o(11571);
        continue;
        a(???.wcb, paramm.vNb, bool1);
        AppMethodBeat.o(11571);
        break;
      case 1365:
        synchronized (this.fxR)
        {
          this.fxQ.clear();
          afj();
          if ((paramInt1 != 0) || (paramInt2 != 0))
            AppMethodBeat.o(11571);
        }
        paramm = (p)paramm;
        if ((paramm.ehh != null) && (paramm.ehh.fsH.fsP != null))
          ??? = (afm)paramm.ehh.fsH.fsP;
        while (true)
          if ((??? == null) || (???.vNh == null) || (???.vNh.ret != 0))
          {
            if ((??? != null) && (???.vNh != null))
            {
              ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.vNh.ret) });
              AppMethodBeat.o(11571);
              break;
              ??? = null;
              continue;
            }
            ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
            AppMethodBeat.o(11571);
            break;
          }
        ??? = ???.wmT;
        if ((??? == null) || (???.size() == 0))
        {
          ab.w("MicroMsg.BizChatNetworkMgr", "fullBizChats is empty");
          AppMethodBeat.o(11571);
        }
        else
        {
          localObject1 = ???.iterator();
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (acr)((Iterator)localObject1).next();
            ??? = ((acr)localObject2).wku.vMV;
            if ((??? == null) || (paramm.fyg == null));
            for (??? = null; ; ??? = (String)paramm.fyg.get(???))
            {
              a((acr)localObject2, ???, false);
              break;
            }
          }
          AppMethodBeat.o(11571);
        }
        break;
      case 1353:
        localObject1 = (r)paramm;
        localObject2 = (com.tencent.mm.aj.n)((r)localObject1).data;
        if (localObject2 == null);
        synchronized (this.fxV)
        {
          this.fxU.clear();
          afk();
          if ((paramInt1 != 0) || (paramInt2 != 0))
            AppMethodBeat.o(11571);
        }
      case 1354:
      case 1355:
      case 1389:
      case 1315:
      case 1357:
      case 1356:
      case 1358:
      case 1367:
      }
    }
    if ((((r)localObject1).ehh != null) && (((r)localObject1).ehh.fsH.fsP != null))
    {
      ??? = (afs)((r)localObject1).ehh.fsH.fsP;
      paramInt1 = 0;
      if ((??? == null) || (???.vNh == null) || (???.vNh.ret != 0))
      {
        if ((??? == null) || (???.vNh == null))
          break label1237;
        ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.vNh.ret) });
        label844: paramInt1 = -1;
      }
      if ((paramInt1 < 0) || (???.vNi != null))
        break label3756;
      ab.w("MicroMsg.BizChatNetworkMgr", "resp.user==null");
      paramInt1 = -1;
    }
    label908: label1179: label1572: label1975: label2878: 
    while (true)
    {
      Object localObject3;
      Object localObject4;
      label1018: boolean bool2;
      if (paramInt1 >= 0)
      {
        localObject3 = z.aeV().bSd;
        long l = 0L;
        if ((localObject3 instanceof com.tencent.mm.cd.h))
          l = ((com.tencent.mm.cd.h)localObject3).iV(Thread.currentThread().getId());
        paramInt2 = 0;
        if (paramInt2 < ???.vNi.size())
        {
          ab.d("MicroMsg.BizChatNetworkMgr", "GetBizChatUserInfoList %s", new Object[] { ((kk)???.vNi.get(paramInt2)).kfT });
          localObject4 = new j();
          ((j)localObject4).field_userId = ((kk)???.vNi.get(paramInt2)).vNc;
          ((j)localObject4).field_userName = ((kk)???.vNi.get(paramInt2)).kfT;
          paramm = ((j)localObject4).field_userId;
          if ((paramm == null) || (((r)localObject1).fyh == null))
          {
            paramm = null;
            ((j)localObject4).field_brandUserName = paramm;
            ((j)localObject4).field_UserVersion = ((kk)???.vNi.get(paramInt2)).ver;
            ((j)localObject4).field_headImageUrl = ((kk)???.vNi.get(paramInt2)).vMW;
            ((j)localObject4).field_profileUrl = ((kk)???.vNi.get(paramInt2)).vNk;
            ((j)localObject4).field_bitFlag = ((kk)???.vNi.get(paramInt2)).vMX;
            ((j)localObject4).field_addMemberUrl = ((kk)???.vNi.get(paramInt2)).vNa;
            ((j)localObject4).field_needToUpdate = false;
            paramm = z.aeV().cH(((kk)???.vNi.get(paramInt2)).vNc);
            if (paramm != null)
              break label1268;
            bool1 = false;
            bool2 = ((j)localObject4).lc(16);
            if (paramm != null)
              break label1280;
            z.aeV().a((j)localObject4);
            if (bool1 != bool2)
            {
              paramm = z.aeT().rq(((j)localObject4).field_userId);
              if (paramm != null)
              {
                if ((!bool1) || (bool2))
                  break label1292;
                z.aeU().fA(paramm.field_bizChatLocalId);
              }
            }
          }
          while (true)
          {
            paramInt2++;
            break label908;
            ??? = null;
            break;
            label1237: ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
            break label844;
            paramm = (String)((r)localObject1).fyh.get(paramm);
            break label1018;
            label1268: bool1 = paramm.lc(16);
            break label1156;
            z.aeV().b((j)localObject4);
            break label1179;
            if ((!bool1) && (bool2))
              z.aeU().fz(paramm.field_bizChatLocalId);
          }
        }
        if ((localObject3 instanceof com.tencent.mm.cd.h))
          com.tencent.mm.kernel.g.RP().eJN.mB(l);
      }
      if (localObject2 != null)
        ((com.tencent.mm.aj.n)localObject2).a(paramInt1, (com.tencent.mm.ai.m)localObject1);
      AppMethodBeat.o(11571);
      break;
      localObject1 = (q)paramm;
      if ((((q)localObject1).ehh != null) && (((q)localObject1).ehh.fsH.fsP != null))
      {
        ??? = (afq)((q)localObject1).ehh.fsH.fsP;
        label1405: if (((q)localObject1).ehh != null)
          break label1553;
        paramm = null;
        if ((??? != null) && (???.vNh != null) && (???.vNh.ret == 0))
          break label3751;
        if ((??? == null) || (???.vNh == null))
          break label1572;
        ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.vNh.ret) });
      }
      label1473: for (paramInt1 = -1; ; paramInt1 = 0)
      {
        if (paramInt1 >= 0)
        {
          localObject2 = z.aeV();
          paramm = paramm.vNb;
          ??? = ???.vNe;
          if ((??? == null) || (bo.isNullOrNil(paramm)))
            ab.w("MicroMsg.BizChatUserInfoStorage", "setMyUserId: wrong argument");
        }
        else
        {
          ??? = (com.tencent.mm.aj.n)((q)localObject1).data;
          if (??? != null)
            ???.a(paramInt1, (com.tencent.mm.ai.m)localObject1);
          AppMethodBeat.o(11571);
          break;
          ??? = null;
          break label1405;
          paramm = (afp)((q)localObject1).ehh.fsG.fsP;
          break label1416;
          ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
          break label1473;
        }
        ab.i("MicroMsg.BizChatUserInfoStorage", "setMyUserId:%s,%s,%s", new Object[] { paramm, ???.vNc, Boolean.valueOf(bo.isNullOrNil(???.vNa)) });
        localObject3 = z.aeW().rA(paramm);
        if (localObject3 == null)
        {
          localObject3 = new f();
          ((f)localObject3).field_brandUserName = paramm;
          ((f)localObject3).field_userId = ???.vNc;
          z.aeW().a((f)localObject3);
        }
        while (true)
        {
          localObject3 = new j();
          ((j)localObject3).field_userId = ???.vNc;
          ((j)localObject3).field_userName = ???.kfT;
          ((j)localObject3).field_brandUserName = paramm;
          ((j)localObject3).field_UserVersion = ???.ver;
          ((j)localObject3).field_headImageUrl = ???.vMW;
          ((j)localObject3).field_profileUrl = ???.vNk;
          ((j)localObject3).field_bitFlag = ???.vMX;
          ((j)localObject3).field_needToUpdate = false;
          ((j)localObject3).field_addMemberUrl = ???.vNa;
          if (!((k)localObject2).b((j)localObject3))
            ((k)localObject2).a((j)localObject3);
          ((k)localObject2).fxs.put(paramm, ((j)localObject3).field_userId);
          break;
          ((f)localObject3).field_userId = ???.vNc;
          z.aeW().b((f)localObject3);
          ab.i("MicroMsg.BizChatUserInfoStorage", "setMyUserId: MyUserId seted");
        }
        ??? = (n)paramm;
        localObject1 = ???.afm();
        paramm = ???.afn();
        paramInt1 = 0;
        if ((localObject1 == null) || (((uo)localObject1).vNh == null) || (((uo)localObject1).vNh.ret != 0))
        {
          if ((localObject1 != null) && (((uo)localObject1).vNh != null))
          {
            ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(((uo)localObject1).vNh.ret) });
            label1907: paramInt1 = -1;
          }
        }
        else
        {
          if (paramInt1 < 0)
            break label3748;
          if (!a(((uo)localObject1).wcb, paramm.vNb, true))
            break label1975;
          paramInt1 = 0;
        }
        while (true)
        {
          paramm = (com.tencent.mm.aj.n)???.data;
          if (paramm != null)
            paramm.a(paramInt1, ???);
          AppMethodBeat.o(11571);
          break;
          ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
          break label1907;
          paramInt1 = -1;
          continue;
          ??? = (t)paramm;
          paramm = ???.afo();
          paramInt2 = 0;
          if ((paramm == null) || (paramm.vNh == null) || (paramm.vNh.ret != 0))
          {
            if ((paramm != null) && (paramm.vNh != null))
            {
              ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(paramm.vNh.ret) });
              paramInt2 = -1;
            }
          }
          else
          {
            paramInt1 = paramInt2;
            if (paramInt2 >= 0)
            {
              paramInt1 = paramInt2;
              if (paramm.wbT == null)
              {
                paramInt1 = paramInt2;
                if (paramm.wbS == null)
                  paramInt1 = -1;
              }
            }
            if (paramInt1 < 0)
              break label3745;
            if (paramm.wbT == null)
              break label2189;
            bool2 = a(paramm.wbT, paramm.vNb);
            bool1 = bool2;
            if (bool2)
            {
              ???.fye = paramm.wbT.vNc;
              bool1 = bool2;
            }
            label2139: if (bool1)
              break label3745;
            paramInt1 = -1;
          }
          while (true)
          {
            paramm = (com.tencent.mm.aj.n)???.data;
            if (paramm != null)
              paramm.a(paramInt1, ???);
            AppMethodBeat.o(11571);
            break;
            ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
            break label2057;
            bool2 = a(paramm.wbS, paramm.vNb, true);
            bool1 = bool2;
            if (!bool2)
              break label2139;
            ???.fye = paramm.wbS.wku.vMV;
            bool1 = bool2;
            break label2139;
            ??? = (m)paramm;
            paramm = ???.afl();
            paramInt1 = 0;
            if ((paramm == null) || (paramm.vNh == null) || (paramm.vNh.ret != 0))
            {
              if ((paramm != null) && (paramm.vNh != null))
              {
                ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(paramm.vNh.ret) });
                paramInt1 = -1;
              }
            }
            else
            {
              paramInt2 = paramInt1;
              if (paramInt1 >= 0)
              {
                paramInt2 = paramInt1;
                if (paramm.wbT == null)
                {
                  paramInt2 = paramInt1;
                  if (paramm.wbS == null)
                    paramInt2 = -1;
                }
              }
              if (paramInt2 < 0)
                break label3742;
              if (paramm.wbT == null)
                break label2445;
              bool2 = a(paramm.wbT, paramm.vNb);
              bool1 = bool2;
              if (bool2)
              {
                ???.fye = paramm.wbT.vNc;
                bool1 = bool2;
              }
              label2395: if (bool1)
                break label3742;
              paramInt2 = -1;
            }
            while (true)
            {
              paramm = (com.tencent.mm.aj.n)???.data;
              if (paramm != null)
                paramm.a(paramInt2, ???);
              AppMethodBeat.o(11571);
              break;
              ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
              break label2313;
              bool2 = a(paramm.wbS, paramm.vNb, true);
              bool1 = bool2;
              if (!bool2)
                break label2395;
              ???.fye = paramm.wbS.wku.vMV;
              bool1 = bool2;
              break label2395;
              ab.d("MicroMsg.BizChatNetworkMgr", "handleUpdateBizChatMemberListSceneEnd");
              localObject1 = (x)paramm;
              if ((((x)localObject1).ehh != null) && (((x)localObject1).ehh.fsH.fsP != null))
              {
                ??? = (cjm)((x)localObject1).ehh.fsH.fsP;
                label2544: if ((((x)localObject1).ehh == null) || (((x)localObject1).ehh.fsG.fsP == null))
                  break label2653;
                paramm = (cjl)((x)localObject1).ehh.fsG.fsP;
              }
              while (true)
                if ((??? == null) || (???.vNh == null) || (???.vNh.ret != 0))
                {
                  if ((??? != null) && (???.vNh != null))
                  {
                    ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.vNh.ret) });
                    AppMethodBeat.o(11571);
                    break;
                    ??? = null;
                    break label2544;
                    label2653: paramm = null;
                    continue;
                  }
                  ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
                  AppMethodBeat.o(11571);
                  break;
                }
              if (a(???.wcb, paramm.vNb, false));
              for (paramInt1 = 0; ; paramInt1 = -1)
              {
                ??? = (com.tencent.mm.aj.n)((x)localObject1).data;
                if (??? != null)
                  ???.a(paramInt1, (com.tencent.mm.ai.m)localObject1);
                AppMethodBeat.o(11571);
                break;
              }
              localObject1 = (w)paramm;
              if ((((w)localObject1).ehh != null) && (((w)localObject1).ehh.fsH.fsP != null))
              {
                ??? = (cjo)((w)localObject1).ehh.fsH.fsP;
                label2774: if ((((w)localObject1).ehh == null) || (((w)localObject1).ehh.fsG.fsP == null))
                  break label3151;
                paramm = (cjn)((w)localObject1).ehh.fsG.fsP;
                label2812: paramInt1 = 0;
                if ((??? == null) || (???.vNh == null) || (???.vNh.ret != 0) || (???.wku == null))
                {
                  if ((??? == null) || (???.vNh == null))
                    break label3157;
                  ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.vNh.ret) });
                  paramInt1 = -1;
                }
                if (paramInt1 < 0)
                  break label3739;
                localObject2 = z.aeT().rq(???.wku.vMV);
                if (localObject2 == null)
                {
                  if (localObject2 != null)
                    break label3168;
                  bool1 = true;
                  label2912: if (???.wku != null)
                    break label3174;
                  bool2 = true;
                  label2922: ab.w("MicroMsg.BizChatNetworkMgr", "bizChatInfo == null:%s, resp.chat == null:%s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
                  paramInt1 = -1;
                }
                if ((paramInt1 < 0) || (((((c)localObject2).field_bitFlag == ???.wku.vMX) || (!((c)localObject2).afh())) && (???.wku.ver <= ((c)localObject2).field_chatVersion)))
                  break label3180;
                ((c)localObject2).field_chatType = ???.wku.type;
                ((c)localObject2).field_headImageUrl = ???.wku.vMW;
                ((c)localObject2).field_chatName = ???.wku.name;
                ((c)localObject2).field_chatVersion = ???.wku.ver;
                ((c)localObject2).field_needToUpdate = false;
                ((c)localObject2).field_bitFlag = ???.wku.vMX;
                ((c)localObject2).field_maxMemberCnt = ???.wku.vMY;
                ((c)localObject2).field_ownerUserId = ???.wku.vMZ;
                ((c)localObject2).field_addMemberUrl = ???.wku.vNa;
                ((c)localObject2).field_brandUserName = paramm.vNb;
                z.aeT().b((c)localObject2);
              }
              while (true)
              {
                ??? = (com.tencent.mm.aj.n)((w)localObject1).data;
                if (??? != null)
                  ???.a(paramInt1, (com.tencent.mm.ai.m)localObject1);
                AppMethodBeat.o(11571);
                break;
                ??? = null;
                break label2774;
                label3151: paramm = null;
                break label2812;
                label3157: ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
                break label2878;
                label3168: bool1 = false;
                break label2912;
                label3174: bool2 = false;
                break label2922;
                label3180: paramInt1 = -1;
                continue;
                AppMethodBeat.o(11571);
                break;
                paramm = (s)paramm;
                if ((paramm.ehh != null) && (paramm.ehh.fsH.fsP != null))
                {
                  ??? = (aiw)paramm.ehh.fsH.fsP;
                  if ((paramm.ehh == null) || (paramm.ehh.fsG.fsP == null))
                    break label3347;
                  paramm = (aiv)paramm.ehh.fsG.fsP;
                }
                while (true)
                  if ((??? == null) || (???.vNh == null) || (???.vNh.ret != 0))
                  {
                    if ((??? != null) && (???.vNh != null))
                    {
                      ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.vNh.ret) });
                      AppMethodBeat.o(11571);
                      break;
                      ??? = null;
                      break label3238;
                      paramm = null;
                      continue;
                    }
                    ab.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
                    AppMethodBeat.o(11571);
                    break;
                  }
                localObject2 = ???.woQ;
                localObject3 = z.aeT();
                String str = paramm.vNb;
                localObject1 = new ArrayList();
                localObject4 = new StringBuilder();
                ((StringBuilder)localObject4).append("select bizChatServId from BizChatInfo");
                ((StringBuilder)localObject4).append(" where brandUserName = '").append(str).append("'");
                ((StringBuilder)localObject4).append(" and (bitFlag & 8) != 0 ");
                localObject3 = ((d)localObject3).rawQuery(((StringBuilder)localObject4).toString(), new String[0]);
                if (localObject3 != null)
                {
                  if (((Cursor)localObject3).moveToFirst())
                    do
                      ((ArrayList)localObject1).add(((Cursor)localObject3).getString(0));
                    while (((Cursor)localObject3).moveToNext());
                  ((Cursor)localObject3).close();
                }
                localObject3 = ((List)localObject1).iterator();
                while (((Iterator)localObject3).hasNext())
                {
                  localObject4 = (String)((Iterator)localObject3).next();
                  if (!((List)localObject2).contains(localObject4))
                  {
                    localObject4 = z.aeT().rq((String)localObject4);
                    if (localObject4 != null)
                    {
                      ((c)localObject4).field_bitFlag &= -9;
                      z.aeT().b((c)localObject4);
                    }
                  }
                }
                localObject3 = ((List)localObject2).iterator();
                while (((Iterator)localObject3).hasNext())
                {
                  localObject2 = (String)((Iterator)localObject3).next();
                  if (!((List)localObject1).contains(localObject2))
                  {
                    localObject4 = z.aeT().rq((String)localObject2);
                    if (localObject4 == null)
                    {
                      localObject4 = new c();
                      ((c)localObject4).field_bizChatServId = ((String)localObject2);
                      ((c)localObject4).field_brandUserName = paramm.vNb;
                      ((c)localObject4).field_bitFlag |= 8;
                      z.aeT().a((c)localObject4);
                    }
                    else
                    {
                      ((c)localObject4).field_bitFlag |= 8;
                      z.aeT().b((c)localObject4);
                    }
                  }
                }
                a(???.woQ, paramm.vNb);
                break label156;
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.h
 * JD-Core Version:    0.6.2
 */