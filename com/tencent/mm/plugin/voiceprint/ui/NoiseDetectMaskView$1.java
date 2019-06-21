package com.tencent.mm.plugin.voiceprint.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NoiseDetectMaskView$1
  implements View.OnClickListener
{
  NoiseDetectMaskView$1(NoiseDetectMaskView paramNoiseDetectMaskView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26141);
    if (NoiseDetectMaskView.a(this.sMb) != null)
      NoiseDetectMaskView.a(this.sMb).cHY();
    AppMethodBeat.o(26141);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView.1
 * JD-Core Version:    0.6.2
 */