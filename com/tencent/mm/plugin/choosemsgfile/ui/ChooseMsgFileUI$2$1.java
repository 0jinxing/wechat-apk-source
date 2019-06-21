package com.tencent.mm.plugin.choosemsgfile.ui;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ChooseMsgFileUI$2$1
  implements Runnable
{
  ChooseMsgFileUI$2$1(ChooseMsgFileUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54441);
    Animation localAnimation = AnimationUtils.loadAnimation(this.kvS.kvQ.mController.ylL, 2131034181);
    ChooseMsgFileUI.h(this.kvS.kvQ).startAnimation(localAnimation);
    ChooseMsgFileUI.h(this.kvS.kvQ).setVisibility(8);
    AppMethodBeat.o(54441);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.2.1
 * JD-Core Version:    0.6.2
 */