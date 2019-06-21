package com.tencent.mm.plugin.appbrand.appcache.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b$a$a
{
  public final int code;

  static
  {
    AppMethodBeat.i(59555);
    gVA = new a("OK", 0, 0);
    gVB = new a("FAILED", 1, 101);
    gVC = new a("LOCAL_FILE_NOT_FOUND", 2, 102);
    gVD = new a("PKG_INTEGRITY_FAILED", 3, 104);
    gVE = new a("PKG_INVALID", 4, 105);
    gVF = new a("SEVER_FILE_NOT_FOUND", 5, 106);
    gVG = new a("DISK_FULL", 6, 110);
    gVH = new a("ENV_ERR", 7, 200);
    gVI = new a("ZSTD_OP_FAILED", 8, 301);
    gVJ = new a[] { gVA, gVB, gVC, gVD, gVE, gVF, gVG, gVH, gVI };
    AppMethodBeat.o(59555);
  }

  private b$a$a(int paramInt)
  {
    this.code = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.a.b.a.a
 * JD-Core Version:    0.6.2
 */