package com.tencent.mm.sandbox.updater;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sandbox.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

public final class c extends com.tencent.mm.sandbox.monitor.c
{
  private String cdy;
  private int exv;
  private boolean fIa;
  private String nun;
  private b.a xvR;
  private String[] xvX;
  private a xvY;
  private boolean xvZ;
  private ak xwa;
  private b.a xwb;

  public c(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    super(paramInt1, paramString1, paramInt2, paramBoolean);
    AppMethodBeat.i(28872);
    this.xvY = null;
    this.exv = 0;
    this.xvZ = false;
    this.fIa = false;
    this.xwa = new c.1(this);
    this.xwb = new c.3(this);
    this.xvX = new String[] { paramString2 };
    this.xvZ = true;
    this.cdy = paramString3;
    this.nun = paramString4;
    AppMethodBeat.o(28872);
  }

  public c(int paramInt1, String paramString, int paramInt2, String[] paramArrayOfString, boolean paramBoolean)
  {
    super(paramInt1, paramString, paramInt2, paramBoolean);
    AppMethodBeat.i(28871);
    this.xvY = null;
    this.exv = 0;
    this.xvZ = false;
    this.fIa = false;
    this.xwa = new c.1(this);
    this.xwb = new c.3(this);
    this.xvX = paramArrayOfString;
    AppMethodBeat.o(28871);
  }

  private int dnm()
  {
    AppMethodBeat.i(28877);
    ab.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "requestCount=" + this.exv + ", curLinkIdx = " + this.exv / 5);
    int i = this.exv / 5;
    AppMethodBeat.o(28877);
    return i;
  }

  public final void a(b.a parama)
  {
    AppMethodBeat.i(28873);
    this.xvR = parama;
    if (!h.getExternalStorageState().equals("mounted"))
    {
      ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard not available.");
      parama.b(-1, -1, null);
      AppMethodBeat.o(28873);
    }
    while (true)
    {
      return;
      if (this.fIa)
      {
        ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "netscene had been canceled.");
        parama.b(-1, -1, null);
        AppMethodBeat.o(28873);
      }
      else if ((dnf()) || (dnm() >= this.xvX.length))
      {
        ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exceed max download url. url count = " + this.xvX.length);
        if (this.xvZ)
        {
          parama.b(1, -1, null);
          AppMethodBeat.o(28873);
        }
        else
        {
          parama.b(-1, -1, null);
          AppMethodBeat.o(28873);
        }
      }
      else if (!f.eW(this.xvx))
      {
        ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard full");
        if (this.xvZ)
        {
          parama.b(13, -1, null);
          AppMethodBeat.o(28873);
        }
        else
        {
          parama.b(-1, -1, null);
          AppMethodBeat.o(28873);
        }
      }
      else
      {
        this.xvY = new a(this.xvx, e.cs(alN()), this.xwb);
        this.xvY.execute(new String[] { this.xvX[dnm()] });
        AppMethodBeat.o(28873);
      }
    }
  }

  public final String alN()
  {
    AppMethodBeat.i(28874);
    String str;
    if (this.xvZ)
    {
      str = xvv + this.cdy + ".temp";
      AppMethodBeat.o(28874);
    }
    while (true)
    {
      return str;
      str = super.alN();
      AppMethodBeat.o(28874);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(28876);
    ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "cancel netscene");
    this.fIa = true;
    if ((this.xvY != null) && (!this.xvY.isCancelled()))
      this.xvY.cancel(true);
    AppMethodBeat.o(28876);
  }

  public final String dne()
  {
    AppMethodBeat.i(28875);
    String str;
    if (this.xvZ)
    {
      str = xvv + this.nun + ".apk";
      AppMethodBeat.o(28875);
    }
    while (true)
    {
      return str;
      str = xvv + this.xvz + ".apk";
      AppMethodBeat.o(28875);
    }
  }

  final class a extends AsyncTask<String, Integer, Integer>
  {
    private int bIF;
    private HttpClient ptV;
    private OutputStream sOI;
    private int size;
    private b.a xvR;
    private HttpGet xwe;
    private HttpResponse xwf;
    private HttpEntity xwg;

    public a(int paramInt1, int parama, b.a arg4)
    {
      AppMethodBeat.i(28866);
      this.ptV = null;
      this.xwe = null;
      this.xwf = null;
      this.xwg = null;
      this.sOI = new c.a.1(this);
      this.size = paramInt1;
      this.bIF = parama;
      Object localObject;
      this.xvR = localObject;
      AppMethodBeat.o(28866);
    }

    private Integer O(String[] paramArrayOfString)
    {
      AppMethodBeat.i(28867);
      paramArrayOfString = paramArrayOfString[0];
      if ((paramArrayOfString == null) || (paramArrayOfString.length() == 0))
      {
        paramArrayOfString = Integer.valueOf(-1);
        AppMethodBeat.o(28867);
      }
      while (true)
      {
        return paramArrayOfString;
        ab.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "current download url=" + paramArrayOfString + ", range=" + this.bIF);
        this.ptV = new DefaultHttpClient();
        this.ptV.getParams().setIntParameter("http.connection.timeout", 15000);
        this.xwe = new HttpGet(paramArrayOfString);
        HttpGet localHttpGet = this.xwe;
        StringBuilder localStringBuilder = new StringBuilder("bytes=").append(this.bIF).append("-");
        if (this.size - this.bIF > 1048576)
        {
          paramArrayOfString = Integer.valueOf(this.bIF + 1048576 - 1);
          localHttpGet.addHeader("RANGE", paramArrayOfString);
        }
        try
        {
          this.xvR.mm(50L);
          this.xwf = this.ptV.execute(this.xwe);
          int i = this.xwf.getStatusLine().getStatusCode();
          if ((i != 200) && (i != 206))
          {
            ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "HttpClient return code:".concat(String.valueOf(i)));
            if (i == 416)
            {
              paramArrayOfString = Integer.valueOf(-2);
              if (this.xwe != null)
                this.xwe.abort();
              if (this.xwg != null);
              try
              {
                this.xwg.consumeContent();
                if (this.ptV != null)
                  this.ptV.getConnectionManager().shutdown();
                AppMethodBeat.o(28867);
                continue;
                paramArrayOfString = "";
              }
              catch (IOException localIOException1)
              {
                while (true)
                  ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localIOException1, "", new Object[0]);
              }
            }
            else
            {
              paramArrayOfString = Integer.valueOf(-1);
              if (this.xwe != null)
                this.xwe.abort();
              if (this.xwg != null);
              try
              {
                this.xwg.consumeContent();
                if (this.ptV != null)
                  this.ptV.getConnectionManager().shutdown();
                AppMethodBeat.o(28867);
              }
              catch (IOException localIOException2)
              {
                while (true)
                  ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localIOException2, "", new Object[0]);
              }
            }
          }
          else if ((c.g(c.this)) && (ae.gio) && (Math.random() > 0.2D))
          {
            ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "simulateNetworkFault");
            paramArrayOfString = Integer.valueOf(-1);
            if (this.xwe != null)
              this.xwe.abort();
            if (this.xwg != null);
            try
            {
              this.xwg.consumeContent();
              if (this.ptV != null)
                this.ptV.getConnectionManager().shutdown();
              AppMethodBeat.o(28867);
            }
            catch (IOException localIOException3)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localIOException3, "", new Object[0]);
            }
          }
          else
          {
            this.xwf.getHeaders("Content-Length");
            if (this.bIF > this.size)
            {
              ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "range out of size");
              paramArrayOfString = Integer.valueOf(-2);
              if (this.xwe != null)
                this.xwe.abort();
              if (this.xwg != null);
              try
              {
                this.xwg.consumeContent();
                if (this.ptV != null)
                  this.ptV.getConnectionManager().shutdown();
                AppMethodBeat.o(28867);
              }
              catch (IOException localIOException4)
              {
                while (true)
                  ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localIOException4, "", new Object[0]);
              }
            }
            else
            {
              this.xwg = this.xwf.getEntity();
              this.xwg.writeTo(this.sOI);
              this.xwg.consumeContent();
              paramArrayOfString = Integer.valueOf(0);
              if (this.xwe != null)
                this.xwe.abort();
              if (this.xwg != null);
              try
              {
                this.xwg.consumeContent();
                if (this.ptV != null)
                  this.ptV.getConnectionManager().shutdown();
                AppMethodBeat.o(28867);
              }
              catch (IOException localIOException5)
              {
                while (true)
                  ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localIOException5, "", new Object[0]);
              }
            }
          }
        }
        catch (Exception paramArrayOfString)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramArrayOfString, "", new Object[0]);
          ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramArrayOfString, "exception current in download pack", new Object[0]);
          if (this.xwe != null)
            this.xwe.abort();
          if (this.xwg != null);
          try
          {
            this.xwg.consumeContent();
            if (this.ptV != null)
              this.ptV.getConnectionManager().shutdown();
            paramArrayOfString = Integer.valueOf(-1);
            AppMethodBeat.o(28867);
          }
          catch (IOException paramArrayOfString)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", paramArrayOfString, "", new Object[0]);
          }
        }
        finally
        {
          if (this.xwe != null)
            this.xwe.abort();
          if (this.xwg == null);
        }
      }
      try
      {
        this.xwg.consumeContent();
        if (this.ptV != null)
          this.ptV.getConnectionManager().shutdown();
        AppMethodBeat.o(28867);
        throw paramArrayOfString;
      }
      catch (IOException localIOException6)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localIOException6, "", new Object[0]);
      }
    }

    protected final void onCancelled()
    {
      AppMethodBeat.i(28868);
      ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "AsyncTask had been canceled.");
      if (this.xwe != null)
        this.xwe.abort();
      if (this.xwg != null);
      try
      {
        this.xwg.consumeContent();
        if (this.ptV != null)
        {
          ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "connection shutdown.");
          this.ptV.getConnectionManager().shutdown();
        }
        AppMethodBeat.o(28868);
        return;
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", localIOException, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.c
 * JD-Core Version:    0.6.2
 */