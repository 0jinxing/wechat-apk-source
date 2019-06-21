package com.tencent.xweb.xwalk.b;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;

public final class d
{
  static a.b a(a.e parame)
  {
    AppMethodBeat.i(85471);
    int j;
    if (parame.ATm != null)
    {
      a.b[] arrayOfb = parame.ATm;
      int i = arrayOfb.length;
      j = 0;
      if (j < i)
      {
        parame = arrayOfb[j];
        if (parame.ATf == XWalkEnvironment.getInstalledNewstVersion())
        {
          XWalkInitializer.addXWalkInitializeLog("got matched patch");
          AppMethodBeat.o(85471);
        }
      }
    }
    while (true)
    {
      return parame;
      j++;
      break;
      XWalkInitializer.addXWalkInitializeLog("no matched patch");
      parame = null;
      AppMethodBeat.o(85471);
    }
  }

  static a.e a(a.a parama)
  {
    AppMethodBeat.i(85470);
    if ((parama == null) || (parama.ATd == null) || (parama.ATd.length == 0))
    {
      AppMethodBeat.o(85470);
      parama = null;
    }
    while (true)
    {
      return parama;
      int i = Build.VERSION.SDK_INT;
      a.e[] arrayOfe = parama.ATd;
      int j = arrayOfe.length;
      i = 0;
      if (i < j)
      {
        parama = arrayOfe[i];
        if (parama == null)
          XWalkInitializer.addXWalkInitializeLog("no matched version  version == null");
        while (true)
        {
          i++;
          break;
          Log.i("VersionMatcher", "try match version = " + parama.ATn);
          if (parama.ATn < 49)
          {
            Log.i("VersionMatcher", " apk is not support, below 49");
          }
          else if (parama.ATn <= XWalkEnvironment.getInstalledNewstVersion())
          {
            Log.i("VersionMatcher", " apk is too old ");
          }
          else
          {
            if (parama.AOK.dUw())
              break label154;
            Log.i("VersionMatcher", " apk filter out ");
          }
        }
        label154: AppMethodBeat.o(85470);
      }
      else
      {
        XWalkInitializer.addXWalkInitializeLog("no matched version");
        AppMethodBeat.o(85470);
        parama = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.b.d
 * JD-Core Version:    0.6.2
 */