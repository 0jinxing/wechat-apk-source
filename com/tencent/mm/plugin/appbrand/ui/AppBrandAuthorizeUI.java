package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.appbrand.config.u;
import com.tencent.mm.protocal.protobuf.cmi;
import com.tencent.mm.protocal.protobuf.cwh;
import com.tencent.mm.protocal.protobuf.cwi;
import com.tencent.mm.protocal.protobuf.cws;
import com.tencent.mm.protocal.protobuf.fu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppBrandAuthorizeUI extends MMPreference
{
  private com.tencent.mm.ui.base.p ejZ;
  List<fu> iFC;
  private u iFD;
  protected f iFE;
  private boolean iFF;
  private boolean iFG;
  private boolean iFH;
  private com.tencent.mm.ui.statusbar.b iFI;
  private String igi;
  private String mAppId;

  public AppBrandAuthorizeUI()
  {
    AppMethodBeat.i(132909);
    this.iFC = new ArrayList();
    this.iFF = false;
    this.iFG = true;
    this.iFH = false;
    this.iFI = null;
    AppMethodBeat.o(132909);
  }

  private void a(final AppBrandAuthorizeUI.a parama)
  {
    AppMethodBeat.i(132912);
    if (!at.isConnected(ah.getContext()))
    {
      t.makeText(this, getString(2131297159), 1).show();
      if (parama != null)
        parama.bV(false);
      AppMethodBeat.o(132912);
    }
    while (true)
    {
      return;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(132905);
          if (AppBrandAuthorizeUI.b(AppBrandAuthorizeUI.this))
          {
            AppBrandAuthorizeUI.c(AppBrandAuthorizeUI.this);
            AppBrandAuthorizeUI.a(AppBrandAuthorizeUI.this, AppBrandAuthorizeUI.d(AppBrandAuthorizeUI.this), AppBrandAuthorizeUI.this.iFC, parama);
          }
          AppMethodBeat.o(132905);
        }
      });
      AppMethodBeat.o(132912);
    }
  }

  private void aMc()
  {
    AppMethodBeat.i(132917);
    if (!this.iFH)
      AppMethodBeat.o(132917);
    while (true)
    {
      return;
      JSONArray localJSONArray = new JSONArray();
      Object localObject = this.iFC.iterator();
      while (((Iterator)localObject).hasNext())
      {
        fu localfu = (fu)((Iterator)localObject).next();
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("scope", localfu.scope);
          localJSONObject.put("state", localfu.state);
          localJSONObject.put("desc", localfu.vHE);
          localJSONArray.put(localJSONObject);
        }
        catch (JSONException localJSONException)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandAuthorizeUI", localJSONException, "", new Object[0]);
        }
      }
      ab.d("MicroMsg.AppBrandAuthorizeUI", "authInfo %s", new Object[] { localJSONArray });
      localObject = new Intent();
      ((Intent)localObject).putExtra("key_app_authorize_state", localJSONArray.toString());
      setResult(-1, (Intent)localObject);
      AppMethodBeat.o(132917);
    }
  }

  private void eD(boolean paramBoolean)
  {
    AppMethodBeat.i(132913);
    runOnUiThread(new AppBrandAuthorizeUI.5(this, paramBoolean));
    AppMethodBeat.o(132913);
  }

  public final int JC()
  {
    return 2131165190;
  }

  public final boolean a(final f paramf, final Preference paramPreference)
  {
    AppMethodBeat.i(132911);
    ab.d("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClcik.(key : %s)", new Object[] { paramPreference.mKey });
    if (this.iFC == null)
    {
      ab.w("MicroMsg.AppBrandAuthorizeUI", "mAuthItem == null");
      AppMethodBeat.o(132911);
    }
    while (true)
    {
      return false;
      String str = paramPreference.mKey;
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.AppBrandAuthorizeUI", "key is null");
        AppMethodBeat.o(132911);
      }
      else
      {
        Iterator localIterator = this.iFC.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (fu)localIterator.next();
          if (str.equals(bo.nullAsNil(((fu)localObject).scope)))
          {
            this.iFF = true;
            if (((CheckBoxPreference)paramPreference).isChecked())
            {
              ((fu)localObject).state = 1;
              a(new AppBrandAuthorizeUI.8(this, paramPreference, paramf, (fu)localObject));
            }
            else if (this.iFG)
            {
              this.iFG = false;
              c.a locala = new c.a(this);
              locala.asE(getString(2131296559));
              locala.asJ(getString(2131296558));
              locala.a(new AppBrandAuthorizeUI.9(this, (fu)localObject, paramPreference, paramf));
              locala.asK(getString(2131296868));
              locala.b(new AppBrandAuthorizeUI.10(this, (fu)localObject, paramPreference, paramf));
              locala.f(new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                {
                  AppMethodBeat.i(132903);
                  ab.d("MicroMsg.AppBrandAuthorizeUI", "on cancel click!");
                  this.iFS.state = 1;
                  ((CheckBoxPreference)paramPreference).uOT = true;
                  paramf.notifyDataSetChanged();
                  AppMethodBeat.o(132903);
                }
              });
              localObject = locala.aMb();
              ((c)localObject).setCanceledOnTouchOutside(false);
              ((c)localObject).show();
            }
            else
            {
              ((fu)localObject).state = 2;
              a(new AppBrandAuthorizeUI.12(this, paramPreference, paramf, (fu)localObject));
            }
          }
        }
        AppMethodBeat.o(132911);
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(132915);
    ab.d("MicroMsg.AppBrandAuthorizeUI", "onBackPressed !");
    aMc();
    super.onBackPressed();
    AppMethodBeat.o(132915);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(132910);
    this.yll = true;
    super.onCreate(paramBundle);
    setBackBtn(new AppBrandAuthorizeUI.1(this));
    setMMTitle(2131296568);
    xE(this.mController.dyj());
    this.iFE = this.yCw;
    paramBundle = getIntent().getStringExtra("key_username");
    this.igi = paramBundle;
    if (bo.isNullOrNil(paramBundle))
    {
      finish();
      AppMethodBeat.o(132910);
    }
    while (true)
    {
      return;
      this.iFH = getIntent().getBooleanExtra("key_app_authorize_jsapi", false);
      this.iFD = com.tencent.mm.plugin.appbrand.config.p.zh(this.igi);
      if (this.iFD == null)
      {
        ab.e("MicroMsg.AppBrandAuthorizeUI", "AppBrandBizInfo is Null");
        AppMethodBeat.o(132910);
      }
      else
      {
        this.mAppId = this.iFD.appId;
        String str = this.mAppId;
        paramBundle = new b.a();
        paramBundle.fsJ = new cwh();
        paramBundle.fsK = new cwi();
        paramBundle.uri = "/cgi-bin/mmbiz-bin/wxaapp_getauthinfo";
        paramBundle.fsI = 1115;
        paramBundle.fsL = 0;
        paramBundle.fsM = 0;
        cwh localcwh = new cwh();
        localcwh.appId = str;
        paramBundle.fsJ = localcwh;
        w.a(paramBundle.acD(), new AppBrandAuthorizeUI.14(this), true);
        AppMethodBeat.o(132910);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(132916);
    super.onDestroy();
    AppMethodBeat.o(132916);
  }

  public void onPause()
  {
    AppMethodBeat.i(132914);
    if (this.iFF)
      ab.d("MicroMsg.AppBrandAuthorizeUI", "onPause key change!");
    super.onPause();
    AppMethodBeat.o(132914);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI
 * JD-Core Version:    0.6.2
 */