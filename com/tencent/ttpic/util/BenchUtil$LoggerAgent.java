package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;

public class BenchUtil$LoggerAgent
{
  public void d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(83809);
    if (BenchUtil.ENABLE_LOG)
      LogUtils.d(paramString1, paramString2);
    AppMethodBeat.o(83809);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.BenchUtil.LoggerAgent
 * JD-Core Version:    0.6.2
 */