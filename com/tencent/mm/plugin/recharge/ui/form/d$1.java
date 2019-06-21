package com.tencent.mm.plugin.recharge.ui.form;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1
  implements View.OnClickListener
{
  d$1(d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44403);
    d.a(this.pIW).dismissDropDown();
    AppMethodBeat.o(44403);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.d.1
 * JD-Core Version:    0.6.2
 */