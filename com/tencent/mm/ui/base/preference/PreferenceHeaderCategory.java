package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PreferenceHeaderCategory extends Preference
{
  public PreferenceHeaderCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PreferenceHeaderCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107279);
    setLayoutResource(2130970178);
    AppMethodBeat.o(107279);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107280);
    paramViewGroup = super.onCreateView(paramViewGroup);
    paramViewGroup.findViewById(16908310).setBackgroundResource(2130839171);
    AppMethodBeat.o(107280);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.PreferenceHeaderCategory
 * JD-Core Version:    0.6.2
 */