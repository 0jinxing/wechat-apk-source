package com.tencent.pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class MultiTalkGroup
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroup> CREATOR = new MultiTalkGroup.1();
  public int AlR;
  public String Aqc = "";
  public String Aqd = "";
  public String Aqe = "";
  public String Aqf = "";
  public List<MultiTalkGroupMember> Aqg = new ArrayList();

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "MultiTalkGroup [mMultiTalkGroupId=" + this.Aqc + ", mMultiTalkClientGroupId=" + this.Aqd + ", mWxGroupId=" + this.Aqe + ", mRouteId=" + this.AlR + ", mCreatorUsrName=" + this.Aqf + ", mMultiTalkGroupMemberList=" + this.Aqg + "]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    String str;
    if (this.Aqc == null)
    {
      str = "";
      paramParcel.writeString(str);
      if (this.Aqd != null)
        break label133;
      str = "";
      label30: paramParcel.writeString(str);
      if (this.Aqe != null)
        break label142;
      str = "";
      label47: paramParcel.writeString(str);
      paramParcel.writeInt(this.AlR);
      if (this.Aqf != null)
        break label151;
      str = "";
      label72: paramParcel.writeString(str);
      if (this.Aqg != null)
        break label160;
    }
    label133: label142: label151: label160: for (int j = 0; ; j = this.Aqg.size())
    {
      paramParcel.writeInt(j);
      while (i < j)
      {
        paramParcel.writeParcelable((MultiTalkGroupMember)this.Aqg.get(i), paramInt);
        i++;
      }
      str = this.Aqc;
      break;
      str = this.Aqd;
      break label30;
      str = this.Aqe;
      break label47;
      str = this.Aqf;
      break label72;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.pb.talkroom.sdk.MultiTalkGroup
 * JD-Core Version:    0.6.2
 */