package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.al.c;
import com.tencent.mm.al.f;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.pluginsdk.c.a;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.vfs.e;
import java.io.File;

final class d$b
{
  private static void a(com.tencent.mm.ui.chatting.d.a parama, Intent paramIntent, bi parambi, String paramString)
  {
    AppMethodBeat.i(32807);
    if ((parambi.dtH()) || (e(parambi, paramString)))
    {
      ab.i("MicroMsg.AppMessageUtil", "appmsg is expired or clean!!!");
      com.tencent.mm.ui.base.h.a(parama.yTx.getContext(), parama.yTx.getContext().getString(2131299789), parama.yTx.getContext().getString(2131297061), new d.b.2());
      AppMethodBeat.o(32807);
    }
    while (true)
    {
      return;
      parama.startActivity(paramIntent);
      AppMethodBeat.o(32807);
    }
  }

  static void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi, String paramString)
  {
    AppMethodBeat.i(32806);
    Object localObject1 = bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend);
    Intent localIntent = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
    localIntent.putExtra("Retr_Msg_content", (String)localObject1);
    localIntent.putExtra("Retr_MsgFromScene", 2);
    localObject1 = j.b.me((String)localObject1);
    if ((localObject1 != null) && (19 == ((j.b)localObject1).type))
    {
      localIntent.putExtra("Retr_Msg_Type", 10);
      localIntent.putExtra("Retr_Msg_Id", parambi.field_msgId);
      if ((localObject1 != null) && (((j.b)localObject1).type == 6))
        break label453;
      parama.startActivity(localIntent);
      AppMethodBeat.o(32806);
    }
    while (true)
    {
      return;
      if ((localObject1 != null) && (24 == ((j.b)localObject1).type))
      {
        localIntent.putExtra("Retr_Msg_Type", 10);
        break;
      }
      if ((localObject1 != null) && (16 == ((j.b)localObject1).type))
      {
        localIntent.putExtra("Retr_Msg_Type", 14);
        break;
      }
      localIntent.putExtra("Retr_Msg_Type", 2);
      Object localObject2 = parambi.field_talker;
      Object localObject3 = v.nW(parambi.field_msgSvrId);
      localIntent.putExtra("reportSessionId", (String)localObject3);
      localObject3 = v.Zp().y((String)localObject3, true);
      ((v.b)localObject3).j("prePublishId", "msg_" + parambi.field_msgSvrId);
      ((v.b)localObject3).j("preUsername", paramString);
      ((v.b)localObject3).j("preChatName", localObject2);
      if ((localObject1 != null) && (((j.b)localObject1).X(com.tencent.mm.af.a.class) != null))
      {
        ((v.b)localObject3).j("appservicetype", Integer.valueOf(((com.tencent.mm.af.a)((j.b)localObject1).X(com.tencent.mm.af.a.class)).ffa));
        localIntent.putExtra("Retr_MsgAppBrandServiceType", ((com.tencent.mm.af.a)((j.b)localObject1).X(com.tencent.mm.af.a.class)).ffa);
      }
      if ((localObject1 != null) && (33 == ((j.b)localObject1).type))
      {
        if (!parama.dFx())
          break label429;
        ((v.b)localObject3).j("fromScene", Integer.valueOf(2));
        localIntent.putExtra("Retr_MsgAppBrandFromScene", 2);
      }
      while (true)
      {
        localIntent.putExtra("Retr_MsgFromUserName", paramString);
        localIntent.putExtra("Retr_MsgTalker", parambi.field_talker);
        ((v.b)localObject3).j("sendAppMsgScene", Integer.valueOf(1));
        ((i)com.tencent.mm.kernel.g.K(i.class)).a("adExtStr", (v.b)localObject3, parambi);
        break;
        label429: ((v.b)localObject3).j("fromScene", Integer.valueOf(1));
        localIntent.putExtra("Retr_MsgAppBrandFromScene", 1);
      }
      label453: localObject3 = com.tencent.mm.plugin.report.service.h.pYm;
      localObject2 = ((j.b)localObject1).fgD;
      int i;
      if (((j.b)localObject1).fgs == 1)
      {
        i = 7;
        label476: ((com.tencent.mm.plugin.report.service.h)localObject3).e(14665, new Object[] { localObject2, Integer.valueOf(i), Integer.valueOf(((j.b)localObject1).fgo), Integer.valueOf(2), Long.valueOf((System.currentTimeMillis() - parambi.field_createTime) / 1000L), ((j.b)localObject1).fgp });
        if ((((j.b)localObject1).fgs == 0) && (((j.b)localObject1).fgo <= 26214400))
          break label645;
      }
      label645: for (boolean bool = true; ; bool = false)
      {
        localIntent.putExtra("Retr_Big_File", bool);
        localObject2 = l.aiM(((j.b)localObject1).csD);
        if (localObject2 == null)
          break label695;
        localObject3 = new File(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
        if ((!((File)localObject3).exists()) || (((File)localObject3).length() != ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_totalLen))
          break label651;
        parama.startActivity(localIntent);
        AppMethodBeat.o(32806);
        break;
        i = 5;
        break label476;
      }
      label651: if ((((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_offset > 0L) && (((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_totalLen > ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_offset))
      {
        a(parama, localIntent, parambi, ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
        AppMethodBeat.o(32806);
      }
      else
      {
        label695: ab.i("MicroMsg.AppMessageUtil", "summerbig retrans content.attachlen[%d], cdnAttachUrl[%s], aesKey[%s]", new Object[] { Integer.valueOf(((j.b)localObject1).fgo), ((j.b)localObject1).fgD, bo.anv(((j.b)localObject1).eyr) });
        if (!bool)
        {
          a(parama, localIntent, parambi, null);
          AppMethodBeat.o(32806);
        }
        else
        {
          localIntent.putExtra("Retr_Big_File", bool);
          localObject3 = new com.tencent.mm.i.g();
          ((com.tencent.mm.i.g)localObject3).egl = new d.b.1(parama, localIntent, parambi, (com.tencent.mm.pluginsdk.model.app.b)localObject2);
          ((com.tencent.mm.i.g)localObject3).field_mediaId = c.a("checkExist", bo.anU(), paramString, parambi.field_msgId);
          ((com.tencent.mm.i.g)localObject3).field_fileId = ((j.b)localObject1).fgD;
          ((com.tencent.mm.i.g)localObject3).field_aesKey = ((j.b)localObject1).eyr;
          ((com.tencent.mm.i.g)localObject3).field_filemd5 = ((j.b)localObject1).filemd5;
          ((com.tencent.mm.i.g)localObject3).field_fileType = com.tencent.mm.i.a.efE;
          ((com.tencent.mm.i.g)localObject3).field_talker = paramString;
          ((com.tencent.mm.i.g)localObject3).field_priority = com.tencent.mm.i.a.efC;
          ((com.tencent.mm.i.g)localObject3).field_svr_signature = "";
          ((com.tencent.mm.i.g)localObject3).field_onlycheckexist = true;
          bool = f.afx().e((com.tencent.mm.i.g)localObject3);
          ab.i("MicroMsg.AppMessageUtil", "summerbig retrans to startupDownloadMedia ret[%b], field_fileId[%s], field_mediaId[%s], field_aesKey[%s]", new Object[] { Boolean.valueOf(bool), ((com.tencent.mm.i.g)localObject3).field_fileId, ((com.tencent.mm.i.g)localObject3).field_mediaId, bo.anv(((com.tencent.mm.i.g)localObject3).field_aesKey) });
          if (!bool)
            a(parama, localIntent, parambi, null);
          AppMethodBeat.o(32806);
        }
      }
    }
  }

  static boolean a(Context paramContext, j.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(32805);
    if ((paramb == null) || (paramContext == null))
      AppMethodBeat.o(32805);
    while (true)
    {
      return bool;
      if (paramb.type == 3)
      {
        bool = com.tencent.mm.pluginsdk.model.app.g.o(paramContext, 16L);
        AppMethodBeat.o(32805);
      }
      else if (paramb.type == 4)
      {
        bool = com.tencent.mm.pluginsdk.model.app.g.o(paramContext, 8L);
        AppMethodBeat.o(32805);
      }
      else if (paramb.type == 5)
      {
        bool = com.tencent.mm.pluginsdk.model.app.g.o(paramContext, 32L);
        AppMethodBeat.o(32805);
      }
      else if (paramb.type == 6)
      {
        paramb = c.a.aik(paramb.fgp);
        if (paramb == null)
        {
          AppMethodBeat.o(32805);
        }
        else
        {
          bool = com.tencent.mm.pluginsdk.model.app.g.o(paramContext, paramb.longValue());
          AppMethodBeat.o(32805);
        }
      }
      else
      {
        AppMethodBeat.o(32805);
      }
    }
  }

  public static boolean arC(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(32809);
    Object localObject = o.ahl().c(paramString, false, true);
    if (!e.ct((String)localObject))
      AppMethodBeat.o(32809);
    while (true)
    {
      return bool2;
      paramString = new BitmapFactory.Options();
      paramString.inJustDecodeBounds = true;
      localObject = d.decodeFile((String)localObject, paramString);
      bool2 = bool1;
      if (paramString.outWidth * paramString.outHeight > 1048576)
      {
        ab.i("MicroMsg.AppMessageUtil", "Bitmap to big:%d/%d", new Object[] { Integer.valueOf(paramString.outWidth), Integer.valueOf(paramString.outHeight) });
        bool2 = true;
      }
      if (localObject != null)
        ((Bitmap)localObject).recycle();
      AppMethodBeat.o(32809);
    }
  }

  public static boolean e(bi parambi, String paramString)
  {
    AppMethodBeat.i(32808);
    boolean bool;
    if ((System.currentTimeMillis() - parambi.field_createTime > 259200000L) && ((bo.isNullOrNil(paramString)) || (!e.ct(paramString))))
    {
      bool = true;
      AppMethodBeat.o(32808);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(32808);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.b
 * JD-Core Version:    0.6.2
 */