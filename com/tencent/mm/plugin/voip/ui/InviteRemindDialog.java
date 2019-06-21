package com.tencent.mm.plugin.voip.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMBaseActivity;

public class InviteRemindDialog extends MMBaseActivity
{
  private TextView gsf;
  private TextView sVO;
  private String talker = "";
  private int type = 0;

  public static void p(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(4774);
    Intent localIntent = new Intent(paramContext, InviteRemindDialog.class);
    localIntent.putExtra("InviteRemindDialog_User", paramString);
    localIntent.putExtra("InviteRemindDialog_Type", paramInt);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(4774);
  }

  public void finish()
  {
    AppMethodBeat.i(4773);
    super.finish();
    AppMethodBeat.o(4773);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(4772);
    super.onCreate(paramBundle);
    setContentView(2130970228);
    this.gsf = ((TextView)findViewById(2131824517));
    this.sVO = ((TextView)findViewById(2131824518));
    this.talker = getIntent().getStringExtra("InviteRemindDialog_User");
    this.type = getIntent().getIntExtra("InviteRemindDialog_Type", 0);
    if (this.type == 0)
    {
      this.gsf.setText(getString(2131304465));
      this.sVO.setText(getString(2131304431));
    }
    while (true)
    {
      findViewById(2131822912).setOnClickListener(new InviteRemindDialog.1(this));
      findViewById(2131822911).setOnClickListener(new InviteRemindDialog.2(this));
      AppMethodBeat.o(4772);
      return;
      if (this.type == 1)
      {
        this.gsf.setText(getString(2131304497));
        this.sVO.setText(getString(2131304488));
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.InviteRemindDialog
 * JD-Core Version:    0.6.2
 */