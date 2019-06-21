package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.a;

@a(7)
public class UIEntryStub extends Activity
{
  private String Iw;
  private Intent cEp;
  private int jDs;
  private boolean jDt;

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18131);
    super.onCreate(paramBundle);
    NotifyReceiver.Io();
    this.jDt = false;
    AppMethodBeat.o(18131);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(18132);
    super.onNewIntent(paramIntent);
    this.cEp = paramIntent;
    ab.i("MicroMsg.UIEntryStub", "onNewIntent mHasHandled: %b", new Object[] { Boolean.valueOf(this.jDt) });
    this.jDt = false;
    AppMethodBeat.o(18132);
  }

  public void onResume()
  {
    AppMethodBeat.i(18133);
    super.onResume();
    if (this.cEp == null)
      this.cEp = getIntent();
    aw.Rg().a(new bk(new UIEntryStub.1(this)), 0);
    AppMethodBeat.o(18133);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.UIEntryStub
 * JD-Core Version:    0.6.2
 */