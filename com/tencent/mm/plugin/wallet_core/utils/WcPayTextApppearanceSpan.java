package com.tencent.mm.plugin.wallet_core.utils;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TextAppearanceSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WcPayTextApppearanceSpan extends TextAppearanceSpan
{
  Typeface tPl;

  public WcPayTextApppearanceSpan(int paramInt, ColorStateList paramColorStateList)
  {
    super(null, 0, paramInt, paramColorStateList, null);
  }

  public void updateMeasureState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(48015);
    super.updateMeasureState(paramTextPaint);
    if (this.tPl != null)
      paramTextPaint.setTypeface(this.tPl);
    AppMethodBeat.o(48015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan
 * JD-Core Version:    0.6.2
 */