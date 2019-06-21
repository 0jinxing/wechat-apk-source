package com.tencent.mm.plugin.game.f;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2$1
  implements Runnable
{
  e$2$1(e.2 param2, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112327);
    if (this.nnJ.mAX != null)
      this.nnJ.mAX.setImageBitmap(this.nnI);
    AppMethodBeat.o(112327);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.e.2.1
 * JD-Core Version:    0.6.2
 */