package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;

public class BindMContactStatusUI extends MMWizardActivity
{
  private TextView grA;
  private TextView grB;
  private Button grC;
  private ImageView gri;

  public final int getLayoutId()
  {
    return 2130968843;
  }

  public final void initView()
  {
    AppMethodBeat.i(13456);
    this.gri = ((ImageView)findViewById(2131821737));
    this.grA = ((TextView)findViewById(2131821738));
    this.grB = ((TextView)findViewById(2131821768));
    this.grC = ((Button)findViewById(2131821740));
    if (l.apS() == l.a.gvz)
    {
      this.gri.setImageResource(2131231608);
      String str1 = (String)g.RP().Ry().get(6, null);
      String str2;
      if (str1 != null)
      {
        str2 = str1;
        if (!str1.equals(""));
      }
      else
      {
        str2 = (String)g.RP().Ry().get(4097, null);
      }
      this.grB.setText(getString(2131297561));
      this.grA.setText(getString(2131297586, new Object[] { str2 }));
    }
    while (true)
    {
      this.grC.setOnClickListener(new BindMContactStatusUI.1(this));
      AppMethodBeat.o(13456);
      return;
      this.gri.setImageResource(2131231609);
      this.grB.setText(2131297573);
      this.grA.setText(2131297573);
      this.grB.setVisibility(8);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13455);
    super.onCreate(paramBundle);
    setMMTitle(2131297565);
    initView();
    AppMethodBeat.o(13455);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(13457);
    if (paramInt == 4)
    {
      Ni(1);
      AppMethodBeat.o(13457);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13457);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI
 * JD-Core Version:    0.6.2
 */