package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.u.a;
import com.tencent.mm.ui.widget.b.a;

public class ChatroomContactUI extends MMActivity
  implements f, k.a
{
  private com.tencent.mm.pluginsdk.ui.d ein;
  private int jLX;
  private int jLY;
  private a jMO;
  private n.d lCi;
  private TextView mht;
  private ListView nIv;
  private com.tencent.mm.ui.voicesearch.b zkc;
  private String zke;
  private ContactCountView zkp;
  private VoiceSearchLayout zlp;
  private com.tencent.mm.modelvoiceaddr.ui.b zlq;
  private d zlr;

  public ChatroomContactUI()
  {
    AppMethodBeat.i(33586);
    this.jLX = 0;
    this.jLY = 0;
    this.lCi = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(33571);
        switch (paramAnonymousMenuItem.getItemId())
        {
        default:
          AppMethodBeat.o(33571);
        case 1:
        }
        while (true)
        {
          return;
          ChatroomContactUI.arN(ChatroomContactUI.a(ChatroomContactUI.this));
          AppMethodBeat.o(33571);
        }
      }
    };
    this.ein = new com.tencent.mm.pluginsdk.ui.d(new ChatroomContactUI.6(this));
    AppMethodBeat.o(33586);
  }

  private void bJk()
  {
    AppMethodBeat.i(33594);
    if (this.zlr != null)
      this.zlr.a(null, null);
    if (this.zkc != null)
      this.zkc.a(null, null);
    AppMethodBeat.o(33594);
  }

  private void dHE()
  {
    AppMethodBeat.i(33588);
    ((TextView)findViewById(2131821055)).setVisibility(8);
    AppMethodBeat.o(33588);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(33596);
    if (this.zkp != null)
    {
      this.zkp.setContactType(2);
      this.zkp.dHF();
    }
    AppMethodBeat.o(33596);
  }

  public final int getLayoutId()
  {
    return 2130969003;
  }

  public final void initView()
  {
    AppMethodBeat.i(33590);
    dHE();
    this.nIv = ((ListView)findViewById(2131821054));
    this.nIv.setAdapter(null);
    this.mht = ((TextView)findViewById(2131821055));
    this.mht.setText(2131296452);
    this.zlr = new d(this, "@all.chatroom.contact");
    this.zlr.pN(true);
    this.zkc = new com.tencent.mm.ui.voicesearch.b(this.mController.ylL, 1);
    this.zkc.zjx = "@all.chatroom.contact";
    this.zlq = new com.tencent.mm.modelvoiceaddr.ui.b((byte)0);
    this.zlq.a(new ChatroomContactUI.7(this));
    a(this.zlq);
    this.zlr.setGetViewPositionCallback(new ChatroomContactUI.8(this));
    this.zlr.setPerformItemClickListener(new ChatroomContactUI.9(this));
    this.zlr.a(new ChatroomContactUI.10(this));
    this.nIv.setOnScrollListener(this.ein);
    this.zlr.vkK = this.ein;
    this.jMO = new a(this.mController.ylL);
    this.nIv.setOnItemClickListener(new ChatroomContactUI.11(this));
    this.nIv.setOnItemLongClickListener(new ChatroomContactUI.12(this));
    this.nIv.setOnTouchListener(new ChatroomContactUI.13(this));
    ListView localListView = this.nIv;
    Object localObject = new ContactCountView(this);
    this.zkp = ((ContactCountView)localObject);
    localListView.addFooterView((View)localObject, null, false);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(33572);
        ChatroomContactUI.this.finish();
        AppMethodBeat.o(33572);
        return false;
      }
    });
    addIconOptionMenu(0, 2131296397, 2131230736, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(33573);
        paramAnonymousMenuItem = new Intent(ChatroomContactUI.this, SelectContactUI.class);
        paramAnonymousMenuItem.putExtra("titile", ChatroomContactUI.this.getString(2131296484));
        paramAnonymousMenuItem.putExtra("list_type", 0);
        paramAnonymousMenuItem.putExtra("list_attr", s.C(new int[] { s.znG, 256, 512 }));
        ChatroomContactUI.this.mController.ylL.startActivity(paramAnonymousMenuItem);
        AppMethodBeat.o(33573);
        return false;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(33574);
        BackwardSupportUtil.c.a(ChatroomContactUI.b(ChatroomContactUI.this));
        AppMethodBeat.o(33574);
      }
    };
    this.nIv.setAdapter(this.zlr);
    this.zkc.qU(false);
    this.nIv.setVisibility(0);
    this.zlp = new VoiceSearchLayout(this);
    localObject = new RelativeLayout.LayoutParams(-1, -1);
    ((RelativeLayout.LayoutParams)localObject).addRule(14);
    this.zlp.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.zlp.setTopMargin(BackwardSupportUtil.b.b(this, 100.0F));
    this.zlp.setVisibility(8);
    ((ViewGroup)findViewById(2131822359)).addView(this.zlp);
    if (this.zlp != null)
      this.zlp.setOnVisibleChangeListener(new ChatroomContactUI.5(this));
    if (this.zlr.getCount() == 0)
    {
      this.mht.setSingleLine(false);
      this.mht.setPadding(40, 0, 40, 0);
      this.mht.setVisibility(0);
    }
    AppMethodBeat.o(33590);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33587);
    super.onCreate(paramBundle);
    setMMTitle(2131296440);
    initView();
    aw.Rg().a(138, this);
    aw.ZK();
    c.XM().a(this.zlr);
    AppMethodBeat.o(33587);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(33589);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    aw.ZK();
    if (c.XM().aoO(this.zke) == null)
    {
      ab.e("MicroMsg.ChatroomContactUI", "onCreateContextMenu, contact is null, username = " + this.zke);
      AppMethodBeat.o(33589);
    }
    while (true)
    {
      return;
      if (t.mW(this.zke))
      {
        paramContextMenu.setHeaderTitle(j.b(paramView.getContext(), com.tencent.mm.model.s.mJ(this.zke)));
        paramContextMenu.add(paramContextMenuInfo.position, 1, 0, 2131296448);
        AppMethodBeat.o(33589);
      }
      else
      {
        AppMethodBeat.o(33589);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33593);
    super.onDestroy();
    aw.Rg().b(138, this);
    aw.ZK();
    c.XM().b(this.zlr);
    d locald = this.zlr;
    if (locald.gvm != null)
    {
      locald.gvm.detach();
      locald.gvm = null;
    }
    this.zlr.bIf();
    this.zlr.dww();
    this.zkc.detach();
    this.zkc.bIf();
    AppMethodBeat.o(33593);
  }

  public void onPause()
  {
    AppMethodBeat.i(33592);
    super.onPause();
    aw.ZK();
    c.XV().d(this);
    if (this.zlq != null)
    {
      com.tencent.mm.modelvoiceaddr.ui.b localb = this.zlq;
      localb.dJS();
      localb.cancel();
    }
    if (this.zkc != null)
      this.zkc.onPause();
    AppMethodBeat.o(33592);
  }

  public void onResume()
  {
    AppMethodBeat.i(33591);
    super.onResume();
    if (this.zkp != null)
    {
      this.zkp.setContactType(2);
      this.zkp.dHF();
    }
    aw.ZK();
    c.XV().c(this);
    com.tencent.mm.modelvoiceaddr.ui.b localb;
    if ((this.zlq != null) && (this.zlp != null))
    {
      com.tencent.mm.bp.d.dlL();
      if ((com.tencent.mm.au.b.ahP()) || (!aa.dor().equals("zh_CN")))
        break label149;
      this.zlq.gcl = true;
      localb = this.zlq;
      localb.gcp = this.zlp;
      localb.gcn = 1;
      if (1 != localb.gcn)
        break label141;
      localb.gcm = 2;
    }
    while (true)
    {
      if (this.zkc != null)
        this.zkc.onResume();
      AppMethodBeat.o(33591);
      return;
      label141: localb.gcm = 1;
      continue;
      label149: this.zlq.gcl = false;
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(33595);
    if (!ah.cv(this))
      AppMethodBeat.o(33595);
    while (true)
    {
      return;
      if (u.a.a(this, paramInt1, paramInt2, paramString, 4))
      {
        AppMethodBeat.o(33595);
      }
      else
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
          break;
        AppMethodBeat.o(33595);
      }
    }
    switch (paramm.getType())
    {
    default:
    case 138:
    }
    while (true)
    {
      AppMethodBeat.o(33595);
      break;
      bJk();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ChatroomContactUI
 * JD-Core Version:    0.6.2
 */