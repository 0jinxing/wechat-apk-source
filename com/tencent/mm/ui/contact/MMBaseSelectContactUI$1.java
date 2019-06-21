package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMBaseSelectContactUI$1
  implements View.OnTouchListener
{
  MMBaseSelectContactUI$1(MMBaseSelectContactUI paramMMBaseSelectContactUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105214);
    MMBaseSelectContactUI.a(this.znk);
    this.znk.dIb();
    this.znk.dIc();
    AppMethodBeat.o(105214);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.MMBaseSelectContactUI.1
 * JD-Core Version:    0.6.2
 */