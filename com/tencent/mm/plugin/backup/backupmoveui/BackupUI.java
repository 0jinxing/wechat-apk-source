package com.tencent.mm.plugin.backup.backupmoveui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.d.a;
import com.tencent.mm.plugin.backup.d.a.1;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMWizardActivity;

public class BackupUI extends MMWizardActivity
{
  private static boolean jvn = false;
  private TextView juX;
  private ap jui;
  private Button jvm;

  public BackupUI()
  {
    AppMethodBeat.i(17431);
    this.jui = new ap(Looper.getMainLooper(), new BackupUI.3(this), true);
    AppMethodBeat.o(17431);
  }

  public final int getLayoutId()
  {
    return 2130968799;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17432);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      AppMethodBeat.o(17432);
      return;
    }
    setMMTitle(2131297197);
    h.pYm.e(11788, new Object[] { Integer.valueOf(1) });
    com.tencent.mm.plugin.backup.g.b.aTZ();
    this.juX = ((TextView)findViewById(2131821595));
    this.jvm = ((Button)findViewById(2131821596));
    com.tencent.mm.plugin.backup.d.b.aSZ();
    paramBundle = com.tencent.mm.plugin.backup.d.b.aSz().edit();
    paramBundle.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
    paramBundle.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
    paramBundle.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
    paramBundle.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
    paramBundle.commit();
    if (!com.tencent.mm.plugin.backup.d.b.aSZ().aTd().jsY)
    {
      paramBundle = com.tencent.mm.plugin.backup.d.b.aSZ().aTd();
      com.tencent.mm.plugin.backup.h.d.aUr().aUu();
      com.tencent.mm.sdk.g.d.post(new a.1(paramBundle), "BakMoveChooseServer.calculateToChoose");
      label187: if (!bo.isNullOrNil(g.ds(this)))
        break label302;
      this.juX.setText(2131297360);
      this.juX.setTextColor(getResources().getColor(2131689745));
      this.jvm.setEnabled(false);
      jvn = false;
      h.pYm.e(11788, new Object[] { Integer.valueOf(2) });
    }
    while (true)
    {
      this.jvm.setOnClickListener(new BackupUI.1(this));
      setBackBtn(new BackupUI.2(this));
      AppMethodBeat.o(17432);
      break;
      com.tencent.mm.plugin.backup.d.b.aSZ().aTd().aSX();
      break label187;
      label302: this.juX.setText(2131297361);
      this.juX.setTextColor(getResources().getColor(2131689746));
      this.jvm.setEnabled(true);
      jvn = true;
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(17433);
    super.onStart();
    this.jui.ae(5000L, 5000L);
    AppMethodBeat.o(17433);
  }

  public void onStop()
  {
    AppMethodBeat.i(17434);
    super.onStop();
    this.jui.stopTimer();
    AppMethodBeat.o(17434);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupUI
 * JD-Core Version:    0.6.2
 */