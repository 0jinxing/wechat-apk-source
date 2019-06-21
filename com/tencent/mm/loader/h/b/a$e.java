package com.tencent.mm.loader.h.b;

import java.io.InputStream;

final class a$e
  implements d
{
  InputStream eSf;

  public a$e(InputStream paramInputStream)
  {
    this.eSf = paramInputStream;
  }

  public final InputStream Uj()
  {
    return this.eSf;
  }

  public final void close()
  {
    a.s(this.eSf);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.b.a.e
 * JD-Core Version:    0.6.2
 */