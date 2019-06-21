package com.tencent.mm.plugin.sight.draft.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class c$b
  implements Runnable
{
  String key;
  Bitmap mQQ;
  WeakReference<c> qzX;

  public final void run()
  {
    AppMethodBeat.i(25023);
    c localc = (c)this.qzX.get();
    if (localc != null)
      localc.r(this.key, this.mQQ);
    AppMethodBeat.o(25023);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.c.b
 * JD-Core Version:    0.6.2
 */