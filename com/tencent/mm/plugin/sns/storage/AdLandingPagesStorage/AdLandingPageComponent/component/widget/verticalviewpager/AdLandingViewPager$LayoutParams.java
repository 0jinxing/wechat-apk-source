package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AdLandingViewPager$LayoutParams extends ViewGroup.LayoutParams
{
  public boolean Nq;
  boolean Nr;
  int Ns;
  public int gravity;
  int position;
  float widthFactor;

  public AdLandingViewPager$LayoutParams()
  {
    super(-1, -1);
    this.widthFactor = 0.0F;
  }

  public AdLandingViewPager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(37505);
    this.widthFactor = 0.0F;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, AdLandingViewPager.access$400());
    this.gravity = paramContext.getInteger(0, 48);
    paramContext.recycle();
    AppMethodBeat.o(37505);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.LayoutParams
 * JD-Core Version:    0.6.2
 */