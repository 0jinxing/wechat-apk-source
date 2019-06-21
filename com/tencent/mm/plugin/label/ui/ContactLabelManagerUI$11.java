package com.tencent.mm.plugin.label.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactLabelManagerUI$11
  implements View.OnTouchListener
{
  ContactLabelManagerUI$11(ContactLabelManagerUI paramContactLabelManagerUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(22596);
    if (paramMotionEvent.getAction() == 0)
    {
      ContactLabelManagerUI.a(this.nIh, (int)paramMotionEvent.getRawX());
      ContactLabelManagerUI.b(this.nIh, (int)paramMotionEvent.getRawY());
    }
    AppMethodBeat.o(22596);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.11
 * JD-Core Version:    0.6.2
 */