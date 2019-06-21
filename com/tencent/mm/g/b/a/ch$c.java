package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ch$c
{
  final int value;

  static
  {
    AppMethodBeat.i(128840);
    dgk = new c("ok", 0, 0);
    dgl = new c("common_fail", 1, 1);
    dgm = new c("bundle_null", 2, 2);
    dgn = new c("jsapi_control_bytes_null", 3, 3);
    dgo = new c[] { dgk, dgl, dgm, dgn };
    AppMethodBeat.o(128840);
  }

  private ch$c(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ch.c
 * JD-Core Version:    0.6.2
 */