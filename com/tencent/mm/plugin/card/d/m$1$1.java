package com.tencent.mm.plugin.card.d;

import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$1$1
  implements Runnable
{
  m$1$1(m.1 param1, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88926);
    this.krS.krP.setImageBitmap(this.krR);
    this.krS.krP.setColorFilter(this.krS.itf, PorterDuff.Mode.SRC_IN);
    AppMethodBeat.o(88926);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.m.1.1
 * JD-Core Version:    0.6.2
 */