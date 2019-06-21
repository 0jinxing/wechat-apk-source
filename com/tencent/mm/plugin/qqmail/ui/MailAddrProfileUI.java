package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class MailAddrProfileUI extends MMPreference
{
  private f ehK;
  private String nJq;
  private String name;
  private boolean pyw;

  public final int JC()
  {
    return 2131165247;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(68336);
    if (paramPreference.mKey.equals("mail_compose_btn"))
    {
      paramf = new Intent(this, ComposeUI.class);
      paramf.putExtra("composeType", 4);
      paramf.putExtra("toList", new String[] { this.name + " " + this.nJq });
      startActivity(paramf);
      finish();
    }
    AppMethodBeat.o(68336);
    return false;
  }

  public final void initView()
  {
    AppMethodBeat.i(68335);
    setMMTitle(2131300639);
    this.ehK = this.yCw;
    ((KeyValuePreference)this.ehK.aqO("mail_receiver_info_name")).setSummary(this.name);
    ((KeyValuePreference)this.ehK.aqO("mail_receiver_info_addr")).setSummary(getIntent().getStringExtra("addr"));
    Preference localPreference = this.ehK.aqO("mail_compose_btn");
    if (!this.pyw)
      this.ehK.d(localPreference);
    setBackBtn(new MailAddrProfileUI.1(this));
    AppMethodBeat.o(68335);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(68334);
    super.onCreate(paramBundle);
    this.name = getIntent().getStringExtra("name");
    this.nJq = getIntent().getStringExtra("addr");
    this.pyw = getIntent().getBooleanExtra("can_compose", false);
    initView();
    AppMethodBeat.o(68334);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrProfileUI
 * JD-Core Version:    0.6.2
 */