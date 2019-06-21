package com.tencent.mm.ui.base.preference;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class InputPreference$2
  implements TextView.OnEditorActionListener
{
  InputPreference$2(InputPreference paramInputPreference)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(107196);
    boolean bool;
    if ((3 == paramInt) && (InputPreference.a(this.yCi) != null) && (InputPreference.b(this.yCi) != null))
      if (InputPreference.b(this.yCi).getText() == null)
      {
        InputPreference.a(this.yCi);
        bool = true;
        AppMethodBeat.o(107196);
      }
    while (true)
    {
      return bool;
      InputPreference.a(this.yCi);
      InputPreference.b(this.yCi).getText();
      break;
      bool = false;
      AppMethodBeat.o(107196);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.InputPreference.2
 * JD-Core Version:    0.6.2
 */