package com.tencent.mm.plugin.appbrand.jsapi.offlinevoice;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class IPCSetCurrentPaySpeech$IPCSetCurrentPaySpeechParam
  implements Parcelable
{
  public static final Parcelable.Creator<IPCSetCurrentPaySpeechParam> CREATOR;
  private String hSJ;
  private String hSK;
  private String hSL;
  private boolean hSM;
  private String hSN;

  static
  {
    AppMethodBeat.i(131369);
    CREATOR = new IPCSetCurrentPaySpeech.IPCSetCurrentPaySpeechParam.1();
    AppMethodBeat.o(131369);
  }

  public IPCSetCurrentPaySpeech$IPCSetCurrentPaySpeechParam()
  {
  }

  protected IPCSetCurrentPaySpeech$IPCSetCurrentPaySpeechParam(Parcel paramParcel)
  {
    AppMethodBeat.i(131368);
    this.hSJ = paramParcel.readString();
    this.hSK = paramParcel.readString();
    this.hSL = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.hSM = bool;
      this.hSN = paramParcel.readString();
      AppMethodBeat.o(131368);
      return;
    }
  }

  public IPCSetCurrentPaySpeech$IPCSetCurrentPaySpeechParam(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this.hSJ = paramString1;
    this.hSK = paramString2;
    this.hSL = paramString3;
    this.hSM = paramBoolean;
    this.hSN = paramString4;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131367);
    paramParcel.writeString(this.hSJ);
    paramParcel.writeString(this.hSK);
    paramParcel.writeString(this.hSL);
    if (this.hSM)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeString(this.hSN);
      AppMethodBeat.o(131367);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech.IPCSetCurrentPaySpeechParam
 * JD-Core Version:    0.6.2
 */