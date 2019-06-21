package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class VoiceTransTextUI$3
  implements View.OnTouchListener
{
  VoiceTransTextUI$3(VoiceTransTextUI paramVoiceTransTextUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(25594);
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(25594);
      return false;
      VoiceTransTextUI.c(this.swl);
      VoiceTransTextUI.a(this.swl, paramView.getScrollY());
      VoiceTransTextUI.b(this.swl, VoiceTransTextUI.d(this.swl));
      VoiceTransTextUI.e(this.swl).removeMessages(0);
      if (VoiceTransTextUI.f(this.swl))
      {
        VoiceTransTextUI.g(this.swl);
        VoiceTransTextUI.a(this.swl, true);
        continue;
        if (Math.abs(VoiceTransTextUI.h(this.swl) - paramView.getScrollY()) > VoiceTransTextUI.i(this.swl))
          VoiceTransTextUI.e(this.swl).sendMessage(VoiceTransTextUI.e(this.swl).obtainMessage(0, paramView));
        if ((VoiceTransTextUI.j(this.swl) < 800L) && (Math.abs(VoiceTransTextUI.h(this.swl) - paramView.getScrollY()) <= VoiceTransTextUI.i(this.swl)) && (!VoiceTransTextUI.k(this.swl)))
        {
          VoiceTransTextUI.e(this.swl).removeMessages(0);
          VoiceTransTextUI.l(this.swl);
          this.swl.finish();
        }
        VoiceTransTextUI.a(this.swl, false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI.3
 * JD-Core Version:    0.6.2
 */