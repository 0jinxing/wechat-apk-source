package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class BottomNavigationPresenter$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new BottomNavigationPresenter.SavedState.1();
  int ls;

  BottomNavigationPresenter$SavedState()
  {
  }

  BottomNavigationPresenter$SavedState(Parcel paramParcel)
  {
    this.ls = paramParcel.readInt();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.ls);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.design.internal.BottomNavigationPresenter.SavedState
 * JD-Core Version:    0.6.2
 */