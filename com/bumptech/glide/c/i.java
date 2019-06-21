package com.bumptech.glide.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;

public final class i<T>
{
  private static final a<Object> azd;
  final T aze;
  final a<T> azf;
  volatile byte[] azg;
  final String key;

  static
  {
    AppMethodBeat.i(91686);
    azd = new i.1();
    AppMethodBeat.o(91686);
  }

  private i(String paramString, T paramT, a<T> parama)
  {
    AppMethodBeat.i(91682);
    this.key = com.bumptech.glide.h.i.checkNotEmpty(paramString);
    this.aze = paramT;
    this.azf = ((a)com.bumptech.glide.h.i.d(parama, "Argument must not be null"));
    AppMethodBeat.o(91682);
  }

  public static <T> i<T> Z(String paramString)
  {
    AppMethodBeat.i(91679);
    paramString = new i(paramString, null, azd);
    AppMethodBeat.o(91679);
    return paramString;
  }

  public static <T> i<T> a(String paramString, T paramT, a<T> parama)
  {
    AppMethodBeat.i(91681);
    paramString = new i(paramString, paramT, parama);
    AppMethodBeat.o(91681);
    return paramString;
  }

  public static <T> i<T> c(String paramString, T paramT)
  {
    AppMethodBeat.i(91680);
    paramString = new i(paramString, paramT, azd);
    AppMethodBeat.o(91680);
    return paramString;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(91683);
    boolean bool;
    if ((paramObject instanceof i))
    {
      paramObject = (i)paramObject;
      bool = this.key.equals(paramObject.key);
      AppMethodBeat.o(91683);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91683);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(91684);
    int i = this.key.hashCode();
    AppMethodBeat.o(91684);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(91685);
    String str = "Option{key='" + this.key + '\'' + '}';
    AppMethodBeat.o(91685);
    return str;
  }

  public static abstract interface a<T>
  {
    public abstract void a(byte[] paramArrayOfByte, T paramT, MessageDigest paramMessageDigest);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.i
 * JD-Core Version:    0.6.2
 */