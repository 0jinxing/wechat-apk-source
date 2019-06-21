package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.List;

@a(19)
public class WalletSelectBankcardUI extends WalletBaseUI
{
  private int gOW = 0;
  private TextView kEs;
  private WalletSelectBankcardUI.a tKA = null;
  private String tKB = null;
  private boolean tKC = true;
  private String tKD = null;
  private List<Bankcard> tKE = null;
  private TextView tKy;
  private MaxListView tKz;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final boolean cNR()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130971167;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47659);
    super.onCreate(paramBundle);
    setMMTitle(2131304581);
    this.gOW = this.mBundle.getInt("key_scene", 0);
    this.tKB = this.mBundle.getString("key_top_tips");
    this.tKC = this.mBundle.getBoolean("key_is_show_new_bankcard", true);
    this.tKD = this.mBundle.getString("bottom_tips");
    this.tKE = this.mBundle.getParcelableArrayList("key_showing_bankcards");
    if (this.tKE == null)
      this.tKE = r.cPI().cQB();
    this.tKy = ((TextView)findViewById(2131829056));
    this.tKz = ((MaxListView)findViewById(2131829057));
    this.kEs = ((TextView)findViewById(2131829058));
    if (!bo.isNullOrNil(this.tKB))
    {
      this.tKy.setVisibility(0);
      this.tKy.setText(this.tKB);
      if (bo.isNullOrNil(this.tKD))
        break label342;
      this.kEs.setVisibility(0);
      this.kEs.setText(this.tKD);
    }
    while (true)
    {
      if (this.gOW == 0)
      {
        this.kEs.setVisibility(0);
        j localj = new j(this);
        localj.tHw = new WalletSelectBankcardUI.1(this);
        paramBundle = getString(2131305336);
        SpannableString localSpannableString = new SpannableString(paramBundle);
        localSpannableString.setSpan(localj, paramBundle.length() - 14, paramBundle.length(), 33);
        this.kEs.setText(localSpannableString);
        this.kEs.setMovementMethod(LinkMovementMethod.getInstance());
      }
      this.tKA = new WalletSelectBankcardUI.a(this, (byte)0);
      this.tKz.setAdapter(this.tKA);
      this.tKz.setOnItemClickListener(new WalletSelectBankcardUI.2(this));
      AppMethodBeat.o(47659);
      return;
      this.tKy.setVisibility(8);
      break;
      label342: this.kEs.setVisibility(8);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI
 * JD-Core Version:    0.6.2
 */