package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;
import junit.framework.Assert;

class WxaWidgetInitializer$WxaWidgetContextImpl
  implements WxaWidgetContext
{
  public static final Parcelable.Creator<WxaWidgetContextImpl> CREATOR;
  String eIq;
  WxaPkgWrappingInfo hlU;
  WxaPkgWrappingInfo hlV;
  byte[] hlW;
  int hlX;
  DebuggerInfo hlY;
  WidgetSysConfig hlZ;
  WidgetRuntimeConfig hma;
  String mAppId;

  static
  {
    AppMethodBeat.i(10723);
    CREATOR = new WxaWidgetInitializer.WxaWidgetContextImpl.1();
    AppMethodBeat.o(10723);
  }

  public WxaWidgetInitializer$WxaWidgetContextImpl(Parcel paramParcel)
  {
    AppMethodBeat.i(10720);
    ClassLoader localClassLoader = getClass().getClassLoader();
    this.eIq = paramParcel.readString();
    this.mAppId = paramParcel.readString();
    this.hlV = ((WxaPkgWrappingInfo)paramParcel.readParcelable(localClassLoader));
    this.hlU = ((WxaPkgWrappingInfo)paramParcel.readParcelable(localClassLoader));
    this.hlW = paramParcel.createByteArray();
    this.hlX = paramParcel.readInt();
    this.hlY = ((DebuggerInfo)paramParcel.readParcelable(localClassLoader));
    this.hlZ = ((WidgetSysConfig)paramParcel.readParcelable(localClassLoader));
    this.hma = ((WidgetRuntimeConfig)paramParcel.readParcelable(localClassLoader));
    AppMethodBeat.o(10720);
  }

  public WxaWidgetInitializer$WxaWidgetContextImpl(WxaPkgWrappingInfo paramWxaPkgWrappingInfo1, WxaPkgWrappingInfo paramWxaPkgWrappingInfo2)
  {
    AppMethodBeat.i(10721);
    Assert.assertNotNull(paramWxaPkgWrappingInfo1);
    Assert.assertNotNull(paramWxaPkgWrappingInfo2);
    this.hlV = paramWxaPkgWrappingInfo1;
    this.hlU = paramWxaPkgWrappingInfo2;
    AppMethodBeat.o(10721);
  }

  public final int avn()
  {
    if (this.hlU != null);
    for (int i = this.hlU.gVt; ; i = 0)
      return i;
  }

  public final WxaPkgWrappingInfo azF()
  {
    return this.hlU;
  }

  public final WxaPkgWrappingInfo azG()
  {
    return this.hlV;
  }

  public final int azH()
  {
    if (this.hlU != null);
    for (int i = this.hlU.gVu; ; i = 0)
      return i;
  }

  public final byte[] azI()
  {
    return this.hlW;
  }

  public final int azJ()
  {
    return this.hlX;
  }

  public final DebuggerInfo azK()
  {
    return this.hlY;
  }

  public final WidgetSysConfig azL()
  {
    return this.hlZ;
  }

  public final WidgetRuntimeConfig azM()
  {
    return this.hma;
  }

  public int describeContents()
  {
    return 0;
  }

  public final String getAppId()
  {
    return this.mAppId;
  }

  public final String getId()
  {
    return this.eIq;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(10722);
    paramParcel.writeString(this.eIq);
    paramParcel.writeString(this.mAppId);
    paramParcel.writeParcelable(this.hlV, paramInt);
    paramParcel.writeParcelable(this.hlU, paramInt);
    paramParcel.writeByteArray(this.hlW);
    paramParcel.writeInt(this.hlX);
    paramParcel.writeParcelable(this.hlY, paramInt);
    paramParcel.writeParcelable(this.hlZ, paramInt);
    paramParcel.writeParcelable(this.hma, paramInt);
    AppMethodBeat.o(10722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetInitializer.WxaWidgetContextImpl
 * JD-Core Version:    0.6.2
 */