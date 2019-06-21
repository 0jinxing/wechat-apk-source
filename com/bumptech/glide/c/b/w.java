package com.bumptech.glide.c.b;

import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.c.h;
import com.bumptech.glide.c.m;
import com.bumptech.glide.h.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class w
  implements h
{
  private static final f<Class<?>, byte[]> aCi;
  private final h aAb;
  private final com.bumptech.glide.c.j aAd;
  private final Class<?> aCj;
  private final m<?> aCk;
  private final b awk;
  private final h azW;
  private final int height;
  private final int width;

  static
  {
    AppMethodBeat.i(91886);
    aCi = new f(50L);
    AppMethodBeat.o(91886);
  }

  w(b paramb, h paramh1, h paramh2, int paramInt1, int paramInt2, m<?> paramm, Class<?> paramClass, com.bumptech.glide.c.j paramj)
  {
    this.awk = paramb;
    this.azW = paramh1;
    this.aAb = paramh2;
    this.width = paramInt1;
    this.height = paramInt2;
    this.aCk = paramm;
    this.aCj = paramClass;
    this.aAd = paramj;
  }

  public final void a(MessageDigest paramMessageDigest)
  {
    AppMethodBeat.i(91884);
    byte[] arrayOfByte1 = (byte[])this.awk.o([B.class);
    ByteBuffer.wrap(arrayOfByte1).putInt(this.width).putInt(this.height).array();
    this.aAb.a(paramMessageDigest);
    this.azW.a(paramMessageDigest);
    paramMessageDigest.update(arrayOfByte1);
    if (this.aCk != null)
      this.aCk.a(paramMessageDigest);
    this.aAd.a(paramMessageDigest);
    byte[] arrayOfByte2 = (byte[])aCi.get(this.aCj);
    byte[] arrayOfByte3 = arrayOfByte2;
    if (arrayOfByte2 == null)
    {
      arrayOfByte3 = this.aCj.getName().getBytes(azc);
      aCi.put(this.aCj, arrayOfByte3);
    }
    paramMessageDigest.update(arrayOfByte3);
    this.awk.put(arrayOfByte1);
    AppMethodBeat.o(91884);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(91882);
    if ((paramObject instanceof w))
    {
      paramObject = (w)paramObject;
      if ((this.height == paramObject.height) && (this.width == paramObject.width) && (com.bumptech.glide.h.j.h(this.aCk, paramObject.aCk)) && (this.aCj.equals(paramObject.aCj)) && (this.azW.equals(paramObject.azW)) && (this.aAb.equals(paramObject.aAb)) && (this.aAd.equals(paramObject.aAd)))
      {
        bool = true;
        AppMethodBeat.o(91882);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(91882);
      continue;
      AppMethodBeat.o(91882);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(91883);
    int i = ((this.azW.hashCode() * 31 + this.aAb.hashCode()) * 31 + this.width) * 31 + this.height;
    int j = i;
    if (this.aCk != null)
      j = i * 31 + this.aCk.hashCode();
    i = this.aCj.hashCode();
    int k = this.aAd.hashCode();
    AppMethodBeat.o(91883);
    return (j * 31 + i) * 31 + k;
  }

  public final String toString()
  {
    AppMethodBeat.i(91885);
    String str = "ResourceCacheKey{sourceKey=" + this.azW + ", signature=" + this.aAb + ", width=" + this.width + ", height=" + this.height + ", decodedResourceClass=" + this.aCj + ", transformation='" + this.aCk + '\'' + ", options=" + this.aAd + '}';
    AppMethodBeat.o(91885);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.w
 * JD-Core Version:    0.6.2
 */