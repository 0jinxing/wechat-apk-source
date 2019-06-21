package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;

public class SettingsAliasResultUI extends MMActivity
{
  private String dFl;
  private TextView gnC;
  private TextView qmN;
  private Button qmO;
  private ImageView qmP;
  private boolean qmQ;

  public final int getLayoutId()
  {
    return 2130970631;
  }

  public final void initView()
  {
    AppMethodBeat.i(127182);
    setMMTitle(2131301491);
    this.gnC = ((TextView)findViewById(2131820991));
    this.qmN = ((TextView)findViewById(2131821097));
    this.qmO = ((Button)findViewById(2131827383));
    this.qmP = ((ImageView)findViewById(2131827382));
    setBackBtn(new SettingsAliasResultUI.1(this));
    this.qmN.setText(this.dFl);
    if (!this.qmQ)
    {
      this.qmO.setVisibility(0);
      this.gnC.setText(getString(2131301496));
    }
    while (true)
    {
      this.qmO.setOnClickListener(new SettingsAliasResultUI.2(this));
      AppMethodBeat.o(127182);
      return;
      this.qmO.setVisibility(8);
      this.gnC.setText(getString(2131301497));
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(127183);
    if (paramInt2 == -1)
      finish();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(127183);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127179);
    super.onCreate(paramBundle);
    this.dFl = ((String)g.RP().Ry().get(42, null));
    this.qmQ = getIntent().getBooleanExtra("has_pwd", true);
    initView();
    AppMethodBeat.o(127179);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127181);
    super.onDestroy();
    AppMethodBeat.o(127181);
  }

  public void onPause()
  {
    AppMethodBeat.i(127180);
    super.onPause();
    AppMethodBeat.o(127180);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI
 * JD-Core Version:    0.6.2
 */