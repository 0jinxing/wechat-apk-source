package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMNewPhotoEditUI$1
  implements Runnable
{
  MMNewPhotoEditUI$1(MMNewPhotoEditUI paramMMNewPhotoEditUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11919);
    ab.i("MicroMsg.MMNewPhotoEditUI", "connected!!!");
    MMNewPhotoEditUI.a(this.ynz);
    this.ynz.initView();
    AppMethodBeat.o(11919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMNewPhotoEditUI.1
 * JD-Core Version:    0.6.2
 */