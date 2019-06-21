package com.tencent.mm.game.report.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  public int eBH;
  public String eBI;

  public d()
  {
  }

  public d(int paramInt, String paramString)
  {
    this.eBH = paramInt;
    this.eBI = paramString;
  }

  public static d b(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(128610);
    d locald = new d();
    locald.eBH = paramInt;
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayOfObject.length - 1;
    for (int j = 0; j < i; j++)
      localStringBuilder.append(String.valueOf(paramArrayOfObject[j])).append(',');
    localStringBuilder.append(String.valueOf(paramArrayOfObject[i]));
    locald.eBI = localStringBuilder.toString();
    ab.d("MicroMsg.GameReportInfo", "appStat logID=%d, vals.size=%d, val = %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfObject.length), localStringBuilder.toString() });
    AppMethodBeat.o(128610);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.api.d
 * JD-Core Version:    0.6.2
 */