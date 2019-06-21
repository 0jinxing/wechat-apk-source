package com.tencent.mm.pluginsdk.ui.websearch;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebSearchVoiceInputLayoutImpl$2
  implements View.OnTouchListener
{
  WebSearchVoiceInputLayoutImpl$2(WebSearchVoiceInputLayoutImpl paramWebSearchVoiceInputLayoutImpl)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(28222);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(28222);
      return false;
      WebSearchVoiceInputLayoutImpl.a(this.vwb, false);
      WebSearchVoiceInputLayoutImpl.a(this.vwb, bo.yz());
      ab.d("MicroMsg.WebSearchVoiceInputLayoutImpl", "btn onTouch ACTION_DOWN currentState %s longClickStartTime %s", new Object[] { Integer.valueOf(WebSearchVoiceInputLayoutImpl.c(this.vwb)), Long.valueOf(WebSearchVoiceInputLayoutImpl.d(this.vwb)) });
      WebSearchVoiceInputLayoutImpl.b(this.vwb).djm();
      this.vwb.B(false, false);
      continue;
      ab.d("MicroMsg.WebSearchVoiceInputLayoutImpl", "btn onTouch ACTION_UP currentState %s longClickDown %s", new Object[] { Integer.valueOf(WebSearchVoiceInputLayoutImpl.e(this.vwb)), Boolean.valueOf(WebSearchVoiceInputLayoutImpl.f(this.vwb)) });
      if (WebSearchVoiceInputLayoutImpl.f(this.vwb))
      {
        this.vwb.B(true, false);
        WebSearchVoiceInputLayoutImpl.a(this.vwb, false);
        WebSearchVoiceInputLayoutImpl.a(this.vwb, 0L);
      }
      else
      {
        this.vwb.B(false, true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl.2
 * JD-Core Version:    0.6.2
 */