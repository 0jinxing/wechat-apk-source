package com.tencent.mm.plugin.account.security.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.account.security.a.d;
import com.tencent.mm.plugin.account.security.a.e;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMEditText.c;

public class ModSafeDeviceNameUI extends MMActivity
  implements f
{
  private long createTime;
  private String cws;
  private ProgressDialog ehJ = null;
  private EditText gzq;
  private String gzr;
  private String gzs;
  private String gzt;

  public final int getLayoutId()
  {
    return 2130970243;
  }

  public final void initView()
  {
    AppMethodBeat.i(69870);
    this.gzr = getIntent().getStringExtra("safe_device_name");
    this.gzt = getIntent().getStringExtra("safe_device_uid");
    this.cws = getIntent().getStringExtra("safe_device_type");
    setMMTitle(com.tencent.mm.bz.a.an(this, 2131302687));
    setBackBtn(new ModSafeDeviceNameUI.1(this));
    addTextOptionMenu(0, getString(2131297038), new ModSafeDeviceNameUI.2(this));
    ModSafeDeviceNameUI.3 local3 = new ModSafeDeviceNameUI.3(this);
    this.gzq = ((EditText)findViewById(2131826142));
    MMEditText.c localc = new MMEditText.c(this.gzq, null, 32);
    localc.zMo = local3;
    this.gzq.addTextChangedListener(localc);
    if (!bo.isNullOrNil(this.gzr))
    {
      this.gzq.setText(this.gzr);
      AppMethodBeat.o(69870);
    }
    while (true)
    {
      return;
      enableOptionMenu(false);
      AppMethodBeat.o(69870);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(69867);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(69867);
  }

  public void onPause()
  {
    AppMethodBeat.i(69869);
    com.tencent.mm.kernel.g.Rg().b(361, this);
    super.onPause();
    AppMethodBeat.o(69869);
  }

  public void onResume()
  {
    AppMethodBeat.i(69868);
    com.tencent.mm.kernel.g.Rg().a(361, this);
    super.onResume();
    AppMethodBeat.o(69868);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(69871);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = new d();
      paramString.field_devicetype = this.cws;
      paramString.field_name = this.gzs;
      paramString.field_uid = this.gzt;
      paramString.field_createtime = this.createTime;
      com.tencent.mm.plugin.account.security.a.g.aqG().c(paramString, new String[0]);
      h.bQ(this, com.tencent.mm.bz.a.an(this, 2131302691));
      new ak().postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(69866);
          ModSafeDeviceNameUI.this.finish();
          AppMethodBeat.o(69866);
        }
      }
      , 1000L);
      AppMethodBeat.o(69871);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
        AppMethodBeat.o(69871);
      else
        AppMethodBeat.o(69871);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.ModSafeDeviceNameUI
 * JD-Core Version:    0.6.2
 */