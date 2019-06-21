package com.tencent.mm.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class e extends g
{
  public int duk = -1;
  public String egd;
  public String[] ege;
  public String[] egf;
  public int egg;
  public int egh;
  public int egi = -1;
  public int fileType = 0;
  public String host;
  public boolean isColdSnsData;
  public String referer;
  public String signalQuality;
  public String snsCipherKey = "";
  public String snsScene;
  public String url;

  public e()
  {
    this.egv = true;
  }

  private static String h(String[] paramArrayOfString)
  {
    AppMethodBeat.i(128595);
    String str1;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      str1 = "";
      AppMethodBeat.o(128595);
    }
    while (true)
    {
      return str1;
      str1 = "";
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str2 = paramArrayOfString[j];
        str1 = str1 + str2 + ",";
      }
      AppMethodBeat.o(128595);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(128594);
    String str = String.format("mediaId:%s, url:%s, host:%s, referer:%s, savepath:%s, iplist:%s, slaveIplist:%siplistSource:%d, dcSource:%d, isColdSnsData:%b, signalQuality:%s, snsScene:%s", new Object[] { this.field_mediaId, this.url, this.host, this.referer, this.egd, h(this.ege), h(this.egf), Integer.valueOf(this.egg), Integer.valueOf(this.egh), Boolean.valueOf(this.isColdSnsData), this.signalQuality, this.snsScene });
    AppMethodBeat.o(128594);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.i.e
 * JD-Core Version:    0.6.2
 */