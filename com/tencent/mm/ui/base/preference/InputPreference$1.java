package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class InputPreference$1
  implements View.OnClickListener
{
  InputPreference$1(InputPreference paramInputPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(107195);
    if ((InputPreference.a(this.yCi) != null) && (InputPreference.b(this.yCi) != null))
      if (InputPreference.b(this.yCi).getText() == null)
      {
        InputPreference.a(this.yCi);
        AppMethodBeat.o(107195);
      }
    while (true)
    {
      return;
      InputPreference.a(this.yCi);
      InputPreference.b(this.yCi).getText();
      AppMethodBeat.o(107195);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.InputPreference.1
 * JD-Core Version:    0.6.2
 */