package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

public final class h
{
  String hvr;
  int ioJ;
  Map<String, String> ioM;
  ArrayList<String> ioN;
  int ioO;
  HttpURLConnection ioQ;
  String ioR;
  Map<String, String> ioX;
  g.a ioY;
  public volatile boolean isRunning;
  String mFileName;
  String mFilepath;
  String mMimeType;
  String mName;
  String mUrl;
  private long startTime;

  h(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5, g.a parama)
  {
    AppMethodBeat.i(108178);
    this.isRunning = false;
    this.ioO = 15;
    this.ioQ = null;
    this.mFilepath = paramString1;
    this.mUrl = paramString2;
    this.ioY = parama;
    this.mName = paramString3;
    this.mFileName = paramString4;
    this.ioJ = paramInt;
    this.mMimeType = paramString5;
    this.startTime = System.currentTimeMillis();
    AppMethodBeat.o(108178);
  }

  public final int aID()
  {
    AppMethodBeat.i(108179);
    int i = (int)(System.currentTimeMillis() - this.startTime);
    AppMethodBeat.o(108179);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.h
 * JD-Core Version:    0.6.2
 */