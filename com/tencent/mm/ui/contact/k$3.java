package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class k$3
  implements View.OnTouchListener
{
  k$3(k paramk)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(33714);
    if ((k.d(this.zmB) instanceof MMActivity))
      ((MMActivity)k.d(this.zmB)).aqX();
    AppMethodBeat.o(33714);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.k.3
 * JD-Core Version:    0.6.2
 */