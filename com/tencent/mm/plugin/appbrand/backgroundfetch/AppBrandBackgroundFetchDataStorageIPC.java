package com.tencent.mm.plugin.appbrand.backgroundfetch;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCLong;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class AppBrandBackgroundFetchDataStorageIPC
  implements h
{
  public final boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(129797);
    ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "AppBrandBackgroundFetchDataStorageIPC set");
    paramString1 = (IPCBoolean)XIPCInvoker.a("com.tencent.mm", new AppBrandBackgroundFetchDataStorageIPC.WxappParams(paramString1, paramInt1, paramString2, paramString3, paramString4, paramInt2, paramLong), AppBrandBackgroundFetchDataStorageIPC.d.class);
    boolean bool;
    if ((paramString1 != null) && (paramString1.value))
    {
      bool = true;
      AppMethodBeat.o(129797);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(129797);
    }
  }

  public final long aQ(String paramString, int paramInt)
  {
    AppMethodBeat.i(129799);
    ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "AppBrandBackgroundFetchDataStorageIPC getUpdateTime");
    paramString = (IPCLong)XIPCInvoker.a("com.tencent.mm", new AppBrandBackgroundFetchDataStorageIPC.WxappIdentity(paramString, paramInt), c.class);
    long l;
    if (paramString != null)
    {
      l = paramString.value;
      AppMethodBeat.o(129799);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(129799);
    }
  }

  public final AppBrandBackgroundFetchDataParcel aR(String paramString, int paramInt)
  {
    AppMethodBeat.i(129800);
    ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "AppBrandBackgroundFetchDataStorageIPC getByAppId");
    paramString = (AppBrandBackgroundFetchDataParcel)XIPCInvoker.a("com.tencent.mm", new WxappIdentityWithAppId(paramString, paramInt), AppBrandBackgroundFetchDataStorageIPC.b.class);
    AppMethodBeat.o(129800);
    return paramString;
  }

  public final boolean ao(String paramString, int paramInt)
  {
    AppMethodBeat.i(129798);
    ab.d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "AppBrandBackgroundFetchDataStorageIPC delete");
    paramString = (IPCBoolean)XIPCInvoker.a("com.tencent.mm", new AppBrandBackgroundFetchDataStorageIPC.WxappIdentity(paramString, paramInt), AppBrandBackgroundFetchDataStorageIPC.a.class);
    boolean bool;
    if ((paramString != null) && (paramString.value))
    {
      bool = true;
      AppMethodBeat.o(129798);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(129798);
    }
  }

  static class WxappIdentityWithAppId
    implements Parcelable
  {
    public static final Parcelable.Creator<WxappIdentityWithAppId> CREATOR;
    public String csB;
    public int hca;

    static
    {
      AppMethodBeat.i(129792);
      CREATOR = new AppBrandBackgroundFetchDataStorageIPC.WxappIdentityWithAppId.1();
      AppMethodBeat.o(129792);
    }

    public WxappIdentityWithAppId()
    {
    }

    protected WxappIdentityWithAppId(Parcel paramParcel)
    {
      AppMethodBeat.i(129791);
      this.csB = paramParcel.readString();
      this.hca = paramParcel.readInt();
      AppMethodBeat.o(129791);
    }

    public WxappIdentityWithAppId(String paramString, int paramInt)
    {
      this.csB = paramString;
      this.hca = paramInt;
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(129790);
      paramParcel.writeString(this.csB);
      paramParcel.writeInt(this.hca);
      AppMethodBeat.o(129790);
    }
  }

  static class c
    implements i<AppBrandBackgroundFetchDataStorageIPC.WxappIdentity, IPCLong>
  {
    private static IPCLong b(AppBrandBackgroundFetchDataStorageIPC.WxappIdentity paramWxappIdentity)
    {
      AppMethodBeat.i(129781);
      if ((paramWxappIdentity == null) || (bo.isNullOrNil(paramWxappIdentity.username)))
      {
        ab.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "GetUpdateTimeCall:data or username is null");
        paramWxappIdentity = new IPCLong(0L);
        AppMethodBeat.o(129781);
      }
      while (true)
      {
        return paramWxappIdentity;
        try
        {
          IPCLong localIPCLong = new com/tencent/mm/ipcinvoker/type/IPCLong;
          localIPCLong.<init>(((h)g.K(h.class)).aQ(paramWxappIdentity.username, paramWxappIdentity.hca));
          AppMethodBeat.o(129781);
          paramWxappIdentity = localIPCLong;
        }
        catch (Exception paramWxappIdentity)
        {
          ab.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "GetUpdateTimeCall fail", new Object[] { paramWxappIdentity });
          paramWxappIdentity = new IPCLong(0L);
          AppMethodBeat.o(129781);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC
 * JD-Core Version:    0.6.2
 */