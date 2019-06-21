package com.samsung.android.sdk.look.smartclip;

import android.view.View;

public abstract interface SlookSmartClip$DataExtractionListener
{
  public static final int EXTRACTION_DEFAULT = 1;
  public static final int EXTRACTION_DISCARD = 0;

  public abstract int onExtractSmartClipData(View paramView, SlookSmartClipDataElement paramSlookSmartClipDataElement, SlookSmartClipCroppedArea paramSlookSmartClipCroppedArea);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.smartclip.SlookSmartClip.DataExtractionListener
 * JD-Core Version:    0.6.2
 */