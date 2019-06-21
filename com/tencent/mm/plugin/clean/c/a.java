package com.tencent.mm.plugin.clean.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.Calendar;

public final class a
{
  public long cuQ;
  public long fXb;
  public String filePath;
  public long size;
  public String thumbPath;
  public int type;
  private String userName;

  public a(String paramString1, String paramString2, int paramInt, String paramString3, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(18663);
    this.size = e.asZ(paramString2);
    ab.v("MicroMsg.AnalyseItem", "add mst %d %d %s %s %d", new Object[] { Long.valueOf(this.size), Integer.valueOf(paramInt), bo.my(this.size), paramString3, Long.valueOf(paramLong1) });
    this.thumbPath = paramString1;
    this.type = paramInt;
    this.filePath = paramString2;
    this.userName = paramString3;
    this.cuQ = paramLong1;
    this.fXb = paramLong2;
    AppMethodBeat.o(18663);
  }

  public final long bfH()
  {
    AppMethodBeat.i(18665);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(this.fXb);
    int i = localCalendar.get(1);
    long l = localCalendar.get(2) + i * 100;
    AppMethodBeat.o(18665);
    return l;
  }

  public final String toString()
  {
    AppMethodBeat.i(18664);
    String str;
    switch (this.type)
    {
    default:
      str = "";
      AppMethodBeat.o(18664);
    case 1:
    case 3:
    case 2:
    case 4:
    }
    while (true)
    {
      return str;
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "IMG", bo.my(this.size), this.filePath });
      AppMethodBeat.o(18664);
      continue;
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "VIDEO", bo.my(this.size), this.filePath });
      AppMethodBeat.o(18664);
      continue;
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "VOICE", bo.my(this.size), this.filePath });
      AppMethodBeat.o(18664);
      continue;
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "ATTACH", bo.my(this.size), this.filePath });
      AppMethodBeat.o(18664);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.a
 * JD-Core Version:    0.6.2
 */