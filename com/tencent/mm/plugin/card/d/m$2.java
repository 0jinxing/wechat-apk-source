package com.tencent.mm.plugin.card.d;

import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$2
  implements Runnable
{
  m$2(ImageView paramImageView, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88928);
    this.krP.setImageResource(this.krQ);
    this.krP.setColorFilter(this.itf, PorterDuff.Mode.SRC_IN);
    AppMethodBeat.o(88928);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.m.2
 * JD-Core Version:    0.6.2
 */