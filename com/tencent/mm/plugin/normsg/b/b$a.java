package com.tencent.mm.plugin.normsg.b;

import android.graphics.Region;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.Map;

final class b$a extends b.d
{
  private b.i oUI;
  private WeakReference<Object> oUJ;

  b$a(b paramb, Object paramObject, IBinder paramIBinder)
  {
    super(paramb, paramIBinder);
    AppMethodBeat.i(10392);
    this.oUI = null;
    this.oUJ = null;
    try
    {
      paramIBinder = new java/lang/ref/WeakReference;
      paramIBinder.<init>(paramObject);
      this.oUJ = paramIBinder;
      paramObject = new com/tencent/mm/plugin/normsg/b/b$i;
      paramIBinder = new java/lang/StringBuilder;
      paramIBinder.<init>();
      paramObject.<init>(paramb, h.findClass(b.access$200() + "$Stub"));
      this.oUI = paramObject;
      AppMethodBeat.o(10392);
      return;
    }
    catch (Throwable paramObject)
    {
      while (true)
      {
        b.a(paramb, paramObject);
        AppMethodBeat.o(10392);
      }
    }
  }

  protected final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    AppMethodBeat.i(10393);
    boolean bool;
    if ((paramInt1 <= 0) || (paramInt1 > 16777215))
    {
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      AppMethodBeat.o(10393);
    }
    int i;
    label286: IBinder localIBinder;
    while (true)
    {
      return bool;
      if (this.oUI == null)
      {
        ab.e("MicroMsg.AED", "init failed, give up intercepting.");
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        AppMethodBeat.o(10393);
      }
      else if (this.oUJ.get() == null)
      {
        ab.e("MicroMsg.AED", "lost viewRootImpl instance, give up intercepting.");
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        AppMethodBeat.o(10393);
      }
      else
      {
        Object localObject = (String)this.oUI.bWn().get(paramInt1);
        try
        {
          paramParcel1.enforceInterface(b.access$200());
          if (b.bWe().equals(localObject))
          {
            i = Build.VERSION.SDK_INT;
            if (i < 16)
              paramParcel1.readInt();
            while (true)
            {
              if ((i < 16) || (i >= 17))
                break label286;
              paramParcel1.readInt();
              paramParcel1.readInt();
              paramParcel1.readInt();
              localObject = paramParcel1.readStrongBinder();
              if (i >= 16)
                paramParcel1.readInt();
              i = paramParcel1.readInt();
              b.c(this.oUG).put(localObject, Integer.valueOf(i));
              bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
              AppMethodBeat.o(10393);
              break;
              paramParcel1.readLong();
            }
          }
        }
        catch (Throwable localThrowable)
        {
          do
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.AED", localThrowable, "unexpected exception.", new Object[0]);
              b.a(this.oUG, localThrowable);
              continue;
              if ((i >= 21) && (paramParcel1.readInt() != 0))
              {
                Region.CREATOR.createFromParcel(paramParcel1);
                continue;
                if (b.abS().equals(localThrowable))
                {
                  i = Build.VERSION.SDK_INT;
                  if (i < 16)
                    paramParcel1.readInt();
                  while (true)
                  {
                    if (i >= 16)
                    {
                      paramParcel1.readInt();
                      if (i < 17)
                      {
                        paramParcel1.readInt();
                        paramParcel1.readInt();
                      }
                    }
                    paramParcel1.readInt();
                    localIBinder = paramParcel1.readStrongBinder();
                    if (i >= 16)
                      paramParcel1.readInt();
                    i = paramParcel1.readInt();
                    b.c(this.oUG).put(localIBinder, Integer.valueOf(i));
                    break;
                    paramParcel1.readLong();
                  }
                }
                if (!b.abp().equals(localIBinder))
                  break;
                i = Build.VERSION.SDK_INT;
                paramParcel1.readLong();
                paramParcel1.readString();
                if ((i >= 21) && (paramParcel1.readInt() != 0))
                  Region.CREATOR.createFromParcel(paramParcel1);
                paramParcel1.readInt();
                localIBinder = paramParcel1.readStrongBinder();
                paramParcel1.readInt();
                i = paramParcel1.readInt();
                b.c(this.oUG).put(localIBinder, Integer.valueOf(i));
              }
            }
            if (b.bWf().equals(localIBinder))
            {
              i = Build.VERSION.SDK_INT;
              paramParcel1.readLong();
              paramParcel1.readString();
              if ((i >= 16) && (i < 17))
              {
                paramParcel1.readInt();
                paramParcel1.readInt();
              }
              while (true)
              {
                paramParcel1.readInt();
                localIBinder = paramParcel1.readStrongBinder();
                paramParcel1.readInt();
                i = paramParcel1.readInt();
                b.c(this.oUG).put(localIBinder, Integer.valueOf(i));
                break;
                if ((i >= 21) && (paramParcel1.readInt() != 0))
                  Region.CREATOR.createFromParcel(paramParcel1);
              }
            }
            if (b.bWg().equals(localIBinder))
            {
              i = Build.VERSION.SDK_INT;
              paramParcel1.readLong();
              paramParcel1.readInt();
              if ((i >= 16) && (i < 17))
              {
                paramParcel1.readInt();
                paramParcel1.readInt();
              }
              while (true)
              {
                paramParcel1.readInt();
                localIBinder = paramParcel1.readStrongBinder();
                paramParcel1.readInt();
                i = paramParcel1.readInt();
                b.c(this.oUG).put(localIBinder, Integer.valueOf(i));
                break;
                if ((i >= 21) && (paramParcel1.readInt() != 0))
                  Region.CREATOR.createFromParcel(paramParcel1);
              }
            }
            if (b.bWh().equals(localIBinder))
            {
              i = Build.VERSION.SDK_INT;
              paramParcel1.readLong();
              paramParcel1.readInt();
              if ((i >= 16) && (i < 17))
              {
                paramParcel1.readInt();
                paramParcel1.readInt();
              }
              while (true)
              {
                paramParcel1.readInt();
                localIBinder = paramParcel1.readStrongBinder();
                paramParcel1.readInt();
                i = paramParcel1.readInt();
                b.c(this.oUG).put(localIBinder, Integer.valueOf(i));
                break;
                if ((i >= 21) && (paramParcel1.readInt() != 0))
                  Region.CREATOR.createFromParcel(paramParcel1);
              }
            }
          }
          while (!b.bWi().equals(localIBinder));
          i = Build.VERSION.SDK_INT;
          if (i >= 16)
            break label1000;
        }
      }
    }
    paramParcel1.readInt();
    while (true)
    {
      paramParcel1.readInt();
      if ((i >= 16) && (paramParcel1.readInt() != 0))
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel1.readInt();
      localIBinder = paramParcel1.readStrongBinder();
      if (i >= 16)
        paramParcel1.readInt();
      i = paramParcel1.readInt();
      b.c(this.oUG).put(localIBinder, Integer.valueOf(i));
      break;
      label1000: paramParcel1.readLong();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.a
 * JD-Core Version:    0.6.2
 */