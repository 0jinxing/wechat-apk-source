package com.tencent.weui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PreferenceTitleCategory extends PreferenceCategory
{
  public PreferenceTitleCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PreferenceTitleCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113258);
    if (getLayoutResource() != 2130970187)
      setLayoutResource(2130970185);
    AppMethodBeat.o(113258);
  }

  protected void onBindView(View paramView)
  {
    AppMethodBeat.i(113259);
    super.onBindView(paramView);
    paramView = (TextView)paramView.findViewById(16908310);
    if (paramView == null)
      AppMethodBeat.o(113259);
    while (true)
    {
      return;
      if ((getTitle() == null) || (getTitle().length() <= 0))
      {
        paramView.setVisibility(8);
        AppMethodBeat.o(113259);
      }
      else
      {
        paramView.setVisibility(0);
        paramView.setText(getTitle());
        AppMethodBeat.o(113259);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.PreferenceTitleCategory
 * JD-Core Version:    0.6.2
 */