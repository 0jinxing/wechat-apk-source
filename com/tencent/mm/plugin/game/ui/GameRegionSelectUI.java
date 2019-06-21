package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.a;
import com.tencent.mm.plugin.game.f.a.a;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class GameRegionSelectUI extends MMPreference
{
  private f ehK;
  private GameRegionPreference.a nlP;
  private Map<String, GameRegionPreference.a> nlT;

  private void bFy()
  {
    AppMethodBeat.i(112164);
    this.ehK.removeAll();
    this.nlT = a.a.bFE().bFD();
    Object localObject = e.dX(this);
    if (localObject != null)
      ((GameRegionPreference.a)localObject).gBF = true;
    localObject = this.nlT.values().iterator();
    while (((Iterator)localObject).hasNext())
    {
      GameRegionPreference.a locala = (GameRegionPreference.a)((Iterator)localObject).next();
      if (locala != null)
      {
        GameRegionPreference localGameRegionPreference = new GameRegionPreference(this);
        localGameRegionPreference.b(locala);
        if (locala.isDefault)
          this.ehK.a(localGameRegionPreference, 0);
        else
          this.ehK.b(localGameRegionPreference);
      }
    }
    localObject = new PreferenceCategory(this);
    this.ehK.b((Preference)localObject);
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(112164);
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(112165);
    boolean bool;
    if ((paramPreference instanceof GameRegionPreference))
    {
      paramPreference = ((GameRegionPreference)paramPreference).nlP;
      if (paramPreference == null)
      {
        AppMethodBeat.o(112165);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      this.nlP = paramPreference;
      Iterator localIterator = this.nlT.values().iterator();
      while (localIterator.hasNext())
        ((GameRegionPreference.a)localIterator.next()).gBF = false;
      paramPreference.gBF = true;
      paramf.notifyDataSetChanged();
      AppMethodBeat.o(112165);
      bool = true;
      continue;
      AppMethodBeat.o(112165);
      bool = false;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(112163);
    setMMTitle(2131300341);
    setBackBtn(new GameRegionSelectUI.1(this));
    a(0, getString(2131300340), new GameRegionSelectUI.2(this), q.b.ymu);
    bFy();
    AppMethodBeat.o(112163);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112161);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    initView();
    AppMethodBeat.o(112161);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(112162);
    a.a.bFE().bFB();
    super.onDestroy();
    AppMethodBeat.o(112162);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameRegionSelectUI
 * JD-Core Version:    0.6.2
 */