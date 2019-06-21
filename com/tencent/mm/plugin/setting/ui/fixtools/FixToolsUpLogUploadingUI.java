package com.tencent.mm.plugin.setting.ui.fixtools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.setting.model.a.1;
import com.tencent.mm.plugin.setting.model.a.2;
import com.tencent.mm.plugin.setting.model.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMWizardActivity;

@com.tencent.mm.ui.base.a(3)
public class FixToolsUpLogUploadingUI extends MMWizardActivity
{
  private Button ixU;
  public a.a qjB;
  private TextView qkk;
  private ImageView qkl;
  protected ProgressBar qkm;

  public FixToolsUpLogUploadingUI()
  {
    AppMethodBeat.i(126889);
    this.qjB = new FixToolsUpLogUploadingUI.3(this);
    AppMethodBeat.o(126889);
  }

  public final int getLayoutId()
  {
    return 2130969568;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126890);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(126890);
    while (true)
    {
      return;
      setMMTitle(2131299888);
      this.qkk = ((TextView)findViewById(2131824069));
      this.qkl = ((ImageView)findViewById(2131824068));
      this.ixU = ((Button)findViewById(2131824071));
      this.qkm = ((ProgressBar)findViewById(2131824070));
      this.qkl.setImageResource(2131231309);
      this.qkk.setText(2131299894);
      this.ixU.setOnClickListener(new FixToolsUpLogUploadingUI.1(this));
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(126887);
          FixToolsUpLogUploadingUI.b(FixToolsUpLogUploadingUI.this);
          AppMethodBeat.o(126887);
          return true;
        }
      });
      this.qkm.setVisibility(0);
      this.ixU.setVisibility(8);
      String str = getIntent().getStringExtra("date");
      com.tencent.mm.plugin.setting.model.a locala = com.tencent.mm.plugin.setting.model.a.cir();
      com.tencent.mm.plugin.setting.model.a.qjB = this.qjB;
      ab.i("MicroMsg.FixToolsUplogModel", "startUplog, date:%s, isUploading:%b", new Object[] { str, Boolean.valueOf(locala.fPO) });
      if (!locala.fPO)
      {
        locala.fPO = true;
        paramBundle = "weixin";
        if (g.RK())
          paramBundle = r.Yz();
        long l1 = bo.anU() / 86400000L;
        long l2 = com.tencent.mm.plugin.setting.model.a.Ff(str + "000000");
        int i = (int)((l1 * 86400000L + 57600000L - 1L - l2) / 86400000L);
        ab.i("MicroMsg.FixToolsUplogModel", "startNewUplog, chooseTime:%d, time:%d", new Object[] { Long.valueOf(l2), Integer.valueOf(i) });
        g.Rg().a(new bk(new a.1(locala, paramBundle, i)), 0);
        b.a(new a.2(locala));
      }
      AppMethodBeat.o(126890);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(126891);
    if (paramInt == 4)
    {
      Ni(1);
      AppMethodBeat.o(126891);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(126891);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI
 * JD-Core Version:    0.6.2
 */