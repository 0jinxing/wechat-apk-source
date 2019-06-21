package com.tencent.mm.plugin.appbrand.l;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLContext;
import org.json.JSONObject;

public final class g
{
  c hvw;
  final String ibJ;
  private int ioT;
  public final ArrayList<h> ioU;
  SSLContext ios;
  protected final ArrayList<String> iot;

  public g(c paramc)
  {
    AppMethodBeat.i(108170);
    this.ioU = new ArrayList();
    this.iot = new ArrayList();
    this.hvw = paramc;
    paramc = (a)paramc.aa(a.class);
    this.ioT = paramc.bQx;
    this.ibJ = paramc.ioo;
    this.ios = j.a(paramc);
    AppMethodBeat.o(108170);
  }

  private void a(String paramString, HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(108176);
    kP(paramString);
    if (paramHttpURLConnection != null);
    while (true)
    {
      try
      {
        paramHttpURLConnection.disconnect();
        AppMethodBeat.o(108176);
        return;
      }
      catch (Exception paramHttpURLConnection)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkUpload", paramHttpURLConnection, "removeTask Exception: id %s", new Object[] { paramString });
      }
      AppMethodBeat.o(108176);
    }
  }

  private void kP(String paramString)
  {
    AppMethodBeat.i(108172);
    if (paramString == null)
      AppMethodBeat.o(108172);
    while (true)
    {
      return;
      synchronized (this.ioU)
      {
        Iterator localIterator = this.ioU.iterator();
        while (localIterator.hasNext())
        {
          h localh = (h)localIterator.next();
          if (paramString.equals(localh.hvr))
            this.ioU.remove(localh);
        }
        AppMethodBeat.o(108172);
      }
    }
  }

  public final boolean CH(String paramString)
  {
    AppMethodBeat.i(108175);
    boolean bool = this.iot.contains(paramString);
    AppMethodBeat.o(108175);
    return bool;
  }

  public final h CN(String paramString)
  {
    AppMethodBeat.i(108173);
    if (paramString == null)
    {
      AppMethodBeat.o(108173);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      synchronized (this.ioU)
      {
        Iterator localIterator = this.ioU.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            h localh = (h)localIterator.next();
            if (paramString.equals(localh.hvr))
            {
              AppMethodBeat.o(108173);
              paramString = localh;
              break;
            }
          }
        AppMethodBeat.o(108173);
        paramString = null;
      }
    }
  }

  public final void a(int paramInt, String paramString1, String arg3, JSONObject arg4, Map<String, String> paramMap, ArrayList<String> paramArrayList, g.a parama, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(108171);
    String str1 = j.CS(???.optString("url"));
    String str2 = ???.optString("name");
    Map localMap = j.F(???);
    while (true)
    {
      synchronized (this.ioU)
      {
        if (this.ioU.size() >= this.ioT)
        {
          parama.BC("tasked refused max connected");
          ab.i("MicroMsg.AppBrandNetworkUpload", "max connected mUploadTaskList.size():%d,mMaxUploadConcurrent:%d", new Object[] { Integer.valueOf(this.ioU.size()), Integer.valueOf(this.ioT) });
          AppMethodBeat.o(108171);
          return;
        }
        if (TextUtils.isEmpty(str2))
        {
          parama.BC("fileName error");
          ab.i("MicroMsg.AppBrandNetworkUpload", "fileName error");
          AppMethodBeat.o(108171);
        }
      }
      paramString1 = new h(???, str1, str2, paramString5, paramInt, paramString1, parama);
      paramString1.ioX = localMap;
      paramString1.ioM = paramMap;
      paramString1.ioN = paramArrayList;
      paramString1.isRunning = true;
      paramString1.hvr = paramString3;
      paramString1.ioR = paramString4;
      synchronized (this.ioU)
      {
        this.ioU.add(paramString1);
        d.post(new g.b(this, paramString1), "appbrand_upload_thread");
        AppMethodBeat.o(108171);
      }
    }
  }

  public final void a(h paramh)
  {
    AppMethodBeat.i(108174);
    if (paramh == null)
      AppMethodBeat.o(108174);
    while (true)
    {
      return;
      this.iot.add(paramh.hvr);
      paramh.isRunning = false;
      a(paramh.hvr, paramh.ioQ);
      AppMethodBeat.o(108174);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.g
 * JD-Core Version:    0.6.2
 */