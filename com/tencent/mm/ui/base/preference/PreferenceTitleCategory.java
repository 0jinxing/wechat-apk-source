package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PreferenceTitleCategory extends PreferenceCategory
{
  public PreferenceTitleCategory(Context paramContext)
  {
    this(paramContext, null);
  }

  public PreferenceTitleCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PreferenceTitleCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107284);
    if (getLayoutResource() != 2130970187)
      setLayoutResource(2130970185);
    AppMethodBeat.o(107284);
  }

  protected final void onBindView(View paramView)
  {
    AppMethodBeat.i(107285);
    super.onBindView(paramView);
    paramView = (TextView)paramView.findViewById(16908310);
    if (paramView == null)
      AppMethodBeat.o(107285);
    while (true)
    {
      return;
      if ((getTitle() == null) || (getTitle().length() <= 0))
      {
        paramView.setVisibility(8);
        AppMethodBeat.o(107285);
      }
      else
      {
        paramView.setVisibility(0);
        paramView.setText(getTitle());
        AppMethodBeat.o(107285);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.PreferenceTitleCategory
 * JD-Core Version:    0.6.2
 */