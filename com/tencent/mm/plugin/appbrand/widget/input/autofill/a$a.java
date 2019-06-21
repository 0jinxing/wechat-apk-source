package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.ab;
import com.tencent.mm.plugin.appbrand.widget.input.d.a.b;

final class a$a
  implements View.OnClickListener
{
  View apJ;
  View goc;
  a.b jhA;
  TextView jhx;
  TextView jhy;
  View jhz;

  a$a(a parama, View paramView)
  {
    AppMethodBeat.i(123873);
    this.apJ = paramView;
    this.jhx = ((TextView)paramView.findViewById(2131820678));
    this.jhy = ((TextView)paramView.findViewById(2131821019));
    this.jhz = paramView.findViewById(2131821217);
    this.goc = paramView.findViewById(2131821128);
    paramView.setBackgroundResource(2130839848);
    paramView.setOnClickListener(this);
    this.jhz.setOnClickListener(this);
    AppMethodBeat.o(123873);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(123874);
    if (this.jhA != null)
      if (paramView.getId() == 2131821217)
      {
        this.jhw.remove(this.jhA);
        if (a.a(this.jhw) == null)
          break label153;
        a.a(this.jhw).a(this.jhA.id, h.a.jig);
        AppMethodBeat.o(123874);
      }
    while (true)
    {
      return;
      if ((paramView == this.apJ) && (a.a(this.jhw) != null))
      {
        if (this.jhA != null)
          a.a(this.jhw).a(this.jhA.id, h.a.jih);
        a.c(this.jhw);
        if (a.d(this.jhw) != null)
          a.d(this.jhw).jhB.getView().clearFocus();
      }
      label153: AppMethodBeat.o(123874);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.a.a
 * JD-Core Version:    0.6.2
 */