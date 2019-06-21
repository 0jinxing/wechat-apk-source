package com.bumptech.glide.h;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import com.bumptech.glide.c.c.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class j
{
  private static final char[] aIg;
  private static final char[] aIh;

  static
  {
    AppMethodBeat.i(92615);
    aIg = "0123456789abcdef".toCharArray();
    aIh = new char[64];
    AppMethodBeat.o(92615);
  }

  public static boolean aW(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92605);
    boolean bool;
    if ((dm(paramInt1)) && (dm(paramInt2)))
    {
      bool = true;
      AppMethodBeat.o(92605);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92605);
    }
  }

  public static int b(Object paramObject, int paramInt)
  {
    AppMethodBeat.i(92614);
    if (paramObject == null);
    for (int i = 0; ; i = paramObject.hashCode())
    {
      AppMethodBeat.o(92614);
      return i + paramInt * 31;
    }
  }

  public static int b(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
      return i + paramInt * 31;
  }

  public static <T> List<T> d(Collection<T> paramCollection)
  {
    AppMethodBeat.i(92610);
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = localIterator.next();
      if (paramCollection != null)
        localArrayList.add(paramCollection);
    }
    AppMethodBeat.o(92610);
    return localArrayList;
  }

  private static boolean dm(int paramInt)
  {
    if ((paramInt > 0) || (paramInt == -2147483648));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static <T> Queue<T> dn(int paramInt)
  {
    AppMethodBeat.i(92609);
    ArrayDeque localArrayDeque = new ArrayDeque(paramInt);
    AppMethodBeat.o(92609);
    return localArrayDeque;
  }

  public static boolean h(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(92611);
    boolean bool;
    if (paramObject1 == null)
      if (paramObject2 == null)
      {
        bool = true;
        AppMethodBeat.o(92611);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92611);
      continue;
      bool = paramObject1.equals(paramObject2);
      AppMethodBeat.o(92611);
    }
  }

  public static int hashCode(float paramFloat)
  {
    AppMethodBeat.i(92613);
    int i = Float.floatToIntBits(paramFloat);
    AppMethodBeat.o(92613);
    return i + 527;
  }

  public static int hashCode(int paramInt1, int paramInt2)
  {
    return paramInt2 * 31 + paramInt1;
  }

  public static String i(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(92602);
    synchronized (aIh)
    {
      char[] arrayOfChar2 = aIh;
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        int j = paramArrayOfByte[i] & 0xFF;
        arrayOfChar2[(i * 2)] = ((char)aIg[(j >>> 4)]);
        arrayOfChar2[(i * 2 + 1)] = ((char)aIg[(j & 0xF)]);
      }
      paramArrayOfByte = new java/lang/String;
      paramArrayOfByte.<init>(arrayOfChar2);
      AppMethodBeat.o(92602);
      return paramArrayOfByte;
    }
  }

  public static boolean i(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(92612);
    boolean bool;
    if (paramObject1 == null)
      if (paramObject2 == null)
      {
        bool = true;
        AppMethodBeat.o(92612);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92612);
      continue;
      if ((paramObject1 instanceof l))
      {
        bool = ((l)paramObject1).ni();
        AppMethodBeat.o(92612);
      }
      else
      {
        bool = paramObject1.equals(paramObject2);
        AppMethodBeat.o(92612);
      }
    }
  }

  public static int j(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(92604);
    Bitmap.Config localConfig = paramConfig;
    if (paramConfig == null)
      localConfig = Bitmap.Config.ARGB_8888;
    int i;
    switch (j.1.$SwitchMap$android$graphics$Bitmap$Config[localConfig.ordinal()])
    {
    default:
      i = 4;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(92604);
      return i * (paramInt1 * paramInt2);
      i = 1;
      continue;
      i = 2;
      continue;
      i = 8;
    }
  }

  @TargetApi(19)
  public static int k(Bitmap paramBitmap)
  {
    AppMethodBeat.i(92603);
    if (paramBitmap.isRecycled())
    {
      paramBitmap = new IllegalStateException("Cannot obtain size for recycled Bitmap: " + paramBitmap + "[" + paramBitmap.getWidth() + "x" + paramBitmap.getHeight() + "] " + paramBitmap.getConfig());
      AppMethodBeat.o(92603);
      throw paramBitmap;
    }
    if (Build.VERSION.SDK_INT >= 19);
    while (true)
    {
      try
      {
        i = paramBitmap.getAllocationByteCount();
        AppMethodBeat.o(92603);
        return i;
      }
      catch (NullPointerException localNullPointerException)
      {
      }
      int i = paramBitmap.getHeight() * paramBitmap.getRowBytes();
      AppMethodBeat.o(92603);
    }
  }

  public static void om()
  {
    AppMethodBeat.i(92606);
    if (!on())
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("You must call this method on the main thread");
      AppMethodBeat.o(92606);
      throw localIllegalArgumentException;
    }
    AppMethodBeat.o(92606);
  }

  public static boolean on()
  {
    AppMethodBeat.i(92607);
    boolean bool;
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      bool = true;
      AppMethodBeat.o(92607);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92607);
    }
  }

  public static boolean oo()
  {
    AppMethodBeat.i(92608);
    boolean bool;
    if (!on())
    {
      bool = true;
      AppMethodBeat.o(92608);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92608);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.j
 * JD-Core Version:    0.6.2
 */