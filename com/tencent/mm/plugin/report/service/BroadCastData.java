package com.tencent.mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

class BroadCastData
  implements Parcelable
{
  public static final Parcelable.Creator<BroadCastData> CREATOR;
  ArrayList<KVReportDataInfo> pXw;
  ArrayList<StIDKeyDataInfo> pXx;
  ArrayList<GroupIDKeyDataInfo> pXy;

  static
  {
    AppMethodBeat.i(72694);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(72694);
  }

  public BroadCastData()
  {
    AppMethodBeat.i(72690);
    this.pXw = new ArrayList();
    this.pXx = new ArrayList();
    this.pXy = new ArrayList();
    AppMethodBeat.o(72690);
  }

  protected BroadCastData(Parcel paramParcel)
  {
    AppMethodBeat.i(72692);
    this.pXw = new ArrayList();
    this.pXx = new ArrayList();
    this.pXy = new ArrayList();
    paramParcel.readTypedList(this.pXw, KVReportDataInfo.CREATOR);
    paramParcel.readTypedList(this.pXx, StIDKeyDataInfo.CREATOR);
    paramParcel.readTypedList(this.pXy, GroupIDKeyDataInfo.CREATOR);
    AppMethodBeat.o(72692);
  }

  public BroadCastData(BroadCastData paramBroadCastData)
  {
    AppMethodBeat.i(72691);
    this.pXw = new ArrayList();
    this.pXx = new ArrayList();
    this.pXy = new ArrayList();
    if (paramBroadCastData == null)
      AppMethodBeat.o(72691);
    while (true)
    {
      return;
      this.pXw = new ArrayList(paramBroadCastData.pXw);
      this.pXx = new ArrayList(paramBroadCastData.pXx);
      this.pXy = new ArrayList(paramBroadCastData.pXy);
      AppMethodBeat.o(72691);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(72693);
    paramParcel.writeTypedList(this.pXw);
    paramParcel.writeTypedList(this.pXx);
    paramParcel.writeTypedList(this.pXy);
    AppMethodBeat.o(72693);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.BroadCastData
 * JD-Core Version:    0.6.2
 */