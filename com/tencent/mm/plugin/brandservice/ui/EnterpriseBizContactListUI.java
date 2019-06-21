package com.tencent.mm.plugin.brandservice.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.c;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.k;

public class EnterpriseBizContactListUI extends MMActivity
{
  private boolean cph = false;
  private long edh;
  private long fRR = 0L;
  public String jLN;
  private k jLO;
  private EnterpriseBizContactListView jLP;
  private ak jLQ;

  private void aWf()
  {
    AppMethodBeat.i(13954);
    addIconOptionMenu(1, 2131296397, 2131230736, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(13945);
        if (EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this) != null)
        {
          EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).dismiss();
          EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this, null);
        }
        EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this, new k(EnterpriseBizContactListUI.this.mController.ylL));
        EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).rBl = new EnterpriseBizContactListUI.2.1(this);
        EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).rBm = new EnterpriseBizContactListUI.2.2(this);
        EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).gP();
        AppMethodBeat.o(13945);
        return false;
      }
    });
    AppMethodBeat.o(13954);
  }

  public void finish()
  {
    AppMethodBeat.i(13951);
    this.fRR = (System.currentTimeMillis() / 1000L);
    super.finish();
    AppMethodBeat.o(13951);
  }

  public final int getLayoutId()
  {
    return 2130969397;
  }

  public final void initView()
  {
    AppMethodBeat.i(13952);
    setMMTitle(((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(this.jLN).Oi());
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(13942);
        EnterpriseBizContactListUI.this.aqX();
        EnterpriseBizContactListUI.this.finish();
        AppMethodBeat.o(13942);
        return true;
      }
    });
    if (!bo.isNullOrNil(this.jLN))
    {
      com.tencent.mm.aj.d locald = f.qX(this.jLN);
      if ((locald != null) && (locald.adP()))
        aWf();
    }
    this.jLP = ((EnterpriseBizContactListView)findViewById(2131823619));
    this.jLP.setFatherBizName(this.jLN);
    this.jLP.setExcludeBizChat(false);
    this.jLP.refresh();
    this.jLP.aWg();
    AppMethodBeat.o(13952);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(13953);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
      AppMethodBeat.o(13953);
    case 1:
    }
    while (true)
    {
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str1 = paramIntent.getStringExtra("be_send_card_name");
        String str2 = paramIntent.getStringExtra("received_card_name");
        boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        com.tencent.mm.plugin.messenger.a.g.bOk().q(str1, str2, bool);
        com.tencent.mm.plugin.messenger.a.g.bOk().eZ(paramIntent, str2);
        com.tencent.mm.ui.widget.snackbar.b.i(this, this.mController.ylL.getString(2131300520));
        AppMethodBeat.o(13953);
      }
      else
      {
        AppMethodBeat.o(13953);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13947);
    super.onCreate(paramBundle);
    this.jLN = getIntent().getStringExtra("enterprise_biz_name");
    this.edh = (System.currentTimeMillis() / 1000L);
    if (this.jLQ == null)
      this.jLQ = new EnterpriseBizContactListUI.3(this);
    while (true)
    {
      this.jLQ.sendEmptyMessageDelayed(1, 500L);
      AppMethodBeat.o(13947);
      return;
      this.jLQ.removeMessages(1);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13950);
    if (this.jLP != null)
      EnterpriseBizContactListView.release();
    if ((this.edh <= 0L) || (this.fRR <= 0L))
    {
      super.onDestroy();
      AppMethodBeat.o(13950);
      return;
    }
    long l = this.fRR - this.edh;
    com.tencent.mm.aj.b localb = z.afa().qC(this.jLN);
    int i;
    if (localb != null)
    {
      i = localb.field_qyUin;
      label76: if (localb == null)
        break label202;
    }
    label202: for (int j = localb.field_userUin; ; j = 0)
    {
      h.pYm.e(13465, new Object[] { "", Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(2), Long.valueOf(l) });
      ab.d("MicroMsg.BrandService.EnterpriseBizContactListUI", "quit biz enterprise father report: %s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(2), Long.valueOf(l) });
      break;
      i = 0;
      break label76;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(13949);
    super.onPause();
    AppMethodBeat.o(13949);
  }

  public void onResume()
  {
    AppMethodBeat.i(13948);
    super.onResume();
    if (!t.mY(this.jLN))
    {
      ab.e("MicroMsg.BrandService.EnterpriseBizContactListUI", "%s !isContact", new Object[] { this.jLN });
      finish();
      AppMethodBeat.o(13948);
      return;
    }
    initView();
    int i;
    int j;
    com.tencent.mm.aj.b localb;
    int k;
    label112: long l1;
    if (!this.cph)
    {
      i = getIntent().getIntExtra("enterprise_from_scene", 5);
      j = -1;
      if (this.jLP != null)
        j = this.jLP.getContactCount();
      localb = z.afa().qC(this.jLN);
      if (localb == null)
        break label374;
      k = localb.field_qyUin;
      if (localb == null)
        break label380;
      l1 = localb.field_wwCorpId;
      label122: if (localb == null)
        break label386;
    }
    label386: for (long l2 = localb.field_wwUserVid; ; l2 = 0L)
    {
      h.pYm.e(12892, new Object[] { this.jLN, Integer.valueOf(i), Integer.valueOf(j), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(k), Long.valueOf(l1), Long.valueOf(l2) });
      ab.d("MicroMsg.BrandService.EnterpriseBizContactListUI", "enter biz enterprise father report: %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { this.jLN, Integer.valueOf(i), Integer.valueOf(j), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(k), Long.valueOf(l1), Long.valueOf(l2) });
      this.cph = true;
      AppMethodBeat.o(13948);
      break;
      label374: k = 0;
      break label112;
      label380: l1 = 0L;
      break label122;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI
 * JD-Core Version:    0.6.2
 */