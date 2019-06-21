package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaBrowserCompat$MediaItem
  implements Parcelable
{
  public static final Parcelable.Creator<MediaItem> CREATOR = new MediaBrowserCompat.MediaItem.1();
  private final int Dj;
  private final MediaDescriptionCompat Ig;

  MediaBrowserCompat$MediaItem(Parcel paramParcel)
  {
    this.Dj = paramParcel.readInt();
    this.Ig = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
  }

  private MediaBrowserCompat$MediaItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    if (paramMediaDescriptionCompat == null)
      throw new IllegalArgumentException("description cannot be null");
    if (TextUtils.isEmpty(paramMediaDescriptionCompat.IS))
      throw new IllegalArgumentException("description must have a non-empty media id");
    this.Dj = paramInt;
    this.Ig = paramMediaDescriptionCompat;
  }

  public static List<MediaItem> j(List<?> paramList)
  {
    Iterator localIterator = null;
    Object localObject = localIterator;
    if (paramList != null)
    {
      if (Build.VERSION.SDK_INT >= 21)
        break label20;
      localObject = localIterator;
    }
    while (true)
    {
      return localObject;
      label20: localObject = new ArrayList(paramList.size());
      localIterator = paramList.iterator();
      if (localIterator.hasNext())
      {
        paramList = localIterator.next();
        if ((paramList == null) || (Build.VERSION.SDK_INT < 21));
        int i;
        for (paramList = null; ; paramList = new MediaItem(MediaDescriptionCompat.v(((MediaBrowser.MediaItem)paramList).getDescription()), i))
        {
          ((List)localObject).add(paramList);
          break;
          i = ((MediaBrowser.MediaItem)paramList).getFlags();
        }
      }
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
    localStringBuilder.append("mFlags=").append(this.Dj);
    localStringBuilder.append(", mDescription=").append(this.Ig);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.Dj);
    this.Ig.writeToParcel(paramParcel, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaItem
 * JD-Core Version:    0.6.2
 */