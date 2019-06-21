package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  int eTi;
  int eTj;
  int eTl;
  int fYx;
  int fYy;
  byte[] ovq;
  byte[] ovr;
  int ovs;
  int ovt;
  long ovu;
  int ovv;
  boolean ovw;
  boolean ovx;
  int rotate;

  public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, int paramInt6, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76570);
    this.ovs = 0;
    this.ovt = 0;
    this.ovu = bo.yz();
    this.eTl = paramInt3;
    this.eTi = paramInt4;
    this.eTj = paramInt5;
    this.fYx = paramInt1;
    this.fYy = paramInt2;
    this.ovx = paramBoolean2;
    this.ovw = paramBoolean1;
    this.rotate = paramInt6;
    this.ovq = paramArrayOfByte;
    this.ovs = paramArrayOfByte.length;
    this.ovr = j.owk.g(Integer.valueOf(paramInt4 * paramInt5 * 3 / 2));
    AppMethodBeat.o(76570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.b
 * JD-Core Version:    0.6.2
 */