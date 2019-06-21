package com.tencent.mm.loader.h;

import com.tencent.mm.loader.b.a.c;
import java.io.OutputStream;

public final class a extends f<String>
{
  public String bqF;
  private f.a eRJ;

  private a(String paramString1, String paramString2, f.a<String> parama)
  {
    super(paramString1);
    this.bqF = paramString2;
    this.eRJ = parama;
  }

  public static a S(String paramString1, String paramString2)
  {
    return new a(paramString1, paramString2, new a.1(paramString1));
  }

  public final com.tencent.mm.loader.h.b.a TW()
  {
    return this.eRJ.TX();
  }

  public final void a(OutputStream paramOutputStream)
  {
    c localc = c.ePl;
    c.a((String)this.data, paramOutputStream);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.a
 * JD-Core Version:    0.6.2
 */