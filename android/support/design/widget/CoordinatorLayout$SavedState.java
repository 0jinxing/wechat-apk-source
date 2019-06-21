package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.util.SparseArray;

public class CoordinatorLayout$SavedState extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new CoordinatorLayout.SavedState.1();
  SparseArray<Parcelable> pX;

  public CoordinatorLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    int[] arrayOfInt = new int[i];
    paramParcel.readIntArray(arrayOfInt);
    paramParcel = paramParcel.readParcelableArray(paramClassLoader);
    this.pX = new SparseArray(i);
    for (int j = 0; j < i; j++)
      this.pX.append(arrayOfInt[j], paramParcel[j]);
  }

  public CoordinatorLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    super.writeToParcel(paramParcel, paramInt);
    if (this.pX != null);
    int[] arrayOfInt;
    Parcelable[] arrayOfParcelable;
    for (int j = this.pX.size(); ; j = 0)
    {
      paramParcel.writeInt(j);
      arrayOfInt = new int[j];
      arrayOfParcelable = new Parcelable[j];
      while (i < j)
      {
        arrayOfInt[i] = this.pX.keyAt(i);
        arrayOfParcelable[i] = ((Parcelable)this.pX.valueAt(i));
        i++;
      }
    }
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.design.widget.CoordinatorLayout.SavedState
 * JD-Core Version:    0.6.2
 */