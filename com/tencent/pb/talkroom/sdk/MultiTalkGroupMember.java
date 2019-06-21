package com.tencent.pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MultiTalkGroupMember
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupMember> CREATOR = new MultiTalkGroupMember.1();
  public int Api;
  public String Aqh = "";
  public String Aqi = "";
  public int boZ;
  public int status;

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "MultiTalkGroupMember [usrName=" + this.Aqh + ", inviteUsrName=" + this.Aqi + ", status=" + this.status + ", reason=" + this.boZ + ", inviteTime=" + this.Api + "]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.Aqh == null)
    {
      str = "";
      paramParcel.writeString(str);
      if (this.Aqi != null)
        break label63;
    }
    label63: for (String str = ""; ; str = this.Aqi)
    {
      paramParcel.writeString(str);
      paramParcel.writeInt(this.status);
      paramParcel.writeInt(this.boZ);
      paramParcel.writeInt(this.Api);
      return;
      str = this.Aqh;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.talkroom.sdk.MultiTalkGroupMember
 * JD-Core Version:    0.6.2
 */