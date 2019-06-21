package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public class TbsCoreLoadStat$TbsSequenceQueue
{
  private int b;
  private int c;
  private int[] d;
  private int e;
  private int f;

  public TbsCoreLoadStat$TbsSequenceQueue(TbsCoreLoadStat paramTbsCoreLoadStat)
  {
    AppMethodBeat.i(64291);
    this.b = 10;
    this.e = 0;
    this.f = 0;
    this.c = this.b;
    this.d = new int[this.c];
    AppMethodBeat.o(64291);
  }

  public TbsCoreLoadStat$TbsSequenceQueue(TbsCoreLoadStat paramTbsCoreLoadStat, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(64292);
    this.b = 10;
    this.e = 0;
    this.f = 0;
    this.c = paramInt2;
    this.d = new int[this.c];
    this.d[0] = paramInt1;
    this.f += 1;
    AppMethodBeat.o(64292);
  }

  public void add(int paramInt)
  {
    AppMethodBeat.i(64293);
    if (this.f > this.c - 1)
    {
      localObject = new IndexOutOfBoundsException("sequeue is full");
      AppMethodBeat.o(64293);
      throw ((Throwable)localObject);
    }
    Object localObject = this.d;
    int i = this.f;
    this.f = (i + 1);
    localObject[i] = paramInt;
    AppMethodBeat.o(64293);
  }

  public void clear()
  {
    AppMethodBeat.i(64296);
    Arrays.fill(this.d, 0);
    this.e = 0;
    this.f = 0;
    AppMethodBeat.o(64296);
  }

  public int element()
  {
    AppMethodBeat.i(64295);
    if (empty())
    {
      IndexOutOfBoundsException localIndexOutOfBoundsException = new IndexOutOfBoundsException("sequeue is null");
      AppMethodBeat.o(64295);
      throw localIndexOutOfBoundsException;
    }
    int i = this.d[this.e];
    AppMethodBeat.o(64295);
    return i;
  }

  public boolean empty()
  {
    if (this.f == this.e);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int length()
  {
    return this.f - this.e;
  }

  public int remove()
  {
    AppMethodBeat.i(64294);
    if (empty())
    {
      localObject = new IndexOutOfBoundsException("sequeue is null");
      AppMethodBeat.o(64294);
      throw ((Throwable)localObject);
    }
    int i = this.d[this.e];
    Object localObject = this.d;
    int j = this.e;
    this.e = (j + 1);
    localObject[j] = 0;
    AppMethodBeat.o(64294);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(64297);
    Object localObject;
    if (empty())
    {
      localObject = "";
      AppMethodBeat.o(64297);
    }
    while (true)
    {
      return localObject;
      localObject = new StringBuilder("[");
      for (int i = this.e; i < this.f; i++)
        ((StringBuilder)localObject).append(String.valueOf(this.d[i]) + ",");
      i = ((StringBuilder)localObject).length();
      localObject = "]";
      AppMethodBeat.o(64297);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsCoreLoadStat.TbsSequenceQueue
 * JD-Core Version:    0.6.2
 */