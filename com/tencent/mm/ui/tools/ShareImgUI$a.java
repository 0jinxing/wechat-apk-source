package com.tencent.mm.ui.tools;

import android.content.ContentResolver;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;

final class ShareImgUI$a
  implements Runnable
{
  private Uri mUri;
  private ShareImgUI.c zHA;

  public ShareImgUI$a(ShareImgUI paramShareImgUI, Uri paramUri, ShareImgUI.c paramc)
  {
    this.mUri = paramUri;
    this.zHA = paramc;
  }

  public final void run()
  {
    AppMethodBeat.i(34943);
    this.zHr.filePath = ShareImgUI.a(this.zHr, this.mUri);
    if ((bo.isNullOrNil(this.zHr.filePath)) || (!new b(this.zHr.filePath).exists()))
      if (ShareImgUI.ask(this.zHr.getContentResolver().getType(this.mUri)) != 3)
        break label120;
    label120: for (this.zHr.filePath = e.a(this.zHr.getContentResolver(), this.mUri); ; this.zHr.filePath = e.a(this.zHr.getContentResolver(), this.mUri, 1))
    {
      if (this.zHA != null)
        this.zHA.dJx();
      AppMethodBeat.o(34943);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImgUI.a
 * JD-Core Version:    0.6.2
 */