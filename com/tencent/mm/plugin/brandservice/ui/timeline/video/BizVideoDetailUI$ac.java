package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import a.v;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.widget.MPSmileyFooter;
import com.tencent.mm.ui.MMActivity;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"})
final class BizVideoDetailUI$ac
  implements View.OnTouchListener
{
  BizVideoDetailUI$ac(BizVideoDetailUI paramBizVideoDetailUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(15173);
    j.o(paramMotionEvent, "event");
    if (paramMotionEvent.getAction() == 0)
    {
      paramView = BizVideoDetailUI.i(this.jWD);
      if (paramView.jYe != -3)
        break label78;
      paramView = paramView.getContext();
      if (paramView == null)
      {
        paramView = new v("null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        AppMethodBeat.o(15173);
        throw paramView;
      }
      ((MMActivity)paramView).aqX();
    }
    while (true)
    {
      AppMethodBeat.o(15173);
      return true;
      label78: if ((paramView.jXV.aYU()) && (paramView.aFF()))
        paramView.jXV.aYW();
      else
        paramView.hide();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI.ac
 * JD-Core Version:    0.6.2
 */