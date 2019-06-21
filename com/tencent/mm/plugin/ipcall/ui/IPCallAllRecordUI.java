package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class IPCallAllRecordUI extends MMActivity
{
  private String cMQ;
  private String cOz;
  private ListView nBp;
  private boolean nBq = false;

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969882;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22070);
    super.onCreate(paramBundle);
    this.cMQ = getIntent().getStringExtra("IPCallAllRecordUI_phoneNumber");
    this.cOz = getIntent().getStringExtra("IPCallAllRecordUI_contactId");
    this.nBq = getIntent().getBooleanExtra("IPCallAllRecordUI_isSinglePhoneNumber", false);
    setMMTitle(2131300765);
    setBackBtn(new IPCallAllRecordUI.1(this));
    this.nBp = ((ListView)findViewById(2131825039));
    this.nBp.setAdapter(new IPCallAllRecordUI.a(this, this));
    AppMethodBeat.o(22070);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI
 * JD-Core Version:    0.6.2
 */