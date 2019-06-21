package android.support.v4.media.session;

import android.media.session.PlaybackState.CustomAction;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class PlaybackStateCompat$CustomAction
  implements Parcelable
{
  public static final Parcelable.Creator<CustomAction> CREATOR = new PlaybackStateCompat.CustomAction.1();
  private final String JU;
  private final CharSequence JV;
  private final int JW;
  private Object JX;
  private final Bundle mExtras;

  PlaybackStateCompat$CustomAction(Parcel paramParcel)
  {
    this.JU = paramParcel.readString();
    this.JV = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.JW = paramParcel.readInt();
    this.mExtras = paramParcel.readBundle();
  }

  private PlaybackStateCompat$CustomAction(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
  {
    this.JU = paramString;
    this.JV = paramCharSequence;
    this.JW = paramInt;
    this.mExtras = paramBundle;
  }

  public static CustomAction C(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21));
    CustomAction localCustomAction;
    for (paramObject = null; ; paramObject = localCustomAction)
    {
      return paramObject;
      localCustomAction = new CustomAction(((PlaybackState.CustomAction)paramObject).getAction(), ((PlaybackState.CustomAction)paramObject).getName(), ((PlaybackState.CustomAction)paramObject).getIcon(), ((PlaybackState.CustomAction)paramObject).getExtras());
      localCustomAction.JX = paramObject;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    return "Action:mName='" + this.JV + ", mIcon=" + this.JW + ", mExtras=" + this.mExtras;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.JU);
    TextUtils.writeToParcel(this.JV, paramParcel, paramInt);
    paramParcel.writeInt(this.JW);
    paramParcel.writeBundle(this.mExtras);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.CustomAction
 * JD-Core Version:    0.6.2
 */