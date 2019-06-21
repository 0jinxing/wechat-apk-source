package com.tencent.mm.ui.chatting.gallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.io.File;

final class k$1$1
  implements Runnable
{
  k$1$1(k.1 param1, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32378);
    if (bo.isNullOrNil(this.hWl))
    {
      h.g(this.yXI.yXH.yUe.yTI, 2131304254, 2131298205);
      AppMethodBeat.o(32378);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setAction("android.intent.action.VIEW");
      com.tencent.mm.sdk.platformtools.k.a(this.yXI.yXH.yUe.yTI, localIntent, new File(this.hWl), "video/*");
      try
      {
        this.yXI.yXH.yUe.yTI.startActivity(Intent.createChooser(localIntent, this.yXI.yXH.yUe.yTI.mController.ylL.getString(2131299761)));
        AppMethodBeat.o(32378);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ImageGalleryViewHolder", "startActivity fail, activity not found");
        h.g(this.yXI.yXH.yUe.yTI, 2131299668, 2131299669);
        AppMethodBeat.o(32378);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.k.1.1
 * JD-Core Version:    0.6.2
 */