package com.tencent.mm.plugin.luckymoney.model;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class l$7
  implements l.a
{
  l$7(l paraml, ImageView paramImageView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
  }

  public final void a(final Bitmap paramBitmap, final int paramInt, final String paramString)
  {
    AppMethodBeat.i(42310);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      ab.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", new Object[] { Integer.valueOf(paramInt), paramString });
      AppMethodBeat.o(42310);
    }
    while (true)
    {
      return;
      l.Y(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(42309);
          int i;
          if (paramInt > 0)
          {
            i = ((Integer)l.7.this.lvs.getTag(2131820638)).intValue();
            if (i == paramInt)
            {
              l.7.this.lvs.setImageBitmap(l.a(paramBitmap, l.7.this.nXA, l.7.this.nXB, l.7.this.nXC));
              AppMethodBeat.o(42309);
            }
          }
          while (true)
          {
            return;
            ab.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss subtype: %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
            AppMethodBeat.o(42309);
            continue;
            String str = (String)l.7.this.lvs.getTag(2131820639);
            if ((!bo.isNullOrNil(paramString)) && (paramString.equals(str)))
            {
              l.7.this.lvs.setImageBitmap(l.a(paramBitmap, l.7.this.nXA, l.7.this.nXB, l.7.this.nXC));
              AppMethodBeat.o(42309);
            }
            else
            {
              ab.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", new Object[] { str, paramString });
              AppMethodBeat.o(42309);
            }
          }
        }
      });
      AppMethodBeat.o(42310);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.l.7
 * JD-Core Version:    0.6.2
 */