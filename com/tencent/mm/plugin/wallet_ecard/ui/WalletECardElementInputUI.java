package com.tencent.mm.plugin.wallet_ecard.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class WalletECardElementInputUI extends WalletECardBaseUI
{
  private Button gEZ;
  private WalletFormView tFS;
  private ElementQuery tvu;

  private void cu()
  {
    AppMethodBeat.i(48142);
    if (this.tvu == null)
      this.tvu = new ElementQuery();
    if (bo.isNullOrNil(this.tvu.nuL))
    {
      this.tFS.setText("");
      AppMethodBeat.o(48142);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.tvu.tyF))
      {
        this.tFS.setText(this.tvu.nuL + " " + this.tvu.tyF);
        AppMethodBeat.o(48142);
      }
      else if (2 == this.tvu.tyE)
      {
        this.tFS.setText(this.tvu.nuL + " " + getString(2131304760));
        AppMethodBeat.o(48142);
      }
      else
      {
        this.tFS.setText(this.tvu.nuL + " " + getString(2131304780));
        AppMethodBeat.o(48142);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130969310;
  }

  public final void initView()
  {
    AppMethodBeat.i(48141);
    this.tFS = ((WalletFormView)findViewById(2131823369));
    this.tFS.setOnClickListener(new WalletECardElementInputUI.1(this));
    this.gEZ = ((Button)findViewById(2131822846));
    this.gEZ.setOnClickListener(new WalletECardElementInputUI.2(this));
    AppMethodBeat.o(48141);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48143);
    ab.i("MicroMsg.WalletECardElementInputUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
      AppMethodBeat.o(48143);
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        AppMethodBeat.o(48143);
        break;
      case 1:
        this.tvu = ((ElementQuery)paramIntent.getParcelableExtra("elemt_query"));
        cu();
        AppMethodBeat.o(48143);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48140);
    super.onCreate(paramBundle);
    setMMTitle(2131298979);
    initView();
    cu();
    AppMethodBeat.o(48140);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI
 * JD-Core Version:    0.6.2
 */