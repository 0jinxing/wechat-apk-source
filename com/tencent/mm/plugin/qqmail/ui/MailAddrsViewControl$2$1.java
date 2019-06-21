package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrsViewControl$2$1
  implements View.OnTouchListener
{
  MailAddrsViewControl$2$1(MailAddrsViewControl.2 param2)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(68338);
    if ((MailAddrsViewControl.c(this.pyI.pyG) != null) && (MailAddrsViewControl.c(this.pyI.pyG) != paramView) && (MailAddrsViewControl.c(this.pyI.pyG).isSelected()))
    {
      MailAddrsViewControl.c(this.pyI.pyG).setSelected(false);
      MailAddrsViewControl.a(this.pyI.pyG, null);
    }
    MailAddrsViewControl.a(this.pyI.pyG, paramView);
    if ((this.pyI.pyG.pyz != null) && (paramMotionEvent.getAction() == 0))
    {
      paramView = this.pyI.pyH;
      if (this.pyI.pyH.isSelected())
        break label207;
    }
    label207: for (boolean bool = true; ; bool = false)
    {
      paramView.setSelected(bool);
      this.pyI.pyG.pyz.setVisibility(0);
      this.pyI.pyG.pyz.requestFocus();
      ((InputMethodManager)this.pyI.pyG.getContext().getSystemService("input_method")).toggleSoftInput(0, 1);
      bool = MailAddrsViewControl.d(this.pyI.pyG).onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(68338);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.2.1
 * JD-Core Version:    0.6.2
 */