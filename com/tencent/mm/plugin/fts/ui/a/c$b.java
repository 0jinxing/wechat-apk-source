package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.m;

public final class c$b extends a.b
{
  public c$b(c paramc)
  {
    super(paramc);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(61972);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130969612, paramViewGroup, false);
    paramContext = (c.a)this.mKd.mKa;
    paramContext.mKb = ((TextView)paramViewGroup.findViewById(2131824209));
    paramContext.mKc = ((ImageView)paramViewGroup.findViewById(2131824210));
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(61972);
    return paramViewGroup;
  }

  public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61973);
    parama = (c.a)parama;
    parama1 = (c)parama1;
    paramContext = paramContext.getResources();
    if (this.mKd.mJY)
    {
      m.b(paramContext.getString(2131302853, new Object[] { paramContext.getString(parama1.resId) }), parama.mKb);
      parama.mKc.setRotation(0.0F);
      AppMethodBeat.o(61973);
    }
    while (true)
    {
      return;
      m.b(paramContext.getString(2131302854), parama.mKb);
      parama.mKc.setRotation(180.0F);
      AppMethodBeat.o(61973);
    }
  }

  public final boolean a(Context paramContext, a parama)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.c.b
 * JD-Core Version:    0.6.2
 */