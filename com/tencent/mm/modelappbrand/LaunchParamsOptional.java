package com.tencent.mm.modelappbrand;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.launching.params.AppBrandWeishiParams;

public final class LaunchParamsOptional
  implements Parcelable
{
  public static final Parcelable.Creator<LaunchParamsOptional> CREATOR;
  public String bQh;
  public String bQi;
  public AppBrandWeishiParams bQj;
  public String fpI;

  static
  {
    AppMethodBeat.i(101708);
    CREATOR = new LaunchParamsOptional.1();
    AppMethodBeat.o(101708);
  }

  public LaunchParamsOptional()
  {
  }

  private LaunchParamsOptional(Parcel paramParcel)
  {
    AppMethodBeat.i(101707);
    this.bQh = paramParcel.readString();
    this.bQi = paramParcel.readString();
    this.bQj = ((AppBrandWeishiParams)paramParcel.readParcelable(AppBrandWeishiParams.class.getClassLoader()));
    AppMethodBeat.o(101707);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(101706);
    paramParcel.writeString(this.bQh);
    paramParcel.writeString(this.bQi);
    paramParcel.writeParcelable(this.bQj, paramInt);
    AppMethodBeat.o(101706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.LaunchParamsOptional
 * JD-Core Version:    0.6.2
 */