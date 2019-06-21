package com.tencent.mm.plugin.mmsight.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.LinkedList;

@a(3)
public class SightSettingsUI extends MMActivity
{
  private d ext;
  private ListView gKd;
  private SightSettingsUI.a oDo;
  private LinkedList<SightSettingsUI.b> oDp;
  private CaptureMMProxy otb;

  public SightSettingsUI()
  {
    AppMethodBeat.i(55286);
    this.ext = new d(this);
    this.oDp = new LinkedList();
    AppMethodBeat.o(55286);
  }

  public final int getLayoutId()
  {
    return 2130970696;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55287);
    super.onCreate(paramBundle);
    this.otb = new CaptureMMProxy(this.ext);
    this.ext.connect(new SightSettingsUI.1(this));
    setBackBtn(new SightSettingsUI.2(this));
    AppMethodBeat.o(55287);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(55288);
    super.onDestroy();
    this.ext.release();
    AppMethodBeat.o(55288);
  }

  public void onPause()
  {
    AppMethodBeat.i(55290);
    super.onPause();
    AppMethodBeat.o(55290);
  }

  public void onResume()
  {
    AppMethodBeat.i(55289);
    super.onResume();
    AppMethodBeat.o(55289);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightSettingsUI
 * JD-Core Version:    0.6.2
 */