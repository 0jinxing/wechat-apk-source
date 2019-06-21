package com.bumptech.glide.c.d.a;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class k
{
  private static volatile k aFA;
  private static final File aFx;
  private volatile int aFy;
  private volatile boolean aFz = true;

  static
  {
    AppMethodBeat.i(92241);
    aFx = new File("/proc/self/fd");
    AppMethodBeat.o(92241);
  }

  static k nt()
  {
    AppMethodBeat.i(92239);
    if (aFA == null);
    try
    {
      if (aFA == null)
      {
        localk = new com/bumptech/glide/c/d/a/k;
        localk.<init>();
        aFA = localk;
      }
      k localk = aFA;
      AppMethodBeat.o(92239);
      return localk;
    }
    finally
    {
      AppMethodBeat.o(92239);
    }
  }

  final boolean nu()
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(92240);
      int i = this.aFy + 1;
      this.aFy = i;
      if (i >= 50)
      {
        this.aFy = 0;
        i = aFx.list().length;
        if (i < 700)
          bool = true;
        this.aFz = bool;
        if ((!this.aFz) && (Log.isLoggable("Downsampler", 5)))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
          localStringBuilder.append(i).append(", limit 700");
        }
      }
      bool = this.aFz;
      AppMethodBeat.o(92240);
      return bool;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.k
 * JD-Core Version:    0.6.2
 */