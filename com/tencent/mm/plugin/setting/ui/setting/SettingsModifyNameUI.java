package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.tools.b.c.a;
import com.tencent.mm.ui.widget.MMEditText;

public class SettingsModifyNameUI extends MMActivity
  implements c.a
{
  private p eir;
  private MMEditText ejH;
  private com.tencent.mm.sdk.b.c ekk;
  private j.b qkI;
  private boolean qkK;

  public SettingsModifyNameUI()
  {
    AppMethodBeat.i(127310);
    this.qkK = false;
    this.eir = null;
    this.ekk = new SettingsModifyNameUI.1(this);
    AppMethodBeat.o(127310);
  }

  public final void JW()
  {
    AppMethodBeat.i(127315);
    h.g(this, 2131303149, 2131303152);
    AppMethodBeat.o(127315);
  }

  public final void JX()
  {
    AppMethodBeat.i(127316);
    h.g(this, 2131303150, 2131303152);
    AppMethodBeat.o(127316);
  }

  public final int getLayoutId()
  {
    return 2130970637;
  }

  public final void initView()
  {
    AppMethodBeat.i(127313);
    setMMTitle(2131303148);
    this.ejH = ((MMEditText)findViewById(2131827399));
    this.ejH.setText(j.b(this, (String)g.RP().Ry().get(4, null), this.ejH.getTextSize()));
    this.ejH.setSelection(this.ejH.getText().length());
    this.ejH.addTextChangedListener(new SettingsModifyNameUI.2(this));
    com.tencent.mm.ui.tools.b.c localc = com.tencent.mm.ui.tools.b.c.d(this.ejH).hz(1, 32);
    localc.zIx = false;
    localc.a(null);
    a(0, getString(2131297038), new SettingsModifyNameUI.3(this), q.b.ymu);
    enableOptionMenu(false);
    setBackBtn(new SettingsModifyNameUI.4(this));
    AppMethodBeat.o(127313);
  }

  public final void ki(String paramString)
  {
    AppMethodBeat.i(127314);
    ab.i("MiroMsg.SettingsModifyNameUI", "Set New NickName : ".concat(String.valueOf(paramString)));
    this.qkK = true;
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    getString(2131297061);
    this.eir = h.b(localAppCompatActivity, getString(2131298487), false, null);
    this.qkI = r.r(2, paramString);
    AppMethodBeat.o(127314);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127311);
    super.onCreate(paramBundle);
    a.xxA.c(this.ekk);
    initView();
    AppMethodBeat.o(127311);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127312);
    a.xxA.d(this.ekk);
    super.onDestroy();
    AppMethodBeat.o(127312);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI
 * JD-Core Version:    0.6.2
 */