package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.g;
import com.tencent.mm.ui.MMActivity;

public class RetransmitPreviewUI extends MMActivity
{
  private TextView sW = null;
  private String text = null;

  public final int getLayoutId()
  {
    return 2130969075;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(35122);
    finish();
    AppMethodBeat.o(35122);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35121);
    super.onCreate(paramBundle);
    setMMTitle("");
    this.text = getIntent().getStringExtra("Retr_Msg_content");
    this.sW = ((TextView)findViewById(2131822635));
    this.sW.setText(g.dqQ().b(this.text, this.sW.getTextSize()));
    setBackBtn(new RetransmitPreviewUI.1(this));
    AppMethodBeat.o(35121);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(35123);
    super.onDestroy();
    AppMethodBeat.o(35123);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.RetransmitPreviewUI
 * JD-Core Version:    0.6.2
 */