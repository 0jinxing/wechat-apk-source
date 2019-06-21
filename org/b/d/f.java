package org.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.b.b.a;
import org.b.b.b;

class f
{
  private j BYP;
  private e BYQ;
  private e BYR;
  private byte[] BYS;
  private boolean BYT;
  private Long BYU;
  private Long BYV;
  private String charset;
  private HttpURLConnection connection;
  private Map<String, String> headers;
  private String url;
  private String wyn;

  public f(j paramj, String paramString)
  {
    AppMethodBeat.i(77250);
    this.wyn = null;
    this.BYS = null;
    this.BYT = false;
    this.BYU = null;
    this.BYV = null;
    this.BYP = paramj;
    this.url = paramString;
    this.BYQ = new e();
    this.BYR = new e();
    this.headers = new HashMap();
    AppMethodBeat.o(77250);
  }

  private byte[] eni()
  {
    AppMethodBeat.i(77258);
    Object localObject;
    if (this.BYS != null)
    {
      localObject = this.BYS;
      AppMethodBeat.o(77258);
    }
    while (true)
    {
      return localObject;
      if (this.wyn != null)
        localObject = this.wyn;
      try
      {
        while (true)
        {
          localObject = ((String)localObject).getBytes(enb());
          AppMethodBeat.o(77258);
          break;
          localObject = this.BYR.enh();
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        b localb = new b("Unsupported Charset: " + enb(), localUnsupportedEncodingException);
        AppMethodBeat.o(77258);
        throw localb;
      }
    }
  }

  private void h(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(77253);
    Iterator localIterator = this.headers.keySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        AppMethodBeat.o(77253);
        return;
      }
      String str = (String)localIterator.next();
      paramHttpURLConnection.setRequestProperty(str, (String)this.headers.get(str));
    }
  }

  public void addHeader(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77254);
    this.headers.put(paramString1, paramString2);
    AppMethodBeat.o(77254);
  }

  public e emY()
  {
    AppMethodBeat.i(77256);
    try
    {
      e locale = new org/b/d/e;
      locale.<init>();
      URL localURL = new java/net/URL;
      localURL.<init>(this.url);
      locale.awV(localURL.getQuery());
      locale.a(this.BYQ);
      AppMethodBeat.o(77256);
      return locale;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      b localb = new b("Malformed URL", localMalformedURLException);
      AppMethodBeat.o(77256);
      throw localb;
    }
  }

  public j emZ()
  {
    return this.BYP;
  }

  public String ena()
  {
    AppMethodBeat.i(77252);
    Object localObject1 = this.BYQ;
    Object localObject2 = this.url;
    org.b.g.d.r(localObject2, "Cannot append to null URL");
    localObject1 = ((e)localObject1).enh();
    if (((String)localObject1).equals(""))
    {
      AppMethodBeat.o(77252);
      return localObject2;
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject2));
    if (((String)localObject2).indexOf('?') != -1);
    for (localObject2 = "&"; ; localObject2 = Character.valueOf('?'))
    {
      localObject2 = localStringBuilder.append(localObject2).toString() + (String)localObject1;
      AppMethodBeat.o(77252);
      break;
    }
  }

  public String enb()
  {
    AppMethodBeat.i(77259);
    String str;
    if (this.charset == null)
    {
      str = Charset.defaultCharset().name();
      AppMethodBeat.o(77259);
    }
    while (true)
    {
      return str;
      str = this.charset;
      AppMethodBeat.o(77259);
    }
  }

  public g enc()
  {
    AppMethodBeat.i(77251);
    try
    {
      Object localObject1 = ena();
      if (this.connection == null)
        if (!this.BYT)
          break label218;
      label218: for (Object localObject2 = "true"; ; localObject2 = "false")
      {
        System.setProperty("http.keepAlive", (String)localObject2);
        localObject2 = new java/net/URL;
        ((URL)localObject2).<init>((String)localObject1);
        this.connection = ((HttpURLConnection)((URL)localObject2).openConnection());
        this.connection.setRequestMethod(this.BYP.name());
        if (this.BYU != null)
          this.connection.setConnectTimeout(this.BYU.intValue());
        if (this.BYV != null)
          this.connection.setReadTimeout(this.BYV.intValue());
        h(this.connection);
        if ((this.BYP.equals(j.BZc)) || (this.BYP.equals(j.BZb)))
        {
          localObject1 = this.connection;
          localObject2 = eni();
          ((HttpURLConnection)localObject1).setRequestProperty("Content-Length", String.valueOf(localObject2.length));
          if (((HttpURLConnection)localObject1).getRequestProperty("Content-Type") == null)
            ((HttpURLConnection)localObject1).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
          ((HttpURLConnection)localObject1).setDoOutput(true);
          ((HttpURLConnection)localObject1).getOutputStream().write((byte[])localObject2);
        }
        localObject2 = new g(this.connection);
        AppMethodBeat.o(77251);
        return localObject2;
      }
    }
    catch (Exception localException)
    {
      a locala = new a(localException);
      AppMethodBeat.o(77251);
      throw locala;
    }
  }

  public e ene()
  {
    return this.BYR;
  }

  public String enf()
  {
    AppMethodBeat.i(77257);
    String str = this.url.replaceAll("\\?.*", "").replace("\\:\\d{4}", "");
    AppMethodBeat.o(77257);
    return str;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void jm(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77255);
    this.BYQ.BYO.add(new d(paramString1, paramString2));
    AppMethodBeat.o(77255);
  }

  public String toString()
  {
    AppMethodBeat.i(77260);
    String str = String.format("@Request(%s %s)", new Object[] { emZ(), getUrl() });
    AppMethodBeat.o(77260);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.b.d.f
 * JD-Core Version:    0.6.2
 */