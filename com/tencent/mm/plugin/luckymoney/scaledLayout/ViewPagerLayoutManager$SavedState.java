package com.tencent.mm.plugin.luckymoney.scaledLayout;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ViewPagerLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR;
  boolean oby;
  float offset;
  int position;

  static
  {
    AppMethodBeat.i(42488);
    CREATOR = new ViewPagerLayoutManager.SavedState.1();
    AppMethodBeat.o(42488);
  }

  ViewPagerLayoutManager$SavedState()
  {
  }

  ViewPagerLayoutManager$SavedState(Parcel paramParcel)
  {
    AppMethodBeat.i(42486);
    this.position = paramParcel.readInt();
    this.offset = paramParcel.readFloat();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.oby = bool;
      AppMethodBeat.o(42486);
      return;
      bool = false;
    }
  }

  public ViewPagerLayoutManager$SavedState(SavedState paramSavedState)
  {
    this.position = paramSavedState.position;
    this.offset = paramSavedState.offset;
    this.oby = paramSavedState.oby;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(42487);
    paramParcel.writeInt(this.position);
    paramParcel.writeFloat(this.offset);
    if (this.oby);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(42487);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState
 * JD-Core Version:    0.6.2
 */