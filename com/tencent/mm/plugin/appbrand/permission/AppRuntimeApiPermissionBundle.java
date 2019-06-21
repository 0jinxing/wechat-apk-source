package com.tencent.mm.plugin.appbrand.permission;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.appbrand.jsapi.j;
import com.tencent.mm.protocal.protobuf.rg;
import java.util.LinkedList;
import java.util.Locale;

public final class AppRuntimeApiPermissionBundle
  implements Parcelable, j
{
  public static final Parcelable.Creator<AppRuntimeApiPermissionBundle> CREATOR;
  final byte[] iwG;
  final byte[] iwH;
  final byte[] iwI;

  static
  {
    AppMethodBeat.i(102278);
    CREATOR = new AppRuntimeApiPermissionBundle.1();
    AppMethodBeat.o(102278);
  }

  private AppRuntimeApiPermissionBundle(Parcel paramParcel)
  {
    AppMethodBeat.i(102277);
    this.iwG = paramParcel.createByteArray();
    this.iwH = paramParcel.createByteArray();
    this.iwI = paramParcel.createByteArray();
    AppMethodBeat.o(102277);
  }

  public AppRuntimeApiPermissionBundle(rg paramrg)
  {
    AppMethodBeat.i(102274);
    this.iwG = paramrg.vYw.toByteArray();
    this.iwH = ((b)paramrg.vYx.get(0)).toByteArray();
    this.iwI = ((b)paramrg.vYx.get(1)).toByteArray();
    AppMethodBeat.o(102274);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    AppMethodBeat.i(102275);
    String str = String.format(Locale.US, "PermissionBundle[%d][%d][%d]", new Object[] { Integer.valueOf(this.iwG.length), Integer.valueOf(this.iwH.length), Integer.valueOf(this.iwI.length) });
    AppMethodBeat.o(102275);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102276);
    paramParcel.writeByteArray(this.iwG);
    paramParcel.writeByteArray(this.iwH);
    paramParcel.writeByteArray(this.iwI);
    AppMethodBeat.o(102276);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle
 * JD-Core Version:    0.6.2
 */