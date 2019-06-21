package com.tencent.mm.plugin.fav.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.le;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.sdk.platformtools.bo;

public final class ao
  implements n.a
{
  private static n mgA = null;
  private static ao mgB = null;
  public int cAO;
  public int duration;
  public String path;

  public static ao bvo()
  {
    AppMethodBeat.i(102749);
    if (mgB == null)
      mgB = new ao();
    ao localao = mgB;
    AppMethodBeat.o(102749);
    return localao;
  }

  public static n bvq()
  {
    return mgA;
  }

  public final void bI(String paramString, int paramInt)
  {
    AppMethodBeat.i(102751);
    ab.d("MicroMsg.WNNoteVoicePlayLogic", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 1);
    if (!bo.bc(paramString, "").equals(this.path))
      localBundle.putBoolean("result", true);
    while (true)
    {
      localBundle.putInt("position", paramInt);
      paramString = new le();
      paramString.cHe.cGZ = localBundle;
      paramString.cHe.type = 4;
      a.xxA.m(paramString);
      AppMethodBeat.o(102751);
      return;
      localBundle.putBoolean("result", false);
    }
  }

  public final void bvp()
  {
    AppMethodBeat.i(102750);
    if (mgA == null)
      mgA = new n();
    mgA.a(this);
    mgA.mfU = true;
    n localn = mgA;
    if (n.mfW == null)
      n.mfW = new SensorController(ah.getContext());
    if (localn.mfS == null)
      localn.mfS = new bf(ah.getContext());
    AppMethodBeat.o(102750);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(102752);
    mgA.stopPlay();
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 2);
    le localle = new le();
    localle.cHe.cGZ = localBundle;
    localle.cHe.type = 4;
    a.xxA.m(localle);
    AppMethodBeat.o(102752);
  }

  public final void onPause()
  {
    AppMethodBeat.i(102753);
    mgA.buJ();
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 3);
    le localle = new le();
    localle.cHe.cGZ = localBundle;
    localle.cHe.type = 4;
    a.xxA.m(localle);
    AppMethodBeat.o(102753);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.ao
 * JD-Core Version:    0.6.2
 */