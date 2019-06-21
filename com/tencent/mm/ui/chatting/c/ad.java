package com.tencent.mm.ui.chatting.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ay.e;
import com.tencent.mm.chatroom.ui.ChatroomInfoUI;
import com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.cb;
import com.tencent.mm.model.k;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.f;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.c.b.x;
import com.tencent.mm.ui.chatting.m.a.a;
import com.tencent.mm.ui.chatting.m.a.b;
import com.tencent.mm.ui.tools.j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=x.class)
public class ad extends a
  implements x, a.b
{
  private j contextMenuHelper;
  private com.tencent.mm.ui.chatting.m.b yRc;
  private com.tencent.mm.ui.chatting.m.c yRd;
  private com.tencent.mm.ui.chatting.m.d yRe;

  private void a(View paramView, com.tencent.mm.ui.chatting.h.a parama)
  {
    AppMethodBeat.i(31619);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xMK, Boolean.FALSE);
    bi localbi = parama.cKd;
    if (cb.aaE() - parama.yYP >= 300000L)
    {
      ab.w("MicroMsg.NewXmlSysMsgComponent", "[handleClickInvokeMessageSysText] it's over time to copy invoke message!");
      com.tencent.mm.ui.base.h.b(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131300701), this.cgL.yTx.getMMResources().getString(2131297061), true);
      com.tencent.mm.sdk.g.d.post(new ad.2(this, localbi, paramView), "deleteInvokeMsg");
      AppMethodBeat.o(31619);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(15037, new Object[] { Integer.valueOf(1) });
      paramView = (o)this.cgL.aF(o.class);
      paramView.dDX().setLastText(paramView.dDX().getLastText() + parama.yYO);
      if (!paramView.dDX().cth())
        paramView.dDX().showVKB();
      AppMethodBeat.o(31619);
    }
  }

  private void a(View paramView, LinkedList<String> paramLinkedList, String paramString)
  {
    AppMethodBeat.i(31620);
    if (this.contextMenuHelper == null)
      this.contextMenuHelper = new j(this.cgL.yTx.getContext());
    this.contextMenuHelper.b(paramView, new ad.3(this), new ad.4(this, paramLinkedList, paramString));
    AppMethodBeat.o(31620);
  }

  @SuppressLint({"StringFormatMatches"})
  private void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, LinkedList<String> paramLinkedList1, LinkedList<String> paramLinkedList2, LinkedList<String> paramLinkedList3, LinkedList<String> paramLinkedList4, LinkedList<String> paramLinkedList5, bi parambi)
  {
    AppMethodBeat.i(31622);
    Intent localIntent = new Intent(this.cgL.yTx.getContext(), SeeAccessVerifyInfoUI.class);
    localIntent.putExtra("msgLocalId", parambi.field_msgId);
    localIntent.putExtra("msgSvrId", parambi.field_msgSvrId);
    localIntent.putExtra("invitertitle", this.cgL.yTx.getMMResources().getString(2131296383, new Object[] { Integer.valueOf(paramLinkedList1.size()) }));
    localIntent.putExtra("inviterusername", paramString1);
    localIntent.putExtra("chatroom", paramString5);
    localIntent.putExtra("inviterappid", paramString2);
    localIntent.putExtra("inviterdescid", paramString3);
    localIntent.putExtra("invitationreason", paramString4);
    localIntent.putExtra("ticket", paramString6);
    localIntent.putExtra("username", com.tencent.mm.sdk.platformtools.bo.c(paramLinkedList1, ","));
    localIntent.putExtra("nickname", com.tencent.mm.sdk.platformtools.bo.c(paramLinkedList2, ","));
    localIntent.putExtra("descid", com.tencent.mm.sdk.platformtools.bo.c(paramLinkedList3, ","));
    localIntent.putExtra("appid", com.tencent.mm.sdk.platformtools.bo.c(paramLinkedList4, ","));
    localIntent.putExtra("headimgurl", com.tencent.mm.sdk.platformtools.bo.c(paramLinkedList5, ","));
    this.cgL.startActivity(localIntent);
    AppMethodBeat.o(31622);
  }

  private void aK(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(31621);
    if (((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm())
    {
      ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).aH(paramLinkedList);
      AppMethodBeat.o(31621);
    }
    while (true)
    {
      return;
      ((f)this.cgL.aF(f.class)).aJ(paramLinkedList);
      AppMethodBeat.o(31621);
    }
  }

  public final void a(View paramView, bi parambi, com.tencent.mm.ay.a parama, int paramInt)
  {
    AppMethodBeat.i(31618);
    if ((parama instanceof e))
    {
      parambi = (e)parama;
      parama = com.tencent.mm.sdk.platformtools.bo.nullAsNil(parambi.fKX);
      ab.d("MicroMsg.NewXmlSysMsgComponent", "click delchatroommember link %s,isBizChat:%s", new Object[] { parama, Boolean.valueOf(((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm()) });
      if (parambi.fLl == null)
      {
        ab.e("MicroMsg.NewXmlSysMsgComponent", "click members is null!!!");
        AppMethodBeat.o(31618);
      }
    }
    while (true)
    {
      return;
      if ((((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn()) || (this.cgL.dFw()));
      for (paramInt = 1; ; paramInt = 0)
      {
        if (paramInt != 0)
          break label150;
        ab.e("MicroMsg.NewXmlSysMsgComponent", "not group chat !!!!!");
        AppMethodBeat.o(31618);
        break;
      }
      label150: if (parama.equals("invite"))
      {
        aK(parambi.fLl);
        AppMethodBeat.o(31618);
      }
      else if (parama.equals("qrcode"))
      {
        a(paramView, parambi.fLl, parambi.cGA);
        AppMethodBeat.o(31618);
      }
      else
      {
        if ((parama.equals("webview")) && (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(parambi.url)))
        {
          paramView = new Intent();
          paramView.putExtra("rawUrl", parambi.url);
          paramView.putExtra("geta8key_username", r.Yz());
          com.tencent.mm.bp.d.b(this.cgL.yTx.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
        }
        AppMethodBeat.o(31618);
        continue;
        if ((parama instanceof com.tencent.mm.ay.d))
        {
          Object localObject = (com.tencent.mm.ay.d)parama;
          if (paramInt == 0)
          {
            parama = ((com.tencent.mm.ay.d)localObject).fLi;
            String str1 = ((com.tencent.mm.ay.d)localObject).fLj;
            String str2 = ((com.tencent.mm.ay.d)localObject).fLc;
            String str3 = ((com.tencent.mm.ay.d)localObject).cxb;
            paramView = ((com.tencent.mm.ay.d)localObject).fLd;
            LinkedList localLinkedList = ((com.tencent.mm.ay.d)localObject).fLg;
            localObject = ((com.tencent.mm.ay.d)localObject).fLh;
            a(parama, "", "", str1, str2, str3, paramView, localLinkedList, new LinkedList(), new LinkedList(), (LinkedList)localObject, parambi);
          }
          AppMethodBeat.o(31618);
        }
        else if ((parama instanceof com.tencent.mm.ay.b))
        {
          paramView = (com.tencent.mm.ay.b)parama;
          parama = new ArrayList();
          parama.addAll(paramView.fLd);
          ((f)this.cgL.aF(f.class)).a(parama, paramView.cxb, parambi);
          AppMethodBeat.o(31618);
        }
        else
        {
          if (!(parama instanceof com.tencent.mm.ui.chatting.h.a))
            break;
          aw.ZK();
          if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xMK, Boolean.TRUE)).booleanValue())
          {
            com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131300700), this.cgL.yTx.getMMResources().getString(2131304077), this.cgL.yTx.getMMResources().getString(2131300601), new ad.1(this, paramView, parama));
            AppMethodBeat.o(31618);
          }
          else
          {
            a(paramView, (com.tencent.mm.ui.chatting.h.a)parama);
            AppMethodBeat.o(31618);
          }
        }
      }
    }
    if ((parama instanceof com.tencent.mm.ay.c))
    {
      ab.i("MicroMsg.NewXmlSysMsgComponent", "handleClickMuteSysText");
      if ((this.cgL.dFw()) && (this.cgL.yTx.getContext() != null))
        if (this.cgL.sRl.dua != 0)
          break label923;
    }
    label923: for (boolean bool = true; ; bool = false)
    {
      ((com.tencent.mm.plugin.expt.roomexpt.d)g.K(com.tencent.mm.plugin.expt.roomexpt.d.class)).gS(bool);
      paramView = new Intent();
      paramView.putExtra("Chat_User", this.cgL.sRl.field_username);
      paramView.putExtra("RoomInfo_Id", this.cgL.getTalkerUserName());
      paramView.putExtra("Is_Chatroom", this.cgL.dFw());
      paramView.putExtra("fromChatting", true);
      paramView.putExtra("isShowSetMuteAnimation", true);
      paramView.setClass(this.cgL.yTx.getContext(), ChatroomInfoUI.class);
      this.cgL.yTx.getContext().startActivity(paramView);
      AppMethodBeat.o(31618);
      break;
      if ((parama instanceof com.tencent.mm.model.bo))
      {
        ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDt();
        AppMethodBeat.o(31618);
        break;
      }
      if ((parama instanceof k))
      {
        ((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDu();
        AppMethodBeat.o(31618);
        break;
      }
      if ((parama instanceof com.tencent.mm.openim.c.a.b))
      {
        paramView = (com.tencent.mm.openim.c.a.b)parama;
        if (paramInt == 0)
          a(paramView.fLi, paramView.gft, paramView.gfu, paramView.fLj, paramView.fLc, paramView.cxb, paramView.fLd, paramView.fLg, paramView.gfr, paramView.gfs, paramView.fLh, parambi);
      }
      AppMethodBeat.o(31618);
      break;
    }
  }

  public final void a(View paramView, a.a parama)
  {
    AppMethodBeat.i(31624);
    if ((paramView != null) && (parama != null))
    {
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(parama.username);
      a(paramView, localLinkedList, parama.link);
    }
    AppMethodBeat.o(31624);
  }

  public final void aL(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(31623);
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
      aK(paramLinkedList);
    AppMethodBeat.o(31623);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31626);
    if (this.yRc != null)
    {
      this.yRc.release();
      this.yRc = null;
    }
    if (this.yRd != null)
    {
      this.yRd.release();
      this.yRd = null;
    }
    if (this.yRe != null)
    {
      this.yRe.release();
      this.yRe = null;
    }
    AppMethodBeat.o(31626);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31625);
    super.dxy();
    this.yRe = new com.tencent.mm.ui.chatting.m.d(this);
    this.yRd = new com.tencent.mm.ui.chatting.m.c(this);
    this.yRc = new com.tencent.mm.ui.chatting.m.b(this);
    AppMethodBeat.o(31625);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ad
 * JD-Core Version:    0.6.2
 */