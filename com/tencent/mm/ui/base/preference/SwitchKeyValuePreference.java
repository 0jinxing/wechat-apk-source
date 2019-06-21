package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.q;

public class SwitchKeyValuePreference extends Preference
{
  private boolean enable;
  private TextView pnu;

  public SwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107292);
    this.enable = true;
    setLayoutResource(2130970127);
    AppMethodBeat.o(107292);
  }

  private void cu()
  {
    AppMethodBeat.i(107295);
    if (this.pnu == null)
      AppMethodBeat.o(107295);
    while (true)
    {
      return;
      if (this.enable)
      {
        this.pnu.setTextColor(q.ii(this.mContext));
        AppMethodBeat.o(107295);
      }
      else
      {
        this.pnu.setTextColor(q.ij(this.mContext));
        AppMethodBeat.o(107295);
      }
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(107293);
    super.onBindView(paramView);
    this.pnu = ((TextView)paramView.findViewById(16908304));
    cu();
    AppMethodBeat.o(107293);
  }

  public final void qk(boolean paramBoolean)
  {
    AppMethodBeat.i(107294);
    this.enable = paramBoolean;
    cu();
    AppMethodBeat.o(107294);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.SwitchKeyValuePreference
 * JD-Core Version:    0.6.2
 */