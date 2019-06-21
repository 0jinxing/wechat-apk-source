package com.tencent.mm.pluginsdk.ui.preference;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cp;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.plugin.messenger.foundation.a.a.m.a;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.plugin.story.api.e;
import com.tencent.mm.pluginsdk.ui.ProfileDescribeView;
import com.tencent.mm.pluginsdk.ui.ProfileLabelView;
import com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import junit.framework.Assert;

public class NormalUserHeaderPreference extends Preference
  implements d.a, m.a, n.b
{
  MMActivity crP;
  ad ehM;
  private String ejD;
  private boolean lyb;
  private String mGZ;
  private TextView niS;
  private TextView nrD;
  private ClipboardManager oMy;
  private ImageView pkS;
  private boolean pnc;
  private boolean pni;
  private boolean poP;
  private ImageView quH;
  int qvb;
  private TextView tLA;
  private String vim;
  private String vin;
  private TextView vqF;
  private TextView vqG;
  private View vqH;
  private Button vqI;
  private Button vqJ;
  private TextView vqK;
  private ImageView vqL;
  private CheckBox vqM;
  private ImageView vqN;
  private ImageView vqO;
  private LinearLayout vqP;
  private Button vqQ;
  private FMessageListView vqR;
  private RelativeLayout vqS;
  private ImageView vqT;
  private int vqU;
  private boolean vqV;
  private boolean vqW;
  private boolean vqX;
  private boolean vqY;
  private boolean vqZ;
  private boolean vra;
  private boolean vrb;
  private boolean vrc;
  private String vrd;
  private ProfileMobilePhoneView vre;
  private ProfileDescribeView vrf;
  private ProfileLabelView vrg;
  private TextView vrh;
  public View.OnClickListener vri;
  public String vrj;

  public NormalUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(28081);
    this.lyb = false;
    this.vqU = 0;
    this.vqV = false;
    this.vqW = false;
    this.vqX = false;
    this.vqY = false;
    this.vqZ = false;
    this.vra = false;
    this.vrb = false;
    this.poP = false;
    this.vrc = false;
    this.pni = false;
    this.ejD = "";
    this.vrj = null;
    this.crP = ((MMActivity)paramContext);
    init();
    AppMethodBeat.o(28081);
  }

  public NormalUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(28082);
    this.lyb = false;
    this.vqU = 0;
    this.vqV = false;
    this.vqW = false;
    this.vqX = false;
    this.vqY = false;
    this.vqZ = false;
    this.vra = false;
    this.vrb = false;
    this.poP = false;
    this.vrc = false;
    this.pni = false;
    this.ejD = "";
    this.vrj = null;
    this.crP = ((MMActivity)paramContext);
    init();
    AppMethodBeat.o(28082);
  }

  private static boolean UV(String paramString)
  {
    AppMethodBeat.i(28086);
    boolean bool;
    if (com.tencent.mm.plugin.sns.b.n.qFA != null)
    {
      bool = com.tencent.mm.plugin.sns.b.n.qFA.UV(paramString);
      AppMethodBeat.o(28086);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28086);
    }
  }

  private void cfI()
  {
    AppMethodBeat.i(28087);
    a.b.b(this.pkS, this.ehM.field_username);
    int i;
    if (this.pkS != null)
    {
      i = com.tencent.mm.bz.a.al(this.mContext, 2131427501);
      int j = com.tencent.mm.bz.a.fromDPToPix(this.crP, 88);
      if (i <= j)
        break label95;
      i = j;
    }
    label95: 
    while (true)
    {
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(i, i);
      localLayoutParams.setMargins(0, 0, com.tencent.mm.bz.a.am(this.mContext, 2131427779), 0);
      this.pkS.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(28087);
      return;
    }
  }

  private void dkT()
  {
    AppMethodBeat.i(28088);
    this.vqK.setVisibility(0);
    this.niS.setText(j.b(this.crP, bo.nullAsNil(this.ehM.Oi()) + " ", this.niS.getTextSize()));
    cfI();
    this.vqQ.setVisibility(8);
    this.nrD.setVisibility(8);
    this.vqR.setVisibility(8);
    if ((this.vqR.getVisibility() == 8) && (this.vrh.getVisibility() == 8) && (this.vrg.getVisibility() == 8) && (this.vrf.getVisibility() == 8) && (this.tLA.getVisibility() == 8))
      this.vqH.setVisibility(8);
    this.vqI.setVisibility(8);
    this.vqJ.setVisibility(8);
    this.vqM.setVisibility(8);
    if (this.vrg != null)
      this.vrg.setVisibility(8);
    if (this.vre != null)
      this.vre.setVisibility(8);
    if (this.vrf != null)
      this.vrf.setVisibility(8);
    if (this.vrh != null)
      this.vrh.setVisibility(8);
    if (this.vqG != null)
      this.vqG.setVisibility(8);
    AppMethodBeat.o(28088);
  }

  private void dkV()
  {
    AppMethodBeat.i(28091);
    int i = 0;
    if (this.vqX)
      i = com.tencent.mm.bz.a.fromDPToPix(this.crP, 17) + 0;
    int j = i + this.vqU;
    i = j;
    if (this.vqV)
      i = j + com.tencent.mm.bz.a.fromDPToPix(this.crP, 27);
    j = i;
    if (this.vqW)
      j = i + com.tencent.mm.bz.a.fromDPToPix(this.crP, 27);
    i = j;
    if (this.vqY)
      i = j + com.tencent.mm.bz.a.fromDPToPix(this.crP, 30);
    if (com.tencent.mm.bz.a.ga(this.mContext))
      i += com.tencent.mm.bz.a.fromDPToPix(this.crP, 88);
    while (true)
    {
      j = com.tencent.mm.bz.a.fromDPToPix(this.crP, 60);
      DisplayMetrics localDisplayMetrics = this.crP.getResources().getDisplayMetrics();
      this.niS.setMaxWidth(localDisplayMetrics.widthPixels - (i + j));
      AppMethodBeat.o(28091);
      return;
      i += com.tencent.mm.bz.a.fromDPToPix(this.crP, 64);
    }
  }

  private void dkW()
  {
    int i = 0;
    AppMethodBeat.i(28097);
    ImageView localImageView;
    if ((this.vqN != null) && (t.mM(this.ehM.field_username)))
    {
      this.vqW = this.ehM.Od();
      localImageView = this.vqN;
      if (this.vqW)
      {
        j = 0;
        localImageView.setVisibility(j);
      }
    }
    else if ((this.vqO != null) && (t.mM(this.ehM.field_username)))
    {
      this.vqV = UV(this.ehM.field_username);
      localImageView = this.vqO;
      if (!this.vqV)
        break label124;
    }
    label124: for (int j = i; ; j = 8)
    {
      localImageView.setVisibility(j);
      AppMethodBeat.o(28097);
      return;
      j = 8;
      break;
    }
  }

  private void dkX()
  {
    AppMethodBeat.i(28098);
    if (bo.isNullOrNil(this.vrd))
    {
      this.vqF.setVisibility(8);
      AppMethodBeat.o(28098);
    }
    while (true)
    {
      return;
      if ((!r.mG(this.ehM.field_username)) && (bo.nullAsNil(this.ehM.field_conRemark).length() > 0))
        this.nrD.setVisibility(8);
      this.vqF.setVisibility(0);
      this.vqF.setText(j.b(this.crP, this.crP.getString(2131298490) + this.vrd, this.vqF.getTextSize()));
      AppMethodBeat.o(28098);
    }
  }

  private void dkY()
  {
    AppMethodBeat.i(28099);
    if ((r.mG(this.ehM.field_username)) || (bo.nullAsNil(this.ehM.field_conRemark).length() <= 0))
    {
      this.vqG.setVisibility(8);
      this.niS.setText(j.b(this.crP, bo.nullAsNil(this.ehM.Oi()) + " ", this.niS.getTextSize()));
      if (this.vrb)
      {
        this.vqI.setVisibility(0);
        this.vrh.setVisibility(8);
        if (ad.aox(this.ehM.field_username))
        {
          this.vrh.setText(2131298767);
          dkZ();
        }
        if ((!this.poP) || (com.tencent.mm.n.a.jh(this.ehM.field_type)))
          break label557;
        this.vqJ.setVisibility(0);
      }
    }
    while (true)
    {
      if (ad.mR(this.ehM.field_username))
        this.niS.setText("");
      if ((this.qvb == 76) && (this.ehM.field_username != null) && (this.ehM.field_username.endsWith("@stranger")))
        this.niS.setText(j.b(this.crP, bo.nullAsNil(this.ehM.field_nickname) + " ", this.niS.getTextSize()));
      if ((this.vqJ.getVisibility() == 0) && (this.vqG.getVisibility() == 0))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.vqG.getLayoutParams();
        localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(2131427858);
        this.vqG.setLayoutParams(localLayoutParams);
      }
      AppMethodBeat.o(28099);
      return;
      if (this.vqZ)
      {
        this.vqI.setVisibility(0);
        this.vrh.setVisibility(8);
        break;
      }
      if (com.tencent.mm.n.a.jh(this.ehM.field_type))
        this.vqI.setVisibility(8);
      boolean bool1 = this.vrf.T(this.ehM);
      boolean bool2 = this.vrg.T(this.ehM);
      if ((!bool1) && (!bool2))
        break;
      this.vrh.setVisibility(8);
      break;
      this.niS.setText(j.b(this.crP, bo.nullAsNil(this.ehM.field_conRemark) + " ", this.niS.getTextSize()));
      this.vqG.setVisibility(0);
      this.vqG.setText(j.b(this.crP, this.mContext.getString(2131298600) + this.ehM.Oi(), this.vqG.getTextSize()));
      this.vqI.setVisibility(8);
      break;
      label557: if (this.vra)
      {
        this.vqJ.setVisibility(0);
        if (com.tencent.mm.bz.a.ga(this.crP))
        {
          this.vqJ.setTextSize(0, this.crP.getResources().getDimensionPixelSize(2131427762));
          this.vqI.setTextSize(0, this.crP.getResources().getDimensionPixelSize(2131427762));
        }
      }
      else
      {
        this.vqJ.setVisibility(8);
      }
    }
  }

  private void dkZ()
  {
    AppMethodBeat.i(28100);
    if (this.vqP == null)
      AppMethodBeat.o(28100);
    while (true)
    {
      return;
      View localView = this.vqP.findViewById(2131823014);
      if (localView == null)
      {
        AppMethodBeat.o(28100);
      }
      else
      {
        localView.setVisibility(8);
        AppMethodBeat.o(28100);
      }
    }
  }

  private void dla()
  {
    AppMethodBeat.i(28101);
    this.vqM.setClickable(false);
    if (((t.mM(this.ehM.field_username)) || (ad.aox(this.ehM.field_username))) && (com.tencent.mm.n.a.jh(this.ehM.field_type)) && (!r.mG(this.ehM.field_username)))
    {
      this.vqM.setVisibility(0);
      if (this.ehM.Oc())
      {
        this.vqM.setChecked(true);
        this.vqY = true;
        AppMethodBeat.o(28101);
      }
    }
    while (true)
    {
      return;
      this.vqM.setChecked(false);
      this.vqM.setVisibility(8);
      this.vqY = false;
      AppMethodBeat.o(28101);
      continue;
      this.vqY = false;
      this.vqM.setVisibility(8);
      AppMethodBeat.o(28101);
    }
  }

  private void dlb()
  {
    AppMethodBeat.i(28105);
    if (!com.tencent.mm.plugin.story.api.n.isShowStoryCheck())
    {
      this.vqS.setVisibility(8);
      AppMethodBeat.o(28105);
      return;
    }
    e locale = (e)g.M(e.class);
    RelativeLayout.LayoutParams localLayoutParams;
    if (locale.isStoryExist(this.ehM.field_username))
    {
      this.vqS.setVisibility(0);
      this.vqT.setVisibility(0);
      localLayoutParams = (RelativeLayout.LayoutParams)this.vqP.getLayoutParams();
      localLayoutParams.topMargin = com.tencent.mm.bz.a.fromDPToPix(this.crP, 166);
      this.vqP.setLayoutParams(localLayoutParams);
    }
    while (true)
    {
      locale.loadStory(this.ehM.field_username, this.ejD);
      AppMethodBeat.o(28105);
      break;
      this.vqS.setVisibility(8);
      this.vqT.setVisibility(8);
      localLayoutParams = (RelativeLayout.LayoutParams)this.vqP.getLayoutParams();
      localLayoutParams.topMargin = 0;
      this.vqP.setLayoutParams(localLayoutParams);
    }
  }

  private boolean hasInit()
  {
    if ((this.lyb) && (this.ehM != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void init()
  {
    AppMethodBeat.i(28083);
    this.lyb = false;
    this.oMy = ((ClipboardManager)ah.getContext().getSystemService("clipboard"));
    AppMethodBeat.o(28083);
  }

  private void initView()
  {
    AppMethodBeat.i(28089);
    if (!hasInit())
    {
      ab.w("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.lyb + "contact = " + this.ehM);
      AppMethodBeat.o(28089);
    }
    while (true)
    {
      return;
      if (!this.pni)
        break;
      dkT();
      AppMethodBeat.o(28089);
    }
    boolean bool = ad.mR(this.ehM.field_username);
    label131: label189: Bitmap localBitmap;
    label233: int i;
    if (bool)
    {
      this.niS.setText("");
      if (ad.aoC(r.Yz()).equals(this.ehM.field_username))
        this.vqQ.setVisibility(8);
      this.quH.setVisibility(0);
      this.vqX = true;
      if (this.ehM.dtS != 1)
        break label498;
      this.quH.setImageDrawable(com.tencent.mm.bz.a.g(this.crP, 2131231387));
      this.quH.setContentDescription(this.mContext.getString(2131302036));
      if (this.ehM.field_verifyFlag != 0)
      {
        this.vqL.setVisibility(0);
        if (ao.a.flw == null)
          break label573;
        localBitmap = BackwardSupportUtil.b.i(ao.a.flw.ky(this.ehM.field_verifyFlag), 2.0F);
        this.vqL.setImageBitmap(localBitmap);
        if (localBitmap != null)
          break label578;
        i = 0;
        label247: this.vqU = i;
      }
      cfI();
      dlb();
      this.pkS.setOnClickListener(new NormalUserHeaderPreference.1(this));
      this.vqT.setOnClickListener(new NormalUserHeaderPreference.2(this));
      if (!ad.aow(this.ehM.field_username))
        break label586;
      this.nrD.setText(this.mContext.getString(2131296924) + this.ehM.Ok());
      label343: if (!t.nB(this.ehM.field_username))
        break label898;
      this.tLA.setVisibility(0);
    }
    while (true)
    {
      dkY();
      dkW();
      dla();
      dkX();
      this.vqI.setOnClickListener(new NormalUserHeaderPreference.3(this));
      this.vqJ.setOnClickListener(new NormalUserHeaderPreference.4(this));
      dkV();
      this.nrD.setLongClickable(true);
      this.nrD.setOnLongClickListener(new NormalUserHeaderPreference.5(this));
      AppMethodBeat.o(28089);
      break;
      this.niS.setText(j.b(this.crP, bo.nullAsNil(this.ehM.field_nickname) + " ", this.niS.getTextSize()));
      break label131;
      label498: if (this.ehM.dtS == 2)
      {
        this.quH.setImageDrawable(com.tencent.mm.bz.a.g(this.crP, 2131231386));
        this.quH.setContentDescription(this.mContext.getString(2131302035));
        break label189;
      }
      if (this.ehM.dtS != 0)
        break label189;
      this.quH.setVisibility(8);
      this.vqX = false;
      break label189;
      label573: localBitmap = null;
      break label233;
      label578: i = localBitmap.getWidth();
      break label247;
      label586: if (ad.aou(this.ehM.field_username))
      {
        this.nrD.setText(this.mContext.getString(2131296936) + this.ehM.Ok());
        break label343;
      }
      if (this.pnc)
      {
        if (com.tencent.mm.n.a.jh(this.ehM.field_type))
        {
          dkU();
          break label343;
        }
        if ((this.ehM.due == null) || (this.ehM.due.equals("")))
        {
          this.nrD.setText(2131296899);
          break label343;
        }
        this.nrD.setText(this.ehM.due);
        break label343;
      }
      if (bool)
      {
        this.nrD.setText((bo.nullAsNil(s.mL(this.ehM.getProvince())) + " " + bo.nullAsNil(this.ehM.getCity())).trim());
        break label343;
      }
      if ((!ad.aov(this.ehM.field_username)) && (this.crP.getIntent().getBooleanExtra("Contact_ShowUserName", true)))
      {
        if ((bo.isNullOrNil(this.ehM.Hq())) && ((ad.aoA(this.ehM.field_username)) || (t.mX(this.ehM.field_username))))
        {
          this.nrD.setVisibility(8);
          break label343;
        }
        if (com.tencent.mm.n.a.jh(this.ehM.field_type))
        {
          dkU();
          break label343;
        }
      }
      this.nrD.setVisibility(8);
      break label343;
      label898: this.tLA.setVisibility(8);
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(28103);
    ab.d("MicroMsg.ContactInfoHeader", "onNotifyChange event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.e("MicroMsg.ContactInfoHeader", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(28103);
    }
    while (true)
    {
      return;
      paramn = (String)paramObject;
      ab.d("MicroMsg.ContactInfoHeader", "onNotifyChange username = " + paramn + ", contact = " + this.ehM);
      if (!hasInit())
      {
        ab.e("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.lyb + "contact = " + this.ehM);
        AppMethodBeat.o(28103);
      }
      else if (bo.nullAsNil(paramn).length() <= 0)
      {
        AppMethodBeat.o(28103);
      }
      else
      {
        if ((this.ehM != null) && (this.ehM.field_username.equals(paramn)))
        {
          com.tencent.mm.model.aw.ZK();
          this.ehM = c.XM().aoO(paramn);
          al.d(new NormalUserHeaderPreference.6(this));
        }
        AppMethodBeat.o(28103);
      }
    }
  }

  public final void a(ad paramad, int paramInt, String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(28095);
    onDetach();
    com.tencent.mm.model.aw.ZK();
    c.XM().a(this);
    com.tencent.mm.model.aw.ZK();
    c.XN().a(this);
    o.acd().d(this);
    this.ehM = paramad;
    this.qvb = paramInt;
    this.mGZ = paramString;
    this.pnc = this.crP.getIntent().getBooleanExtra("Contact_IsLBSFriend", false);
    this.vrc = this.crP.getIntent().getBooleanExtra("Contact_ShowFMessageList", false);
    this.vqZ = this.crP.getIntent().getBooleanExtra("Contact_NeedShowChangeRemarkButton", false);
    this.vra = this.crP.getIntent().getBooleanExtra("Contact_NeedShowChangeSnsPreButton", false);
    this.vrb = this.crP.getIntent().getBooleanExtra("Contact_AlwaysShowRemarkBtn", false);
    this.poP = this.crP.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
    this.vrd = this.crP.getIntent().getStringExtra("Contact_RoomNickname");
    if (paramad.field_deleteFlag == 1)
    {
      bool2 = true;
      this.pni = bool2;
      this.ejD = this.crP.getIntent().getStringExtra("room_name");
      if (bo.nullAsNil(paramad.field_username).length() <= 0)
        break label262;
    }
    label262: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue("initView: contact username is null", bool2);
      initView();
      AppMethodBeat.o(28095);
      return;
      bool2 = false;
      break;
    }
  }

  public final void a(ad paramad, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(28094);
    this.vim = paramString2;
    this.vin = paramString3;
    a(paramad, paramInt, paramString1);
    AppMethodBeat.o(28094);
  }

  public final void a(bv parambv)
  {
    AppMethodBeat.i(28104);
    al.d(new NormalUserHeaderPreference.7(this, parambv));
    AppMethodBeat.o(28104);
  }

  public final void bW(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(28092);
    if ((paramString != null) && (paramString.equals(this.ehM.field_username)))
      this.vqZ = paramBoolean;
    AppMethodBeat.o(28092);
  }

  public final void bX(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(28093);
    if ((paramString != null) && (paramString.equals(this.ehM.field_username)))
      this.vra = paramBoolean;
    AppMethodBeat.o(28093);
  }

  public final void dkU()
  {
    AppMethodBeat.i(28090);
    this.nrD.setVisibility(0);
    if (!bo.isNullOrNil(this.ehM.Hq()))
    {
      this.nrD.setText(this.mContext.getString(2131296930) + this.ehM.Hq());
      AppMethodBeat.o(28090);
    }
    while (true)
    {
      return;
      if ((!ad.aoA(this.ehM.field_username)) && (!t.mX(this.ehM.field_username)))
      {
        String str = bo.nullAsNil(this.ehM.Ok());
        this.nrD.setText(this.mContext.getString(2131296930) + str);
        AppMethodBeat.o(28090);
      }
      else
      {
        this.nrD.setVisibility(8);
        AppMethodBeat.o(28090);
      }
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(28085);
    ab.d("MicroMsg.ContactInfoHeader", "onBindView");
    this.niS = ((TextView)paramView.findViewById(2131821460));
    this.nrD = ((TextView)paramView.findViewById(2131822995));
    this.vqK = ((TextView)paramView.findViewById(2131823015));
    this.vqF = ((TextView)paramView.findViewById(2131823021));
    this.vqG = ((TextView)paramView.findViewById(2131823017));
    this.vqI = ((Button)paramView.findViewById(2131823018));
    this.vqJ = ((Button)paramView.findViewById(2131823019));
    this.vre = ((ProfileMobilePhoneView)paramView.findViewById(2131823025));
    Object localObject = this.vre;
    com.tencent.mm.model.aw.ZK();
    ((ProfileMobilePhoneView)localObject).viy = ((Boolean)c.Ry().get(ac.a.xLB, Boolean.FALSE)).booleanValue();
    this.vrf = ((ProfileDescribeView)paramView.findViewById(2131823026));
    this.vrg = ((ProfileLabelView)paramView.findViewById(2131823027));
    this.vrh = ((TextView)paramView.findViewById(2131823024));
    this.vrf.setOnClickListener(this.vri);
    this.vrg.setOnClickListener(this.vri);
    this.vrh.setOnClickListener(this.vri);
    if ((r.mG(this.ehM.field_username)) || ((!bo.isNullOrNil(this.ehM.field_username)) && (t.nB(this.ehM.field_username))))
    {
      this.vrh.setVisibility(8);
      this.vre.setVisibility(8);
      this.vrf.setVisibility(8);
      this.vrg.setVisibility(8);
      this.tLA = ((TextView)paramView.findViewById(2131823030));
      this.vqQ = ((Button)paramView.findViewById(2131823022));
      this.vqR = ((FMessageListView)paramView.findViewById(2131823028));
      localObject = new a.a();
      ((a.a)localObject).talker = this.ehM.field_username;
      ((a.a)localObject).scene = this.qvb;
      ((a.a)localObject).mGZ = this.mGZ;
      ((a.a)localObject).vqs = this.ehM.dus;
      ((a.a)localObject).type = 0;
      if (this.qvb != 18)
        break label854;
      ((a.a)localObject).type = 1;
      label415: this.vqR.setFMessageArgs((a.a)localObject);
      this.vqH = paramView.findViewById(2131823023);
      this.vqP = ((LinearLayout)paramView.findViewById(2131823007));
      this.pkS = ((ImageView)paramView.findViewById(2131821459));
      this.quH = ((ImageView)paramView.findViewById(2131823009));
      this.vqL = ((ImageView)paramView.findViewById(2131823010));
      this.vqM = ((CheckBox)paramView.findViewById(2131823013));
      this.vqN = ((ImageView)paramView.findViewById(2131823012));
      this.vqO = ((ImageView)paramView.findViewById(2131823011));
      this.vqT = ((ImageView)paramView.findViewById(2131823006));
      this.vqS = ((RelativeLayout)paramView.findViewById(2131823005));
      this.lyb = true;
      initView();
      if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
        break label872;
      ab.d("MicroMsg.ContactInfoHeader", "initAddContent, showFMessageList false");
      this.vqR.setVisibility(8);
      if ((this.vqR.getVisibility() == 8) && (this.vrh.getVisibility() == 8) && (this.vrg.getVisibility() == 8) && (this.vrf.getVisibility() == 8) && (this.tLA.getVisibility() == 8))
        this.vqH.setVisibility(8);
    }
    while (true)
    {
      super.onBindView(paramView);
      AppMethodBeat.o(28085);
      return;
      this.vre.hG(this.vim, this.vin);
      if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
        this.vre.setVisibility(8);
      while (true)
      {
        boolean bool1 = this.vrf.T(this.ehM);
        boolean bool2 = this.vrg.T(this.ehM);
        if ((!bool1) && (!bool2))
          break label775;
        this.vrh.setVisibility(8);
        break;
        this.vre.setVisibility(0);
      }
      label775: if ((this.vrb) || (this.vqZ))
        this.vrh.setVisibility(8);
      while (true)
      {
        if ((this.vrj == null) || ((!this.vrj.equals("ContactWidgetBottleContact")) && (!this.vrj.equals("ContactWidgetQContact"))))
          break label852;
        this.vrh.setVisibility(8);
        break;
        this.vrh.setVisibility(0);
      }
      label852: break;
      label854: if (!bf.kE(this.qvb))
        break label415;
      ((a.a)localObject).type = 2;
      break label415;
      label872: if ((this.mGZ != null) && (this.mGZ.length() != 0))
        break label1009;
      ab.d("MicroMsg.ContactInfoHeader", "initAddContent, FMessageListView gone, addScene = " + this.qvb + ", verifyTicket = " + this.mGZ);
      this.vqR.setVisibility(8);
      if ((this.vqR.getVisibility() == 8) && (this.vrh.getVisibility() == 8) && (this.vrg.getVisibility() == 8) && (this.vrf.getVisibility() == 8) && (this.tLA.getVisibility() == 8))
        this.vqH.setVisibility(8);
    }
    label1009: ab.d("MicroMsg.ContactInfoHeader", "initAddContent, scene = " + this.qvb);
    if (this.qvb == 18)
    {
      ab.d("MicroMsg.ContactInfoHeader", "initAddContent, scene is lbs");
      localObject = com.tencent.mm.bi.d.akQ().apz(this.ehM.field_username);
      localObject = b.a(this.crP, (cp[])localObject);
    }
    while (true)
    {
      if ((localObject != null) && (localObject.length != 0))
        break label1255;
      ab.e("MicroMsg.ContactInfoHeader", "initAddContent, providerList is null");
      this.vqR.setVisibility(8);
      if ((this.vqR.getVisibility() != 8) || (this.vrh.getVisibility() != 8) || (this.vrg.getVisibility() != 8) || (this.vrf.getVisibility() != 8) || (this.tLA.getVisibility() != 8))
        break;
      this.vqH.setVisibility(8);
      break;
      if (bf.kE(this.qvb))
      {
        ab.d("MicroMsg.ContactInfoHeader", "initAddContent, scene is shake");
        localObject = com.tencent.mm.bi.d.akR().apY(this.ehM.field_username);
        localObject = b.a(this.crP, (bt[])localObject);
      }
      else
      {
        ab.d("MicroMsg.ContactInfoHeader", "initAddContent, scene is other");
        localObject = com.tencent.mm.bi.d.akO().apv(this.ehM.field_username);
        localObject = b.a(this.crP, (ax[])localObject);
      }
    }
    label1255: ab.d("MicroMsg.ContactInfoHeader", "initAddContent, providerList size = " + localObject.length);
    int i = localObject.length;
    b localb;
    for (int j = 0; j < i; j++)
    {
      localb = localObject[j];
      if (localb != null)
        ab.d("MicroMsg.ContactInfoHeader", "initAddContent, username = " + localb.username + ", nickname = " + localb.nickname + ", digest = " + localb.fjz + ", addScene = " + localb.qvb);
    }
    if (ad.aox(this.ehM.field_username))
    {
      this.vqR.setVisibility(8);
      this.vqR.setHide(true);
    }
    while (true)
    {
      if ((this.vqR.getVisibility() == 0) || (this.vrh.getVisibility() == 0) || (this.vrg.getVisibility() == 0) || (this.vrf.getVisibility() == 0) || (this.tLA.getVisibility() == 0))
        this.vqH.setVisibility(0);
      i = localObject.length;
      for (j = 0; j < i; j++)
      {
        localb = localObject[j];
        this.vqR.a(localb);
      }
      break;
      this.vqR.setVisibility(0);
      this.vqR.setHide(false);
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28084);
    if (this.vqR != null)
      this.vqR.detach();
    paramViewGroup = super.onCreateView(paramViewGroup);
    AppMethodBeat.o(28084);
    return paramViewGroup;
  }

  public final void onDetach()
  {
    AppMethodBeat.i(28096);
    if (this.vqR != null)
      this.vqR.detach();
    if (this.vrc)
      com.tencent.mm.bi.d.akP().apt(this.ehM.field_username);
    this.crP.getIntent().putExtra("Contact_NeedShowChangeRemarkButton", this.vqZ);
    this.crP.getIntent().putExtra("Contact_NeedShowChangeSnsPreButton", this.vra);
    com.tencent.mm.model.aw.ZK();
    c.XM().b(this);
    o.acd().e(this);
    com.tencent.mm.model.aw.ZK();
    c.XN().b(this);
    AppMethodBeat.o(28096);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(28102);
    if (!hasInit())
    {
      ab.e("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.lyb + "contact = " + this.ehM);
      AppMethodBeat.o(28102);
    }
    while (true)
    {
      return;
      if (bo.nullAsNil(paramString).length() <= 0)
      {
        ab.e("MicroMsg.ContactInfoHeader", "notifyChanged: user = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(28102);
      }
      else
      {
        if (paramString.equals(this.ehM.field_username))
          initView();
        AppMethodBeat.o(28102);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference
 * JD-Core Version:    0.6.2
 */