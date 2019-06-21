package com.tencent.mm.plugin.label.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactLabelUI$6
  implements View.OnTouchListener
{
  ContactLabelUI$6(ContactLabelUI paramContactLabelUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(22663);
    if (paramMotionEvent.getAction() == 2)
      this.nIU.aqX();
    AppMethodBeat.o(22663);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelUI.6
 * JD-Core Version:    0.6.2
 */