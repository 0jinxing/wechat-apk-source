package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallEditText$a$3
  implements View.OnClickListener
{
  MallEditText$a$3(MallEditText.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44213);
    MallEditText.a(this.pGH.pGB).dismissDropDown();
    AppMethodBeat.o(44213);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.MallEditText.a.3
 * JD-Core Version:    0.6.2
 */