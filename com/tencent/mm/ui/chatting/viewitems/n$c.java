package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.af;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

public final class n$c extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32981);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969091);
      ((View)localObject).setTag(new n.a().eY((View)localObject));
    }
    AppMethodBeat.o(32981);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32982);
    paramString = (n.a)parama;
    this.yJI = parama1;
    parama = parambi.field_content;
    if (parama != null);
    for (parama = j.b.X(parama, parambi.field_reserved); ; parama = null)
    {
      if (parama != null)
      {
        parambi = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
        paramString.jPL.setTag(parambi);
        paramString.jPL.setOnClickListener(d(parama1));
        if (this.kuU)
        {
          paramString.jPL.setOnLongClickListener(c(parama1));
          paramString.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
        }
        paramString.zea.setText(parama.title);
      }
      if ((com.tencent.mm.bh.d.fUu != null) && (com.tencent.mm.bh.d.fUu.tQ(parama1.getTalkerUserName())))
      {
        paramString.zea.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690316));
        paramString.jPL.setClickable(true);
        paramString.jPL.setEnabled(true);
        AppMethodBeat.o(32982);
      }
      while (true)
      {
        return;
        paramString.zea.setTextColor(-8750470);
        paramString.jPL.setClickable(false);
        paramString.jPL.setEnabled(false);
        AppMethodBeat.o(32982);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32983);
    int i = ((ay)paramView.getTag()).position;
    l.aiL(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    j.b localb = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
    f localf = g.bT(localb.appId, false);
    if ((com.tencent.mm.bp.d.afj("favorite")) && ((localf == null) || (!localf.xy())))
      switch (localb.type)
      {
      case 7:
      case 8:
      case 9:
      case 11:
      case 12:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 10:
      case 13:
      case 20:
      }
    while (true)
    {
      if ((!parambi.drC()) && (parambi.bAC()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
      AppMethodBeat.o(32983);
      return true;
      paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32984);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(32984);
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
      AppMethodBeat.o(32984);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == -1879048186));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32985);
    paramView = (af)parama.aF(af.class);
    parama.getTalkerUserName();
    paramView.cg("fromMessage", true);
    AppMethodBeat.o(32985);
    return true;
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.n.c
 * JD-Core Version:    0.6.2
 */