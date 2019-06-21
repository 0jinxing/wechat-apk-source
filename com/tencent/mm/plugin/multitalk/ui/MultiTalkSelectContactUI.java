package com.tencent.mm.plugin.multitalk.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.multitalk.ui.widget.d;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.q.b;
import java.util.HashSet;

@com.tencent.mm.ui.base.a(3)
public class MultiTalkSelectContactUI extends MMBaseSelectContactUI
{
  private String chatroomName;
  private HashSet<String> gnF;
  private HashSet<String> gnG;
  private c oGA;
  private boolean oHU;
  private d oHV;
  private boolean oHW;

  public MultiTalkSelectContactUI()
  {
    AppMethodBeat.i(54161);
    this.oHW = false;
    this.oGA = new c()
    {
    };
    AppMethodBeat.o(54161);
  }

  private void Kt()
  {
    AppMethodBeat.i(54173);
    if (this.gnG.size() > 0)
    {
      enableOptionMenu(1, true);
      AppMethodBeat.o(54173);
    }
    while (true)
    {
      return;
      enableOptionMenu(1, false);
      AppMethodBeat.o(54173);
    }
  }

  public final void Kh()
  {
    AppMethodBeat.i(54162);
    super.Kh();
    this.oHU = getIntent().getBooleanExtra("key_need_gallery", false);
    this.chatroomName = getIntent().getStringExtra("chatroomName");
    if (!t.kH(this.chatroomName))
      finish();
    this.gnG = new HashSet();
    this.gnF = new HashSet();
    AppMethodBeat.o(54162);
  }

  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(54171);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.gnG.contains(parama.ehM.field_username);
      AppMethodBeat.o(54171);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54171);
    }
  }

  public final m aoA()
  {
    AppMethodBeat.i(54168);
    b localb = new b(this, this.chatroomName);
    AppMethodBeat.o(54168);
    return localb;
  }

  public final boolean aow()
  {
    return false;
  }

  public final boolean aox()
  {
    return false;
  }

  public final String aoy()
  {
    AppMethodBeat.i(54166);
    String str = getIntent().getStringExtra("titile");
    AppMethodBeat.o(54166);
    return str;
  }

  public final o aoz()
  {
    AppMethodBeat.i(54167);
    a locala = new a(this, this.chatroomName);
    AppMethodBeat.o(54167);
    return locala;
  }

  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(54172);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.gnF.contains(parama.ehM.field_username);
      AppMethodBeat.o(54172);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54172);
    }
  }

  public final void bMQ()
  {
    AppMethodBeat.i(54170);
    super.bMQ();
    aqX();
    AppMethodBeat.o(54170);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970268;
  }

  public void initView()
  {
    AppMethodBeat.i(54163);
    super.initView();
    xE(getResources().getColor(2131689913));
    dyb();
    this.oHV = new d(this);
    if (this.oHU)
      this.oHV.setVisible(true);
    while (true)
    {
      int i = 2131296994;
      if (this.oHU)
        i = 2131301566;
      a(1, getString(i), new MultiTalkSelectContactUI.1(this), q.b.ymu);
      Kt();
      this.opo.setBackgroundResource(2131689913);
      this.opo.getInputText().setTextColor(-1);
      AppMethodBeat.o(54163);
      return;
      this.oHV.setVisible(false);
    }
  }

  public final void mO(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(54169);
    n localn = dHV();
    Object localObject = localn.Pn(paramInt - getContentLV().getHeaderViewsCount());
    if (localObject == null)
      AppMethodBeat.o(54169);
    String str;
    while (true)
    {
      return;
      if (((com.tencent.mm.ui.contact.a.a)localObject).ehM == null)
      {
        AppMethodBeat.o(54169);
      }
      else
      {
        ab.i("MicroMsg.multitalk.MultiTalkSelectContactUI", "ClickUser=%s", new Object[] { ((com.tencent.mm.ui.contact.a.a)localObject).ehM.field_username });
        str = ((com.tencent.mm.ui.contact.a.a)localObject).ehM.field_username;
        if (!r.Yz().equals(str))
          break;
        AppMethodBeat.o(54169);
      }
    }
    dIb();
    d locald;
    int j;
    label147: int k;
    if (this.gnG.contains(str))
      if (this.oHU)
      {
        locald = this.oHV;
        if (locald.size != 0)
        {
          j = -1;
          paramInt = 0;
          if (paramInt >= locald.oIu.getChildCount())
            break label488;
          if (!locald.oIu.getChildAt(paramInt).getTag().equals(str))
            break label338;
          k = 1;
        }
      }
    while (true)
    {
      if (paramInt < 0)
      {
        j = 0;
        label189: if (j < locald.oIv.getChildCount())
          if (!locald.oIv.getChildAt(j).getTag().equals(str));
      }
      for (paramInt = i; ; paramInt = i)
      {
        if (j >= 0)
        {
          if (paramInt != 0)
          {
            locald.oIv.removeViewAt(j);
            locald.size -= 1;
          }
          if (k != 0)
          {
            if (locald.size <= 5)
            {
              locald.oIu.removeViewAt(j);
              locald.size -= 1;
            }
          }
          else
          {
            label292: locald.zj(locald.size);
            locald.zk(locald.size);
          }
        }
        else
        {
          this.gnG.remove(str);
        }
        while (true)
        {
          localn.notifyDataSetChanged();
          Kt();
          AppMethodBeat.o(54169);
          break;
          label338: paramInt++;
          break label147;
          j++;
          break label189;
          locald.oIu.removeViewAt(j);
          localObject = locald.oIv.getChildAt(0);
          locald.oIv.removeViewAt(0);
          locald.oIu.addView((View)localObject);
          locald.size -= 1;
          break label292;
          if (this.gnF.size() + this.gnG.size() == 9)
          {
            this.oHW = true;
            Toast.makeText(this, 2131301562, 0).show();
            AppMethodBeat.o(54169);
            break;
          }
          if (this.oHU)
            this.oHV.Sp(str);
          this.gnG.add(str);
        }
        i = 0;
        j = paramInt;
      }
      label488: k = 0;
      paramInt = j;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(54164);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("always_select_contact");
    if (!bo.isNullOrNil(paramBundle))
      this.gnF.addAll(bo.P(paramBundle.split(",")));
    this.gnF.add(r.Yz());
    if (this.oHU)
      this.oHV.Sp(r.Yz());
    com.tencent.mm.sdk.b.a.xxA.c(this.oGA);
    AppMethodBeat.o(54164);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(54165);
    com.tencent.mm.sdk.b.a.xxA.d(this.oGA);
    super.onDestroy();
    AppMethodBeat.o(54165);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI
 * JD-Core Version:    0.6.2
 */