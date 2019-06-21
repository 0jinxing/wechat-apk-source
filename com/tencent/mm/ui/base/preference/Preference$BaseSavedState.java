package com.tencent.mm.ui.base.preference;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.AbsSavedState;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Preference$BaseSavedState extends AbsSavedState
{
  public static final Parcelable.Creator<BaseSavedState> CREATOR;

  static
  {
    AppMethodBeat.i(107254);
    CREATOR = new Preference.BaseSavedState.1();
    AppMethodBeat.o(107254);
  }

  public Preference$BaseSavedState(Parcel paramParcel)
  {
    super(paramParcel);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.Preference.BaseSavedState
 * JD-Core Version:    0.6.2
 */