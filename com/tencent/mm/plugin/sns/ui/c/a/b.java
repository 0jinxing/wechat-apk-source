package com.tencent.mm.plugin.sns.ui.c.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.plugin.sns.storage.b.f;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.QImageView.a;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;
import java.util.List;

public final class b extends a
{
  private Context context;
  private com.tencent.mm.ui.widget.b.a jMO;
  public TextView rGE;
  public TextView rGF;
  public View rGG;
  public Button rGH;
  public Button rGI;
  public View rGJ;
  public MaskImageView rGK;
  public SnsCardAdTagListView rGL;
  public View rGM;
  public View rGN;
  public View rGO;
  com.tencent.mm.plugin.sns.a.b.g rqn;

  public b(TimeLineObject paramTimeLineObject, n paramn, com.tencent.mm.plugin.sns.ui.d.b paramb, com.tencent.mm.plugin.sns.a.b.g paramg)
  {
    this.timeLineObject = paramTimeLineObject;
    this.ros = paramn;
    this.rqo = paramb;
    this.rqn = paramg;
  }

  private void G(n paramn)
  {
    int i = 0;
    AppMethodBeat.i(40093);
    if ((paramn == null) || (!paramn.coP()))
      AppMethodBeat.o(40093);
    int j;
    int k;
    while (true)
    {
      return;
      j = Color.parseColor("#cdcdcd");
      k = Color.parseColor("#ffffff");
      if ((this.rGH != null) && (this.rGI != null))
        break;
      AppMethodBeat.o(40093);
    }
    this.rGH.setOnClickListener(this.rqo.rKl);
    this.rGI.setOnClickListener(this.rqo.rKm);
    int m;
    int n;
    if (paramn.cqo().coS())
    {
      m = v.gr(paramn.cqo().qVh.qVu, paramn.crc());
      if ((m > 0) && (m <= 2))
        if (m == 1)
        {
          this.rGI.setBackgroundColor(k);
          this.rGI.setTextColor(j);
          this.rGI.setText(paramn.cqo().qVh.Dm(1));
          this.rGH.setBackgroundResource(2130840254);
          this.rGH.setTextColor(-16777216);
          this.rGH.setText(paramn.cqo().qVh.Dl(0));
          n = i;
        }
    }
    while (true)
    {
      if (n != 0)
      {
        this.rGH.setTextColor(-16777216);
        this.rGH.setBackgroundResource(2130840254);
        this.rGI.setTextColor(-16777216);
        this.rGI.setBackgroundResource(2130840254);
        this.rGH.setText(paramn.cqo().coL());
        this.rGI.setText(paramn.cqo().coM());
      }
      AppMethodBeat.o(40093);
      break;
      n = i;
      if (m == 2)
      {
        this.rGH.setBackgroundColor(k);
        this.rGH.setTextColor(j);
        this.rGH.setText(paramn.cqo().qVh.Dm(0));
        this.rGI.setBackgroundResource(2130840254);
        this.rGI.setTextColor(-16777216);
        this.rGI.setText(paramn.cqo().qVh.Dl(1));
        n = i;
        continue;
        n = 1;
      }
    }
  }

  public final void g(View paramView1, View paramView2)
  {
    AppMethodBeat.i(40091);
    this.contentView = paramView1;
    this.rpP = paramView2;
    this.context = paramView1.getContext();
    this.rGN = paramView1.findViewById(2131827604);
    this.rGO = paramView1.findViewById(2131827607);
    this.rGG = paramView1.findViewById(2131827611);
    this.rGG.setVisibility(8);
    this.rGJ = paramView1.findViewById(2131827614);
    this.rGJ.setVisibility(8);
    this.rGK = ((MaskImageView)paramView1.findViewById(2131827605));
    this.rGH = ((Button)paramView1.findViewById(2131827612));
    this.rGI = ((Button)paramView1.findViewById(2131827613));
    paramView2 = this.ros.cqq();
    if ((paramView2 != null) && (paramView2.coI()) && (!this.ros.crg()))
      this.rGJ.setVisibility(0);
    this.rGF = ((TextView)paramView1.findViewById(2131827609));
    this.rGF.setClickable(false);
    this.rGF.setLongClickable(false);
    paramView2 = (WindowManager)this.context.getSystemService("window");
    int i = Math.min(paramView2.getDefaultDisplay().getWidth(), paramView2.getDefaultDisplay().getHeight());
    int j = com.tencent.mm.bz.a.al(this.context, 2131428663);
    int k = com.tencent.mm.bz.a.al(this.context, 2131427865);
    int m = this.context.getResources().getDimensionPixelSize(2131427812);
    int n = this.context.getResources().getDimensionPixelSize(2131427812);
    int i1 = this.context.getResources().getDimensionPixelSize(2131427858);
    paramView2 = (LinearLayout.LayoutParams)paramView1.getLayoutParams();
    paramView2.topMargin = this.context.getResources().getDimensionPixelOffset(2131427796);
    paramView2.bottomMargin = 0;
    paramView2.width = (i - j - k - m - n - i1);
    paramView2.height = -2;
    paramView1.setLayoutParams(paramView2);
    paramView1.setBackground(this.context.getResources().getDrawable(2130840250));
    this.rGE = ((TextView)paramView1.findViewById(2131827608));
    this.rGE.setClickable(false);
    this.rGE.setLongClickable(false);
    if (!bo.isNullOrNil(this.ros.cqo().qUS))
    {
      this.rGE.setText(this.ros.cqo().qUS + " ");
      j.h(this.rGE, 2);
      this.rGE.setVisibility(0);
      if (!bo.isNullOrNil(this.ros.cqo().qUT))
        break label1328;
      paramView2 = this.timeLineObject.xfF;
      label490: if (bo.isNullOrNil(paramView2))
        break label1342;
      this.rGF.setText(paramView2 + " ");
      j.h(this.rGF, 2);
      this.rGF.setVisibility(0);
      label541: this.jMO = new com.tencent.mm.ui.widget.b.a(this.context);
      this.jMO.c(paramView1, this.rqo.rJZ, this.rqo.rJH);
      if ((!this.ros.cqo().coR()) && (!this.ros.cqo().coS()))
        break label1354;
      this.rGG.setVisibility(0);
      G(this.ros);
    }
    while (true)
    {
      this.rGD = new aj();
      this.rGD.rnt = paramView1.findViewById(2131827606);
      this.rGD.rns = this.rGD.rnt;
      this.rGD.rnt.setOnClickListener(this.rqo.rKe);
      this.rGD.qzM = ((com.tencent.mm.plugin.sight.decode.a.a)this.rGD.rnt.findViewById(2131820629));
      this.rGD.raP = ((ImageView)this.rGD.rnt.findViewById(2131820981));
      this.rGD.rnu = ((MMPinProgressBtn)this.rGD.rnt.findViewById(2131821370));
      this.rGD.rnv = ((TextView)this.rGD.rnt.findViewById(2131827571));
      this.rGD.raQ = ((TextView)this.rGD.rnt.findViewById(2131827572));
      paramView2 = (RelativeLayout.LayoutParams)this.rGK.getLayoutParams();
      paramView2.leftMargin = com.tencent.mm.bz.a.fromDPToPix(this.context, 10);
      paramView2.rightMargin = com.tencent.mm.bz.a.fromDPToPix(this.context, 10);
      paramView2.topMargin = com.tencent.mm.bz.a.fromDPToPix(this.context, 10);
      paramView2.bottomMargin = com.tencent.mm.bz.a.fromDPToPix(this.context, 10);
      this.rGK.setLayoutParams(paramView2);
      paramView2 = (RelativeLayout.LayoutParams)this.rGD.rns.getLayoutParams();
      paramView2.leftMargin = com.tencent.mm.bz.a.al(this.context, 2131427796);
      paramView2.rightMargin = com.tencent.mm.bz.a.al(this.context, 2131427796);
      paramView2.topMargin = com.tencent.mm.bz.a.fromDPToPix(this.context, 10);
      paramView2.bottomMargin = com.tencent.mm.bz.a.al(this.context, 2131427796);
      this.rGD.rns.setLayoutParams(paramView2);
      this.rGM = paramView1.findViewById(2131827874);
      paramView2 = (RelativeLayout.LayoutParams)this.rGM.getLayoutParams();
      paramView2.leftMargin = com.tencent.mm.bz.a.fromDPToPix(this.context, 10);
      paramView2.rightMargin = com.tencent.mm.bz.a.fromDPToPix(this.context, 10);
      paramView2.topMargin = com.tencent.mm.bz.a.fromDPToPix(this.context, 10);
      this.rGM.setLayoutParams(paramView2);
      this.rGL = ((SnsCardAdTagListView)this.contentView.findViewById(2131827610));
      this.rGL.setActivityContext((Activity)this.context);
      this.rGL.removeAllViews();
      if (this.ros.cqo().qUW.size() > 0)
      {
        this.rGL.setVisibility(0);
        this.rGL.setTagSpace(com.tencent.mm.bz.a.fromDPToPix(this.context, 6));
        this.rGL.dB(this.ros.cqo().qUW);
      }
      if (!bo.isNullOrNil(this.ros.cqo().qUU))
      {
        this.rGM.setVisibility(0);
        this.rGM.findViewById(2131827876).setVisibility(0);
        ((TextView)this.rGM.findViewById(2131827876)).setText(this.ros.cqo().qUU);
      }
      if (!bo.isNullOrNil(this.ros.cqo().qUV))
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(this.ros.cqo().qUV, new f.a()
        {
          public final void YJ(String paramAnonymousString)
          {
            AppMethodBeat.i(40090);
            if (!bo.isNullOrNil(paramAnonymousString))
            {
              Bitmap localBitmap = d.decodeFile(paramAnonymousString, null);
              if (localBitmap != null)
              {
                b.this.rGM.setVisibility(0);
                paramAnonymousString = (ImageView)b.this.rGM.findViewById(2131827875);
                paramAnonymousString.setImageBitmap(localBitmap);
                paramAnonymousString.setVisibility(0);
              }
            }
            AppMethodBeat.o(40090);
          }

          public final void cmD()
          {
          }

          public final void cpu()
          {
          }
        });
      this.jMO.c(paramView1, this.rqo.rJZ, this.rqo.rJH);
      this.rGK.setVisibility(8);
      this.rGK.setScaleType(QImageView.a.zNT);
      this.rGD.rns.setVisibility(8);
      ((SightPlayImageView)this.rGD.qzM).qyI = true;
      ((SightPlayImageView)this.rGD.qzM).setScaleType(QImageView.a.zNT);
      paramView1.setBackgroundResource(2130840250);
      paramView1.setOnClickListener(this.rqo.rKn);
      AppMethodBeat.o(40091);
      return;
      this.rGE.setVisibility(8);
      break;
      label1328: paramView2 = this.ros.cqo().qUT;
      break label490;
      label1342: this.rGF.setVisibility(8);
      break label541;
      label1354: this.rGG.setVisibility(8);
    }
  }

  public final void refreshView()
  {
    AppMethodBeat.i(40092);
    this.ros = com.tencent.mm.plugin.sns.storage.h.YS(this.ros.cqA());
    ab.i("MicroMsg.CardAdDetailItemView", "refreshView");
    G(this.ros);
    this.rGD.raQ.setVisibility(8);
    Object localObject1 = af.cnC();
    Object localObject2;
    int i;
    int j;
    if ((this.timeLineObject.xfI != null) && (this.timeLineObject.xfI.wbK.size() > 0))
    {
      localObject2 = (bau)this.timeLineObject.xfI.wbK.get(0);
      i = ((WindowManager)this.context.getSystemService("window")).getDefaultDisplay().getWidth();
      if (localObject2 == null)
        break label1460;
      j = i - com.tencent.mm.bz.a.fromDPToPix(this.context, 50) - this.context.getResources().getDimensionPixelSize(2131427812) - this.context.getResources().getDimensionPixelSize(2131427812) - this.context.getResources().getDimensionPixelSize(2131427858) - this.context.getResources().getDimensionPixelSize(2131427796) - this.context.getResources().getDimensionPixelSize(2131427796);
      i = (int)(j * ((bau)localObject2).wEK.wFy / ((bau)localObject2).wEK.wFx);
      if (this.timeLineObject.xfI.wbJ != 1)
        break label381;
      localObject1 = this.rGK.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = j;
      ((ViewGroup.LayoutParams)localObject1).height = i;
      this.rGK.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      af.cnC().b((bau)localObject2, this.rGK, -1, this.context.hashCode(), az.xYT);
      this.rGK.setVisibility(0);
      this.rGK.setTag(this);
      this.contentView.setTag(this);
      this.rGH.setTag(this);
      this.rGI.setTag(this);
      this.rGK.setOnClickListener(this.rqo.rjy);
      this.jMO.c(this.rGK, this.rqo.rJZ, this.rqo.rJH);
      AppMethodBeat.o(40092);
    }
    while (true)
    {
      return;
      localObject2 = null;
      break;
      label381: if ((this.timeLineObject.xfI.wbJ == 5) || (this.timeLineObject.xfI.wbJ == 15))
      {
        this.rGD.rns.setVisibility(0);
        this.jMO.c(this.rGD.rnt, this.rqo.rJZ, this.rqo.rJH);
        Object localObject3 = this.rGD.rns.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject3).width = j;
        ((ViewGroup.LayoutParams)localObject3).height = i;
        this.rGD.rns.setLayoutParams((ViewGroup.LayoutParams)localObject3);
        this.rGD.qzM.fi(j, i);
        this.rGD.qzM.setOnCompletionListener(new b.e()
        {
          public final void c(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
          {
            AppMethodBeat.i(40088);
            if ((paramAnonymousInt != -1) && (b.this.rqn != null))
              b.this.rqn.u(b.this.ros.field_snsId, false);
            AppMethodBeat.o(40088);
          }
        });
        if ((this.rqn != null) && (!this.rqn.jO(this.ros.field_snsId)))
          this.rGD.qzM.setOnDecodeDurationListener(new b.2(this));
        long l = System.nanoTime();
        boolean bool = com.tencent.mm.plugin.sns.model.g.t((bau)localObject2);
        ab.i("MicroMsg.CardAdDetailItemView", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.nanoTime() - l) });
        localObject3 = this.rGD;
        this.rGD.cwT = this.ros.cqU();
        if (!bool)
          if (((com.tencent.mm.plugin.sns.model.g)localObject1).w((bau)localObject2))
          {
            ((aj)localObject3).raP.setVisibility(8);
            ((aj)localObject3).rnu.setVisibility(0);
            ((aj)localObject3).rnu.dKB();
            this.rGD.rns.setVisibility(0);
            ((aj)localObject3).qzM.setTagObject(localObject3);
            ((aj)localObject3).rnt.setTag(this);
            this.contentView.setTag(this);
            this.rGH.setTag(this);
            this.rGI.setTag(this);
            ((com.tencent.mm.plugin.sns.model.g)localObject1).a(this.ros, (bau)localObject2, ((aj)localObject3).qzM, this.context.hashCode(), 0, az.xYT, true, true);
            if (this.rqn != null)
            {
              localObject1 = an.fZ(af.getAccSnsPath(), ((bau)localObject2).Id);
              localObject2 = i.j((bau)localObject2);
              if (!e.ct((String)localObject1 + (String)localObject2))
                break label1366;
              this.rqn.v(this.ros.field_snsId, true);
              if (af.cnC().b(this.ros, null) != 5)
                break label1384;
            }
          }
        for (bool = true; ; bool = false)
        {
          this.rqn.c(this.ros.field_snsId, bool, false);
          AppMethodBeat.o(40092);
          break;
          if (((com.tencent.mm.plugin.sns.model.g)localObject1).b(this.ros, null) == 5)
          {
            ((com.tencent.mm.plugin.sns.model.g)localObject1).A((bau)localObject2);
            ((aj)localObject3).raP.setVisibility(8);
            ((aj)localObject3).rnu.setVisibility(0);
            ((aj)localObject3).rnu.dKB();
            break label669;
          }
          if (((com.tencent.mm.plugin.sns.model.g)localObject1).x((bau)localObject2))
          {
            ((aj)localObject3).rnu.setVisibility(8);
            ((aj)localObject3).raP.setImageResource(2130840197);
            ((aj)localObject3).raP.setVisibility(0);
            break label669;
          }
          ((com.tencent.mm.plugin.sns.model.g)localObject1).y((bau)localObject2);
          ((aj)localObject3).raP.setVisibility(0);
          ((aj)localObject3).rnu.setVisibility(8);
          ((aj)localObject3).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
          ((aj)localObject3).raP.setContentDescription(this.context.getResources().getString(2131301953));
          if (((com.tencent.mm.plugin.sns.model.g)localObject1).b(this.ros, null) != 4)
            break label669;
          ((aj)localObject3).raQ.setVisibility(0);
          break label669;
          if (((com.tencent.mm.plugin.sns.model.g)localObject1).u((bau)localObject2))
          {
            ((aj)localObject3).raP.setVisibility(0);
            ((aj)localObject3).rnu.setVisibility(8);
            ((aj)localObject3).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
            ((aj)localObject3).raP.setContentDescription(this.context.getResources().getString(2131301953));
          }
          while (true)
          {
            if (!((aj)localObject3).qzM.ckY())
              break label1364;
            ab.d("MicroMsg.CardAdDetailItemView", "play video error " + ((bau)localObject2).Id + " " + ((bau)localObject2).Url + " " + ((bau)localObject2).wEH);
            ((com.tencent.mm.plugin.sns.model.g)localObject1).y((bau)localObject2);
            ((aj)localObject3).raP.setVisibility(0);
            ((aj)localObject3).rnu.setVisibility(8);
            ((aj)localObject3).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
            ((aj)localObject3).raP.setContentDescription(this.context.getResources().getString(2131301953));
            break;
            if (((com.tencent.mm.plugin.sns.model.g)localObject1).v((bau)localObject2))
            {
              ((aj)localObject3).raP.setVisibility(8);
              ((aj)localObject3).rnu.setVisibility(8);
            }
            else if (((com.tencent.mm.plugin.sns.model.g)localObject1).b(this.ros, null) <= 5)
            {
              ((aj)localObject3).raP.setVisibility(8);
              ((aj)localObject3).rnu.setVisibility(8);
            }
            else
            {
              ((com.tencent.mm.plugin.sns.model.g)localObject1).y((bau)localObject2);
              ((aj)localObject3).raP.setVisibility(0);
              ((aj)localObject3).rnu.setVisibility(8);
              ((aj)localObject3).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
              ((aj)localObject3).raP.setContentDescription(this.context.getResources().getString(2131301953));
            }
          }
          break label669;
          this.rqn.v(this.ros.field_snsId, false);
          break label815;
        }
      }
      label669: label815: label1364: label1366: label1384: ((com.tencent.mm.plugin.sns.model.g)localObject1).a(this.rGD.qzM, this.context.hashCode());
      this.rGD.rnv.setVisibility(8);
      this.rGD.qzM.setOnSightCompletionAction(null);
      this.rGD.qzM.setOnCompletionListener(null);
      this.rGD.qzM.setOnDecodeDurationListener(null);
      label1460: AppMethodBeat.o(40092);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.b
 * JD-Core Version:    0.6.2
 */