package com.tencent.mm.plugin.sight.draft.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public class SightDraftUI extends MMActivity
{
  private LinkedList<String> qAa;
  private int qzY;
  SightDraftContainerView qzZ;

  public SightDraftUI()
  {
    AppMethodBeat.i(25028);
    this.qzY = 1;
    this.qAa = new LinkedList();
    AppMethodBeat.o(25028);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25029);
    super.onCreate(paramBundle);
    setMMTitle(2131303549);
    getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(2131689761));
    this.qzZ = new SightDraftContainerView(this);
    setContentView(this.qzZ);
    this.qzZ.clx();
    setBackBtn(new SightDraftUI.1(this));
    this.qzZ.setSightDraftCallback(new SightDraftUI.2(this));
    AppMethodBeat.o(25029);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.SightDraftUI
 * JD-Core Version:    0.6.2
 */