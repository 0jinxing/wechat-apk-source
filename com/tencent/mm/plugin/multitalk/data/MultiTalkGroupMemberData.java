package com.tencent.mm.plugin.multitalk.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;

public class MultiTalkGroupMemberData
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupMemberData> CREATOR;
  MultiTalkGroupMember oFO;

  static
  {
    AppMethodBeat.i(53884);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(53884);
  }

  public MultiTalkGroupMemberData(MultiTalkGroupMember paramMultiTalkGroupMember)
  {
    this.oFO = paramMultiTalkGroupMember;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(53883);
    paramParcel.writeString(bo.bc(this.oFO.Aqh, ""));
    paramParcel.writeString(bo.bc(this.oFO.Aqi, ""));
    paramParcel.writeInt(this.oFO.status);
    paramParcel.writeInt(this.oFO.boZ);
    paramParcel.writeInt(this.oFO.Api);
    AppMethodBeat.o(53883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData
 * JD-Core Version:    0.6.2
 */