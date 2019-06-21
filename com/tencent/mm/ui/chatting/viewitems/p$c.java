package com.tencent.mm.ui.chatting.viewitems;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.s.n;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class p$c extends c
  implements s.n
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33004);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969094);
      ((View)localObject).setTag(new p.a().fa((View)localObject));
    }
    AppMethodBeat.o(33004);
    return localObject;
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33008);
    if (parambi.bAA())
    {
      l.al(parambi);
      bf.fm(parambi.field_msgId);
      parama.qp(true);
      AppMethodBeat.o(33008);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(33008);
    }
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33005);
    p.a locala = (p.a)parama;
    this.yJI = parama1;
    ((com.tencent.mm.ui.chatting.c.b.j)parama1.aF(com.tencent.mm.ui.chatting.c.b.j.class)).bg(parambi);
    parama = parambi.field_content;
    if (parama != null);
    for (parama = j.b.X(parama, parambi.field_reserved); ; parama = null)
    {
      f localf;
      if ((parama != null) && (parama.type == 1))
      {
        paramString = com.tencent.mm.pluginsdk.ui.e.j.d(locala.zef.getContext(), parama.title, (int)locala.zef.getTextSize());
        locala.zef.ah(paramString);
        locala.zef.setClickable(true);
        localf = g.bT(parama.appId, true);
        if ((localf != null) && (localf.field_appName != null) && (localf.field_appName.trim().length() > 0))
          break label388;
        paramString = parama.appName;
        if ((parama.appId == null) || (parama.appId.length() <= 0) || (!g.dg(paramString)))
          break label398;
        locala.moL.setText(parama1.yTx.getMMResources().getString(2131298247, new Object[] { g.b(parama1.yTx.getContext(), localf, paramString) }));
        locala.moL.setVisibility(0);
        a(parama1, locala.moL, parama.appId);
        a(parama1, locala.moL, parama.appId);
        label253: if ((parambi.field_status != 2) && (parambi.field_status != 5))
          break label411;
        locala.pyf.setVisibility(8);
      }
      while (true)
      {
        a(paramInt, locala, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
        locala.zef.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
        aw.ZK();
        if (com.tencent.mm.model.c.isSDCardAvailable())
        {
          locala.zef.setOnLongClickListener(c(parama1));
          if ((parama != null) && (parama.type == 1))
            locala.zef.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
        }
        AppMethodBeat.o(33005);
        return;
        label388: paramString = localf.field_appName;
        break;
        label398: locala.moL.setVisibility(8);
        break label253;
        label411: locala.pyf.setVisibility(0);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33006);
    int i = ((ay)paramView.getTag()).position;
    paramContextMenu.add(i, 102, 0, this.yJI.yTx.getMMResources().getString(2131298151));
    paramContextMenu.add(i, 111, 0, this.yJI.yTx.getMMResources().getString(2131302491));
    if (d.afj("favorite"))
      paramContextMenu.add(i, 116, 0, this.yJI.yTx.getMMResources().getString(2131301955));
    if ((!parambi.drC()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)))
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
    if (!this.yJI.dFy())
      paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(33006);
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33007);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(33007);
    case 102:
    case 111:
    }
    while (true)
    {
      return false;
      parama = (ClipboardManager)ah.getContext().getSystemService("clipboard");
      paramMenuItem = j.b.me(parambi.field_content).title;
      parama.setText(paramMenuItem);
      parama = com.tencent.mm.plugin.secinforeport.a.a.qjm;
      com.tencent.mm.plugin.secinforeport.a.a.h(1, parambi.field_msgSvrId, bo.ana(paramMenuItem));
      AppMethodBeat.o(33007);
      continue;
      paramMenuItem = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
      paramMenuItem.putExtra("Retr_Msg_content", parambi.field_content);
      paramMenuItem.putExtra("Retr_Msg_Type", 2);
      paramMenuItem.putExtra("Retr_Msg_Id", parambi.field_msgId);
      parama.startActivity(paramMenuItem);
      AppMethodBeat.o(33007);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 16777265));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    return false;
  }

  public final boolean dHk()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.p.c
 * JD-Core Version:    0.6.2
 */