package com.tencent.mm.plugin.setting.ui.setting;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView;

final class SettingsSwitchAccountUI$5
  implements ValueAnimator.AnimatorUpdateListener
{
  SettingsSwitchAccountUI$5(SettingsSwitchAccountUI paramSettingsSwitchAccountUI)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(138708);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    SettingsSwitchAccountUI.d(this.qpi).setTranslationY(-f * SettingsSwitchAccountUI.d(this.qpi).getHeight());
    AppMethodBeat.o(138708);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.5
 * JD-Core Version:    0.6.2
 */