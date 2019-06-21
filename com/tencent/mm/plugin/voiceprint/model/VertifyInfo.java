package com.tencent.mm.plugin.voiceprint.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class VertifyInfo
  implements Parcelable
{
  public static final Parcelable.Creator<VertifyInfo> CREATOR;
  public String gCk = "";
  public String mFileName = "";
  public String mText = "";
  public boolean mcM = false;
  public String sKY = "";
  public int sLg = 0;
  public int sLn;
  public int sLo;
  public int sLp = 0;
  public boolean sLq = false;

  static
  {
    AppMethodBeat.i(26110);
    CREATOR = new VertifyInfo.1();
    AppMethodBeat.o(26110);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(26109);
    paramParcel.writeInt(this.sLn);
    paramParcel.writeInt(this.sLo);
    paramParcel.writeInt(this.sLp);
    paramParcel.writeInt(this.sLg);
    paramParcel.writeString(bo.bc(this.mText, ""));
    paramParcel.writeString(bo.bc(this.sKY, ""));
    paramParcel.writeString(bo.bc(this.mFileName, ""));
    if (this.sLq)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.mcM)
        break label119;
    }
    label119: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(26109);
      return;
      paramInt = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.VertifyInfo
 * JD-Core Version:    0.6.2
 */