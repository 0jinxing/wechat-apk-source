package com.tencent.mm.plugin.multitalk.model;

import android.content.Context;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.multitalk.a.a;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.y;
import com.tencent.mm.storage.z;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.bb;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g
{
  private Map<String, Long> oGH;

  public g()
  {
    AppMethodBeat.i(54005);
    this.oGH = new ConcurrentHashMap();
    AppMethodBeat.o(54005);
  }

  final void a(String paramString, e.a parama)
  {
    AppMethodBeat.i(54006);
    String str = aa.a(parama.eAB.vED);
    paramString = Base64.decode(paramString.getBytes(), 0);
    ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive banner msg:" + str + " buffer len " + paramString.length);
    label660: label1187: label1227: 
    try
    {
      localObject1 = new com/tencent/pb/common/b/a/a$bb;
      ((a.bb)localObject1).<init>();
      localObject1 = (a.bb)com.google.a.a.e.a((com.google.a.a.e)localObject1, paramString, paramString.length);
      if (localObject1 == null)
      {
        ab.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parse  bannerinfo  is null! xml:".concat(String.valueOf(str)));
        AppMethodBeat.o(54006);
      }
      while (true)
      {
        return;
        if ((this.oGH.get(((a.bb)localObject1).groupId) == null) || (((Long)this.oGH.get(((a.bb)localObject1).groupId)).longValue() < ((a.bb)localObject1).ApR))
        {
          this.oGH.put(((a.bb)localObject1).groupId, Long.valueOf(((a.bb)localObject1).ApR));
          parama = parama.eAB;
          paramString = aa.a(parama.vEB);
          parama = aa.a(parama.vEC);
          localObject2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, null);
          if (localObject2 == null)
          {
            ab.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "userName is null");
            AppMethodBeat.o(54006);
          }
        }
        else
        {
          paramString = new java/lang/StringBuilder;
          paramString.<init>("msg for this groupId : ");
          ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", ((a.bb)localObject1).groupId + " is early than last msg, so we do not process,now return.");
          AppMethodBeat.o(54006);
          continue;
          if (((String)localObject2).equals(paramString))
            paramString = parama;
          while (true)
          {
            localObject3 = ((a.bb)localObject1).ApP;
            if (((a.bb)localObject1).ApO != 1)
              break label722;
            ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get WxVoiceBannerBegin,show bar!");
            arrayOfString = ((a.bb)localObject1).ApQ;
            arrayOfav = ((a.bb)localObject1).AnQ;
            i = 0;
            parama = "";
            j = arrayOfav.length;
            k = 0;
            while (k < j)
            {
              localObject4 = arrayOfav[k];
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              parama = parama + ((a.av)localObject4).Aop + ",";
              m = i;
              if (((a.av)localObject4).Aop != null)
              {
                m = i;
                if (((a.av)localObject4).Aop.equals(localObject2))
                {
                  ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "in voiceGroupMem!");
                  m = 1;
                }
              }
              k++;
              i = m;
            }
          }
          ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "memberUserNames :".concat(String.valueOf(parama)));
          j = 0;
          n = arrayOfString.length;
          m = 0;
          k = j;
          if (m < n)
          {
            parama = arrayOfString[m];
            if ((parama == null) || (!parama.equals(localObject2)))
              break;
            ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "isInvitedNotFriend true! In invitelist and with talk creator is not friend!");
            k = 1;
          }
          if (i != 0)
            break label628;
          p.bSh().Sk(paramString);
          p.bSh().bRS().remove(paramString);
          if (!((String)localObject2).equals(localObject3))
            break label660;
          p.bSf().c(paramString, (String)localObject3, false, false);
          p.bSh().a(paramString, (a.bb)localObject1);
          p.bSe().oFP.bR(bo.h((Integer)com.tencent.mm.kernel.g.RP().eJH.get(1)), r.Yz());
          AppMethodBeat.o(54006);
        }
      }
    }
    catch (Exception paramString)
    {
      label722: 
      while (true)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        String[] arrayOfString;
        a.av[] arrayOfav;
        int i;
        int j;
        int k;
        Object localObject4;
        int m;
        int n;
        ab.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parse  bannerinfo  failure! xml:".concat(String.valueOf(str)), new Object[] { paramString.getMessage() });
        AppMethodBeat.o(54006);
        continue;
        m++;
        continue;
        label628: if ((!p.bSh().bRS().contains(paramString)) && (k != 0))
        {
          p.bSh().bRS().add(paramString);
          continue;
          if ((i != 0) && (k == 0))
          {
            p.bSf().c(paramString, (String)localObject3, false, false);
          }
          else if ((i != 0) && (k != 0))
          {
            p.bSf().c(paramString, (String)localObject3, true, true);
          }
          else
          {
            p.bSf().c(paramString, (String)localObject3, true, false);
            continue;
            if (((a.bb)localObject1).ApO == 2)
            {
              parama = new java/lang/StringBuilder;
              parama.<init>("WxVoiceBannerMemChange!2,member size : ");
              ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", ((a.bb)localObject1).AnQ.length);
              arrayOfString = ((a.bb)localObject1).ApQ;
              localObject3 = ((a.bb)localObject1).AnQ;
              i = 0;
              parama = "";
              j = localObject3.length;
              k = 0;
              while (k < j)
              {
                arrayOfav = localObject3[k];
                localObject4 = new java/lang/StringBuilder;
                ((StringBuilder)localObject4).<init>();
                parama = parama + arrayOfav.Aop + ",";
                m = i;
                if (arrayOfav.Aop != null)
                {
                  m = i;
                  if (arrayOfav.Aop.equals(localObject2))
                  {
                    ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "in voiceGroupMem!");
                    m = 1;
                  }
                }
                k++;
                i = m;
              }
              ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "memberUserNames :".concat(String.valueOf(parama)));
              j = 0;
              n = arrayOfString.length;
              k = 0;
              m = j;
              if (k < n)
              {
                parama = arrayOfString[k];
                if ((parama != null) && (parama.equals(localObject2)))
                {
                  ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "isInvitedNotFriend true! In invitelist and with talk creator is not friend!");
                  m = 1;
                }
              }
              else
              {
                if (i != 0)
                  break label1155;
                if ((!p.bSh().Sl(paramString)) && (p.bSh().bRS().contains(paramString)) && (p.bSh().ff(paramString, (String)localObject2)))
                {
                  p.bSf();
                  f.Si(paramString);
                }
                p.bSh().Sk(paramString);
                p.bSh().bRS().remove(paramString);
              }
              while (true)
              {
                p.bSe().oFP.bR(bo.h((Integer)com.tencent.mm.kernel.g.RP().eJH.get(1)), r.Yz());
                ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "WxVoiceBannerMemChange setWxUinAndUsrName:");
                localObject2 = p.bSh();
                ab.i("MicroMsg.MultiTalkRoomListMsg", "updateBanner  wxGroupId = %s", new Object[] { paramString });
                parama = p.bSb().RW(paramString);
                if (parama == null)
                  break label1227;
                if (parama.field_roomId == ((a.bb)localObject1).sQS)
                  break label1187;
                paramString = new java/lang/StringBuilder;
                paramString.<init>("roomid has changed! now return!multiTalkInfo.field_roomId:");
                ab.i("MicroMsg.MultiTalkRoomListMsg", parama.field_roomId + "bannerinfo.roomid:" + ((a.bb)localObject1).sQS);
                AppMethodBeat.o(54006);
                break;
                k++;
                break label909;
                if ((!p.bSh().bRS().contains(paramString)) && (m != 0))
                  p.bSh().bRS().add(paramString);
              }
              if (!h.d(paramString, (a.bb)localObject1))
              {
                ab.e("MicroMsg.MultiTalkRoomListMsg", "update multiTalkMember failure!");
                AppMethodBeat.o(54006);
              }
              else
              {
                ((h)localObject2).Sm(paramString);
                AppMethodBeat.o(54006);
                continue;
                ab.i("MicroMsg.MultiTalkRoomListMsg", "change,still show banner.");
                ((h)localObject2).a(paramString, (a.bb)localObject1);
                AppMethodBeat.o(54006);
              }
            }
            else if (((a.bb)localObject1).ApO == 0)
            {
              ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get WxVoiceBannerEnd,dismiss bar!");
              if ((!p.bSh().Sl(paramString)) && (p.bSh().bRS().contains(paramString)) && (p.bSh().ff(paramString, (String)localObject2)))
              {
                p.bSf();
                f.Si(paramString);
              }
              parama = p.bSf();
              localObject1 = new com/tencent/mm/storage/bi;
              ((bi)localObject1).<init>();
              ((bi)localObject1).setType(64);
              ((bi)localObject1).eJ(System.currentTimeMillis());
              ((bi)localObject1).setStatus(6);
              ((bi)localObject1).setContent(ah.getContext().getString(2131301570));
              if (n.ms(paramString))
              {
                ((bi)localObject1).ju(paramString);
                ((bi)localObject1).setContent(((cy)localObject1).field_content);
                ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Z((bi)localObject1);
              }
              if ((parama.oGu != null) && (paramString.equals(parama.oGu.Aqe)) && (!parama.oGx.doT()))
              {
                ab.i("MicroMsg.MT.MultiTalkManager", "multiTalkGroupTmp wxGroupId equals this wxGroupId.");
                parama.oGu = null;
                parama.oGv = 0L;
                parama.oGx.stopTimer();
              }
              p.bSh().Sc(paramString);
              p.bSh().Sk(paramString);
              p.bSh().bRS().remove(paramString);
              AppMethodBeat.o(54006);
            }
            else if (((a.bb)localObject1).ApO == 3)
            {
              for (parama : ((a.bb)localObject1).AnQ)
                if ((parama.Aop != null) && (parama.Aop.equals(localObject2)))
                  ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "wxVoiceBannerWaitTimeOut in voiceGroupMem!");
              AppMethodBeat.o(54006);
            }
            else
            {
              paramString = new java/lang/StringBuilder;
              paramString.<init>("get bannerinfo voicestatus is invalidate!: voicestatus:");
              ab.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", ((a.bb)localObject1).ApO);
              AppMethodBeat.o(54006);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.g
 * JD-Core Version:    0.6.2
 */