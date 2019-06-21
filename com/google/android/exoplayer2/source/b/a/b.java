package com.google.android.exoplayer2.source.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class b extends c
{
  public final long aOz;
  public final long bif;
  public final int bjI;
  public final long bjJ;
  public final boolean bjK;
  public final int bjL;
  public final int bjM;
  public final long bjN;
  public final boolean bjO;
  public final boolean bjP;
  public final boolean bjQ;
  public final b.a bjR;
  public final List<b.a> bjS;
  public final int version;

  public b(int paramInt1, String paramString, List<String> paramList, long paramLong1, long paramLong2, boolean paramBoolean1, int paramInt2, int paramInt3, int paramInt4, long paramLong3, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, b.a parama, List<b.a> paramList1)
  {
    super(paramString, paramList);
    AppMethodBeat.i(125964);
    this.bjI = paramInt1;
    this.bif = paramLong2;
    this.bjK = paramBoolean1;
    this.bjL = paramInt2;
    this.bjM = paramInt3;
    this.version = paramInt4;
    this.bjN = paramLong3;
    this.bjO = paramBoolean2;
    this.bjP = paramBoolean3;
    this.bjQ = paramBoolean4;
    this.bjR = parama;
    this.bjS = Collections.unmodifiableList(paramList1);
    if (!paramList1.isEmpty())
    {
      paramString = (b.a)paramList1.get(paramList1.size() - 1);
      paramLong2 = paramString.bjU;
      this.aOz = (paramString.aOz + paramLong2);
      if (paramLong1 != -9223372036854775807L)
        break label166;
      paramLong2 = -9223372036854775807L;
    }
    while (true)
    {
      this.bjJ = paramLong2;
      AppMethodBeat.o(125964);
      return;
      this.aOz = 0L;
      break;
      label166: paramLong2 = paramLong1;
      if (paramLong1 < 0L)
        paramLong2 = paramLong1 + this.aOz;
    }
  }

  public final long sC()
  {
    return this.bif + this.aOz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.a.b
 * JD-Core Version:    0.6.2
 */