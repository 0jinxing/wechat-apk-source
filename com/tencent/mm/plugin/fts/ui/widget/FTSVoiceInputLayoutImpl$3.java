package com.tencent.mm.plugin.fts.ui.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

final class FTSVoiceInputLayoutImpl$3
  implements View.OnTouchListener
{
  FTSVoiceInputLayoutImpl$3(FTSVoiceInputLayoutImpl paramFTSVoiceInputLayoutImpl)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(62183);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(62183);
      return false;
      if (!at.isConnected(this.mNb.getContext()))
      {
        FTSVoiceInputLayoutImpl.b(this.mNb, true);
        this.mNb.mNf.wi(12);
      }
      else
      {
        FTSVoiceInputLayoutImpl.b(this.mNb, false);
        FTSVoiceInputLayoutImpl.a(this.mNb, false);
        FTSVoiceInputLayoutImpl.a(this.mNb, bo.yz());
        ((FTSVoiceInputLayoutImpl.a)this.mNb.mNf).bBB();
        ab.d("MicroMsg.FTSVoiceInputLayoutImpl", "btn onTouch ACTION_DOWN currentState %s longClickStartTime %s", new Object[] { Integer.valueOf(this.mNb.currentState), Long.valueOf(FTSVoiceInputLayoutImpl.c(this.mNb)) });
        paramView = FTSVoiceInputLayoutImpl.b(this.mNb);
        ab.d("MicroMsg.FTSVoiceInputDrawable", "readyPressState %s", new Object[] { Integer.valueOf(paramView.currentState) });
        paramView.currentState = 6;
        paramView.invalidateSelf();
        this.mNb.B(false, false);
        FTSVoiceInputLayoutImpl.d(this.mNb);
        continue;
        if (!FTSVoiceInputLayoutImpl.e(this.mNb))
          break;
        FTSVoiceInputLayoutImpl.b(this.mNb, false);
      }
    }
    ab.d("MicroMsg.FTSVoiceInputLayoutImpl", "btn onTouch ACTION_UP currentState %s longClickDown %s", new Object[] { Integer.valueOf(this.mNb.currentState), Boolean.valueOf(FTSVoiceInputLayoutImpl.f(this.mNb)) });
    if (FTSVoiceInputLayoutImpl.f(this.mNb))
    {
      this.mNb.B(true, false);
      FTSVoiceInputLayoutImpl.a(this.mNb, false);
      FTSVoiceInputLayoutImpl.a(this.mNb, 0L);
    }
    while (true)
    {
      FTSVoiceInputLayoutImpl.g(this.mNb);
      ((FTSVoiceInputLayoutImpl.a)this.mNb.mNf).bBA();
      break;
      this.mNb.B(false, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl.3
 * JD-Core Version:    0.6.2
 */