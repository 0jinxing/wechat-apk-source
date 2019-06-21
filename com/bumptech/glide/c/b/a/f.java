package com.bumptech.glide.c.b.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class f
  implements e
{
  public final Bitmap c(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91912);
    paramConfig = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
    AppMethodBeat.o(91912);
    return paramConfig;
  }

  public void g(Bitmap paramBitmap)
  {
    AppMethodBeat.i(91911);
    paramBitmap.recycle();
    AppMethodBeat.o(91911);
  }

  public final Bitmap h(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91913);
    paramConfig = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
    AppMethodBeat.o(91913);
    return paramConfig;
  }

  public final void mO()
  {
  }

  public final void trimMemory(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.f
 * JD-Core Version:    0.6.2
 */