package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText.c;

public class ShareToQQUI extends MMActivity
  implements f
{
  private ProgressDialog ehJ = null;
  private EditText pwu;
  private TextView qkx;
  private int qky;
  private boolean qkz = false;

  public final int getLayoutId()
  {
    return 2130969317;
  }

  public final void initView()
  {
    AppMethodBeat.i(126928);
    setMMTitle(2131302952);
    this.pwu = ((EditText)findViewById(2131821019));
    this.qkx = ((TextView)findViewById(2131823129));
    this.pwu.addTextChangedListener(new MMEditText.c(this.pwu, this.qkx, 280));
    this.qky = getIntent().getIntExtra("show_to", 2);
    if (this.qky == 4)
      this.pwu.setText(2131302926);
    while (true)
    {
      setBackBtn(new ShareToQQUI.1(this));
      addTextOptionMenu(0, getString(2131297047), new ShareToQQUI.2(this));
      AppMethodBeat.o(126928);
      return;
      this.pwu.setText(2131302928);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126926);
    super.onCreate(paramBundle);
    g.Rg().a(26, this);
    initView();
    if (r.Za())
    {
      paramBundle = new c(getString(2131305891));
      paramBundle.arX(bo.nullAsNil((String)g.RP().Ry().get(65830, null)));
      new com.tencent.mm.plugin.account.model.h(paramBundle, new ShareToQQUI.5(this)).apm();
    }
    AppMethodBeat.o(126926);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(126927);
    g.Rg().b(26, this);
    super.onDestroy();
    AppMethodBeat.o(126927);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(126929);
    ab.i("MicroMsg.ShareToQQUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramm.getType() != 26)
      AppMethodBeat.o(126929);
    while (true)
    {
      return;
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if ((paramInt1 == 4) && (paramInt2 == -68))
      {
        paramm = paramString;
        if (bo.isNullOrNil(paramString))
          paramm = "error";
        com.tencent.mm.ui.base.h.a(this, paramm, getString(2131297061), new ShareToQQUI.3(this), null);
        AppMethodBeat.o(126929);
      }
      else if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        aqX();
        paramString = getString(2131303493);
        new ShareToQQUI.4(this);
        com.tencent.mm.ui.base.h.bQ(this, paramString);
        AppMethodBeat.o(126929);
      }
      else
      {
        this.qkz = false;
        if (b.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
        {
          AppMethodBeat.o(126929);
        }
        else
        {
          Toast.makeText(this, getString(2131303492, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          AppMethodBeat.o(126929);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI
 * JD-Core Version:    0.6.2
 */