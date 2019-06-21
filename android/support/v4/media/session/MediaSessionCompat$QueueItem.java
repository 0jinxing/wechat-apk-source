package android.support.v4.media.session;

import android.media.session.MediaSession.QueueItem;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class MediaSessionCompat$QueueItem
  implements Parcelable
{
  public static final Parcelable.Creator<QueueItem> CREATOR = new MediaSessionCompat.QueueItem.1();
  private final MediaDescriptionCompat Ig;
  private final long JD;
  private Object JE;

  MediaSessionCompat$QueueItem(Parcel paramParcel)
  {
    this.Ig = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    this.JD = paramParcel.readLong();
  }

  private MediaSessionCompat$QueueItem(Object paramObject, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
  {
    if (paramMediaDescriptionCompat == null)
      throw new IllegalArgumentException("Description cannot be null.");
    if (paramLong == -1L)
      throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
    this.Ig = paramMediaDescriptionCompat;
    this.JD = paramLong;
    this.JE = paramObject;
  }

  public static List<QueueItem> m(List<?> paramList)
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
      label20: localObject = new ArrayList();
      localIterator = paramList.iterator();
      if (localIterator.hasNext())
      {
        paramList = localIterator.next();
        if ((paramList == null) || (Build.VERSION.SDK_INT < 21));
        for (paramList = null; ; paramList = new QueueItem(paramList, MediaDescriptionCompat.v(((MediaSession.QueueItem)paramList).getDescription()), ((MediaSession.QueueItem)paramList).getQueueId()))
        {
          ((List)localObject).add(paramList);
          break;
        }
      }
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    return "MediaSession.QueueItem {Description=" + this.Ig + ", Id=" + this.JD + " }";
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.Ig.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.JD);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.QueueItem
 * JD-Core Version:    0.6.2
 */