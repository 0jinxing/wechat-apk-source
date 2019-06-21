package com.tencent.mm.plugin.setting.ui.setting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.b;

final class SettingsSwitchAccountUI$6 extends AnimatorListenerAdapter
{
  SettingsSwitchAccountUI$6(SettingsSwitchAccountUI paramSettingsSwitchAccountUI)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(138709);
    ab.i("MicroMsg.SettingsSwitchAccountUI", "up animation end");
    paramAnimator = a.gkE.bh(this.qpi);
    paramAnimator.addFlags(67108864);
    this.qpi.startActivity(paramAnimator);
    this.qpi.finish();
    b.hM(this.qpi);
    AppMethodBeat.o(138709);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.6
 * JD-Core Version:    0.6.2
 */