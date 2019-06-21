package com.tencent.mm.ca;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.InputStream;

public final class c
{
  public byte[] mData;
  public SparseArray<a> xuC;

  private c(SparseArray<a> paramSparseArray, byte[] paramArrayOfByte)
  {
    this.xuC = paramSparseArray;
    this.mData = paramArrayOfByte;
  }

  public static c a(SparseArray<a> paramSparseArray, InputStream paramInputStream, int paramInt)
  {
    AppMethodBeat.i(105910);
    try
    {
      byte[] arrayOfByte = new byte[paramInt];
      if (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length)
        ab.e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed. data length no equal.");
      paramInputStream = new com/tencent/mm/ca/c;
      paramInputStream.<init>(paramSparseArray, arrayOfByte);
      AppMethodBeat.o(105910);
      paramSparseArray = paramInputStream;
      return paramSparseArray;
    }
    catch (IOException paramSparseArray)
    {
      while (true)
      {
        ab.e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed:%s", new Object[] { bo.l(paramSparseArray) });
        paramSparseArray = null;
        AppMethodBeat.o(105910);
      }
    }
  }

  public final String getQuantityString(int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105911);
    try
    {
      int i = this.xuC.indexOfKey(paramInt1);
      if (i < 0)
      {
        AppMethodBeat.o(105911);
        localObject1 = null;
        return localObject1;
      }
      localObject2 = (a)this.xuC.valueAt(i);
      j = ((a)localObject2).xuE.length;
      paramInt1 = 0;
      k = 0;
      while (paramInt1 < j)
      {
        if (localObject2.xuE[paramInt1] != paramInt2)
          break label358;
        k = paramInt1;
        paramInt1++;
      }
      if (i <= this.xuC.size() - 1)
        if (k >= j - 1)
        {
          localObject1 = (a)this.xuC.valueAt(i + 1);
          localObject2 = new String(this.mData, localObject2.xuF[k], localObject1.xuF[0] - localObject2.xuF[k]);
        }
    }
    catch (Exception paramArrayOfObject)
    {
      label358: 
      while (true)
        try
        {
          Object localObject1;
          int j;
          int k;
          if (!bo.isNullOrNil((String)localObject2))
          {
            localObject1 = localObject2;
            if (paramArrayOfObject == null);
          }
          else
          {
            localObject1 = String.format((String)localObject2, paramArrayOfObject);
          }
          AppMethodBeat.o(105911);
          continue;
          Object localObject2 = new String(this.mData, localObject2.xuF[k], localObject2.xuF[(k + 1)] - localObject2.xuF[k]);
          continue;
          if (k >= j - 1)
          {
            localObject2 = new String(this.mData, localObject2.xuF[k], this.mData.length - localObject2.xuF[k]);
          }
          else
          {
            localObject2 = new String(this.mData, localObject2.xuF[k], localObject2.xuF[(k + 1)] - localObject2.xuF[k]);
            continue;
            paramArrayOfObject = paramArrayOfObject;
            localObject2 = null;
            ab.e("MicroMsg.language.PluralsCollection", "[cpan] getString failed. %s", new Object[] { bo.l(paramArrayOfObject) });
            localObject1 = localObject2;
          }
        }
        catch (Exception paramArrayOfObject)
        {
        }
    }
  }

  static final class a
  {
    public final int xuD;
    public final int[] xuE;
    public final int[] xuF;

    public a(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
    {
      this.xuD = paramInt;
      this.xuE = paramArrayOfInt1;
      this.xuF = paramArrayOfInt2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ca.c
 * JD-Core Version:    0.6.2
 */