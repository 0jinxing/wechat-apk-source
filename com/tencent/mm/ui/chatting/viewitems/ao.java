package com.tencent.mm.ui.chatting.viewitems;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.d;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

public final class ao extends c
{
  private f fQS;
  private ProgressDialog qlZ;
  private a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33390);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969112);
      ((View)localObject).setTag(new au().fj((View)localObject));
    }
    AppMethodBeat.o(33390);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, final a parama1, final bi parambi, String paramString)
  {
    AppMethodBeat.i(33391);
    paramString = (au)parama;
    this.yJI = parama1;
    parama = am.dhN().ma(parambi.field_msgId);
    parama1 = parambi.field_content;
    if ((parama != null) && (parama1 != null));
    for (parama = j.b.me(parama1); ; parama = null)
    {
      boolean bool1 = false;
      parama1 = com.tencent.mm.plugin.subapp.c.e.abk(parama1);
      boolean bool2 = bool1;
      if (parama1 != null)
      {
        bool2 = bool1;
        if (parama1.ssY == 0);
      }
      try
      {
        Object localObject1 = com.tencent.mm.pluginsdk.f.h.ae(this.yJI.yTx.getContext(), parama1.ssY);
        Object localObject2;
        if ((parama != null) && (parama.description != null))
        {
          i = parama.description.indexOf('|');
          if ((i <= 0) || (parama.description.length() <= i + 1))
            break label956;
          localObject2 = parama.description.substring(i + 1);
          paramString.gnC.setText((CharSequence)localObject2);
        }
        while (true)
        {
          if ((localObject1 != null) && (((String)localObject1).length() > 0))
          {
            localObject2 = ((String)localObject1).split(";");
            paramString.zic.setText(localObject2[0]);
            if (localObject2.length > 1)
              paramString.zid.setText(localObject2[1]);
          }
          bool2 = ah.mL(parama1.ssY);
          if (!bool2)
            break;
          paramString.zig.setVisibility(0);
          paramString.gnC.setTextColor(this.yJI.yTx.getMMResources().getColor(2131690613));
          paramString.zid.setTextColor(this.yJI.yTx.getMMResources().getColor(2131690613));
          paramString.zic.setTextColor(this.yJI.yTx.getMMResources().getColor(2131690613));
          paramString.zie.setOnClickListener(new ao.1(this, parambi, paramInt));
          long l = parambi.field_msgId;
          localObject2 = ((aj)this.yJI.aF(aj.class)).dFm();
          if ((localObject2 == null) || (!((d)localObject2).isPlaying()) || (((d)localObject2).yGO != l))
            break label1075;
          i = 1;
          if (i == 0)
            break label1081;
          paramString.zie.setBackgroundResource(2130840547);
          Object localObject3;
          if ((parama1 != null) && (!ah.isNullOrNil(parama1.sta)) && (parama1.stb > 0) && (ah.isNullOrNil(parambi.field_reserved)) && (parama != null))
          {
            localObject2 = com.tencent.mm.plugin.subapp.c.k.ug(r.Yz());
            localObject1 = com.tencent.mm.plugin.subapp.c.h.by((String)localObject2, false);
            parambi.jw((String)localObject2);
            aw.ZK();
            com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
            localObject1 = l.a((String)localObject1, parambi.field_msgId, parama.sdkVer, parama.appId, parama1.sta, parama1.stb, parama.type, parama.fgs);
            if (localObject1 != null)
            {
              localObject3 = aw.Rg();
              localObject2 = new ao.2(this, parambi, (String)localObject1, paramInt);
              this.fQS = ((f)localObject2);
              ((p)localObject3).a(221, (f)localObject2);
              localObject2 = new com.tencent.mm.plugin.record.b.e((String)localObject1);
              ((com.tencent.mm.plugin.record.b.e)localObject2).ceC();
              aw.Rg().a((m)localObject2, 0);
            }
          }
          if ((ah.isNullOrNil(parambi.field_imgPath)) && (parama1.ste > 0))
          {
            aw.ZK();
            localObject1 = com.tencent.mm.model.c.XO().Q(parambi.field_talker, parama1.ste);
            if (!ah.isNullOrNil(((cy)localObject1).field_imgPath))
            {
              localObject2 = com.tencent.mm.plugin.subapp.c.k.ug(r.Yz());
              localObject3 = com.tencent.mm.plugin.subapp.c.h.by((String)localObject2, false);
              if (com.tencent.mm.vfs.e.y(com.tencent.mm.plugin.subapp.c.h.by(((cy)localObject1).field_imgPath, false), (String)localObject3) >= 0L)
              {
                parambi.jv((String)localObject2);
                aw.ZK();
                com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
              }
            }
          }
          if ((ah.isNullOrNil(parambi.field_imgPath)) && (parama1 != null) && (!ah.isNullOrNil(parama1.csD)) && (parama1.fgo > 0) && (this.fQS == null))
          {
            localObject1 = com.tencent.mm.plugin.subapp.c.k.ug(r.Yz());
            localObject2 = com.tencent.mm.plugin.subapp.c.h.by((String)localObject1, false);
            parambi.jv((String)localObject1);
            aw.ZK();
            com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
            localObject1 = l.a((String)localObject2, parambi.field_msgId, parama.sdkVer, parama.appId, parama.csD, parama.fgo);
            ab.d("MicroMsg.ChattingItemVoiceRemindConfirm", "mediaId  " + ((b)localObject1).field_mediaSvrId);
            if (((b)localObject1).field_mediaSvrId != null)
            {
              parama = aw.Rg();
              localObject2 = new ao.3(this, (b)localObject1);
              this.fQS = ((f)localObject2);
              parama.a(221, (f)localObject2);
              parama = new com.tencent.mm.plugin.record.b.e((b)localObject1);
              aw.Rg().a(parama, 0);
            }
          }
          paramString.zif.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(33389);
              com.tencent.mm.ui.base.h.a(ao.a(ao.this).yTx.getContext(), 2131304319, 2131304321, new ao.4.1(this), null);
              AppMethodBeat.o(33389);
            }
          });
          paramString.jPL.setTag(new ay(parambi, this.yJI.dFx(), paramInt, null, '\000'));
          aw.ZK();
          if (com.tencent.mm.model.c.isSDCardAvailable())
            paramString.jPL.setOnLongClickListener(c(this.yJI));
          AppMethodBeat.o(33391);
          return;
          label956: paramString.gnC.setText("");
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.ChattingItemVoiceRemindConfirm", localException, "", new Object[0]);
          continue;
          paramString.zig.setVisibility(8);
          paramString.gnC.setTextColor(this.yJI.yTx.getMMResources().getColor(2131690612));
          paramString.zid.setTextColor(this.yJI.yTx.getMMResources().getColor(2131690612));
          paramString.zic.setTextColor(this.yJI.yTx.getMMResources().getColor(2131690612));
          continue;
          label1075: int i = 0;
          continue;
          label1081: paramString.zie.setBackgroundResource(2130840548);
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33392);
    int i = ((ay)paramView.getTag()).position;
    int j = l.aiL(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    paramView = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    if ((paramView.fgo <= 0) || ((paramView.fgo > 0) && (j >= 100)))
      paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
    if (!this.yJI.dFy())
      paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(33392);
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33393);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33393);
    case 111:
    }
    while (true)
    {
      return false;
      paramMenuItem = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
      paramMenuItem.putExtra("Retr_Msg_content", bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
      paramMenuItem.putExtra("Retr_Msg_Type", 2);
      paramMenuItem.putExtra("Retr_Msg_Id", parambi.field_msgId);
      parama.startActivity(paramMenuItem);
      AppMethodBeat.o(33393);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1879048189);
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return true;
  }

  protected final boolean dHj()
  {
    return false;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ao
 * JD-Core Version:    0.6.2
 */