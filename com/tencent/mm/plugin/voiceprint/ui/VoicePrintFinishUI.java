package com.tencent.mm.plugin.voiceprint.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class VoicePrintFinishUI extends MMActivity
{
  private TextView iDT;
  private TextView poi;
  private Button sMp;
  private ImageView sMq;
  private int sMr;

  public final int getLayoutId()
  {
    return 2130971014;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26207);
    ab.i("MicroMsg.VoicePrintFinishUI", "VoicePrintFinishUI");
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.sMr = getIntent().getIntExtra("kscene_type", 73);
    ab.d("MicroMsg.VoicePrintFinishUI", "onCreate, sceneType:%d", new Object[] { Integer.valueOf(this.sMr) });
    this.iDT = ((TextView)findViewById(2131828458));
    this.poi = ((TextView)findViewById(2131823773));
    this.sMp = ((Button)findViewById(2131823774));
    this.sMq = ((ImageView)findViewById(2131823772));
    switch (this.sMr)
    {
    default:
    case 72:
    case 73:
    }
    while (true)
    {
      this.sMp.setOnClickListener(new VoicePrintFinishUI.1(this));
      setBackBtn(new VoicePrintFinishUI.2(this));
      AppMethodBeat.o(26207);
      return;
      this.iDT.setText(2131304314);
      this.poi.setText(2131304315);
      this.sMq.setVisibility(0);
      this.sMp.setText(2131303348);
      continue;
      this.iDT.setVisibility(8);
      this.poi.setText(2131304337);
      this.sMq.setVisibility(0);
      this.sMp.setText(2131303349);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(26208);
    super.onDestroy();
    AppMethodBeat.o(26208);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoicePrintFinishUI
 * JD-Core Version:    0.6.2
 */