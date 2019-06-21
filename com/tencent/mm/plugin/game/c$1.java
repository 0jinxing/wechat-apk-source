package com.tencent.mm.plugin.game;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.g.a.vv;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.game.model.a.h.a;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.n.a;
import com.tencent.mm.plugin.game.model.n.b;
import com.tencent.mm.plugin.game.model.n.d;
import com.tencent.mm.plugin.game.model.n.j;
import com.tencent.mm.plugin.game.model.n.k;
import com.tencent.mm.plugin.game.model.n.l;
import com.tencent.mm.plugin.game.model.p;
import com.tencent.mm.plugin.game.model.p.1;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Map;
import org.json.JSONObject;

final class c$1
  implements bz.a
{
  c$1(c paramc)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(111135);
    ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
    parama = parama.eAB;
    Object localObject1 = aa.a(parama.vED);
    ab.i("MicroMsg.GameMessageService", "Received a message: %d", new Object[] { Long.valueOf(parama.ptF) });
    ab.i("MicroMsg.GameMessageService", "Message content: %s".concat(String.valueOf(localObject1)));
    label83: int i;
    if (bo.isNullOrNil((String)localObject1))
    {
      ab.e("MicroMsg.GameMessageParser", "msg content is null");
      parama = null;
      if (parama != null)
      {
        ab.i("MicroMsg.GameMessageService", "type = %d, appId = %s, msgId = %s", new Object[] { Integer.valueOf(parama.field_msgType), parama.field_appId, Long.valueOf(parama.field_msgId) });
        if (parama != null)
          break label1658;
        ab.e("MicroMsg.GameMessageService", "msg is null");
        i = -1;
      }
    }
    long l1;
    label529: boolean bool;
    while (true)
    {
      if (i == 0)
        q.c(parama);
      switch (parama.field_msgType)
      {
      default:
        ab.i("MicroMsg.GameMessageService", "Insert raw message: %b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().b(parama)) });
        com.tencent.mm.plugin.report.service.h.pYm.a(858L, 1L, 1L, false);
        int j = parama.field_msgType;
        if (parama.field_msgType == 100)
          j = parama.mXb;
        com.tencent.mm.plugin.game.e.b.a(ah.getContext(), 0, 0, 0, 18, i, parama.field_appId, 0, j, parama.field_gameMsgId, parama.mXc, com.tencent.mm.plugin.game.e.b.eA("resource", String.valueOf(parama.mWr.mXl)));
        com.tencent.mm.plugin.report.service.h.pYm.a(858L, 0L, 1L, false);
        AppMethodBeat.o(111135);
        return;
        localObject2 = br.z((String)localObject1, "sysmsg");
        if ((localObject2 == null) || (((Map)localObject2).size() == 0))
        {
          ab.e("MicroMsg.GameMessageParser", "Parse failed");
          parama = null;
          break label83;
        }
        if (!"gamecenter".equalsIgnoreCase((String)((Map)localObject2).get(".sysmsg.$type")))
        {
          ab.e("MicroMsg.GameMessageParser", "Type not matched");
          parama = null;
          break label83;
        }
        parama = new n();
        parama.field_showInMsgList = true;
        parama.field_msgId = System.currentTimeMillis();
        parama.field_rawXML = ((String)localObject1);
        parama.field_msgType = bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.$newmsgtype"), 0);
        if ((parama.field_msgType == 100) || (parama.field_msgType == 30))
        {
          u.bEx();
          parama.field_gameMsgId = bo.bc((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_id"), "");
          parama.field_appId = ((String)((Map)localObject2).get(".sysmsg.gamecenter.appid"));
          parama.field_createTime = bo.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.create_time"), System.currentTimeMillis() / 1000L);
          l1 = bo.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.expire_time"), 0L);
          if (l1 == 0L)
          {
            parama.field_expireTime = 9223372036854775807L;
            parama.mWf = bo.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.random_time"), 0L);
            if (bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.wifi_flag"), 0) <= 0)
              break label1062;
            bool = true;
            label573: parama.field_isHidden = bool;
            parama.field_mergerId = bo.bc((String)((Map)localObject2).get(".sysmsg.gamecenter.merge_id"), "");
            parama.field_weight = bo.bc((String)((Map)localObject2).get(".sysmsg.gamecenter.weight"), "");
            parama.field_receiveTime = (System.currentTimeMillis() / 1000L);
            u.q((Map)localObject2, parama);
            parama.mWE = bo.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.filter_flag"), 0L);
            parama.mWF = bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_center.not_in_msg_center"), 0);
            if (bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), 0) <= 0)
              break label1068;
            bool = true;
            label707: parama.mWq = bool;
            parama.mWr.mXj = bo.bc((String)((Map)localObject2).get(".sysmsg.gamecenter.entrance.entrance_icon_url"), "");
            if ((bo.isNullOrNil((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_bubble_info.bubble_icon_url"))) && (bo.isNullOrNil((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_bubble_info.bubble_desc"))))
              break label1074;
            parama.mWs = true;
            label782: u.s((Map)localObject2, parama);
            parama.mWW.mXy = bo.bc((String)((Map)localObject2).get(".sysmsg.gamecenter.display_with_wepkg.$pkg_id"), "");
            parama.mWW.kgX = bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.display_with_wepkg"), 0);
            if (!bo.isNullOrNil(parama.mWW.mXy))
              parama.field_isHidden = true;
            parama.mWW.mXz = bo.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.display_with_wepkg.$always_display_after_time"), 0L);
            u.u((Map)localObject2, parama);
            if (parama.mWF == 1)
              parama.field_showInMsgList = false;
            parama.mWY.mXA = bo.getInt((String)((Map)localObject2).get(".sysmsg.support_version.$android"), 0);
            ab.i("MicroMsg.GameMessageParser", "xml support version: %d, current client version: %d", new Object[] { Integer.valueOf(parama.mWY.mXA), Integer.valueOf(com.tencent.mm.protocal.d.vxo) });
            if ((parama.mWY.mXA != 0) && (parama.mWY.mXA > com.tencent.mm.protocal.d.vxo))
              break label1569;
          }
        }
        label1184: label1569: for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label1574;
          ab.i("MicroMsg.GameMessageParser", "xml is invalid in current client version");
          com.tencent.mm.plugin.game.e.b.a(ah.getContext(), 0, 0, 0, 401, 0, parama.field_appId, 0, 0, parama.field_gameMsgId, parama.mXc, "");
          parama = null;
          break;
          parama.field_expireTime = (bo.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.create_time"), System.currentTimeMillis() / 1000L) + l1);
          break label529;
          label1062: bool = false;
          break label573;
          label1068: bool = false;
          break label707;
          label1074: parama.mWs = false;
          break label782;
          parama.field_gameMsgId = bo.bc((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_id"), "");
          parama.field_msgType = bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.$newmsgtype"), 0);
          if (parama.field_msgType == 0)
            parama.field_msgType = bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.$msgtype"), 0);
          parama.field_appId = ((String)((Map)localObject2).get(".sysmsg.gamecenter.appinfo.appid"));
          if (!bo.isNullOrNil(p.I((Map)localObject2)))
          {
            bool = true;
            parama.field_showInMsgList = bool;
            parama.field_createTime = bo.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.createtime"), System.currentTimeMillis() / 1000L);
            l1 = bo.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.expiredtime"), 0L);
            if (l1 != 0L)
              break label1508;
            parama.field_expireTime = 9223372036854775807L;
            label1250: if (bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.wifi_flag"), 0) <= 0)
              break label1541;
            bool = true;
            label1273: parama.field_isHidden = bool;
            parama.field_mergerId = bo.bc((String)((Map)localObject2).get(".sysmsg.gamecenter.merge_id"), "");
            if (parama.field_msgType != 10)
              break label1547;
            parama.field_weight = "6";
            label1318: parama.field_receiveTime = (System.currentTimeMillis() / 1000L);
            parama.mWE = bo.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.filter_flag"), 0L);
            parama.mWD = p.J((Map)localObject2);
            parama.mWF = bo.getInt((String)((Map)localObject2).get(".sysmsg.game_control_info.not_in_msg_center"), 0);
            if (bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.message_bubble_info.show_message_bubble"), 0) <= 0)
              break label1557;
            bool = true;
            label1403: parama.mWs = bool;
            parama.mXc = bo.bc((String)((Map)localObject2).get(".sysmsg.gamecenter.noticeid"), "");
            parama.mWr.mXl = bo.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.badge_display_type"), 0);
            if (parama.mWr.mXl <= 0)
              break label1563;
          }
          for (bool = true; ; bool = false)
          {
            parama.mWq = bool;
            if ((parama.mWD & 0x4) == 0L)
              parama.mWq = false;
            p.k((Map)localObject2, parama);
            break;
            bool = false;
            break label1184;
            label1508: parama.field_expireTime = (bo.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.createtime"), System.currentTimeMillis() / 1000L) + l1);
            break label1250;
            bool = false;
            break label1273;
            parama.field_weight = "2";
            break label1318;
            bool = false;
            break label1403;
          }
        }
        label1541: label1547: label1557: label1563: label1574: parama.mWZ.mXy = bo.bc((String)((Map)localObject2).get(".sysmsg.wepkg.$pkg_id"), "");
        parama.mWZ.mXB = bo.getInt((String)((Map)localObject2).get(".sysmsg.wepkg.download_trigger_type"), 0);
        new Thread(new p.1(parama.mWZ.mXy, parama.mWZ.mXB)).start();
        break label83;
        label1658: localObject2 = parama.field_gameMsgId;
        if (!bo.isNullOrNil((String)localObject2))
        {
          localObject1 = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bCY();
          i = 0;
          localObject1 = ((r)localObject1).rawQuery("select count(*) from GameRawMessage where gameMsgId = \"" + (String)localObject2 + "\"", new String[0]);
          if (localObject1 != null)
          {
            if (((Cursor)localObject1).moveToFirst())
              i = ((Cursor)localObject1).getInt(0);
            ((Cursor)localObject1).close();
            if (i <= 0);
          }
        }
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label1801;
          ab.e("MicroMsg.GameMessageService", "duplicated msg:%s", new Object[] { parama.field_gameMsgId });
          com.tencent.mm.plugin.report.service.h.pYm.a(858L, 4L, 1L, false);
          i = 2;
          break;
        }
        label1801: l1 = System.currentTimeMillis() / 1000L;
        if (parama.field_expireTime <= l1);
        for (i = 0; ; i = 1)
        {
          if (i != 0)
            break label1921;
          ab.e("MicroMsg.GameMessageService", "msg is expired Time, %s", new Object[] { parama.field_gameMsgId });
          com.tencent.mm.plugin.report.service.h.pYm.a(858L, 5L, 1L, false);
          localObject1 = parama.mWW.mXy;
          if (!bo.isNullOrNil((String)localObject1))
          {
            localObject2 = new vv();
            ((vv)localObject2).cSX.cuy = 6;
            ((vv)localObject2).cSX.cSY = ((String)localObject1);
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          }
          i = 1;
          break;
        }
        label1921: l1 = parama.mWE;
        localObject1 = parama.field_appId;
        if (l1 == 1L)
        {
          if ((!bo.isNullOrNil((String)localObject1)) && (com.tencent.mm.pluginsdk.model.app.g.u(ah.getContext(), (String)localObject1)))
            break label2050;
          com.tencent.mm.plugin.report.service.h.pYm.a(858L, 6L, 1L, false);
          i = 3;
        }
        while (true)
        {
          if (i == 0)
            break label2055;
          ab.e("MicroMsg.GameMessageService", "checkFilter failed,%s, status: %d", new Object[] { parama.field_gameMsgId, Integer.valueOf(i) });
          break;
          if ((l1 == 2L) && ((bo.isNullOrNil((String)localObject1)) || (com.tencent.mm.pluginsdk.model.app.g.u(ah.getContext(), (String)localObject1))))
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(858L, 7L, 1L, false);
            i = 4;
          }
          else
          {
            label2050: i = 0;
          }
        }
        label2055: if (parama.field_msgType != 30)
          break label2083;
        com.tencent.mm.plugin.report.service.h.pYm.a(858L, 8L, 1L, false);
        i = 0;
      case 30:
      }
    }
    label2083: Object localObject2 = q.bEm();
    localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = q.bEo();
    localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = q.bEq();
    if (localObject2 == null);
    for (localObject1 = q.bEs(); ; localObject1 = localObject2)
    {
      while (true)
      {
        if (localObject1 != null)
        {
          ((n)localObject1).bEl();
          localObject2 = new JSONObject();
        }
        try
        {
          ((JSONObject)localObject2).put("oldNoticeId", ((n)localObject1).mXc);
          ((JSONObject)localObject2).put("oldMsgId", ((n)localObject1).field_gameMsgId);
          if (parama.field_weight.compareTo(((n)localObject1).field_weight) >= 0)
            ((JSONObject)localObject2).put("coverType", 1);
          while (true)
          {
            i = parama.field_msgType;
            if (parama.field_msgType == 100)
              i = parama.mXb;
            com.tencent.mm.plugin.game.e.b.a(ah.getContext(), 0, 0, 0, 31, 0, parama.field_appId, 0, i, parama.field_gameMsgId, parama.mXc, com.tencent.mm.plugin.game.e.a.kY(((JSONObject)localObject2).toString()));
            if (parama.field_weight.compareTo(((n)localObject1).field_weight) < 0)
              break label2550;
            com.tencent.mm.plugin.report.service.h.pYm.a(858L, 10L, 1L, false);
            localObject1 = ((n)localObject1).mWW.mXy;
            if (!bo.isNullOrNil((String)localObject1))
            {
              localObject2 = new vv();
              ((vv)localObject2).cSX.cuy = 6;
              ((vv)localObject2).cSX.cSY = ((String)localObject1);
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
            }
            i = 1;
            if (i == 0)
              break label2569;
            i = 1;
            if (i != 0)
            {
              if (!parama.mWq)
                break label2574;
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLV, Long.valueOf(parama.field_msgId));
              if (bo.isNullOrNil(parama.mWG.url))
                break label2593;
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLZ, Long.valueOf(parama.field_msgId));
              if (!parama.mWs)
                break label2599;
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLW, Long.valueOf(parama.field_msgId));
              if (bo.isNullOrNil(parama.mWX.mXi))
                break label2605;
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xMa, Long.valueOf(parama.field_msgId));
            }
            if (parama.field_msgType == 4)
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLY, Long.valueOf(parama.field_msgId));
            if ((parama == null) || (bo.isNullOrNil(parama.mWr.mXj)))
              break;
            com.tencent.mm.plugin.game.f.c.Ot(parama.mWr.mXj);
            break;
            ((JSONObject)localObject2).put("coverType", 2);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.GameMessageService", "reportMsgCover: " + localException.getMessage());
            continue;
            label2550: com.tencent.mm.plugin.report.service.h.pYm.a(858L, 11L, 1L, false);
            i = 0;
            continue;
            label2569: i = 0;
            continue;
            label2574: com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLV, Long.valueOf(0L));
            continue;
            label2593: q.bEp();
            continue;
            label2599: q.bEr();
            continue;
            label2605: q.bEt();
          }
        }
      }
      com.tencent.mm.plugin.game.model.a.h localh = h.a.bFa();
      if ((parama == null) || (bo.isNullOrNil(parama.field_appId)))
      {
        ab.i("MicroMsg.GameSilentDownloader", "msg is null");
        com.tencent.mm.game.report.api.b.eBF.j("appid_is_empty", 16L);
        break;
      }
      localObject2 = parama.field_appId;
      l1 = parama.field_expireTime;
      long l2 = parama.mWf;
      localObject1 = new com.tencent.mm.plugin.game.model.a.d();
      ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_appId = ((String)localObject2);
      if (!((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bDa().b((com.tencent.mm.sdk.e.c)localObject1, new String[0]))
      {
        ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_expireTime = l1;
        ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_randomTime = l2;
        ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_isFirst = true;
        ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_isRunning = false;
        ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_noWifi = true;
        ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_noSdcard = true;
        ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_noEnoughSpace = true;
        ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_lowBattery = true;
        ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_continueDelay = true;
        bool = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bDa().b((com.tencent.mm.sdk.e.c)localObject1);
        ab.i("MicroMsg.GameSilentDownloader", "insert GameSilentDownloadTask, appid:%s, expireTime:%d, randomTime:%d, ret:%b", new Object[] { ((com.tencent.mm.plugin.game.model.a.d)localObject1).field_appId, Long.valueOf(((com.tencent.mm.plugin.game.model.a.d)localObject1).field_expireTime), Long.valueOf(((com.tencent.mm.plugin.game.model.a.d)localObject1).field_randomTime), Boolean.valueOf(bool) });
        localh.hO(false);
        break;
      }
      ab.i("MicroMsg.GameSilentDownloader", "GameSilentDownloadTask exist! appid = %s", new Object[] { localObject2 });
      com.tencent.mm.game.report.api.b.eBF.j((String)localObject2, 17L);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.c.1
 * JD-Core Version:    0.6.2
 */