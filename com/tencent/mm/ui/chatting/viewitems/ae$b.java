package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.u;
import com.tencent.mm.ui.chatting.k;
import com.tencent.mm.ui.chatting.s.n;
import java.util.LinkedList;
import java.util.List;

public final class ae$b extends c
  implements s.n
{
  private com.tencent.mm.ui.chatting.d.a yJI;
  protected ae.c zga;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33254);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969102);
      ((View)localObject).setTag(new ae.d().z((View)localObject, false));
    }
    AppMethodBeat.o(33254);
    return localObject;
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33258);
    parambi.dtJ();
    aw.ZK();
    com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
    ((u)parama.aF(u.class)).bb(parambi);
    AppMethodBeat.o(33258);
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33255);
    this.yJI = parama1;
    paramString = (ae.d)parama;
    if (this.zga == null)
      this.zga = new ae.c(parama1);
    ae.d.a(paramString, parambi, false, paramInt, parama1, this.zga, c(parama1));
    parama = (ae.d)parama;
    if (dHm())
    {
      if ((parambi.field_status != 2) || (!a((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi.field_msgId)))
        break label133;
      if (parama.zci != null)
        parama.zci.setVisibility(0);
    }
    while (true)
    {
      a(paramInt, parama, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
      AppMethodBeat.o(33255);
      return;
      label133: if (parama.zci != null)
        parama.zci.setVisibility(8);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33256);
    if (parambi.getType() == 48)
    {
      int i = ((ay)paramView.getTag()).position;
      if (parambi.field_status == 5)
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(2131298217));
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
      if ((!parambi.drC()) && (parambi.bAC()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
    }
    AppMethodBeat.o(33256);
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33257);
    boolean bool;
    switch (paramMenuItem.getItemId())
    {
    default:
      bool = false;
      AppMethodBeat.o(33257);
    case 127:
    }
    while (true)
    {
      return bool;
      if (parambi.bAC())
      {
        paramMenuItem = new LinkedList();
        paramMenuItem.add(parambi);
        k.a(parama.yTx.getContext(), paramMenuItem, parama.dFx(), parama.sRl.field_username, null);
      }
      bool = true;
      AppMethodBeat.o(33257);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 48));
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
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ae.b
 * JD-Core Version:    0.6.2
 */