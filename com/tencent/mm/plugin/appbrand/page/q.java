package com.tencent.mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.f;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

@SuppressLint({"ViewConstructor"})
public class q extends FrameLayout
{
  private static final int irH = 2131820568;
  private i gPI;
  private boolean irI;
  private boolean irJ;
  private final LinkedList<n> irK;
  private final LinkedList<n> irL;
  private final LinkedList<Runnable> irM;
  private u irN;
  private ap irO;
  private boolean irP;
  private b irQ;
  private String mAppId;

  public q(Context paramContext, i parami)
  {
    super(paramContext);
    AppMethodBeat.i(87099);
    this.irI = false;
    this.irJ = false;
    this.irK = new LinkedList();
    this.irL = new LinkedList();
    this.irM = new LinkedList();
    this.irP = true;
    this.gPI = parami;
    this.mAppId = parami.mAppId;
    this.irO = new ap.a();
    AppMethodBeat.o(87099);
  }

  private n Dc(String paramString)
  {
    AppMethodBeat.i(87121);
    if (this.irK.size() == 0)
    {
      AppMethodBeat.o(87121);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if (((this.irK.getFirst() instanceof g)) && (((n)this.irK.getFirst()).Ay(paramString)))
      {
        paramString = (n)this.irK.getFirst();
        AppMethodBeat.o(87121);
      }
      else
      {
        AppMethodBeat.o(87121);
        paramString = null;
      }
    }
  }

  private n Dd(String paramString)
  {
    AppMethodBeat.i(87122);
    if (this.irK.size() < 2)
    {
      AppMethodBeat.o(87122);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      ListIterator localListIterator = this.irK.listIterator(1);
      while (true)
        if (localListIterator.hasNext())
        {
          n localn = (n)localListIterator.next();
          if (((localn instanceof g)) && (localn.Ay(paramString)))
          {
            AppMethodBeat.o(87122);
            paramString = localn;
            break;
          }
        }
      AppMethodBeat.o(87122);
      paramString = null;
    }
  }

  private void a(n paramn, Object paramObject, Runnable paramRunnable)
  {
    AppMethodBeat.i(87142);
    if ((paramObject instanceof Animator))
    {
      paramObject = (Animator)paramObject;
      j(paramn);
      paramn.setTag(irH, paramObject);
      paramObject.addListener(new q.10(this, paramn));
      paramObject.addListener(new q.11(this, paramRunnable));
      paramObject.start();
      AppMethodBeat.o(87142);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Animation))
      {
        paramObject = (Animation)paramObject;
        paramObject.setAnimationListener(new q.13(this, paramRunnable, paramn));
        j(paramn);
        paramn.setTag(irH, paramObject);
        paramn.startAnimation(paramObject);
        AppMethodBeat.o(87142);
      }
      else
      {
        if (paramObject != null)
          break;
        paramRunnable.run();
        AppMethodBeat.o(87142);
      }
    }
    paramn = new IllegalArgumentException("Page animation should be Animator or Animation");
    AppMethodBeat.o(87142);
    throw paramn;
  }

  private void aJo()
  {
    AppMethodBeat.i(87117);
    Iterator localIterator = this.irM.descendingIterator();
    while (localIterator.hasNext())
    {
      ((Runnable)localIterator.next()).run();
      localIterator.remove();
    }
    this.irL.clear();
    AppMethodBeat.o(87117);
  }

  private void b(n paramn1, n paramn2)
  {
    AppMethodBeat.i(87118);
    Iterator localIterator = this.irK.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      n localn = (n)localIterator.next();
      if (localn == paramn1)
      {
        i = 1;
      }
      else
      {
        if (localn == paramn2)
          break;
        if (i != 0)
        {
          d(localn);
          localIterator.remove();
        }
      }
    }
    AppMethodBeat.o(87118);
  }

  private void b(n paramn1, final n paramn2, aq paramaq)
  {
    AppMethodBeat.i(87119);
    this.irK.remove(paramn2);
    int i;
    if (!paramn2.mSwiping)
    {
      i = 1;
      if (i == 0)
        break label127;
      Runnable local4 = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(87080);
          q.b(q.this, paramn2);
          AppMethodBeat.o(87080);
        }
      };
      a(paramn2, i(paramn2), local4);
      label53: ab.i("MicroMsg.AppBrandPageContainer", "switchPageClear, in: %s out: %s", new Object[] { paramn1.getCurrentUrl(), paramn2.getCurrentUrl() });
      paramn1.a(paramaq);
      paramn1.aJj();
      if (i == 0)
        break label135;
      paramn2 = new q.5(this, paramn1);
      a(paramn1, h(paramn1), paramn2);
      AppMethodBeat.o(87119);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label127: d(paramn2);
      break label53;
      label135: paramn1.aJl();
      AppMethodBeat.o(87119);
    }
  }

  private void b(n paramn, boolean paramBoolean)
  {
    while (true)
    {
      q.7 local7;
      try
      {
        AppMethodBeat.i(87120);
        if (paramn == null)
        {
          AppMethodBeat.o(87120);
          return;
        }
        this.irK.remove(paramn);
        this.irK.push(paramn);
        this.irL.remove(paramn);
        paramn.bringToFront();
        requestLayout();
        invalidate();
        paramn.aJj();
        local7 = new com/tencent/mm/plugin/appbrand/page/q$7;
        local7.<init>(this, paramn);
        if (paramBoolean)
        {
          a(paramn, f(paramn), local7);
          AppMethodBeat.o(87120);
          continue;
        }
      }
      finally
      {
      }
      local7.run();
      AppMethodBeat.o(87120);
    }
  }

  private static boolean b(aq paramaq)
  {
    if ((paramaq == aq.ivb) || (paramaq == aq.ive) || (paramaq == aq.ivc) || (paramaq == aq.ivd));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean c(aq paramaq)
  {
    AppMethodBeat.i(87116);
    boolean bool = com.tencent.mm.compatible.loader.a.contains(new aq[] { aq.ive, aq.ivc, aq.ivd }, paramaq);
    AppMethodBeat.o(87116);
    return bool;
  }

  private void d(n paramn)
  {
    AppMethodBeat.i(87123);
    paramn.setVisibility(8);
    paramn.aJk();
    paramn.performDestroy();
    removeView(paramn);
    paramn.xN();
    AppMethodBeat.o(87123);
  }

  private static void j(n paramn)
  {
    AppMethodBeat.i(87141);
    paramn.clearAnimation();
    paramn = paramn.getTag(irH);
    if ((paramn instanceof Animator))
    {
      paramn = (Animator)paramn;
      paramn.cancel();
      paramn.removeAllListeners();
    }
    AppMethodBeat.o(87141);
  }

  public void Az(String paramString)
  {
    AppMethodBeat.i(87104);
    runOnUiThread(new q.1(this, paramString));
    AppMethodBeat.o(87104);
  }

  public final void CZ(final String paramString)
  {
    AppMethodBeat.i(87105);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(87089);
        q.a(q.this, paramString, aq.iuZ);
        AppMethodBeat.o(87089);
      }
    });
    AppMethodBeat.o(87105);
  }

  public final void Da(String paramString)
  {
    AppMethodBeat.i(87107);
    runOnUiThread(new q.15(this, paramString));
    AppMethodBeat.o(87107);
  }

  public final void Db(String paramString)
  {
    AppMethodBeat.i(87108);
    runOnUiThread(new q.16(this, paramString));
    AppMethodBeat.o(87108);
  }

  protected void a(n paramn1, n paramn2)
  {
    AppMethodBeat.i(87112);
    if (this.irI)
      paramn2.getCurrentPageView().aJD();
    if (paramn1 != null)
      paramn1.aqX();
    AppMethodBeat.o(87112);
  }

  protected void a(n paramn1, n paramn2, aq paramaq)
  {
    AppMethodBeat.i(87115);
    if (this.irI)
      paramn2.getCurrentPageView().aJD();
    AppMethodBeat.o(87115);
  }

  protected void a(n paramn1, n paramn2, aq paramaq, String paramString)
  {
    AppMethodBeat.i(87114);
    if (paramn1 != null)
      paramn1.aqX();
    AppMethodBeat.o(87114);
  }

  protected boolean a(String paramString, aq paramaq, a parama)
  {
    return false;
  }

  public void aAU()
  {
    AppMethodBeat.i(87109);
    runOnUiThread(new q.18(this));
    AppMethodBeat.o(87109);
  }

  public boolean aAV()
  {
    boolean bool = true;
    AppMethodBeat.i(87144);
    if ((this.irK.size() > 1) || (getRuntime().gNS))
      AppMethodBeat.o(87144);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87144);
    }
  }

  public u aHV()
  {
    return null;
  }

  public final void aJp()
  {
    AppMethodBeat.i(87131);
    if (!this.irI)
    {
      this.irJ = true;
      AppMethodBeat.o(87131);
    }
    while (true)
    {
      return;
      this.irJ = false;
      postDelayed(new q.9(this), 200L);
      AppMethodBeat.o(87131);
    }
  }

  protected final void aJq()
  {
    AppMethodBeat.i(87135);
    if (this.gPI == null)
      AppMethodBeat.o(87135);
    while (true)
    {
      return;
      if (this.irP)
      {
        onReady();
        this.irP = false;
      }
      AppMethodBeat.o(87135);
    }
  }

  public void af(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(87106);
    runOnUiThread(new q.14(this, paramString, paramBoolean));
    AppMethodBeat.o(87106);
  }

  protected n b(String paramString, aq paramaq)
  {
    boolean bool = true;
    AppMethodBeat.i(87113);
    if (paramaq == aq.ive)
    {
      if (!bool)
        break label130;
      paramString = new g(getContext(), this);
      AppMethodBeat.o(87113);
    }
    while (true)
    {
      return paramString;
      if ((paramaq == aq.ivc) || (paramaq == aq.ivd))
      {
        bool = this.gPI.getAppConfig().heV.yU(paramString);
        break;
      }
      int i = this.irK.size();
      if (paramaq == aq.ivb);
      for (int j = 1; ; j = 0)
      {
        if ((this.gPI.getAppConfig().heV.yU(paramString)) && (i + 1 - j == 1))
          break label128;
        bool = false;
        break;
      }
      label128: break;
      label130: paramString = new z(getContext(), this);
      AppMethodBeat.o(87113);
    }
  }

  public final void c(n paramn)
  {
    AppMethodBeat.i(87111);
    runOnUiThread(new q.20(this, paramn));
    AppMethodBeat.o(87111);
  }

  public void c(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(87124);
    runOnUiThread(new q.8(this, paramString1, paramString2, paramArrayOfInt));
    AppMethodBeat.o(87124);
  }

  public void cleanup()
  {
    AppMethodBeat.i(87128);
    onDestroy();
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.irK);
    localLinkedList.addAll(this.irL);
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      n localn = (n)localIterator.next();
      localn.aJk();
      localn.performDestroy();
      localn.xN();
      j(localn);
    }
    localLinkedList.clear();
    if (this.irN != null);
    try
    {
      this.irN.onDestroy();
      try
      {
        label97: this.irN.cleanup();
        label104: this.irK.clear();
        this.irL.clear();
        removeAllViews();
        this.irQ = null;
        this.gPI = null;
        AppMethodBeat.o(87128);
        return;
      }
      catch (Exception localException1)
      {
        break label104;
      }
    }
    catch (Exception localException2)
    {
      break label97;
    }
  }

  public final n e(n paramn)
  {
    try
    {
      AppMethodBeat.i(87126);
      int i = this.irK.indexOf(paramn);
      if (i >= this.irK.size() - 1)
      {
        paramn = null;
        AppMethodBeat.o(87126);
      }
      while (true)
      {
        return paramn;
        paramn = (n)this.irK.get(i + 1);
        AppMethodBeat.o(87126);
      }
    }
    finally
    {
    }
    throw paramn;
  }

  public Object f(n paramn)
  {
    AppMethodBeat.i(87137);
    paramn = ObjectAnimator.ofFloat(paramn, "translationX", new float[] { paramn.getWidth(), 0.0F });
    paramn.setDuration(250L);
    AppMethodBeat.o(87137);
    return paramn;
  }

  public Object g(n paramn)
  {
    AppMethodBeat.i(87138);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramn, "translationX", new float[] { 0.0F, -(paramn.getWidth() * 0.25F) });
    localObjectAnimator.setDuration(250L);
    paramn = ObjectAnimator.ofFloat(paramn, "translationX", new float[] { 0.0F });
    paramn.setDuration(0L);
    new AnimatorSet().playSequentially(new Animator[] { localObjectAnimator, paramn });
    AppMethodBeat.o(87138);
    return localObjectAnimator;
  }

  public com.tencent.mm.plugin.appbrand.config.a getAppConfig()
  {
    AppMethodBeat.i(87132);
    com.tencent.mm.plugin.appbrand.config.a locala = this.gPI.getAppConfig();
    AppMethodBeat.o(87132);
    return locala;
  }

  public String getAppId()
  {
    return this.mAppId;
  }

  public n getCurrentPage()
  {
    try
    {
      AppMethodBeat.i(87125);
      n localn;
      if (!this.irL.isEmpty())
      {
        localn = (n)this.irL.getFirst();
        AppMethodBeat.o(87125);
      }
      while (true)
      {
        return localn;
        localn = (n)this.irK.peekFirst();
        AppMethodBeat.o(87125);
      }
    }
    finally
    {
    }
  }

  public String getCurrentUrl()
  {
    try
    {
      AppMethodBeat.i(87127);
      Object localObject1 = getCurrentPage();
      if (localObject1 != null)
      {
        localObject1 = ((n)localObject1).getCurrentUrl();
        AppMethodBeat.o(87127);
      }
      while (true)
      {
        return localObject1;
        localObject1 = null;
        AppMethodBeat.o(87127);
      }
    }
    finally
    {
    }
  }

  public ap getDecorWidgetFactory()
  {
    return this.irO;
  }

  public int getPageCount()
  {
    AppMethodBeat.i(87103);
    int i = this.irK.size();
    int j = this.irL.size();
    AppMethodBeat.o(87103);
    return i + j;
  }

  public u getPageView()
  {
    AppMethodBeat.i(87130);
    Object localObject = getCurrentPage();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(87130);
    }
    while (true)
    {
      return localObject;
      localObject = ((n)localObject).getCurrentPageView();
      AppMethodBeat.o(87130);
    }
  }

  u getPageViewPrivate()
  {
    AppMethodBeat.i(87129);
    Object localObject1;
    Object localObject2;
    if (this.irN == null)
    {
      localObject1 = aHV();
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = new u();
      ((u)localObject2).irO = getDecorWidgetFactory();
      ((u)localObject2).a(getContext(), this.gPI);
      AppMethodBeat.o(87129);
    }
    while (true)
    {
      return localObject2;
      localObject2 = this.irN;
      this.irN = null;
      localObject1 = ((b)localObject2).getContentView();
      if (localObject1 != null)
        ((View)localObject1).setVisibility(0);
      removeView(((u)localObject2).getContentView());
      AppMethodBeat.o(87129);
    }
  }

  public i getRuntime()
  {
    return this.gPI;
  }

  public Object h(n paramn)
  {
    AppMethodBeat.i(87139);
    paramn = ObjectAnimator.ofFloat(paramn, "translationX", new float[] { -(paramn.getWidth() * 0.25F), 0.0F });
    paramn.setDuration(250L);
    AppMethodBeat.o(87139);
    return paramn;
  }

  public Object i(n paramn)
  {
    AppMethodBeat.i(87140);
    paramn = ObjectAnimator.ofFloat(paramn, "translationX", new float[] { 0.0F, paramn.getWidth() });
    paramn.setDuration(250L);
    AppMethodBeat.o(87140);
    return paramn;
  }

  public void nU(int paramInt)
  {
    AppMethodBeat.i(87110);
    runOnUiThread(new q.19(this, paramInt));
    AppMethodBeat.o(87110);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(87143);
    if (getCurrentPage() == null)
      AppMethodBeat.o(87143);
    while (true)
    {
      return;
      if (getCurrentPage().getCurrentPageView().wY())
      {
        AppMethodBeat.o(87143);
      }
      else if ((!this.irL.isEmpty()) || (getCurrentPage().getTag(irH) != null))
      {
        ab.w("MicroMsg.AppBrandPageContainer", "onBackPressed, has navigating pages, skip");
        AppMethodBeat.o(87143);
      }
      else
      {
        aAU();
        AppMethodBeat.o(87143);
      }
    }
  }

  protected void onDestroy()
  {
  }

  protected void onReady()
  {
    AppMethodBeat.i(87136);
    if (this.irQ != null)
      this.irQ.atu();
    AppMethodBeat.o(87136);
  }

  protected final void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(87102);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramRunnable.run();
      AppMethodBeat.o(87102);
    }
    while (true)
    {
      return;
      post(paramRunnable);
      AppMethodBeat.o(87102);
    }
  }

  public void setActuallyVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(87101);
    if (this.irI != paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.irI = paramBoolean;
      if ((paramBoolean) && (i != 0))
      {
        getCurrentPage().getCurrentPageView().aJD();
        super.setVisibility(0);
        if (this.irJ)
          aJp();
      }
      if ((!paramBoolean) && (i != 0))
        super.setVisibility(4);
      AppMethodBeat.o(87101);
      return;
    }
  }

  public void setDecorWidgetFactory(ap paramap)
  {
    AppMethodBeat.i(87100);
    if (paramap == null)
    {
      paramap = new NullPointerException("Should not be null");
      AppMethodBeat.o(87100);
      throw paramap;
    }
    this.irO = paramap;
    AppMethodBeat.o(87100);
  }

  public void setOnReadyListener(b paramb)
  {
    this.irQ = paramb;
  }

  public void wU()
  {
    AppMethodBeat.i(87133);
    if (this.irK.size() == 0)
      AppMethodBeat.o(87133);
    while (true)
    {
      return;
      ((n)this.irK.getFirst()).aJj();
      if (this.irI)
        ((n)this.irK.getFirst()).getCurrentPageView().aJD();
      AppMethodBeat.o(87133);
    }
  }

  public void wW()
  {
    AppMethodBeat.i(87134);
    if (this.irK.size() == 0)
      AppMethodBeat.o(87134);
    while (true)
    {
      return;
      ((n)this.irK.getFirst()).aJk();
      AppMethodBeat.o(87134);
    }
  }

  public static abstract interface a
  {
    public abstract void aJr();

    public abstract void cancel();

    public abstract void proceed();
  }

  public static abstract interface b
  {
    public abstract void atu();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.q
 * JD-Core Version:    0.6.2
 */