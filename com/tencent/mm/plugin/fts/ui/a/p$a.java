package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.a.b;
import com.tencent.mm.plugin.fts.a.n;

public final class p$a extends m.b
{
  public p$a(p paramp)
  {
    super(paramp);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62026);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130969635, paramViewGroup, false);
    m.a locala = (m.a)this.mLk.mLb;
    locala.ejo = ((ImageView)paramViewGroup.findViewById(2131821183));
    locala.ejp = ((TextView)paramViewGroup.findViewById(2131823149));
    locala.ene = ((TextView)paramViewGroup.findViewById(2131822913));
    locala.contentView = paramViewGroup.findViewById(2131821182);
    locala.enf = ((TextView)paramViewGroup.findViewById(2131820988));
    locala.ejo.getLayoutParams().width = com.tencent.mm.bz.a.al(paramContext, 2131427848);
    locala.ejo.getLayoutParams().height = com.tencent.mm.bz.a.al(paramContext, 2131427848);
    paramViewGroup.setTag(locala);
    AppMethodBeat.o(62026);
    return paramViewGroup;
  }

  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(62027);
    boolean bool = ((n)g.M(n.class)).getItemClickHandler(this.mLk.klY).a(paramContext, parama);
    AppMethodBeat.o(62027);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.p.a
 * JD-Core Version:    0.6.2
 */