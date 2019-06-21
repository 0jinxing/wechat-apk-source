package com.tencent.mm.plugin.voiceprint.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class VoiceReCreatePromptUI extends MMActivity
  implements View.OnClickListener
{
  private View sMM = null;

  public final int getLayoutId()
  {
    return 2130971018;
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(26221);
    startActivity(new Intent(this, VoiceCreateUI.class));
    finish();
    AppMethodBeat.o(26221);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26219);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.sMM = findViewById(2131828468);
    this.sMM.setOnClickListener(this);
    AppMethodBeat.o(26219);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(26220);
    super.onDestroy();
    AppMethodBeat.o(26220);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoiceReCreatePromptUI
 * JD-Core Version:    0.6.2
 */