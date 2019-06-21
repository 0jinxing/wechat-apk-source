package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public class SelectNoSupportUI extends MMActivity
{
  private String zKq = "friend";
  private TextView zKr;
  private TextView zKs;

  public final int getLayoutId()
  {
    return 2130970218;
  }

  public final void initView()
  {
    AppMethodBeat.i(35210);
    setMMTitle(getString(2131302893));
    this.zKr = ((TextView)findViewById(2131826098));
    this.zKs = ((TextView)findViewById(2131826099));
    this.zKr.setText(getString(2131302903));
    String str = this.zKq;
    int i = -1;
    switch (str.hashCode())
    {
    default:
      switch (i)
      {
      default:
      case 0:
      case 1:
      }
      break;
    case -1266283874:
    case 114040:
    }
    while (true)
    {
      setBackBtn(new SelectNoSupportUI.1(this));
      AppMethodBeat.o(35210);
      return;
      if (!str.equals("friend"))
        break;
      i = 0;
      break;
      if (!str.equals("sns"))
        break;
      i = 1;
      break;
      this.zKs.setText(getString(2131302904));
      continue;
      this.zKs.setText(getString(2131302905));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35209);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.SelectNoSupportUI", "onCreate!");
    this.zKq = getIntent().getStringExtra("sharePictureTo");
    ab.i("MicroMsg.SelectNoSupportUI", "initData done!");
    initView();
    ab.i("MicroMsg.SelectNoSupportUI", "initView done!");
    AppMethodBeat.o(35209);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectNoSupportUI
 * JD-Core Version:    0.6.2
 */