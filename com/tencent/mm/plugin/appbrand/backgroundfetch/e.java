package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.c.b;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.sdk.platformtools.ab;

public final class e
  implements b, h
{
  private d hcd;

  public final void SH()
  {
    AppMethodBeat.i(129801);
    this.hcd = f.ave();
    AppMethodBeat.o(129801);
  }

  public final void SI()
  {
    this.hcd = null;
  }

  public final boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(129802);
    if (this.hcd == null)
    {
      bool = false;
      AppMethodBeat.o(129802);
      return bool;
    }
    boolean bool = this.hcd.a(paramString1, paramInt1, paramString2, paramString3, paramString4, paramInt2, paramLong);
    if (bool)
      ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy set success(time:%s), app(%s_%d)", new Object[] { Long.valueOf(paramLong), paramString1, Integer.valueOf(paramInt1) });
    while (true)
    {
      AppMethodBeat.o(129802);
      break;
      ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy set fail, app(%s_%d)", new Object[] { paramString1, Integer.valueOf(paramInt1) });
    }
  }

  public final long aQ(String paramString, int paramInt)
  {
    long l = 0L;
    AppMethodBeat.i(129804);
    if (this.hcd == null)
    {
      AppMethodBeat.o(129804);
      return l;
    }
    l = this.hcd.aQ(paramString, paramInt);
    if (l > 0L)
      ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy getUpdateTime success(time:%s), app(%s_%d)", new Object[] { Long.valueOf(l), paramString, Integer.valueOf(paramInt) });
    while (true)
    {
      AppMethodBeat.o(129804);
      break;
      ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy getUpdateTime fail, app(%s_%d)", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
  }

  public final AppBrandBackgroundFetchDataParcel aR(String paramString, int paramInt)
  {
    AppMethodBeat.i(129805);
    if (this.hcd == null)
    {
      paramString = null;
      AppMethodBeat.o(129805);
      return paramString;
    }
    AppBrandBackgroundFetchDataParcel localAppBrandBackgroundFetchDataParcel = this.hcd.aR(paramString, paramInt);
    if (localAppBrandBackgroundFetchDataParcel == null)
      ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy getByAppId fail, app(%s_%d)", new Object[] { paramString, Integer.valueOf(paramInt) });
    while (true)
    {
      AppMethodBeat.o(129805);
      paramString = localAppBrandBackgroundFetchDataParcel;
      break;
      ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy getByAppId success, app(%s_%d)", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
  }

  public final boolean ao(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(129803);
    if (this.hcd == null)
    {
      AppMethodBeat.o(129803);
      return bool;
    }
    bool = this.hcd.ao(paramString, paramInt);
    if (bool)
      ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy delete success, app(%s_%d)", new Object[] { paramString, Integer.valueOf(paramInt) });
    while (true)
    {
      AppMethodBeat.o(129803);
      break;
      ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy delete fail, app(%s_%d)", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.e
 * JD-Core Version:    0.6.2
 */