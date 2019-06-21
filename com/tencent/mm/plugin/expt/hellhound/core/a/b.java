package com.tencent.mm.plugin.expt.hellhound.core.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.as;

public final class b
{
  public static byte[] getBytes(String paramString)
  {
    AppMethodBeat.i(73353);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = null;
      AppMethodBeat.o(73353);
    }
    while (true)
    {
      return paramString;
      paramString = as.amF("_hellhound_mmkv").decodeBytes(paramString);
      AppMethodBeat.o(73353);
    }
  }

  public static void putInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(73354);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(73354);
    while (true)
    {
      return;
      as.amF("_hellhound_mmkv").putInt(paramString, paramInt);
      AppMethodBeat.o(73354);
    }
  }

  public static void v(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(73352);
    if ((TextUtils.isEmpty(paramString)) || (paramArrayOfByte == null))
      AppMethodBeat.o(73352);
    while (true)
    {
      return;
      as.amF("_hellhound_mmkv").encode(paramString, paramArrayOfByte);
      AppMethodBeat.o(73352);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.a.b
 * JD-Core Version:    0.6.2
 */