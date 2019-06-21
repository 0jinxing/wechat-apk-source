package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class IPCallFeedbackScrollView extends ScrollView
{
  public IPCallFeedbackScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public IPCallFeedbackScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(22179);
    try
    {
      Display localDisplay = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
      DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
      localDisplayMetrics.<init>();
      localDisplay.getMetrics(localDisplayMetrics);
      int i = View.MeasureSpec.makeMeasureSpec(localDisplayMetrics.heightPixels / 2, -2147483648);
      paramInt2 = i;
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(22179);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.IPCallFeedbackScrollView", localException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallFeedbackScrollView
 * JD-Core Version:    0.6.2
 */