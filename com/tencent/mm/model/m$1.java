package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ay.a;
import com.tencent.mm.ay.a.a;
import com.tencent.mm.ay.e;
import com.tencent.mm.storage.bi;
import java.util.Map;

public final class m$1 extends a.a
{
  public final a a(Map<String, String> paramMap, bi parambi)
  {
    AppMethodBeat.i(5501);
    paramMap = new e(paramMap, parambi);
    AppMethodBeat.o(5501);
    return paramMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.m.1
 * JD-Core Version:    0.6.2
 */