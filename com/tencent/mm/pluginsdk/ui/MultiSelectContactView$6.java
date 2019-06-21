package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MultiSelectContactView$6
  implements Animation.AnimationListener
{
  MultiSelectContactView$6(MultiSelectContactView paramMultiSelectContactView, View paramView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(105163);
    this.val$view.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(105162);
        MultiSelectContactView.h(MultiSelectContactView.6.this.vii).removeView(MultiSelectContactView.6.this.val$view);
        MultiSelectContactView.i(MultiSelectContactView.6.this.vii);
        MultiSelectContactView.a(MultiSelectContactView.6.this.vii, MultiSelectContactView.h(MultiSelectContactView.6.this.vii).getChildCount());
        AppMethodBeat.o(105162);
      }
    });
    AppMethodBeat.o(105163);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MultiSelectContactView.6
 * JD-Core Version:    0.6.2
 */