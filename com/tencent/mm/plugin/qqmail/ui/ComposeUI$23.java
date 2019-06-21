package com.tencent.mm.plugin.qqmail.ui;

import android.text.Editable;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ComposeUI$23
  implements View.OnFocusChangeListener
{
  ComposeUI$23(ComposeUI paramComposeUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(68206);
    if (paramBoolean)
      ComposeUI.j(this.pwY).setSelection(ComposeUI.j(this.pwY).getText().length());
    AppMethodBeat.o(68206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.23
 * JD-Core Version:    0.6.2
 */