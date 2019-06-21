package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;

public class WalletSelectProfessionUI extends MMPreference
{
  private f ehK;
  private Profession[] tur = null;

  public final int JC()
  {
    return -1;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(47663);
    if (paramPreference.mKey.startsWith("index_"))
    {
      paramf = paramPreference.mKey.split("_");
      if (paramf.length != 2)
        break label81;
      int i = bo.getInt(paramf[1], 0);
      paramf = this.tur[i];
      paramPreference = new Intent();
      paramPreference.putExtra("key_select_profession", paramf);
      setResult(-1, paramPreference);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(47663);
      return true;
      label81: ab.w("MicroMsg.WalletSelectProfessionUI", "error key: %s, %s", new Object[] { paramPreference.mKey, paramPreference.getTitle() });
      setResult(0);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47662);
    super.onCreate(paramBundle);
    setMMTitle(2131305350);
    this.ehK = this.yCw;
    paramBundle = new PreferenceTitleCategory(this.mController.ylL);
    paramBundle.setTitle(getString(2131305349));
    paramBundle.setKey("title_category");
    this.ehK.b(paramBundle);
    paramBundle = getIntent().getParcelableArrayExtra("key_profession_list");
    int i;
    if ((paramBundle != null) && (paramBundle.length > 0))
    {
      this.tur = new Profession[paramBundle.length];
      for (i = 0; i < this.tur.length; i++)
        this.tur[i] = ((Profession)paramBundle[i]);
    }
    if (this.tur != null)
    {
      paramBundle = this.tur;
      int j = paramBundle.length;
      int k = 0;
      i = 0;
      while (k < j)
      {
        Object localObject = paramBundle[k];
        if ((localObject != null) && (!bo.isNullOrNil(localObject.tvN)))
        {
          Preference localPreference = new Preference(this.mController.ylL);
          localPreference.setTitle(localObject.tvN);
          localPreference.setKey("index_".concat(String.valueOf(i)));
          this.ehK.b(localPreference);
        }
        i++;
        k++;
      }
    }
    setBackBtn(new WalletSelectProfessionUI.1(this));
    AppMethodBeat.o(47662);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI
 * JD-Core Version:    0.6.2
 */