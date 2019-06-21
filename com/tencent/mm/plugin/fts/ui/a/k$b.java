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

public final class k$b extends a.b
{
  public k$b(k paramk)
  {
    super(paramk);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62005);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130969624, paramViewGroup, false);
    paramContext = (k.a)this.mKT.bBi();
    paramContext.kxr = ((TextView)paramViewGroup.findViewById(2131822768));
    paramContext.mKk = paramViewGroup.findViewById(2131820896);
    paramContext.contentView = paramViewGroup.findViewById(2131821182);
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(62005);
    return paramViewGroup;
  }

  public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62006);
    paramContext = (k.a)parama;
    m.b(this.mKT.mKQ, paramContext.kxr);
    if (this.mKT.position == 0)
      paramContext.mKk.setVisibility(8);
    while (true)
    {
      m.q(paramContext.contentView, this.mKT.mFk);
      AppMethodBeat.o(62006);
      return;
      paramContext.mKk.setVisibility(0);
    }
  }

  public final boolean a(Context paramContext, a parama)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.k.b
 * JD-Core Version:    0.6.2
 */