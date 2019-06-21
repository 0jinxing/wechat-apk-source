package com.tencent.mm.ui.chatting.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActionBarContainer;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.b.b.a;
import com.tencent.mm.model.b.b.b;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ae;
import com.tencent.mm.ui.chatting.c.b.f;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.conversation.a.e;
import com.tencent.mm.ui.conversation.a.e.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.r.class)
public class t extends a
  implements com.tencent.mm.ui.chatting.c.b.r
{
  private int qvb;
  private final k.a yOu;
  private boolean yOx;
  protected LinearLayout yQi;
  protected LinearLayout yQj;
  private List<String> yQk;
  private String yQl;
  private ActionBarContainer yQm;
  public com.tencent.mm.ui.r yQn;
  private com.tencent.mm.ui.a yQo;
  private View yQp;
  final com.tencent.mm.ui.t yQq;
  private b.a yQr;
  private Runnable yQs;
  private final d.a yQt;
  private MenuItem.OnMenuItemClickListener yQu;
  final int yQv;
  final int yQw;
  final MenuItem.OnMenuItemClickListener yQx;
  private View yQy;
  private View yQz;

  public t()
  {
    AppMethodBeat.i(31493);
    this.yQk = new LinkedList();
    this.qvb = 0;
    this.yQm = null;
    this.yQn = null;
    this.yOx = false;
    this.yQq = new t.a(this);
    this.yQr = new t.1(this);
    this.yQs = null;
    this.yQt = new t.3(this);
    this.yOu = new k.a()
    {
      public final void a(String paramAnonymousString, m paramAnonymousm)
      {
        AppMethodBeat.i(31478);
        ab.v("MicroMsg.ChattingUI.HeaderComponent", "roommember watcher notify ".concat(String.valueOf(paramAnonymousString)));
        if ((t.this.cgL.dFx()) && (!bo.isNullOrNil(paramAnonymousString)))
        {
          t.this.dEm();
          t.this.dEp();
        }
        AppMethodBeat.o(31478);
      }
    };
    this.yQu = new t.7(this);
    this.yQv = 1;
    this.yQw = 2;
    this.yQx = new t.8(this);
    this.yQy = null;
    this.yQz = null;
    AppMethodBeat.o(31493);
  }

  private void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    AppMethodBeat.i(31516);
    if (this.cgL.yTx.findMenuInfo(0) == null)
    {
      this.cgL.yTx.addIconOptionMenu(0, paramInt1, paramInt2, paramOnMenuItemClickListener);
      AppMethodBeat.o(31516);
    }
    while (true)
    {
      return;
      this.cgL.yTx.updateOptionMenu(0, paramInt1, paramInt2, paramOnMenuItemClickListener);
      AppMethodBeat.o(31516);
    }
  }

  private static void a(ActionBar paramActionBar)
  {
    AppMethodBeat.i(31513);
    if (paramActionBar.getCustomView() != null)
    {
      paramActionBar.getCustomView().findViewById(2131820964);
      paramActionBar.getCustomView().findViewById(2131820965);
      paramActionBar.getCustomView().findViewById(2131820966);
      paramActionBar.getCustomView().findViewById(2131820968);
      paramActionBar.getCustomView().findViewById(2131820969);
    }
    AppMethodBeat.o(31513);
  }

  private String b(ad paramad)
  {
    AppMethodBeat.i(31508);
    if (paramad == null)
    {
      paramad = this.cgL.yTx.getContext().getString(2131297739);
      AppMethodBeat.o(31508);
    }
    while (true)
    {
      return paramad;
      if (RegionCodeDecoder.apQ(paramad.getCountryCode()))
      {
        String str = paramad.getCity();
        if (!bo.isNullOrNil(str))
        {
          AppMethodBeat.o(31508);
          paramad = str;
        }
        else
        {
          str = s.mL(paramad.getProvince());
          if (!bo.isNullOrNil(str))
          {
            AppMethodBeat.o(31508);
            paramad = str;
          }
          else
          {
            RegionCodeDecoder.duj();
            paramad = RegionCodeDecoder.getLocName(paramad.getCountryCode());
            AppMethodBeat.o(31508);
          }
        }
      }
      else
      {
        paramad = s.mL(paramad.getProvince());
        if (!bo.isNullOrNil(paramad))
        {
          AppMethodBeat.o(31508);
        }
        else
        {
          paramad = this.cgL.yTx.getContext().getString(2131297739);
          AppMethodBeat.o(31508);
        }
      }
    }
  }

  private void dBr()
  {
    AppMethodBeat.i(31504);
    if (com.tencent.mm.model.t.mU(this.cgL.getTalkerUserName()))
    {
      com.tencent.mm.plugin.r.a.bVv();
      boolean bool = com.tencent.mm.ax.c.lQ(com.tencent.mm.ax.b.fKF);
      this.cgL.yTx.addIconOptionMenu(0, 2131296398, 2131230758, Boolean.valueOf(bool).booleanValue(), this.yQq);
    }
    AppMethodBeat.o(31504);
  }

  private void dEl()
  {
    AppMethodBeat.i(31505);
    if (g.RN().QY())
    {
      com.tencent.mm.ah.o.acd().b(this.yQt);
      aw.ZK();
      com.tencent.mm.model.c.XV().d(this.yOu);
    }
    com.tencent.mm.ui.chatting.d.a.dFz().removeCallbacks(this.yQs);
    AppMethodBeat.o(31505);
  }

  private void dEo()
  {
    AppMethodBeat.i(31514);
    this.yQk.clear();
    this.yQk.add(this.cgL.yTx.getStringExtra("Chat_User"));
    AppMethodBeat.o(31514);
  }

  private void dEq()
  {
    AppMethodBeat.i(31518);
    if (this.cgL.yTx.getContext() == null)
    {
      ab.w("MicroMsg.ChattingUI.HeaderComponent", "getActivity is null");
      AppMethodBeat.o(31518);
    }
    while (true)
    {
      return;
      dEw();
      ViewGroup localViewGroup = (ViewGroup)this.cgL.yTx.getContext().findViewById(2131822390);
      com.tencent.mm.pluginsdk.ui.b.a locala = e.a(this.cgL.yTx.getContext(), e.a.zwi, new Object[] { b.b.foi });
      if ((localViewGroup != null) && (locala != null) && (locala.getView() != null) && (this.yQz == null))
      {
        this.yQz = locala.getView();
        localViewGroup.addView(this.yQz, new ViewGroup.LayoutParams(-1, -2));
      }
      AppMethodBeat.o(31518);
    }
  }

  private void dEs()
  {
    AppMethodBeat.i(31520);
    if ((this.cgL.dFx()) || (this.yQi == null))
    {
      dEt();
      AppMethodBeat.o(31520);
      return;
    }
    dEt();
    com.tencent.mm.pluginsdk.ui.b.a locala1;
    if (this.yQi.getTag() == null)
    {
      locala1 = e.a(this.cgL.yTx.getContext(), e.a.zvX, new Object[] { this.cgL.getTalkerUserName(), this.cgL.dDw() });
      locala2 = locala1;
      if (locala1 != null)
      {
        locala2 = locala1;
        if (locala1.getView() != null)
          this.yQi.addView(locala1.getView(), new ViewGroup.LayoutParams(-1, -2));
      }
    }
    for (com.tencent.mm.pluginsdk.ui.b.a locala2 = locala1; ; locala2 = (com.tencent.mm.pluginsdk.ui.b.a)this.yQi.getTag())
    {
      if (locala2 != null)
      {
        this.yQi.setVisibility(0);
        this.yQi.setTag(locala2);
      }
      h.pYm.e(11003, new Object[] { this.cgL.getTalkerUserName(), Integer.valueOf(1), Integer.valueOf(0) });
      AppMethodBeat.o(31520);
      break;
    }
  }

  private void dEt()
  {
    AppMethodBeat.i(31521);
    this.yQi.setVisibility(8);
    if (this.yQj != null)
      this.yQj.setVisibility(8);
    AppMethodBeat.o(31521);
  }

  private void dEu()
  {
    AppMethodBeat.i(31522);
    if (this.cgL.yTx.getContext() == null)
    {
      ab.w("MicroMsg.ChattingUI.HeaderComponent", "getActivity is null");
      AppMethodBeat.o(31522);
    }
    while (true)
    {
      return;
      dEv();
      ViewGroup localViewGroup = (ViewGroup)this.cgL.yTx.getContext().findViewById(2131822377);
      com.tencent.mm.pluginsdk.ui.b.a locala = e.a(this.cgL.yTx.getContext(), e.a.zvY, new Object[] { this.cgL.getTalkerUserName(), this.cgL.dDw(), Boolean.valueOf(this.cgL.dFx()) });
      if ((localViewGroup != null) && (locala != null) && (locala.getView() != null) && (this.yQy == null))
      {
        this.yQy = locala.getView();
        localViewGroup.addView(this.yQy, new ViewGroup.LayoutParams(-1, -2));
      }
      AppMethodBeat.o(31522);
    }
  }

  private void dEv()
  {
    AppMethodBeat.i(31523);
    ViewGroup localViewGroup = (ViewGroup)this.cgL.yTx.getContext().findViewById(2131822377);
    if ((localViewGroup != null) && (this.yQy != null))
    {
      localViewGroup.removeView(this.yQy);
      this.yQy = null;
    }
    AppMethodBeat.o(31523);
  }

  private void dEw()
  {
    AppMethodBeat.i(31524);
    ViewGroup localViewGroup = (ViewGroup)this.cgL.yTx.getContext().findViewById(2131822390);
    if ((localViewGroup != null) && (this.yQz != null))
    {
      localViewGroup.removeView(this.yQz);
      this.yQz = null;
    }
    AppMethodBeat.o(31524);
  }

  private boolean isSupportCustomActionBar()
  {
    AppMethodBeat.i(31509);
    boolean bool = this.cgL.yTx.isSupportNavigationSwipeBack();
    AppMethodBeat.o(31509);
    return bool;
  }

  private View w(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(31511);
    if (this.yQp == null)
      if (paramViewGroup == null)
      {
        this.yQp = com.tencent.mm.ui.v.hu(this.cgL.yTx.getContext()).inflate(2130968612, null);
        paramViewGroup = this.yQp;
        AppMethodBeat.o(31511);
      }
    while (true)
    {
      return paramViewGroup;
      this.yQp = com.tencent.mm.ui.v.hu(this.cgL.yTx.getContext()).inflate(2130968612, paramViewGroup, false);
      break;
      if (this.yQp.getParent() == null)
      {
        paramViewGroup = this.yQp;
        AppMethodBeat.o(31511);
      }
      else
      {
        if (!(this.yQp.getParent() instanceof ViewGroup))
          break label150;
        ((ViewGroup)this.yQp.getParent()).removeView(this.yQp);
        paramViewGroup = this.yQp;
        AppMethodBeat.o(31511);
      }
    }
    label150: if (paramViewGroup == null);
    for (this.yQp = com.tencent.mm.ui.v.hu(this.cgL.yTx.getContext()).inflate(2130968612, null); ; this.yQp = com.tencent.mm.ui.v.hu(this.cgL.yTx.getContext()).inflate(2130968612, paramViewGroup, false))
    {
      paramViewGroup = this.yQp;
      AppMethodBeat.o(31511);
      break;
    }
  }

  public final void M(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(31526);
    if (com.tencent.mm.model.t.mP(this.cgL.getTalkerUserName()))
    {
      this.yQo.setTitle(paramCharSequence);
      this.cgL.yTx.updateDescription(this.cgL.yTx.getContext().getString(2131298072, new Object[] { paramCharSequence }));
      AppMethodBeat.o(31526);
    }
    while (true)
    {
      return;
      if (ad.aox(this.cgL.sRl.field_username))
      {
        paramCharSequence = ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).e(ah.getContext(), paramCharSequence.toString(), com.tencent.mm.bz.a.al(ah.getContext(), 2131427505));
        this.yQo.setTitle(paramCharSequence);
        this.cgL.yTx.updateDescription(this.cgL.yTx.getContext().getString(2131298072, new Object[] { paramCharSequence }));
        AppMethodBeat.o(31526);
      }
      else
      {
        paramCharSequence = j.b(this.cgL.yTx.getContext(), paramCharSequence, com.tencent.mm.bz.a.al(this.cgL.yTx.getContext(), 2131427505));
        this.yQo.setTitle(paramCharSequence);
        this.cgL.yTx.updateDescription(this.cgL.yTx.getContext().getString(2131298072, new Object[] { paramCharSequence }));
        AppMethodBeat.o(31526);
      }
    }
  }

  public final void Nd(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(31530);
    Object localObject = this.yQo;
    if (paramInt == 0)
    {
      paramInt = 1;
      localObject = ((com.tencent.mm.ui.a)localObject).yeh;
      if (paramInt == 0)
        break label47;
    }
    label47: for (paramInt = i; ; paramInt = 8)
    {
      ((ImageView)localObject).setVisibility(paramInt);
      AppMethodBeat.o(31530);
      return;
      paramInt = 0;
      break;
    }
  }

  public final void OA(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(31532);
    Object localObject = this.yQo;
    if (paramInt == 0)
    {
      paramInt = 1;
      localObject = ((com.tencent.mm.ui.a)localObject).yek;
      if (paramInt == 0)
        break label47;
    }
    label47: for (paramInt = i; ; paramInt = 8)
    {
      ((ImageView)localObject).setVisibility(paramInt);
      AppMethodBeat.o(31532);
      return;
      paramInt = 0;
      break;
    }
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(31495);
    super.a(parama);
    if (isSupportCustomActionBar())
    {
      this.yQn = new com.tencent.mm.ui.r();
      com.tencent.mm.ui.r localr = this.yQn;
      parama = this.cgL.yTx;
      localr.ymV = parama;
      localr.ymW = new com.tencent.mm.ui.b.b(parama.thisActivity(), localr);
      this.cgL.yTx.setActivityController(this.yQn);
    }
    AppMethodBeat.o(31495);
  }

  public final com.tencent.mm.ui.r dBO()
  {
    return this.yQn;
  }

  public final void dDh()
  {
    AppMethodBeat.i(31502);
    super.dDh();
    dEl();
    AppMethodBeat.o(31502);
  }

  public final void dEk()
  {
    AppMethodBeat.i(31503);
    if (this.cgL.getHeaderViewsCount() > 0)
      this.yQi = ((LinearLayout)this.cgL.getListView().findViewById(2131822691));
    while (true)
    {
      dEt();
      AppMethodBeat.o(31503);
      return;
      this.yQi = ((LinearLayout)this.cgL.yTx.getContext().getLayoutInflater().inflate(2130969117, null));
      com.tencent.mm.ui.chatting.d.a locala = this.cgL;
      LinearLayout localLinearLayout = this.yQi;
      locala.yTy.addHeaderView(localLinearLayout);
    }
  }

  public final void dEm()
  {
    AppMethodBeat.i(31506);
    this.cgL.yTx.setMMSubTitle(null);
    if (com.tencent.mm.model.t.mU(this.cgL.getTalkerUserName()))
    {
      M(this.cgL.sRl.Oi());
      AppMethodBeat.o(31506);
    }
    while (true)
    {
      return;
      if (((z)this.cgL.aF(z.class)).dET())
      {
        setMMTitle(2131302803);
        AppMethodBeat.o(31506);
      }
      else if (ad.aou(this.cgL.getTalkerUserName()))
      {
        ((com.tencent.mm.ui.chatting.c.b.o)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class)).dDX().setWordCountLimit(140);
        M(this.cgL.sRl.Oj());
        AppMethodBeat.o(31506);
      }
      else if (com.tencent.mm.model.t.nF(this.cgL.getTalkerUserName()))
      {
        M(this.cgL.sRl.Oi());
        AppMethodBeat.o(31506);
      }
      else if (ad.mR(this.cgL.getTalkerUserName()))
      {
        M(this.cgL.yTx.getContext().getString(2131297710, new Object[] { b(this.cgL.sRl) }).trim());
        AppMethodBeat.o(31506);
      }
      else if (ad.mg(this.cgL.getTalkerUserName()))
      {
        if (this.cgL.aF(com.tencent.mm.ui.chatting.c.b.a.class) != null)
        {
          ((com.tencent.mm.ui.chatting.c.b.a)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.a.class)).dEm();
          AppMethodBeat.o(31506);
        }
      }
      else if (this.cgL.dFw())
      {
        if (com.tencent.mm.model.t.mO(this.cgL.getTalkerUserName()))
        {
          if (bo.isNullOrNil(this.cgL.sRl.field_nickname))
          {
            if (com.tencent.mm.model.n.mA(this.cgL.getTalkerUserName()) == 0)
            {
              M(this.cgL.yTx.getContext().getString(2131298223));
              AppMethodBeat.o(31506);
            }
            else
            {
              M(this.cgL.yTx.getContext().getString(2131299931, new Object[] { this.cgL.yTx.getContext().getString(2131298223), Integer.valueOf(com.tencent.mm.model.n.mA(this.cgL.getTalkerUserName())) }));
              AppMethodBeat.o(31506);
            }
          }
          else
          {
            M(this.cgL.yTx.getContext().getString(2131299931, new Object[] { this.cgL.sRl.Oi(), Integer.valueOf(com.tencent.mm.model.n.mA(this.cgL.getTalkerUserName())) }));
            AppMethodBeat.o(31506);
          }
        }
        else if (com.tencent.mm.model.t.mP(this.cgL.getTalkerUserName()))
        {
          String str;
          if (bo.isNullOrNil(this.cgL.sRl.field_nickname))
            if (com.tencent.mm.model.n.mA(this.cgL.getTalkerUserName()) == 0)
              str = this.cgL.yTx.getContext().getString(2131298223);
          while (true)
          {
            M(j.c(this.cgL.yTx.getContext(), j.b(this.cgL.yTx.getContext(), str, com.tencent.mm.bz.a.al(this.cgL.yTx.getContext(), 2131427505))));
            AppMethodBeat.o(31506);
            break;
            str = this.cgL.yTx.getContext().getString(2131299931, new Object[] { this.cgL.yTx.getContext().getString(2131298223), Integer.valueOf(com.tencent.mm.model.n.mA(this.cgL.getTalkerUserName())) });
            continue;
            str = this.cgL.yTx.getContext().getString(2131299931, new Object[] { this.cgL.sRl.Oi(), Integer.valueOf(com.tencent.mm.model.n.mA(this.cgL.getTalkerUserName())) });
          }
        }
      }
      else if (((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDo())
      {
        AppMethodBeat.o(31506);
      }
      else
      {
        this.yQo.pw(ad.aow(this.cgL.getTalkerUserName()));
        this.cgL.yTx.setMMTitle(this.cgL.sRl.Oj());
        this.yQo.pw(ad.aow(this.cgL.getTalkerUserName()));
        if (ad.aox(this.cgL.getTalkerUserName()))
          this.cgL.yTx.setMMSubTitle(((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).ba(this.cgL.sRl.field_openImAppid, this.cgL.sRl.field_descWordingId));
        AppMethodBeat.o(31506);
      }
    }
  }

  public final void dEn()
  {
    AppMethodBeat.i(31512);
    if ((this.cgL.yTx.isCurrentActivity) || (!isSupportCustomActionBar()))
    {
      localObject1 = ((AppCompatActivity)this.cgL.yTx.getContext()).getSupportActionBar();
      localObject2 = w(null);
      ((ActionBar)localObject1).setCustomView((View)localObject2);
      this.yQo = new com.tencent.mm.ui.a((View)localObject2);
      a((ActionBar)localObject1);
      this.yQo.pw(false);
      ((ActionBar)localObject1).setDisplayOptions((((ActionBar)localObject1).getDisplayOptions() | 0x10) & 0xFFFFFFFB & 0xFFFFFFFD & 0xFFFFFFF7);
      dEo();
      setBackBtn(this.yQu);
      AppMethodBeat.o(31512);
      return;
    }
    Object localObject1 = (ViewGroup)this.yQm.findViewById(2131820941);
    ab.i("MicroMsg.ChattingUI.HeaderComponent", "mActionBarContainer %s", new Object[] { this.yQm });
    ab.i("MicroMsg.ChattingUI.HeaderComponent", "ctxView %s", new Object[] { this.yQm.findViewById(2131820942) });
    ((ViewGroup)localObject1).setVisibility(0);
    Object localObject2 = this.yQn.getSupportActionBar();
    View localView = w((ViewGroup)localObject1);
    ((ActionBar)localObject2).setCustomView(localView);
    this.yQo = new com.tencent.mm.ui.a(localView);
    int i = ((ActionBar)localObject2).getHeight();
    int j = i;
    if (i == 0)
    {
      localObject1 = this.cgL.yTx.getMMResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject1).widthPixels <= ((DisplayMetrics)localObject1).heightPixels)
        break label317;
    }
    label317: for (j = this.cgL.yTx.getMMResources().getDimensionPixelSize(2131427562); ; j = this.cgL.yTx.getMMResources().getDimensionPixelSize(2131427563))
    {
      localView.setMinimumHeight(j);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localObject1 = localLayoutParams;
      if (localLayoutParams == null)
        localObject1 = new ViewGroup.LayoutParams(-1, -1);
      ((ViewGroup.LayoutParams)localObject1).height = j;
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = localObject2;
      break;
    }
  }

  public final void dEp()
  {
    AppMethodBeat.i(31515);
    Object localObject = (z)this.cgL.aF(z.class);
    if ((((z)localObject).dET()) || (((z)localObject).dES()))
    {
      this.cgL.showOptionMenu(false);
      AppMethodBeat.o(31515);
    }
    while (true)
    {
      return;
      if (((com.tencent.mm.ui.chatting.c.b.n)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.n.class)).dDW())
      {
        AppMethodBeat.o(31515);
      }
      else
      {
        if (com.tencent.mm.model.t.mU(this.cgL.getTalkerUserName()))
        {
          com.tencent.mm.plugin.r.a.bVv();
          boolean bool = com.tencent.mm.ax.c.lQ(com.tencent.mm.ax.b.fKF);
          this.cgL.yTx.addIconOptionMenu(0, 2131296398, 2131230758, Boolean.valueOf(bool).booleanValue(), this.yQq);
        }
        while (true)
        {
          if (!ad.mR(this.cgL.getTalkerUserName()))
            break label697;
          this.cgL.qv(true);
          AppMethodBeat.o(31515);
          break;
          if (com.tencent.mm.model.t.mV(this.cgL.getTalkerUserName()))
          {
            a(2131296398, 2131230758, this.yQq);
          }
          else if (com.tencent.mm.model.t.nc(this.cgL.getTalkerUserName()))
          {
            a(2131296398, 2131230758, this.yQq);
            h.pYm.X(10071, "1");
          }
          else if (com.tencent.mm.model.t.nd(this.cgL.getTalkerUserName()))
          {
            a(2131296398, 2131230758, this.yQq);
          }
          else if (com.tencent.mm.model.t.nD(this.cgL.getTalkerUserName()))
          {
            a(2131296398, 2131230758, this.yQq);
          }
          else
          {
            if (com.tencent.mm.model.t.nI(this.cgL.getTalkerUserName()))
            {
              if (com.tencent.mm.model.t.no(this.cgL.getTalkerUserName()))
              {
                this.cgL.showOptionMenu(false);
                AppMethodBeat.o(31515);
                break;
              }
              a(2131296398, 2131230758, this.yQq);
              continue;
            }
            if ((ad.aou(this.cgL.getTalkerUserName())) || (ad.aow(this.cgL.getTalkerUserName())) || (ad.mR(this.cgL.getTalkerUserName())))
            {
              a(2131298206, 2131230740, this.yQq);
            }
            else if (ad.mg(this.cgL.getTalkerUserName()))
            {
              if (this.cgL.aF(com.tencent.mm.ui.chatting.c.b.a.class) != null)
                ((com.tencent.mm.ui.chatting.c.b.a)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.a.class)).dFq();
            }
            else if ((((com.tencent.mm.ui.chatting.c.b.v)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.v.class)).dEL()) && (i.arl(this.cgL.getTalkerUserName())))
            {
              a(2131298206, 2131231749, this.yQq);
            }
            else
            {
              ((x)this.cgL.aF(x.class)).dEE();
              localObject = (com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
              if ((com.tencent.mm.model.t.mN(this.cgL.getTalkerUserName())) || (((com.tencent.mm.ui.chatting.c.b.d)localObject).dDm()))
              {
                if (((f)this.cgL.aF(f.class)).dDF())
                {
                  ab.i("MicroMsg.ChattingUI.HeaderComponent", "cpan show chatroom right btn");
                  a(2131298206, 2131230740, this.yQq);
                  this.cgL.showOptionMenu(true);
                  continue;
                }
                if ((((com.tencent.mm.ui.chatting.c.b.d)localObject).dDm()) && (!((com.tencent.mm.ui.chatting.c.b.d)localObject).dDn()))
                {
                  a(2131298206, 2131230754, this.yQq);
                  this.cgL.showOptionMenu(true);
                  continue;
                }
                this.cgL.showOptionMenu(false);
                AppMethodBeat.o(31515);
                break;
              }
              a(2131298206, 2131230740, this.yQq);
            }
          }
        }
        label697: this.cgL.showOptionMenu(true);
        AppMethodBeat.o(31515);
      }
    }
  }

  @SuppressLint({"ResourceType"})
  public final void dEr()
  {
    AppMethodBeat.i(31519);
    dEt();
    LinearLayout localLinearLayout;
    ImageView localImageView;
    Object localObject;
    if (this.yQj == null)
    {
      i.a(this.cgL.yTx, 2131822376);
      this.yQj = ((LinearLayout)this.cgL.yTx.getContext().findViewById(2131822407));
      localLinearLayout = (LinearLayout)this.cgL.yTx.getContext().getLayoutInflater().inflate(2130969116, null);
      this.yQj.addView(localLinearLayout, new ViewGroup.LayoutParams(-1, -2));
      this.yQj.setVisibility(0);
      localLinearLayout.setVisibility(0);
      localImageView = (ImageView)localLinearLayout.findViewById(2131822688);
      String str = this.yQl;
      localObject = str;
      if (bo.isNullOrNil(str))
        localObject = this.cgL.sRl.field_username;
      localObject = com.tencent.mm.ah.b.a((String)localObject, false, -1);
      if (localObject != null)
        break label301;
      localImageView.setImageResource(2131231172);
    }
    while (true)
    {
      localObject = (Button)localLinearLayout.findViewById(2131822690);
      if (((com.tencent.mm.ui.chatting.c.b.t)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.t.class)).dEF())
        ((com.tencent.mm.ui.chatting.c.b.t)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.t.class)).a((Button)localObject, localLinearLayout, this.yQj);
      localImageView.setOnClickListener(new t.9(this));
      ((Button)localObject).setOnClickListener(new t.10(this, localLinearLayout));
      h.pYm.e(11004, new Object[] { this.yQl, Integer.valueOf(1) });
      AppMethodBeat.o(31519);
      return;
      localLinearLayout = (LinearLayout)this.yQj.findViewById(2131822687);
      break;
      label301: localImageView.setImageBitmap((Bitmap)localObject);
    }
  }

  public final int dEx()
  {
    AppMethodBeat.i(31525);
    int i = 0;
    int j = i;
    if (this.yQi != null)
    {
      j = i;
      if (this.yQi.isShown())
        j = this.yQi.getHeight() + 0;
    }
    AppMethodBeat.o(31525);
    return j;
  }

  public final void dxA()
  {
    AppMethodBeat.i(31499);
    aw.ZK().Yk().a(new t.5(this));
    aw.ZK().Yl().a(new t.6(this));
    com.tencent.mm.model.b.b localb = aw.ZK().Ym();
    b.a locala = this.yQr;
    try
    {
      localb.mListeners.add(locala);
      if (!this.yOx)
        dBr();
      this.yOx = false;
      AppMethodBeat.o(31499);
      return;
    }
    finally
    {
      AppMethodBeat.o(31499);
    }
  }

  public final void dxB()
  {
    AppMethodBeat.i(31500);
    com.tencent.mm.model.b.b localb;
    b.a locala;
    if (g.RN().QY())
    {
      aw.ZK().Yk().a(null);
      aw.ZK().Yl().a(null);
      localb = aw.ZK().Ym();
      locala = this.yQr;
    }
    while (true)
    {
      try
      {
        localb.mListeners.remove(locala);
        return;
      }
      finally
      {
        AppMethodBeat.o(31500);
      }
      AppMethodBeat.o(31500);
    }
  }

  public final void dxC()
  {
    AppMethodBeat.i(31501);
    dEl();
    AppMethodBeat.o(31501);
  }

  public final void dxx()
  {
    AppMethodBeat.i(31496);
    dEn();
    AppMethodBeat.o(31496);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31497);
    this.qvb = this.cgL.yTx.getIntExtra("add_scene", 0);
    com.tencent.mm.ah.o.acd().a(this.yQt);
    aw.ZK();
    com.tencent.mm.model.c.XV().c(this.yOu);
    setBackBtn(this.yQu);
    dBr();
    dEm();
    dEp();
    dEt();
    this.yOx = true;
    AppMethodBeat.o(31497);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31498);
    qr(true);
    AppMethodBeat.o(31498);
  }

  public final void eM(View paramView)
  {
    AppMethodBeat.i(31510);
    ab.d("MicroMsg.ChattingUI.HeaderComponent", "dealContentView");
    if (isSupportCustomActionBar())
    {
      if (this.yQm == null)
        this.yQm = ((ActionBarContainer)((ViewStub)paramView.findViewById(2131822375)).inflate());
      com.tencent.mm.ui.r localr = this.yQn;
      paramView = (ViewGroup)paramView;
      localr.ymW.SW = paramView;
    }
    AppMethodBeat.o(31510);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    int i = 1;
    AppMethodBeat.i(31494);
    super.onConfigurationChanged(paramConfiguration);
    ab.d("MicroMsg.ChattingUI.HeaderComponent", "getConfiguration().orientation = " + this.cgL.yTx.getMMResources().getConfiguration().orientation + ", newConfig.orientation = " + paramConfiguration.orientation);
    this.cgL.yTx.getMMResources().getConfiguration().orientation = paramConfiguration.orientation;
    ((com.tencent.mm.ui.chatting.c.b.o)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class)).dDX().djS();
    int j;
    if (this.yQm != null)
    {
      j = 1;
      if (this.yQp == null)
        break label250;
    }
    while (true)
    {
      if ((j & i) != 0)
      {
        j = com.tencent.mm.compatible.util.a.bG(this.cgL.yTx.getContext());
        this.yQp.setMinimumHeight(j);
        ViewGroup.LayoutParams localLayoutParams1 = this.yQp.getLayoutParams();
        ViewGroup.LayoutParams localLayoutParams2 = localLayoutParams1;
        if (localLayoutParams1 == null)
          localLayoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        localLayoutParams2.height = j;
        this.yQp.setLayoutParams(localLayoutParams2);
        localLayoutParams2 = this.yQm.getLayoutParams();
        localLayoutParams2.height = j;
        this.yQm.setLayoutParams(localLayoutParams2);
      }
      if (this.yQn != null)
        this.yQn.ymW.mActionBar.onConfigurationChanged(paramConfiguration);
      AppMethodBeat.o(31494);
      return;
      j = 0;
      break;
      label250: i = 0;
    }
  }

  public final void qr(boolean paramBoolean)
  {
    AppMethodBeat.i(31517);
    if (this.cgL == null)
    {
      ab.e("MicroMsg.ChattingUI.HeaderComponent", "[updateBannerStatus] mChattingContext == null!");
      AppMethodBeat.o(31517);
      return;
    }
    if (!this.cgL.dFx())
      if ((i.arl(this.cgL.getTalkerUserName())) && (!((com.tencent.mm.ui.chatting.c.b.v)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.v.class)).dEL()))
      {
        this.yQl = this.cgL.getTalkerUserName();
        dEr();
      }
    while (true)
    {
      if (paramBoolean)
      {
        dEu();
        dEq();
      }
      AppMethodBeat.o(31517);
      break;
      if (!((com.tencent.mm.ui.chatting.c.b.t)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.t.class)).dEG())
      {
        dEs();
        continue;
        this.yQl = i.ark(this.cgL.getTalkerUserName());
        if ((!bo.isNullOrNil(this.yQl)) && ((((f)this.cgL.aF(f.class)).dDF()) || (((com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDs())))
          dEr();
        else
          dEt();
      }
    }
  }

  public final void setBackBtn(final MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    AppMethodBeat.i(31528);
    this.yQo.b(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(31475);
        if (!t.this.cgL.yTx.isScreenEnable())
        {
          ab.w("MicroMsg.ChattingUI.HeaderComponent", "Actionbar customView onclick screen not enable");
          AppMethodBeat.o(31475);
        }
        while (true)
        {
          return;
          paramAnonymousView.setSelected(false);
          paramAnonymousView.setPressed(false);
          paramAnonymousView.clearFocus();
          paramAnonymousView.invalidate();
          paramAnonymousView.post(new t.2.1(this));
          AppMethodBeat.o(31475);
        }
      }
    });
    AppMethodBeat.o(31528);
  }

  public final void setMMSubTitle(String paramString)
  {
    AppMethodBeat.i(31527);
    int i = com.tencent.mm.bz.a.al(this.cgL.yTx.getContext(), 2131427762);
    SpannableString localSpannableString = j.b(this.cgL.yTx.getContext(), paramString, i);
    paramString = this.yQo;
    if ((localSpannableString == null) || (bo.isNullOrNil(localSpannableString.toString())))
    {
      paramString.yeg.setVisibility(8);
      AppMethodBeat.o(31527);
    }
    while (true)
    {
      return;
      paramString.yeg.setVisibility(0);
      paramString.yeg.setText(localSpannableString);
      if (com.tencent.mm.bz.a.ga(paramString.yeg.getContext()))
      {
        paramString.yeg.setTextSize(1, 14.0F);
        paramString.gnB.setTextSize(1, 18.0F);
      }
      AppMethodBeat.o(31527);
    }
  }

  public final void setMMTitle(int paramInt)
  {
    AppMethodBeat.i(31507);
    M(this.cgL.yTx.getMMResources().getString(paramInt));
    AppMethodBeat.o(31507);
  }

  public final void setTitleMuteIconVisibility(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(31531);
    if (com.tencent.mm.model.t.nD(this.cgL.getTalkerUserName()))
    {
      this.yQo.pv(false);
      AppMethodBeat.o(31531);
    }
    while (true)
    {
      return;
      com.tencent.mm.ui.a locala = this.yQo;
      if (paramInt == 0)
        bool = true;
      locala.pv(bool);
      AppMethodBeat.o(31531);
    }
  }

  public final void setTitlePhoneIconVisibility(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(31529);
    Object localObject = this.yQo;
    if (paramInt == 0)
    {
      paramInt = 1;
      localObject = ((com.tencent.mm.ui.a)localObject).yei;
      if (paramInt == 0)
        break label47;
    }
    label47: for (paramInt = i; ; paramInt = 8)
    {
      ((ImageView)localObject).setVisibility(paramInt);
      AppMethodBeat.o(31529);
      return;
      paramInt = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.t
 * JD-Core Version:    0.6.2
 */