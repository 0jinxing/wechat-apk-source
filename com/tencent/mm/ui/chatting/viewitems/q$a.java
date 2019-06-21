package com.tencent.mm.ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;

public final class q$a extends c
{
  private a yJI;
  private q.c zeg;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33009);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969074);
      ((View)localObject).setTag(new q.d().fb((View)localObject));
    }
    AppMethodBeat.o(33009);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33010);
    this.yJI = parama1;
    parama = (q.d)parama;
    if (this.zeg == null)
      this.zeg = new q.c(this.yJI, this);
    q.d.a(parama, paramInt, parama1, parambi, false, this.zeg, c(parama1));
    AppMethodBeat.o(33010);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33011);
    boolean bool = q.a(this.yJI, paramContextMenu, paramView, parambi);
    AppMethodBeat.o(33011);
    return bool;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33012);
    if (paramMenuItem.getItemId() == 111)
    {
      paramMenuItem = j.b.me(bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend));
      if (paramMenuItem != null)
        h.pYm.e(16979, new Object[] { paramMenuItem.fiQ, paramMenuItem.fiO, Integer.valueOf(0), Integer.valueOf(2) });
      d.b.a(parama, parambi, b(parama, parambi));
    }
    AppMethodBeat.o(33012);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 687865905));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return true;
  }

  final boolean dHk()
  {
    return false;
  }

  final boolean dHl()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.q.a
 * JD-Core Version:    0.6.2
 */