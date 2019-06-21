package com.tencent.mm.plugin.wallet_ecard;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.cr;
import com.tencent.mm.g.a.cr.a;
import com.tencent.mm.g.a.lt;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.a;
import java.util.HashMap;

public class a
  implements at
{
  private c.a tPu;
  private c<cr> tPv;
  private c<lt> tPw;

  public a()
  {
    AppMethodBeat.i(48045);
    this.tPv = new a.1(this);
    this.tPw = new a.2(this);
    AppMethodBeat.o(48045);
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
    AppMethodBeat.i(48046);
    this.tPv.dnU();
    this.tPw.dnU();
    AppMethodBeat.o(48046);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(48047);
    this.tPv.dead();
    this.tPw.dead();
    AppMethodBeat.o(48047);
  }

  final class a
    implements c.a
  {
    private cr tPC;

    public a(cr arg2)
    {
      Object localObject;
      this.tPC = localObject;
    }

    public final Intent n(int paramInt, Bundle paramBundle)
    {
      AppMethodBeat.i(48044);
      ab.i("MicroMsg.SubCoreECard", "open process end: %s", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt == -1)
      {
        this.tPC.cvN.retCode = 0;
        h.pYm.e(14954, new Object[] { f.dlI(), "openEcard:ok" });
      }
      while (true)
      {
        this.tPC.cvM.callback.run();
        if (!f.dlH())
          f.dlJ();
        a.a(a.this, null);
        Intent localIntent = new Intent();
        localIntent.putExtras(paramBundle);
        AppMethodBeat.o(48044);
        return localIntent;
        this.tPC.cvN.retCode = -1;
        if (!f.dlH())
          h.pYm.e(14954, new Object[] { f.dlI(), "openEcard:fail" });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a
 * JD-Core Version:    0.6.2
 */