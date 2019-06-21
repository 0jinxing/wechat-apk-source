package com.tencent.mm.plugin.sight.encode.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.contact.a.a.a;
import com.tencent.mm.ui.contact.a.e.b;

public final class c$a$b extends e.b
{
  public c$a$b(c.a parama)
  {
    super(parama);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(25060);
    paramContext = LayoutInflater.from(paramContext).inflate(2130970695, paramViewGroup, false);
    paramViewGroup = (c.a.a)this.qAU.clJ();
    paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
    paramViewGroup.gnB = ((TextView)paramContext.findViewById(2131821185));
    paramViewGroup.gnC = ((TextView)paramContext.findViewById(2131820991));
    paramViewGroup.contentView = paramContext.findViewById(2131826213);
    paramViewGroup.gnD = ((CheckBox)paramContext.findViewById(2131821593));
    paramViewGroup.qzN = paramContext.findViewById(2131827574);
    paramViewGroup.qAT = paramContext.findViewById(2131823137);
    paramContext.setTag(paramViewGroup);
    paramViewGroup.gnB.setTextColor(-1);
    paramViewGroup = (AbsListView.LayoutParams)paramContext.getLayoutParams();
    paramViewGroup.width = -1;
    paramContext.setLayoutParams(paramViewGroup);
    paramContext.setBackgroundResource(2131689761);
    AppMethodBeat.o(25060);
    return paramContext;
  }

  public final void a(Context paramContext, a.a parama, com.tencent.mm.ui.contact.a.a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(25061);
    ad localad = parama1.ehM;
    c.a.a locala = (c.a.a)parama;
    locala.contentView.setVisibility(0);
    locala.qAT.setVisibility(8);
    locala.qzN.setVisibility(8);
    if (c.WV(localad.field_username))
    {
      locala.ejo.setImageResource(2131231929);
      locala.gnB.setText(2131303544);
      locala.gnC.setText(2131303542);
      locala.gnC.setVisibility(0);
      locala.gnD.setEnabled(false);
      if (c.qAR)
      {
        locala.contentView.setBackgroundResource(2130840206);
        locala.gnD.setVisibility(0);
        locala.gnD.setBackgroundResource(2131231937);
        locala.qzN.setVisibility(0);
      }
      while (true)
      {
        c.e(paramContext, locala.contentView);
        parama = locala.ejo.getLayoutParams();
        parama.width = com.tencent.mm.bz.a.al(paramContext, 2131428635);
        parama.height = com.tencent.mm.bz.a.al(paramContext, 2131428635);
        locala.ejo.setLayoutParams(parama);
        parama = (LinearLayout.LayoutParams)locala.gnD.getLayoutParams();
        parama.height = com.tencent.mm.bz.a.al(paramContext, 2131428641);
        parama.width = com.tencent.mm.bz.a.al(paramContext, 2131428641);
        parama.setMargins(parama.leftMargin, parama.topMargin, 0, parama.bottomMargin);
        locala.gnD.setLayoutParams(parama);
        AppMethodBeat.o(25061);
        return;
        locala.contentView.setBackgroundResource(2130840210);
        locala.gnD.setVisibility(8);
        locala.gnD.setBackgroundResource(2131231939);
        locala.qzN.setVisibility(8);
      }
    }
    if (c.WT(localad.field_username))
    {
      locala.ejo.setImageResource(2131231936);
      locala.gnD.setVisibility(8);
      locala.gnB.setText(paramContext.getString(2131303554));
      locala.gnC.setVisibility(8);
      if (c.qAQ)
      {
        locala.contentView.setBackgroundResource(2130840210);
        locala.qzN.setVisibility(8);
        label386: c.e(paramContext, locala.contentView);
      }
    }
    while (true)
    {
      parama = locala.ejo.getLayoutParams();
      parama.width = com.tencent.mm.bz.a.al(paramContext, 2131428635);
      parama.height = com.tencent.mm.bz.a.al(paramContext, 2131428635);
      locala.ejo.setLayoutParams(parama);
      parama = (LinearLayout.LayoutParams)locala.gnD.getLayoutParams();
      parama.height = com.tencent.mm.bz.a.al(paramContext, 2131428641);
      parama.width = com.tencent.mm.bz.a.al(paramContext, 2131428641);
      parama.setMargins(parama.leftMargin, parama.topMargin, 0, parama.bottomMargin);
      locala.gnD.setLayoutParams(parama);
      locala.gnD.setBackgroundResource(2130840205);
      AppMethodBeat.o(25061);
      break;
      locala.contentView.setBackgroundResource(2130840206);
      locala.qzN.setVisibility(0);
      break label386;
      if (c.WU(localad.field_username))
      {
        locala.contentView.setVisibility(8);
        locala.qAT.setVisibility(0);
        AppMethodBeat.o(25061);
        break;
      }
      super.a(paramContext, parama, parama1, paramBoolean1, paramBoolean2);
      locala.contentView.setBackgroundResource(2130840210);
      c.e(paramContext, locala.contentView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.c.a.b
 * JD-Core Version:    0.6.2
 */