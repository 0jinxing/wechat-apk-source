package com.tencent.mm.plugin.voip.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.e.c;

final class VoipScoreDialog$2
  implements e.c
{
  VoipScoreDialog$2(VoipScoreDialog paramVoipScoreDialog)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(4857);
    VoipScoreDialog.b(this.sWP, 1);
    this.sWP.finish();
    AppMethodBeat.o(4857);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipScoreDialog.2
 * JD-Core Version:    0.6.2
 */