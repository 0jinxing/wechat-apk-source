package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class StaggeredGridLayoutManager$LazySpanLookup
{
  List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> asm;
  int[] mData;

  private void aM(int paramInt1, int paramInt2)
  {
    if (this.asm == null)
      return;
    int i = this.asm.size() - 1;
    label20: StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    if (i >= 0)
    {
      localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.asm.get(i);
      if (localFullSpanItem.mPosition >= paramInt1)
      {
        if (localFullSpanItem.mPosition >= paramInt1 + paramInt2)
          break label76;
        this.asm.remove(i);
      }
    }
    while (true)
    {
      i--;
      break label20;
      break;
      label76: localFullSpanItem.mPosition -= paramInt2;
    }
  }

  private void aO(int paramInt1, int paramInt2)
  {
    if (this.asm == null);
    while (true)
    {
      return;
      for (int i = this.asm.size() - 1; i >= 0; i--)
      {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.asm.get(i);
        if (localFullSpanItem.mPosition >= paramInt1)
          localFullSpanItem.mPosition += paramInt2;
      }
    }
  }

  private int cN(int paramInt)
  {
    int i = this.mData.length;
    while (i <= paramInt)
      i *= 2;
    return i;
  }

  private void cO(int paramInt)
  {
    if (this.mData == null)
    {
      this.mData = new int[Math.max(paramInt, 10) + 1];
      Arrays.fill(this.mData, -1);
    }
    while (true)
    {
      return;
      if (paramInt >= this.mData.length)
      {
        int[] arrayOfInt = this.mData;
        this.mData = new int[cN(paramInt)];
        System.arraycopy(arrayOfInt, 0, this.mData, 0, arrayOfInt.length);
        Arrays.fill(this.mData, arrayOfInt.length, this.mData.length, -1);
      }
    }
  }

  private int cP(int paramInt)
  {
    if (this.asm == null)
    {
      paramInt = -1;
      return paramInt;
    }
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = cQ(paramInt);
    if (localFullSpanItem != null)
      this.asm.remove(localFullSpanItem);
    int i = this.asm.size();
    int j = 0;
    label45: if (j < i)
      if (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.asm.get(j)).mPosition < paramInt);
    while (true)
    {
      if (j != -1)
      {
        localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.asm.get(j);
        this.asm.remove(j);
        paramInt = localFullSpanItem.mPosition;
        break;
        j++;
        break label45;
      }
      paramInt = -1;
      break;
      j = -1;
    }
  }

  final void a(int paramInt, StaggeredGridLayoutManager.b paramb)
  {
    cO(paramInt);
    this.mData[paramInt] = paramb.mIndex;
  }

  public final void a(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem paramFullSpanItem)
  {
    if (this.asm == null)
      this.asm = new ArrayList();
    int i = this.asm.size();
    int j = 0;
    if (j < i)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.asm.get(j);
      if (localFullSpanItem.mPosition == paramFullSpanItem.mPosition)
        this.asm.remove(j);
      if (localFullSpanItem.mPosition >= paramFullSpanItem.mPosition)
        this.asm.add(j, paramFullSpanItem);
    }
    while (true)
    {
      return;
      j++;
      break;
      this.asm.add(paramFullSpanItem);
    }
  }

  final void aL(int paramInt1, int paramInt2)
  {
    if ((this.mData == null) || (paramInt1 >= this.mData.length));
    while (true)
    {
      return;
      cO(paramInt1 + paramInt2);
      int[] arrayOfInt1 = this.mData;
      int[] arrayOfInt2 = this.mData;
      System.arraycopy(arrayOfInt1, paramInt1 + paramInt2, arrayOfInt2, paramInt1, arrayOfInt2.length - paramInt1 - paramInt2);
      Arrays.fill(this.mData, this.mData.length - paramInt2, this.mData.length, -1);
      aM(paramInt1, paramInt2);
    }
  }

  final void aN(int paramInt1, int paramInt2)
  {
    if ((this.mData == null) || (paramInt1 >= this.mData.length));
    while (true)
    {
      return;
      cO(paramInt1 + paramInt2);
      int[] arrayOfInt = this.mData;
      System.arraycopy(arrayOfInt, paramInt1, arrayOfInt, paramInt1 + paramInt2, this.mData.length - paramInt1 - paramInt2);
      Arrays.fill(this.mData, paramInt1, paramInt1 + paramInt2, -1);
      aO(paramInt1, paramInt2);
    }
  }

  final int cK(int paramInt)
  {
    if (this.asm != null)
      for (int i = this.asm.size() - 1; i >= 0; i--)
        if (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.asm.get(i)).mPosition >= paramInt)
          this.asm.remove(i);
    return cL(paramInt);
  }

  final int cL(int paramInt)
  {
    int i = -1;
    if (this.mData == null);
    while (true)
    {
      return i;
      if (paramInt < this.mData.length)
      {
        i = cP(paramInt);
        if (i == -1)
        {
          int[] arrayOfInt = this.mData;
          Arrays.fill(arrayOfInt, paramInt, arrayOfInt.length, -1);
          i = this.mData.length;
        }
        else
        {
          Arrays.fill(this.mData, paramInt, i + 1, -1);
          i++;
        }
      }
    }
  }

  final int cM(int paramInt)
  {
    if ((this.mData == null) || (paramInt >= this.mData.length));
    for (paramInt = -1; ; paramInt = this.mData[paramInt])
      return paramInt;
  }

  public final StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem cQ(int paramInt)
  {
    Object localObject;
    if (this.asm == null)
      localObject = null;
    while (true)
    {
      return localObject;
      for (int i = this.asm.size() - 1; ; i--)
      {
        if (i < 0)
          break label60;
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.asm.get(i);
        localObject = localFullSpanItem;
        if (localFullSpanItem.mPosition == paramInt)
          break;
      }
      label60: localObject = null;
    }
  }

  final void clear()
  {
    if (this.mData != null)
      Arrays.fill(this.mData, -1);
    this.asm = null;
  }

  public final StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem q(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject;
    if (this.asm == null)
      localObject = null;
    while (true)
    {
      return localObject;
      int i = this.asm.size();
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label113;
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.asm.get(j);
        if (localFullSpanItem.mPosition >= paramInt2)
        {
          localObject = null;
          break;
        }
        if (localFullSpanItem.mPosition >= paramInt1)
        {
          localObject = localFullSpanItem;
          if (paramInt3 == 0)
            break;
          localObject = localFullSpanItem;
          if (localFullSpanItem.asn == paramInt3)
            break;
          localObject = localFullSpanItem;
          if (localFullSpanItem.asp)
            break;
        }
      }
      label113: localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager.LazySpanLookup
 * JD-Core Version:    0.6.2
 */