package com.tencent.mm.pluginsdk.ui.websearch;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.k;
import com.tencent.mm.sdk.platformtools.ab;

final class WebSearchVoiceInputLayoutImpl$1
  implements View.OnLongClickListener
{
  WebSearchVoiceInputLayoutImpl$1(WebSearchVoiceInputLayoutImpl paramWebSearchVoiceInputLayoutImpl)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(28221);
    ab.d("MicroMsg.WebSearchVoiceInputLayoutImpl", "btn onLongClickListener currentState %s", new Object[] { Integer.valueOf(WebSearchVoiceInputLayoutImpl.a(this.vwb)) });
    WebSearchVoiceInputLayoutImpl.a(this.vwb, true);
    WebSearchVoiceInputLayoutImpl.b(this.vwb).djl();
    AppMethodBeat.o(28221);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl.1
 * JD-Core Version:    0.6.2
 */