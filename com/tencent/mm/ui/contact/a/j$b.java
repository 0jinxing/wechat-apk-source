package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.m;

public final class j$b extends a.b
{
  public j$b(j paramj)
  {
    super(paramj);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(105300);
    paramContext = LayoutInflater.from(paramContext).inflate(2130970610, paramViewGroup, false);
    paramViewGroup = (j.a)this.zqj.zqg;
    paramViewGroup.mKb = ((TextView)paramContext.findViewById(2131824209));
    paramViewGroup.mKc = ((ImageView)paramContext.findViewById(2131824210));
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(105300);
    return paramContext;
  }

  public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105301);
    parama = (j.a)parama;
    parama1 = (j)parama1;
    paramContext = paramContext.getResources();
    if (this.zqj.mJY)
    {
      m.b(paramContext.getString(2131302853, new Object[] { paramContext.getString(parama1.resId) }), parama.mKb);
      parama.mKc.setRotation(0.0F);
      AppMethodBeat.o(105301);
    }
    while (true)
    {
      return;
      m.b(paramContext.getString(2131302854), parama.mKb);
      parama.mKc.setRotation(180.0F);
      AppMethodBeat.o(105301);
    }
  }

  public final boolean aov()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.j.b
 * JD-Core Version:    0.6.2
 */