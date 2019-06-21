package com.bumptech.glide.c.b;

import android.support.v4.f.k.a;
import com.bumptech.glide.h.a.a;
import com.bumptech.glide.h.a.a.c;
import com.bumptech.glide.h.a.b;
import com.bumptech.glide.h.a.b.a;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class t<Z>
  implements u<Z>, a.c
{
  private static final k.a<t<?>> aCd;
  private final b aAq;
  private boolean aBU;
  private u<Z> aCe;
  private boolean aCf;

  static
  {
    AppMethodBeat.i(91876);
    aCd = a.a(20, new t.1());
    AppMethodBeat.o(91876);
  }

  t()
  {
    AppMethodBeat.i(91870);
    this.aAq = new b.a();
    AppMethodBeat.o(91870);
  }

  static <Z> t<Z> d(u<Z> paramu)
  {
    AppMethodBeat.i(91869);
    t localt = (t)i.d((t)aCd.aA(), "Argument must not be null");
    localt.aBU = false;
    localt.aCf = true;
    localt.aCe = paramu;
    AppMethodBeat.o(91869);
    return localt;
  }

  public final Z get()
  {
    AppMethodBeat.i(91873);
    Object localObject = this.aCe.get();
    AppMethodBeat.o(91873);
    return localObject;
  }

  public final int getSize()
  {
    AppMethodBeat.i(91874);
    int i = this.aCe.getSize();
    AppMethodBeat.o(91874);
    return i;
  }

  public final Class<Z> mK()
  {
    AppMethodBeat.i(91872);
    Class localClass = this.aCe.mK();
    AppMethodBeat.o(91872);
    return localClass;
  }

  public final b my()
  {
    return this.aAq;
  }

  public final void recycle()
  {
    try
    {
      AppMethodBeat.i(91875);
      this.aAq.oq();
      this.aBU = true;
      if (!this.aCf)
      {
        this.aCe.recycle();
        this.aCe = null;
        aCd.release(this);
      }
      AppMethodBeat.o(91875);
      return;
    }
    finally
    {
    }
  }

  final void unlock()
  {
    try
    {
      AppMethodBeat.i(91871);
      this.aAq.oq();
      if (!this.aCf)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Already unlocked");
        AppMethodBeat.o(91871);
        throw localIllegalStateException;
      }
    }
    finally
    {
    }
    this.aCf = false;
    if (this.aBU)
      recycle();
    AppMethodBeat.o(91871);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.t
 * JD-Core Version:    0.6.2
 */