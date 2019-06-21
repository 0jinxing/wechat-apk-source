package com.bumptech.glide.g;

import com.bumptech.glide.c.h;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;

public final class b
  implements h
{
  private final Object object;

  public b(Object paramObject)
  {
    AppMethodBeat.i(92537);
    this.object = i.d(paramObject, "Argument must not be null");
    AppMethodBeat.o(92537);
  }

  public final void a(MessageDigest paramMessageDigest)
  {
    AppMethodBeat.i(92541);
    paramMessageDigest.update(this.object.toString().getBytes(azc));
    AppMethodBeat.o(92541);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(92539);
    boolean bool;
    if ((paramObject instanceof b))
    {
      paramObject = (b)paramObject;
      bool = this.object.equals(paramObject.object);
      AppMethodBeat.o(92539);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92539);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(92540);
    int i = this.object.hashCode();
    AppMethodBeat.o(92540);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(92538);
    String str = "ObjectKey{object=" + this.object + '}';
    AppMethodBeat.o(92538);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.g.b
 * JD-Core Version:    0.6.2
 */