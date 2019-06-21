package com.tencent.mm.plugin.appbrand.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class LocalUsageInfo
  implements Parcelable
{
  public static final Parcelable.Creator<LocalUsageInfo> CREATOR;
  public final String appId;
  public final int axy;
  public final String bQo;
  public final String haO;
  public final boolean haP;
  public final long haQ;
  public final long haR;
  public final int har;
  public final String nickname;
  public final String username;

  static
  {
    AppMethodBeat.i(114912);
    CREATOR = new LocalUsageInfo.1();
    AppMethodBeat.o(114912);
  }

  private LocalUsageInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(114911);
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.har = paramParcel.readInt();
    this.axy = paramParcel.readInt();
    this.nickname = paramParcel.readString();
    this.bQo = paramParcel.readString();
    this.haO = paramParcel.readString();
    if (paramParcel.readByte() > 0);
    for (boolean bool = true; ; bool = false)
    {
      this.haP = bool;
      this.haQ = paramParcel.readLong();
      this.haR = paramParcel.readLong();
      AppMethodBeat.o(114911);
      return;
    }
  }

  public LocalUsageInfo(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    this.username = paramString1;
    this.appId = paramString2;
    this.har = paramInt1;
    this.axy = paramInt2;
    this.nickname = paramString3;
    this.bQo = paramString4;
    this.haO = paramString5;
    this.haP = paramBoolean;
    this.haQ = paramLong1;
    this.haR = paramLong2;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean e(LocalUsageInfo paramLocalUsageInfo)
  {
    boolean bool = false;
    AppMethodBeat.i(114909);
    if (paramLocalUsageInfo == null)
      AppMethodBeat.o(114909);
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramLocalUsageInfo.username))
      {
        AppMethodBeat.o(114909);
      }
      else if ((paramLocalUsageInfo.username.equals(this.username)) && (paramLocalUsageInfo.har == this.har))
      {
        bool = true;
        AppMethodBeat.o(114909);
      }
      else
      {
        AppMethodBeat.o(114909);
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114910);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.har);
    paramParcel.writeInt(this.axy);
    paramParcel.writeString(this.nickname);
    paramParcel.writeString(this.bQo);
    paramParcel.writeString(this.haO);
    if (this.haP);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.haQ);
      paramParcel.writeLong(this.haR);
      AppMethodBeat.o(114910);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo
 * JD-Core Version:    0.6.2
 */