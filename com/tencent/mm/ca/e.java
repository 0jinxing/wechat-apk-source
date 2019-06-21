package com.tencent.mm.ca;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.InputStream;

public final class e
{
  public byte[] mData;
  public SparseArray<a> xuH;

  private e(SparseArray<a> paramSparseArray, byte[] paramArrayOfByte)
  {
    this.xuH = paramSparseArray;
    this.mData = paramArrayOfByte;
  }

  public static e b(SparseArray<a> paramSparseArray, InputStream paramInputStream, int paramInt)
  {
    AppMethodBeat.i(105918);
    try
    {
      byte[] arrayOfByte = new byte[paramInt];
      if (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length)
        ab.e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed. data length no equal.");
      paramInputStream = new com/tencent/mm/ca/e;
      paramInputStream.<init>(paramSparseArray, arrayOfByte);
      AppMethodBeat.o(105918);
      paramSparseArray = paramInputStream;
      return paramSparseArray;
    }
    catch (IOException paramSparseArray)
    {
      while (true)
      {
        ab.e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed:%s", new Object[] { bo.l(paramSparseArray) });
        paramSparseArray = null;
        AppMethodBeat.o(105918);
      }
    }
  }

  static final class a
  {
    public final int resId;
    public final int[] xuI;

    public a(int paramInt, int[] paramArrayOfInt)
    {
      this.resId = paramInt;
      this.xuI = paramArrayOfInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ca.e
 * JD-Core Version:    0.6.2
 */