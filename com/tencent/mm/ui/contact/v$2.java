package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class v$2
  implements View.OnTouchListener
{
  v$2(v paramv)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(33812);
    if ((v.b(this.zoj) instanceof MMActivity))
      ((MMActivity)v.b(this.zoj)).aqX();
    AppMethodBeat.o(33812);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.v.2
 * JD-Core Version:    0.6.2
 */