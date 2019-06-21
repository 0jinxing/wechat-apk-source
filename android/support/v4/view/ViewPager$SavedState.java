package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ViewPager$SavedState extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new ViewPager.SavedState.1();
  Parcelable Nt;
  ClassLoader Nu;
  int position;

  ViewPager$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    ClassLoader localClassLoader = paramClassLoader;
    if (paramClassLoader == null)
      localClassLoader = getClass().getClassLoader();
    this.position = paramParcel.readInt();
    this.Nt = paramParcel.readParcelable(localClassLoader);
    this.Nu = localClassLoader;
  }

  public ViewPager$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.position);
    paramParcel.writeParcelable(this.Nt, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager.SavedState
 * JD-Core Version:    0.6.2
 */