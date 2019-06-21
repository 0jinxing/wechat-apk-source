package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface IGmsServiceBroker extends IInterface
{
  public abstract void getService(IGmsCallbacks paramIGmsCallbacks, GetServiceRequest paramGetServiceRequest);

  public static abstract class Stub extends Binder
    implements IGmsServiceBroker
  {
    public Stub()
    {
      attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
    }

    public static IGmsServiceBroker asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if ((localIInterface != null) && ((localIInterface instanceof IGmsServiceBroker)))
          paramIBinder = (IGmsServiceBroker)localIInterface;
        else
          paramIBinder = new zza(paramIBinder);
      }
    }

    public IBinder asBinder()
    {
      return this;
    }

    protected void getLegacyService(int paramInt1, IGmsCallbacks paramIGmsCallbacks, int paramInt2, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle, IBinder paramIBinder, String paramString3, String paramString4)
    {
      throw new UnsupportedOperationException();
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool;
      if (paramInt1 > 16777215)
      {
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        return bool;
      }
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      IGmsCallbacks localIGmsCallbacks = IGmsCallbacks.Stub.asInterface(paramParcel1.readStrongBinder());
      if (paramInt1 == 46)
        if (paramParcel1.readInt() == 0)
          break label692;
      label687: label692: for (paramParcel1 = (GetServiceRequest)GetServiceRequest.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
      {
        getService(localIGmsCallbacks, paramParcel1);
        paramParcel2.writeNoException();
        bool = true;
        break;
        if (paramInt1 == 47)
          if (paramParcel1.readInt() == 0)
            break label687;
        for (paramParcel1 = (ValidateAccountRequest)ValidateAccountRequest.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          validateAccount(localIGmsCallbacks, paramParcel1);
          break;
          paramInt2 = paramParcel1.readInt();
          if (paramInt1 != 4);
          for (String str1 = paramParcel1.readString(); ; str1 = null)
          {
            label320: String str2;
            String str3;
            IBinder localIBinder;
            String[] arrayOfString;
            String str4;
            switch (paramInt1)
            {
            case 3:
            case 4:
            case 21:
            case 22:
            case 24:
            case 26:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 39:
            case 40:
            case 42:
            default:
              str2 = null;
              str3 = null;
              localIBinder = null;
              paramParcel1 = null;
              arrayOfString = null;
              str4 = null;
            case 19:
            case 1:
            case 9:
            case 20:
            case 30:
            case 10:
            case 34:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 23:
            case 25:
            case 27:
            case 37:
            case 38:
            case 41:
            case 43:
            }
            while (true)
            {
              getLegacyService(paramInt1, localIGmsCallbacks, paramInt2, str1, str4, arrayOfString, paramParcel1, localIBinder, str3, str2);
              break;
              localIBinder = paramParcel1.readStrongBinder();
              if (paramParcel1.readInt() != 0)
              {
                paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                str2 = null;
                str3 = null;
                arrayOfString = null;
                str4 = null;
                continue;
                str3 = paramParcel1.readString();
                arrayOfString = paramParcel1.createStringArray();
                str4 = paramParcel1.readString();
                if (paramParcel1.readInt() != 0)
                {
                  paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                  str2 = null;
                  localIBinder = null;
                  continue;
                  str4 = paramParcel1.readString();
                  arrayOfString = paramParcel1.createStringArray();
                  str3 = paramParcel1.readString();
                  localIBinder = paramParcel1.readStrongBinder();
                  str2 = paramParcel1.readString();
                  if (paramParcel1.readInt() != 0)
                  {
                    paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                    continue;
                    arrayOfString = paramParcel1.createStringArray();
                    str4 = paramParcel1.readString();
                    if (paramParcel1.readInt() != 0)
                    {
                      paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                      str2 = null;
                      str3 = null;
                      localIBinder = null;
                      continue;
                      str4 = paramParcel1.readString();
                      arrayOfString = paramParcel1.createStringArray();
                      str2 = null;
                      str3 = null;
                      localIBinder = null;
                      paramParcel1 = null;
                      continue;
                      str4 = paramParcel1.readString();
                      str2 = null;
                      str3 = null;
                      localIBinder = null;
                      paramParcel1 = null;
                      arrayOfString = null;
                      continue;
                      if (paramParcel1.readInt() == 0)
                        break label320;
                      paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                      str2 = null;
                      str3 = null;
                      localIBinder = null;
                      arrayOfString = null;
                      str4 = null;
                      continue;
                    }
                    str2 = null;
                    str3 = null;
                    localIBinder = null;
                    paramParcel1 = null;
                    continue;
                  }
                  paramParcel1 = null;
                  continue;
                }
                str2 = null;
                localIBinder = null;
                paramParcel1 = null;
                continue;
              }
              str2 = null;
              str3 = null;
              paramParcel1 = null;
              arrayOfString = null;
              str4 = null;
            }
          }
        }
      }
    }

    protected void validateAccount(IGmsCallbacks paramIGmsCallbacks, ValidateAccountRequest paramValidateAccountRequest)
    {
      throw new UnsupportedOperationException();
    }

    static final class zza
      implements IGmsServiceBroker
    {
      private final IBinder zza;

      zza(IBinder paramIBinder)
      {
        this.zza = paramIBinder;
      }

      public final IBinder asBinder()
      {
        return this.zza;
      }

      public final void getService(IGmsCallbacks paramIGmsCallbacks, GetServiceRequest paramGetServiceRequest)
      {
        AppMethodBeat.i(89673);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
          if (paramIGmsCallbacks != null)
          {
            paramIGmsCallbacks = paramIGmsCallbacks.asBinder();
            localParcel1.writeStrongBinder(paramIGmsCallbacks);
            if (paramGetServiceRequest == null)
              break label92;
            localParcel1.writeInt(1);
            paramGetServiceRequest.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.zza.transact(46, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            paramIGmsCallbacks = null;
            break;
            label92: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(89673);
        }
        throw paramIGmsCallbacks;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.IGmsServiceBroker
 * JD-Core Version:    0.6.2
 */