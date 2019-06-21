package com.tencent.mm.aq;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.a.qu.a;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.j.a.a.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bz;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.cn;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.be.b;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c extends com.tencent.mm.sdk.b.c<qu>
  implements b.a, k.a, n.b
{
  public final com.tencent.mm.sdk.b.c fCr;
  private Map<Long, bb> fCs;

  public c()
  {
    AppMethodBeat.i(16460);
    this.fCr = new c.1(this);
    this.fCs = new HashMap();
    a.xxA.c(this.fCr);
    b.agG().fCk = this;
    ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().a(this, g.RS().oAl.getLooper());
    com.tencent.mm.modelmulti.n.ahX();
    com.tencent.mm.modelmulti.n.ahV().a(this, aw.RS().oAl.getLooper());
    this.xxI = qu.class.getName().hashCode();
    AppMethodBeat.o(16460);
  }

  private static List<com.tencent.mm.j.a.a.c> a(String paramString, LinkedList<bi> paramLinkedList)
  {
    AppMethodBeat.i(16463);
    Object localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOm();
    Object localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QK(paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nchatroomId:").append(paramString);
    long l1 = ((bi)paramLinkedList.getFirst()).field_msgSeq;
    long l2 = ((bi)paramLinkedList.getLast()).field_msgSeq;
    long l3 = ((bi)paramLinkedList.getFirst()).field_createTime;
    long l4 = ((bi)paramLinkedList.getLast()).field_createTime;
    localStringBuilder.append("\ngetFirst:").append(l1);
    localStringBuilder.append(" getLast:").append(l2);
    localStringBuilder.append(" getFirstCreateTime:").append(l3);
    localStringBuilder.append(" getLastCreateTime:").append(l4);
    localStringBuilder.append("\nblock ");
    paramLinkedList = new com.tencent.mm.j.a.a.c();
    paramLinkedList.eoC = (((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QH(paramString) + 1L);
    paramLinkedList.eoE = (((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QJ(paramString) + 1L);
    paramLinkedList.eoD = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QG(paramString);
    paramLinkedList.eoF = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QI(paramString);
    if (paramLinkedList.eoD - paramLinkedList.eoC >= 0L)
      ((d)localObject2).eoG.add(paramLinkedList);
    while (true)
    {
      paramString = new LinkedList();
      localObject2 = ((d)localObject2).eoG.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramLinkedList = (com.tencent.mm.j.a.a.c)((Iterator)localObject2).next();
        int i = 0;
        long l5 = paramLinkedList.eoC;
        long l6 = paramLinkedList.eoD;
        long l7 = paramLinkedList.eoE;
        long l8 = paramLinkedList.eoF;
        localStringBuilder.append("[").append(l5).append(":").append(l6).append("][").append(l7).append(":").append(l8).append("] | ");
        int j = i;
        if (l5 <= l1)
        {
          j = i;
          if (l1 <= l6)
          {
            localObject1 = new com.tencent.mm.j.a.a.c();
            ((com.tencent.mm.j.a.a.c)localObject1).eoC = paramLinkedList.eoC;
            ((com.tencent.mm.j.a.a.c)localObject1).eoD = (l1 - 1L);
            ((com.tencent.mm.j.a.a.c)localObject1).eoE = l7;
            ((com.tencent.mm.j.a.a.c)localObject1).eoF = (l3 - 1L);
            j = i;
            if (((com.tencent.mm.j.a.a.c)localObject1).eoD - ((com.tencent.mm.j.a.a.c)localObject1).eoC >= 0L)
            {
              paramString.add(localObject1);
              j = 1;
            }
          }
        }
        i = j;
        if (l5 <= l2)
        {
          i = j;
          if (l2 <= l6)
          {
            localObject1 = new com.tencent.mm.j.a.a.c();
            ((com.tencent.mm.j.a.a.c)localObject1).eoC = (1L + l2);
            ((com.tencent.mm.j.a.a.c)localObject1).eoD = l6;
            ((com.tencent.mm.j.a.a.c)localObject1).eoE = (1L + l4);
            ((com.tencent.mm.j.a.a.c)localObject1).eoF = l8;
            i = j;
            if (((com.tencent.mm.j.a.a.c)localObject1).eoD - ((com.tencent.mm.j.a.a.c)localObject1).eoC >= 0L)
            {
              paramString.add(localObject1);
              i = 1;
            }
          }
        }
        if ((i == 0) && ((l1 > l6) || (l2 < l5)))
        {
          paramString.add(paramLinkedList);
          ab.i("MicroMsg.GetChatroomMsgReceiver", "[createBlocks] add raw block!");
        }
      }
      ab.w("MicroMsg.GetChatroomMsgReceiver", "[createBlocks] lastSeq[%s]<firstSeq[%s]", new Object[] { Long.valueOf(paramLinkedList.eoD), Long.valueOf(paramLinkedList.eoC) });
    }
    paramLinkedList = new StringBuilder();
    localObject1 = paramString.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.tencent.mm.j.a.a.c)((Iterator)localObject1).next();
      paramLinkedList.append("[").append(((com.tencent.mm.j.a.a.c)localObject2).eoC).append(":").append(((com.tencent.mm.j.a.a.c)localObject2).eoD).append("][").append(((com.tencent.mm.j.a.a.c)localObject2).eoE).append(":").append(((com.tencent.mm.j.a.a.c)localObject2).eoF).append("] | ");
    }
    ab.i("MicroMsg.GetChatroomMsgReceiver", "[createBlocks] " + localStringBuilder.toString() + "\nnew blockList:" + paramLinkedList.toString());
    AppMethodBeat.o(16463);
    return paramString;
  }

  private static void e(Map<Long, bb> paramMap, String paramString)
  {
    AppMethodBeat.i(16465);
    if ((paramMap.size() == 0) || (ah.isNullOrNil(paramString)))
      AppMethodBeat.o(16465);
    while (true)
    {
      return;
      paramMap = paramMap.values().iterator();
      if (paramMap != null)
        while (paramMap.hasNext())
        {
          Object localObject1 = (bb)paramMap.next();
          if ((localObject1 != null) && (paramString.equals(((bb)localObject1).field_fromUserName)))
          {
            aw.ZK();
            Object localObject2 = com.tencent.mm.model.c.XO().Q(paramString, ((bb)localObject1).field_originSvrId);
            if (((cy)localObject2).field_msgId != 0L)
            {
              ab.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr dealSysCmdMsg msg id[%d], originsvrid[%d]", new Object[] { Long.valueOf(((cy)localObject2).field_msgId), Long.valueOf(((cy)localObject2).field_msgSvrId) });
              localObject2 = new cm();
              ((cm)localObject2).ptF = ((bb)localObject1).field_newMsgId;
              ((cm)localObject2).vEB = aa.vy(((bb)localObject1).field_fromUserName);
              ((cm)localObject2).vEC = aa.vy(((bb)localObject1).field_toUserName);
              ((cm)localObject2).pcX = ((int)((bb)localObject1).field_createTime);
              ((cm)localObject2).vED = aa.vy(((bb)localObject1).field_content);
              ((cm)localObject2).vEG = ((bb)localObject1).field_msgSource;
              ((cm)localObject2).vEI = ((bb)localObject1).field_msgSeq;
              int i = ((bb)localObject1).field_flag;
              ((cm)localObject2).nao = 10002;
              localObject1 = aw.getSysCmdMsgExtension();
              boolean bool1;
              label239: boolean bool2;
              if ((i & 0x2) != 0)
              {
                bool1 = true;
                if ((i & 0x1) == 0)
                  break label287;
                bool2 = true;
                label249: if ((i & 0x4) == 0)
                  break label293;
              }
              label287: label293: for (boolean bool3 = true; ; bool3 = false)
              {
                ((bz)localObject1).b(new e.a((cm)localObject2, bool1, bool2, bool3));
                break;
                bool1 = false;
                break label239;
                bool2 = false;
                break label249;
              }
            }
          }
        }
      AppMethodBeat.o(16465);
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(16462);
    if ((paramn == ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR()) && ((paramObject instanceof String)) && (5 == paramInt))
    {
      paramn = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOm();
      paramObject = (String)paramObject;
      if (paramn.QL(paramObject))
      {
        w localw = paramn.QN(paramObject);
        if (localw.field_seqBlockInfo != null)
          localw.field_seqBlockInfo.eoG.clear();
        localw.field_lastLocalSeq = localw.field_lastPushSeq;
        localw.field_lastLocalCreateTime = localw.field_lastPushCreateTime;
        long l = paramn.b(localw);
        ab.i("MicroMsg.GetChatroomMsgReceiver", "[onNotifyChange] username:" + paramObject + " ret:" + l + " chatroomMsgSeq:" + localw.toString());
      }
    }
    AppMethodBeat.o(16462);
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(16464);
    if (!ah.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        long l = Long.valueOf(paramString).longValue();
        paramString = new com/tencent/mm/storage/bb;
        paramString.<init>();
        paramString.field_originSvrId = l;
        com.tencent.mm.modelmulti.n.ahX();
        if (com.tencent.mm.modelmulti.n.ahV().b(paramString, new String[0]))
        {
          this.fCs.put(Long.valueOf(l), paramString);
          ab.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr dealSysCmdMsg onNotifyChange put info systemRowid[%d], svrId[%d]", new Object[] { Long.valueOf(paramString.xDa), Long.valueOf(l) });
          AppMethodBeat.o(16464);
          return;
        }
        this.fCs.remove(Long.valueOf(l));
        ab.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr dealSysCmdMsg onNotifyChange remove info svrId[%d]", new Object[] { Long.valueOf(l) });
        AppMethodBeat.o(16464);
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.GetChatroomMsgReceiver", paramString, "summerbadcr dealSysCmdMsg onNotifyChange:", new Object[0]);
      }
      AppMethodBeat.o(16464);
    }
  }

  public final void a(String paramString, boolean paramBoolean1, LinkedList<bi> paramLinkedList, com.tencent.mm.j.a.a.c paramc, boolean paramBoolean2)
  {
    AppMethodBeat.i(16461);
    if ((paramLinkedList.size() <= 0) || (paramBoolean2))
    {
      ab.w("MicroMsg.GetChatroomMsgReceiver", "[onFetched] fetchList.size() == 0! removeBlock! isBlockAll:".concat(String.valueOf(paramBoolean2)));
      l1 = paramc.eoC;
      l2 = paramc.eoD;
      ab.i("MicroMsg.GetChatroomMsgReceiver", "[removeBlock] firstMsgSeq:" + l1 + " lastMsgSeq:" + l2 + " chatroomId:" + paramString);
      paramc = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOm();
      paramLinkedList = paramc.QN(paramString);
      if (paramLinkedList.field_seqBlockInfo != null)
      {
        LinkedList localLinkedList = new LinkedList();
        localObject1 = paramLinkedList.field_seqBlockInfo.eoG.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (com.tencent.mm.j.a.a.c)((Iterator)localObject1).next();
          if ((((com.tencent.mm.j.a.a.c)localObject2).eoC == l1) && (((com.tencent.mm.j.a.a.c)localObject2).eoD == l2))
            localLinkedList.add(localObject2);
        }
        paramLinkedList.field_seqBlockInfo.eoG.removeAll(localLinkedList);
        l3 = paramc.b(paramLinkedList);
        ab.i("MicroMsg.GetChatroomMsgReceiver", "[removeBlock] firstMsgSeq:" + l1 + " lastMsgSeq:" + l2 + " chatroomId:" + paramString + " ret:" + l3 + " remove list:" + localLinkedList.size());
        if (localLinkedList.size() > 0)
        {
          localObject1 = com.tencent.mm.ui.chatting.j.b.yZH;
          com.tencent.mm.ui.chatting.j.b.dGZ();
        }
      }
      paramLinkedList.field_lastLocalSeq = paramLinkedList.field_lastPushSeq;
      paramLinkedList.field_lastLocalCreateTime = paramLinkedList.field_lastPushCreateTime;
      l3 = paramc.b(paramLinkedList);
      ab.i("MicroMsg.GetChatroomMsgReceiver", "[removeBlock] firstMsgSeq:" + l1 + " lastMsgSeq:" + l2 + " chatroomId:" + paramString + " ret:" + l3 + " lastPushSeq:" + paramLinkedList.field_lastPushSeq + " field_lastPushCreateTime:" + paramLinkedList.field_lastPushCreateTime);
      AppMethodBeat.o(16461);
      return;
    }
    ab.i("MicroMsg.GetChatroomMsgReceiver", "[onFetched] insert msg count[%s] isFetchUp:%s", new Object[] { Integer.valueOf(paramLinkedList.size()), Boolean.valueOf(paramBoolean1) });
    Object localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOm();
    paramc = a(paramString, paramLinkedList);
    Object localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QK(paramString);
    ((d)localObject2).eoG.clear();
    ((d)localObject2).eoG.addAll(paramc);
    paramBoolean1 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).a(paramString, (d)localObject2);
    long l4 = ((bi)paramLinkedList.getLast()).field_msgSeq;
    long l1 = ((bi)paramLinkedList.getLast()).field_createTime;
    long l3 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QH(paramString);
    long l2 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QJ(paramString);
    ab.i("MicroMsg.GetChatroomMsgReceiver", "[onFetched] blockList size:%s ret:%s GetSeq:[last %s:old %s] GetLocalCreateTime:[last %s:old %s]", new Object[] { Integer.valueOf(((d)localObject2).eoG.size()), Boolean.valueOf(paramBoolean1), Long.valueOf(l4), Long.valueOf(l3), Long.valueOf(l1), Long.valueOf(l2) });
    if (l3 < l4)
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).L(paramString, l4);
      ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).J(paramString, l1);
    }
    while (true)
    {
      e(new HashMap(this.fCs), paramString);
      AppMethodBeat.o(16461);
      break;
      ab.w("MicroMsg.GetChatroomMsgReceiver", "oldGetSeq>=lastGetSeq [%s:%s]", new Object[] { Long.valueOf(l3), Long.valueOf(l4) });
    }
  }

  static final class a
    implements Runnable
  {
    qu fCu;

    private a(qu paramqu)
    {
      this.fCu = paramqu;
    }

    public final void run()
    {
      AppMethodBeat.i(16459);
      long l1 = System.currentTimeMillis();
      if (!g.RK())
        ab.w("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run] accHasReady no!");
      Object localObject3;
      Object localObject4;
      int i;
      long l3;
      Object localObject5;
      long l4;
      Object localObject6;
      int j;
      long l5;
      int m;
      int n;
      label510: bi localbi;
      label519: label615: label622: label886: Object localObject2;
      while (true)
      {
        ab.d("MicroMsg.GetChatroomMsgReceiver", "[HandlePushTask$run] cost:" + (System.currentTimeMillis() - l1));
        AppMethodBeat.o(16459);
        return;
        Object localObject1 = this.fCu.cMZ.data;
        if (localObject1 == null)
          break label1985;
        localObject3 = new cn();
        try
        {
          ((cn)localObject3).parseFrom((byte[])localObject1);
          long l2 = System.currentTimeMillis();
          localObject4 = aa.a(((cn)localObject3).vEJ);
          i = ((cn)localObject3).vEI;
          l3 = 1000L * ((cn)localObject3).pcX;
          localObject5 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOm();
          if (((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject5).QL((String)localObject4))
          {
            ab.i("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run#update] chatRoomId:%s updatePushSeqRet[%s]:%s updatePushCreateTimeRet[%s]:%s", new Object[] { localObject4, Integer.valueOf(i), Boolean.valueOf(((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject5).I((String)localObject4, i)), Long.valueOf(l3), Boolean.valueOf(((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject5).K((String)localObject4, l3)) });
            ab.d("MicroMsg.GetChatroomMsgReceiver", "[updateChatroomMsgSeq] cost:" + (System.currentTimeMillis() - l2));
            l4 = System.currentTimeMillis();
            localObject6 = aa.a(((cn)localObject3).vEJ);
            j = ((cn)localObject3).vEI;
            l5 = ((cn)localObject3).ptF;
            i = ((cn)localObject3).pcX;
            int k = ((cn)localObject3).vEM;
            m = ((cn)localObject3).nao;
            n = ((cn)localObject3).vEK;
            localObject3 = aa.a(((cn)localObject3).vEL);
            ab.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv chatRoomId[%s], newMsgId[%d], createTime[%d], isActed[%d], msgseq[%d], msgType[%d], unDeliverCount[%d], content[%s]", new Object[] { localObject6, Long.valueOf(l5), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(n), bo.anv((String)localObject3) });
            localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aoZ((String)localObject6);
            if (localObject1 != null)
              break label1234;
            localObject1 = new ak((String)localObject6);
            ((ak)localObject1).eD(i * 1000L);
            ((ak)localObject1).eF(j);
            ((ak)localObject1).hM(1);
            ((ak)localObject1).hT(1);
            b.agG();
            b.rX((String)localObject6);
            l5 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).Yo().QP((String)localObject6);
            ab.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv new conv lastDeleteSeq(FirstUnDeliverSeq)[%d], msgSeq[%d]", new Object[] { Long.valueOf(l5), Integer.valueOf(j) });
            if (l5 <= 0L)
              break label1226;
            ((ak)localObject1).eG(l5);
            i = 1;
            if (k > 0)
              ((ak)localObject1).hR(((at)localObject1).field_atCount + k);
            localbi = new bi();
            localbi.hO(0);
            localbi.ju((String)localObject6);
            localbi.setType(m);
            localbi.setContent((String)localObject3);
            if (m != 49)
              break label1544;
            localObject5 = j.b.me(com.tencent.mm.pluginsdk.model.app.j.hE((String)localObject6, (String)localObject3));
            localbi.setType(l.d((j.b)localObject5));
            if (!localbi.drC())
              break label1541;
            localObject3 = ((j.b)localObject5).content;
            localbi.setContent((String)localObject3);
            ((ak)localObject1).hO(0);
            ((ak)localObject1).setContent(localbi.field_content);
            ((ak)localObject1).jg(Integer.toString(localbi.getType()));
            be.b localb = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().Cb();
            if (localb == null)
              break label1883;
            localObject4 = new PString();
            localObject3 = new PString();
            localObject5 = new PInt();
            localb.a(localbi, (PString)localObject4, (PString)localObject3, (PInt)localObject5, false);
            ((ak)localObject1).jh(((PString)localObject4).value);
            ((ak)localObject1).ji(((PString)localObject3).value);
            ((ak)localObject1).hP(((PInt)localObject5).value);
            if (localbi.getType() == 49)
            {
              localObject3 = (String)br.z(((at)localObject1).field_content, "msg").get(".msg.appmsg.title");
              localObject5 = bo.nullAsNil(((at)localObject1).field_digest);
              if (!bo.isNullOrNil((String)localObject3))
                break label1857;
              localObject3 = "";
              label798: ((ak)localObject1).jh(((String)localObject5).concat((String)localObject3));
            }
            label809: if (i == 0)
              break label1894;
            ab.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv insert username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", new Object[] { localObject6, Long.valueOf(((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().d((ak)localObject1)), Long.valueOf(((at)localObject1).field_firstUnDeliverSeq), Long.valueOf(((at)localObject1).field_lastSeq), Integer.valueOf(((at)localObject1).field_UnDeliverCount) });
            ab.d("MicroMsg.GetChatroomMsgReceiver", "[updateConv] cost:" + (System.currentTimeMillis() - l4));
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.GetChatroomMsgReceiver", localException, "", new Object[0]);
          localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rc((String)localObject4);
          if (localObject2 == null)
            break label1996;
        }
      }
      if (((cy)localObject2).field_msgId == 0L)
      {
        ab.w("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run] has not any ReceivedMsg!");
        localObject2 = null;
      }
      label1058: label1082: label1217: label1226: label1996: 
      while (true)
      {
        if (localObject2 != null)
        {
          localObject6 = com.tencent.mm.pluginsdk.f.h.formatTime("yyyy-MM-dd HH:mm:ss", ((cy)localObject2).field_createTime / 1000L);
          ab.w("MicroMsg.GetChatroomMsgReceiver", "[lastFaultMsgInfo] lastFaultMsgInfo:%s timeFormat:%s", new Object[] { bo.anv(((cy)localObject2).field_content), localObject6 });
        }
        localObject6 = new w();
        ((w)localObject6).field_username = ((String)localObject4);
        ((w)localObject6).field_lastPushSeq = i;
        long l6;
        if (localObject2 != null)
        {
          l5 = ((cy)localObject2).field_msgSeq;
          ((w)localObject6).field_lastLocalSeq = l5;
          ((w)localObject6).field_lastPushCreateTime = l3;
          if (localObject2 == null)
            break label1198;
          l5 = ((cy)localObject2).field_createTime;
          ((w)localObject6).field_lastLocalCreateTime = l5;
          l6 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject5).a((w)localObject6);
          if (localObject2 == null)
            break label1207;
          l5 = ((cy)localObject2).field_msgSeq;
          label1110: if (localObject2 == null)
            break label1217;
        }
        for (l4 = ((cy)localObject2).field_createTime; ; l4 = l3 - 1L)
        {
          ab.i("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run#insert] ret:%s,chatRoomId:%s updatePushSeq:%s updatePushCreateTime:%s field_lastLocalSeq:%s field_lastLocalCreateTime:%s", new Object[] { Long.valueOf(l6), localObject4, Integer.valueOf(i), Long.valueOf(l3), Long.valueOf(l5), Long.valueOf(l4) });
          localObject2 = com.tencent.mm.ui.chatting.j.b.yZH;
          com.tencent.mm.ui.chatting.j.b.dGX();
          break;
          l5 = i - 1;
          break label1058;
          l5 = l3 - 1L;
          break label1082;
          l5 = i - 1;
          break label1110;
        }
        l5 = j;
        break label510;
        label1234: int i1 = (int)((at)localObject2).field_lastSeq;
        if (j > i1)
        {
          ((ak)localObject2).eF(j);
          int i2 = ((at)localObject2).field_UnDeliverCount;
          ((ak)localObject2).hT(n);
          ((ak)localObject2).eD(i * 1000L);
          if (n > ((at)localObject2).field_unReadCount)
            ((ak)localObject2).hM(n);
          while (true)
          {
            l5 = ((at)localObject2).field_firstUnDeliverSeq;
            ab.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv  msgSeq[%d], firstSeq[%d], lastseq[%d]", new Object[] { Integer.valueOf(j), Long.valueOf(l5), Integer.valueOf(i1) });
            if (l5 <= 0L)
              break label1409;
            localObject5 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().R((String)localObject6, i1);
            if (((cy)localObject5).field_msgId > 0L)
              ((ak)localObject2).eG(((cy)localObject5).field_msgSeq);
            i = 0;
            break;
            ((ak)localObject2).hM(n - i2 + ((at)localObject2).field_unReadCount);
          }
          l5 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).Yo().QP((String)localObject6);
          if (l5 > 0L)
          {
            ((ak)localObject2).eG(l5);
            i = 0;
            break label519;
          }
          l5 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Ru((String)localObject6);
          ab.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv lastMsgSeq[%s]", new Object[] { Long.valueOf(l5) });
          if (l5 > 0L)
            ((ak)localObject2).eG(l5);
          i = 0;
          break label519;
        }
        if ((j == i1) && (n == 0) && (((at)localObject2).field_unReadCount > 0))
          ((ak)localObject2).hM(0);
        i = 0;
        break label519;
        break label615;
        if (m != 10002)
          break label622;
        ((p)g.M(p.class)).getSysCmdMsgExtension();
        if ((localbi.getType() != 10002) || (bo.isNullOrNil((String)localObject3)))
          break label622;
        if (bo.isNullOrNil((String)localObject3))
        {
          ab.e("MicroMsg.SysCmdMsgExtension", "null msg content");
          break label622;
        }
        if (((String)localObject3).startsWith("~SEMI_XML~"))
        {
          localObject5 = com.tencent.mm.sdk.platformtools.be.amR((String)localObject3);
          if (localObject5 == null)
          {
            ab.e("MicroMsg.SysCmdMsgExtension", "SemiXml values is null, msgContent %s", new Object[] { localObject3 });
            break label622;
          }
          localObject3 = localObject5;
          localObject5 = "brand_service";
        }
        while (true)
        {
          if ((localObject5 == null) || (!((String)localObject5).equals("revokemsg")))
            break label1855;
          ab.i("MicroMsg.SysCmdMsgExtension", "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
          ((Map)localObject3).get(".sysmsg.revokemsg.session");
          localObject5 = (String)((Map)localObject3).get(".sysmsg.revokemsg.newmsgid");
          localObject3 = (String)((Map)localObject3).get(".sysmsg.revokemsg.replacemsg");
          ab.i("MicroMsg.SysCmdMsgExtension", "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", new Object[] { localObject5, localObject3 });
          localbi.setContent((String)localObject3);
          localbi.setType(10000);
          break;
          m = ((String)localObject3).indexOf("<sysmsg");
          if (m == -1)
          {
            ab.e("MicroMsg.SysCmdMsgExtension", "msgContent not start with <sysmsg");
            break;
          }
          localObject4 = br.z(((String)localObject3).substring(m), "sysmsg");
          if (localObject4 == null)
          {
            ab.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", new Object[] { localObject3 });
            break;
          }
          localObject5 = (String)((Map)localObject4).get(".sysmsg.$type");
          localObject3 = localObject4;
        }
        break label622;
        localObject3 = " " + bo.nullAsNil((String)localObject3);
        break label798;
        label1883: ((ak)localObject2).jh(((at)localObject2).field_content);
        break label809;
        label1894: ((ak)localObject2).hQ(((at)localObject2).field_attrflag & 0xFFEFFFFF);
        ab.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv update username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", new Object[] { localObject6, Long.valueOf(((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().a((ak)localObject2, (String)localObject6, true)), Long.valueOf(((at)localObject2).field_firstUnDeliverSeq), Long.valueOf(((at)localObject2).field_lastSeq), Integer.valueOf(((at)localObject2).field_UnDeliverCount) });
        break label886;
        ab.e("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run] data is null");
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aq.c
 * JD-Core Version:    0.6.2
 */