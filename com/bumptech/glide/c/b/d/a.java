package com.bumptech.glide.c.b.d;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.c.b;
import com.bumptech.glide.c.b.a.e;
import com.bumptech.glide.c.b.b.h;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private final b aDL;
  private final e awf;
  private final h awg;
  private final Handler handler;

  public a(h paramh, e parame, b paramb)
  {
    AppMethodBeat.i(92029);
    this.handler = new Handler(Looper.getMainLooper());
    this.awg = paramh;
    this.awf = parame;
    this.aDL = paramb;
    AppMethodBeat.o(92029);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.d.a
 * JD-Core Version:    0.6.2
 */