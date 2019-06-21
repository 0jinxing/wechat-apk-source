package com.bumptech.glide.c.b;

import com.bumptech.glide.c.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;

final class c
  implements h
{
  private final h aAb;
  private final h azW;

  c(h paramh1, h paramh2)
  {
    this.azW = paramh1;
    this.aAb = paramh2;
  }

  public final void a(MessageDigest paramMessageDigest)
  {
    AppMethodBeat.i(91761);
    this.azW.a(paramMessageDigest);
    this.aAb.a(paramMessageDigest);
    AppMethodBeat.o(91761);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(91758);
    if ((paramObject instanceof c))
    {
      paramObject = (c)paramObject;
      if ((this.azW.equals(paramObject.azW)) && (this.aAb.equals(paramObject.aAb)))
      {
        bool = true;
        AppMethodBeat.o(91758);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(91758);
      continue;
      AppMethodBeat.o(91758);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(91759);
    int i = this.azW.hashCode();
    int j = this.aAb.hashCode();
    AppMethodBeat.o(91759);
    return i * 31 + j;
  }

  public final String toString()
  {
    AppMethodBeat.i(91760);
    String str = "DataCacheKey{sourceKey=" + this.azW + ", signature=" + this.aAb + '}';
    AppMethodBeat.o(91760);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.c
 * JD-Core Version:    0.6.2
 */