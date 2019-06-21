package com.tencent.mm.plugin.setting.ui.fixtools;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.e;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@a(3)
public class FixToolsUplogUI extends MMWizardActivity
{
  private static String qkq;
  private LinearLayout juE;
  private SimpleDateFormat juL;
  private Button qko;
  private TextView qkp;
  private SimpleDateFormat qkr;

  public FixToolsUplogUI()
  {
    AppMethodBeat.i(126898);
    this.qkr = new SimpleDateFormat("yyyy.MM.dd");
    this.juL = new SimpleDateFormat("yyyyMMdd");
    AppMethodBeat.o(126898);
  }

  public final int getLayoutId()
  {
    return 2130969567;
  }

  public final void initView()
  {
    AppMethodBeat.i(126901);
    setMMTitle(2131299888);
    this.qko = ((Button)findViewById(2131824067));
    this.juE = ((LinearLayout)findViewById(2131824064));
    this.qkp = ((TextView)findViewById(2131824066));
    this.qkp.setText(this.qkr.format(new Date()));
    qkq = this.juL.format(new Date());
    this.qko.setOnClickListener(new FixToolsUplogUI.2(this));
    this.juE.setOnClickListener(new FixToolsUplogUI.3(this));
    setBackBtn(new FixToolsUplogUI.4(this));
    AppMethodBeat.o(126901);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126899);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(126899);
    while (true)
    {
      return;
      int i = getIntent().getIntExtra("entry_fix_tools_uplog", 5);
      h.pYm.a(873L, i, 1L, false);
      h.pYm.a(873L, 8L, 1L, false);
      initView();
      AppMethodBeat.o(126899);
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(126900);
    Object localObject = Calendar.getInstance();
    long l1 = bo.anU();
    ((Calendar)localObject).setTimeInMillis(l1);
    int i = ((Calendar)localObject).get(1);
    int j = ((Calendar)localObject).get(2);
    long l2 = l1 / 86400000L * 86400000L + 57600000L - 1L;
    long l3 = l1 / 86400000L * 86400000L + 57600000L - 864000000L;
    localObject = new e(this.mController.ylL, new FixToolsUplogUI.1(this, paramInt, l2), i, j, ((Calendar)localObject).get(5), ((Calendar)localObject).getTimeInMillis(), (byte)0);
    ((e)localObject).setCanceledOnTouchOutside(false);
    if (l3 > 0L)
      l1 = l3;
    try
    {
      while (true)
      {
        ((e)localObject).nx(l1);
        ((e)localObject).nw(l2);
        AppMethodBeat.o(126900);
        return localObject;
        l1 = 0L;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.FixToolsUplogUI", "DatePicker exception!! minTime:%d, maxTime:%d, exception:%s", new Object[] { Long.valueOf(l3), Long.valueOf(l2), localException });
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI
 * JD-Core Version:    0.6.2
 */