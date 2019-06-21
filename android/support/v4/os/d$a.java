package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class d$a<T>
  implements Parcelable.ClassLoaderCreator<T>
{
  private final e<T> JY;

  d$a(e<T> parame)
  {
    this.JY = parame;
  }

  public final T createFromParcel(Parcel paramParcel)
  {
    return this.JY.createFromParcel(paramParcel, null);
  }

  public final T createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.JY.createFromParcel(paramParcel, paramClassLoader);
  }

  public final T[] newArray(int paramInt)
  {
    return this.JY.newArray(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.os.d.a
 * JD-Core Version:    0.6.2
 */