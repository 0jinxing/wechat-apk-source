package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.ipcall.a.c;
import com.tencent.mm.plugin.ipcall.b.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class IPCallCountryCodeSelectUI extends MMActivity
{
  private String countryCode;
  private o elS;
  private String fHE;
  private String gtX = "";
  private List<a> list;
  public LinearLayout nBB;
  private boolean nBL = false;
  private ListView nCa;
  private f nCb;
  private IPCallCountryCodeScrollbar nCc;
  private IPCallCountryCodeScrollbar.a nCd;
  private boolean nCe = false;

  public void finish()
  {
    AppMethodBeat.i(22119);
    super.finish();
    overridePendingTransition(-1, 2131034227);
    AppMethodBeat.o(22119);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969885;
  }

  public final void initView()
  {
    AppMethodBeat.i(22121);
    setMMTitle(2131296487);
    this.elS = new o((byte)0);
    this.elS.zHa = new IPCallCountryCodeSelectUI.2(this);
    a(this.elS);
    this.nCc = ((IPCallCountryCodeScrollbar)findViewById(2131821057));
    long l = System.currentTimeMillis();
    Object localObject1 = c.bHc().bHf().iterator();
    int i = 0;
    int j;
    Object localObject2;
    if (((Iterator)localObject1).hasNext())
    {
      j = ((Integer)((Iterator)localObject1).next()).intValue();
      if (i < 5)
      {
        localObject2 = com.tencent.mm.plugin.ipcall.b.a.Pq(String.valueOf(j));
        if ((bo.isNullOrNil((String)localObject2)) || (c.bHc().xf(j)))
          break label803;
        this.list.add(new a((String)localObject2, String.valueOf(j), 0, "0"));
        i++;
      }
    }
    label803: 
    while (true)
    {
      break;
      if (i > 0)
        this.nCe = true;
      Iterator localIterator;
      b localb;
      if (aa.don())
      {
        localIterator = com.tencent.mm.plugin.ipcall.b.a.bIM().entrySet().iterator();
        if (localIterator.hasNext())
        {
          localObject2 = (Map.Entry)localIterator.next();
          ((Map.Entry)localObject2).getKey();
          localb = (b)((Map.Entry)localObject2).getValue();
          localObject1 = localb.nHe;
          localObject2 = localObject1;
          if (localObject1 != null)
            if (!"".equals(((String)localObject1).trim()))
              break label345;
          for (localObject2 = localObject1; ; localObject2 = ((StringBuffer)localObject2).toString())
          {
            localObject1 = ((String)localObject2).toUpperCase();
            localObject2 = localObject1;
            if (bo.isNullOrNil((String)localObject1))
              localObject2 = " ";
            if (c.bHc().xf(bo.getInt(localb.nHd, 0)))
              break;
            this.list.add(new a(localb.nHe, localb.nHd, ((String)localObject2).charAt(0), (String)localObject2));
            break;
            label345: localObject1 = ((String)localObject1).toCharArray();
            localObject2 = new StringBuffer();
            j = localObject1.length;
            i = 0;
            if (i < j)
            {
              String str = SpellMap.r(localObject1[i]);
              if (!bo.isNullOrNil(str))
                ((StringBuffer)localObject2).append(str);
              while (true)
              {
                i++;
                break;
                ((StringBuffer)localObject2).append(localObject1[i]);
              }
            }
          }
        }
      }
      else
      {
        localIterator = com.tencent.mm.plugin.ipcall.b.a.bIM().entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (Map.Entry)localIterator.next();
          ((Map.Entry)localObject2).getKey();
          localb = (b)((Map.Entry)localObject2).getValue();
          localObject1 = localb.nHe.toUpperCase();
          localObject2 = localObject1;
          if (bo.isNullOrNil((String)localObject1))
            localObject2 = " ";
          if (!c.bHc().xf(bo.getInt(localb.nHd, 0)))
            this.list.add(new a(localb.nHe, localb.nHd, ((String)localObject2).charAt(0), (String)localObject2));
        }
      }
      Collections.sort(this.list, new IPCallCountryCodeSelectUI.6(this));
      localObject2 = this.list.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        i = ((a)((Iterator)localObject2).next()).bIc();
        if (i != 0)
        {
          char c = (char)i;
          this.nCc.Pf(String.valueOf(c));
        }
      }
      ab.d("MicroMsg.IPCallCountryCodeSelectUI", "initCountryCode used: %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      this.nBB = ((LinearLayout)findViewById(2131825037));
      this.nCa = ((ListView)findViewById(2131821054));
      this.nCb = new f(this, this.list);
      this.nCb.nBL = this.nBL;
      this.nCb.nBM = this.nCe;
      this.nCa.setAdapter(this.nCb);
      this.nCa.setVisibility(0);
      this.nCd = new IPCallCountryCodeScrollbar.a()
      {
        public final void kp(String paramAnonymousString)
        {
          int i = 0;
          AppMethodBeat.i(22114);
          int j = paramAnonymousString.charAt(0);
          if ("↑".equals(paramAnonymousString))
          {
            IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).setSelection(0);
            AppMethodBeat.o(22114);
          }
          while (true)
          {
            return;
            paramAnonymousString = IPCallCountryCodeSelectUI.c(IPCallCountryCodeSelectUI.this).nBK;
            if (paramAnonymousString == null)
            {
              AppMethodBeat.o(22114);
            }
            else
            {
              do
              {
                i++;
                if (i >= paramAnonymousString.length)
                  break;
              }
              while (paramAnonymousString[i] != j);
              IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).setSelection(i + IPCallCountryCodeSelectUI.b(IPCallCountryCodeSelectUI.this).getHeaderViewsCount());
              AppMethodBeat.o(22114);
              continue;
              AppMethodBeat.o(22114);
            }
          }
        }
      };
      this.nCc.setOnScrollBarTouchListener(this.nCd);
      setBackBtn(new IPCallCountryCodeSelectUI.4(this));
      this.nCa.setOnItemClickListener(new IPCallCountryCodeSelectUI.5(this));
      AppMethodBeat.o(22121);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22118);
    super.onCreate(paramBundle);
    this.list = new ArrayList();
    this.fHE = bo.bc(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bo.bc(getIntent().getStringExtra("couttry_code"), "");
    this.nBL = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", false);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(22111);
        IPCallCountryCodeSelectUI.this.finish();
        AppMethodBeat.o(22111);
        return false;
      }
    });
    initView();
    AppMethodBeat.o(22118);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(22122);
    boolean bool;
    if (paramInt == 4)
    {
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("country_name", this.fHE);
      paramKeyEvent.putExtra("couttry_code", this.countryCode);
      setResult(100, paramKeyEvent);
      finish();
      bool = true;
      AppMethodBeat.o(22122);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(22122);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(22120);
    super.onPause();
    if (this.elS != null)
      this.elS.dJS();
    AppMethodBeat.o(22120);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI
 * JD-Core Version:    0.6.2
 */