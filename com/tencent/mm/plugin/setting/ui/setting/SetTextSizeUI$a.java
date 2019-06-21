package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

final class SetTextSizeUI$a extends Preference
{
  private float qlI;

  public SetTextSizeUI$a(SetTextSizeUI paramSetTextSizeUI, Context paramContext, float paramFloat)
  {
    super(paramContext);
    this.qlI = paramFloat;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(127054);
    super.onBindView(paramView);
    paramView = (TextView)paramView.findViewById(16908310);
    if (paramView != null)
      paramView.setTextSize(1, SetTextSizeUI.aS(this.qlI));
    AppMethodBeat.o(127054);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SetTextSizeUI.a
 * JD-Core Version:    0.6.2
 */