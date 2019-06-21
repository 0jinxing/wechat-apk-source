package com.tencent.mm.openim.room.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.a.hj;
import com.tencent.mm.g.a.km;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bfz;
import com.tencent.mm.protocal.protobuf.bga;
import com.tencent.mm.protocal.protobuf.bgb;
import com.tencent.mm.protocal.protobuf.qe;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.u;
import java.util.LinkedList;

public final class a
{
  public static String A(ad paramad)
  {
    AppMethodBeat.i(78974);
    if (paramad == null)
    {
      AppMethodBeat.o(78974);
      paramad = null;
    }
    while (true)
    {
      return paramad;
      if (!ad.aox(paramad.field_username))
      {
        AppMethodBeat.o(78974);
        paramad = null;
      }
      else if (bo.isNullOrNil(paramad.field_openImAppid))
      {
        AppMethodBeat.o(78974);
        paramad = null;
      }
      else
      {
        paramad = ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).ba(paramad.field_openImAppid, paramad.field_descWordingId);
        if (bo.isNullOrNil(paramad))
        {
          AppMethodBeat.o(78974);
          paramad = null;
        }
        else
        {
          paramad = "＠".concat(String.valueOf(paramad));
          AppMethodBeat.o(78974);
        }
      }
    }
  }

  public static CharSequence a(ad paramad, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(78973);
    String str = A(paramad);
    if (str == null)
    {
      AppMethodBeat.o(78973);
      paramad = paramCharSequence;
    }
    while (true)
    {
      return paramad;
      paramad = new SpannableStringBuilder(paramCharSequence);
      int i = paramad.length();
      paramad.append(str);
      int j = paramad.length();
      paramad.setSpan(new ForegroundColorSpan(ah.getContext().getResources().getColor(2131690328)), i, j, 33);
      AppMethodBeat.o(78973);
    }
  }

  private static void a(bfz parambfz)
  {
    AppMethodBeat.i(78969);
    String str = parambfz.gfa;
    com.tencent.mm.j.a.a.a locala = new com.tencent.mm.j.a.a.a();
    locala.ehD = parambfz.wJR.wKd;
    locala.eoy = parambfz.wqI;
    if (parambfz.wqI != 0)
      locala.cGj = parambfz.wqI;
    if (((com.tencent.mm.plugin.chatroom.a.b)g.K(com.tencent.mm.plugin.chatroom.a.b.class)).N(str, locala.cGj))
    {
      localObject = new hj();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
    km localkm = new km();
    localkm.cGi.chatroomName = str;
    localkm.cGi.cGj = locala.cGj;
    qe localqe = new qe();
    int i;
    if (parambfz.wqJ == null)
    {
      i = 0;
      localqe.ehB = i;
      localqe.vXk = com.tencent.mm.platformtools.aa.vy(parambfz.gfa);
      localqe.vXj = parambfz.wqJ.wKf;
      if (parambfz.wqJ != null)
        break label241;
    }
    label241: for (Object localObject = new LinkedList(); ; localObject = b.c.ao(parambfz.wqJ.vEN))
    {
      localqe.vXi = ((LinkedList)localObject);
      ((com.tencent.mm.plugin.chatroom.a.b)g.K(com.tencent.mm.plugin.chatroom.a.b.class)).a(str, parambfz.wJR.bfz, localqe, r.Yz(), locala, localkm);
      AppMethodBeat.o(78969);
      return;
      i = parambfz.wqJ.vEN.size();
      break;
    }
  }

  private static void a(String paramString, u paramu, bga parambga)
  {
    AppMethodBeat.i(78971);
    i locali = o.act();
    h localh2;
    if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil(parambga.wJX)))
    {
      h localh1 = locali.qo(paramString);
      localh2 = localh1;
      if (localh1 == null)
      {
        localh2 = new h();
        localh2.username = paramString;
      }
      localh2.frW = parambga.wJW;
      localh2.frV = parambga.wJX;
      localh2.dtR = 3;
      if (bo.isNullOrNil(parambga.wJW))
        break label226;
    }
    label226: for (boolean bool = true; ; bool = false)
    {
      localh2.cB(bool);
      locali.b(localh2);
      if ((parambga.wJY == 2) && (!r.Yz().equals(paramString)))
      {
        o.acd();
        d.E(paramString, false);
        o.acd();
        d.E(paramString, true);
        o.acv().pZ(paramString);
      }
      paramu.field_roomowner = parambga.bfz;
      if (paramu.field_chatroomnoticePublishTime <= parambga.wKc)
      {
        paramu.field_chatroomnotice = parambga.kfO;
        paramu.field_chatroomnoticeEditor = parambga.wKb;
        paramu.field_chatroomnoticePublishTime = parambga.wKc;
      }
      ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().a(paramu);
      AppMethodBeat.o(78971);
      return;
    }
  }

  public static void b(bfz parambfz)
  {
    AppMethodBeat.i(78970);
    if (!parambfz.gfa.toLowerCase().endsWith("@im.chatroom"))
    {
      ab.e("OpenIMChatRoomContactLogic", "updateChatroom: bad room:[" + parambfz.gfa + "]");
      AppMethodBeat.o(78970);
      return;
    }
    a(parambfz);
    u localu = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(parambfz.gfa);
    Object localObject = localu;
    if (localu == null)
    {
      localObject = new u();
      ((u)localObject).field_chatroomname = parambfz.gfa;
    }
    ((u)localObject).field_chatroomVersion = parambfz.wqI;
    ((u)localObject).drR().type = parambfz.wJR.wKe;
    ((u)localObject).c(((u)localObject).drR());
    a(parambfz.gfa, (u)localObject, parambfz.wJR);
    g.RQ();
    localObject = ((j)g.K(j.class)).XM().aoO(parambfz.gfa);
    int i = ((ap)localObject).field_type;
    ((ad)localObject).iK(parambfz.app_id);
    int j;
    label204: int k;
    if (parambfz.wJR != null)
    {
      j = 1;
      if (bo.isNullOrNil(parambfz.wJR.cFW))
        break label435;
      k = 1;
      label220: if ((j & k) != 0)
        ((ad)localObject).iB(parambfz.wJR.cFW);
      ((ad)localObject).setUsername(parambfz.gfa);
      ((ad)localObject).hD(parambfz.wJV);
      ((ad)localObject).setType(parambfz.wJU & parambfz.oqG);
      ((ad)localObject).hD(parambfz.wJV);
      ((ad)localObject).hE(parambfz.wJT);
      ab.i("OpenIMChatRoomContactLogic", "updateChatroom done %s", new Object[] { ((ap)localObject).field_username });
      g.RQ();
      ((j)g.K(j.class)).XM().Y((ad)localObject);
      if ((((ap)localObject).field_type & 0x800) == 0)
        break label441;
      if ((localObject == null) || ((i & 0x800) != (((ap)localObject).field_type & 0x800)))
        ((j)g.K(j.class)).XR().apf(((ap)localObject).field_username);
    }
    while (true)
    {
      if (!bo.isNullOrNil(parambfz.app_id))
        ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).u(parambfz.app_id, com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext()), "");
      AppMethodBeat.o(78970);
      break;
      j = 0;
      break label204;
      label435: k = 0;
      break label220;
      label441: if ((localObject == null) || ((i & 0x800) != (((ap)localObject).field_type & 0x800)))
        ((j)g.K(j.class)).XR().apg(((ap)localObject).field_username);
    }
  }

  public static boolean z(ad paramad)
  {
    boolean bool = false;
    AppMethodBeat.i(78972);
    if (paramad == null)
      AppMethodBeat.o(78972);
    while (true)
    {
      return bool;
      if (!ad.aox(paramad.field_username))
      {
        AppMethodBeat.o(78972);
      }
      else if (bo.isNullOrNil(paramad.field_openImAppid))
      {
        AppMethodBeat.o(78972);
      }
      else if ("3552365301".equals(paramad.field_openImAppid))
      {
        bool = true;
        AppMethodBeat.o(78972);
      }
      else
      {
        AppMethodBeat.o(78972);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.room.a.a
 * JD-Core Version:    0.6.2
 */