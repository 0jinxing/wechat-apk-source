package com.tencent.mm.plugin.webview.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public enum a
{
  static
  {
    AppMethodBeat.i(10131);
    uKJ = new a("INSTANCE");
    uKK = new a[] { uKJ };
    AppMethodBeat.o(10131);
  }

  public static void a(String paramString, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(10130);
    if (paramLong <= 0L)
      AppMethodBeat.o(10130);
    while (true)
    {
      return;
      paramLong = System.currentTimeMillis() - paramLong;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString).append(",");
      localStringBuilder.append(paramInt2).append(",");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(",").append(paramInt3).append(",").append(paramLong).append(",").append(paramInt4).append(",").append(paramInt5);
      ab.i("MicroMsg.AuthReport", localStringBuilder.toString());
      h.pYm.e(16488, new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Long.valueOf(paramLong), Integer.valueOf(paramInt4), Integer.valueOf(0), Integer.valueOf(paramInt5) });
      AppMethodBeat.o(10130);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.e.a
 * JD-Core Version:    0.6.2
 */