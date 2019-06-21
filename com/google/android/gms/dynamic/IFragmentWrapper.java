package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;

public abstract interface IFragmentWrapper extends IInterface
{
  public abstract IObjectWrapper getActivity();

  public abstract Bundle getArguments();

  public abstract int getId();

  public abstract IFragmentWrapper getParentFragment();

  public abstract IObjectWrapper getResources();

  public abstract boolean getRetainInstance();

  public abstract String getTag();

  public abstract IFragmentWrapper getTargetFragment();

  public abstract int getTargetRequestCode();

  public abstract boolean getUserVisibleHint();

  public abstract IObjectWrapper getView();

  public abstract boolean isAdded();

  public abstract boolean isDetached();

  public abstract boolean isHidden();

  public abstract boolean isInLayout();

  public abstract boolean isRemoving();

  public abstract boolean isResumed();

  public abstract boolean isVisible();

  public abstract void registerForContextMenu(IObjectWrapper paramIObjectWrapper);

  public abstract void setHasOptionsMenu(boolean paramBoolean);

  public abstract void setMenuVisibility(boolean paramBoolean);

  public abstract void setRetainInstance(boolean paramBoolean);

  public abstract void setUserVisibleHint(boolean paramBoolean);

  public abstract void startActivity(Intent paramIntent);

  public abstract void startActivityForResult(Intent paramIntent, int paramInt);

  public abstract void unregisterForContextMenu(IObjectWrapper paramIObjectWrapper);

  public static abstract class Stub extends zzb
    implements IFragmentWrapper
  {
    public Stub()
    {
      super();
    }

    public static IFragmentWrapper asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        if ((localIInterface instanceof IFragmentWrapper))
          paramIBinder = (IFragmentWrapper)localIInterface;
        else
          paramIBinder = new IFragmentWrapper.Stub.Proxy(paramIBinder);
      }
    }

    public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool;
      switch (paramInt1)
      {
      default:
        bool = false;
        return bool;
      case 2:
        paramParcel1 = getActivity();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
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
      case 26:
      case 27:
      }
      while (true)
      {
        bool = true;
        break;
        paramParcel1 = getArguments();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, paramParcel1);
        continue;
        paramInt1 = getId();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1 = getParentFragment();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
        continue;
        paramParcel1 = getResources();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
        continue;
        bool = getRetainInstance();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        paramParcel1 = getTag();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        continue;
        paramParcel1 = getTargetFragment();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
        continue;
        paramInt1 = getTargetRequestCode();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        bool = getUserVisibleHint();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        paramParcel1 = getView();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
        continue;
        bool = isAdded();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        bool = isDetached();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        bool = isHidden();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        bool = isInLayout();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        bool = isRemoving();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        bool = isResumed();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        bool = isVisible();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        registerForContextMenu(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        continue;
        setHasOptionsMenu(zzc.zza(paramParcel1));
        paramParcel2.writeNoException();
        continue;
        setMenuVisibility(zzc.zza(paramParcel1));
        paramParcel2.writeNoException();
        continue;
        setRetainInstance(zzc.zza(paramParcel1));
        paramParcel2.writeNoException();
        continue;
        setUserVisibleHint(zzc.zza(paramParcel1));
        paramParcel2.writeNoException();
        continue;
        startActivity((Intent)zzc.zza(paramParcel1, Intent.CREATOR));
        paramParcel2.writeNoException();
        continue;
        startActivityForResult((Intent)zzc.zza(paramParcel1, Intent.CREATOR), paramParcel1.readInt());
        paramParcel2.writeNoException();
        continue;
        unregisterForContextMenu(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.IFragmentWrapper
 * JD-Core Version:    0.6.2
 */