package com.tencent.mm.plugin.sns.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.List;

public class SnsCmdList
  implements Parcelable
{
  public static final Parcelable.Creator<SnsCmdList> CREATOR;
  private int qFL;
  private int qFM;
  public List<Integer> qFN;
  public List<Integer> qFO;

  static
  {
    AppMethodBeat.i(35793);
    CREATOR = new SnsCmdList.1();
    AppMethodBeat.o(35793);
  }

  public SnsCmdList()
  {
    AppMethodBeat.i(35789);
    this.qFL = 0;
    this.qFM = 0;
    this.qFN = new LinkedList();
    this.qFO = new LinkedList();
    AppMethodBeat.o(35789);
  }

  public final void CK(int paramInt)
  {
    AppMethodBeat.i(35790);
    this.qFN.add(Integer.valueOf(paramInt));
    AppMethodBeat.o(35790);
  }

  public final void CL(int paramInt)
  {
    AppMethodBeat.i(35791);
    this.qFO.add(Integer.valueOf(paramInt));
    AppMethodBeat.o(35791);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(35792);
    this.qFL = this.qFN.size();
    paramParcel.writeInt(this.qFL);
    for (paramInt = 0; paramInt < this.qFL; paramInt++)
      paramParcel.writeInt(((Integer)this.qFN.get(paramInt)).intValue());
    this.qFM = this.qFO.size();
    paramParcel.writeInt(this.qFM);
    for (paramInt = i; paramInt < this.qFM; paramInt++)
      paramParcel.writeInt(((Integer)this.qFO.get(paramInt)).intValue());
    AppMethodBeat.o(35792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.data.SnsCmdList
 * JD-Core Version:    0.6.2
 */