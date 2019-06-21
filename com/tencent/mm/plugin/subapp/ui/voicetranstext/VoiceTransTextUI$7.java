package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoiceTransTextUI$7
  implements Runnable
{
  VoiceTransTextUI$7(VoiceTransTextUI paramVoiceTransTextUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25600);
    if (VoiceTransTextUI.r(this.swl).getMeasuredHeight() >= VoiceTransTextUI.s(this.swl).getMeasuredHeight())
    {
      VoiceTransTextUI.r(this.swl).fullScroll(130);
      int i = VoiceTransTextUI.r(this.swl).getScrollY();
      VoiceTransTextUI.c(this.swl, VoiceTransTextUI.r(this.swl).getPaddingTop());
      VoiceTransTextUI.c(this.swl, VoiceTransTextUI.t(this.swl) - i);
      if (!this.swo)
      {
        if (VoiceTransTextUI.t(this.swl) <= 0)
          break label170;
        VoiceTransTextUI.r(this.swl).setPadding(0, VoiceTransTextUI.t(this.swl), 0, 0);
        AppMethodBeat.o(25600);
      }
    }
    while (true)
    {
      return;
      VoiceTransTextUI.r(this.swl).setPadding(0, 0, 0, 0);
      VoiceTransTextUI.u(this.swl).setVisibility(8);
      VoiceTransTextUI.u(this.swl).setHeight(0);
      label170: AppMethodBeat.o(25600);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI.7
 * JD-Core Version:    0.6.2
 */