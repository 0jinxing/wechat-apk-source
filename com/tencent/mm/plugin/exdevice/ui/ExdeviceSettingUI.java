package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.exdevice.f.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;

public class ExdeviceSettingUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  int bJt = -1;
  private final String lDL = "notify_rank";
  private final String lDM = "notify_like";
  private final String lDN = "join_rank";
  boolean lDO;
  private ProgressDialog lDP;
  private CheckBoxPreference lDQ;
  private CheckBoxPreference lDR;
  private CheckBoxPreference lDS;
  private boolean lDT;

  private void bqc()
  {
    boolean bool1 = true;
    AppMethodBeat.i(20220);
    CheckBoxPreference localCheckBoxPreference = this.lDQ;
    if ((this.bJt & 0x1) == 1)
    {
      bool2 = true;
      localCheckBoxPreference.uOT = bool2;
      localCheckBoxPreference = this.lDR;
      if ((this.bJt & 0x2) != 2)
        break label97;
      bool2 = true;
      label47: localCheckBoxPreference.uOT = bool2;
      localCheckBoxPreference = this.lDS;
      if ((this.bJt & 0x8) != 8)
        break label102;
    }
    label97: label102: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localCheckBoxPreference.uOT = bool2;
      this.yCw.notifyDataSetChanged();
      AppMethodBeat.o(20220);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label47;
    }
  }

  public final int JC()
  {
    return 2131165235;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(20222);
    ab.d("MicroMsg.ExdeviceSettingUI", "onPreferenceTreeClick, key is %s.", new Object[] { paramPreference.mKey });
    if (paramPreference.mKey.equals("black_contact_list"))
      com.tencent.mm.bp.d.H(this, "sport", ".ui.SportBlackListUI");
    while (true)
    {
      AppMethodBeat.o(20222);
      return false;
      this.lDT = true;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20218);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.sport.a.d.kT(38);
    aw.Rg().a(1044, this);
    this.lDQ = ((CheckBoxPreference)this.yCw.aqO("notify_rank"));
    this.lDR = ((CheckBoxPreference)this.yCw.aqO("notify_like"));
    this.lDS = ((CheckBoxPreference)this.yCw.aqO("join_rank"));
    aw.ZK();
    paramBundle = (Integer)c.Ry().get(397310, Integer.valueOf(0));
    ab.d("MicroMsg.ExdeviceSettingUI", "hy: setting flag: %d", new Object[] { paramBundle });
    if ((paramBundle == null) || (paramBundle.intValue() == 0))
    {
      this.lDO = false;
      this.lDQ.uOT = true;
      this.lDR.uOT = true;
      this.lDS.uOT = true;
      this.yCw.notifyDataSetChanged();
      this.lDP = com.tencent.mm.ui.base.p.show(this, "", "", true, false);
    }
    while (true)
    {
      aw.Rg().a(new n(2, 0), 0);
      setMMTitle(2131302263);
      setBackBtn(new ExdeviceSettingUI.1(this));
      AppMethodBeat.o(20218);
      return;
      this.lDO = true;
      this.bJt = paramBundle.intValue();
      bqc();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(20219);
    super.onDestroy();
    aw.Rg().b(1044, this);
    if ((this.lDP != null) && (this.lDP.isShowing()))
      this.lDP.dismiss();
    if (this.lDO)
    {
      if (!this.lDQ.isChecked())
        break label179;
      this.bJt |= 1;
      if (!this.lDR.isChecked())
        break label193;
      this.bJt |= 2;
      label91: if (!this.lDS.isChecked())
        break label207;
    }
    label179: label193: label207: for (this.bJt |= 8; ; this.bJt &= -9)
    {
      aw.ZK();
      c.Ry().set(397310, Integer.valueOf(this.bJt));
      ab.d("MicroMsg.ExdeviceSettingUI", "hy: doscene setting flag to %d", new Object[] { Integer.valueOf(this.bJt) });
      aw.Rg().a(new n(1, this.bJt), 0);
      AppMethodBeat.o(20219);
      return;
      this.bJt &= -2;
      break;
      this.bJt &= -3;
      break label91;
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(20221);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.d("MicroMsg.ExdeviceSettingUI", "hy: scene end ok");
      paramString = (n)paramm;
      if (paramString.opType != 2)
      {
        ab.i("MicroMsg.ExdeviceSettingUI", "It isn't a GET_FLAG opType(%d).", new Object[] { Integer.valueOf(paramString.opType) });
        AppMethodBeat.o(20221);
      }
    }
    while (true)
    {
      return;
      if ((this.lDP != null) && (this.lDP.isShowing()))
        runOnUiThread(new ExdeviceSettingUI.2(this));
      this.lDO = true;
      if (this.bJt == paramString.lwd)
      {
        ab.i("MicroMsg.ExdeviceSettingUI", "flag has not changed.(%s)", new Object[] { Integer.valueOf(this.bJt) });
        AppMethodBeat.o(20221);
      }
      else
      {
        this.bJt = paramString.lwd;
        ab.d("MicroMsg.ExdeviceSettingUI", "hy: onSceneEnd setting flag to %d", new Object[] { Integer.valueOf(this.bJt) });
        aw.ZK();
        c.Ry().set(397310, Integer.valueOf(this.bJt));
        if (!this.lDT)
          bqc();
        AppMethodBeat.o(20221);
        continue;
        if ((this.lDP != null) && (this.lDP.isShowing()))
          runOnUiThread(new ExdeviceSettingUI.3(this));
        Toast.makeText(this, "scene error", 0).show();
        finish();
        AppMethodBeat.o(20221);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceSettingUI
 * JD-Core Version:    0.6.2
 */