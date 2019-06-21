package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;

public final class ac extends c
{
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33225);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969078);
      ((View)localObject).setTag(new ac.a(this).fh((View)localObject));
    }
    AppMethodBeat.o(33225);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33226);
    ac.a locala = (ac.a)parama;
    j localj = am.dhN().ma(parambi.field_msgId);
    String str = parambi.field_content;
    if ((localj != null) && (str != null))
    {
      paramString = j.b.X(str, parambi.field_reserved);
      parambi = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
      if ((paramString != null) && ((paramString.showType == 3) || (paramString.fhn == 3)))
      {
        locala.gvq.setImageResource(2130839019);
        locala.zfU.setText(paramString.fhs);
      }
      parama.jPL.setOnLongClickListener(c(parama1));
      parama.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
      parama.jPL.setTag(parambi);
      AppMethodBeat.o(33226);
      return;
    }
    if (localj == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.e("MicroMsg.ChattingItemHardDeviceMsgPush", "amessage:%b, %s, %d, %s", new Object[] { Boolean.valueOf(bool), str, Long.valueOf(parambi.field_msgId), paramString });
      paramString = null;
      break;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33227);
    paramContextMenu.add(((ay)paramView.getTag()).position, 100, 0, paramView.getContext().getString(2131298154));
    AppMethodBeat.o(33227);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33228);
    paramMenuItem.getItemId();
    AppMethodBeat.o(33228);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1879048176);
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return false;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ac
 * JD-Core Version:    0.6.2
 */