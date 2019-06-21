package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI;
import com.tencent.mm.ui.chatting.k;
import java.util.LinkedList;
import java.util.List;

public final class ae$a extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;
  protected ae.c zga;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33250);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969065);
      ((View)localObject).setTag(new ae.d().z((View)localObject, true));
    }
    AppMethodBeat.o(33250);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33251);
    this.yJI = parama1;
    parama = (ae.d)parama;
    if (this.zga == null)
      this.zga = new ae.c(parama1);
    ae.d.a(parama, parambi, true, paramInt, parama1, this.zga, c(parama1));
    AppMethodBeat.o(33251);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33252);
    if (parambi.getType() == 48)
    {
      int i = ((ay)paramView.getTag()).position;
      paramContextMenu.add(i, 127, 0, paramView.getContext().getString(2131302491));
      if ((f.aeA()) && (!this.yJI.dFy()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(2131298150));
      if (d.afj("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
      dq localdq = new dq();
      localdq.cxc.cvx = parambi.field_msgId;
      com.tencent.mm.sdk.b.a.xxA.m(localdq);
      if ((localdq.cxd.cwB) || (g.ad(this.yJI.yTx.getContext(), parambi.getType())))
        paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
    }
    AppMethodBeat.o(33252);
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(33253);
    switch (paramMenuItem.getItemId())
    {
    case 128:
    default:
      bool = false;
      AppMethodBeat.o(33253);
    case 129:
    case 127:
    }
    while (true)
    {
      return bool;
      paramMenuItem = new Intent(parama.yTx.getContext(), ChattingSendDataToDeviceUI.class);
      paramMenuItem.putExtra("exdevice_open_scene_type", 1);
      paramMenuItem.putExtra("Retr_Msg_Id", parambi.field_msgId);
      parama.yTx.getContext().startActivity(paramMenuItem);
      AppMethodBeat.o(33253);
      continue;
      if (parambi.bAC())
      {
        paramMenuItem = new LinkedList();
        paramMenuItem.add(parambi);
        k.a(parama.yTx.getContext(), paramMenuItem, parama.dFx(), parama.sRl.field_username, null);
      }
      AppMethodBeat.o(33253);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 48));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    return false;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ae.a
 * JD-Core Version:    0.6.2
 */