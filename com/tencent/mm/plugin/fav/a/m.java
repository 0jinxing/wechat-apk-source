package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class m
{
  public static void a(m.a parama, g paramg)
  {
    AppMethodBeat.i(102698);
    if ((paramg.field_favProto.wiv == null) || (paramg.field_favProto.wiv.isEmpty()))
      AppMethodBeat.o(102698);
    while (true)
    {
      return;
      localObject = ((aar)paramg.field_favProto.wiv.getFirst()).wgZ;
      if (localObject != null)
        break;
      AppMethodBeat.o(102698);
    }
    d locald = new d();
    locald.l("20source_publishid", ((aau)localObject).fiN + ",");
    locald.l("21uxinfo", ((aau)localObject).fiM + ",");
    locald.l("22clienttime", bo.anU() + ",");
    locald.l("23video_statu", ",");
    Object localObject = new StringBuilder();
    if (paramg.field_type == 16);
    for (int i = 1; ; i = 2)
    {
      locald.l("24source_type", i + ",");
      locald.l("25scene", "5,");
      locald.l("26action_type", m.a.a(parama) + ",");
      locald.l("27scene_chatname", ",");
      locald.l("28scene_username", paramg.field_fromUser + ",");
      locald.l("29curr_publishid", ",");
      locald.l("30curr_msgid", "0,");
      locald.l("31curr_favid", paramg.field_id + ",");
      locald.l("32elapsed_time", "0,");
      locald.l("33load_time", "0,");
      locald.l("34is_load_complete", "0,");
      locald.l("35destination", "0,");
      locald.l("36chatroom_membercount", "0,");
      ab.i("MicroMsg.FavVideoStatistic", "report snsad_video_action: " + locald.Fk());
      ((c)com.tencent.mm.kernel.g.K(c.class)).e(12990, new Object[] { locald });
      AppMethodBeat.o(102698);
      break;
    }
  }

  public static void a(m.c paramc, g paramg, m.d paramd, int paramInt)
  {
    AppMethodBeat.i(102699);
    if ((paramg.field_favProto.wiv == null) || (paramg.field_favProto.wiv.isEmpty()))
      AppMethodBeat.o(102699);
    aau localaau;
    while (true)
    {
      return;
      localaau = ((aar)paramg.field_favProto.wiv.getFirst()).wgZ;
      if (localaau != null)
        break;
      AppMethodBeat.o(102699);
    }
    d locald = new d();
    locald.l("20source_publishid", localaau.fiN + ",");
    locald.l("21uxinfo", localaau.fiM + ",");
    locald.l("22clienttime", bo.anU() + ",");
    locald.l("23video_statu", m.d.a(paramd) + ",");
    paramd = new StringBuilder();
    if (paramg.field_type == 16);
    for (int i = 1; ; i = 2)
    {
      locald.l("24source_type", i + ",");
      locald.l("25scene", "5,");
      locald.l("26action_type", m.c.a(paramc) + ",");
      locald.l("27scene_chatname", ",");
      locald.l("28scene_username", paramg.field_fromUser + ",");
      locald.l("29curr_publishid", ",");
      locald.l("30curr_msgid", "0,");
      locald.l("31curr_favid", paramg.field_id + ",");
      locald.l("32chatroom_membercount", "0,");
      locald.l("33chatroom_toMemberCount", paramInt + ",");
      ab.i("MicroMsg.FavVideoStatistic", "report snsad_video_spread: " + locald.Fk());
      h.pYm.e(12991, new Object[] { locald });
      AppMethodBeat.o(102699);
      break;
    }
  }

  public static void w(g paramg)
  {
    AppMethodBeat.i(102697);
    if ((paramg.field_favProto.wiv == null) || (paramg.field_favProto.wiv.isEmpty()))
      AppMethodBeat.o(102697);
    aar localaar;
    while (true)
    {
      return;
      localaar = (aar)paramg.field_favProto.wiv.getFirst();
      localObject = localaar.wgZ;
      if (localObject != null)
        break;
      AppMethodBeat.o(102697);
    }
    d locald = new d();
    locald.l("20source_publishid", ((aau)localObject).fiN + ",");
    locald.l("21uxinfo", ((aau)localObject).fiM + ",");
    locald.l("22clienttime", bo.anU() + ",");
    Object localObject = new StringBuilder();
    if (paramg.field_type == 16);
    for (int i = 1; ; i = 2)
    {
      locald.l("23source_type", i + ",");
      locald.l("24scene", "5,");
      locald.l("25scene_chatname", ",");
      locald.l("26scene_username", paramg.field_fromUser + ",");
      locald.l("27curr_publishid", ",");
      locald.l("28curr_msgid", "0,");
      locald.l("29curr_favid", paramg.field_id + ",");
      locald.l("30isdownload", "0,");
      locald.l("31chatroom_membercount", "0,");
      ((i)com.tencent.mm.kernel.g.K(i.class)).b(localaar.cMn, locald);
      ab.i("MicroMsg.FavVideoStatistic", "report snsad_video_exposure: " + locald.Fk());
      h.pYm.e(12989, new Object[] { locald });
      AppMethodBeat.o(102697);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.m
 * JD-Core Version:    0.6.2
 */