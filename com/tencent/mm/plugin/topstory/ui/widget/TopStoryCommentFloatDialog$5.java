package com.tencent.mm.plugin.topstory.ui.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryCommentFloatDialog$5 extends Animation
{
  TopStoryCommentFloatDialog$5(TopStoryCommentFloatDialog paramTopStoryCommentFloatDialog, int paramInt)
  {
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    AppMethodBeat.i(2247);
    paramTransformation = (RelativeLayout.LayoutParams)this.sIq.sIk.getLayoutParams();
    paramTransformation.bottomMargin = ((int)(this.jfw * paramFloat));
    this.sIq.sIk.setLayoutParams(paramTransformation);
    AppMethodBeat.o(2247);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog.5
 * JD-Core Version:    0.6.2
 */