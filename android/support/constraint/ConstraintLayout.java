package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.constraint.a.a.e;
import android.support.constraint.a.a.e.b;
import android.support.constraint.a.a.e.c;
import android.support.constraint.a.a.f.a;
import android.support.constraint.a.a.g;
import android.support.constraint.a.a.i;
import android.support.constraint.a.a.m;
import android.support.constraint.a.a.n;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup
{
  SparseArray<View> db = new SparseArray();
  private ArrayList<ConstraintHelper> dc = new ArrayList(4);
  private final ArrayList<android.support.constraint.a.a.f> dd = new ArrayList(100);
  g de = new g();
  private int dg = 0;
  private int dh = 0;
  private int di = 2147483647;
  private int dj = 2147483647;
  private boolean dk = true;
  private int dl = 7;
  private a dm = null;
  private int dn = -1;
  private HashMap<String, Integer> jdField_do = new HashMap();
  private int dp = -1;
  private int dq = -1;
  int dr = -1;
  int ds = -1;
  int dt = 0;
  int du = 0;
  private android.support.constraint.a.f dv;

  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b(paramAttributeSet);
  }

  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b(paramAttributeSet);
  }

  private void ar()
  {
    this.de.aZ();
    if (this.dv != null)
    {
      android.support.constraint.a.f localf = this.dv;
      localf.gf += 1L;
    }
  }

  protected static ConstraintLayout.LayoutParams as()
  {
    return new ConstraintLayout.LayoutParams();
  }

  private void b(AttributeSet paramAttributeSet)
  {
    this.de.iX = this;
    this.db.put(getId(), this);
    this.dm = null;
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, b.a.ConstraintLayout_Layout);
      int i = paramAttributeSet.getIndexCount();
      int j = 0;
      if (j < i)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == 3)
          this.dg = paramAttributeSet.getDimensionPixelOffset(k, this.dg);
        while (true)
        {
          j++;
          break;
          if (k == 4)
          {
            this.dh = paramAttributeSet.getDimensionPixelOffset(k, this.dh);
          }
          else if (k == 1)
          {
            this.di = paramAttributeSet.getDimensionPixelOffset(k, this.di);
          }
          else if (k == 2)
          {
            this.dj = paramAttributeSet.getDimensionPixelOffset(k, this.dj);
          }
          else if (k == 59)
          {
            this.dl = paramAttributeSet.getInt(k, this.dl);
          }
          else if (k == 8)
          {
            int m = paramAttributeSet.getResourceId(k, 0);
            try
            {
              a locala = new android/support/constraint/a;
              locala.<init>();
              this.dm = locala;
              locala = this.dm;
              Context localContext = getContext();
              XmlResourceParser localXmlResourceParser = localContext.getResources().getXml(m);
              try
              {
                k = localXmlResourceParser.getEventType();
                if (k != 1)
                  switch (k)
                  {
                  case 1:
                  default:
                  case 0:
                    while (true)
                    {
                      k = localXmlResourceParser.next();
                      break;
                      localXmlResourceParser.getName();
                    }
                  case 2:
                  }
              }
              catch (XmlPullParserException localXmlPullParserException)
              {
                while (true)
                {
                  this.dn = m;
                  break;
                  String str = localXmlResourceParser.getName();
                  Object localObject = Xml.asAttributeSet(localXmlResourceParser);
                  a.a locala1 = new android/support/constraint/a$a;
                  locala1.<init>((byte)0);
                  localObject = localContext.obtainStyledAttributes((AttributeSet)localObject, b.a.ConstraintSet);
                  a.a(locala1, (TypedArray)localObject);
                  ((TypedArray)localObject).recycle();
                  if (str.equalsIgnoreCase("Guideline"))
                    locala1.eN = true;
                  localXmlPullParserException.eL.put(Integer.valueOf(locala1.eO), locala1);
                }
              }
              catch (IOException localIOException)
              {
                label305: break label305;
              }
            }
            catch (Resources.NotFoundException localNotFoundException)
            {
              while (true)
                this.dm = null;
            }
          }
        }
      }
      paramAttributeSet.recycle();
    }
    this.de.dl = this.dl;
  }

  private void c(Object paramObject1, Object paramObject2)
  {
    if (((paramObject1 instanceof String)) && ((paramObject2 instanceof Integer)))
    {
      if (this.jdField_do == null)
        this.jdField_do = new HashMap();
      String str = (String)paramObject1;
      int i = str.indexOf("/");
      paramObject1 = str;
      if (i != -1)
        paramObject1 = str.substring(i + 1);
      i = ((Integer)paramObject2).intValue();
      this.jdField_do.put(paramObject1, Integer.valueOf(i));
    }
  }

  private final android.support.constraint.a.a.f p(int paramInt)
  {
    Object localObject;
    if (paramInt == 0)
      localObject = this.de;
    while (true)
    {
      return localObject;
      View localView = (View)this.db.get(paramInt);
      localObject = localView;
      if (localView == null)
      {
        localView = findViewById(paramInt);
        localObject = localView;
        if (localView != null)
        {
          localObject = localView;
          if (localView != this)
          {
            localObject = localView;
            if (localView.getParent() == this)
            {
              onViewAdded(localView);
              localObject = localView;
            }
          }
        }
      }
      if (localObject == this)
        localObject = this.de;
      else if (localObject == null)
        localObject = null;
      else
        localObject = ((ConstraintLayout.LayoutParams)((View)localObject).getLayoutParams()).eH;
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if (Build.VERSION.SDK_INT < 14)
      onViewAdded(paramView);
  }

  public final android.support.constraint.a.a.f b(View paramView)
  {
    if (paramView == this)
      paramView = this.de;
    while (true)
    {
      return paramView;
      if (paramView == null)
        paramView = null;
      else
        paramView = ((ConstraintLayout.LayoutParams)paramView.getLayoutParams()).eH;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ConstraintLayout.LayoutParams;
  }

  public void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    if (isInEditMode())
    {
      int i = getChildCount();
      float f1 = getWidth();
      float f2 = getHeight();
      for (int j = 0; j < i; j++)
      {
        Object localObject = getChildAt(j);
        if (((View)localObject).getVisibility() != 8)
        {
          localObject = ((View)localObject).getTag();
          if ((localObject != null) && ((localObject instanceof String)))
          {
            localObject = ((String)localObject).split(",");
            if (localObject.length == 4)
            {
              int k = Integer.parseInt(localObject[0]);
              int m = Integer.parseInt(localObject[1]);
              int n = Integer.parseInt(localObject[2]);
              int i1 = Integer.parseInt(localObject[3]);
              k = (int)(k / 1080.0F * f1);
              m = (int)(m / 1920.0F * f2);
              n = (int)(n / 1080.0F * f1);
              i1 = (int)(i1 / 1920.0F * f2);
              localObject = new Paint();
              ((Paint)localObject).setColor(-65536);
              paramCanvas.drawLine(k, m, k + n, m, (Paint)localObject);
              paramCanvas.drawLine(k + n, m, k + n, m + i1, (Paint)localObject);
              paramCanvas.drawLine(k + n, m + i1, k, m + i1, (Paint)localObject);
              paramCanvas.drawLine(k, m + i1, k, m, (Paint)localObject);
              ((Paint)localObject).setColor(-16711936);
              paramCanvas.drawLine(k, m, k + n, m + i1, (Paint)localObject);
              paramCanvas.drawLine(k, m + i1, k + n, m, (Paint)localObject);
            }
          }
        }
      }
    }
  }

  public final Object f(Object paramObject)
  {
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      if ((this.jdField_do == null) || (!this.jdField_do.containsKey(paramObject)));
    }
    for (paramObject = this.jdField_do.get(paramObject); ; paramObject = null)
      return paramObject;
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new ConstraintLayout.LayoutParams(paramLayoutParams);
  }

  public int getMaxHeight()
  {
    return this.dj;
  }

  public int getMaxWidth()
  {
    return this.di;
  }

  public int getMinHeight()
  {
    return this.dh;
  }

  public int getMinWidth()
  {
    return this.dg;
  }

  public int getOptimizationLevel()
  {
    return this.de.dl;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramBoolean = isInEditMode();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)localView.getLayoutParams();
      Object localObject = localLayoutParams.eH;
      if (((localView.getVisibility() != 8) || (localLayoutParams.eu) || (localLayoutParams.ev) || (paramBoolean)) && (!localLayoutParams.ew))
      {
        paramInt3 = ((android.support.constraint.a.a.f)localObject).aO();
        int i = ((android.support.constraint.a.a.f)localObject).aP();
        paramInt4 = ((android.support.constraint.a.a.f)localObject).getWidth() + paramInt3;
        int j = ((android.support.constraint.a.a.f)localObject).getHeight() + i;
        localView.layout(paramInt3, i, paramInt4, j);
        if ((localView instanceof Placeholder))
        {
          localObject = ((Placeholder)localView).getContent();
          if (localObject != null)
          {
            ((View)localObject).setVisibility(0);
            ((View)localObject).layout(paramInt3, i, paramInt4, j);
          }
        }
      }
    }
    paramInt2 = this.dc.size();
    if (paramInt2 > 0)
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
        ((ConstraintHelper)this.dc.get(paramInt1)).aq();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    System.currentTimeMillis();
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n = getPaddingLeft();
    int i1 = getPaddingTop();
    this.de.setX(n);
    this.de.setY(i1);
    Object localObject1 = this.de;
    int i2 = this.di;
    ((android.support.constraint.a.a.f)localObject1).is[0] = i2;
    localObject1 = this.de;
    i2 = this.dj;
    ((android.support.constraint.a.a.f)localObject1).is[1] = i2;
    boolean bool;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    Object localObject2;
    label235: int i10;
    label275: int i11;
    label411: int i12;
    label469: Object localObject3;
    if (Build.VERSION.SDK_INT >= 17)
    {
      localObject1 = this.de;
      if (getLayoutDirection() == 1)
      {
        bool = true;
        ((g)localObject1).hq = bool;
      }
    }
    else
    {
      i3 = View.MeasureSpec.getMode(paramInt1);
      i2 = View.MeasureSpec.getSize(paramInt1);
      i4 = View.MeasureSpec.getMode(paramInt2);
      i5 = View.MeasureSpec.getSize(paramInt2);
      i6 = getPaddingTop();
      i7 = getPaddingBottom();
      i8 = getPaddingLeft();
      i9 = getPaddingRight();
      localObject1 = f.a.jq;
      localObject2 = f.a.jq;
      getLayoutParams();
      switch (i3)
      {
      default:
        i2 = 0;
        switch (i4)
        {
        default:
          i5 = 0;
          this.de.setMinWidth(0);
          this.de.setMinHeight(0);
          this.de.a((f.a)localObject1);
          this.de.setWidth(i2);
          this.de.b((f.a)localObject2);
          this.de.setHeight(i5);
          this.de.setMinWidth(this.dg - getPaddingLeft() - getPaddingRight());
          this.de.setMinHeight(this.dh - getPaddingTop() - getPaddingBottom());
          i10 = this.de.getWidth();
          i11 = this.de.getHeight();
          if (this.dk)
          {
            this.dk = false;
            i7 = getChildCount();
            i4 = 0;
            i2 = 0;
            i5 = i4;
            if (i2 < i7)
            {
              if (getChildAt(i2).isLayoutRequested())
                i5 = 1;
            }
            else
            {
              if (i5 == 0)
                break label2824;
              this.dd.clear();
              bool = isInEditMode();
              i12 = getChildCount();
              if (!bool)
                break label652;
              i2 = 0;
              if (i2 >= i12)
                break label652;
              localObject3 = getChildAt(i2);
            }
          }
          break;
        case -2147483648:
        case 0:
        case 1073741824:
        }
        break;
      case -2147483648:
      case 0:
      case 1073741824:
      }
    }
    while (true)
    {
      try
      {
        localObject2 = getResources().getResourceName(((View)localObject3).getId());
        c(localObject2, Integer.valueOf(((View)localObject3).getId()));
        i5 = ((String)localObject2).indexOf('/');
        localObject1 = localObject2;
        if (i5 != -1)
          localObject1 = ((String)localObject2).substring(i5 + 1);
        p(((View)localObject3).getId()).ja = ((String)localObject1);
        i2++;
        break label469;
        bool = false;
        break;
        localObject1 = f.a.jr;
        break label235;
        localObject1 = f.a.jr;
        i2 = 0;
        break label235;
        i2 = Math.min(this.di, i2) - (i8 + i9);
        break label235;
        localObject2 = f.a.jr;
        break label275;
        localObject2 = f.a.jr;
        i5 = 0;
        break label275;
        i5 = Math.min(this.dj, i5) - (i6 + i7);
        break label275;
        i2++;
        break label411;
        label652: i2 = 0;
        if (i2 < i12)
        {
          localObject1 = b(getChildAt(i2));
          if (localObject1 != null)
            ((android.support.constraint.a.a.f)localObject1).reset();
          i2++;
          continue;
        }
        if (this.dn != -1)
        {
          i2 = 0;
          if (i2 < i12)
          {
            localObject1 = getChildAt(i2);
            if ((((View)localObject1).getId() == this.dn) && ((localObject1 instanceof Constraints)))
              this.dm = ((Constraints)localObject1).getConstraintSet();
            i2++;
            continue;
          }
        }
        if (this.dm != null)
          this.dm.b(this);
        this.de.bh();
        i5 = this.dc.size();
        if (i5 > 0)
        {
          i2 = 0;
          if (i2 < i5)
          {
            ((ConstraintHelper)this.dc.get(i2)).a(this);
            i2++;
            continue;
          }
        }
        i2 = 0;
        if (i2 < i12)
        {
          localObject1 = getChildAt(i2);
          if ((localObject1 instanceof Placeholder))
          {
            localObject1 = (Placeholder)localObject1;
            if ((((Placeholder)localObject1).fq == -1) && (!((Placeholder)localObject1).isInEditMode()))
              ((Placeholder)localObject1).setVisibility(((Placeholder)localObject1).ft);
            ((Placeholder)localObject1).fs = findViewById(((Placeholder)localObject1).fq);
            if (((Placeholder)localObject1).fs != null)
            {
              ((ConstraintLayout.LayoutParams)((Placeholder)localObject1).fs.getLayoutParams()).ew = true;
              ((Placeholder)localObject1).fs.setVisibility(0);
              ((Placeholder)localObject1).setVisibility(0);
            }
          }
          i2++;
          continue;
        }
        i13 = 0;
        int i14;
        Object localObject4;
        if (i13 < i12)
        {
          localObject3 = getChildAt(i13);
          localObject2 = b((View)localObject3);
          if (localObject2 != null)
          {
            localObject1 = (ConstraintLayout.LayoutParams)((View)localObject3).getLayoutParams();
            ((ConstraintLayout.LayoutParams)localObject1).validate();
            if (((ConstraintLayout.LayoutParams)localObject1).eI)
            {
              ((ConstraintLayout.LayoutParams)localObject1).eI = false;
              ((android.support.constraint.a.a.f)localObject2).iZ = ((View)localObject3).getVisibility();
              if (((ConstraintLayout.LayoutParams)localObject1).ew)
                ((android.support.constraint.a.a.f)localObject2).iZ = 8;
              ((android.support.constraint.a.a.f)localObject2).iX = localObject3;
              this.de.e((android.support.constraint.a.a.f)localObject2);
              if ((!((ConstraintLayout.LayoutParams)localObject1).es) || (!((ConstraintLayout.LayoutParams)localObject1).er))
                this.dd.add(localObject2);
              if (!((ConstraintLayout.LayoutParams)localObject1).eu)
                continue;
              localObject2 = (i)localObject2;
              i2 = ((ConstraintLayout.LayoutParams)localObject1).eE;
              i5 = ((ConstraintLayout.LayoutParams)localObject1).eF;
              f1 = ((ConstraintLayout.LayoutParams)localObject1).eG;
              if (Build.VERSION.SDK_INT < 17)
              {
                i2 = ((ConstraintLayout.LayoutParams)localObject1).dw;
                i5 = ((ConstraintLayout.LayoutParams)localObject1).dz;
                f1 = ((ConstraintLayout.LayoutParams)localObject1).dA;
              }
              if (f1 == -1.0F)
                continue;
              ((i)localObject2).g(f1);
            }
          }
          else
          {
            i13++;
            continue;
          }
          if (!bool)
            continue;
          try
          {
            String str = getResources().getResourceName(((View)localObject3).getId());
            c(str, Integer.valueOf(((View)localObject3).getId()));
            str = str.substring(str.indexOf("id/") + 3);
            p(((View)localObject3).getId()).ja = str;
          }
          catch (Resources.NotFoundException localNotFoundException2)
          {
          }
          continue;
          if (i2 != -1)
          {
            ((i)localObject2).B(i2);
            continue;
          }
          if (i5 == -1)
            continue;
          ((i)localObject2).C(i5);
          continue;
          if ((((ConstraintLayout.LayoutParams)localObject1).dB == -1) && (((ConstraintLayout.LayoutParams)localObject1).dC == -1) && (((ConstraintLayout.LayoutParams)localObject1).dD == -1) && (((ConstraintLayout.LayoutParams)localObject1).dE == -1) && (((ConstraintLayout.LayoutParams)localObject1).dO == -1) && (((ConstraintLayout.LayoutParams)localObject1).dN == -1) && (((ConstraintLayout.LayoutParams)localObject1).dP == -1) && (((ConstraintLayout.LayoutParams)localObject1).dQ == -1) && (((ConstraintLayout.LayoutParams)localObject1).dF == -1) && (((ConstraintLayout.LayoutParams)localObject1).dG == -1) && (((ConstraintLayout.LayoutParams)localObject1).dH == -1) && (((ConstraintLayout.LayoutParams)localObject1).dI == -1) && (((ConstraintLayout.LayoutParams)localObject1).dJ == -1) && (((ConstraintLayout.LayoutParams)localObject1).em == -1) && (((ConstraintLayout.LayoutParams)localObject1).eo == -1) && (((ConstraintLayout.LayoutParams)localObject1).dK == -1) && (((ConstraintLayout.LayoutParams)localObject1).width != -1) && (((ConstraintLayout.LayoutParams)localObject1).height != -1))
            continue;
          i4 = ((ConstraintLayout.LayoutParams)localObject1).ex;
          i7 = ((ConstraintLayout.LayoutParams)localObject1).ey;
          i3 = ((ConstraintLayout.LayoutParams)localObject1).ez;
          i9 = ((ConstraintLayout.LayoutParams)localObject1).eA;
          i14 = ((ConstraintLayout.LayoutParams)localObject1).eB;
          i8 = ((ConstraintLayout.LayoutParams)localObject1).eC;
          float f1 = ((ConstraintLayout.LayoutParams)localObject1).eD;
          if (Build.VERSION.SDK_INT >= 17)
            continue;
          i7 = ((ConstraintLayout.LayoutParams)localObject1).dB;
          i4 = ((ConstraintLayout.LayoutParams)localObject1).dC;
          i15 = ((ConstraintLayout.LayoutParams)localObject1).dD;
          i16 = ((ConstraintLayout.LayoutParams)localObject1).dE;
          i17 = ((ConstraintLayout.LayoutParams)localObject1).dR;
          i6 = ((ConstraintLayout.LayoutParams)localObject1).dT;
          float f2 = ((ConstraintLayout.LayoutParams)localObject1).dX;
          i2 = i4;
          i5 = i7;
          if (i7 == -1)
          {
            i2 = i4;
            i5 = i7;
            if (i4 == -1)
            {
              if (((ConstraintLayout.LayoutParams)localObject1).dO == -1)
                continue;
              i5 = ((ConstraintLayout.LayoutParams)localObject1).dO;
              i2 = i4;
            }
          }
          f1 = f2;
          i8 = i6;
          i9 = i16;
          i3 = i15;
          i14 = i17;
          i7 = i2;
          i4 = i5;
          if (i15 != -1)
            continue;
          f1 = f2;
          i8 = i6;
          i9 = i16;
          i3 = i15;
          i14 = i17;
          i7 = i2;
          i4 = i5;
          if (i16 != -1)
            continue;
          if (((ConstraintLayout.LayoutParams)localObject1).dP != -1)
          {
            i8 = ((ConstraintLayout.LayoutParams)localObject1).dP;
            f1 = f2;
            i9 = i16;
            i14 = i17;
            if (((ConstraintLayout.LayoutParams)localObject1).dK == -1)
              continue;
            localObject3 = p(((ConstraintLayout.LayoutParams)localObject1).dK);
            if (localObject3 != null)
            {
              f1 = ((ConstraintLayout.LayoutParams)localObject1).dM;
              i2 = ((ConstraintLayout.LayoutParams)localObject1).dL;
              ((android.support.constraint.a.a.f)localObject2).a(e.c.hT, (android.support.constraint.a.a.f)localObject3, e.c.hT, i2, 0);
              ((android.support.constraint.a.a.f)localObject2).it = f1;
            }
            if ((bool) && ((((ConstraintLayout.LayoutParams)localObject1).em != -1) || (((ConstraintLayout.LayoutParams)localObject1).eo != -1)))
              ((android.support.constraint.a.a.f)localObject2).f(((ConstraintLayout.LayoutParams)localObject1).em, ((ConstraintLayout.LayoutParams)localObject1).eo);
            if (((ConstraintLayout.LayoutParams)localObject1).er)
              continue;
            if (((ConstraintLayout.LayoutParams)localObject1).width != -1)
              continue;
            ((android.support.constraint.a.a.f)localObject2).a(f.a.jt);
            ((android.support.constraint.a.a.f)localObject2).a(e.c.hO).hz = ((ConstraintLayout.LayoutParams)localObject1).leftMargin;
            ((android.support.constraint.a.a.f)localObject2).a(e.c.hQ).hz = ((ConstraintLayout.LayoutParams)localObject1).rightMargin;
            if (((ConstraintLayout.LayoutParams)localObject1).es)
              continue;
            if (((ConstraintLayout.LayoutParams)localObject1).height != -1)
              continue;
            ((android.support.constraint.a.a.f)localObject2).b(f.a.jt);
            ((android.support.constraint.a.a.f)localObject2).a(e.c.hP).hz = ((ConstraintLayout.LayoutParams)localObject1).topMargin;
            ((android.support.constraint.a.a.f)localObject2).a(e.c.hR).hz = ((ConstraintLayout.LayoutParams)localObject1).bottomMargin;
            if (((ConstraintLayout.LayoutParams)localObject1).dZ != null)
              ((android.support.constraint.a.a.f)localObject2).B(((ConstraintLayout.LayoutParams)localObject1).dZ);
            f1 = ((ConstraintLayout.LayoutParams)localObject1).horizontalWeight;
            ((android.support.constraint.a.a.f)localObject2).jk[0] = f1;
            f1 = ((ConstraintLayout.LayoutParams)localObject1).verticalWeight;
            ((android.support.constraint.a.a.f)localObject2).jk[1] = f1;
            ((android.support.constraint.a.a.f)localObject2).jg = ((ConstraintLayout.LayoutParams)localObject1).ec;
            ((android.support.constraint.a.a.f)localObject2).jh = ((ConstraintLayout.LayoutParams)localObject1).ed;
            i5 = ((ConstraintLayout.LayoutParams)localObject1).ee;
            i4 = ((ConstraintLayout.LayoutParams)localObject1).eg;
            i2 = ((ConstraintLayout.LayoutParams)localObject1).ei;
            f1 = ((ConstraintLayout.LayoutParams)localObject1).ek;
            ((android.support.constraint.a.a.f)localObject2).ib = i5;
            ((android.support.constraint.a.a.f)localObject2).jdField_if = i4;
            ((android.support.constraint.a.a.f)localObject2).ig = i2;
            ((android.support.constraint.a.a.f)localObject2).ih = f1;
            if ((f1 < 1.0F) && (((android.support.constraint.a.a.f)localObject2).ib == 0))
              ((android.support.constraint.a.a.f)localObject2).ib = 2;
            i2 = ((ConstraintLayout.LayoutParams)localObject1).ef;
            i4 = ((ConstraintLayout.LayoutParams)localObject1).eh;
            i5 = ((ConstraintLayout.LayoutParams)localObject1).ej;
            f1 = ((ConstraintLayout.LayoutParams)localObject1).el;
            ((android.support.constraint.a.a.f)localObject2).ic = i2;
            ((android.support.constraint.a.a.f)localObject2).ii = i4;
            ((android.support.constraint.a.a.f)localObject2).ij = i5;
            ((android.support.constraint.a.a.f)localObject2).ik = f1;
            if ((f1 >= 1.0F) || (((android.support.constraint.a.a.f)localObject2).ic != 0))
              continue;
            ((android.support.constraint.a.a.f)localObject2).ic = 2;
            continue;
            i2 = i4;
            i5 = i7;
            if (((ConstraintLayout.LayoutParams)localObject1).dN == -1)
              continue;
            i2 = ((ConstraintLayout.LayoutParams)localObject1).dN;
            i5 = i7;
            continue;
          }
          f1 = f2;
          i8 = i6;
          i9 = i16;
          i3 = i15;
          i14 = i17;
          i7 = i2;
          i4 = i5;
          if (((ConstraintLayout.LayoutParams)localObject1).dQ == -1)
            continue;
          i9 = ((ConstraintLayout.LayoutParams)localObject1).dQ;
          f1 = f2;
          i8 = i15;
          i14 = i17;
          continue;
          if (i5 != -1)
          {
            localObject3 = p(i5);
            if (localObject3 != null)
              ((android.support.constraint.a.a.f)localObject2).a(e.c.hO, (android.support.constraint.a.a.f)localObject3, e.c.hO, ((ConstraintLayout.LayoutParams)localObject1).leftMargin, i14);
            if (i8 == -1)
              continue;
            localObject3 = p(i8);
            if (localObject3 != null)
              ((android.support.constraint.a.a.f)localObject2).a(e.c.hQ, (android.support.constraint.a.a.f)localObject3, e.c.hO, ((ConstraintLayout.LayoutParams)localObject1).rightMargin, i6);
            if (((ConstraintLayout.LayoutParams)localObject1).dF == -1)
              continue;
            localObject3 = p(((ConstraintLayout.LayoutParams)localObject1).dF);
            if (localObject3 != null)
              ((android.support.constraint.a.a.f)localObject2).a(e.c.hP, (android.support.constraint.a.a.f)localObject3, e.c.hP, ((ConstraintLayout.LayoutParams)localObject1).topMargin, ((ConstraintLayout.LayoutParams)localObject1).dS);
            if (((ConstraintLayout.LayoutParams)localObject1).dH == -1)
              continue;
            localObject3 = p(((ConstraintLayout.LayoutParams)localObject1).dH);
            if (localObject3 != null)
              ((android.support.constraint.a.a.f)localObject2).a(e.c.hR, (android.support.constraint.a.a.f)localObject3, e.c.hP, ((ConstraintLayout.LayoutParams)localObject1).bottomMargin, ((ConstraintLayout.LayoutParams)localObject1).dU);
            if (((ConstraintLayout.LayoutParams)localObject1).dJ != -1)
            {
              localObject4 = (View)this.db.get(((ConstraintLayout.LayoutParams)localObject1).dJ);
              localObject3 = p(((ConstraintLayout.LayoutParams)localObject1).dJ);
              if ((localObject3 != null) && (localObject4 != null) && ((((View)localObject4).getLayoutParams() instanceof ConstraintLayout.LayoutParams)))
              {
                localObject4 = (ConstraintLayout.LayoutParams)((View)localObject4).getLayoutParams();
                ((ConstraintLayout.LayoutParams)localObject1).et = true;
                ((ConstraintLayout.LayoutParams)localObject4).et = true;
                ((android.support.constraint.a.a.f)localObject2).a(e.c.hS).a(((android.support.constraint.a.a.f)localObject3).a(e.c.hS), 0, -1, e.b.hK, 0, true);
                ((android.support.constraint.a.a.f)localObject2).a(e.c.hP).reset();
                ((android.support.constraint.a.a.f)localObject2).a(e.c.hR).reset();
              }
            }
            if ((f1 >= 0.0F) && (f1 != 0.5F))
              ((android.support.constraint.a.a.f)localObject2).iV = f1;
            if ((((ConstraintLayout.LayoutParams)localObject1).dY < 0.0F) || (((ConstraintLayout.LayoutParams)localObject1).dY == 0.5F))
              continue;
            ((android.support.constraint.a.a.f)localObject2).iW = ((ConstraintLayout.LayoutParams)localObject1).dY;
            continue;
          }
          if (i2 == -1)
            continue;
          localObject3 = p(i2);
          if (localObject3 == null)
            continue;
          ((android.support.constraint.a.a.f)localObject2).a(e.c.hO, (android.support.constraint.a.a.f)localObject3, e.c.hQ, ((ConstraintLayout.LayoutParams)localObject1).leftMargin, i14);
          continue;
          if (i9 == -1)
            continue;
          localObject3 = p(i9);
          if (localObject3 == null)
            continue;
          ((android.support.constraint.a.a.f)localObject2).a(e.c.hQ, (android.support.constraint.a.a.f)localObject3, e.c.hQ, ((ConstraintLayout.LayoutParams)localObject1).rightMargin, i6);
          continue;
          if (((ConstraintLayout.LayoutParams)localObject1).dG == -1)
            continue;
          localObject3 = p(((ConstraintLayout.LayoutParams)localObject1).dG);
          if (localObject3 == null)
            continue;
          ((android.support.constraint.a.a.f)localObject2).a(e.c.hP, (android.support.constraint.a.a.f)localObject3, e.c.hR, ((ConstraintLayout.LayoutParams)localObject1).topMargin, ((ConstraintLayout.LayoutParams)localObject1).dS);
          continue;
          if (((ConstraintLayout.LayoutParams)localObject1).dI == -1)
            continue;
          localObject3 = p(((ConstraintLayout.LayoutParams)localObject1).dI);
          if (localObject3 == null)
            continue;
          ((android.support.constraint.a.a.f)localObject2).a(e.c.hR, (android.support.constraint.a.a.f)localObject3, e.c.hR, ((ConstraintLayout.LayoutParams)localObject1).bottomMargin, ((ConstraintLayout.LayoutParams)localObject1).dU);
          continue;
          ((android.support.constraint.a.a.f)localObject2).a(f.a.js);
          ((android.support.constraint.a.a.f)localObject2).setWidth(0);
          continue;
          ((android.support.constraint.a.a.f)localObject2).a(f.a.jq);
          ((android.support.constraint.a.a.f)localObject2).setWidth(((ConstraintLayout.LayoutParams)localObject1).width);
          continue;
          ((android.support.constraint.a.a.f)localObject2).b(f.a.js);
          ((android.support.constraint.a.a.f)localObject2).setHeight(0);
          continue;
          ((android.support.constraint.a.a.f)localObject2).b(f.a.jq);
          ((android.support.constraint.a.a.f)localObject2).setHeight(((ConstraintLayout.LayoutParams)localObject1).height);
          continue;
        }
        label2824: i13 = 1;
        int i18;
        int i19;
        if ((this.dl & 0x8) == 8)
        {
          i14 = 1;
          if (i14 == 0)
            continue;
          localObject1 = this.de;
          ((g)localObject1).bb();
          ((g)localObject1).u(((g)localObject1).dl);
          this.de.j(i10, i11);
          i18 = getPaddingTop() + getPaddingBottom();
          i12 = getPaddingLeft() + getPaddingRight();
          i19 = getChildCount();
          i2 = 0;
          if (i2 >= i19)
            continue;
          localObject2 = getChildAt(i2);
          if (((View)localObject2).getVisibility() != 8)
          {
            localObject4 = (ConstraintLayout.LayoutParams)((View)localObject2).getLayoutParams();
            localObject3 = ((ConstraintLayout.LayoutParams)localObject4).eH;
            if ((!((ConstraintLayout.LayoutParams)localObject4).eu) && (!((ConstraintLayout.LayoutParams)localObject4).ev))
            {
              ((android.support.constraint.a.a.f)localObject3).iZ = ((View)localObject2).getVisibility();
              i7 = ((ConstraintLayout.LayoutParams)localObject4).width;
              i6 = ((ConstraintLayout.LayoutParams)localObject4).height;
              if ((i7 != 0) && (i6 != 0))
                continue;
              ((android.support.constraint.a.a.f)localObject3).aM().invalidate();
              ((android.support.constraint.a.a.f)localObject3).aN().invalidate();
            }
          }
          i2++;
          continue;
        }
        else
        {
          i14 = 0;
          continue;
        }
        i5 = 0;
        i4 = 0;
        if (i7 == -2)
          i5 = 1;
        i9 = getChildMeasureSpec(paramInt1, i12, i7);
        if (i6 == -2)
          i4 = 1;
        ((View)localObject2).measure(i9, getChildMeasureSpec(paramInt2, i18, i6));
        if (this.dv != null)
        {
          localObject1 = this.dv;
          ((android.support.constraint.a.f)localObject1).gd += 1L;
        }
        if (i7 == -2)
        {
          bool = true;
          ((android.support.constraint.a.a.f)localObject3).il = bool;
          if (i6 != -2)
            continue;
          bool = true;
          ((android.support.constraint.a.a.f)localObject3).im = bool;
          i7 = ((View)localObject2).getMeasuredWidth();
          i6 = ((View)localObject2).getMeasuredHeight();
          ((android.support.constraint.a.a.f)localObject3).setWidth(i7);
          ((android.support.constraint.a.a.f)localObject3).setHeight(i6);
          if (i5 != 0)
            ((android.support.constraint.a.a.f)localObject3).iS = i7;
          if (i4 != 0)
            ((android.support.constraint.a.a.f)localObject3).iT = i6;
          if (((ConstraintLayout.LayoutParams)localObject4).et)
          {
            i5 = ((View)localObject2).getBaseline();
            if (i5 != -1)
              ((android.support.constraint.a.a.f)localObject3).iR = i5;
          }
          if ((!((ConstraintLayout.LayoutParams)localObject4).er) || (!((ConstraintLayout.LayoutParams)localObject4).es))
            continue;
          ((android.support.constraint.a.a.f)localObject3).aM().E(i7);
          ((android.support.constraint.a.a.f)localObject3).aN().E(i6);
          continue;
        }
        bool = false;
        continue;
        bool = false;
        continue;
        this.de.ba();
        int i17 = 0;
        if (i17 < i19)
        {
          localObject2 = getChildAt(i17);
          if (((View)localObject2).getVisibility() != 8)
          {
            localObject1 = (ConstraintLayout.LayoutParams)((View)localObject2).getLayoutParams();
            localObject3 = ((ConstraintLayout.LayoutParams)localObject1).eH;
            if ((!((ConstraintLayout.LayoutParams)localObject1).eu) && (!((ConstraintLayout.LayoutParams)localObject1).ev))
            {
              ((android.support.constraint.a.a.f)localObject3).iZ = ((View)localObject2).getVisibility();
              i6 = ((ConstraintLayout.LayoutParams)localObject1).width;
              i7 = ((ConstraintLayout.LayoutParams)localObject1).height;
              if ((i6 == 0) || (i7 == 0))
              {
                m localm1 = ((android.support.constraint.a.a.f)localObject3).a(e.c.hO).hv;
                m localm2 = ((android.support.constraint.a.a.f)localObject3).a(e.c.hQ).hv;
                if ((((android.support.constraint.a.a.f)localObject3).a(e.c.hO).hy == null) || (((android.support.constraint.a.a.f)localObject3).a(e.c.hQ).hy == null))
                  continue;
                i4 = 1;
                localObject4 = ((android.support.constraint.a.a.f)localObject3).a(e.c.hP).hv;
                m localm3 = ((android.support.constraint.a.a.f)localObject3).a(e.c.hR).hv;
                if ((((android.support.constraint.a.a.f)localObject3).a(e.c.hP).hy == null) || (((android.support.constraint.a.a.f)localObject3).a(e.c.hR).hy == null))
                  continue;
                i15 = 1;
                if ((i6 != 0) || (i7 != 0) || (i4 == 0) || (i15 == 0))
                {
                  i16 = 0;
                  if (this.de.aW() == f.a.jr)
                    continue;
                  i5 = 1;
                  if (this.de.aX() == f.a.jr)
                    continue;
                  i2 = 1;
                  if (i5 == 0)
                    ((android.support.constraint.a.a.f)localObject3).aM().invalidate();
                  if (i2 == 0)
                    ((android.support.constraint.a.a.f)localObject3).aN().invalidate();
                  if (i6 != 0)
                    continue;
                  if ((i5 == 0) || (!((android.support.constraint.a.a.f)localObject3).aI()) || (i4 == 0) || (!localm1.bg()) || (!localm2.bg()))
                    continue;
                  i6 = (int)(localm2.km - localm1.km);
                  ((android.support.constraint.a.a.f)localObject3).aM().E(i6);
                  i4 = 0;
                  i8 = getChildMeasureSpec(paramInt1, i12, i6);
                  i3 = i6;
                  i9 = i4;
                  i6 = i5;
                  if (i7 != 0)
                    continue;
                  if ((i2 == 0) || (!((android.support.constraint.a.a.f)localObject3).aJ()) || (i15 == 0) || (!((m)localObject4).bg()) || (!localm3.bg()))
                    continue;
                  i5 = (int)(localm3.km - ((m)localObject4).km);
                  ((android.support.constraint.a.a.f)localObject3).aN().E(i5);
                  i4 = 0;
                  i15 = getChildMeasureSpec(paramInt2, i18, i5);
                  i7 = i5;
                  i5 = i4;
                  i4 = i15;
                  ((View)localObject2).measure(i8, i4);
                  if (this.dv != null)
                  {
                    localObject4 = this.dv;
                    ((android.support.constraint.a.f)localObject4).gd += 1L;
                  }
                  if (i3 != -2)
                    continue;
                  bool = true;
                  ((android.support.constraint.a.a.f)localObject3).il = bool;
                  if (i7 != -2)
                    continue;
                  bool = true;
                  ((android.support.constraint.a.a.f)localObject3).im = bool;
                  i4 = ((View)localObject2).getMeasuredWidth();
                  i7 = ((View)localObject2).getMeasuredHeight();
                  ((android.support.constraint.a.a.f)localObject3).setWidth(i4);
                  ((android.support.constraint.a.a.f)localObject3).setHeight(i7);
                  if (i9 != 0)
                    ((android.support.constraint.a.a.f)localObject3).iS = i4;
                  if (i5 != 0)
                    ((android.support.constraint.a.a.f)localObject3).iT = i7;
                  if (i6 == 0)
                    continue;
                  ((android.support.constraint.a.a.f)localObject3).aM().E(i4);
                  if (i2 == 0)
                    continue;
                  ((android.support.constraint.a.a.f)localObject3).aN().E(i7);
                  if (((ConstraintLayout.LayoutParams)localObject1).et)
                  {
                    i2 = ((View)localObject2).getBaseline();
                    if (i2 != -1)
                      ((android.support.constraint.a.a.f)localObject3).iR = i2;
                  }
                }
              }
            }
          }
          i17++;
          continue;
          i4 = 0;
          continue;
          i15 = 0;
          continue;
          i5 = 0;
          continue;
          i2 = 0;
          continue;
          i8 = getChildMeasureSpec(paramInt1, i12, -2);
          i5 = 0;
          i9 = 1;
          i3 = i6;
          i6 = i5;
          continue;
          if (i6 == -1)
          {
            i8 = getChildMeasureSpec(paramInt1, i12, -1);
            i9 = 0;
            i3 = i6;
            i6 = i5;
            continue;
          }
          if (i6 != -2)
            continue;
          i4 = 1;
          continue;
          i4 = getChildMeasureSpec(paramInt2, i18, -2);
          i5 = 1;
          i2 = 0;
          continue;
          if (i7 == -1)
          {
            i4 = getChildMeasureSpec(paramInt2, i18, -1);
            i5 = i16;
            continue;
          }
          if (i7 != -2)
            continue;
          i4 = 1;
          i5 = i7;
          continue;
          bool = false;
          continue;
          bool = false;
          continue;
          ((android.support.constraint.a.a.f)localObject3).aM().state = 2;
          continue;
          ((android.support.constraint.a.a.f)localObject3).aN().state = 2;
          continue;
          i3 = getPaddingTop() + getPaddingBottom();
          i15 = getPaddingLeft() + getPaddingRight();
          i17 = getChildCount();
          i6 = 0;
          if (i6 < i17)
          {
            localObject4 = getChildAt(i6);
            if (((View)localObject4).getVisibility() != 8)
            {
              localObject1 = (ConstraintLayout.LayoutParams)((View)localObject4).getLayoutParams();
              localObject2 = ((ConstraintLayout.LayoutParams)localObject1).eH;
              if ((!((ConstraintLayout.LayoutParams)localObject1).eu) && (!((ConstraintLayout.LayoutParams)localObject1).ev))
              {
                ((android.support.constraint.a.a.f)localObject2).iZ = ((View)localObject4).getVisibility();
                i9 = ((ConstraintLayout.LayoutParams)localObject1).width;
                i8 = ((ConstraintLayout.LayoutParams)localObject1).height;
                if ((!((ConstraintLayout.LayoutParams)localObject1).er) && (!((ConstraintLayout.LayoutParams)localObject1).es) && ((((ConstraintLayout.LayoutParams)localObject1).er) || (((ConstraintLayout.LayoutParams)localObject1).ee != 1)) && (((ConstraintLayout.LayoutParams)localObject1).width != -1) && ((((ConstraintLayout.LayoutParams)localObject1).es) || ((((ConstraintLayout.LayoutParams)localObject1).ef != 1) && (((ConstraintLayout.LayoutParams)localObject1).height != -1))))
                  continue;
                i2 = 1;
                i5 = 0;
                i4 = 0;
                if (i2 == 0)
                  continue;
                if (i9 != 0)
                  continue;
                i4 = getChildMeasureSpec(paramInt1, i15, -2);
                i2 = 1;
                if (i8 != 0)
                  continue;
                i7 = getChildMeasureSpec(paramInt2, i3, -2);
                i5 = 1;
                ((View)localObject4).measure(i4, i7);
                if (this.dv != null)
                {
                  localObject3 = this.dv;
                  ((android.support.constraint.a.f)localObject3).gd += 1L;
                }
                if (i9 != -2)
                  continue;
                bool = true;
                ((android.support.constraint.a.a.f)localObject2).il = bool;
                if (i8 != -2)
                  continue;
                bool = true;
                ((android.support.constraint.a.a.f)localObject2).im = bool;
                i4 = ((View)localObject4).getMeasuredWidth();
                i7 = ((View)localObject4).getMeasuredHeight();
                ((android.support.constraint.a.a.f)localObject2).setWidth(i4);
                ((android.support.constraint.a.a.f)localObject2).setHeight(i7);
                if (i2 != 0)
                  ((android.support.constraint.a.a.f)localObject2).iS = i4;
                if (i5 != 0)
                  ((android.support.constraint.a.a.f)localObject2).iT = i7;
                if (((ConstraintLayout.LayoutParams)localObject1).et)
                {
                  i2 = ((View)localObject4).getBaseline();
                  if (i2 != -1)
                    ((android.support.constraint.a.a.f)localObject2).iR = i2;
                }
              }
            }
            i6++;
            continue;
            i2 = 0;
            continue;
            if (i9 == -1)
            {
              i4 = getChildMeasureSpec(paramInt1, i15, -1);
              i2 = 0;
              continue;
            }
            i2 = i5;
            if (i9 == -2)
              i2 = 1;
            i4 = getChildMeasureSpec(paramInt1, i15, i9);
            continue;
            if (i8 == -1)
            {
              i7 = getChildMeasureSpec(paramInt2, i3, -1);
              i5 = 0;
              continue;
            }
            if (i8 != -2)
              continue;
            i5 = 1;
            i7 = getChildMeasureSpec(paramInt2, i3, i8);
            continue;
            bool = false;
            continue;
            bool = false;
            continue;
          }
        }
        i5 = getChildCount();
        i2 = 0;
        if (i2 < i5)
        {
          localObject1 = getChildAt(i2);
          if ((localObject1 instanceof Placeholder))
          {
            localObject2 = (Placeholder)localObject1;
            if (((Placeholder)localObject2).fs != null)
            {
              localObject1 = (ConstraintLayout.LayoutParams)((Placeholder)localObject2).getLayoutParams();
              localObject2 = (ConstraintLayout.LayoutParams)((Placeholder)localObject2).fs.getLayoutParams();
              ((ConstraintLayout.LayoutParams)localObject2).eH.iZ = 0;
              ((ConstraintLayout.LayoutParams)localObject1).eH.setWidth(((ConstraintLayout.LayoutParams)localObject2).eH.getWidth());
              ((ConstraintLayout.LayoutParams)localObject1).eH.setHeight(((ConstraintLayout.LayoutParams)localObject2).eH.getHeight());
              ((ConstraintLayout.LayoutParams)localObject2).eH.iZ = 8;
            }
          }
          i2++;
          continue;
        }
        i5 = this.dc.size();
        if (i5 > 0)
        {
          i2 = 0;
          if (i2 < i5)
          {
            this.dc.get(i2);
            i2++;
            continue;
          }
        }
        if ((getChildCount() > 0) && (i13 != 0))
          android.support.constraint.a.a.a.a(this.de);
        if (this.de.jG)
        {
          if ((this.de.jH) && (i == -2147483648))
          {
            if (this.de.jJ < j)
              this.de.setWidth(this.de.jJ);
            this.de.a(f.a.jq);
          }
          if ((this.de.jI) && (k == -2147483648))
          {
            if (this.de.jK < m)
              this.de.setHeight(this.de.jK);
            this.de.b(f.a.jq);
          }
        }
        if ((this.dl & 0x20) == 32)
        {
          i5 = this.de.getWidth();
          i2 = this.de.getHeight();
          if ((this.dp != i5) && (i == 1073741824))
            android.support.constraint.a.a.a.a(this.de.jF, 0, i5);
          if ((this.dq != i2) && (k == 1073741824))
            android.support.constraint.a.a.a.a(this.de.jF, 1, i2);
          if ((this.de.jH) && (this.de.jJ > j))
            android.support.constraint.a.a.a.a(this.de.jF, 0, j);
          if ((this.de.jI) && (this.de.jK > m))
            android.support.constraint.a.a.a.a(this.de.jF, 1, m);
        }
        if (getChildCount() > 0)
          ar();
        i5 = 0;
        i2 = 0;
        i17 = this.dd.size();
        int i15 = i1 + getPaddingBottom();
        int i16 = n + getPaddingRight();
        if (i17 > 0)
        {
          i7 = 0;
          if (this.de.aW() == f.a.jr)
          {
            i9 = 1;
            if (this.de.aX() == f.a.jr)
            {
              i8 = 1;
              i5 = Math.max(this.de.getWidth(), this.dg);
              i4 = Math.max(this.de.getHeight(), this.dh);
              i3 = 0;
              if (i3 >= i17)
                continue;
              localObject4 = (android.support.constraint.a.a.f)this.dd.get(i3);
              localObject2 = (View)((android.support.constraint.a.a.f)localObject4).iX;
              if (localObject2 == null)
                continue;
              localObject3 = (ConstraintLayout.LayoutParams)((View)localObject2).getLayoutParams();
              if ((((ConstraintLayout.LayoutParams)localObject3).ev) || (((ConstraintLayout.LayoutParams)localObject3).eu) || (((View)localObject2).getVisibility() == 8) || ((i14 != 0) && (((android.support.constraint.a.a.f)localObject4).aM().bg()) && (((android.support.constraint.a.a.f)localObject4).aN().bg())))
                continue;
              if ((((ConstraintLayout.LayoutParams)localObject3).width != -2) || (!((ConstraintLayout.LayoutParams)localObject3).er))
                continue;
              i6 = getChildMeasureSpec(paramInt1, i16, ((ConstraintLayout.LayoutParams)localObject3).width);
              if ((((ConstraintLayout.LayoutParams)localObject3).height != -2) || (!((ConstraintLayout.LayoutParams)localObject3).es))
                continue;
              i13 = getChildMeasureSpec(paramInt2, i15, ((ConstraintLayout.LayoutParams)localObject3).height);
              ((View)localObject2).measure(i6, i13);
              if (this.dv != null)
              {
                localObject1 = this.dv;
                ((android.support.constraint.a.f)localObject1).ge += 1L;
              }
              i6 = ((View)localObject2).getMeasuredWidth();
              i13 = ((View)localObject2).getMeasuredHeight();
              if (i6 == ((android.support.constraint.a.a.f)localObject4).getWidth())
                continue;
              ((android.support.constraint.a.a.f)localObject4).setWidth(i6);
              if (i14 != 0)
                ((android.support.constraint.a.a.f)localObject4).aM().E(i6);
              if ((i9 == 0) || (((android.support.constraint.a.a.f)localObject4).getRight() <= i5))
                continue;
              i7 = Math.max(i5, ((android.support.constraint.a.a.f)localObject4).getRight() + ((android.support.constraint.a.a.f)localObject4).a(e.c.hQ).aH());
              i5 = 1;
              if (i13 == ((android.support.constraint.a.a.f)localObject4).getHeight())
                continue;
              ((android.support.constraint.a.a.f)localObject4).setHeight(i13);
              if (i14 != 0)
                ((android.support.constraint.a.a.f)localObject4).aN().E(i13);
              if ((i8 == 0) || (((android.support.constraint.a.a.f)localObject4).getBottom() <= i4))
                continue;
              i5 = Math.max(i4, ((android.support.constraint.a.a.f)localObject4).getBottom() + ((android.support.constraint.a.a.f)localObject4).a(e.c.hR).aH());
              i6 = 1;
              i4 = i5;
              i5 = i6;
              if (((ConstraintLayout.LayoutParams)localObject3).et)
              {
                i13 = ((View)localObject2).getBaseline();
                i5 = i6;
                if (i13 != -1)
                {
                  i5 = i6;
                  if (i13 != ((android.support.constraint.a.a.f)localObject4).iR)
                  {
                    ((android.support.constraint.a.a.f)localObject4).iR = i13;
                    i5 = 1;
                  }
                }
              }
              if (Build.VERSION.SDK_INT < 11)
                continue;
              i2 = combineMeasuredStates(i2, ((View)localObject2).getMeasuredState());
              i6 = i5;
              i5 = i7;
              i3++;
              i7 = i6;
              continue;
            }
          }
          else
          {
            i9 = 0;
            continue;
          }
          i8 = 0;
          continue;
          i6 = View.MeasureSpec.makeMeasureSpec(((android.support.constraint.a.a.f)localObject4).getWidth(), 1073741824);
          continue;
          i13 = View.MeasureSpec.makeMeasureSpec(((android.support.constraint.a.a.f)localObject4).getHeight(), 1073741824);
          continue;
          if (i7 != 0)
          {
            this.de.setWidth(i10);
            this.de.setHeight(i11);
            if (i14 != 0)
              this.de.ba();
            ar();
            i7 = 0;
            if (this.de.getWidth() < i5)
            {
              this.de.setWidth(i5);
              i7 = 1;
            }
            if (this.de.getHeight() < i4)
            {
              this.de.setHeight(i4);
              i7 = 1;
            }
            if (i7 != 0)
              ar();
          }
          i4 = 0;
          i5 = i2;
          if (i4 < i17)
          {
            localObject1 = (android.support.constraint.a.a.f)this.dd.get(i4);
            localObject2 = (View)((android.support.constraint.a.a.f)localObject1).iX;
            if ((localObject2 != null) && ((((View)localObject2).getMeasuredWidth() != ((android.support.constraint.a.a.f)localObject1).getWidth()) || (((View)localObject2).getMeasuredHeight() != ((android.support.constraint.a.a.f)localObject1).getHeight())) && (((android.support.constraint.a.a.f)localObject1).iZ != 8))
            {
              ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(((android.support.constraint.a.a.f)localObject1).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(((android.support.constraint.a.a.f)localObject1).getHeight(), 1073741824));
              if (this.dv != null)
              {
                localObject1 = this.dv;
                ((android.support.constraint.a.f)localObject1).ge += 1L;
              }
            }
            i4++;
            continue;
          }
        }
        i4 = this.de.getWidth() + i16;
        i2 = this.de.getHeight() + i15;
        if (Build.VERSION.SDK_INT >= 11)
        {
          paramInt1 = resolveSizeAndState(i4, paramInt1, i5);
          i2 = resolveSizeAndState(i2, paramInt2, i5 << 16);
          paramInt2 = Math.min(this.di, paramInt1 & 0xFFFFFF);
          i2 = Math.min(this.dj, i2 & 0xFFFFFF);
          paramInt1 = paramInt2;
          if (this.de.jM)
            paramInt1 = paramInt2 | 0x1000000;
          paramInt2 = i2;
          if (this.de.jN)
            paramInt2 = i2 | 0x1000000;
          setMeasuredDimension(paramInt1, paramInt2);
          this.dp = paramInt1;
          this.dq = paramInt2;
          return;
        }
        setMeasuredDimension(i4, i2);
        this.dp = i4;
        this.dq = i2;
        continue;
      }
      catch (Resources.NotFoundException localNotFoundException1)
      {
        continue;
        i6 = i7;
        continue;
        i6 = i5;
        i5 = i7;
        continue;
        i5 = i4;
        continue;
        i6 = i5;
        continue;
        i7 = i5;
        continue;
        i6 = i7;
        i7 = i5;
        i5 = i6;
        continue;
        i5 = 0;
        continue;
        i5 = 0;
        i7 = i8;
        i2 = i4;
        i4 = i9;
        continue;
        i4 = 0;
        i5 = i7;
        continue;
        i4 = 0;
        continue;
        i6 = i8;
        i8 = i3;
        i2 = i7;
        i5 = i4;
        continue;
      }
      int i13 = 0;
    }
  }

  public void onViewAdded(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 14)
      super.onViewAdded(paramView);
    Object localObject = b(paramView);
    if (((paramView instanceof Guideline)) && (!(localObject instanceof i)))
    {
      localObject = (ConstraintLayout.LayoutParams)paramView.getLayoutParams();
      ((ConstraintLayout.LayoutParams)localObject).eH = new i();
      ((ConstraintLayout.LayoutParams)localObject).eu = true;
      ((i)((ConstraintLayout.LayoutParams)localObject).eH).setOrientation(((ConstraintLayout.LayoutParams)localObject).orientation);
    }
    if ((paramView instanceof ConstraintHelper))
    {
      localObject = (ConstraintHelper)paramView;
      ((ConstraintHelper)localObject).ap();
      ((ConstraintLayout.LayoutParams)paramView.getLayoutParams()).ev = true;
      if (!this.dc.contains(localObject))
        this.dc.add(localObject);
    }
    this.db.put(paramView.getId(), paramView);
    this.dk = true;
  }

  public void onViewRemoved(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 14)
      super.onViewRemoved(paramView);
    this.db.remove(paramView.getId());
    android.support.constraint.a.a.f localf = b(paramView);
    this.de.f(localf);
    this.dc.remove(paramView);
    this.dd.remove(localf);
    this.dk = true;
  }

  public final View q(int paramInt)
  {
    return (View)this.db.get(paramInt);
  }

  public void removeView(View paramView)
  {
    super.removeView(paramView);
    if (Build.VERSION.SDK_INT < 14)
      onViewRemoved(paramView);
  }

  public void requestLayout()
  {
    super.requestLayout();
    this.dk = true;
    this.dp = -1;
    this.dq = -1;
    this.dr = -1;
    this.ds = -1;
    this.dt = 0;
    this.du = 0;
  }

  public void setConstraintSet(a parama)
  {
    this.dm = parama;
  }

  public void setId(int paramInt)
  {
    this.db.remove(getId());
    super.setId(paramInt);
    this.db.put(getId(), this);
  }

  public void setMaxHeight(int paramInt)
  {
    if (paramInt == this.dj);
    while (true)
    {
      return;
      this.dj = paramInt;
      requestLayout();
    }
  }

  public void setMaxWidth(int paramInt)
  {
    if (paramInt == this.di);
    while (true)
    {
      return;
      this.di = paramInt;
      requestLayout();
    }
  }

  public void setMinHeight(int paramInt)
  {
    if (paramInt == this.dh);
    while (true)
    {
      return;
      this.dh = paramInt;
      requestLayout();
    }
  }

  public void setMinWidth(int paramInt)
  {
    if (paramInt == this.dg);
    while (true)
    {
      return;
      this.dg = paramInt;
      requestLayout();
    }
  }

  public void setOptimizationLevel(int paramInt)
  {
    this.de.dl = paramInt;
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.constraint.ConstraintLayout
 * JD-Core Version:    0.6.2
 */