package com.tencent.mm.plugin.fav.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.al;

final class l$6
  implements Runnable
{
  l$6(String paramString, int paramInt1, int paramInt2, com.tencent.mm.plugin.fav.a.g paramg, aar paramaar, boolean paramBoolean, ImageView paramImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74198);
    Bitmap localBitmap = l.b(this.bSt, this.mku, this.mkv, false);
    if (localBitmap == null)
    {
      l.c(this.meE, this.mjL, this.mkt);
      AppMethodBeat.o(74198);
    }
    while (true)
    {
      return;
      String str = (String)this.lvs.getTag();
      if ((str != null) && (str.equals(this.bSt)))
      {
        com.tencent.mm.kernel.g.RS();
        al.d(new l.6.1(this, localBitmap));
      }
      AppMethodBeat.o(74198);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.l.6
 * JD-Core Version:    0.6.2
 */