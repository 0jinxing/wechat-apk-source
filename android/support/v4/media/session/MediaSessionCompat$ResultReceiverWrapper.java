package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;

final class MediaSessionCompat$ResultReceiverWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new MediaSessionCompat.ResultReceiverWrapper.1();
  private ResultReceiver JF;

  MediaSessionCompat$ResultReceiverWrapper(Parcel paramParcel)
  {
    this.JF = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.JF.writeToParcel(paramParcel, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper
 * JD-Core Version:    0.6.2
 */