package com.tencent.mm.plugin.webview.stub;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewStubTempUI$StartActivityForResultTask
  implements Parcelable
{
  public static final Parcelable.Creator<StartActivityForResultTask> CREATOR;
  String qiZ;
  int requestCode;
  int unN;
  String uqP;
  Intent uqQ;
  boolean uqR;

  static
  {
    AppMethodBeat.i(7225);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(7225);
  }

  WebViewStubTempUI$StartActivityForResultTask()
  {
  }

  WebViewStubTempUI$StartActivityForResultTask(Parcel paramParcel)
  {
    AppMethodBeat.i(7224);
    this.qiZ = paramParcel.readString();
    this.uqP = paramParcel.readString();
    this.uqQ = ((Intent)paramParcel.readParcelable(Intent.class.getClassLoader()));
    this.requestCode = paramParcel.readInt();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.uqR = bool;
      this.unN = paramParcel.readInt();
      AppMethodBeat.o(7224);
      return;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(7223);
    paramParcel.writeString(this.qiZ);
    paramParcel.writeString(this.uqP);
    paramParcel.writeParcelable(this.uqQ, paramInt);
    paramParcel.writeInt(this.requestCode);
    if (this.uqR)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeInt(this.unN);
      AppMethodBeat.o(7223);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.StartActivityForResultTask
 * JD-Core Version:    0.6.2
 */