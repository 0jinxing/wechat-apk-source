package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class WxaPkgWrappingInfo extends ModulePkgInfo
  implements Parcelable
{
  public static final Parcelable.Creator<WxaPkgWrappingInfo> CREATOR;
  public int gVt;
  public int gVu;
  public long gVv;
  public boolean gVw;
  public final LinkedList<ModulePkgInfo> gVx;
  private final Map<String, String> gVy;

  static
  {
    AppMethodBeat.i(105336);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(105336);
  }

  public WxaPkgWrappingInfo()
  {
    AppMethodBeat.i(105330);
    this.gVx = new LinkedList();
    this.gVy = new HashMap();
    this.name = "__APP__";
    this.cta = true;
    AppMethodBeat.o(105330);
  }

  public WxaPkgWrappingInfo(Parcel paramParcel)
  {
    this();
    AppMethodBeat.i(105331);
    readFromParcel(paramParcel);
    AppMethodBeat.o(105331);
  }

  public static WxaPkgWrappingInfo xM(String paramString)
  {
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = null;
    AppMethodBeat.i(105328);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(105328);
      paramString = localWxaPkgWrappingInfo;
    }
    while (true)
    {
      return paramString;
      ao localao = new ao(new File(paramString));
      if (!localao.gUe)
      {
        ab.e("MicroMsg.WxaPkgWrappingInfo#obtain", "wxPkg invalid, path = %s ", new Object[] { paramString });
        localao.close();
        AppMethodBeat.o(105328);
        paramString = localWxaPkgWrappingInfo;
      }
      else if (!localao.avW())
      {
        ab.e("MicroMsg.WxaPkgWrappingInfo#obtain", "wxPkg read info failed, path = %s ", new Object[] { paramString });
        localao.close();
        AppMethodBeat.o(105328);
        paramString = localWxaPkgWrappingInfo;
      }
      else
      {
        localao.close();
        localWxaPkgWrappingInfo = new WxaPkgWrappingInfo();
        localWxaPkgWrappingInfo.gSP = paramString;
        localWxaPkgWrappingInfo.gVw = false;
        localWxaPkgWrappingInfo.cvZ = g.cz(paramString);
        AppMethodBeat.o(105328);
        paramString = localWxaPkgWrappingInfo;
      }
    }
  }

  public static WxaPkgWrappingInfo xN(String paramString)
  {
    AppMethodBeat.i(105329);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WxaPkgWrappingInfo#obtainCodeLib", "pkgPath null!");
      paramString = null;
      AppMethodBeat.o(105329);
    }
    while (true)
    {
      return paramString;
      WxaPkgWrappingInfo localWxaPkgWrappingInfo = new WxaPkgWrappingInfo();
      localWxaPkgWrappingInfo.gSP = paramString;
      localWxaPkgWrappingInfo.gVw = false;
      localWxaPkgWrappingInfo.cvZ = g.cz(paramString);
      AppMethodBeat.o(105329);
      paramString = localWxaPkgWrappingInfo;
    }
  }

  public final void a(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(105332);
    Parcel localParcel = Parcel.obtain();
    localParcel.setDataPosition(0);
    paramWxaPkgWrappingInfo.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    readFromParcel(localParcel);
    localParcel.recycle();
    AppMethodBeat.o(105332);
  }

  final void awr()
  {
    AppMethodBeat.i(105326);
    synchronized (this.gVy)
    {
      Iterator localIterator = this.gVx.iterator();
      if (localIterator.hasNext())
      {
        ModulePkgInfo localModulePkgInfo = (ModulePkgInfo)localIterator.next();
        String str = l.yk(localModulePkgInfo.name);
        this.gVy.put(str, localModulePkgInfo.name);
        localModulePkgInfo.name = str;
      }
    }
    AppMethodBeat.o(105326);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void readFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(105335);
    super.readFromParcel(paramParcel);
    this.gVt = paramParcel.readInt();
    this.gVu = paramParcel.readInt();
    this.gVv = paramParcel.readLong();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.gVw = bool;
      paramParcel.readTypedList(this.gVx, ModulePkgInfo.CREATOR);
      AppMethodBeat.o(105335);
      return;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(105333);
    String str = "WxaPkgWrappingInfo{pkgDebugType=" + this.gVt + ", pkgVersion=" + this.gVu + ", pkgCreateTime=" + this.gVv + ", localPkg=" + this.gVw + ", md5='" + this.cvZ + '\'' + ", pkgPath='" + this.gSP + '\'' + '}';
    AppMethodBeat.o(105333);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(105334);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.gVt);
    paramParcel.writeInt(this.gVu);
    paramParcel.writeLong(this.gVv);
    if (this.gVw)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeTypedList(this.gVx);
      AppMethodBeat.o(105334);
      return;
      paramInt = 0;
    }
  }

  public final String xL(String paramString)
  {
    AppMethodBeat.i(105327);
    if ("__APP__".equals(paramString))
      AppMethodBeat.o(105327);
    while (true)
    {
      return paramString;
      synchronized (this.gVy)
      {
        paramString = (String)this.gVy.get(paramString);
        if (bo.isNullOrNil(paramString))
        {
          paramString = new IllegalAccessError("Invalid moduleName for runtime logic, call @smoothieli to fix this");
          AppMethodBeat.o(105327);
          throw paramString;
        }
      }
      AppMethodBeat.o(105327);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo
 * JD-Core Version:    0.6.2
 */