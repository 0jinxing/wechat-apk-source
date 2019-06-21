package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.support.v4.content.a.c;
import android.support.v4.f.f;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public abstract class Transition
  implements Cloneable
{
  private static ThreadLocal<android.support.v4.f.a<Animator, Transition.a>> Ac = new ThreadLocal();
  private static final int[] zH = { 2, 1, 3, 4 };
  private static final PathMotion zI = new Transition.1();
  private ArrayList<ah> Aa;
  private ArrayList<ah> Ab;
  boolean Ad = false;
  private ArrayList<Animator> Ae = new ArrayList();
  private int Af = 0;
  private boolean Ag = false;
  af Ah;
  private Transition.b Ai;
  private android.support.v4.f.a<String, String> Aj;
  PathMotion Ak = zI;
  long mDuration = -1L;
  private ArrayList<Transition.c> mListeners = null;
  private String mName = getClass().getName();
  private boolean mPaused = false;
  private ArrayList<Animator> uC = new ArrayList();
  long zJ = -1L;
  private TimeInterpolator zK = null;
  ArrayList<Integer> zL = new ArrayList();
  ArrayList<View> zM = new ArrayList();
  ArrayList<String> zN = null;
  ArrayList<Class> zO = null;
  private ArrayList<Integer> zP = null;
  private ArrayList<View> zQ = null;
  private ArrayList<Class> zR = null;
  private ArrayList<String> zS = null;
  private ArrayList<Integer> zT = null;
  private ArrayList<View> zU = null;
  private ArrayList<Class> zV = null;
  private ai zW = new ai();
  private ai zX = new ai();
  TransitionSet zY = null;
  private int[] zZ = zH;
  private ViewGroup zk = null;

  public Transition()
  {
  }

  public Transition(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ac.zy);
    paramAttributeSet = (XmlResourceParser)paramAttributeSet;
    long l = c.a(localTypedArray, paramAttributeSet, "duration", 1, -1);
    if (l >= 0L)
      g(l);
    l = c.a(localTypedArray, paramAttributeSet, "startDelay", 2, -1);
    if (l > 0L)
      h(l);
    int i = c.a(localTypedArray, paramAttributeSet, "interpolator", 0);
    if (i > 0)
      a(AnimationUtils.loadInterpolator(paramContext, i));
    paramContext = c.b(localTypedArray, paramAttributeSet, "matchOrder", 3);
    if (paramContext != null)
      setMatchOrder(G(paramContext));
    localTypedArray.recycle();
  }

  private static int[] G(String paramString)
  {
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
    paramString = new int[localStringTokenizer.countTokens()];
    int i = 0;
    if (localStringTokenizer.hasMoreTokens())
    {
      Object localObject = localStringTokenizer.nextToken().trim();
      if ("id".equalsIgnoreCase((String)localObject))
        paramString[i] = 3;
      while (true)
      {
        i++;
        break;
        if ("instance".equalsIgnoreCase((String)localObject))
        {
          paramString[i] = 1;
        }
        else if ("name".equalsIgnoreCase((String)localObject))
        {
          paramString[i] = 2;
        }
        else if ("itemId".equalsIgnoreCase((String)localObject))
        {
          paramString[i] = 4;
        }
        else
        {
          if (!((String)localObject).isEmpty())
            break label135;
          localObject = new int[paramString.length - 1];
          System.arraycopy(paramString, 0, localObject, 0, i);
          i--;
          paramString = (String)localObject;
        }
      }
      label135: throw new InflateException("Unknown match type in matchOrder: '" + (String)localObject + "'");
    }
    return paramString;
  }

  private void a(ai paramai1, ai paramai2)
  {
    android.support.v4.f.a locala1 = new android.support.v4.f.a(paramai1.AE);
    android.support.v4.f.a locala2 = new android.support.v4.f.a(paramai2.AE);
    int i = 0;
    if (i < this.zZ.length)
    {
      switch (this.zZ[i])
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        i++;
        break;
        for (int j = locala1.size() - 1; j >= 0; j--)
        {
          localObject1 = (View)locala1.keyAt(j);
          if ((localObject1 != null) && (C((View)localObject1)))
          {
            localObject2 = (ah)locala2.remove(localObject1);
            if ((localObject2 != null) && (((ah)localObject2).view != null) && (C(((ah)localObject2).view)))
            {
              localObject1 = (ah)locala1.removeAt(j);
              this.Aa.add(localObject1);
              this.Ab.add(localObject2);
            }
          }
        }
        continue;
        Object localObject3 = paramai1.AH;
        Object localObject4 = paramai2.AH;
        int k = ((android.support.v4.f.a)localObject3).size();
        ah localah;
        for (j = 0; j < k; j++)
        {
          localObject5 = (View)((android.support.v4.f.a)localObject3).valueAt(j);
          if ((localObject5 != null) && (C((View)localObject5)))
          {
            localObject2 = (View)((android.support.v4.f.a)localObject4).get(((android.support.v4.f.a)localObject3).keyAt(j));
            if ((localObject2 != null) && (C((View)localObject2)))
            {
              localah = (ah)locala1.get(localObject5);
              localObject1 = (ah)locala2.get(localObject2);
              if ((localah != null) && (localObject1 != null))
              {
                this.Aa.add(localah);
                this.Ab.add(localObject1);
                locala1.remove(localObject5);
                locala2.remove(localObject2);
              }
            }
          }
        }
        continue;
        Object localObject5 = paramai1.AF;
        localObject4 = paramai2.AF;
        k = ((SparseArray)localObject5).size();
        for (j = 0; j < k; j++)
        {
          localObject1 = (View)((SparseArray)localObject5).valueAt(j);
          if ((localObject1 != null) && (C((View)localObject1)))
          {
            localObject3 = (View)((SparseArray)localObject4).get(((SparseArray)localObject5).keyAt(j));
            if ((localObject3 != null) && (C((View)localObject3)))
            {
              localah = (ah)locala1.get(localObject1);
              localObject2 = (ah)locala2.get(localObject3);
              if ((localah != null) && (localObject2 != null))
              {
                this.Aa.add(localah);
                this.Ab.add(localObject2);
                locala1.remove(localObject1);
                locala2.remove(localObject3);
              }
            }
          }
        }
        continue;
        Object localObject2 = paramai1.AG;
        Object localObject1 = paramai2.AG;
        k = ((f)localObject2).size();
        for (j = 0; j < k; j++)
        {
          localObject4 = (View)((f)localObject2).valueAt(j);
          if ((localObject4 != null) && (C((View)localObject4)))
          {
            localObject5 = (View)((f)localObject1).k(((f)localObject2).keyAt(j));
            if ((localObject5 != null) && (C((View)localObject5)))
            {
              localah = (ah)locala1.get(localObject4);
              localObject3 = (ah)locala2.get(localObject5);
              if ((localah != null) && (localObject3 != null))
              {
                this.Aa.add(localah);
                this.Ab.add(localObject3);
                locala1.remove(localObject4);
                locala2.remove(localObject5);
              }
            }
          }
        }
      }
    }
    for (i = 0; i < locala1.size(); i++)
    {
      paramai1 = (ah)locala1.valueAt(i);
      if (C(paramai1.view))
      {
        this.Aa.add(paramai1);
        this.Ab.add(null);
      }
    }
    for (i = 0; i < locala2.size(); i++)
    {
      paramai1 = (ah)locala2.valueAt(i);
      if (C(paramai1.view))
      {
        this.Ab.add(paramai1);
        this.Aa.add(null);
      }
    }
  }

  private static void a(ai paramai, View paramView, ah paramah)
  {
    paramai.AE.put(paramView, paramah);
    int i = paramView.getId();
    label69: long l;
    if (i >= 0)
    {
      if (paramai.AF.indexOfKey(i) >= 0)
        paramai.AF.put(i, null);
    }
    else
    {
      paramah = s.ai(paramView);
      if (paramah != null)
      {
        if (!paramai.AH.containsKey(paramah))
          break label167;
        paramai.AH.put(paramah, null);
      }
      if ((paramView.getParent() instanceof ListView))
      {
        paramah = (ListView)paramView.getParent();
        if (paramah.getAdapter().hasStableIds())
        {
          l = paramah.getItemIdAtPosition(paramah.getPositionForView(paramView));
          if (paramai.AG.indexOfKey(l) < 0)
            break label180;
          paramView = (View)paramai.AG.k(l);
          if (paramView != null)
          {
            s.d(paramView, false);
            paramai.AG.put(l, null);
          }
        }
      }
    }
    while (true)
    {
      return;
      paramai.AF.put(i, paramView);
      break;
      label167: paramai.AH.put(paramah, paramView);
      break label69;
      label180: s.d(paramView, true);
      paramai.AG.put(l, paramView);
    }
  }

  private void a(View paramView, boolean paramBoolean)
  {
    if (paramView == null);
    while (true)
    {
      return;
      int i = paramView.getId();
      if (((this.zP == null) || (!this.zP.contains(Integer.valueOf(i)))) && ((this.zQ == null) || (!this.zQ.contains(paramView))))
      {
        int j;
        if (this.zR != null)
        {
          j = this.zR.size();
          for (k = 0; ; k++)
          {
            if (k >= j)
              break label100;
            if (((Class)this.zR.get(k)).isInstance(paramView))
              break;
          }
        }
        label100: ah localah;
        if ((paramView.getParent() instanceof ViewGroup))
        {
          localah = new ah();
          localah.view = paramView;
          if (!paramBoolean)
            break label262;
          a(localah);
          label135: localah.AD.add(this);
          d(localah);
          if (!paramBoolean)
            break label271;
          a(this.zW, paramView, localah);
        }
        while (true)
        {
          if ((!(paramView instanceof ViewGroup)) || ((this.zT != null) && (this.zT.contains(Integer.valueOf(i)))) || ((this.zU != null) && (this.zU.contains(paramView))))
            break label282;
          if (this.zV == null)
            break label284;
          j = this.zV.size();
          for (k = 0; ; k++)
          {
            if (k >= j)
              break label284;
            if (((Class)this.zV.get(k)).isInstance(paramView))
              break;
          }
          label262: b(localah);
          break label135;
          label271: a(this.zX, paramView, localah);
        }
        label282: continue;
        label284: paramView = (ViewGroup)paramView;
        for (int k = 0; k < paramView.getChildCount(); k++)
          a(paramView.getChildAt(k), paramBoolean);
      }
    }
  }

  private static boolean a(ah paramah1, ah paramah2, String paramString)
  {
    boolean bool1 = true;
    paramah1 = paramah1.values.get(paramString);
    paramah2 = paramah2.values.get(paramString);
    boolean bool2;
    if ((paramah1 != null) || (paramah2 != null))
    {
      bool2 = bool1;
      if (paramah1 != null)
      {
        if (paramah2 != null)
          break label49;
        bool2 = bool1;
      }
    }
    while (true)
    {
      return bool2;
      label49: bool2 = bool1;
      if (paramah1.equals(paramah2))
        bool2 = false;
    }
  }

  private static boolean b(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool1 = false;
    int i = paramArrayOfInt[paramInt];
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < paramInt)
      {
        if (paramArrayOfInt[j] == i)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  private static android.support.v4.f.a<Animator, Transition.a> cW()
  {
    android.support.v4.f.a locala1 = (android.support.v4.f.a)Ac.get();
    android.support.v4.f.a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new android.support.v4.f.a();
      Ac.set(locala2);
    }
    return locala2;
  }

  private void setMatchOrder(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0));
    for (this.zZ = zH; ; this.zZ = ((int[])paramArrayOfInt.clone()))
    {
      return;
      for (int i = 0; i < paramArrayOfInt.length; i++)
      {
        int j = paramArrayOfInt[i];
        if ((j > 0) && (j <= 4));
        for (j = 1; j == 0; j = 0)
          throw new IllegalArgumentException("matches contains invalid value");
        if (b(paramArrayOfInt, i))
          throw new IllegalArgumentException("matches contains a duplicate value");
      }
    }
  }

  final boolean C(View paramView)
  {
    boolean bool1 = false;
    int i = paramView.getId();
    boolean bool2;
    if ((this.zP != null) && (this.zP.contains(Integer.valueOf(i))))
      bool2 = bool1;
    label109: 
    do
    {
      while (true)
      {
        return bool2;
        if (this.zQ != null)
        {
          bool2 = bool1;
          if (this.zQ.contains(paramView));
        }
        else
        {
          if (this.zR != null)
          {
            int j = this.zR.size();
            for (k = 0; ; k++)
            {
              if (k >= j)
                break label109;
              bool2 = bool1;
              if (((Class)this.zR.get(k)).isInstance(paramView))
                break;
            }
          }
          if ((this.zS != null) && (s.ai(paramView) != null))
          {
            bool2 = bool1;
            if (this.zS.contains(s.ai(paramView)));
          }
          else if ((this.zL.size() == 0) && (this.zM.size() == 0) && ((this.zO == null) || (this.zO.isEmpty())) && ((this.zN == null) || (this.zN.isEmpty())))
          {
            bool2 = true;
          }
          else if ((this.zL.contains(Integer.valueOf(i))) || (this.zM.contains(paramView)))
          {
            bool2 = true;
          }
          else
          {
            if ((this.zN == null) || (!this.zN.contains(s.ai(paramView))))
              break;
            bool2 = true;
          }
        }
      }
      bool2 = bool1;
    }
    while (this.zO == null);
    for (int k = 0; ; k++)
    {
      bool2 = bool1;
      if (k >= this.zO.size())
        break;
      if (((Class)this.zO.get(k)).isInstance(paramView))
      {
        bool2 = true;
        break;
      }
    }
  }

  public Transition D(View paramView)
  {
    this.zM.add(paramView);
    return this;
  }

  public Transition E(View paramView)
  {
    this.zM.remove(paramView);
    return this;
  }

  public void F(View paramView)
  {
    if (!this.Ag)
    {
      android.support.v4.f.a locala = cW();
      int i = locala.size();
      be localbe = au.K(paramView);
      i--;
      while (i >= 0)
      {
        paramView = (Transition.a)locala.valueAt(i);
        if ((paramView.mView != null) && (localbe.equals(paramView.Ao)))
          a.b((Animator)locala.keyAt(i));
        i--;
      }
      if ((this.mListeners != null) && (this.mListeners.size() > 0))
      {
        paramView = (ArrayList)this.mListeners.clone();
        int j = paramView.size();
        for (i = 0; i < j; i++)
          ((Transition.c)paramView.get(i)).cO();
      }
      this.mPaused = true;
    }
  }

  public void G(View paramView)
  {
    if (this.mPaused)
    {
      if (!this.Ag)
      {
        android.support.v4.f.a locala = cW();
        int i = locala.size();
        paramView = au.K(paramView);
        i--;
        while (i >= 0)
        {
          Transition.a locala1 = (Transition.a)locala.valueAt(i);
          if ((locala1.mView != null) && (paramView.equals(locala1.Ao)))
            a.c((Animator)locala.keyAt(i));
          i--;
        }
        if ((this.mListeners != null) && (this.mListeners.size() > 0))
        {
          paramView = (ArrayList)this.mListeners.clone();
          int j = paramView.size();
          for (i = 0; i < j; i++)
            ((Transition.c)paramView.get(i)).cP();
        }
      }
      this.mPaused = false;
    }
  }

  public Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    return null;
  }

  public Transition a(TimeInterpolator paramTimeInterpolator)
  {
    this.zK = paramTimeInterpolator;
    return this;
  }

  public Transition a(Transition.c paramc)
  {
    if (this.mListeners == null)
      this.mListeners = new ArrayList();
    this.mListeners.add(paramc);
    return this;
  }

  public void a(Transition.b paramb)
  {
    this.Ai = paramb;
  }

  public void a(af paramaf)
  {
    this.Ah = paramaf;
  }

  public abstract void a(ah paramah);

  protected void a(ViewGroup paramViewGroup, ai paramai1, ai paramai2, ArrayList<ah> paramArrayList1, ArrayList<ah> paramArrayList2)
  {
    android.support.v4.f.a locala = cW();
    long l1 = 9223372036854775807L;
    SparseIntArray localSparseIntArray = new SparseIntArray();
    int i = paramArrayList1.size();
    int j = 0;
    ah localah1;
    ah localah2;
    if (j < i)
    {
      localah1 = (ah)paramArrayList1.get(j);
      localah2 = (ah)paramArrayList2.get(j);
      if ((localah1 == null) || (localah1.AD.contains(this)))
        break label603;
      localah1 = null;
    }
    label309: label603: 
    while (true)
    {
      if ((localah2 != null) && (!localah2.AD.contains(this)))
        localah2 = null;
      while (true)
      {
        long l2;
        int k;
        Animator localAnimator;
        Object localObject1;
        Object localObject2;
        if (localah1 == null)
        {
          l2 = l1;
          if (localah2 == null);
        }
        else
        {
          if ((localah1 == null) || (localah2 == null) || (a(localah1, localah2)));
          for (k = 1; ; k = 0)
          {
            l2 = l1;
            if (k == 0)
              break label490;
            localAnimator = a(paramViewGroup, localah1, localah2);
            l2 = l1;
            if (localAnimator == null)
              break label490;
            localObject1 = null;
            if (localah2 == null)
              break label519;
            localObject2 = localah2.view;
            String[] arrayOfString = getTransitionProperties();
            paramai1 = (ai)localObject1;
            if (localObject2 == null)
              break label506;
            paramai1 = (ai)localObject1;
            if (arrayOfString == null)
              break label506;
            paramai1 = (ai)localObject1;
            if (arrayOfString.length <= 0)
              break label506;
            paramai1 = new ah();
            paramai1.view = ((View)localObject2);
            localObject1 = (ah)paramai2.AE.get(localObject2);
            if (localObject1 == null)
              break;
            for (k = 0; k < arrayOfString.length; k++)
              paramai1.values.put(arrayOfString[k], ((ah)localObject1).values.get(arrayOfString[k]));
          }
          int m = locala.size();
          k = 0;
          if (k >= m)
            break label506;
          localObject1 = (Transition.a)locala.get((Animator)locala.keyAt(k));
          if ((((Transition.a)localObject1).An == null) || (((Transition.a)localObject1).mView != localObject2) || (!((Transition.a)localObject1).mName.equals(this.mName)) || (!((Transition.a)localObject1).An.equals(paramai1)))
            break label500;
          localAnimator = null;
          localObject1 = localObject2;
          localObject2 = paramai1;
          paramai1 = (ai)localObject1;
        }
        while (true)
        {
          l2 = l1;
          if (localAnimator != null)
          {
            l2 = l1;
            if (this.Ah != null)
            {
              l2 = this.Ah.a(paramViewGroup, this, localah1, localah2);
              localSparseIntArray.put(this.uC.size(), (int)l2);
              l2 = Math.min(l2, l1);
            }
            locala.put(localAnimator, new Transition.a(paramai1, this.mName, this, au.K(paramViewGroup), (ah)localObject2));
            this.uC.add(localAnimator);
          }
          label490: j++;
          l1 = l2;
          break;
          label500: k++;
          break label309;
          label506: localObject1 = paramai1;
          paramai1 = (ai)localObject2;
          localObject2 = localObject1;
          continue;
          paramai1 = localah1.view;
          localObject2 = null;
        }
        if (l1 != 0L)
          for (j = 0; j < localSparseIntArray.size(); j++)
          {
            k = localSparseIntArray.keyAt(j);
            paramViewGroup = (Animator)this.uC.get(k);
            paramViewGroup.setStartDelay(localSparseIntArray.valueAt(j) - l1 + paramViewGroup.getStartDelay());
          }
        return;
      }
    }
  }

  public boolean a(ah paramah1, ah paramah2)
  {
    Object localObject;
    int j;
    boolean bool;
    if ((paramah1 != null) && (paramah2 != null))
    {
      localObject = getTransitionProperties();
      if (localObject != null)
      {
        int i = localObject.length;
        j = 0;
        if (j < i)
          if (a(paramah1, paramah2, localObject[j]))
            bool = true;
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      bool = false;
      continue;
      localObject = paramah1.values.keySet().iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
          if (a(paramah1, paramah2, (String)((Iterator)localObject).next()))
          {
            bool = true;
            break;
          }
      bool = false;
    }
  }

  public Transition b(Transition.c paramc)
  {
    if (this.mListeners == null);
    while (true)
    {
      return this;
      this.mListeners.remove(paramc);
      if (this.mListeners.size() == 0)
        this.mListeners = null;
    }
  }

  public final ah b(View paramView, boolean paramBoolean)
  {
    for (Object localObject = this; ((Transition)localObject).zY != null; localObject = ((Transition)localObject).zY);
    if (paramBoolean);
    for (localObject = ((Transition)localObject).zW; ; localObject = ((Transition)localObject).zX)
      return (ah)((ai)localObject).AE.get(paramView);
  }

  public abstract void b(ah paramah);

  final void b(ViewGroup paramViewGroup)
  {
    this.Aa = new ArrayList();
    this.Ab = new ArrayList();
    a(this.zW, this.zX);
    android.support.v4.f.a locala = cW();
    int i = locala.size();
    be localbe = au.K(paramViewGroup);
    i--;
    if (i >= 0)
    {
      Animator localAnimator = (Animator)locala.keyAt(i);
      int j;
      if (localAnimator != null)
      {
        Transition.a locala1 = (Transition.a)locala.get(localAnimator);
        if ((locala1 != null) && (locala1.mView != null) && (localbe.equals(locala1.Ao)))
        {
          ah localah1 = locala1.An;
          Object localObject = locala1.mView;
          ah localah2 = b((View)localObject, true);
          localObject = c((View)localObject, true);
          if (((localah2 == null) && (localObject == null)) || (!locala1.Ap.a(localah1, (ah)localObject)))
            break label200;
          j = 1;
          label168: if (j != 0)
          {
            if ((!localAnimator.isRunning()) && (!localAnimator.isStarted()))
              break label206;
            localAnimator.cancel();
          }
        }
      }
      while (true)
      {
        i--;
        break;
        label200: j = 0;
        break label168;
        label206: locala.remove(localAnimator);
      }
    }
    a(paramViewGroup, this.zW, this.zX, this.Aa, this.Ab);
    cX();
  }

  final void b(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i = 0;
    v(paramBoolean);
    int j;
    Object localObject1;
    Object localObject2;
    if (((this.zL.size() > 0) || (this.zM.size() > 0)) && ((this.zN == null) || (this.zN.isEmpty())) && ((this.zO == null) || (this.zO.isEmpty())))
    {
      j = 0;
      if (j < this.zL.size())
      {
        localObject1 = paramViewGroup.findViewById(((Integer)this.zL.get(j)).intValue());
        if (localObject1 != null)
        {
          localObject2 = new ah();
          ((ah)localObject2).view = ((View)localObject1);
          if (!paramBoolean)
            break label165;
          a((ah)localObject2);
          label128: ((ah)localObject2).AD.add(this);
          d((ah)localObject2);
          if (!paramBoolean)
            break label174;
          a(this.zW, (View)localObject1, (ah)localObject2);
        }
        while (true)
        {
          j++;
          break;
          label165: b((ah)localObject2);
          break label128;
          label174: a(this.zX, (View)localObject1, (ah)localObject2);
        }
      }
      j = 0;
      if (j < this.zM.size())
      {
        paramViewGroup = (View)this.zM.get(j);
        localObject2 = new ah();
        ((ah)localObject2).view = paramViewGroup;
        if (paramBoolean)
        {
          a((ah)localObject2);
          label241: ((ah)localObject2).AD.add(this);
          d((ah)localObject2);
          if (!paramBoolean)
            break label286;
          a(this.zW, paramViewGroup, (ah)localObject2);
        }
        while (true)
        {
          j++;
          break;
          b((ah)localObject2);
          break label241;
          label286: a(this.zX, paramViewGroup, (ah)localObject2);
        }
      }
    }
    else
    {
      a(paramViewGroup, paramBoolean);
    }
    if ((!paramBoolean) && (this.Aj != null))
    {
      int k = this.Aj.size();
      paramViewGroup = new ArrayList(k);
      int m;
      for (j = 0; ; j++)
      {
        m = i;
        if (j >= k)
          break;
        localObject2 = (String)this.Aj.keyAt(j);
        paramViewGroup.add(this.zW.AH.remove(localObject2));
      }
      while (m < k)
      {
        localObject2 = (View)paramViewGroup.get(m);
        if (localObject2 != null)
        {
          localObject1 = (String)this.Aj.valueAt(m);
          this.zW.AH.put(localObject1, localObject2);
        }
        m++;
      }
    }
  }

  final ah c(View paramView, boolean paramBoolean)
  {
    Object localObject1 = null;
    for (Object localObject2 = this; ((Transition)localObject2).zY != null; localObject2 = ((Transition)localObject2).zY);
    ArrayList localArrayList;
    Object localObject3;
    if (paramBoolean)
    {
      localArrayList = ((Transition)localObject2).Aa;
      if (localArrayList != null)
        break label55;
      localObject3 = localObject1;
    }
    label55: int j;
    label65: ah localah;
    do
    {
      return localObject3;
      localArrayList = ((Transition)localObject2).Ab;
      break;
      int i = localArrayList.size();
      j = 0;
      if (j >= i)
        break label152;
      localah = (ah)localArrayList.get(j);
      localObject3 = localObject1;
    }
    while (localah == null);
    if (localah.view == paramView);
    while (true)
    {
      if (j >= 0)
        if (paramBoolean)
          paramView = ((Transition)localObject2).Ab;
      label116: for (paramView = (ah)paramView.get(j); ; paramView = null)
      {
        localObject3 = paramView;
        break;
        j++;
        break label65;
        paramView = ((Transition)localObject2).Aa;
        break label116;
      }
      label152: j = -1;
    }
  }

  protected void cX()
  {
    start();
    android.support.v4.f.a locala = cW();
    Iterator localIterator = this.uC.iterator();
    while (localIterator.hasNext())
    {
      Animator localAnimator = (Animator)localIterator.next();
      if (locala.containsKey(localAnimator))
      {
        start();
        if (localAnimator != null)
        {
          localAnimator.addListener(new Transition.2(this, locala));
          if (localAnimator == null)
          {
            end();
          }
          else
          {
            if (this.mDuration >= 0L)
              localAnimator.setDuration(this.mDuration);
            if (this.zJ >= 0L)
              localAnimator.setStartDelay(this.zJ);
            if (this.zK != null)
              localAnimator.setInterpolator(this.zK);
            localAnimator.addListener(new Transition.3(this));
            localAnimator.start();
          }
        }
      }
    }
    this.uC.clear();
    end();
  }

  public Transition cY()
  {
    try
    {
      Transition localTransition = (Transition)super.clone();
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localTransition.uC = ((ArrayList)localObject2);
      localObject2 = new android/support/transition/ai;
      ((ai)localObject2).<init>();
      localTransition.zW = ((ai)localObject2);
      localObject2 = new android/support/transition/ai;
      ((ai)localObject2).<init>();
      localTransition.zX = ((ai)localObject2);
      localTransition.Aa = null;
      localTransition.Ab = null;
      return localTransition;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (true)
        Object localObject1 = null;
    }
  }

  void d(ah paramah)
  {
    int i = 0;
    String[] arrayOfString;
    if ((this.Ah != null) && (!paramah.values.isEmpty()))
    {
      arrayOfString = this.Ah.getPropagationProperties();
      if (arrayOfString != null)
        break label34;
    }
    label34: label37: label89: 
    while (true)
    {
      return;
      int j = 0;
      if (j < arrayOfString.length)
        if (paramah.values.containsKey(arrayOfString[j]));
      for (j = i; ; j = 1)
      {
        if (j != 0)
          break label89;
        this.Ah.c(paramah);
        break;
        j++;
        break label37;
      }
    }
  }

  protected final void end()
  {
    this.Af -= 1;
    if (this.Af == 0)
    {
      Object localObject;
      if ((this.mListeners != null) && (this.mListeners.size() > 0))
      {
        localObject = (ArrayList)this.mListeners.clone();
        int i = ((ArrayList)localObject).size();
        for (j = 0; j < i; j++)
          ((Transition.c)((ArrayList)localObject).get(j)).a(this);
      }
      for (int j = 0; j < this.zW.AG.size(); j++)
      {
        localObject = (View)this.zW.AG.valueAt(j);
        if (localObject != null)
          s.d((View)localObject, false);
      }
      for (j = 0; j < this.zX.AG.size(); j++)
      {
        localObject = (View)this.zX.AG.valueAt(j);
        if (localObject != null)
          s.d((View)localObject, false);
      }
      this.Ag = true;
    }
  }

  public Transition g(long paramLong)
  {
    this.mDuration = paramLong;
    return this;
  }

  public final Rect getEpicenter()
  {
    if (this.Ai == null);
    for (Rect localRect = null; ; localRect = this.Ai.cS())
      return localRect;
  }

  public String[] getTransitionProperties()
  {
    return null;
  }

  public Transition h(long paramLong)
  {
    this.zJ = paramLong;
    return this;
  }

  protected final void start()
  {
    if (this.Af == 0)
    {
      if ((this.mListeners != null) && (this.mListeners.size() > 0))
      {
        ArrayList localArrayList = (ArrayList)this.mListeners.clone();
        int i = localArrayList.size();
        for (int j = 0; j < i; j++)
          ((Transition.c)localArrayList.get(j)).cT();
      }
      this.Ag = false;
    }
    this.Af += 1;
  }

  public String toString()
  {
    return toString("");
  }

  String toString(String paramString)
  {
    int i = 0;
    paramString = paramString + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
    String str = paramString;
    if (this.mDuration != -1L)
      str = paramString + "dur(" + this.mDuration + ") ";
    paramString = str;
    if (this.zJ != -1L)
      paramString = str + "dly(" + this.zJ + ") ";
    str = paramString;
    if (this.zK != null)
      str = paramString + "interp(" + this.zK + ") ";
    if (this.zL.size() <= 0)
    {
      paramString = str;
      if (this.zM.size() <= 0);
    }
    else
    {
      str = str + "tgts(";
      paramString = str;
      int j;
      if (this.zL.size() > 0)
        for (j = 0; ; j++)
        {
          paramString = str;
          if (j >= this.zL.size())
            break;
          paramString = str;
          if (j > 0)
            paramString = str + ", ";
          str = paramString + this.zL.get(j);
        }
      str = paramString;
      if (this.zM.size() > 0)
        for (j = i; ; j++)
        {
          str = paramString;
          if (j >= this.zM.size())
            break;
          str = paramString;
          if (j > 0)
            str = paramString + ", ";
          paramString = str + this.zM.get(j);
        }
      paramString = str + ")";
    }
    return paramString;
  }

  final void v(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.zW.AE.clear();
      this.zW.AF.clear();
      this.zW.AG.clear();
    }
    while (true)
    {
      return;
      this.zX.AE.clear();
      this.zX.AF.clear();
      this.zX.AG.clear();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.transition.Transition
 * JD-Core Version:    0.6.2
 */