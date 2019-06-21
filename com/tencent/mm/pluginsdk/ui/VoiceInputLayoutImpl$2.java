package com.tencent.mm.pluginsdk.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class VoiceInputLayoutImpl$2
  implements View.OnTouchListener
{
  VoiceInputLayoutImpl$2(VoiceInputLayoutImpl paramVoiceInputLayoutImpl)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(27587);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(27587);
      return false;
      VoiceInputLayoutImpl.a(this.vjv, false);
      VoiceInputLayoutImpl.a(this.vjv, bo.yz());
      ab.d("MicroMsg.VoiceInputLayoutImp", "btn onTouch ACTION_DOWN currentState %s longClickStartTime %s", new Object[] { Integer.valueOf(this.vjv.currentState), Long.valueOf(VoiceInputLayoutImpl.b(this.vjv)) });
      VoiceInputLayoutImpl.a(this.vjv).djm();
      this.vjv.B(false, false);
      continue;
      ab.d("MicroMsg.VoiceInputLayoutImp", "btn onTouch ACTION_UP currentState %s longClickDown %s", new Object[] { Integer.valueOf(this.vjv.currentState), Boolean.valueOf(VoiceInputLayoutImpl.c(this.vjv)) });
      if (VoiceInputLayoutImpl.c(this.vjv))
      {
        this.vjv.B(true, false);
        VoiceInputLayoutImpl.a(this.vjv, false);
        VoiceInputLayoutImpl.a(this.vjv, 0L);
      }
      else
      {
        this.vjv.B(false, true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl.2
 * JD-Core Version:    0.6.2
 */