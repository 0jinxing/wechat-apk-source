package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText.c;

public class ShareToQQWeiboUI extends MMActivity
  implements f
{
  private ProgressDialog ehJ = null;
  private EditText pwu;
  private TextView qkx;

  public final int getLayoutId()
  {
    return 2130969316;
  }

  public final void initView()
  {
    AppMethodBeat.i(9845);
    setMMTitle(2131303498);
    this.pwu = ((EditText)findViewById(2131821019));
    this.qkx = ((TextView)findViewById(2131823129));
    String str1 = getIntent().getStringExtra("content");
    String str2 = getIntent().getStringExtra("shortUrl");
    this.pwu.addTextChangedListener(new MMEditText.c(this.pwu, this.qkx, 280));
    if (str1.contains(str2))
      this.pwu.setText(str1.trim());
    while (true)
    {
      setBackBtn(new ShareToQQWeiboUI.1(this));
      addTextOptionMenu(0, getString(2131297047), new ShareToQQWeiboUI.2(this));
      AppMethodBeat.o(9845);
      return;
      this.pwu.setText(str1 + " " + str2);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(9843);
    super.onCreate(paramBundle);
    g.Rg().a(26, this);
    initView();
    AppMethodBeat.o(9843);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(9844);
    g.Rg().b(26, this);
    super.onDestroy();
    AppMethodBeat.o(9844);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(9846);
    ab.i("MicroMsg.ShareToQQWeiboUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramm.getType() != 26)
      AppMethodBeat.o(9846);
    while (true)
    {
      return;
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        aqX();
        setResult(-1);
        finish();
        AppMethodBeat.o(9846);
      }
      else
      {
        setResult(1, new Intent().putExtra("err_code", paramInt2));
        Toast.makeText(this, getString(2131303492, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(9846);
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
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI
 * JD-Core Version:    0.6.2
 */