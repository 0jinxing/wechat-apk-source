package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

final class a$a$a
  implements a
{
  private IBinder mRemote;

  a$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final void A(boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramBoolean);
      while (true)
      {
        localParcel.writeInt(i);
        this.mRemote.transact(10, localParcel, null, 1);
        return;
        i = 0;
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void B(boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramBoolean);
      while (true)
      {
        localParcel.writeInt(i);
        this.mRemote.transact(11, localParcel, null, 1);
        return;
        i = 0;
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void a(MediaMetadataCompat paramMediaMetadataCompat)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramMediaMetadataCompat != null)
      {
        localParcel.writeInt(1);
        paramMediaMetadataCompat.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.mRemote.transact(4, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw paramMediaMetadataCompat;
  }

  public final void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramParcelableVolumeInfo != null)
      {
        localParcel.writeInt(1);
        paramParcelableVolumeInfo.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.mRemote.transact(8, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw paramParcelableVolumeInfo;
  }

  public final void a(PlaybackStateCompat paramPlaybackStateCompat)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramPlaybackStateCompat != null)
      {
        localParcel.writeInt(1);
        paramPlaybackStateCompat.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.mRemote.transact(3, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw paramPlaybackStateCompat;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final void aw(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(9, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void ax(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(12, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void d(String paramString, Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.mRemote.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw paramString;
  }

  public final void dP()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      this.mRemote.transact(13, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void onExtrasChanged(Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.mRemote.transact(7, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw paramBundle;
  }

  public final void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeTypedList(paramList);
      this.mRemote.transact(5, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
    throw paramList;
  }

  public final void onQueueTitleChanged(CharSequence paramCharSequence)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramCharSequence != null)
      {
        localParcel.writeInt(1);
        TextUtils.writeToParcel(paramCharSequence, localParcel, 0);
      }
      while (true)
      {
        this.mRemote.transact(6, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw paramCharSequence;
  }

  public final void onSessionDestroyed()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      this.mRemote.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.a.a.a
 * JD-Core Version:    0.6.2
 */