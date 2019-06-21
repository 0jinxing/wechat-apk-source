package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$Token
  implements Parcelable
{
  public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator()
  {
  };
  final Object JG;
  final b Jt;

  MediaSessionCompat$Token(Object paramObject)
  {
    this(paramObject, null);
  }

  private MediaSessionCompat$Token(Object paramObject, b paramb)
  {
    this.JG = paramObject;
    this.Jt = paramb;
  }

  public static Token a(Object paramObject, b paramb)
  {
    if ((paramObject != null) && (Build.VERSION.SDK_INT >= 21));
    for (paramObject = new Token(d.A(paramObject), paramb); ; paramObject = null)
      return paramObject;
  }

  public static Token z(Object paramObject)
  {
    return a(paramObject, null);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof Token))
      {
        bool = false;
      }
      else
      {
        paramObject = (Token)paramObject;
        if (this.JG == null)
        {
          if (paramObject.JG != null)
            bool = false;
        }
        else if (paramObject.JG == null)
          bool = false;
        else
          bool = this.JG.equals(paramObject.JG);
      }
    }
  }

  public final int hashCode()
  {
    if (this.JG == null);
    for (int i = 0; ; i = this.JG.hashCode())
      return i;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramParcel.writeParcelable((Parcelable)this.JG, paramInt);
    while (true)
    {
      return;
      paramParcel.writeStrongBinder((IBinder)this.JG);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Token
 * JD-Core Version:    0.6.2
 */