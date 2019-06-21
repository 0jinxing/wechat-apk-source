package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gif.MMAnimateView;

public class BannerEmojiView extends MMAnimateView
{
  public BannerEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public BannerEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62469);
    paramInt1 = getRight() - getLeft() - getPaddingRight() - getPaddingLeft();
    paramInt2 = paramInt1 / 2;
    if ((paramInt1 == 0) || (paramInt2 == 0))
      paramInt1 = getContext().getResources().getDisplayMetrics().widthPixels;
    float f1 = 0.5333334F;
    Drawable localDrawable = getDrawable();
    float f2 = f1;
    if (localDrawable != null)
    {
      f2 = f1;
      if (localDrawable.getIntrinsicHeight() > 0)
      {
        f2 = f1;
        if (localDrawable.getIntrinsicWidth() > 0)
          f2 = 1.0F * localDrawable.getIntrinsicHeight() / localDrawable.getIntrinsicWidth();
      }
    }
    setMeasuredDimension(paramInt1, (int)(f2 * paramInt1));
    AppMethodBeat.o(62469);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.emoji.BannerEmojiView
 * JD-Core Version:    0.6.2
 */