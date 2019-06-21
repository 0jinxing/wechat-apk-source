package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gif.MMAnimateView;

public class EmojiStoreV2RewardBannerView extends MMAnimateView
{
  private float mScale = 0.75F;

  public EmojiStoreV2RewardBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public EmojiStoreV2RewardBannerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(53668);
    paramInt1 = getRight() - getLeft() - getPaddingRight() - getPaddingLeft();
    int i = (int)(paramInt1 * this.mScale);
    if (paramInt1 != 0)
    {
      paramInt2 = i;
      if (i != 0);
    }
    else
    {
      paramInt1 = getContext().getResources().getDisplayMetrics().widthPixels;
      paramInt2 = (int)(paramInt1 * this.mScale);
    }
    setMeasuredDimension(paramInt1, paramInt2);
    AppMethodBeat.o(53668);
  }

  public void setScale(float paramFloat)
  {
    this.mScale = paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardBannerView
 * JD-Core Version:    0.6.2
 */