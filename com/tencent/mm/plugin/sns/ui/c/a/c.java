package com.tencent.mm.plugin.sns.ui.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.b.c;
import com.tencent.mm.plugin.sns.storage.b.c.a;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.QImageView.a;
import com.tencent.mm.ui.widget.RoundedCornerRelativeLayout;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

public final class c extends a
{
  Context context;
  public View rGQ;
  public View rGR;
  private TextView rGS;
  private TextView rGT;
  private TextView rGU;
  private TextView rGV;
  public View rGW;
  public MaskImageView rGX;
  SnsDrawGestureView rGY;
  b.c rGZ;
  com.tencent.mm.plugin.sns.a.b.g rqn;

  public c(TimeLineObject paramTimeLineObject, n paramn, com.tencent.mm.plugin.sns.ui.d.b paramb, com.tencent.mm.plugin.sns.a.b.g paramg)
  {
    this.timeLineObject = paramTimeLineObject;
    this.ros = paramn;
    this.rqo = paramb;
    this.rqn = paramg;
  }

  public final void g(View paramView1, View paramView2)
  {
    AppMethodBeat.i(40102);
    this.contentView = paramView1;
    this.rpP = paramView2;
    this.context = paramView1.getContext();
    this.rGQ = paramView1.findViewById(2131827880);
    this.rGR = paramView1.findViewById(2131827883);
    this.rGS = ((TextView)paramView1.findViewById(2131827881));
    this.rGT = ((TextView)paramView1.findViewById(2131827882));
    this.rGU = ((TextView)paramView1.findViewById(2131827884));
    this.rGV = ((TextView)paramView1.findViewById(2131827885));
    this.rGW = paramView1.findViewById(2131827886);
    this.rGX = ((MaskImageView)paramView1.findViewById(2131827878));
    this.rGY = ((SnsDrawGestureView)paramView1.findViewById(2131827887));
    this.rGX.setScaleType(QImageView.a.zNT);
    this.rGD = new aj();
    this.rGD.rnt = paramView1.findViewById(2131827879);
    this.rGD.rns = this.rGD.rnt;
    this.rGD.rnt.setOnClickListener(this.rqo.rKe);
    this.rGD.qzM = ((com.tencent.mm.plugin.sight.decode.a.a)this.rGD.rnt.findViewById(2131820629));
    this.rGD.raP = ((ImageView)this.rGD.rnt.findViewById(2131820981));
    this.rGD.rnu = ((MMPinProgressBtn)this.rGD.rnt.findViewById(2131821370));
    this.rGD.rnv = ((TextView)this.rGD.rnt.findViewById(2131827571));
    this.rGD.raQ = ((TextView)this.rGD.rnt.findViewById(2131827572));
    ((SightPlayImageView)this.rGD.qzM).qyI = true;
    ((SightPlayImageView)this.rGD.qzM).setScaleType(QImageView.a.zNT);
    AppMethodBeat.o(40102);
  }

  public final void refreshView()
  {
    AppMethodBeat.i(40103);
    this.ros = h.YS(this.ros.cqA());
    this.rGZ = null;
    if ((this.ros != null) && (this.ros.cqo() != null))
      this.rGZ = this.ros.cqo().qUY;
    Object localObject1 = null;
    Object localObject2 = (WindowManager)this.context.getSystemService("window");
    int i = Math.min(((WindowManager)localObject2).getDefaultDisplay().getWidth(), ((WindowManager)localObject2).getDefaultDisplay().getHeight());
    this.rGQ.setVisibility(8);
    this.rGS.setVisibility(8);
    this.rGT.setVisibility(8);
    this.rGR.setVisibility(8);
    this.rGU.setVisibility(8);
    this.rGV.setVisibility(8);
    this.rGW.setVisibility(8);
    if (this.rGZ != null)
    {
      i = i - com.tencent.mm.bz.a.al(this.context, 2131428663) - com.tencent.mm.bz.a.al(this.context, 2131427865) - this.context.getResources().getDimensionPixelSize(2131427812) - this.context.getResources().getDimensionPixelSize(2131427812) - this.context.getResources().getDimensionPixelSize(2131427858);
      if (this.rGZ.qVk == 0)
      {
        localObject1 = new ViewGroup.LayoutParams(-2, -2);
        ((ViewGroup.LayoutParams)localObject1).width = i;
        ((ViewGroup.LayoutParams)localObject1).height = ((int)(((ViewGroup.LayoutParams)localObject1).width * 0.75F));
      }
    }
    label642: label780: label1676: label1714: label2360: 
    while (true)
    {
      if (localObject1 != null)
      {
        localObject2 = this.contentView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject2).width = ((ViewGroup.LayoutParams)localObject1).width;
        ((ViewGroup.LayoutParams)localObject2).height = ((ViewGroup.LayoutParams)localObject1).height;
        this.contentView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        ((RoundedCornerRelativeLayout)this.contentView).setRadius(8.0F);
        localObject2 = this.rGX.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject2).width = ((ViewGroup.LayoutParams)localObject1).width;
        ((ViewGroup.LayoutParams)localObject2).height = ((ViewGroup.LayoutParams)localObject1).height;
        this.rGX.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localObject2 = this.rGD.rns.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject2).width = ((ViewGroup.LayoutParams)localObject1).width;
        ((ViewGroup.LayoutParams)localObject2).height = ((ViewGroup.LayoutParams)localObject1).height;
        this.rGD.rns.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        this.rGD.qzM.fi(((ViewGroup.LayoutParams)localObject1).width, ((ViewGroup.LayoutParams)localObject1).height);
      }
      int j;
      label736: final long l1;
      Object localObject3;
      Object localObject4;
      if (this.rGZ.qVm == 0)
      {
        j = Color.argb((int)(this.rGZ.qVl * 2.55F), 0, 0, 0);
        i = Color.argb(0, 0, 0, 0);
        localObject1 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] { j, i });
        ((GradientDrawable)localObject1).setGradientType(0);
        this.rGQ.setBackground((Drawable)localObject1);
        if ((!bo.isNullOrNil(this.rGZ.title)) || (!bo.isNullOrNil(this.rGZ.description)))
          this.rGQ.setVisibility(0);
        this.rGR.setVisibility(8);
        if (!bo.isNullOrNil(this.rGZ.title))
        {
          this.rGS.setVisibility(0);
          localObject1 = this.rGS;
          localObject2 = com.tencent.mm.cb.g.dqQ();
          this.rGS.getContext();
          ((TextView)localObject1).setText(((com.tencent.mm.cb.g)localObject2).b(this.rGZ.title, this.rGS.getTextSize()));
        }
        if (!bo.isNullOrNil(this.rGZ.description))
        {
          this.rGT.setVisibility(0);
          localObject2 = this.rGT;
          localObject1 = com.tencent.mm.cb.g.dqQ();
          this.rGT.getContext();
          ((TextView)localObject2).setText(((com.tencent.mm.cb.g)localObject1).b(this.rGZ.description, this.rGT.getTextSize()));
        }
        if (this.ros.cqq().coI())
        {
          i = Color.argb((int)(this.rGZ.qVl * 2.55F), 0, 0, 0);
          j = Color.argb(0, 0, 0, 0);
          localObject1 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[] { i, j });
          ((GradientDrawable)localObject1).setGradientType(0);
          this.rGR.setVisibility(0);
          this.rGR.setBackground((Drawable)localObject1);
          this.rGW.setVisibility(0);
        }
        if ((this.timeLineObject.xfI == null) || (this.timeLineObject.xfI.wbK.size() <= 0))
          break label1247;
        localObject1 = (bau)this.timeLineObject.xfI.wbK.get(0);
        this.rGD.a(this.timeLineObject, 0, this.ros.cqU(), true);
        this.rGD.raQ.setVisibility(8);
        localObject2 = af.cnC();
        if (localObject1 == null)
          break label2284;
        l1 = this.ros.field_snsId;
        if (this.timeLineObject.xfI.wbJ != 1)
          break label1252;
        this.rGX.setVisibility(0);
        this.rGX.setTag(this);
        this.rGX.setOnClickListener(this.rqo.rKn);
        localObject3 = this.rGX;
        i = this.context.hashCode();
        localObject4 = az.dtg();
        ((az)localObject4).oyB = this.timeLineObject.pcX;
        ((com.tencent.mm.plugin.sns.model.g)localObject2).a((bau)localObject1, (View)localObject3, -1, i, (az)localObject4, 3);
        AppMethodBeat.o(40103);
      }
      while (true)
      {
        return;
        if (this.rGZ.qVk != 1)
          break label2360;
        localObject1 = new ViewGroup.LayoutParams(-2, -2);
        ((ViewGroup.LayoutParams)localObject1).width = i;
        ((ViewGroup.LayoutParams)localObject1).height = ((ViewGroup.LayoutParams)localObject1).width;
        break;
        if (this.rGZ.qVm != 1)
          break label642;
        i = Color.argb((int)(this.rGZ.qVl * 2.55F), 0, 0, 0);
        j = Color.argb(0, 0, 0, 0);
        localObject1 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[] { i, j });
        ((GradientDrawable)localObject1).setGradientType(0);
        this.rGQ.setVisibility(8);
        this.rGR.setBackground((Drawable)localObject1);
        if ((!bo.isNullOrNil(this.rGZ.title)) || (!bo.isNullOrNil(this.rGZ.description)))
        {
          this.rGR.setVisibility(0);
          localObject1 = (RelativeLayout.LayoutParams)this.rGW.getLayoutParams();
          ((RelativeLayout.LayoutParams)localObject1).topMargin = com.tencent.mm.bz.a.fromDPToPix(this.context, 4);
          this.rGW.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
        if (!bo.isNullOrNil(this.rGZ.title))
        {
          this.rGU.setVisibility(0);
          localObject2 = this.rGU;
          localObject1 = com.tencent.mm.cb.g.dqQ();
          this.rGU.getContext();
          ((TextView)localObject2).setText(((com.tencent.mm.cb.g)localObject1).b(this.rGZ.title, this.rGU.getTextSize()));
        }
        if (bo.isNullOrNil(this.rGZ.description))
          break label642;
        this.rGV.setVisibility(0);
        localObject1 = this.rGV;
        localObject2 = com.tencent.mm.cb.g.dqQ();
        this.rGV.getContext();
        ((TextView)localObject1).setText(((com.tencent.mm.cb.g)localObject2).b(this.rGZ.description, this.rGV.getTextSize()));
        break label642;
        ab.e("MicroMsg.FullCardAdDetailItem", "invalid full card");
        break label736;
        label1247: localObject1 = null;
        break label780;
        label1252: if ((this.timeLineObject.xfI.wbJ == 15) || (this.timeLineObject.xfI.wbJ == 5))
        {
          long l2 = System.nanoTime();
          bool = com.tencent.mm.plugin.sns.model.g.t((bau)localObject1);
          ab.i("MicroMsg.FullCardAdDetailItem", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.nanoTime() - l2) });
          this.rGD.qzM.setOnCompletionListener(new b.e()
          {
            public final void c(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
            {
              AppMethodBeat.i(40094);
              if (paramAnonymousInt != -1)
                c.this.rqn.u(l1, false);
              AppMethodBeat.o(40094);
            }
          });
          if ((this.rqn != null) && (!this.rqn.jO(l1)))
            this.rGD.qzM.setOnDecodeDurationListener(new c.2(this, l1));
          localObject4 = this.rGZ.qVn;
          localObject3 = this.ros.cqo().coW();
          if ((!bo.isNullOrNil((String)localObject3)) && (localObject4 != null) && (((b.c.a)localObject4).startTime >= 0L) && (((b.c.a)localObject4).endTime > ((b.c.a)localObject4).startTime))
            d.post(new c.3(this, (String)localObject3), "preDownloadFloatPage");
          if (bool)
            break label1910;
          if (!((com.tencent.mm.plugin.sns.model.g)localObject2).w((bau)localObject1))
            break label1714;
          this.rGD.raP.setVisibility(8);
          this.rGD.rnu.setVisibility(0);
          this.rGD.rnu.dKB();
          label1508: this.rGD.rns.setVisibility(0);
          this.rGD.qzM.setTagObject(this.rGD);
          this.rGD.rnt.setTag(this);
          this.rGD.rns.setOnClickListener(this.rqo.rKn);
          n localn = this.ros;
          localObject3 = this.rGD.qzM;
          i = this.context.hashCode();
          localObject4 = az.dtg();
          ((az)localObject4).oyB = this.timeLineObject.pcX;
          ((com.tencent.mm.plugin.sns.model.g)localObject2).a(localn, (bau)localObject1, (com.tencent.mm.plugin.sight.decode.a.a)localObject3, i, 0, (az)localObject4, true, true);
          localObject2 = an.fZ(af.getAccSnsPath(), ((bau)localObject1).Id);
          localObject1 = i.j((bau)localObject1);
          if (this.rqn != null)
          {
            if (!e.ct((String)localObject2 + (String)localObject1))
              break label2265;
            this.rqn.v(l1, true);
            if (af.cnC().b(this.ros, null) != 5)
              break label2278;
          }
        }
        label2263: label2265: label2278: for (boolean bool = true; ; bool = false)
        {
          this.rqn.c(l1, bool, false);
          AppMethodBeat.o(40103);
          break;
          if (((com.tencent.mm.plugin.sns.model.g)localObject2).b(this.ros, null) == 5)
          {
            ((com.tencent.mm.plugin.sns.model.g)localObject2).A((bau)localObject1);
            this.rGD.raP.setVisibility(8);
            this.rGD.rnu.setVisibility(0);
            this.rGD.rnu.dKB();
            break label1508;
          }
          if (((com.tencent.mm.plugin.sns.model.g)localObject2).x((bau)localObject1))
          {
            this.rGD.rnu.setVisibility(8);
            this.rGD.raP.setImageResource(2130840197);
            this.rGD.raP.setVisibility(0);
            break label1508;
          }
          ((com.tencent.mm.plugin.sns.model.g)localObject2).y((bau)localObject1);
          this.rGD.raP.setVisibility(0);
          this.rGD.rnu.setVisibility(8);
          this.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
          this.rGD.raP.setContentDescription(this.context.getString(2131301953));
          if (((com.tencent.mm.plugin.sns.model.g)localObject2).b(this.ros, null) != 4)
            break label1508;
          this.rGD.raQ.setVisibility(0);
          break label1508;
          label1910: if (((com.tencent.mm.plugin.sns.model.g)localObject2).u((bau)localObject1))
          {
            this.rGD.raP.setVisibility(0);
            this.rGD.rnu.setVisibility(8);
            this.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
            this.rGD.raP.setContentDescription(this.context.getString(2131301953));
          }
          while (true)
          {
            if (!this.rGD.qzM.ckY())
              break label2263;
            ab.d("MicroMsg.FullCardAdDetailItem", "play video error " + ((bau)localObject1).Id + " " + ((bau)localObject1).Url + " " + ((bau)localObject1).wEH);
            ((com.tencent.mm.plugin.sns.model.g)localObject2).y((bau)localObject1);
            this.rGD.raP.setVisibility(0);
            this.rGD.rnu.setVisibility(8);
            this.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
            this.rGD.raP.setContentDescription(this.context.getString(2131301953));
            break;
            if (((com.tencent.mm.plugin.sns.model.g)localObject2).v((bau)localObject1))
            {
              this.rGD.raP.setVisibility(8);
              this.rGD.rnu.setVisibility(8);
            }
            else if (((com.tencent.mm.plugin.sns.model.g)localObject2).b(this.ros, null) <= 5)
            {
              this.rGD.raP.setVisibility(8);
              this.rGD.rnu.setVisibility(8);
            }
            else
            {
              ((com.tencent.mm.plugin.sns.model.g)localObject2).y((bau)localObject1);
              this.rGD.raP.setVisibility(0);
              this.rGD.rnu.setVisibility(8);
              this.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
              this.rGD.raP.setContentDescription(this.context.getString(2131301953));
            }
          }
          break label1508;
          this.rqn.v(l1, false);
          break label1676;
        }
        label2284: ((com.tencent.mm.plugin.sns.model.g)localObject2).a(this.rGD.qzM, this.context.hashCode());
        this.rGD.rnv.setVisibility(8);
        this.rGD.qzM.setOnSightCompletionAction(null);
        this.rGD.qzM.setOnCompletionListener(null);
        this.rGD.qzM.setOnDecodeDurationListener(null);
        AppMethodBeat.o(40103);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.c
 * JD-Core Version:    0.6.2
 */