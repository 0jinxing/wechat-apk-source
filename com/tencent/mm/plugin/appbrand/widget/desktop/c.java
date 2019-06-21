package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.s;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.RecyclerView.f.a;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c extends av
{
  private static TimeInterpolator ahn;
  private ArrayList<RecyclerView.v> aho;
  private ArrayList<RecyclerView.v> ahp;
  private ArrayList<c.b> ahq;
  private ArrayList<c.a> ahr;
  ArrayList<ArrayList<RecyclerView.v>> ahs;
  ArrayList<ArrayList<c.b>> aht;
  ArrayList<ArrayList<c.a>> ahu;
  ArrayList<RecyclerView.v> ahv;
  ArrayList<RecyclerView.v> ahw;
  ArrayList<RecyclerView.v> ahx;
  ArrayList<RecyclerView.v> ahy;
  boolean iWU;
  public boolean iWV;
  ConversationAppBrandRecentView iWW;
  private RecyclerView.f.a iWX;

  public c(ConversationAppBrandRecentView paramConversationAppBrandRecentView, boolean paramBoolean)
  {
    AppMethodBeat.i(133796);
    this.iWU = false;
    this.iWV = false;
    this.aho = new ArrayList();
    this.ahp = new ArrayList();
    this.ahq = new ArrayList();
    this.ahr = new ArrayList();
    this.ahs = new ArrayList();
    this.aht = new ArrayList();
    this.ahu = new ArrayList();
    this.ahv = new ArrayList();
    this.ahw = new ArrayList();
    this.ahx = new ArrayList();
    this.ahy = new ArrayList();
    this.iWX = new c.1(this);
    this.iWW = paramConversationAppBrandRecentView;
    this.iWU = paramBoolean;
    AppMethodBeat.o(133796);
  }

  private void a(c.a parama)
  {
    AppMethodBeat.i(133803);
    if (parama.ahL != null)
      a(parama, parama.ahL);
    if (parama.ahM != null)
      a(parama, parama.ahM);
    AppMethodBeat.o(133803);
  }

  private void a(List<c.a> paramList, RecyclerView.v paramv)
  {
    AppMethodBeat.i(133802);
    for (int i = paramList.size() - 1; i >= 0; i--)
    {
      c.a locala = (c.a)paramList.get(i);
      if ((a(locala, paramv)) && (locala.ahL == null) && (locala.ahM == null))
        paramList.remove(locala);
    }
    AppMethodBeat.o(133802);
  }

  private boolean a(c.a parama, RecyclerView.v paramv)
  {
    AppMethodBeat.i(133804);
    boolean bool;
    if (parama.ahM == paramv)
    {
      parama.ahM = null;
      paramv.apJ.setAlpha(1.0F);
      paramv.apJ.setTranslationX(0.0F);
      paramv.apJ.setTranslationY(0.0F);
      m(paramv);
      bool = true;
      AppMethodBeat.o(133804);
    }
    while (true)
    {
      return bool;
      if (parama.ahL == paramv)
      {
        parama.ahL = null;
        break;
      }
      bool = false;
      AppMethodBeat.o(133804);
    }
  }

  private void e(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133806);
    if (ahn == null)
      ahn = new ValueAnimator().getInterpolator();
    paramv.apJ.animate().setInterpolator(ahn);
    d(paramv);
    AppMethodBeat.o(133806);
  }

  private static void o(List<RecyclerView.v> paramList)
  {
    AppMethodBeat.i(133810);
    for (int i = paramList.size() - 1; i >= 0; i--)
      ((RecyclerView.v)paramList.get(i)).apJ.animate().cancel();
    AppMethodBeat.o(133810);
  }

  public final boolean a(RecyclerView.v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(133800);
    View localView = paramv.apJ;
    paramInt1 = (int)paramv.apJ.getTranslationX() + paramInt1;
    int i = (int)paramv.apJ.getTranslationY() + paramInt2;
    e(paramv);
    int j = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - i;
    if ((j == 0) && (paramInt2 == 0))
    {
      C(paramv);
      AppMethodBeat.o(133800);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      if (j != 0)
        localView.setTranslationX(-j);
      if (paramInt2 != 0)
        localView.setTranslationY(-paramInt2);
      ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateMove holder %s", new Object[] { ((BaseAppBrandRecentView.c)paramv).gne.getText() });
      paramv.apJ.setScaleX(1.0F);
      paramv.apJ.setScaleY(1.0F);
      this.ahq.add(new c.b(paramv, paramInt1, i, paramInt3, paramInt4));
      AppMethodBeat.o(133800);
    }
  }

  public final boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(133801);
    boolean bool;
    if (paramv1 == paramv2)
    {
      bool = a(paramv1, paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(133801);
    }
    while (true)
    {
      return bool;
      int i = ConversationAppBrandRecentView.bo(paramv1.apJ);
      ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateChange %s, pos: %d", new Object[] { ((BaseAppBrandRecentView.c)paramv2).gne.getText(), Integer.valueOf(i) });
      float f1 = paramv1.apJ.getTranslationX();
      float f2 = paramv1.apJ.getTranslationY();
      float f3 = paramv1.apJ.getAlpha();
      e(paramv1);
      int j = (int)(paramInt3 - paramInt1 - f1);
      i = (int)(paramInt4 - paramInt2 - f2);
      paramv1.apJ.setTranslationX(f1);
      paramv1.apJ.setTranslationY(f2);
      paramv1.apJ.setAlpha(f3);
      if (paramv2 != null)
      {
        e(paramv2);
        paramv2.apJ.setTranslationX(-j);
        paramv2.apJ.setTranslationY(-i);
        paramv2.apJ.setAlpha(0.0F);
      }
      this.ahr.add(new c.a(paramv1, paramv2, paramInt1, paramInt2, paramInt3, paramInt4));
      bool = true;
      AppMethodBeat.o(133801);
    }
  }

  public final boolean a(RecyclerView.v paramv, List<Object> paramList)
  {
    AppMethodBeat.i(133811);
    boolean bool;
    if ((!paramList.isEmpty()) || (super.a(paramv, paramList)))
    {
      bool = true;
      AppMethodBeat.o(133811);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133811);
    }
  }

  public final boolean b(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133798);
    ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateRemove %s", new Object[] { ((BaseAppBrandRecentView.c)paramv).gne.getText() });
    e(paramv);
    this.aho.add(paramv);
    AppMethodBeat.o(133798);
    return true;
  }

  public final boolean c(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133799);
    e(paramv);
    ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateAdd holder %s", new Object[] { ((BaseAppBrandRecentView.c)paramv).gne.getText() });
    int i = ConversationAppBrandRecentView.bo(paramv.apJ);
    int j;
    boolean bool;
    if (i < this.iWW.getDataCount())
    {
      j = 1;
      if (j != 0)
        break label97;
      ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateAdd not valid item");
      ((BaseAppBrandRecentView.c)paramv).apJ.setVisibility(4);
      AppMethodBeat.o(133799);
      bool = true;
    }
    while (true)
    {
      return bool;
      j = 0;
      break;
      label97: if (this.iWW.qX(i))
      {
        ab.d("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateAdd last position %d of currentPage: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.iWW.getCurrentPage()) });
        i = (int)paramv.apJ.getX();
        j = (int)d.dl(ah.getContext());
        int k = d.dj(ah.getContext()) + (i + j);
        int m = (int)paramv.apJ.getY();
        j = (int)paramv.apJ.getX();
        i = (int)paramv.apJ.getY();
        ab.d("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateLastItemOfPage fromX: %d, toX: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(j) });
        paramv.apJ.setVisibility(0);
        paramv.apJ.animate().alpha(0.3F).setDuration(0L).setListener(null).start();
        bool = a(paramv, k, m, j, i);
        AppMethodBeat.o(133799);
      }
      else
      {
        paramv.apJ.setAlpha(0.0F);
        paramv.apJ.setScaleX(0.8F);
        paramv.apJ.setScaleY(0.8F);
        this.ahp.add(paramv);
        AppMethodBeat.o(133799);
        bool = true;
      }
    }
  }

  public final void d(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133805);
    View localView = paramv.apJ;
    localView.animate().cancel();
    for (int i = this.ahq.size() - 1; i >= 0; i--)
      if (((c.b)this.ahq.get(i)).ahR == paramv)
      {
        localView.setTranslationY(0.0F);
        localView.setTranslationX(0.0F);
        C(paramv);
        this.ahq.remove(i);
      }
    a(this.ahr, paramv);
    if (this.aho.remove(paramv))
    {
      localView.setAlpha(1.0F);
      B(paramv);
    }
    if (this.ahp.remove(paramv))
    {
      localView.setAlpha(1.0F);
      m(paramv);
    }
    ArrayList localArrayList;
    for (i = this.ahu.size() - 1; i >= 0; i--)
    {
      localArrayList = (ArrayList)this.ahu.get(i);
      a(localArrayList, paramv);
      if (localArrayList.isEmpty())
        this.ahu.remove(i);
    }
    i = this.aht.size() - 1;
    if (i >= 0)
    {
      localArrayList = (ArrayList)this.aht.get(i);
      for (int j = localArrayList.size() - 1; ; j--)
      {
        if (j >= 0)
        {
          if (((c.b)localArrayList.get(j)).ahR != paramv)
            continue;
          localView.setTranslationY(0.0F);
          localView.setTranslationX(0.0F);
          C(paramv);
          localArrayList.remove(j);
          if (localArrayList.isEmpty())
            this.aht.remove(i);
        }
        i--;
        break;
      }
    }
    for (i = this.ahs.size() - 1; i >= 0; i--)
    {
      localArrayList = (ArrayList)this.ahs.get(i);
      if (localArrayList.remove(paramv))
      {
        localView.setAlpha(1.0F);
        m(paramv);
        if (localArrayList.isEmpty())
          this.ahs.remove(i);
      }
    }
    this.ahx.remove(paramv);
    this.ahv.remove(paramv);
    this.ahy.remove(paramv);
    this.ahw.remove(paramv);
    hY();
    AppMethodBeat.o(133805);
  }

  public final void hX()
  {
    AppMethodBeat.i(133797);
    a(this.iWX);
    int i;
    int j;
    label39: int k;
    if (!this.aho.isEmpty())
    {
      i = 1;
      if (this.ahq.isEmpty())
        break label93;
      j = 1;
      if (this.ahr.isEmpty())
        break label98;
      k = 1;
      label51: if (this.ahp.isEmpty())
        break label103;
    }
    label93: label98: label103: for (int m = 1; ; m = 0)
    {
      if ((i != 0) || (j != 0) || (m != 0) || (k != 0))
        break label109;
      AppMethodBeat.o(133797);
      return;
      i = 0;
      break;
      j = 0;
      break label39;
      k = 0;
      break label51;
    }
    label109: Object localObject1 = this.aho.iterator();
    label118: Object localObject2;
    View localView;
    ViewPropertyAnimator localViewPropertyAnimator;
    int n;
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (RecyclerView.v)((Iterator)localObject1).next();
      localView = ((RecyclerView.v)localObject2).apJ;
      localViewPropertyAnimator = localView.animate();
      this.ahx.add(localObject2);
      n = ConversationAppBrandRecentView.bo(((RecyclerView.v)localObject2).apJ);
      if (n - 1 != e.rc(this.iWW.getCurrentPage()))
        break label633;
    }
    label364: label624: label633: for (float f = 0.3F; ; f = 0.0F)
    {
      ab.d("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateRemoveImpl %s, pos: %d, targetAlpha: %f", new Object[] { ((BaseAppBrandRecentView.c)localObject2).gne.getText(), Integer.valueOf(n), Float.valueOf(f) });
      localViewPropertyAnimator.setDuration(this.aou).alpha(f).setListener(new c.7(this, (RecyclerView.v)localObject2, n, localViewPropertyAnimator, localView)).start();
      break label118;
      this.aho.clear();
      long l1;
      long l2;
      if (j != 0)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.ahq);
        this.aht.add(localObject1);
        this.ahq.clear();
        localObject2 = new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(133778);
            Iterator localIterator = this.ahz.iterator();
            if (localIterator.hasNext())
            {
              Object localObject = (c.b)localIterator.next();
              c localc = c.this;
              RecyclerView.v localv = ((c.b)localObject).ahR;
              int i = ((c.b)localObject).ahN;
              int j = ((c.b)localObject).ahO;
              int k = ((c.b)localObject).ahP;
              int m = ((c.b)localObject).ahQ;
              localObject = localv.apJ;
              i = k - i;
              j = m - j;
              if (i != 0)
                ((View)localObject).animate().translationX(0.0F);
              if (j != 0)
                ((View)localObject).animate().translationY(0.0F);
              ViewPropertyAnimator localViewPropertyAnimator = ((View)localObject).animate();
              localc.ahw.add(localv);
              m = ConversationAppBrandRecentView.bo(localv.apJ);
              float f1 = 1.0F;
              boolean bool;
              label159: float f2;
              if (m < localc.iWW.getDataCount())
              {
                bool = true;
                if (bool)
                  break label300;
                f2 = 0.0F;
                localv.apJ.setVisibility(4);
              }
              while (true)
              {
                ab.d("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateMoveImpl position: %d, %s, isValid: %b, targetAlpha: %f, deltaX: %d, lastPosOfPage: %d", new Object[] { Integer.valueOf(m), ((BaseAppBrandRecentView.c)localv).gne.getText(), Boolean.valueOf(bool), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(e.rc(localc.iWW.getCurrentPage())) });
                localViewPropertyAnimator.alpha(f2).setDuration(localc.aov).setListener(new c.11(localc, localv, i, (View)localObject, j, bool, f2, localViewPropertyAnimator)).start();
                break;
                bool = false;
                break label159;
                label300: if ((e.rc(localc.iWW.getCurrentPage()) == m) && (i > 0))
                {
                  localv.apJ.setVisibility(0);
                  f2 = 0.3F;
                }
                else
                {
                  f2 = f1;
                  if (e.rc(localc.iWW.getCurrentPage()) == m)
                  {
                    f2 = f1;
                    if (i < 0)
                    {
                      localv.apJ.setVisibility(0);
                      f2 = 0.3F;
                    }
                  }
                }
              }
            }
            this.ahz.clear();
            c.this.aht.remove(this.ahz);
            AppMethodBeat.o(133778);
          }
        };
        if (i != 0)
          s.a(((c.b)((ArrayList)localObject1).get(0)).ahR.apJ, (Runnable)localObject2, this.aou);
      }
      else
      {
        if (k != 0)
        {
          localObject2 = new ArrayList();
          ((ArrayList)localObject2).addAll(this.ahr);
          this.ahu.add(localObject2);
          this.ahr.clear();
          localObject1 = new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(133779);
              Iterator localIterator = this.ahB.iterator();
              while (localIterator.hasNext())
              {
                c.a locala = (c.a)localIterator.next();
                if (locala != null)
                {
                  c localc = c.this;
                  Object localObject1 = locala.ahL;
                  Object localObject2;
                  label55: Object localObject3;
                  label73: int i;
                  float f;
                  boolean bool;
                  if (localObject1 == null)
                  {
                    localObject2 = null;
                    localObject3 = locala.ahM;
                    if (localObject3 != null)
                    {
                      localObject3 = ((RecyclerView.v)localObject3).apJ;
                      ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateChangeImpl %s", new Object[] { ((BaseAppBrandRecentView.c)localObject1).gne.getText() });
                      if (localObject2 != null)
                      {
                        localObject1 = ((View)localObject2).animate().setDuration(localc.aow);
                        localc.ahy.add(locala.ahL);
                        ((ViewPropertyAnimator)localObject1).translationX(locala.ahP - locala.ahN);
                        ((ViewPropertyAnimator)localObject1).translationY(locala.ahQ - locala.ahO);
                        ((ViewPropertyAnimator)localObject1).alpha(0.0F).setListener(new c.2(localc, locala, (ViewPropertyAnimator)localObject1, (View)localObject2)).start();
                      }
                      if (localObject3 == null)
                        continue;
                      i = ConversationAppBrandRecentView.bo((View)localObject3);
                      f = 1.0F;
                      if (i >= localc.iWW.getDataCount())
                        break label307;
                      bool = true;
                      label216: if (bool)
                        break label313;
                      f = 0.0F;
                    }
                  }
                  else
                  {
                    while (true)
                    {
                      localObject2 = ((View)localObject3).animate();
                      localc.ahy.add(locala.ahM);
                      ((ViewPropertyAnimator)localObject2).translationX(0.0F).translationY(0.0F).alpha(f).setDuration(localc.aow).setListener(new c.3(localc, locala, (ViewPropertyAnimator)localObject2, (View)localObject3, f, bool)).start();
                      break;
                      localObject2 = ((RecyclerView.v)localObject1).apJ;
                      break label55;
                      localObject3 = null;
                      break label73;
                      label307: bool = false;
                      break label216;
                      label313: int j = ((LinearLayoutManager)localc.iWW.getLayoutManager()).iS();
                      ab.d("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateChangeImpl lastVisiblePos: %d, position: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
                      if (j == i)
                        f = 0.3F;
                    }
                  }
                }
              }
              this.ahB.clear();
              c.this.ahu.remove(this.ahB);
              AppMethodBeat.o(133779);
            }
          };
          if (i == 0)
            break label589;
          s.a(((c.a)((ArrayList)localObject2).get(0)).ahL.apJ, (Runnable)localObject1, this.aou);
        }
        if (m == 0)
          break label624;
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.ahp);
        this.ahs.add(localObject1);
        this.ahp.clear();
        localObject2 = new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(133780);
            Iterator localIterator = this.ahC.iterator();
            while (localIterator.hasNext())
            {
              RecyclerView.v localv = (RecyclerView.v)localIterator.next();
              c localc = c.this;
              ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateAddImpl holder %s", new Object[] { ((BaseAppBrandRecentView.c)localv).gne.getText() });
              View localView = localv.apJ;
              ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
              localc.ahv.add(localv);
              int i = ConversationAppBrandRecentView.bo(localView);
              if ((localc.iWV) && (i == 1))
              {
                ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateFirstItemInserted holder %s", new Object[] { ((BaseAppBrandRecentView.c)localv).gne.getText() });
                localView = localv.apJ;
                localViewPropertyAnimator = localView.animate();
                if (ConversationAppBrandRecentView.bo(localv.apJ) < localc.iWW.getDataCount());
                for (i = 1; ; i = 0)
                {
                  if (i != 0)
                    break label180;
                  localView.setVisibility(4);
                  break;
                }
                label180: localView.setVisibility(0);
                localView.setAlpha(1.0F);
                localView.setScaleX(1.0F);
                localView.setScaleY(1.0F);
                ((BaseAppBrandRecentView.c)localv).gne.setAlpha(0.0F);
                ((BaseAppBrandRecentView.c)localv).iYe.setAlpha(0.0F);
                ((BaseAppBrandRecentView.c)localv).iYe.setScaleX(1.0F);
                ((BaseAppBrandRecentView.c)localv).iYe.setScaleY(1.0F);
                ((BaseAppBrandRecentView.c)localv).gne.animate().alpha(1.0F).setDuration(150L).setListener(null).start();
                ((BaseAppBrandRecentView.c)localv).iYe.animate().alpha(1.0F).scaleX(1.2F).scaleY(1.2F).setDuration(150L).withEndAction(new c.8(localc, localv, localView, localViewPropertyAnimator)).start();
              }
              else if ((localc.iWU) && (i == localc.iWW.getDataCount() - 1))
              {
                ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo lastItemAnimateAddImpl holder %s", new Object[] { ((BaseAppBrandRecentView.c)localv).gne.getText() });
                localView = localv.apJ;
                localViewPropertyAnimator = localView.animate();
                localView.setVisibility(0);
                localView.setAlpha(1.0F);
                localView.setScaleX(1.0F);
                localView.setScaleY(1.0F);
                ((BaseAppBrandRecentView.c)localv).gne.setAlpha(0.0F);
                ((BaseAppBrandRecentView.c)localv).iYe.setAlpha(0.0F);
                ((BaseAppBrandRecentView.c)localv).iYe.setScaleX(1.0F);
                ((BaseAppBrandRecentView.c)localv).iYe.setScaleY(1.0F);
                ((BaseAppBrandRecentView.c)localv).gne.animate().alpha(1.0F).setDuration(150L).setListener(null).start();
                ((BaseAppBrandRecentView.c)localv).iYe.animate().alpha(1.0F).scaleX(1.2F).scaleY(1.2F).setDuration(150L).withEndAction(new c.10(localc, localv, localView, localViewPropertyAnimator)).start();
              }
              else
              {
                boolean bool;
                label547: float f;
                if (i < localc.iWW.getDataCount())
                {
                  bool = true;
                  if (bool)
                    break label670;
                  localv.apJ.setVisibility(4);
                  f = 0.0F;
                }
                while (true)
                {
                  ab.d("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateAddImpl pos: %d, targetAlpha: %f, customItemCount: %d, dataCount: %d", new Object[] { Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(localc.iWW.getCustomItemCount()), Integer.valueOf(localc.iWW.getDataCount()) });
                  localViewPropertyAnimator.alpha(f).scaleX(1.0F).scaleY(1.0F).setDuration(localc.aot).setListener(new c.9(localc, localv, localView, i, bool, localViewPropertyAnimator)).start();
                  break;
                  bool = false;
                  break label547;
                  label670: if (localc.iWW.qX(i))
                  {
                    localv.apJ.setVisibility(0);
                    f = 0.3F;
                  }
                  else
                  {
                    localv.apJ.setVisibility(0);
                    f = 1.0F;
                  }
                }
              }
            }
            this.ahC.clear();
            c.this.ahs.remove(this.ahC);
            AppMethodBeat.o(133780);
          }
        };
        if ((i == 0) && (j == 0) && (k == 0))
          break label617;
        if (i == 0)
          break label599;
        l1 = this.aou;
        if (j == 0)
          break label605;
        l2 = this.aov;
        if (k == 0)
          break label611;
      }
      for (long l3 = this.aow; ; l3 = 0L)
      {
        l2 = Math.max(l2, l3);
        s.a(((RecyclerView.v)((ArrayList)localObject1).get(0)).apJ, (Runnable)localObject2, l1 + l2);
        AppMethodBeat.o(133797);
        break;
        ((Runnable)localObject2).run();
        break label364;
        ((Runnable)localObject1).run();
        break label444;
        l1 = 0L;
        break label519;
        l2 = 0L;
        break label529;
      }
      ((Runnable)localObject2).run();
      AppMethodBeat.o(133797);
      break;
    }
  }

  final void hY()
  {
    AppMethodBeat.i(133808);
    if (!isRunning())
      jS();
    AppMethodBeat.o(133808);
  }

  public final void hZ()
  {
    AppMethodBeat.i(133809);
    Object localObject1;
    Object localObject2;
    for (int i = this.ahq.size() - 1; i >= 0; i--)
    {
      localObject1 = (c.b)this.ahq.get(i);
      localObject2 = ((c.b)localObject1).ahR.apJ;
      ((View)localObject2).setTranslationY(0.0F);
      ((View)localObject2).setTranslationX(0.0F);
      C(((c.b)localObject1).ahR);
      this.ahq.remove(i);
    }
    for (i = this.aho.size() - 1; i >= 0; i--)
    {
      B((RecyclerView.v)this.aho.get(i));
      this.aho.remove(i);
    }
    for (i = this.ahp.size() - 1; i >= 0; i--)
    {
      localObject1 = (RecyclerView.v)this.ahp.get(i);
      ((RecyclerView.v)localObject1).apJ.setAlpha(1.0F);
      m((RecyclerView.v)localObject1);
      this.ahp.remove(i);
    }
    for (i = this.ahr.size() - 1; i >= 0; i--)
      a((c.a)this.ahr.get(i));
    this.ahr.clear();
    if (!isRunning())
      AppMethodBeat.o(133809);
    while (true)
    {
      return;
      int j;
      for (i = this.aht.size() - 1; i >= 0; i--)
      {
        localObject1 = (ArrayList)this.aht.get(i);
        for (j = ((ArrayList)localObject1).size() - 1; j >= 0; j--)
        {
          c.b localb = (c.b)((ArrayList)localObject1).get(j);
          localObject2 = localb.ahR.apJ;
          ((View)localObject2).setTranslationY(0.0F);
          ((View)localObject2).setTranslationX(0.0F);
          C(localb.ahR);
          ((ArrayList)localObject1).remove(j);
          if (((ArrayList)localObject1).isEmpty())
            this.aht.remove(localObject1);
        }
      }
      for (i = this.ahs.size() - 1; i >= 0; i--)
      {
        localObject1 = (ArrayList)this.ahs.get(i);
        for (j = ((ArrayList)localObject1).size() - 1; j >= 0; j--)
        {
          localObject2 = (RecyclerView.v)((ArrayList)localObject1).get(j);
          ((RecyclerView.v)localObject2).apJ.setAlpha(1.0F);
          m((RecyclerView.v)localObject2);
          ((ArrayList)localObject1).remove(j);
          if (((ArrayList)localObject1).isEmpty())
            this.ahs.remove(localObject1);
        }
      }
      for (i = this.ahu.size() - 1; i >= 0; i--)
      {
        localObject1 = (ArrayList)this.ahu.get(i);
        for (j = ((ArrayList)localObject1).size() - 1; j >= 0; j--)
        {
          a((c.a)((ArrayList)localObject1).get(j));
          if (((ArrayList)localObject1).isEmpty())
            this.ahu.remove(localObject1);
        }
      }
      o(this.ahx);
      o(this.ahw);
      o(this.ahv);
      o(this.ahy);
      jS();
      AppMethodBeat.o(133809);
    }
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(133807);
    boolean bool;
    if ((!this.ahp.isEmpty()) || (!this.ahr.isEmpty()) || (!this.ahq.isEmpty()) || (!this.aho.isEmpty()) || (!this.ahw.isEmpty()) || (!this.ahx.isEmpty()) || (!this.ahv.isEmpty()) || (!this.ahy.isEmpty()) || (!this.aht.isEmpty()) || (!this.ahs.isEmpty()) || (!this.ahu.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(133807);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133807);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c
 * JD-Core Version:    0.6.2
 */