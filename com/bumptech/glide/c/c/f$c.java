package com.bumptech.glide.c.c;

import android.util.Log;
import com.bumptech.glide.c.a;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

final class f$c<Data>
  implements d<Data>
{
  private final f.d<Data> aDY;
  private Data data;
  private final File file;

  f$c(File paramFile, f.d<Data> paramd)
  {
    this.file = paramFile;
    this.aDY = paramd;
  }

  public final void a(g paramg, d.a<? super Data> parama)
  {
    AppMethodBeat.i(92061);
    try
    {
      this.data = this.aDY.o(this.file);
      parama.S(this.data);
      AppMethodBeat.o(92061);
      return;
    }
    catch (FileNotFoundException paramg)
    {
      while (true)
      {
        Log.isLoggable("FileLoader", 3);
        parama.b(paramg);
        AppMethodBeat.o(92061);
      }
    }
  }

  public final void cancel()
  {
  }

  public final void cleanup()
  {
    AppMethodBeat.i(92062);
    if (this.data != null);
    while (true)
    {
      try
      {
        this.aDY.R(this.data);
        AppMethodBeat.o(92062);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(92062);
    }
  }

  public final Class<Data> mg()
  {
    AppMethodBeat.i(92063);
    Class localClass = this.aDY.mg();
    AppMethodBeat.o(92063);
    return localClass;
  }

  public final a mh()
  {
    return a.ayD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.f.c
 * JD-Core Version:    0.6.2
 */