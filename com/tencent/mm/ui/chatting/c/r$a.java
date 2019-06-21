package com.tencent.mm.ui.chatting.c;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hk;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.w;

final class r$a
  implements Runnable
{
  String talker;

  private r$a(r paramr, String paramString)
  {
    this.talker = paramString;
  }

  public final void run()
  {
    AppMethodBeat.i(31444);
    long l1 = System.currentTimeMillis();
    while (true)
    {
      Object localObject1;
      Object localObject2;
      long l2;
      long l3;
      int i;
      try
      {
        aw.ZK();
        localObject1 = com.tencent.mm.model.c.XR().aoZ(this.talker);
        localObject2 = ((j)g.K(j.class)).bOr();
        if ((localObject1 == null) || (localObject2 == null))
        {
          if (localObject1 == null)
          {
            bool = true;
            ab.e("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$run] null == conv?%s talker:%s", new Object[] { Boolean.valueOf(bool), this.talker });
            r.b(this.yQd).sendEmptyMessage(2);
            return;
          }
          boolean bool = false;
          continue;
        }
        l2 = ((at)localObject1).field_lastSeq;
        l3 = ((at)localObject1).field_conversationTime;
        if (this.yQd.dEi())
        {
          Object localObject3 = ((j)g.K(j.class)).bOm().QN(this.yQd.cgL.getTalkerUserName());
          l3 = ((w)localObject3).field_lastLocalSeq;
          l2 = ((w)localObject3).field_lastPushSeq;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("[isNeedLoadBottom] lastPushSeq:");
          ab.i("MicroMsg.GetChatroomComponent", l2 + " lastLocalSeq:" + l3);
          if (l3 != l2)
          {
            i = 1;
            if (i == 0)
              continue;
            r.b(this.yQd).sendEmptyMessage(1);
            ab.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$run] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
            AppMethodBeat.o(31444);
            continue;
          }
          i = 0;
          continue;
          r.b(this.yQd).sendEmptyMessage(2);
          continue;
        }
      }
      finally
      {
        ab.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$run] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        AppMethodBeat.o(31444);
      }
      if (((ak)localObject1).jl(67108864))
      {
        ab.w("MicroMsg.GetChatroomComponent", "has check! %s", new Object[] { this.talker });
        r.b(this.yQd).sendEmptyMessage(2);
        ab.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$run] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        AppMethodBeat.o(31444);
      }
      else
      {
        ((ak)localObject1).jj(67108864);
        aw.ZK();
        com.tencent.mm.model.c.XR().a((ak)localObject1, this.talker);
        long l4 = System.currentTimeMillis();
        bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.a.h)localObject2).fa(this.talker, " and msgSeq != 0 and flag & 2 != 0");
        ab.i("MicroMsg.GetChatroomComponent", "seq:%s getLastMsg cost:%sms filter:%s", new Object[] { Long.valueOf(localbi.field_msgSeq), Long.valueOf(System.currentTimeMillis() - l4), " and msgSeq != 0 and flag & 2 != 0" });
        if ((localbi.field_msgId > 0L) || (((at)localObject1).field_UnDeliverCount > 0))
        {
          i = 1;
          label520: if (i == 0)
            break label896;
          localbi = ((com.tencent.mm.plugin.messenger.foundation.a.a.h)localObject2).Rc(this.talker);
          l4 = cb.aaD() - 259200000L;
          localObject1 = com.tencent.mm.pluginsdk.f.h.formatTime("yyyy-MM-dd HH:mm:ss", l4 / 1000L);
          localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.a.h)localObject2).af(this.talker, l4);
          if (((cy)localObject2).field_msgId == 0L)
          {
            ab.w("MicroMsg.GetChatroomComponent", "[handleFoundGetChatroom] getUpIncReceivedMsg is null!");
            long l5 = ((j)g.K(j.class)).Yo().QQ(this.talker);
            l4 = ((j)g.K(j.class)).Yo().QP(this.talker);
            ((bi)localObject2).eJ(l5);
            ((bi)localObject2).eL(l4);
          }
          String str = com.tencent.mm.pluginsdk.f.h.formatTime("yyyy-MM-dd HH:mm:ss", ((cy)localObject2).field_createTime / 1000L);
          ab.i("MicroMsg.GetChatroomComponent", "[handleFoundGetChatroom] talker:%s seq:[%s:%s] time:[%s:%s] fromTimeFormat:%s recMsgTimeFormat:%s", new Object[] { this.talker, Long.valueOf(l2), Long.valueOf(((cy)localObject2).field_msgSeq), Long.valueOf(l3), Long.valueOf(((cy)localObject2).field_createTime), localObject1, str });
          localObject1 = new com/tencent/mm/g/a/hk;
          ((hk)localObject1).<init>();
          ((hk)localObject1).cCg.username = this.yQd.cgL.getTalkerUserName();
          ((hk)localObject1).cCg.cCj = ((cy)localObject2).field_msgSeq;
          ((hk)localObject1).cCg.cCk = ((cy)localObject2).field_createTime;
          ((hk)localObject1).cCg.cCh = l2;
          ((hk)localObject1).cCg.cCi = l3;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          r.b(this.yQd).sendEmptyMessage(8);
          if ((localbi == null) || (localbi.field_msgSeq == l2))
            break label881;
          r.b(this.yQd).sendEmptyMessage(1);
        }
        while (true)
        {
          ab.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$run] found get chatroom![%s]", new Object[] { this.talker });
          break;
          i = 0;
          break label520;
          label881: r.b(this.yQd).sendEmptyMessage(4);
        }
        label896: ab.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$run] not found get chatroom![%s]", new Object[] { this.talker });
        r.b(this.yQd).sendEmptyMessage(2);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.r.a
 * JD-Core Version:    0.6.2
 */