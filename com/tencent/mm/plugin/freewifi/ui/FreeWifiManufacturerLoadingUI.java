package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

public class FreeWifiManufacturerLoadingUI extends MMActivity
{
  private String bssid;
  private ap che;
  private final int mzA;
  private final int mzB;
  private final int mzC;
  private int[] mzD;
  ak mzE;
  ak mzF;
  private ImageView mzx;
  private TextView mzy;
  private Button mzz;
  private String ssid;

  public FreeWifiManufacturerLoadingUI()
  {
    AppMethodBeat.i(21018);
    this.mzA = 1;
    this.mzB = 2;
    this.mzC = 3;
    this.mzD = new int[] { 2130838838, 2130838839, 2130838840, 2130838841, 2130838842 };
    this.mzE = new FreeWifiManufacturerLoadingUI.1(this);
    this.mzF = new ak();
    AppMethodBeat.o(21018);
  }

  private void MO(String paramString)
  {
    AppMethodBeat.i(21023);
    j.byZ().byI().post(new FreeWifiManufacturerLoadingUI.5(this, paramString));
    AppMethodBeat.o(21023);
  }

  private void MP(String paramString)
  {
    AppMethodBeat.i(21025);
    Message localMessage = Message.obtain();
    localMessage.what = 3;
    localMessage.obj = paramString;
    this.mzE.sendMessage(localMessage);
    AppMethodBeat.o(21025);
  }

  private void aJ(int paramInt, String paramString)
  {
    AppMethodBeat.i(21024);
    ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "errcode=%d, errmsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt != 0)
    {
      bzO();
      if (paramInt == 1154)
      {
        MP(getString(2131300067) + "(031" + k.b.muO.muQ + "-" + Math.abs(paramInt) + ")");
        AppMethodBeat.o(21024);
      }
    }
    while (true)
    {
      return;
      MP(getString(2131300066) + "(031" + k.b.muO.muQ + "-" + Math.abs(paramInt) + ")");
      this.mzF.postDelayed(new FreeWifiManufacturerLoadingUI.6(this), 0L);
      AppMethodBeat.o(21024);
    }
  }

  private void bzO()
  {
    AppMethodBeat.i(21019);
    if (this.che != null)
      this.che.stopTimer();
    this.mzE.sendEmptyMessage(2);
    AppMethodBeat.o(21019);
  }

  private static String cc(Context paramContext)
  {
    AppMethodBeat.i(21026);
    try
    {
      paramContext = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "top activity name =".concat(String.valueOf(paramContext)));
      AppMethodBeat.o(21026);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", paramContext, "", new Object[0]);
        paramContext = "(null)";
        AppMethodBeat.o(21026);
      }
    }
  }

  public final void bzP()
  {
    AppMethodBeat.i(21022);
    this.mzE.sendEmptyMessage(1);
    if (this.che != null)
      this.che.stopTimer();
    this.che = new ap(new FreeWifiManufacturerLoadingUI.4(this), true);
    this.che.ae(200L, 200L);
    MO(this.ssid);
    AppMethodBeat.o(21022);
  }

  public void finish()
  {
    AppMethodBeat.i(21020);
    bzO();
    super.finish();
    AppMethodBeat.o(21020);
  }

  public final int getLayoutId()
  {
    return 2130969593;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21021);
    super.onCreate(paramBundle);
    setMMTitle(2131300078);
    this.ssid = getIntent().getStringExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Ssid");
    this.bssid = getIntent().getStringExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Bssid");
    this.mzx = ((ImageView)findViewById(2131824144));
    this.mzy = ((TextView)findViewById(2131824145));
    this.mzz = ((Button)findViewById(2131824146));
    this.mzz.setOnClickListener(new FreeWifiManufacturerLoadingUI.2(this));
    setBackBtn(new FreeWifiManufacturerLoadingUI.3(this));
    bzP();
    AppMethodBeat.o(21021);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiManufacturerLoadingUI
 * JD-Core Version:    0.6.2
 */