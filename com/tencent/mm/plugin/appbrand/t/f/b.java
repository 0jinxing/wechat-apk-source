package com.tencent.mm.plugin.appbrand.t.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public final class b
{
  public static CodingErrorAction iTM = CodingErrorAction.REPORT;

  public static String B(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(73277);
    Object localObject = Charset.forName("UTF8").newDecoder();
    ((CharsetDecoder)localObject).onMalformedInput(iTM);
    ((CharsetDecoder)localObject).onUnmappableCharacter(iTM);
    try
    {
      paramByteBuffer.mark();
      localObject = ((CharsetDecoder)localObject).decode(paramByteBuffer).toString();
      paramByteBuffer.reset();
      AppMethodBeat.o(73277);
      return localObject;
    }
    catch (CharacterCodingException paramByteBuffer)
    {
      paramByteBuffer = new com.tencent.mm.plugin.appbrand.t.c.b(1007, paramByteBuffer);
      AppMethodBeat.o(73277);
    }
    throw paramByteBuffer;
  }

  public static byte[] Es(String paramString)
  {
    AppMethodBeat.i(73274);
    try
    {
      paramString = paramString.getBytes("UTF8");
      AppMethodBeat.o(73274);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandNetWork.Charsetfunctions", paramString.toString());
        paramString = new byte[0];
        AppMethodBeat.o(73274);
      }
    }
  }

  public static byte[] Et(String paramString)
  {
    AppMethodBeat.i(73275);
    try
    {
      paramString = paramString.getBytes("ASCII");
      AppMethodBeat.o(73275);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandNetWork.Charsetfunctions", paramString.toString());
        paramString = new byte[0];
        AppMethodBeat.o(73275);
      }
    }
  }

  public static String H(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(73276);
    try
    {
      String str = new java/lang/String;
      str.<init>(paramArrayOfByte, 0, paramInt, "ASCII");
      AppMethodBeat.o(73276);
      paramArrayOfByte = str;
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandNetWork.Charsetfunctions", paramArrayOfByte.toString());
        paramArrayOfByte = "";
        AppMethodBeat.o(73276);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.f.b
 * JD-Core Version:    0.6.2
 */