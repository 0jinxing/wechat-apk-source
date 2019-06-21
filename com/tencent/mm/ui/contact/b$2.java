package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class b$2
  implements View.OnTouchListener
{
  b$2(b paramb)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(33532);
    if ((b.a(this.zkB) instanceof MMActivity))
      ((MMActivity)b.a(this.zkB)).aqX();
    AppMethodBeat.o(33532);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.b.2
 * JD-Core Version:    0.6.2
 */