package com.tencent.mm.network;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public final class v
{
  public HttpsURLConnection gdG;

  public v(String paramString)
  {
    this(new URL(paramString));
    AppMethodBeat.i(58635);
    AppMethodBeat.o(58635);
  }

  private v(URL paramURL)
  {
    AppMethodBeat.i(58636);
    this.gdG = null;
    try
    {
      this.gdG = ((HttpsURLConnection)paramURL.openConnection());
      AppMethodBeat.o(58636);
      return;
    }
    catch (MalformedURLException paramURL)
    {
      while (true)
      {
        ab.e("MicroMsg.MMHttpsUrlConnection", "MalformedURLException : %s", new Object[] { paramURL.getMessage() });
        ab.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", new Object[] { bo.l(paramURL) });
        AppMethodBeat.o(58636);
      }
    }
    catch (IOException paramURL)
    {
      while (true)
      {
        ab.e("MicroMsg.MMHttpsUrlConnection", "IOException : %s", new Object[] { paramURL.getMessage() });
        ab.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", new Object[] { bo.l(paramURL) });
        AppMethodBeat.o(58636);
      }
    }
    catch (Exception paramURL)
    {
      while (true)
      {
        ab.e("MicroMsg.MMHttpsUrlConnection", "Exception :" + paramURL.getMessage());
        ab.e("MicroMsg.MMHttpsUrlConnection", "exception:%s", new Object[] { bo.l(paramURL) });
        AppMethodBeat.o(58636);
      }
    }
  }

  public final void amZ()
  {
    AppMethodBeat.i(58637);
    this.gdG.setConnectTimeout(3000);
    AppMethodBeat.o(58637);
  }

  public final void ana()
  {
    AppMethodBeat.i(58638);
    this.gdG.setReadTimeout(3000);
    AppMethodBeat.o(58638);
  }

  public final void anb()
  {
    AppMethodBeat.i(58640);
    this.gdG.setUseCaches(true);
    AppMethodBeat.o(58640);
  }

  public final void vc(String paramString)
  {
    AppMethodBeat.i(58639);
    this.gdG.setRequestProperty("Referer", paramString);
    AppMethodBeat.o(58639);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.v
 * JD-Core Version:    0.6.2
 */