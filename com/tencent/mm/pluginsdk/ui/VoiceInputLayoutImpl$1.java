package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VoiceInputLayoutImpl$1
  implements View.OnLongClickListener
{
  VoiceInputLayoutImpl$1(VoiceInputLayoutImpl paramVoiceInputLayoutImpl)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(27586);
    ab.d("MicroMsg.VoiceInputLayoutImp", "btn onLongClickListener currentState %s", new Object[] { Integer.valueOf(this.vjv.currentState) });
    VoiceInputLayoutImpl.a(this.vjv, true);
    VoiceInputLayoutImpl.a(this.vjv).djl();
    AppMethodBeat.o(27586);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl.1
 * JD-Core Version:    0.6.2
 */