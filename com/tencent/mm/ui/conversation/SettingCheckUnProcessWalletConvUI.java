package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

public class SettingCheckUnProcessWalletConvUI extends MMActivity
{
  private ListView gGW;
  private int[] mtm;
  private List<String> zvH;
  private SettingCheckUnProcessWalletConvUI.a zvI;

  public SettingCheckUnProcessWalletConvUI()
  {
    AppMethodBeat.i(34626);
    this.mtm = new int[2];
    AppMethodBeat.o(34626);
  }

  public final int getLayoutId()
  {
    return 2130970622;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34627);
    super.onCreate(paramBundle);
    setMMTitle(2131304755);
    setBackBtn(new SettingCheckUnProcessWalletConvUI.1(this));
    this.gGW = ((ListView)findViewById(2131827368));
    this.zvH = getIntent().getStringArrayListExtra("key_conversation_list");
    if ((this.zvH != null) && (this.zvH.size() > 0))
    {
      this.zvI = new SettingCheckUnProcessWalletConvUI.a(this);
      this.gGW.setAdapter(this.zvI);
      this.gGW.setOnTouchListener(new SettingCheckUnProcessWalletConvUI.2(this));
      this.gGW.setOnItemClickListener(new SettingCheckUnProcessWalletConvUI.3(this));
      this.gGW.setOnItemLongClickListener(new SettingCheckUnProcessWalletConvUI.4(this));
    }
    AppMethodBeat.o(34627);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI
 * JD-Core Version:    0.6.2
 */