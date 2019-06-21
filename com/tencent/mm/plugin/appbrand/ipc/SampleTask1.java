package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class SampleTask1 extends MainProcessTask
{
  public static final Parcelable.Creator<SampleTask1> CREATOR;
  public String hvG;
  public String hvH;

  static
  {
    AppMethodBeat.i(86960);
    CREATOR = new SampleTask1.1();
    AppMethodBeat.o(86960);
  }

  public SampleTask1(Parcel paramParcel)
  {
    AppMethodBeat.i(86955);
    g(paramParcel);
    AppMethodBeat.o(86955);
  }

  public final void asP()
  {
    AppMethodBeat.i(86956);
    ab.e("SampleTask", this.hvG);
    this.hvH = "String from Main Process";
    aCb();
    AppMethodBeat.o(86956);
  }

  public final void asQ()
  {
    AppMethodBeat.i(86957);
    ab.e("SampleTask", this.hvH);
    AppMethodBeat.o(86957);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(86958);
    this.hvG = paramParcel.readString();
    this.hvH = paramParcel.readString();
    AppMethodBeat.o(86958);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(86959);
    paramParcel.writeString(this.hvG);
    paramParcel.writeString(this.hvH);
    AppMethodBeat.o(86959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.SampleTask1
 * JD-Core Version:    0.6.2
 */