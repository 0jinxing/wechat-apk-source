package a.i.b.a.c.n;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

public final class h<E> extends AbstractList<E>
  implements RandomAccess
{
  private int BNo;
  private Object BNp;

  public final void add(int paramInt, E paramE)
  {
    AppMethodBeat.i(122957);
    if ((paramInt < 0) || (paramInt > this.BNo))
    {
      paramE = new IndexOutOfBoundsException("Index: " + paramInt + ", Size: " + this.BNo);
      AppMethodBeat.o(122957);
      throw paramE;
    }
    if (this.BNo == 0);
    for (this.BNp = paramE; ; this.BNp = new Object[] { paramE, this.BNp })
    {
      this.BNo += 1;
      this.modCount += 1;
      AppMethodBeat.o(122957);
      return;
      if ((this.BNo != 1) || (paramInt != 0))
        break;
    }
    Object[] arrayOfObject1 = new Object[this.BNo + 1];
    if (this.BNo == 1)
      arrayOfObject1[0] = this.BNp;
    while (true)
    {
      arrayOfObject1[paramInt] = paramE;
      this.BNp = arrayOfObject1;
      break;
      Object[] arrayOfObject2 = (Object[])this.BNp;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, paramInt);
      System.arraycopy(arrayOfObject2, paramInt, arrayOfObject1, paramInt + 1, this.BNo - paramInt);
    }
  }

  public final boolean add(E paramE)
  {
    AppMethodBeat.i(122956);
    if (this.BNo == 0);
    for (this.BNp = paramE; ; this.BNp = new Object[] { this.BNp, paramE })
    {
      this.BNo += 1;
      this.modCount += 1;
      AppMethodBeat.o(122956);
      return true;
      if (this.BNo != 1)
        break;
    }
    Object[] arrayOfObject1 = (Object[])this.BNp;
    int i = arrayOfObject1.length;
    Object[] arrayOfObject2 = arrayOfObject1;
    int j;
    if (this.BNo >= i)
    {
      j = i * 3 / 2 + 1;
      int k = this.BNo + 1;
      if (j >= k)
        break label157;
      j = k;
    }
    label157: 
    while (true)
    {
      arrayOfObject2 = new Object[j];
      this.BNp = arrayOfObject2;
      System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, i);
      arrayOfObject2[this.BNo] = paramE;
      break;
    }
  }

  public final void clear()
  {
    this.BNp = null;
    this.BNo = 0;
    this.modCount += 1;
  }

  public final E get(int paramInt)
  {
    AppMethodBeat.i(122955);
    Object localObject;
    if ((paramInt < 0) || (paramInt >= this.BNo))
    {
      localObject = new IndexOutOfBoundsException("Index: " + paramInt + ", Size: " + this.BNo);
      AppMethodBeat.o(122955);
      throw ((Throwable)localObject);
    }
    if (this.BNo == 1)
    {
      localObject = this.BNp;
      AppMethodBeat.o(122955);
    }
    while (true)
    {
      return localObject;
      localObject = ((Object[])this.BNp)[paramInt];
      AppMethodBeat.o(122955);
    }
  }

  public final Iterator<E> iterator()
  {
    AppMethodBeat.i(122960);
    Object localObject;
    if (this.BNo == 0)
    {
      localObject = h.a.ekA();
      AppMethodBeat.o(122960);
    }
    while (true)
    {
      return localObject;
      if (this.BNo == 1)
      {
        localObject = new h.b(this);
        AppMethodBeat.o(122960);
      }
      else
      {
        localObject = super.iterator();
        AppMethodBeat.o(122960);
      }
    }
  }

  public final E remove(int paramInt)
  {
    AppMethodBeat.i(122959);
    Object localObject;
    if ((paramInt < 0) || (paramInt >= this.BNo))
    {
      localObject = new IndexOutOfBoundsException("Index: " + paramInt + ", Size: " + this.BNo);
      AppMethodBeat.o(122959);
      throw ((Throwable)localObject);
    }
    if (this.BNo == 1)
    {
      localObject = this.BNp;
      this.BNp = null;
    }
    while (true)
    {
      this.BNo -= 1;
      this.modCount += 1;
      AppMethodBeat.o(122959);
      return localObject;
      Object[] arrayOfObject = (Object[])this.BNp;
      localObject = arrayOfObject[paramInt];
      if (this.BNo == 2)
      {
        this.BNp = arrayOfObject[(1 - paramInt)];
      }
      else
      {
        int i = this.BNo - paramInt - 1;
        if (i > 0)
          System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i);
        arrayOfObject[(this.BNo - 1)] = null;
      }
    }
  }

  public final E set(int paramInt, E paramE)
  {
    AppMethodBeat.i(122958);
    if ((paramInt < 0) || (paramInt >= this.BNo))
    {
      paramE = new IndexOutOfBoundsException("Index: " + paramInt + ", Size: " + this.BNo);
      AppMethodBeat.o(122958);
      throw paramE;
    }
    Object localObject;
    if (this.BNo == 1)
    {
      localObject = this.BNp;
      this.BNp = paramE;
    }
    for (paramE = localObject; ; paramE = localObject)
    {
      AppMethodBeat.o(122958);
      return paramE;
      Object[] arrayOfObject = (Object[])this.BNp;
      localObject = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramE;
    }
  }

  public final int size()
  {
    return this.BNo;
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    AppMethodBeat.i(122961);
    int i = paramArrayOfT.length;
    if (this.BNo == 1)
      if (i != 0)
        paramArrayOfT[0] = this.BNp;
    while (true)
    {
      if (i > this.BNo)
        paramArrayOfT[this.BNo] = null;
      AppMethodBeat.o(122961);
      while (true)
      {
        return paramArrayOfT;
        paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), 1);
        paramArrayOfT[0] = this.BNp;
        AppMethodBeat.o(122961);
        continue;
        if (i >= this.BNo)
          break;
        paramArrayOfT = (Object[])Arrays.copyOf((Object[])this.BNp, this.BNo, paramArrayOfT.getClass());
        AppMethodBeat.o(122961);
      }
      if (this.BNo != 0)
        System.arraycopy(this.BNp, 0, paramArrayOfT, 0, this.BNo);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.h
 * JD-Core Version:    0.6.2
 */