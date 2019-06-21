package com.tencent.mm.platformtools;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;

public final class aa
{
  public static String a(b paramb)
  {
    AppMethodBeat.i(58730);
    if (paramb == null)
    {
      paramb = null;
      AppMethodBeat.o(58730);
    }
    while (true)
    {
      return paramb;
      paramb = paramb.dlY();
      AppMethodBeat.o(58730);
    }
  }

  public static String a(bts parambts)
  {
    if (parambts == null);
    for (parambts = null; ; parambts = parambts.wVI)
      return parambts;
  }

  public static String a(bts parambts, String paramString)
  {
    if (parambts == null);
    while (true)
    {
      return paramString;
      paramString = parambts.wVI;
    }
  }

  public static byte[] a(SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    AppMethodBeat.i(58727);
    if ((paramSKBuiltinBuffer_t == null) || (paramSKBuiltinBuffer_t.getBuffer() == null))
    {
      paramSKBuiltinBuffer_t = null;
      AppMethodBeat.o(58727);
    }
    while (true)
    {
      return paramSKBuiltinBuffer_t;
      paramSKBuiltinBuffer_t = paramSKBuiltinBuffer_t.getBuffer().toByteArray();
      AppMethodBeat.o(58727);
    }
  }

  public static byte[] a(SKBuiltinBuffer_t paramSKBuiltinBuffer_t, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58728);
    if ((paramSKBuiltinBuffer_t == null) || (paramSKBuiltinBuffer_t.getBuffer() == null))
      AppMethodBeat.o(58728);
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = paramSKBuiltinBuffer_t.getBuffer().toByteArray();
      AppMethodBeat.o(58728);
    }
  }

  public static SKBuiltinBuffer_t ad(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58726);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(58726);
    }
    while (true)
    {
      return paramArrayOfByte;
      SKBuiltinBuffer_t localSKBuiltinBuffer_t = new SKBuiltinBuffer_t();
      localSKBuiltinBuffer_t.setBuffer(paramArrayOfByte);
      AppMethodBeat.o(58726);
      paramArrayOfByte = localSKBuiltinBuffer_t;
    }
  }

  public static String b(SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    AppMethodBeat.i(58731);
    if ((paramSKBuiltinBuffer_t == null) || (paramSKBuiltinBuffer_t.getBuffer() == null))
    {
      paramSKBuiltinBuffer_t = null;
      AppMethodBeat.o(58731);
    }
    while (true)
    {
      return paramSKBuiltinBuffer_t;
      paramSKBuiltinBuffer_t = paramSKBuiltinBuffer_t.getBuffer().dlY();
      AppMethodBeat.o(58731);
    }
  }

  public static bts vy(String paramString)
  {
    AppMethodBeat.i(58729);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(58729);
    }
    while (true)
    {
      return paramString;
      bts localbts = new bts();
      localbts.alV(paramString);
      AppMethodBeat.o(58729);
      paramString = localbts;
    }
  }

  public static SKBuiltinBuffer_t vz(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(58732);
    if (paramString == null)
    {
      AppMethodBeat.o(58732);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      byte[] arrayOfByte = Base64.decode(paramString, 0);
      if (arrayOfByte == null)
      {
        AppMethodBeat.o(58732);
        paramString = localObject;
      }
      else
      {
        paramString = new SKBuiltinBuffer_t();
        paramString.setBuffer(arrayOfByte);
        AppMethodBeat.o(58732);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.aa
 * JD-Core Version:    0.6.2
 */