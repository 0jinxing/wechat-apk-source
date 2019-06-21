package com.tencent.mm.loader.h.b;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class a$d
  implements d
{
  InputStream azv = null;
  byte[] mBuf;

  public a$d(byte[] paramArrayOfByte)
  {
    this.mBuf = paramArrayOfByte;
  }

  public final InputStream Uj()
  {
    if (this.azv == null)
      this.azv = new ByteArrayInputStream(this.mBuf);
    return this.azv;
  }

  public final void close()
  {
    a.s(this.azv);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.b.a.d
 * JD-Core Version:    0.6.2
 */