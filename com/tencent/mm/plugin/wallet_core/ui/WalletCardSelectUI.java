package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.t;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WalletCardSelectUI extends WalletBaseUI
{
  private CheckedTextView tGA;
  private String tGB;
  private int tGC;
  private int tGD;
  private int tGE;
  private WalletCardSelectUI.a tGF;
  private MaxListView tGG;
  private List<ElementQuery> tGx;
  private List<ElementQuery> tGy;
  private CheckedTextView tGz;
  private int tmh;
  private int trC;

  public WalletCardSelectUI()
  {
    AppMethodBeat.i(47307);
    this.tGx = new LinkedList();
    this.tGy = new LinkedList();
    this.trC = 3;
    this.tGD = -1;
    this.tGE = -1;
    this.tmh = -1;
    AppMethodBeat.o(47307);
  }

  private void nj(boolean paramBoolean)
  {
    AppMethodBeat.i(47310);
    this.tGG.setVisibility(0);
    if (paramBoolean)
    {
      this.tGz.setChecked(true);
      this.tGA.setChecked(false);
      this.tGF.items = this.tGx;
      this.tGF.notifyDataSetChanged();
      this.tGG.clearChoices();
      if (this.tGD >= 0)
      {
        this.tGG.setItemChecked(this.tGD, true);
        enableOptionMenu(true);
        AppMethodBeat.o(47310);
      }
    }
    while (true)
    {
      return;
      enableOptionMenu(false);
      AppMethodBeat.o(47310);
      continue;
      this.tGz.setChecked(false);
      this.tGA.setChecked(true);
      this.tGF.items = this.tGy;
      this.tGF.notifyDataSetChanged();
      this.tGG.clearChoices();
      if (this.tGE >= 0)
      {
        this.tGG.setItemChecked(this.tGE, true);
        enableOptionMenu(true);
        AppMethodBeat.o(47310);
      }
      else
      {
        enableOptionMenu(false);
        AppMethodBeat.o(47310);
      }
    }
  }

  public final boolean bNf()
  {
    return false;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971077;
  }

  public final void initView()
  {
    AppMethodBeat.i(47309);
    this.tGB = this.mBundle.getString("key_bank_type");
    this.tGC = this.mBundle.getInt("key_bankcard_type", 1);
    this.trC = this.mBundle.getInt("key_support_bankcard", 1);
    this.tmh = this.mBundle.getInt("key_bind_scene", -1);
    this.tGG = ((MaxListView)findViewById(2131828743));
    this.tGz = ((CheckedTextView)findViewById(2131828741));
    this.tGA = ((CheckedTextView)findViewById(2131828742));
    this.tGF = new WalletCardSelectUI.a(this, this);
    this.tGG.setAdapter(this.tGF);
    this.tGG.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(47296);
        paramAnonymousAdapterView = WalletCardSelectUI.a(WalletCardSelectUI.this).Hv(paramAnonymousInt);
        if (!bo.isNullOrNil(paramAnonymousAdapterView.tyK))
        {
          h.a(WalletCardSelectUI.this, paramAnonymousAdapterView.tyK, null, true, null);
          AppMethodBeat.o(47296);
          return;
        }
        if (paramAnonymousAdapterView.cPr())
          WalletCardSelectUI.a(WalletCardSelectUI.this, paramAnonymousInt);
        while (true)
        {
          WalletCardSelectUI.this.enableOptionMenu(true);
          AppMethodBeat.o(47296);
          break;
          WalletCardSelectUI.b(WalletCardSelectUI.this, paramAnonymousInt);
        }
      }
    });
    setBackBtn(new WalletCardSelectUI.2(this));
    a(0, getString(2131296944), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(47298);
        Object localObject = null;
        Intent localIntent = new Intent();
        if ((WalletCardSelectUI.b(WalletCardSelectUI.this).isChecked()) && (WalletCardSelectUI.c(WalletCardSelectUI.this) >= 0))
        {
          paramAnonymousMenuItem = (ElementQuery)WalletCardSelectUI.d(WalletCardSelectUI.this).get(WalletCardSelectUI.c(WalletCardSelectUI.this));
          if (paramAnonymousMenuItem == null)
            break label149;
          localIntent.putExtra("elemt_query", paramAnonymousMenuItem);
          WalletCardSelectUI.this.setResult(-1, localIntent);
        }
        while (true)
        {
          WalletCardSelectUI.this.finish();
          AppMethodBeat.o(47298);
          return true;
          paramAnonymousMenuItem = localObject;
          if (!WalletCardSelectUI.e(WalletCardSelectUI.this).isChecked())
            break;
          paramAnonymousMenuItem = localObject;
          if (WalletCardSelectUI.f(WalletCardSelectUI.this) < 0)
            break;
          paramAnonymousMenuItem = (ElementQuery)WalletCardSelectUI.g(WalletCardSelectUI.this).get(WalletCardSelectUI.f(WalletCardSelectUI.this));
          break;
          label149: WalletCardSelectUI.this.setResult(0);
        }
      }
    }
    , q.b.ymu);
    enableOptionMenu(false);
    this.tGz.setOnClickListener(new WalletCardSelectUI.4(this));
    this.tGA.setOnClickListener(new WalletCardSelectUI.5(this));
    AppMethodBeat.o(47309);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47308);
    super.onCreate(paramBundle);
    setMMTitle(2131304718);
    initView();
    this.tGy.clear();
    this.tGx.clear();
    if (r.cPQ().tum != null)
    {
      paramBundle = r.cPQ().tum.iterator();
      while (paramBundle.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)paramBundle.next();
        if ((this.tmh == 5) && (!localElementQuery.tza))
          localElementQuery.tyK = getString(2131305455);
        if (localElementQuery.cPe())
          this.tGy.add(localElementQuery);
        else if (localElementQuery.cPr())
          this.tGx.add(localElementQuery);
      }
    }
    if ((this.trC == 3) && (!this.tGy.isEmpty()))
    {
      if (!r.cPI().cQp())
        break label242;
      Collections.sort(this.tGy, new WalletCardSelectUI.6(this));
    }
    while (!this.tGx.isEmpty())
      if (bo.isNullOrNil(this.tGB))
      {
        this.tGz.setChecked(false);
        this.tGA.setChecked(false);
        this.tGG.setVisibility(8);
        AppMethodBeat.o(47308);
        return;
        label242: Collections.sort(this.tGy, new WalletCardSelectUI.7(this));
      }
      else
      {
        if (this.tGC == 2)
        {
          i = this.tGy.size();
          for (j = 0; ; j++)
            if (j < i)
            {
              if (((ElementQuery)this.tGy.get(j)).pbn.equals(this.tGB))
              {
                this.tGE = j;
                nj(false);
                enableOptionMenu(true);
              }
            }
            else
            {
              if (this.tGE < 0)
              {
                nj(false);
                enableOptionMenu(false);
              }
              AppMethodBeat.o(47308);
              break;
            }
        }
        i = this.tGx.size();
        for (j = 0; ; j++)
          if (j < i)
          {
            if (((ElementQuery)this.tGx.get(j)).pbn.equals(this.tGB))
            {
              this.tGD = j;
              nj(true);
              enableOptionMenu(true);
            }
          }
          else
          {
            if (this.tGD < 0)
            {
              nj(false);
              enableOptionMenu(false);
            }
            AppMethodBeat.o(47308);
            break;
          }
      }
    int i = this.tGy.size();
    for (int j = 0; ; j++)
      if (j < i)
      {
        if (((ElementQuery)this.tGy.get(j)).pbn.equals(this.tGB))
        {
          this.tGE = j;
          nj(false);
          enableOptionMenu(true);
        }
      }
      else
      {
        if (this.tGE < 0)
        {
          nj(false);
          enableOptionMenu(false);
        }
        this.tGz.setVisibility(8);
        this.tGA.setBackgroundResource(2130838396);
        this.tGA.setCheckMarkDrawable(2130840056);
        AppMethodBeat.o(47308);
        break;
      }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI
 * JD-Core Version:    0.6.2
 */