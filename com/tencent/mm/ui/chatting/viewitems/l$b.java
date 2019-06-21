package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
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
import com.tencent.mm.model.bh;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.j;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.vfs.e;

public final class l$b extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;
  private final long zdV = 259200000L;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32954);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969052);
      ((View)localObject).setTag(new l.a().eW((View)localObject));
    }
    AppMethodBeat.o(32954);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32955);
    l.a locala = (l.a)parama;
    this.yJI = parama1;
    ((j)parama1.aF(j.class)).bg(parambi);
    parama = null;
    String str = parambi.field_content;
    paramString = str;
    if (parama1.dFx())
    {
      int i = parambi.field_content.indexOf(':');
      paramString = str;
      if (i != -1)
        paramString = parambi.field_content.substring(i + 1);
    }
    if (paramString != null)
      parama = j.b.X(paramString, parambi.field_reserved);
    f localf;
    if (parama != null)
    {
      localf = com.tencent.mm.pluginsdk.model.app.g.dX(parama.appId, parama.axy);
      if (localf != null)
        b(parama1, parama, parambi);
      if ((localf != null) && (localf.field_appName != null) && (localf.field_appName.trim().length() > 0))
        break label454;
      paramString = parama.appName;
      if ((parama.appId == null) || (parama.appId.length() <= 0) || (!com.tencent.mm.pluginsdk.model.app.g.dg(paramString)))
        break label480;
      locala.moL.setText(com.tencent.mm.pluginsdk.model.app.g.b(parama1.yTx.getContext(), localf, paramString));
      locala.moL.setVisibility(0);
      if ((localf == null) || (!localf.xy()))
        break label464;
      a(parama1, locala.moL, parambi, parama, localf.field_packageName, parambi.field_msgSvrId);
      label257: a(parama1, locala.moL, parama.appId);
      label270: if ((parama.dJv != null) && (parama.dJv.length() != 0))
        break label493;
      locala.zbU.setVisibility(8);
      label297: switch (parama.type)
      {
      default:
        label320: if (!parama1.dFx())
          if (com.tencent.mm.pluginsdk.model.app.g.h(localf))
          {
            locala.zdU.setVisibility(0);
            locala.zbU.setVisibility(8);
            c(parama1, locala.zdU, ay.a(parama, parambi));
          }
        break;
      case 2:
      }
    }
    while (true)
    {
      locala.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
      locala.jPL.setOnClickListener(d(parama1));
      if (this.kuU)
      {
        locala.jPL.setOnLongClickListener(c(parama1));
        locala.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
      }
      AppMethodBeat.o(32955);
      return;
      label454: paramString = localf.field_appName;
      break;
      label464: a(parama1, locala.moL, parama.appId);
      break label257;
      label480: locala.moL.setVisibility(8);
      break label270;
      label493: locala.zbU.setVisibility(0);
      b(parama1, locala.zbU, ay.arL(parama.dJv));
      break label297;
      locala.mOX.setVisibility(0);
      com.tencent.mm.pluginsdk.model.app.b localb = am.aUq().aiE(parama.csD);
      str = parambi.field_imgPath;
      paramString = Boolean.FALSE;
      if (localb != null)
      {
        str = localb.field_fileFullPath;
        paramString = Boolean.TRUE;
      }
      if (o.ahl().a(locala.mOX, str, paramString.booleanValue(), com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), parama.fgH, parama.fgG, locala.mPb, 2130838177, 1, null))
        break label320;
      if (this.kuU)
        locala.mOX.setImageResource(2131231072);
      while (true)
      {
        locala.mOX.post(new l.b.1(this, locala));
        break;
        locala.mOX.setImageBitmap(BitmapFactory.decodeResource(parama1.yTx.getMMResources(), 2130838177));
      }
      locala.zdU.setVisibility(8);
      continue;
      locala.zdU.setVisibility(8);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32956);
    if ((paramView == null) || (parambi == null))
    {
      AppMethodBeat.o(32956);
      return true;
    }
    int i = ((ay)paramView.getTag()).position;
    com.tencent.mm.pluginsdk.model.app.l.aiL(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    if (com.tencent.mm.pluginsdk.model.app.g.i(com.tencent.mm.pluginsdk.model.app.g.bT(j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend)).appId, false)))
      paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
    if (d.afj("favorite"))
      paramContextMenu.add(i, 116, 0, this.yJI.yTx.getMMResources().getString(2131301955));
    Object localObject = new dq();
    ((dq)localObject).cxc.cvx = parambi.field_msgId;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    boolean bool = com.tencent.mm.pluginsdk.model.app.g.o(this.yJI.yTx.getContext(), 2L);
    if ((((dq)localObject).cxd.cwB) || (bool))
      paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
    int[] arrayOfInt;
    int j;
    int k;
    if (parambi.field_status != 5)
    {
      localObject = paramContextMenu.add(i, 131, 0, paramView.getContext().getString(2131298118));
      arrayOfInt = new int[2];
      if (paramView == null)
        break label416;
      j = paramView.getWidth();
      k = paramView.getHeight();
      paramView.getLocationInWindow(arrayOfInt);
    }
    while (true)
    {
      paramView = new Intent();
      paramView.putExtra("img_gallery_width", j).putExtra("img_gallery_height", k).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]);
      ((MenuItem)localObject).setIntent(paramView);
      if (bh.o(parambi))
        paramContextMenu.clear();
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
      AppMethodBeat.o(32956);
      break;
      label416: k = 0;
      j = 0;
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    Object localObject1 = null;
    AppMethodBeat.i(32957);
    Object localObject2 = parambi.field_content;
    if (localObject2 != null);
    for (localObject2 = j.b.me((String)localObject2); ; localObject2 = null)
    {
      switch (paramMenuItem.getItemId())
      {
      default:
        AppMethodBeat.o(32957);
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
        if (!parambi.dtH())
          if ((System.currentTimeMillis() - parambi.field_createTime <= 259200000L) || ((!bo.isNullOrNil(paramMenuItem)) && (e.ct(paramMenuItem))))
            break label235;
        label235: for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label241;
          ab.i("MicroMsg.ChattingItemAppMsgFromImg", "img is expired or clean!!!");
          com.tencent.mm.ui.base.h.a(parama.yTx.getContext(), parama.yTx.getContext().getString(2131300610), parama.yTx.getContext().getString(2131297061), new l.b.2(this));
          AppMethodBeat.o(32957);
          break;
        }
        label241: new ak().post(new l.b.3(this, parambi));
        localObject2 = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
        ((Intent)localObject2).putExtra("Retr_File_Name", paramMenuItem);
        ((Intent)localObject2).putExtra("Retr_Msg_content", bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
        ((Intent)localObject2).putExtra("Retr_Msg_Type", 16);
        ((Intent)localObject2).putExtra("Retr_Msg_Id", parambi.field_msgId);
        parama.startActivity((Intent)localObject2);
        AppMethodBeat.o(32957);
        continue;
        l.a(parama, paramMenuItem, parambi);
        AppMethodBeat.o(32957);
      }
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 268435505));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32958);
    aw.ZK();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(parama.yTx.getContext());
      AppMethodBeat.o(32958);
    }
    Object localObject1;
    while (true)
    {
      return true;
      localObject1 = null;
      localObject2 = bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend);
      if (localObject2 != null)
        localObject1 = j.b.me((String)localObject2);
      if (localObject1 != null)
        break;
      ab.e("MicroMsg.ChattingItemAppMsgFromImg", "content is null");
      AppMethodBeat.o(32958);
    }
    Object localObject2 = new int[2];
    int i;
    int j;
    if (paramView != null)
    {
      paramView.getLocationInWindow((int[])localObject2);
      i = paramView.getWidth();
      j = paramView.getHeight();
    }
    while (true)
    {
      paramView = com.tencent.mm.pluginsdk.model.app.g.bT(((j.b)localObject1).appId, true);
      if ((paramView != null) && (paramView.xy()))
        a(parama, (j.b)localObject1, d(parama, parambi), paramView, parambi.field_msgSvrId, parama.getTalkerUserName());
      if ((((j.b)localObject1).csD != null) && (((j.b)localObject1).csD.length() > 0))
      {
        paramView = am.aUq().aiE(((j.b)localObject1).csD);
        if ((paramView == null) || (!paramView.bCR()))
          if (parambi.field_isSend == 0)
          {
            l1 = parambi.field_msgId;
            paramView = new Intent();
            paramView.setClassName(this.yJI.yTx.getContext(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
            paramView.putExtra("app_msg_id", l1);
            this.yJI.startActivity(paramView);
          }
      }
      label393: 
      while ((((j.b)localObject1).url == null) || (((j.b)localObject1).url.length() <= 0))
      {
        while (true)
        {
          AppMethodBeat.o(32958);
          break;
          paramView = paramView.field_fileFullPath;
          if (!e.ct(paramView))
          {
            ab.i("MicroMsg.ChattingItemAppMsgFromImg", "Img not exist, bigImgPath: %s, msgId: %d, msgSvrId: %d", new Object[] { paramView, Long.valueOf(parambi.field_msgId), Long.valueOf(parambi.field_msgSvrId) });
            paramView = new Intent();
            paramView.setClassName(parama.yTx.getContext(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
            paramView.putExtra("clean_view_type", 1);
            parama.startActivity(paramView);
            AppMethodBeat.o(32958);
            break;
          }
          if ((paramView != null) && (!paramView.equals("")) && (e.ct(paramView)))
            break label393;
          ab.d("MicroMsg.ChattingItemAppMsgFromImg", "showImg : imgPath is null");
        }
        long l2 = parambi.field_msgId;
        long l1 = parambi.field_msgSvrId;
        parama = parambi.field_talker;
        paramView = new Intent(this.yJI.yTx.getContext(), ImageGalleryUI.class);
        paramView.putExtra("img_gallery_msg_id", l2);
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
          parambi.putString("stat_msg_id", "msg_" + Long.toString(l1));
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
      }
      localObject2 = p.B(((j.b)localObject1).url, "message");
      PackageInfo localPackageInfo = getPackageInfo(parama.yTx.getContext(), ((j.b)localObject1).appId);
      if (localPackageInfo == null)
      {
        paramView = null;
        label684: if (localPackageInfo != null)
          break label731;
      }
      label731: for (i = 0; ; i = localPackageInfo.versionCode)
      {
        a(parama, (String)localObject2, (String)localObject2, paramView, i, ((j.b)localObject1).appId, false, parambi.field_msgId, parambi.field_msgSvrId, parambi);
        break;
        paramView = localPackageInfo.versionName;
        break label684;
      }
      j = 0;
      i = 0;
    }
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.l.b
 * JD-Core Version:    0.6.2
 */