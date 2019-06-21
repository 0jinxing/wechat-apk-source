package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoiceInputFooter$1
  implements View.OnClickListener
{
  VoiceInputFooter$1(VoiceInputFooter paramVoiceInputFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27554);
    if (this.vjg.getVisibility() == 8)
      this.vjg.setVisibility(0);
    if (this.vjg.djp())
      VoiceInputFooter.a(this.vjg);
    if (this.vjg.aYV())
      VoiceInputFooter.b(this.vjg);
    AppMethodBeat.o(27554);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputFooter.1
 * JD-Core Version:    0.6.2
 */