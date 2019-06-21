package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.e.b;
import com.tencent.mm.ui.widget.a.d;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public class NormalUserFooterPreference extends Preference
  implements k.a
{
  private MMActivity crP;
  public ProgressDialog ehJ;
  private ad ehM;
  protected com.tencent.mm.sdk.e.l<NormalUserFooterPreference.e, String> fry;
  private int gwP;
  private String jEs;
  private boolean lyb;
  private String mGZ;
  private Button oik;
  private boolean pkC;
  private boolean pli;
  private int pmD;
  private int pmV;
  private String pnd;
  private boolean pni;
  private long pnz;
  private View poA;
  private Button poB;
  private Button poC;
  private Button poD;
  private View poE;
  private Button poF;
  private TextView poG;
  private View poH;
  private Button poI;
  private Button poJ;
  private Button poK;
  private Button poL;
  private Button poM;
  private Button poN;
  private TextView poO;
  private boolean poP;
  public boolean poQ;
  private boolean pov;
  private boolean pow;
  private boolean pox;
  private boolean poy;
  private NormalUserFooterPreference.a poz;

  public NormalUserFooterPreference(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(23733);
    this.pkC = false;
    this.pnz = 0L;
    this.pnd = "";
    this.mGZ = "";
    this.pni = false;
    this.pox = false;
    this.poy = false;
    this.poP = false;
    this.pmD = 0;
    this.ehJ = null;
    this.poQ = false;
    this.jEs = null;
    this.fry = new NormalUserFooterPreference.1(this);
    this.crP = ((MMActivity)paramContext);
    init();
    AppMethodBeat.o(23733);
  }

  public NormalUserFooterPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23734);
    this.pkC = false;
    this.pnz = 0L;
    this.pnd = "";
    this.mGZ = "";
    this.pni = false;
    this.pox = false;
    this.poy = false;
    this.poP = false;
    this.pmD = 0;
    this.ehJ = null;
    this.poQ = false;
    this.jEs = null;
    this.fry = new NormalUserFooterPreference.1(this);
    this.crP = ((MMActivity)paramContext);
    init();
    AppMethodBeat.o(23734);
  }

  public NormalUserFooterPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23735);
    this.pkC = false;
    this.pnz = 0L;
    this.pnd = "";
    this.mGZ = "";
    this.pni = false;
    this.pox = false;
    this.poy = false;
    this.poP = false;
    this.pmD = 0;
    this.ehJ = null;
    this.poQ = false;
    this.jEs = null;
    this.fry = new NormalUserFooterPreference.1(this);
    this.crP = ((MMActivity)paramContext);
    init();
    AppMethodBeat.o(23735);
  }

  private void init()
  {
    this.lyb = false;
    this.poz = null;
  }

  private void initView()
  {
    AppMethodBeat.i(23736);
    if ((!this.lyb) || (this.ehM == null))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NormalUserFooterPreference", "iniView : bindView = " + this.lyb + " contact = " + this.ehM);
      if (this.poz == null);
    }
    while (true)
    {
      try
      {
        this.poz.cbp();
        AppMethodBeat.o(23736);
        return;
      }
      catch (Throwable localThrowable)
      {
      }
      AppMethodBeat.o(23736);
      continue;
      if (this.poz != null)
        this.poz.Xy();
      cbk();
      AppMethodBeat.o(23736);
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(23741);
    if (bo.nullAsNil(paramString).length() <= 0)
      AppMethodBeat.o(23741);
    while (true)
    {
      return;
      if ((this.ehM != null) && ((paramString.equals(this.ehM.field_username)) || (paramString.equals(this.ehM.field_encryptUsername))))
      {
        aw.ZK();
        this.ehM = com.tencent.mm.model.c.XM().aoO(this.ehM.field_username);
        al.d(new NormalUserFooterPreference.2(this));
      }
      AppMethodBeat.o(23741);
    }
  }

  public final boolean a(ad paramad, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt1, int paramInt2, boolean paramBoolean4, boolean paramBoolean5, long paramLong, String paramString2)
  {
    AppMethodBeat.i(23738);
    biV();
    if (paramad != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bo.nullAsNil(paramad.field_username).length() <= 0)
        break label76;
    }
    label76: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if (!ad.aoC(r.Yz()).equals(paramad.field_username))
        break label82;
      paramBoolean1 = false;
      AppMethodBeat.o(23738);
      return paramBoolean1;
      bool = false;
      break;
    }
    label82: this.ehM = paramad;
    this.mGZ = paramString1;
    this.pli = paramBoolean1;
    this.gwP = paramInt1;
    this.pmV = paramInt2;
    this.pow = bo.a(Boolean.valueOf(t.mW(paramad.field_username)), false);
    this.pkC = paramBoolean4;
    this.pov = paramBoolean5;
    this.pnz = paramLong;
    this.pnd = paramString2;
    this.poQ = false;
    if (paramad.field_deleteFlag == 1)
    {
      paramBoolean1 = true;
      label166: this.pni = paramBoolean1;
      this.poP = this.crP.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
      this.pmD = this.crP.getIntent().getIntExtra("add_more_friend_search_scene", 0);
      this.pox = this.crP.getIntent().getBooleanExtra("Contact_IsLbsChattingProfile", false);
      this.poy = this.crP.getIntent().getBooleanExtra("Contact_IsLbsGotoChatting", false);
      this.jEs = this.crP.getIntent().getStringExtra("lbs_ticket");
      if (!r.mG(paramad.field_username))
      {
        aw.ZK();
        if (!com.tencent.mm.model.c.XU().has(paramad.field_username))
          break label326;
      }
      this.poz = new NormalUserFooterPreference.c(this);
      this.poQ = true;
    }
    while (true)
    {
      initView();
      paramBoolean1 = true;
      AppMethodBeat.o(23738);
      break;
      paramBoolean1 = false;
      break label166;
      label326: if (ad.aou(paramad.field_username))
      {
        this.poz = new h();
      }
      else if (t.nl(paramad.field_username))
      {
        this.poz = new NormalUserFooterPreference.d(this);
      }
      else if (t.mW(paramad.field_username))
      {
        this.poz = new g();
      }
      else if (ad.aov(paramad.field_username))
      {
        this.poz = new NormalUserFooterPreference.f(this);
      }
      else if ((com.tencent.mm.n.a.jh(paramad.field_type)) && (!ad.mR(paramad.field_username)))
      {
        this.poz = new NormalUserFooterPreference.c(this);
        this.poQ = true;
      }
      else if (paramBoolean2)
      {
        this.poz = new j();
        this.poQ = true;
      }
      else if ((paramBoolean3) || (ad.mR(paramad.field_username)))
      {
        this.poz = new NormalUserFooterPreference.b(this);
      }
      else
      {
        this.poz = new NormalUserFooterPreference.c(this);
        this.poQ = true;
      }
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23740);
    if (this.poz != null)
      this.poz.onDetach();
    this.fry.removeAll();
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    AppMethodBeat.o(23740);
    return true;
  }

  public final boolean cbk()
  {
    boolean bool = false;
    AppMethodBeat.i(23739);
    if ((this.poP) && (com.tencent.mm.n.a.jh(this.ehM.field_type)))
    {
      this.poN.setVisibility(0);
      bool = true;
      AppMethodBeat.o(23739);
    }
    while (true)
    {
      return bool;
      this.poN.setVisibility(8);
      AppMethodBeat.o(23739);
    }
  }

  public final void cbl()
  {
    AppMethodBeat.i(23742);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.crP, "android.permission.RECORD_AUDIO", 82, "", "");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NormalUserFooterPreference", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.crP });
    if (!bool)
      AppMethodBeat.o(23742);
    while (true)
    {
      return;
      ui localui = new ui();
      localui.cQx.cAd = 5;
      localui.cQx.talker = this.ehM.field_username;
      localui.cQx.context = this.crP;
      localui.cQx.cQs = 4;
      com.tencent.mm.sdk.b.a.xxA.m(localui);
      AppMethodBeat.o(23742);
    }
  }

  public final void cbm()
  {
    AppMethodBeat.i(23743);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.crP, "android.permission.CAMERA", 19, "", "");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NormalUserFooterPreference", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.crP });
    if (!bool)
      AppMethodBeat.o(23743);
    while (true)
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.b.a(this.crP, "android.permission.RECORD_AUDIO", 19, "", "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NormalUserFooterPreference", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.crP });
      if (!bool)
      {
        AppMethodBeat.o(23743);
      }
      else
      {
        ui localui = new ui();
        localui.cQx.cAd = 5;
        localui.cQx.talker = this.ehM.field_username;
        localui.cQx.context = this.crP;
        localui.cQx.cQs = 2;
        com.tencent.mm.sdk.b.a.xxA.m(localui);
        AppMethodBeat.o(23743);
      }
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23737);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NormalUserFooterPreference", "on bindView " + paramView.toString());
    this.poA = paramView.findViewById(2131822978);
    this.poB = ((Button)paramView.findViewById(2131822979));
    this.poC = ((Button)paramView.findViewById(2131822986));
    this.poF = ((Button)paramView.findViewById(2131822982));
    this.poG = ((TextView)paramView.findViewById(2131822993));
    this.poE = paramView.findViewById(2131822981);
    this.poD = ((Button)paramView.findViewById(2131822980));
    this.poK = ((Button)paramView.findViewById(2131822987));
    this.poH = paramView.findViewById(2131822983);
    this.poI = ((Button)paramView.findViewById(2131822985));
    this.poJ = ((Button)paramView.findViewById(2131822984));
    this.oik = ((Button)paramView.findViewById(2131822988));
    this.poN = ((Button)paramView.findViewById(2131822991));
    this.poL = ((Button)paramView.findViewById(2131822989));
    this.poM = ((Button)paramView.findViewById(2131822990));
    this.poO = ((TextView)paramView.findViewById(2131822992));
    this.lyb = true;
    initView();
    super.onBindView(paramView);
    if ((this.crP.getIntent().getBooleanExtra("Accept_NewFriend_FromOutside", false) == true) && (this.poB != null))
      this.poB.performClick();
    AppMethodBeat.o(23737);
  }

  final class g extends NormalUserFooterPreference.a
  {
    public g()
    {
      super();
    }

    protected final void cbn()
    {
      boolean bool1 = true;
      AppMethodBeat.i(23714);
      if (!r.mG(NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_username))
      {
        bool2 = true;
        Assert.assertTrue(bool2);
        if (t.nI(NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_username))
          break label147;
      }
      label147: for (boolean bool2 = bool1; ; bool2 = false)
      {
        Assert.assertTrue(bool2);
        NormalUserFooterPreference.r(NormalUserFooterPreference.this).setVisibility(8);
        NormalUserFooterPreference.s(NormalUserFooterPreference.this).setVisibility(8);
        NormalUserFooterPreference.f(NormalUserFooterPreference.this).setText(2131298669);
        NormalUserFooterPreference.f(NormalUserFooterPreference.this).setVisibility(0);
        NormalUserFooterPreference.h(NormalUserFooterPreference.this).setVisibility(8);
        NormalUserFooterPreference.t(NormalUserFooterPreference.this).setVisibility(8);
        NormalUserFooterPreference.q(NormalUserFooterPreference.this).setVisibility(8);
        AppMethodBeat.o(23714);
        return;
        bool2 = false;
        break;
      }
    }

    public final void cbp()
    {
    }
  }

  final class h extends NormalUserFooterPreference.a
  {
    public h()
    {
      super();
    }

    protected final void cbn()
    {
      AppMethodBeat.i(23715);
      NormalUserFooterPreference.r(NormalUserFooterPreference.this).setVisibility(8);
      NormalUserFooterPreference.f(NormalUserFooterPreference.this).setVisibility(0);
      if ((!NormalUserFooterPreference.this.cbk()) && (!NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_username.equals(r.Yz())) && (!t.nI(NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_username)) && (!t.nB(NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_username)))
        NormalUserFooterPreference.h(NormalUserFooterPreference.this).setVisibility(0);
      while (true)
      {
        NormalUserFooterPreference.f(NormalUserFooterPreference.this).setText(2131298665);
        NormalUserFooterPreference.t(NormalUserFooterPreference.this).setVisibility(8);
        NormalUserFooterPreference.s(NormalUserFooterPreference.this).setVisibility(8);
        NormalUserFooterPreference.q(NormalUserFooterPreference.this).setVisibility(8);
        AppMethodBeat.o(23715);
        return;
        NormalUserFooterPreference.h(NormalUserFooterPreference.this).setVisibility(8);
      }
    }

    protected final void cbp()
    {
    }
  }

  class i extends NormalUserFooterPreference.c
    implements f
  {
    private ProgressDialog ehJ;

    public i()
    {
      super();
    }

    private void NB()
    {
      AppMethodBeat.i(23722);
      NormalUserFooterPreference localNormalUserFooterPreference = NormalUserFooterPreference.this;
      aw.ZK();
      ad localad1 = com.tencent.mm.model.c.XM().aoO(NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_username);
      if (localad1 != null)
      {
        localad2 = localad1;
        if ((int)localad1.ewQ != 0);
      }
      else
      {
        localad2 = NormalUserFooterPreference.a(NormalUserFooterPreference.this);
        aw.ZK();
        if (com.tencent.mm.model.c.XM().Y(localad2))
          break label131;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NormalUserFooterPreference", "insert contact failed, username = " + localad2.field_username);
      }
      for (ad localad2 = null; ; localad2 = com.tencent.mm.model.c.XM().aoO(NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_username))
      {
        NormalUserFooterPreference.a(localNormalUserFooterPreference, localad2);
        if (NormalUserFooterPreference.a(NormalUserFooterPreference.this) != null)
          t.q(NormalUserFooterPreference.a(NormalUserFooterPreference.this));
        AppMethodBeat.o(23722);
        return;
        label131: aw.ZK();
      }
    }

    protected void cbn()
    {
      AppMethodBeat.i(23719);
      onDetach();
      onStop();
      aw.Rg().a(30, this);
      aw.Rg().a(667, this);
      aw.Rg().a(853, this);
      super.cbn();
      AppMethodBeat.o(23719);
    }

    protected void cbu()
    {
      AppMethodBeat.i(23723);
      if (NormalUserFooterPreference.u(NormalUserFooterPreference.this) != null)
        NormalUserFooterPreference.u(NormalUserFooterPreference.this).onDetach();
      NormalUserFooterPreference.a(NormalUserFooterPreference.this, new NormalUserFooterPreference.c(NormalUserFooterPreference.this));
      NormalUserFooterPreference.u(NormalUserFooterPreference.this).Xy();
      AppMethodBeat.o(23723);
    }

    protected void onDetach()
    {
      AppMethodBeat.i(23721);
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if (NormalUserFooterPreference.r(NormalUserFooterPreference.this) != null)
        NormalUserFooterPreference.r(NormalUserFooterPreference.this).setVisibility(8);
      if (NormalUserFooterPreference.s(NormalUserFooterPreference.this) != null)
        NormalUserFooterPreference.s(NormalUserFooterPreference.this).setVisibility(0);
      if (NormalUserFooterPreference.f(NormalUserFooterPreference.this) != null)
        NormalUserFooterPreference.f(NormalUserFooterPreference.this).setVisibility(8);
      if (NormalUserFooterPreference.g(NormalUserFooterPreference.this) != null)
        NormalUserFooterPreference.g(NormalUserFooterPreference.this).setVisibility(8);
      if (NormalUserFooterPreference.h(NormalUserFooterPreference.this) != null)
        NormalUserFooterPreference.h(NormalUserFooterPreference.this).setVisibility(8);
      if (NormalUserFooterPreference.t(NormalUserFooterPreference.this) != null)
        NormalUserFooterPreference.t(NormalUserFooterPreference.this).setVisibility(8);
      if (NormalUserFooterPreference.q(NormalUserFooterPreference.this) != null)
        NormalUserFooterPreference.q(NormalUserFooterPreference.this).setVisibility(8);
      onStop();
      AppMethodBeat.o(23721);
    }

    public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
    {
      int i = 0;
      AppMethodBeat.i(23724);
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NormalUserFooterPreference", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
      if ((paramm.getType() != 30) && (paramm.getType() != 667) && (paramm.getType() != 853))
        AppMethodBeat.o(23724);
      while (true)
      {
        return;
        onStop();
        if (this.ehJ != null)
        {
          this.ehJ.dismiss();
          this.ehJ = null;
        }
        if (!bo.cv(NormalUserFooterPreference.this.mContext))
        {
          AppMethodBeat.o(23724);
        }
        else
        {
          if ((paramInt1 != 0) || (paramInt2 != 0))
            break;
          if (paramm.getType() == 30)
          {
            paramInt1 = ((com.tencent.mm.pluginsdk.model.m)paramm).cAd;
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NormalUserFooterPreference", "VerifyBaseHandler onSceneEnd, opCode = ".concat(String.valueOf(paramInt1)));
            if ((paramInt1 == 1) || (paramInt1 == 3))
            {
              paramString = ((com.tencent.mm.pluginsdk.model.m)paramm).vbm;
              if ((paramString != null) && (paramString.contains(NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_username)))
              {
                NormalUserFooterPreference.v(NormalUserFooterPreference.this);
                NB();
                cbu();
                paramString = paramString.iterator();
                while (paramString.hasNext())
                  com.tencent.mm.pluginsdk.ui.preference.b.bG((String)paramString.next(), NormalUserFooterPreference.l(NormalUserFooterPreference.this));
                aw.getNotification().IH();
              }
            }
            AppMethodBeat.o(23724);
          }
          else
          {
            if ((paramm.getType() != 667) && (paramm.getType() != 853))
              break;
            NormalUserFooterPreference.v(NormalUserFooterPreference.this);
            NB();
            cbu();
            com.tencent.mm.pluginsdk.ui.preference.b.bG(NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_username, NormalUserFooterPreference.l(NormalUserFooterPreference.this));
            aw.getNotification().IH();
            AppMethodBeat.o(23724);
          }
        }
      }
      if ((paramInt1 == 4) && (paramInt2 == -302))
        if (paramm.getType() != 30)
          break label890;
      label890: for (paramInt1 = ((com.tencent.mm.pluginsdk.model.m)paramm).cAd; ; paramInt1 = 0)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NormalUserFooterPreference", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", new Object[] { Integer.valueOf(paramInt1) });
        if ((paramInt1 == 3) || (paramm.getType() == 853))
          com.tencent.mm.ui.base.h.d(NormalUserFooterPreference.b(NormalUserFooterPreference.this), NormalUserFooterPreference.b(NormalUserFooterPreference.this).getString(2131298744), NormalUserFooterPreference.b(NormalUserFooterPreference.this).getString(2131297061), NormalUserFooterPreference.b(NormalUserFooterPreference.this).getString(2131296521), NormalUserFooterPreference.b(NormalUserFooterPreference.this).getString(2131296868), new NormalUserFooterPreference.i.3(this), null);
        AppMethodBeat.o(23724);
        break;
        if ((paramInt1 == 4) && (paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
        {
          Toast.makeText(NormalUserFooterPreference.b(NormalUserFooterPreference.this), paramString, 1).show();
          AppMethodBeat.o(23724);
          break;
        }
        int j = i;
        switch (paramInt1)
        {
        default:
          j = i;
        case 3:
        case 1:
        case 2:
        case 4:
        }
        while (true)
          if (j != 0)
          {
            AppMethodBeat.o(23724);
            break;
            if (aw.Rg().acT())
            {
              aw.Rg().getNetworkServerIp();
              new StringBuilder().append(paramInt2);
              j = 1;
            }
            else
            {
              j = i;
              if (com.tencent.mm.network.ab.ch(NormalUserFooterPreference.this.mContext))
              {
                com.tencent.mm.pluginsdk.ui.tools.h.fR(NormalUserFooterPreference.this.mContext);
                j = 1;
                continue;
                Toast.makeText(NormalUserFooterPreference.this.mContext, NormalUserFooterPreference.this.mContext.getString(2131299946, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 3000).show();
                j = 1;
                continue;
                if (paramInt2 == -100)
                {
                  com.tencent.mm.ui.base.h.a(NormalUserFooterPreference.this.mContext, aw.QH(), com.tencent.mm.bz.a.an(NormalUserFooterPreference.this.mContext, 2131297061), new DialogInterface.OnClickListener()
                  {
                    public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                    {
                      AppMethodBeat.i(23716);
                      NormalUserFooterPreference.i.this.onStop();
                      paramAnonymousDialogInterface = new Intent();
                      paramAnonymousDialogInterface.putExtra("Intro_Switch", true).addFlags(67108864);
                      com.tencent.mm.plugin.profile.b.gkE.p(paramAnonymousDialogInterface, NormalUserFooterPreference.this.mContext);
                      AppMethodBeat.o(23716);
                    }
                  }
                  , new NormalUserFooterPreference.i.2(this));
                  j = 1;
                }
                else
                {
                  if ((paramInt1 == 4) && (paramInt2 == -34))
                    paramm = NormalUserFooterPreference.b(NormalUserFooterPreference.this).getString(2131299915);
                  while (true)
                  {
                    Toast.makeText(NormalUserFooterPreference.b(NormalUserFooterPreference.this), paramm, 1).show();
                    j = i;
                    break;
                    if ((paramInt1 == 4) && (paramInt2 == -94))
                    {
                      paramm = NormalUserFooterPreference.b(NormalUserFooterPreference.this).getString(2131299918);
                    }
                    else if (paramInt1 == 4)
                    {
                      paramm = paramString;
                      if (!bo.isNullOrNil(paramString));
                    }
                    else
                    {
                      paramm = NormalUserFooterPreference.b(NormalUserFooterPreference.this).getString(2131302960);
                    }
                  }
                }
              }
            }
          }
        AppMethodBeat.o(23724);
        break;
      }
    }

    final void onStop()
    {
      AppMethodBeat.i(23720);
      aw.Rg().b(30, this);
      aw.Rg().b(667, this);
      aw.Rg().b(853, this);
      AppMethodBeat.o(23720);
    }
  }

  final class j extends NormalUserFooterPreference.i
    implements f
  {
    public j()
    {
      super();
    }

    protected final void cbn()
    {
      AppMethodBeat.i(23729);
      super.cbn();
      NormalUserFooterPreference.r(NormalUserFooterPreference.this).setVisibility(0);
      NormalUserFooterPreference.t(NormalUserFooterPreference.this).setVisibility(8);
      NormalUserFooterPreference.f(NormalUserFooterPreference.this).setVisibility(8);
      NormalUserFooterPreference.g(NormalUserFooterPreference.this).setVisibility(8);
      NormalUserFooterPreference.h(NormalUserFooterPreference.this).setVisibility(8);
      NormalUserFooterPreference.k(NormalUserFooterPreference.this).setVisibility(8);
      NormalUserFooterPreference.s(NormalUserFooterPreference.this).setVisibility(8);
      NormalUserFooterPreference.q(NormalUserFooterPreference.this).setVisibility(8);
      NormalUserFooterPreference.i(NormalUserFooterPreference.this).setVisibility(0);
      NormalUserFooterPreference.w(NormalUserFooterPreference.this).setVisibility(0);
      if (NormalUserFooterPreference.a(NormalUserFooterPreference.this).Oa())
      {
        NormalUserFooterPreference.x(NormalUserFooterPreference.this).setText(NormalUserFooterPreference.b(NormalUserFooterPreference.this).getString(2131298599));
        NormalUserFooterPreference.q(NormalUserFooterPreference.this).setVisibility(0);
      }
      while (true)
      {
        NormalUserFooterPreference.z(NormalUserFooterPreference.this).setOnClickListener(new NormalUserFooterPreference.j.1(this));
        NormalUserFooterPreference.x(NormalUserFooterPreference.this).setOnClickListener(new NormalUserFooterPreference.j.2(this));
        AppMethodBeat.o(23729);
        return;
        NormalUserFooterPreference.x(NormalUserFooterPreference.this).setText(NormalUserFooterPreference.b(NormalUserFooterPreference.this).getString(2131298594));
      }
    }

    protected final void cbp()
    {
      AppMethodBeat.i(23728);
      if ((NormalUserFooterPreference.a(NormalUserFooterPreference.this) != null) && (com.tencent.mm.n.a.jh(NormalUserFooterPreference.a(NormalUserFooterPreference.this).field_type)))
      {
        cbo();
        AppMethodBeat.o(23728);
      }
      while (true)
      {
        return;
        F(false, true);
        AppMethodBeat.o(23728);
      }
    }

    protected final void cbu()
    {
      AppMethodBeat.i(23731);
      super.cbu();
      AppMethodBeat.o(23731);
    }

    protected final void onDetach()
    {
      AppMethodBeat.i(23730);
      super.onDetach();
      AppMethodBeat.o(23730);
    }

    public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
    {
      AppMethodBeat.i(23732);
      super.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(23732);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference
 * JD-Core Version:    0.6.2
 */