package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlaybackStateCompat
  implements Parcelable
{
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new PlaybackStateCompat.1();
  final long JM;
  final float JN;
  final long JO;
  final CharSequence JP;
  final long JQ;
  List<PlaybackStateCompat.CustomAction> JR;
  final long JS;
  private Object JT;
  final int mErrorCode;
  final Bundle mExtras;
  final long mPosition;
  final int mState;

  private PlaybackStateCompat(int paramInt, long paramLong1, long paramLong2, float paramFloat, long paramLong3, CharSequence paramCharSequence, long paramLong4, List<PlaybackStateCompat.CustomAction> paramList, long paramLong5, Bundle paramBundle)
  {
    this.mState = paramInt;
    this.mPosition = paramLong1;
    this.JM = paramLong2;
    this.JN = paramFloat;
    this.JO = paramLong3;
    this.mErrorCode = 0;
    this.JP = paramCharSequence;
    this.JQ = paramLong4;
    this.JR = new ArrayList(paramList);
    this.JS = paramLong5;
    this.mExtras = paramBundle;
  }

  PlaybackStateCompat(Parcel paramParcel)
  {
    this.mState = paramParcel.readInt();
    this.mPosition = paramParcel.readLong();
    this.JN = paramParcel.readFloat();
    this.JQ = paramParcel.readLong();
    this.JM = paramParcel.readLong();
    this.JO = paramParcel.readLong();
    this.JP = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.JR = paramParcel.createTypedArrayList(PlaybackStateCompat.CustomAction.CREATOR);
    this.JS = paramParcel.readLong();
    this.mExtras = paramParcel.readBundle();
    this.mErrorCode = paramParcel.readInt();
  }

  public static PlaybackStateCompat B(Object paramObject)
  {
    Object localObject2;
    Object localObject3;
    if ((paramObject != null) && (Build.VERSION.SDK_INT >= 21))
    {
      Object localObject1 = ((PlaybackState)paramObject).getCustomActions();
      localObject2 = null;
      if (localObject1 != null)
      {
        localObject3 = new ArrayList(((List)localObject1).size());
        localObject1 = ((List)localObject1).iterator();
        while (true)
        {
          localObject2 = localObject3;
          if (!((Iterator)localObject1).hasNext())
            break;
          ((List)localObject3).add(PlaybackStateCompat.CustomAction.C(((Iterator)localObject1).next()));
        }
      }
      if (Build.VERSION.SDK_INT >= 22)
      {
        localObject3 = ((PlaybackState)paramObject).getExtras();
        localObject2 = new PlaybackStateCompat(((PlaybackState)paramObject).getState(), ((PlaybackState)paramObject).getPosition(), ((PlaybackState)paramObject).getBufferedPosition(), ((PlaybackState)paramObject).getPlaybackSpeed(), ((PlaybackState)paramObject).getActions(), ((PlaybackState)paramObject).getErrorMessage(), ((PlaybackState)paramObject).getLastPositionUpdateTime(), (List)localObject2, ((PlaybackState)paramObject).getActiveQueueItemId(), (Bundle)localObject3);
        ((PlaybackStateCompat)localObject2).JT = paramObject;
      }
    }
    for (paramObject = localObject2; ; paramObject = null)
    {
      return paramObject;
      localObject3 = null;
      break;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=").append(this.mState);
    localStringBuilder.append(", position=").append(this.mPosition);
    localStringBuilder.append(", buffered position=").append(this.JM);
    localStringBuilder.append(", speed=").append(this.JN);
    localStringBuilder.append(", updated=").append(this.JQ);
    localStringBuilder.append(", actions=").append(this.JO);
    localStringBuilder.append(", error code=").append(this.mErrorCode);
    localStringBuilder.append(", error message=").append(this.JP);
    localStringBuilder.append(", custom actions=").append(this.JR);
    localStringBuilder.append(", active item id=").append(this.JS);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.mState);
    paramParcel.writeLong(this.mPosition);
    paramParcel.writeFloat(this.JN);
    paramParcel.writeLong(this.JQ);
    paramParcel.writeLong(this.JM);
    paramParcel.writeLong(this.JO);
    TextUtils.writeToParcel(this.JP, paramParcel, paramInt);
    paramParcel.writeTypedList(this.JR);
    paramParcel.writeLong(this.JS);
    paramParcel.writeBundle(this.mExtras);
    paramParcel.writeInt(this.mErrorCode);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat
 * JD-Core Version:    0.6.2
 */