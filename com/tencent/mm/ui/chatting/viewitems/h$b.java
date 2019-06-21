package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.widget.MMTextView;
import java.net.URLDecoder;

public final class h$b extends c
{
  private a yJI;

  private static String arD(String paramString)
  {
    AppMethodBeat.i(32905);
    try
    {
      paramString = j.b.me(paramString);
      if (paramString != null)
      {
        paramString = URLDecoder.decode(paramString.content, "UTF-8");
        AppMethodBeat.o(32905);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.ChattingItemTextFrom", "getMsgContent error: %s", new Object[] { paramString.getMessage() });
        paramString = "";
        AppMethodBeat.o(32905);
      }
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32903);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969069);
      ((View)localObject).setTag(new h.a().z((View)localObject, true));
    }
    AppMethodBeat.o(32903);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32906);
    this.yJI = parama1;
    h.a locala = (h.a)parama;
    paramString = parambi.field_content;
    parama = parama1.getTalkerUserName();
    Object localObject = (d)parama1.aF(d.class);
    int i;
    if ((parama1.dFx()) && (!((d)localObject).dDm()))
    {
      i = bf.ox(paramString);
      if (i != -1)
      {
        localObject = paramString.substring(0, i).trim();
        if ((localObject != null) && (((String)localObject).length() > 0))
        {
          parama = (c.a)localObject;
          paramString = paramString.substring(i + 1).trim();
        }
      }
    }
    while (true)
    {
      paramString = arD(paramString);
      a(locala, parama1, parambi, parama);
      a(locala, parama1, parama, parambi);
      locala.zdy.setText(paramString);
      paramString = locala.zdy;
      i = parambi.getType();
      parama = parama1.getTalkerUserName();
      if (i != 301989937)
        j.a(paramString, parama);
      paramString.getText();
      parama = ay.b(parambi, parama1.dFx(), paramInt);
      locala.zdy.setTag(parama);
      locala.zdy.setOnLongClickListener(c(parama1));
      locala.zdy.setOnDoubleClickLitsener(((h)parama1.aF(h.class)).dCY());
      AppMethodBeat.o(32906);
      return;
      break;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32907);
    paramContextMenu.add(((ay)paramView.getTag()).position, 100, 0, paramView.getContext().getString(2131298154));
    AppMethodBeat.o(32907);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 503316529));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    return false;
  }

  protected final boolean b(a parama)
  {
    AppMethodBeat.i(32904);
    boolean bool = parama.dFx();
    AppMethodBeat.o(32904);
    return bool;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.h.b
 * JD-Core Version:    0.6.2
 */