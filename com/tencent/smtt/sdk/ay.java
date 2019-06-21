package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.n.a;

class ay
  implements n.a
{
  ay(TbsLogReport paramTbsLogReport)
  {
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(64479);
    TbsLog.i("TbsDownload", "[TbsApkDownloadStat.reportTbsLog] httpResponseCode=".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(64479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ay
 * JD-Core Version:    0.6.2
 */