package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

class FlexboxLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR;
  private int alX;
  private int alY;

  static
  {
    AppMethodBeat.i(54792);
    CREATOR = new FlexboxLayoutManager.SavedState.1();
    AppMethodBeat.o(54792);
  }

  FlexboxLayoutManager$SavedState()
  {
  }

  private FlexboxLayoutManager$SavedState(Parcel paramParcel)
  {
    AppMethodBeat.i(54790);
    this.alX = paramParcel.readInt();
    this.alY = paramParcel.readInt();
    AppMethodBeat.o(54790);
  }

  private FlexboxLayoutManager$SavedState(SavedState paramSavedState)
  {
    this.alX = paramSavedState.alX;
    this.alY = paramSavedState.alY;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(54791);
    String str = "SavedState{mAnchorPosition=" + this.alX + ", mAnchorOffset=" + this.alY + '}';
    AppMethodBeat.o(54791);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(54789);
    paramParcel.writeInt(this.alX);
    paramParcel.writeInt(this.alY);
    AppMethodBeat.o(54789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.flexbox.FlexboxLayoutManager.SavedState
 * JD-Core Version:    0.6.2
 */