package com.tencent.mm.plugin.shake.d.b;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements Runnable
{
  a$1(a parama, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24680);
    a.a(this.qug).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(24680);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.b.a.1
 * JD-Core Version:    0.6.2
 */