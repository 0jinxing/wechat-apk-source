package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$e$3$1
  implements Runnable
{
  d$e$3$1(d.e.3 param3, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32842);
    this.zcX.zcS.zcA.setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(32842);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.e.3.1
 * JD-Core Version:    0.6.2
 */