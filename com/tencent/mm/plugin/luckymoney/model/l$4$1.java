package com.tencent.mm.plugin.luckymoney.model;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.d;

final class l$4$1
  implements Runnable
{
  l$4$1(l.4 param4, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42303);
    this.nXw.lvs.setImageBitmap(d.a(this.val$bitmap, false, a.fromDPToPix(ah.getContext(), 3)));
    AppMethodBeat.o(42303);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.l.4.1
 * JD-Core Version:    0.6.2
 */