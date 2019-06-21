package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.n.a;

class az
  implements n.a
{
  az(TbsLogReport paramTbsLogReport)
  {
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(64480);
    TbsLog.i("TbsDownload", "[TbsApkDownloadStat.reportDownloadStat] onHttpResponseCode:".concat(String.valueOf(paramInt)));
    if (paramInt < 300)
      TbsLogReport.b(this.a);
    AppMethodBeat.o(64480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.az
 * JD-Core Version:    0.6.2
 */