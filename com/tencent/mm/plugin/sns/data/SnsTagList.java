package com.tencent.mm.plugin.sns.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsTagList
  implements Parcelable
{
  public static final Parcelable.Creator<SnsTagList> CREATOR;
  private int qFV;
  private List<Long> qFW;

  static
  {
    AppMethodBeat.i(35803);
    CREATOR = new SnsTagList.1();
    AppMethodBeat.o(35803);
  }

  public SnsTagList()
  {
    AppMethodBeat.i(35801);
    this.qFV = 0;
    this.qFW = new LinkedList();
    AppMethodBeat.o(35801);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(35802);
    this.qFV = this.qFW.size();
    paramParcel.writeInt(this.qFV);
    Iterator localIterator = this.qFW.iterator();
    while (localIterator.hasNext())
      paramParcel.writeLong(((Long)localIterator.next()).longValue());
    AppMethodBeat.o(35802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.data.SnsTagList
 * JD-Core Version:    0.6.2
 */