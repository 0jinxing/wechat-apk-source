package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new MediaDescriptionCompat.1();
  final String IS;
  private final CharSequence IT;
  private final CharSequence IU;
  private final CharSequence IV;
  private final Bitmap IW;
  private final Uri IX;
  private final Uri IY;
  private Object IZ;
  private final Bundle mExtras;

  MediaDescriptionCompat(Parcel paramParcel)
  {
    this.IS = paramParcel.readString();
    this.IT = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.IU = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.IV = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.IW = ((Bitmap)paramParcel.readParcelable(null));
    this.IX = ((Uri)paramParcel.readParcelable(null));
    this.mExtras = paramParcel.readBundle();
    this.IY = ((Uri)paramParcel.readParcelable(null));
  }

  private MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    this.IS = paramString;
    this.IT = paramCharSequence1;
    this.IU = paramCharSequence2;
    this.IV = paramCharSequence3;
    this.IW = paramBitmap;
    this.IX = paramUri1;
    this.mExtras = paramBundle;
    this.IY = paramUri2;
  }

  public static MediaDescriptionCompat v(Object paramObject)
  {
    a locala;
    Bundle localBundle;
    Object localObject;
    if ((paramObject != null) && (Build.VERSION.SDK_INT >= 21))
    {
      locala = new a();
      locala.IS = ((MediaDescription)paramObject).getMediaId();
      locala.IT = ((MediaDescription)paramObject).getTitle();
      locala.IU = ((MediaDescription)paramObject).getSubtitle();
      locala.IV = ((MediaDescription)paramObject).getDescription();
      locala.IW = ((MediaDescription)paramObject).getIconBitmap();
      locala.IX = ((MediaDescription)paramObject).getIconUri();
      localBundle = ((MediaDescription)paramObject).getExtras();
      if (localBundle == null)
      {
        localObject = null;
        if (localObject == null)
          break label211;
        if ((!localBundle.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) || (localBundle.size() != 2))
          break label199;
        localBundle = null;
        label123: locala.mExtras = localBundle;
        if (localObject == null)
          break label214;
        locala.IY = ((Uri)localObject);
        label137: localObject = new MediaDescriptionCompat(locala.IS, locala.IT, locala.IU, locala.IV, locala.IW, locala.IX, locala.mExtras, locala.IY);
        ((MediaDescriptionCompat)localObject).IZ = paramObject;
      }
    }
    for (paramObject = localObject; ; paramObject = null)
    {
      return paramObject;
      localObject = (Uri)localBundle.getParcelable("android.support.v4.media.description.MEDIA_URI");
      break;
      label199: localBundle.remove("android.support.v4.media.description.MEDIA_URI");
      localBundle.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
      label211: break label123;
      label214: if (Build.VERSION.SDK_INT < 23)
        break label137;
      locala.IY = ((MediaDescription)paramObject).getMediaUri();
      break label137;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    return this.IT + ", " + this.IU + ", " + this.IV;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.IS);
      TextUtils.writeToParcel(this.IT, paramParcel, paramInt);
      TextUtils.writeToParcel(this.IU, paramParcel, paramInt);
      TextUtils.writeToParcel(this.IV, paramParcel, paramInt);
      paramParcel.writeParcelable(this.IW, paramInt);
      paramParcel.writeParcelable(this.IX, paramInt);
      paramParcel.writeBundle(this.mExtras);
      paramParcel.writeParcelable(this.IY, paramInt);
    }
    while (true)
    {
      return;
      if ((this.IZ == null) && (Build.VERSION.SDK_INT >= 21))
        break;
      localObject = this.IZ;
      ((MediaDescription)localObject).writeToParcel(paramParcel, paramInt);
    }
    MediaDescription.Builder localBuilder = new MediaDescription.Builder();
    Object localObject = this.IS;
    ((MediaDescription.Builder)localBuilder).setMediaId((String)localObject);
    localObject = this.IT;
    ((MediaDescription.Builder)localBuilder).setTitle((CharSequence)localObject);
    localObject = this.IU;
    ((MediaDescription.Builder)localBuilder).setSubtitle((CharSequence)localObject);
    localObject = this.IV;
    ((MediaDescription.Builder)localBuilder).setDescription((CharSequence)localObject);
    localObject = this.IW;
    ((MediaDescription.Builder)localBuilder).setIconBitmap((Bitmap)localObject);
    localObject = this.IX;
    ((MediaDescription.Builder)localBuilder).setIconUri((Uri)localObject);
    Bundle localBundle = this.mExtras;
    if ((Build.VERSION.SDK_INT < 23) && (this.IY != null))
    {
      localObject = localBundle;
      if (localBundle == null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
      }
      ((Bundle)localObject).putParcelable("android.support.v4.media.description.MEDIA_URI", this.IY);
    }
    while (true)
    {
      ((MediaDescription.Builder)localBuilder).setExtras((Bundle)localObject);
      if (Build.VERSION.SDK_INT >= 23)
      {
        localObject = this.IY;
        ((MediaDescription.Builder)localBuilder).setMediaUri((Uri)localObject);
      }
      this.IZ = ((MediaDescription.Builder)localBuilder).build();
      localObject = this.IZ;
      break;
      localObject = localBundle;
    }
  }

  public static final class a
  {
    String IS;
    CharSequence IT;
    CharSequence IU;
    CharSequence IV;
    Bitmap IW;
    Uri IX;
    Uri IY;
    Bundle mExtras;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat
 * JD-Core Version:    0.6.2
 */