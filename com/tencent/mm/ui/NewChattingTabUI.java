package com.tencent.mm.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.MessageQueue.IdleHandler;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout.a;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.tools.TestTimeForChatting;

public class NewChattingTabUI
  implements LauncherUI.a
{
  MMFragmentActivity iWA;
  boolean isAnimating;
  boolean mChattingClosed;
  private Animation mChattingInAnim;
  private Animation mChattingOutAnim;
  private IChattingUIProxy mChattingUIProxy;
  private boolean mNeedChattingAnim;
  Bitmap mPrepareBitmap;
  Runnable mStartChattingRunnable;
  private OnLayoutChangedLinearLayout.a onChattingLayoutChangedListener;
  private LauncherUI.b ype;
  long ypf;
  private TestTimeForChatting ypg;
  private int yph;
  MessageQueue.IdleHandler ypi;
  private OnLayoutChangedLinearLayout ypj;
  String ypk;
  private String ypl;
  private Bundle ypm;
  BaseChattingUIFragment ypn;
  private long ypo;
  NewChattingTabUI.a ypp;
  boolean ypq;

  public NewChattingTabUI(LauncherUI.b paramb)
  {
    AppMethodBeat.i(29811);
    this.ypf = 0L;
    this.mChattingClosed = true;
    this.isAnimating = false;
    this.ypp = new NewChattingTabUI.a(this, (byte)0);
    this.ypq = false;
    this.mStartChattingRunnable = new NewChattingTabUI.5(this);
    this.onChattingLayoutChangedListener = new NewChattingTabUI.6(this);
    this.ype = paramb;
    AppMethodBeat.o(29811);
  }

  private void Ns(int paramInt)
  {
    AppMethodBeat.i(29822);
    ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[setLauncherContainerVisible] visible:%s", new Object[] { Integer.valueOf(paramInt) });
    if (this.iWA == null)
    {
      ab.e("MicroMsg.LauncherUI.NewChattingTabUI", "[setLauncherContainerVisible] getActivity is null");
      AppMethodBeat.o(29822);
    }
    while (true)
    {
      return;
      View localView = this.iWA.findViewById(2131820633);
      if ((localView != null) && (localView.getVisibility() != paramInt))
        localView.setVisibility(paramInt);
      AppMethodBeat.o(29822);
    }
  }

  static boolean acceptRequestCode(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(29813);
    paramInt = 0xFFFF & paramInt;
    ab.w("MicroMsg.LauncherUI.NewChattingTabUI", "check request code %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(29813);
      bool = false;
    case 217:
    case 218:
    case 226:
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(29813);
    }
  }

  private ViewGroup dyW()
  {
    AppMethodBeat.i(29814);
    Object localObject1 = this.iWA.getSupportActionBar().getCustomView().getParent();
    Object localObject2 = null;
    View localView = this.iWA.getWindow().getDecorView();
    while ((localObject1 != localView) && (localObject1 != null))
    {
      ViewParent localViewParent = ((ViewParent)localObject1).getParent();
      localObject2 = localObject1;
      localObject1 = localViewParent;
    }
    localObject1 = (ViewGroup)localObject2;
    AppMethodBeat.o(29814);
    return localObject1;
  }

  private Bitmap getMagicDrawingCache(View paramView)
  {
    Object localObject = null;
    AppMethodBeat.i(29817);
    long l = System.currentTimeMillis();
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    int k = i;
    if (i <= 0)
      k = paramView.getMeasuredWidth();
    i = j;
    if (j <= 0)
      i = paramView.getMeasuredHeight();
    if ((k <= 0) || (i <= 0))
    {
      ab.e("MicroMsg.LauncherUI.NewChattingTabUI", "viewWidth:%s viewHeight:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
      AppMethodBeat.o(29817);
      paramView = localObject;
    }
    while (true)
    {
      return paramView;
      if (this.ypn.getView() == null)
      {
        AppMethodBeat.o(29817);
        paramView = localObject;
      }
      else
      {
        if (this.ypn != null)
          ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "getBottom:%s keyboardState:%s", new Object[] { Integer.valueOf(this.ypn.getView().getBottom()), Integer.valueOf(this.ypn.keyboardState()) });
        if ((this.ypn != null) && (this.ypn.getView().getBottom() > 0) && ((this.ypn.keyboardState() == 1) || (this.ypn.getView().getBottom() < this.iWA.getResources().getDisplayMetrics().heightPixels * 2 / 3)))
        {
          ab.e("MicroMsg.LauncherUI.NewChattingTabUI", "hardKeyboardHidden:%s", new Object[] { Integer.valueOf(this.ypn.keyboardState()) });
          this.iWA.getWindow().setBackgroundDrawableResource(2131690395);
          AppMethodBeat.o(29817);
          paramView = localObject;
        }
        else if ((this.mPrepareBitmap == null) || (this.mPrepareBitmap.isRecycled()) || (this.mPrepareBitmap.getWidth() != k) || (this.mPrepareBitmap.getHeight() != i))
        {
          if ((this.mPrepareBitmap != null) && (!this.mPrepareBitmap.isRecycled()))
          {
            ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "bitmap recycle %s", new Object[] { this.mPrepareBitmap.toString() });
            this.mPrepareBitmap.recycle();
          }
          try
          {
            this.mPrepareBitmap = com.tencent.mm.sdk.platformtools.d.createBitmap(k, i, Bitmap.Config.ARGB_4444);
            if (this.mPrepareBitmap != null)
              break label428;
            AppMethodBeat.o(29817);
            paramView = localObject;
          }
          catch (OutOfMemoryError paramView)
          {
            ab.e("MicroMsg.LauncherUI.NewChattingTabUI", "[getMagicDrawingCache] e:%s", new Object[] { paramView });
            AppMethodBeat.o(29817);
            paramView = localObject;
          }
        }
        else
        {
          label428: paramView.draw(new Canvas(this.mPrepareBitmap));
          ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[getMagicDrawingCache] cost%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          paramView = this.mPrepareBitmap;
          AppMethodBeat.o(29817);
        }
      }
    }
  }

  private void tryResetChattingSwipeStatus()
  {
    boolean bool = true;
    AppMethodBeat.i(29819);
    if (!cXe())
    {
      AppMethodBeat.o(29819);
      return;
    }
    if (this.ypn == null);
    while (true)
    {
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", new Object[] { Boolean.valueOf(bool) });
      if (this.ypn != null)
        this.ypn.getSwipeBackLayout().zOp = false;
      AppMethodBeat.o(29819);
      break;
      bool = false;
    }
  }

  public final boolean G(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(29820);
    ab.v("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest: on settle %B, speed %d, resumeStatus %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Boolean.valueOf(this.ype.dxp()) });
    if (!cXe())
    {
      AppMethodBeat.o(29820);
      paramBoolean = true;
    }
    View localView;
    while (true)
    {
      return paramBoolean;
      if (paramBoolean)
        this.ype.dxs();
      if (!this.ype.dxp())
      {
        AppMethodBeat.o(29820);
        paramBoolean = false;
      }
      else
      {
        localView = this.iWA.findViewById(2131820633);
        if (localView != null)
          break;
        ab.e("MicroMsg.LauncherUI.NewChattingTabUI", "[onSettle] null == container");
        AppMethodBeat.o(29820);
        paramBoolean = true;
      }
    }
    ImageView localImageView = (ImageView)this.iWA.findViewById(2131820648);
    if ((localImageView != null) && (localImageView.getVisibility() == 8) && (localImageView.getDrawable() != null))
    {
      localImageView.setVisibility(0);
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSettle] prepareView VISIBLE");
      localView.setVisibility(8);
    }
    if ((localImageView != null) && (localImageView.getVisibility() == 0))
      if (localImageView.getWidth() == 0)
      {
        paramInt = this.iWA.getResources().getDisplayMetrics().widthPixels;
        label226: if (!paramBoolean)
          break label260;
        com.tencent.mm.ui.tools.h.a(localImageView, 224L, 0.0F, null);
      }
    while (true)
    {
      AppMethodBeat.o(29820);
      paramBoolean = true;
      break;
      paramInt = localImageView.getWidth();
      break label226;
      label260: com.tencent.mm.ui.tools.h.a(localImageView, 256L, paramInt * -1 / 3.5F, null);
      continue;
      if (localView.getWidth() == 0);
      for (paramInt = this.iWA.getResources().getDisplayMetrics().widthPixels; ; paramInt = localView.getWidth())
      {
        if (!paramBoolean)
          break label325;
        com.tencent.mm.ui.tools.h.a(localView, 224L, 0.0F, null);
        break;
      }
      label325: com.tencent.mm.ui.tools.h.a(localView, 256L, paramInt * -1 / 3.5F, null);
    }
  }

  public final boolean bo(float paramFloat)
  {
    boolean bool = true;
    AppMethodBeat.i(29821);
    ab.v("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest::on swipe %f, duration %d, resumeStatus %b", new Object[] { Float.valueOf(paramFloat), Long.valueOf(320L), Boolean.valueOf(this.ype.dxp()) });
    if (!cXe())
    {
      AppMethodBeat.o(29821);
      return bool;
    }
    ImageView localImageView;
    if ((paramFloat == 0.0F) && (!this.mChattingClosed))
    {
      Ns(0);
      localImageView = (ImageView)this.iWA.getWindow().getDecorView().findViewById(2131820648);
      if (localImageView != null)
      {
        ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] prepareView GONE no cache!");
        localImageView.setVisibility(8);
        localImageView.setImageDrawable(null);
      }
      if (this.mChattingInAnim != null)
        this.mChattingInAnim.cancel();
    }
    while (true)
    {
      if (this.ype.dxp())
        break label505;
      if (Float.compare(1.0F, paramFloat) <= 0)
        break label331;
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] return! consumedSuperCall:%s", new Object[] { Boolean.FALSE });
      AppMethodBeat.o(29821);
      bool = false;
      break;
      if ((paramFloat == 1.0F) && (!this.mChattingClosed) && (!this.ypn.dBM()))
      {
        this.iWA.getWindow().setBackgroundDrawableResource(2131690395);
        localImageView = (ImageView)this.iWA.getWindow().getDecorView().findViewById(2131820648);
        if ((localImageView != null) && (localImageView.getVisibility() == 0) && (localImageView.getTag() != null))
        {
          ((View)localImageView.getTag()).setVisibility(0);
          ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] prepareView GONE");
          localImageView.setVisibility(8);
        }
        if ((this.ypn.getContentView() != null) && (this.ypn.getContentView().getX() <= 0.0F))
          Ns(8);
        else
          Ns(0);
      }
    }
    label331: label505: for (bool = false; ; bool = true)
    {
      View localView = this.iWA.findViewById(2131820633);
      localImageView = (ImageView)this.iWA.findViewById(2131820648);
      if ((localImageView != null) && (localImageView.getVisibility() == 8) && (localImageView.getDrawable() != null) && (!this.mChattingClosed) && (paramFloat != 1.0F) && (paramFloat != 0.0F))
      {
        localImageView.setVisibility(0);
        ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] !1 && !0 prepareView VISIBLE");
        Ns(8);
      }
      if (Float.compare(1.0F, paramFloat) <= 0)
      {
        com.tencent.mm.ui.tools.h.s(localView, 0.0F);
        com.tencent.mm.ui.tools.h.s(localImageView, 0.0F);
      }
      while (true)
      {
        AppMethodBeat.o(29821);
        break;
        if ((localImageView != null) && (localImageView.getDrawable() != null))
          com.tencent.mm.ui.tools.h.s(localImageView, localImageView.getWidth() / 2.5F * (1.0F - paramFloat) * -1.0F);
        else
          com.tencent.mm.ui.tools.h.s(localView, localView.getWidth() / 2.5F * (1.0F - paramFloat) * -1.0F);
      }
    }
  }

  final boolean cXe()
  {
    AppMethodBeat.i(29815);
    boolean bool;
    if ((com.tencent.mm.compatible.util.d.iW(19)) && (com.tencent.mm.compatible.i.b.Ml()) && (!com.tencent.mm.compatible.f.b.bD(this.iWA)))
    {
      bool = true;
      AppMethodBeat.o(29815);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(29815);
    }
  }

  public final boolean dxM()
  {
    if (this.ypn == null);
    for (boolean bool = false; ; bool = this.ypn.cgL.caA)
      return bool;
  }

  final void kT(int paramInt)
  {
    AppMethodBeat.i(29816);
    if (this.ypn == null)
      AppMethodBeat.o(29816);
    while (true)
    {
      return;
      com.tencent.mm.sdk.g.d.post(new NewChattingTabUI.4(this, paramInt), "MicroMsg.LauncherUI.NewChattingTabUI|report");
      AppMethodBeat.o(29816);
    }
  }

  public final boolean pW(boolean paramBoolean)
  {
    boolean bool1 = false;
    AppMethodBeat.i(29818);
    if (this.ypg == null);
    for (boolean bool2 = false; ; bool2 = this.ypg.isShown())
    {
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "try closeChatting, ishow:%b", new Object[] { Boolean.valueOf(bool2) });
      if ((this.ypn != null) && (this.ypn.getView() != null))
        this.ypn.getView().setImportantForAccessibility(4);
      if ((this.ypg != null) && (this.ypg.getVisibility() != 8) && (this.ypn != null) && (this.iWA != null))
        break;
      AppMethodBeat.o(29818);
      paramBoolean = bool1;
      return paramBoolean;
    }
    if ((this.ypn != null) && (this.ypn.isSupportNavigationSwipeBack()))
      com.tencent.mm.ui.widget.h.b(this.iWA);
    ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[closeChatting] needAnim:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    kT(4);
    this.mChattingClosed = true;
    if ((paramBoolean) && (this.mChattingOutAnim == null))
    {
      this.mChattingOutAnim = AnimationUtils.loadAnimation(this.iWA, MMFragmentActivity.a.ynf);
      this.mChattingOutAnim.setAnimationListener(new NewChattingTabUI.7(this));
    }
    y.d(true, new Intent().putExtra("classname", "mainui").putExtra("main_process", false));
    if (this.ypn.isSupportCustomActionBar())
    {
      ImageView localImageView = (ImageView)this.iWA.getWindow().getDecorView().findViewById(2131820648);
      if ((localImageView != null) && (localImageView.getVisibility() == 0))
      {
        localImageView.setVisibility(8);
        ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[closeChatting] prepareView GONE");
      }
    }
    Ns(0);
    if (paramBoolean)
    {
      this.mChattingUIProxy.onExitBegin();
      this.mChattingUIProxy.onExitEnd();
      this.ypg.startAnimation(this.mChattingOutAnim);
    }
    while (true)
    {
      AppMethodBeat.o(29818);
      paramBoolean = true;
      break;
      this.mChattingUIProxy.onExitBegin();
      this.mChattingUIProxy.onExitEnd();
      this.ypg.setVisibility(8);
      this.iWA.onSwipe(1.0F);
      tryResetChattingSwipeStatus();
    }
  }

  public final void startChatting(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(29812);
    this.ypo = System.currentTimeMillis();
    if (this.ypg == null);
    for (boolean bool = false; ; bool = this.ypg.isShown())
    {
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "try startChatting, ishow:%b userName:%s needAnim:%b", new Object[] { Boolean.valueOf(bool), paramString, Boolean.valueOf(paramBoolean) });
      if ((this.ypn != null) && (this.ypn.getView() != null))
        this.ypn.getView().setImportantForAccessibility(1);
      aw.getNotification().bv(false);
      this.ypq = false;
      this.ypm = paramBundle;
      this.ypl = paramString;
      this.mNeedChattingAnim = paramBoolean;
      aw.RS().doK();
      al.Ma(-8);
      al.af(this.mStartChattingRunnable);
      al.d(this.mStartChattingRunnable);
      AppMethodBeat.o(29812);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI
 * JD-Core Version:    0.6.2
 */