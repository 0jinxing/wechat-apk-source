package com.tencent.mm.plugin.collect.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.sdk.platformtools.ab;

final class CollectMainUI$12
  implements x.a
{
  CollectMainUI$12(CollectMainUI paramCollectMainUI)
  {
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(41264);
    if ((paramString == null) || (CollectMainUI.a(this.kHl) == null))
      AppMethodBeat.o(41264);
    while (true)
    {
      return;
      if (paramString.equals(CollectMainUI.a(this.kHl)))
      {
        ab.i("MicroMsg.CollectMainUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", new Object[] { CollectMainUI.a(this.kHl), paramString });
        this.kHl.bhs();
      }
      AppMethodBeat.o(41264);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.12
 * JD-Core Version:    0.6.2
 */