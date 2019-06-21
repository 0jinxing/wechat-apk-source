package com.tencent.matrix.trace.g;

import com.tencent.matrix.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.List<Lcom.tencent.matrix.trace.d.a;>;
import java.util.ListIterator;

public final class a
{
  private static int a(LinkedList<com.tencent.matrix.trace.d.a> paramLinkedList, com.tencent.matrix.trace.d.a parama)
  {
    if (!paramLinkedList.isEmpty());
    for (com.tencent.matrix.trace.d.a locala = (com.tencent.matrix.trace.d.a)paramLinkedList.peek(); ; locala = null)
    {
      if ((locala != null) && (locala.bZt == parama.bZt) && (locala.bna == parama.bna) && (parama.bna != 0))
        if (parama.bZu == 5000)
        {
          i = locala.bZu;
          parama.bZu = i;
          locala.aD(parama.bZu);
        }
      for (int i = locala.bZu; ; i = parama.bZu)
      {
        return i;
        i = parama.bZu;
        break;
        paramLinkedList.push(parama);
      }
    }
  }

  public static long a(LinkedList<com.tencent.matrix.trace.d.a> paramLinkedList, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2)
  {
    paramStringBuilder2.append("|*   TraceStack:\n");
    paramStringBuilder2.append("|*        [id count cost]\n");
    Iterator localIterator = paramLinkedList.iterator();
    long l = 0L;
    if (localIterator.hasNext())
    {
      paramLinkedList = (com.tencent.matrix.trace.d.a)localIterator.next();
      paramStringBuilder1.append(paramLinkedList.toString()).append('\n');
      StringBuilder localStringBuilder = paramStringBuilder2.append("|*        ");
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < paramLinkedList.bna; i++)
        localStringBuffer.append('.');
      localStringBuilder.append(localStringBuffer.toString() + paramLinkedList.bZt + " " + paramLinkedList.count + " " + paramLinkedList.bZu).append('\n');
      if (l >= paramLinkedList.bZu)
        break label182;
      l = paramLinkedList.bZu;
    }
    label182: 
    while (true)
    {
      break;
      return l;
    }
  }

  public static String a(List<com.tencent.matrix.trace.d.a> paramList, long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramLong = ()((float)paramLong * 0.3F);
    Object localObject = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.matrix.trace.d.a locala = (com.tencent.matrix.trace.d.a)localIterator.next();
      if (locala.bZu >= paramLong)
        ((List)localObject).add(locala);
    }
    Collections.sort((List)localObject, new Comparator()
    {
    });
    if ((((List)localObject).isEmpty()) && (!paramList.isEmpty()))
    {
      ((List)localObject).add(paramList.get(0));
      paramList = (List<com.tencent.matrix.trace.d.a>)localObject;
    }
    while (true)
    {
      localObject = paramList.iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          paramList = (com.tencent.matrix.trace.d.a)((Iterator)localObject).next();
          localStringBuilder.append(paramList.bZt + "|");
          continue;
          if (((List)localObject).isEmpty())
            break label214;
          paramList = ((List)localObject).subList(0, 1);
          break;
        }
      return localStringBuilder.toString();
      label214: paramList = (List<com.tencent.matrix.trace.d.a>)localObject;
    }
  }

  public static void a(List<com.tencent.matrix.trace.d.a> paramList, a parama)
  {
    int i = paramList.size();
    int j = 1;
    label129: 
    while (true)
    {
      if (i > 30)
      {
        ListIterator localListIterator = paramList.listIterator(paramList.size());
        if (localListIterator.hasPrevious())
          if (parama.c(((com.tencent.matrix.trace.d.a)localListIterator.previous()).bZu, j))
          {
            localListIterator.remove();
            int k = i - 1;
            i = k;
            if (k > 30);
          }
      }
      while (true)
      {
        return;
        break;
        i = paramList.size();
        j++;
        if (60 >= j)
          break label129;
        i = paramList.size();
        if (i > 30)
          parama.e(paramList, i);
      }
    }
  }

  public static void a(long[] paramArrayOfLong, LinkedList<com.tencent.matrix.trace.d.a> paramLinkedList, boolean paramBoolean, long paramLong)
  {
    long l1 = 0L;
    int i = 0;
    Object localObject = new LinkedList();
    int j;
    int m;
    label29: long l2;
    int n;
    int i1;
    if (!paramBoolean)
    {
      j = 1;
      int k = paramArrayOfLong.length;
      m = 0;
      if (m >= k)
        break label417;
      l2 = paramArrayOfLong[m];
      if (0L == l2)
        break label695;
      n = j;
      if (!paramBoolean)
        break label141;
      i1 = j;
      if (aE(l2))
      {
        i1 = j;
        if (1048574 == aF(l2))
          i1 = 1;
      }
      n = i1;
      if (i1 != 0)
        break label141;
      c.d("Matrix.TraceDataUtils", "never begin! pass this method[%s]", new Object[] { Integer.valueOf(aF(l2)) });
      j = i1;
      i1 = i;
    }
    while (true)
    {
      m++;
      i = i1;
      break label29;
      j = 0;
      break;
      label141: if (aE(l2))
      {
        l1 = aF(l2);
        if (l1 != 1048574L)
          break label688;
      }
      label417: label677: label688: for (j = 0; ; j = i)
      {
        i1 = j + 1;
        ((LinkedList)localObject).push(Long.valueOf(l2));
        j = n;
        break;
        i1 = aF(l2);
        long l3;
        if (!((LinkedList)localObject).isEmpty())
        {
          l3 = ((Long)((LinkedList)localObject).pop()).longValue();
          for (j = i - 1; (aF(l3) != i1) && (!((LinkedList)localObject).isEmpty()); j--)
          {
            c.w("Matrix.TraceDataUtils", "[structuredDataToStack] method[%s] not match in! pop[%s] to continue find!", new Object[] { Long.valueOf(l3), Integer.valueOf(i1) });
            l3 = ((Long)((LinkedList)localObject).pop()).longValue();
          }
          if ((l1 == i1) && (i1 == 1048574))
            break label677;
          l3 = (0xFFFFFFFF & l2) - (l3 & 0xFFFFFFFF);
          if (l3 < 0L)
          {
            c.e("Matrix.TraceDataUtils", "[structuredDataToStack] trace during invalid:%d", new Object[] { Long.valueOf(l3) });
            ((LinkedList)localObject).clear();
            paramLinkedList.clear();
          }
        }
        while (true)
        {
          return;
          a(paramLinkedList, new com.tencent.matrix.trace.d.a(i1, (int)l3, j));
          i1 = j;
          j = n;
          break;
          c.w("Matrix.TraceDataUtils", "[structuredDataToStack] method[%s] not found in! ", new Object[] { Integer.valueOf(i1) });
          j = n;
          i1 = i;
          break;
          while ((!((LinkedList)localObject).isEmpty()) && (paramBoolean))
          {
            l3 = ((Long)((LinkedList)localObject).pop()).longValue();
            j = aF(l3);
            boolean bool = aE(l3);
            l1 = AppMethodBeat.getDiffTime();
            c.w("Matrix.TraceDataUtils", "[structuredDataToStack] has never out method[%s], isIn:%s, rawData size:%s", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool), Integer.valueOf(((LinkedList)localObject).size()) });
            if (!bool)
              c.e("Matrix.TraceDataUtils", "[structuredDataToStack] why has out Method[%s]? is wrong! ", new Object[] { Integer.valueOf(j) });
            else
              a(paramLinkedList, new com.tencent.matrix.trace.d.a(j, (int)(paramLong - ((l3 & 0xFFFFFFFF) + l1)), ((LinkedList)localObject).size()));
          }
          LinkedList localLinkedList = new LinkedList();
          Iterator localIterator = paramLinkedList.iterator();
          paramArrayOfLong = null;
          if (localIterator.hasNext())
          {
            localObject = (com.tencent.matrix.trace.d.a)localIterator.next();
            if (paramArrayOfLong != null)
            {
              j = localLinkedList.indexOf(paramArrayOfLong);
              if (paramArrayOfLong.bna == ((com.tencent.matrix.trace.d.a)localObject).bna)
                localLinkedList.add(j, localObject);
            }
            while (true)
            {
              paramArrayOfLong = (long[])localObject;
              break;
              localLinkedList.add(j + 1, localObject);
              continue;
              localLinkedList.add(localObject);
            }
          }
          paramLinkedList.clear();
          paramLinkedList.addAll(localLinkedList);
        }
        i1 = j;
        j = n;
        break;
      }
      label695: i1 = i;
    }
  }

  private static boolean aE(long paramLong)
  {
    if ((paramLong >> 63 & 1L) == 1L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static int aF(long paramLong)
  {
    return (int)(paramLong >> 43 & 0xFFFFF);
  }

  public static abstract interface a
  {
    public abstract boolean c(long paramLong, int paramInt);

    public abstract void e(List<com.tencent.matrix.trace.d.a> paramList, int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.g.a
 * JD-Core Version:    0.6.2
 */