package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class OpenIMAddressUI$OpenIMAddressUIFragment$17
  implements View.OnTouchListener
{
  OpenIMAddressUI$OpenIMAddressUIFragment$17(OpenIMAddressUI.OpenIMAddressUIFragment paramOpenIMAddressUIFragment)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(33782);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(33782);
      return false;
      this.zoc.hideVKB();
      OpenIMAddressUI.OpenIMAddressUIFragment.a(this.zoc, (int)paramMotionEvent.getRawX());
      OpenIMAddressUI.OpenIMAddressUIFragment.b(this.zoc, (int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment.17
 * JD-Core Version:    0.6.2
 */