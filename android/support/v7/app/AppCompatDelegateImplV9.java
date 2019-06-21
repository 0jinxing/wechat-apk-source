package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.app.t;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.support.v4.view.y;
import android.support.v4.widget.n;
import android.support.v7.a.a.a;
import android.support.v7.view.b.a;
import android.support.v7.view.d;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.p;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ad;
import android.support.v7.widget.ad.a;
import android.support.v7.widget.az;
import android.support.v7.widget.bh;
import android.support.v7.widget.bk;
import android.support.v7.widget.i;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDelegateImplV9 extends e
  implements h.a, LayoutInflater.Factory2
{
  private static final boolean Vf;
  private TextView TF;
  private boolean VA;
  private j VB;
  private android.support.v7.widget.w Vg;
  private a Vh;
  private d Vi;
  android.support.v7.view.b Vj;
  ActionBarContextView Vk;
  PopupWindow Vl;
  Runnable Vm;
  android.support.v4.view.w Vn = null;
  private boolean Vo;
  private ViewGroup Vp;
  private View Vq;
  private boolean Vr;
  private boolean Vs;
  private boolean Vt;
  private PanelFeatureState[] Vu;
  private PanelFeatureState Vv;
  private boolean Vw;
  boolean Vx;
  int Vy;
  private final Runnable Vz = new Runnable()
  {
    public final void run()
    {
      if ((AppCompatDelegateImplV9.this.Vy & 0x1) != 0)
        AppCompatDelegateImplV9.this.bi(0);
      if ((AppCompatDelegateImplV9.this.Vy & 0x1000) != 0)
        AppCompatDelegateImplV9.this.bi(108);
      AppCompatDelegateImplV9.this.Vx = false;
      AppCompatDelegateImplV9.this.Vy = 0;
    }
  };
  private Rect qS;
  private Rect qT;

  static
  {
    if (Build.VERSION.SDK_INT < 21);
    for (boolean bool = true; ; bool = false)
    {
      Vf = bool;
      return;
    }
  }

  AppCompatDelegateImplV9(Context paramContext, Window paramWindow, c paramc)
  {
    super(paramContext, paramWindow, paramc);
  }

  private View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 1;
    Object localObject;
    boolean bool1;
    if (this.VB == null)
    {
      localObject = this.mContext.obtainStyledAttributes(a.a.AppCompatTheme).getString(119);
      if ((localObject == null) || (j.class.getName().equals(localObject)))
        this.VB = new j();
    }
    else
    {
      if (!Vf)
        break label1010;
      if (!(paramAttributeSet instanceof XmlPullParser))
        break label531;
      if (((XmlPullParser)paramAttributeSet).getDepth() <= 1)
        break label525;
      bool1 = true;
    }
    while (true)
    {
      label87: j localj = this.VB;
      boolean bool2 = Vf;
      boolean bool3 = bh.lw();
      if ((bool1) && (paramView != null));
      for (paramView = paramView.getContext(); ; paramView = paramContext)
      {
        localObject = paramView.obtainStyledAttributes(paramAttributeSet, a.a.View, 0, 0);
        if (bool2);
        for (int j = ((TypedArray)localObject).getResourceId(0, 0); ; j = 0)
        {
          if (j == 0)
            j = ((TypedArray)localObject).getResourceId(4, 0);
          while (true)
          {
            ((TypedArray)localObject).recycle();
            if ((j != 0) && ((!(paramView instanceof d)) || (((d)paramView).YN != j)))
              paramView = new d(paramView, j);
            while (true)
            {
              localObject = paramView;
              if (bool3)
                localObject = az.ad(paramView);
              switch (paramString.hashCode())
              {
              default:
                label332: j = -1;
                switch (j)
                {
                default:
                  label335: paramView = null;
                  label406: if ((paramView == null) && (paramContext != localObject))
                    paramView = localj.a((Context)localObject, paramString, paramAttributeSet);
                  break;
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                }
                break;
              case -938935918:
              case 1125864064:
              case 2001146706:
              case 1666676343:
              case -339785223:
              case -937446323:
              case 1601505219:
              case 776382189:
              case -1455429095:
              case 1413872058:
              case -1346021293:
              case -1946472170:
              case -658531749:
              }
              while (true)
              {
                if (paramView != null)
                {
                  paramString = paramView.getContext();
                  if (((paramString instanceof ContextWrapper)) && ((Build.VERSION.SDK_INT < 15) || (s.aw(paramView))))
                    break label950;
                }
                while (true)
                {
                  while (true)
                  {
                    return paramView;
                    try
                    {
                      this.VB = ((j)Class.forName((String)localObject).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    catch (Throwable localThrowable)
                    {
                      new StringBuilder("Failed to instantiate custom view inflater ").append((String)localObject).append(". Falling back to default.");
                      this.VB = new j();
                    }
                  }
                  break;
                  label525: bool1 = false;
                  break label87;
                  label531: bool1 = a((ViewParent)paramView);
                  break label87;
                  if (!paramString.equals("TextView"))
                    break label332;
                  j = 0;
                  break label335;
                  if (!paramString.equals("ImageView"))
                    break label332;
                  j = i;
                  break label335;
                  if (!paramString.equals("Button"))
                    break label332;
                  j = 2;
                  break label335;
                  if (!paramString.equals("EditText"))
                    break label332;
                  j = 3;
                  break label335;
                  if (!paramString.equals("Spinner"))
                    break label332;
                  j = 4;
                  break label335;
                  if (!paramString.equals("ImageButton"))
                    break label332;
                  j = 5;
                  break label335;
                  if (!paramString.equals("CheckBox"))
                    break label332;
                  j = 6;
                  break label335;
                  if (!paramString.equals("RadioButton"))
                    break label332;
                  j = 7;
                  break label335;
                  if (!paramString.equals("CheckedTextView"))
                    break label332;
                  j = 8;
                  break label335;
                  if (!paramString.equals("AutoCompleteTextView"))
                    break label332;
                  j = 9;
                  break label335;
                  if (!paramString.equals("MultiAutoCompleteTextView"))
                    break label332;
                  j = 10;
                  break label335;
                  if (!paramString.equals("RatingBar"))
                    break label332;
                  j = 11;
                  break label335;
                  if (!paramString.equals("SeekBar"))
                    break label332;
                  j = 12;
                  break label335;
                  paramView = new AppCompatTextView((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatImageView((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatButton((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatEditText((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatSpinner((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatImageButton((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatCheckBox((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatRadioButton((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatCheckedTextView((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatAutoCompleteTextView((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatMultiAutoCompleteTextView((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatRatingBar((Context)localObject, paramAttributeSet);
                  break label406;
                  paramView = new AppCompatSeekBar((Context)localObject, paramAttributeSet);
                  break label406;
                  label950: paramContext = paramString.obtainStyledAttributes(paramAttributeSet, j.VU);
                  paramString = paramContext.getString(0);
                  if (paramString != null)
                    paramView.setOnClickListener(new j.a(paramView, paramString));
                  paramContext.recycle();
                }
              }
            }
          }
        }
      }
      label1010: bool1 = false;
    }
  }

  private void a(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    int i = -1;
    if ((paramPanelFeatureState.RP) || (this.UP));
    int j;
    Object localObject;
    label93: label97: label99: 
    do
    {
      do
      {
        while (true)
        {
          return;
          if (paramPanelFeatureState.VG == 0)
            if ((this.mContext.getResources().getConfiguration().screenLayout & 0xF) != 4)
              break label93;
          for (j = 1; ; j = 0)
          {
            if (j != 0)
              break label97;
            localObject = this.Ti.getCallback();
            if ((localObject == null) || (((Window.Callback)localObject).onMenuOpened(paramPanelFeatureState.VG, paramPanelFeatureState.VK)))
              break label99;
            a(paramPanelFeatureState, true);
            break;
          }
        }
        localObject = (WindowManager)this.mContext.getSystemService("window");
      }
      while ((localObject == null) || (!b(paramPanelFeatureState, paramKeyEvent)));
      if ((paramPanelFeatureState.VH != null) && (!paramPanelFeatureState.VQ))
        break label380;
      if (paramPanelFeatureState.VH != null)
        break;
      a(paramPanelFeatureState);
    }
    while (paramPanelFeatureState.VH == null);
    label162: if ((c(paramPanelFeatureState)) && (paramPanelFeatureState.fz()))
    {
      paramKeyEvent = paramPanelFeatureState.VI.getLayoutParams();
      if (paramKeyEvent != null)
        break label417;
      paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
    }
    label417: 
    while (true)
    {
      j = paramPanelFeatureState.background;
      paramPanelFeatureState.VH.setBackgroundResource(j);
      ViewParent localViewParent = paramPanelFeatureState.VI.getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
        ((ViewGroup)localViewParent).removeView(paramPanelFeatureState.VI);
      paramPanelFeatureState.VH.addView(paramPanelFeatureState.VI, paramKeyEvent);
      if (!paramPanelFeatureState.VI.hasFocus())
        paramPanelFeatureState.VI.requestFocus();
      j = -2;
      while (true)
      {
        paramPanelFeatureState.VO = false;
        paramKeyEvent = new WindowManager.LayoutParams(j, -2, paramPanelFeatureState.x, paramPanelFeatureState.y, 1002, 8519680, -3);
        paramKeyEvent.gravity = paramPanelFeatureState.gravity;
        paramKeyEvent.windowAnimations = paramPanelFeatureState.windowAnimations;
        ((WindowManager)localObject).addView(paramPanelFeatureState.VH, paramKeyEvent);
        paramPanelFeatureState.RP = true;
        break;
        if ((!paramPanelFeatureState.VQ) || (paramPanelFeatureState.VH.getChildCount() <= 0))
          break label162;
        paramPanelFeatureState.VH.removeAllViews();
        break label162;
        break;
        label380: if (paramPanelFeatureState.VJ != null)
        {
          paramKeyEvent = paramPanelFeatureState.VJ.getLayoutParams();
          if (paramKeyEvent != null)
          {
            j = i;
            if (paramKeyEvent.width == -1)
              continue;
          }
        }
        else
        {
          j = -2;
        }
      }
    }
  }

  private boolean a(PanelFeatureState paramPanelFeatureState)
  {
    paramPanelFeatureState.V(fo());
    paramPanelFeatureState.VH = new c(paramPanelFeatureState.VM);
    paramPanelFeatureState.gravity = 81;
    return true;
  }

  private boolean a(PanelFeatureState paramPanelFeatureState, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramKeyEvent.isSystem())
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (!paramPanelFeatureState.VN)
      {
        bool2 = bool1;
        if (!b(paramPanelFeatureState, paramKeyEvent));
      }
      else
      {
        bool2 = bool1;
        if (paramPanelFeatureState.VK != null)
          bool2 = paramPanelFeatureState.VK.performShortcut(paramInt, paramKeyEvent, 1);
      }
    }
  }

  private boolean a(ViewParent paramViewParent)
  {
    boolean bool;
    if (paramViewParent == null)
    {
      bool = false;
      return bool;
    }
    View localView = this.Ti.getDecorView();
    while (true)
    {
      if (paramViewParent == null)
      {
        bool = true;
        break;
      }
      if ((paramViewParent == localView) || (!(paramViewParent instanceof View)) || (s.av((View)paramViewParent)))
      {
        bool = false;
        break;
      }
      paramViewParent = paramViewParent.getParent();
    }
  }

  private boolean b(PanelFeatureState paramPanelFeatureState)
  {
    Context localContext = this.mContext;
    TypedValue localTypedValue;
    Resources.Theme localTheme;
    Object localObject1;
    if (((paramPanelFeatureState.VG == 0) || (paramPanelFeatureState.VG == 108)) && (this.Vg != null))
    {
      localTypedValue = new TypedValue();
      localTheme = localContext.getTheme();
      localTheme.resolveAttribute(2130772137, localTypedValue, true);
      localObject1 = null;
      if (localTypedValue.resourceId != 0)
      {
        localObject1 = localContext.getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(localTheme);
        ((Resources.Theme)localObject1).applyStyle(localTypedValue.resourceId, true);
        ((Resources.Theme)localObject1).resolveAttribute(2130772138, localTypedValue, true);
        Object localObject2 = localObject1;
        if (localTypedValue.resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localContext.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(localTypedValue.resourceId, true);
        }
        if (localObject2 == null)
          break label211;
        localObject1 = new d(localContext, 0);
        ((Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
      }
    }
    while (true)
    {
      localObject1 = new h((Context)localObject1);
      ((h)localObject1).a(this);
      paramPanelFeatureState.e((h)localObject1);
      return true;
      localTheme.resolveAttribute(2130772138, localTypedValue, true);
      break;
      label211: localObject1 = localContext;
    }
  }

  private boolean b(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    boolean bool1 = false;
    if (this.UP)
      bool2 = bool1;
    int i;
    while (true)
    {
      return bool2;
      if (paramPanelFeatureState.VN)
      {
        bool2 = true;
      }
      else
      {
        if ((this.Vv != null) && (this.Vv != paramPanelFeatureState))
          a(this.Vv, false);
        Window.Callback localCallback = this.Ti.getCallback();
        if (localCallback != null)
          paramPanelFeatureState.VJ = localCallback.onCreatePanelView(paramPanelFeatureState.VG);
        if ((paramPanelFeatureState.VG == 0) || (paramPanelFeatureState.VG == 108));
        for (i = 1; ; i = 0)
        {
          if ((i != 0) && (this.Vg != null))
            this.Vg.gX();
          if ((paramPanelFeatureState.VJ != null) || ((i != 0) && ((this.mActionBar instanceof l))))
            break label444;
          if ((paramPanelFeatureState.VK != null) && (!paramPanelFeatureState.VR))
            break label307;
          if (paramPanelFeatureState.VK == null)
          {
            b(paramPanelFeatureState);
            bool2 = bool1;
            if (paramPanelFeatureState.VK == null)
              break;
          }
          if ((i != 0) && (this.Vg != null))
          {
            if (this.Vh == null)
              this.Vh = new a();
            this.Vg.a(paramPanelFeatureState.VK, this.Vh);
          }
          paramPanelFeatureState.VK.gx();
          if (localCallback.onCreatePanelMenu(paramPanelFeatureState.VG, paramPanelFeatureState.VK))
            break label302;
          paramPanelFeatureState.e(null);
          bool2 = bool1;
          if (i == 0)
            break;
          bool2 = bool1;
          if (this.Vg == null)
            break;
          this.Vg.a(null, this.Vh);
          bool2 = bool1;
          break;
        }
        label302: paramPanelFeatureState.VR = false;
        label307: paramPanelFeatureState.VK.gx();
        if (paramPanelFeatureState.VS != null)
        {
          paramPanelFeatureState.VK.e(paramPanelFeatureState.VS);
          paramPanelFeatureState.VS = null;
        }
        if (localCallback.onPreparePanel(0, paramPanelFeatureState.VJ, paramPanelFeatureState.VK))
          break;
        if ((i != 0) && (this.Vg != null))
          this.Vg.a(null, this.Vh);
        paramPanelFeatureState.VK.gy();
        bool2 = bool1;
      }
    }
    if (paramKeyEvent != null)
    {
      i = paramKeyEvent.getDeviceId();
      label405: if (KeyCharacterMap.load(i).getKeyboardType() == 1)
        break label471;
    }
    label444: label471: for (boolean bool2 = true; ; bool2 = false)
    {
      paramPanelFeatureState.VP = bool2;
      paramPanelFeatureState.VK.setQwertyMode(paramPanelFeatureState.VP);
      paramPanelFeatureState.VK.gy();
      paramPanelFeatureState.VN = true;
      paramPanelFeatureState.VO = false;
      this.Vv = paramPanelFeatureState;
      bool2 = true;
      break;
      i = -1;
      break label405;
    }
  }

  private static int bk(int paramInt)
  {
    int i;
    if (paramInt == 8)
      i = 108;
    while (true)
    {
      return i;
      i = paramInt;
      if (paramInt == 9)
        i = 109;
    }
  }

  private boolean c(PanelFeatureState paramPanelFeatureState)
  {
    boolean bool;
    if (paramPanelFeatureState.VJ != null)
    {
      paramPanelFeatureState.VI = paramPanelFeatureState.VJ;
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramPanelFeatureState.VK == null)
      {
        bool = false;
      }
      else
      {
        if (this.Vi == null)
          this.Vi = new d();
        paramPanelFeatureState.VI = ((View)paramPanelFeatureState.b(this.Vi));
        if (paramPanelFeatureState.VI != null)
          bool = true;
        else
          bool = false;
      }
    }
  }

  private void fr()
  {
    if (!this.Vo)
    {
      this.Vp = fs();
      Object localObject = getTitle();
      if (!TextUtils.isEmpty((CharSequence)localObject))
        k((CharSequence)localObject);
      ft();
      this.Vo = true;
      localObject = bh(0);
      if ((!this.UP) && ((localObject == null) || (((PanelFeatureState)localObject).VK == null)))
        invalidatePanelMenu(108);
    }
  }

  private ViewGroup fs()
  {
    Object localObject = this.mContext.obtainStyledAttributes(a.a.AppCompatTheme);
    if (!((TypedArray)localObject).hasValue(2))
    {
      ((TypedArray)localObject).recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    if (((TypedArray)localObject).getBoolean(3, false))
    {
      requestWindowFeature(1);
      if (((TypedArray)localObject).getBoolean(4, false))
        requestWindowFeature(109);
      if (((TypedArray)localObject).getBoolean(5, false))
        requestWindowFeature(10);
      this.UM = ((TypedArray)localObject).getBoolean(0, false);
      ((TypedArray)localObject).recycle();
      this.Ti.getDecorView();
      localObject = LayoutInflater.from(this.mContext);
      if (this.UN)
        break label418;
      if (!this.UM)
        break label256;
      localObject = (ViewGroup)((LayoutInflater)localObject).inflate(2130968595, null);
      this.UK = false;
      this.UJ = false;
    }
    while (true)
    {
      if (localObject == null)
      {
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.UJ + ", windowActionBarOverlay: " + this.UK + ", android:windowIsFloating: " + this.UM + ", windowActionModeOverlay: " + this.UL + ", windowNoTitle: " + this.UN + " }");
        if (!((TypedArray)localObject).getBoolean(2, false))
          break;
        requestWindowFeature(108);
        break;
        label256: if (!this.UJ)
          break label626;
        localObject = new TypedValue();
        this.mContext.getTheme().resolveAttribute(2130772137, (TypedValue)localObject, true);
        if (((TypedValue)localObject).resourceId != 0);
        for (localObject = new d(this.mContext, ((TypedValue)localObject).resourceId); ; localObject = this.mContext)
        {
          localObject = (ViewGroup)LayoutInflater.from((Context)localObject).inflate(2130968606, null);
          this.Vg = ((android.support.v7.widget.w)((ViewGroup)localObject).findViewById(2131820939));
          this.Vg.setWindowCallback(this.Ti.getCallback());
          if (this.UK)
            this.Vg.bs(109);
          if (this.Vr)
            this.Vg.bs(2);
          if (this.Vs)
            this.Vg.bs(5);
          break;
        }
        label418: if (this.UL);
        for (localObject = (ViewGroup)((LayoutInflater)localObject).inflate(2130968605, null); ; localObject = (ViewGroup)((LayoutInflater)localObject).inflate(2130968604, null))
        {
          if (Build.VERSION.SDK_INT < 21)
            break label475;
          s.a((View)localObject, new android.support.v4.view.o()
          {
            public final aa a(View paramAnonymousView, aa paramAnonymousaa)
            {
              int i = paramAnonymousaa.getSystemWindowInsetTop();
              int j = AppCompatDelegateImplV9.this.bj(i);
              aa localaa = paramAnonymousaa;
              if (i != j)
                localaa = paramAnonymousaa.f(paramAnonymousaa.getSystemWindowInsetLeft(), j, paramAnonymousaa.getSystemWindowInsetRight(), paramAnonymousaa.getSystemWindowInsetBottom());
              return s.a(paramAnonymousView, localaa);
            }
          });
          break;
        }
        label475: ((ad)localObject).setOnFitSystemWindowsListener(new ad.a()
        {
          public final void f(Rect paramAnonymousRect)
          {
            paramAnonymousRect.top = AppCompatDelegateImplV9.this.bj(paramAnonymousRect.top);
          }
        });
        continue;
      }
      if (this.Vg == null)
        this.TF = ((TextView)((ViewGroup)localObject).findViewById(2131820678));
      bk.bX((View)localObject);
      ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)((ViewGroup)localObject).findViewById(2131820544);
      ViewGroup localViewGroup = (ViewGroup)this.Ti.findViewById(16908290);
      if (localViewGroup != null)
      {
        while (localViewGroup.getChildCount() > 0)
        {
          View localView = localViewGroup.getChildAt(0);
          localViewGroup.removeViewAt(0);
          localContentFrameLayout.addView(localView);
        }
        localViewGroup.setId(-1);
        localContentFrameLayout.setId(16908290);
        if ((localViewGroup instanceof FrameLayout))
          ((FrameLayout)localViewGroup).setForeground(null);
      }
      this.Ti.setContentView((View)localObject);
      localContentFrameLayout.setAttachListener(new ContentFrameLayout.a()
      {
        public final void onDetachedFromWindow()
        {
          AppCompatDelegateImplV9.this.fy();
        }
      });
      return localObject;
      label626: localObject = null;
    }
  }

  private void ft()
  {
    ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)this.Vp.findViewById(16908290);
    Object localObject = this.Ti.getDecorView();
    localContentFrameLayout.j(((View)localObject).getPaddingLeft(), ((View)localObject).getPaddingTop(), ((View)localObject).getPaddingRight(), ((View)localObject).getPaddingBottom());
    localObject = this.mContext.obtainStyledAttributes(a.a.AppCompatTheme);
    ((TypedArray)localObject).getValue(10, localContentFrameLayout.getMinWidthMajor());
    ((TypedArray)localObject).getValue(11, localContentFrameLayout.getMinWidthMinor());
    if (((TypedArray)localObject).hasValue(6))
      ((TypedArray)localObject).getValue(6, localContentFrameLayout.getFixedWidthMajor());
    if (((TypedArray)localObject).hasValue(8))
      ((TypedArray)localObject).getValue(8, localContentFrameLayout.getFixedWidthMinor());
    if (((TypedArray)localObject).hasValue(9))
      ((TypedArray)localObject).getValue(9, localContentFrameLayout.getFixedHeightMajor());
    if (((TypedArray)localObject).hasValue(7))
      ((TypedArray)localObject).getValue(7, localContentFrameLayout.getFixedHeightMinor());
    ((TypedArray)localObject).recycle();
    localContentFrameLayout.requestLayout();
  }

  private void fx()
  {
    if (this.Vo)
      throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }

  private void invalidatePanelMenu(int paramInt)
  {
    this.Vy |= 1 << paramInt;
    if (!this.Vx)
    {
      s.b(this.Ti.getDecorView(), this.Vz);
      this.Vx = true;
    }
  }

  final PanelFeatureState a(Menu paramMenu)
  {
    PanelFeatureState[] arrayOfPanelFeatureState = this.Vu;
    int i;
    int j;
    label15: PanelFeatureState localPanelFeatureState;
    if (arrayOfPanelFeatureState != null)
    {
      i = arrayOfPanelFeatureState.length;
      j = 0;
      if (j >= i)
        break label57;
      localPanelFeatureState = arrayOfPanelFeatureState[j];
      if ((localPanelFeatureState == null) || (localPanelFeatureState.VK != paramMenu))
        break label51;
    }
    label51: label57: for (paramMenu = localPanelFeatureState; ; paramMenu = null)
    {
      return paramMenu;
      i = 0;
      break;
      j++;
      break label15;
    }
  }

  View a(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((this.UG instanceof LayoutInflater.Factory))
    {
      paramString = ((LayoutInflater.Factory)this.UG).onCreateView(paramString, paramContext, paramAttributeSet);
      if (paramString == null);
    }
    while (true)
    {
      return paramString;
      paramString = null;
    }
  }

  final void a(int paramInt, PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    Object localObject1 = paramPanelFeatureState;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      PanelFeatureState localPanelFeatureState = paramPanelFeatureState;
      if (paramPanelFeatureState == null)
      {
        localPanelFeatureState = paramPanelFeatureState;
        if (paramInt >= 0)
        {
          localPanelFeatureState = paramPanelFeatureState;
          if (paramInt < this.Vu.length)
            localPanelFeatureState = this.Vu[paramInt];
        }
      }
      localObject1 = localPanelFeatureState;
      localObject2 = paramMenu;
      if (localPanelFeatureState != null)
      {
        localObject2 = localPanelFeatureState.VK;
        localObject1 = localPanelFeatureState;
      }
    }
    if ((localObject1 != null) && (!((PanelFeatureState)localObject1).RP));
    while (true)
    {
      return;
      if (!this.UP)
        this.UG.onPanelClosed(paramInt, (Menu)localObject2);
    }
  }

  final void a(PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramPanelFeatureState.VG == 0) && (this.Vg != null) && (this.Vg.isOverflowMenuShowing()))
      c(paramPanelFeatureState.VK);
    while (true)
    {
      return;
      WindowManager localWindowManager = (WindowManager)this.mContext.getSystemService("window");
      if ((localWindowManager != null) && (paramPanelFeatureState.RP) && (paramPanelFeatureState.VH != null))
      {
        localWindowManager.removeView(paramPanelFeatureState.VH);
        if (paramBoolean)
          a(paramPanelFeatureState.VG, paramPanelFeatureState, null);
      }
      paramPanelFeatureState.VN = false;
      paramPanelFeatureState.VO = false;
      paramPanelFeatureState.RP = false;
      paramPanelFeatureState.VI = null;
      paramPanelFeatureState.VQ = true;
      if (this.Vv == paramPanelFeatureState)
        this.Vv = null;
    }
  }

  public final boolean a(h paramh, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = this.Ti.getCallback();
    if ((localCallback != null) && (!this.UP))
    {
      paramh = a(paramh.gE());
      if (paramh == null);
    }
    for (boolean bool = localCallback.onMenuItemSelected(paramh.VG, paramMenuItem); ; bool = false)
      return bool;
  }

  public final void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    fr();
    ((ViewGroup)this.Vp.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.UG.onContentChanged();
  }

  final android.support.v7.view.b b(b.a parama)
  {
    fv();
    if (this.Vj != null)
      this.Vj.finish();
    if ((this.UI != null) && (!this.UP));
    while (true)
    {
      try
      {
        android.support.v7.view.b localb = this.UI.onWindowStartingSupportActionMode(parama);
        if (localb == null)
          break label90;
        this.Vj = localb;
        if ((this.Vj != null) && (this.UI != null))
          this.UI.onSupportActionModeStarted(this.Vj);
        return this.Vj;
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
      }
      Object localObject1 = null;
      continue;
      label90: Object localObject2;
      label187: boolean bool;
      if (this.Vk == null)
      {
        if (!this.UM)
          break label465;
        localObject2 = new TypedValue();
        localObject1 = this.mContext.getTheme();
        ((Resources.Theme)localObject1).resolveAttribute(2130772137, (TypedValue)localObject2, true);
        if (((TypedValue)localObject2).resourceId != 0)
        {
          Resources.Theme localTheme = this.mContext.getResources().newTheme();
          localTheme.setTo((Resources.Theme)localObject1);
          localTheme.applyStyle(((TypedValue)localObject2).resourceId, true);
          localObject1 = new d(this.mContext, 0);
          ((Context)localObject1).getTheme().setTo(localTheme);
          this.Vk = new ActionBarContextView((Context)localObject1);
          this.Vl = new PopupWindow((Context)localObject1, null, 2130772156);
          n.a(this.Vl, 2);
          this.Vl.setContentView(this.Vk);
          this.Vl.setWidth(-1);
          ((Context)localObject1).getTheme().resolveAttribute(2130772139, (TypedValue)localObject2, true);
          int i = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject2).data, ((Context)localObject1).getResources().getDisplayMetrics());
          this.Vk.setContentHeight(i);
          this.Vl.setHeight(-2);
          this.Vm = new Runnable()
          {
            public final void run()
            {
              AppCompatDelegateImplV9.this.Vl.showAtLocation(AppCompatDelegateImplV9.this.Vk, 55, 0, 0);
              AppCompatDelegateImplV9.this.fv();
              if (AppCompatDelegateImplV9.this.fu())
              {
                AppCompatDelegateImplV9.this.Vk.setAlpha(0.0F);
                AppCompatDelegateImplV9.this.Vn = s.ab(AppCompatDelegateImplV9.this.Vk).t(1.0F);
                AppCompatDelegateImplV9.this.Vn.a(new y()
                {
                  public final void aA(View paramAnonymous2View)
                  {
                    AppCompatDelegateImplV9.this.Vk.setAlpha(1.0F);
                    AppCompatDelegateImplV9.this.Vn.a(null);
                    AppCompatDelegateImplV9.this.Vn = null;
                  }

                  public final void az(View paramAnonymous2View)
                  {
                    AppCompatDelegateImplV9.this.Vk.setVisibility(0);
                  }
                });
              }
              while (true)
              {
                return;
                AppCompatDelegateImplV9.this.Vk.setAlpha(1.0F);
                AppCompatDelegateImplV9.this.Vk.setVisibility(0);
              }
            }
          };
        }
      }
      else
      {
        label301: if (this.Vk == null)
          break label506;
        fv();
        this.Vk.gS();
        localObject2 = this.Vk.getContext();
        localObject1 = this.Vk;
        if (this.Vl != null)
          break label508;
        bool = true;
        label342: localObject1 = new android.support.v7.view.e((Context)localObject2, (ActionBarContextView)localObject1, parama, bool);
        if (!parama.a((android.support.v7.view.b)localObject1, ((android.support.v7.view.b)localObject1).getMenu()))
          break label568;
        ((android.support.v7.view.b)localObject1).invalidate();
        this.Vk.c((android.support.v7.view.b)localObject1);
        this.Vj = ((android.support.v7.view.b)localObject1);
        if (!fu())
          break label514;
        this.Vk.setAlpha(0.0F);
        this.Vn = s.ab(this.Vk).t(1.0F);
        this.Vn.a(new y()
        {
          public final void aA(View paramAnonymousView)
          {
            AppCompatDelegateImplV9.this.Vk.setAlpha(1.0F);
            AppCompatDelegateImplV9.this.Vn.a(null);
            AppCompatDelegateImplV9.this.Vn = null;
          }

          public final void az(View paramAnonymousView)
          {
            AppCompatDelegateImplV9.this.Vk.setVisibility(0);
            AppCompatDelegateImplV9.this.Vk.sendAccessibilityEvent(32);
            if ((AppCompatDelegateImplV9.this.Vk.getParent() instanceof View))
              s.ak((View)AppCompatDelegateImplV9.this.Vk.getParent());
          }
        });
      }
      while (true)
      {
        if (this.Vl == null)
          break label566;
        this.Ti.getDecorView().post(this.Vm);
        break;
        localObject1 = this.mContext;
        break label187;
        label465: localObject1 = (ViewStubCompat)this.Vp.findViewById(2131820937);
        if (localObject1 == null)
          break label301;
        ((ViewStubCompat)localObject1).setLayoutInflater(LayoutInflater.from(fo()));
        this.Vk = ((ActionBarContextView)((ViewStubCompat)localObject1).inflate());
        break label301;
        label506: break;
        label508: bool = false;
        break label342;
        label514: this.Vk.setAlpha(1.0F);
        this.Vk.setVisibility(0);
        this.Vk.sendAccessibilityEvent(32);
        if ((this.Vk.getParent() instanceof View))
          s.ak((View)this.Vk.getParent());
      }
      label566: continue;
      label568: this.Vj = null;
    }
  }

  public final void b(h paramh)
  {
    if ((this.Vg != null) && (this.Vg.gV()) && ((!ViewConfiguration.get(this.mContext).hasPermanentMenuKey()) || (this.Vg.gW())))
    {
      paramh = this.Ti.getCallback();
      if (!this.Vg.isOverflowMenuShowing())
        if ((paramh != null) && (!this.UP))
        {
          if ((this.Vx) && ((this.Vy & 0x1) != 0))
          {
            this.Ti.getDecorView().removeCallbacks(this.Vz);
            this.Vz.run();
          }
          PanelFeatureState localPanelFeatureState = bh(0);
          if ((localPanelFeatureState.VK != null) && (!localPanelFeatureState.VR) && (paramh.onPreparePanel(0, localPanelFeatureState.VJ, localPanelFeatureState.VK)))
          {
            paramh.onMenuOpened(108, localPanelFeatureState.VK);
            this.Vg.showOverflowMenu();
          }
        }
    }
    while (true)
    {
      return;
      this.Vg.hideOverflowMenu();
      if (!this.UP)
      {
        paramh.onPanelClosed(108, bh(0).VK);
        continue;
        paramh = bh(0);
        paramh.VQ = true;
        a(paramh, false);
        a(paramh, null);
      }
    }
  }

  final void bd(int paramInt)
  {
    Object localObject;
    if (paramInt == 108)
    {
      localObject = getSupportActionBar();
      if (localObject != null)
        ((ActionBar)localObject).M(false);
    }
    while (true)
    {
      return;
      if (paramInt == 0)
      {
        localObject = bh(paramInt);
        if (((PanelFeatureState)localObject).RP)
          a((PanelFeatureState)localObject, false);
      }
    }
  }

  final boolean be(int paramInt)
  {
    boolean bool1 = true;
    if (paramInt == 108)
    {
      ActionBar localActionBar = getSupportActionBar();
      bool2 = bool1;
      if (localActionBar != null)
        localActionBar.M(true);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  protected final PanelFeatureState bh(int paramInt)
  {
    Object localObject1 = this.Vu;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (localObject1.length > paramInt);
    }
    else
    {
      localObject2 = new PanelFeatureState[paramInt + 1];
      if (localObject1 != null)
        System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
      this.Vu = ((PanelFeatureState[])localObject2);
    }
    localObject1 = localObject2[paramInt];
    if (localObject1 == null)
    {
      localObject1 = new PanelFeatureState(paramInt);
      localObject2[paramInt] = localObject1;
    }
    for (Object localObject2 = localObject1; ; localObject2 = localObject1)
      return localObject2;
  }

  final void bi(int paramInt)
  {
    PanelFeatureState localPanelFeatureState = bh(paramInt);
    Object localObject;
    if (localPanelFeatureState.VK != null)
    {
      localObject = new Bundle();
      localPanelFeatureState.VK.d((Bundle)localObject);
      if (((Bundle)localObject).size() > 0)
        localPanelFeatureState.VS = ((Bundle)localObject);
      localPanelFeatureState.VK.gx();
      localPanelFeatureState.VK.clear();
    }
    localPanelFeatureState.VR = true;
    localPanelFeatureState.VQ = true;
    if (((paramInt == 108) || (paramInt == 0)) && (this.Vg != null))
    {
      localObject = bh(0);
      if (localObject != null)
      {
        ((PanelFeatureState)localObject).VN = false;
        b((PanelFeatureState)localObject, null);
      }
    }
  }

  final int bj(int paramInt)
  {
    int i = 1;
    int j = 0;
    Object localObject1;
    Object localObject2;
    label200: label207: int m;
    if ((this.Vk != null) && ((this.Vk.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject1 = (ViewGroup.MarginLayoutParams)this.Vk.getLayoutParams();
      if (this.Vk.isShown())
      {
        if (this.qS == null)
        {
          this.qS = new Rect();
          this.qT = new Rect();
        }
        localObject2 = this.qS;
        Rect localRect = this.qT;
        ((Rect)localObject2).set(0, paramInt, 0, 0);
        bk.a(this.Vp, (Rect)localObject2, localRect);
        if (localRect.top == 0)
        {
          k = paramInt;
          if (((ViewGroup.MarginLayoutParams)localObject1).topMargin == k)
            break label370;
          ((ViewGroup.MarginLayoutParams)localObject1).topMargin = paramInt;
          if (this.Vq != null)
            break label287;
          this.Vq = new View(this.mContext);
          this.Vq.setBackgroundColor(this.mContext.getResources().getColor(2131689631));
          this.Vp.addView(this.Vq, -1, new ViewGroup.LayoutParams(-1, paramInt));
          k = 1;
          if (this.Vq == null)
            break label326;
          m = paramInt;
          if (!this.UL)
          {
            m = paramInt;
            if (i != 0)
              m = 0;
          }
          paramInt = m;
          m = i;
          label233: if (k != 0)
            this.Vk.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
      }
    }
    for (int k = m; ; k = 0)
    {
      if (this.Vq != null)
      {
        localObject1 = this.Vq;
        if (k == 0)
          break label354;
      }
      label287: label326: label354: for (k = j; ; k = 8)
      {
        ((View)localObject1).setVisibility(k);
        return paramInt;
        k = 0;
        break;
        localObject2 = this.Vq.getLayoutParams();
        if (((ViewGroup.LayoutParams)localObject2).height != paramInt)
        {
          ((ViewGroup.LayoutParams)localObject2).height = paramInt;
          this.Vq.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        k = 1;
        break label200;
        i = 0;
        break label207;
        if (((ViewGroup.MarginLayoutParams)localObject1).topMargin == 0)
          break label361;
        ((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;
        k = 1;
        m = 0;
        break label233;
      }
      label361: k = 0;
      m = 0;
      break label233;
      label370: k = 0;
      break label200;
    }
  }

  final void c(h paramh)
  {
    if (this.Vt);
    while (true)
    {
      return;
      this.Vt = true;
      this.Vg.fy();
      Window.Callback localCallback = this.Ti.getCallback();
      if ((localCallback != null) && (!this.UP))
        localCallback.onPanelClosed(108, paramh);
      this.Vt = false;
    }
  }

  final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramKeyEvent.getKeyCode() == 82) && (this.UG.dispatchKeyEvent(paramKeyEvent)))
      bool2 = bool1;
    int j;
    label184: 
    do
    {
      while (true)
      {
        return bool2;
        int i = paramKeyEvent.getKeyCode();
        if (paramKeyEvent.getAction() == 0)
          j = 1;
        while (true)
          if (j != 0)
            switch (i)
            {
            default:
              bool2 = false;
              break;
              j = 0;
              break;
            case 82:
              bool2 = bool1;
              if (paramKeyEvent.getRepeatCount() != 0)
                break;
              localPanelFeatureState = bh(0);
              bool2 = bool1;
              if (localPanelFeatureState.RP)
                break;
              b(localPanelFeatureState, paramKeyEvent);
              bool2 = bool1;
              break;
            case 4:
              if ((paramKeyEvent.getFlags() & 0x80) != 0);
              for (bool3 = true; ; bool3 = false)
              {
                this.Vw = bool3;
                break;
              }
            }
        switch (i)
        {
        default:
          bool2 = false;
        case 82:
        case 4:
        }
      }
      bool2 = bool1;
    }
    while (this.Vj != null);
    PanelFeatureState localPanelFeatureState = bh(0);
    if ((this.Vg != null) && (this.Vg.gV()) && (!ViewConfiguration.get(this.mContext).hasPermanentMenuKey()))
      if (!this.Vg.isOverflowMenuShowing())
      {
        if ((this.UP) || (!b(localPanelFeatureState, paramKeyEvent)))
          break label511;
        bool3 = this.Vg.showOverflowMenu();
      }
    while (true)
    {
      label277: bool2 = bool1;
      if (!bool3)
        break;
      paramKeyEvent = (AudioManager)this.mContext.getSystemService("audio");
      bool2 = bool1;
      if (paramKeyEvent == null)
        break;
      paramKeyEvent.playSoundEffect(0);
      bool2 = bool1;
      break;
      bool3 = this.Vg.hideOverflowMenu();
      continue;
      if ((!localPanelFeatureState.RP) && (!localPanelFeatureState.VO))
        break label361;
      bool3 = localPanelFeatureState.RP;
      a(localPanelFeatureState, true);
    }
    label361: if (localPanelFeatureState.VN)
    {
      if (!localPanelFeatureState.VR)
        break label517;
      localPanelFeatureState.VN = false;
    }
    label517: for (boolean bool3 = b(localPanelFeatureState, paramKeyEvent); ; bool3 = true)
    {
      if (bool3)
      {
        a(localPanelFeatureState, paramKeyEvent);
        bool3 = true;
        break label277;
        bool3 = this.Vw;
        this.Vw = false;
        paramKeyEvent = bh(0);
        if ((paramKeyEvent != null) && (paramKeyEvent.RP))
        {
          bool2 = bool1;
          if (bool3)
            break;
          a(paramKeyEvent, true);
          bool2 = bool1;
          break;
        }
        if (this.Vj != null)
        {
          this.Vj.finish();
          j = 1;
        }
        while (true)
        {
          if (j == 0)
            break label509;
          bool2 = bool1;
          break;
          paramKeyEvent = getSupportActionBar();
          if ((paramKeyEvent != null) && (paramKeyEvent.collapseActionView()))
            j = 1;
          else
            j = 0;
        }
        label509: break label184;
      }
      label511: bool3 = false;
      break label277;
    }
  }

  public final <T extends View> T findViewById(int paramInt)
  {
    fr();
    return this.Ti.findViewById(paramInt);
  }

  public final void fj()
  {
    fr();
  }

  public final void fk()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.mContext);
    if (localLayoutInflater.getFactory() == null)
      android.support.v4.view.e.b(localLayoutInflater, this);
    while (true)
    {
      return;
      localLayoutInflater.getFactory2();
    }
  }

  public final void fn()
  {
    fr();
    if ((!this.UJ) || (this.mActionBar != null));
    label101: 
    while (true)
    {
      return;
      if ((this.UG instanceof Activity))
        this.mActionBar = new o((Activity)this.UG, this.UK);
      while (true)
      {
        if (this.mActionBar == null)
          break label101;
        this.mActionBar.K(this.VA);
        break;
        if ((this.UG instanceof Dialog))
          this.mActionBar = new o((Dialog)this.UG);
      }
    }
  }

  final boolean fu()
  {
    if ((this.Vo) && (this.Vp != null) && (s.as(this.Vp)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void fv()
  {
    if (this.Vn != null)
      this.Vn.cancel();
  }

  final void fw()
  {
    a(bh(0), true);
  }

  final void fy()
  {
    if (this.Vg != null)
      this.Vg.fy();
    if (this.Vl != null)
    {
      this.Ti.getDecorView().removeCallbacks(this.Vm);
      if (!this.Vl.isShowing());
    }
    try
    {
      this.Vl.dismiss();
      label55: this.Vl = null;
      fv();
      PanelFeatureState localPanelFeatureState = bh(0);
      if ((localPanelFeatureState != null) && (localPanelFeatureState.VK != null))
        localPanelFeatureState.VK.close();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label55;
    }
  }

  public final void invalidateOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    if ((localActionBar != null) && (localActionBar.fh()));
    while (true)
    {
      return;
      invalidatePanelMenu(0);
    }
  }

  final void k(CharSequence paramCharSequence)
  {
    if (this.Vg != null)
      this.Vg.setWindowTitle(paramCharSequence);
    while (true)
    {
      return;
      if (this.mActionBar != null)
        this.mActionBar.setWindowTitle(paramCharSequence);
      else if (this.TF != null)
        this.TF.setText(paramCharSequence);
    }
  }

  public final void onConfigurationChanged(Configuration arg1)
  {
    if ((this.UJ) && (this.Vo))
    {
      localObject1 = getSupportActionBar();
      if (localObject1 != null)
        ((ActionBar)localObject1).onConfigurationChanged(???);
    }
    Object localObject1 = i.hE();
    Context localContext = this.mContext;
    synchronized (((i)localObject1).afH)
    {
      localObject1 = (android.support.v4.f.f)((i)localObject1).afI.get(localContext);
      if (localObject1 != null)
        ((android.support.v4.f.f)localObject1).clear();
      fl();
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    if (((this.UG instanceof Activity)) && (t.g((Activity)this.UG) != null))
    {
      paramBundle = this.mActionBar;
      if (paramBundle != null)
        break label38;
      this.VA = true;
    }
    while (true)
    {
      return;
      label38: paramBundle.K(true);
    }
  }

  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = a(paramString, paramContext, paramAttributeSet);
    if (localView != null);
    for (paramView = localView; ; paramView = a(paramView, paramString, paramContext, paramAttributeSet))
      return paramView;
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }

  public void onDestroy()
  {
    if (this.Vx)
      this.Ti.getDecorView().removeCallbacks(this.Vz);
    super.onDestroy();
    if (this.mActionBar != null)
      this.mActionBar.onDestroy();
  }

  final boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    Object localObject = getSupportActionBar();
    boolean bool2;
    if ((localObject != null) && (((ActionBar)localObject).onKeyShortcut(paramInt, paramKeyEvent)))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if ((this.Vv != null) && (a(this.Vv, paramKeyEvent.getKeyCode(), paramKeyEvent)))
      {
        bool2 = bool1;
        if (this.Vv != null)
        {
          this.Vv.VO = true;
          bool2 = bool1;
        }
      }
      else if (this.Vv == null)
      {
        localObject = bh(0);
        b((PanelFeatureState)localObject, paramKeyEvent);
        boolean bool3 = a((PanelFeatureState)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent);
        ((PanelFeatureState)localObject).VN = false;
        bool2 = bool1;
        if (bool3);
      }
      else
      {
        bool2 = false;
      }
    }
  }

  public final void onPostResume()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null)
      localActionBar.L(true);
  }

  public void onStop()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null)
      localActionBar.L(false);
  }

  public final boolean requestWindowFeature(int paramInt)
  {
    boolean bool = false;
    paramInt = bk(paramInt);
    if ((this.UN) && (paramInt == 108));
    while (true)
    {
      return bool;
      if ((this.UJ) && (paramInt == 1))
        this.UJ = false;
      switch (paramInt)
      {
      default:
        bool = this.Ti.requestFeature(paramInt);
        break;
      case 108:
        fx();
        this.UJ = true;
        bool = true;
        break;
      case 109:
        fx();
        this.UK = true;
        bool = true;
        break;
      case 10:
        fx();
        this.UL = true;
        bool = true;
        break;
      case 2:
        fx();
        this.Vr = true;
        bool = true;
        break;
      case 5:
        fx();
        this.Vs = true;
        bool = true;
        break;
      case 1:
        fx();
        this.UN = true;
        bool = true;
      }
    }
  }

  public final void setContentView(int paramInt)
  {
    fr();
    ViewGroup localViewGroup = (ViewGroup)this.Vp.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.mContext).inflate(paramInt, localViewGroup);
    this.UG.onContentChanged();
  }

  public final void setContentView(View paramView)
  {
    fr();
    ViewGroup localViewGroup = (ViewGroup)this.Vp.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.UG.onContentChanged();
  }

  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    fr();
    ViewGroup localViewGroup = (ViewGroup)this.Vp.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.UG.onContentChanged();
  }

  public final void setSupportActionBar(Toolbar paramToolbar)
  {
    if (!(this.UG instanceof Activity))
      return;
    ActionBar localActionBar = getSupportActionBar();
    if ((localActionBar instanceof o))
      throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    this.mY = null;
    if (localActionBar != null)
      localActionBar.onDestroy();
    if (paramToolbar != null)
    {
      paramToolbar = new l(paramToolbar, ((Activity)this.UG).getTitle(), this.UH);
      this.mActionBar = paramToolbar;
      this.Ti.setCallback(paramToolbar.Wm);
    }
    while (true)
    {
      invalidateOptionsMenu();
      break;
      this.mActionBar = null;
      this.Ti.setCallback(this.UH);
    }
  }

  public final android.support.v7.view.b startSupportActionMode(b.a parama)
  {
    if (parama == null)
      throw new IllegalArgumentException("ActionMode callback can not be null.");
    if (this.Vj != null)
      this.Vj.finish();
    b localb = new b(parama);
    parama = getSupportActionBar();
    if (parama != null)
    {
      this.Vj = parama.a(localb);
      if ((this.Vj != null) && (this.UI != null))
        this.UI.onSupportActionModeStarted(this.Vj);
    }
    if (this.Vj == null)
      this.Vj = b(localb);
    return this.Vj;
  }

  protected static final class PanelFeatureState
  {
    boolean RP;
    int VG;
    ViewGroup VH;
    View VI;
    View VJ;
    h VK;
    android.support.v7.view.menu.f VL;
    Context VM;
    boolean VN;
    boolean VO;
    public boolean VP;
    boolean VQ;
    boolean VR;
    Bundle VS;
    int background;
    int gravity;
    int windowAnimations;
    int x;
    int y;

    PanelFeatureState(int paramInt)
    {
      this.VG = paramInt;
      this.VQ = false;
    }

    final void V(Context paramContext)
    {
      TypedValue localTypedValue = new TypedValue();
      Resources.Theme localTheme = paramContext.getResources().newTheme();
      localTheme.setTo(paramContext.getTheme());
      localTheme.resolveAttribute(2130772134, localTypedValue, true);
      if (localTypedValue.resourceId != 0)
        localTheme.applyStyle(localTypedValue.resourceId, true);
      localTheme.resolveAttribute(2130772199, localTypedValue, true);
      if (localTypedValue.resourceId != 0)
        localTheme.applyStyle(localTypedValue.resourceId, true);
      while (true)
      {
        paramContext = new d(paramContext, 0);
        paramContext.getTheme().setTo(localTheme);
        this.VM = paramContext;
        paramContext = paramContext.obtainStyledAttributes(a.a.AppCompatTheme);
        this.background = paramContext.getResourceId(80, 0);
        this.windowAnimations = paramContext.getResourceId(1, 0);
        paramContext.recycle();
        return;
        localTheme.applyStyle(2131493652, true);
      }
    }

    final p b(o.a parama)
    {
      if (this.VK == null);
      for (parama = null; ; parama = this.VL.f(this.VH))
      {
        return parama;
        if (this.VL == null)
        {
          this.VL = new android.support.v7.view.menu.f(this.VM);
          this.VL.lL = parama;
          this.VK.a(this.VL);
        }
      }
    }

    final void e(h paramh)
    {
      if (paramh == this.VK);
      while (true)
      {
        return;
        if (this.VK != null)
          this.VK.b(this.VL);
        this.VK = paramh;
        if ((paramh != null) && (this.VL != null))
          paramh.a(this.VL);
      }
    }

    public final boolean fz()
    {
      boolean bool = false;
      if (this.VI == null);
      while (true)
      {
        return bool;
        if (this.VJ != null)
          bool = true;
        else if (this.VL.getAdapter().getCount() > 0)
          bool = true;
      }
    }

    static class SavedState
      implements Parcelable
    {
      public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
      {
      };
      boolean RP;
      int VG;
      Bundle ra;

      static SavedState b(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        boolean bool = true;
        SavedState localSavedState = new SavedState();
        localSavedState.VG = paramParcel.readInt();
        if (paramParcel.readInt() == 1);
        while (true)
        {
          localSavedState.RP = bool;
          if (localSavedState.RP)
            localSavedState.ra = paramParcel.readBundle(paramClassLoader);
          return localSavedState;
          bool = false;
        }
      }

      public int describeContents()
      {
        return 0;
      }

      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(this.VG);
        if (this.RP);
        for (paramInt = 1; ; paramInt = 0)
        {
          paramParcel.writeInt(paramInt);
          if (this.RP)
            paramParcel.writeBundle(this.ra);
          return;
        }
      }
    }
  }

  final class a
    implements o.a
  {
    a()
    {
    }

    public final void a(h paramh, boolean paramBoolean)
    {
      AppCompatDelegateImplV9.this.c(paramh);
    }

    public final boolean d(h paramh)
    {
      Window.Callback localCallback = AppCompatDelegateImplV9.this.Ti.getCallback();
      if (localCallback != null)
        localCallback.onMenuOpened(108, paramh);
      return true;
    }
  }

  final class b
    implements b.a
  {
    private b.a VE;

    public b(b.a arg2)
    {
      Object localObject;
      this.VE = localObject;
    }

    public final void a(android.support.v7.view.b paramb)
    {
      this.VE.a(paramb);
      if (AppCompatDelegateImplV9.this.Vl != null)
        AppCompatDelegateImplV9.this.Ti.getDecorView().removeCallbacks(AppCompatDelegateImplV9.this.Vm);
      if (AppCompatDelegateImplV9.this.Vk != null)
      {
        AppCompatDelegateImplV9.this.fv();
        AppCompatDelegateImplV9.this.Vn = s.ab(AppCompatDelegateImplV9.this.Vk).t(0.0F);
        AppCompatDelegateImplV9.this.Vn.a(new y()
        {
          public final void aA(View paramAnonymousView)
          {
            AppCompatDelegateImplV9.this.Vk.setVisibility(8);
            if (AppCompatDelegateImplV9.this.Vl != null)
              AppCompatDelegateImplV9.this.Vl.dismiss();
            while (true)
            {
              AppCompatDelegateImplV9.this.Vk.removeAllViews();
              AppCompatDelegateImplV9.this.Vn.a(null);
              AppCompatDelegateImplV9.this.Vn = null;
              return;
              if ((AppCompatDelegateImplV9.this.Vk.getParent() instanceof View))
                s.ak((View)AppCompatDelegateImplV9.this.Vk.getParent());
            }
          }
        });
      }
      if (AppCompatDelegateImplV9.this.UI != null)
        AppCompatDelegateImplV9.this.UI.onSupportActionModeFinished(AppCompatDelegateImplV9.this.Vj);
      AppCompatDelegateImplV9.this.Vj = null;
    }

    public final boolean a(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return this.VE.a(paramb, paramMenu);
    }

    public final boolean a(android.support.v7.view.b paramb, MenuItem paramMenuItem)
    {
      return this.VE.a(paramb, paramMenuItem);
    }

    public final boolean b(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return this.VE.b(paramb, paramMenu);
    }
  }

  final class c extends ContentFrameLayout
  {
    public c(Context arg2)
    {
      super();
    }

    public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      if ((AppCompatDelegateImplV9.this.dispatchKeyEvent(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent)));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      boolean bool = true;
      int j;
      if (paramMotionEvent.getAction() == 0)
      {
        int i = (int)paramMotionEvent.getX();
        j = (int)paramMotionEvent.getY();
        if ((i < -5) || (j < -5) || (i > getWidth() + 5) || (j > getHeight() + 5))
        {
          j = 1;
          if (j == 0)
            break label79;
          AppCompatDelegateImplV9.this.fw();
        }
      }
      while (true)
      {
        return bool;
        j = 0;
        break;
        label79: bool = super.onInterceptTouchEvent(paramMotionEvent);
      }
    }

    public final void setBackgroundResource(int paramInt)
    {
      setBackgroundDrawable(android.support.v7.c.a.b.g(getContext(), paramInt));
    }
  }

  final class d
    implements o.a
  {
    d()
    {
    }

    public final void a(h paramh, boolean paramBoolean)
    {
      h localh = paramh.gE();
      int i;
      if (localh != paramh)
      {
        i = 1;
        AppCompatDelegateImplV9 localAppCompatDelegateImplV9 = AppCompatDelegateImplV9.this;
        if (i != 0)
          paramh = localh;
        paramh = localAppCompatDelegateImplV9.a(paramh);
        if (paramh != null)
        {
          if (i == 0)
            break label71;
          AppCompatDelegateImplV9.this.a(paramh.VG, paramh, localh);
          AppCompatDelegateImplV9.this.a(paramh, true);
        }
      }
      while (true)
      {
        return;
        i = 0;
        break;
        label71: AppCompatDelegateImplV9.this.a(paramh, paramBoolean);
      }
    }

    public final boolean d(h paramh)
    {
      if ((paramh == null) && (AppCompatDelegateImplV9.this.UJ))
      {
        Window.Callback localCallback = AppCompatDelegateImplV9.this.Ti.getCallback();
        if ((localCallback != null) && (!AppCompatDelegateImplV9.this.UP))
          localCallback.onMenuOpened(108, paramh);
      }
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.AppCompatDelegateImplV9
 * JD-Core Version:    0.6.2
 */