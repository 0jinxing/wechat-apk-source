package com.tencent.mm.plugin.sns.ui.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SnsAdLandingPageFloatView extends FrameLayout
{
  public String cHR;
  public String hcx;
  private boolean isResume;
  public ValueAnimator nVR;
  public String qPj;
  public String qTM;
  private Map<String, String> qXs;
  public boolean rEC;
  public int rMA;
  public String rMB;
  public String rMC;
  public p rMD;
  public g rME;
  public h rMF;
  public View rMG;
  public AnimatorSet rMH;
  public LinkedList<g> rnM;
  public String rnT;
  private List<h> rot;

  public SnsAdLandingPageFloatView(Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(40447);
    this.rnM = new LinkedList();
    this.qXs = new HashMap();
    this.rMH = new AnimatorSet();
    this.nVR = ValueAnimator.ofFloat(new float[] { 1.0F, 0.4F }).setDuration(100L);
    AppMethodBeat.o(40447);
  }

  public SnsAdLandingPageFloatView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, -1);
    AppMethodBeat.i(40448);
    this.rnM = new LinkedList();
    this.qXs = new HashMap();
    this.rMH = new AnimatorSet();
    this.nVR = ValueAnimator.ofFloat(new float[] { 1.0F, 0.4F }).setDuration(100L);
    AppMethodBeat.o(40448);
  }

  public SnsAdLandingPageFloatView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, -1);
    AppMethodBeat.i(40449);
    this.rnM = new LinkedList();
    this.qXs = new HashMap();
    this.rMH = new AnimatorSet();
    this.nVR = ValueAnimator.ofFloat(new float[] { 1.0F, 0.4F }).setDuration(100L);
    AppMethodBeat.o(40449);
  }

  public final void cvw()
  {
    AppMethodBeat.i(40452);
    Map localMap;
    int i;
    if ((this.rME != null) && (!bo.isNullOrNil(this.qTM)))
    {
      localMap = br.z(this.qTM, "adCardItemList");
      i = 0;
      if (i <= 0)
        break label195;
    }
    label195: for (String str1 = ".adCardItemList.cardItem" + i; ; str1 = ".adCardItemList.cardItem")
    {
      if (localMap.containsKey(str1 + ".cardTpId"))
      {
        String str2 = bo.bc((String)localMap.get(str1 + ".cardTpId"), "");
        str1 = bo.bc((String)localMap.get(str1 + ".cardExt"), "");
        if ((!bo.isNullOrNil(str2)) && (!bo.isNullOrNil(str1)))
          this.qXs.put(str2, str1);
        i++;
        break;
      }
      AppMethodBeat.o(40452);
      return;
    }
  }

  public List<h> getAllComp()
  {
    AppMethodBeat.i(40453);
    List localList;
    if (this.rot != null)
    {
      localList = this.rot;
      AppMethodBeat.o(40453);
    }
    while (true)
    {
      return localList;
      this.rot = new ArrayList();
      this.rot.add(this.rMF);
      i.dj(this.rot);
      localList = this.rot;
      AppMethodBeat.o(40453);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(40451);
    this.isResume = false;
    if (this.rME != null)
      this.rMF.cpb();
    AppMethodBeat.o(40451);
  }

  public final void onResume()
  {
    AppMethodBeat.i(40450);
    this.isResume = true;
    if (this.rME != null)
    {
      this.rMF.cpa();
      post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(40446);
          SnsAdLandingPageFloatView.d(SnsAdLandingPageFloatView.this).cpc();
          AppMethodBeat.o(40446);
        }
      });
    }
    AppMethodBeat.o(40450);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView
 * JD-Core Version:    0.6.2
 */