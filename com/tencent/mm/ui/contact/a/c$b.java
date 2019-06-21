package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.m;

public final class c$b extends a.b
{
  public c$b(c paramc)
  {
    super(paramc);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(105270);
    if (com.tencent.mm.bz.a.ga(paramContext));
    for (paramViewGroup = LayoutInflater.from(paramContext).inflate(2130970606, paramViewGroup, false); ; paramViewGroup = LayoutInflater.from(paramContext).inflate(2130970605, paramViewGroup, false))
    {
      c.a locala = (c.a)this.zpJ.zpI;
      locala.ejo = ((ImageView)paramViewGroup.findViewById(2131821183));
      locala.gnB = ((TextView)paramViewGroup.findViewById(2131821185));
      locala.gnB.setMaxWidth(com.tencent.mm.bz.a.fromDPToPix(paramContext, 200));
      locala.gnC = ((TextView)paramViewGroup.findViewById(2131820991));
      locala.mJS = ((TextView)paramViewGroup.findViewById(2131821051));
      locala.contentView = paramViewGroup.findViewById(2131826213);
      locala.gnD = ((CheckBox)paramViewGroup.findViewById(2131821593));
      if (this.zpJ.jLx)
        locala.contentView.setBackgroundResource(2130838398);
      paramViewGroup.setTag(locala);
      AppMethodBeat.o(105270);
      return paramViewGroup;
    }
  }

  public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105271);
    parama = (c.a)parama;
    parama1 = (c)parama1;
    if ((parama1.username != null) && (parama1.username.length() > 0))
    {
      com.tencent.mm.pluginsdk.ui.a.b.a(parama.ejo, parama1.username, 0.1F, false);
      m.a(parama1.gnx, parama.gnB);
      if (!t.mP(parama1.username))
        break label184;
      paramContext = paramContext.getResources().getDrawable(2131231778);
      paramContext.setBounds(0, 0, paramContext.getIntrinsicWidth(), paramContext.getIntrinsicHeight());
      parama.gnB.setCompoundDrawablesWithIntrinsicBounds(null, null, paramContext, null);
      label103: m.a(parama1.gny, parama.gnC);
      m.a(parama1.zpG, parama.mJS);
      if (!this.zpJ.zmW)
        break label218;
      if (!paramBoolean1)
        break label198;
      parama.gnD.setChecked(true);
      parama.gnD.setEnabled(false);
      label158: parama.gnD.setVisibility(0);
      AppMethodBeat.o(105271);
    }
    while (true)
    {
      return;
      parama.ejo.setImageResource(2130838444);
      break;
      label184: parama.gnB.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      break label103;
      label198: parama.gnD.setChecked(paramBoolean2);
      parama.gnD.setEnabled(true);
      break label158;
      label218: parama.gnD.setVisibility(8);
      AppMethodBeat.o(105271);
    }
  }

  public final boolean aov()
  {
    AppMethodBeat.i(105272);
    if (this.zpJ.hpS != null)
      ((n)g.M(n.class)).updateTopHitsRank(this.zpJ.query, this.zpJ.hpS, 1);
    AppMethodBeat.o(105272);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.c.b
 * JD-Core Version:    0.6.2
 */