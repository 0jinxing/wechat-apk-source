package com.tencent.mm.modelsns;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SnsAdClick
  implements Parcelable
{
  public static final Parcelable.Creator<SnsAdClick> CREATOR;
  public long cND;
  public int cvd;
  public int fPY;
  public int fPZ;
  public int fQa;
  public int fQb;
  public int fQc;
  public long fQd;
  public long fQe;
  public int fQf;
  public long startTime;

  static
  {
    AppMethodBeat.i(94456);
    CREATOR = new SnsAdClick.1();
    AppMethodBeat.o(94456);
  }

  public SnsAdClick()
  {
    this.fPY = 0;
    this.fPZ = 0;
    this.fQa = 0;
    this.startTime = 0L;
    this.fQb = 0;
    this.fQc = 0;
    this.fQd = 0L;
    this.fQe = 0L;
    this.fQf = 0;
  }

  public SnsAdClick(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4)
  {
    this(paramInt1, paramInt2, paramLong, paramInt3, paramInt4, 0);
  }

  public SnsAdClick(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, byte paramByte)
  {
    this(paramInt1, paramInt2, paramLong, 22, paramInt3, paramInt4);
  }

  private SnsAdClick(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(94454);
    this.fPY = 0;
    this.fPZ = 0;
    this.fQa = 0;
    this.startTime = 0L;
    this.fQb = 0;
    this.fQc = 0;
    this.fQd = 0L;
    this.fQe = 0L;
    this.fQf = 0;
    this.cvd = paramInt1;
    this.fPY = paramInt2;
    this.cND = paramLong;
    this.fPZ = paramInt3;
    this.fQa = paramInt4;
    this.fQb = 0;
    this.fQc = 0;
    this.fQf = paramInt5;
    this.startTime = System.currentTimeMillis();
    AppMethodBeat.o(94454);
  }

  public SnsAdClick(int paramInt1, long paramLong, int paramInt2)
  {
    this(paramInt1, 7, paramLong, paramInt2, 0, 0);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(94455);
    paramParcel.writeInt(this.cvd);
    paramParcel.writeInt(this.fPY);
    paramParcel.writeLong(this.cND);
    paramParcel.writeInt(this.fPZ);
    paramParcel.writeInt(this.fQa);
    paramParcel.writeInt(this.fQb);
    paramParcel.writeInt(this.fQc);
    paramParcel.writeLong(this.startTime);
    paramParcel.writeLong(this.fQe);
    AppMethodBeat.o(94455);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsns.SnsAdClick
 * JD-Core Version:    0.6.2
 */