package com.tencent.mm.plugin.webwx.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.a.i;
import com.tencent.mm.at.d.a;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.sk;
import com.tencent.mm.g.a.sk.a;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI;
import com.tencent.mm.plugin.webwx.ui.WebWXPopupUnlockUI;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.cdl;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
  implements e, d.a
{
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, com.tencent.mm.ai.m paramm)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(26507);
    ab.i("MicroMsg.StatusNotifyMsgExtension", "onImgTaskEnd imgLocalId:%d, msgLocalId:%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    AppMethodBeat.o(26507);
  }

  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(26506);
    parama = parama.eAB;
    Object localObject1;
    Object localObject2;
    int i;
    if ((parama != null) && (parama.nao == 51))
    {
      ab.d("MicroMsg.StatusNotifyMsgExtension", "msgType %d %d", new Object[] { Integer.valueOf(parama.nao), Integer.valueOf(51) });
      localObject1 = aa.a(parama.vEC);
      if (!bo.isNullOrNil((String)localObject1))
      {
        localObject2 = aa.a(parama.vED).trim();
        parama = br.z((String)localObject2, "msg");
        if (parama != null)
        {
          i = bo.getInt((String)parama.get(".msg.op.$id"), 0);
          ab.d("MicroMsg.StatusNotifyMsgExtension", "handleStatusNotifyMsg, %d", new Object[] { Integer.valueOf(i) });
          if ((i != 1) && (i != 2) && (i != 5))
            break label345;
          ab.i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr mark conversation readed. userName = ".concat(String.valueOf(localObject1)));
          com.tencent.mm.model.aw.ZK();
          c.XO().QY((String)localObject1);
          com.tencent.mm.plugin.webwx.a.gkE.cancelNotification((String)localObject1);
          if (!t.nd((String)localObject1))
            break label218;
          com.tencent.mm.model.aw.ZK();
          c.Ry().set(143618, Integer.valueOf(0));
          d.akP().dtc();
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(26506);
      return null;
      label218: ab.i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr STATUSNOTIFY clearChatRoomMsgSeq");
      com.tencent.mm.model.aw.ZK();
      c.XR().apb((String)localObject1);
      if (t.kH((String)localObject1))
      {
        com.tencent.mm.model.aw.ZK();
        parama = c.XR().aoZ((String)localObject1);
        if ((parama != null) && (parama.field_unReadCount > 0) && (parama.field_UnDeliverCount > 0))
        {
          ab.i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr STATUSNOTIFY clearChatRoomMsgSeq chatroom[%s], UnDeliver[%d], Unread[%d]", new Object[] { localObject1, Integer.valueOf(parama.field_UnDeliverCount), Integer.valueOf(parama.field_unReadCount) });
          com.tencent.mm.plugin.webwx.a.gkF.dl((String)localObject1);
          parama.hM(0);
          com.tencent.mm.model.aw.ZK();
          c.XR().a(parama, (String)localObject1);
          continue;
          label345: long l;
          if (i == 3)
          {
            ab.i("MicroMsg.StatusNotifyMsgExtension", "summerstatus op[%s]", new Object[] { Integer.valueOf(i) });
            l = System.currentTimeMillis();
            com.tencent.mm.model.aw.ZK();
            localObject2 = c.XR().dsO();
            localObject1 = new StringBuilder();
            i = 0;
            if (i < ((List)localObject2).size())
            {
              if (i > 0);
              for (parama = ","; ; parama = "")
              {
                ((StringBuilder)localObject1).append(parama);
                ((StringBuilder)localObject1).append((String)((List)localObject2).get(i));
                i++;
                break;
              }
            }
            ab.i("MicroMsg.StatusNotifyMsgExtension", "summerstatus userNames[%s] take[%d]ms", new Object[] { Integer.valueOf(((List)localObject2).size()), Long.valueOf(System.currentTimeMillis() - l) });
            Object localObject3 = u.P(t.fkP, 0);
            if (localObject3 == null)
            {
              i = -1;
              ab.i("MicroMsg.StatusNotifyMsgExtension", "summerstatus unreadUsernames[%s] take[%d]ms", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
              if (localObject3 != null)
                break label662;
            }
            label662: for (i = 0; ; i = ((List)localObject3).size())
            {
              parama = null;
              if (i <= 0)
                break label674;
              parama = new LinkedList();
              localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).XR();
              Iterator localIterator = ((List)localObject3).iterator();
              while (localIterator.hasNext())
              {
                localObject3 = (String)localIterator.next();
                cdl localcdl = new cdl();
                localcdl.jBB = ((String)localObject3);
                localcdl.xdh = ((int)((be)localObject2).aoZ((String)localObject3).field_conversationTime);
                parama.add(localcdl);
              }
              i = ((List)localObject3).size();
              break;
            }
            label674: parama = new y(((StringBuilder)localObject1).toString(), 4, i, parama);
            com.tencent.mm.model.aw.Rg().a(parama, 0);
          }
          else if (i == 6)
          {
            ab.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
          }
          else if (i == 7)
          {
            ab.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
            com.tencent.mm.model.aw.ZK();
            ab.d("MicroMsg.StatusNotifyMsgExtension", "onlineversion: %d,%d", new Object[] { Integer.valueOf(c.XJ()), Integer.valueOf(l.aji()) });
            localObject1 = bo.nullAsNil((String)parama.get(".msg.op.name")).trim();
            localObject2 = bo.nullAsNil((String)parama.get(".msg.op.arg")).trim();
            if ("WeixinStatus".equals(localObject1))
            {
              com.tencent.mm.model.aw.ZK();
              if ((c.XJ() == l.aji()) && (l.fOX != null) && (l.fOX.trim().length() > 0))
              {
                parama = new Intent(ah.getContext(), WebWXLogoutUI.class);
                parama.setFlags(603979776);
                parama.addFlags(268435456);
                parama.putExtra("intent.key.online_version", l.aji());
                ah.getContext().startActivity(parama);
              }
            }
            else if ("MomentsUnreadMsgStatus".equals(localObject1))
            {
              parama = new sk();
              parama.cOH.czE = 7;
              parama.cOH.cOI = ((String)localObject1);
              parama.cOH.cOJ = bo.getInt((String)localObject2, 0);
              ab.i("MicroMsg.StatusNotifyMsgExtension", "sns enter function, %d, %s, %d", new Object[] { Integer.valueOf(parama.cOH.czE), parama.cOH.cOI, Long.valueOf(parama.cOH.cOJ) });
              com.tencent.mm.sdk.b.a.xxA.m(parama);
            }
            else if ("EnterpriseChatStatus".equals(localObject1))
            {
              com.tencent.mm.aj.z.afe();
              i.h(i, (String)localObject1, (String)localObject2);
            }
          }
          else if (i == 8)
          {
            ab.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
            localObject1 = bo.nullAsNil((String)parama.get(".msg.op.name")).trim();
            parama = bo.nullAsNil((String)parama.get(".msg.op.arg")).trim();
            if ("EnterpriseChatStatus".equals(localObject1))
            {
              com.tencent.mm.aj.z.afe();
              i.h(i, (String)localObject1, parama);
            }
            else
            {
              parama = new sk();
              parama.cOH.czE = 8;
              com.tencent.mm.sdk.b.a.xxA.m(parama);
            }
          }
          else if (i == 9)
          {
            ab.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
            localObject1 = bo.nullAsNil((String)parama.get(".msg.op.name")).trim();
            parama = bo.nullAsNil((String)parama.get(".msg.op.arg")).trim();
            if ("MomentsTimelineStatus".equals(localObject1))
            {
              localObject2 = parama.split(",");
              if (localObject2.length == 2)
              {
                parama = new sk();
                parama.cOH.czE = 9;
                parama.cOH.cOI = ((String)localObject1);
                parama.cOH.cOJ = bo.getInt(localObject2[1], 0);
                parama.cOH.cOK = localObject2[0];
                com.tencent.mm.sdk.b.a.xxA.m(parama);
              }
            }
            else if ("EnterpriseChatStatus".equals(localObject1))
            {
              com.tencent.mm.aj.z.afe();
              i.h(i, (String)localObject1, parama);
            }
          }
          else if (i == 11)
          {
            localObject1 = bo.nullAsNil((String)parama.get(".msg.op.name")).trim();
            parama = bo.nullAsNil((String)parama.get(".msg.op.arg")).trim();
            if (!"DownloadFile".equals(localObject1))
              ab.i("MicroMsg.StatusNotifyMsgExtension", "[MultiTerminalSyncMgr]not DownloadFile, ignore");
            localObject1 = br.z(parama, "downloadList");
            if (localObject1 != null)
            {
              i = 0;
              while (true)
              {
                label1438: localObject2 = new StringBuilder(".downloadList.downloadItem");
                if (i == 0);
                for (parama = ""; ; parama = Integer.valueOf(i))
                {
                  localObject2 = parama;
                  i++;
                  parama = (String)localObject2 + ".username";
                  localObject2 = (String)localObject2 + ".msgsvrid";
                  parama = (String)((Map)localObject1).get(parama);
                  if (bo.isNullOrNil(parama))
                    break;
                  l = bo.getLong((String)((Map)localObject1).get(localObject2), -1L);
                  if (l == -1L)
                    break;
                  com.tencent.mm.model.aw.ZK();
                  parama = c.XO().Q(parama, l);
                  if (parama.field_msgSvrId != 0L)
                    break label1614;
                  ab.i("MicroMsg.StatusNotifyMsgExtension", "[MicroMsg.MultiTerminalSyncMgr] msg not exit, svrID:%d", new Object[] { Long.valueOf(l) });
                  break label1438;
                }
                label1614: g.ddf().ddh().lU(parama.field_msgId);
              }
            }
          }
          else if (i == 12)
          {
            ab.d("MicroMsg.StatusNotifyMsgExtension", "williamjin extdevice unlock ".concat(String.valueOf(localObject2)), new Object[] { Integer.valueOf(i) });
            try
            {
              if (parama.get(".msg.op.arg") == null)
                break label1783;
              localObject1 = new org/json/JSONObject;
              ((JSONObject)localObject1).<init>((String)parama.get(".msg.op.arg"));
              localObject1 = ((JSONObject)localObject1).get("deviceName").toString();
              if (!l.ajh())
                continue;
              parama = new android/content/Intent;
              parama.<init>(ah.getContext(), WebWXPopupUnlockUI.class);
              parama.setFlags(872415232);
              parama.putExtra("deviceName", (String)localObject1);
              ah.getContext().startActivity(parama);
            }
            catch (JSONException parama)
            {
              ab.e("MicroMsg.StatusNotifyMsgExtension", "[williamjin] " + parama.getMessage());
            }
            continue;
            label1783: ab.d("MicroMsg.StatusNotifyMsgExtension", "[williamjin] can not find the tag  .msg.op.arg");
          }
          else
          {
            ab.e("MicroMsg.StatusNotifyMsgExtension", "unknow opCode, %d", new Object[] { Integer.valueOf(i) });
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.f
 * JD-Core Version:    0.6.2
 */