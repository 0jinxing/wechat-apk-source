package com.bumptech.glide.c;

import android.support.v4.f.a;
import com.bumptech.glide.h.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;

public final class j
  implements h
{
  public final a<i<?>, Object> azh;

  public j()
  {
    AppMethodBeat.i(91687);
    this.azh = new b();
    AppMethodBeat.o(91687);
  }

  public final <T> T a(i<T> parami)
  {
    AppMethodBeat.i(91689);
    if (this.azh.containsKey(parami))
    {
      parami = this.azh.get(parami);
      AppMethodBeat.o(91689);
    }
    while (true)
    {
      return parami;
      parami = parami.aze;
      AppMethodBeat.o(91689);
    }
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(91688);
    this.azh.a(paramj.azh);
    AppMethodBeat.o(91688);
  }

  public final void a(MessageDigest paramMessageDigest)
  {
    AppMethodBeat.i(91692);
    for (int i = 0; i < this.azh.size(); i++)
    {
      i locali = (i)this.azh.keyAt(i);
      Object localObject = this.azh.valueAt(i);
      i.a locala = locali.azf;
      if (locali.azg == null)
        locali.azg = locali.key.getBytes(h.azc);
      locala.a(locali.azg, localObject, paramMessageDigest);
    }
    AppMethodBeat.o(91692);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(91690);
    boolean bool;
    if ((paramObject instanceof j))
    {
      paramObject = (j)paramObject;
      bool = this.azh.equals(paramObject.azh);
      AppMethodBeat.o(91690);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91690);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(91691);
    int i = this.azh.hashCode();
    AppMethodBeat.o(91691);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(91693);
    String str = "Options{values=" + this.azh + '}';
    AppMethodBeat.o(91693);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.j
 * JD-Core Version:    0.6.2
 */