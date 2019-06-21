package com.tencent.mm.insane_statistic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.at.e;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.bi;

final class b$a
{
  bi csG;
  long eFm;
  int eFn;
  e eFo;
  String eFp;
  boolean eFq;
  String eFr;
  int eFs;
  d eFt;
  boolean eFu;
  c eFv;
  c eFw;
  final b ehh;

  b$a(long paramLong, bi parambi, b paramb, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(16180);
    this.csG = null;
    this.eFq = false;
    this.eFs = 0;
    this.eFu = false;
    this.eFv = new b.a.1(this);
    this.eFw = new b.a.2(this);
    this.eFm = paramLong;
    this.csG = parambi;
    this.ehh = paramb;
    this.eFn = paramInt;
    this.eFu = paramBoolean;
    AppMethodBeat.o(16180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.insane_statistic.b.a
 * JD-Core Version:    0.6.2
 */