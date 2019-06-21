package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

public final class e
{
  String bOr;
  String hvr;
  int ioJ;
  byte[] ioK;
  d.a ioL;
  Map<String, String> ioM;
  ArrayList<String> ioN;
  int ioO;
  String ioP;
  HttpURLConnection ioQ;
  String ioR;
  String mUrl;
  private long startTime;

  public e(String paramString1, byte[] paramArrayOfByte, int paramInt, d.a parama, String paramString2)
  {
    AppMethodBeat.i(108159);
    this.ioO = 15;
    this.mUrl = paramString1;
    this.ioK = paramArrayOfByte;
    this.ioL = parama;
    this.ioJ = paramInt;
    this.bOr = paramString2;
    this.startTime = System.currentTimeMillis();
    AppMethodBeat.o(108159);
  }

  public final int aID()
  {
    AppMethodBeat.i(108160);
    int i = (int)(System.currentTimeMillis() - this.startTime);
    AppMethodBeat.o(108160);
    return i;
  }

  public final long getDataSize()
  {
    if (this.ioK != null);
    for (long l = this.ioK.length; ; l = 0L)
      return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.e
 * JD-Core Version:    0.6.2
 */