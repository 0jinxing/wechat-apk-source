package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.wallet_core.c.ae;
import com.tencent.mm.protocal.protobuf.bcj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;

public class WalletDelayTransferSettingUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private long kFU;
  private String mTitle;
  private String pRz;
  private Preference trh;
  private Preference tri;
  private Preference trj;
  private Preference trk;
  private String trl;
  private int trm = 0;

  private boolean Be(int paramInt)
  {
    if ((this.kFU & paramInt) != 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void cOv()
  {
    AppMethodBeat.i(46242);
    if ((this.trm == 1) && (!bo.isNullOrNil(this.pRz)))
    {
      addIconOptionMenu(0, 2130840734, new WalletDelayTransferSettingUI.1(this));
      AppMethodBeat.o(46242);
    }
    while (true)
    {
      return;
      this.mController.removeAllOptionMenu();
      AppMethodBeat.o(46242);
    }
  }

  private void cOw()
  {
    AppMethodBeat.i(46247);
    if (Be(16))
    {
      cOy();
      AppMethodBeat.o(46247);
    }
    while (true)
    {
      return;
      if (Be(32))
      {
        cOz();
        AppMethodBeat.o(46247);
      }
      else
      {
        cOx();
        AppMethodBeat.o(46247);
      }
    }
  }

  private void cOx()
  {
    AppMethodBeat.i(46248);
    this.trh.setWidgetLayoutResource(2130970197);
    this.tri.setWidgetLayoutResource(2130970198);
    this.trj.setWidgetLayoutResource(2130970198);
    AppMethodBeat.o(46248);
  }

  private void cOy()
  {
    AppMethodBeat.i(46249);
    this.trh.setWidgetLayoutResource(2130970198);
    this.tri.setWidgetLayoutResource(2130970197);
    this.trj.setWidgetLayoutResource(2130970198);
    AppMethodBeat.o(46249);
  }

  private void cOz()
  {
    AppMethodBeat.i(46250);
    this.trh.setWidgetLayoutResource(2130970198);
    this.tri.setWidgetLayoutResource(2130970198);
    this.trj.setWidgetLayoutResource(2130970197);
    AppMethodBeat.o(46250);
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(46245);
    paramf = paramPreference.mKey;
    if ("wallet_transfer_realtime".equals(paramf))
    {
      this.kFU &= -17L;
      this.kFU &= -33L;
    }
    while (true)
    {
      cOw();
      g.RQ();
      g.RP().Ry().set(147457, Long.valueOf(this.kFU));
      finish();
      AppMethodBeat.o(46245);
      return true;
      if ("wallet_transfer_2h".equals(paramf))
      {
        this.kFU &= -33L;
        this.kFU |= 16L;
      }
      else if ("wallet_transfer_24h".equals(paramf))
      {
        this.kFU &= -17L;
        this.kFU |= 32L;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(46243);
    this.trh = this.ehK.aqO("wallet_transfer_realtime");
    this.tri = this.ehK.aqO("wallet_transfer_2h");
    this.trj = this.ehK.aqO("wallet_transfer_24h");
    this.trk = this.ehK.aqO("wallet_transfer_title_tips");
    this.trh.NW(8);
    this.tri.NW(8);
    this.trj.NW(8);
    cOw();
    setBackBtn(new WalletDelayTransferSettingUI.2(this));
    AppMethodBeat.o(46243);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46241);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(this.mController.dyj());
    this.ehK = this.yCw;
    this.ehK.addPreferencesFromResource(2131165311);
    g.RQ();
    this.kFU = ((Long)g.RP().Ry().get(147457, Long.valueOf(0L))).longValue();
    initView();
    g.RQ();
    g.RO().eJo.a(385, this);
    g.RQ();
    this.trl = ((String)g.RP().Ry().get(ac.a.xPN, ""));
    g.RQ();
    this.mTitle = ((String)g.RP().Ry().get(ac.a.xPM, ""));
    g.RQ();
    this.pRz = ((String)g.RP().Ry().get(ac.a.xPP, ""));
    g.RQ();
    this.trm = ((Integer)g.RP().Ry().get(ac.a.xPQ, Integer.valueOf(0))).intValue();
    if ((bo.isNullOrNil(this.trl)) || (bo.isNullOrNil(this.mTitle)) || (bo.isNullOrNil(this.pRz)));
    for (boolean bool = ae.a(true, null); ; bool = ae.a(false, null))
    {
      com.tencent.mm.wallet_core.ui.e.dOJ();
      if (!bool)
      {
        ab.i("MicroMsg.WalletDelayTransferSettingUI", "no need do scene, remove listener");
        g.RQ();
        g.RO().eJo.b(385, this);
      }
      AppMethodBeat.o(46241);
      return;
      this.trk.setTitle(this.trl);
      setMMTitle(this.mTitle);
      cOv();
    }
  }

  public void onDestroy()
  {
    int i = 1;
    AppMethodBeat.i(46244);
    super.onDestroy();
    ab.i("MicroMsg.WalletDelayTransferSettingUI", "do oplog, %s", new Object[] { Long.valueOf(this.kFU) });
    if (Be(16));
    while (true)
    {
      bcj localbcj = new bcj();
      localbcj.pXD = i;
      ((j)g.K(j.class)).XL().c(new j.a(205, localbcj));
      g.RQ();
      g.RO().eJo.b(385, this);
      AppMethodBeat.o(46244);
      return;
      if (Be(32))
        i = 2;
      else
        i = 0;
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46246);
    if ((paramm instanceof ae))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.trl = ((ae)paramm).tuC;
        this.mTitle = ((ae)paramm).tuB;
        this.pRz = ((ae)paramm).tuE;
        this.trm = ((ae)paramm).tuF;
        if (!bo.isNullOrNil(this.trl))
        {
          this.trk.setTitle(this.trl);
          if (bo.isNullOrNil(this.mTitle))
            break label151;
          setMMTitle(this.mTitle);
          label109: cOv();
          label113: this.ehK.notifyDataSetChanged();
          AppMethodBeat.o(46246);
        }
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode wording");
      this.trk.setTitle(2131304774);
      break;
      label151: ab.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode title wording");
      setMMTitle(2131305102);
      break label109;
      ab.i("MicroMsg.WalletDelayTransferSettingUI", "net error, use hardcode wording");
      this.trk.setTitle(2131304774);
      setMMTitle(2131305102);
      break label113;
      ab.i("MicroMsg.WalletDelayTransferSettingUI", "other scene");
      AppMethodBeat.o(46246);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI
 * JD-Core Version:    0.6.2
 */