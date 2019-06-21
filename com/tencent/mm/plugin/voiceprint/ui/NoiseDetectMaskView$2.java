package com.tencent.mm.plugin.voiceprint.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NoiseDetectMaskView$2
  implements View.OnClickListener
{
  NoiseDetectMaskView$2(NoiseDetectMaskView paramNoiseDetectMaskView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26142);
    if (NoiseDetectMaskView.b(this.sMb) != null)
      NoiseDetectMaskView.b(this.sMb).cHX();
    AppMethodBeat.o(26142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.NoiseDetectMaskView.2
 * JD-Core Version:    0.6.2
 */