package com.tencent.pb.common.c;

import com.tencent.pb.common.b.a;

final class f$1
  implements a
{
  public final void eM(String paramString, int paramInt)
  {
    if ("CsCmd.Cmd_CSClientReportReq".equals(paramString))
    {
      if (paramInt == 0)
        f.clearData();
      c.w("yunying", new Object[] { "reportStatisticsData isCommonData:  errCode: ".concat(String.valueOf(paramInt)) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.c.f.1
 * JD-Core Version:    0.6.2
 */