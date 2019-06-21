package com.tencent.mm.network;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class u
{
  private Map<String, List<String>> bqH;
  public HttpURLConnection connection;
  public int gcI;
  public String gdF;
  public URL url;

  public u(URL paramURL, int paramInt)
  {
    AppMethodBeat.i(58618);
    this.bqH = null;
    this.url = paramURL;
    this.gcI = paramInt;
    this.connection = ((HttpURLConnection)this.url.openConnection());
    if (1 == this.gcI)
      this.connection.setInstanceFollowRedirects(false);
    AppMethodBeat.o(58618);
  }

  public final void amX()
  {
    AppMethodBeat.i(58627);
    this.connection.setDoInput(true);
    AppMethodBeat.o(58627);
  }

  public final void amY()
  {
    AppMethodBeat.i(58628);
    this.connection.setDoOutput(true);
    AppMethodBeat.o(58628);
  }

  public final void connect()
  {
    AppMethodBeat.i(58621);
    if ((1 == this.gcI) && (this.bqH == null))
      this.bqH = this.connection.getRequestProperties();
    this.connection.connect();
    AppMethodBeat.o(58621);
  }

  public final String getHeaderField(String paramString)
  {
    AppMethodBeat.i(58623);
    if ((1 == this.gcI) && (this.bqH == null))
      this.bqH = this.connection.getRequestProperties();
    paramString = this.connection.getHeaderField(paramString);
    AppMethodBeat.o(58623);
    return paramString;
  }

  public final int getHeaderFieldInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(58624);
    if ((1 == this.gcI) && (this.bqH == null))
      this.bqH = this.connection.getRequestProperties();
    paramInt = this.connection.getHeaderFieldInt(paramString, paramInt);
    AppMethodBeat.o(58624);
    return paramInt;
  }

  public final Map<String, List<String>> getHeaderFields()
  {
    AppMethodBeat.i(58622);
    if ((1 == this.gcI) && (this.bqH == null))
      this.bqH = this.connection.getRequestProperties();
    Map localMap = this.connection.getHeaderFields();
    AppMethodBeat.o(58622);
    return localMap;
  }

  public final InputStream getInputStream()
  {
    AppMethodBeat.i(58625);
    if (1 == this.gcI)
    {
      if (this.bqH == null)
        this.bqH = this.connection.getRequestProperties();
      getResponseCode();
    }
    InputStream localInputStream = this.connection.getInputStream();
    AppMethodBeat.o(58625);
    return localInputStream;
  }

  public final OutputStream getOutputStream()
  {
    AppMethodBeat.i(58626);
    if (1 == this.gcI)
    {
      if (this.bqH == null)
        this.bqH = this.connection.getRequestProperties();
      getResponseCode();
    }
    OutputStream localOutputStream = this.connection.getOutputStream();
    AppMethodBeat.o(58626);
    return localOutputStream;
  }

  public final int getResponseCode()
  {
    AppMethodBeat.i(58619);
    if ((1 == this.gcI) && (this.bqH == null))
      this.bqH = this.connection.getRequestProperties();
    int i = this.connection.getResponseCode();
    Object localObject;
    if ((1 == this.gcI) && (302 == i))
    {
      localObject = this.connection.getHeaderField("Location");
      if (localObject == null)
        AppMethodBeat.o(58619);
    }
    while (true)
    {
      return i;
      this.url = new URL(this.url, (String)localObject);
      this.connection = ((HttpURLConnection)this.url.openConnection());
      this.connection.setInstanceFollowRedirects(false);
      if (this.bqH != null)
      {
        localObject = this.bqH.keySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if ((!str.equals("Host")) && (!str.equals("X-Online-Host")))
          {
            List localList = (List)this.bqH.get(str);
            for (i = 0; i < localList.size(); i++)
              this.connection.setRequestProperty(str, (String)localList.get(i));
          }
        }
      }
      this.connection.setRequestProperty("Host", this.url.getHost());
      this.connection.setRequestProperty("X-Online-Host", this.url.getHost());
      break;
      AppMethodBeat.o(58619);
    }
  }

  public final void setConnectTimeout(int paramInt)
  {
    AppMethodBeat.i(58631);
    this.connection.setConnectTimeout(paramInt);
    AppMethodBeat.o(58631);
  }

  public final void setReadTimeout(int paramInt)
  {
    AppMethodBeat.i(58632);
    this.connection.setReadTimeout(paramInt);
    AppMethodBeat.o(58632);
  }

  public final void setRequestMethod(String paramString)
  {
    AppMethodBeat.i(58620);
    this.connection.setRequestMethod(paramString);
    AppMethodBeat.o(58620);
  }

  public final void setRequestProperty(String paramString1, String paramString2)
  {
    AppMethodBeat.i(58629);
    this.connection.setRequestProperty(paramString1, paramString2);
    AppMethodBeat.o(58629);
  }

  public final void setUseCaches(boolean paramBoolean)
  {
    AppMethodBeat.i(58630);
    this.connection.setUseCaches(paramBoolean);
    AppMethodBeat.o(58630);
  }

  public final String toString()
  {
    AppMethodBeat.i(58634);
    String str = this.connection.toString();
    AppMethodBeat.o(58634);
    return str;
  }

  public final void vc(String paramString)
  {
    AppMethodBeat.i(58633);
    this.connection.setRequestProperty("Referer", paramString);
    AppMethodBeat.o(58633);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.u
 * JD-Core Version:    0.6.2
 */