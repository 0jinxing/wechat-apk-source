package com.tencent.mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

class KVReportDataInfo
  implements Parcelable
{
  public static final Parcelable.Creator<KVReportDataInfo> CREATOR;
  public long ctk;
  public boolean pXA;
  public long pXX;
  public boolean pXY;
  public boolean pXZ;
  public String value;

  static
  {
    AppMethodBeat.i(72732);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(72732);
  }

  public KVReportDataInfo()
  {
    this.ctk = 0L;
  }

  protected KVReportDataInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(72731);
    this.ctk = 0L;
    this.pXX = paramParcel.readLong();
    this.ctk = paramParcel.readLong();
    this.value = paramParcel.readString();
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.pXY = bool2;
      if (paramParcel.readInt() != 1)
        break label96;
      bool2 = true;
      label65: this.pXA = bool2;
      if (paramParcel.readInt() != 1)
        break label101;
    }
    label96: label101: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.pXZ = bool2;
      AppMethodBeat.o(72731);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label65;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(72730);
    paramParcel.writeLong(this.pXX);
    paramParcel.writeLong(this.ctk);
    paramParcel.writeString(this.value);
    if (this.pXY)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.pXA)
        break label84;
      paramInt = 1;
      label54: paramParcel.writeInt(paramInt);
      if (!this.pXZ)
        break label89;
    }
    label84: label89: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(72730);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label54;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.KVReportDataInfo
 * JD-Core Version:    0.6.2
 */