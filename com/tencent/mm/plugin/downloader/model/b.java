package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Vector;

public final class b
{
  private static Vector<k> kMI;
  private static k kMJ;

  static
  {
    AppMethodBeat.i(2395);
    kMI = new Vector();
    AppMethodBeat.o(2395);
  }

  public static void a(k paramk)
  {
    AppMethodBeat.i(2384);
    if ((paramk != null) && (!kMI.contains(paramk)))
      kMI.add(paramk);
    AppMethodBeat.o(2384);
  }

  public static void b(k paramk)
  {
    AppMethodBeat.i(2385);
    if (paramk != null)
      kMI.remove(paramk);
    AppMethodBeat.o(2385);
  }

  public static void bif()
  {
    kMJ = null;
  }

  public static void c(k paramk)
  {
    kMJ = paramk;
  }

  public final void c(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(2389);
    ab.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFinished: %d", new Object[] { Long.valueOf(paramLong) });
    a locala = c.hv(paramLong);
    if (locala != null)
      com.tencent.mm.plugin.downloader.a.c.o(new String[] { locala.field_downloadUrl, locala.field_secondaryUrl });
    al.d(new b.4(this, paramLong, paramString, paramBoolean));
    AppMethodBeat.o(2389);
  }

  public final void d(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(2390);
    ab.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFailed: %d, errCode : %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    a locala = c.hv(paramLong);
    if (locala != null)
      com.tencent.mm.plugin.downloader.a.c.o(new String[] { locala.field_downloadUrl, locala.field_secondaryUrl });
    al.d(new b.5(this, paramLong, paramInt, paramBoolean));
    AppMethodBeat.o(2390);
  }

  public final void hr(long paramLong)
  {
    AppMethodBeat.i(2388);
    ab.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskRemoved: %d", new Object[] { Long.valueOf(paramLong) });
    a locala = c.hv(paramLong);
    if (locala != null)
      com.tencent.mm.plugin.downloader.a.c.o(new String[] { locala.field_downloadUrl, locala.field_secondaryUrl });
    al.d(new b.3(this, paramLong));
    AppMethodBeat.o(2388);
  }

  public final void hs(long paramLong)
  {
    AppMethodBeat.i(2391);
    ab.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskPaused: %d", new Object[] { Long.valueOf(paramLong) });
    a locala = c.hv(paramLong);
    if (locala != null)
      com.tencent.mm.plugin.downloader.a.c.o(new String[] { locala.field_downloadUrl, locala.field_secondaryUrl });
    al.d(new b.6(this, paramLong));
    AppMethodBeat.o(2391);
  }

  public final void ht(long paramLong)
  {
    AppMethodBeat.i(2392);
    al.d(new b.7(this, paramLong));
    AppMethodBeat.o(2392);
  }

  public final void hu(long paramLong)
  {
    AppMethodBeat.i(2393);
    ab.i("MicroMsg.FileDownloaderCallbackManager", "notifyMd5Checking: %d", new Object[] { Long.valueOf(paramLong) });
    al.d(new b.8(this, paramLong));
    AppMethodBeat.o(2393);
  }

  public final void j(long paramLong, String paramString)
  {
    AppMethodBeat.i(2386);
    ab.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskStarted: %d, %s", new Object[] { Long.valueOf(paramLong), paramString });
    al.d(new b.1(this, paramLong, paramString));
    AppMethodBeat.o(2386);
  }

  public final void k(long paramLong, String paramString)
  {
    AppMethodBeat.i(2387);
    ab.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskResumed: %d, %s", new Object[] { Long.valueOf(paramLong), paramString });
    al.d(new b.2(this, paramLong, paramString));
    AppMethodBeat.o(2387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.b
 * JD-Core Version:    0.6.2
 */