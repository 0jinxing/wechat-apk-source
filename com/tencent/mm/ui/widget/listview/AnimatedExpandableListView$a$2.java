package com.tencent.mm.ui.widget.listview;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ExpandableListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AnimatedExpandableListView$a$2
  implements Animation.AnimationListener
{
  AnimatedExpandableListView$a$2(AnimatedExpandableListView.a parama, int paramInt, ExpandableListView paramExpandableListView, AnimatedExpandableListView.d paramd, AnimatedExpandableListView.b paramb)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(112711);
    AnimatedExpandableListView.a.b(this.zQX, this.rtA);
    this.zQY.collapseGroup(this.rtA);
    this.zQX.notifyDataSetChanged();
    this.zQZ.zRh = -1;
    this.zQW.setTag(Integer.valueOf(0));
    AppMethodBeat.o(112711);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.AnimatedExpandableListView.a.2
 * JD-Core Version:    0.6.2
 */