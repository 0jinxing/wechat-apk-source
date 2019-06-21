package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LinearLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new LinearLayoutManager.SavedState.1();
  int alX;
  int alY;
  boolean alZ;

  public LinearLayoutManager$SavedState()
  {
  }

  LinearLayoutManager$SavedState(Parcel paramParcel)
  {
    this.alX = paramParcel.readInt();
    this.alY = paramParcel.readInt();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.alZ = bool;
      return;
      bool = false;
    }
  }

  public LinearLayoutManager$SavedState(SavedState paramSavedState)
  {
    this.alX = paramSavedState.alX;
    this.alY = paramSavedState.alY;
    this.alZ = paramSavedState.alZ;
  }

  public int describeContents()
  {
    return 0;
  }

  final boolean iW()
  {
    if (this.alX >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.alX);
    paramParcel.writeInt(this.alY);
    if (this.alZ);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutManager.SavedState
 * JD-Core Version:    0.6.2
 */