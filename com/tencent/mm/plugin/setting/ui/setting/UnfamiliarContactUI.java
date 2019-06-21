package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.CheckPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.TextButtonPreference;
import com.tencent.mm.ui.base.preference.f;

public class UnfamiliarContactUI extends MMPreference
{
  private boolean qjN;
  private boolean qjO;
  private boolean qjP;

  public final int JC()
  {
    return 2131165294;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = false;
    AppMethodBeat.i(127686);
    CheckPreference localCheckPreference;
    boolean bool2;
    if ((paramPreference instanceof CheckPreference))
    {
      localCheckPreference = (CheckPreference)paramPreference;
      if (paramPreference.mKey.equals("settings_half_year_not_chat"))
        if (!this.qjN)
        {
          bool2 = true;
          localCheckPreference.uOT = bool2;
          if (this.qjN)
            break label129;
          bool2 = true;
          label59: this.qjN = bool2;
          label65: paramPreference = (TextButtonPreference)paramf.aqO("settings_next_step");
          if ((!this.qjN) && (!this.qjP))
          {
            bool2 = bool1;
            if (!this.qjO);
          }
          else
          {
            bool2 = true;
          }
          paramPreference.setEnabled(bool2);
        }
    }
    while (true)
    {
      paramf.notifyDataSetChanged();
      AppMethodBeat.o(127686);
      return true;
      bool2 = false;
      break;
      label129: bool2 = false;
      break label59;
      if (paramPreference.mKey.equals("settings_has_not_same_chatroom"))
      {
        if (!this.qjP)
        {
          bool2 = true;
          label157: localCheckPreference.uOT = bool2;
          if (this.qjP)
            break label189;
        }
        label189: for (bool2 = true; ; bool2 = false)
        {
          this.qjP = bool2;
          break;
          bool2 = false;
          break label157;
        }
      }
      if (!paramPreference.mKey.equals("settings_half_year_not_response"))
        break label65;
      if (!this.qjO)
      {
        bool2 = true;
        label217: localCheckPreference.uOT = bool2;
        if (this.qjO)
          break label249;
      }
      label249: for (bool2 = true; ; bool2 = false)
      {
        this.qjO = bool2;
        break;
        bool2 = false;
        break label217;
      }
      if (paramPreference.mKey.equals("settings_next_step"))
      {
        paramPreference = new Intent(this, UnfamiliarContactDetailUI.class);
        paramPreference.putExtra("half_year_not_chat", this.qjN);
        paramPreference.putExtra("half_year_not_response", this.qjO);
        paramPreference.putExtra("has_not_same_chatroom", this.qjP);
        startActivityForResult(paramPreference, 291);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127687);
    super.initView();
    setMMTitle(2131303330);
    setBackBtn(new UnfamiliarContactUI.1(this));
    ((CheckPreference)this.yCw.aqO("settings_half_year_not_chat")).yBr = 0;
    ((CheckPreference)this.yCw.aqO("settings_has_not_same_chatroom")).yBr = 0;
    ((CheckPreference)this.yCw.aqO("settings_half_year_not_response")).yBr = 0;
    ((TextButtonPreference)this.yCw.aqO("settings_next_step")).setEnabled(false);
    this.yCw.notifyDataSetChanged();
    AppMethodBeat.o(127687);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127685);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127685);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(127688);
    boolean bool;
    if (paramInt == 4)
    {
      onBackPressed();
      bool = true;
      AppMethodBeat.o(127688);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(127688);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactUI
 * JD-Core Version:    0.6.2
 */