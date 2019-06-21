package com.tencent.mm.plugin.forcenotify.ui;

import a.f.b.j;
import a.l;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onTouch"})
final class ForceNotifyListUI$b$1
  implements View.OnTouchListener
{
  ForceNotifyListUI$b$1(ForceNotifyListUI.b paramb)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(51067);
    j.p(paramView, "view");
    j.p(paramMotionEvent, "event");
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(51067);
      return false;
      ForceNotifyListUI.e(this.mtr.mtn)[0] = ((int)paramMotionEvent.getRawX());
      ForceNotifyListUI.e(this.mtr.mtn)[1] = ((int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI.b.1
 * JD-Core Version:    0.6.2
 */