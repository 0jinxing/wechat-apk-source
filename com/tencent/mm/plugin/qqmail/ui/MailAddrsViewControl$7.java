package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrsViewControl$7
  implements View.OnFocusChangeListener
{
  MailAddrsViewControl$7(MailAddrsViewControl paramMailAddrsViewControl)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(68344);
    if (MailAddrsViewControl.g(this.pyG) != null)
      MailAddrsViewControl.g(this.pyG).jW(paramBoolean);
    paramView = this.pyG.pyz.getEditableText().toString();
    if ((!paramBoolean) && (paramView.trim().length() > 0))
      MailAddrsViewControl.a(this.pyG, paramView, false);
    if ((MailAddrsViewControl.c(this.pyG) != null) && (MailAddrsViewControl.c(this.pyG).isSelected()))
    {
      MailAddrsViewControl.c(this.pyG).setSelected(paramBoolean);
      MailAddrsViewControl.a(this.pyG, null);
    }
    this.pyG.cdj();
    AppMethodBeat.o(68344);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.7
 * JD-Core Version:    0.6.2
 */