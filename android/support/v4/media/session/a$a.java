package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;

public abstract class a$a extends Binder
  implements a
{
  public a$a()
  {
    attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
  }

  public static a c(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
        paramIBinder = (a)localIInterface;
      else
        paramIBinder = new a.a.a(paramIBinder);
    }
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    String str = null;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default:
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    }
    while (true)
    {
      return bool1;
      paramParcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      str = paramParcel1.readString();
      paramParcel2 = localObject5;
      if (paramParcel1.readInt() != 0)
        paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      d(str, paramParcel2);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      onSessionDestroyed();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = str;
      if (paramParcel1.readInt() != 0)
        paramParcel2 = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(paramParcel1);
      a(paramParcel2);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = localObject1;
      if (paramParcel1.readInt() != 0)
        paramParcel2 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(paramParcel1);
      a(paramParcel2);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      onQueueChanged(paramParcel1.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = localObject2;
      if (paramParcel1.readInt() != 0)
        paramParcel2 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel1);
      onQueueTitleChanged(paramParcel2);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = localObject3;
      if (paramParcel1.readInt() != 0)
        paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      onExtrasChanged(paramParcel2);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = localObject4;
      if (paramParcel1.readInt() != 0)
        paramParcel2 = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(paramParcel1);
      a(paramParcel2);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      aw(paramParcel1.readInt());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      if (paramParcel1.readInt() != 0);
      for (bool1 = true; ; bool1 = false)
      {
        A(bool1);
        bool1 = bool2;
        break;
      }
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      if (paramParcel1.readInt() != 0)
        bool1 = true;
      B(bool1);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      ax(paramParcel1.readInt());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      dP();
      bool1 = bool2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.a.a
 * JD-Core Version:    0.6.2
 */