package com.tencent.mm.plugin.subapp.ui.openapi;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import java.util.ArrayList;
import java.util.List;

public class ServiceAppUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private ServicePreference suH;
  private ServicePreference suI;
  private PreferenceTitleCategory suJ;
  private PreferenceTitleCategory suK;
  private List<com.tencent.mm.pluginsdk.model.app.f> suL;
  private List<com.tencent.mm.pluginsdk.model.app.f> suM;
  private AdapterView.OnItemClickListener suN;
  private AdapterView.OnItemClickListener suO;
  private String talker;

  public ServiceAppUI()
  {
    AppMethodBeat.i(25474);
    this.suL = new ArrayList();
    this.suM = new ArrayList();
    AppMethodBeat.o(25474);
  }

  private void cDN()
  {
    AppMethodBeat.i(25479);
    this.suL.clear();
    this.suM.clear();
    Cursor localCursor;
    if (t.kH(this.talker))
    {
      localCursor = am.bYJ().eQ(0, 2);
      if (localCursor != null)
        if (!localCursor.moveToFirst());
    }
    label164: 
    while (true)
    {
      com.tencent.mm.pluginsdk.model.app.f localf = new com.tencent.mm.pluginsdk.model.app.f();
      localf.d(localCursor);
      if (localf.field_serviceAppType == 1)
        this.suL.add(localf);
      while (true)
      {
        if (localCursor.moveToNext())
          break label164;
        localCursor.close();
        AppMethodBeat.o(25479);
        return;
        if (t.mZ(this.talker))
        {
          localCursor = am.bYJ().eQ(0, 4);
          break;
        }
        localCursor = am.bYJ().eQ(0, 1);
        break;
        if (localf.field_serviceAppType == 2)
          this.suM.add(localf);
      }
    }
  }

  private void cDO()
  {
    AppMethodBeat.i(25481);
    if (this.suN == null)
      this.suN = new ServiceAppUI.2(this);
    if (this.suO == null)
      this.suO = new ServiceAppUI.3(this);
    AppMethodBeat.o(25481);
  }

  public final int JC()
  {
    return 2131165268;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    return false;
  }

  public final void initView()
  {
    AppMethodBeat.i(25478);
    setMMTitle(2131302967);
    this.talker = getIntent().getStringExtra("service_app_talker_user");
    setBackBtn(new ServiceAppUI.1(this));
    cDN();
    cDO();
    this.ehK = this.yCw;
    this.ehK.removeAll();
    if (this.suL.size() > 0)
    {
      this.suH = new ServicePreference(this);
      this.suH.qnw = this.suL;
      if (this.suN != null)
        this.suH.suz = this.suN;
      if (this.suJ == null)
      {
        this.suJ = new PreferenceTitleCategory(this);
        this.suJ.setTitle(2131305735);
      }
      this.ehK.b(this.suJ);
      this.ehK.b(this.suH);
    }
    if (this.suM.size() > 0)
    {
      this.suI = new ServicePreference(this);
      this.suI.qnw = this.suM;
      if (this.suO != null)
        this.suI.suz = this.suO;
      if (this.suK == null)
      {
        this.suK = new PreferenceTitleCategory(this);
        this.suK.setTitle(2131297653);
      }
      this.ehK.b(this.suK);
      this.ehK.b(this.suI);
    }
    AppMethodBeat.o(25478);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25475);
    super.onCreate(paramBundle);
    AppMethodBeat.o(25475);
  }

  public void onPause()
  {
    AppMethodBeat.i(25477);
    super.onPause();
    if (this.suH != null)
      this.suH.onPause();
    if (this.suI != null)
      this.suI.onPause();
    AppMethodBeat.o(25477);
  }

  public void onResume()
  {
    AppMethodBeat.i(25476);
    super.onResume();
    initView();
    if (this.suH != null)
      this.suH.onResume();
    if (this.suI != null)
      this.suI.onResume();
    AppMethodBeat.o(25476);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(25480);
    ab.d("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      AppMethodBeat.o(25480);
    while (true)
    {
      return;
      ab.e("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
      AppMethodBeat.o(25480);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI
 * JD-Core Version:    0.6.2
 */