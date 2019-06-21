package com.tencent.mm.ui.widget.listview;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AnimatedExpandableListView$a$1
  implements Animation.AnimationListener
{
  AnimatedExpandableListView$a$1(AnimatedExpandableListView.a parama, int paramInt, AnimatedExpandableListView.b paramb)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(112710);
    AnimatedExpandableListView.a.b(this.zQX, this.rtA);
    this.zQX.notifyDataSetChanged();
    this.zQW.setTag(Integer.valueOf(0));
    AppMethodBeat.o(112710);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.AnimatedExpandableListView.a.1
 * JD-Core Version:    0.6.2
 */