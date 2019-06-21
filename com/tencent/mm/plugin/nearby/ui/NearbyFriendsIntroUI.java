package com.tencent.mm.plugin.nearby.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.c;

public class NearbyFriendsIntroUI extends MMActivity
{
  private Button grC;
  private View oPR;
  private CheckBox oPS;
  private c oPU = null;

  private void bVc()
  {
    AppMethodBeat.i(55439);
    this.oPR = View.inflate(this, 2130969930, null);
    this.oPS = ((CheckBox)this.oPR.findViewById(2131825250));
    this.oPS.setChecked(false);
    AppMethodBeat.o(55439);
  }

  public final int getLayoutId()
  {
    return 2130970288;
  }

  public final void initView()
  {
    AppMethodBeat.i(55438);
    bVc();
    this.grC = ((Button)findViewById(2131826299));
    this.grC.setOnClickListener(new NearbyFriendsIntroUI.1(this));
    setBackBtn(new NearbyFriendsIntroUI.2(this));
    AppMethodBeat.o(55438);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55437);
    super.onCreate(paramBundle);
    setMMTitle(2131301639);
    initView();
    AppMethodBeat.o(55437);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI
 * JD-Core Version:    0.6.2
 */