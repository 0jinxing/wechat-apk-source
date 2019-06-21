package com.tencent.mm.sdk.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b$b
{
  public int azs;
  public String host;
  public int pub = 0;
  public Map<String, String> puc = null;
  public Map<String, String> pud = null;
  public String uri;
  public String xxO;
  public b.a xxP = null;

  public final String getUrl()
  {
    AppMethodBeat.i(51969);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((!this.uri.startsWith("http://")) && (!this.uri.startsWith("https://")))
      localStringBuilder.append(this.xxO + this.host);
    localStringBuilder.append(this.uri);
    String str1;
    if (this.puc == null)
    {
      str1 = localStringBuilder.toString();
      AppMethodBeat.o(51969);
    }
    while (true)
    {
      return str1;
      localStringBuilder.append('?');
      Iterator localIterator = this.puc.keySet().iterator();
      int i = 1;
      if (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        String str3 = (String)this.puc.get(str2);
        if (i != 0);
        for (str1 = ""; ; str1 = "&")
        {
          localStringBuilder.append(str1).append(URLEncoder.encode(str2, "utf-8")).append('=').append(URLEncoder.encode(bo.nullAsNil(str3), "utf-8"));
          i = 0;
          break;
        }
      }
      str1 = localStringBuilder.toString();
      AppMethodBeat.o(51969);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(51970);
    try
    {
      String str1 = getUrl();
      AppMethodBeat.o(51970);
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.HttpWrapperBase", localUnsupportedEncodingException, "", new Object[0]);
        String str2 = "";
        AppMethodBeat.o(51970);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.c.b.b
 * JD-Core Version:    0.6.2
 */