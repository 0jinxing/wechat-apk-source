package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

final class ExdeviceProfileUI$27
  implements Runnable
{
  ExdeviceProfileUI$27(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20054);
    a locala = ExdeviceProfileUI.l(this.lCu);
    ArrayList localArrayList = ExdeviceProfileUI.p(this.lCu);
    List localList = ExdeviceProfileUI.q(this.lCu);
    locala.lBu = ad.boY().Kp(locala.igi);
    locala.lBx = localArrayList;
    if (!bo.ek(localArrayList));
    for (locala.lBv = localArrayList.size(); ; locala.lBv = 0)
    {
      locala.lBy = localList;
      if (!bo.ek(localList))
        locala.lBw = localList.size();
      ab.d("MicroMsg.ExdeviceProfileAdapter", "setData,mIsFollower:%s ,mFollowersNum:%s  ,mButtonNum:%s ,mUsername:%s", new Object[] { Boolean.valueOf(locala.lBu), Integer.valueOf(locala.lBv), Integer.valueOf(locala.lBw), locala.igi });
      ExdeviceProfileUI.l(this.lCu).notifyDataSetChanged();
      AppMethodBeat.o(20054);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.27
 * JD-Core Version:    0.6.2
 */