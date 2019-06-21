package com.bumptech.glide.c.b.b;

import android.support.v4.f.k.a;
import com.bumptech.glide.c.h;
import com.bumptech.glide.h.a.a;
import com.bumptech.glide.h.f;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;

public final class j
{
  private final f<h, String> aDv;
  private final k.a<j.a> aDw;

  public j()
  {
    AppMethodBeat.i(91999);
    this.aDv = new f(1000L);
    this.aDw = a.a(10, new j.1(this));
    AppMethodBeat.o(91999);
  }

  private String d(h paramh)
  {
    AppMethodBeat.i(92001);
    j.a locala = (j.a)i.d(this.aDw.aA(), "Argument must not be null");
    try
    {
      paramh.a(locala.aDy);
      paramh = com.bumptech.glide.h.j.i(locala.aDy.digest());
      return paramh;
    }
    finally
    {
      this.aDw.release(locala);
      AppMethodBeat.o(92001);
    }
    throw paramh;
  }

  public final String c(h paramh)
  {
    AppMethodBeat.i(92000);
    synchronized (this.aDv)
    {
      ??? = (String)this.aDv.get(paramh);
      ??? = ???;
      if (??? == null)
        ??? = d(paramh);
    }
    synchronized (this.aDv)
    {
      this.aDv.put(paramh, ???);
      AppMethodBeat.o(92000);
      return ???;
      paramh = finally;
      AppMethodBeat.o(92000);
      throw paramh;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.j
 * JD-Core Version:    0.6.2
 */