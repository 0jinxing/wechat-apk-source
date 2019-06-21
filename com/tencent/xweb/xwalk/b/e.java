package com.tencent.xweb.xwalk.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkInitializer.XWalkInitListener;
import org.xwalk.core.XWalkUpdater;
import org.xwalk.core.XWalkUpdater.XWalkBackgroundUpdateListener;

public final class e
  implements XWalkInitializer.XWalkInitListener, XWalkUpdater.XWalkBackgroundUpdateListener
{
  private static boolean ATA = false;
  private static e ATB;
  public static boolean ATz = true;
  XWalkInitializer ASE;
  XWalkUpdater ASF;
  Context mContext;

  private e(Context paramContext)
  {
    AppMethodBeat.i(85472);
    this.mContext = paramContext;
    this.ASE = new XWalkInitializer(this, paramContext);
    this.ASF = new XWalkUpdater(this, paramContext);
    AppMethodBeat.o(85472);
  }

  public static boolean isXWalkReady()
  {
    AppMethodBeat.i(85477);
    boolean bool;
    if ((!ATA) || (ATB == null))
    {
      bool = false;
      AppMethodBeat.o(85477);
    }
    while (true)
    {
      return bool;
      bool = ATB.ASE.isXWalkReady();
      AppMethodBeat.o(85477);
    }
  }

  public static boolean jF(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(85478);
    if (ATA)
    {
      bool = ATA;
      AppMethodBeat.o(85478);
    }
    while (true)
    {
      return bool;
      ATA = true;
      ATB = new e(paramContext);
      XWalkEnvironment.init(paramContext);
      if (XWalkEnvironment.isDownloadMode())
      {
        e locale = ATB;
        if (!ATz)
        {
          paramContext = new HashMap();
          paramContext.put("UpdaterCheckType", "0");
          new f(locale.ASF, paramContext).execute(new String[0]);
        }
        if (locale.ASE.tryInitSync())
        {
          XWalkInitializer.addXWalkInitializeLog("initSync Sucsess");
          AppMethodBeat.o(85478);
        }
        else
        {
          AppMethodBeat.o(85478);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(85478);
        bool = false;
      }
    }
  }

  public final void onXWalkInitCancelled()
  {
  }

  public final void onXWalkInitCompleted()
  {
  }

  public final void onXWalkInitFailed()
  {
  }

  public final void onXWalkInitStarted()
  {
  }

  public final void onXWalkUpdateCancelled()
  {
    AppMethodBeat.i(85474);
    f.dWh();
    AppMethodBeat.o(85474);
  }

  public final void onXWalkUpdateCompleted()
  {
    AppMethodBeat.i(85476);
    f.dWi();
    AppMethodBeat.o(85476);
  }

  public final void onXWalkUpdateFailed(int paramInt)
  {
    AppMethodBeat.i(85475);
    f.SF(paramInt);
    AppMethodBeat.o(85475);
  }

  public final void onXWalkUpdateProgress(int paramInt)
  {
  }

  public final void onXWalkUpdateStarted()
  {
    AppMethodBeat.i(85473);
    f.dWg();
    AppMethodBeat.o(85473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.b.e
 * JD-Core Version:    0.6.2
 */