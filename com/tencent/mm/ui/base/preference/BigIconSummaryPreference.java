package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class BigIconSummaryPreference extends IconSummaryPreference
{
  public BigIconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public BigIconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107130);
    paramViewGroup = super.onCreateView(paramViewGroup);
    paramViewGroup.setMinimumHeight(paramViewGroup.getResources().getDimensionPixelSize(2131427790));
    AppMethodBeat.o(107130);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.BigIconSummaryPreference
 * JD-Core Version:    0.6.2
 */