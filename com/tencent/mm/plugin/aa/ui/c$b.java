package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.contact.a.a.a;

public final class c$b extends com.tencent.mm.ui.contact.a.a.b
{
  public c$b(c paramc)
  {
    super(paramc);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(40743);
    if (com.tencent.mm.bz.a.ga(paramContext));
    for (paramViewGroup = LayoutInflater.from(paramContext).inflate(2130970606, paramViewGroup, false); ; paramViewGroup = LayoutInflater.from(paramContext).inflate(2130970605, paramViewGroup, false))
    {
      c.a locala = (c.a)this.gnE.gnA;
      locala.ejo = ((ImageView)paramViewGroup.findViewById(2131821183));
      locala.gnB = ((TextView)paramViewGroup.findViewById(2131821185));
      locala.gnC = ((TextView)paramViewGroup.findViewById(2131820991));
      locala.contentView = paramViewGroup.findViewById(2131826213);
      locala.gnD = ((CheckBox)paramViewGroup.findViewById(2131821593));
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)locala.gnD.getLayoutParams();
      localLayoutParams.leftMargin = paramContext.getResources().getDimensionPixelSize(2131427918);
      localLayoutParams.rightMargin = paramContext.getResources().getDimensionPixelSize(2131427919);
      locala.gnD.setLayoutParams(localLayoutParams);
      paramViewGroup.setTag(locala);
      AppMethodBeat.o(40743);
      return paramViewGroup;
    }
  }

  public final void a(Context paramContext, a.a parama, com.tencent.mm.ui.contact.a.a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(40744);
    parama = (c.a)parama;
    parama1 = (c)parama1;
    if ((parama1.username != null) && (parama1.username.length() > 0))
    {
      com.tencent.mm.pluginsdk.ui.a.b.a(parama.ejo, parama1.username, 0.1F, false);
      if (bo.ac(parama1.gnx))
        break label212;
      parama.gnB.setText(parama1.gnx);
      parama.gnB.setVisibility(0);
      label75: if (bo.ac(parama1.gny))
        break label224;
      parama.gnC.setText(parama1.gny);
      parama.gnC.setVisibility(0);
      label104: if (!this.gnE.zmW)
        break label256;
      if (!paramBoolean1)
        break label236;
      parama.gnD.setChecked(true);
      parama.gnD.setEnabled(false);
      label135: parama.gnD.setVisibility(0);
      label143: if (!this.gnE.jLx)
        break label268;
      parama.contentView.setBackgroundResource(2130838398);
    }
    while (true)
    {
      if (parama1.ehM.field_deleteFlag == 1)
      {
        parama.gnC.setVisibility(0);
        parama.gnC.setText(paramContext.getString(2131296330));
      }
      AppMethodBeat.o(40744);
      return;
      parama.ejo.setImageResource(2130838444);
      break;
      label212: parama.gnB.setVisibility(8);
      break label75;
      label224: parama.gnC.setVisibility(8);
      break label104;
      label236: parama.gnD.setChecked(paramBoolean2);
      parama.gnD.setEnabled(true);
      break label135;
      label256: parama.gnD.setVisibility(8);
      break label143;
      label268: parama.contentView.setBackgroundResource(2130838396);
    }
  }

  public final boolean aov()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.c.b
 * JD-Core Version:    0.6.2
 */