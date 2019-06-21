package com.tencent.mm.plugin.multitalk.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.List;

public class MultiTalkGroupData
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupData> CREATOR;
  private MultiTalkGroup oFN;

  static
  {
    AppMethodBeat.i(53881);
    CREATOR = new MultiTalkGroupData.1();
    AppMethodBeat.o(53881);
  }

  public MultiTalkGroupData()
  {
  }

  public MultiTalkGroupData(MultiTalkGroup paramMultiTalkGroup)
  {
    this.oFN = paramMultiTalkGroup;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(53880);
    paramParcel.writeString(bo.bc(this.oFN.Aqc, ""));
    paramParcel.writeString(bo.bc(this.oFN.Aqd, ""));
    paramParcel.writeString(bo.bc(this.oFN.Aqe, ""));
    paramParcel.writeInt(this.oFN.AlR);
    paramParcel.writeString(bo.bc(this.oFN.Aqf, ""));
    paramParcel.writeInt(this.oFN.Aqg.size());
    for (int i = 0; i < this.oFN.Aqg.size(); i++)
      paramParcel.writeParcelable(new MultiTalkGroupMemberData((MultiTalkGroupMember)this.oFN.Aqg.get(i)), paramInt);
    AppMethodBeat.o(53880);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.data.MultiTalkGroupData
 * JD-Core Version:    0.6.2
 */