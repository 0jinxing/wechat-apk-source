package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bk;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class FakeSwitchAccountUI extends MMActivity
{
  private int count;
  private String country;
  private int ecI;
  private float fontScale;
  private String gCZ;
  private SwitchAccountGridView qkN;
  private View qkO;
  private View qkP;
  private ArrayList<SwitchAccountModel> qkQ;
  private Map<String, SwitchAccountModel> qkR;
  private ap qkS;

  public FakeSwitchAccountUI()
  {
    AppMethodBeat.i(126955);
    this.qkR = new HashMap();
    AppMethodBeat.o(126955);
  }

  private int ciu()
  {
    AppMethodBeat.i(126958);
    Object localObject = (ActivityManager)getSystemService("activity");
    try
    {
      localObject = ((ActivityManager)localObject).getRunningAppProcesses().iterator();
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      }
      while (!localRunningAppProcessInfo.processName.equals("com.tencent.mm"));
      ab.i("MicroMsg.FakeSwitchAccountUI", "process %s, %s", new Object[] { localRunningAppProcessInfo.processName, Integer.valueOf(localRunningAppProcessInfo.pid) });
      i = localRunningAppProcessInfo.pid;
      AppMethodBeat.o(126958);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.FakeSwitchAccountUI", "isMMProcessExist Exception: " + localException.toString());
        AppMethodBeat.o(126958);
        int i = 0;
      }
    }
    catch (Error localError)
    {
      while (true)
        ab.e("MicroMsg.FakeSwitchAccountUI", "isMMProcessExist Error: " + localError.toString());
    }
  }

  public final int getLayoutId()
  {
    return 2130970644;
  }

  public final void initView()
  {
    AppMethodBeat.i(126957);
    ab.i("MicroMsg.FakeSwitchAccountUI", "FakeSwitchAccount onCreate");
    setMMTitle("");
    getSupportActionBar().hide();
    this.qkN = ((SwitchAccountGridView)findViewById(2131827433));
    this.qkN.setRowCount(1);
    this.qkN.setClickable(false);
    this.ecI = getIntent().getIntExtra("key_mm_process_pid", 0);
    this.gCZ = getIntent().getStringExtra("key_switch_from_wx_username");
    ab.i("MicroMsg.FakeSwitchAccountUI", "title %s", new Object[] { getResources().getString(2131303294) });
    this.qkQ = getIntent().getParcelableArrayListExtra("key_switch_account_users");
    if (this.qkQ != null)
    {
      Iterator localIterator = this.qkQ.iterator();
      while (localIterator.hasNext())
      {
        SwitchAccountModel localSwitchAccountModel = (SwitchAccountModel)localIterator.next();
        this.qkR.put(localSwitchAccountModel.qjK, localSwitchAccountModel);
      }
    }
    this.qkO = findViewById(2131827434);
    this.qkO.setVisibility(8);
    this.qkP = findViewById(2131827427);
    this.qkP.setVisibility(8);
    ab.i("MicroMsg.FakeSwitchAccountUI", "account count %d", new Object[] { Integer.valueOf(this.qkR.size()) });
    this.qkN.setUseSystemDecoder(true);
    this.qkN.ab(this.qkR);
    this.qkN.setLastLoginWxUsername(this.gCZ);
    this.qkN.setLogoutState(true);
    this.qkN.cjt();
    this.qkS = new ap(Looper.myLooper(), new FakeSwitchAccountUI.1(this), true);
    if (this.qkS != null)
      this.qkS.ae(1500L, 500L);
    AppMethodBeat.o(126957);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126956);
    super.onCreate(paramBundle);
    this.country = getIntent().getStringExtra("key_langauage_code");
    this.fontScale = getIntent().getFloatExtra("key_font_scale_size", 1.0F);
    if (!bo.isNullOrNil(this.country))
    {
      ab.i("MicroMsg.FakeSwitchAccountUI", "country %s", new Object[] { this.country });
      bk.setProperty("language_key", this.country);
      q.bM(ah.getContext(), this.country);
    }
    ab.i("MicroMsg.FakeSwitchAccountUI", "fontScale %f", new Object[] { Float.valueOf(this.fontScale) });
    com.tencent.mm.bz.a.h(ah.getContext(), this.fontScale);
    initView();
    AppMethodBeat.o(126956);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(126962);
    super.onDestroy();
    ab.i("MicroMsg.FakeSwitchAccountUI", "fake switch account destroy");
    AppMethodBeat.o(126962);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(126959);
    boolean bool;
    if (paramInt == 4)
    {
      bool = true;
      AppMethodBeat.o(126959);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(126959);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(126960);
    super.onResume();
    ab.i("MicroMsg.FakeSwitchAccountUI", "fake switch account resume");
    AppMethodBeat.o(126960);
  }

  public void onStop()
  {
    AppMethodBeat.i(126961);
    super.onStop();
    ab.i("MicroMsg.FakeSwitchAccountUI", "fake switch account stop");
    AppMethodBeat.o(126961);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI
 * JD-Core Version:    0.6.2
 */