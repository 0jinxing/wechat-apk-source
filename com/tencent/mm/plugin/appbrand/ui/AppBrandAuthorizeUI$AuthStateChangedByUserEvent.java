package com.tencent.mm.plugin.appbrand.ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppBrandAuthorizeUI$AuthStateChangedByUserEvent
  implements Parcelable
{
  public static final Parcelable.Creator<AuthStateChangedByUserEvent> CREATOR;

  static
  {
    AppMethodBeat.i(132908);
    CREATOR = new AppBrandAuthorizeUI.AuthStateChangedByUserEvent.1();
    AppMethodBeat.o(132908);
  }

  public AppBrandAuthorizeUI$AuthStateChangedByUserEvent()
  {
  }

  AppBrandAuthorizeUI$AuthStateChangedByUserEvent(byte paramByte)
  {
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.AuthStateChangedByUserEvent
 * JD-Core Version:    0.6.2
 */