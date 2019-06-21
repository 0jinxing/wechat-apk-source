package com.tencent.mm.ui.widget.listview;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AnimatedExpandableListView$c extends Animation
{
  private View view;
  private int zRc;
  private int zRd;
  private AnimatedExpandableListView.d zRe;

  private AnimatedExpandableListView$c(View paramView, int paramInt1, int paramInt2, AnimatedExpandableListView.d paramd)
  {
    AppMethodBeat.i(112717);
    this.zRc = paramInt1;
    this.zRd = (paramInt2 - paramInt1);
    this.view = paramView;
    this.zRe = paramd;
    this.view.getLayoutParams().height = paramInt1;
    this.view.requestLayout();
    AppMethodBeat.o(112717);
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    AppMethodBeat.i(112718);
    super.applyTransformation(paramFloat, paramTransformation);
    int i;
    if (paramFloat < 1.0F)
    {
      i = this.zRc + (int)(this.zRd * paramFloat);
      this.view.getLayoutParams().height = i;
      this.zRe.zRh = i;
      this.view.requestLayout();
      AppMethodBeat.o(112718);
    }
    while (true)
    {
      return;
      i = this.zRc + this.zRd;
      this.view.getLayoutParams().height = i;
      this.zRe.zRh = i;
      this.view.requestLayout();
      AppMethodBeat.o(112718);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.AnimatedExpandableListView.c
 * JD-Core Version:    0.6.2
 */