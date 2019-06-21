package com.tencent.mm.plugin.qqmail.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public final class m extends n
{
  private boolean isCancelled = false;
  private HttpClient ptV = null;
  private HttpRequestBase ptW = null;
  private HttpResponse ptZ = null;
  private int result = 0;

  private static void a(n.b paramb, HttpRequestBase paramHttpRequestBase)
  {
    AppMethodBeat.i(67957);
    if (paramb.puc == null)
      AppMethodBeat.o(67957);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramb.puc.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localArrayList.add(new BasicNameValuePair(str, (String)paramb.puc.get(str)));
      }
      ((HttpPost)paramHttpRequestBase).setEntity(new UrlEncodedFormEntity(localArrayList, "utf-8"));
      AppMethodBeat.o(67957);
    }
  }

  public final n.c a(String paramString1, String paramString2, n.b paramb, n.a parama)
  {
    AppMethodBeat.i(67955);
    ab.d("MicroMsg.URLConnectionUtil", "uri=" + paramString2 + ", " + paramb);
    while (true)
    {
      Object localObject2;
      try
      {
        this.isCancelled = false;
        localObject1 = new org/apache/http/impl/client/DefaultHttpClient;
        ((DefaultHttpClient)localObject1).<init>();
        this.ptV = ((HttpClient)localObject1);
        if (paramb.pub == 0)
        {
          localObject2 = new org/apache/http/client/methods/HttpGet;
          if (paramb.pub == 0)
          {
            localObject1 = paramb.puc;
            ((HttpGet)localObject2).<init>(f(paramString1, paramString2, (Map)localObject1));
            this.ptW = ((HttpRequestBase)localObject2);
            this.ptW.addHeader("User-Agent", userAgent);
            this.ptW.addHeader("Host", host);
            System.setProperty("http.keepAlive", "false");
            this.ptW.addHeader("Accept-Charset", "utf-8");
            this.ptW.addHeader("Accept-Encoding", "compress;q=0.5, gzip;q=1.0");
            this.ptW.addHeader("Content-Type", "text/html");
            this.ptW.addHeader("Cookie", W(paramb.pud));
            if (paramb.pub == 1)
              a(paramb, this.ptW);
            this.ptZ = this.ptV.execute(this.ptW);
            this.result = this.ptZ.getStatusLine().getStatusCode();
            localObject1 = null;
            localObject2 = null;
            localHttpEntity = null;
            if (this.ptZ.getFirstHeader("set-cookie") == null)
              break label1329;
            paramString1 = this.ptZ.getFirstHeader("set-cookie").getValue();
            if (this.ptZ.getFirstHeader("Content-Encoding") != null)
              localObject1 = this.ptZ.getFirstHeader("Content-Encoding").getValue();
            if (this.ptZ.getFirstHeader("Content-Disposition") != null)
              localObject2 = this.ptZ.getFirstHeader("Content-Disposition").getValue();
            if ((localObject2 != null) && (((String)localObject2).contains("attachment;")) && (paramString2.contains("download")))
            {
              i = 1;
              if (i != 0)
                continue;
              localObject2 = localHttpEntity;
              if (this.ptZ.getFirstHeader("Content-Length") != null)
                localObject2 = this.ptZ.getFirstHeader("Content-Length").getValue();
              if ((TextUtils.isEmpty((CharSequence)localObject2)) || (bo.getInt((String)localObject2, 0) <= 5242880L))
                continue;
              paramString1 = new com/tencent/mm/plugin/qqmail/b/n$c;
              paramString1.<init>(-10000, null, "mail content to large");
              return paramString1;
            }
          }
          else
          {
            localObject1 = null;
            continue;
          }
        }
        else
        {
          localObject2 = new org/apache/http/client/methods/HttpPost;
          if (paramb.pub == 0)
          {
            localObject1 = paramb.puc;
            ((HttpPost)localObject2).<init>(f(paramString1, paramString2, (Map)localObject1));
            this.ptW = ((HttpRequestBase)localObject2);
            continue;
          }
        }
      }
      catch (UnsupportedEncodingException paramString1)
      {
        paramString1 = new n.c(-10001, null, "unsupported ecoding");
        if (this.ptV != null)
          this.ptV.getConnectionManager().shutdown();
        AppMethodBeat.o(67955);
        continue;
        localObject1 = null;
        continue;
        i = 0;
        continue;
        localHttpEntity = this.ptZ.getEntity();
        localHttpEntity.getContentLength();
        localObject2 = localHttpEntity.getContent();
        if ((localObject1 != null) && (((String)localObject1).contains("gzip")))
        {
          localObject1 = new java/util/zip/GZIPInputStream;
          ((GZIPInputStream)localObject1).<init>((InputStream)localObject2);
          if (i != 0)
          {
            localObject2 = new java/io/File;
            String str = pua;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            if (paramb.puc.get("default_attach_name") == null)
            {
              paramb = Long.valueOf(System.currentTimeMillis());
              ((File)localObject2).<init>(str, paramb);
              paramb = new java/io/FileOutputStream;
              paramb.<init>((File)localObject2, true);
              localObject2 = new byte[1024];
              if (this.isCancelled)
                continue;
              j = ((InputStream)localObject1).read((byte[])localObject2);
              if (j <= 0)
                continue;
              paramb.write((byte[])localObject2, 0, j);
              paramb.flush();
              parama.ccp();
              continue;
            }
          }
        }
      }
      catch (UnknownHostException paramString1)
      {
        paramString1 = new n.c(-10005, null, "unknow host");
        if (this.ptV != null)
          this.ptV.getConnectionManager().shutdown();
        AppMethodBeat.o(67955);
        continue;
        paramb = (Serializable)paramb.puc.get("default_attach_name");
        continue;
        paramb = new ByteArrayOutputStream();
        continue;
      }
      catch (ClientProtocolException paramString1)
      {
        HttpEntity localHttpEntity;
        paramString1 = new n.c(-10002, null, "client protocol error");
        if (this.ptV != null)
          this.ptV.getConnectionManager().shutdown();
        AppMethodBeat.o(67955);
        continue;
        if (this.isCancelled)
        {
          paramb.flush();
          paramb.close();
          if (this.ptV != null)
            this.ptV.getConnectionManager().shutdown();
          paramString1 = null;
          AppMethodBeat.o(67955);
          continue;
        }
        parama = new com/tencent/mm/plugin/qqmail/b/n$c;
        int j = this.result;
        localObject1 = Vh(paramString1);
        if (i != 0)
        {
          paramString1 = "";
          parama.<init>(j, (Map)localObject1, paramString1);
          paramb.flush();
          paramb.close();
          localHttpEntity.consumeContent();
          paramString1 = new java/lang/StringBuilder;
          paramString1.<init>("uri=");
          ab.d("MicroMsg.URLConnectionUtil", paramString2 + ", " + parama);
          if (this.ptV != null)
            this.ptV.getConnectionManager().shutdown();
          AppMethodBeat.o(67955);
          paramString1 = parama;
          continue;
        }
        paramString1 = new String(((ByteArrayOutputStream)paramb).toByteArray());
        continue;
      }
      catch (IllegalStateException paramString1)
      {
        paramString1 = new n.c(-10003, null, "illegal state");
        if (this.ptV != null)
          this.ptV.getConnectionManager().shutdown();
        AppMethodBeat.o(67955);
        continue;
      }
      catch (FileNotFoundException paramString1)
      {
        paramString1 = new n.c(-10004, null, "output file not found");
        if (this.ptV != null)
          this.ptV.getConnectionManager().shutdown();
        AppMethodBeat.o(67955);
        continue;
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.URLConnectionUtil", paramString1, "http unavailable", new Object[0]);
        if (this.result == 0)
        {
          i = 503;
          paramString1 = new n.c(i, null, null);
          if (this.ptV != null)
            this.ptV.getConnectionManager().shutdown();
          AppMethodBeat.o(67955);
          continue;
        }
        i = this.result;
        continue;
      }
      catch (OutOfMemoryError paramString1)
      {
        ab.printErrStackTrace("MicroMsg.URLConnectionUtil", paramString1, "http unavailable", new Object[0]);
        if (this.result == 0)
        {
          i = 503;
          paramString1 = new n.c(i, null, null);
          if (this.ptV != null)
            this.ptV.getConnectionManager().shutdown();
          AppMethodBeat.o(67955);
          continue;
        }
        int i = this.result;
        continue;
      }
      finally
      {
        if (this.ptV != null)
          this.ptV.getConnectionManager().shutdown();
        AppMethodBeat.o(67955);
      }
      Object localObject1 = localObject2;
      continue;
      label1329: paramString1 = null;
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(67956);
    ab.d("MicroMsg.URLConnectionUtil", "cancel conection.");
    this.isCancelled = true;
    if ((this.ptW != null) && (!this.ptW.isAborted()))
      this.ptW.abort();
    if (this.ptV != null)
      this.ptV.getConnectionManager().shutdown();
    AppMethodBeat.o(67956);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.m
 * JD-Core Version:    0.6.2
 */