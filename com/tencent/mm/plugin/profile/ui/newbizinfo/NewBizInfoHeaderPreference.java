package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.profile.ui.b.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.preference.Preference;

public class NewBizInfoHeaderPreference extends Preference
  implements d.a, n.b
{
  private static long ppW = 0L;
  private MMActivity crP;
  private ad ehM;
  private ImageView eks;
  private TextView gne;
  private TextView hrg;
  private boolean lyb;
  private RelativeLayout oZf;
  private String pkV;
  private com.tencent.mm.aj.d pkW;
  private com.tencent.mm.plugin.profile.ui.b.a pkX;
  private b pkY;
  private com.tencent.mm.plugin.profile.ui.newbizinfo.b.d ppN;
  private ImageView ppV;

  public NewBizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23855);
    this.pkX = new com.tencent.mm.plugin.profile.ui.b.a(this);
    this.pkY = new b(this);
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23855);
  }

  public NewBizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23856);
    this.pkX = new com.tencent.mm.plugin.profile.ui.b.a(this);
    this.pkY = new b(this);
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23856);
  }

  private void cbI()
  {
    boolean bool = true;
    AppMethodBeat.i(23859);
    if (ao.a.flw != null)
    {
      localObject = BackwardSupportUtil.b.i(ao.a.flw.ky(this.ehM.field_verifyFlag), 2.0F);
      if (localObject != null)
        break label99;
      label38: ab.i("MicroMsg.NewBizInfoHeaderPreference", "verify bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
      if (localObject == null)
        break label104;
    }
    label99: label104: for (Object localObject = new BitmapDrawable(this.crP.getResources(), (Bitmap)localObject); ; localObject = null)
    {
      this.hrg.setCompoundDrawables((Drawable)localObject, null, null, null);
      AppMethodBeat.o(23859);
      return;
      localObject = null;
      break;
      bool = false;
      break label38;
    }
  }

  private void initView()
  {
    AppMethodBeat.i(23858);
    if ((!this.lyb) || (this.ehM == null))
    {
      ab.w("MicroMsg.NewBizInfoHeaderPreference", "initView contact is null, return");
      AppMethodBeat.o(23858);
    }
    while (true)
    {
      return;
      this.gne.setText(j.b(this.crP, bo.nullAsNil(this.ehM.Oi()), this.gne.getTextSize()));
      if (this.pkW == null)
        this.pkW = f.qX(this.ehM.field_username);
      if (this.pkW != null)
        this.pkV = this.pkW.field_brandIconURL;
      label158: int i;
      if ((this.ppN != null) && (!this.ppN.arA()))
      {
        this.eks.setVisibility(8);
        if (bo.nullAsNil(this.ehM.signature).trim().length() > 0)
          break label410;
        this.hrg.setVisibility(8);
        if ((!s.aVO()) || (!com.tencent.mm.n.a.jh(this.ehM.field_type)) || (!this.ehM.Oe()) || (!f.qZ(this.ehM.field_username)))
          break label446;
        this.ppV.setVisibility(0);
        ViewGroup.LayoutParams localLayoutParams = this.ppV.getLayoutParams();
        i = (int)this.gne.getTextSize();
        localLayoutParams.height = i;
        localLayoutParams.width = i;
        this.ppV.setLayoutParams(localLayoutParams);
      }
      while (true)
      {
        int j = ak.getStatusBarHeight(this.mContext);
        i = ak.de(this.mContext);
        ab.d("MicroMsg.NewBizInfoHeaderPreference", "actionBarHeight=%s statusBarHeight=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if ((j <= 0) || (i <= 0))
          break label457;
        this.oZf.setPadding(this.oZf.getPaddingLeft(), j + i + com.tencent.mm.bz.a.am(this.mContext, 2131427858), this.oZf.getPaddingRight(), this.oZf.getPaddingBottom());
        AppMethodBeat.o(23858);
        break;
        this.eks.setVisibility(0);
        if (System.currentTimeMillis() - ppW < 2000L);
        for (boolean bool = true; ; bool = false)
        {
          com.tencent.mm.plugin.brandservice.b.a.a(this.eks, this.ehM, this.pkV, bool);
          this.eks.setOnClickListener(new NewBizInfoHeaderPreference.1(this));
          break;
        }
        label410: this.hrg.setText(j.b(this.crP, this.ehM.signature));
        this.hrg.setVisibility(0);
        cbI();
        break label158;
        label446: this.ppV.setVisibility(4);
      }
      label457: this.oZf.setPadding(this.oZf.getPaddingLeft(), com.tencent.mm.bz.a.am(this.mContext, 2131428605), this.oZf.getPaddingRight(), this.oZf.getPaddingBottom());
      AppMethodBeat.o(23858);
    }
  }

  public static void jy(long paramLong)
  {
    ppW = paramLong;
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(23863);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.d("MicroMsg.NewBizInfoHeaderPreference", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(23863);
    }
    while (true)
    {
      return;
      paramn = (String)paramObject;
      if (bo.nullAsNil(paramn).length() <= 0)
      {
        AppMethodBeat.o(23863);
      }
      else
      {
        if ((this.ehM != null) && (this.ehM.field_username.equals(paramn)))
        {
          aw.ZK();
          this.ehM = c.XM().aoO(paramn);
        }
        AppMethodBeat.o(23863);
      }
    }
  }

  public final void a(ad paramad, String paramString, com.tencent.mm.aj.d paramd, com.tencent.mm.plugin.profile.ui.newbizinfo.b.d paramd1)
  {
    AppMethodBeat.i(23860);
    onDetach();
    this.pkV = paramString;
    this.pkW = paramd;
    this.ehM = paramad;
    this.ppN = paramd1;
    aw.ZK();
    c.XM().a(this.pkY);
    o.acd().d(this.pkX);
    initView();
    AppMethodBeat.o(23860);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23857);
    this.eks = ((ImageView)paramView.findViewById(2131823001));
    this.gne = ((TextView)paramView.findViewById(2131823003));
    this.hrg = ((TextView)paramView.findViewById(2131822998));
    this.ppV = ((ImageView)paramView.findViewById(2131823004));
    this.oZf = ((RelativeLayout)paramView.findViewById(2131823000));
    this.lyb = true;
    initView();
    super.onBindView(paramView);
    AppMethodBeat.o(23857);
  }

  public final void onDetach()
  {
    AppMethodBeat.i(23861);
    aw.ZK();
    c.XM().b(this.pkY);
    o.acd().e(this.pkX);
    AppMethodBeat.o(23861);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(23862);
    ab.i("MicroMsg.NewBizInfoHeaderPreference", "notifyChanged user:%s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.NewBizInfoHeaderPreference", "notifyChanged err, user is null");
      AppMethodBeat.o(23862);
    }
    while (true)
    {
      return;
      if ((this.ehM != null) && (paramString.equals(this.ehM.field_username)))
        initView();
      AppMethodBeat.o(23862);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoHeaderPreference
 * JD-Core Version:    0.6.2
 */