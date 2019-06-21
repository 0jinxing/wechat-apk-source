package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class RetrieveDataManager$1 extends ThreadLocal<RetrieveDataManager>
{
  protected final RetrieveDataManager initialValue()
  {
    AppMethodBeat.i(83964);
    RetrieveDataManager localRetrieveDataManager = new RetrieveDataManager();
    AppMethodBeat.o(83964);
    return localRetrieveDataManager;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.RetrieveDataManager.1
 * JD-Core Version:    0.6.2
 */