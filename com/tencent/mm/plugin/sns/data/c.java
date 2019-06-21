package com.tencent.mm.plugin.sns.data;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public e qFJ;
  public SparseArray<e> qFK;
  public int requestType;

  public c()
  {
    AppMethodBeat.i(35787);
    this.qFK = new SparseArray();
    AppMethodBeat.o(35787);
  }

  public c(SparseArray<e> paramSparseArray)
  {
    this.qFK = paramSparseArray;
    this.requestType = 9;
  }

  public c(e parame, int paramInt)
  {
    this.qFJ = parame;
    this.requestType = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.data.c
 * JD-Core Version:    0.6.2
 */