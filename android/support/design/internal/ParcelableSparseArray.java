package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

public class ParcelableSparseArray extends SparseArray<Parcelable>
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new ParcelableSparseArray.1();

  public ParcelableSparseArray()
  {
  }

  public ParcelableSparseArray(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    int i = paramParcel.readInt();
    int[] arrayOfInt = new int[i];
    paramParcel.readIntArray(arrayOfInt);
    paramParcel = paramParcel.readParcelableArray(paramClassLoader);
    for (int j = 0; j < i; j++)
      put(arrayOfInt[j], paramParcel[j]);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = size();
    int[] arrayOfInt = new int[i];
    Parcelable[] arrayOfParcelable = new Parcelable[i];
    for (int j = 0; j < i; j++)
    {
      arrayOfInt[j] = keyAt(j);
      arrayOfParcelable[j] = ((Parcelable)valueAt(j));
    }
    paramParcel.writeInt(i);
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.internal.ParcelableSparseArray
 * JD-Core Version:    0.6.2
 */