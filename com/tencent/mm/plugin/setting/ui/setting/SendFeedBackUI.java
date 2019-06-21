package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

public class SendFeedBackUI extends MMActivity
  implements f
{
  private ProgressDialog ehJ = null;
  private EditText pwu;
  private TextView qlE = null;

  public final int getLayoutId()
  {
    return 2130969318;
  }

  public final void initView()
  {
    AppMethodBeat.i(127050);
    setMMTitle(2131303094);
    this.pwu = ((EditText)findViewById(2131821019));
    String str = getIntent().getStringExtra("intentKeyFrom");
    if ((str != null) && (str.equals("fromEnjoyAppDialog")))
    {
      this.qlE = ((TextView)findViewById(2131823384));
      this.qlE.setVisibility(0);
      this.qlE.setOnClickListener(new SendFeedBackUI.1(this));
    }
    setBackBtn(new SendFeedBackUI.2(this));
    addTextOptionMenu(0, getString(2131297041), new SendFeedBackUI.3(this));
    AppMethodBeat.o(127050);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127048);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127048);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127049);
    g.Rg().b(153, this);
    super.onDestroy();
    AppMethodBeat.o(127049);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127051);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      h.a(this, getString(2131303093), getString(2131297061), new SendFeedBackUI.4(this));
      AppMethodBeat.o(127051);
    }
    while (true)
    {
      return;
      h.a(this, getString(2131303092), getString(2131297061), new SendFeedBackUI.5(this));
      AppMethodBeat.o(127051);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SendFeedBackUI
 * JD-Core Version:    0.6.2
 */