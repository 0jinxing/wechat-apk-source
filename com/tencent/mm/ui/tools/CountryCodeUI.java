package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.au.b.a;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import java.util.Collections;
import java.util.List;

public class CountryCodeUI extends MMActivity
{
  private String countryCode;
  private o elS;
  private String fHE;
  private String gBE;
  private String gtX = "";
  private List<b.a> list;
  private boolean nBL = false;
  private ListView nCa;
  private String title = null;
  private c zAL;
  private VerticalScrollBar zAM;
  private String[] zAN = null;
  private VerticalScrollBar.a zkw;

  private void dJB()
  {
    AppMethodBeat.i(34810);
    this.list = b.G(this, getString(2131298789));
    if ((this.zAN != null) && (this.zAN.length > 0))
    {
      int i = this.list.size() - 1;
      if (i >= 0)
      {
        String str = ((b.a)this.list.get(i)).fHC;
        String[] arrayOfString = this.zAN;
        int j = arrayOfString.length;
        int k = 0;
        label79: if (k < j)
          if (arrayOfString[k].equals(str))
            ab.i("MicroMsg.CountryCodeUI", "exclude country: %s", new Object[] { str });
        for (k = 1; ; k = 0)
        {
          if (k != 0)
            this.list.remove(i);
          i--;
          break;
          k++;
          break label79;
        }
      }
    }
    if (!aa.dop())
    {
      Collections.sort(this.list, new CountryCodeUI.1(this));
      AppMethodBeat.o(34810);
    }
    while (true)
    {
      return;
      Collections.sort(this.list, new CountryCodeUI.2(this));
      AppMethodBeat.o(34810);
    }
  }

  public final int getLayoutId()
  {
    AppMethodBeat.i(34808);
    int i;
    if (aa.dop())
    {
      i = 2130969250;
      AppMethodBeat.o(34808);
    }
    while (true)
    {
      return i;
      i = 2130969249;
      AppMethodBeat.o(34808);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(34811);
    if (!bo.isNullOrNil(this.title))
    {
      setMMTitle(this.title);
      dJB();
      this.elS = new o((byte)0);
      this.elS.zHa = new CountryCodeUI.3(this);
      a(this.elS);
      this.nCa = ((ListView)findViewById(2131821054));
      this.zAL = new c(this, this.list);
      this.zAL.nBL = this.nBL;
      this.nCa.setAdapter(this.zAL);
      this.nCa.setVisibility(0);
      this.zAM = ((VerticalScrollBar)findViewById(2131821057));
      if (aa.dop())
        break label205;
    }
    label205: for (this.zkw = new CountryCodeUI.4(this); ; this.zkw = new CountryCodeUI.5(this))
    {
      this.zAM.setOnScrollBarTouchListener(this.zkw);
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(34805);
          CountryCodeUI.this.aqX();
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("country_name", CountryCodeUI.d(CountryCodeUI.this));
          paramAnonymousMenuItem.putExtra("couttry_code", CountryCodeUI.e(CountryCodeUI.this));
          paramAnonymousMenuItem.putExtra("iso_code", CountryCodeUI.f(CountryCodeUI.this));
          CountryCodeUI.this.setResult(100, paramAnonymousMenuItem);
          CountryCodeUI.this.finish();
          AppMethodBeat.o(34805);
          return true;
        }
      });
      this.nCa.setOnItemClickListener(new CountryCodeUI.7(this));
      AppMethodBeat.o(34811);
      return;
      setMMTitle(2131296487);
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34807);
    super.onCreate(paramBundle);
    this.fHE = ah.bc(getIntent().getStringExtra("country_name"), "");
    this.countryCode = ah.bc(getIntent().getStringExtra("couttry_code"), "");
    this.gBE = ah.bc(getIntent().getStringExtra("iso_code"), "");
    this.nBL = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", true);
    this.zAN = getIntent().getStringArrayExtra("exclude_countries_iso");
    this.title = getIntent().getStringExtra("ui_title");
    initView();
    AppMethodBeat.o(34807);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(34812);
    boolean bool;
    if (paramInt == 4)
    {
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("country_name", this.fHE);
      paramKeyEvent.putExtra("couttry_code", this.countryCode);
      paramKeyEvent.putExtra("iso_code", this.gBE);
      setResult(100, paramKeyEvent);
      finish();
      bool = true;
      AppMethodBeat.o(34812);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(34812);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(34809);
    super.onPause();
    if (this.elS != null)
      this.elS.dJS();
    AppMethodBeat.o(34809);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CountryCodeUI
 * JD-Core Version:    0.6.2
 */