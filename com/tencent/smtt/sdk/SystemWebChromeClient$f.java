package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class SystemWebChromeClient$f
  implements WebStorage.QuotaUpdater
{
  android.webkit.WebStorage.QuotaUpdater a;

  SystemWebChromeClient$f(SystemWebChromeClient paramSystemWebChromeClient, android.webkit.WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    this.a = paramQuotaUpdater;
  }

  public void updateQuota(long paramLong)
  {
    AppMethodBeat.i(64170);
    this.a.updateQuota(paramLong);
    AppMethodBeat.o(64170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.SystemWebChromeClient.f
 * JD-Core Version:    0.6.2
 */