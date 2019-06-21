package com.tencent.mm.plugin.luckymoney.model;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class l$5
  implements l.a
{
  l$5(l paraml, ImageView paramImageView)
  {
  }

  public final void a(final Bitmap paramBitmap, int paramInt, String paramString)
  {
    AppMethodBeat.i(42306);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      ab.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", new Object[] { Integer.valueOf(paramInt), paramString });
      AppMethodBeat.o(42306);
    }
    while (true)
    {
      return;
      l.Y(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(42305);
          l.5.this.lvs.setImageBitmap(paramBitmap);
          AppMethodBeat.o(42305);
        }
      });
      AppMethodBeat.o(42306);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.l.5
 * JD-Core Version:    0.6.2
 */