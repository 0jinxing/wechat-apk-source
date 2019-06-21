package com.tencent.mm.plugin.traceroute.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;

public class NetworkDiagnoseIntroUI extends MMActivity
{
  private Button sJd;
  private TextView sJe;

  public final int getLayoutId()
  {
    return 2130970297;
  }

  public final void initView()
  {
    AppMethodBeat.i(26015);
    this.sJd = ((Button)findViewById(2131826327));
    this.sJd.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(26011);
        aw.ZK();
        if (!c.isSDCardAvailable())
        {
          t.hO(NetworkDiagnoseIntroUI.this);
          AppMethodBeat.o(26011);
        }
        while (true)
        {
          return;
          if (aw.Rg().acS() == 0)
          {
            Toast.makeText(NetworkDiagnoseIntroUI.this, NetworkDiagnoseIntroUI.this.getString(2131299946), 0).show();
            AppMethodBeat.o(26011);
          }
          else
          {
            paramAnonymousView = new Intent(NetworkDiagnoseIntroUI.this, NetworkDiagnoseUI.class);
            NetworkDiagnoseIntroUI.this.startActivity(paramAnonymousView);
            NetworkDiagnoseIntroUI.this.finish();
            AppMethodBeat.o(26011);
          }
        }
      }
    });
    this.sJe = ((TextView)findViewById(2131826328));
    this.sJe.setOnClickListener(new NetworkDiagnoseIntroUI.2(this));
    setMMTitle("");
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(26013);
        NetworkDiagnoseIntroUI.this.finish();
        AppMethodBeat.o(26013);
        return true;
      }
    });
    AppMethodBeat.o(26015);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26014);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(26014);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI
 * JD-Core Version:    0.6.2
 */