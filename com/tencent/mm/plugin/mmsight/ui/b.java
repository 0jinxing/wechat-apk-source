package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.s;
import com.tencent.mm.api.s.a.a;
import com.tencent.mm.api.s.b;
import com.tencent.mm.api.s.c;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.a.a.b;
import com.tencent.mm.plugin.mmsight.d;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;

public final class b
{
  private static int ehv;
  private static final Object oBK;
  private MMActivity crP;
  String cvZ;
  private com.tencent.mm.ui.base.p eir;
  private boolean oBA = false;
  private int oBB = -1;
  public int oBC = -1;
  public int oBD = -1;
  private ap oBE;
  private ViewGroup oBF;
  private s oBG;
  private com.tencent.mm.api.c oBH;
  private com.tencent.mm.plugin.mmsight.api.a oBI;
  private com.tencent.mm.media.g.c oBJ;
  public b.a oBL;
  private boolean oBM = false;
  public boolean oBN = false;
  private boolean oBO = false;
  private boolean oBP = false;
  public String oBQ = null;
  public int oBR = -1;
  private a.b oBS;
  public boolean oBT = false;
  public boolean oBU = true;
  private RecyclerThumbSeekBar oBz;
  private VideoTransPara ouc;
  private VideoPlayerTextureView oxL;
  private VideoSeekBarEditorView oxM;
  public int scene;
  private String videoPath;

  static
  {
    AppMethodBeat.i(55175);
    oBK = new Object();
    AppMethodBeat.o(55175);
  }

  private void bQv()
  {
    AppMethodBeat.i(55163);
    this.oBG = s.ccQ.Ae();
    s locals = this.oBG;
    Object localObject = new s.a.a();
    ((s.a.a)localObject).ccS = false;
    ((s.a.a)localObject).ccU = true;
    ((s.a.a)localObject).ccR = s.c.ccW;
    ((s.a.a)localObject).ccV = new Rect(this.oxL.getLeft(), this.oxL.getTop(), this.oxL.getRight(), this.oxL.getBottom());
    locals.a(((s.a.a)localObject).AB());
    this.oBH = this.oBG.aQ(this.oBF.getContext());
    this.oBH.setActionBarCallback(new b.1(this));
    localObject = new ViewGroup.MarginLayoutParams(-1, -1);
    if (ak.hw(this.crP))
      ((ViewGroup.MarginLayoutParams)localObject).height = (d.bPg().y - Math.max(ak.fr(this.crP), ak.hx(this.crP)));
    this.oBF.addView(this.oBH, (ViewGroup.LayoutParams)localObject);
    this.oBH.setSelectedFeatureListener(new b.6(this));
    this.oxM.setCancelButtonClickListener(new b.7(this));
    this.oxM.setFinishButtonClickListener(new b.8(this));
    if (this.oBO)
    {
      this.oxM.setVisibility(0);
      this.oxM.bringToFront();
      this.oxM.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(55154);
          b.u(b.this).setFooterVisible(false);
          b.u(b.this).setActionBarVisible(false);
          b.u(b.this).setActivated(false);
          b.i(b.this);
          AppMethodBeat.o(55154);
        }
      });
    }
    AppMethodBeat.o(55163);
  }

  private void bQw()
  {
    AppMethodBeat.i(55164);
    this.oxL.animate().scaleX(1.0F).scaleY(1.0F).translationY(0.0F).setDuration(300L);
    this.oxM.animate().alpha(0.0F).setDuration(100L).setListener(new b.3(this));
    this.oBH.setFooterVisible(true);
    this.oBH.setAutoShowFooterAndBar(true);
    this.oBH.setActionBarVisible(true);
    this.oBH.animate().scaleX(1.0F).scaleY(1.0F).translationY(0.0F).setDuration(300L);
    this.oBP = false;
    AppMethodBeat.o(55164);
  }

  private void bQx()
  {
    AppMethodBeat.i(55165);
    al.d(new b.5(this));
    AppMethodBeat.o(55165);
  }

  public final void a(MMActivity paramMMActivity, int paramInt, String paramString, VideoSeekBarEditorView paramVideoSeekBarEditorView, VideoPlayerTextureView paramVideoPlayerTextureView, ViewGroup paramViewGroup, VideoTransPara paramVideoTransPara, boolean paramBoolean)
  {
    AppMethodBeat.i(55162);
    this.ouc = paramVideoTransPara;
    if (this.ouc != null)
      if (this.ouc.duration > 0);
    for (this.ouc.duration = 10000; ; this.ouc.duration = 10000)
    {
      this.scene = paramInt;
      this.videoPath = paramString;
      this.oxM = paramVideoSeekBarEditorView;
      this.oxL = paramVideoPlayerTextureView;
      this.oBF = paramViewGroup;
      this.crP = paramMMActivity;
      this.oBO = paramBoolean;
      this.oBS = new a.b(paramInt);
      this.oBz = paramVideoSeekBarEditorView.oDA;
      this.oBz.setVideoTransPara(this.ouc);
      bQv();
      AppMethodBeat.o(55162);
      return;
      ab.e("MicroMsg.MMSightVideoEditor", "video trans para is null!!!");
      this.ouc = new VideoTransPara();
    }
  }

  public final void n(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(55167);
    try
    {
      this.oBS.eVT = paramBoolean;
      if (this.oBG == null)
      {
        ab.e("MicroMsg.MMSightVideoEditor", "[report] null == photoEditor");
        AppMethodBeat.o(55167);
      }
      while (true)
      {
        return;
        com.tencent.mm.api.p localp = this.oBG.Ac();
        this.oBS.oxz = localp.As();
        this.oBS.oxA = localp.Ar();
        this.oBS.oxC = localp.Au();
        this.oBS.efs = localp.Av();
        this.oBS.oxD = localp.Ax();
        this.oBS.textColor = localp.getTextColor();
        com.tencent.mm.plugin.mmsight.a.a.a(this.oBS, paramString);
        AppMethodBeat.o(55167);
      }
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(55167);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(55166);
    try
    {
      if (this.oBE != null)
      {
        this.oBE.stopTimer();
        this.oBE = null;
      }
      if (this.oBz != null)
        this.oBz.release();
      if (this.oBG != null)
        this.oBG.onDestroy();
      if (this.oBF != null)
        this.oBF.removeView(this.oBH);
      if (this.oxM != null)
        this.oxM.bQM();
      this.oBA = false;
      j.owk.WY();
      AppMethodBeat.o(55166);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMSightVideoEditor", localException, "release error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(55166);
      }
    }
  }

  public final boolean wY()
  {
    boolean bool = false;
    AppMethodBeat.i(55168);
    if (!this.oBU)
      AppMethodBeat.o(55168);
    while (true)
    {
      return bool;
      if (this.oBP)
      {
        bQw();
        bool = true;
        AppMethodBeat.o(55168);
      }
      else if (this.oBG != null)
      {
        bool = this.oBG.Ab();
        AppMethodBeat.o(55168);
      }
      else
      {
        AppMethodBeat.o(55168);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b
 * JD-Core Version:    0.6.2
 */