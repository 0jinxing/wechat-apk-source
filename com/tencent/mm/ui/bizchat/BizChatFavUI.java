package com.tencent.mm.ui.bizchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.a.b.a;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.d.a;
import com.tencent.mm.aj.a.s;
import com.tencent.mm.aj.n;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.base.n.d;

public class BizChatFavUI extends MMActivity
  implements n
{
  private TextView emptyTipTv;
  private com.tencent.mm.ui.base.p iGY;
  private boolean isCurrentActivity;
  private ListView jJY;
  private n.d jKa;
  private long jMj;
  private String jMp;
  private b.a yEm;
  private d.a yEn;
  private c yEs;

  private void bkL()
  {
    AppMethodBeat.i(30130);
    this.yEs = new c(this, new BizChatFavUI.9(this), this.jMp);
    this.yEs.setGetViewPositionCallback(new MMSlideDelView.c()
    {
      public final int cZ(View paramAnonymousView)
      {
        AppMethodBeat.i(30116);
        int i = BizChatFavUI.e(BizChatFavUI.this).getPositionForView(paramAnonymousView);
        AppMethodBeat.o(30116);
        return i;
      }
    });
    this.yEs.setPerformItemClickListener(new MMSlideDelView.g()
    {
      public final void q(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(30117);
        BizChatFavUI.e(BizChatFavUI.this).performItemClick(paramAnonymousView, paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(30117);
      }
    });
    this.yEs.a(new MMSlideDelView.f()
    {
      public final void bN(Object paramAnonymousObject)
      {
        AppMethodBeat.i(30118);
        if (paramAnonymousObject == null)
        {
          ab.e("MicroMsg.BizChatFavUI", "onItemDel object null");
          AppMethodBeat.o(30118);
        }
        while (true)
        {
          return;
          AppMethodBeat.o(30118);
        }
      }
    });
    this.jJY.setAdapter(this.yEs);
    AppMethodBeat.o(30130);
  }

  private void btZ()
  {
    AppMethodBeat.i(30127);
    this.jJY = ((ListView)findViewById(2131823620));
    this.emptyTipTv = ((TextView)findViewById(2131821807));
    this.emptyTipTv.setText(2131297691);
    AppMethodBeat.o(30127);
  }

  private void dAN()
  {
    AppMethodBeat.i(30128);
    setBackBtn(new BizChatFavUI.7(this));
    AppMethodBeat.o(30128);
  }

  private void dAO()
  {
    AppMethodBeat.i(30129);
    this.jJY.setOnScrollListener(new BizChatFavUI.8(this));
    AppMethodBeat.o(30129);
  }

  private void dAP()
  {
    AppMethodBeat.i(30131);
    this.jKa = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(30119);
        switch (paramAnonymousMenuItem.getItemId())
        {
        default:
        case 0:
        }
        while (true)
        {
          AppMethodBeat.o(30119);
          return;
          BizChatFavUI.a(BizChatFavUI.this, BizChatFavUI.f(BizChatFavUI.this));
        }
      }
    };
    com.tencent.mm.ui.tools.j localj = new com.tencent.mm.ui.tools.j(this);
    this.jJY.setOnItemLongClickListener(new BizChatFavUI.2(this, localj));
    this.jJY.setOnItemClickListener(new BizChatFavUI.3(this));
    AppMethodBeat.o(30131);
  }

  public final void a(int paramInt, m paramm)
  {
    AppMethodBeat.i(30125);
    if (this.iGY != null)
      this.iGY.dismiss();
    AppMethodBeat.o(30125);
  }

  public final int getLayoutId()
  {
    return 2130969400;
  }

  public final void initView()
  {
    AppMethodBeat.i(30126);
    btZ();
    dAO();
    bkL();
    dAP();
    dAN();
    AppMethodBeat.o(30126);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30120);
    super.onCreate(paramBundle);
    this.jMp = getIntent().getStringExtra("Contact_User");
    ab.i("MicroMsg.BizChatFavUI", "[registerListener]");
    this.yEm = new BizChatFavUI.1(this);
    this.yEn = new BizChatFavUI.6(this);
    z.aeU().a(this.yEm, getMainLooper());
    z.aeT().a(this.yEn, getMainLooper());
    initView();
    z.aeZ();
    paramBundle = new s(this.jMp);
    g.RO().eJo.a(paramBundle, 0);
    AppMethodBeat.o(30120);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(30124);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.jMj = ((com.tencent.mm.aj.a.c)this.yEs.getItem(paramView.position)).field_bizChatLocalId;
    paramContextMenu.add(paramView.position, 0, 1, 2131297692);
    AppMethodBeat.o(30124);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30121);
    ab.i("MicroMsg.BizChatFavUI", "[unRegitListener]");
    z.aeU().a(this.yEm);
    z.aeT().a(this.yEn);
    this.yEs.bIf();
    super.onDestroy();
    AppMethodBeat.o(30121);
  }

  public void onPause()
  {
    AppMethodBeat.i(30123);
    this.yEs.onPause();
    this.isCurrentActivity = false;
    aw.getNotification().jO("");
    super.onPause();
    AppMethodBeat.o(30123);
  }

  public void onResume()
  {
    AppMethodBeat.i(30122);
    super.onResume();
    ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.jMp);
    if ((localad == null) || (!a.jh(localad.field_type)))
    {
      finish();
      AppMethodBeat.o(30122);
    }
    while (true)
    {
      return;
      setTitleMuteIconVisibility(8);
      this.isCurrentActivity = true;
      this.yEs.a(null, null);
      aw.getNotification().jO(this.jMp);
      AppMethodBeat.o(30122);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatFavUI
 * JD-Core Version:    0.6.2
 */