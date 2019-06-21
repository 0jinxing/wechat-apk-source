package com.tencent.mm.ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

public final class as$c extends c
{
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33436);
    View localView;
    if (paramView != null)
    {
      localView = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localView = paramLayoutInflater.inflate(2130969115, null);
      localView.setTag(new as.d().fe(localView));
    }
    AppMethodBeat.o(33436);
    return localView;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33437);
    parama.enf.setVisibility(0);
    parama.enf.setText(h.q(parama1.yTx.getContext(), parambi.field_createTime));
    AppMethodBeat.o(33437);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1879048188);
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return false;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.as.c
 * JD-Core Version:    0.6.2
 */