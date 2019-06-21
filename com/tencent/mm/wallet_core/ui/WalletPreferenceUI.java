package com.tencent.mm.wallet_core.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

@a(3)
public abstract class WalletPreferenceUI extends MMPreference
  implements f
{
  protected c Ahq = null;
  protected i Ahr = null;
  protected g Ahs = null;

  public final void b(int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    if ((!f(paramInt1, paramInt2, paramString, paramm)) && (paramInt2 != 0))
    {
      paramm = paramString;
      if (bo.isNullOrNil(paramString))
        paramm = getString(2131304763);
      h.a(this, paramm, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(49334);
          WalletPreferenceUI.this.finish();
          AppMethodBeat.o(49334);
        }
      });
    }
  }

  protected void bht()
  {
    xE(this.mController.dyj());
  }

  public final i dOM()
  {
    if (this.Ahr == null)
      this.Ahr = new i(this, this);
    return this.Ahr;
  }

  public abstract boolean f(int paramInt1, int paramInt2, String paramString, m paramm);

  public void onCreate(Bundle paramBundle)
  {
    this.yll = true;
    super.onCreate(paramBundle);
    bht();
    this.Ahr = new i(this, this);
    this.Ahr.nf(385);
    this.Ahr.nf(1518);
    if (getLayoutId() > 0)
      e.dOJ();
  }

  public void onDestroy()
  {
    this.Ahr.ng(385);
    this.Ahr.ng(1518);
    this.Ahr = null;
    super.onDestroy();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletPreferenceUI
 * JD-Core Version:    0.6.2
 */