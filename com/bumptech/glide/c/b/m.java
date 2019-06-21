package com.bumptech.glide.c.b;

import com.bumptech.glide.c.h;
import com.bumptech.glide.c.j;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;
import java.util.Map;

final class m
  implements h
{
  private final h aAb;
  private final j aAd;
  private final Class<?> aAf;
  private final Map<Class<?>, com.bumptech.glide.c.m<?>> aAh;
  private int aBR;
  private final Class<?> awY;
  private final Object axb;
  private final int height;
  private final int width;

  m(Object paramObject, h paramh, int paramInt1, int paramInt2, Map<Class<?>, com.bumptech.glide.c.m<?>> paramMap, Class<?> paramClass1, Class<?> paramClass2, j paramj)
  {
    AppMethodBeat.i(91832);
    this.axb = i.d(paramObject, "Argument must not be null");
    this.aAb = ((h)i.d(paramh, "Signature must not be null"));
    this.width = paramInt1;
    this.height = paramInt2;
    this.aAh = ((Map)i.d(paramMap, "Argument must not be null"));
    this.aAf = ((Class)i.d(paramClass1, "Resource class must not be null"));
    this.awY = ((Class)i.d(paramClass2, "Transcode class must not be null"));
    this.aAd = ((j)i.d(paramj, "Argument must not be null"));
    AppMethodBeat.o(91832);
  }

  public final void a(MessageDigest paramMessageDigest)
  {
    AppMethodBeat.i(91836);
    paramMessageDigest = new UnsupportedOperationException();
    AppMethodBeat.o(91836);
    throw paramMessageDigest;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(91833);
    if ((paramObject instanceof m))
    {
      paramObject = (m)paramObject;
      if ((this.axb.equals(paramObject.axb)) && (this.aAb.equals(paramObject.aAb)) && (this.height == paramObject.height) && (this.width == paramObject.width) && (this.aAh.equals(paramObject.aAh)) && (this.aAf.equals(paramObject.aAf)) && (this.awY.equals(paramObject.awY)) && (this.aAd.equals(paramObject.aAd)))
      {
        bool = true;
        AppMethodBeat.o(91833);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(91833);
      continue;
      AppMethodBeat.o(91833);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(91834);
    if (this.aBR == 0)
    {
      this.aBR = this.axb.hashCode();
      this.aBR = (this.aBR * 31 + this.aAb.hashCode());
      this.aBR = (this.aBR * 31 + this.width);
      this.aBR = (this.aBR * 31 + this.height);
      this.aBR = (this.aBR * 31 + this.aAh.hashCode());
      this.aBR = (this.aBR * 31 + this.aAf.hashCode());
      this.aBR = (this.aBR * 31 + this.awY.hashCode());
      this.aBR = (this.aBR * 31 + this.aAd.hashCode());
    }
    int i = this.aBR;
    AppMethodBeat.o(91834);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(91835);
    String str = "EngineKey{model=" + this.axb + ", width=" + this.width + ", height=" + this.height + ", resourceClass=" + this.aAf + ", transcodeClass=" + this.awY + ", signature=" + this.aAb + ", hashCode=" + this.aBR + ", transformations=" + this.aAh + ", options=" + this.aAd + '}';
    AppMethodBeat.o(91835);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.m
 * JD-Core Version:    0.6.2
 */