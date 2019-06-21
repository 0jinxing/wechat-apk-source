package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.fts.ui.m;

public final class a$b extends com.tencent.mm.ui.contact.a.a.b
{
  public a$b(a parama)
  {
    super(parama);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(105184);
    if (com.tencent.mm.bz.a.ga(paramContext));
    for (paramContext = LayoutInflater.from(paramContext).inflate(2130970606, paramViewGroup, false); ; paramContext = LayoutInflater.from(paramContext).inflate(2130970605, paramViewGroup, false))
    {
      paramViewGroup = (a.a)this.yDS.yDR;
      paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
      paramViewGroup.ejp = ((TextView)paramContext.findViewById(2131821185));
      paramViewGroup.gnC = ((TextView)paramContext.findViewById(2131820991));
      paramViewGroup.gnC.setVisibility(8);
      paramContext.setTag(paramViewGroup);
      AppMethodBeat.o(105184);
      return paramContext;
    }
  }

  public final void a(Context paramContext, com.tencent.mm.ui.contact.a.a.a parama, com.tencent.mm.ui.contact.a.a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105185);
    paramContext = (a)parama1;
    parama = (a.a)parama;
    m.a(paramContext.gnx, parama.ejp);
    o.ahp().a(paramContext.yDO, parama.ejo, a.aqU(paramContext.username));
    AppMethodBeat.o(105185);
  }

  public final boolean aov()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.a.b
 * JD-Core Version:    0.6.2
 */