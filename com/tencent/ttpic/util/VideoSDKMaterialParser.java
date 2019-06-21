package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.VideoMaterial;

public class VideoSDKMaterialParser
{
  private static final DecryptListener decryptListener;

  static
  {
    AppMethodBeat.i(84223);
    decryptListener = new DecryptListener()
    {
      public final byte[] decrypt(byte[] paramAnonymousArrayOfByte)
      {
        AppMethodBeat.i(84221);
        paramAnonymousArrayOfByte = Coffee.drink(paramAnonymousArrayOfByte, Coffee.getDefaultSign());
        AppMethodBeat.o(84221);
        return paramAnonymousArrayOfByte;
      }
    };
    AppMethodBeat.o(84223);
  }

  public static VideoMaterial parseVideoMaterial(String paramString1, String paramString2)
  {
    AppMethodBeat.i(84222);
    paramString1 = VideoTemplateParser.parseVideoMaterial(paramString1, paramString2, true, decryptListener);
    AppMethodBeat.o(84222);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoSDKMaterialParser
 * JD-Core Version:    0.6.2
 */