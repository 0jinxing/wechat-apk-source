package com.tencent.mm.plugin.gallery.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.stub.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.DrawedCallBackFrameLayout.a;

final class AlbumPreviewUI$7
  implements DrawedCallBackFrameLayout.a
{
  AlbumPreviewUI$7(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final void bCv()
  {
    AppMethodBeat.i(21399);
    try
    {
      AlbumPreviewUI.b(this.mPO).bCv();
      if (!this.mPO.mPC);
    }
    catch (Exception localException)
    {
      try
      {
        this.mPO.unbindService(AlbumPreviewUI.H(this.mPO));
        this.mPO.mPC = false;
        AppMethodBeat.o(21399);
        return;
        localException = localException;
        ab.printErrStackTrace("MicroMsg.AlbumPreviewUI", localException, "", new Object[0]);
      }
      catch (Throwable localThrowable)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AlbumPreviewUI", localThrowable, "Failed to unbindService when onViewDrawed is invoked.", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.7
 * JD-Core Version:    0.6.2
 */