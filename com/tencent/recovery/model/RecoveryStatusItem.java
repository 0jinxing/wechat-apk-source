package com.tencent.recovery.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class RecoveryStatusItem extends RecoveryPersistentItem
{
  public static final Parcelable.Creator<RecoveryStatusItem> CREATOR = new Parcelable.Creator()
  {
  };
  public int AqZ;
  public int Arb;
  public int Arc;
  public String clientVersion;
  public String eCq;
  public String processName;
  public long timestamp;

  public final boolean atL(String paramString)
  {
    boolean bool = true;
    if ((paramString == null) || (paramString.length() == 0))
      bool = false;
    while (true)
    {
      return bool;
      try
      {
        paramString = paramString.split(",");
        this.processName = paramString[0];
        this.eCq = paramString[1];
        this.clientVersion = paramString[2];
        this.AqZ = Integer.valueOf(paramString[3]).intValue();
        this.Arc = Integer.valueOf(paramString[4]).intValue();
        this.Arb = Integer.valueOf(paramString[5]).intValue();
        this.timestamp = Long.valueOf(paramString[6]).longValue();
      }
      catch (Exception paramString)
      {
        bool = false;
      }
    }
  }

  public final String dQf()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.processName);
    localStringBuffer.append(",");
    localStringBuffer.append(this.eCq);
    localStringBuffer.append(",");
    localStringBuffer.append(this.clientVersion);
    localStringBuffer.append(",");
    localStringBuffer.append(this.AqZ);
    localStringBuffer.append(",");
    localStringBuffer.append(this.Arc);
    localStringBuffer.append(",");
    localStringBuffer.append(this.Arb);
    localStringBuffer.append(",");
    localStringBuffer.append(this.timestamp);
    return localStringBuffer.toString();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.eCq);
    paramParcel.writeString(this.clientVersion);
    paramParcel.writeInt(this.AqZ);
    paramParcel.writeInt(this.Arc);
    paramParcel.writeInt(this.Arb);
    paramParcel.writeLong(this.timestamp);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.model.RecoveryStatusItem
 * JD-Core Version:    0.6.2
 */