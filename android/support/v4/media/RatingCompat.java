package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new RatingCompat.1();
  private final int Jf;
  private final float Jg;

  RatingCompat(int paramInt, float paramFloat)
  {
    this.Jf = paramInt;
    this.Jg = paramFloat;
  }

  public final int describeContents()
  {
    return this.Jf;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Rating:style=").append(this.Jf).append(" rating=");
    if (this.Jg < 0.0F);
    for (String str = "unrated"; ; str = String.valueOf(this.Jg))
      return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.Jf);
    paramParcel.writeFloat(this.Jg);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.media.RatingCompat
 * JD-Core Version:    0.6.2
 */