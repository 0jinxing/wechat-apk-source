package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.m;

public final class i$b extends a.b
{
  public i$b(i parami)
  {
    super(parami);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(105296);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130970609, paramViewGroup, false);
    paramContext = (i.a)this.zqh.zqg;
    paramContext.mKx = ((TextView)paramViewGroup.findViewById(2131824214));
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(105296);
    return paramViewGroup;
  }

  public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105297);
    paramContext = (i.a)parama;
    m.a(i.a(this.zqh), paramContext.mKx);
    AppMethodBeat.o(105297);
  }

  public final boolean aov()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.i.b
 * JD-Core Version:    0.6.2
 */