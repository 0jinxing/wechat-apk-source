package com.tencent.mm.plugin.setting.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SwitchAccountModel
  implements Parcelable
{
  public static final Parcelable.Creator<SwitchAccountModel> CREATOR;
  public final String mnu;
  public final String qjK;
  public final String qjL;
  public final int qjM;
  public final String username;

  static
  {
    AppMethodBeat.i(126864);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(126864);
  }

  public SwitchAccountModel(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    this.qjK = paramString1;
    this.username = paramString2;
    this.mnu = paramString3;
    this.qjL = paramString4;
    this.qjM = paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(126863);
    paramParcel.writeString(this.qjK);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.mnu);
    paramParcel.writeString(this.qjL);
    paramParcel.writeInt(this.qjM);
    AppMethodBeat.o(126863);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.SwitchAccountModel
 * JD-Core Version:    0.6.2
 */