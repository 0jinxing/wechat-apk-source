package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.m;

public final class l$b extends a.b
{
  public l$b(l paraml)
  {
    super(paraml);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62009);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130969625, paramViewGroup, false);
    paramContext = (l.a)this.mKX.mKW;
    paramContext.mKx = ((TextView)paramViewGroup.findViewById(2131824214));
    paramContext.mKk = paramViewGroup.findViewById(2131820896);
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(62009);
    return paramViewGroup;
  }

  public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62010);
    paramContext = (l.a)parama;
    m.a(this.mKX.mKU, paramContext.mKx);
    if (this.mKX.position == 0)
    {
      paramContext.mKk.setVisibility(8);
      AppMethodBeat.o(62010);
    }
    while (true)
    {
      return;
      paramContext.mKk.setVisibility(0);
      AppMethodBeat.o(62010);
    }
  }

  public final boolean a(Context paramContext, a parama)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.l.b
 * JD-Core Version:    0.6.2
 */