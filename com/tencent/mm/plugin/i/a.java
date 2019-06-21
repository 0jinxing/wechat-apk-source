package com.tencent.mm.plugin.i;

import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vfs.e;
import java.io.UnsupportedEncodingException;

public final class a
{
  public String cvZ;
  public int nuA;
  public int nuB;
  public int nuC;
  public int nuD;
  public String nuw;
  public String nux;
  public int nuy;
  public int nuz;

  public static String OK(String paramString)
  {
    AppMethodBeat.i(79093);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(79093);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replace(",", ";");
      AppMethodBeat.o(79093);
    }
  }

  public static String cv(String paramString)
  {
    AppMethodBeat.i(79092);
    byte[] arrayOfByte = e.e(paramString, 0, 6);
    if ((arrayOfByte == null) || (arrayOfByte.length != 6))
    {
      paramString = "";
      AppMethodBeat.o(79092);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = new java/lang/String;
        paramString.<init>(arrayOfByte, "UTF-8");
        AppMethodBeat.o(79092);
      }
      catch (UnsupportedEncodingException paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.ImgExtInfoReport", "getFileExt UnsupportedEncodingException:".concat(String.valueOf(paramString)));
          paramString = "";
        }
      }
    }
  }

  public static int tF(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(79094);
    try
    {
      paramString = d.amj(paramString);
      if (paramString == null)
        AppMethodBeat.o(79094);
      while (true)
      {
        return i;
        paramString = paramString.outMimeType;
        if (paramString == null)
        {
          AppMethodBeat.o(79094);
        }
        else
        {
          paramString = paramString.toLowerCase();
          int j = paramString.indexOf("png");
          if (j >= 0)
          {
            i = 1;
            AppMethodBeat.o(79094);
          }
          else
          {
            j = paramString.indexOf("jpg");
            if (j >= 0)
            {
              AppMethodBeat.o(79094);
              i = 2;
            }
            else
            {
              j = paramString.indexOf("jpeg");
              if (j >= 0)
              {
                AppMethodBeat.o(79094);
                i = 2;
              }
              else
              {
                AppMethodBeat.o(79094);
              }
            }
          }
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(79094);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.i.a
 * JD-Core Version:    0.6.2
 */