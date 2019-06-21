package com.tencent.mm.plugin.qqmail.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.o;
import java.util.LinkedList;

final class MailAddrsViewControl$5
  implements View.OnKeyListener
{
  MailAddrsViewControl$5(MailAddrsViewControl paramMailAddrsViewControl)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(68342);
    if ((paramInt == 67) && (paramKeyEvent.getAction() == 0))
    {
      paramView = this.pyG.pyz.getEditableText().toString();
      if ((paramView.length() == 0) && (MailAddrsViewControl.c(this.pyG) != null) && (MailAddrsViewControl.c(this.pyG).isSelected()))
      {
        this.pyG.f((o)MailAddrsViewControl.c(this.pyG).getTag());
        MailAddrsViewControl.a(this.pyG, null);
        this.pyG.cdj();
      }
    }
    while (true)
    {
      AppMethodBeat.o(68342);
      return false;
      if ((paramView.length() == 0) && (MailAddrsViewControl.f(this.pyG).size() > 0))
      {
        paramInt = MailAddrsViewControl.f(this.pyG).size() - 1;
        paramView = this.pyG.getChildAt(paramInt);
        if (!paramView.isSelected())
        {
          paramView.setSelected(true);
        }
        else
        {
          this.pyG.f((o)MailAddrsViewControl.f(this.pyG).get(paramInt));
          this.pyG.cdj();
          continue;
          if ((paramInt == 66) && (paramKeyEvent.getAction() == 0))
          {
            paramView = this.pyG.pyz.getEditableText().toString();
            if ((paramView != null) && (paramView.length() > 0))
            {
              MailAddrsViewControl.a(this.pyG, paramView, true);
              this.pyG.cdj();
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.5
 * JD-Core Version:    0.6.2
 */