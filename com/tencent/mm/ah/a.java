package com.tencent.mm.ah;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.cache.e.a;
import com.tencent.mm.memory.a.c;

public final class a
{
  f<String, Bitmap> fra;

  public a(int paramInt)
  {
    AppMethodBeat.i(77829);
    this.fra = new c(paramInt);
    AppMethodBeat.o(77829);
  }

  public final void d(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(77830);
    if (this.fra != null)
    {
      this.fra.k(paramString, paramBitmap);
      AppMethodBeat.o(77830);
    }
    while (true)
    {
      return;
      e.a.a("avatar_cache", paramString, paramBitmap);
      AppMethodBeat.o(77830);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.a
 * JD-Core Version:    0.6.2
 */