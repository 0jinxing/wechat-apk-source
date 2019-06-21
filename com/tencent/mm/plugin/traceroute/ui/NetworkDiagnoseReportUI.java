package com.tencent.mm.plugin.traceroute.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.ui.MMActivity;

public class NetworkDiagnoseReportUI extends MMActivity
{
  private static String sIs;
  private boolean sJg = false;
  private Button sJh;
  private Button sJi;
  private ImageView sJj;
  private TextView sJk;
  private TextView sJl;
  private TextView sJm;

  public final int getLayoutId()
  {
    return 2130970298;
  }

  public final void initView()
  {
    AppMethodBeat.i(26021);
    setMMTitle("");
    this.sJj = ((ImageView)findViewById(2131826329));
    this.sJk = ((TextView)findViewById(2131826330));
    this.sJl = ((TextView)findViewById(2131826331));
    this.sJg = getIntent().getBooleanExtra("diagnose_result", false);
    if (this.sJg)
    {
      this.sJj.setImageResource(2130839664);
      this.sJk.setText(getString(2131304181));
      this.sJl.setVisibility(0);
      addTextOptionMenu(0, getString(2131298881), new NetworkDiagnoseReportUI.1(this));
      AppMethodBeat.o(26021);
    }
    while (true)
    {
      return;
      setBackBtn(new NetworkDiagnoseReportUI.2(this));
      sIs = getIntent().getStringExtra("diagnose_log_file_path");
      this.sJj.setImageResource(2130839663);
      this.sJk.setText(getString(2131304180));
      if ((sIs == null) || (e.cs(sIs) <= 0))
      {
        AppMethodBeat.o(26021);
      }
      else
      {
        this.sJm = ((TextView)findViewById(2131826334));
        this.sJm.setText(getString(2131302480, new Object[] { sIs.replace("mnt/", "") }));
        findViewById(2131826334).setVisibility(0);
        findViewById(2131826336).setVisibility(0);
        this.sJh = ((Button)findViewById(2131826335));
        this.sJh.setVisibility(0);
        this.sJh.setOnClickListener(new NetworkDiagnoseReportUI.3(this));
        this.sJi = ((Button)findViewById(2131826333));
        this.sJi.setVisibility(0);
        this.sJi.setOnClickListener(new NetworkDiagnoseReportUI.4(this));
        AppMethodBeat.o(26021);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26020);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(26020);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI
 * JD-Core Version:    0.6.2
 */