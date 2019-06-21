package com.tencent.mm.plugin.fts;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Set;

final class c$3
  implements c.c
{
  c$3(c paramc, ImageView paramImageView, Context paramContext)
  {
  }

  public final void aK(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(136524);
    ab.v("MicroMsg.FTS.FTSImageLoader", "LoadBitmapJob finish: %s %b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    c.b(this.mAW).remove(paramString);
    if (!paramBoolean)
      AppMethodBeat.o(136524);
    while (true)
    {
      return;
      Bitmap localBitmap = c.a(this.mAW, paramString);
      if (paramString.equals(this.mAX.getTag()))
        c.c(this.mAW).post(new c.3.1(this, paramString, localBitmap));
      AppMethodBeat.o(136524);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.c.3
 * JD-Core Version:    0.6.2
 */