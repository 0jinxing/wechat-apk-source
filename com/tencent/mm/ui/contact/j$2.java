package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class j$2
  implements View.OnTouchListener
{
  j$2(j paramj)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(33710);
    if ((j.b(this.zmw) instanceof MMActivity))
      ((MMActivity)j.b(this.zmw)).aqX();
    AppMethodBeat.o(33710);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.j.2
 * JD-Core Version:    0.6.2
 */