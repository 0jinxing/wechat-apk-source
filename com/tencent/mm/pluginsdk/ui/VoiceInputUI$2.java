package com.tencent.mm.pluginsdk.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoiceInputUI$2
  implements View.OnTouchListener
{
  VoiceInputUI$2(VoiceInputUI paramVoiceInputUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(27607);
    if (paramMotionEvent.getAction() == 0)
      VoiceInputUI.a(this.vjG);
    while (true)
    {
      AppMethodBeat.o(27607);
      return false;
      if (paramMotionEvent.getAction() == 1)
      {
        if (VoiceInputUI.b(this.vjG).djp())
        {
          paramView = VoiceInputUI.b(this.vjG);
          paramView.djq();
          paramView.setVisibility(8);
        }
        if (VoiceInputUI.b(this.vjG).aYV())
        {
          paramView = VoiceInputUI.b(this.vjG);
          paramView.aRe();
          paramView.setVisibility(8);
        }
        paramView = VoiceInputUI.b(this.vjG);
        paramView.setVisibility(0);
        if (paramView.viZ != null)
          paramView.viZ.setImageResource(2130838298);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputUI.2
 * JD-Core Version:    0.6.2
 */