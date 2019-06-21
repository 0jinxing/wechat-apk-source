package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.vv;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

@Deprecated
public final class e extends j.b
{
  private vv fLz;

  public e(String paramString, long paramLong)
  {
    super(9);
    AppMethodBeat.i(16519);
    this.fLz = new vv();
    this.fLz.wcB = new bts().alV(bo.nullAsNil(paramString));
    this.fLz.wcH.add(Integer.valueOf((int)paramLong));
    this.fLz.jBv = 1;
    this.oqT = this.fLz;
    AppMethodBeat.o(16519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.e
 * JD-Core Version:    0.6.2
 */