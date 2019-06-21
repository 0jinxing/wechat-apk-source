package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.secinforeport.a.a;

class JsApiSetClipboardDataWC$ReportClipBoardTask extends MainProcessTask
{
  public static final Parcelable.Creator<ReportClipBoardTask> CREATOR;
  private String hsV;
  private String mAppId;
  private int mLength;

  static
  {
    AppMethodBeat.i(130572);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(130572);
  }

  public JsApiSetClipboardDataWC$ReportClipBoardTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130569);
    g(paramParcel);
    AppMethodBeat.o(130569);
  }

  public JsApiSetClipboardDataWC$ReportClipBoardTask(String paramString1, String paramString2, int paramInt)
  {
    this.mAppId = paramString1;
    this.hsV = paramString2;
    this.mLength = paramInt;
  }

  public final void asP()
  {
    AppMethodBeat.i(130568);
    a locala = a.qjm;
    a.D(this.mLength, this.mAppId, this.hsV);
    AppMethodBeat.o(130568);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130570);
    this.mAppId = paramParcel.readString();
    this.hsV = paramParcel.readString();
    this.mLength = paramParcel.readInt();
    AppMethodBeat.o(130570);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130571);
    paramParcel.writeString(this.mAppId);
    paramParcel.writeString(this.hsV);
    paramParcel.writeInt(this.mLength);
    AppMethodBeat.o(130571);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiSetClipboardDataWC.ReportClipBoardTask
 * JD-Core Version:    0.6.2
 */