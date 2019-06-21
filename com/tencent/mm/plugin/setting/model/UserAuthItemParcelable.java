package com.tencent.mm.plugin.setting.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class UserAuthItemParcelable
  implements Parcelable
{
  public static final Parcelable.Creator<UserAuthItemParcelable> CREATOR;
  public String qkh;
  public int qki;
  public String scope;
  public int state;

  static
  {
    AppMethodBeat.i(126882);
    CREATOR = new UserAuthItemParcelable.1();
    AppMethodBeat.o(126882);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(126881);
    paramParcel.writeString(this.scope);
    paramParcel.writeString(this.qkh);
    paramParcel.writeInt(this.state);
    paramParcel.writeInt(this.qki);
    AppMethodBeat.o(126881);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.UserAuthItemParcelable
 * JD-Core Version:    0.6.2
 */