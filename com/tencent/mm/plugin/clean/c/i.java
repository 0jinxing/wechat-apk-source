package com.tencent.mm.plugin.clean.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.f.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public final class i
{
  public long cuQ;
  public long fXb;
  public String filePath;
  public List<a> kwH;
  public long size;
  public String thumbPath;
  public int type;
  public String userName;

  public i()
  {
    AppMethodBeat.i(18715);
    this.kwH = new ArrayList();
    AppMethodBeat.o(18715);
  }

  public final long bfH()
  {
    AppMethodBeat.i(18717);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(this.fXb);
    int i = localCalendar.get(1);
    long l = localCalendar.get(2) + i * 100;
    AppMethodBeat.o(18717);
    return l;
  }

  public final String toString()
  {
    AppMethodBeat.i(18716);
    String str;
    switch (this.type)
    {
    default:
      str = "";
      AppMethodBeat.o(18716);
    case 1:
    case 3:
    case 2:
    case 4:
    }
    while (true)
    {
      return str;
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "IMG", bo.my(this.size), this.filePath });
      AppMethodBeat.o(18716);
      continue;
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "VIDEO", bo.my(this.size), this.filePath });
      AppMethodBeat.o(18716);
      continue;
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "VOICE", bo.my(this.size), this.filePath });
      AppMethodBeat.o(18716);
      continue;
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "ATTACH", bo.my(this.size), this.filePath });
      AppMethodBeat.o(18716);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.i
 * JD-Core Version:    0.6.2
 */