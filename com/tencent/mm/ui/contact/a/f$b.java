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
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public class f$b extends a.b
{
  public f$b(f paramf)
  {
    super(paramf);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(105285);
    if (com.tencent.mm.bz.a.ga(paramContext));
    for (paramContext = LayoutInflater.from(paramContext).inflate(2130970606, paramViewGroup, false); ; paramContext = LayoutInflater.from(paramContext).inflate(2130970605, paramViewGroup, false))
    {
      paramViewGroup = (f.a)this.zpY.zpX;
      paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
      paramViewGroup.ejp = ((TextView)paramContext.findViewById(2131821185));
      paramViewGroup.gnC = ((TextView)paramContext.findViewById(2131820991));
      paramViewGroup.gnC.setVisibility(8);
      paramViewGroup.gnD = ((CheckBox)paramContext.findViewById(2131821593));
      paramContext.setTag(paramViewGroup);
      AppMethodBeat.o(105285);
      return paramContext;
    }
  }

  public void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105286);
    parama1 = (f)parama1;
    parama = (f.a)parama;
    parama.ejp.setCompoundDrawables(null, null, null, null);
    if ((this.zpY.zpV != 0) && (this.zpY.zpU != null))
    {
      parama.ejo.setImageResource(this.zpY.zpV);
      parama.ejp.setText(this.zpY.zpU);
      AppMethodBeat.o(105286);
    }
    while (true)
    {
      return;
      m.a(parama1.gnx, parama.ejp);
      if (ad.aox(parama1.username))
      {
        g.RQ();
        ad localad = ((j)g.K(j.class)).XM().aoO(parama1.username);
        ((b)g.K(b.class)).a(paramContext, parama.ejp, parama1.gnx, localad.field_openImAppid, localad.field_descWordingId, (int)parama.ejp.getTextSize());
      }
      com.tencent.mm.pluginsdk.ui.a.b.b(parama.ejo, parama1.username);
      if (t.mP(parama1.username))
      {
        paramContext = paramContext.getResources().getDrawable(2131231778);
        paramContext.setBounds(0, 0, paramContext.getIntrinsicWidth(), paramContext.getIntrinsicHeight());
        parama.ejp.setCompoundDrawablesWithIntrinsicBounds(null, null, paramContext, null);
        label226: if (!this.zpY.zmW)
          break label307;
        if (!paramBoolean1)
          break label287;
        parama.gnD.setChecked(true);
        parama.gnD.setEnabled(false);
      }
      while (true)
      {
        parama.gnD.setVisibility(0);
        AppMethodBeat.o(105286);
        break;
        parama.ejp.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        break label226;
        label287: parama.gnD.setChecked(paramBoolean2);
        parama.gnD.setEnabled(true);
      }
      label307: parama.gnD.setVisibility(8);
      AppMethodBeat.o(105286);
    }
  }

  public final boolean aov()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.f.b
 * JD-Core Version:    0.6.2
 */