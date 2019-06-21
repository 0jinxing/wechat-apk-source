package com.tencent.mm.emoji.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

public final class a
{
  private static a ezj;
  public int clickCount;
  public long ezk;
  public int ezl;
  public int ezm;
  public int ezn;
  public int scene;

  public static a OZ()
  {
    AppMethodBeat.i(62267);
    if (ezj == null)
      ezj = new a();
    a locala = ezj;
    AppMethodBeat.o(62267);
    return locala;
  }

  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(62268);
    long l1 = System.currentTimeMillis();
    long l2 = this.ezk;
    this.clickCount += 1;
    h.pYm.e(16029, new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(this.scene), Long.valueOf(l1 - l2), Integer.valueOf(this.clickCount), Boolean.valueOf(paramBoolean), Integer.valueOf(this.ezl), Integer.valueOf(this.ezm), Integer.valueOf(paramInt), Integer.valueOf(this.ezn) });
    AppMethodBeat.o(62268);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.c.a
 * JD-Core Version:    0.6.2
 */