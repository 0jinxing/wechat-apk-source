package com.tencent.mm.loader.h;

import com.tencent.mm.loader.b.a.c;
import com.tencent.mm.loader.h.b.a;
import java.io.OutputStream;

public final class b extends f<byte[]>
{
  public String bqF;
  private f.a eRJ;

  public b(byte[] paramArrayOfByte, String paramString, f.a<byte[]> parama)
  {
    super(paramArrayOfByte);
    this.bqF = paramString;
    this.eRJ = parama;
  }

  public final a TW()
  {
    return this.eRJ.TX();
  }

  public final void a(OutputStream paramOutputStream)
  {
    c localc = c.ePl;
    c.a((byte[])this.data, paramOutputStream);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.b
 * JD-Core Version:    0.6.2
 */