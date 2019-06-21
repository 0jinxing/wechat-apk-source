package com.tencent.mm.plugin.wepkg.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public class ReloadNotify
  implements Parcelable
{
  public static Parcelable.Creator<ReloadNotify> CREATOR;
  public static Set<String> uWB;
  public String[] uWC;

  static
  {
    AppMethodBeat.i(63477);
    uWB = new HashSet();
    CREATOR = new ReloadNotify.1();
    AppMethodBeat.o(63477);
  }

  private ReloadNotify(Parcel paramParcel)
  {
    AppMethodBeat.i(63476);
    this.uWC = paramParcel.createStringArray();
    AppMethodBeat.o(63476);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(63475);
    paramParcel.writeStringArray(this.uWC);
    AppMethodBeat.o(63475);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.event.ReloadNotify
 * JD-Core Version:    0.6.2
 */