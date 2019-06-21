package com.tencent.mm.plugin.card.ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.f;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb, f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88731);
    if (((CheckBox)paramView).isChecked())
    {
      this.kqv.baz().kcj = true;
      AppMethodBeat.o(88731);
    }
    while (true)
    {
      return;
      this.kqv.baz().kcj = false;
      AppMethodBeat.o(88731);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.b.1
 * JD-Core Version:    0.6.2
 */