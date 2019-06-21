package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

final class SnsUploadBrowseUI$1
  implements SnsInfoFlip.c
{
  SnsUploadBrowseUI$1(SnsUploadBrowseUI paramSnsUploadBrowseUI)
  {
  }

  public final void Eb(int paramInt)
  {
    AppMethodBeat.i(39676);
    SnsUploadBrowseUI.a(this.rCi).put(Integer.valueOf(paramInt), Boolean.TRUE);
    AppMethodBeat.o(39676);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI.1
 * JD-Core Version:    0.6.2
 */