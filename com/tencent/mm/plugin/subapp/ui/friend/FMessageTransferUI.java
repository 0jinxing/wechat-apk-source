package com.tencent.mm.plugin.subapp.ui.friend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.model.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class FMessageTransferUI extends MMActivity
{
  private int cfR;

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25374);
    super.onCreate(paramBundle);
    String str1 = getIntent().getStringExtra("friend_message_transfer_username");
    if (bo.isNullOrNil(str1))
      finish();
    d.akP().apt(str1);
    d.akP().dte();
    String str2 = getIntent().getAction();
    paramBundle = "friend_message_accept_".concat(String.valueOf(str1));
    this.cfR = (0x7F000000 | 0x7FFFFFFF & str1.hashCode());
    com.tencent.mm.model.aw.getNotification().cancel(this.cfR);
    if (paramBundle.equals(str2))
      a.h(this.mController.ylL, str1, true);
    finish();
    AppMethodBeat.o(25374);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.FMessageTransferUI
 * JD-Core Version:    0.6.2
 */