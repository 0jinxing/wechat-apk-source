package com.tencent.mm.plugin.fingerprint.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class FingerPrintEntranceUI extends WalletBaseUI
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
    int i = 1;
    AppMethodBeat.i(41659);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.FingerPrintEntranceUI", "onCreate");
    int j;
    if (e.bxJ())
    {
      ab.i("MicroMsg.FingerPrintEntranceUI", "will call showSetFingerPrintGuide()");
      ab.i("MicroMsg.FingerPrintEntranceUI", "hy: has standard action starting to fingerprint setting");
      paramBundle = getResources().getString(2131303966);
      Resources localResources = getResources();
      if (((l)g.K(l.class)).bxr())
      {
        j = 2131297760;
        h.a(this, paramBundle, "", localResources.getString(j), getString(2131296868), true, new FingerPrintEntranceUI.1(this), new FingerPrintEntranceUI.2(this));
        e.bxF();
        j = i;
      }
    }
    while (true)
    {
      if (j == 0)
      {
        ab.e("MicroMsg.FingerPrintEntranceUI", "finish FingerPrintEntranceUI");
        finish();
      }
      AppMethodBeat.o(41659);
      return;
      j = 2131296994;
      break;
      if (!e.bxE())
      {
        ab.i("MicroMsg.FingerPrintEntranceUI", "will showOpenFingerPrintPayGuide()");
        h.a(this, getResources().getString(2131303965), "", getResources().getString(2131297758), getString(2131296868), true, new FingerPrintEntranceUI.3(this), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(41658);
            FingerPrintEntranceUI.this.finish();
            AppMethodBeat.o(41658);
          }
        });
        e.bxD();
        j = i;
      }
      else
      {
        j = 0;
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(41660);
    super.onResume();
    AppMethodBeat.o(41660);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI
 * JD-Core Version:    0.6.2
 */