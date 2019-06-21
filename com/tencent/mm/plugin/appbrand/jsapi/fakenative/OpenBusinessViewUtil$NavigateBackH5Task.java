package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

public final class OpenBusinessViewUtil$NavigateBackH5Task extends MainProcessTask
{
  public static final Parcelable.Creator<NavigateBackH5Task> CREATOR;
  public String businessType;
  public int errCode;
  public String extra;

  static
  {
    AppMethodBeat.i(131049);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(131049);
  }

  public OpenBusinessViewUtil$NavigateBackH5Task()
  {
  }

  public OpenBusinessViewUtil$NavigateBackH5Task(String paramString1, String paramString2, int paramInt)
  {
    this.businessType = paramString1;
    this.extra = paramString2;
    this.errCode = paramInt;
  }

  public final void asP()
  {
    AppMethodBeat.i(131046);
    OpenBusinessViewUtil.q(this.businessType, this.extra, this.errCode);
    AppMethodBeat.o(131046);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(131048);
    this.businessType = paramParcel.readString();
    this.extra = paramParcel.readString();
    this.errCode = paramParcel.readInt();
    AppMethodBeat.o(131048);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131047);
    paramParcel.writeString(this.businessType);
    paramParcel.writeString(this.extra);
    paramParcel.writeInt(this.errCode);
    AppMethodBeat.o(131047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil.NavigateBackH5Task
 * JD-Core Version:    0.6.2
 */