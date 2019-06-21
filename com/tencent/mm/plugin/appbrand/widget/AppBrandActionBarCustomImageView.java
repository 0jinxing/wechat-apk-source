package com.tencent.mm.plugin.appbrand.widget;

import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/AppBrandActionBarCustomImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "luggage-wxa-app_release"})
public final class AppBrandActionBarCustomImageView extends ImageView
{
  public AppBrandActionBarCustomImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(87597);
    if (paramMotionEvent != null)
      switch (paramMotionEvent.getAction())
      {
      default:
      case 0:
      case 1:
      }
    while (true)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(87597);
      return bool;
      setAlpha(0.5F);
      continue;
      setAlpha(1.0F);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView
 * JD-Core Version:    0.6.2
 */