package com.tencent.mm.plugin.aa.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AASelectContactUI extends MMBaseSelectContactUI
{
  private String chatroomName;
  private HashSet<String> gnF;
  private HashSet<String> gnG;
  private long gnH;
  private int gnI;
  private CheckBox gnJ;
  private View gnK;
  private String title;

  private void Kt()
  {
    AppMethodBeat.i(40763);
    if (this.gnG.size() > 0)
    {
      updateOptionMenuText(1, getString(2131296340, new Object[] { Integer.valueOf(this.gnG.size()) }));
      if ((this.gnG.size() != 1) || (!this.gnG.contains(r.Yz())))
        break label93;
      enableOptionMenu(1, false);
      AppMethodBeat.o(40763);
    }
    while (true)
    {
      return;
      updateOptionMenuText(1, getString(2131296994));
      break;
      label93: enableOptionMenu(1, true);
      AppMethodBeat.o(40763);
    }
  }

  public final void Kh()
  {
    AppMethodBeat.i(40755);
    super.Kh();
    this.title = getIntent().getStringExtra("titile");
    this.gnH = getIntent().getLongExtra("max_select_num", 20L);
    this.gnI = getIntent().getIntExtra("select_type", 1);
    this.chatroomName = getIntent().getStringExtra("chatroomName");
    if (!t.kH(this.chatroomName))
      ab.i("MicroMsg.AASelectContactUI", "is single chat");
    this.gnG = new HashSet();
    this.gnF = new HashSet();
    String str = getIntent().getStringExtra("always_select_contact");
    if (!bo.isNullOrNil(str))
      this.gnF.addAll(Arrays.asList(str.split(",")));
    str = getIntent().getStringExtra("already_select_contact");
    if (!bo.isNullOrNil(str))
    {
      this.gnG.addAll(bo.P(str.split(",")));
      Kt();
    }
    this.gnJ = ((CheckBox)findViewById(2131820907));
    this.gnK = findViewById(2131820906);
    this.gnK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(40749);
        if (AASelectContactUI.a(AASelectContactUI.this).isChecked())
          if (AASelectContactUI.b(AASelectContactUI.this) != null)
          {
            AASelectContactUI.b(AASelectContactUI.this).clear();
            AASelectContactUI.a(AASelectContactUI.this).setChecked(false);
            AASelectContactUI.this.dHV().notifyDataSetChanged();
          }
        while (true)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(6) });
          AppMethodBeat.o(40749);
          return;
          AASelectContactUI.a(AASelectContactUI.this, new HashSet());
          break;
          paramAnonymousView = com.tencent.mm.plugin.aa.a.h.vE(AASelectContactUI.c(AASelectContactUI.this));
          if (paramAnonymousView.size() > AASelectContactUI.d(AASelectContactUI.this))
            com.tencent.mm.ui.base.h.a(AASelectContactUI.this.mController.ylL, AASelectContactUI.this.getString(2131296376, new Object[] { Long.valueOf(AASelectContactUI.d(AASelectContactUI.this)) }), "", new AASelectContactUI.1.1(this, paramAnonymousView), new AASelectContactUI.1.2(this));
          else
            AASelectContactUI.a(AASelectContactUI.this, paramAnonymousView);
        }
      }
    });
    if (this.gnG.size() == com.tencent.mm.plugin.aa.a.h.vE(this.chatroomName).size())
      this.gnJ.setChecked(true);
    while (true)
    {
      this.gnJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
      {
        public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(40750);
          AASelectContactUI.e(AASelectContactUI.this);
          AppMethodBeat.o(40750);
        }
      });
      AppMethodBeat.o(40755);
      return;
      this.gnJ.setChecked(false);
    }
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(40761);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.gnG.contains(parama.ehM.field_username);
      AppMethodBeat.o(40761);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(40761);
    }
  }

  public final m aoA()
  {
    AppMethodBeat.i(40759);
    e locale = new e(this, this.chatroomName);
    AppMethodBeat.o(40759);
    return locale;
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
    return this.title;
  }

  public final o aoz()
  {
    AppMethodBeat.i(40758);
    d locald = new d(this, this.chatroomName);
    AppMethodBeat.o(40758);
    return locald;
  }

  public final boolean b(a parama)
  {
    AppMethodBeat.i(40762);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.gnF.contains(parama.ehM.field_username);
      AppMethodBeat.o(40762);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(40762);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130968582;
  }

  public final void initView()
  {
    AppMethodBeat.i(40756);
    super.initView();
    a(1, getString(2131296994), new AASelectContactUI.3(this), q.b.ymu);
    Kt();
    this.opo.setOnContactDeselectListener(this);
    setBackBtn(new AASelectContactUI.4(this));
    AppMethodBeat.o(40756);
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(40760);
    n localn = dHV();
    Object localObject = localn.Pn(paramInt - getContentLV().getHeaderViewsCount());
    if (localObject == null)
      AppMethodBeat.o(40760);
    while (true)
    {
      return;
      if (((a)localObject).ehM != null)
        break;
      AppMethodBeat.o(40760);
    }
    ab.i("MicroMsg.AASelectContactUI", "ClickUser=%s", new Object[] { ((a)localObject).ehM.field_username });
    localObject = ((a)localObject).ehM.field_username;
    if (((String)localObject).equals(r.Yz()))
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(4) });
      label119: dIb();
      if (!this.gnG.contains(localObject))
        break label220;
      this.gnG.remove(localObject);
      label143: if (this.gnG.size() != com.tencent.mm.plugin.aa.a.h.vE(this.chatroomName).size())
        break label232;
      this.gnJ.setChecked(true);
    }
    while (true)
    {
      localn.notifyDataSetChanged();
      Kt();
      AppMethodBeat.o(40760);
      break;
      com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(5) });
      break label119;
      label220: this.gnG.add(localObject);
      break label143;
      label232: this.gnJ.setChecked(false);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(40757);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("always_select_contact");
    if (!bo.isNullOrNil(paramBundle))
      this.gnF.addAll(bo.P(paramBundle.split(",")));
    AppMethodBeat.o(40757);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void vI(String paramString)
  {
    AppMethodBeat.i(40764);
    this.gnG.remove(paramString);
    dHV().notifyDataSetChanged();
    AppMethodBeat.o(40764);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AASelectContactUI
 * JD-Core Version:    0.6.2
 */