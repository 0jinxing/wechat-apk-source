package com.tencent.mm.plugin.nearby.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.i;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.axv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@i
public class NearbyFriendsUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  boolean eVT;
  private com.tencent.mm.sdk.b.c ecA;
  private com.tencent.mm.modelgeo.d ecr;
  private b.a ecy;
  private ListView gxZ;
  private List<axv> lQs;
  private boolean nOR;
  private boolean nPX;
  private List<axv> nQk;
  private com.tencent.mm.plugin.nearby.a.c oPQ;
  private NearbyFriendsUI.b oQc;
  private com.tencent.mm.plugin.nearby.a.c oQd;
  private com.tencent.mm.plugin.nearby.a.d oQe;
  private boolean oQf;
  private String[] oQg;
  private int oQh;
  private BindMobileOrQQHeaderView oQi;
  private ViewGroup oQj;
  private View oQk;
  private View oQl;
  private boolean oQm;
  private int oQn;
  private boolean oQo;
  private int oQp;
  private View oQq;
  private NearbyFriendsUI.a oQr;
  private com.tencent.mm.ui.base.p tipDialog;

  public NearbyFriendsUI()
  {
    AppMethodBeat.i(55467);
    this.tipDialog = null;
    this.lQs = new LinkedList();
    this.nQk = new LinkedList();
    this.oQf = false;
    this.oQh = 1;
    this.oQm = false;
    this.oQo = false;
    this.nOR = false;
    this.oQp = 0;
    this.oQq = null;
    this.ecA = new NearbyFriendsUI.1(this);
    this.eVT = false;
    this.ecy = new NearbyFriendsUI.8(this);
    AppMethodBeat.o(55467);
  }

  private void bVd()
  {
    AppMethodBeat.i(55470);
    View localView;
    Object localObject;
    int i;
    if (com.tencent.mm.bn.a.dgL())
    {
      if (this.oQq != null)
      {
        this.gxZ.removeHeaderView(this.oQq);
        this.oQq = null;
      }
      localView = View.inflate(this, 2130970291, null);
      localObject = (TextView)localView.findViewById(2131824687);
      com.tencent.mm.kernel.g.RN().QU();
      i = ((j)com.tencent.mm.kernel.g.K(j.class)).bOo().baS();
      if (i != 0)
        break label119;
      localView.setVisibility(8);
      localView = null;
    }
    while (true)
    {
      this.oQq = localView;
      if (this.oQq != null)
        this.gxZ.addHeaderView(this.oQq);
      AppMethodBeat.o(55470);
      return;
      label119: localView.setVisibility(0);
      ((TextView)localObject).setText(getResources().getQuantityString(2131361819, i, new Object[] { Integer.valueOf(i) }));
      ImageView localImageView = (ImageView)localView.findViewById(2131824686);
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).bOo().bOx();
      if (localObject != null)
        a.b.b(localImageView, ((bf)localObject).field_sayhiuser);
      localView.setOnClickListener(new NearbyFriendsUI.9(this));
    }
  }

  private View bVe()
  {
    AppMethodBeat.i(55472);
    if (this.oQj == null)
    {
      this.oQj = new LinearLayout(this);
      this.oQj.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
      ((LinearLayout)this.oQj).setGravity(17);
    }
    this.oQm = true;
    ViewGroup localViewGroup = this.oQj;
    AppMethodBeat.o(55472);
    return localViewGroup;
  }

  private void bVf()
  {
    AppMethodBeat.i(55473);
    com.tencent.mm.plugin.nearby.a.gkE.bg(this);
    AppMethodBeat.o(55473);
  }

  private void getData()
  {
    AppMethodBeat.i(55469);
    this.nOR = false;
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    getString(2131297061);
    this.tipDialog = h.b(localAppCompatActivity, getString(2131301628), true, new NearbyFriendsUI.7(this));
    this.eVT = false;
    if (this.ecr != null)
      this.ecr.a(this.ecy, true);
    AppMethodBeat.o(55469);
  }

  public final int getLayoutId()
  {
    return 2130970287;
  }

  public final void initView()
  {
    AppMethodBeat.i(55471);
    this.gxZ = ((ListView)findViewById(2131826296));
    this.oQc = new NearbyFriendsUI.b(this, this);
    this.gxZ.addHeaderView(bVe());
    Object localObject = com.tencent.mm.m.g.Nu().getValue("LBSShowBindPhone");
    if ((localObject != null) && (((String)localObject).length() > 0));
    try
    {
      this.oQn = Integer.valueOf((String)localObject).intValue();
      localObject = (String)com.tencent.mm.kernel.g.RP().Ry().get(6, null);
      if ((localObject != null) && (((String)localObject).length() > 0))
        this.oQn = 0;
      this.oQp = 0;
      if (com.tencent.mm.model.a.g.aaK().oP("3") != null)
      {
        str = com.tencent.mm.model.a.g.aaK().oP("3").value;
        localObject = l.apS();
        if (str.equals("0"))
          this.oQp = 0;
      }
      else
      {
        if (((this.oQn > 0) || (this.oQp > 0)) && (this.oQp != 1))
        {
          this.oQi = new BindMobileOrQQHeaderView(this);
          this.gxZ.addHeaderView(this.oQi);
        }
        this.gxZ.setAdapter(this.oQc);
        this.gxZ.setOnItemClickListener(new NearbyFriendsUI.10(this));
        this.gxZ.setOnTouchListener(new NearbyFriendsUI.11(this));
        setBackBtn(new NearbyFriendsUI.12(this));
        new NearbyFriendsUI.13(this);
        addIconOptionMenu(0, 2130839555, new NearbyFriendsUI.14(this));
        AppMethodBeat.o(55471);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str;
        this.oQn = 0;
        continue;
        if (str.equals("2"))
        {
          if (localException == l.a.gvA)
          {
            this.oQp = 2;
            com.tencent.mm.model.a.f.oT("3");
          }
        }
        else if ((str.equals("1")) && (localException == l.a.gvx))
        {
          this.oQp = 2;
          com.tencent.mm.model.a.f.oT("3");
        }
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(55474);
    ab.d("MicroMsg.NearbyFriend", "onActivityResult, requestCode %s, resultCode %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default:
    case 1:
    case 2009:
    }
    while (true)
    {
      AppMethodBeat.o(55474);
      while (true)
      {
        return;
        if (paramInt2 != -1)
          break;
        this.oQf = false;
        getData();
        AppMethodBeat.o(55474);
      }
      if (paramInt2 == -1)
        finish();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55468);
    com.tencent.mm.plugin.report.service.g.BN(11);
    super.onCreate(paramBundle);
    setMMTitle(2131301639);
    com.tencent.mm.kernel.g.Rg().a(148, this);
    com.tencent.mm.kernel.g.Rg().a(376, this);
    com.tencent.mm.kernel.g.Rg().a(1087, this);
    this.ecr = com.tencent.mm.modelgeo.d.agz();
    initView();
    this.oQg = new String[] { getResources().getString(2131301631), getResources().getString(2131301630), getResources().getString(2131301629), getResources().getString(2131302717) };
    this.oQh = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(16386, null), 1);
    if (this.oQh == 3)
      MZ(2131231387);
    while (true)
    {
      getData();
      AppMethodBeat.o(55468);
      return;
      if (this.oQh == 4)
      {
        MZ(2131231386);
      }
      else
      {
        MZ(0);
        this.oQh = 1;
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(55477);
    if (this.oQp > 0)
      com.tencent.mm.model.a.f.oU("3");
    com.tencent.mm.plugin.report.service.g.BP(11);
    com.tencent.mm.kernel.g.Rg().b(148, this);
    com.tencent.mm.kernel.g.Rg().b(376, this);
    com.tencent.mm.kernel.g.Rg().b(1087, this);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    if (this.ecr != null)
      this.ecr.c(this.ecy);
    o.acv().cancel();
    if (this.oQc != null)
    {
      NearbyFriendsUI.b localb = this.oQc;
      if (localb.gvm != null)
      {
        localb.gvm.detach();
        localb.gvm = null;
      }
    }
    super.onDestroy();
    AppMethodBeat.o(55477);
  }

  public void onPause()
  {
    AppMethodBeat.i(55475);
    super.onPause();
    if (this.ecr != null)
      this.ecr.c(this.ecy);
    com.tencent.mm.sdk.b.a.xxA.d(this.ecA);
    AppMethodBeat.o(55475);
  }

  public void onResume()
  {
    AppMethodBeat.i(55476);
    super.onResume();
    if (this.ecr != null)
      this.ecr.a(this.ecy, true);
    bVd();
    this.oQc.notifyDataSetChanged();
    com.tencent.mm.kernel.g.RN().QU();
    if (((j)com.tencent.mm.kernel.g.K(j.class)).bOo().baS() == 0)
      this.gxZ.removeHeaderView(this.oQl);
    com.tencent.mm.sdk.b.a.xxA.c(this.ecA);
    AppMethodBeat.o(55476);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(55478);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    label311: label326: label462: Object localObject;
    if (paramm.getType() == 148)
    {
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      int i = ((com.tencent.mm.plugin.nearby.a.c)paramm).Ah();
      if ((this.oQd == null) && ((i == 1) || (i == 3) || (i == 4)))
        AppMethodBeat.o(55478);
      while (true)
      {
        return;
        if (((i == 1) || (i == 3) || (i == 4)) && (this.oQf))
        {
          ab.v("MicroMsg.NearbyFriend", "onSceneEnd data already requested, code=%d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(55478);
        }
        else if ((this.oPQ == null) && (i == 2))
        {
          AppMethodBeat.o(55478);
        }
        else
        {
          ab.i("MicroMsg.NearbyFriend", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          if (paramm.getType() == 148)
            break;
          AppMethodBeat.o(55478);
        }
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ((i == 1) || (i == 3) || (i == 4))
        {
          this.lQs = ((com.tencent.mm.plugin.nearby.a.c)paramm).bUZ();
          if ((this.lQs == null) || (this.lQs.size() == 0))
          {
            findViewById(2131826297).setVisibility(0);
            this.gxZ.setVisibility(8);
            bVf();
            com.tencent.mm.plugin.report.service.g.BP(11);
            if (this.oQh != 3)
              break label832;
            MZ(2131231387);
            this.oQf = true;
            this.oQd = null;
          }
        }
        else
        {
          if (((com.tencent.mm.plugin.nearby.a.c)paramm).Ah() == 2)
          {
            h.a(this.mController.ylL, getString(2131301617), "", new NearbyFriendsUI.5(this));
            this.oPQ = null;
          }
          if (!((com.tencent.mm.plugin.nearby.a.c)paramm).bUX())
            break label874;
          paramString = getString(2131301642);
          paramInt1 = ((com.tencent.mm.plugin.nearby.a.c)paramm).bUY();
          if (this.oQj != null)
          {
            if (this.oQk != null)
              break label863;
            this.oQk = View.inflate(this, 2130970292, null);
            this.oQj.addView(this.oQk);
            this.oQk.setOnClickListener(new NearbyFriendsUI.2(this));
            ((TextView)this.oQk.findViewById(2131826311)).setText(paramString);
            if (paramInt1 != 0)
              ((TextView)this.oQk.findViewById(2131826312)).setText(String.format(getResources().getQuantityString(2131361812, paramInt1, new Object[] { Integer.valueOf(paramInt1) }), new Object[0]));
          }
        }
        while (true)
        {
          this.oQo = true;
          AppMethodBeat.o(55478);
          break;
          LinkedList localLinkedList = new LinkedList();
          localObject = this.lQs.iterator();
          paramInt1 = 0;
          while (((Iterator)localObject).hasNext())
          {
            paramString = (axv)((Iterator)localObject).next();
            if (((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoJ(paramString.jBB))
            {
              localLinkedList.add(paramInt1, paramString);
              paramInt1++;
            }
            else if ((!bo.isNullOrNil(paramString.jBB)) && (!bo.isNullOrNil(paramString.wBS)))
            {
              localLinkedList.add(paramString);
            }
          }
          this.lQs.clear();
          this.lQs = localLinkedList;
          if (this.nQk != null)
            for (paramInt1 = this.nQk.size() - 1; paramInt1 >= 0; paramInt1--)
              if (this.nQk.get(paramInt1) != null)
                this.lQs.add(0, this.nQk.get(paramInt1));
          if ((this.lQs == null) || (this.lQs.size() == 0))
          {
            findViewById(2131826297).setVisibility(0);
            this.gxZ.setVisibility(8);
            break label311;
          }
          findViewById(2131826297).setVisibility(8);
          this.oQc.notifyDataSetChanged();
          if (this.oQc.getCount() > 0)
            this.gxZ.setSelection(0);
          this.gxZ.post(new NearbyFriendsUI.4(this));
          break label311;
          label832: if (this.oQh == 4)
          {
            MZ(2131231386);
            break label326;
          }
          MZ(0);
          this.oQh = 1;
          break label326;
          label863: this.oQk.setVisibility(0);
          break label462;
          label874: if ((this.oQk != null) && (this.oQj != null))
            this.oQk.setVisibility(8);
        }
      }
      if ((i == 1) || (i == 3) || (i == 4))
      {
        localObject = (TextView)findViewById(2131826297);
        ((TextView)localObject).setVisibility(0);
        bVf();
        if ((paramString == null) || (paramString.length() <= 0))
          break label1239;
      }
    }
    label1239: for (paramString = com.tencent.mm.h.a.jY(paramString); ; paramString = null)
    {
      if ((paramString != null) && (paramString.desc != null) && (paramString.desc.length() > 0))
        ((TextView)localObject).setText(paramString.desc);
      while (true)
      {
        this.gxZ.setVisibility(8);
        this.oQd = null;
        if (((com.tencent.mm.plugin.nearby.a.c)paramm).Ah() == 2)
        {
          Toast.makeText(this, 2131301616, 1).show();
          this.oPQ = null;
        }
        AppMethodBeat.o(55478);
        break;
        if (paramInt2 == -2001)
          ((TextView)localObject).setText(getString(2131301619));
        else
          ((TextView)localObject).setText(getString(2131301622));
      }
      if (paramm.getType() == 376)
      {
        if (((com.tencent.mm.plugin.nearby.a.d)paramm).Ah() != 1)
        {
          AppMethodBeat.o(55478);
          break;
        }
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0) && (((com.tencent.mm.plugin.nearby.a.d)paramm).gfa != null))
        {
          paramString = ((com.tencent.mm.plugin.nearby.a.d)paramm).gfa;
          com.tencent.mm.plugin.nearby.a.b.fr(paramString, ((com.tencent.mm.plugin.nearby.a.d)paramm).oPy);
          paramm = new Intent();
          paramm.putExtra("Chat_User", paramString);
          com.tencent.mm.plugin.nearby.a.gkE.e(paramm, this);
          AppMethodBeat.o(55478);
          break;
        }
        h.a(this.mController.ylL, 2131301640, 2131297061, new NearbyFriendsUI.6(this));
      }
      AppMethodBeat.o(55478);
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class c
  {
    public static int oQy = 10000;

    public static boolean Aa(int paramInt)
    {
      if (paramInt == oQy);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public static String b(axv paramaxv)
    {
      if (paramaxv != null);
      for (paramaxv = paramaxv.guO; ; paramaxv = null)
        return paramaxv;
    }
  }

  static final class d
  {
    TextView gtG;
    ImageView gvq;
    TextView gvr;
    TextView oQA;
    ImageView oQB;
    ImageView oQC;
    ImageView oQD;
    ImageView oQE;
    ImageView oQF;
    ImageView oQG;
    TextView oQz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI
 * JD-Core Version:    0.6.2
 */