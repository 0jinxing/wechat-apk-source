package com.tencent.mm.plugin.recharge.ui.form;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$3
  implements View.OnClickListener
{
  d$3(d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44405);
    d.a(this.pIW).dismissDropDown();
    d.b(this.pIW).cex();
    AppMethodBeat.o(44405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.d.3
 * JD-Core Version:    0.6.2
 */