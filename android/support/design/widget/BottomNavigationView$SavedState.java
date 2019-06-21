package android.support.design.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;

class BottomNavigationView$SavedState extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new BottomNavigationView.SavedState.1();
  Bundle nc;

  public BottomNavigationView$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    this.nc = paramParcel.readBundle(paramClassLoader);
  }

  public BottomNavigationView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeBundle(this.nc);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.BottomNavigationView.SavedState
 * JD-Core Version:    0.6.2
 */