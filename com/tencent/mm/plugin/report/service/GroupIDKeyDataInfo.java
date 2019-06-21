package com.tencent.mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

class GroupIDKeyDataInfo
  implements Parcelable
{
  public static final Parcelable.Creator<GroupIDKeyDataInfo> CREATOR;
  public boolean pXA;
  ArrayList<IDKey> pXz;

  static
  {
    AppMethodBeat.i(72699);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(72699);
  }

  protected GroupIDKeyDataInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(72698);
    this.pXz = new ArrayList();
    paramParcel.readTypedList(this.pXz, IDKey.CREATOR);
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.pXA = bool;
      AppMethodBeat.o(72698);
      return;
      bool = false;
    }
  }

  GroupIDKeyDataInfo(ArrayList<IDKey> paramArrayList)
  {
    AppMethodBeat.i(72696);
    this.pXz = new ArrayList();
    this.pXz = paramArrayList;
    this.pXA = false;
    AppMethodBeat.o(72696);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(72697);
    paramParcel.writeTypedList(this.pXz);
    if (this.pXA);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(72697);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo
 * JD-Core Version:    0.6.2
 */