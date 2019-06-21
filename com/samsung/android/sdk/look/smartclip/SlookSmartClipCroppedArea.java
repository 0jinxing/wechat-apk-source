package com.samsung.android.sdk.look.smartclip;

import android.graphics.Rect;
import android.view.View;

public abstract interface SlookSmartClipCroppedArea
{
  public abstract Rect getRect();

  public abstract boolean intersects(Rect paramRect);

  public abstract boolean intersects(View paramView);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.smartclip.SlookSmartClipCroppedArea
 * JD-Core Version:    0.6.2
 */