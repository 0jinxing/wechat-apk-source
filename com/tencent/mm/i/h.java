package com.tencent.mm.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h extends g
{
  public String cEV;
  public int cEX;
  public String cFc = "";
  public long cKK = 0L;
  public String cdx = "";
  public int concurrentCount = 1;
  public long egA;
  public String egB;
  public int egC;
  public int egD;
  public String egE;
  public int egF;
  public int egG = 0;
  public long egH = 0L;
  public int egI = 0;
  public long egJ = 0L;
  public h.a egK;
  public String[] ege;
  public String filename;
  public String host;
  public boolean isColdSnsData = false;
  public String referer;
  public String signalQuality = "";
  public String snsScene = "";
  public String url;

  public final String toString()
  {
    AppMethodBeat.i(128597);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("{");
    ((StringBuffer)localObject).append("isPlayMode: ").append(this.egD);
    ((StringBuffer)localObject).append(" videoFormat: ").append(this.field_requestVideoFormat);
    ((StringBuffer)localObject).append(" initialDownloadLength : ").append(this.initialDownloadLength);
    ((StringBuffer)localObject).append(" initialDownloadOffset : ").append(this.initialDownloadOffset);
    ((StringBuffer)localObject).append(" videoXmlTotalLen : ").append(this.egC);
    ((StringBuffer)localObject).append(" videoTaskType : ").append(this.egy);
    ((StringBuffer)localObject).append(" filename : ").append(this.filename);
    int i;
    if (Jp())
    {
      ((StringBuffer)localObject).append(" url : ").append(this.url);
      ((StringBuffer)localObject).append(" host : ").append(this.host);
      ((StringBuffer)localObject).append(" referer : ").append(this.referer);
      StringBuffer localStringBuffer = ((StringBuffer)localObject).append(" ip size : ");
      if (this.ege != null)
      {
        i = this.ege.length;
        localStringBuffer.append(i);
        ((StringBuffer)localObject).append(" isColdSnsData : ").append(this.isColdSnsData);
        ((StringBuffer)localObject).append(" signalQuality : ").append(this.signalQuality);
        ((StringBuffer)localObject).append(" snsScene : ").append(this.snsScene);
        ((StringBuffer)localObject).append(" snsId : ").append(this.cFc);
      }
    }
    while (true)
    {
      ((StringBuffer)localObject).append(" fileid : ").append(this.field_fileId);
      ((StringBuffer)localObject).append(" fileaeskey: ").append(this.field_aesKey);
      ((StringBuffer)localObject).append(" field_preloadRatio:").append(this.field_preloadRatio);
      ((StringBuffer)localObject).append(" newmd5: ").append(this.cdx);
      ((StringBuffer)localObject).append("}");
      localObject = ((StringBuffer)localObject).toString();
      AppMethodBeat.o(128597);
      return localObject;
      i = 0;
      break;
      ((StringBuffer)localObject).append(" field_mediaId : ").append(this.field_mediaId);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.i.h
 * JD-Core Version:    0.6.2
 */