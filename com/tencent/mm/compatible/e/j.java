package com.tencent.mm.compatible.e;

import android.os.Build;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class j
  implements d.a
{
  public static d.a.a b(Looper paramLooper)
  {
    Object localObject = null;
    AppMethodBeat.i(92932);
    d.a.a locala = new d.a.a();
    try
    {
      locala.erH = u.c(paramLooper);
      locala.rotate = 0;
      if (locala.erH == null)
      {
        AppMethodBeat.o(92932);
        paramLooper = localObject;
        return paramLooper;
      }
    }
    catch (Exception paramLooper)
    {
      while (true)
      {
        AppMethodBeat.o(92932);
        paramLooper = localObject;
      }
    }
    if (Build.DISPLAY.startsWith("Flyme"))
    {
      locala.rotate = 90;
      locala.erH.setDisplayOrientation(90);
    }
    label184: 
    while (true)
    {
      AppMethodBeat.o(92932);
      paramLooper = locala;
      break;
      int i;
      if (!Build.MODEL.equals("M9"))
        i = -1;
      while (true)
      {
        if (i < 7093)
          break label184;
        locala.rotate = 90;
        locala.erH.setDisplayOrientation(180);
        break;
        paramLooper = Build.DISPLAY;
        if (paramLooper.substring(0, 0).equals("1"))
        {
          i = -1;
        }
        else
        {
          paramLooper = paramLooper.split("-");
          if ((paramLooper == null) || (paramLooper.length < 2))
            i = -1;
          else
            i = bo.getInt(paramLooper[1], 0);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.j
 * JD-Core Version:    0.6.2
 */