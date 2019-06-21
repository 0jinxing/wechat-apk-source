package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.b;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppBrandCapsuleHomeButton extends AppBrandOptionButton
{
  public AppBrandCapsuleHomeButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AppBrandCapsuleHomeButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected final Drawable getDefaultImageDrawable()
  {
    AppMethodBeat.i(87497);
    Drawable localDrawable = b.g(getContext(), 2130837707);
    AppMethodBeat.o(87497);
    return localDrawable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton
 * JD-Core Version:    0.6.2
 */