package com.bumptech.glide.c.b.b;

import android.annotation.SuppressLint;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.h.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g extends f<com.bumptech.glide.c.h, u<?>>
  implements h
{
  private h.a aDi;

  public g(long paramLong)
  {
    super(paramLong);
  }

  public final void a(h.a parama)
  {
    this.aDi = parama;
  }

  @SuppressLint({"InlinedApi"})
  public final void trimMemory(int paramInt)
  {
    AppMethodBeat.i(91987);
    if (paramInt >= 40)
    {
      mO();
      AppMethodBeat.o(91987);
    }
    while (true)
    {
      return;
      if ((paramInt >= 20) || (paramInt == 15))
        p(ol() / 2L);
      AppMethodBeat.o(91987);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.g
 * JD-Core Version:    0.6.2
 */