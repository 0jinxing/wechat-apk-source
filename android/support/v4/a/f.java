package android.support.v4.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.content.a.a.b;
import android.support.v4.content.a.a.c;
import android.support.v4.d.b.b;
import android.support.v4.f.m;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

final class f extends h
{
  private static final Class Hg;
  private static final Constructor Hh;
  private static final Method Hi;
  private static final Method Hj;

  static
  {
    try
    {
      localClass = Class.forName("android.graphics.FontFamily");
      localConstructor = localClass.getConstructor(new Class[0]);
      Method localMethod1 = localClass.getMethod("addFontWeightStyle", new Class[] { ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE });
      localMethod2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(localClass, 1).getClass() });
      Hh = localConstructor;
      Hg = localClass;
      Hi = localMethod1;
      Hj = localMethod2;
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        localClassNotFoundException.getClass().getName();
        Method localMethod2 = null;
        Object localObject = null;
        Constructor localConstructor = null;
        Class localClass = null;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      label95: break label95;
    }
  }

  private static boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      paramBoolean = ((Boolean)Hi.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) })).booleanValue();
      return paramBoolean;
    }
    catch (IllegalAccessException paramObject)
    {
      throw new RuntimeException(paramObject);
    }
    catch (InvocationTargetException paramObject)
    {
      label53: break label53;
    }
  }

  public static boolean dw()
  {
    if (Hi != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static Object dx()
  {
    try
    {
      Object localObject = Hh.newInstance(new Object[0]);
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new RuntimeException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label14;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label14: break label14;
    }
  }

  private static Typeface q(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(Hg, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)Hj.invoke(null, new Object[] { localObject });
      return paramObject;
    }
    catch (IllegalAccessException paramObject)
    {
      throw new RuntimeException(paramObject);
    }
    catch (InvocationTargetException paramObject)
    {
      label36: break label36;
    }
  }

  public final Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = dx();
    a.c[] arrayOfc = paramb.GN;
    int i = arrayOfc.length;
    paramInt = 0;
    a.c localc;
    ByteBuffer localByteBuffer;
    if (paramInt < i)
    {
      localc = arrayOfc[paramInt];
      localByteBuffer = i.a(paramContext, paramResources, localc.GQ);
      if (localByteBuffer == null)
        paramb = localObject1;
    }
    while (true)
    {
      return paramb;
      paramb = localObject1;
      if (a(localObject2, localByteBuffer, 0, localc.GO, localc.GP))
      {
        paramInt++;
        break;
        paramb = q(localObject2);
      }
    }
  }

  public final Typeface a(Context paramContext, b.b[] paramArrayOfb, int paramInt)
  {
    Object localObject = dx();
    m localm = new m();
    int i = paramArrayOfb.length;
    int j = 0;
    if (j < i)
    {
      b.b localb = paramArrayOfb[j];
      Uri localUri = localb.mUri;
      ByteBuffer localByteBuffer1 = (ByteBuffer)localm.get(localUri);
      ByteBuffer localByteBuffer2 = localByteBuffer1;
      if (localByteBuffer1 == null)
      {
        localByteBuffer2 = i.b(paramContext, localUri);
        localm.put(localUri, localByteBuffer2);
      }
      if (a(localObject, localByteBuffer2, localb.Ks, localb.GO, localb.GP));
    }
    for (paramContext = null; ; paramContext = Typeface.create(q(localObject), paramInt))
    {
      return paramContext;
      j++;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.f
 * JD-Core Version:    0.6.2
 */