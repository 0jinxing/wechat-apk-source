package com.tencent.weui.base.preference;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PreferenceCategory extends Preference
{
  public PreferenceCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PreferenceCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113256);
    setLayoutResource(2130970132);
    AppMethodBeat.o(113256);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.PreferenceCategory
 * JD-Core Version:    0.6.2
 */