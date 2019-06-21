package com.tencent.mm.ui.tools;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class ShareImgUI$3 extends ak
{
  ShareImgUI$3(ShareImgUI paramShareImgUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(34937);
    if (bo.isNullOrNil(this.zHr.filePath))
    {
      ab.e("MicroMsg.ShareImgUI", "launch : fail, filePath is null");
      ShareImgUI.d(this.zHr);
      this.zHr.finish();
      AppMethodBeat.o(34937);
    }
    while (true)
    {
      return;
      ShareImgUI.c(this.zHr);
      AppMethodBeat.o(34937);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImgUI.3
 * JD-Core Version:    0.6.2
 */