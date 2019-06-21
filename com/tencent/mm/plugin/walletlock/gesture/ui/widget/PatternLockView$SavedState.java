package com.tencent.mm.plugin.walletlock.gesture.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import com.tencent.matrix.trace.core.AppMethodBeat;

class PatternLockView$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR;
  String tWM;
  int tWN;
  boolean tWs;
  boolean tWt;
  boolean tWu;

  static
  {
    AppMethodBeat.i(51656);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(51656);
  }

  public PatternLockView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(51654);
    this.tWM = paramParcel.readString();
    this.tWN = paramParcel.readInt();
    this.tWt = ((Boolean)paramParcel.readValue(null)).booleanValue();
    this.tWu = ((Boolean)paramParcel.readValue(null)).booleanValue();
    this.tWs = ((Boolean)paramParcel.readValue(null)).booleanValue();
    AppMethodBeat.o(51654);
  }

  public PatternLockView$SavedState(Parcelable paramParcelable, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramParcelable);
    this.tWM = paramString;
    this.tWN = paramInt;
    this.tWt = paramBoolean1;
    this.tWu = paramBoolean2;
    this.tWs = paramBoolean3;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(51655);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.tWM);
    paramParcel.writeInt(this.tWN);
    paramParcel.writeValue(Boolean.valueOf(this.tWt));
    paramParcel.writeValue(Boolean.valueOf(this.tWu));
    paramParcel.writeValue(Boolean.valueOf(this.tWs));
    AppMethodBeat.o(51655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.SavedState
 * JD-Core Version:    0.6.2
 */