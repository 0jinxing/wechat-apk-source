package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.bb.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

public class ShowQRCodeStep1UI extends MMActivity
  implements f
{
  private ProgressDialog ehJ = null;
  private ImageView qkD = null;
  byte[] qkE = null;
  private int qky = 1;

  final void cit()
  {
    AppMethodBeat.i(126939);
    a locala = new a();
    g.Rg().a(locala, 0);
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    getString(2131297061);
    this.ehJ = h.b(localAppCompatActivity, getString(2131302916), true, new ShowQRCodeStep1UI.5(this, locala));
    AppMethodBeat.o(126939);
  }

  public final int getLayoutId()
  {
    return 2130970679;
  }

  public final void initView()
  {
    AppMethodBeat.i(126938);
    setMMTitle(2131302952);
    this.qkD = ((ImageView)findViewById(2131821047));
    this.qky = getIntent().getIntExtra("show_to", 1);
    TextView localTextView = (TextView)findViewById(2131827561);
    if (this.qky == 3)
      localTextView.setText(getString(2131302921, new Object[] { getString(2131302925) }));
    while (true)
    {
      cit();
      setBackBtn(new ShowQRCodeStep1UI.1(this));
      addIconOptionMenu(0, 2130839555, new ShowQRCodeStep1UI.2(this));
      ((Button)findViewById(2131827562)).setOnClickListener(new ShowQRCodeStep1UI.3(this));
      AppMethodBeat.o(126938);
      return;
      if (this.qky == 4)
        localTextView.setText(getString(2131302921, new Object[] { getString(2131302922) }));
      else if (this.qky == 2)
        localTextView.setText(getString(2131302921, new Object[] { getString(2131302924) }));
      else
        localTextView.setText(getString(2131302921, new Object[] { getString(2131302923) }));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126936);
    super.onCreate(paramBundle);
    initView();
    g.Rg().a(168, this);
    AppMethodBeat.o(126936);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(126937);
    g.Rg().b(168, this);
    super.onDestroy();
    AppMethodBeat.o(126937);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(126940);
    ab.i("MicroMsg.ShowQRCodeStep1UI", "onSceneEnd: errType = %d errCode = %d errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (b.gkF.b(this.mController.ylL, paramInt1, paramInt2, paramString))
      AppMethodBeat.o(126940);
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(this, getString(2131299997, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(126940);
      }
      else
      {
        this.qkE = ((a)paramm).fME;
        this.qkD.setImageBitmap(d.bQ(this.qkE));
        AppMethodBeat.o(126940);
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
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI
 * JD-Core Version:    0.6.2
 */