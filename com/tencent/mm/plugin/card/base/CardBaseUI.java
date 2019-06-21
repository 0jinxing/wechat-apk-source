package com.tencent.mm.plugin.card.base;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.r;
import com.tencent.mm.plugin.card.model.x;
import com.tencent.mm.plugin.card.ui.CardDetailUI;
import com.tencent.mm.pluginsdk.ui.applet.t;
import com.tencent.mm.pluginsdk.ui.applet.t.a;
import com.tencent.mm.protocal.protobuf.bzi;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.ArrayList;
import java.util.LinkedList;

public abstract class CardBaseUI extends MMActivity
  implements f, MMActivity.a
{
  private float ecs = -85.0F;
  private float ect = -1000.0F;
  private b.a ecy = new CardBaseUI.7(this);
  private com.tencent.mm.ui.base.p ejZ = null;
  public com.tencent.mm.modelgeo.d fwu;
  private boolean fwx = false;
  protected ListView kam = null;
  public BaseAdapter kan = null;
  protected RelativeLayout kao = null;
  protected LinearLayout kap;
  protected LinearLayout kaq;
  public boolean kar = false;
  protected boolean kas = true;
  public a kat = null;
  protected CardInfo kau;

  public final void H(LinkedList<String> paramLinkedList)
  {
    fE(true);
    paramLinkedList = new r(paramLinkedList);
    com.tencent.mm.kernel.g.RO().eJo.a(paramLinkedList, 0);
  }

  protected BaseAdapter Kw()
  {
    return new com.tencent.mm.plugin.card.ui.c(this, aZq());
  }

  protected void a(b paramb)
  {
    if (!aZs())
      ab.e("MicroMsg.CardBaseUI", "isItemClickable return false");
    while (true)
    {
      return;
      if (paramb != null)
        break;
      ab.e("MicroMsg.CardBaseUI", "onListItemLongClick  item == null");
    }
    ArrayList localArrayList = new ArrayList();
    if (paramb.aZJ())
    {
      if (bo.isNullOrNil(paramb.aZV().vUI))
        break label158;
      localArrayList.add(paramb.aZV().vUI);
    }
    while (true)
    {
      localArrayList.add(getResources().getString(2131296881));
      String str = paramb.aZZ();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramb.aZV().kdf);
      com.tencent.mm.ui.base.h.a(this, localStringBuilder.toString(), (String[])localArrayList.toArray(new String[localArrayList.size()]), null, new CardBaseUI.5(this, paramb, str));
      break;
      label158: if (paramb.aZH())
        localArrayList.add(getResources().getString(2131297926));
      else
        localArrayList.add(getResources().getString(2131297925));
    }
  }

  protected void a(b paramb, int paramInt)
  {
    Intent localIntent = new Intent(this, CardDetailUI.class);
    localIntent.putExtra("key_card_id", paramb.aZZ());
    localIntent.addFlags(131072);
    localIntent.putExtra("key_from_scene", 3);
    startActivity(localIntent);
    if (aZq() == n.a.kdP)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(11324, new Object[] { "ClickMemberCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
      int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xKE, Integer.valueOf(3))).intValue();
      com.tencent.mm.plugin.report.service.h.pYm.e(15767, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt + 1) });
    }
    while (true)
    {
      return;
      if (aZq() == n.a.kdO)
        com.tencent.mm.plugin.report.service.h.pYm.e(11324, new Object[] { "ClickMemberCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(1), "", Integer.valueOf(0), Integer.valueOf(0) });
    }
  }

  protected void a(CardInfo paramCardInfo)
  {
    this.kau = paramCardInfo;
    com.tencent.mm.plugin.card.d.b.a(this, 0, this);
  }

  protected abstract void aZp();

  protected n.a aZq()
  {
    return n.a.kdK;
  }

  protected boolean aZr()
  {
    return true;
  }

  protected boolean aZs()
  {
    return true;
  }

  public final void aZt()
  {
    if (this.fwu == null)
      this.fwu = com.tencent.mm.modelgeo.d.agz();
    if (this.fwu != null)
      this.fwu.a(this.ecy, true);
  }

  protected final void aZu()
  {
    if (this.fwu != null)
      this.fwu.a(this.ecy, true);
  }

  protected final void aZv()
  {
    if (this.fwu != null)
      this.fwu.c(this.ecy);
  }

  protected void aZw()
  {
  }

  protected void aZx()
  {
  }

  protected void aZy()
  {
  }

  protected void aZz()
  {
  }

  protected void b(b paramb, int paramInt)
  {
    if (!aZr())
      ab.e("MicroMsg.CardBaseUI", "isItemClickable return false");
    while (true)
    {
      return;
      if (paramb == null)
        ab.e("MicroMsg.CardBaseUI", "onListItemClick  item == null");
      else if ((!paramb.aZZ().equals("PRIVATE_TICKET_TITLE")) && (!paramb.aZZ().equals("PRIVATE_INVOICE_TITLE")))
        if (paramb.aZI())
          a(paramb, paramInt);
        else if (!TextUtils.isEmpty(paramb.aZV().vUc))
          com.tencent.mm.plugin.card.d.b.a(this, paramb.aZV().vUc, 0);
    }
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 0) && (paramInt2 == -1))
      l(paramIntent.getStringExtra("Select_Conv_User"), 0, false);
  }

  protected final void fE(boolean paramBoolean)
  {
    if (paramBoolean)
      this.ejZ = com.tencent.mm.ui.base.p.b(this, getString(2131297086), true, null);
    while (true)
    {
      return;
      if ((this.ejZ != null) && (this.ejZ.isShowing()))
      {
        this.ejZ.dismiss();
        this.ejZ = null;
      }
    }
  }

  public int getLayoutId()
  {
    return 2130968943;
  }

  public void initView()
  {
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(87617);
        CardBaseUI.this.finish();
        AppMethodBeat.o(87617);
        return true;
      }
    });
    this.kam = ((ListView)findViewById(16908298));
    this.kao = ((RelativeLayout)findViewById(2131821926));
    if (this.kao != null)
      this.kam.setEmptyView(this.kao);
    this.kap = ((LinearLayout)View.inflate(getBaseContext(), 2130968951, null));
    this.kaq = ((LinearLayout)View.inflate(getBaseContext(), 2130968948, null));
    this.kam.addHeaderView(this.kap);
    this.kam.addFooterView(this.kaq);
    this.kan = Kw();
    this.kam.setAdapter(this.kan);
    this.kam.setOnItemClickListener(new CardBaseUI.2(this));
    this.kam.setOnItemLongClickListener(new CardBaseUI.3(this));
    com.tencent.mm.kernel.g.RO().eJo.a(560, this);
    com.tencent.mm.kernel.g.RO().eJo.a(692, this);
    Object localObject = this.kan;
    if ((localObject instanceof com.tencent.mm.plugin.card.ui.c))
      localObject = new com.tencent.mm.plugin.card.ui.d((com.tencent.mm.plugin.card.ui.c)localObject);
    while (true)
    {
      this.kat = ((a)localObject);
      this.kat.onCreate();
      aZp();
      return;
      if ((localObject instanceof com.tencent.mm.plugin.card.sharecard.ui.c))
        localObject = new com.tencent.mm.plugin.card.sharecard.ui.d((com.tencent.mm.plugin.card.sharecard.ui.c)localObject);
      else if ((localObject instanceof com.tencent.mm.plugin.card.sharecard.ui.g))
        localObject = new com.tencent.mm.plugin.card.sharecard.ui.h((com.tencent.mm.plugin.card.sharecard.ui.g)localObject);
      else
        localObject = new com.tencent.mm.plugin.card.ui.h((com.tencent.mm.plugin.card.ui.g)localObject);
    }
  }

  protected final void l(String paramString, int paramInt, boolean paramBoolean)
  {
    if (this.kau == null)
      ab.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo == null");
    while (true)
    {
      return;
      if (this.kau.aZV() != null)
        break;
      ab.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramInt == 0)
      if ((!TextUtils.isEmpty(this.kau.aZX().wYl)) && (!this.kau.aZH()))
      {
        localStringBuilder.append(this.kau.aZX().wYl);
        label92: com.tencent.mm.plugin.report.service.h.pYm.e(11582, new Object[] { "OperGift", Integer.valueOf(2), Integer.valueOf(this.kau.aZV().iAd), this.kau.field_card_tp_id, this.kau.field_card_id, paramString });
      }
    while (true)
    {
      String str = this.kau.aZV().title + "\n" + this.kau.aZV().kdg;
      t.a.vlq.a(this.mController, localStringBuilder.toString(), this.kau.aZV().kbV, str, false, getResources().getString(2131297041), new CardBaseUI.6(this, paramString, paramBoolean));
      break;
      localStringBuilder.append(getString(2131303749));
      break label92;
      if (paramInt == 1)
      {
        localStringBuilder.append(getString(2131297855, new Object[] { this.kau.aZV().kdf }));
        com.tencent.mm.plugin.report.service.h.pYm.e(11582, new Object[] { "OperGift", Integer.valueOf(3), Integer.valueOf(this.kau.aZV().iAd), this.kau.field_card_tp_id, this.kau.field_card_id, paramString });
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public void onDestroy()
  {
    ab.d("MicroMsg.CardBaseUI", "destroy card");
    com.tencent.mm.kernel.g.RO().eJo.b(560, this);
    com.tencent.mm.kernel.g.RO().eJo.b(692, this);
    if (this.kat != null)
      this.kat.onDestroy();
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    this.kas = false;
    com.tencent.mm.kernel.g.RO().eJo.b(652, this);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
      ab.i("MicroMsg.CardBaseUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
    while (true)
    {
      return;
      ab.i("MicroMsg.CardBaseUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default:
        break;
      case 69:
        if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
          aZy();
        else
          com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131298419), false, new CardBaseUI.8(this), null);
        break;
      }
    }
  }

  public void onResume()
  {
    super.onResume();
    this.kas = true;
    com.tencent.mm.kernel.g.RO().eJo.a(652, this);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof r))
      {
        fE(false);
        com.tencent.mm.ui.base.h.bQ(this, getResources().getString(2131297832));
        am.baV();
        com.tencent.mm.plugin.card.b.b.sO(4);
        this.kat.ZZ();
        aZz();
      }
    while (true)
    {
      return;
      if ((paramm instanceof af))
      {
        fE(false);
        paramInt1 = ((af)paramm).kdT;
        paramm = ((af)paramm).kdU;
        if (paramInt1 == 10000)
        {
          paramString = paramm;
          if (TextUtils.isEmpty(paramm))
            paramString = getString(2131297856);
          com.tencent.mm.plugin.card.d.d.b(this, paramString, paramInt1);
        }
        else
        {
          if (this.kau != null)
          {
            paramString = this.kau.aZW();
            paramString.status = 3;
            this.kau.a(paramString);
            if (!am.baW().c(this.kau, new String[0]))
              ab.e("MicroMsg.CardBaseUI", "update newSerial fail, cardId = %s", new Object[] { this.kau.field_card_id });
          }
          this.kat.ZZ();
          aZz();
          continue;
          fE(false);
          String str1 = paramString;
          if ((paramm instanceof af))
          {
            paramInt1 = ((af)paramm).kdT;
            String str2 = ((af)paramm).kdU;
            str1 = paramString;
            if (paramInt1 == 10000)
            {
              paramString = str2;
              if (TextUtils.isEmpty(str2))
                paramString = getString(2131297856);
              str1 = paramString;
            }
          }
          if ((!(paramm instanceof x)) && (!(paramm instanceof ad)) && (!(paramm instanceof com.tencent.mm.plugin.card.sharecard.model.b)) && (this.kas))
            com.tencent.mm.plugin.card.d.d.b(this, str1, paramInt2);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.base.CardBaseUI
 * JD-Core Version:    0.6.2
 */