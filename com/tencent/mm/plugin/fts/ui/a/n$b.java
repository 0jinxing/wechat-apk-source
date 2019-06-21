package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.m;

public final class n$b extends a.b
{
  public n$b(n paramn)
  {
    super(paramn);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62018);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969636, paramViewGroup, false);
    paramViewGroup = new n.a(this.mLg);
    paramViewGroup.mJS = ((TextView)paramContext.findViewById(2131821051));
    paramViewGroup.iqT = ((ImageView)paramContext.findViewById(2131821226));
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(62018);
    return paramContext;
  }

  public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62019);
    paramContext = (n.a)parama;
    parama = (n)parama1;
    m.p(paramContext.contentView, this.mLg.mFk);
    paramContext.mJS.setText(parama.mLd);
    paramContext.iqT.setImageResource(2131231340);
    AppMethodBeat.o(62019);
  }

  public final boolean a(Context paramContext, a parama)
  {
    AppMethodBeat.i(62020);
    parama = new Intent();
    parama.putExtra("detail_query", this.mLg.mDz.mDY);
    parama.putExtra("detail_type", this.mLg.mFl);
    parama.putExtra("Search_Scene", this.mLg.mFa);
    d.c(paramContext, ".ui.FTSDetailUI", parama);
    AppMethodBeat.o(62020);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.n.b
 * JD-Core Version:    0.6.2
 */