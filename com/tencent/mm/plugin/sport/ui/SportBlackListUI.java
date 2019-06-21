package com.tencent.mm.plugin.sport.ui;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.sport.a.d;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SportBlackListUI extends MMPreference
{
  private ContactListExpandPreference ehS;
  private List<String> rPT;
  private ContactListExpandPreference.a rPU;

  public SportBlackListUI()
  {
    AppMethodBeat.i(25141);
    this.rPU = new SportBlackListUI.2(this);
    AppMethodBeat.o(25141);
  }

  public final int JC()
  {
    return 2131165301;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    return false;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(25143);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 0)
      if (paramIntent == null)
        AppMethodBeat.o(25143);
    while (true)
    {
      return;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (bo.isNullOrNil(paramIntent))
      {
        AppMethodBeat.o(25143);
      }
      else
      {
        paramIntent = bo.P(paramIntent.split(","));
        if (paramIntent == null)
        {
          AppMethodBeat.o(25143);
        }
        else
        {
          this.rPT.addAll(paramIntent);
          this.ehS.u(null, this.rPT);
          this.ehS.refresh();
          paramIntent = paramIntent.iterator();
          while (paramIntent.hasNext())
          {
            String str = (String)paramIntent.next();
            aw.ZK();
            t.g(c.XM().aoO(str));
          }
          AppMethodBeat.o(25143);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25142);
    super.onCreate(paramBundle);
    d.kT(39);
    if (this.rPT == null)
      this.rPT = new ArrayList();
    aw.ZK();
    Cursor localCursor = c.XM().d("@werun.black.android", "", null);
    while (localCursor.moveToNext())
    {
      paramBundle = localCursor.getString(0);
      this.rPT.add(paramBundle);
    }
    localCursor.close();
    this.ehS = ((ContactListExpandPreference)this.yCw.aqO("black_contact_list_pref"));
    this.ehS.a(this.yCw, this.ehS.mKey);
    this.ehS.oD(true).oE(true);
    this.ehS.u(null, this.rPT);
    this.ehS.a(this.rPU);
    this.ehS.setSummary(2131299399);
    setMMTitle(getString(2131299350));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(25136);
        SportBlackListUI.this.finish();
        AppMethodBeat.o(25136);
        return false;
      }
    });
    AppMethodBeat.o(25142);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.ui.SportBlackListUI
 * JD-Core Version:    0.6.2
 */