package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.k;
import com.tencent.mm.af.p;
import com.tencent.mm.at.f;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.i;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.chatting.viewitems.ay;
import com.tencent.mm.ui.chatting.viewitems.d.f;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;

public final class r
{
  private static boolean Wi(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(30710);
    com.tencent.mm.aw.e locale = com.tencent.mm.aw.a.aih();
    if ((locale != null) && (locale.fJU != null) && (locale.fJS == 0) && (com.tencent.mm.aw.a.aie()));
    while (true)
    {
      try
      {
        boolean bool2 = bo.isEqual(locale.fJU, paramString);
        if (bool2)
        {
          bool1 = true;
          AppMethodBeat.o(30710);
          return bool1;
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(30710);
        continue;
      }
      AppMethodBeat.o(30710);
    }
  }

  public static void a(int paramInt, Context paramContext, String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(30713);
    paramString1 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).b(paramLong1, paramString1);
    if (paramString1 == null)
    {
      ab.w("MicroMsg.ChattingItemHelper", "transmitAppBrandMsg reader is null");
      AppMethodBeat.o(30713);
    }
    while (true)
    {
      return;
      if ((paramInt >= 0) && (paramInt < paramString1.fjr.size()))
      {
        paramString1 = (p)paramString1.fjr.get(paramInt);
        String str = j.b.a(l.a(paramString2, paramString1), null, null);
        if (bo.isNullOrNil(str))
        {
          AppMethodBeat.o(30713);
        }
        else
        {
          Object localObject = new HashMap();
          ((HashMap)localObject).put("desc", paramString1.fjz);
          ((HashMap)localObject).put("type", Integer.valueOf(2));
          ((HashMap)localObject).put("title", paramString1.title);
          ((HashMap)localObject).put("app_id", paramString1.fjG);
          ((HashMap)localObject).put("pkg_type", Integer.valueOf(paramString1.fjF));
          ((HashMap)localObject).put("pkg_version", Integer.valueOf(paramString1.fjE));
          ((HashMap)localObject).put("img_url", paramString1.fjH);
          ((HashMap)localObject).put("is_dynamic", Boolean.FALSE);
          ((HashMap)localObject).put("cache_key", "");
          ((HashMap)localObject).put("path", paramString1.fjD);
          paramString1 = new Intent(paramContext, MsgRetransmitUI.class);
          paramString1.putExtra("appbrand_params", (Serializable)localObject);
          paramString1.putExtra("Retr_Msg_content", str);
          paramString1.putExtra("Retr_Msg_Type", 2);
          paramString1.putExtra("Retr_Biz_Msg_Selected_Msg_Index", paramInt);
          paramString1.putExtra("Retr_Msg_Id", paramLong1);
          paramString1.putExtra("Retr_MsgFromScene", 3);
          localObject = v.nW(String.valueOf(paramLong2));
          paramString1.putExtra("reportSessionId", (String)localObject);
          localObject = v.Zp().y((String)localObject, true);
          ((v.b)localObject).j("prePublishId", "msg_".concat(String.valueOf(paramLong2)));
          ((v.b)localObject).j("preUsername", paramString2);
          ((v.b)localObject).j("preChatName", paramString2);
          ((v.b)localObject).j("preMsgIndex", Integer.valueOf(paramInt));
          ((v.b)localObject).j("sendAppMsgScene", Integer.valueOf(1));
          paramContext.startActivity(paramString1);
        }
      }
      else
      {
        AppMethodBeat.o(30713);
      }
    }
  }

  public static void a(long paramLong, int paramInt, Context paramContext, Fragment paramFragment, Activity paramActivity, bi parambi)
  {
    AppMethodBeat.i(30714);
    String str1 = parambi.field_talker;
    String str2 = v.nW(parambi.field_msgSvrId);
    Object localObject = v.Zp().y(str2, true);
    ((v.b)localObject).j("prePublishId", "msg_" + parambi.field_msgSvrId);
    ((v.b)localObject).j("preUsername", str1);
    ((v.b)localObject).j("preChatName", str1);
    ((v.b)localObject).j("preMsgIndex", Integer.valueOf(paramInt));
    ((v.b)localObject).j("sendAppMsgScene", Integer.valueOf(1));
    localObject = new cl();
    ((cl)localObject).cvA.cvE = paramInt;
    ((cl)localObject).cvA.cvF = str2;
    ((cl)localObject).cvA.fragment = paramFragment;
    ((cl)localObject).cvA.activity = paramActivity;
    ((cl)localObject).cvA.cvH = 40;
    com.tencent.mm.pluginsdk.model.e.d((cl)localObject, parambi);
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    if (((cl)localObject).cvB.ret == 0)
    {
      paramFragment = j.b.me(com.tencent.mm.af.l.a(paramContext, paramInt, parambi.field_content, parambi.field_talker, parambi.field_msgId));
      if (!parambi.bAA())
        break label416;
      paramContext = com.tencent.mm.modelstat.b.fRa;
      if (paramFragment == null)
        break label411;
      paramInt = paramFragment.type;
    }
    while (true)
    {
      paramContext.b(parambi, paramInt);
      if ((paramFragment != null) && (paramFragment.type == 5) && (paramFragment.url != null))
      {
        ab.d("MicroMsg.ChattingItemHelper", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramFragment.url, Long.valueOf(paramLong), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1) });
        paramContext = "";
      }
      try
      {
        paramFragment = URLEncoder.encode(paramFragment.url, "UTF-8");
        paramContext = paramFragment;
        com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { paramContext, Long.valueOf(paramLong), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1) });
        AppMethodBeat.o(30714);
        return;
        label411: paramInt = 0;
        continue;
        label416: com.tencent.mm.modelstat.b.fRa.D(parambi);
      }
      catch (UnsupportedEncodingException paramFragment)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.ChattingItemHelper", paramFragment, "", new Object[0]);
      }
    }
  }

  public static void a(View paramView, Context paramContext, String paramString)
  {
    AppMethodBeat.i(30711);
    ay localay = (ay)paramView.getTag();
    String str = localay.cwg;
    paramView = str;
    if (TextUtils.isEmpty(str))
      paramView = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jk(localay.dJv);
    if (TextUtils.isEmpty(paramView))
    {
      paramView = new Intent();
      paramView.putExtra("geta8key_username", paramString);
      paramView.putExtra("rawUrl", localay.dJv);
      com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramView);
      AppMethodBeat.o(30711);
      return;
    }
    paramString = new Intent();
    paramString.putExtra("extra_id", paramView);
    paramString.putExtra("extra_name", localay.title);
    if (localay.ziu)
    {
      paramString.putExtra("download_entrance_scene", 20);
      paramString.putExtra("preceding_scence", 3);
      paramString.putExtra("reward_tip", true);
      com.tencent.mm.plugin.report.service.h.pYm.e(12953, new Object[] { Integer.valueOf(1), paramView });
    }
    while (true)
    {
      com.tencent.mm.bp.d.b(paramContext, "emoji", ".ui.EmojiStoreDetailUI", paramString);
      AppMethodBeat.o(30711);
      break;
      if (localay.ziv)
      {
        paramString.putExtra("download_entrance_scene", 25);
        paramString.putExtra("preceding_scence", 9);
        paramString.putExtra("reward_tip", true);
      }
      else
      {
        paramString.putExtra("download_entrance_scene", 22);
        paramString.putExtra("preceding_scence", 122);
        com.tencent.mm.plugin.report.service.h.pYm.e(10993, new Object[] { Integer.valueOf(2), paramView });
      }
    }
  }

  public static void a(p paramp, View paramView, final String paramString)
  {
    AppMethodBeat.i(30712);
    if ((paramView == null) || (paramp == null))
      AppMethodBeat.o(30712);
    while (true)
    {
      return;
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(30708);
          paramAnonymousView = (ay)paramAnonymousView.getTag();
          ab.i("MicroMsg.ChattingItemHelper", "on app brand(%s) button1 click", new Object[] { this.jPE.fjC });
          se localse = new se();
          localse.cOf.userName = this.jPE.fjC;
          localse.cOf.cOh = this.jPE.fjD;
          localse.cOf.cOi = this.jPE.fjF;
          localse.cOf.axy = this.jPE.fjE;
          localse.cOf.cOl = true;
          localse.cOf.scene = 1076;
          localse.cOf.cst = (paramString + ":" + paramAnonymousView.cKd.field_msgSvrId + ":" + paramAnonymousView.uno);
          com.tencent.mm.sdk.b.a.xxA.m(localse);
          AppMethodBeat.o(30708);
        }
      });
      AppMethodBeat.o(30712);
    }
  }

  public static void a(bi parambi, Context paramContext, com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(30715);
    aw.ZK();
    if (!c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(paramContext);
      AppMethodBeat.o(30715);
      return;
    }
    Object localObject = null;
    if (parambi.field_msgId > 0L)
      localObject = com.tencent.mm.at.o.ahl().fJ(parambi.field_msgId);
    if (((localObject == null) || (((com.tencent.mm.at.e)localObject).fDy <= 0L)) && (parambi.field_msgSvrId > 0L))
      localObject = com.tencent.mm.at.o.ahl().fI(parambi.field_msgSvrId);
    while (true)
    {
      if (localObject == null)
      {
        AppMethodBeat.o(30715);
        break;
      }
      int i;
      if (parambi.field_isSend == 1)
        if (((com.tencent.mm.at.e)localObject).agQ())
          i = 1;
      while (true)
      {
        if (!parambi.dtH())
          break label221;
        ab.i("MicroMsg.ChattingItemHelper", "image is clean!!!");
        com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(2131300607), paramContext.getString(2131297061), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        });
        AppMethodBeat.o(30715);
        break;
        i = 0;
        continue;
        if (!((com.tencent.mm.at.e)localObject).agQ())
        {
          i = 0;
        }
        else
        {
          com.tencent.mm.at.e locale = f.a((com.tencent.mm.at.e)localObject);
          if (!com.tencent.mm.vfs.e.ct(com.tencent.mm.at.o.ahl().q(locale.fDz, "", "")))
            i = 0;
          else
            i = 1;
        }
      }
      label221: if (i.e(parambi, com.tencent.mm.at.o.ahl().q(f.c((com.tencent.mm.at.e)localObject), "", "")))
      {
        ab.i("MicroMsg.ChattingItemHelper", "img is expired or clean!!!");
        localObject = new Intent(paramContext, ImageGalleryUI.class);
        ((Intent)localObject).putExtra("img_gallery_msg_id", parambi.field_msgId);
        ((Intent)localObject).putExtra("img_gallery_msg_svr_id", parambi.field_msgSvrId);
        ((Intent)localObject).putExtra("img_gallery_talker", parambi.field_talker);
        ((Intent)localObject).putExtra("img_gallery_chatroom_name", parambi.field_talker);
        ((Intent)localObject).putExtra("img_gallery_is_restransmit_after_download", true);
        ((Intent)localObject).putExtra("Retr_show_success_tips", true);
        if (parama != null)
          i.a(parama, parambi, (Intent)localObject);
        while (true)
        {
          paramContext.startActivity((Intent)localObject);
          AppMethodBeat.o(30715);
          break;
          a(parambi, (Intent)localObject);
        }
      }
      if ((((com.tencent.mm.at.e)localObject).offset >= ((com.tencent.mm.at.e)localObject).frO) && (((com.tencent.mm.at.e)localObject).frO != 0))
      {
        parama = new Intent(paramContext, MsgRetransmitUI.class);
        parama.putExtra("Retr_File_Name", com.tencent.mm.at.o.ahl().q(f.c((com.tencent.mm.at.e)localObject), "", ""));
        parama.putExtra("Retr_Msg_Id", parambi.field_msgId);
        parama.putExtra("Retr_Msg_Type", 0);
        parama.putExtra("Retr_show_success_tips", true);
        parama.putExtra("Retr_Compress_Type", i);
        paramContext.startActivity(parama);
        AppMethodBeat.o(30715);
        break;
      }
      parama = new Intent(paramContext, MsgRetransmitUI.class);
      parama.putExtra("Retr_File_Name", com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true));
      parama.putExtra("Retr_Msg_Id", parambi.field_msgId);
      parama.putExtra("Retr_Msg_Type", 0);
      parama.putExtra("Retr_show_success_tips", true);
      parama.putExtra("Retr_Compress_Type", i);
      paramContext.startActivity(parama);
      AppMethodBeat.o(30715);
      break;
    }
  }

  private static void a(bi parambi, Intent paramIntent)
  {
    AppMethodBeat.i(30716);
    if (parambi == null)
    {
      AppMethodBeat.o(30716);
      return;
    }
    String str1 = parambi.field_talker;
    String str2 = parambi.field_talker;
    Bundle localBundle = new Bundle();
    if (com.tencent.mm.model.t.mZ(str1));
    for (int i = 7; ; i = 1)
    {
      localBundle.putInt("stat_scene", i);
      localBundle.putString("stat_msg_id", "msg_" + Long.toString(parambi.field_msgSvrId));
      localBundle.putString("stat_chat_talker_username", str1);
      localBundle.putString("stat_send_msg_user", str2);
      paramIntent.putExtra("_stat_obj", localBundle);
      AppMethodBeat.o(30716);
      break;
    }
  }

  public static void eK(View paramView)
  {
    AppMethodBeat.i(30709);
    long l1;
    Object localObject1;
    if ((paramView.getTag() instanceof d.f))
    {
      paramView = (d.f)paramView.getTag();
      l1 = paramView.cvx;
      if (paramView.zcZ == -1)
      {
        aw.ZK();
        localObject1 = c.XO().jf(paramView.cvx);
        boolean bool;
        if (Wi(String.valueOf(l1)))
        {
          com.tencent.mm.plugin.report.service.h.pYm.X(10231, "1");
          com.tencent.mm.aw.a.aic();
          if (((cy)localObject1).field_msgId == l1)
          {
            paramView = com.tencent.mm.modelstat.b.fRa;
            bool = false;
            i = k.k((bi)localObject1);
          }
        }
        while (true)
        {
          paramView.a((bi)localObject1, bool, i);
          do
          {
            AppMethodBeat.o(30709);
            return;
            localObject2 = j.b.me(paramView.cHz);
            if (localObject2 != null)
            {
              com.tencent.mm.plugin.report.service.h.pYm.X(10090, "0,1");
              long l2 = paramView.cvx;
              localObject3 = paramView.imgPath;
              aw.ZK();
              com.tencent.mm.aw.a.b(com.tencent.mm.aw.g.a((j.b)localObject2, String.valueOf(l2), (String)localObject3, c.getAccPath(), paramView.imgPath));
            }
          }
          while (((cy)localObject1).field_msgId != l1);
          paramView = com.tencent.mm.modelstat.b.fRa;
          bool = true;
          if (localObject2 != null)
            i = ((j.b)localObject2).type;
          else
            i = 0;
        }
      }
      Object localObject2 = paramView.cvx + "_" + paramView.zcZ;
      aw.ZK();
      localObject1 = c.XO().jf(paramView.cvx);
      Object localObject3 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).b(paramView.cvx, paramView.cHz);
      if (Wi((String)localObject2))
      {
        com.tencent.mm.plugin.report.service.h.pYm.X(10231, "1");
        com.tencent.mm.aw.a.aic();
        if (((cy)localObject1).field_msgId == l1)
          com.tencent.mm.modelstat.b.fRa.a((bi)localObject1, false, k.k((bi)localObject1));
        if ((localObject3 != null) && (((com.tencent.mm.af.o)localObject3).fjr != null) && (((com.tencent.mm.af.o)localObject3).fjr.size() > paramView.zcZ))
        {
          localObject1 = (p)((com.tencent.mm.af.o)localObject3).fjr.get(paramView.zcZ);
          paramView = com.tencent.mm.plugin.report.service.h.pYm;
          if (((p)localObject1).type == 6);
          for (i = 1; ; i = 0)
          {
            paramView.e(14972, new Object[] { Integer.valueOf(i), Integer.valueOf(1) });
            AppMethodBeat.o(30709);
            break;
          }
        }
      }
      else if ((localObject3 != null) && (((com.tencent.mm.af.o)localObject3).fjr != null) && (((com.tencent.mm.af.o)localObject3).fjr.size() > paramView.zcZ))
      {
        com.tencent.mm.plugin.report.service.h.pYm.X(10090, "0,1");
        localObject3 = (p)((com.tencent.mm.af.o)localObject3).fjr.get(paramView.zcZ);
        String str1 = paramView.imgPath;
        String str2 = ((p)localObject3).title;
        String str3 = ((p)localObject3).fjL;
        String str4 = ((p)localObject3).url;
        String str5 = ((p)localObject3).url;
        String str6 = ((p)localObject3).fjK;
        aw.ZK();
        com.tencent.mm.aw.a.b(com.tencent.mm.aw.g.a(0, str1, str2, str3, str4, str5, str6, (String)localObject2, c.getAccPath(), paramView.imgPath, "", ""));
        paramView = com.tencent.mm.plugin.report.service.h.pYm;
        if (((p)localObject3).type != 6)
          break label642;
      }
    }
    label642: for (int i = 1; ; i = 0)
    {
      paramView.e(14972, new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
      if (((cy)localObject1).field_msgId == l1)
        com.tencent.mm.modelstat.b.fRa.a((bi)localObject1, true, k.k((bi)localObject1));
      AppMethodBeat.o(30709);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.r
 * JD-Core Version:    0.6.2
 */