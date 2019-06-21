package com.tencent.mm.ca;

import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public final class g
{
  SparseIntArray xuS;
  byte[] xuT;

  private g(SparseIntArray paramSparseIntArray, byte[] paramArrayOfByte)
  {
    this.xuS = paramSparseIntArray;
    this.xuT = paramArrayOfByte;
  }

  public static g a(SparseIntArray paramSparseIntArray, InputStream paramInputStream, int paramInt)
  {
    AppMethodBeat.i(105934);
    byte[] arrayOfByte = new byte[paramInt];
    try
    {
      if (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length)
        ab.e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. data length no equal.");
      paramInputStream = new com/tencent/mm/ca/g;
      paramInputStream.<init>(paramSparseIntArray, arrayOfByte);
      AppMethodBeat.o(105934);
      paramSparseIntArray = paramInputStream;
      return paramSparseIntArray;
    }
    catch (IOException paramSparseIntArray)
    {
      while (true)
      {
        ab.e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. %s", new Object[] { bo.l(paramSparseIntArray) });
        paramSparseIntArray = null;
        AppMethodBeat.o(105934);
      }
    }
  }

  public final String getString(int paramInt)
  {
    String str = null;
    AppMethodBeat.i(105935);
    try
    {
      paramInt = this.xuS.indexOfKey(paramInt);
      if (paramInt < 0)
      {
        AppMethodBeat.o(105935);
        return str;
      }
      int i = this.xuS.valueAt(paramInt);
      if (paramInt < this.xuS.size() - 1)
        paramInt = this.xuS.valueAt(paramInt + 1) - i;
      while (true)
      {
        str = new java/lang/String;
        str.<init>(this.xuT, i, paramInt, "UTF-8");
        AppMethodBeat.o(105935);
        break;
        paramInt = this.xuT.length;
        paramInt -= i;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        ab.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", new Object[] { bo.l(localUnsupportedEncodingException) });
        Object localObject1 = null;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", new Object[] { bo.l(localException) });
        Object localObject2 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ca.g
 * JD-Core Version:    0.6.2
 */