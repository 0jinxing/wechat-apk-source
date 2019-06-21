package com.tencent.mm.plugin.luckymoney.model;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class l$6
  implements l.a
{
  l$6(l paraml, a.a parama, ImageView paramImageView)
  {
  }

  public final void a(Bitmap paramBitmap, int paramInt, String paramString)
  {
    AppMethodBeat.i(42308);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      ab.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", new Object[] { Integer.valueOf(paramInt), paramString });
      if (this.nXy != null)
        this.nXy.iH(false);
      AppMethodBeat.o(42308);
    }
    while (true)
    {
      return;
      l.Y(new l.6.1(this, paramInt, paramBitmap, paramString));
      AppMethodBeat.o(42308);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.l.6
 * JD-Core Version:    0.6.2
 */