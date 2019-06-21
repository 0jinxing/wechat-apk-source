package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.a.b;
import com.tencent.mm.network.a.b.a.a;
import com.tencent.mm.protocal.y;
import com.tencent.mm.protocal.y.a.a;
import java.util.ArrayList;
import java.util.List;

public abstract interface f extends IInterface
{
  public abstract int a(r paramr, l paraml);

  public abstract int a(String paramString, boolean paramBoolean, List<String> paramList);

  public abstract int a(boolean paramBoolean, List<String> paramList);

  public abstract void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean);

  public abstract void a(b paramb);

  public abstract void a(g paramg);

  public abstract void a(h paramh);

  public abstract void a(o paramo);

  public abstract void a(s params);

  public abstract void a(y paramy);

  public abstract void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4);

  public abstract boolean acT();

  public abstract void adi();

  public abstract void adj();

  public abstract d amM();

  public abstract void amN();

  public abstract i amO();

  public abstract void cF(boolean paramBoolean);

  public abstract void cG(boolean paramBoolean);

  public abstract void cH(boolean paramBoolean);

  public abstract void cI(boolean paramBoolean);

  public abstract void cancel(int paramInt);

  public abstract void d(String paramString1, String paramString2, String paramString3, String paramString4);

  public abstract int g(int paramInt, byte[] paramArrayOfByte);

  public abstract int getHostByName(String paramString, List<String> paramList);

  public abstract String[] getIPsString(boolean paramBoolean);

  public abstract String getIspId();

  public abstract String getNetworkServerIp();

  public abstract void keepSignalling();

  public abstract void qs(String paramString);

  public abstract void qt(String paramString);

  public abstract void reportFailIp(String paramString);

  public abstract void reset();

  public abstract void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt);

  public abstract void setNewDnsDebugHost(String paramString1, String paramString2);

  public abstract void setSignallingStrategy(long paramLong1, long paramLong2);

  public abstract void stopSignalling();

  public static abstract class a extends Binder
    implements f
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.IDispatcher_AIDL");
    }

    public static f m(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IDispatcher_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof f)))
          paramIBinder = (f)localIInterface;
        else
          paramIBinder = new a(paramIBinder);
      }
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      r localr = null;
      Object localObject1 = null;
      Object localObject2 = null;
      Object localObject3 = null;
      Object localObject4 = null;
      Object localObject5 = null;
      Object localObject6 = null;
      Object localObject7 = null;
      Object localObject8 = null;
      boolean bool1 = false;
      boolean bool2 = false;
      int i = 0;
      boolean bool3 = false;
      boolean bool4 = false;
      boolean bool5 = false;
      boolean bool6 = false;
      boolean bool7 = false;
      boolean bool8 = false;
      boolean bool9 = false;
      boolean bool10 = true;
      switch (paramInt1)
      {
      default:
        bool9 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
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
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
        while (true)
        {
          return bool9;
          paramParcel2.writeString("com.tencent.mm.network.IDispatcher_AIDL");
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          localr = r.a.q(paramParcel1.readStrongBinder());
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 == null)
            paramParcel1 = (Parcel)localObject8;
          while (true)
          {
            paramInt1 = a(localr, paramParcel1);
            paramParcel2.writeNoException();
            paramParcel2.writeInt(paramInt1);
            bool9 = bool10;
            break;
            localObject8 = paramParcel1.queryLocalInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
            if ((localObject8 != null) && ((localObject8 instanceof l)))
              paramParcel1 = (l)localObject8;
            else
              paramParcel1 = new l.a.a(paramParcel1);
          }
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          cancel(paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          localObject8 = amM();
          paramParcel2.writeNoException();
          paramParcel1 = localr;
          if (localObject8 != null)
            paramParcel1 = ((d)localObject8).asBinder();
          paramParcel2.writeStrongBinder(paramParcel1);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          reset();
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 == null)
            paramParcel1 = localObject1;
          while (true)
          {
            a(paramParcel1);
            paramParcel2.writeNoException();
            bool9 = bool10;
            break;
            localObject8 = paramParcel1.queryLocalInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
            if ((localObject8 != null) && ((localObject8 instanceof y)))
              paramParcel1 = (y)localObject8;
            else
              paramParcel1 = new y.a.a(paramParcel1);
          }
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramParcel1.readInt() != 0)
            bool9 = true;
          a(bool9, paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createIntArray(), paramParcel1.createIntArray(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          bool9 = bool1;
          if (paramParcel1.readInt() != 0)
            bool9 = true;
          paramParcel1 = getIPsString(bool9);
          paramParcel2.writeNoException();
          paramParcel2.writeStringArray(paramParcel1);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramParcel1 = getNetworkServerIp();
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          bool9 = bool2;
          if (paramParcel1.readInt() != 0)
            bool9 = true;
          cF(bool9);
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          d(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          setNewDnsDebugHost(paramParcel1.readString(), paramParcel1.readString());
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          amN();
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          bool9 = acT();
          paramParcel2.writeNoException();
          paramInt1 = i;
          if (bool9)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 == null)
            paramParcel1 = localObject2;
          while (true)
          {
            a(paramParcel1);
            paramParcel2.writeNoException();
            bool9 = bool10;
            break;
            localObject8 = paramParcel1.queryLocalInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
            if ((localObject8 != null) && ((localObject8 instanceof b)))
              paramParcel1 = (b)localObject8;
            else
              paramParcel1 = new b.a.a(paramParcel1);
          }
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          qs(paramParcel1.readString());
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          localObject8 = amO();
          paramParcel2.writeNoException();
          paramParcel1 = localObject3;
          if (localObject8 != null)
            paramParcel1 = ((i)localObject8).asBinder();
          paramParcel2.writeStrongBinder(paramParcel1);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramParcel1 = paramParcel1.readString();
          localObject8 = new ArrayList();
          paramInt1 = getHostByName(paramParcel1, (List)localObject8);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          paramParcel2.writeStringList((List)localObject8);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          bool9 = bool3;
          if (paramParcel1.readInt() != 0)
            bool9 = true;
          paramParcel1 = new ArrayList();
          paramInt1 = a(bool9, paramParcel1);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          paramParcel2.writeStringList(paramParcel1);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          localObject8 = paramParcel1.readString();
          bool9 = bool4;
          if (paramParcel1.readInt() != 0)
            bool9 = true;
          paramParcel1 = new ArrayList();
          paramInt1 = a((String)localObject8, bool9, paramParcel1);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          paramParcel2.writeStringList(paramParcel1);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          reportFailIp(paramParcel1.readString());
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          setHostInfo(paramParcel1.createStringArray(), paramParcel1.createStringArray(), paramParcel1.createIntArray());
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramInt1 = paramParcel1.readInt();
          localObject8 = paramParcel1.readString();
          paramInt2 = paramParcel1.readInt();
          bool9 = bool5;
          if (paramParcel1.readInt() != 0)
            bool9 = true;
          a(paramInt1, (String)localObject8, paramInt2, bool9);
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          adi();
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramParcel1 = getIspId();
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramInt1 = g(paramParcel1.readInt(), paramParcel1.createByteArray());
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          setSignallingStrategy(paramParcel1.readLong(), paramParcel1.readLong());
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          keepSignalling();
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          stopSignalling();
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 == null)
            paramParcel1 = localObject4;
          while (true)
          {
            a(paramParcel1);
            paramParcel2.writeNoException();
            bool9 = bool10;
            break;
            localObject8 = paramParcel1.queryLocalInterface("com.tencent.mm.network.IOnReportKV_AIDL");
            if ((localObject8 != null) && ((localObject8 instanceof o)))
              paramParcel1 = (o)localObject8;
            else
              paramParcel1 = new o.a.a(paramParcel1);
          }
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 == null)
            paramParcel1 = localObject5;
          while (true)
          {
            a(paramParcel1);
            paramParcel2.writeNoException();
            bool9 = bool10;
            break;
            localObject8 = paramParcel1.queryLocalInterface("com.tencent.mm.network.IWorkerCallback_AIDL");
            if ((localObject8 != null) && ((localObject8 instanceof s)))
              paramParcel1 = (s)localObject8;
            else
              paramParcel1 = new s.a.a(paramParcel1);
          }
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 == null)
            paramParcel1 = localObject6;
          while (true)
          {
            a(paramParcel1);
            paramParcel2.writeNoException();
            bool9 = bool10;
            break;
            localObject8 = paramParcel1.queryLocalInterface("com.tencent.mm.network.IIpxxCallback_AIDL");
            if ((localObject8 != null) && ((localObject8 instanceof g)))
              paramParcel1 = (g)localObject8;
            else
              paramParcel1 = new g.a.a(paramParcel1);
          }
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          qt(paramParcel1.readString());
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          bool9 = bool6;
          if (paramParcel1.readInt() != 0)
            bool9 = true;
          cG(bool9);
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          bool9 = bool7;
          if (paramParcel1.readInt() != 0)
            bool9 = true;
          cH(bool9);
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          bool9 = bool8;
          if (paramParcel1.readInt() != 0)
            bool9 = true;
          cI(bool9);
          paramParcel2.writeNoException();
          bool9 = bool10;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
          adj();
          paramParcel2.writeNoException();
          bool9 = bool10;
        }
      case 37:
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
        paramParcel1 = localObject7;
      while (true)
      {
        a(paramParcel1);
        paramParcel2.writeNoException();
        bool9 = bool10;
        break;
        localObject8 = paramParcel1.queryLocalInterface("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
        if ((localObject8 != null) && ((localObject8 instanceof h)))
          paramParcel1 = (h)localObject8;
        else
          paramParcel1 = new h.a.a(paramParcel1);
      }
    }

    static final class a
      implements f
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final int a(r paramr, l paraml)
      {
        Object localObject = null;
        AppMethodBeat.i(58480);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramr != null);
          for (paramr = paramr.asBinder(); ; paramr = null)
          {
            localParcel1.writeStrongBinder(paramr);
            paramr = localObject;
            if (paraml != null)
              paramr = paraml.asBinder();
            localParcel1.writeStrongBinder(paramr);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            return i;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58480);
        }
        throw paramr;
      }

      public final int a(String paramString, boolean paramBoolean, List<String> paramList)
      {
        int i = 0;
        AppMethodBeat.i(58498);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.mRemote.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          localParcel2.readStringList(paramList);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58498);
        }
        throw paramString;
      }

      public final int a(boolean paramBoolean, List<String> paramList)
      {
        int i = 0;
        AppMethodBeat.i(58497);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.mRemote.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          localParcel2.readStringList(paramList);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58497);
        }
        throw paramList;
      }

      public final void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
      {
        int i = 0;
        AppMethodBeat.i(58501);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt2);
          paramInt1 = i;
          if (paramBoolean)
            paramInt1 = 1;
          localParcel1.writeInt(paramInt1);
          this.mRemote.transact(22, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58501);
        }
        throw paramString;
      }

      public final void a(b paramb)
      {
        AppMethodBeat.i(58493);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramb != null);
          for (paramb = paramb.asBinder(); ; paramb = null)
          {
            localParcel1.writeStrongBinder(paramb);
            this.mRemote.transact(14, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58493);
        }
        throw paramb;
      }

      public final void a(g paramg)
      {
        AppMethodBeat.i(58510);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramg != null);
          for (paramg = paramg.asBinder(); ; paramg = null)
          {
            localParcel1.writeStrongBinder(paramg);
            this.mRemote.transact(31, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58510);
        }
        throw paramg;
      }

      public final void a(h paramh)
      {
        AppMethodBeat.i(58516);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramh != null);
          for (paramh = paramh.asBinder(); ; paramh = null)
          {
            localParcel1.writeStrongBinder(paramh);
            this.mRemote.transact(37, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58516);
        }
        throw paramh;
      }

      public final void a(o paramo)
      {
        AppMethodBeat.i(58508);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramo != null);
          for (paramo = paramo.asBinder(); ; paramo = null)
          {
            localParcel1.writeStrongBinder(paramo);
            this.mRemote.transact(29, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58508);
        }
        throw paramo;
      }

      public final void a(s params)
      {
        AppMethodBeat.i(58509);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (params != null);
          for (params = params.asBinder(); ; params = null)
          {
            localParcel1.writeStrongBinder(params);
            this.mRemote.transact(30, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58509);
        }
        throw params;
      }

      public final void a(y paramy)
      {
        AppMethodBeat.i(58484);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramy != null);
          for (paramy = paramy.asBinder(); ; paramy = null)
          {
            localParcel1.writeStrongBinder(paramy);
            this.mRemote.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58484);
        }
        throw paramy;
      }

      public final void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4)
      {
        int i = 0;
        AppMethodBeat.i(58485);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeIntArray(paramArrayOfInt1);
          localParcel1.writeIntArray(paramArrayOfInt2);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeString(paramString3);
          localParcel1.writeString(paramString4);
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58485);
        }
        throw paramString1;
      }

      public final boolean acT()
      {
        boolean bool = false;
        AppMethodBeat.i(58492);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0)
            bool = true;
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58492);
        }
      }

      public final void adi()
      {
        AppMethodBeat.i(58502);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(23, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58502);
        }
      }

      public final void adj()
      {
        AppMethodBeat.i(58515);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(36, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58515);
        }
      }

      public final d amM()
      {
        AppMethodBeat.i(58482);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d locald = d.a.l(localParcel2.readStrongBinder());
          return locald;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58482);
        }
      }

      public final void amN()
      {
        AppMethodBeat.i(58491);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58491);
        }
      }

      public final i amO()
      {
        AppMethodBeat.i(58495);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i locali = i.a.n(localParcel2.readStrongBinder());
          return locali;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58495);
        }
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final void cF(boolean paramBoolean)
      {
        int i = 0;
        AppMethodBeat.i(58488);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58488);
        }
      }

      public final void cG(boolean paramBoolean)
      {
        int i = 0;
        AppMethodBeat.i(58512);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.mRemote.transact(33, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58512);
        }
      }

      public final void cH(boolean paramBoolean)
      {
        int i = 0;
        AppMethodBeat.i(58513);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.mRemote.transact(34, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58513);
        }
      }

      public final void cI(boolean paramBoolean)
      {
        int i = 0;
        AppMethodBeat.i(58514);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.mRemote.transact(35, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58514);
        }
      }

      public final void cancel(int paramInt)
      {
        AppMethodBeat.i(58481);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58481);
        }
      }

      public final void d(String paramString1, String paramString2, String paramString3, String paramString4)
      {
        AppMethodBeat.i(58489);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeString(paramString3);
          localParcel1.writeString(paramString4);
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58489);
        }
        throw paramString1;
      }

      public final int g(int paramInt, byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(58504);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeInt(paramInt);
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(25, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt = localParcel2.readInt();
          return paramInt;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58504);
        }
        throw paramArrayOfByte;
      }

      public final int getHostByName(String paramString, List<String> paramList)
      {
        AppMethodBeat.i(58496);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.readStringList(paramList);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58496);
        }
        throw paramString;
      }

      public final String[] getIPsString(boolean paramBoolean)
      {
        int i = 0;
        AppMethodBeat.i(58486);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String[] arrayOfString = localParcel2.createStringArray();
          return arrayOfString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58486);
        }
      }

      public final String getIspId()
      {
        AppMethodBeat.i(58503);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(24, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58503);
        }
      }

      public final String getNetworkServerIp()
      {
        AppMethodBeat.i(58487);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58487);
        }
      }

      public final void keepSignalling()
      {
        AppMethodBeat.i(58506);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(27, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58506);
        }
      }

      public final void qs(String paramString)
      {
        AppMethodBeat.i(58494);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58494);
        }
        throw paramString;
      }

      public final void qt(String paramString)
      {
        AppMethodBeat.i(58511);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(32, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58511);
        }
        throw paramString;
      }

      public final void reportFailIp(String paramString)
      {
        AppMethodBeat.i(58499);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58499);
        }
        throw paramString;
      }

      public final void reset()
      {
        AppMethodBeat.i(58483);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58483);
        }
      }

      public final void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
      {
        AppMethodBeat.i(58500);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeStringArray(paramArrayOfString1);
          localParcel1.writeStringArray(paramArrayOfString2);
          localParcel1.writeIntArray(paramArrayOfInt);
          this.mRemote.transact(21, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58500);
        }
        throw paramArrayOfString1;
      }

      public final void setNewDnsDebugHost(String paramString1, String paramString2)
      {
        AppMethodBeat.i(58490);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58490);
        }
        throw paramString1;
      }

      public final void setSignallingStrategy(long paramLong1, long paramLong2)
      {
        AppMethodBeat.i(58505);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeLong(paramLong1);
          localParcel1.writeLong(paramLong2);
          this.mRemote.transact(26, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58505);
        }
      }

      public final void stopSignalling()
      {
        AppMethodBeat.i(58507);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(28, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58507);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.f
 * JD-Core Version:    0.6.2
 */