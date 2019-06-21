package com.tencent.mm.plugin.appbrand.widget.input.numberpad;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseNumberKeyboardView$1
  implements View.OnClickListener
{
  BaseNumberKeyboardView$1(BaseNumberKeyboardView paramBaseNumberKeyboardView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(123937);
    if (BaseNumberKeyboardView.a(this.jip) == null)
    {
      AppMethodBeat.o(123937);
      return;
    }
    if (paramView.getId() == this.jip.getId("tenpay_keyboard_x"))
    {
      switch (BaseNumberKeyboardView.b(this.jip))
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(123937);
        break;
        AppMethodBeat.o(123937);
        break;
        BaseNumberKeyboardView.a(this.jip).dispatchKeyEvent(new KeyEvent(0, 59));
        BaseNumberKeyboardView.a(this.jip).dispatchKeyEvent(new KeyEvent(0, 52));
        BaseNumberKeyboardView.a(this.jip).dispatchKeyEvent(new KeyEvent(1, 59));
        AppMethodBeat.o(123937);
        break;
        BaseNumberKeyboardView.a(this.jip).dispatchKeyEvent(new KeyEvent(0, 56));
      }
    }
    int i;
    if (paramView.getId() == this.jip.getId("tenpay_keyboard_1"))
      i = 8;
    while (true)
    {
      BaseNumberKeyboardView.a(this.jip).dispatchKeyEvent(new KeyEvent(0, i));
      BaseNumberKeyboardView.a(this.jip).dispatchKeyEvent(new KeyEvent(1, i));
      AppMethodBeat.o(123937);
      break;
      if (paramView.getId() == this.jip.getId("tenpay_keyboard_2"))
        i = 9;
      else if (paramView.getId() == this.jip.getId("tenpay_keyboard_3"))
        i = 10;
      else if (paramView.getId() == this.jip.getId("tenpay_keyboard_4"))
        i = 11;
      else if (paramView.getId() == this.jip.getId("tenpay_keyboard_5"))
        i = 12;
      else if (paramView.getId() == this.jip.getId("tenpay_keyboard_6"))
        i = 13;
      else if (paramView.getId() == this.jip.getId("tenpay_keyboard_7"))
        i = 14;
      else if (paramView.getId() == this.jip.getId("tenpay_keyboard_8"))
        i = 15;
      else if (paramView.getId() == this.jip.getId("tenpay_keyboard_9"))
        i = 16;
      else if (paramView.getId() == this.jip.getId("tenpay_keyboard_0"))
        i = 7;
      else if (paramView.getId() == this.jip.getId("tenpay_keyboard_d"))
        i = 67;
      else
        i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView.1
 * JD-Core Version:    0.6.2
 */