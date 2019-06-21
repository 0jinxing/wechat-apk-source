package com.tencent.mm.plugin.label.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class InputClearablePreference$2
  implements View.OnClickListener
{
  InputClearablePreference$2(InputClearablePreference paramInputClearablePreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22704);
    if (InputClearablePreference.b(this.nJo) != null)
    {
      InputClearablePreference.b(this.nJo).setText("");
      InputClearablePreference.b(this.nJo, "");
    }
    AppMethodBeat.o(22704);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.widget.InputClearablePreference.2
 * JD-Core Version:    0.6.2
 */