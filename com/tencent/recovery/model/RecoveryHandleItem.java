package com.tencent.recovery.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class RecoveryHandleItem extends RecoveryPersistentItem
{
  public static final Parcelable.Creator<RecoveryHandleItem> CREATOR = new Parcelable.Creator()
  {
  };
  public String Arn;
  public String clientVersion;
  public String eCq;
  public String key;
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
        this.eCq = paramString[0];
        this.clientVersion = paramString[1];
        this.key = paramString[2];
        this.processName = paramString[3];
        this.Arn = paramString[4];
        this.timestamp = Long.valueOf(paramString[5]).longValue();
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
    localStringBuffer.append(this.eCq);
    localStringBuffer.append(",");
    localStringBuffer.append(this.clientVersion);
    localStringBuffer.append(",");
    localStringBuffer.append(this.key);
    localStringBuffer.append(",");
    localStringBuffer.append(this.processName);
    localStringBuffer.append(",");
    localStringBuffer.append(this.Arn);
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
    paramParcel.writeString(this.eCq);
    paramParcel.writeString(this.clientVersion);
    paramParcel.writeString(this.key);
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.Arn);
    paramParcel.writeLong(this.timestamp);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.model.RecoveryHandleItem
 * JD-Core Version:    0.6.2
 */