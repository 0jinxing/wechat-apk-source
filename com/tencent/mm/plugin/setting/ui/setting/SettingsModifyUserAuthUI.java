package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.model.UserAuthItemParcelable;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Iterator;
import java.util.List;

public class SettingsModifyUserAuthUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private String appId;
  private com.tencent.mm.ui.base.p eir;
  private com.tencent.mm.ui.base.preference.h qnW;
  private int scene;

  public final int JC()
  {
    return -1;
  }

  public final boolean a(final com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(127323);
    if (((CheckBoxPreference)paramPreference).isChecked());
    for (int i = 1; ; i = 2)
    {
      paramf = new com.tencent.mm.plugin.setting.model.h(this.appId, paramPreference.mKey, i, this.scene);
      g.Rg().a(paramf, 0);
      this.eir = com.tencent.mm.ui.base.h.b(this, getString(2131297043), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(127318);
          g.Rg().c(paramf);
          AppMethodBeat.o(127318);
        }
      });
      AppMethodBeat.o(127323);
      return true;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127319);
    super.onCreate(paramBundle);
    this.qnW = ((com.tencent.mm.ui.base.preference.h)this.yCw);
    paramBundle = getIntent().getParcelableArrayListExtra("app_auth_items");
    this.appId = getIntent().getStringExtra("app_id");
    this.scene = getIntent().getIntExtra("modify_scene", 1);
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      Iterator localIterator = paramBundle.iterator();
      if (localIterator.hasNext())
      {
        UserAuthItemParcelable localUserAuthItemParcelable = (UserAuthItemParcelable)localIterator.next();
        paramBundle = new CheckBoxPreference(this);
        paramBundle.setTitle(localUserAuthItemParcelable.qkh);
        if (localUserAuthItemParcelable.scope.equals("snsapi_friend"))
          paramBundle.setSummary(2131303039);
        paramBundle.setKey(localUserAuthItemParcelable.scope);
        if (localUserAuthItemParcelable.state == 1);
        for (boolean bool = true; ; bool = false)
        {
          paramBundle.uOT = bool;
          paramBundle.yDf = false;
          this.qnW.a(paramBundle, -1);
          break;
        }
      }
    }
    setMMTitle(getIntent().getStringExtra("app_name"));
    setBackBtn(new SettingsModifyUserAuthUI.1(this));
    AppMethodBeat.o(127319);
  }

  public void onPause()
  {
    AppMethodBeat.i(127322);
    super.onPause();
    g.Rg().b(1144, this);
    AppMethodBeat.o(127322);
  }

  public void onResume()
  {
    AppMethodBeat.i(127321);
    super.onResume();
    g.Rg().a(1144, this);
    AppMethodBeat.o(127321);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(127320);
    ab.i("MicroMsg.SettingsModifyUserAuthUI", "errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt2), paramString });
    if (this.eir != null)
      this.eir.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.setting.model.h)paramm).qjG;
      paramInt1 = ((com.tencent.mm.plugin.setting.model.h)paramm).qjH;
      if (!bo.isNullOrNil(paramString))
      {
        paramString = (CheckBoxPreference)this.qnW.aqO(paramString);
        if (paramInt1 == 1)
          paramString.uOT = bool;
      }
      else
      {
        AppMethodBeat.o(127320);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      com.tencent.mm.ui.base.h.bQ(this, paramString);
      AppMethodBeat.o(127320);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyUserAuthUI
 * JD-Core Version:    0.6.2
 */