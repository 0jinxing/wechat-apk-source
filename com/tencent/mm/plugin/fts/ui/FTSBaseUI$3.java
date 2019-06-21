package com.tencent.mm.plugin.fts.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class FTSBaseUI$3 extends ak
{
  FTSBaseUI$3(FTSBaseUI paramFTSBaseUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(61781);
    if ((paramMessage.what == 1) && (!bo.isNullOrNil(FTSBaseUI.b(this.mIt))))
      this.mIt.bAM();
    AppMethodBeat.o(61781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSBaseUI.3
 * JD-Core Version:    0.6.2
 */