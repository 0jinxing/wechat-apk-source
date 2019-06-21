package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class a
{
  public static void a(a parama, bi parambi)
  {
    AppMethodBeat.i(30260);
    PString localPString1 = new PString();
    PString localPString2 = new PString();
    if (a(parambi, localPString1, localPString2))
      a(parama, parambi, localPString1.value, localPString2.value);
    AppMethodBeat.o(30260);
  }

  public static void a(a parama, bi parambi, String paramString1, String paramString2)
  {
    AppMethodBeat.i(30261);
    String str1 = parambi.field_talker;
    boolean bool = t.mN(str1);
    String str2;
    d locald;
    if (parambi.field_isSend == 1)
    {
      str2 = r.Yz();
      locald = new d();
      locald.l("20source_publishid", paramString1 + ",");
      locald.l("21uxinfo", paramString2 + ",");
      locald.l("22clienttime", bo.anU() + ",");
      locald.l("23video_statu", ",");
      paramString1 = new StringBuilder();
      if (parambi.getType() != 62)
        break label496;
      i = 1;
      label150: locald.l("24source_type", i + ",");
      paramString1 = new StringBuilder();
      if (!bool)
        break label502;
      i = 4;
      label187: locald.l("25scene", i + ",");
      locald.l("26action_type", a.a(parama) + ",");
      locald.l("27scene_chatname", str1 + ",");
      locald.l("28scene_username", str2 + ",");
      locald.l("29curr_publishid", ",");
      locald.l("30curr_msgid", parambi.field_msgSvrId + ",");
      locald.l("31curr_favid", "0,");
      locald.l("32elapsed_time", "0,");
      locald.l("33load_time", "0,");
      locald.l("34is_load_complete", "0,");
      locald.l("35destination", "0,");
      parama = new StringBuilder();
      if (!bool)
        break label508;
    }
    label496: label502: label508: for (int i = n.mA(str1); ; i = 0)
    {
      locald.l("36chatroom_membercount", i + ",");
      ab.i("MicroMsg.AdVideoStatistic", "report snsad_video_action: " + locald.Fk());
      ((c)g.K(c.class)).e(12990, new Object[] { locald });
      AppMethodBeat.o(30261);
      return;
      if (bool)
      {
        str2 = bf.oy(parambi.field_content);
        break;
      }
      str2 = str1;
      break;
      i = 2;
      break label150;
      i = 3;
      break label187;
    }
  }

  public static void a(c paramc, a.d paramd, bi parambi, int paramInt)
  {
    AppMethodBeat.i(30262);
    Object localObject1 = new PString();
    Object localObject2 = new PString();
    boolean bool;
    d locald;
    if (a(parambi, (PString)localObject1, (PString)localObject2))
    {
      String str1 = ((PString)localObject1).value;
      String str2 = ((PString)localObject2).value;
      localObject1 = parambi.field_talker;
      bool = t.mN((String)localObject1);
      if (parambi.field_isSend != 1)
        break label520;
      localObject2 = r.Yz();
      locald = new d();
      locald.l("20source_publishid", str1 + ",");
      locald.l("21uxinfo", str2 + ",");
      locald.l("22clienttime", bo.anU() + ",");
      locald.l("23video_statu", a.d.a(paramd) + ",");
      paramd = new StringBuilder();
      if (parambi.getType() != 62)
        break label544;
      i = 1;
      label215: locald.l("24source_type", i + ",");
      paramd = new StringBuilder();
      if (!bool)
        break label550;
      i = 4;
      label252: locald.l("25scene", i + ",");
      locald.l("26action_type", c.a(paramc) + ",");
      locald.l("27scene_chatname", (String)localObject1 + ",");
      locald.l("28scene_username", (String)localObject2 + ",");
      locald.l("29curr_publishid", ",");
      locald.l("30curr_msgid", parambi.field_msgSvrId + ",");
      locald.l("31curr_favid", "0,");
      paramc = new StringBuilder();
      if (!bool)
        break label556;
    }
    label520: label544: label550: label556: for (int i = n.mA((String)localObject1); ; i = 0)
    {
      locald.l("32chatroom_membercount", i + ",");
      locald.l("33chatroom_toMemberCount", paramInt + ",");
      ab.i("MicroMsg.AdVideoStatistic", "report snsad_video_spread: " + locald.Fk());
      h.pYm.e(12991, new Object[] { locald });
      AppMethodBeat.o(30262);
      return;
      if (bool)
      {
        localObject2 = bf.oy(parambi.field_content);
        break;
      }
      localObject2 = localObject1;
      break;
      i = 2;
      break label215;
      i = 3;
      break label252;
    }
  }

  public static boolean a(bi parambi, PString paramPString1, PString paramPString2)
  {
    AppMethodBeat.i(30263);
    boolean bool;
    if (parambi.getType() == 62)
    {
      parambi = u.ut(parambi.field_imgPath);
      if (parambi == null)
      {
        AppMethodBeat.o(30263);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      parambi = parambi.fXm;
      if ((parambi == null) || (bo.isNullOrNil(parambi.fiM)))
      {
        AppMethodBeat.o(30263);
        bool = false;
      }
      else
      {
        paramPString1.value = parambi.fiN;
        paramPString2.value = parambi.fiM;
        AppMethodBeat.o(30263);
        bool = true;
        continue;
        if (parambi.getType() == 49)
        {
          bool = t.kH(parambi.field_talker);
          String str1 = parambi.field_content;
          String str2 = str1;
          if (bool)
          {
            str2 = str1;
            if (parambi.field_content != null)
            {
              str2 = str1;
              if (parambi.field_isSend == 0)
                str2 = bf.oz(parambi.field_content);
            }
          }
          parambi = j.b.me(str2);
          if ((parambi == null) || (parambi.type != 4) || (bo.isNullOrNil(parambi.fiG)))
          {
            AppMethodBeat.o(30263);
            bool = false;
          }
          else
          {
            paramPString1.value = parambi.fiN;
            paramPString2.value = parambi.fiM;
            AppMethodBeat.o(30263);
            bool = true;
          }
        }
        else
        {
          AppMethodBeat.o(30263);
          bool = false;
        }
      }
    }
  }

  public static enum a
  {
    private int value = 0;

    static
    {
      AppMethodBeat.i(30250);
      yFs = new a("PlayIcon", 0, 1);
      yFt = new a("EnterFullScreen", 1, 2);
      yFu = new a("EnterCompleteVideo", 2, 3);
      yFv = new a("DetailInVideo", 3, 4);
      yFw = new a("LeavelFullScreen", 4, 5);
      yFx = new a("LeaveCompleteVideo", 5, 6);
      yFy = new a("SightLoaded", 6, 7);
      yFz = new a[] { yFs, yFt, yFu, yFv, yFw, yFx, yFy };
      AppMethodBeat.o(30250);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }
  }

  public static enum c
  {
    private int value = 0;

    static
    {
      AppMethodBeat.i(30256);
      yFG = new c("Fav", 0, 1);
      yFH = new c("Chat", 1, 2);
      yFI = new c("Chatroom", 2, 3);
      yFJ = new c("Sns", 3, 4);
      yFK = new c[] { yFG, yFH, yFI, yFJ };
      AppMethodBeat.o(30256);
    }

    private c(int paramInt)
    {
      this.value = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a
 * JD-Core Version:    0.6.2
 */