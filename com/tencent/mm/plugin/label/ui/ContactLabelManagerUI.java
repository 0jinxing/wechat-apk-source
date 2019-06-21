package com.tencent.mm.plugin.label.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.label.b.b;
import com.tencent.mm.plugin.label.e;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashMap;

public class ContactLabelManagerUI extends ContactLabelBaseUI
  implements View.OnCreateContextMenuListener, AdapterView.OnItemClickListener, f, n.d
{
  private int alc;
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.b.a jMO;
  private View laJ;
  private ak mHandler;
  private ListView mListView;
  private ContactLabelManagerUI.b nHX;
  private View nHY;
  private View nHZ;
  private ContactLabelManagerUI.a nIa;
  private ArrayList<af> nIb;
  private HashMap<Integer, Integer> nIc;
  private boolean nId;
  private View.OnClickListener nIe;
  private k.a nIf;
  private n.b nIg;

  public ContactLabelManagerUI()
  {
    AppMethodBeat.i(22606);
    this.nHX = ContactLabelManagerUI.b.nIm;
    this.jLX = 0;
    this.jLY = 0;
    this.nIb = new ArrayList();
    this.nIc = new HashMap();
    this.nId = true;
    this.mHandler = new ContactLabelManagerUI.1(this);
    this.nIe = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(22591);
        ContactLabelManagerUI.b(ContactLabelManagerUI.this);
        AppMethodBeat.o(22591);
      }
    };
    this.nIf = new k.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.m paramAnonymousm)
      {
        AppMethodBeat.i(22592);
        if (!bo.isNullOrNil(paramAnonymousString))
          ContactLabelManagerUI.a(ContactLabelManagerUI.this);
        AppMethodBeat.o(22592);
      }
    };
    this.nIg = new ContactLabelManagerUI.8(this);
    AppMethodBeat.o(22606);
  }

  private void PM(String paramString)
  {
    AppMethodBeat.i(22618);
    if (!e.bIZ().pI(paramString))
    {
      ab.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteContactLabel] fail.");
      bJh();
      AppMethodBeat.o(22618);
    }
    while (true)
    {
      return;
      bJi();
      AppMethodBeat.o(22618);
    }
  }

  private void bJh()
  {
    AppMethodBeat.i(22619);
    bJc();
    JN(getString(2131298856));
    AppMethodBeat.o(22619);
  }

  private void bJi()
  {
    AppMethodBeat.i(22620);
    bJc();
    iz(false);
    AppMethodBeat.o(22620);
  }

  private void iz(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(22616);
      ab.d("MicroMsg.Label.ContactLabelManagerUI", "loading%s", new Object[] { String.valueOf(paramBoolean) });
      if ((paramBoolean) && (this.mHandler != null))
        this.mHandler.sendEmptyMessageDelayed(5002, 400L);
      al localal = aw.RS();
      ContactLabelManagerUI.4 local4 = new com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$4;
      local4.<init>(this, paramBoolean);
      localal.aa(local4);
      AppMethodBeat.o(22616);
      return;
    }
    finally
    {
    }
  }

  public final int getLayoutId()
  {
    return 2130969227;
  }

  public final void initView()
  {
    AppMethodBeat.i(22607);
    this.alc = com.tencent.mm.bz.a.al(this.mController.ylL, 2131427813);
    setMMTitle(getString(2131300882));
    addTextOptionMenu(0, getString(2131300891), new ContactLabelManagerUI.9(this));
    setBackBtn(new ContactLabelManagerUI.10(this));
    this.nIa = new ContactLabelManagerUI.a(this);
    this.laJ = findViewById(2131823065);
    this.nHY = findViewById(2131823067);
    this.nHZ = findViewById(2131823068);
    this.nHZ.setOnClickListener(this.nIe);
    this.mListView = ((ListView)findViewById(2131823066));
    this.jMO = new com.tencent.mm.ui.widget.b.a(this);
    this.mListView.setOnTouchListener(new ContactLabelManagerUI.11(this));
    this.mListView.setOnItemLongClickListener(new ContactLabelManagerUI.12(this));
    this.mListView.setAdapter(this.nIa);
    this.mListView.setOnItemClickListener(this);
    AppMethodBeat.o(22607);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(22617);
    ab.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] requestCode:%d resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(22617);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 7001:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(22617);
      break;
      String str = paramIntent.getStringExtra("Select_Contact");
      ab.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", new Object[] { String.valueOf(str) });
      if (!bo.isNullOrNil(str))
      {
        Intent localIntent = new Intent(paramIntent);
        localIntent.putExtra("label_source", "label_source_Address");
        localIntent.setClass(this, ContactLabelEditUI.class);
        localIntent.putExtra("Select_Contact", str);
        startActivity(localIntent);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22608);
    super.onCreate(paramBundle);
    initView();
    aw.RS().aa(new ContactLabelManagerUI.13(this));
    e.bIZ().c(this.nIf);
    com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(2) });
    AppMethodBeat.o(22608);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(22613);
    int i = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).position;
    if ((this.nIa != null) && (i >= 0))
    {
      af localaf = this.nIa.xA(i);
      if (localaf != null)
      {
        paramContextMenu.setHeaderTitle(j.b(paramView.getContext(), localaf.field_labelName));
        paramContextMenu.add(0, 0, 0, getString(2131296881));
        paramContextMenu.add(0, 1, 1, getString(2131296894));
      }
    }
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    AppMethodBeat.o(22613);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22611);
    e.bIZ().d(this.nIf);
    super.onDestroy();
    AppMethodBeat.o(22611);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22612);
    if ((this.nIa != null) && (paramInt >= 0))
    {
      paramView = this.nIa.xA(paramInt);
      if (paramView != null)
      {
        paramAdapterView = paramView.field_labelID;
        paramView = paramView.field_labelName;
        Intent localIntent = new Intent();
        localIntent.putExtra("label_id", paramAdapterView);
        localIntent.putExtra("label_name", paramView);
        localIntent.putExtra("label_source", "label_source_Address");
        localIntent.setClass(this, ContactLabelEditUI.class);
        startActivity(localIntent);
        if (bo.isNullOrNil(paramAdapterView))
          if ((this.nIb == null) || (this.nIb.isEmpty()))
          {
            com.tencent.mm.plugin.report.service.h.pYm.e(11347, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
            AppMethodBeat.o(22612);
          }
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(11347, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
      AppMethodBeat.o(22612);
    }
  }

  public void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(22614);
    int i = ((AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo()).position;
    if ((this.nIa != null) && (i >= 0))
    {
      paramMenuItem = this.nIa.xA(i);
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      }
    }
    while (true)
    {
      AppMethodBeat.o(22614);
      while (true)
      {
        return;
        com.tencent.mm.ui.base.h.d(this, getString(2131300884), "", getString(2131296881), getString(2131296868), new ContactLabelManagerUI.2(this, paramMenuItem), new ContactLabelManagerUI.3(this));
        AppMethodBeat.o(22614);
      }
      Intent localIntent = new Intent();
      localIntent.setClass(this, ContactLabelEditUI.class);
      localIntent.putExtra("label_id", paramMenuItem.field_labelID);
      localIntent.putExtra("label_name", paramMenuItem.field_labelName);
      localIntent.putExtra("label_source", "label_source_Address");
      startActivity(localIntent);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(22610);
    aw.Rg().b(636, this);
    aw.ZK();
    c.XM().b(this.nIg);
    super.onPause();
    AppMethodBeat.o(22610);
  }

  public void onResume()
  {
    AppMethodBeat.i(22609);
    aw.Rg().a(636, this);
    aw.ZK();
    c.XM().a(this.nIg);
    iz(true);
    super.onResume();
    AppMethodBeat.o(22609);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(22615);
    ab.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramm.getType())
    {
    default:
      ab.w("MicroMsg.Label.ContactLabelManagerUI", "unknow type.");
      AppMethodBeat.o(22615);
    case 636:
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        PM(((b)paramm).nHx);
        AppMethodBeat.o(22615);
      }
      else
      {
        ab.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd] delete fail.");
        bJh();
        AppMethodBeat.o(22615);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelManagerUI
 * JD-Core Version:    0.6.2
 */