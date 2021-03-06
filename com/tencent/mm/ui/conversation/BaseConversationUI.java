package com.tencent.mm.ui.conversation;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView;
import com.tencent.mm.ui.IChattingUIProxy;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.b.c;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout.a;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ChattingUIFragment;
import com.tencent.mm.ui.chatting.y;
import com.tencent.mm.ui.r;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public class BaseConversationUI extends MMFragmentActivity
{
  private static final String LAST_RESTORE_TALKER = "last_restore_talker";
  static final String TAG = "MicroMsg.BaseConversationUI";
  private OnLayoutChangedLinearLayout chattingFragmentView;
  private ChattingUIFragment chattingFragmet;
  private int chattingID;
  private IChattingUIProxy chattingUIProxy;
  private TestTimeForChatting chattingView;
  private long chattinguiResumeTime;
  public BaseConversationUI.BaseConversationFmUI conversationFm;
  private boolean isAnimating;
  private String lastRestoreTalker;
  private BaseConversationUI.a launcherUIStatus;
  private ActionBar mActionBar;
  private com.tencent.mm.ui.a mActionBarHelper;
  public boolean mChattingClosed;
  private Animation mChattingInAnim;
  private Animation mChattingOutAnim;
  private boolean mNeedChattingAnim;
  private Bitmap mPrepareBitmap;
  private OnLayoutChangedLinearLayout.a onChattingLayoutChangedListener;
  Bundle pendingBundle;
  String pendingUser;
  private BaseConversationUI.b selectImageJob;
  Runnable startChattingRunnable;
  private String title;

  public BaseConversationUI()
  {
    AppMethodBeat.i(34076);
    this.chattinguiResumeTime = 0L;
    this.launcherUIStatus = BaseConversationUI.a.zqJ;
    this.mNeedChattingAnim = false;
    this.mChattingClosed = true;
    this.chattingID = -1;
    this.onChattingLayoutChangedListener = new BaseConversationUI.6(this);
    this.startChattingRunnable = new BaseConversationUI.8(this);
    this.selectImageJob = new BaseConversationUI.b(this, (byte)0);
    AppMethodBeat.o(34076);
  }

  private boolean acceptRequestCode(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(34102);
    paramInt = 0xFFFF & paramInt;
    ab.w("MicroMsg.BaseConversationUI", "check request code %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(34102);
      bool = false;
    case 217:
    case 218:
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(34102);
    }
  }

  private void createChattingView()
  {
    AppMethodBeat.i(34091);
    Object localObject1;
    Object localObject2;
    ViewGroup localViewGroup;
    Object localObject3;
    if (this.chattingView == null)
    {
      if (!this.chattingFragmet.isSupportCustomActionBar())
      {
        this.chattingView = ((TestTimeForChatting)findViewById(2131821893));
        this.chattingID = this.chattingView.getId();
        AppMethodBeat.o(34091);
        return;
      }
      localObject1 = new int[2];
      getSupportActionBar().getCustomView().getLocationInWindow((int[])localObject1);
      TestTimeForChatting localTestTimeForChatting = new TestTimeForChatting(this);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      localTestTimeForChatting.setId(2131820582);
      this.chattingID = localTestTimeForChatting.getId();
      localTestTimeForChatting.setOrientation(1);
      localTestTimeForChatting.setLayoutParams(localLayoutParams);
      localObject2 = new HomeUI.FitSystemWindowLayoutView(this);
      ((HomeUI.FitSystemWindowLayoutView)localObject2).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
      localViewGroup = findRootContainer();
      localObject3 = localViewGroup;
      if (localViewGroup == null)
        localObject3 = ((ViewGroup)getWindow().getDecorView()).getChildAt(0);
      if ((localObject3 instanceof SwipeBackLayout))
      {
        localViewGroup = (ViewGroup)((ViewGroup)localObject3).getChildAt(0);
        label187: ImageView localImageView = new ImageView(this);
        localImageView.setId(2131820648);
        localImageView.setLayoutParams(localLayoutParams);
        localImageView.setVisibility(8);
        ((ViewGroup)getWindow().getDecorView()).removeView((View)localObject3);
        ((View)localObject3).setId(2131820633);
        ((HomeUI.FitSystemWindowLayoutView)localObject2).addView((View)localObject3);
        ((HomeUI.FitSystemWindowLayoutView)localObject2).addView(localImageView);
        ((HomeUI.FitSystemWindowLayoutView)localObject2).addView(localTestTimeForChatting);
        ((ViewGroup)getWindow().getDecorView()).addView((View)localObject2);
        getWindow().getDecorView().requestFitSystemWindows();
        i = localObject1[1];
        if (i <= 0)
          break label372;
        updateRootViewSystemWindowsInsets((HomeUI.FitSystemWindowLayoutView)localObject2, i, new Rect(0, i, 0, 0), localViewGroup);
      }
      while (true)
      {
        this.chattingView = ((TestTimeForChatting)findViewById(this.chattingID));
        ab.i("MicroMsg.BaseConversationUI", "ashu::prepareChattingFragment init chattingView, top %s", new Object[] { Integer.valueOf(localObject1[1]) });
        AppMethodBeat.o(34091);
        break;
        localViewGroup = (ViewGroup)localObject3;
        break label187;
        label372: getSupportActionBar().getCustomView().post(new BaseConversationUI.7(this, (int[])localObject1, (HomeUI.FitSystemWindowLayoutView)localObject2, localViewGroup));
      }
    }
    if (this.chattingFragmet.isSupportCustomActionBar())
    {
      localObject3 = new int[2];
      this.chattingView.getLocationInWindow((int[])localObject3);
      if (localObject3[1] == 0)
        localViewGroup = (ViewGroup)getWindow().getDecorView();
    }
    for (int i = 0; ; i++)
    {
      if (i < localViewGroup.getChildCount())
      {
        localObject2 = ((ViewGroup)getWindow().getDecorView()).getChildAt(i);
        if (!(localObject2 instanceof HomeUI.FitSystemWindowLayoutView))
          break label699;
        getSupportActionBar().getCustomView().getLocationInWindow((int[])localObject3);
        localObject2 = (HomeUI.FitSystemWindowLayoutView)localObject2;
        ((HomeUI.FitSystemWindowLayoutView)localObject2).fitSystemWindows(new Rect(0, ((HomeUI.FitSystemWindowLayoutView)localObject2).getCacheInsetsTop(), 0, 0));
        ab.i("MicroMsg.BaseConversationUI", "rootLayout2 fitSystemWindows, top %s", new Object[] { Integer.valueOf(localObject3[1]) });
        localViewGroup = (ViewGroup)localViewGroup.findViewById(2131820633);
        localObject2 = (ImageView)((HomeUI.FitSystemWindowLayoutView)localObject2).findViewById(2131820648);
        ((ImageView)localObject2).setTag(localViewGroup);
        localObject1 = localViewGroup.getLayoutParams();
        if ((localObject1 == null) || ((localObject1 instanceof FrameLayout.LayoutParams)))
          break label681;
        ab.w("MicroMsg.BaseConversationUI", "FIX LayoutParams");
        ((ImageView)localObject2).setLayoutParams(new FrameLayout.LayoutParams((ViewGroup.LayoutParams)localObject1));
        label613: localObject1 = getMagicDrawingCache(localViewGroup);
        if (localObject1 == null)
          break label690;
        ((ImageView)localObject2).setImageBitmap((Bitmap)localObject1);
        localViewGroup.setVisibility(8);
        ((ImageView)localObject2).setVisibility(0);
        ab.i("MicroMsg.BaseConversationUI", "[prepareChattingFragment] prepareView VISIBLE");
      }
      while (true)
      {
        ab.i("MicroMsg.BaseConversationUI", "ashu::prepareChattingFragment has chattingView, top %s", new Object[] { Integer.valueOf(localObject3[1]) });
        AppMethodBeat.o(34091);
        break;
        label681: ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        break label613;
        label690: ((ImageView)localObject2).setImageBitmap(null);
      }
      label699: ab.e("MicroMsg.BaseConversationUI", "on position %d, rootLayout not found!", new Object[] { Integer.valueOf(i) });
    }
  }

  private void doJobOnChattingAnimEnd()
  {
    AppMethodBeat.i(34086);
    al.n(new BaseConversationUI.5(this), 60L);
    AppMethodBeat.o(34086);
  }

  private void doJobOnChattingAnimStart()
  {
    AppMethodBeat.i(34085);
    this.chattingView.setTranslationX(0.0F);
    this.chattingView.dJY();
    AppMethodBeat.o(34085);
  }

  private ViewGroup findRootContainer()
  {
    AppMethodBeat.i(34094);
    Object localObject1 = this.mActionBar.getCustomView().getParent();
    Object localObject2 = null;
    ViewGroup localViewGroup = (ViewGroup)getWindow().getDecorView();
    while ((localObject1 != localViewGroup) && (localObject1 != null))
    {
      ViewParent localViewParent = ((ViewParent)localObject1).getParent();
      localObject2 = localObject1;
      localObject1 = localViewParent;
    }
    localObject1 = (ViewGroup)localObject2;
    AppMethodBeat.o(34094);
    return localObject1;
  }

  private String getIdentityString()
  {
    AppMethodBeat.i(34108);
    String str;
    if (this.chattingFragmet != null)
    {
      str = this.chattingFragmet.getIdentityString();
      AppMethodBeat.o(34108);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(34108);
    }
  }

  private void initActionBar()
  {
    AppMethodBeat.i(34098);
    if ((this.chattingFragmet != null) && (this.chattingFragmet.cgL.caA))
    {
      ab.w("MicroMsg.BaseConversationUI", "[initActionBar] isChattingForeground True!");
      AppMethodBeat.o(34098);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.BaseConversationUI", "[initActionBar] isChattingForeground False!");
      View localView = v.hu(this).inflate(2130968612, null);
      this.mActionBarHelper = new com.tencent.mm.ui.a(localView);
      this.mActionBar.setLogo(new ColorDrawable(getResources().getColor(17170445)));
      this.mActionBar.fc();
      this.mActionBar.setDisplayHomeAsUpEnabled(false);
      this.mActionBar.fb();
      this.mActionBar.fd();
      this.mActionBar.setCustomView(localView);
      updateTitle();
      this.mActionBarHelper.b(new BaseConversationUI.2(this));
      if (this.mActionBar.getCustomView() != null)
      {
        this.mActionBar.getCustomView().findViewById(2131820964);
        ((TextView)this.mActionBar.getCustomView().findViewById(2131820965)).setTextColor(getResources().getColor(2131689764));
      }
      AppMethodBeat.o(34098);
    }
  }

  @TargetApi(19)
  private void prepareChattingFragment(Intent paramIntent, boolean paramBoolean)
  {
    AppMethodBeat.i(34090);
    long l = System.currentTimeMillis();
    if (this.chattingFragmet == null)
    {
      this.chattingFragmet = getChattingUIFragment();
      this.chattingUIProxy = new y(this, this.chattingFragmet);
    }
    for (boolean bool = true; ; bool = false)
    {
      createChattingView();
      if (paramIntent != null)
        this.chattingFragmet.getArguments().putAll(w.aM(paramIntent));
      if (bool)
      {
        this.chattingUIProxy.onInit(this.chattingID, paramBoolean);
        this.chattingFragmentView = ((OnLayoutChangedLinearLayout)this.chattingFragmet.getView().findViewById(2131821521));
      }
      while (true)
      {
        if (this.chattingFragmet.isSupportNavigationSwipeBack())
          this.chattingFragmet.getSwipeBackLayout().setNeedRequestActivityTranslucent(false);
        ab.i("MicroMsg.BaseConversationUI", "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool), paramIntent });
        AppMethodBeat.o(34090);
        return;
        this.chattingUIProxy.onEnterBegin();
      }
    }
  }

  private void resetViewTranX(View paramView, ImageView paramImageView, float paramFloat)
  {
    AppMethodBeat.i(34083);
    if (Float.compare(1.0F, paramFloat) <= 0)
    {
      com.tencent.mm.ui.tools.h.s(paramView, 0.0F);
      com.tencent.mm.ui.tools.h.s(paramImageView, 0.0F);
      AppMethodBeat.o(34083);
    }
    while (true)
    {
      return;
      if ((paramImageView != null) && (paramImageView.getDrawable() != null))
      {
        com.tencent.mm.ui.tools.h.s(paramImageView, paramImageView.getWidth() / 4 * (1.0F - paramFloat) * -1.0F);
        AppMethodBeat.o(34083);
      }
      else
      {
        com.tencent.mm.ui.tools.h.s(paramView, paramView.getWidth() / 4 * (1.0F - paramFloat) * -1.0F);
        AppMethodBeat.o(34083);
      }
    }
  }

  private void tryResetChattingSwipeStatus()
  {
    boolean bool = true;
    AppMethodBeat.i(34087);
    if ((!com.tencent.mm.compatible.util.d.iW(19)) || (!com.tencent.mm.compatible.i.b.Ml()))
    {
      AppMethodBeat.o(34087);
      return;
    }
    if (this.chattingFragmet == null);
    while (true)
    {
      ab.i("MicroMsg.BaseConversationUI", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", new Object[] { Boolean.valueOf(bool) });
      if (this.chattingFragmet != null)
        this.chattingFragmet.getSwipeBackLayout().zOp = false;
      AppMethodBeat.o(34087);
      break;
      bool = false;
    }
  }

  private void updateRootViewSystemWindowsInsets(HomeUI.FitSystemWindowLayoutView paramFitSystemWindowLayoutView, int paramInt, Rect paramRect, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(34093);
    int i = getWindow().getDecorView().getBottom();
    int j = getSupportActionBar().getCustomView().getBottom();
    if ((this.conversationFm != null) && (this.conversationFm.getView() != null));
    for (int k = i - (paramInt + j + this.conversationFm.getView().getBottom()); ; k = 0)
    {
      ab.i("MicroMsg.BaseConversationUI", "ashu::fitSystemWindows 2. decorBottom:%d, statusBarHeight:%d, actionBarHeight:%d, paddingForNavBar:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(j), Integer.valueOf(k) });
      paramFitSystemWindowLayoutView.setActionBarContainer(paramViewGroup);
      paramFitSystemWindowLayoutView.fitSystemWindows(paramRect);
      AppMethodBeat.o(34093);
      return;
    }
  }

  public void closeChatting(boolean paramBoolean)
  {
    AppMethodBeat.i(34097);
    if (this.chattingView == null);
    for (boolean bool = false; ; bool = this.chattingView.isShown())
    {
      ab.i("MicroMsg.BaseConversationUI", "try closeChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
      if ((this.chattingFragmet != null) && (this.chattingFragmet.isSupportNavigationSwipeBack()))
        com.tencent.mm.ui.widget.h.b(this);
      if ((this.chattingView != null) && (this.chattingView.getVisibility() != 8) && (this.chattingFragmet != null))
        break;
      AppMethodBeat.o(34097);
      return;
    }
    ab.i("MicroMsg.BaseConversationUI", "[closeChatting] needAnim:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.chattingView.setVisibility(8);
    this.mChattingClosed = true;
    if ((paramBoolean) && (this.mChattingOutAnim == null))
    {
      this.mChattingOutAnim = AnimationUtils.loadAnimation(this, MMFragmentActivity.a.ynf);
      this.mChattingOutAnim.setAnimationListener(new BaseConversationUI.9(this));
    }
    if (this.chattingFragmet.isSupportCustomActionBar())
    {
      ImageView localImageView = (ImageView)getWindow().getDecorView().findViewById(2131820648);
      if ((localImageView != null) && (localImageView.getVisibility() == 0))
      {
        localImageView.setVisibility(8);
        ab.i("MicroMsg.BaseConversationUI", "[closeChatting] prepareView GONE");
        if (localImageView.getTag() != null)
          ((View)localImageView.getTag()).setVisibility(0);
      }
    }
    if (paramBoolean)
    {
      this.chattingUIProxy.onExitBegin();
      this.chattingUIProxy.onExitEnd();
      this.chattingView.startAnimation(this.mChattingOutAnim);
    }
    while (true)
    {
      if (!this.chattingFragmet.isSupportCustomActionBar())
        initActionBar();
      supportInvalidateOptionsMenu();
      resumeMainFragment();
      com.tencent.mm.sdk.g.d.post(new BaseConversationUI.10(this), "directReport_closeChatting");
      AppMethodBeat.o(34097);
      break;
      this.chattingUIProxy.onExitBegin();
      this.chattingUIProxy.onExitEnd();
      this.chattingView.setVisibility(8);
      onSwipe(1.0F);
      tryResetChattingSwipeStatus();
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(34106);
    ab.d("MicroMsg.BaseConversationUI", "chatting ui dispatch key event %s", new Object[] { paramKeyEvent });
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
      al.af(this.startChattingRunnable);
    if (this.isAnimating)
      AppMethodBeat.o(34106);
    while (true)
    {
      return bool;
      if ((this.chattingFragmet != null) && (this.chattingFragmet.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent)))
      {
        AppMethodBeat.o(34106);
      }
      else
      {
        bool = super.dispatchKeyEvent(paramKeyEvent);
        AppMethodBeat.o(34106);
      }
    }
  }

  protected ChattingUIFragment getChattingUIFragment()
  {
    AppMethodBeat.i(34107);
    ChattingUIFragment localChattingUIFragment = new ChattingUIFragment();
    AppMethodBeat.o(34107);
    return localChattingUIFragment;
  }

  public Bitmap getMagicDrawingCache(View paramView)
  {
    Canvas localCanvas = null;
    AppMethodBeat.i(34092);
    long l = System.currentTimeMillis();
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    if (i <= 0)
      i = paramView.getMeasuredWidth();
    while (true)
    {
      if (j <= 0)
        j = paramView.getMeasuredHeight();
      while (true)
      {
        if ((i <= 0) || (j <= 0))
        {
          ab.e("MicroMsg.BaseConversationUI", "viewWidth:%s viewHeight:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          AppMethodBeat.o(34092);
          paramView = localCanvas;
        }
        while (true)
        {
          return paramView;
          if (this.chattingFragmet != null)
            ab.i("MicroMsg.BaseConversationUI", "getBottom:%s keyboardState:%s", new Object[] { Integer.valueOf(this.chattingFragmet.getView().getBottom()), Integer.valueOf(this.chattingFragmet.keyboardState()) });
          if ((this.chattingFragmet != null) && (this.chattingFragmet.getView().getBottom() > 0) && ((this.chattingFragmet.keyboardState() == 1) || (this.chattingFragmet.getView().getBottom() < getResources().getDisplayMetrics().heightPixels * 2 / 3)))
          {
            ab.e("MicroMsg.BaseConversationUI", "hardKeyboardHidden:%s", new Object[] { Integer.valueOf(this.chattingFragmet.keyboardState()) });
            AppMethodBeat.o(34092);
            paramView = localCanvas;
          }
          else
          {
            if ((this.chattingFragmet == null) || (this.chattingFragmet.keyboardState() != 1))
              break;
            ab.e("MicroMsg.BaseConversationUI", "hardKeyboardHidden:%s", new Object[] { Integer.valueOf(this.chattingFragmet.keyboardState()) });
            AppMethodBeat.o(34092);
            paramView = localCanvas;
          }
        }
        if ((this.mPrepareBitmap == null) || (this.mPrepareBitmap.isRecycled()) || (this.mPrepareBitmap.getWidth() != i) || (this.mPrepareBitmap.getHeight() != j))
          if ((this.mPrepareBitmap != null) && (!this.mPrepareBitmap.isRecycled()))
          {
            ab.i("MicroMsg.BaseConversationUI", "bitmap recycle %s", new Object[] { this.mPrepareBitmap.toString() });
            this.mPrepareBitmap.recycle();
          }
        while (true)
        {
          try
          {
            this.mPrepareBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_4444);
            localCanvas = new Canvas(this.mPrepareBitmap);
            int k = (int)getResources().getDimension(2131427360);
            int m = (int)getResources().getDimension(2131427567);
            Paint localPaint = new Paint();
            localPaint.setColor(-1);
            localCanvas.drawRect(0.0F, k, i, j - m, localPaint);
            paramView.draw(localCanvas);
            ab.i("MicroMsg.BaseConversationUI", "[getMagicDrawingCache] cost%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            paramView = this.mPrepareBitmap;
            AppMethodBeat.o(34092);
          }
          catch (OutOfMemoryError paramView)
          {
            ab.e("MicroMsg.BaseConversationUI", "[getMagicDrawingCache] e:%s", new Object[] { paramView });
            AppMethodBeat.o(34092);
            paramView = localCanvas;
          }
          break;
          this.mPrepareBitmap.eraseColor(0);
        }
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(34084);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.conversationFm != null)
      this.conversationFm.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
      AppMethodBeat.o(34084);
    while (true)
    {
      return;
      if ((paramInt1 == 2001) && (this.chattingFragmet != null))
        this.chattingFragmet.onActivityResult(paramInt1, paramInt2, paramIntent);
      if ((acceptRequestCode(paramInt1)) && (this.chattingFragmet == null))
      {
        ab.i("MicroMsg.BaseConversationUI", "on select image ActivityResult. the chattingUI maybe kill in the background.");
        al.af(this.selectImageJob);
        this.selectImageJob.ypy = 0;
        this.selectImageJob.requestCode = paramInt1;
        this.selectImageJob.bFZ = paramInt2;
        this.selectImageJob.cEd = paramIntent;
        al.d(this.selectImageJob);
        AppMethodBeat.o(34084);
      }
      else
      {
        AppMethodBeat.o(34084);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34077);
    getWindow().setFormat(-2);
    f.ah(this);
    super.onCreate(paramBundle);
    if (!b.dIo())
      getWindow().setCallback(new c(getWindow().getCallback(), this));
    this.mActionBar = getSupportActionBar();
    initNavigationSwipeBack();
    AppMethodBeat.o(34077);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34081);
    super.onDestroy();
    if ((this.mPrepareBitmap != null) && (!this.mPrepareBitmap.isRecycled()))
    {
      ab.i("MicroMsg.BaseConversationUI", "bitmap recycle %s", new Object[] { this.mPrepareBitmap.toString() });
      this.mPrepareBitmap.recycle();
    }
    this.chattingFragmet = null;
    this.chattingFragmentView = null;
    this.chattingView = null;
    this.conversationFm = null;
    this.mActionBarHelper = null;
    this.mChattingInAnim = null;
    this.mChattingOutAnim = null;
    AppMethodBeat.o(34081);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(34078);
    super.onNewIntent(paramIntent);
    ab.i("MicroMsg.BaseConversationUI", "onNewIntent");
    setIntent(paramIntent);
    AppMethodBeat.o(34078);
  }

  public void onPause()
  {
    AppMethodBeat.i(34080);
    ab.i("MicroMsg.BaseConversationUI", "on pause");
    super.onPause();
    if (!isFinishing())
      com.tencent.mm.ui.widget.h.a(this);
    this.launcherUIStatus = BaseConversationUI.a.zqL;
    if ((this.chattingView != null) && (this.chattingView.isShown()));
    for (boolean bool = true; ; bool = false)
    {
      com.tencent.mm.sdk.g.d.post(new BaseConversationUI.4(this, bool), "directReport_onPause");
      if ((this.chattingFragmet != null) && (this.chattingFragmet.isSupportNavigationSwipeBack()))
        this.chattingFragmet.getSwipeBackLayout().setEnableGesture(false);
      AppMethodBeat.o(34080);
      return;
    }
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(34103);
    super.onRestoreInstanceState(paramBundle);
    this.lastRestoreTalker = paramBundle.getString("last_restore_talker");
    ab.d("MicroMsg.BaseConversationUI", "onRestoreInstantceState:%s", new Object[] { this.lastRestoreTalker });
    AppMethodBeat.o(34103);
  }

  public void onResume()
  {
    AppMethodBeat.i(34079);
    super.onResume();
    com.tencent.mm.ui.widget.h.b(this);
    onSwipe(1.0F);
    this.launcherUIStatus = BaseConversationUI.a.zqK;
    if ((this.chattingView != null) && (this.chattingView.isShown()));
    for (boolean bool = true; ; bool = false)
    {
      com.tencent.mm.sdk.g.d.post(new BaseConversationUI.1(this, bool), "directReport_onResume");
      if (!bool)
        this.chattinguiResumeTime = bo.anT();
      if ((com.tencent.mm.compatible.util.d.iW(19)) && (com.tencent.mm.compatible.i.b.Ml()))
      {
        if ((this.chattingFragmet != null) && (this.chattingFragmet.isSupportNavigationSwipeBack()))
          this.chattingFragmet.getSwipeBackLayout().setEnableGesture(true);
        Looper.myQueue().addIdleHandler(new BaseConversationUI.3(this));
      }
      initActionBar();
      this.mActionBar.show();
      AppMethodBeat.o(34079);
      return;
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(34104);
    if ((this.chattingFragmet != null) && (!bo.isNullOrNil(this.chattingFragmet.cgL.getTalkerUserName())))
    {
      ab.d("MicroMsg.BaseConversationUI", "onSaveInstanceState:%s", new Object[] { this.chattingFragmet.cgL.getTalkerUserName() });
      paramBundle.putString("last_restore_talker", this.chattingFragmet.cgL.getTalkerUserName());
    }
    AppMethodBeat.o(34104);
  }

  public void onSettle(boolean paramBoolean, int paramInt)
  {
    long l = 160L;
    AppMethodBeat.i(34105);
    ab.v("MicroMsg.BaseConversationUI", "ashutest: on settle %B, speed %d, resumeStatus %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), this.launcherUIStatus });
    if ((!com.tencent.mm.compatible.util.d.iW(19)) || (!com.tencent.mm.compatible.i.b.Ml()))
      AppMethodBeat.o(34105);
    View localView;
    while (true)
    {
      return;
      localView = findViewById(2131820633);
      if (localView != null)
        break;
      ab.e("MicroMsg.BaseConversationUI", "[onSettle] null == container");
      AppMethodBeat.o(34105);
    }
    ImageView localImageView = (ImageView)findViewById(2131820648);
    if ((localImageView != null) && (localImageView.getVisibility() == 8) && (localImageView.getDrawable() != null))
    {
      localImageView.setVisibility(0);
      ab.i("MicroMsg.BaseConversationUI", "[onSettle] prepareView VISIBLE");
      localView.setVisibility(8);
    }
    if ((localImageView != null) && (localImageView.getVisibility() == 0))
    {
      if (paramBoolean)
      {
        if (paramInt > 0);
        while (true)
        {
          com.tencent.mm.ui.tools.h.a(localImageView, l, 0.0F, null);
          AppMethodBeat.o(34105);
          break;
          l = 290L;
        }
      }
      if (paramInt > 0);
      while (true)
      {
        com.tencent.mm.ui.tools.h.a(localImageView, l, localImageView.getWidth() * -1 / 4, null);
        AppMethodBeat.o(34105);
        break;
        l = 290L;
      }
    }
    if (paramBoolean)
    {
      if (paramInt > 0);
      while (true)
      {
        com.tencent.mm.ui.tools.h.a(localView, l, 0.0F, null);
        AppMethodBeat.o(34105);
        break;
        l = 290L;
      }
    }
    if (paramInt > 0);
    while (true)
    {
      com.tencent.mm.ui.tools.h.a(localView, l, localView.getWidth() * -1 / 4, null);
      AppMethodBeat.o(34105);
      break;
      l = 290L;
    }
  }

  public void onSwipe(float paramFloat)
  {
    AppMethodBeat.i(34082);
    ab.v("MicroMsg.BaseConversationUI", "ashutest::on swipe %f, duration %d, status %s", new Object[] { Float.valueOf(paramFloat), Long.valueOf(320L), this.launcherUIStatus });
    if ((!com.tencent.mm.compatible.util.d.iW(19)) || (!com.tencent.mm.compatible.i.b.Ml()))
      AppMethodBeat.o(34082);
    while (true)
    {
      return;
      if (this.chattingFragmet == null)
      {
        ab.e("MicroMsg.BaseConversationUI", "chattingFragmet is null!");
        AppMethodBeat.o(34082);
      }
      else
      {
        if ((paramFloat == 0.0F) && (!this.mChattingClosed))
        {
          localObject1 = (ImageView)getWindow().getDecorView().findViewById(2131820648);
          if (localObject1 != null)
          {
            localObject2 = (ViewGroup)((ImageView)localObject1).getTag();
            if (localObject2 != null)
            {
              ab.i("MicroMsg.BaseConversationUI", "[onSwipe] prepareView GONE");
              ((ViewGroup)localObject2).setVisibility(0);
              ((ImageView)localObject1).setVisibility(8);
              ((ImageView)localObject1).setImageDrawable(null);
            }
          }
          if (this.mChattingInAnim != null)
            this.mChattingInAnim.cancel();
        }
        while (true)
        {
          if ((BaseConversationUI.a.zqK == this.launcherUIStatus) || (Float.compare(1.0F, paramFloat) <= 0))
            break label312;
          ab.i("MicroMsg.BaseConversationUI", "[onSwipe] return! consumedSuperCall:%s", new Object[] { Float.valueOf(paramFloat) });
          AppMethodBeat.o(34082);
          break;
          if ((paramFloat == 1.0F) && (!this.mChattingClosed) && (this.chattingFragmet.isSupportNavigationSwipeBack()))
          {
            getWindow().setBackgroundDrawableResource(2131690395);
            localObject2 = (ImageView)getWindow().getDecorView().findViewById(2131820648);
            if ((localObject2 != null) && (((ImageView)localObject2).getVisibility() == 0) && (((ImageView)localObject2).getTag() != null))
            {
              ((View)((ImageView)localObject2).getTag()).setVisibility(0);
              ab.i("MicroMsg.BaseConversationUI", "[onSwipe] prepareView GONE");
              ((ImageView)localObject2).setVisibility(8);
            }
          }
        }
        label312: Object localObject1 = findViewById(2131820633);
        Object localObject2 = (ImageView)findViewById(2131820648);
        if ((localObject2 != null) && (((ImageView)localObject2).getVisibility() == 8) && (((ImageView)localObject2).getDrawable() != null) && (!this.mChattingClosed) && (paramFloat != 1.0F) && (paramFloat != 0.0F))
        {
          ((ImageView)localObject2).setVisibility(0);
          ab.i("MicroMsg.BaseConversationUI", "[onSwipe] !1 && !0 prepareView VISIBLE");
          if (localObject1 != null)
            ((View)localObject1).setVisibility(8);
        }
        resetViewTranX((View)localObject1, (ImageView)localObject2, paramFloat);
        AppMethodBeat.o(34082);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    Object localObject = null;
    AppMethodBeat.i(34101);
    if ((this.chattingFragmet == null) || (this.chattingFragmet.dBO() == null) || (!this.chattingFragmet.isSupportCustomActionBar()))
    {
      AppMethodBeat.o(34101);
      paramCallback = localObject;
    }
    while (true)
    {
      return paramCallback;
      if (com.tencent.mm.compatible.util.d.iX(22))
      {
        AppMethodBeat.o(34101);
        paramCallback = localObject;
      }
      else
      {
        paramCallback = this.chattingFragmet.dBO().startActionMode(paramCallback);
        if (paramCallback == null)
        {
          AppMethodBeat.o(34101);
          paramCallback = localObject;
        }
        else
        {
          AppMethodBeat.o(34101);
        }
      }
    }
  }

  public void pauseMainFragment()
  {
    AppMethodBeat.i(34095);
    if ((this.conversationFm != null) && (!this.conversationFm.isSupportNavigationSwipeBack()))
      this.conversationFm.showOptionMenu(false);
    AppMethodBeat.o(34095);
  }

  public void resumeMainFragment()
  {
    AppMethodBeat.i(34096);
    if (this.conversationFm != null)
    {
      this.conversationFm.onResume();
      if (!this.conversationFm.isSupportNavigationSwipeBack())
        this.conversationFm.showOptionMenu(true);
    }
    AppMethodBeat.o(34096);
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(34100);
    this.title = paramString;
    if (this.mActionBarHelper != null)
      updateTitle();
    AppMethodBeat.o(34100);
  }

  public void startChatting(String paramString)
  {
    AppMethodBeat.i(34088);
    startChatting(paramString, null, false);
    AppMethodBeat.o(34088);
  }

  public void startChatting(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(34089);
    if (this.chattingView == null);
    for (boolean bool = false; ; bool = this.chattingView.isShown())
    {
      ab.i("MicroMsg.BaseConversationUI", "try startChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
      this.pendingBundle = paramBundle;
      this.pendingUser = paramString;
      this.mNeedChattingAnim = paramBoolean;
      aw.RS().doK();
      al.Ma(-8);
      al.af(this.startChattingRunnable);
      al.d(this.startChattingRunnable);
      AppMethodBeat.o(34089);
      return;
    }
  }

  public void updateTitle()
  {
    AppMethodBeat.i(34099);
    if (this.mActionBarHelper != null)
      this.mActionBarHelper.setTitle(s.mJ(this.title));
    AppMethodBeat.o(34099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI
 * JD-Core Version:    0.6.2
 */