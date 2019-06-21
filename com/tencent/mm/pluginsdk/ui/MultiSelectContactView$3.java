package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MultiSelectContactView$3
  implements View.OnFocusChangeListener
{
  MultiSelectContactView$3(MultiSelectContactView paramMultiSelectContactView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(105160);
    if (paramBoolean)
    {
      MultiSelectContactView.e(this.vii).setBackgroundResource(2130839104);
      MultiSelectContactView.e(this.vii).setPadding(MultiSelectContactView.f(this.vii), MultiSelectContactView.f(this.vii), MultiSelectContactView.f(this.vii), MultiSelectContactView.f(this.vii));
    }
    while (true)
    {
      if (MultiSelectContactView.g(this.vii) != null)
        MultiSelectContactView.g(this.vii).dji();
      AppMethodBeat.o(105160);
      return;
      MultiSelectContactView.e(this.vii).setBackgroundResource(2130839105);
      MultiSelectContactView.e(this.vii).setPadding(MultiSelectContactView.f(this.vii), MultiSelectContactView.f(this.vii), MultiSelectContactView.f(this.vii), MultiSelectContactView.f(this.vii));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MultiSelectContactView.3
 * JD-Core Version:    0.6.2
 */