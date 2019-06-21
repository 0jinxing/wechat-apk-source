package com.tencent.mm.ui.tools;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class ShareScreenImgUI$1 extends ak
{
  ShareScreenImgUI$1(ShareScreenImgUI paramShareScreenImgUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(34966);
    ShareScreenImgUI.a(this.zHB);
    if (bo.isNullOrNil(this.zHB.filePath))
    {
      ab.e("MicroMsg.ShareScreenImgUI", "launch : fail, filePath is null");
      ShareScreenImgUI.b(this.zHB);
      this.zHB.finish();
      AppMethodBeat.o(34966);
    }
    while (true)
    {
      return;
      ShareScreenImgUI.c(this.zHB);
      AppMethodBeat.o(34966);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareScreenImgUI.1
 * JD-Core Version:    0.6.2
 */