package com.tencent.mm.plugin.voip.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipBigIconButton$1
  implements View.OnTouchListener
{
  VoipBigIconButton$1(VoipBigIconButton paramVoipBigIconButton)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(4852);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(4852);
      return false;
      VoipBigIconButton.b(this.sWK).setBackgroundDrawable(VoipBigIconButton.a(this.sWK));
      VoipBigIconButton.b(this.sWK).setImageDrawable(VoipBigIconButton.c(this.sWK));
      VoipBigIconButton.d(this.sWK).setTextColor(-855638017);
      continue;
      VoipBigIconButton.b(this.sWK).setBackgroundDrawable(VoipBigIconButton.e(this.sWK));
      VoipBigIconButton.b(this.sWK).setImageDrawable(VoipBigIconButton.f(this.sWK));
      VoipBigIconButton.d(this.sWK).setTextColor(-1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipBigIconButton.1
 * JD-Core Version:    0.6.2
 */