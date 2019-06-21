package com.tencent.mm.plugin.wepkg.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public class ForceUpdateNotify
  implements Parcelable
{
  public static Parcelable.Creator<ForceUpdateNotify> CREATOR;
  public static Set<String> uWB;
  public String[] uWC;

  static
  {
    AppMethodBeat.i(63466);
    uWB = new HashSet();
    CREATOR = new ForceUpdateNotify.2();
    AppMethodBeat.o(63466);
  }

  private ForceUpdateNotify(Parcel paramParcel)
  {
    AppMethodBeat.i(63465);
    this.uWC = paramParcel.createStringArray();
    AppMethodBeat.o(63465);
  }

  private ForceUpdateNotify(String[] paramArrayOfString)
  {
    this.uWC = paramArrayOfString;
  }

  public static void bny()
  {
    AppMethodBeat.i(63463);
    if (uWB.size() != 0)
    {
      Set localSet = uWB;
      c.a(new ForceUpdateNotify((String[])localSet.toArray(new String[localSet.size()])), new ForceUpdateNotify.1());
    }
    AppMethodBeat.o(63463);
  }

  public static void wy(String paramString)
  {
    AppMethodBeat.i(63462);
    uWB.add(paramString);
    AppMethodBeat.o(63462);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(63464);
    paramParcel.writeStringArray(this.uWC);
    AppMethodBeat.o(63464);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify
 * JD-Core Version:    0.6.2
 */