package com.tencent.mm.aq;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hk;
import com.tencent.mm.g.a.hk.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.j.a.a.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.w;
import java.util.LinkedList;

final class c$1 extends com.tencent.mm.sdk.b.c<hk>
{
  c$1(c paramc)
  {
    AppMethodBeat.i(16456);
    this.xxI = hk.class.getName().hashCode();
    AppMethodBeat.o(16456);
  }

  private static boolean a(hk paramhk)
  {
    AppMethodBeat.i(16457);
    long l1 = System.currentTimeMillis();
    while (true)
    {
      bi localbi;
      try
      {
        Object localObject1 = ((j)g.K(j.class)).bOm();
        if (!((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QL(paramhk.cCg.username))
        {
          localObject2 = new com/tencent/mm/storage/w;
          ((w)localObject2).<init>();
          ((w)localObject2).field_username = paramhk.cCg.username;
          if (paramhk.cCg.cCh <= paramhk.cCg.cCj)
          {
            l2 = paramhk.cCg.cCj;
            ((w)localObject2).field_lastPushSeq = l2;
            ((w)localObject2).field_lastLocalSeq = paramhk.cCg.cCj;
            ((w)localObject2).field_lastPushCreateTime = paramhk.cCg.cCi;
            ((w)localObject2).field_lastLocalCreateTime = paramhk.cCg.cCk;
            l2 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).a((w)localObject2, true);
            localObject1 = com.tencent.mm.ui.chatting.j.b.yZH;
            com.tencent.mm.ui.chatting.j.b.dGX();
            ab.i("MicroMsg.GetChatroomMsgReceiver", "[GetChatRoomWrapEvent#callback] ret:%s,chatRoomId:%s lastPushSeq:%s lastPushCreateTime:%s lastLocalSeq:%s lastLocalCreateTime:%s", new Object[] { Long.valueOf(l2), paramhk.cCg.username, Long.valueOf(paramhk.cCg.cCh), Long.valueOf(paramhk.cCg.cCi), Long.valueOf(paramhk.cCg.cCj), Long.valueOf(paramhk.cCg.cCk) });
            return true;
          }
          l2 = paramhk.cCg.cCh;
          continue;
        }
        Object localObject2 = paramhk.cCg.username;
        localbi = ((j)g.K(j.class)).bOr().Rc((String)localObject2);
        long l3 = paramhk.cCg.cCh;
        long l4 = paramhk.cCg.cCi;
        paramhk = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QN((String)localObject2);
        long l5 = paramhk.field_lastLocalSeq;
        l2 = paramhk.field_lastLocalCreateTime;
        long l6 = paramhk.field_lastPushSeq;
        long l7 = paramhk.field_lastPushCreateTime;
        ab.i("MicroMsg.GetChatroomMsgReceiver", "[GetChatRoomWrapEvent#callback] isGetChatroom! %s conPushSeq:%s conPushCreateTime:%s localSeq:%s localCreateTime:%s pushSeq:%s pushCreateTime:%s", new Object[] { localObject2, Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l2), Long.valueOf(l6), Long.valueOf(l7) });
        if ((localbi != null) && (localbi.field_msgId != 0L))
        {
          long l8 = localbi.field_msgSeq;
          if (l8 > l5)
          {
            paramhk.field_lastLocalSeq = l8;
            paramhk.field_lastLocalCreateTime = localbi.field_createTime;
            com.tencent.mm.j.a.a.c localc = new com/tencent/mm/j/a/a/c;
            localc.<init>();
            localc.eoC = (1L + l5);
            localc.eoE = (l2 + 1L);
            localc.eoD = (l8 - 1L);
            localc.eoF = (l7 - 1L);
            if (paramhk.field_seqBlockInfo == null)
            {
              d locald = new com/tencent/mm/j/a/a/d;
              locald.<init>();
              paramhk.field_seqBlockInfo = locald;
            }
            paramhk.field_seqBlockInfo.eoG.addLast(localc);
            ab.i("MicroMsg.GetChatroomMsgReceiver", "[GetChatRoomWrapEvent#callback] fix chatroomMsgSeqStorage local seq is smaller than MsgInfoStg local seq! ret:[%s]", new Object[] { Long.valueOf(((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).b(paramhk)) });
          }
          if (l6 < l3)
            ab.i("MicroMsg.GetChatroomMsgReceiver", "[GetChatRoomWrapEvent#callback] fix chatroomMsgSeqStorage push seq is smaller than conversation seq! ret:[%s,%s] [%s,%s]", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).I((String)localObject2, l3)), Boolean.valueOf(((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).K((String)localObject2, l4)), Long.valueOf(localbi.field_msgSeq), Long.valueOf(l5) });
          ab.i("MicroMsg.GetChatroomMsgReceiver", "handle GetChatRoomWrapEvent cost:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          AppMethodBeat.o(16457);
          continue;
        }
        if (localbi == null)
        {
          bool = true;
          if (localbi != null)
            break label758;
          l2 = -1L;
          ab.w("MicroMsg.GetChatroomMsgReceiver", "lastMsgInfo is null? %s lastMsgInfo id:%s", new Object[] { Boolean.valueOf(bool), Long.valueOf(l2) });
          continue;
        }
      }
      finally
      {
        ab.i("MicroMsg.GetChatroomMsgReceiver", "handle GetChatRoomWrapEvent cost:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        AppMethodBeat.o(16457);
      }
      boolean bool = false;
      continue;
      label758: long l2 = localbi.field_msgId;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aq.c.1
 * JD-Core Version:    0.6.2
 */