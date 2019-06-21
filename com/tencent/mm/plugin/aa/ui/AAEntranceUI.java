package com.tencent.mm.plugin.aa.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class AAEntranceUI extends MMActivity
{
  private Button gna;
  private TextView gnb;

  public final int getLayoutId()
  {
    return 2130968576;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(40712);
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(40712);
      return;
    }
    if (paramInt1 == 1)
    {
      String str = paramIntent.getStringExtra("Select_Conv_User");
      ab.i("MicroMsg.AAEntranceUI", "select chatroom：%s", new Object[] { str });
      if (!bo.isNullOrNil(str))
      {
        Intent localIntent = new Intent(this.mController.ylL, LaunchAAUI.class);
        localIntent.putExtra("enter_scene", 2);
        localIntent.putExtra("chatroom_name", str);
        if (getIntent().getExtras() != null)
          localIntent.putExtras(getIntent().getExtras());
        startActivityForResult(localIntent, 2);
      }
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(40712);
      break;
      if (paramInt1 == 2)
        finish();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(40711);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(this.mController.dyj());
    setMMTitle(2131300931);
    this.gna = ((Button)findViewById(2131820885));
    this.gnb = ((TextView)findViewById(2131820886));
    this.gna.setOnClickListener(new AAEntranceUI.1(this));
    this.gnb.setClickable(true);
    this.gnb.setOnTouchListener(new m(this));
    paramBundle = new SpannableStringBuilder(getString(2131298266));
    paramBundle.setSpan(new a(new AAEntranceUI.2(this)), 0, paramBundle.length(), 18);
    this.gnb.setText(paramBundle);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(40710);
        AAEntranceUI.this.finish();
        AppMethodBeat.o(40710);
        return false;
      }
    });
    AppMethodBeat.o(40711);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAEntranceUI
 * JD-Core Version:    0.6.2
 */