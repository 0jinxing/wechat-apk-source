package com.tencent.mm.plugin.collect.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Iterator;
import java.util.List;

public class CollectBillUI extends WalletBaseUI
{
  private boolean foa;
  private int fromScene;
  private String gmu;
  private com.tencent.mm.ui.tools.j icA;
  private long kCc;
  private a kFK;
  private LinearLayout kFL;
  private CollectBillHeaderView kFM;
  private ImageView kFN;
  private MMSwitchBtn kFO;
  private ImageView kFP;
  private MMSwitchBtn kFQ;
  private TextView kFR;
  private boolean kFS;
  private boolean kFT;
  private long kFU;
  private f kFV;
  private n.d kFW;
  private ListView kFo;
  private boolean kFw;
  private View kmT;
  private int limit;
  private int type;

  public CollectBillUI()
  {
    AppMethodBeat.i(41218);
    this.kFS = false;
    this.kFw = false;
    this.foa = false;
    this.kFT = true;
    this.limit = 20;
    this.kFV = new CollectBillUI.1(this);
    this.kFW = new CollectBillUI.7(this);
    AppMethodBeat.o(41218);
  }

  private void aEL()
  {
    AppMethodBeat.i(41226);
    this.kFo.setVisibility(8);
    this.kFL.setVisibility(0);
    findViewById(2131822818).setVisibility(0);
    AppMethodBeat.o(41226);
  }

  private void bhi()
  {
    AppMethodBeat.i(41225);
    if (!this.foa)
    {
      a(new com.tencent.mm.plugin.collect.model.r(this.type, this.kCc, this.gmu, this.limit), true, false);
      this.kFw = true;
    }
    AppMethodBeat.o(41225);
  }

  private void e(int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(41224);
    if (this.kFT)
    {
      this.kFM.a(paramInt1, paramInt2, paramLong, this.type);
      this.kFT = false;
    }
    AppMethodBeat.o(41224);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41223);
    a locala;
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.collect.model.r))
    {
      paramString = (com.tencent.mm.plugin.collect.model.r)paramm;
      if (this.kFS)
      {
        this.kFo.removeFooterView(this.kmT);
        this.kFS = false;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.foa = paramString.foa;
        this.type = paramString.type;
        this.kCc = paramString.kCc;
        e(paramString.kCd, paramString.kCe, paramString.kCc);
        if (!paramString.kCH.isEmpty())
        {
          if (bo.isNullOrNil(this.gmu))
          {
            ab.d("MicroMsg.CollectBillUI", "first query, hide block view");
            this.kFo.setVisibility(0);
            this.kFL.setVisibility(8);
          }
          locala = this.kFK;
          paramm = paramString.kCH;
          locala.kFl.addAll(paramm);
          locala.notifyDataSetChanged();
          this.gmu = ((com.tencent.mm.plugin.collect.model.a)paramString.kCH.get(paramString.kCH.size() - 1)).kBD;
          this.kFw = false;
          AppMethodBeat.o(41223);
          bool = true;
        }
      }
    }
    while (true)
    {
      return bool;
      this.foa = true;
      if (!bo.isNullOrNil(this.gmu))
        break;
      ab.i("MicroMsg.CollectBillUI", "no record, show empty view");
      aEL();
      break;
      ab.i("MicroMsg.CollectBillUI", "net error!");
      this.kFw = false;
      Toast.makeText(this, 2131298348, 1).show();
      if (bo.isNullOrNil(this.gmu))
        ab.i("MicroMsg.CollectBillUI", "first query failed, finish activity!");
      AppMethodBeat.o(41223);
      bool = true;
      continue;
      if ((paramm instanceof com.tencent.mm.plugin.collect.model.p))
      {
        paramm = (com.tencent.mm.plugin.collect.model.p)paramm;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          locala = this.kFK;
          paramString = paramm.kBD;
          Iterator localIterator = locala.kFl.iterator();
          while (localIterator.hasNext())
          {
            com.tencent.mm.plugin.collect.model.a locala1 = (com.tencent.mm.plugin.collect.model.a)localIterator.next();
            if (locala1.kBD.equals(paramString))
            {
              locala.kFl.remove(locala1);
              locala.notifyDataSetChanged();
            }
          }
          if (this.kFK.getCount() <= 0)
          {
            ab.i("MicroMsg.CollectBillUI", "delete all records");
            aEL();
          }
          while (true)
          {
            AppMethodBeat.o(41223);
            bool = false;
            break;
            e(paramm.kCd, paramm.kCe, this.kCc);
          }
        }
        ab.i("MicroMsg.CollectBillUI", "net error, errType: %s, errCode: %s, errMsg: %s, billId: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm.kBD });
        Toast.makeText(this, 2131298347, 1).show();
        AppMethodBeat.o(41223);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(41223);
        bool = false;
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969150;
  }

  public final void initView()
  {
    AppMethodBeat.i(41221);
    this.kFo = ((ListView)findViewById(2131822815));
    this.kFL = ((LinearLayout)findViewById(2131822816));
    this.kFR = ((TextView)findViewById(2131822814));
    this.kmT = v.hu(this).inflate(2130969157, this.kFo, false);
    this.kFM = new CollectBillHeaderView(this);
    this.kFo.addHeaderView(this.kFM, null, false);
    this.kFK = new a(this);
    this.kFo.setAdapter(this.kFK);
    this.kFo.setOnScrollListener(new CollectBillUI.2(this));
    this.icA = new com.tencent.mm.ui.tools.j(this);
    this.kFo.setOnItemClickListener(new CollectBillUI.3(this));
    this.kFo.setOnItemLongClickListener(new CollectBillUI.4(this));
    if (this.fromScene != 2)
      addTextOptionMenu(0, getString(2131298351), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(41215);
          paramAnonymousMenuItem = new Intent(CollectBillUI.this.mController.ylL, CollectBillListUI.class);
          CollectBillUI.this.startActivity(paramAnonymousMenuItem);
          AppMethodBeat.o(41215);
          return false;
        }
      });
    Object localObject;
    if (this.fromScene == 2)
    {
      View localView = this.kFM.findViewById(2131822824);
      localObject = this.kFL.findViewById(2131822817);
      localView.setVisibility(8);
      ((View)localObject).setVisibility(8);
      AppMethodBeat.o(41221);
      return;
    }
    this.kFN = ((ImageView)this.kFM.findViewById(2131822890));
    this.kFO = ((MMSwitchBtn)this.kFM.findViewById(2131822891));
    this.kFP = ((ImageView)this.kFL.findViewById(2131822890));
    this.kFQ = ((MMSwitchBtn)this.kFL.findViewById(2131822891));
    com.tencent.mm.plugin.collect.a.a.bgv();
    if (com.tencent.mm.plugin.collect.a.a.bgx())
    {
      this.kFO.setCheck(true);
      this.kFQ.setCheck(true);
      this.kFN.setImageResource(2131231131);
      this.kFP.setImageResource(2131231131);
    }
    while (true)
    {
      localObject = new CollectBillUI.6(this);
      this.kFO.setSwitchListener((MMSwitchBtn.a)localObject);
      this.kFQ.setSwitchListener((MMSwitchBtn.a)localObject);
      AppMethodBeat.o(41221);
      break;
      this.kFO.setCheck(false);
      this.kFQ.setCheck(false);
      this.kFN.setImageResource(2131231130);
      this.kFP.setImageResource(2131231130);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41219);
    super.onCreate(paramBundle);
    this.kFU = com.tencent.mm.model.r.YE();
    this.fromScene = getIntent().getIntExtra("key_from_scene", 0);
    this.type = getIntent().getIntExtra("key_type", 0);
    this.kCc = getIntent().getLongExtra("key_timestamp", System.currentTimeMillis() / 1000L);
    bhi();
    initView();
    setMMTitle(2131298355);
    g.RQ();
    g.RO().eJo.a(1256, this.kFV);
    paramBundle = new com.tencent.mm.plugin.collect.model.j();
    g.RQ();
    g.RO().eJo.a(paramBundle, 0);
    AppMethodBeat.o(41219);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(41222);
    paramContextMenu.add(0, 0, 0, 2131298352);
    AppMethodBeat.o(41222);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41220);
    super.onDestroy();
    g.RQ();
    g.RO().eJo.b(1256, this.kFV);
    AppMethodBeat.o(41220);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillUI
 * JD-Core Version:    0.6.2
 */