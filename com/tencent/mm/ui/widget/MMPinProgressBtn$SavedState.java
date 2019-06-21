package com.tencent.mm.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMPinProgressBtn$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR;
  private int EV;
  private int zMx;

  static
  {
    AppMethodBeat.i(107902);
    CREATOR = new MMPinProgressBtn.SavedState.1();
    AppMethodBeat.o(107902);
  }

  private MMPinProgressBtn$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(107900);
    this.EV = paramParcel.readInt();
    this.zMx = paramParcel.readInt();
    AppMethodBeat.o(107900);
  }

  public MMPinProgressBtn$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(107901);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.EV);
    paramParcel.writeInt(this.zMx);
    AppMethodBeat.o(107901);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMPinProgressBtn.SavedState
 * JD-Core Version:    0.6.2
 */