package com.tencent.mm.plugin.subapp.ui.gallery;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.subapp.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q;

final class GestureGalleryUI$9$1
  implements h.c
{
  GestureGalleryUI$9$1(GestureGalleryUI.9 param9)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(25385);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(25385);
      GestureGalleryUI localGestureGalleryUI;
      String str;
      while (true)
      {
        return;
        GestureGalleryUI.a(this.suo.sum, GestureGalleryUI.c(this.suo.sum));
        AppMethodBeat.o(25385);
        continue;
        localGestureGalleryUI = this.suo.sum;
        str = GestureGalleryUI.c(this.suo.sum);
        if ((str != null) && (str.length() != 0))
          break;
        AppMethodBeat.o(25385);
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("Retr_File_Name", str);
      localIntent.putExtra("Retr_Msg_Type", 0);
      localIntent.putExtra("Retr_Compress_Type", 0);
      b.gkE.k(localIntent, localGestureGalleryUI.mController.ylL);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.9.1
 * JD-Core Version:    0.6.2
 */