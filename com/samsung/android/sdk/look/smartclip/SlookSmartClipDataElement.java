package com.samsung.android.sdk.look.smartclip;

import android.graphics.Rect;

public abstract interface SlookSmartClipDataElement
{
  public abstract void addTag(SlookSmartClipMetaTag paramSlookSmartClipMetaTag);

  public abstract SlookSmartClipMetaTagArray getAllTag();

  public abstract Rect getMetaAreaRect();

  public abstract SlookSmartClipMetaTagArray getTag(String paramString);

  public abstract void removeTag(String paramString);

  public abstract void setMetaAreaRect(Rect paramRect);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.smartclip.SlookSmartClipDataElement
 * JD-Core Version:    0.6.2
 */