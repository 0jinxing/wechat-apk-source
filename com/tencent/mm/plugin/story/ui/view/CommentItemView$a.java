package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import android.animation.TypeEvaluator;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CommentItemView$ArgbEvaluator;", "Landroid/animation/TypeEvaluator;", "", "()V", "evaluate", "fraction", "", "startValue", "endValue", "plugin-story_release"})
public final class CommentItemView$a
  implements TypeEvaluator<Object>
{
  public final Object evaluate(float paramFloat, Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(110342);
    j.p(paramObject1, "startValue");
    j.p(paramObject2, "endValue");
    int i = ((Integer)paramObject1).intValue();
    float f1 = (i >> 24 & 0xFF) / 255.0F;
    float f2 = (i >> 16 & 0xFF) / 255.0F;
    float f3 = (i >> 8 & 0xFF) / 255.0F;
    float f4 = (i & 0xFF) / 255.0F;
    i = ((Integer)paramObject2).intValue();
    float f5 = (i >> 24 & 0xFF) / 255.0F;
    float f6 = (i >> 16 & 0xFF) / 255.0F;
    float f7 = (i >> 8 & 0xFF) / 255.0F;
    float f8 = (i & 0xFF) / 255.0F;
    f2 = (float)Math.pow(f2, 2.2D);
    f3 = (float)Math.pow(f3, 2.2D);
    f4 = (float)Math.pow(f4, 2.2D);
    f6 = (float)Math.pow(f6, 2.2D);
    f7 = (float)Math.pow(f7, 2.2D);
    f8 = (float)Math.pow(f8, 2.2D);
    f2 = (float)Math.pow(f2 + (f6 - f2) * paramFloat, 0.4545454545454545D);
    f3 = (float)Math.pow(f3 + (f7 - f3) * paramFloat, 0.4545454545454545D);
    f4 = (float)Math.pow(f4 + (f8 - f4) * paramFloat, 0.4545454545454545D);
    i = Math.round((f1 + (f5 - f1) * paramFloat) * 255.0F);
    int j = Math.round(f2 * 255.0F);
    int k = Math.round(f3 * 255.0F);
    int m = Math.round(f4 * 255.0F);
    AppMethodBeat.o(110342);
    return Integer.valueOf(m | (i << 24 | j << 16 | k << 8));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CommentItemView.a
 * JD-Core Version:    0.6.2
 */