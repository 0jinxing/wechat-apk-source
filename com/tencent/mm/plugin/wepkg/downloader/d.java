package com.tencent.mm.plugin.wepkg.downloader;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.concurrent.Future;

public final class d
{
  private static Object lock;
  private static volatile d uVX;
  HashMap<String, c> uVY;

  static
  {
    AppMethodBeat.i(63430);
    lock = new Object();
    AppMethodBeat.o(63430);
  }

  private d()
  {
    AppMethodBeat.i(63427);
    this.uVY = new HashMap();
    AppMethodBeat.o(63427);
  }

  public static d dgw()
  {
    AppMethodBeat.i(63426);
    if (uVX == null);
    synchronized (lock)
    {
      if (uVX == null)
      {
        d locald = new com/tencent/mm/plugin/wepkg/downloader/d;
        locald.<init>();
        uVX = locald;
      }
      ??? = uVX;
      AppMethodBeat.o(63426);
      return ???;
    }
  }

  final boolean a(c paramc)
  {
    boolean bool = true;
    AppMethodBeat.i(63429);
    if (this.uVY.containsKey(paramc.uVO.uWo))
      paramc.uVU = true;
    while (true)
    {
      try
      {
        if (paramc.uVQ != null)
          paramc.uVQ.disconnect();
        if (paramc.uVP != null)
          paramc.uVP.cancel(false);
        this.uVY.remove(paramc.uVO.uWo);
        AppMethodBeat.o(63429);
        return bool;
      }
      catch (Exception localException)
      {
        ab.i("MicroMsg.Wepkg.WePkgDownloadTask", "stop, " + localException.getMessage());
        continue;
      }
      AppMethodBeat.o(63429);
      bool = false;
    }
  }

  public final boolean ahO(String paramString)
  {
    AppMethodBeat.i(63428);
    if (this.uVY.containsKey(paramString))
      this.uVY.remove(paramString);
    AppMethodBeat.o(63428);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.downloader.d
 * JD-Core Version:    0.6.2
 */