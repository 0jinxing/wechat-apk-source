package com.tencent.mm.ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;

public final class as$b extends as.a
{
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33432);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969072);
      ((View)localObject).setTag(new as.d().fe((View)localObject));
    }
    AppMethodBeat.o(33432);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33433);
    parama = (as.d)parama;
    paramString = c(parama1);
    if (parama != null)
    {
      parama.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
      parama.jPL.setOnLongClickListener(paramString);
      parama.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
    }
    AppMethodBeat.o(33433);
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
    if (paramInt == -1879048187);
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.as.b
 * JD-Core Version:    0.6.2
 */