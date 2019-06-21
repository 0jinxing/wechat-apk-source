package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;

final class d$a extends f.b
{
  d$a(d paramd)
  {
    super(paramd);
  }

  public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105276);
    super.a(paramContext, parama, parama1, paramBoolean1, paramBoolean2);
    parama = (f.a)parama;
    int i;
    if (!bo.ac(this.zpN.zpK))
    {
      parama.gnC.setVisibility(0);
      this.zpN.zpK = j.b(paramContext, this.zpN.zpK, com.tencent.mm.bz.a.al(paramContext, 2131427813));
      paramContext = parama.gnC;
      parama = parama.gnC.getContext().getResources();
      if (this.zpN.zpL)
      {
        i = 2131298497;
        paramContext.setText(parama.getString(i, new Object[] { this.zpN.zpK }));
        AppMethodBeat.o(105276);
      }
    }
    while (true)
    {
      return;
      i = 2131298496;
      break;
      parama.gnC.setVisibility(8);
      AppMethodBeat.o(105276);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.d.a
 * JD-Core Version:    0.6.2
 */