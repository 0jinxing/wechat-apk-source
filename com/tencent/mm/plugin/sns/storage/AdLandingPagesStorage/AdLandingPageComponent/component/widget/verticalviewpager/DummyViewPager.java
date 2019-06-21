package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.a;
import java.io.Serializable;

public class DummyViewPager extends AdLandingViewPager
  implements Serializable
{
  protected int rcT;

  public DummyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(37594);
    paramContext = new a();
    if (Build.VERSION.SDK_INT >= 11)
      if (this.mPageTransformer == null)
        break label88;
    label88: for (int j = 1; ; j = 0)
    {
      if (1 != j)
        i = 1;
      this.mPageTransformer = paramContext;
      setChildrenDrawingOrderEnabledCompat(true);
      this.mDrawingOrder = 1;
      if (i != 0)
        populate();
      setOnPageChangeListener(new DummyViewPager.1(this));
      AppMethodBeat.o(37594);
      return;
    }
  }

  public int getBaseScrollX()
  {
    return this.rcT;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public void setBaseScrollX(int paramInt)
  {
    this.rcT = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager
 * JD-Core Version:    0.6.2
 */