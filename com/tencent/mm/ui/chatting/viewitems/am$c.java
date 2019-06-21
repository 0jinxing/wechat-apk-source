package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.qc;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelstat.b;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.chatting.s.e;

public final class am$c extends s.e
{
  public static boolean yWS = false;

  public am$c(com.tencent.mm.ui.chatting.d.a parama)
  {
    super(parama);
  }

  private void i(final s params)
  {
    AppMethodBeat.i(33348);
    aw.ZK();
    if (!c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(this.yJI.yTx.getContext());
      AppMethodBeat.o(33348);
    }
    while (true)
    {
      return;
      if (params.status == 198)
      {
        u.ur(params.getFileName());
        AppMethodBeat.o(33348);
      }
      else if ((!com.tencent.mm.network.ab.ch(this.yJI.yTx.getContext())) && (!yWS))
      {
        yWS = true;
        com.tencent.mm.ui.base.h.a(this.yJI.yTx.getContext(), 2131304250, 2131297061, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(33346);
            am.c.arK(params.getFileName());
            AppMethodBeat.o(33346);
          }
        }
        , new am.c.2(this));
        AppMethodBeat.o(33348);
      }
      else
      {
        u.up(params.getFileName());
        AppMethodBeat.o(33348);
      }
    }
  }

  public final void a(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33347);
    parama = (ay)paramView.getTag();
    b.fRa.F(parama.cKd);
    parama = (am.e)parama;
    com.tencent.mm.modelstat.a.a(parama.cKd, com.tencent.mm.modelstat.a.a.fQX);
    Object localObject1;
    int i;
    if (2 == parama.klY)
    {
      if ((com.tencent.mm.r.a.bJ(this.yJI.yTx.getContext())) || (com.tencent.mm.r.a.bH(this.yJI.yTx.getContext())))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.DesignerClickListener", "Voip or multitalk is running, can't do this");
        AppMethodBeat.o(33347);
        return;
      }
      parambi = parama.cKd;
      localObject1 = new int[2];
      i = 0;
      if (paramView == null)
        break label1443;
      paramView.getLocationInWindow((int[])localObject1);
      i = paramView.getWidth();
    }
    label1443: for (int j = paramView.getHeight(); ; j = 0)
    {
      long l1 = parambi.field_msgId;
      long l2 = parambi.field_msgSvrId;
      paramView = parama.userName;
      Object localObject2 = parama.chatroomName;
      Object localObject3 = new Intent(this.yJI.yTx.getContext(), ImageGalleryUI.class);
      ((Intent)localObject3).putExtra("show_search_chat_content_result", ((z)this.yJI.aF(z.class)).dES());
      ((Intent)localObject3).putExtra("img_gallery_msg_id", l1);
      ((Intent)localObject3).putExtra("key_is_biz_chat", ((d)this.yJI.aF(d.class)).dDm());
      ((Intent)localObject3).putExtra("key_biz_chat_id", ((d)this.yJI.aF(d.class)).dDz());
      ((Intent)localObject3).putExtra("img_gallery_msg_svr_id", l2);
      ((Intent)localObject3).putExtra("img_gallery_talker", paramView);
      ((Intent)localObject3).putExtra("img_gallery_chatroom_name", (String)localObject2);
      ((Intent)localObject3).putExtra("img_gallery_left", localObject1[0]);
      ((Intent)localObject3).putExtra("img_gallery_top", localObject1[1]);
      ((Intent)localObject3).putExtra("img_gallery_width", i);
      ((Intent)localObject3).putExtra("img_gallery_height", j);
      ((Intent)localObject3).putExtra("img_gallery_enter_from_chatting_ui", ((z)this.yJI.aF(z.class)).dEN());
      localObject1 = this.yJI.getTalkerUserName();
      if (parambi.field_isSend == 1)
      {
        paramView = this.yJI.dFu();
        label379: localObject2 = new Bundle();
        if (!this.yJI.dFx())
          break label559;
        j = 2;
      }
      while (true)
      {
        ((Bundle)localObject2).putInt("stat_scene", j);
        ((Bundle)localObject2).putString("stat_msg_id", "msg_" + Long.toString(l2));
        ((Bundle)localObject2).putString("stat_chat_talker_username", (String)localObject1);
        ((Bundle)localObject2).putString("stat_send_msg_user", paramView);
        ((Intent)localObject3).putExtra("_stat_obj", (Bundle)localObject2);
        this.yJI.startActivity((Intent)localObject3);
        this.yJI.yTx.overridePendingTransition(0, 0);
        if ((!parambi.bwt()) || (parama.userName == null))
          break label600;
        com.tencent.mm.ui.chatting.a.a(com.tencent.mm.ui.chatting.a.a.yFt, parambi);
        if (!parama.userName.toLowerCase().endsWith("@chatroom"))
          break label580;
        com.tencent.mm.plugin.report.service.h.pYm.e(11444, new Object[] { Integer.valueOf(2) });
        AppMethodBeat.o(33347);
        break;
        break label379;
        label559: if (com.tencent.mm.model.t.mZ((String)localObject1))
          j = 7;
        else
          j = 1;
      }
      label580: com.tencent.mm.plugin.report.service.h.pYm.e(11444, new Object[] { Integer.valueOf(1) });
      label600: AppMethodBeat.o(33347);
      break;
      localObject3 = parama.cKd;
      if (((cy)localObject3).field_isSend == 0)
      {
        parambi = parama.cKd;
        paramView = u.ut(parambi.field_imgPath);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.DesignerClickListener", "videoReceiverEvent video status:" + paramView.status + " is sender:" + parambi.field_isSend);
        switch (parama.klY)
        {
        default:
        case 4:
        case 3:
        }
      }
      while (true)
        if (((cy)localObject3).field_isSend == 1)
        {
          paramView = parama.cKd;
          if (paramView == null)
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.DesignerClickListener", "videoSendEvent but msg is null ");
            AppMethodBeat.o(33347);
            break;
            aw.ZK();
            if (!c.isSDCardAvailable())
            {
              com.tencent.mm.ui.base.t.hO(this.yJI.yTx.getContext());
              continue;
            }
            u.uq(parambi.field_imgPath);
            continue;
            i(paramView);
            continue;
          }
          parambi = o.all().uf(paramView.field_imgPath);
          if (parambi == null)
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.DesignerClickListener", "videoSendEvent but video info is null [%s]", new Object[] { paramView.field_imgPath });
            AppMethodBeat.o(33347);
            break;
          }
          j = parambi.status;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.DesignerClickListener", " videoSendEvent status : ".concat(String.valueOf(j)));
          switch (parama.klY)
          {
          default:
          case 4:
          case 3:
          }
        }
      while (true)
      {
        AppMethodBeat.o(33347);
        break;
        aw.ZK();
        if (!c.isSDCardAvailable())
        {
          com.tencent.mm.ui.base.t.hO(this.yJI.yTx.getContext());
          AppMethodBeat.o(33347);
          break;
        }
        if (j == 112)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.DesignerClickListener", "this video come from pc weixin, user pause recv now.");
          u.uq(paramView.field_imgPath);
          AppMethodBeat.o(33347);
          break;
        }
        parambi = paramView.field_imgPath;
        parama = u.ut(parambi);
        if (parama == null)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoLogic", "ERR:" + g.Mq() + " getinfo failed: " + parambi);
          g.getLine();
        }
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.DesignerClickListener", "pause video, publish SendMsgFailEvent");
          parama = new qc();
          parama.cMs.csG = paramView;
          com.tencent.mm.sdk.b.a.xxA.m(parama);
          AppMethodBeat.o(33347);
          break;
          if ((parama.status != 104) && (parama.status != 103))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoLogic", "ERR:" + g.Mq() + " get status failed: " + parambi + " status:" + parama.status);
            g.getLine();
          }
          else
          {
            parama.status = 105;
            parama.fXb = bo.anT();
            parama.bJt = 1280;
            if (!u.f(parama))
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.VideoLogic", "ERR:" + g.Mq() + " update failed: " + parambi);
              g.getLine();
            }
          }
        }
        aw.ZK();
        if (!c.isSDCardAvailable())
        {
          com.tencent.mm.ui.base.t.hO(this.yJI.yTx.getContext());
          AppMethodBeat.o(33347);
          break;
        }
        if (j == 113)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.DesignerClickListener", "this video come from pc weixin, user restart now.");
          i(parambi);
          AppMethodBeat.o(33347);
          break;
        }
        if (parambi.alx())
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.DesignerClickListener", "this video come from gallery, but it is illegal.");
          paramView = this.yJI.yTx.getContext().getString(2131304248);
          if (j == 142)
            paramView = this.yJI.yTx.getContext().getString(2131304248);
          while (true)
          {
            com.tencent.mm.ui.base.h.b(this.yJI.yTx.getContext(), paramView, this.yJI.yTx.getContext().getString(2131304077), true);
            AppMethodBeat.o(33347);
            break;
            if (j == 141)
              paramView = this.yJI.yTx.getContext().getString(2131304249);
            else if (j == 140)
              paramView = this.yJI.yTx.getContext().getString(2131304247);
          }
        }
        paramView.dtJ();
        aw.ZK();
        c.XO().a(paramView.field_msgId, paramView);
        if (parambi.status == 198)
        {
          u.us(paramView.field_imgPath);
          AppMethodBeat.o(33347);
          break;
        }
        u.uo(paramView.field_imgPath);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.am.c
 * JD-Core Version:    0.6.2
 */