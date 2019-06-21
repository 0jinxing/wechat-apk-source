package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class BizContactEntranceView$2
  implements View.OnTouchListener
{
  BizContactEntranceView$2(BizContactEntranceView paramBizContactEntranceView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(33540);
    if ((BizContactEntranceView.a(this.zlg) instanceof MMActivity))
      ((MMActivity)BizContactEntranceView.a(this.zlg)).aqX();
    AppMethodBeat.o(33540);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.BizContactEntranceView.2
 * JD-Core Version:    0.6.2
 */