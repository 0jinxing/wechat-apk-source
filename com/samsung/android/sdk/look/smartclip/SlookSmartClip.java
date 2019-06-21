package com.samsung.android.sdk.look.smartclip;

import android.view.View;
import com.samsung.android.sdk.look.Slook;
import com.samsung.android.smartclip.SmartClipMetaUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class SlookSmartClip
{
  private static final String TAG = "SmartClip";
  private SlookSmartClip.DataExtractionListener mDataExtractionListener;
  private Slook mSlook;
  private View mView;

  public SlookSmartClip(View paramView)
  {
    AppMethodBeat.i(117214);
    this.mSlook = new Slook();
    this.mView = null;
    this.mDataExtractionListener = null;
    this.mView = paramView;
    AppMethodBeat.o(117214);
  }

  private boolean isSupport(int paramInt)
  {
    AppMethodBeat.i(117220);
    boolean bool;
    if (this.mSlook.isFeatureEnabled(2))
    {
      bool = true;
      AppMethodBeat.o(117220);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117220);
    }
  }

  public final void addMetaTag(SlookSmartClipMetaTag paramSlookSmartClipMetaTag)
  {
    AppMethodBeat.i(117215);
    if (!isSupport(1))
      AppMethodBeat.o(117215);
    while (true)
    {
      return;
      SmartClipMetaUtils.addMetaTag(this.mView, paramSlookSmartClipMetaTag);
      AppMethodBeat.o(117215);
    }
  }

  public final void clearAllMetaTag()
  {
    AppMethodBeat.i(117217);
    if (!isSupport(1))
      AppMethodBeat.o(117217);
    while (true)
    {
      return;
      SmartClipMetaUtils.clearAllMetaTag(this.mView);
      AppMethodBeat.o(117217);
    }
  }

  public final int extractDefaultSmartClipData(SlookSmartClipDataElement paramSlookSmartClipDataElement, SlookSmartClipCroppedArea paramSlookSmartClipCroppedArea)
  {
    AppMethodBeat.i(117219);
    int i;
    if (!isSupport(1))
    {
      i = 0;
      AppMethodBeat.o(117219);
    }
    while (true)
    {
      return i;
      i = SmartClipMetaUtils.extractDefaultSmartClipData(this.mView, paramSlookSmartClipDataElement, paramSlookSmartClipCroppedArea);
      AppMethodBeat.o(117219);
    }
  }

  public final void removeMetaTag(String paramString)
  {
    AppMethodBeat.i(117216);
    if (!isSupport(1))
      AppMethodBeat.o(117216);
    while (true)
    {
      return;
      SmartClipMetaUtils.removeMetaTag(this.mView, paramString);
      AppMethodBeat.o(117216);
    }
  }

  public final void setDataExtractionListener(SlookSmartClip.DataExtractionListener paramDataExtractionListener)
  {
    AppMethodBeat.i(117218);
    if (!isSupport(1))
      AppMethodBeat.o(117218);
    while (true)
    {
      return;
      this.mDataExtractionListener = paramDataExtractionListener;
      SmartClipMetaUtils.setDataExtractionListener(this.mView, new SlookSmartClip.1(this));
      AppMethodBeat.o(117218);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.smartclip.SlookSmartClip
 * JD-Core Version:    0.6.2
 */