package com.bumptech.glide.c.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public final class f<Data>
  implements n<File, Data>
{
  private final f.d<Data> aDX;

  public f(f.d<Data> paramd)
  {
    this.aDX = paramd;
  }

  public static class a<Data>
    implements o<File, Data>
  {
    private final f.d<Data> aDY;

    public a(f.d<Data> paramd)
    {
      this.aDY = paramd;
    }

    public final n<File, Data> a(r paramr)
    {
      AppMethodBeat.i(92057);
      paramr = new f(this.aDY);
      AppMethodBeat.o(92057);
      return paramr;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.f
 * JD-Core Version:    0.6.2
 */