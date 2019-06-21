package com.tencent.luggage.sdk.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class OnWXAppResultXPCWrapper$SafeParcelableWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<SafeParcelableWrapper> CREATOR;
  private Parcelable bRi;

  static
  {
    AppMethodBeat.i(101675);
    CREATOR = new OnWXAppResultXPCWrapper.SafeParcelableWrapper.1();
    AppMethodBeat.o(101675);
  }

  OnWXAppResultXPCWrapper$SafeParcelableWrapper(Parcel paramParcel)
  {
    AppMethodBeat.i(101674);
    String str = paramParcel.readString();
    if (TextUtils.isEmpty(str))
    {
      this.bRi = null;
      AppMethodBeat.o(101674);
    }
    while (true)
    {
      return;
      try
      {
        this.bRi = paramParcel.readParcelable(Class.forName(str).getClassLoader());
        AppMethodBeat.o(101674);
      }
      catch (ClassNotFoundException paramParcel)
      {
        d.e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "ClassNotFoundException with %s", new Object[] { str });
        AppMethodBeat.o(101674);
      }
    }
  }

  OnWXAppResultXPCWrapper$SafeParcelableWrapper(Parcelable paramParcelable)
  {
    this.bRi = paramParcelable;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(101673);
    if (this.bRi == null)
    {
      paramParcel.writeString(null);
      AppMethodBeat.o(101673);
    }
    while (true)
    {
      return;
      paramParcel.writeString(this.bRi.getClass().getName());
      paramParcel.writeParcelable(this.bRi, paramInt);
      AppMethodBeat.o(101673);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.SafeParcelableWrapper
 * JD-Core Version:    0.6.2
 */