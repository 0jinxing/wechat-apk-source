package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.a.b;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class s
{
  static final j Na;

  static
  {
    if (Build.VERSION.SDK_INT >= 26)
      Na = new i();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 24)
        Na = new h();
      else if (Build.VERSION.SDK_INT >= 23)
        Na = new g();
      else if (Build.VERSION.SDK_INT >= 21)
        Na = new f();
      else if (Build.VERSION.SDK_INT >= 19)
        Na = new e();
      else if (Build.VERSION.SDK_INT >= 18)
        Na = new d();
      else if (Build.VERSION.SDK_INT >= 17)
        Na = new c();
      else if (Build.VERSION.SDK_INT >= 16)
        Na = new b();
      else if (Build.VERSION.SDK_INT >= 15)
        Na = new a();
      else
        Na = new j();
    }
  }

  @Deprecated
  public static int O(View paramView)
  {
    return paramView.getOverScrollMode();
  }

  public static boolean P(View paramView)
  {
    return j.P(paramView);
  }

  public static boolean Q(View paramView)
  {
    return Na.Q(paramView);
  }

  public static void R(View paramView)
  {
    Na.R(paramView);
  }

  public static int S(View paramView)
  {
    return Na.S(paramView);
  }

  public static int T(View paramView)
  {
    return Na.T(paramView);
  }

  public static ViewParent U(View paramView)
  {
    return Na.U(paramView);
  }

  public static void V(View paramView)
  {
    Na.V(paramView);
  }

  public static int W(View paramView)
  {
    return Na.W(paramView);
  }

  public static int X(View paramView)
  {
    return Na.X(paramView);
  }

  @Deprecated
  public static float Y(View paramView)
  {
    return paramView.getTranslationY();
  }

  public static int Z(View paramView)
  {
    return Na.Z(paramView);
  }

  public static aa a(View paramView, aa paramaa)
  {
    return Na.a(paramView, paramaa);
  }

  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    Na.a(paramView, paramColorStateList);
  }

  public static void a(View paramView, Paint paramPaint)
  {
    Na.a(paramView, paramPaint);
  }

  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    Na.a(paramView, paramMode);
  }

  public static void a(View paramView, Drawable paramDrawable)
  {
    Na.a(paramView, paramDrawable);
  }

  public static void a(View paramView, a parama)
  {
    j.a(paramView, parama);
  }

  public static void a(View paramView, o paramo)
  {
    Na.a(paramView, paramo);
  }

  public static void a(View paramView, q paramq)
  {
    Na.a(paramView, paramq);
  }

  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    Na.a(paramView, paramRunnable, paramLong);
  }

  public static int aa(View paramView)
  {
    return Na.aa(paramView);
  }

  public static w ab(View paramView)
  {
    j localj = Na;
    if (localj.Nk == null)
      localj.Nk = new WeakHashMap();
    w localw1 = (w)localj.Nk.get(paramView);
    w localw2 = localw1;
    if (localw1 == null)
    {
      localw2 = new w(paramView);
      localj.Nk.put(paramView, localw2);
    }
    return localw2;
  }

  @Deprecated
  public static void ac(View paramView)
  {
    paramView.setTranslationX(0.0F);
  }

  @Deprecated
  public static void ad(View paramView)
  {
    paramView.setRotation(0.0F);
  }

  @Deprecated
  public static void ae(View paramView)
  {
    paramView.setRotationX(0.0F);
  }

  @Deprecated
  public static void af(View paramView)
  {
    paramView.setRotationY(0.0F);
  }

  public static float ag(View paramView)
  {
    return Na.ag(paramView);
  }

  public static float ah(View paramView)
  {
    return Na.ah(paramView);
  }

  public static String ai(View paramView)
  {
    return Na.ai(paramView);
  }

  public static int aj(View paramView)
  {
    return Na.aj(paramView);
  }

  public static void ak(View paramView)
  {
    Na.ak(paramView);
  }

  public static boolean al(View paramView)
  {
    return Na.al(paramView);
  }

  public static boolean am(View paramView)
  {
    return Na.am(paramView);
  }

  public static boolean an(View paramView)
  {
    return Na.an(paramView);
  }

  public static ColorStateList ao(View paramView)
  {
    return Na.ao(paramView);
  }

  public static PorterDuff.Mode ap(View paramView)
  {
    return Na.ap(paramView);
  }

  public static boolean aq(View paramView)
  {
    return Na.aq(paramView);
  }

  public static void ar(View paramView)
  {
    Na.ar(paramView);
  }

  public static boolean as(View paramView)
  {
    return Na.as(paramView);
  }

  public static float at(View paramView)
  {
    return Na.at(paramView);
  }

  public static Rect au(View paramView)
  {
    return Na.au(paramView);
  }

  public static boolean av(View paramView)
  {
    return Na.av(paramView);
  }

  public static boolean aw(View paramView)
  {
    return Na.aw(paramView);
  }

  public static Display ax(View paramView)
  {
    return Na.ax(paramView);
  }

  public static aa b(View paramView, aa paramaa)
  {
    return Na.b(paramView, paramaa);
  }

  public static void b(View paramView, Runnable paramRunnable)
  {
    Na.b(paramView, paramRunnable);
  }

  public static void b(View paramView, String paramString)
  {
    Na.b(paramView, paramString);
  }

  public static void c(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Na.c(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void c(View paramView, Rect paramRect)
  {
    Na.c(paramView, paramRect);
  }

  @Deprecated
  public static void d(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }

  public static void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Na.d(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void d(View paramView, boolean paramBoolean)
  {
    Na.d(paramView, paramBoolean);
  }

  @Deprecated
  public static void e(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }

  @Deprecated
  public static void e(View paramView, boolean paramBoolean)
  {
    paramView.setFitsSystemWindows(paramBoolean);
  }

  @Deprecated
  public static void f(View paramView, float paramFloat)
  {
    paramView.setScaleX(paramFloat);
  }

  @Deprecated
  public static void g(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }

  public static void h(View paramView, float paramFloat)
  {
    Na.h(paramView, paramFloat);
  }

  public static void i(View paramView, float paramFloat)
  {
    Na.i(paramView, paramFloat);
  }

  @Deprecated
  public static boolean m(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }

  @Deprecated
  public static boolean n(View paramView, int paramInt)
  {
    return paramView.canScrollVertically(paramInt);
  }

  public static void o(View paramView, int paramInt)
  {
    Na.o(paramView, paramInt);
  }

  public static void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    j.onInitializeAccessibilityNodeInfo(paramView, paramb);
  }

  @Deprecated
  public static void p(View paramView, int paramInt)
  {
    paramView.setLayerType(paramInt, null);
  }

  public static boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return Na.performAccessibilityAction(paramView, paramInt, paramBundle);
  }

  public static void q(View paramView, int paramInt)
  {
    Na.q(paramView, paramInt);
  }

  public static void r(View paramView, int paramInt)
  {
    Na.r(paramView, paramInt);
  }

  public static void s(View paramView, int paramInt)
  {
    Na.s(paramView, paramInt);
  }

  static class a extends s.j
  {
    public final boolean aw(View paramView)
    {
      return paramView.hasOnClickListeners();
    }
  }

  static class b extends s.a
  {
    public final boolean Q(View paramView)
    {
      return paramView.hasTransientState();
    }

    public final void R(View paramView)
    {
      paramView.postInvalidateOnAnimation();
    }

    public final int S(View paramView)
    {
      return paramView.getImportantForAccessibility();
    }

    public final ViewParent U(View paramView)
    {
      return paramView.getParentForAccessibility();
    }

    public final int Z(View paramView)
    {
      return paramView.getMinimumWidth();
    }

    public final void a(View paramView, Drawable paramDrawable)
    {
      paramView.setBackground(paramDrawable);
    }

    public final void a(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postOnAnimationDelayed(paramRunnable, paramLong);
    }

    public final int aa(View paramView)
    {
      return paramView.getMinimumHeight();
    }

    public void ak(View paramView)
    {
      paramView.requestFitSystemWindows();
    }

    public final boolean al(View paramView)
    {
      return paramView.getFitsSystemWindows();
    }

    public final boolean am(View paramView)
    {
      return paramView.hasOverlappingRendering();
    }

    public final void b(View paramView, Runnable paramRunnable)
    {
      paramView.postOnAnimation(paramRunnable);
    }

    public final void c(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.postInvalidateOnAnimation(paramInt1, paramInt2, paramInt3, paramInt4);
    }

    public final void d(View paramView, boolean paramBoolean)
    {
      paramView.setHasTransientState(paramBoolean);
    }

    public void o(View paramView, int paramInt)
    {
      int i = paramInt;
      if (paramInt == 4)
        i = 2;
      paramView.setImportantForAccessibility(i);
    }

    public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      return paramView.performAccessibilityAction(paramInt, paramBundle);
    }
  }

  static class c extends s.b
  {
    public final int T(View paramView)
    {
      return paramView.getLayoutDirection();
    }

    public final int W(View paramView)
    {
      return paramView.getPaddingStart();
    }

    public final int X(View paramView)
    {
      return paramView.getPaddingEnd();
    }

    public final void a(View paramView, Paint paramPaint)
    {
      paramView.setLayerPaint(paramPaint);
    }

    public final int aj(View paramView)
    {
      return paramView.getWindowSystemUiVisibility();
    }

    public final boolean an(View paramView)
    {
      return paramView.isPaddingRelative();
    }

    public final Display ax(View paramView)
    {
      return paramView.getDisplay();
    }

    public final void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }

  static class d extends s.c
  {
    public final Rect au(View paramView)
    {
      return paramView.getClipBounds();
    }

    public final void c(View paramView, Rect paramRect)
    {
      paramView.setClipBounds(paramRect);
    }
  }

  static class e extends s.d
  {
    public final void V(View paramView)
    {
      paramView.setAccessibilityLiveRegion(1);
    }

    public final boolean as(View paramView)
    {
      return paramView.isLaidOut();
    }

    public final boolean av(View paramView)
    {
      return paramView.isAttachedToWindow();
    }

    public final void o(View paramView, int paramInt)
    {
      paramView.setImportantForAccessibility(paramInt);
    }
  }

  static class f extends s.e
  {
    private static ThreadLocal<Rect> Nb;

    private static Rect eq()
    {
      if (Nb == null)
        Nb = new ThreadLocal();
      Rect localRect1 = (Rect)Nb.get();
      Rect localRect2 = localRect1;
      if (localRect1 == null)
      {
        localRect2 = new Rect();
        Nb.set(localRect2);
      }
      localRect2.setEmpty();
      return localRect2;
    }

    public final aa a(View paramView, aa paramaa)
    {
      paramaa = (WindowInsets)aa.c(paramaa);
      WindowInsets localWindowInsets = paramView.onApplyWindowInsets(paramaa);
      paramView = paramaa;
      if (localWindowInsets != paramaa)
        paramView = new WindowInsets(localWindowInsets);
      return aa.G(paramView);
    }

    public final void a(View paramView, ColorStateList paramColorStateList)
    {
      paramView.setBackgroundTintList(paramColorStateList);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramColorStateList = paramView.getBackground();
        if ((paramView.getBackgroundTintList() == null) && (paramView.getBackgroundTintMode() == null))
          break label64;
      }
      label64: for (int i = 1; ; i = 0)
      {
        if ((paramColorStateList != null) && (i != 0))
        {
          if (paramColorStateList.isStateful())
            paramColorStateList.setState(paramView.getDrawableState());
          paramView.setBackground(paramColorStateList);
        }
        return;
      }
    }

    public final void a(View paramView, PorterDuff.Mode paramMode)
    {
      paramView.setBackgroundTintMode(paramMode);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramMode = paramView.getBackground();
        if ((paramView.getBackgroundTintList() == null) && (paramView.getBackgroundTintMode() == null))
          break label64;
      }
      label64: for (int i = 1; ; i = 0)
      {
        if ((paramMode != null) && (i != 0))
        {
          if (paramMode.isStateful())
            paramMode.setState(paramView.getDrawableState());
          paramView.setBackground(paramMode);
        }
        return;
      }
    }

    public final void a(View paramView, final o paramo)
    {
      if (paramo == null)
        paramView.setOnApplyWindowInsetsListener(null);
      while (true)
      {
        return;
        paramView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
        {
          public final WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
          {
            paramAnonymousWindowInsets = aa.G(paramAnonymousWindowInsets);
            return (WindowInsets)aa.c(paramo.a(paramAnonymousView, paramAnonymousWindowInsets));
          }
        });
      }
    }

    public final float ag(View paramView)
    {
      return paramView.getElevation();
    }

    public final float ah(View paramView)
    {
      return paramView.getTranslationZ();
    }

    public final String ai(View paramView)
    {
      return paramView.getTransitionName();
    }

    public final void ak(View paramView)
    {
      paramView.requestApplyInsets();
    }

    public final ColorStateList ao(View paramView)
    {
      return paramView.getBackgroundTintList();
    }

    public final PorterDuff.Mode ap(View paramView)
    {
      return paramView.getBackgroundTintMode();
    }

    public final boolean aq(View paramView)
    {
      return paramView.isNestedScrollingEnabled();
    }

    public final void ar(View paramView)
    {
      paramView.stopNestedScroll();
    }

    public final float at(View paramView)
    {
      return paramView.getZ();
    }

    public final aa b(View paramView, aa paramaa)
    {
      paramaa = (WindowInsets)aa.c(paramaa);
      WindowInsets localWindowInsets = paramView.dispatchApplyWindowInsets(paramaa);
      paramView = paramaa;
      if (localWindowInsets != paramaa)
        paramView = new WindowInsets(localWindowInsets);
      return aa.G(paramView);
    }

    public final void b(View paramView, String paramString)
    {
      paramView.setTransitionName(paramString);
    }

    public final void h(View paramView, float paramFloat)
    {
      paramView.setElevation(paramFloat);
    }

    public final void i(View paramView, float paramFloat)
    {
      paramView.setTranslationZ(paramFloat);
    }

    public void q(View paramView, int paramInt)
    {
      Rect localRect = eq();
      ViewParent localViewParent = paramView.getParent();
      int i;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))
          i = 1;
      }
      while (true)
      {
        super.q(paramView, paramInt);
        if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())))
          ((View)localViewParent).invalidate(localRect);
        return;
        i = 0;
        continue;
        i = 0;
      }
    }

    public void r(View paramView, int paramInt)
    {
      Rect localRect = eq();
      ViewParent localViewParent = paramView.getParent();
      int i;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))
          i = 1;
      }
      while (true)
      {
        super.r(paramView, paramInt);
        if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())))
          ((View)localViewParent).invalidate(localRect);
        return;
        i = 0;
        continue;
        i = 0;
      }
    }
  }

  static class g extends s.f
  {
    public final void q(View paramView, int paramInt)
    {
      paramView.offsetTopAndBottom(paramInt);
    }

    public final void r(View paramView, int paramInt)
    {
      paramView.offsetLeftAndRight(paramInt);
    }

    public final void s(View paramView, int paramInt)
    {
      paramView.setScrollIndicators(paramInt, 3);
    }
  }

  static class h extends s.g
  {
    public final void a(View paramView, q paramq)
    {
      if (paramq != null);
      for (paramq = paramq.MZ; ; paramq = null)
      {
        paramView.setPointerIcon((PointerIcon)paramq);
        return;
      }
    }
  }

  static final class i extends s.h
  {
  }

  static class j
  {
    private static Field Ne;
    private static boolean Nf;
    private static Field Ng;
    private static boolean Nh;
    private static WeakHashMap<View, String> Ni;
    private static final AtomicInteger Nj = new AtomicInteger(1);
    static Field Nl;
    static boolean Nm = false;
    WeakHashMap<View, w> Nk = null;

    // ERROR //
    public static boolean P(View paramView)
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: getstatic 34	android/support/v4/view/s$j:Nm	Z
      //   5: ifeq +5 -> 10
      //   8: iload_1
      //   9: ireturn
      //   10: getstatic 45	android/support/v4/view/s$j:Nl	Ljava/lang/reflect/Field;
      //   13: ifnonnull +20 -> 33
      //   16: ldc 47
      //   18: ldc 49
      //   20: invokevirtual 55	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   23: astore_2
      //   24: aload_2
      //   25: putstatic 45	android/support/v4/view/s$j:Nl	Ljava/lang/reflect/Field;
      //   28: aload_2
      //   29: iconst_1
      //   30: invokevirtual 61	java/lang/reflect/Field:setAccessible	(Z)V
      //   33: getstatic 45	android/support/v4/view/s$j:Nl	Ljava/lang/reflect/Field;
      //   36: aload_0
      //   37: invokevirtual 65	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
      //   40: astore_0
      //   41: aload_0
      //   42: ifnull -34 -> 8
      //   45: iconst_1
      //   46: istore_1
      //   47: goto -39 -> 8
      //   50: astore_0
      //   51: iconst_1
      //   52: putstatic 34	android/support/v4/view/s$j:Nm	Z
      //   55: goto -47 -> 8
      //   58: astore_0
      //   59: iconst_1
      //   60: putstatic 34	android/support/v4/view/s$j:Nm	Z
      //   63: goto -55 -> 8
      //
      // Exception table:
      //   from	to	target	type
      //   16	33	50	java/lang/Throwable
      //   33	41	58	java/lang/Throwable
    }

    public static void a(View paramView, a parama)
    {
      if (parama == null);
      for (parama = null; ; parama = parama.getBridge())
      {
        paramView.setAccessibilityDelegate(parama);
        return;
      }
    }

    private static void ay(View paramView)
    {
      float f = paramView.getTranslationY();
      paramView.setTranslationY(1.0F + f);
      paramView.setTranslationY(f);
    }

    public static void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
    {
      paramView.onInitializeAccessibilityNodeInfo(paramb.NG);
    }

    public boolean Q(View paramView)
    {
      return false;
    }

    public void R(View paramView)
    {
      paramView.postInvalidate();
    }

    public int S(View paramView)
    {
      return 0;
    }

    public int T(View paramView)
    {
      return 0;
    }

    public ViewParent U(View paramView)
    {
      return paramView.getParent();
    }

    public void V(View paramView)
    {
    }

    public int W(View paramView)
    {
      return paramView.getPaddingLeft();
    }

    public int X(View paramView)
    {
      return paramView.getPaddingRight();
    }

    public int Z(View paramView)
    {
      if (!Nf);
      try
      {
        Field localField = View.class.getDeclaredField("mMinWidth");
        Ne = localField;
        localField.setAccessible(true);
        label23: Nf = true;
        if (Ne != null);
        while (true)
        {
          try
          {
            i = ((Integer)Ne.get(paramView)).intValue();
            return i;
          }
          catch (Exception paramView)
          {
          }
          int i = 0;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        break label23;
      }
    }

    public aa a(View paramView, aa paramaa)
    {
      return paramaa;
    }

    public void a(View paramView, ColorStateList paramColorStateList)
    {
      if ((paramView instanceof r))
        ((r)paramView).setSupportBackgroundTintList(paramColorStateList);
    }

    public void a(View paramView, Paint paramPaint)
    {
      paramView.setLayerType(paramView.getLayerType(), paramPaint);
      paramView.invalidate();
    }

    public void a(View paramView, PorterDuff.Mode paramMode)
    {
      if ((paramView instanceof r))
        ((r)paramView).setSupportBackgroundTintMode(paramMode);
    }

    public void a(View paramView, Drawable paramDrawable)
    {
      paramView.setBackgroundDrawable(paramDrawable);
    }

    public void a(View paramView, o paramo)
    {
    }

    public void a(View paramView, q paramq)
    {
    }

    public void a(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postDelayed(paramRunnable, ValueAnimator.getFrameDelay() + paramLong);
    }

    public int aa(View paramView)
    {
      if (!Nh);
      try
      {
        Field localField = View.class.getDeclaredField("mMinHeight");
        Ng = localField;
        localField.setAccessible(true);
        label23: Nh = true;
        if (Ng != null);
        while (true)
        {
          try
          {
            i = ((Integer)Ng.get(paramView)).intValue();
            return i;
          }
          catch (Exception paramView)
          {
          }
          int i = 0;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        break label23;
      }
    }

    public float ag(View paramView)
    {
      return 0.0F;
    }

    public float ah(View paramView)
    {
      return 0.0F;
    }

    public String ai(View paramView)
    {
      if (Ni == null);
      for (paramView = null; ; paramView = (String)Ni.get(paramView))
        return paramView;
    }

    public int aj(View paramView)
    {
      return 0;
    }

    public void ak(View paramView)
    {
    }

    public boolean al(View paramView)
    {
      return false;
    }

    public boolean am(View paramView)
    {
      return true;
    }

    public boolean an(View paramView)
    {
      return false;
    }

    public ColorStateList ao(View paramView)
    {
      if ((paramView instanceof r));
      for (paramView = ((r)paramView).getSupportBackgroundTintList(); ; paramView = null)
        return paramView;
    }

    public PorterDuff.Mode ap(View paramView)
    {
      if ((paramView instanceof r));
      for (paramView = ((r)paramView).getSupportBackgroundTintMode(); ; paramView = null)
        return paramView;
    }

    public boolean aq(View paramView)
    {
      if ((paramView instanceof i));
      for (boolean bool = ((i)paramView).isNestedScrollingEnabled(); ; bool = false)
        return bool;
    }

    public void ar(View paramView)
    {
      if ((paramView instanceof i))
        ((i)paramView).stopNestedScroll();
    }

    public boolean as(View paramView)
    {
      if ((paramView.getWidth() > 0) && (paramView.getHeight() > 0));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public float at(View paramView)
    {
      return ah(paramView) + ag(paramView);
    }

    public Rect au(View paramView)
    {
      return null;
    }

    public boolean av(View paramView)
    {
      if (paramView.getWindowToken() != null);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public boolean aw(View paramView)
    {
      return false;
    }

    public Display ax(View paramView)
    {
      if (av(paramView));
      for (paramView = ((WindowManager)paramView.getContext().getSystemService("window")).getDefaultDisplay(); ; paramView = null)
        return paramView;
    }

    public aa b(View paramView, aa paramaa)
    {
      return paramaa;
    }

    public void b(View paramView, Runnable paramRunnable)
    {
      paramView.postDelayed(paramRunnable, ValueAnimator.getFrameDelay());
    }

    public void b(View paramView, String paramString)
    {
      if (Ni == null)
        Ni = new WeakHashMap();
      Ni.put(paramView, paramString);
    }

    public void c(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
    }

    public void c(View paramView, Rect paramRect)
    {
    }

    public void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    }

    public void d(View paramView, boolean paramBoolean)
    {
    }

    public void h(View paramView, float paramFloat)
    {
    }

    public void i(View paramView, float paramFloat)
    {
    }

    public void o(View paramView, int paramInt)
    {
    }

    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      return false;
    }

    public void q(View paramView, int paramInt)
    {
      paramView.offsetTopAndBottom(paramInt);
      if (paramView.getVisibility() == 0)
      {
        ay(paramView);
        paramView = paramView.getParent();
        if ((paramView instanceof View))
          ay((View)paramView);
      }
    }

    public void r(View paramView, int paramInt)
    {
      paramView.offsetLeftAndRight(paramInt);
      if (paramView.getVisibility() == 0)
      {
        ay(paramView);
        paramView = paramView.getParent();
        if ((paramView instanceof View))
          ay((View)paramView);
      }
    }

    public void s(View paramView, int paramInt)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.s
 * JD-Core Version:    0.6.2
 */