package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.card.b.b;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.plugin.card.model.a.f;
import com.tencent.mm.plugin.card.model.a.f.a;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.nm;
import com.tencent.mm.protocal.protobuf.nz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import com.tencent.mm.x.c;
import java.util.List;
import java.util.Map;

final class am$6$1
  implements Runnable
{
  am$6$1(am.6 param6, String paramString, e.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87938);
    k localk = am.bba();
    Object localObject1 = this.gUV;
    String str1 = this.fkt.eAB.ptF;
    ab.i("MicroMsg.CardMsgManager", "card onReceiveMsg msgId is ".concat(String.valueOf(str1)));
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      Object localObject2 = br.z((String)localObject1, "sysmsg");
      if (localObject2 == null)
        localObject1 = null;
      while (true)
        if (localObject1 == null)
        {
          ab.e("MicroMsg.CardMsgManager", "card msg == null");
          AppMethodBeat.o(87938);
          return;
          localObject1 = new g();
          Object localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.card_type");
          label141: label346: String str2;
          if ((!TextUtils.isEmpty((CharSequence)localObject3)) && (com.tencent.mm.plugin.card.d.l.isNumeric((String)localObject3)))
          {
            ((g)localObject1).field_card_type = Integer.valueOf((String)localObject3).intValue();
            ((g)localObject1).field_title = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.title"));
            ((g)localObject1).field_description = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.description"));
            ((g)localObject1).field_logo_url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.logo_url"));
            ((g)localObject1).field_logo_color = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.logo_color"));
            localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.time");
            if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.d.l.isNumeric((String)localObject3)))
              break label1122;
            if (Long.valueOf((String)localObject3).longValue() < 2147483647L)
              break label1107;
            ((g)localObject1).field_time = 2147483647;
            label256: ((g)localObject1).field_card_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.card_id"));
            ((g)localObject1).field_card_tp_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.card_tp_id"));
            ((g)localObject1).field_msg_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_id"));
            localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_type");
            if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.d.l.isNumeric((String)localObject3)))
              break label1137;
            ((g)localObject1).field_msg_type = Integer.valueOf((String)localObject3).intValue();
            localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.jump_type");
            if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.d.l.isNumeric((String)localObject3)))
              break label1145;
            ((g)localObject1).field_jump_type = Integer.valueOf((String)localObject3).intValue();
            label388: ((g)localObject1).field_url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.url"));
            str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.button.text");
            if (!TextUtils.isEmpty(str2))
            {
              localObject3 = new nm();
              ((nm)localObject3).text = str2;
              ((nm)localObject3).url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.button.url"));
              str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.button.action_type");
              if ((TextUtils.isEmpty(str2)) || (!com.tencent.mm.plugin.card.d.l.isNumeric(str2)))
                break label1153;
              ((nm)localObject3).kdC = Integer.valueOf(str2).intValue();
              label502: ((g)localObject1).kdt = ((nm)localObject3);
            }
          }
          try
          {
            ((g)localObject1).field_buttonData = ((g)localObject1).kdt.toByteArray();
            str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.text");
            if (!TextUtils.isEmpty(str2))
            {
              localObject3 = new nz();
              ((nz)localObject3).text = str2;
              ((nz)localObject3).url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.url"));
              str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.type");
              if ((TextUtils.isEmpty(str2)) || (!com.tencent.mm.plugin.card.d.l.isNumeric(str2)))
                break label1203;
              ((nz)localObject3).type = Integer.valueOf(str2).intValue();
              str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.endtime");
              if ((TextUtils.isEmpty(str2)) || (!com.tencent.mm.plugin.card.d.l.isNumeric(str2)))
                break label1228;
              if (Long.valueOf(str2).longValue() < 2147483647L)
                break label1212;
              ((nz)localObject3).qsz = 2147483647;
              ((g)localObject1).kdu = ((nz)localObject3);
            }
          }
          catch (Exception localException1)
          {
            try
            {
              while (true)
              {
                ((g)localObject1).field_operData = ((g)localObject1).kdu.toByteArray();
                localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.report_scene");
                if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.d.l.isNumeric((String)localObject3)))
                  break label1285;
                ((g)localObject1).field_report_scene = Integer.valueOf((String)localObject3).intValue();
                ((g)localObject1).field_read_state = 1;
                ((g)localObject1).field_accept_buttons = k.i((Map)localObject2, ".sysmsg.carditemmsg");
                ((g)localObject1).field_jump_buttons = k.h((Map)localObject2, ".sysmsg.carditemmsg");
                localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.get_layout_scene");
                if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.d.l.isNumeric((String)localObject3)))
                  break label1293;
                ((g)localObject1).kdx = Integer.valueOf((String)localObject3).intValue();
                ((g)localObject1).field_consumed_box_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.consumed_box_id"));
                ((g)localObject1).kdn = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.reddot_wording"));
                ((g)localObject1).kdo = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.reddot_buff"));
                ((g)localObject1).kdp = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.reddot_icon_url"));
                ((g)localObject1).kdq = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_tips.title"));
                ((g)localObject1).kdr = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_tips.icon_url"));
                localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_scene");
                if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.d.l.isNumeric((String)localObject3)))
                  break label1301;
                ((g)localObject1).kdy = Integer.valueOf((String)localObject3).intValue();
                ab.i("MicroMsg.CardMsgManager", "msg_scene is ".concat(String.valueOf(localObject3)));
                str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.need_check");
                ab.i("MicroMsg.CardMsgManager", "need_check:".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2))
                  break label1309;
                ((g)localObject1).kds = str2.equals("true");
                localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.all_unavailable");
                ab.i("MicroMsg.CardMsgManager", "all_Unavailable:".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty((CharSequence)localObject3))
                  break label1317;
                ((g)localObject1).kdz = ((String)localObject3).equals("true");
                ((g)localObject1).field_unavailable_qr_code_list = k.j((Map)localObject2, ".sysmsg.carditemmsg");
                ((g)localObject1).field_need_pull_card_entrance = "true".equals(((Map)localObject2).get(".sysmsg.carditemmsg.need_pull_card_entrance"));
                break;
                ((g)localObject1).field_card_type = 0;
                break label141;
                label1107: ((g)localObject1).field_time = Integer.valueOf((String)localObject3).intValue();
                break label256;
                label1122: ((g)localObject1).field_time = ((int)(System.currentTimeMillis() / 1000L));
                break label256;
                label1137: ((g)localObject1).field_msg_type = 0;
                break label346;
                label1145: ((g)localObject1).field_jump_type = 1;
                break label388;
                label1153: ((nm)localObject3).kdC = 0;
                break label502;
                localException1 = localException1;
                ab.e("MicroMsg.CardMsgInfo", "setCardButton fail, ex = %s", new Object[] { localException1.getMessage() });
                ab.printErrStackTrace("MicroMsg.CardMsgInfo", localException1, "", new Object[0]);
                continue;
                label1203: localException1.type = 0;
                continue;
                label1212: localException1.qsz = Integer.valueOf(str2).intValue();
              }
              label1228: localException1.qsz = ((int)(System.currentTimeMillis() / 1000L));
            }
            catch (Exception localException2)
            {
              while (true)
              {
                ab.e("MicroMsg.CardMsgInfo", "setOperationRegion fail, ex = %s", new Object[] { localException2.getMessage() });
                ab.printErrStackTrace("MicroMsg.CardMsgInfo", localException2, "", new Object[0]);
                continue;
                label1285: ((g)localObject1).field_report_scene = 2;
                continue;
                label1293: ((g)localObject1).kdx = 0;
                continue;
                label1301: ((g)localObject1).kdy = 0;
                continue;
                label1309: ((g)localObject1).kds = false;
                continue;
                label1317: ((g)localObject1).kdz = false;
              }
            }
          }
        }
      if (TextUtils.isEmpty(((g)localObject1).field_card_id))
        ab.e("MicroMsg.CardMsgManager", "card id == null");
      localObject2 = ((g)localObject1).field_msg_id;
      ((g)localObject1).field_msg_id = str1;
      if (TextUtils.isEmpty(((g)localObject1).field_msg_id))
        ((g)localObject1).field_msg_id = ((String)localObject2);
      if (TextUtils.isEmpty(((g)localObject1).field_msg_id))
        ((g)localObject1).field_msg_id = System.currentTimeMillis();
      ab.i("MicroMsg.CardMsgManager", "msg.field_msg_id : " + ((g)localObject1).field_msg_id);
      ab.i("MicroMsg.CardMsgManager", "msg for msg_type ==  " + ((g)localObject1).field_msg_type);
      if (((g)localObject1).kdx != 0)
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKp, Integer.valueOf(((g)localObject1).kdx));
      ab.i("MicroMsg.CardMsgManager", "reddot_buff is " + ((g)localObject1).kdo);
      if (TextUtils.isEmpty(((g)localObject1).kdo))
        break label1881;
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKl, ((g)localObject1).kdo);
      label1527: if ((((g)localObject1).field_msg_type & 0x1) != 0)
      {
        ab.i("MicroMsg.CardMsgManager", "msg_tips_title is " + ((g)localObject1).kdq);
        ab.i("MicroMsg.CardMsgManager", "msg_tips_icon_url is " + ((g)localObject1).kdr);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKn, ((g)localObject1).kdq);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKo, ((g)localObject1).kdr);
      }
      boolean bool1 = c.PK().bX(262152, 266256);
      boolean bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if ((((g)localObject1).field_msg_type & 0x40) != 0)
        {
          c.PK().x(262152, true);
          bool2 = true;
        }
      }
      if (!bool2)
        break label1892;
      ab.i("MicroMsg.CardMsgManager", "has card new msg, return");
      label1681: if ((((g)localObject1).field_msg_type & 0x1) != 0)
      {
        if (localk.Gq(((g)localObject1).field_msg_id))
          break label2492;
        localk.kbM.add(localObject1);
        k.c((g)localObject1);
        if ((((g)localObject1).field_msg_type & 0x80) != 0)
          localk.kbN += 1;
      }
    }
    while (true)
    {
      com.tencent.mm.kernel.g.RP().Ry().set(139268, Integer.valueOf(localk.kbN));
      localk.a((g)localObject1);
      if ((((g)localObject1).field_msg_type & 0x2) != 0)
      {
        am.baV();
        b.sO(((g)localObject1).kdx);
      }
      if ((((g)localObject1).field_msg_type & 0x4) != 0)
        localk.aVU();
      if ((((g)localObject1).field_msg_type & 0x8) != 0)
        am.bbc().s(((g)localObject1).field_card_id, ((g)localObject1).field_card_tp_id, ((g)localObject1).field_report_scene);
      if ((((g)localObject1).field_msg_type & 0x400) != 0)
      {
        ((g)localObject1).baQ();
        am.bbm().b((g)localObject1);
      }
      if (((((g)localObject1).field_msg_type & 0x1000) != 0) && (((g)localObject1).field_need_pull_card_entrance))
      {
        localObject1 = f.kfh;
        f.a.fF(true);
      }
      com.tencent.mm.plugin.card.d.l.beB();
      AppMethodBeat.o(87938);
      break;
      label1881: ab.e("MicroMsg.CardMsgManager", "reddot_buff is empty");
      break label1527;
      label1892: ab.i("MicroMsg.CardMsgManager", "not has new!");
      int i;
      label1931: int j;
      label1995: int k;
      if ((((g)localObject1).field_msg_type & 0x20) != 0)
      {
        c.PK().y(262152, true);
        ab.i("MicroMsg.CardMsgManager", "has reddot");
        i = 1;
        if (TextUtils.isEmpty(((g)localObject1).kdn))
          break label2219;
        ab.i("MicroMsg.CardMsgManager", "reddot_wording is " + ((g)localObject1).kdn);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKj, ((g)localObject1).kdn);
        c.PK().a(ac.a.xKd, true);
        j = 1;
        ab.i("MicroMsg.CardMsgManager", "reddot_icon_url is " + ((g)localObject1).kdp);
        if (TextUtils.isEmpty(((g)localObject1).kdp))
          break label2233;
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKm, ((g)localObject1).kdp);
        c.PK().a(ac.a.xKe, true);
        k = 1;
        label2059: if ((i == 0) || (j == 0) || (k == 0))
        {
          if ((i == 0) || (j == 0) || (k != 0))
            break label2247;
          c.PK().a(ac.a.xKe, false);
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKm, "");
        }
      }
      while (true)
      {
        if ((i == 0) && (j == 0) && (k == 0))
          break label2490;
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKA, ((g)localObject1).field_card_id);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKB, Boolean.valueOf(((g)localObject1).kds));
        ab.i("MicroMsg.CardMsgManager", "card_id:" + ((g)localObject1).field_card_id + "  need_check:" + ((g)localObject1).kds);
        break;
        ab.e("MicroMsg.CardMsgManager", "not has reddot!");
        i = 0;
        break label1931;
        label2219: ab.e("MicroMsg.CardMsgManager", "reddot_wording is empty!");
        j = 0;
        break label1995;
        label2233: ab.e("MicroMsg.CardMsgManager", "reddot_icon_url is empty");
        k = 0;
        break label2059;
        label2247: if ((i != 0) && (j == 0) && (k != 0))
        {
          c.PK().a(ac.a.xKd, false);
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKj, "");
        }
        else if ((i == 0) && (j != 0) && (k != 0))
        {
          c.PK().y(262152, false);
        }
        else if ((i != 0) && (j == 0) && (k == 0))
        {
          c.PK().a(ac.a.xKe, false);
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKm, "");
          c.PK().a(ac.a.xKd, false);
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKj, "");
        }
        else if ((i == 0) && (j != 0) && (k == 0))
        {
          c.PK().a(ac.a.xKe, false);
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKm, "");
          c.PK().y(262152, false);
        }
        else if ((i == 0) && (j == 0) && (k != 0))
        {
          c.PK().a(ac.a.xKd, false);
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKj, "");
          c.PK().y(262152, false);
        }
      }
      label2490: break label1681;
      label2492: ab.e("MicroMsg.CardMsgManager", "msg for id " + ((g)localObject1).field_msg_id + " is exist!!");
      localk.Gr(((g)localObject1).field_msg_id);
      localk.kbM.add(localObject1);
      k.c((g)localObject1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.am.6.1
 * JD-Core Version:    0.6.2
 */