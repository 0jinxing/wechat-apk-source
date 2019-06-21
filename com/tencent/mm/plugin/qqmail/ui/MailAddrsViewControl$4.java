package com.tencent.mm.plugin.qqmail.ui;

import android.view.KeyEvent;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrsViewControl$4
  implements TextView.OnEditorActionListener
{
  MailAddrsViewControl$4(MailAddrsViewControl paramMailAddrsViewControl)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(68341);
    if (paramInt == 5)
    {
      paramTextView = this.pyG.pyz.getEditableText().toString();
      if ((paramTextView != null) && (paramTextView.length() > 0))
      {
        MailAddrsViewControl.a(this.pyG, paramTextView, false);
        this.pyG.cdj();
      }
    }
    AppMethodBeat.o(68341);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.4
 * JD-Core Version:    0.6.2
 */