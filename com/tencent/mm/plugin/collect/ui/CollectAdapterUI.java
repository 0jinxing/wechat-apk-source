package com.tencent.mm.plugin.collect.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class CollectAdapterUI extends WalletBaseUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41167);
    super.onCreate(paramBundle);
    AM(8);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
    ab.i("MicroMsg.CollectAdapterUI", "walletRegion: %s", new Object[] { Integer.valueOf(i) });
    if (i == 8)
      d.b(this, "collect", ".ui.CollectHKMainUI", getIntent());
    while (true)
    {
      finish();
      AppMethodBeat.o(41167);
      return;
      d.b(this, "collect", ".ui.CollectMainUI", getIntent());
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectAdapterUI
 * JD-Core Version:    0.6.2
 */