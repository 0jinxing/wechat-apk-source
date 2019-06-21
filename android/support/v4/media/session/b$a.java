package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;

public abstract class b$a extends Binder
  implements b
{
  public static b d(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
      if ((localIInterface != null) && ((localIInterface instanceof b)))
        paramIBinder = (b)localIInterface;
      else
        paramIBinder = new b.a.a(paramIBinder);
    }
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    int k = 0;
    boolean bool3 = true;
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
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 45:
    case 37:
    case 38:
    case 47:
    case 41:
    case 42:
    case 43:
    case 44:
    case 33:
    case 34:
    case 35:
    case 36:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 24:
    case 25:
    case 51:
    case 46:
    case 39:
    case 40:
    case 48:
      while (true)
      {
        return bool1;
        paramParcel2.writeString("android.support.v4.media.session.IMediaSession");
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        String str = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
        {
          localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          label488: if (paramParcel1.readInt() == 0)
            break label534;
        }
        label534: for (paramParcel1 = (MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          a(str, (Bundle)localObject, paramParcel1);
          paramParcel2.writeNoException();
          bool1 = bool3;
          break;
          localObject = null;
          break label488;
        }
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        if (paramParcel1.readInt() != 0)
        {
          paramParcel1 = (KeyEvent)KeyEvent.CREATOR.createFromParcel(paramParcel1);
          label565: bool1 = a(paramParcel1);
          paramParcel2.writeNoException();
          if (!bool1)
            break label600;
        }
        label600: for (paramInt1 = 1; ; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          break;
          paramParcel1 = null;
          break label565;
        }
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        a(a.a.c(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        b(a.a.c(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        bool1 = dQ();
        paramParcel2.writeNoException();
        paramInt1 = k;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getPackageName();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = getTag();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = dR();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          bool1 = bool3;
        }
        else
        {
          paramParcel2.writeInt(0);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          long l = getFlags();
          paramParcel2.writeNoException();
          paramParcel2.writeLong(l);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          paramParcel1 = dS();
          paramParcel2.writeNoException();
          if (paramParcel1 != null)
          {
            paramParcel2.writeInt(1);
            paramParcel1.writeToParcel(paramParcel2, 1);
            bool1 = bool3;
          }
          else
          {
            paramParcel2.writeInt(0);
            bool1 = bool3;
            continue;
            paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
            a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
            paramParcel2.writeNoException();
            bool1 = bool3;
            continue;
            paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
            b(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
            paramParcel2.writeNoException();
            bool1 = bool3;
            continue;
            paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
            paramParcel1 = dT();
            paramParcel2.writeNoException();
            if (paramParcel1 != null)
            {
              paramParcel2.writeInt(1);
              paramParcel1.writeToParcel(paramParcel2, 1);
              bool1 = bool3;
            }
            else
            {
              paramParcel2.writeInt(0);
              bool1 = bool3;
              continue;
              paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
              paramParcel1 = dU();
              paramParcel2.writeNoException();
              if (paramParcel1 != null)
              {
                paramParcel2.writeInt(1);
                paramParcel1.writeToParcel(paramParcel2, 1);
                bool1 = bool3;
              }
              else
              {
                paramParcel2.writeInt(0);
                bool1 = bool3;
                continue;
                paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                paramParcel1 = getQueue();
                paramParcel2.writeNoException();
                paramParcel2.writeTypedList(paramParcel1);
                bool1 = bool3;
                continue;
                paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                paramParcel1 = getQueueTitle();
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  TextUtils.writeToParcel(paramParcel1, paramParcel2, 1);
                  bool1 = bool3;
                }
                else
                {
                  paramParcel2.writeInt(0);
                  bool1 = bool3;
                  continue;
                  paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                  paramParcel1 = getExtras();
                  paramParcel2.writeNoException();
                  if (paramParcel1 != null)
                  {
                    paramParcel2.writeInt(1);
                    paramParcel1.writeToParcel(paramParcel2, 1);
                    bool1 = bool3;
                  }
                  else
                  {
                    paramParcel2.writeInt(0);
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    paramInt1 = getRatingType();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(paramInt1);
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    bool1 = dV();
                    paramParcel2.writeNoException();
                    paramInt1 = i;
                    if (bool1)
                      paramInt1 = 1;
                    paramParcel2.writeInt(paramInt1);
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    paramInt1 = getRepeatMode();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(paramInt1);
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    bool1 = dW();
                    paramParcel2.writeNoException();
                    paramInt1 = j;
                    if (bool1)
                      paramInt1 = 1;
                    paramParcel2.writeInt(paramInt1);
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    paramInt1 = dX();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(paramInt1);
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (paramParcel1.readInt() != 0);
                    for (paramParcel1 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      a(paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (paramParcel1.readInt() != 0);
                    for (localObject = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1); ; localObject = null)
                    {
                      a((MediaDescriptionCompat)localObject, paramParcel1.readInt());
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (paramParcel1.readInt() != 0);
                    for (paramParcel1 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      b(paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ay(paramParcel1.readInt());
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    localObject = paramParcel1.readString();
                    if (paramParcel1.readInt() != 0);
                    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      prepareFromMediaId((String)localObject, paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    localObject = paramParcel1.readString();
                    if (paramParcel1.readInt() != 0);
                    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      prepareFromSearch((String)localObject, paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (paramParcel1.readInt() != 0)
                    {
                      localObject = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                      label1657: if (paramParcel1.readInt() == 0)
                        break label1701;
                    }
                    label1701: for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      prepareFromUri((Uri)localObject, paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                      localObject = null;
                      break label1657;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    play();
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    localObject = paramParcel1.readString();
                    if (paramParcel1.readInt() != 0);
                    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      playFromMediaId((String)localObject, paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    localObject = paramParcel1.readString();
                    if (paramParcel1.readInt() != 0);
                    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      playFromSearch((String)localObject, paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (paramParcel1.readInt() != 0)
                    {
                      localObject = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                      label1864: if (paramParcel1.readInt() == 0)
                        break label1908;
                    }
                    label1908: for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      playFromUri((Uri)localObject, paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                      localObject = null;
                      break label1864;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    skipToQueueItem(paramParcel1.readLong());
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    dY();
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    dZ();
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    fastForward();
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    rewind();
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    seekTo(paramParcel1.readLong());
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (paramParcel1.readInt() != 0);
                    for (paramParcel1 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      a(paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (paramParcel1.readInt() != 0)
                    {
                      localObject = (RatingCompat)RatingCompat.CREATOR.createFromParcel(paramParcel1);
                      label2163: if (paramParcel1.readInt() == 0)
                        break label2207;
                    }
                    label2207: for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
                    {
                      a((RatingCompat)localObject, paramParcel1);
                      paramParcel2.writeNoException();
                      bool1 = bool3;
                      break;
                      localObject = null;
                      break label2163;
                    }
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (paramParcel1.readInt() != 0)
                      bool1 = true;
                    C(bool1);
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setRepeatMode(paramParcel1.readInt());
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    bool1 = bool2;
                    if (paramParcel1.readInt() != 0)
                      bool1 = true;
                    D(bool1);
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                    continue;
                    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                    az(paramParcel1.readInt());
                    paramParcel2.writeNoException();
                    bool1 = bool3;
                  }
                }
              }
            }
          }
        }
      }
    case 26:
    }
    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
    Object localObject = paramParcel1.readString();
    if (paramParcel1.readInt() != 0);
    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
    {
      sendCustomAction((String)localObject, paramParcel1);
      paramParcel2.writeNoException();
      bool1 = bool3;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.b.a
 * JD-Core Version:    0.6.2
 */