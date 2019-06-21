package com.bumptech.glide.h.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a extends b
{
  private volatile boolean aAP;

  public b$a()
  {
    super((byte)0);
  }

  public final void ay(boolean paramBoolean)
  {
    this.aAP = paramBoolean;
  }

  public final void oq()
  {
    AppMethodBeat.i(92626);
    if (this.aAP)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Already released");
      AppMethodBeat.o(92626);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(92626);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.a.b.a
 * JD-Core Version:    0.6.2
 */