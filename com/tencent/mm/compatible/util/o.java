package com.tencent.mm.compatible.util;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.bo;

public final class o
{
  public static String kz(String paramString)
  {
    AppMethodBeat.i(93109);
    if (paramString == null)
      AppMethodBeat.o(93109);
    while (true)
    {
      return paramString;
      if (q.etn.erX == 2)
        AppMethodBeat.o(93109);
      else if (q.etn.esi == 1)
        AppMethodBeat.o(93109);
      else if (q.etn.erX == 1)
      {
        if (paramString.toString().contains("\n"))
        {
          paramString = paramString.toString().replace("\n", " ");
          AppMethodBeat.o(93109);
        }
        else
        {
          AppMethodBeat.o(93109);
        }
      }
      else if (Build.VERSION.SDK_INT == 16)
      {
        if (paramString.toString().contains("\n"))
        {
          if (bo.bc(Build.MANUFACTURER, "").toLowerCase().indexOf("meizu".toLowerCase()) >= 0)
          {
            AppMethodBeat.o(93109);
          }
          else
          {
            paramString = paramString.toString().replace("\n", " ");
            AppMethodBeat.o(93109);
          }
        }
        else
          AppMethodBeat.o(93109);
      }
      else
        AppMethodBeat.o(93109);
    }
  }

  public static boolean t(CharSequence paramCharSequence)
  {
    boolean bool = false;
    AppMethodBeat.i(93108);
    if (paramCharSequence == null)
      AppMethodBeat.o(93108);
    while (true)
    {
      return bool;
      if (q.etn.erX == 1)
      {
        AppMethodBeat.o(93108);
        bool = true;
      }
      else if (Build.VERSION.SDK_INT == 16)
      {
        if (bo.bc(Build.MANUFACTURER, "").toLowerCase().indexOf("meizu".toLowerCase()) >= 0)
        {
          AppMethodBeat.o(93108);
        }
        else
        {
          AppMethodBeat.o(93108);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(93108);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.o
 * JD-Core Version:    0.6.2
 */