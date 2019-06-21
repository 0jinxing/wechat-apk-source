package com.tencent.mm.plugin.webwx.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMBaseActivity;

public class WebWXPopupUnlockUI extends MMBaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26570);
    super.onCreate(paramBundle);
    if (getIntent() != null)
    {
      String str = getIntent().getStringExtra("deviceName");
      if (str != null)
      {
        paramBundle = new Dialog(this);
        paramBundle.requestWindowFeature(1);
        View localView = View.inflate(this, 2130969452, null);
        TextView localTextView = (TextView)localView.findViewById(2131823736);
        ((TextView)localView.findViewById(2131823737)).setOnClickListener(new WebWXPopupUnlockUI.1(this, paramBundle));
        paramBundle.setOnDismissListener(new WebWXPopupUnlockUI.2(this));
        localTextView.setText(str);
        paramBundle.setContentView(localView);
        paramBundle.show();
        AppMethodBeat.o(26570);
      }
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.WebWxPopUnlockUI", "Mac WeChat request to unlock,the deviceName is null");
      AppMethodBeat.o(26570);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXPopupUnlockUI
 * JD-Core Version:    0.6.2
 */