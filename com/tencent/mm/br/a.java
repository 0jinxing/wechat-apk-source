package com.tencent.mm.br;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.g;
import com.tencent.mm.api.k;
import com.tencent.mm.api.n;
import com.tencent.mm.api.r;
import com.tencent.mm.api.s.a;
import com.tencent.mm.cache.ArtistCacheManager;
import com.tencent.mm.cache.ArtistCacheManager.a;
import com.tencent.mm.e.c;
import com.tencent.mm.e.f;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.view.footer.SelectColorBar;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b
{
  s.a ccP;
  com.tencent.mm.view.a vwM;
  HashMap<com.tencent.mm.api.e, com.tencent.mm.e.b> vwN;
  LinkedList<com.tencent.mm.e.b> vwO;
  private g vwP;
  Bitmap vwQ;
  private boolean vwR = true;
  com.tencent.mm.api.e vwS = com.tencent.mm.api.e.ccG;
  com.tencent.mm.api.e vwT = com.tencent.mm.api.e.ccG;
  com.tencent.mm.e.b vwU = null;

  private void dlX()
  {
    AppMethodBeat.i(116342);
    this.vwO.clear();
    this.vwN.clear();
    this.vwN.put(com.tencent.mm.api.e.ccG, com.tencent.mm.e.b.cjg);
    com.tencent.mm.api.e[] arrayOfe = this.vwM.getFeatures();
    int i = arrayOfe.length;
    int j = 0;
    Object localObject1;
    Object localObject2;
    int k;
    if (j < i)
    {
      com.tencent.mm.api.e locale = arrayOfe[j];
      localObject1 = null;
      Iterator localIterator = null;
      localObject2 = localIterator;
      switch (a.7.vwX[locale.ordinal()])
      {
      default:
      case 6:
      case 4:
        for (localObject2 = localIterator; ; localObject2 = new com.tencent.mm.e.d())
        {
          if (localObject2 != null)
          {
            if (!this.vwN.containsKey(locale))
              this.vwN.put(locale, localObject2);
            if (!this.vwO.contains(localObject2))
            {
              this.vwO.add(localObject2);
              ((com.tencent.mm.e.b)localObject2).a(this, this.vwM.getBaseBoardView().getMainMatrix(), this.vwM.getBaseBoardView().getAliveRect());
            }
          }
          j++;
          break;
        }
      case 1:
      case 2:
        localIterator = this.vwO.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (com.tencent.mm.e.b)localIterator.next();
          if (((com.tencent.mm.e.b)localObject2).CG() == com.tencent.mm.e.a.ciY)
            k = 1;
        }
      case 5:
      case 3:
      }
    }
    while (k == 0)
    {
      localObject2 = new com.tencent.mm.e.e();
      ((com.tencent.mm.e.e)localObject2).ckm = new a.a(this);
      break;
      localObject2 = new f();
      break;
      localObject2 = new c();
      break;
      Collections.sort(this.vwO, new a.2(this));
      ab.i("MicroMsg.DrawingPresenter", "[addArtists] count:%s", new Object[] { Integer.valueOf(this.vwN.size() - 1) });
      AppMethodBeat.o(116342);
      return;
      k = 0;
      localObject2 = localObject1;
    }
  }

  public final boolean Ab()
  {
    boolean bool = true;
    AppMethodBeat.i(116325);
    if (this.vwM.getTextEditView().getVisibility() == 0)
    {
      oW(false);
      this.vwM.setFooterVisible(true);
      AppMethodBeat.o(116325);
    }
    while (true)
    {
      return bool;
      if ((this.vwM.getChatFooterPanel() != null) && (this.vwM.getChatFooterPanel().getVisibility() == 0))
      {
        this.vwM.rj(true);
        this.vwM.setFooterVisible(true);
        AppMethodBeat.o(116325);
      }
      else
      {
        AppMethodBeat.o(116325);
        bool = false;
      }
    }
  }

  public final boolean G(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(116339);
    boolean bool3 = bool2;
    com.tencent.mm.e.b localb;
    if (dlU().CG() != com.tencent.mm.e.a.ciZ)
    {
      if (dlU().CG() == com.tencent.mm.e.a.cja)
        bool3 = bool2;
    }
    else
    {
      if (bool3)
        break label229;
      this.vwU = ((com.tencent.mm.e.b)this.vwN.get(this.vwM.getBaseFooterView().getCurFeatureType()));
      Iterator localIterator = this.vwO.iterator();
      while (localIterator.hasNext())
      {
        localb = (com.tencent.mm.e.b)localIterator.next();
        if ((localb.CG() != com.tencent.mm.e.a.ciY) && (localb.o(paramMotionEvent)))
          bool3 = true;
      }
    }
    label229: 
    while (true)
    {
      AppMethodBeat.o(116339);
      return bool3;
      localb = null;
      if (this.vwN.containsKey(com.tencent.mm.api.e.ccI))
        localb = (com.tencent.mm.e.b)this.vwN.get(com.tencent.mm.api.e.ccI);
      while (true)
      {
        bool2 = bool1;
        if (localb != null)
          bool2 = localb.o(paramMotionEvent);
        bool3 = bool2;
        if (!bool2)
          break;
        this.vwU = localb;
        bool3 = bool2;
        break;
        if (this.vwN.containsKey(com.tencent.mm.api.e.ccJ))
          localb = (com.tencent.mm.e.b)this.vwN.get(com.tencent.mm.api.e.ccJ);
      }
    }
  }

  public final com.tencent.mm.cache.d a(com.tencent.mm.e.a parama)
  {
    AppMethodBeat.i(116341);
    parama = ArtistCacheManager.Jc().a(parama);
    AppMethodBeat.o(116341);
    return parama;
  }

  public final void a(Editable paramEditable, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116327);
    oW(false);
    this.vwM.setFooterVisible(true);
    Object localObject = dlU();
    EditText localEditText;
    if (((com.tencent.mm.e.b)localObject).CG() == com.tencent.mm.e.a.ciY)
    {
      localObject = (com.tencent.mm.e.e)localObject;
      localEditText = (EditText)this.vwM.getTextEditView().findViewById(2131823386);
      if ((localEditText.getTag() == null) || (!(localEditText.getTag() instanceof com.tencent.mm.y.e)))
        break label119;
      ((com.tencent.mm.e.e)localObject).a((com.tencent.mm.y.e)localEditText.getTag(), j.b(this.vwM.getContext(), paramEditable), paramInt1, paramInt2);
    }
    while (true)
    {
      localEditText.setTag(null);
      AppMethodBeat.o(116327);
      return;
      label119: ((com.tencent.mm.e.e)localObject).a(j.b(this.vwM.getContext(), paramEditable), paramInt1, paramInt2);
    }
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    AppMethodBeat.i(116333);
    com.tencent.mm.sdk.g.d.post(new a.b(this, paramn, paramBoolean), "onFinalGenerate");
    AppMethodBeat.o(116333);
  }

  public final void a(s.a parama)
  {
    int i = 1;
    AppMethodBeat.i(116321);
    this.ccP = parama;
    this.vwN = new HashMap();
    this.vwO = new LinkedList();
    String str = parama.path;
    if ((bo.isNullOrNil(str)) || (!new File(str).exists()))
      ab.w("MicroMsg.DrawingPresenter", "[checkImage] path:%s", new Object[] { str });
    for (i = 0; ; i = 0)
    {
      BitmapFactory.Options localOptions;
      do
      {
        if (i != 0)
          this.vwQ = com.tencent.mm.sdk.platformtools.d.ao(bo.bc(parama.path, ""), 1280, 1280);
        dlX();
        AppMethodBeat.o(116321);
        return;
        localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, localOptions);
      }
      while ((localOptions.outWidth > 0) && (localOptions.outHeight > 0));
      ab.e("MicroMsg.DrawingPresenter", "[checkImage] image err! w:%s h:%s path:%s", new Object[] { Integer.valueOf(localOptions.outWidth), Integer.valueOf(localOptions.outHeight), str });
    }
  }

  public final void a(com.tencent.mm.view.a parama)
  {
    this.vwM = parama;
  }

  public final <T extends com.tencent.mm.e.b> T b(com.tencent.mm.api.e parame)
  {
    AppMethodBeat.i(116337);
    parame = (com.tencent.mm.e.b)this.vwN.get(parame);
    AppMethodBeat.o(116337);
    return parame;
  }

  public final void d(k paramk)
  {
    AppMethodBeat.i(116338);
    ((com.tencent.mm.e.e)b(com.tencent.mm.api.e.ccJ)).b(paramk);
    AppMethodBeat.o(116338);
  }

  public final void dlS()
  {
    AppMethodBeat.i(116328);
    this.vwM.setFooterVisible(true);
    oW(false);
    AppMethodBeat.o(116328);
  }

  public final com.tencent.mm.view.a dlT()
  {
    return this.vwM;
  }

  public final <T extends com.tencent.mm.e.b> T dlU()
  {
    AppMethodBeat.i(116330);
    com.tencent.mm.e.b localb;
    if (this.vwU != null)
    {
      localb = this.vwU;
      AppMethodBeat.o(116330);
    }
    while (true)
    {
      return localb;
      ab.e("MicroMsg.DrawingPresenter", "[getCurArtist] is null!");
      localb = com.tencent.mm.e.b.cjg;
      AppMethodBeat.o(116330);
    }
  }

  public final Bitmap dlV()
  {
    return this.vwQ;
  }

  public final boolean dlW()
  {
    AppMethodBeat.i(116336);
    boolean bool;
    if ((dlU().CG() != com.tencent.mm.e.a.ciZ) && (this.vwR))
    {
      bool = true;
      AppMethodBeat.o(116336);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(116336);
    }
  }

  public final s.a getConfig()
  {
    return this.ccP;
  }

  public final Context getContext()
  {
    AppMethodBeat.i(138665);
    Context localContext = this.vwM.getContext();
    AppMethodBeat.o(138665);
    return localContext;
  }

  public final float getCurScale()
  {
    AppMethodBeat.i(116332);
    float f = this.vwM.getBaseBoardView().getCurScale();
    AppMethodBeat.o(116332);
    return f;
  }

  public final com.tencent.mm.api.e[] getFeatures()
  {
    AppMethodBeat.i(116322);
    com.tencent.mm.api.e[] arrayOfe = this.vwM.getFeatures();
    AppMethodBeat.o(116322);
    return arrayOfe;
  }

  public final float getInitScale()
  {
    AppMethodBeat.i(116331);
    float f = this.vwM.getBaseBoardView().getInitScale();
    AppMethodBeat.o(116331);
    return f;
  }

  public final r getSelectedFeatureListener()
  {
    AppMethodBeat.i(116323);
    a.1 local1 = new a.1(this);
    AppMethodBeat.o(116323);
    return local1;
  }

  final void oW(boolean paramBoolean)
  {
    AppMethodBeat.i(116343);
    Animation localAnimation;
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(this.vwM.getContext(), 2131034229);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          AppMethodBeat.i(116307);
          a.this.vwM.getTextEditView().setVisibility(0);
          paramAnonymousAnimation = (EditText)a.this.vwM.getTextEditView().findViewById(2131823386);
          paramAnonymousAnimation.requestFocus();
          paramAnonymousAnimation.setSelection(paramAnonymousAnimation.length());
          a.this.vwM.getSelectedFeatureListener().bd(true);
          ((SelectColorBar)a.this.vwM.findViewById(2131823388)).setSelectColor(paramAnonymousAnimation.getCurrentTextColor());
          a.this.vwM.getActionBar().post(new a.3.1(this));
          AppMethodBeat.o(116307);
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
        }
      });
      this.vwM.getTextEditView().startAnimation(localAnimation);
      AppMethodBeat.o(116343);
    }
    while (true)
    {
      return;
      localAnimation = AnimationUtils.loadAnimation(this.vwM.getContext(), 2131034227);
      localAnimation.setAnimationListener(new a.4(this));
      this.vwM.getTextEditView().startAnimation(localAnimation);
      AppMethodBeat.o(116343);
    }
  }

  public final void onAttachedToWindow()
  {
    AppMethodBeat.i(116335);
    ab.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow]");
    Iterator localIterator = this.vwO.iterator();
    label131: 
    while (localIterator.hasNext())
    {
      com.tencent.mm.e.b localb = (com.tencent.mm.e.b)localIterator.next();
      ArtistCacheManager localArtistCacheManager = ArtistCacheManager.Jc();
      com.tencent.mm.e.a locala = localb.CG();
      if ((ArtistCacheManager.efj.containsKey(localArtistCacheManager.efl)) && (((ArtistCacheManager.a)ArtistCacheManager.efj.get(localArtistCacheManager.efl)).efo.containsKey(locala)));
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label131;
        localb.zC();
        localb.bk(true);
        ab.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow] %s is revert onAlive!", new Object[] { localb.CG() });
        break;
      }
    }
    if (this.vwM.getBaseBoardView().dMM())
    {
      this.vwM.getBaseBoardView().dMN();
      this.vwM.getBaseBoardView().invalidate();
    }
    AppMethodBeat.o(116335);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(116334);
    Iterator localIterator = this.vwO.iterator();
    while (localIterator.hasNext())
      ((com.tencent.mm.e.b)localIterator.next()).onDestroy();
    this.vwO.clear();
    this.vwN.clear();
    AppMethodBeat.o(116334);
  }

  public final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116340);
    Iterator localIterator = this.vwO.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.e.b localb = (com.tencent.mm.e.b)localIterator.next();
      if (localb.isAlive())
        if (dlU().CG() == localb.CG())
        {
          localb.onDraw(paramCanvas);
        }
        else
        {
          paramCanvas.save();
          paramCanvas.clipRect(this.vwM.getBaseBoardView().getAliveRect());
          localb.a(paramCanvas);
          paramCanvas.restore();
        }
    }
    AppMethodBeat.o(116340);
  }

  public final void onExit()
  {
    AppMethodBeat.i(116324);
    if (this.vwP != null)
      this.vwP.onExit();
    AppMethodBeat.o(116324);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(116326);
    if (this.vwP != null)
      this.vwP.onFinish();
    AppMethodBeat.o(116326);
  }

  public final void setActionBarCallback(g paramg)
  {
    this.vwP = paramg;
  }

  public final void setAutoShowFooterAndBar(boolean paramBoolean)
  {
    this.vwR = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.br.a
 * JD-Core Version:    0.6.2
 */