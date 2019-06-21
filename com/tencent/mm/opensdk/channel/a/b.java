package com.tencent.mm.opensdk.channel.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public static byte[] a(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(128138);
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString1 != null)
      localStringBuffer.append(paramString1);
    localStringBuffer.append(paramInt);
    localStringBuffer.append(paramString2);
    localStringBuffer.append("mMcShCsTr");
    paramString1 = com.tencent.mm.opensdk.utils.b.c(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    AppMethodBeat.o(128138);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.channel.a.b
 * JD-Core Version:    0.6.2
 */