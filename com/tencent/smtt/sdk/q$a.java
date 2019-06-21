package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.QuotaUpdater;

class q$a
  implements WebStorage.QuotaUpdater
{
  QuotaUpdater a;

  q$a(q paramq, QuotaUpdater paramQuotaUpdater)
  {
    this.a = paramQuotaUpdater;
  }

  public void updateQuota(long paramLong)
  {
    AppMethodBeat.i(64091);
    this.a.updateQuota(paramLong);
    AppMethodBeat.o(64091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.q.a
 * JD-Core Version:    0.6.2
 */