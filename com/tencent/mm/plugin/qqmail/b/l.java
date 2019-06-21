package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public final class l extends n
{
  private static final String BOUNDARY;
  private HttpPost ptR;

  static
  {
    AppMethodBeat.i(67954);
    BOUNDARY = "WEIXIN" + System.currentTimeMillis();
    AppMethodBeat.o(67954);
  }

  private static String a(n.b paramb)
  {
    AppMethodBeat.i(67953);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = paramb.puc.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuilder.append("------" + BOUNDARY + "\r\n");
      localStringBuilder.append("Content-Disposition: form-data; name=\"" + str + "\"\r\n");
      localStringBuilder.append("\r\n");
      localStringBuilder.append((String)paramb.puc.get(str));
      localStringBuilder.append("\r\n");
    }
    localObject = new File(paramb.pue.filePath);
    if (!((File)localObject).isFile())
    {
      paramb = new InvalidParameterException("The path to upload isnot a file.");
      AppMethodBeat.o(67953);
      throw paramb;
    }
    localObject = ((File)localObject).getName();
    localStringBuilder.append("------" + BOUNDARY + "\r\n");
    localStringBuilder.append("Content-Disposition: form-data; name=\"" + paramb.pue.cBy + "\"; filename=\"" + (String)localObject + "\"\r\n");
    localStringBuilder.append("\r\n");
    paramb = localStringBuilder.toString();
    AppMethodBeat.o(67953);
    return paramb;
  }

  public final n.c a(String paramString1, String paramString2, n.b paramb, n.a parama)
  {
    int i = 0;
    AppMethodBeat.i(67951);
    ab.d("MicroMsg.HttpClientUtil", "uri=" + paramString2 + ", " + paramb);
    parama = new DefaultHttpClient();
    int j = i;
    try
    {
      Object localObject1 = new com/tencent/mm/plugin/qqmail/b/l$a;
      j = i;
      String str1 = a(paramb);
      j = i;
      String str2 = paramb.pue.filePath;
      j = i;
      Object localObject2 = new java/lang/StringBuilder;
      j = i;
      ((StringBuilder)localObject2).<init>();
      j = i;
      ((StringBuilder)localObject2).append("\r\n");
      j = i;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      j = i;
      localStringBuilder.<init>("------");
      j = i;
      ((StringBuilder)localObject2).append(BOUNDARY + "--\r\n");
      j = i;
      ((l.a)localObject1).<init>(this, str1, str2, ((StringBuilder)localObject2).toString());
      j = i;
      localObject2 = new org/apache/http/client/methods/HttpPost;
      j = i;
      ((HttpPost)localObject2).<init>(f(paramString1, paramString2, paramb.puc));
      j = i;
      this.ptR = ((HttpPost)localObject2);
      j = i;
      this.ptR.setHeader("User-Agent", userAgent);
      j = i;
      this.ptR.setHeader("Host", host);
      j = i;
      this.ptR.setHeader("Connection", "Keep-Alive");
      j = i;
      this.ptR.setHeader("Accept-Charset", "utf-8");
      j = i;
      this.ptR.setHeader("Cookie", W(paramb.pud));
      j = i;
      this.ptR.setEntity((HttpEntity)localObject1);
      j = i;
      paramb = parama.execute(this.ptR);
      j = i;
      i = paramb.getStatusLine().getStatusCode();
      j = i;
      paramString1 = paramb.getEntity();
      j = i;
      paramb = paramb.getFirstHeader("set-cookie").getValue();
      j = i;
      localObject1 = EntityUtils.toString(paramString1);
      j = i;
      paramString1 = new com/tencent/mm/plugin/qqmail/b/n$c;
      j = i;
      paramString1.<init>(i, Vh(paramb), (String)localObject1);
      j = i;
      paramb = new java/lang/StringBuilder;
      j = i;
      paramb.<init>("uri=");
      j = i;
      ab.d("MicroMsg.HttpClientUtil", paramString2 + ", " + paramString1);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.HttpClientUtil", paramString1, "", new Object[0]);
        i = j;
        if (j == 0)
          i = 503;
        paramString1 = new n.c(i, null, null);
        parama.getConnectionManager().shutdown();
        AppMethodBeat.o(67951);
      }
    }
    finally
    {
      parama.getConnectionManager().shutdown();
      AppMethodBeat.o(67951);
    }
    throw paramString1;
  }

  public final void cancel()
  {
    AppMethodBeat.i(67952);
    ab.d("MicroMsg.HttpClientUtil", "cancel conection.");
    if ((this.ptR != null) && (!this.ptR.isAborted()))
      this.ptR.abort();
    AppMethodBeat.o(67952);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.l
 * JD-Core Version:    0.6.2
 */