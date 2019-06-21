package com.tencent.mm.plugin.multitalk.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.a.e.a;
import com.tencent.mm.ui.contact.a.e.b;

public final class a$a extends e.b
{
  public a$a(a parama)
  {
    super(parama);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(54182);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130970265, paramViewGroup, false);
    paramContext = (e.a)a.a(this.oHZ);
    paramContext.ejo = ((ImageView)paramViewGroup.findViewById(2131821183));
    paramContext.gnB = ((TextView)paramViewGroup.findViewById(2131821185));
    paramContext.gnC = ((TextView)paramViewGroup.findViewById(2131820991));
    paramContext.contentView = paramViewGroup.findViewById(2131826213);
    paramContext.gnD = ((CheckBox)paramViewGroup.findViewById(2131821593));
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(54182);
    return paramViewGroup;
  }

  public final void a(Context paramContext, com.tencent.mm.ui.contact.a.a.a parama, com.tencent.mm.ui.contact.a.a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(54183);
    paramContext = (e.a)parama;
    parama = (e)parama1;
    if ((parama.username != null) && (parama.username.length() > 0))
    {
      a.b.b(paramContext.ejo, parama.username);
      m.a(parama.gnx, paramContext.gnB);
      if (!this.oHZ.zmW)
        break label132;
      if (!paramBoolean1)
        break label112;
      paramContext.gnD.setChecked(true);
      paramContext.gnD.setEnabled(false);
      label86: paramContext.gnD.setVisibility(0);
      AppMethodBeat.o(54183);
    }
    while (true)
    {
      return;
      paramContext.ejo.setImageResource(2130838444);
      break;
      label112: paramContext.gnD.setChecked(paramBoolean2);
      paramContext.gnD.setEnabled(true);
      break label86;
      label132: paramContext.gnD.setVisibility(8);
      AppMethodBeat.o(54183);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.widget.a.a
 * JD-Core Version:    0.6.2
 */