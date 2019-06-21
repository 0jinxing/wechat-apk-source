package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$1
  implements Runnable
{
  f$1(f paramf, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81030);
    f.a(this.qcy).setImageBitmap(this.val$bitmap);
    f.a(this.qcy).setBackgroundColor(0);
    if (f.b(this.qcy) != null)
      f.b(this.qcy).notifyDataSetChanged();
    AppMethodBeat.o(81030);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.f.1
 * JD-Core Version:    0.6.2
 */