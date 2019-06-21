package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.profile.ui.b.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import junit.framework.Assert;

public class BizInfoHeaderPreference extends Preference
  implements d.a, n.b
{
  private MMActivity crP;
  private ad ehM;
  private boolean lyb;
  private TextView niS;
  private TextView nrD;
  private ImageView pkS;
  private ImageView pkT;
  private View pkU;
  private String pkV;
  private com.tencent.mm.aj.d pkW;
  private com.tencent.mm.plugin.profile.ui.b.a pkX;
  private b pkY;

  public BizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23307);
    this.lyb = false;
    this.pkX = new com.tencent.mm.plugin.profile.ui.b.a(this);
    this.pkY = new b(this);
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23307);
  }

  public BizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23308);
    this.lyb = false;
    this.pkX = new com.tencent.mm.plugin.profile.ui.b.a(this);
    this.pkY = new b(this);
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23308);
  }

  private boolean adV()
  {
    AppMethodBeat.i(23315);
    boolean bool;
    if (this.pkW == null)
    {
      bool = true;
      AppMethodBeat.o(23315);
    }
    while (true)
    {
      return bool;
      bool = this.pkW.adV();
      AppMethodBeat.o(23315);
    }
  }

  private boolean hasInit()
  {
    if ((this.lyb) && (this.ehM != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void initView()
  {
    AppMethodBeat.i(23310);
    if (!hasInit())
    {
      ab.w("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.lyb + "contact = " + this.ehM);
      AppMethodBeat.o(23310);
    }
    while (true)
    {
      return;
      this.niS.setText(j.b(this.crP, bo.nullAsNil(this.ehM.Oi()) + " ", this.niS.getTextSize()));
      if (this.pkW == null)
        this.pkW = f.qX(this.ehM.field_username);
      if (this.pkW != null)
        this.pkV = this.pkW.field_brandIconURL;
      com.tencent.mm.plugin.brandservice.b.a.a(this.pkS, this.ehM, this.pkV, false);
      this.pkS.setTag(this.ehM.field_username);
      this.pkU.setOnClickListener(new BizInfoHeaderPreference.1(this));
      if ((com.tencent.mm.n.a.jh(this.ehM.field_type)) && (adV()))
        if (!bo.isNullOrNil(this.ehM.Hq()))
        {
          this.nrD.setVisibility(0);
          this.nrD.setText(this.mContext.getString(2131296930) + this.ehM.Hq());
        }
      while (true)
      {
        if (!this.ehM.Oc())
          break label401;
        this.pkT.setVisibility(0);
        AppMethodBeat.o(23310);
        break;
        if ((!ad.aoA(this.ehM.field_username)) && (!t.mX(this.ehM.field_username)))
        {
          String str = bo.nullAsNil(this.ehM.Ok());
          this.nrD.setText(this.mContext.getString(2131296930) + str);
          this.nrD.setVisibility(0);
        }
        else
        {
          this.nrD.setVisibility(8);
          continue;
          this.nrD.setVisibility(8);
        }
      }
      label401: this.pkT.setVisibility(8);
      AppMethodBeat.o(23310);
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(23314);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.d("MicroMsg.BizInfoHeaderPreference", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(23314);
    }
    while (true)
    {
      return;
      if (!hasInit())
      {
        ab.e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.lyb + "contact = " + this.ehM);
        AppMethodBeat.o(23314);
      }
      else
      {
        paramn = (String)paramObject;
        if (bo.nullAsNil(paramn).length() <= 0)
        {
          AppMethodBeat.o(23314);
        }
        else
        {
          if ((this.ehM != null) && (this.ehM.field_username.equals(paramn)))
          {
            aw.ZK();
            this.ehM = c.XM().aoO(paramn);
          }
          AppMethodBeat.o(23314);
        }
      }
    }
  }

  public final void a(ad paramad, String paramString, com.tencent.mm.aj.d paramd)
  {
    AppMethodBeat.i(23311);
    this.pkV = paramString;
    this.pkW = paramd;
    onDetach();
    aw.ZK();
    c.XM().a(this.pkY);
    o.acd().d(this.pkX);
    this.ehM = paramad;
    if (bo.nullAsNil(paramad.field_username).length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("initView: contact username is null", bool);
      initView();
      AppMethodBeat.o(23311);
      return;
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23309);
    ab.d("MicroMsg.BizInfoHeaderPreference", "onBindView");
    this.niS = ((TextView)paramView.findViewById(2131821460));
    this.nrD = ((TextView)paramView.findViewById(2131822995));
    this.pkT = ((ImageView)paramView.findViewById(2131822996));
    this.pkS = ((ImageView)paramView.findViewById(2131821459));
    this.pkU = paramView.findViewById(2131822994);
    this.lyb = true;
    initView();
    super.onBindView(paramView);
    AppMethodBeat.o(23309);
  }

  public final void onDetach()
  {
    AppMethodBeat.i(23312);
    aw.ZK();
    c.XM().b(this.pkY);
    o.acd().e(this.pkX);
    AppMethodBeat.o(23312);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(23313);
    if (!hasInit())
    {
      ab.e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.lyb + "contact = " + this.ehM);
      AppMethodBeat.o(23313);
    }
    while (true)
    {
      return;
      if (bo.nullAsNil(paramString).length() <= 0)
      {
        ab.e("MicroMsg.BizInfoHeaderPreference", "notifyChanged: user = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(23313);
      }
      else
      {
        if (paramString.equals(this.ehM.field_username))
          initView();
        AppMethodBeat.o(23313);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference
 * JD-Core Version:    0.6.2
 */