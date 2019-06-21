package com.tencent.mm.as;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public class a
  implements at
{
  private static HandlerThread fCS = null;
  private static ak fCT = null;

  public static boolean h(Runnable paramRunnable, long paramLong)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(62297);
    if (paramRunnable == null)
    {
      AppMethodBeat.o(62297);
      return bool2;
    }
    if ((fCT == null) || (fCS == null))
    {
      if (fCT != null)
      {
        bool2 = true;
        label43: if (fCS != null)
          bool1 = true;
        ab.w("MicroMsg.GIF.SubCoreGIF", "check decoder thread available fail, handler[%B] thread[%B] stack[%s]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), bo.dpG() });
        if (fCT != null)
          fCT.removeCallbacksAndMessages(null);
        if (fCS != null)
          fCS.quit();
        HandlerThread localHandlerThread = d.anM("GIF-Decoder");
        fCS = localHandlerThread;
        localHandlerThread.start();
        fCT = new ak(fCS.getLooper());
      }
    }
    else
    {
      if (paramLong <= 0L)
        break label174;
      fCT.postDelayed(paramRunnable, paramLong);
    }
    while (true)
    {
      AppMethodBeat.o(62297);
      bool2 = true;
      break;
      bool2 = false;
      break label43;
      label174: fCT.post(paramRunnable);
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(62298);
    if (fCT != null)
      fCT.removeCallbacksAndMessages(null);
    AppMethodBeat.o(62298);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(62299);
    if (fCT != null)
      fCT.removeCallbacksAndMessages(null);
    AppMethodBeat.o(62299);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.as.a
 * JD-Core Version:    0.6.2
 */