package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

@com.tencent.mm.ui.base.a(3)
public class IPCallAcitivityUI extends MMActivity
{
  private FrameLayout nAo;
  private TextView nAp;
  private TextView nAq;
  private Button nAr;
  private CdnImageView nAs;
  private boolean nAt = false;
  private com.tencent.mm.plugin.ipcall.a.g.a nAu;

  private void ard()
  {
    AppMethodBeat.i(21992);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xLS, "");
    if (bo.isNullOrNil(str))
    {
      ab.e("MicroMsg.IPCallAcitivityUI", "xml is empty");
      finish();
      AppMethodBeat.o(21992);
    }
    while (true)
    {
      return;
      this.nAu = com.tencent.mm.plugin.ipcall.a.g.a.OO(str);
      if (this.nAu == null)
      {
        ab.e("MicroMsg.IPCallAcitivityUI", "mMsgInfo is null");
        finish();
        AppMethodBeat.o(21992);
      }
      else
      {
        this.nAp.setText(this.nAu.Title);
        this.nAq.setText(this.nAu.Desc);
        this.nAr.setText(this.nAu.nzv);
        this.nAs.setUrl(this.nAu.ImgUrl);
        AppMethodBeat.o(21992);
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(21993);
    super.finish();
    overridePendingTransition(2131034130, 2131034221);
    if (this.nAt)
    {
      com.tencent.mm.plugin.ipcall.a.e.c.xl(1);
      AppMethodBeat.o(21993);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.ipcall.a.e.c.xl(0);
      AppMethodBeat.o(21993);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969892;
  }

  public final void initView()
  {
    AppMethodBeat.i(21991);
    this.nAo = ((FrameLayout)findViewById(2131825113));
    this.nAp = ((TextView)findViewById(2131825115));
    this.nAq = ((TextView)findViewById(2131825117));
    this.nAr = ((Button)findViewById(2131825119));
    this.nAs = ((CdnImageView)findViewById(2131825118));
    ard();
    this.nAo.setOnClickListener(new IPCallAcitivityUI.1(this));
    this.nAr.setOnClickListener(new IPCallAcitivityUI.2(this));
    setBackBtn(new IPCallAcitivityUI.3(this));
    AppMethodBeat.o(21991);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(21994);
    super.onBackPressed();
    AppMethodBeat.o(21994);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21989);
    super.onCreate(paramBundle);
    getWindow().addFlags(131072);
    getWindow().setFlags(1024, 1024);
    this.mController.hideTitleView();
    initView();
    AppMethodBeat.o(21989);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(21990);
    super.onDestroy();
    AppMethodBeat.o(21990);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI
 * JD-Core Version:    0.6.2
 */