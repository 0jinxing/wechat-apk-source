package android.support.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.v4.a.c.b;
import android.support.v4.content.a.b;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class i extends h
{
  static final PorterDuff.Mode uK = PorterDuff.Mode.SRC_IN;
  f uL;
  private PorterDuffColorFilter uM;
  private ColorFilter uN;
  private boolean uO;
  boolean uP = true;
  private Drawable.ConstantState uQ;
  private final float[] uR = new float[9];
  private final Matrix uS = new Matrix();
  private final Rect uT = new Rect();

  i()
  {
    this.uL = new f();
  }

  i(f paramf)
  {
    this.uL = paramf;
    this.uM = a(paramf.vH, paramf.vI);
  }

  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null));
    for (paramColorStateList = null; ; paramColorStateList = new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode))
      return paramColorStateList;
  }

  public static i a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 24)
    {
      localObject = new i();
      ((i)localObject).uJ = b.b(paramResources, paramInt, paramTheme);
      ((i)localObject).uQ = new g(((i)localObject).uJ.getConstantState());
      paramResources = (Resources)localObject;
    }
    while (true)
    {
      return paramResources;
      try
      {
        localObject = paramResources.getXml(paramInt);
        localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject);
        do
          paramInt = ((XmlPullParser)localObject).next();
        while ((paramInt != 2) && (paramInt != 1));
        if (paramInt != 2)
        {
          paramResources = new org/xmlpull/v1/XmlPullParserException;
          paramResources.<init>("No start tag found");
          throw paramResources;
        }
      }
      catch (XmlPullParserException paramResources)
      {
        AttributeSet localAttributeSet;
        paramResources = null;
        continue;
        paramResources = a(paramResources, (XmlPullParser)localObject, localAttributeSet, paramTheme);
      }
      catch (IOException paramResources)
      {
        label95: break label95;
      }
    }
  }

  public static i a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    i locali = new i();
    locali.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return locali;
  }

  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    f localf = this.uL;
    e locale = localf.vG;
    int i = 1;
    ArrayDeque localArrayDeque = new ArrayDeque();
    localArrayDeque.push(locale.vy);
    int j = paramXmlPullParser.getEventType();
    int k = paramXmlPullParser.getDepth();
    if ((j != 1) && ((paramXmlPullParser.getDepth() >= k + 1) || (j != 3)))
    {
      Object localObject1;
      c localc;
      Object localObject2;
      if (j == 2)
      {
        localObject1 = paramXmlPullParser.getName();
        localc = (c)localArrayDeque.peek();
        if ("path".equals(localObject1))
        {
          localObject2 = new b();
          localObject1 = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.uj);
          ((b)localObject2).a((TypedArray)localObject1, paramXmlPullParser);
          ((TypedArray)localObject1).recycle();
          localc.kx.add(localObject2);
          if (((d)localObject2).vq != null)
            locale.vF.put(((d)localObject2).vq, localObject2);
          i = 0;
          j = localf.mChangingConfigurations;
          localf.mChangingConfigurations = (((b)localObject2).mChangingConfigurations | j);
        }
      }
      while (true)
      {
        j = paramXmlPullParser.next();
        break;
        if ("clip-path".equals(localObject1))
        {
          localObject1 = new a();
          if (android.support.v4.content.a.c.a(paramXmlPullParser, "pathData"))
          {
            localObject2 = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.uk);
            ((a)localObject1).a((TypedArray)localObject2);
            ((TypedArray)localObject2).recycle();
          }
          localc.kx.add(localObject1);
          if (((d)localObject1).vq != null)
            locale.vF.put(((d)localObject1).vq, localObject1);
          localf.mChangingConfigurations |= ((a)localObject1).mChangingConfigurations;
        }
        else
        {
          if ("group".equals(localObject1))
          {
            localObject2 = new c();
            TypedArray localTypedArray = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.uh);
            ((c)localObject2).uU = null;
            ((c)localObject2).vi = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "rotation", 5, ((c)localObject2).vi);
            ((c)localObject2).vj = localTypedArray.getFloat(1, ((c)localObject2).vj);
            ((c)localObject2).vk = localTypedArray.getFloat(2, ((c)localObject2).vk);
            ((c)localObject2).mScaleX = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "scaleX", 3, ((c)localObject2).mScaleX);
            ((c)localObject2).mScaleY = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "scaleY", 4, ((c)localObject2).mScaleY);
            ((c)localObject2).vl = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "translateX", 6, ((c)localObject2).vl);
            ((c)localObject2).vm = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "translateY", 7, ((c)localObject2).vm);
            localObject1 = localTypedArray.getString(0);
            if (localObject1 != null)
              ((c)localObject2).vo = ((String)localObject1);
            ((c)localObject2).vn.reset();
            ((c)localObject2).vn.postTranslate(-((c)localObject2).vj, -((c)localObject2).vk);
            ((c)localObject2).vn.postScale(((c)localObject2).mScaleX, ((c)localObject2).mScaleY);
            ((c)localObject2).vn.postRotate(((c)localObject2).vi, 0.0F, 0.0F);
            ((c)localObject2).vn.postTranslate(((c)localObject2).vl + ((c)localObject2).vj, ((c)localObject2).vm + ((c)localObject2).vk);
            localTypedArray.recycle();
            localc.kx.add(localObject2);
            localArrayDeque.push(localObject2);
            if (((c)localObject2).vo != null)
              locale.vF.put(((c)localObject2).vo, localObject2);
            localf.mChangingConfigurations |= ((c)localObject2).mChangingConfigurations;
          }
          continue;
          if ((j == 3) && ("group".equals(paramXmlPullParser.getName())))
            localArrayDeque.pop();
        }
      }
    }
    if (i != 0)
      throw new XmlPullParserException("no path defined");
  }

  static int d(int paramInt, float paramFloat)
  {
    return (int)(Color.alpha(paramInt) * paramFloat) << 24 | 0xFFFFFF & paramInt;
  }

  public final boolean canApplyTheme()
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.d(this.uJ);
    return false;
  }

  public final void draw(Canvas paramCanvas)
  {
    if (this.uJ != null)
      this.uJ.draw(paramCanvas);
    label56: int j;
    int k;
    int m;
    do
    {
      do
      {
        return;
        copyBounds(this.uT);
      }
      while ((this.uT.width() <= 0) || (this.uT.height() <= 0));
      if (this.uN != null)
        break;
      localObject1 = this.uM;
      paramCanvas.getMatrix(this.uS);
      this.uS.getValues(this.uR);
      float f1 = Math.abs(this.uR[0]);
      float f2 = Math.abs(this.uR[4]);
      float f3 = Math.abs(this.uR[1]);
      float f4 = Math.abs(this.uR[3]);
      if ((f3 != 0.0F) || (f4 != 0.0F))
      {
        f2 = 1.0F;
        f1 = 1.0F;
      }
      i = (int)(f1 * this.uT.width());
      j = (int)(f2 * this.uT.height());
      k = Math.min(2048, i);
      m = Math.min(2048, j);
    }
    while ((k <= 0) || (m <= 0));
    int i = paramCanvas.save();
    paramCanvas.translate(this.uT.left, this.uT.top);
    label246: Object localObject2;
    label324: label368: f localf;
    if (Build.VERSION.SDK_INT >= 17)
      if ((isAutoMirrored()) && (android.support.v4.a.a.a.g(this) == 1))
      {
        j = 1;
        if (j != 0)
        {
          paramCanvas.translate(this.uT.width(), 0.0F);
          paramCanvas.scale(-1.0F, 1.0F);
        }
        this.uT.offsetTo(0, 0);
        localObject2 = this.uL;
        if (((f)localObject2).vK != null)
        {
          if ((k != ((f)localObject2).vK.getWidth()) || (m != ((f)localObject2).vK.getHeight()))
            break label450;
          j = 1;
          if (j != 0);
        }
        else
        {
          ((f)localObject2).vK = Bitmap.createBitmap(k, m, Bitmap.Config.ARGB_8888);
          ((f)localObject2).vP = true;
        }
        if (this.uP)
          break label456;
        this.uL.p(k, m);
        localf = this.uL;
        localObject2 = this.uT;
        if (localf.vG.vD >= 255)
          break label608;
        j = 1;
        label397: if ((j != 0) || (localObject1 != null))
          break label614;
      }
    for (Object localObject1 = null; ; localObject1 = localf.vQ)
    {
      paramCanvas.drawBitmap(localf.vK, null, (Rect)localObject2, (Paint)localObject1);
      paramCanvas.restoreToCount(i);
      break;
      localObject1 = this.uN;
      break label56;
      j = 0;
      break label246;
      j = 0;
      break label246;
      label450: j = 0;
      break label324;
      label456: localObject2 = this.uL;
      if ((!((f)localObject2).vP) && (((f)localObject2).vL == ((f)localObject2).vH) && (((f)localObject2).vM == ((f)localObject2).vI) && (((f)localObject2).vO == ((f)localObject2).vJ) && (((f)localObject2).vN == ((f)localObject2).vG.vD));
      for (j = 1; ; j = 0)
      {
        if (j != 0)
          break label606;
        this.uL.p(k, m);
        localObject2 = this.uL;
        ((f)localObject2).vL = ((f)localObject2).vH;
        ((f)localObject2).vM = ((f)localObject2).vI;
        ((f)localObject2).vN = ((f)localObject2).vG.vD;
        ((f)localObject2).vO = ((f)localObject2).vJ;
        ((f)localObject2).vP = false;
        break;
      }
      label606: break label368;
      label608: j = 0;
      break label397;
      label614: if (localf.vQ == null)
      {
        localf.vQ = new Paint();
        localf.vQ.setFilterBitmap(true);
      }
      localf.vQ.setAlpha(localf.vG.vD);
      localf.vQ.setColorFilter((ColorFilter)localObject1);
    }
  }

  public final int getAlpha()
  {
    if (this.uJ != null);
    for (int i = android.support.v4.a.a.a.c(this.uJ); ; i = this.uL.vG.vD)
      return i;
  }

  public final int getChangingConfigurations()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getChangingConfigurations(); ; i = super.getChangingConfigurations() | this.uL.getChangingConfigurations())
      return i;
  }

  public final Drawable.ConstantState getConstantState()
  {
    if ((this.uJ != null) && (Build.VERSION.SDK_INT >= 24));
    for (Object localObject = new g(this.uJ.getConstantState()); ; localObject = this.uL)
    {
      return localObject;
      this.uL.mChangingConfigurations = getChangingConfigurations();
    }
  }

  public final int getIntrinsicHeight()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getIntrinsicHeight(); ; i = (int)this.uL.vG.vA)
      return i;
  }

  public final int getIntrinsicWidth()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getIntrinsicWidth(); ; i = (int)this.uL.vG.vz)
      return i;
  }

  public final int getOpacity()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getOpacity(); ; i = -3)
      return i;
  }

  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    if (this.uJ != null)
      this.uJ.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
    while (true)
    {
      return;
      inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
    }
  }

  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    while (true)
    {
      return;
      f localf1 = this.uL;
      localf1.vG = new e();
      TypedArray localTypedArray = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.ug);
      f localf2 = this.uL;
      e locale = localf2.vG;
      int i = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "tintMode", 6, -1);
      PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
      Object localObject = localMode;
      switch (i)
      {
      default:
        localObject = localMode;
      case 4:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 12:
      case 13:
      case 3:
      case 5:
      case 9:
      case 14:
      case 15:
      case 16:
      }
      while (true)
      {
        localf2.vI = ((PorterDuff.Mode)localObject);
        localObject = localTypedArray.getColorStateList(1);
        if (localObject != null)
          localf2.vH = ((ColorStateList)localObject);
        localf2.vJ = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "autoMirrored", 5, localf2.vJ);
        locale.vB = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "viewportWidth", 7, locale.vB);
        locale.vC = android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "viewportHeight", 8, locale.vC);
        if (locale.vB > 0.0F)
          break;
        throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        localObject = PorterDuff.Mode.SRC_OVER;
        continue;
        localObject = PorterDuff.Mode.SRC_IN;
        continue;
        localObject = PorterDuff.Mode.SRC_ATOP;
        continue;
        localObject = PorterDuff.Mode.MULTIPLY;
        continue;
        localObject = PorterDuff.Mode.SCREEN;
        continue;
        localObject = PorterDuff.Mode.ADD;
      }
      if (locale.vC <= 0.0F)
        throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
      locale.vz = localTypedArray.getDimension(3, locale.vz);
      locale.vA = localTypedArray.getDimension(2, locale.vA);
      if (locale.vz <= 0.0F)
        throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires width > 0");
      if (locale.vA <= 0.0F)
        throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires height > 0");
      locale.vD = ((int)(android.support.v4.content.a.c.a(localTypedArray, paramXmlPullParser, "alpha", 4, locale.vD / 255.0F) * 255.0F));
      localObject = localTypedArray.getString(0);
      if (localObject != null)
      {
        locale.vE = ((String)localObject);
        locale.vF.put(localObject, locale);
      }
      localTypedArray.recycle();
      localf1.mChangingConfigurations = getChangingConfigurations();
      localf1.vP = true;
      b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      this.uM = a(localf1.vH, localf1.vI);
    }
  }

  public final void invalidateSelf()
  {
    if (this.uJ != null)
      this.uJ.invalidateSelf();
    while (true)
    {
      return;
      super.invalidateSelf();
    }
  }

  public final boolean isAutoMirrored()
  {
    if (this.uJ != null);
    for (boolean bool = android.support.v4.a.a.a.b(this.uJ); ; bool = this.uL.vJ)
      return bool;
  }

  public final boolean isStateful()
  {
    boolean bool;
    if (this.uJ != null)
      bool = this.uJ.isStateful();
    while (true)
    {
      return bool;
      if ((super.isStateful()) || ((this.uL != null) && (this.uL.vH != null) && (this.uL.vH.isStateful())))
        bool = true;
      else
        bool = false;
    }
  }

  public final Drawable mutate()
  {
    if (this.uJ != null)
      this.uJ.mutate();
    while (true)
    {
      return this;
      if ((!this.uO) && (super.mutate() == this))
      {
        this.uL = new f(this.uL);
        this.uO = true;
      }
    }
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    if (this.uJ != null)
      this.uJ.setBounds(paramRect);
  }

  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    boolean bool;
    if (this.uJ != null)
      bool = this.uJ.setState(paramArrayOfInt);
    while (true)
    {
      return bool;
      paramArrayOfInt = this.uL;
      if ((paramArrayOfInt.vH != null) && (paramArrayOfInt.vI != null))
      {
        this.uM = a(paramArrayOfInt.vH, paramArrayOfInt.vI);
        invalidateSelf();
        bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }

  public final void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    if (this.uJ != null)
      this.uJ.scheduleSelf(paramRunnable, paramLong);
    while (true)
    {
      return;
      super.scheduleSelf(paramRunnable, paramLong);
    }
  }

  public final void setAlpha(int paramInt)
  {
    if (this.uJ != null)
      this.uJ.setAlpha(paramInt);
    while (true)
    {
      return;
      if (this.uL.vG.vD != paramInt)
      {
        this.uL.vG.vD = paramInt;
        invalidateSelf();
      }
    }
  }

  public final void setAutoMirrored(boolean paramBoolean)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramBoolean);
    while (true)
    {
      return;
      this.uL.vJ = paramBoolean;
    }
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.uJ != null)
      this.uJ.setColorFilter(paramColorFilter);
    while (true)
    {
      return;
      this.uN = paramColorFilter;
      invalidateSelf();
    }
  }

  public final void setTint(int paramInt)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramInt);
    while (true)
    {
      return;
      setTintList(ColorStateList.valueOf(paramInt));
    }
  }

  public final void setTintList(ColorStateList paramColorStateList)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramColorStateList);
    while (true)
    {
      return;
      f localf = this.uL;
      if (localf.vH != paramColorStateList)
      {
        localf.vH = paramColorStateList;
        this.uM = a(paramColorStateList, localf.vI);
        invalidateSelf();
      }
    }
  }

  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramMode);
    while (true)
    {
      return;
      f localf = this.uL;
      if (localf.vI != paramMode)
      {
        localf.vI = paramMode;
        this.uM = a(localf.vH, paramMode);
        invalidateSelf();
      }
    }
  }

  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.uJ != null);
    for (paramBoolean1 = this.uJ.setVisible(paramBoolean1, paramBoolean2); ; paramBoolean1 = super.setVisible(paramBoolean1, paramBoolean2))
      return paramBoolean1;
  }

  public final void unscheduleSelf(Runnable paramRunnable)
  {
    if (this.uJ != null)
      this.uJ.unscheduleSelf(paramRunnable);
    while (true)
    {
      return;
      super.unscheduleSelf(paramRunnable);
    }
  }

  static final class a extends i.d
  {
    public a()
    {
    }

    public a(a parama)
    {
      super();
    }

    final void a(TypedArray paramTypedArray)
    {
      String str = paramTypedArray.getString(0);
      if (str != null)
        this.vq = str;
      paramTypedArray = paramTypedArray.getString(1);
      if (paramTypedArray != null)
        this.vp = android.support.v4.a.c.L(paramTypedArray);
    }

    public final boolean cG()
    {
      return true;
    }
  }

  static final class b extends i.d
  {
    private int[] uU;
    int uV = 0;
    float uW = 0.0F;
    int uX = 0;
    float uY = 1.0F;
    int uZ = 0;
    float va = 1.0F;
    float vb = 0.0F;
    float vc = 1.0F;
    float vd = 0.0F;
    Paint.Cap ve = Paint.Cap.BUTT;
    Paint.Join vf = Paint.Join.MITER;
    float vg = 4.0F;

    public b()
    {
    }

    public b(b paramb)
    {
      super();
      this.uU = paramb.uU;
      this.uV = paramb.uV;
      this.uW = paramb.uW;
      this.uY = paramb.uY;
      this.uX = paramb.uX;
      this.uZ = paramb.uZ;
      this.va = paramb.va;
      this.vb = paramb.vb;
      this.vc = paramb.vc;
      this.vd = paramb.vd;
      this.ve = paramb.ve;
      this.vf = paramb.vf;
      this.vg = paramb.vg;
    }

    final void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
    {
      this.uU = null;
      if (!android.support.v4.content.a.c.a(paramXmlPullParser, "pathData"))
        return;
      Object localObject = paramTypedArray.getString(0);
      if (localObject != null)
        this.vq = ((String)localObject);
      localObject = paramTypedArray.getString(2);
      if (localObject != null)
        this.vp = android.support.v4.a.c.L((String)localObject);
      this.uX = android.support.v4.content.a.c.b(paramTypedArray, paramXmlPullParser, "fillColor", 1, this.uX);
      this.va = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, this.va);
      int i = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8, -1);
      localObject = this.ve;
      switch (i)
      {
      default:
        label128: this.ve = ((Paint.Cap)localObject);
        i = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9, -1);
        localObject = this.vf;
        switch (i)
        {
        default:
        case 0:
        case 1:
        case 2:
        }
        break;
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        this.vf = ((Paint.Join)localObject);
        this.vg = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, this.vg);
        this.uV = android.support.v4.content.a.c.b(paramTypedArray, paramXmlPullParser, "strokeColor", 3, this.uV);
        this.uY = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, this.uY);
        this.uW = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, this.uW);
        this.vc = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, this.vc);
        this.vd = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, this.vd);
        this.vb = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, this.vb);
        this.uZ = android.support.v4.content.a.c.a(paramTypedArray, paramXmlPullParser, "fillType", 13, this.uZ);
        break;
        localObject = Paint.Cap.BUTT;
        break label128;
        localObject = Paint.Cap.ROUND;
        break label128;
        localObject = Paint.Cap.SQUARE;
        break label128;
        localObject = Paint.Join.MITER;
        continue;
        localObject = Paint.Join.ROUND;
        continue;
        localObject = Paint.Join.BEVEL;
      }
    }
  }

  static final class c
  {
    final ArrayList<Object> kx = new ArrayList();
    int mChangingConfigurations;
    float mScaleX = 1.0F;
    float mScaleY = 1.0F;
    int[] uU;
    final Matrix vh = new Matrix();
    float vi = 0.0F;
    float vj = 0.0F;
    float vk = 0.0F;
    float vl = 0.0F;
    float vm = 0.0F;
    final Matrix vn = new Matrix();
    String vo = null;

    public c()
    {
    }

    public c(c paramc, android.support.v4.f.a<String, Object> parama)
    {
      this.vi = paramc.vi;
      this.vj = paramc.vj;
      this.vk = paramc.vk;
      this.mScaleX = paramc.mScaleX;
      this.mScaleY = paramc.mScaleY;
      this.vl = paramc.vl;
      this.vm = paramc.vm;
      this.uU = paramc.uU;
      this.vo = paramc.vo;
      this.mChangingConfigurations = paramc.mChangingConfigurations;
      if (this.vo != null)
        parama.put(this.vo, this);
      this.vn.set(paramc.vn);
      ArrayList localArrayList = paramc.kx;
      int i = 0;
      while (i < localArrayList.size())
      {
        paramc = localArrayList.get(i);
        if ((paramc instanceof c))
        {
          paramc = (c)paramc;
          this.kx.add(new c(paramc, parama));
          i++;
        }
        else
        {
          if ((paramc instanceof i.b));
          for (paramc = new i.b((i.b)paramc); ; paramc = new i.a((i.a)paramc))
          {
            this.kx.add(paramc);
            if (paramc.vq == null)
              break;
            parama.put(paramc.vq, paramc);
            break;
            if (!(paramc instanceof i.a))
              break label314;
          }
          label314: throw new IllegalStateException("Unknown object in the tree!");
        }
      }
    }
  }

  static class d
  {
    int mChangingConfigurations;
    protected c.b[] vp = null;
    String vq;

    public d()
    {
    }

    public d(d paramd)
    {
      this.vq = paramd.vq;
      this.mChangingConfigurations = paramd.mChangingConfigurations;
      this.vp = android.support.v4.a.c.a(paramd.vp);
    }

    public final void b(Path paramPath)
    {
      paramPath.reset();
      if (this.vp != null)
        c.b.a(this.vp, paramPath);
    }

    public boolean cG()
    {
      return false;
    }
  }

  static final class e
  {
    private static final Matrix vt = new Matrix();
    private int mChangingConfigurations;
    float vA = 0.0F;
    float vB = 0.0F;
    float vC = 0.0F;
    int vD = 255;
    String vE = null;
    final android.support.v4.f.a<String, Object> vF = new android.support.v4.f.a();
    private final Path vr;
    private final Path vs;
    private final Matrix vu = new Matrix();
    private Paint vv;
    private Paint vw;
    private PathMeasure vx;
    final i.c vy;
    float vz = 0.0F;

    public e()
    {
      this.vy = new i.c();
      this.vr = new Path();
      this.vs = new Path();
    }

    public e(e parame)
    {
      this.vy = new i.c(parame.vy, this.vF);
      this.vr = new Path(parame.vr);
      this.vs = new Path(parame.vs);
      this.vz = parame.vz;
      this.vA = parame.vA;
      this.vB = parame.vB;
      this.vC = parame.vC;
      this.mChangingConfigurations = parame.mChangingConfigurations;
      this.vD = parame.vD;
      this.vE = parame.vE;
      if (parame.vE != null)
        this.vF.put(parame.vE, this);
    }

    private void a(i.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      paramc.vh.set(paramMatrix);
      paramc.vh.preConcat(paramc.vn);
      paramCanvas.save();
      int i = 0;
      if (i < paramc.kx.size())
      {
        paramMatrix = paramc.kx.get(i);
        if ((paramMatrix instanceof i.c))
          a((i.c)paramMatrix, paramc.vh, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      }
      label782: label798: 
      while (true)
      {
        i++;
        break;
        if ((paramMatrix instanceof i.d))
        {
          paramMatrix = (i.d)paramMatrix;
          float f1 = paramInt1 / this.vB;
          float f2 = paramInt2 / this.vC;
          float f3 = Math.min(f1, f2);
          Object localObject1 = paramc.vh;
          this.vu.set((Matrix)localObject1);
          this.vu.postScale(f1, f2);
          Object localObject2 = new float[4];
          tmp157_155 = localObject2;
          tmp157_155[0] = 0.0F;
          tmp161_157 = tmp157_155;
          tmp161_157[1] = 1.0F;
          tmp165_161 = tmp161_157;
          tmp165_161[2] = 1.0F;
          tmp169_165 = tmp165_161;
          tmp169_165[3] = 0.0F;
          tmp169_165;
          ((Matrix)localObject1).mapVectors((float[])localObject2);
          float f4 = (float)Math.hypot(localObject2[0], localObject2[1]);
          float f5 = (float)Math.hypot(localObject2[2], localObject2[3]);
          f2 = localObject2[0];
          f1 = localObject2[1];
          float f6 = localObject2[2];
          float f7 = localObject2[3];
          f4 = Math.max(f4, f5);
          if (f4 > 0.0F);
          for (f1 = Math.abs(f7 * f2 - f1 * f6) / f4; ; f1 = 0.0F)
          {
            if (f1 == 0.0F)
              break label798;
            paramMatrix.b(this.vr);
            localObject1 = this.vr;
            this.vs.reset();
            if (paramMatrix.cG())
            {
              this.vs.addPath((Path)localObject1, this.vu);
              paramCanvas.clipPath(this.vs);
              break;
            }
            localObject2 = (i.b)paramMatrix;
            label491: Paint localPaint;
            if ((((i.b)localObject2).vb != 0.0F) || (((i.b)localObject2).vc != 1.0F))
            {
              f5 = ((i.b)localObject2).vb;
              f4 = ((i.b)localObject2).vd;
              f6 = ((i.b)localObject2).vc;
              f7 = ((i.b)localObject2).vd;
              if (this.vx == null)
                this.vx = new PathMeasure();
              this.vx.setPath(this.vr, false);
              f2 = this.vx.getLength();
              f4 = (f5 + f4) % 1.0F * f2;
              f7 = (f6 + f7) % 1.0F * f2;
              ((Path)localObject1).reset();
              if (f4 > f7)
              {
                this.vx.getSegment(f4, f2, (Path)localObject1, true);
                this.vx.getSegment(0.0F, f7, (Path)localObject1, true);
                ((Path)localObject1).rLineTo(0.0F, 0.0F);
              }
            }
            else
            {
              this.vs.addPath((Path)localObject1, this.vu);
              if (((i.b)localObject2).uX != 0)
              {
                if (this.vw == null)
                {
                  this.vw = new Paint();
                  this.vw.setStyle(Paint.Style.FILL);
                  this.vw.setAntiAlias(true);
                }
                localPaint = this.vw;
                localPaint.setColor(i.d(((i.b)localObject2).uX, ((i.b)localObject2).va));
                localPaint.setColorFilter(paramColorFilter);
                localObject1 = this.vs;
                if (((i.b)localObject2).uZ != 0)
                  break label782;
              }
            }
            for (paramMatrix = Path.FillType.WINDING; ; paramMatrix = Path.FillType.EVEN_ODD)
            {
              ((Path)localObject1).setFillType(paramMatrix);
              paramCanvas.drawPath(this.vs, localPaint);
              if (((i.b)localObject2).uV == 0)
                break;
              if (this.vv == null)
              {
                this.vv = new Paint();
                this.vv.setStyle(Paint.Style.STROKE);
                this.vv.setAntiAlias(true);
              }
              paramMatrix = this.vv;
              if (((i.b)localObject2).vf != null)
                paramMatrix.setStrokeJoin(((i.b)localObject2).vf);
              if (((i.b)localObject2).ve != null)
                paramMatrix.setStrokeCap(((i.b)localObject2).ve);
              paramMatrix.setStrokeMiter(((i.b)localObject2).vg);
              paramMatrix.setColor(i.d(((i.b)localObject2).uV, ((i.b)localObject2).uY));
              paramMatrix.setColorFilter(paramColorFilter);
              paramMatrix.setStrokeWidth(((i.b)localObject2).uW * (f1 * f3));
              paramCanvas.drawPath(this.vs, paramMatrix);
              break;
              this.vx.getSegment(f4, f7, (Path)localObject1, true);
              break label491;
            }
            paramCanvas.restore();
            return;
          }
        }
      }
    }

    public final void a(Canvas paramCanvas, int paramInt1, int paramInt2)
    {
      a(this.vy, vt, paramCanvas, paramInt1, paramInt2, null);
    }
  }

  static final class f extends Drawable.ConstantState
  {
    int mChangingConfigurations;
    i.e vG;
    ColorStateList vH = null;
    PorterDuff.Mode vI = i.uK;
    boolean vJ;
    Bitmap vK;
    ColorStateList vL;
    PorterDuff.Mode vM;
    int vN;
    boolean vO;
    boolean vP;
    Paint vQ;

    public f()
    {
      this.vG = new i.e();
    }

    public f(f paramf)
    {
      if (paramf != null)
      {
        this.mChangingConfigurations = paramf.mChangingConfigurations;
        this.vG = new i.e(paramf.vG);
        if (i.e.a(paramf.vG) != null)
          i.e.a(this.vG, new Paint(i.e.a(paramf.vG)));
        if (i.e.b(paramf.vG) != null)
          i.e.b(this.vG, new Paint(i.e.b(paramf.vG)));
        this.vH = paramf.vH;
        this.vI = paramf.vI;
        this.vJ = paramf.vJ;
      }
    }

    public final int getChangingConfigurations()
    {
      return this.mChangingConfigurations;
    }

    public final Drawable newDrawable()
    {
      return new i(this);
    }

    public final Drawable newDrawable(Resources paramResources)
    {
      return new i(this);
    }

    public final void p(int paramInt1, int paramInt2)
    {
      this.vK.eraseColor(0);
      Canvas localCanvas = new Canvas(this.vK);
      this.vG.a(localCanvas, paramInt1, paramInt2);
    }
  }

  static final class g extends Drawable.ConstantState
  {
    private final Drawable.ConstantState uE;

    public g(Drawable.ConstantState paramConstantState)
    {
      this.uE = paramConstantState;
    }

    public final boolean canApplyTheme()
    {
      return this.uE.canApplyTheme();
    }

    public final int getChangingConfigurations()
    {
      return this.uE.getChangingConfigurations();
    }

    public final Drawable newDrawable()
    {
      i locali = new i();
      locali.uJ = ((VectorDrawable)this.uE.newDrawable());
      return locali;
    }

    public final Drawable newDrawable(Resources paramResources)
    {
      i locali = new i();
      locali.uJ = ((VectorDrawable)this.uE.newDrawable(paramResources));
      return locali;
    }

    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      i locali = new i();
      locali.uJ = ((VectorDrawable)this.uE.newDrawable(paramResources, paramTheme));
      return locali;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.c.a.i
 * JD-Core Version:    0.6.2
 */