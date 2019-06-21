package com.tencent.mm.plugin.voip.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipSmallIconButton$1
  implements View.OnTouchListener
{
  VoipSmallIconButton$1(VoipSmallIconButton paramVoipSmallIconButton)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(4866);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(4866);
      return false;
      VoipSmallIconButton.b(this.sWR).setImageDrawable(VoipSmallIconButton.a(this.sWR));
      VoipSmallIconButton.c(this.sWR).setTextColor(-855638017);
      continue;
      VoipSmallIconButton.b(this.sWR).setImageDrawable(VoipSmallIconButton.d(this.sWR));
      VoipSmallIconButton.c(this.sWR).setTextColor(-1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipSmallIconButton.1
 * JD-Core Version:    0.6.2
 */