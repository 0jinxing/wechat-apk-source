package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class j
{
  public static void a(j.a parama, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5, long paramLong, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(35782);
    d locald = new d();
    locald.l("20source_publishid", paramString1 + ",");
    locald.l("21uxinfo", paramString2 + ",");
    locald.l("22clienttime", bo.anU() + ",");
    locald.l("23video_statu", ",");
    locald.l("24source_type", paramInt1 + ",");
    locald.l("25scene", paramInt2 + ",");
    locald.l("26action_type", j.a.a(parama) + ",");
    locald.l("27scene_chatname", paramString4 + ",");
    locald.l("28scene_username", paramString3 + ",");
    locald.l("29curr_publishid", paramString5 + ",");
    locald.l("30curr_msgid", paramLong + ",");
    locald.l("31curr_favid", paramInt3 + ",");
    locald.l("32elapsed_time", "0,");
    locald.l("33load_time", "0,");
    locald.l("34is_load_complete", "0,");
    locald.l("35destination", "0,");
    locald.l("36chatroom_membercount", paramInt4 + ",");
    f.a(paramString5, locald);
    ab.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + locald.Fk());
    h.pYm.e(12990, new Object[] { locald });
    AppMethodBeat.o(35782);
  }

  public static void a(j.b paramb, j.a parama, n paramn, int paramInt)
  {
    int i = 2;
    AppMethodBeat.i(35781);
    TimeLineObject localTimeLineObject = paramn.cqu();
    Object localObject = localTimeLineObject.xfI.wbK;
    if ((localObject != null) && (!((List)localObject).isEmpty()) && (((localTimeLineObject.xfI.wbJ == 15) && (paramn.DI(32))) || (localTimeLineObject.xfI.wbJ == 18)))
    {
      ((List)localObject).get(0);
      if ((paramn.DI(32)) && (localTimeLineObject.xfI.wbJ == 15))
        if (paramInt != 2)
          break label558;
    }
    label558: for (paramn = paramn.cqr(); ; paramn = paramn.cqq())
    {
      if (paramn != null)
        localTimeLineObject.xfN.fiM = paramn.qPj;
      localTimeLineObject.xfN.fiN = localTimeLineObject.Id;
      localObject = new d();
      ((d)localObject).l("20source_publishid", localTimeLineObject.xfN.fiN + ",");
      ((d)localObject).l("21uxinfo", localTimeLineObject.xfN.fiM + ",");
      ((d)localObject).l("22clienttime", bo.anU() + ",");
      ((d)localObject).l("23video_statu", ",");
      paramn = new StringBuilder();
      paramInt = i;
      if (localTimeLineObject.xfI.wbJ == 15)
        paramInt = 1;
      ((d)localObject).l("24source_type", paramInt + ",");
      ((d)localObject).l("25scene", paramb.value + ",");
      ((d)localObject).l("26action_type", j.a.a(parama) + ",");
      ((d)localObject).l("27scene_chatname", ",");
      ((d)localObject).l("28scene_username", localTimeLineObject.jBB + ",");
      ((d)localObject).l("29curr_publishid", localTimeLineObject.Id + ",");
      ((d)localObject).l("30curr_msgid", "0,");
      ((d)localObject).l("31curr_favid", "0,");
      ((d)localObject).l("32elapsed_time", "0,");
      ((d)localObject).l("33load_time", "0,");
      ((d)localObject).l("34is_load_complete", "0,");
      ((d)localObject).l("35destination", "0,");
      ((d)localObject).l("36chatroom_membercount", "0,");
      p.a(localTimeLineObject.rjC, (d)localObject);
      ab.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + ((d)localObject).Fk());
      ((c)g.K(c.class)).e(12990, new Object[] { localObject });
      AppMethodBeat.o(35781);
      return;
    }
  }

  public static void a(j.c paramc, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5, long paramLong, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(35784);
    d locald = new d();
    locald.l("20source_publishid", paramString1 + ",");
    locald.l("21uxinfo", paramString2 + ",");
    locald.l("22clienttime", bo.anU() + ",");
    locald.l("23video_statu", "3,");
    locald.l("24source_type", paramInt1 + ",");
    locald.l("25scene", paramInt2 + ",");
    locald.l("26action_type", paramc.value + ",");
    locald.l("27scene_chatname", paramString4 + ",");
    locald.l("28scene_username", paramString3 + ",");
    locald.l("29curr_publishid", paramString5 + ",");
    locald.l("30curr_msgid", paramLong + ",");
    locald.l("31curr_favid", paramInt3 + ",");
    locald.l("32chatroom_membercount", paramInt4 + ",");
    locald.l("33chatroom_toMemberCount", paramInt5 + ",");
    ab.i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + locald.Fk());
    f.a(paramString5, locald);
    h.pYm.e(12991, new Object[] { locald });
    AppMethodBeat.o(35784);
  }

  public static void a(j.d paramd, j.c paramc, j.e parame, int paramInt1, n paramn, int paramInt2)
  {
    int i = 2;
    AppMethodBeat.i(35783);
    TimeLineObject localTimeLineObject = paramn.cqu();
    Object localObject = localTimeLineObject.xfI.wbK;
    if ((localObject != null) && (!((List)localObject).isEmpty()) && (((localTimeLineObject.xfI.wbJ == 15) && (paramn.DI(32))) || (localTimeLineObject.xfI.wbJ == 18)))
    {
      ((List)localObject).get(0);
      if ((paramn.DI(32)) && (localTimeLineObject.xfI.wbJ == 15))
        if (paramInt2 != 2)
          break label575;
    }
    label575: for (localObject = paramn.cqr(); ; localObject = paramn.cqq())
    {
      if (localObject != null)
        localTimeLineObject.xfN.fiM = paramn.cqq().qPj;
      localTimeLineObject.xfN.fiN = localTimeLineObject.Id;
      paramn = new d();
      paramn.l("20source_publishid", localTimeLineObject.xfN.fiN + ",");
      paramn.l("21uxinfo", localTimeLineObject.xfN.fiM + ",");
      paramn.l("22clienttime", bo.anU() + ",");
      paramn.l("23video_statu", j.e.a(parame) + ",");
      parame = new StringBuilder();
      paramInt2 = i;
      if (localTimeLineObject.xfI.wbJ == 15)
        paramInt2 = 1;
      paramn.l("24source_type", paramInt2 + ",");
      paramn.l("25scene", paramd.value + ",");
      paramn.l("26action_type", paramc.value + ",");
      paramn.l("27scene_chatname", ",");
      paramn.l("28scene_username", localTimeLineObject.jBB + ",");
      paramn.l("29curr_publishid", localTimeLineObject.Id + ",");
      paramn.l("30curr_msgid", "0,");
      paramn.l("31curr_favid", "0,");
      paramn.l("32chatroom_membercount", "0,");
      paramn.l("33chatroom_toMemberCount", paramInt1 + ",");
      p.a(localTimeLineObject.rjC, paramn);
      ab.i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + paramn.Fk());
      h.pYm.e(12991, new Object[] { paramn });
      AppMethodBeat.o(35783);
      return;
    }
  }

  public static void a(n paramn, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    int i = 2;
    AppMethodBeat.i(35780);
    TimeLineObject localTimeLineObject = paramn.cqu();
    Object localObject = localTimeLineObject.xfI.wbK;
    if ((localObject != null) && (!((List)localObject).isEmpty()) && (((localTimeLineObject.xfI.wbJ == 15) && (paramn.DI(32))) || (localTimeLineObject.xfI.wbJ == 18)))
    {
      ((List)localObject).get(0);
      if ((paramn.DI(32)) && (localTimeLineObject.xfI.wbJ == 15))
      {
        if (paramInt != 2)
          break label501;
        paramn = paramn.cqr();
        localTimeLineObject.xfN.fiM = paramn.qPj;
        localTimeLineObject.xfN.fiN = localTimeLineObject.Id;
      }
      paramn = new d();
      paramn.l("20source_publishid", localTimeLineObject.xfN.fiN + ",");
      paramn.l("21uxinfo", localTimeLineObject.xfN.fiM + ",");
      paramn.l("22clienttime", bo.anU() + ",");
      localObject = new StringBuilder();
      if (localTimeLineObject.xfI.wbJ != 15)
        break label509;
      paramInt = 1;
      label263: paramn.l("23souce_type", paramInt + ",");
      localObject = new StringBuilder();
      if (!paramBoolean1)
        break label514;
      paramInt = 6;
      label299: paramn.l("24scene", paramInt + ",");
      paramn.l("25scene_chatname", ",");
      paramn.l("26scene_username", localTimeLineObject.jBB + ",");
      paramn.l("27curr_publishid", localTimeLineObject.Id + ",");
      paramn.l("28curr_msgid", ",");
      paramn.l("29curr_favid", "0,");
      localObject = new StringBuilder();
      if (!paramBoolean2)
        break label535;
    }
    label514: label535: for (paramInt = 1; ; paramInt = 0)
    {
      paramn.l("30isdownload", paramInt + ",");
      paramn.l("31chatroom_membercount", "0,");
      p.a(localTimeLineObject.rjC, paramn);
      ab.i("MicroMsg.SnsVideoStatistic", "report snsad_video_exposure: " + paramn.Fk());
      h.pYm.e(12989, new Object[] { paramn });
      AppMethodBeat.o(35780);
      return;
      label501: paramn = paramn.cqq();
      break;
      label509: paramInt = 2;
      break label263;
      paramInt = i;
      if (localTimeLineObject.xfI.wbJ != 15)
        break label299;
      paramInt = 1;
      break label299;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.j
 * JD-Core Version:    0.6.2
 */