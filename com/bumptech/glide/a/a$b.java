package com.bumptech.glide.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;

public final class a$b
{
  final a.c axI;
  final boolean[] axJ;
  public boolean axK;

  private a$b(a parama, a.c paramc)
  {
    AppMethodBeat.i(51796);
    this.axI = paramc;
    if (paramc.axO);
    for (parama = null; ; parama = new boolean[a.f(parama)])
    {
      this.axJ = parama;
      AppMethodBeat.o(51796);
      return;
    }
  }

  public final void abort()
  {
    AppMethodBeat.i(51798);
    a.a(this.axH, this, false);
    AppMethodBeat.o(51798);
  }

  public final File lP()
  {
    AppMethodBeat.i(51797);
    synchronized (this.axH)
    {
      if (this.axI.axP != this)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>();
        AppMethodBeat.o(51797);
        throw localIllegalStateException;
      }
    }
    if (!this.axI.axO)
      this.axJ[0] = true;
    File localFile = this.axI.axN[0];
    if (!a.g(this.axH).exists())
      a.g(this.axH).mkdirs();
    AppMethodBeat.o(51797);
    return localFile;
  }

  public final void lQ()
  {
    AppMethodBeat.i(51799);
    if (!this.axK);
    while (true)
    {
      try
      {
        abort();
        AppMethodBeat.o(51799);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(51799);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.a.a.b
 * JD-Core Version:    0.6.2
 */