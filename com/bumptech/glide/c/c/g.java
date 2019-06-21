package com.bumptech.glide.c.c;

import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.URL;
import java.security.MessageDigest;

public class g
  implements com.bumptech.glide.c.h
{
  private int aBR;
  public final h aDZ;
  public final String aEa;
  public String aEb;
  public URL aEc;
  private volatile byte[] aEd;
  public final URL url;

  public g(String paramString)
  {
    this(paramString, h.aEf);
  }

  private g(String paramString, h paramh)
  {
    AppMethodBeat.i(92069);
    this.url = null;
    this.aEa = i.checkNotEmpty(paramString);
    this.aDZ = ((h)i.d(paramh, "Argument must not be null"));
    AppMethodBeat.o(92069);
  }

  public g(URL paramURL)
  {
    this(paramURL, h.aEf);
  }

  private g(URL paramURL, h paramh)
  {
    AppMethodBeat.i(92068);
    this.url = ((URL)i.d(paramURL, "Argument must not be null"));
    this.aEa = null;
    this.aDZ = ((h)i.d(paramh, "Argument must not be null"));
    AppMethodBeat.o(92068);
  }

  private String getCacheKey()
  {
    AppMethodBeat.i(92070);
    String str;
    if (this.aEa != null)
    {
      str = this.aEa;
      AppMethodBeat.o(92070);
    }
    while (true)
    {
      return str;
      str = ((URL)i.d(this.url, "Argument must not be null")).toString();
      AppMethodBeat.o(92070);
    }
  }

  public final void a(MessageDigest paramMessageDigest)
  {
    AppMethodBeat.i(92072);
    if (this.aEd == null)
      this.aEd = getCacheKey().getBytes(azc);
    paramMessageDigest.update(this.aEd);
    AppMethodBeat.o(92072);
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(92073);
    if ((paramObject instanceof g))
    {
      paramObject = (g)paramObject;
      if ((getCacheKey().equals(paramObject.getCacheKey())) && (this.aDZ.equals(paramObject.aDZ)))
      {
        bool = true;
        AppMethodBeat.o(92073);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(92073);
      continue;
      AppMethodBeat.o(92073);
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(92074);
    if (this.aBR == 0)
    {
      this.aBR = getCacheKey().hashCode();
      this.aBR = (this.aBR * 31 + this.aDZ.hashCode());
    }
    int i = this.aBR;
    AppMethodBeat.o(92074);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(92071);
    String str = getCacheKey();
    AppMethodBeat.o(92071);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.g
 * JD-Core Version:    0.6.2
 */