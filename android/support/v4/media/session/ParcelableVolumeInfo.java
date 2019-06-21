package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new ParcelableVolumeInfo.1();
  public int JH;
  public int JI;
  public int JJ;
  public int JK;
  public int JL;

  public ParcelableVolumeInfo(Parcel paramParcel)
  {
    this.JH = paramParcel.readInt();
    this.JJ = paramParcel.readInt();
    this.JK = paramParcel.readInt();
    this.JL = paramParcel.readInt();
    this.JI = paramParcel.readInt();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.JH);
    paramParcel.writeInt(this.JJ);
    paramParcel.writeInt(this.JK);
    paramParcel.writeInt(this.JL);
    paramParcel.writeInt(this.JI);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.ParcelableVolumeInfo
 * JD-Core Version:    0.6.2
 */