package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.n.a;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.openim.b.i;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.aln;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.u.a;
import java.util.LinkedList;
import java.util.List;

public class OpenIMAddressUI$OpenIMAddressUIFragment extends MMFragment
  implements com.tencent.mm.ai.f
{
  private ProgressDialog ehJ;
  com.tencent.mm.pluginsdk.ui.d ein;
  List<String> elZ;
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.f jMb;
  private n.d lCi;
  private ListView nIv;
  private com.tencent.mm.ui.voicesearch.b zkc;
  private String zke;
  boolean zks;
  private boolean zkt;
  List<String> zkx;
  private String znZ;
  private t zoa;
  private Runnable zob;

  public OpenIMAddressUI$OpenIMAddressUIFragment()
  {
    super(true);
    AppMethodBeat.i(33784);
    this.znZ = "";
    this.ehJ = null;
    this.zke = "";
    this.zkt = true;
    this.zob = new OpenIMAddressUI.OpenIMAddressUIFragment.18(this);
    this.lCi = new OpenIMAddressUI.OpenIMAddressUIFragment.3(this);
    this.ein = new com.tencent.mm.pluginsdk.ui.d(new OpenIMAddressUI.OpenIMAddressUIFragment.4(this));
    this.elZ = new LinkedList();
    this.zkx = new LinkedList();
    AppMethodBeat.o(33784);
  }

  private void dHA()
  {
    try
    {
      AppMethodBeat.i(33792);
      long l = System.currentTimeMillis();
      dHz();
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("KEVIN updateBlockList() LAST");
      ab.i("MicroMsg.OpenIMAddressUI", System.currentTimeMillis() - l);
      l = System.currentTimeMillis();
      if (this.zoa != null)
      {
        ab.v("MicroMsg.OpenIMAddressUI", "post to do refresh");
        localObject1 = new com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$5;
        ((OpenIMAddressUI.OpenIMAddressUIFragment.5)localObject1).<init>(this);
        al.d((Runnable)localObject1);
      }
      if (this.zkc != null)
      {
        localObject1 = new com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6;
        ((6)localObject1).<init>(this);
        al.d((Runnable)localObject1);
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("KEVIN doRefresh() LAST");
      ab.i("MicroMsg.OpenIMAddressUI", System.currentTimeMillis() - l);
      AppMethodBeat.o(33792);
      return;
    }
    finally
    {
    }
  }

  private void dHz()
  {
    AppMethodBeat.i(33788);
    this.elZ = new LinkedList();
    this.zkx = new LinkedList();
    com.tencent.mm.bp.d.dlL();
    this.elZ.add("tmessage");
    this.zkx.addAll(this.elZ);
    if (!this.elZ.contains("officialaccounts"))
      this.elZ.add("officialaccounts");
    this.elZ.add("helper_entry");
    if (this.zoa != null)
      this.zoa.fl(this.elZ);
    if (this.zkc != null)
      this.zkc.fl(this.zkx);
    AppMethodBeat.o(33788);
  }

  public int getLayoutId()
  {
    return 2130970336;
  }

  public View getLayoutView()
  {
    AppMethodBeat.i(33785);
    View localView = com.tencent.mm.kiss.a.b.SM().a(getContext(), "R.layout.openim_address", 2130970336);
    AppMethodBeat.o(33785);
    return localView;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(33790);
    super.onActivityCreated(paramBundle);
    ab.v("MicroMsg.OpenIMAddressUI", "on address ui create");
    aw.Rg().a(138, this);
    g.RQ();
    g.RO().eJo.a(453, this);
    this.znZ = getStringExtra("key_openim_acctype_id");
    setMMTitle(((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).b(this.znZ, "openim_acct_type_title", b.a.geR));
    setBackBtn(new OpenIMAddressUI.OpenIMAddressUIFragment.1(this));
    setTitleBarDoubleClickListener(this.zob);
    ab.v("MicroMsg.OpenIMAddressUI", "on address ui init view, %s", new Object[] { getResources().getDisplayMetrics() });
    this.nIv = ((ListView)findViewById(2131821054));
    this.nIv.setScrollingCacheEnabled(false);
    this.zoa = new t(getContext(), "@openim.contact", this.znZ);
    this.zoa.a(new OpenIMAddressUI.OpenIMAddressUIFragment.11(this));
    this.zoa.zjK = true;
    this.zoa.zof = this;
    this.zoa.setGetViewPositionCallback(new OpenIMAddressUI.OpenIMAddressUIFragment.12(this));
    this.zoa.setPerformItemClickListener(new OpenIMAddressUI.OpenIMAddressUIFragment.13(this));
    this.zoa.a(new OpenIMAddressUI.OpenIMAddressUIFragment.14(this));
    this.zkc = new com.tencent.mm.ui.voicesearch.b(getContext(), 1);
    this.zkc.qV(true);
    this.jMb = new com.tencent.mm.ui.widget.f(getContext());
    this.nIv.setOnItemClickListener(new OpenIMAddressUI.OpenIMAddressUIFragment.15(this));
    this.nIv.setOnItemLongClickListener(new OpenIMAddressUI.OpenIMAddressUIFragment.16(this));
    this.nIv.setOnTouchListener(new OpenIMAddressUI.OpenIMAddressUIFragment.17(this));
    this.nIv.setOnScrollListener(this.ein);
    this.nIv.setDrawingCacheEnabled(false);
    aw.ZK();
    c.XM().a(this.zoa);
    AppMethodBeat.o(33790);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(33789);
    ab.i("MicroMsg.OpenIMAddressUI", "onAcvityResult requestCode: %d", new Object[] { Integer.valueOf(paramInt1) });
    if ((paramInt1 == 6) && (paramInt2 == -1))
    {
      setResult(-1);
      finish();
      AppMethodBeat.o(33789);
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
        break;
      AppMethodBeat.o(33789);
    }
    switch (paramInt1)
    {
    default:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(33789);
      break;
      setResult(-1, paramIntent);
      finish();
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(33786);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    aw.ZK();
    ad localad = c.XM().aoO(this.zke);
    if (localad == null)
    {
      ab.e("MicroMsg.OpenIMAddressUI", "onCreateContextMenu, contact is null, username = " + this.zke);
      AppMethodBeat.o(33786);
    }
    while (true)
    {
      return;
      if (r.Yz().equals(localad.field_username))
      {
        AppMethodBeat.o(33786);
      }
      else if (com.tencent.mm.model.t.mW(this.zke))
      {
        paramContextMenu.setHeaderTitle(j.b(paramView.getContext(), localad.Oj()));
        paramContextMenu.add(paramContextMenuInfo.position, 2, 0, 2131296448);
        AppMethodBeat.o(33786);
      }
      else if ((com.tencent.mm.model.t.nl(this.zke)) || (com.tencent.mm.model.t.nB(this.zke)))
      {
        AppMethodBeat.o(33786);
      }
      else
      {
        paramContextMenu.setHeaderTitle(j.b(paramView.getContext(), localad.Oj()));
        if ((a.jh(localad.field_type)) && (localad.field_deleteFlag != 1))
          paramContextMenu.add(paramContextMenuInfo.position, 7, 0, 2131298589);
        AppMethodBeat.o(33786);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33794);
    super.onDestroy();
    ab.v("MicroMsg.OpenIMAddressUI", "onDestory");
    aw.Rg().b(138, this);
    g.RQ();
    g.RO().eJo.b(453, this);
    if (this.zoa != null)
    {
      this.zoa.pB(true);
      this.zoa.detach();
      this.zoa.dww();
    }
    if (this.zkc != null)
    {
      this.zkc.detach();
      this.zkc.bIf();
    }
    if ((aw.RK()) && (this.zoa != null))
    {
      aw.ZK();
      c.XM().b(this.zoa);
    }
    AppMethodBeat.o(33794);
  }

  public void onPause()
  {
    AppMethodBeat.i(33793);
    super.onPause();
    ab.i("MicroMsg.OpenIMAddressUI", "AddressUI on Pause");
    if (this.zkc != null)
      this.zkc.onPause();
    this.zoa.dHx();
    al.d(new OpenIMAddressUI.OpenIMAddressUIFragment.10(this));
    AppMethodBeat.o(33793);
  }

  public void onResume()
  {
    AppMethodBeat.i(33791);
    super.onResume();
    ab.v("MicroMsg.OpenIMAddressUI", "address ui on resume");
    if (this.zkt)
    {
      this.zkt = false;
      this.zks = false;
      dHz();
      this.nIv.setAdapter(this.zoa);
      this.nIv.post(new OpenIMAddressUI.OpenIMAddressUIFragment.7(this));
      this.zkc.qU(false);
    }
    while (true)
    {
      if (this.zkc != null)
        this.zkc.onResume();
      this.zoa.ygw = false;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(33774);
          OpenIMAddressUI.OpenIMAddressUIFragment.a(OpenIMAddressUI.OpenIMAddressUIFragment.this).resume();
          AppMethodBeat.o(33774);
        }
      });
      AppMethodBeat.o(33791);
      return;
      if (this.zks)
      {
        this.zks = false;
        com.tencent.mm.sdk.g.d.f(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(33773);
            Process.setThreadPriority(10);
            OpenIMAddressUI.OpenIMAddressUIFragment.k(OpenIMAddressUI.OpenIMAddressUIFragment.this);
            AppMethodBeat.o(33773);
          }
        }
        , "AddressUI_updateUIData");
      }
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33787);
    if (paramm.getType() == 453)
      if ((paramInt1 != 0) || (paramInt2 != 0))
        AppMethodBeat.o(33787);
    while (true)
    {
      return;
      if (!((aln)((i)paramm).ehh.fsH.fsP).wqP.isEmpty())
        dHA();
      AppMethodBeat.o(33787);
      continue;
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if (!ah.cv(getContext()))
        AppMethodBeat.o(33787);
      else if (u.a.a(getContext(), paramInt1, paramInt2, paramString, 4))
        AppMethodBeat.o(33787);
      else if ((paramInt1 != 0) || (paramInt2 != 0))
        AppMethodBeat.o(33787);
      else
        AppMethodBeat.o(33787);
    }
  }

  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment
 * JD-Core Version:    0.6.2
 */