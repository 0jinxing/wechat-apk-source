package com.tencent.mm.plugin.expt.roomexpt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class RoomExptDebugUI extends MMActivity
{
  private ListView gGW;
  private ArrayAdapter lOF;
  private TextView lOG;
  private Button lOH;
  private Button lOI;
  private Button lOJ;
  private Button lOK;
  private Button lOL;

  private void aWK()
  {
    AppMethodBeat.i(73600);
    this.lOG.setText(a.brg().brl());
    AppMethodBeat.o(73600);
  }

  public final int getLayoutId()
  {
    return 2130968627;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(73599);
    super.onCreate(paramBundle);
    this.lOH = ((Button)findViewById(2131821011));
    this.lOH.setOnClickListener(new RoomExptDebugUI.1(this));
    this.lOI = ((Button)findViewById(2131821012));
    this.lOI.setOnClickListener(new RoomExptDebugUI.2(this));
    this.lOK = ((Button)findViewById(2131821014));
    this.lOK.setOnClickListener(new RoomExptDebugUI.3(this));
    this.lOJ = ((Button)findViewById(2131821013));
    this.lOJ.setOnClickListener(new RoomExptDebugUI.4(this));
    this.lOL = ((Button)findViewById(2131821015));
    this.lOL.setOnClickListener(new RoomExptDebugUI.5(this));
    this.lOG = ((TextView)findViewById(2131821016));
    aWK();
    this.gGW = ((ListView)findViewById(2131821017));
    this.lOF = new RoomExptDebugUI.6(this, this);
    this.gGW.setAdapter(this.lOF);
    AppMethodBeat.o(73599);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(73601);
    if (this.lOF != null)
    {
      this.lOF.setNotifyOnChange(false);
      this.lOF.clear();
    }
    super.onDestroy();
    AppMethodBeat.o(73601);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.RoomExptDebugUI
 * JD-Core Version:    0.6.2
 */