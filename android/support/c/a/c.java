package android.support.c.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public final class c extends h
  implements b
{
  private Context mContext;
  private a uu;
  private ArgbEvaluator uv = null;
  private Animator.AnimatorListener uw = null;
  private ArrayList<Object> ux = null;
  final Drawable.Callback uy = new Drawable.Callback()
  {
    public final void invalidateDrawable(Drawable paramAnonymousDrawable)
    {
      c.this.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable, long paramAnonymousLong)
    {
      c.this.scheduleSelf(paramAnonymousRunnable, paramAnonymousLong);
    }

    public final void unscheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable)
    {
      c.this.unscheduleSelf(paramAnonymousRunnable);
    }
  };

  c()
  {
    this(null, (byte)0);
  }

  private c(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private c(Context paramContext, byte paramByte)
  {
    this.mContext = paramContext;
    this.uu = new a();
  }

  public static c a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramContext = new c(paramContext);
    paramContext.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return paramContext;
  }

  private void a(Animator paramAnimator)
  {
    Object localObject;
    if ((paramAnimator instanceof AnimatorSet))
    {
      localObject = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (localObject != null)
        for (int i = 0; i < ((List)localObject).size(); i++)
          a((Animator)((List)localObject).get(i));
    }
    if ((paramAnimator instanceof ObjectAnimator))
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      localObject = paramAnimator.getPropertyName();
      if (("fillColor".equals(localObject)) || ("strokeColor".equals(localObject)))
      {
        if (this.uv == null)
          this.uv = new ArgbEvaluator();
        paramAnimator.setEvaluator(this.uv);
      }
    }
  }

  public final void applyTheme(Resources.Theme paramTheme)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramTheme);
  }

  public final boolean canApplyTheme()
  {
    if (this.uJ != null);
    for (boolean bool = android.support.v4.a.a.a.d(this.uJ); ; bool = false)
      return bool;
  }

  public final void draw(Canvas paramCanvas)
  {
    if (this.uJ != null)
      this.uJ.draw(paramCanvas);
    while (true)
    {
      return;
      this.uu.uA.draw(paramCanvas);
      if (this.uu.uB.isStarted())
        invalidateSelf();
    }
  }

  public final int getAlpha()
  {
    if (this.uJ != null);
    for (int i = android.support.v4.a.a.a.c(this.uJ); ; i = this.uu.uA.getAlpha())
      return i;
  }

  public final int getChangingConfigurations()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getChangingConfigurations(); ; i = super.getChangingConfigurations() | this.uu.mChangingConfigurations)
      return i;
  }

  public final Drawable.ConstantState getConstantState()
  {
    if ((this.uJ != null) && (Build.VERSION.SDK_INT >= 24));
    for (b localb = new b(this.uJ.getConstantState()); ; localb = null)
      return localb;
  }

  public final int getIntrinsicHeight()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getIntrinsicHeight(); ; i = this.uu.uA.getIntrinsicHeight())
      return i;
  }

  public final int getIntrinsicWidth()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getIntrinsicWidth(); ; i = this.uu.uA.getIntrinsicWidth())
      return i;
  }

  public final int getOpacity()
  {
    if (this.uJ != null);
    for (int i = this.uJ.getOpacity(); ; i = this.uu.uA.getOpacity())
      return i;
  }

  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }

  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    while (true)
    {
      return;
      int i = paramXmlPullParser.getEventType();
      int j = paramXmlPullParser.getDepth();
      if ((i != 1) && ((paramXmlPullParser.getDepth() >= j + 1) || (i != 3)))
      {
        if (i == 2)
        {
          localObject1 = paramXmlPullParser.getName();
          if (!"animated-vector".equals(localObject1))
            break label182;
          localObject1 = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.ul);
          i = ((TypedArray)localObject1).getResourceId(0, 0);
          if (i != 0)
          {
            localObject2 = i.a(paramResources, i, paramTheme);
            ((i)localObject2).uP = false;
            ((i)localObject2).setCallback(this.uy);
            if (this.uu.uA != null)
              this.uu.uA.setCallback(null);
            this.uu.uA = ((i)localObject2);
          }
          ((TypedArray)localObject1).recycle();
        }
        label182: 
        while (!"target".equals(localObject1))
        {
          i = paramXmlPullParser.next();
          break;
        }
        TypedArray localTypedArray = paramResources.obtainAttributes(paramAttributeSet, a.um);
        Object localObject2 = localTypedArray.getString(0);
        i = localTypedArray.getResourceId(1, 0);
        if (i != 0)
        {
          if (this.mContext == null)
            break label392;
          localObject1 = this.mContext;
          if (Build.VERSION.SDK_INT < 24)
            break label370;
        }
        label370: for (Object localObject1 = AnimatorInflater.loadAnimator((Context)localObject1, i); ; localObject1 = e.a((Context)localObject1, ((Context)localObject1).getResources(), ((Context)localObject1).getTheme(), i))
        {
          ((Animator)localObject1).setTarget(this.uu.uA.uL.vG.vF.get(localObject2));
          if (Build.VERSION.SDK_INT < 21)
            a((Animator)localObject1);
          if (a.a(this.uu) == null)
          {
            a.a(this.uu, new ArrayList());
            this.uu.uD = new android.support.v4.f.a();
          }
          a.a(this.uu).add(localObject1);
          this.uu.uD.put(localObject1, localObject2);
          localTypedArray.recycle();
          break;
        }
        label392: localTypedArray.recycle();
        throw new IllegalStateException("Context can't be null when inflating animators");
      }
      paramResources = this.uu;
      if (paramResources.uB == null)
        paramResources.uB = new AnimatorSet();
      paramResources.uB.playTogether(paramResources.uC);
    }
  }

  public final boolean isAutoMirrored()
  {
    if (this.uJ != null);
    for (boolean bool = android.support.v4.a.a.a.b(this.uJ); ; bool = this.uu.uA.isAutoMirrored())
      return bool;
  }

  public final boolean isRunning()
  {
    if (this.uJ != null);
    for (boolean bool = ((AnimatedVectorDrawable)this.uJ).isRunning(); ; bool = this.uu.uB.isRunning())
      return bool;
  }

  public final boolean isStateful()
  {
    if (this.uJ != null);
    for (boolean bool = this.uJ.isStateful(); ; bool = this.uu.uA.isStateful())
      return bool;
  }

  public final Drawable mutate()
  {
    if (this.uJ != null)
      this.uJ.mutate();
    return this;
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    if (this.uJ != null)
      this.uJ.setBounds(paramRect);
    while (true)
    {
      return;
      this.uu.uA.setBounds(paramRect);
    }
  }

  protected final boolean onLevelChange(int paramInt)
  {
    if (this.uJ != null);
    for (boolean bool = this.uJ.setLevel(paramInt); ; bool = this.uu.uA.setLevel(paramInt))
      return bool;
  }

  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.uJ != null);
    for (boolean bool = this.uJ.setState(paramArrayOfInt); ; bool = this.uu.uA.setState(paramArrayOfInt))
      return bool;
  }

  public final void setAlpha(int paramInt)
  {
    if (this.uJ != null)
      this.uJ.setAlpha(paramInt);
    while (true)
    {
      return;
      this.uu.uA.setAlpha(paramInt);
    }
  }

  public final void setAutoMirrored(boolean paramBoolean)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramBoolean);
    while (true)
    {
      return;
      this.uu.uA.setAutoMirrored(paramBoolean);
    }
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.uJ != null)
      this.uJ.setColorFilter(paramColorFilter);
    while (true)
    {
      return;
      this.uu.uA.setColorFilter(paramColorFilter);
    }
  }

  public final void setTint(int paramInt)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramInt);
    while (true)
    {
      return;
      this.uu.uA.setTint(paramInt);
    }
  }

  public final void setTintList(ColorStateList paramColorStateList)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramColorStateList);
    while (true)
    {
      return;
      this.uu.uA.setTintList(paramColorStateList);
    }
  }

  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.uJ != null)
      android.support.v4.a.a.a.a(this.uJ, paramMode);
    while (true)
    {
      return;
      this.uu.uA.setTintMode(paramMode);
    }
  }

  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.uJ != null);
    for (paramBoolean1 = this.uJ.setVisible(paramBoolean1, paramBoolean2); ; paramBoolean1 = super.setVisible(paramBoolean1, paramBoolean2))
    {
      return paramBoolean1;
      this.uu.uA.setVisible(paramBoolean1, paramBoolean2);
    }
  }

  public final void start()
  {
    if (this.uJ != null)
      ((AnimatedVectorDrawable)this.uJ).start();
    while (true)
    {
      return;
      if (!this.uu.uB.isStarted())
      {
        this.uu.uB.start();
        invalidateSelf();
      }
    }
  }

  public final void stop()
  {
    if (this.uJ != null)
      ((AnimatedVectorDrawable)this.uJ).stop();
    while (true)
    {
      return;
      this.uu.uB.end();
    }
  }

  static final class a extends Drawable.ConstantState
  {
    int mChangingConfigurations;
    i uA;
    AnimatorSet uB;
    ArrayList<Animator> uC;
    android.support.v4.f.a<Animator, String> uD;

    public final int getChangingConfigurations()
    {
      return this.mChangingConfigurations;
    }

    public final Drawable newDrawable()
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources paramResources)
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
  }

  static final class b extends Drawable.ConstantState
  {
    private final Drawable.ConstantState uE;

    public b(Drawable.ConstantState paramConstantState)
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
      c localc = new c();
      localc.uJ = this.uE.newDrawable();
      localc.uJ.setCallback(localc.uy);
      return localc;
    }

    public final Drawable newDrawable(Resources paramResources)
    {
      c localc = new c();
      localc.uJ = this.uE.newDrawable(paramResources);
      localc.uJ.setCallback(localc.uy);
      return localc;
    }

    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      c localc = new c();
      localc.uJ = this.uE.newDrawable(paramResources, paramTheme);
      localc.uJ.setCallback(localc.uy);
      return localc;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.c.a.c
 * JD-Core Version:    0.6.2
 */