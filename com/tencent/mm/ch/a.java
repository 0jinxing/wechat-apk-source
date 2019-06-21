package com.tencent.mm.ch;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class a
{
  public static int a(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    int i = paramOptions.outHeight;
    int j = paramOptions.outWidth;
    int m;
    for (int k = 1; ; k++)
    {
      m = k;
      if (j / k <= paramInt1)
        break;
    }
    while (i / m > paramInt2)
      m++;
    return m;
  }

  public static String asQ(String paramString)
  {
    AppMethodBeat.i(116368);
    paramString = e.evi + String.format("%s%d.%s", new Object[] { "wx_photo_edit_", Long.valueOf(System.currentTimeMillis()), paramString });
    AppMethodBeat.o(116368);
    return paramString;
  }

  public static void asR(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(116370);
    ab.i("MicroMsg.MMPhotoEditUtil", "[deleteDirAllFile] dir:%s", new Object[] { paramString });
    paramString = new File(paramString);
    if (paramString.exists())
    {
      paramString = paramString.listFiles();
      if (paramString != null)
      {
        int j = paramString.length;
        while (i < j)
        {
          Object localObject = paramString[i];
          if ((localObject.isFile()) && (!bo.isNullOrNil(localObject.getName())) && (localObject.getName().startsWith("wx_photo_edit_")))
            localObject.delete();
          i++;
        }
      }
    }
    AppMethodBeat.o(116370);
  }

  public static int bu(float paramFloat)
  {
    AppMethodBeat.i(116369);
    int i = (int)(ah.getContext().getResources().getDisplayMetrics().density * paramFloat + 0.5F);
    AppMethodBeat.o(116369);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ch.a
 * JD-Core Version:    0.6.2
 */