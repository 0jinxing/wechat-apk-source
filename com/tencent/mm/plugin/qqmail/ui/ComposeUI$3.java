package com.tencent.mm.plugin.qqmail.ui;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ComposeUI$3
  implements View.OnClickListener
{
  ComposeUI$3(ComposeUI paramComposeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68169);
    ComposeUI.j(this.pwY).getText().clear();
    ComposeUI.j(this.pwY).requestFocus();
    AppMethodBeat.o(68169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.3
 * JD-Core Version:    0.6.2
 */