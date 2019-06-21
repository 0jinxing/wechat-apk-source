package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bh;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.ai;

public final class am$a extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;
  private am.c zhl;

  private am.c dHr()
  {
    AppMethodBeat.i(33334);
    if (this.zhl == null)
      this.zhl = new am.c(this.yJI);
    am.c localc = this.zhl;
    AppMethodBeat.o(33334);
    return localc;
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33335);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969070);
      ((View)localObject).setTag(new am.d().z((View)localObject, true));
    }
    AppMethodBeat.o(33335);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33336);
    this.yJI = parama1;
    parama = (am.d)parama;
    am.d.a(parama, parambi, true, paramInt, parama1, dHr(), c(parama1));
    parambi = parambi.dJv;
    if ((parambi == null) || (parambi.length() == 0))
    {
      parama.zbU.setVisibility(8);
      AppMethodBeat.o(33336);
    }
    while (true)
    {
      return;
      parama.zbU.setVisibility(0);
      b(parama1, parama.zbU, ay.arL(parambi));
      AppMethodBeat.o(33336);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33337);
    aw.ZK();
    if (com.tencent.mm.model.c.isSDCardAvailable())
    {
      int i = ((ay)paramView.getTag()).position;
      s locals = o.all().uf(parambi.field_imgPath);
      paramContextMenu.add(i, 130, 0, paramView.getContext().getString(2131298159));
      paramContextMenu.add(i, 107, 0, paramView.getContext().getString(2131302491));
      if (d.afj("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
      dq localdq = new dq();
      localdq.cxc.cvx = parambi.field_msgId;
      com.tencent.mm.sdk.b.a.xxA.m(localdq);
      if (localdq.cxd.cwB)
        paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
      if ((locals != null) && ((locals.status == 199) || (locals.status == 199)) && (f.aez()) && (!this.yJI.dFy()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(2131298150));
      if (bh.o(parambi))
      {
        paramContextMenu.clear();
        paramContextMenu.add(i, 130, 0, paramView.getContext().getString(2131298159));
      }
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298155));
    }
    AppMethodBeat.o(33337);
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33338);
    ((ai)parama.aF(ai.class)).a(paramMenuItem, parambi);
    AppMethodBeat.o(33338);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 43));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33339);
    dHr().onClick(paramView);
    AppMethodBeat.o(33339);
    return true;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.am.a
 * JD-Core Version:    0.6.2
 */