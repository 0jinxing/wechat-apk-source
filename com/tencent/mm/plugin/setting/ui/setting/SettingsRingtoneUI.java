package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q.b;

public class SettingsRingtoneUI extends MMActivity
  implements AdapterView.OnItemClickListener, Runnable
{
  private Cursor PI;
  private ak mHandler;
  private RingtoneManager qoA;
  LayoutInflater qoB;
  private int qoC = -1;
  private int qoD = -1;
  private Ringtone qoE;

  public final int getLayoutId()
  {
    return 2130970640;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127430);
    super.onCreate(paramBundle);
    this.mHandler = new ak();
    this.qoB = LayoutInflater.from(this);
    this.qoA = new RingtoneManager(this);
    this.qoA.setType(2);
    setVolumeControlStream(5);
    this.qoE = RingtoneManager.getRingtone(this, RingtoneManager.getDefaultUri(2));
    setMMTitle(2131303186);
    setBackBtn(new SettingsRingtoneUI.1(this));
    a(0, getString(2131303118), new SettingsRingtoneUI.2(this), q.b.ymu);
    paramBundle = (ListView)findViewById(2131827413);
    View localView = new View(this);
    int i = getResources().getDimensionPixelSize(2131427776);
    localView.setLayoutParams(new AbsListView.LayoutParams(-1, i));
    Object localObject = new View(this);
    ((View)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, i));
    localView.setClickable(false);
    ((View)localObject).setClickable(false);
    paramBundle.addHeaderView(localView);
    paramBundle.addFooterView((View)localObject);
    this.PI = this.qoA.getCursor();
    paramBundle.setAdapter(new SettingsRingtoneUI.a(this, this.PI));
    paramBundle.setItemsCanFocus(false);
    paramBundle.setOnItemClickListener(this);
    localObject = f.MK();
    if (localObject != f.evO)
    {
      localObject = Uri.parse((String)localObject);
      i = this.qoA.getRingtonePosition((Uri)localObject);
      if (i >= 0)
      {
        i += 2;
        this.qoC = i;
        if (this.qoC == 1)
        {
          getSharedPreferences(ah.doA(), 0).edit().putString("settings.ringtone.name", getString(2131303185)).commit();
          ab.d("RingtonePickerActivity", "set ringtone follow system");
        }
        this.qoD = (this.qoC - 1);
      }
    }
    while (true)
    {
      paramBundle.setItemChecked(this.qoC, true);
      paramBundle.setSelection(this.qoC);
      AppMethodBeat.o(127430);
      return;
      i = 1;
      break;
      this.qoC = 1;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127434);
    this.mHandler.removeCallbacks(this);
    if ((this.PI != null) && (!this.PI.isClosed()))
    {
      this.PI.close();
      this.PI = null;
    }
    super.onDestroy();
    AppMethodBeat.o(127434);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(127431);
    this.mHandler.removeCallbacks(this);
    this.qoD = (paramInt - 1);
    this.mHandler.postDelayed(this, 300L);
    AppMethodBeat.o(127431);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(127435);
    boolean bool;
    if ((paramInt == 24) || (paramInt == 25))
    {
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(127435);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(127435);
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(127433);
    this.qoA.stopPreviousRingtone();
    super.onStop();
    AppMethodBeat.o(127433);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public void run()
  {
    AppMethodBeat.i(127432);
    if (isFinishing())
      AppMethodBeat.o(127432);
    while (true)
    {
      return;
      Ringtone localRingtone;
      if (this.qoD == 0)
      {
        localRingtone = this.qoE;
        if (localRingtone == null);
      }
      else
      {
        try
        {
          localRingtone.play();
          AppMethodBeat.o(127432);
          continue;
          localRingtone = this.qoA.getRingtone(this.qoD - 1);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("RingtonePickerActivity", localException, "play ringtone error", new Object[0]);
        }
      }
      AppMethodBeat.o(127432);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI
 * JD-Core Version:    0.6.2
 */