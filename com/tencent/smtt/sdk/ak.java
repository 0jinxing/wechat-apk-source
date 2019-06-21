package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.n.a;
import java.util.Map;

final class ak
  implements n.a
{
  ak(TbsDownloadConfig paramTbsDownloadConfig, boolean paramBoolean)
  {
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(64347);
    long l = System.currentTimeMillis();
    this.a.a.put("last_check", Long.valueOf(l));
    this.a.commit();
    TbsLog.i("TbsDownload", "[TbsDownloader.sendRequest] httpResponseCode=".concat(String.valueOf(paramInt)));
    if ((TbsShareManager.isThirdPartyApp(TbsDownloader.a())) && (paramInt == 200))
    {
      this.a.a.put("last_request_success", Long.valueOf(System.currentTimeMillis()));
      this.a.a.put("request_fail", Long.valueOf(0L));
      this.a.a.put("count_request_fail_in_24hours", Long.valueOf(0L));
      this.a.commit();
    }
    if (paramInt >= 300)
      if (this.b)
      {
        this.a.setDownloadInterruptCode(-107);
        AppMethodBeat.o(64347);
      }
    while (true)
    {
      return;
      this.a.setDownloadInterruptCode(-207);
      AppMethodBeat.o(64347);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ak
 * JD-Core Version:    0.6.2
 */