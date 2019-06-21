package com.tencent.mm.plugin.fts;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.c.a;

final class c$3$1
  implements Runnable
{
  c$3$1(c.3 param3, String paramString, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136523);
    if (this.cia.equals(this.mAY.mAX.getTag()))
      c.a.a(this.mAY.val$context.getResources(), this.val$bitmap, this.mAY.mAX);
    AppMethodBeat.o(136523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.c.3.1
 * JD-Core Version:    0.6.2
 */