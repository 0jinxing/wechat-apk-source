package com.tencent.mm.plugin.account.bind.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ag;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;
import java.util.List;

final class FindMContactIntroUI$11
  implements al.a
{
  FindMContactIntroUI$11(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(13608);
    try
    {
      FindMContactIntroUI.a(this.gsU, a.cJ(this.gsU));
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("tigerreg mobileList size ");
      if (FindMContactIntroUI.k(this.gsU) == null);
      for (int i = 0; ; i = FindMContactIntroUI.k(this.gsU).size())
      {
        ab.d("MicroMsg.FindMContactIntroUI", i);
        AppMethodBeat.o(13608);
        return true;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.FindMContactIntroUI", localException, "", new Object[0]);
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(13607);
    if ((FindMContactIntroUI.k(this.gsU) != null) && (FindMContactIntroUI.k(this.gsU).size() != 0))
    {
      FindMContactIntroUI.a(this.gsU, new ag(FindMContactIntroUI.c(this.gsU), FindMContactIntroUI.k(this.gsU)));
      g.Rg().a(FindMContactIntroUI.l(this.gsU), 0);
    }
    while (true)
    {
      AppMethodBeat.o(13607);
      return false;
      if (FindMContactIntroUI.g(this.gsU) != null)
      {
        FindMContactIntroUI.g(this.gsU).dismiss();
        FindMContactIntroUI.h(this.gsU);
      }
      FindMContactIntroUI.b(this.gsU);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(13609);
    String str = super.toString() + "|doUpload";
    AppMethodBeat.o(13609);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI.11
 * JD-Core Version:    0.6.2
 */