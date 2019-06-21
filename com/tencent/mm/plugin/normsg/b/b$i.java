package com.tencent.mm.plugin.normsg.b;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Parcel;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.FileDescriptor;
import java.lang.reflect.Method;

final class b$i
  implements IBinder
{
  private final Class<?> oUT;
  private b.i.a<String> oUU = null;
  private String oUV = null;

  b$i(Class<?> paramClass)
  {
    Object localObject;
    this.oUT = localObject;
  }

  public final SparseArray<String> bWn()
  {
    label390: label396: 
    while (true)
    {
      IInterface localIInterface;
      int j;
      Class localClass1;
      int m;
      Object[] arrayOfObject;
      int i1;
      Class localClass2;
      try
      {
        AppMethodBeat.i(10415);
        if (this.oUU != null)
        {
          localObject1 = this.oUU;
          AppMethodBeat.o(10415);
          return localObject1;
        }
        Object localObject1 = new com/tencent/mm/plugin/normsg/b/b$i$a;
        ((b.i.a)localObject1).<init>(this, (byte)0);
        this.oUU = ((b.i.a)localObject1);
        try
        {
          localIInterface = (IInterface)h.b(this.oUT, "asInterface", h.b(new Class[] { IBinder.class }), new Object[] { this });
          localObject1 = this.oUT.getInterfaces();
          int i = localObject1.length;
          j = 0;
          if (j < i)
          {
            localClass1 = localObject1[j];
            if (!IInterface.class.isAssignableFrom(localClass1))
              break label396;
            Method[] arrayOfMethod = localClass1.getDeclaredMethods();
            int k = arrayOfMethod.length;
            m = 0;
            if (m >= k)
              break label396;
            localClass1 = arrayOfMethod[m];
            if ("asBinder".equals(localClass1.getName()))
              break label390;
            this.oUV = localClass1.getName();
            if (!localClass1.isAccessible())
              localClass1.setAccessible(true);
            Class[] arrayOfClass = localClass1.getParameterTypes();
            int n = arrayOfClass.length;
            arrayOfObject = new Object[n];
            i1 = 0;
            if (i1 >= n)
              break label381;
            localClass2 = arrayOfClass[i1];
            if (!localClass2.isPrimitive())
              break label307;
            if (Boolean.TYPE.isAssignableFrom(localClass2))
            {
              arrayOfObject[i1] = Boolean.FALSE;
              i1++;
              continue;
            }
            arrayOfObject[i1] = Integer.valueOf(0);
            continue;
          }
        }
        catch (Throwable localThrowable)
        {
          ab.printErrStackTrace("MicroMsg.AED", localThrowable, "unexpected exception.", new Object[0]);
          b.a(this.oUG, localThrowable);
          this.oUU.clear();
          b.i.a locala = this.oUU;
          AppMethodBeat.o(10415);
        }
        continue;
      }
      finally
      {
      }
      label307: if (Number.class.isAssignableFrom(localClass2))
      {
        arrayOfObject[i1] = Integer.valueOf(0);
      }
      else if (Character.class.isAssignableFrom(localClass2))
      {
        arrayOfObject[i1] = Character.valueOf('\000');
      }
      else if (Boolean.class.isAssignableFrom(localClass2))
      {
        arrayOfObject[i1] = Boolean.FALSE;
      }
      else
      {
        arrayOfObject[i1] = null;
        continue;
        label381: localClass1.invoke(localIInterface, arrayOfObject);
        m++;
        continue;
        j++;
      }
    }
  }

  public final void dump(FileDescriptor paramFileDescriptor, String[] paramArrayOfString)
  {
  }

  public final void dumpAsync(FileDescriptor paramFileDescriptor, String[] paramArrayOfString)
  {
  }

  public final String getInterfaceDescriptor()
  {
    return null;
  }

  public final boolean isBinderAlive()
  {
    return false;
  }

  public final void linkToDeath(IBinder.DeathRecipient paramDeathRecipient, int paramInt)
  {
  }

  public final boolean pingBinder()
  {
    return false;
  }

  public final IInterface queryLocalInterface(String paramString)
  {
    return null;
  }

  public final boolean transact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    AppMethodBeat.i(10416);
    try
    {
      if (this.oUU != null)
        this.oUU.put(paramInt1, this.oUV);
      return false;
    }
    finally
    {
      AppMethodBeat.o(10416);
    }
    throw paramParcel1;
  }

  public final boolean unlinkToDeath(IBinder.DeathRecipient paramDeathRecipient, int paramInt)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.i
 * JD-Core Version:    0.6.2
 */