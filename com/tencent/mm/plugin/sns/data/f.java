package com.tencent.mm.plugin.sns.data;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.storage.az;

public final class f
{
  public String cFc;
  public bau cNr;
  public String key;
  public String qFR;
  public String qFS;
  public az qFT;
  public SparseArray<bau> qFU;
  public int requestType;

  public f()
  {
    AppMethodBeat.i(35799);
    this.qFU = new SparseArray();
    AppMethodBeat.o(35799);
  }

  public f(bau parambau, int paramInt, String paramString1, az paramaz, String paramString2, String paramString3)
  {
    this.cNr = parambau;
    this.requestType = paramInt;
    this.qFT = paramaz;
    this.key = paramString1;
    this.qFR = paramString2;
    this.qFS = paramString3;
  }

  public f(String paramString1, SparseArray<bau> paramSparseArray, String paramString2, az paramaz)
  {
    this.cFc = paramString1;
    this.qFU = paramSparseArray;
    this.requestType = 9;
    this.key = paramString2;
    this.qFT = paramaz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.data.f
 * JD-Core Version:    0.6.2
 */