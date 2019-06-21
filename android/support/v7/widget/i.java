package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v4.f.f;
import android.support.v4.f.g;
import android.support.v4.f.n;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class i
{
  private static final int[] afA = { 2130837603, 2130837605, 2130837535, 2130837596, 2130837597, 2130837599, 2130837601, 2130837598, 2130837600, 2130837602 };
  private static final int[] afB = { 2130837573, 2130837533, 2130837572 };
  private static final int[] afC = { 2130837594, 2130837607 };
  private static final int[] afD = { 2130837523, 2130837528 };
  private static final PorterDuff.Mode afv = PorterDuff.Mode.SRC_IN;
  private static i afw;
  private static final b afx = new b();
  private static final int[] afy = { 2130837606, 2130837604, 2130837520 };
  private static final int[] afz = { 2130837542, 2130837583, 2130837549, 2130837544, 2130837545, 2130837548, 2130837547 };
  private WeakHashMap<Context, n<ColorStateList>> afE;
  private android.support.v4.f.a<String, c> afF;
  private n<String> afG;
  public final Object afH = new Object();
  public final WeakHashMap<Context, f<WeakReference<Drawable.ConstantState>>> afI = new WeakHashMap(0);
  private TypedValue afJ;
  private boolean afK;

  private static ColorStateList Y(Context paramContext)
  {
    return q(paramContext, ay.s(paramContext, 2130772207));
  }

  private static ColorStateList Z(Context paramContext)
  {
    return q(paramContext, ay.s(paramContext, 2130772203));
  }

  private static long a(TypedValue paramTypedValue)
  {
    return paramTypedValue.assetCookie << 32 | paramTypedValue.data;
  }

  public static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuffColorFilter localPorterDuffColorFilter1 = afx.b(paramInt, paramMode);
    PorterDuffColorFilter localPorterDuffColorFilter2 = localPorterDuffColorFilter1;
    if (localPorterDuffColorFilter1 == null)
    {
      localPorterDuffColorFilter2 = new PorterDuffColorFilter(paramInt, paramMode);
      afx.a(paramInt, paramMode, localPorterDuffColorFilter2);
    }
    return localPorterDuffColorFilter2;
  }

  private Drawable a(Context paramContext, long paramLong)
  {
    while (true)
    {
      f localf;
      synchronized (this.afH)
      {
        localf = (f)this.afI.get(paramContext);
        if (localf == null)
        {
          paramContext = null;
          return paramContext;
        }
        Object localObject2 = (WeakReference)localf.k(paramLong);
        if (localObject2 == null)
          break label139;
        localObject2 = (Drawable.ConstantState)((WeakReference)localObject2).get();
        if (localObject2 != null)
          paramContext = ((Drawable.ConstantState)localObject2).newDrawable(paramContext.getResources());
      }
      int i = android.support.v4.f.c.a(localf.Lk, localf.mSize, paramLong);
      if ((i >= 0) && (localf.Ll[i] != f.Li))
      {
        localf.Ll[i] = f.Li;
        localf.Lj = true;
      }
      label139: paramContext = null;
    }
  }

  private void a(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    if (this.afE == null)
      this.afE = new WeakHashMap();
    n localn1 = (n)this.afE.get(paramContext);
    n localn2 = localn1;
    if (localn1 == null)
    {
      localn2 = new n();
      this.afE.put(paramContext, localn2);
    }
    localn2.append(paramInt, paramColorStateList);
  }

  private static void a(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = paramDrawable;
    if (aa.o(paramDrawable))
      localDrawable = paramDrawable.mutate();
    paramDrawable = paramMode;
    if (paramMode == null)
      paramDrawable = afv;
    localDrawable.setColorFilter(a(paramInt, paramDrawable));
  }

  static void a(Drawable paramDrawable, ba paramba, int[] paramArrayOfInt)
  {
    Object localObject = null;
    if ((aa.o(paramDrawable)) && (paramDrawable.mutate() != paramDrawable));
    label45: label58: label72: label98: label106: label127: 
    while (true)
    {
      return;
      ColorStateList localColorStateList;
      PorterDuff.Mode localMode;
      if ((paramba.atE) || (paramba.atD))
        if (paramba.atE)
        {
          localColorStateList = paramba.atC;
          if (!paramba.atD)
            break label98;
          localMode = paramba.vI;
          paramba = localObject;
          if (localColorStateList != null)
          {
            if (localMode != null)
              break label106;
            paramba = localObject;
          }
          paramDrawable.setColorFilter(paramba);
        }
      while (true)
      {
        if (Build.VERSION.SDK_INT > 23)
          break label127;
        paramDrawable.invalidateSelf();
        break;
        localColorStateList = null;
        break label45;
        localMode = afv;
        break label58;
        paramba = a(localColorStateList.getColorForState(paramArrayOfInt, 0), localMode);
        break label72;
        paramDrawable.clearColorFilter();
      }
    }
  }

  private void a(String paramString, c paramc)
  {
    if (this.afF == null)
      this.afF = new android.support.v4.f.a();
    this.afF.put(paramString, paramc);
  }

  static boolean a(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    int i = 16842801;
    boolean bool1 = true;
    PorterDuff.Mode localMode = afv;
    int j;
    if (c(afy, paramInt))
    {
      i = 2130772204;
      paramInt = -1;
      j = 1;
    }
    while (true)
    {
      if (j != 0)
      {
        Drawable localDrawable = paramDrawable;
        if (aa.o(paramDrawable))
          localDrawable = paramDrawable.mutate();
        localDrawable.setColorFilter(a(ay.s(paramContext, i), localMode));
        bool2 = bool1;
        if (paramInt != -1)
          localDrawable.setAlpha(paramInt);
      }
      for (boolean bool2 = bool1; ; bool2 = false)
      {
        return bool2;
        if (c(afA, paramInt))
        {
          i = 2130772205;
          paramInt = -1;
          j = 1;
          break;
        }
        if (c(afB, paramInt))
        {
          localMode = PorterDuff.Mode.MULTIPLY;
          paramInt = -1;
          j = 1;
          break;
        }
        if (paramInt == 2130837561)
        {
          i = 16842800;
          paramInt = Math.round(40.799999F);
          j = 1;
          break;
        }
        if (paramInt != 2130837537)
          break label179;
        paramInt = -1;
        j = 1;
        break;
      }
      label179: paramInt = -1;
      i = 0;
      j = 0;
    }
  }

  private boolean a(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
    if (localConstantState != null);
    while (true)
    {
      synchronized (this.afH)
      {
        f localf = (f)this.afI.get(paramContext);
        paramDrawable = localf;
        if (localf == null)
        {
          paramDrawable = new android/support/v4/f/f;
          paramDrawable.<init>();
          this.afI.put(paramContext, paramDrawable);
        }
        paramContext = new java/lang/ref/WeakReference;
        paramContext.<init>(localConstantState);
        paramDrawable.put(paramLong, paramContext);
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  private static ColorStateList aa(Context paramContext)
  {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    ColorStateList localColorStateList = ay.t(paramContext, 2130772208);
    if ((localColorStateList != null) && (localColorStateList.isStateful()))
    {
      arrayOfInt[0] = ay.mX;
      arrayOfInt1[0] = localColorStateList.getColorForState(arrayOfInt[0], 0);
      arrayOfInt[1] = ay.kO;
      arrayOfInt1[1] = ay.s(paramContext, 2130772205);
      arrayOfInt[2] = ay.EMPTY_STATE_SET;
      arrayOfInt1[2] = localColorStateList.getDefaultColor();
    }
    while (true)
    {
      return new ColorStateList(arrayOfInt, arrayOfInt1);
      arrayOfInt[0] = ay.mX;
      arrayOfInt1[0] = ay.u(paramContext, 2130772208);
      arrayOfInt[1] = ay.kO;
      arrayOfInt1[1] = ay.s(paramContext, 2130772205);
      arrayOfInt[2] = ay.EMPTY_STATE_SET;
      arrayOfInt1[2] = ay.s(paramContext, 2130772208);
    }
  }

  private void ab(Context paramContext)
  {
    if (this.afK);
    do
    {
      return;
      this.afK = true;
      paramContext = a(paramContext, 2130837608, false);
    }
    while ((paramContext != null) && (k(paramContext)));
    this.afK = false;
    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
  }

  private static PorterDuff.Mode bF(int paramInt)
  {
    PorterDuff.Mode localMode = null;
    if (paramInt == 2130837592)
      localMode = PorterDuff.Mode.MULTIPLY;
    return localMode;
  }

  private static boolean c(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool1 = false;
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (paramArrayOfInt[j] == paramInt)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public static i hE()
  {
    if (afw == null)
    {
      i locali = new i();
      afw = locali;
      if (Build.VERSION.SDK_INT < 24)
      {
        locali.a("vector", new d());
        locali.a("animated-vector", new a());
      }
    }
    return afw;
  }

  private static boolean k(Drawable paramDrawable)
  {
    if (((paramDrawable instanceof android.support.c.a.i)) || ("android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName())));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private Drawable m(Context paramContext, int paramInt)
  {
    if (this.afJ == null)
      this.afJ = new TypedValue();
    TypedValue localTypedValue = this.afJ;
    paramContext.getResources().getValue(paramInt, localTypedValue, true);
    long l = a(localTypedValue);
    Object localObject1 = a(paramContext, l);
    Object localObject2;
    if (localObject1 != null)
      localObject2 = localObject1;
    while (true)
    {
      return localObject2;
      if (paramInt == 2130837534)
        localObject1 = new LayerDrawable(new Drawable[] { a(paramContext, 2130837533, false), a(paramContext, 2130837535, false) });
      localObject2 = localObject1;
      if (localObject1 != null)
      {
        ((Drawable)localObject1).setChangingConfigurations(localTypedValue.changingConfigurations);
        a(paramContext, l, (Drawable)localObject1);
        localObject2 = localObject1;
      }
    }
  }

  private ColorStateList p(Context paramContext, int paramInt)
  {
    if (this.afE != null)
    {
      paramContext = (n)this.afE.get(paramContext);
      if (paramContext != null)
        paramContext = (ColorStateList)paramContext.aH(paramInt);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      continue;
      paramContext = null;
    }
  }

  private static ColorStateList q(Context paramContext, int paramInt)
  {
    int i = ay.s(paramContext, 2130772206);
    int j = ay.u(paramContext, 2130772207);
    int[] arrayOfInt1 = ay.mX;
    paramContext = ay.PRESSED_STATE_SET;
    int k = android.support.v4.a.b.s(i, paramInt);
    int[] arrayOfInt2 = ay.FOCUSED_STATE_SET;
    i = android.support.v4.a.b.s(i, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt1, paramContext, arrayOfInt2, ay.EMPTY_STATE_SET }, new int[] { j, k, i, paramInt });
  }

  public final Drawable a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    ab(paramContext);
    Object localObject1 = n(paramContext, paramInt);
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = m(paramContext, paramInt);
    localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = android.support.v4.content.b.g(paramContext, paramInt);
    localObject2 = localObject1;
    if (localObject1 != null)
      localObject2 = a(paramContext, paramInt, paramBoolean, (Drawable)localObject1);
    if (localObject2 != null)
      aa.n((Drawable)localObject2);
    return localObject2;
  }

  final Drawable a(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    Object localObject = o(paramContext, paramInt);
    if (localObject != null)
    {
      paramContext = paramDrawable;
      if (aa.o(paramDrawable))
        paramContext = paramDrawable.mutate();
      paramContext = android.support.v4.a.a.a.f(paramContext);
      android.support.v4.a.a.a.a(paramContext, (ColorStateList)localObject);
      paramDrawable = bF(paramInt);
      localObject = paramContext;
      if (paramDrawable != null)
      {
        android.support.v4.a.a.a.a(paramContext, paramDrawable);
        localObject = paramContext;
      }
    }
    while (true)
    {
      return localObject;
      if (paramInt == 2130837584)
      {
        localObject = (LayerDrawable)paramDrawable;
        a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), ay.s(paramContext, 2130772204), afv);
        a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), ay.s(paramContext, 2130772204), afv);
        a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), ay.s(paramContext, 2130772205), afv);
        localObject = paramDrawable;
      }
      else if ((paramInt == 2130837575) || (paramInt == 2130837574) || (paramInt == 2130837576))
      {
        localObject = (LayerDrawable)paramDrawable;
        a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), ay.u(paramContext, 2130772204), afv);
        a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), ay.s(paramContext, 2130772205), afv);
        a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), ay.s(paramContext, 2130772205), afv);
        localObject = paramDrawable;
      }
      else
      {
        localObject = paramDrawable;
        if (!a(paramContext, paramInt, paramDrawable))
        {
          localObject = paramDrawable;
          if (paramBoolean)
            localObject = null;
        }
      }
    }
  }

  final Drawable n(Context paramContext, int paramInt)
  {
    Object localObject1;
    if ((this.afF != null) && (!this.afF.isEmpty()))
      if (this.afG != null)
      {
        localObject1 = (String)this.afG.aH(paramInt);
        if ((!"appcompat_skip_skip".equals(localObject1)) && ((localObject1 == null) || (this.afF.get(localObject1) != null)))
          break label76;
        paramContext = null;
      }
    while (true)
    {
      return paramContext;
      this.afG = new n();
      label76: if (this.afJ == null)
        this.afJ = new TypedValue();
      TypedValue localTypedValue = this.afJ;
      Object localObject2 = paramContext.getResources();
      ((Resources)localObject2).getValue(paramInt, localTypedValue, true);
      long l = a(localTypedValue);
      localObject1 = a(paramContext, l);
      if (localObject1 != null)
      {
        paramContext = (Context)localObject1;
      }
      else
      {
        Object localObject3 = localObject1;
        XmlResourceParser localXmlResourceParser;
        AttributeSet localAttributeSet;
        if (localTypedValue.string != null)
        {
          localObject3 = localObject1;
          if (localTypedValue.string.toString().endsWith(".xml"))
          {
            localObject3 = localObject1;
            try
            {
              localXmlResourceParser = ((Resources)localObject2).getXml(paramInt);
              localObject3 = localObject1;
              localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
              int i;
              do
              {
                localObject3 = localObject1;
                i = localXmlResourceParser.next();
              }
              while ((i != 2) && (i != 1));
              if (i != 2)
              {
                localObject3 = localObject1;
                paramContext = new org/xmlpull/v1/XmlPullParserException;
                localObject3 = localObject1;
                paramContext.<init>("No start tag found");
                localObject3 = localObject1;
                throw paramContext;
              }
            }
            catch (Exception paramContext)
            {
            }
          }
        }
        for (localObject1 = localObject3; ; localObject1 = localObject2)
        {
          paramContext = (Context)localObject1;
          if (localObject1 != null)
            break;
          this.afG.append(paramInt, "appcompat_skip_skip");
          paramContext = (Context)localObject1;
          break;
          localObject3 = localObject1;
          localObject2 = localXmlResourceParser.getName();
          localObject3 = localObject1;
          this.afG.append(paramInt, localObject2);
          localObject3 = localObject1;
          c localc = (c)this.afF.get(localObject2);
          localObject2 = localObject1;
          if (localc != null)
          {
            localObject3 = localObject1;
            localObject2 = localc.a(paramContext, localXmlResourceParser, localAttributeSet, paramContext.getTheme());
          }
          if (localObject2 != null)
          {
            localObject3 = localObject2;
            ((Drawable)localObject2).setChangingConfigurations(localTypedValue.changingConfigurations);
            localObject3 = localObject2;
            a(paramContext, l, (Drawable)localObject2);
          }
        }
        paramContext = null;
      }
    }
  }

  final ColorStateList o(Context paramContext, int paramInt)
  {
    ColorStateList localColorStateList1 = p(paramContext, paramInt);
    ColorStateList localColorStateList2 = localColorStateList1;
    if (localColorStateList1 == null)
    {
      if (paramInt != 2130837538)
        break label49;
      localColorStateList1 = android.support.v7.c.a.b.h(paramContext, 2131690713);
    }
    while (true)
    {
      localColorStateList2 = localColorStateList1;
      if (localColorStateList1 != null)
      {
        a(paramContext, paramInt, localColorStateList1);
        localColorStateList2 = localColorStateList1;
      }
      return localColorStateList2;
      label49: if (paramInt == 2130837593)
        localColorStateList1 = android.support.v7.c.a.b.h(paramContext, 2131690716);
      else if (paramInt == 2130837592)
        localColorStateList1 = aa(paramContext);
      else if (paramInt == 2130837527)
        localColorStateList1 = Y(paramContext);
      else if (paramInt == 2130837522)
        localColorStateList1 = q(paramContext, 0);
      else if (paramInt == 2130837526)
        localColorStateList1 = Z(paramContext);
      else if ((paramInt == 2130837590) || (paramInt == 2130837591))
        localColorStateList1 = android.support.v7.c.a.b.h(paramContext, 2131690715);
      else if (c(afz, paramInt))
        localColorStateList1 = ay.t(paramContext, 2130772204);
      else if (c(afC, paramInt))
        localColorStateList1 = android.support.v7.c.a.b.h(paramContext, 2131690712);
      else if (c(afD, paramInt))
        localColorStateList1 = android.support.v7.c.a.b.h(paramContext, 2131690711);
      else if (paramInt == 2130837582)
        localColorStateList1 = android.support.v7.c.a.b.h(paramContext, 2131690714);
    }
  }

  static final class a
    implements i.c
  {
    public final Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = android.support.c.a.c.a(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        while (true)
          paramContext = null;
      }
    }
  }

  static final class b extends g<Integer, PorterDuffColorFilter>
  {
    public b()
    {
      super();
    }

    private static int c(int paramInt, PorterDuff.Mode paramMode)
    {
      return (paramInt + 31) * 31 + paramMode.hashCode();
    }

    final PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
    {
      return (PorterDuffColorFilter)put(Integer.valueOf(c(paramInt, paramMode)), paramPorterDuffColorFilter);
    }

    final PorterDuffColorFilter b(int paramInt, PorterDuff.Mode paramMode)
    {
      return (PorterDuffColorFilter)get(Integer.valueOf(c(paramInt, paramMode)));
    }
  }

  static abstract interface c
  {
    public abstract Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);
  }

  static final class d
    implements i.c
  {
    public final Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = android.support.c.a.i.a(paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        while (true)
          paramContext = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.i
 * JD-Core Version:    0.6.2
 */