package com.tencent.mm.plugin.performance.elf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ElfCheckResponse
  implements Parcelable
{
  public static final Parcelable.Creator<ElfCheckResponse> CREATOR;
  Bundle DA;
  public boolean nDl;
  public long oJs;
  boolean pfo;
  boolean pfp;
  private String pfq;
  private long pfr;
  long pfs;
  String processName;

  static
  {
    AppMethodBeat.i(111056);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(111056);
  }

  protected ElfCheckResponse(Parcel paramParcel)
  {
    AppMethodBeat.i(111055);
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.pfo = bool2;
      if (paramParcel.readByte() == 0)
        break label112;
      bool2 = true;
      label34: this.nDl = bool2;
      this.oJs = paramParcel.readLong();
      if (paramParcel.readByte() == 0)
        break label117;
    }
    label112: label117: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.pfp = bool2;
      this.pfq = paramParcel.readString();
      this.processName = paramParcel.readString();
      this.pfr = paramParcel.readLong();
      this.pfs = paramParcel.readLong();
      this.DA = paramParcel.readBundle();
      AppMethodBeat.o(111055);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label34;
    }
  }

  public ElfCheckResponse(boolean paramBoolean1, long paramLong, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2)
  {
    this.pfp = paramBoolean3;
    this.pfo = paramBoolean2;
    this.processName = paramString1;
    this.pfq = paramString2;
    this.pfs = 1000L;
    this.oJs = paramLong;
    this.nDl = paramBoolean1;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(111053);
    String str = this.pfo + "," + this.pfp + "," + this.pfr + "," + this.processName + "," + this.pfq + "," + this.pfs;
    AppMethodBeat.o(111053);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(111054);
    int i;
    if (this.pfo)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.nDl)
        break label121;
      i = 1;
      b = i;
      label37: paramParcel.writeByte(b);
      paramParcel.writeLong(this.oJs);
      if (!this.pfp)
        break label129;
    }
    label121: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      paramParcel.writeString(this.pfq);
      paramParcel.writeString(this.processName);
      paramParcel.writeLong(this.pfr);
      paramParcel.writeLong(this.pfs);
      paramParcel.writeBundle(this.DA);
      AppMethodBeat.o(111054);
      return;
      i = 0;
      j = i;
      break;
      i = 0;
      j = i;
      break label37;
      label129: paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.ElfCheckResponse
 * JD-Core Version:    0.6.2
 */