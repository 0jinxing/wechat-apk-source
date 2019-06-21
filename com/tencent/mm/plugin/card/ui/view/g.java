package com.tencent.mm.plugin.card.ui.view;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.bw.a.a;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.ui.j;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o;

public abstract class g extends i
{
  String code;
  private Bitmap gKF;
  MMActivity jiE;
  protected b kaS;
  private Bitmap kgb;
  private View.OnLongClickListener kgk = new g.1(this);
  private j kjw;
  private ViewGroup kqD;
  private ab kqE;
  private ViewStub kqF;

  private static void a(ImageView paramImageView, Bitmap paramBitmap)
  {
    if ((paramImageView == null) || (paramBitmap == null));
    while (true)
    {
      return;
      paramImageView.setImageBitmap(paramBitmap);
    }
  }

  private void c(View paramView, String paramString)
  {
    try
    {
      paramView = (ImageView)paramView.findViewById(2131821963);
      l.K(this.gKF);
      int i = 1;
      int j = i;
      if (this.kaS != null)
      {
        j = i;
        if (this.kaS.aZV() != null)
          j = this.kaS.aZV().vUD;
      }
      this.gKF = a.b(this.jiE, paramString, 12, j);
      a(paramView, this.gKF);
      paramView.setOnClickListener(this.kqK.bcz());
      this.kjw.gKF = this.gKF;
      this.kjw.bdr();
      return;
    }
    catch (Exception paramView)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.CardBaseCodeView", paramView, "", new Object[0]);
    }
  }

  private void d(View paramView, String paramString)
  {
    try
    {
      paramView = (ImageView)paramView.findViewById(2131821956);
      l.K(this.kgb);
      if ((paramString != null) && (paramString.length() > 0))
        this.kgb = a.b(this.jiE, paramString, 5, 0);
      a(paramView, this.kgb);
      paramView.setOnClickListener(this.kqK.bcz());
      this.kjw.kgb = this.kgb;
      return;
    }
    catch (Exception paramView)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.CardBaseCodeView", paramView, "", new Object[0]);
    }
  }

  private void e(View paramView, String paramString)
  {
    TextView localTextView = (TextView)paramView.findViewById(2131821958);
    localTextView.setText(m.Hu(paramString));
    localTextView.setOnLongClickListener(this.kgk);
    paramView = this.kaS.aZV().color;
    if (!bo.isNullOrNil(paramView))
      localTextView.setTextColor(l.Hn(paramView));
    if (paramString.length() <= 12)
      localTextView.setTextSize(1, 33.0F);
    while (true)
    {
      return;
      if ((paramString.length() > 12) && (paramString.length() <= 16))
        localTextView.setTextSize(1, 30.0F);
      else if ((paramString.length() > 16) && (paramString.length() <= 20))
        localTextView.setTextSize(1, 24.0F);
      else if ((paramString.length() > 20) && (paramString.length() <= 40))
        localTextView.setTextSize(1, 18.0F);
      else if (paramString.length() > 40)
        localTextView.setVisibility(8);
    }
  }

  public final void b(b paramb)
  {
    if (paramb == null)
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "updateCardInfo failure! mCardInfo is null!");
    while (true)
    {
      return;
      this.kaS = paramb;
    }
  }

  public abstract ab beA();

  public final void bes()
  {
    bex();
  }

  public final void bev()
  {
    if ((this.kqE != null) && (this.kaS != null) && (this.kqD != null))
      this.kqE.a(this.kqD, this.kaS);
  }

  public final void bew()
  {
    if ((this.kaS != null) && (this.kqE != null) && (this.kqD != null))
    {
      this.kqE.b(this.kqD, this.kaS);
      if ((this.kaS.aZW().vSb == 2) && (this.kjw != null))
      {
        j localj = this.kjw;
        if ((localj.gKG != null) && (localj.gKG.isShowing()))
          localj.gKG.dismiss();
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "onScreenShot is error! mCardInfo or codeContainer or targetView is null ");
    }
  }

  public final void bex()
  {
    if (this.kqD != null)
      this.kqD.setVisibility(8);
  }

  public abstract ab bey();

  public abstract ab bez();

  public final void d(c paramc)
  {
    if (this.kaS == null)
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode mCardInfo  is null ! cannot show code view");
    while (true)
    {
      return;
      if (paramc == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "updateCodeView failure!refreshReason is null!");
      }
      else if (!this.kqE.g(this.kaS))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "updateCodeView failure! can not get qrcode! refreshReason = %s", new Object[] { Integer.valueOf(paramc.action) });
        bev();
      }
      else
      {
        this.kqE.l(this.kqD);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardBaseCodeView", "updateCodeView from refreshReason = %s", new Object[] { Integer.valueOf(paramc.action) });
        this.code = e(paramc);
        if (bo.isNullOrNil(this.code))
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode is empty! cannot show code view");
        else
          switch (this.kaS.aZW().vSb)
          {
          default:
            break;
          case 0:
            e(this.kqD, this.code);
            break;
          case 2:
            c(this.kqD, this.code);
            break;
          case 1:
            d(this.kqD, this.code);
          }
      }
    }
  }

  public final void destroy()
  {
    super.destroy();
    this.jiE = null;
    this.kjw = null;
    this.kaS = null;
    this.kqD = null;
    this.kqE = null;
    l.K(this.gKF);
    l.K(this.kgb);
  }

  public abstract String e(c paramc);

  public abstract boolean f(b paramb);

  public final void initView()
  {
    this.jiE = this.kqK.bcy();
    this.kjw = this.kqK.bcE();
    this.kaS = this.kqK.bcv();
    if (this.kaS == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "initView failure! cardInfo is null!");
      return;
    }
    switch (this.kaS.aZW().vSb)
    {
    default:
      this.kqE = bey();
    case 2:
    case 1:
    case 0:
    }
    while (true)
    {
      if (this.kqE != null)
        break label151;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
      break;
      this.kqE = bey();
      continue;
      this.kqE = bez();
      continue;
      this.kqE = beA();
    }
    label151: switch (this.kaS.aZW().vSb)
    {
    default:
      if (this.kqF == null)
        this.kqF = ((ViewStub)findViewById(2131822032));
      label209: if (this.kqF == null)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "initTargetView failure! viewStub is null!");
      break;
    case 2:
    case 1:
    case 0:
    }
    while (this.kqD == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "iniView failure! targetView is null!");
      break;
      if (this.kqF != null)
        break label209;
      this.kqF = ((ViewStub)findViewById(2131822032));
      break label209;
      if (this.kqF != null)
        break label209;
      this.kqF = ((ViewStub)findViewById(2131822033));
      break label209;
      if (this.kqF != null)
        break label209;
      this.kqF = ((ViewStub)findViewById(2131822034));
      break label209;
      if (this.kqE == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
      }
      else if (this.kqE.getLayoutId() == 0)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "initTargetView failure! codeContainer.getLayoutId()  is 0!");
      }
      else
      {
        this.kqF.setLayoutResource(this.kqE.getLayoutId());
        if (this.kqD == null)
          this.kqD = ((ViewGroup)this.kqF.inflate());
      }
    }
  }

  public final void update()
  {
    if (this.kaS == null)
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "update  failure! mCardInfo is null!");
    while (true)
    {
      return;
      if (this.kqE == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "update failure! codeContainer is null!");
      }
      else if (this.kqD == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardBaseCodeView", "update failure! targetView is null!");
      }
      else
      {
        this.kjw.bdp();
        d(c.krI);
        this.kqE.c(this.kqD, this.kaS);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.g
 * JD-Core Version:    0.6.2
 */