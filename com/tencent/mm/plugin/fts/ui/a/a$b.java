package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.m;

public final class a$b extends com.tencent.mm.plugin.fts.a.d.a.a.b
{
  public a$b(a parama)
  {
    super(parama);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(61968);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969638, paramViewGroup, false);
    paramViewGroup = new a.a(this.mJT);
    paramViewGroup.iqT = ((ImageView)paramContext.findViewById(2131821226));
    paramViewGroup.mJS = ((TextView)paramContext.findViewById(2131821051));
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(61968);
    return paramContext;
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a.a parama, com.tencent.mm.plugin.fts.a.d.a.a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61969);
    paramContext = (a.a)parama;
    m.p(paramContext.contentView, this.mJT.mFk);
    m.a(this.mJT.mJP, paramContext.mJS);
    paramContext.iqT.setImageResource(2131231888);
    AppMethodBeat.o(61969);
  }

  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.a.b
 * JD-Core Version:    0.6.2
 */