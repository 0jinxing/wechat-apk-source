package com.tencent.util;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class f
{
  private static boolean AHY = false;
  private static boolean AHZ = false;
  private static boolean AIa = false;
  private static f AIb;
  private int AIc;
  private Map<Long, Map<a, Queue<Integer>>> AId;
  private Map<Long, Map<Integer, a>> AIe;
  private Map<Long, Set<Integer>> AIf;
  private long AIg;
  private final String TAG;

  public f()
  {
    AppMethodBeat.i(86593);
    this.TAG = f.class.getSimpleName();
    this.AIc = 0;
    this.AId = new HashMap();
    this.AIe = new HashMap();
    this.AIf = new HashMap();
    AppMethodBeat.o(86593);
  }

  private int A(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    while (true)
    {
      long l;
      Object localObject3;
      try
      {
        AppMethodBeat.i(86599);
        l = Thread.currentThread().getId();
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("genTexture(), GLThread id = %d, requestNew = ");
        String.format(paramBoolean + ", width = %d, height = %d, called from: %s", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), dSK() });
        if ((AHY) && (!paramBoolean))
        {
          localObject1 = (Map)this.AId.get(Long.valueOf(l));
          if ((localObject1 != null) && (!((Map)localObject1).isEmpty()))
          {
            localObject3 = new com/tencent/util/f$a;
            ((a)localObject3).<init>(this, paramInt1, paramInt2);
            localObject3 = (Queue)((Map)localObject1).get(localObject3);
            if ((localObject3 != null) && (!((Queue)localObject3).isEmpty()))
            {
              String.format("genTexture(), GLThread id = %d, found texture width = %d and height = %d in cache", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
              dSL();
              paramInt1 = ((Integer)((Queue)localObject3).poll()).intValue();
              AppMethodBeat.o(86599);
              return paramInt1;
            }
            localObject1 = ((Map)localObject1).entrySet().iterator();
            if (((Iterator)localObject1).hasNext())
            {
              localObject3 = (Queue)((Map.Entry)((Iterator)localObject1).next()).getValue();
              if (((Queue)localObject3).isEmpty())
                continue;
              String.format("genTexture(), GLThread id = %d, can't find texture width = %d and height = %d in cache, return another size", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
              dSL();
              paramInt1 = ((Integer)((Queue)localObject3).poll()).intValue();
              AppMethodBeat.o(86599);
              continue;
            }
          }
        }
      }
      finally
      {
      }
      String.format("genTexture(), GLThread id = %d, width = %d and height = %d, cache is empty, alloc a new texture", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      int[] arrayOfInt = new int[1];
      GLES20.glGenTextures(1, arrayOfInt, 0);
      if (!this.AIf.containsKey(Long.valueOf(l)))
      {
        localObject3 = this.AIf;
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        ((Map)localObject3).put(Long.valueOf(l), localHashSet);
      }
      ((Set)this.AIf.get(Long.valueOf(l))).add(Integer.valueOf(arrayOfInt[0]));
      this.AIc += 1;
      dSL();
      paramInt1 = arrayOfInt[0];
      AppMethodBeat.o(86599);
    }
  }

  private void H(int[] paramArrayOfInt)
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(86601);
      if (paramArrayOfInt == null)
        AppMethodBeat.o(86601);
      while (true)
      {
        return;
        while ((i < paramArrayOfInt.length) && (i + 0 <= 0))
        {
          Si(paramArrayOfInt[0]);
          i++;
        }
        AppMethodBeat.o(86601);
      }
    }
    finally
    {
    }
    throw paramArrayOfInt;
  }

  private void Si(int paramInt)
  {
    while (true)
    {
      long l;
      try
      {
        AppMethodBeat.i(86603);
        l = Thread.currentThread().getId();
        String.format("deleteTexture(), GLThread id = %d, textureId = %d, requestDelete = false, called from: %s", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt), dSK() });
        if (paramInt == 0)
        {
          String.format("deleteTexture(), GLThread id = %d, textureId == 0, return", new Object[] { Long.valueOf(l) });
          AppMethodBeat.o(86603);
          return;
        }
        if (AHY)
        {
          if (!this.AId.containsKey(Long.valueOf(l)))
          {
            localObject1 = this.AId;
            localObject4 = new java/util/HashMap;
            ((HashMap)localObject4).<init>();
            ((Map)localObject1).put(Long.valueOf(l), localObject4);
          }
          Map localMap = (Map)this.AId.get(Long.valueOf(l));
          Object localObject4 = Sj(paramInt);
          Object localObject1 = localObject4;
          if (localObject4 == null)
          {
            localObject1 = new com/tencent/util/f$a;
            ((a)localObject1).<init>(this, -1, -1);
          }
          if (!localMap.containsKey(localObject1))
          {
            localObject4 = new java/util/LinkedList;
            ((LinkedList)localObject4).<init>();
            localMap.put(localObject1, localObject4);
          }
          ((Queue)localMap.get(localObject1)).offer(Integer.valueOf(paramInt));
          String.format("deleteTexture(), GLThread id = %d, recycle texture width = %d, height = %d into cache, getCallFrom = %s", new Object[] { Long.valueOf(l), Integer.valueOf(((a)localObject1).width), Integer.valueOf(((a)localObject1).height), dSK() });
          dSL();
          AppMethodBeat.o(86603);
          continue;
        }
      }
      finally
      {
      }
      String.format("deleteTexture(), GLThread id = %d, delete texture id = %d, getCallFrom = %s", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt), dSK() });
      GLES20.glDeleteTextures(1, new int[] { paramInt }, 0);
      Object localObject3 = (Set)this.AIf.get(Long.valueOf(l));
      if (localObject3 != null)
        ((Set)localObject3).remove(Integer.valueOf(paramInt));
      this.AIc -= 1;
      if (AHY)
      {
        localObject3 = (Map)this.AIe.get(Long.valueOf(l));
        if (localObject3 != null)
          ((Map)localObject3).remove(Integer.valueOf(paramInt));
      }
    }
  }

  private a Sj(int paramInt)
  {
    try
    {
      AppMethodBeat.i(86606);
      Object localObject1;
      if (AHY)
      {
        long l = Thread.currentThread().getId();
        localObject1 = (Map)this.AIe.get(Long.valueOf(l));
        if (localObject1 != null)
        {
          localObject1 = (a)((Map)localObject1).get(Integer.valueOf(paramInt));
          AppMethodBeat.o(86606);
        }
      }
      while (true)
      {
        return localObject1;
        localObject1 = null;
        AppMethodBeat.o(86606);
      }
    }
    finally
    {
    }
  }

  public static f dSJ()
  {
    AppMethodBeat.i(86594);
    if (AIb == null);
    try
    {
      if (AIb == null)
      {
        localf = new com/tencent/util/f;
        localf.<init>();
        AIb = localf;
      }
      f localf = AIb;
      AppMethodBeat.o(86594);
      return localf;
    }
    finally
    {
      AppMethodBeat.o(86594);
    }
  }

  private static String dSK()
  {
    AppMethodBeat.i(86607);
    Object localObject;
    if (AIa)
    {
      localObject = Thread.currentThread().getStackTrace();
      if ((localObject == null) || (localObject.length == 0))
      {
        localObject = "unknown";
        AppMethodBeat.o(86607);
      }
    }
    while (true)
    {
      return localObject;
      int j;
      for (int i = 0; ; i++)
      {
        j = i;
        if (i >= localObject.length)
          break;
        if (localObject[i].getMethodName().equals("getCallFrom"))
          while (true)
          {
            j = i;
            if (i >= localObject.length)
              break;
            j = i;
            if (!localObject[i].getClassName().contains("GLMemoryManager"))
              break;
            i++;
          }
      }
      if (j < localObject.length)
      {
        localObject = localObject[j];
        localObject = ((StackTraceElement)localObject).getClassName() + " - " + ((StackTraceElement)localObject).getMethodName() + "()";
        AppMethodBeat.o(86607);
      }
      else
      {
        localObject = "unknown";
        AppMethodBeat.o(86607);
      }
    }
  }

  private void dSL()
  {
    AppMethodBeat.i(86608);
    if (AHZ)
      String.format("texture reference count = %d", new Object[] { Integer.valueOf(this.AIc) });
    AppMethodBeat.o(86608);
  }

  private int rt(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(86595);
      int i = A(-1, -1, paramBoolean);
      AppMethodBeat.o(86595);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void F(int[] paramArrayOfInt)
  {
    try
    {
      AppMethodBeat.i(86596);
      c(paramArrayOfInt, false);
      AppMethodBeat.o(86596);
      return;
    }
    finally
    {
      paramArrayOfInt = finally;
    }
    throw paramArrayOfInt;
  }

  public final void G(int[] paramArrayOfInt)
  {
    try
    {
      AppMethodBeat.i(86600);
      H(paramArrayOfInt);
      AppMethodBeat.o(86600);
      return;
    }
    finally
    {
      paramArrayOfInt = finally;
    }
    throw paramArrayOfInt;
  }

  public final void Sh(int paramInt)
  {
    try
    {
      AppMethodBeat.i(86602);
      Si(paramInt);
      AppMethodBeat.o(86602);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean aI(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(86604);
      boolean bool;
      if (AHY)
      {
        long l = Thread.currentThread().getId();
        if (this.AIe.containsKey(Long.valueOf(l)))
        {
          a locala = (a)((Map)this.AIe.get(Long.valueOf(l))).get(Integer.valueOf(paramInt1));
          if ((locala != null) && (locala.width == paramInt2) && (locala.height == paramInt3))
          {
            bool = true;
            AppMethodBeat.o(86604);
          }
        }
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(86604);
        bool = false;
        continue;
        AppMethodBeat.o(86604);
        bool = false;
      }
    }
    finally
    {
    }
  }

  public final void aJ(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(86605);
      if (AHY)
      {
        long l = Thread.currentThread().getId();
        String.format("updateTextureSize(), GLThread id = %d, textureId = %d, width = %d, height = %d, called from: %s", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), dSK() });
        if (!this.AIe.containsKey(Long.valueOf(l)))
        {
          localMap = this.AIe;
          localObject1 = new java/util/HashMap;
          ((HashMap)localObject1).<init>();
          localMap.put(Long.valueOf(l), localObject1);
        }
        Map localMap = (Map)this.AIe.get(Long.valueOf(l));
        Object localObject1 = new com/tencent/util/f$a;
        ((a)localObject1).<init>(this, paramInt2, paramInt3);
        localMap.put(Integer.valueOf(paramInt1), localObject1);
      }
      AppMethodBeat.o(86605);
      return;
    }
    finally
    {
    }
  }

  public final void c(int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(86597);
      if (paramArrayOfInt == null)
        AppMethodBeat.o(86597);
      while (true)
      {
        return;
        while ((i < paramArrayOfInt.length) && (i + 0 <= 0))
        {
          paramArrayOfInt[0] = rt(paramBoolean);
          i++;
        }
        AppMethodBeat.o(86597);
      }
    }
    finally
    {
    }
    throw paramArrayOfInt;
  }

  public final int jdMethod_if(int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(86598);
      paramInt1 = A(paramInt1, paramInt2, false);
      AppMethodBeat.o(86598);
      return paramInt1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void ig(int paramInt1, int paramInt2)
  {
    try
    {
      this.AIg += paramInt1 * paramInt2 * 4;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void ih(int paramInt1, int paramInt2)
  {
    try
    {
      this.AIg -= paramInt1 * paramInt2 * 4;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final class a
  {
    public int height;
    public int width;

    a(int paramInt1, int arg3)
    {
      this.width = paramInt1;
      int i;
      this.height = i;
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      AppMethodBeat.i(86592);
      if (this == paramObject)
        AppMethodBeat.o(86592);
      while (true)
      {
        return bool;
        if ((paramObject == null) || (getClass() != paramObject.getClass()))
        {
          AppMethodBeat.o(86592);
          bool = false;
        }
        else
        {
          paramObject = (a)paramObject;
          if (this.width != paramObject.width)
          {
            AppMethodBeat.o(86592);
            bool = false;
          }
          else if (this.height == paramObject.height)
          {
            AppMethodBeat.o(86592);
          }
          else
          {
            AppMethodBeat.o(86592);
            bool = false;
          }
        }
      }
    }

    public final int hashCode()
    {
      return this.width * 31 + this.height;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.util.f
 * JD-Core Version:    0.6.2
 */