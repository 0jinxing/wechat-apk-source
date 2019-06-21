package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.c.b.j;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.chatting.s.n;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.vfs.e;

public final class l$c extends c
  implements s.n
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32960);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969089);
      ((View)localObject).setTag(new l.a().eW((View)localObject));
    }
    AppMethodBeat.o(32960);
    return localObject;
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32965);
    if (parambi.bAA())
    {
      com.tencent.mm.pluginsdk.model.app.l.al(parambi);
      bf.fm(parambi.field_msgId);
      parama.qp(true);
      AppMethodBeat.o(32965);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(32965);
    }
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32961);
    l.a locala = (l.a)parama;
    this.yJI = parama1;
    ((j)parama1.aF(j.class)).bg(parambi);
    parama = null;
    String str = parambi.field_content;
    if (str != null)
      parama = j.b.X(str, parambi.field_reserved);
    Object localObject;
    label198: label211: label232: int i;
    if (parama != null)
    {
      localObject = com.tencent.mm.pluginsdk.model.app.g.dX(parama.appId, parama.axy);
      if ((localObject == null) || (((f)localObject).field_appName == null) || (((f)localObject).field_appName.trim().length() <= 0))
      {
        paramString = parama.appName;
        if ((parama.appId == null) || (parama.appId.length() <= 0) || (!com.tencent.mm.pluginsdk.model.app.g.dg(paramString)))
          break label428;
        locala.moL.setText(com.tencent.mm.pluginsdk.model.app.g.b(parama1.yTx.getContext(), (f)localObject, paramString));
        locala.moL.setVisibility(0);
        if ((localObject == null) || (!((f)localObject).xy()))
          break label412;
        a(parama1, locala.moL, parambi, parama, ((f)localObject).field_packageName, parambi.field_msgSvrId);
        a(parama1, locala.moL, parama.appId);
      }
    }
    else
    {
      switch (parama.type)
      {
      default:
        locala.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
        locala.jPL.setOnClickListener(d(parama1));
        if (this.kuU)
        {
          locala.jPL.setOnLongClickListener(c(parama1));
          locala.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
        }
        i = com.tencent.mm.pluginsdk.model.app.l.aiL(str);
        if ((i == -1) || (i >= 100) || (parama.fgo <= 0) || (parambi.field_status == 5))
        {
          locala.mlI.setVisibility(8);
          locala.mOX.setAlpha(255);
          locala.mOX.setBackgroundDrawable(null);
        }
        break;
      case 2:
      }
    }
    while (true)
    {
      a(paramInt, locala, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
      AppMethodBeat.o(32961);
      return;
      paramString = ((f)localObject).field_appName;
      break;
      label412: a(parama1, locala.moL, parama.appId);
      break label198;
      label428: locala.moL.setVisibility(8);
      break label211;
      locala.mOX.setVisibility(0);
      com.tencent.mm.pluginsdk.model.app.b localb = am.aUq().aiE(parama.csD);
      paramString = parambi.field_imgPath;
      localObject = Boolean.FALSE;
      if (localb != null)
      {
        paramString = localb.field_fileFullPath;
        localObject = Boolean.TRUE;
      }
      if (o.ahl().a(locala.mOX, paramString, ((Boolean)localObject).booleanValue(), com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), parama.fgJ, parama.fgI, locala.mPb, 2130838177, 0, null))
        break label232;
      if (this.kuU)
        locala.mOX.setImageResource(2131231072);
      while (true)
      {
        locala.mOX.post(new l.c.1(this, locala));
        break;
        locala.mOX.setImageBitmap(BitmapFactory.decodeResource(parama1.yTx.getMMResources(), 2130838177));
      }
      locala.mlI.setVisibility(0);
      locala.zdT.setText(i + "%");
      locala.mOX.setAlpha(64);
      locala.mOX.setBackgroundResource(2130840115);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(32962);
    if (paramView == null)
    {
      ab.e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] v is null");
      AppMethodBeat.o(32962);
    }
    while (true)
    {
      return bool;
      localObject = (ay)paramView.getTag();
      if (localObject != null)
        break;
      ab.e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] tag is null");
      AppMethodBeat.o(32962);
    }
    int i = ((ay)localObject).position;
    Object localObject = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    if ((localObject != null) && (com.tencent.mm.pluginsdk.model.app.g.i(com.tencent.mm.pluginsdk.model.app.g.bT(((j.b)localObject).appId, false))))
      paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
    if (d.afj("favorite"))
      paramContextMenu.add(i, 116, 0, this.yJI.yTx.getMMResources().getString(2131301955));
    localObject = new dq();
    ((dq)localObject).cxc.cvx = parambi.field_msgId;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    bool = com.tencent.mm.pluginsdk.model.app.g.o(this.yJI.yTx.getContext(), 2L);
    if ((((dq)localObject).cxd.cwB) || (bool))
      paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
    MenuItem localMenuItem;
    int[] arrayOfInt;
    int j;
    int k;
    if (parambi.field_status != 5)
    {
      localMenuItem = paramContextMenu.add(i, 131, 0, paramView.getContext().getString(2131298118));
      arrayOfInt = new int[2];
      if (paramView == null)
        break label505;
      j = paramView.getWidth();
      k = paramView.getHeight();
      paramView.getLocationInWindow(arrayOfInt);
    }
    while (true)
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("img_gallery_width", j).putExtra("img_gallery_height", k).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]);
      localMenuItem.setIntent((Intent)localObject);
      if ((!parambi.drC()) && (parambi.dtA()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
      AppMethodBeat.o(32962);
      bool = true;
      break;
      label505: k = 0;
      j = 0;
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    Object localObject1 = null;
    AppMethodBeat.i(32963);
    Object localObject2 = parambi.field_content;
    if (localObject2 != null);
    for (localObject2 = j.b.me((String)localObject2); ; localObject2 = null)
    {
      switch (paramMenuItem.getItemId())
      {
      default:
        AppMethodBeat.o(32963);
      case 111:
      case 131:
      }
      while (true)
      {
        return false;
        paramMenuItem = localObject1;
        if (localObject2 != null)
        {
          paramMenuItem = localObject1;
          if (((j.b)localObject2).csD != null)
          {
            paramMenuItem = localObject1;
            if (((j.b)localObject2).csD.length() > 0)
            {
              localObject2 = am.aUq().aiE(((j.b)localObject2).csD);
              paramMenuItem = localObject1;
              if (localObject2 != null)
                paramMenuItem = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
            }
          }
        }
        localObject2 = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
        ((Intent)localObject2).putExtra("Retr_Msg_content", parambi.field_content);
        ((Intent)localObject2).putExtra("Retr_File_Name", paramMenuItem);
        ((Intent)localObject2).putExtra("Retr_Msg_Type", 16);
        ((Intent)localObject2).putExtra("Retr_Msg_Id", parambi.field_msgId);
        parama.startActivity((Intent)localObject2);
        AppMethodBeat.o(32963);
        continue;
        l.a(parama, paramMenuItem, parambi);
        AppMethodBeat.o(32963);
      }
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 268435505));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32964);
    aw.ZK();
    boolean bool;
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(parama.yTx.getContext());
      bool = true;
      AppMethodBeat.o(32964);
    }
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return bool;
      if (paramView == null)
      {
        bool = true;
        AppMethodBeat.o(32964);
      }
      else
      {
        paramView.getTag();
        localObject1 = null;
        localObject2 = parambi.field_content;
        if (localObject2 != null)
          localObject1 = j.b.me((String)localObject2);
        if (localObject1 == null)
        {
          ab.e("MicroMsg.ChattingItemAppMsgToImg", "content is null");
          bool = true;
          AppMethodBeat.o(32964);
        }
        else
        {
          localObject2 = new int[2];
          paramView.getLocationInWindow((int[])localObject2);
          i = paramView.getWidth();
          int j = paramView.getHeight();
          paramView = com.tencent.mm.pluginsdk.model.app.g.bT(((j.b)localObject1).appId, false);
          if (paramView != null)
            a(parama, (j.b)localObject1, r.Yz(), paramView, parambi.field_msgSvrId, parama.getTalkerUserName());
          if ((((j.b)localObject1).csD == null) || (((j.b)localObject1).csD.length() <= 0))
            break;
          paramView = am.aUq().aiE(((j.b)localObject1).csD);
          if (paramView == null)
            break label693;
          aw.ZK();
          if (!com.tencent.mm.model.c.isSDCardAvailable())
            com.tencent.mm.ui.base.t.hO(parama.yTx.getContext());
          while (true)
          {
            bool = true;
            AppMethodBeat.o(32964);
            break;
            if (parambi.field_isSend == 1)
            {
              paramView = paramView.field_fileFullPath;
              if (!e.ct(paramView))
                break label516;
              if ((paramView != null) && (!paramView.equals("")) && (e.ct(paramView)))
                break label281;
              ab.d("MicroMsg.ChattingItemAppMsgToImg", "showImg : imgPath is null");
            }
          }
          label281: long l1 = parambi.field_msgId;
          long l2 = parambi.field_msgSvrId;
          parama = parambi.field_talker;
          paramView = new Intent(this.yJI.yTx.getContext(), ImageGalleryUI.class);
          paramView.putExtra("img_gallery_msg_id", l1);
          paramView.putExtra("img_gallery_talker", parama);
          paramView.putExtra("img_gallery_left", localObject2[0]);
          paramView.putExtra("img_gallery_top", localObject2[1]);
          paramView.putExtra("img_gallery_width", i);
          paramView.putExtra("img_gallery_height", j);
          parama = this.yJI.getTalkerUserName();
          localObject1 = b(this.yJI, parambi);
          parambi = new Bundle();
          if (this.yJI.dFx())
            i = 2;
          while (true)
          {
            parambi.putInt("stat_scene", i);
            parambi.putString("stat_msg_id", "msg_" + Long.toString(l2));
            parambi.putString("stat_chat_talker_username", parama);
            parambi.putString("stat_send_msg_user", (String)localObject1);
            paramView.putExtra("_stat_obj", parambi);
            this.yJI.startActivity(paramView);
            break;
            if (com.tencent.mm.model.t.mZ(parama))
              i = 7;
            else
              i = 1;
          }
          label516: ab.i("MicroMsg.ChattingItemAppMsgToImg", "onItemClick::bigImgPath: %s, msgId: %d, msgSvrId: %d", new Object[] { paramView, Long.valueOf(parambi.field_msgId), Long.valueOf(parambi.field_msgSvrId) });
          paramView = new Intent();
          paramView.setClassName(parama.yTx.getContext(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
          paramView.putExtra("clean_view_type", 1);
          parama.startActivity(paramView);
          bool = true;
          AppMethodBeat.o(32964);
        }
      }
    }
    String str;
    if ((((j.b)localObject1).url != null) && (((j.b)localObject1).url.length() > 0))
    {
      str = p.B(((j.b)localObject1).url, "message");
      localObject2 = getPackageInfo(parama.yTx.getContext(), ((j.b)localObject1).appId);
      if (localObject2 != null)
        break label705;
      paramView = null;
      label658: if (localObject2 != null)
        break label714;
    }
    label693: label705: label714: for (int i = 0; ; i = ((PackageInfo)localObject2).versionCode)
    {
      a(parama, str, str, paramView, i, ((j.b)localObject1).appId, false, parambi.field_msgId, parambi.field_msgSvrId, parambi);
      bool = false;
      AppMethodBeat.o(32964);
      break;
      paramView = ((PackageInfo)localObject2).versionName;
      break label658;
    }
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.l.c
 * JD-Core Version:    0.6.2
 */