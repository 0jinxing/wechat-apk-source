package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.d;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

public final class ap extends c
{
  private f fQS;
  private a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33396);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969113);
      ((View)localObject).setTag(new be().fk((View)localObject));
    }
    AppMethodBeat.o(33396);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33398);
    be localbe = (be)parama;
    this.yJI = parama1;
    Object localObject1 = am.dhN().ma(parambi.field_msgId);
    Object localObject2 = parambi.field_content;
    parama = null;
    paramString = parama;
    if (localObject1 != null)
    {
      paramString = parama;
      if (localObject2 != null)
        paramString = j.b.X((String)localObject2, parambi.field_reserved);
    }
    localObject1 = com.tencent.mm.plugin.subapp.c.e.abk((String)localObject2);
    if ((localObject1 != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject1).ssY != 0));
    try
    {
      Object localObject3 = com.tencent.mm.pluginsdk.f.h.ae(parama1.yTx.getContext(), ((com.tencent.mm.plugin.subapp.c.e)localObject1).ssY);
      localObject2 = "";
      parama = (c.a)localObject2;
      if (localObject3 != null)
      {
        parama = (c.a)localObject2;
        if (((String)localObject3).length() > 0)
        {
          localObject3 = ((String)localObject3).split(";");
          parama = new java/lang/StringBuilder;
          parama.<init>();
          localObject2 = "" + localObject3[0].replace(" ", "");
          parama = (c.a)localObject2;
          if (localObject3.length > 1)
          {
            parama = new java/lang/StringBuilder;
            parama.<init>();
            parama = (String)localObject2 + localObject3[1];
          }
        }
      }
      localObject2 = parama;
      if (paramString != null)
      {
        localObject2 = parama;
        if (paramString.description != null)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = parama + " " + paramString.description;
        }
      }
      localbe.gnC.setText((CharSequence)localObject2);
      ab.d("MicroMsg.ChattingItemVoiceRemindRemind", "content remind " + parambi.field_content);
      if ((bo.isNullOrNil(parambi.field_imgPath)) && (((com.tencent.mm.plugin.subapp.c.e)localObject1).ste > 0))
      {
        aw.ZK();
        localObject3 = com.tencent.mm.model.c.XO().Q(parambi.field_talker, ((com.tencent.mm.plugin.subapp.c.e)localObject1).ste);
        if (!bo.isNullOrNil(((cy)localObject3).field_imgPath))
        {
          localObject2 = com.tencent.mm.plugin.subapp.c.k.ug(r.Yz());
          parama = com.tencent.mm.plugin.subapp.c.h.by((String)localObject2, false);
          if (com.tencent.mm.vfs.e.y(com.tencent.mm.plugin.subapp.c.h.by(((cy)localObject3).field_imgPath, false), parama) >= 0L)
          {
            parambi.jv((String)localObject2);
            aw.ZK();
            com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
          }
        }
      }
      if ((bo.isNullOrNil(parambi.field_imgPath)) && (localObject1 != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject1).csD != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject1).csD.length() > 0) && (((com.tencent.mm.plugin.subapp.c.e)localObject1).fgo > 0) && (this.fQS == null))
      {
        parama = com.tencent.mm.plugin.subapp.c.k.ug(r.Yz());
        localObject2 = com.tencent.mm.plugin.subapp.c.h.by(parama, false);
        if (bo.isNullOrNil(parambi.field_imgPath))
        {
          parambi.jv(parama);
          aw.ZK();
          com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
          ab.d("MicroMsg.ChattingItemVoiceRemindRemind", "content.attachid " + paramString.csD);
          localObject2 = l.a((String)localObject2, parambi.field_msgId, paramString.sdkVer, paramString.appId, paramString.csD, paramString.fgo);
          ab.d("MicroMsg.ChattingItemVoiceRemindRemind", "ainfo.field_mediaSvrId " + ((b)localObject2).field_mediaSvrId);
          if (((b)localObject2).field_mediaSvrId != null)
          {
            paramString = aw.Rg();
            parama = new ap.1(this);
            this.fQS = parama;
            paramString.a(221, parama);
            ab.d("MicroMsg.ChattingItemVoiceRemindRemind", "doscene");
            parama = new com.tencent.mm.plugin.record.b.e((b)localObject2);
            aw.Rg().a(parama, 0);
          }
        }
      }
      localbe.zjv.setOnClickListener(new ap.2(this, parambi, paramInt));
      long l = parambi.field_msgId;
      parama = ((aj)this.yJI.aF(aj.class)).dFm();
      if ((parama.isPlaying()) && (parama.yGO == l))
      {
        i = 1;
        if (i == 0)
          break label807;
        localbe.zjv.setImageResource(2130839637);
        localbe.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
        aw.ZK();
        if (com.tencent.mm.model.c.isSDCardAvailable())
          localbe.jPL.setOnLongClickListener(c(parama1));
        AppMethodBeat.o(33398);
      }
    }
    catch (Exception parama)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ChattingItemVoiceRemindRemind", parama, "", new Object[0]);
        continue;
        int i = 0;
        continue;
        label807: localbe.zjv.setImageResource(2130839639);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33399);
    int i = ((ay)paramView.getTag()).position;
    int j = l.aiL(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    paramView = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    if ((paramView.fgo <= 0) || ((paramView.fgo > 0) && (j >= 100)))
      paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
    if (!this.yJI.dFy())
      paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(33399);
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33400);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33400);
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
      AppMethodBeat.o(33400);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1879048190);
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final String b(a parama, bi parambi)
  {
    AppMethodBeat.i(33397);
    parama = parama.getTalkerUserName();
    AppMethodBeat.o(33397);
    return parama;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return true;
  }

  protected final boolean b(a parama)
  {
    return false;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ap
 * JD-Core Version:    0.6.2
 */