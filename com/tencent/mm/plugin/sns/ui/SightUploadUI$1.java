package com.tencent.mm.plugin.sns.ui;

import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightUploadUI$1
  implements Runnable
{
  SightUploadUI$1(SightUploadUI paramSightUploadUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38583);
    SightUploadUI.a(this.rnn).setWidth((int)(this.rnm * 0.7D));
    SightUploadUI.b(this.rnn).setLayoutParams(new LinearLayout.LayoutParams((int)(this.rnm * 0.3D), SightUploadUI.b(this.rnn).getHeight()));
    AppMethodBeat.o(38583);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SightUploadUI.1
 * JD-Core Version:    0.6.2
 */