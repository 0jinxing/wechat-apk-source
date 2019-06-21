package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.o;

public class AppBrandNativeContainerView extends FrameLayout
  implements o
{
  public boolean hIN;

  public AppBrandNativeContainerView(Context paramContext)
  {
    super(paramContext);
  }

  public AppBrandNativeContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AppBrandNativeContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void setFullscreenWithChild(boolean paramBoolean)
  {
    this.hIN = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView
 * JD-Core Version:    0.6.2
 */