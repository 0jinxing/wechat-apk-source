package com.tencent.mm.plugin.subapp.ui.openapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;

public class AddAppUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private AppPreference sus;
  private AppPreference sut;

  private void cDJ()
  {
    AppMethodBeat.i(25424);
    this.sus = ((AppPreference)this.ehK.aqO("addapp_added"));
    this.sus.suw = 1;
    this.sus.suz = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(25417);
        paramAnonymousAdapterView = AddAppUI.a(AddAppUI.this).Fq(paramAnonymousInt);
        AddAppUI.a(AddAppUI.this, paramAnonymousAdapterView.field_appId);
        AppMethodBeat.o(25417);
      }
    };
    this.sus.suA = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(25418);
        AddAppUI.f(AddAppUI.a(AddAppUI.this).Fq(paramAnonymousInt));
        AddAppUI.this.initView();
        AppMethodBeat.o(25418);
      }
    };
    this.sut = ((AppPreference)this.ehK.aqO("addapp_available"));
    this.sut.suw = 0;
    this.sut.suz = new AddAppUI.4(this);
    AppMethodBeat.o(25424);
  }

  public final int JC()
  {
    return 2131165188;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(25425);
    if (paramPreference.mKey.equals("addapp_recommend"))
    {
      paramf = aa.g(this.mController.ylL.getSharedPreferences(ah.doA(), 0));
      paramf = getString(2131296427, new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.vxo), paramf, aa.doq() });
      paramPreference = new Intent();
      paramPreference.putExtra("rawUrl", paramf);
      com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
      AppMethodBeat.o(25425);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(25425);
      bool = false;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(25423);
    setMMTitle(2131296422);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(25416);
        AddAppUI.this.finish();
        AppMethodBeat.o(25416);
        return true;
      }
    });
    this.ehK = this.yCw;
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165188);
    cDJ();
    AppMethodBeat.o(25423);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25420);
    super.onCreate(paramBundle);
    AppMethodBeat.o(25420);
  }

  public void onPause()
  {
    AppMethodBeat.i(25422);
    super.onPause();
    if (this.sus != null)
      this.sus.onPause();
    if (this.sut != null)
      this.sut.onPause();
    AppMethodBeat.o(25422);
  }

  public void onResume()
  {
    AppMethodBeat.i(25421);
    super.onResume();
    initView();
    if (this.sus != null)
      this.sus.onResume();
    if (this.sut != null)
      this.sut.onResume();
    AppMethodBeat.o(25421);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(25426);
    ab.d("MicroMsg.AddAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      AppMethodBeat.o(25426);
    while (true)
    {
      return;
      ab.e("MicroMsg.AddAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
      AppMethodBeat.o(25426);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI
 * JD-Core Version:    0.6.2
 */