package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public final class a
{
  private final String TAG;
  Bitmap gKF;
  private View.OnClickListener gKK;
  private View jcl;
  MMActivity jiE;
  b kaS;
  private View kfY;
  private View kfZ;
  private View kga;
  Bitmap kgb;
  private TextView kgc;
  private TextView kgd;
  CheckBox kge;
  private String kgf;
  private int kgg;
  boolean kgh;
  a.a kgi;
  float kgj;
  private View.OnLongClickListener kgk;

  public a(MMActivity paramMMActivity, View paramView)
  {
    AppMethodBeat.i(88091);
    this.TAG = "MicroMsg.CardConsumeCodeController";
    this.kgg = 1;
    this.kgh = false;
    this.kgj = 0.0F;
    this.gKK = new a.1(this);
    this.kgk = new a.2(this);
    this.jiE = paramMMActivity;
    this.jcl = paramView;
    AppMethodBeat.o(88091);
  }

  private void a(ImageView paramImageView, Bitmap paramBitmap)
  {
    AppMethodBeat.i(88096);
    if ((paramImageView == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
      AppMethodBeat.o(88096);
    while (true)
    {
      return;
      paramImageView.setImageBitmap(paramBitmap);
      if (this.kgg != 1)
      {
        paramImageView.setAlpha(10);
        AppMethodBeat.o(88096);
      }
      else
      {
        paramImageView.setAlpha(255);
        AppMethodBeat.o(88096);
      }
    }
  }

  private void da(View paramView)
  {
    AppMethodBeat.i(88097);
    paramView = (Button)paramView.findViewById(2131821957);
    if (this.kgg == 1)
      paramView.setVisibility(8);
    while (true)
    {
      if (this.kgg == -1)
        paramView.setText(2131297915);
      AppMethodBeat.o(88097);
      return;
      paramView.setVisibility(0);
    }
  }

  public final void GL(String paramString)
  {
    this.kgg = 1;
    this.kgf = paramString;
  }

  final void ay(float paramFloat)
  {
    AppMethodBeat.i(88093);
    WindowManager.LayoutParams localLayoutParams = this.jiE.getWindow().getAttributes();
    localLayoutParams.screenBrightness = paramFloat;
    this.jiE.getWindow().setAttributes(localLayoutParams);
    AppMethodBeat.o(88093);
  }

  public final void bbB()
  {
    AppMethodBeat.i(88095);
    ab.i("MicroMsg.CardConsumeCodeController", "doUpdate()");
    if (!this.kgh)
    {
      ab.i("MicroMsg.CardConsumeCodeController", "doUpdate() not ready show!");
      AppMethodBeat.o(88095);
    }
    while (true)
    {
      return;
      Object localObject1;
      label78: Object localObject2;
      if (!bo.isNullOrNil(this.kaS.aZW().vSo))
      {
        localObject1 = this.kaS.aZW().vSo;
        ab.i("MicroMsg.CardConsumeCodeController", "code:%s from sign_number", new Object[] { localObject1 });
        switch (this.kaS.aZW().vSb)
        {
        default:
          if (!bo.isNullOrNil(this.kaS.aZV().kCx))
            if (this.kaS.aZV().vUA != null)
            {
              this.kgd.setText(this.kaS.aZV().kCx);
              this.kgd.setVisibility(0);
              this.kgc.setVisibility(8);
              if (this.kfY != null)
              {
                localObject1 = (ImageView)this.kfY.findViewById(2131821963);
                localObject2 = ((ImageView)localObject1).getLayoutParams();
                ((ViewGroup.LayoutParams)localObject2).height = com.tencent.mm.bz.a.fromDPToPix(this.jiE, 180);
                ((ViewGroup.LayoutParams)localObject2).width = com.tencent.mm.bz.a.fromDPToPix(this.jiE, 180);
                ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
              }
            }
          break;
        case 2:
        case 1:
        case 0:
        }
      }
      while (true)
      {
        while (true)
        {
          while (true)
          {
            if ((!this.kaS.aZC()) || (TextUtils.isEmpty(this.kaS.bab())) || (this.kaS.bab().equals(r.Yz())))
              break label1205;
            this.kge.setVisibility(0);
            localObject1 = " " + this.jiE.getString(2131297820, new Object[] { l.Hp(this.kaS.bab()) });
            this.kge.setText(j.f(this.jiE, (CharSequence)localObject1, this.jiE.getResources().getDimensionPixelOffset(2131427864)));
            AppMethodBeat.o(88095);
            break;
            if (this.kaS.aZQ())
            {
              localObject1 = am.bbj().getCode();
              ab.i("MicroMsg.CardConsumeCodeController", "code:%s from dynamic code", new Object[] { localObject1 });
              break label78;
            }
            localObject1 = this.kaS.aZW().code;
            ab.i("MicroMsg.CardConsumeCodeController", "code:%s from dataInfo", new Object[] { localObject1 });
            break label78;
            if (this.kfY == null)
              this.kfY = ((ViewStub)this.jcl.findViewById(2131821982)).inflate();
            localObject3 = this.kfY;
            localObject2 = (ImageView)((View)localObject3).findViewById(2131821963);
            localObject3 = (TextView)((View)localObject3).findViewById(2131821958);
            if (!this.kaS.aZD())
              ((TextView)localObject3).setTextColor(l.Hn(this.kaS.aZV().color));
            if (((String)localObject1).length() <= 40)
            {
              ((TextView)localObject3).setText(m.Hu((String)localObject1));
              if (this.kaS.aZM())
              {
                ((TextView)localObject3).setVisibility(0);
                ((TextView)localObject3).setOnLongClickListener(this.kgk);
                label574: if (this.kgg != 1)
                  ((TextView)localObject3).setVisibility(4);
              }
            }
            try
            {
              l.K(this.gKF);
              if (!TextUtils.isEmpty((CharSequence)localObject1))
              {
                this.gKF = com.tencent.mm.bw.a.a.b(this.jiE, (String)localObject1, 12, 3);
                a((ImageView)localObject2, this.gKF);
              }
              while (true)
              {
                da(this.kfY);
                break;
                ((TextView)localObject3).setVisibility(8);
                break label574;
                ((TextView)localObject3).setVisibility(8);
                break label574;
                this.gKF = null;
                ((ImageView)localObject2).setImageBitmap(this.gKF);
              }
            }
            catch (Exception localException1)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.CardConsumeCodeController", localException1, "", new Object[0]);
            }
          }
          if (this.kfZ == null)
            this.kfZ = ((ViewStub)this.jcl.findViewById(2131821984)).inflate();
          Object localObject3 = this.kfZ;
          localObject2 = (ImageView)((View)localObject3).findViewById(2131821956);
          localObject3 = (TextView)((View)localObject3).findViewById(2131821958);
          if (!this.kaS.aZD())
            ((TextView)localObject3).setTextColor(l.Hn(this.kaS.aZV().color));
          if ((!TextUtils.isEmpty(localException1)) && (localException1.length() <= 40))
          {
            ((TextView)localObject3).setText(m.Hu(localException1));
            if (this.kaS.aZM())
            {
              ((TextView)localObject3).setVisibility(0);
              ((TextView)localObject3).setOnLongClickListener(this.kgk);
              label821: if (this.kgg != 1)
                ((TextView)localObject3).setVisibility(4);
            }
          }
          try
          {
            l.K(this.kgb);
            if (!TextUtils.isEmpty(localException1))
            {
              this.kgb = com.tencent.mm.bw.a.a.b(this.jiE, localException1, 5, 0);
              a((ImageView)localObject2, this.kgb);
            }
            while (true)
            {
              da(this.kfZ);
              break;
              ((TextView)localObject3).setVisibility(8);
              break label821;
              ((TextView)localObject3).setVisibility(8);
              break label821;
              this.kgb = null;
              ((ImageView)localObject2).setImageBitmap(this.kgb);
            }
          }
          catch (Exception localException2)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.CardConsumeCodeController", localException2, "", new Object[0]);
          }
        }
        if (this.kga == null)
          this.kga = ((ViewStub)this.jcl.findViewById(2131821986)).inflate();
        localObject2 = (TextView)this.kga.findViewById(2131821958);
        ((TextView)localObject2).setText(m.Hu(localException2));
        ((TextView)localObject2).setOnLongClickListener(this.kgk);
        if (!this.kaS.aZD())
          ((TextView)localObject2).setTextColor(l.Hn(this.kaS.aZV().color));
        if (localException2.length() <= 12)
          ((TextView)localObject2).setTextSize(1, 33.0F);
        while (true)
        {
          da(this.kga);
          break;
          if ((localException2.length() > 12) && (localException2.length() <= 16))
            ((TextView)localObject2).setTextSize(1, 30.0F);
          else if ((localException2.length() > 16) && (localException2.length() <= 20))
            ((TextView)localObject2).setTextSize(1, 24.0F);
          else if ((localException2.length() > 20) && (localException2.length() <= 40))
            ((TextView)localObject2).setTextSize(1, 18.0F);
          else if (localException2.length() > 40)
            ((TextView)localObject2).setVisibility(8);
        }
        this.kgc.setText(this.kaS.aZV().kCx);
        this.kgc.setVisibility(0);
        continue;
        this.kgc.setVisibility(8);
        this.kgd.setVisibility(8);
      }
      label1205: this.kge.setChecked(false);
      this.kge.setVisibility(8);
      AppMethodBeat.o(88095);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(88094);
    this.kgc = ((TextView)this.jcl.findViewById(2131821988));
    this.kgd = ((TextView)this.jcl.findViewById(2131821981));
    this.kge = ((CheckBox)this.jcl.findViewById(2131821992));
    this.kge.setChecked(true);
    this.kge.setOnClickListener(this.gKK);
    if (this.kgj < 0.8F)
      ay(0.8F);
    AppMethodBeat.o(88094);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(88092);
    this.kgj = this.jiE.getWindow().getAttributes().screenBrightness;
    AppMethodBeat.o(88092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.a
 * JD-Core Version:    0.6.2
 */