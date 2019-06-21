package com.tencent.mm.ui.chatting.gallery;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.WxImageView;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;

public final class k
{
  String cEV;
  long createTime;
  String fileId;
  public int mPosition;
  public View mRR;
  public TextView mlK;
  int rbG;
  public c yUe;
  public ImageView yXA;
  public MultiTouchImageView yXB;
  public WxImageView yXC;
  public MultiTouchImageView yXD;
  public boolean yXE;
  int yXF;
  int yXG;
  public c.b yXe;
  public HashMap<String, Boolean> yXf;
  public RelativeLayout yXg;
  public e yXh;
  public ImageView yXi;
  public ImageView yXj;
  public MMPinProgressBtn yXk;
  public View yXl;
  public RelativeLayout yXm;
  public ImageView yXn;
  public ImageView yXo;
  public e yXp;
  public MMPinProgressBtn yXq;
  public TextView yXr;
  public LinearLayout yXs;
  public TextView yXt;
  public TextView yXu;
  public ImageView yXv;
  public ProgressBar yXw;
  public ProgressBar yXx;
  public LinearLayout yXy;
  public TextView yXz;

  @TargetApi(11)
  public k(c paramc, View paramView)
  {
    AppMethodBeat.i(32392);
    this.yXf = new HashMap();
    this.rbG = 0;
    this.yXF = 0;
    this.yXG = 0;
    this.cEV = "";
    this.mRR = paramView;
    this.yUe = paramc;
    this.yXB = ((MultiTouchImageView)paramView.findViewById(2131820629));
    this.yXC = ((WxImageView)paramView.findViewById(2131824980));
    this.yXD = ((MultiTouchImageView)paramView.findViewById(2131824981));
    this.yXx = ((ProgressBar)paramView.findViewById(2131824984));
    if (this.yXC != null)
      this.yXC.setForceTileFlag(com.tencent.mm.graphics.a.c.eCx);
    if ((com.tencent.mm.compatible.util.d.iW(11)) && (paramView.getLayerType() != 2))
      paramView.setLayerType(2, null);
    AppMethodBeat.o(32392);
  }

  public static void am(View paramView, int paramInt)
  {
    AppMethodBeat.i(32393);
    if (paramView != null)
      paramView.setVisibility(paramInt);
    AppMethodBeat.o(32393);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, long paramLong)
  {
    this.rbG = paramInt1;
    this.yXF = paramInt2;
    this.yXG = paramInt3;
    this.cEV = paramString1;
    this.fileId = paramString2;
    this.createTime = paramLong;
  }

  public final void a(boolean paramBoolean, float paramFloat)
  {
    AppMethodBeat.i(32398);
    ab.i("MicroMsg.ImageGalleryViewHolder", "%d switch video model isVideoPlay[%b] alpha[%f]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat) });
    if (paramBoolean)
    {
      View localView = (View)dGH().yXp;
      localView.setAlpha(paramFloat);
      am(localView, 0);
      if (paramFloat >= 1.0D)
      {
        am(dGH().yXn, 8);
        am(dGH().yXo, 8);
      }
      AppMethodBeat.o(32398);
    }
    while (true)
    {
      return;
      am((View)dGH().yXp, 8);
      am(dGH().yXn, 0);
      am(dGH().yXo, 0);
      AppMethodBeat.o(32398);
    }
  }

  public final k dGE()
  {
    AppMethodBeat.i(32394);
    if (this.yXs == null)
    {
      this.yXs = ((LinearLayout)((ViewStub)this.mRR.findViewById(2131824982)).inflate());
      this.yXw = ((ProgressBar)this.yXs.findViewById(2131822617));
      this.yXt = ((TextView)this.yXs.findViewById(2131823911));
      this.yXu = ((TextView)this.yXs.findViewById(2131824986));
      this.yXv = ((ImageView)this.yXs.findViewById(2131824985));
    }
    AppMethodBeat.o(32394);
    return this;
  }

  public final k dGF()
  {
    AppMethodBeat.i(32395);
    if (this.yXy == null)
    {
      this.yXy = ((LinearLayout)((ViewStub)this.mRR.findViewById(2131824983)).inflate());
      this.yXA = ((ImageView)this.yXy.findViewById(2131824987));
      this.yXz = ((TextView)this.yXy.findViewById(2131823352));
    }
    AppMethodBeat.o(32395);
    return this;
  }

  public final k dGG()
  {
    AppMethodBeat.i(32396);
    if (this.yXg == null)
    {
      this.yXg = ((RelativeLayout)((ViewStub)this.mRR.findViewById(2131824979)).inflate());
      this.yXh = q.fT(this.mRR.getContext());
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(13);
      this.yXg.addView((View)this.yXh, localLayoutParams);
      ((View)this.yXh).setVisibility(8);
      this.yXl = this.yXg.findViewById(2131823800);
      this.yXl.setVisibility(8);
      this.mlK = ((TextView)this.yXg.findViewById(2131827573));
      this.yXk = ((MMPinProgressBtn)this.yXg.findViewById(2131827547));
      this.yXk.setVisibility(8);
      this.yXi = ((ImageView)this.yXg.findViewById(2131827546));
      this.yXj = ((ImageView)this.yXg.findViewById(2131827548));
      this.yXh.setVideoCallback(new k.1(this));
      this.mlK.setOnClickListener(new k.2(this));
    }
    AppMethodBeat.o(32396);
    return this;
  }

  public final k dGH()
  {
    AppMethodBeat.i(32397);
    if (this.yXm == null)
    {
      if (this.yXC != null)
        this.yXC.setVisibility(8);
      if (this.yXB != null)
        this.yXB.setVisibility(8);
      this.yXm = ((RelativeLayout)((ViewStub)this.mRR.findViewById(2131822134)).inflate());
      this.yXn = ((ImageView)this.yXm.findViewById(2131824989));
      this.yXo = ((ImageView)this.yXm.findViewById(2131824990));
      this.yXo.setOnClickListener(new k.3(this));
      com.tencent.mm.modelcontrol.d.afF();
      if (!com.tencent.mm.modelcontrol.d.afO())
        break label275;
      this.yXp = new VideoPlayerTextureView(this.mRR.getContext());
      h.pYm.a(354L, 150L, 1L, false);
    }
    while (true)
    {
      this.yXr = ((TextView)this.mRR.findViewById(2131824978));
      this.yXp.setPlayProgressCallback(true);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      this.yXm.addView((View)this.yXp, 2, localLayoutParams);
      this.yXq = ((MMPinProgressBtn)this.yXm.findViewById(2131824991));
      this.yXq.setVisibility(8);
      ((View)this.yXp).setVisibility(8);
      this.yXp.setVideoCallback(new k.4(this));
      AppMethodBeat.o(32397);
      return this;
      label275: this.yXp = new VideoTextureView(this.mRR.getContext());
      h.pYm.a(354L, 151L, 1L, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.k
 * JD-Core Version:    0.6.2
 */