package com.tencent.recovery.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class RecoveryData
  implements Parcelable
{
  public static final Parcelable.Creator<RecoveryData> CREATOR = new Parcelable.Creator()
  {
  };
  public String Arl;
  public List<RecoveryStatusItem> Arm;
  public String clientVersion;
  public String eCq;
  public String processName;

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.eCq);
    paramParcel.writeString(this.clientVersion);
    paramParcel.writeString(this.Arl);
    paramParcel.writeList(this.Arm);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.model.RecoveryData
 * JD-Core Version:    0.6.2
 */