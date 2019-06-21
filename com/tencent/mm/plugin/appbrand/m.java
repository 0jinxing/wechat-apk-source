package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.task.e;
import com.tencent.mm.plugin.report.service.h;

public final class m
{
  int cD;
  long[] gOU;
  int gOV;
  int gOW;
  private int gOX;
  boolean gOY;
  boolean gOZ;
  int gPa;
  int mType;

  public m()
  {
    AppMethodBeat.i(128973);
    this.gOX = 0;
    this.gOU = new long[15];
    if (e.auw())
      i = 1;
    this.gOX = i;
    AppMethodBeat.o(128973);
  }

  final void f(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    AppMethodBeat.i(128974);
    h localh = h.pYm;
    int j = this.cD;
    int k = this.mType;
    long l = this.gOU[paramInt2];
    int m = this.gOV;
    int n = this.gOX;
    int i1 = this.gOW;
    if (this.gOY)
    {
      paramInt2 = 1;
      if (!this.gOZ)
        break label225;
    }
    while (true)
    {
      localh.e(13886, new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt1), "", "", Long.valueOf(l), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(paramInt3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(this.gPa) });
      AppMethodBeat.o(128974);
      return;
      paramInt2 = 0;
      break;
      label225: i = 0;
    }
  }

  public final void y(int paramInt, long paramLong)
  {
    if ((paramInt >= this.gOU.length) || (this.gOU[paramInt] != 0L));
    while (true)
    {
      return;
      this.gOU[paramInt] = paramLong;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m
 * JD-Core Version:    0.6.2
 */