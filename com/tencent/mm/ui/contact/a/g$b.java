package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.m;

public final class g$b extends a.b
{
  public g$b(g paramg)
  {
    super(paramg);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(105289);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130970607, paramViewGroup, false);
    paramContext = (g.a)this.zqb.zqa;
    paramContext.gnC = ((TextView)paramViewGroup.findViewById(2131820991));
    paramContext.pqm = paramViewGroup.findViewById(2131827337);
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(105289);
    return paramViewGroup;
  }

  public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105290);
    paramContext = (g.a)parama;
    m.a(g.a((g)parama1), paramContext.gnC);
    if (this.zqb.position == 0)
    {
      paramContext.pqm.setVisibility(8);
      AppMethodBeat.o(105290);
    }
    while (true)
    {
      return;
      paramContext.pqm.setVisibility(0);
      AppMethodBeat.o(105290);
    }
  }

  public final boolean aov()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.g.b
 * JD-Core Version:    0.6.2
 */