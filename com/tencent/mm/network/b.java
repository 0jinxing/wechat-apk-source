package com.tencent.mm.network;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class b
{
  static a gcH;

  public static int a(u paramu)
  {
    int i = 0;
    AppMethodBeat.i(58458);
    try
    {
      int j = paramu.getResponseCode();
      if (j != 200)
      {
        i = -1;
        AppMethodBeat.o(58458);
      }
      while (true)
      {
        return i;
        AppMethodBeat.o(58458);
      }
    }
    catch (Exception paramu)
    {
      while (true)
      {
        ab.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bo.l(paramu) });
        i = -3;
        AppMethodBeat.o(58458);
      }
    }
  }

  public static int a(String paramString, boolean paramBoolean, List<String> paramList)
  {
    AppMethodBeat.i(58454);
    int i;
    if ((gcH == null) || (gcH.Rk() == null))
    {
      i = -1;
      AppMethodBeat.o(58454);
    }
    while (true)
    {
      return i;
      i = gcH.Rk().a(paramString, paramBoolean, paramList);
      AppMethodBeat.o(58454);
    }
  }

  public static int a(boolean paramBoolean, List<String> paramList, String paramString)
  {
    int i = -1;
    AppMethodBeat.i(58453);
    int j;
    if (gcH == null)
    {
      AppMethodBeat.o(58453);
      j = i;
    }
    while (true)
    {
      return j;
      try
      {
        j = gcH.Rk().a(paramString, paramBoolean, paramList);
        AppMethodBeat.o(58453);
      }
      catch (Exception paramList)
      {
        ab.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bo.l(paramList) });
        AppMethodBeat.o(58453);
        j = i;
      }
    }
  }

  public static u a(String paramString, b paramb)
  {
    AppMethodBeat.i(58457);
    b localb = paramb;
    if (paramb == null)
      localb = new b(paramString);
    ab.i("MicroMsg.GprsSetting", "hy: url redirect host: %s, url: %s, ip: %s, dns_type: %d", new Object[] { localb.host, localb.url, localb.ip, Integer.valueOf(localb.gcI) });
    paramString = new u(localb.url, localb.gcI);
    paramString.gdF = localb.ip;
    if (1 == localb.gcI)
    {
      paramString.setRequestProperty("Host", localb.host);
      paramString.setRequestProperty("X-Online-Host", localb.host);
    }
    AppMethodBeat.o(58457);
    return paramString;
  }

  public static void a(a parama)
  {
    AppMethodBeat.i(58452);
    ab.i("MicroMsg.GprsSetting", "sethostimpl %b, [%s]", new Object[] { Boolean.FALSE, bo.dpG() });
    gcH = parama;
    AppMethodBeat.o(58452);
  }

  public static InputStream p(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = null;
    AppMethodBeat.i(58456);
    paramString = a(paramString, null);
    paramString.setConnectTimeout(paramInt1);
    paramString.setReadTimeout(paramInt2);
    paramString.setRequestMethod("GET");
    if (a(paramString) != 0)
    {
      AppMethodBeat.o(58456);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = paramString.getInputStream();
      AppMethodBeat.o(58456);
    }
  }

  public static void reportFailIp(String paramString)
  {
    AppMethodBeat.i(58455);
    if ((gcH != null) && (gcH.Rk() != null))
      gcH.Rk().reportFailIp(paramString);
    AppMethodBeat.o(58455);
  }

  public static v vb(String paramString)
  {
    AppMethodBeat.i(58459);
    paramString = new v(paramString);
    AppMethodBeat.o(58459);
    return paramString;
  }

  public static abstract interface a
  {
    public abstract e Rk();
  }

  public static final class b
  {
    public int gcI;
    private ArrayList<String> gcJ;
    public String gcK;
    public boolean gcL;
    private boolean gcM;
    public String host;
    public String ip;
    public URL url;

    public b(String paramString)
    {
      AppMethodBeat.i(58450);
      this.host = null;
      this.url = null;
      this.ip = "";
      this.gcI = 0;
      this.gcJ = new ArrayList();
      this.gcL = false;
      this.gcM = false;
      this.gcK = paramString;
      try
      {
        Object localObject = new java/net/URL;
        ((URL)localObject).<init>(paramString);
        this.url = ((URL)localObject);
        this.host = this.url.getHost();
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        if ((b.gcH == null) || (b.gcH.Rk() == null))
          if (b.gcH == null)
          {
            paramString = "-1";
            ab.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", new Object[] { paramString, bo.dpG() });
            AppMethodBeat.o(58450);
          }
        while (true)
        {
          return;
          paramString = b.gcH.Rk();
          break;
          this.gcI = b.gcH.Rk().getHostByName(this.host, (List)localObject);
          ab.d("MicroMsg.GprsSetting", "[Arth.302] dnsType:%d  host:%s url:%s", new Object[] { Integer.valueOf(this.gcI), this.host, paramString });
          if (((ArrayList)localObject).size() <= 0)
          {
            this.gcI = 0;
            AppMethodBeat.o(58450);
          }
          else
          {
            int i = this.gcI;
            if (1 != i)
            {
              AppMethodBeat.o(58450);
            }
            else
            {
              String str = (String)((ArrayList)localObject).get((int)(bo.anU() % ((ArrayList)localObject).size()));
              this.ip = str;
              localObject = new java/net/URL;
              ((URL)localObject).<init>(paramString.replaceFirst(this.host, str));
              this.url = ((URL)localObject);
              AppMethodBeat.o(58450);
            }
          }
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bo.l(paramString) });
          AppMethodBeat.o(58450);
        }
      }
    }

    public b(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(58451);
      this.host = null;
      this.url = null;
      this.ip = "";
      this.gcI = 0;
      this.gcJ = new ArrayList();
      this.gcL = false;
      this.gcM = false;
      this.gcL = paramBoolean;
      this.gcK = paramString;
      try
      {
        Object localObject = new java/net/URL;
        ((URL)localObject).<init>(paramString);
        this.url = ((URL)localObject);
        this.host = this.url.getHost();
        if ((b.gcH == null) || (b.gcH.Rk() == null))
          if (b.gcH == null)
          {
            paramString = "-1";
            ab.e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", new Object[] { paramString, bo.dpG() });
            AppMethodBeat.o(58451);
          }
        while (true)
        {
          return;
          paramString = b.gcH.Rk();
          break;
          this.gcI = b.gcH.Rk().a(this.host, paramBoolean, this.gcJ);
          localObject = new java/util/Random;
          ((Random)localObject).<init>();
          ((Random)localObject).setSeed(bo.anU());
          Collections.shuffle(this.gcJ, (Random)localObject);
          ab.d("MicroMsg.GprsSetting", "[Arth.302] dnsType:%d  host:%s url:%s ips:%s", new Object[] { Integer.valueOf(this.gcI), this.host, paramString, this.gcJ });
          if (this.gcJ.size() <= 0)
          {
            this.gcI = 0;
            AppMethodBeat.o(58451);
          }
          else
          {
            int i = this.gcI;
            if (1 != i)
            {
              AppMethodBeat.o(58451);
            }
            else
            {
              this.ip = ((String)this.gcJ.remove(0));
              localObject = new java/net/URL;
              ((URL)localObject).<init>(paramString.replaceFirst(this.host, this.ip));
              this.url = ((URL)localObject);
              AppMethodBeat.o(58451);
            }
          }
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.GprsSetting", "exception:%s", new Object[] { bo.l(paramString) });
          AppMethodBeat.o(58451);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.b
 * JD-Core Version:    0.6.2
 */