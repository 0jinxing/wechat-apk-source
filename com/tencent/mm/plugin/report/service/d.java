package com.tencent.mm.plugin.report.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class d
{
  public String cvZ;
  public long pXP;
  public long pXQ;
  public String pXR;
  public boolean pXS;
  public String value;

  public d()
  {
  }

  public d(long paramLong1, String paramString, long paramLong2, boolean paramBoolean)
  {
    AppMethodBeat.i(72719);
    this.pXP = paramLong1;
    this.value = paramString;
    this.pXQ = paramLong2;
    this.pXS = paramBoolean;
    this.pXR = new SimpleDateFormat("[yy-MM-dd HH:mm:ss:SSS]").format(new Date(paramLong2));
    AppMethodBeat.o(72719);
  }

  public final String toString()
  {
    AppMethodBeat.i(72720);
    String str = this.pXR + ":" + this.value;
    AppMethodBeat.o(72720);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.d
 * JD-Core Version:    0.6.2
 */