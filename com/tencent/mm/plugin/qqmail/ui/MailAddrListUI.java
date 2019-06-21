package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.o.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MailAddrListUI extends MMActivity
{
  private TextView gya;
  private com.tencent.mm.plugin.qqmail.b.p puD;
  private com.tencent.mm.ui.base.p pyj;
  private TextView pyk;
  private ListView pyl;
  private MailAddrListUI.a pym;
  private List<com.tencent.mm.plugin.qqmail.b.o> pyn;
  private p.a pyo;

  public MailAddrListUI()
  {
    AppMethodBeat.i(68327);
    this.pyj = null;
    this.gya = null;
    this.pyk = null;
    this.puD = null;
    this.pyo = new p.a()
    {
      public final void onComplete()
      {
        AppMethodBeat.i(68311);
        if (MailAddrListUI.a(MailAddrListUI.this) != null)
          MailAddrListUI.a(MailAddrListUI.this).dismiss();
        MailAddrListUI.a(MailAddrListUI.this, MailAddrListUI.b(MailAddrListUI.this).Vi(null));
        if (MailAddrListUI.c(MailAddrListUI.this).size() == 0)
        {
          MailAddrListUI.d(MailAddrListUI.this).setText(2131303230);
          MailAddrListUI.d(MailAddrListUI.this).setVisibility(0);
        }
        Object localObject1 = MailAddrListUI.this.getIntent().getStringArrayExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA");
        if (localObject1 == null)
          localObject1 = new String[] { "" };
        while (true)
        {
          int i = localObject1.length;
          int j = 0;
          com.tencent.mm.plugin.qqmail.b.o localo;
          Object localObject2;
          Object localObject3;
          if (j < i)
          {
            localo = com.tencent.mm.plugin.qqmail.b.p.Vj(localObject1[j]);
            if (localo != null)
            {
              localObject2 = MailAddrListUI.c(MailAddrListUI.this).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject3 = (com.tencent.mm.plugin.qqmail.b.o)((Iterator)localObject2).next();
                if (((com.tencent.mm.plugin.qqmail.b.o)localObject3).nJq.equalsIgnoreCase(localo.nJq))
                  MailAddrListUI.e(MailAddrListUI.this).c((com.tencent.mm.plugin.qqmail.b.o)localObject3);
              }
            }
          }
          for (int k = 1; ; k = 0)
          {
            if (k == 0)
              MailAddrListUI.e(MailAddrListUI.this).c(localo);
            j++;
            break;
            localObject3 = MailAddrListUI.this;
            localObject2 = new StringBuilder().append(MailAddrListUI.this.getString(2131301962));
            if (MailAddrListUI.e(MailAddrListUI.this).cdf() > 0);
            for (localObject1 = "(" + MailAddrListUI.e(MailAddrListUI.this).cdf() + ")"; ; localObject1 = "")
            {
              ((MailAddrListUI)localObject3).setMMTitle((String)localObject1);
              MailAddrListUI.e(MailAddrListUI.this).notifyDataSetChanged();
              AppMethodBeat.o(68311);
              return;
            }
          }
        }
      }
    };
    AppMethodBeat.o(68327);
  }

  public final int getLayoutId()
  {
    return 2130970423;
  }

  public final void initView()
  {
    AppMethodBeat.i(68329);
    this.pyl = ((ListView)findViewById(2131826685));
    this.gya = ((TextView)findViewById(2131825025));
    this.pyk = ((TextView)findViewById(2131826686));
    this.pym = new MailAddrListUI.a(this, this);
    Object localObject = new com.tencent.mm.ui.tools.o((byte)0);
    ((com.tencent.mm.ui.tools.o)localObject).zHa = new o.b()
    {
      public final void apo()
      {
      }

      public final void app()
      {
      }

      public final void apq()
      {
      }

      public final void apr()
      {
      }

      public final boolean vN(String paramAnonymousString)
      {
        return false;
      }

      public final void vO(String paramAnonymousString)
      {
        AppMethodBeat.i(68312);
        paramAnonymousString = bo.bc(paramAnonymousString, "");
        MailAddrListUI.a(MailAddrListUI.this, MailAddrListUI.b(MailAddrListUI.this).Vi(paramAnonymousString.toLowerCase().trim()));
        if (paramAnonymousString.length() > 0)
        {
          MailAddrListUI.e(MailAddrListUI.this).pyr = true;
          MailAddrListUI.e(MailAddrListUI.this).pyq = false;
          if (MailAddrListUI.c(MailAddrListUI.this).size() != 0)
            break label130;
          MailAddrListUI.this.enableOptionMenu(false);
          MailAddrListUI.f(MailAddrListUI.this).setVisibility(0);
        }
        while (true)
        {
          MailAddrListUI.e(MailAddrListUI.this).notifyDataSetChanged();
          AppMethodBeat.o(68312);
          return;
          MailAddrListUI.e(MailAddrListUI.this).pyr = false;
          break;
          label130: MailAddrListUI.this.enableOptionMenu(true);
          MailAddrListUI.f(MailAddrListUI.this).setVisibility(8);
        }
      }
    };
    a((com.tencent.mm.ui.tools.o)localObject);
    this.pyl.setAdapter(this.pym);
    this.pyl.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(68313);
        paramAnonymousAdapterView = MailAddrListUI.e(MailAddrListUI.this);
        paramAnonymousView = paramAnonymousAdapterView.Bu(paramAnonymousInt - MailAddrListUI.g(MailAddrListUI.this).getHeaderViewsCount());
        Object localObject = paramAnonymousView.nJq;
        if (paramAnonymousAdapterView.pys.containsKey(localObject))
        {
          paramAnonymousAdapterView.pys.remove(localObject);
          paramAnonymousAdapterView.notifyDataSetChanged();
          paramAnonymousView = MailAddrListUI.this;
          localObject = new StringBuilder().append(MailAddrListUI.this.getString(2131301962));
          if (MailAddrListUI.e(MailAddrListUI.this).cdf() <= 0)
            break label171;
        }
        label171: for (paramAnonymousAdapterView = "(" + MailAddrListUI.e(MailAddrListUI.this).cdf() + ")"; ; paramAnonymousAdapterView = "")
        {
          paramAnonymousView.setMMTitle(paramAnonymousAdapterView);
          AppMethodBeat.o(68313);
          return;
          paramAnonymousAdapterView.pys.put(localObject, paramAnonymousView);
          break;
        }
      }
    });
    this.pyl.setOnScrollListener(new MailAddrListUI.4(this));
    this.pyn = this.puD.Vi(null);
    this.pym.notifyDataSetChanged();
    setBackBtn(new MailAddrListUI.5(this));
    new MailAddrListUI.6(this);
    addTextOptionMenu(0, getString(2131301961), new MailAddrListUI.7(this));
    if (!this.pyn.isEmpty());
    for (boolean bool = true; ; bool = false)
    {
      enableOptionMenu(bool);
      localObject = this.mController.ylL;
      getString(2131297061);
      this.pyj = h.b((Context)localObject, getString(2131301960), true, new MailAddrListUI.8(this));
      AppMethodBeat.o(68329);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(68328);
    super.onCreate(paramBundle);
    setMMTitle(2131301962);
    this.pyn = new ArrayList();
    this.puD = ac.ccC().puD;
    initView();
    this.puD.a(this.pyo);
    this.puD.ccq();
    AppMethodBeat.o(68328);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(68332);
    super.onDestroy();
    this.puD.b(this.pyo);
    AppMethodBeat.o(68332);
  }

  public void onPause()
  {
    AppMethodBeat.i(68330);
    super.onPause();
    AppMethodBeat.o(68330);
  }

  public void onResume()
  {
    AppMethodBeat.i(68331);
    super.onResume();
    this.pym.notifyDataSetChanged();
    AppMethodBeat.o(68331);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrListUI
 * JD-Core Version:    0.6.2
 */