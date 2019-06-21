package com.tencent.soter.soterserver;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface a extends IInterface
{
  public abstract SoterSessionResult O(int paramInt, String paramString1, String paramString2);

  public abstract int Re(int paramInt);

  public abstract SoterExportResult Rf(int paramInt);

  public abstract boolean Rg(int paramInt);

  public abstract int Rh(int paramInt);

  public abstract int bS(int paramInt, String paramString);

  public abstract int bT(int paramInt, String paramString);

  public abstract SoterExportResult bU(int paramInt, String paramString);

  public abstract boolean bV(int paramInt, String paramString);

  public abstract SoterDeviceResult dRb();

  public abstract int getVersion();

  public abstract SoterSignResult nD(long paramLong);

  public static abstract class a extends Binder
    implements a
  {
    public static a O(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.soter.soterserver.ISoterService");
        if ((localIInterface != null) && ((localIInterface instanceof a)))
          paramIBinder = (a)localIInterface;
        else
          paramIBinder = new a.a.a(paramIBinder);
      }
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      int i = 0;
      int j = 0;
      boolean bool1 = true;
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
      }
      while (true)
      {
        return bool1;
        paramParcel2.writeString("com.tencent.soter.soterserver.ISoterService");
        continue;
        paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
        paramInt1 = Re(paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
        paramParcel1 = Rf(paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
          boolean bool2 = Rg(paramParcel1.readInt());
          paramParcel2.writeNoException();
          paramInt1 = j;
          if (bool2)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          continue;
          paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
          paramInt1 = bS(paramParcel1.readInt(), paramParcel1.readString());
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          continue;
          paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
          paramInt1 = bT(paramParcel1.readInt(), paramParcel1.readString());
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          continue;
          paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
          paramParcel1 = bU(paramParcel1.readInt(), paramParcel1.readString());
          paramParcel2.writeNoException();
          if (paramParcel1 != null)
          {
            paramParcel2.writeInt(1);
            paramParcel1.writeToParcel(paramParcel2, 1);
          }
          else
          {
            paramParcel2.writeInt(0);
            continue;
            paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
            paramInt1 = Rh(paramParcel1.readInt());
            paramParcel2.writeNoException();
            paramParcel2.writeInt(paramInt1);
            continue;
            paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
            bool2 = bV(paramParcel1.readInt(), paramParcel1.readString());
            paramParcel2.writeNoException();
            paramInt1 = i;
            if (bool2)
              paramInt1 = 1;
            paramParcel2.writeInt(paramInt1);
            continue;
            paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
            paramParcel1 = O(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
            paramParcel2.writeNoException();
            if (paramParcel1 != null)
            {
              paramParcel2.writeInt(1);
              paramParcel1.writeToParcel(paramParcel2, 1);
            }
            else
            {
              paramParcel2.writeInt(0);
              continue;
              paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
              paramParcel1 = nD(paramParcel1.readLong());
              paramParcel2.writeNoException();
              if (paramParcel1 != null)
              {
                paramParcel2.writeInt(1);
                paramParcel1.writeToParcel(paramParcel2, 1);
              }
              else
              {
                paramParcel2.writeInt(0);
                continue;
                paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
                paramParcel1 = dRb();
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                  continue;
                  paramParcel1.enforceInterface("com.tencent.soter.soterserver.ISoterService");
                  paramInt1 = getVersion();
                  paramParcel2.writeNoException();
                  paramParcel2.writeInt(paramInt1);
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.soter.soterserver.a
 * JD-Core Version:    0.6.2
 */