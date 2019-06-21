package com.tencent.mm.view.e;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ao.b;
import com.tencent.mm.by.a.c;
import com.tencent.mm.g.a.cz;
import com.tencent.mm.g.a.ny;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.EmojiInfo.a;
import com.tencent.mm.storage.emotion.EmojiInfo.b;
import com.tencent.mm.ui.base.MMRadioGroupView.d;
import com.tencent.mm.view.ScrollRectRecyclerView;
import com.tencent.mm.view.SmileyPanelScrollView;
import com.tencent.mm.view.SmileyPanelScrollView.b;
import com.tencent.mm.view.SmileyPanelViewPager;
import com.tencent.mm.view.SmileyPanelViewPager.a;
import com.tencent.mm.view.a.f;
import com.tencent.mm.view.a.i;
import com.tencent.mm.view.a.j.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
  implements ViewPager.OnPageChangeListener, View.OnClickListener, MMRadioGroupView.d, SmileyPanelScrollView.b, SmileyPanelViewPager.a
{
  private static boolean AdL = true;
  public com.tencent.mm.view.f.a Aaj;
  public ImageView AdA;
  public ImageButton AdB;
  public TextView AdC;
  public ImageView AdD;
  private a.a AdE;
  private int AdF;
  private boolean AdG;
  public boolean AdH;
  public String AdI;
  private boolean AdJ;
  private boolean AdK;
  public final k.a AdM;
  public final com.tencent.mm.sdk.b.c<cz> AdN;
  public final k.a AdO;
  public j.a AdP;
  private final int Adp;
  private final int Adq;
  private final int Adr;
  private final int Ads;
  public SmileyPanelViewPager Adt;
  public i Adu;
  public SmileyPanelScrollView Adv;
  public ScrollRectRecyclerView Adw;
  public com.tencent.mm.view.a.j Adx;
  public View Ady;
  public ImageView Adz;
  private Context Gn;
  private final String TAG;
  public Context jiq;
  private ak mHandler;
  public View mView;
  public final k.a xYF;
  public final com.tencent.mm.sdk.b.c xYG;

  public a(Context paramContext, com.tencent.mm.view.f.a parama, a.a parama1)
  {
    AppMethodBeat.i(63035);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelManager";
    this.Adp = 100;
    this.Adq = 1102;
    this.Adr = 1103;
    this.Ads = 100;
    this.AdF = -1;
    this.AdG = false;
    this.AdH = true;
    this.AdJ = false;
    this.AdK = false;
    this.mHandler = new a.1(this);
    this.AdM = new a.6(this);
    this.xYF = new a.7(this);
    this.xYG = new com.tencent.mm.sdk.b.c()
    {
    };
    this.AdN = new com.tencent.mm.sdk.b.c()
    {
    };
    this.AdO = new a.10(this);
    this.AdP = new a.2(this);
    this.Gn = ah.getContext();
    this.jiq = paramContext;
    this.Aaj = parama;
    this.AdE = parama1;
    ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager add listener.");
    ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().j(this.AdM);
    ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().h(this.xYF);
    ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().l(this.AdO);
    com.tencent.mm.sdk.b.a.xxA.c(this.xYG);
    com.tencent.mm.sdk.b.a.xxA.c(this.AdN);
    if (AdL)
    {
      AdL = false;
      paramContext = com.tencent.mm.emoji.a.a.OB().bZ(true).iterator();
      while (paramContext.hasNext())
      {
        parama = (EmojiInfo)paramContext.next();
        if (EmojiInfo.a.yaD == parama.duZ())
        {
          parama.a(EmojiInfo.a.yaE);
          parama.a(EmojiInfo.b.yaV);
          ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().updateEmojiInfo(parama);
          EmojiCaptureReporter.h(parama.field_captureEnterTime, 5, parama.field_captureScene);
        }
        else if (parama.duZ() == EmojiInfo.a.yaF)
        {
          parama.a(EmojiInfo.a.yaG);
          ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().updateEmojiInfo(parama);
          EmojiCaptureReporter.g(parama.field_captureEnterTime, 3, parama.field_captureScene);
        }
      }
    }
    AppMethodBeat.o(63035);
  }

  private void a(EmojiGroupInfo paramEmojiGroupInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(63041);
    this.Aaj.a(paramEmojiGroupInfo, this, paramBoolean);
    AppMethodBeat.o(63041);
  }

  private void dNa()
  {
    AppMethodBeat.i(63040);
    dMZ();
    this.Adu = new i(this.Aaj, this.jiq);
    AppMethodBeat.o(63040);
  }

  private void dNc()
  {
    AppMethodBeat.i(63044);
    com.tencent.mm.bp.d.b(this.Gn, "emoji", ".ui.EmojiMineUI", new Intent());
    AppMethodBeat.o(63044);
  }

  private void dNd()
  {
    AppMethodBeat.i(63047);
    this.Aaj.Aey = false;
    if (this.AdC == null)
      AppMethodBeat.o(63047);
    while (true)
    {
      return;
      if (this.AdC.getVisibility() != 0)
      {
        TranslateAnimation localTranslateAnimation = new TranslateAnimation(this.AdC.getWidth(), 0.0F, 0.0F, 0.0F);
        localTranslateAnimation.setDuration(250L);
        this.AdC.startAnimation(localTranslateAnimation);
        this.AdC.setVisibility(0);
      }
      AppMethodBeat.o(63047);
    }
  }

  private void dNf()
  {
    AppMethodBeat.i(63055);
    if (this.Aaj.atk("TAG_DEFAULT_TAB"))
    {
      if ((this.AdE != null) && (this.AdE.getTextOpListener() != null))
        this.AdE.getTextOpListener().fC(true);
      if (!this.Aaj.dNq())
        break label113;
      dNd();
      AppMethodBeat.o(63055);
    }
    while (true)
    {
      return;
      if ((this.AdE != null) && (this.AdE.getTextOpListener() != null))
        this.AdE.getTextOpListener().fC(false);
      rk(true);
      label113: AppMethodBeat.o(63055);
    }
  }

  private void g(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(63038);
    if (paramInt1 <= 1)
    {
      this.Adv.setVisibility(4);
      AppMethodBeat.o(63038);
    }
    while (true)
    {
      return;
      this.Adv.setVisibility(0);
      this.Adv.f(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      AppMethodBeat.o(63038);
    }
  }

  private void setTabSelected(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(63053);
    Object localObject;
    int j;
    Rect localRect;
    if ((this.Adw != null) && (this.Adx != null))
    {
      localObject = this.Adx;
      if (((com.tencent.mm.view.a.j)localObject).llU != paramInt)
      {
        ((com.tencent.mm.view.a.j)localObject).cg(((com.tencent.mm.view.a.j)localObject).llU);
        ((com.tencent.mm.view.a.j)localObject).llU = paramInt;
        ((com.tencent.mm.view.a.j)localObject).cg(((com.tencent.mm.view.a.j)localObject).llU);
      }
      j = this.Aaj.lfN;
      localRect = new Rect();
      localRect.left = (j * paramInt);
      localRect.right = (j * (paramInt + 1));
      localObject = this.Adw;
      if (localRect.left >= ((ScrollRectRecyclerView)localObject).scrollX)
        break label232;
    }
    label232: for (paramInt = localRect.left - ((ScrollRectRecyclerView)localObject).scrollX; ; paramInt = 0)
    {
      j = paramInt;
      if (localRect.right > ((ScrollRectRecyclerView)localObject).scrollX + ((ScrollRectRecyclerView)localObject).getMeasuredWidth())
        j = localRect.right - (((ScrollRectRecyclerView)localObject).scrollX + ((ScrollRectRecyclerView)localObject).getMeasuredWidth());
      paramInt = i;
      if (localRect.top < ((ScrollRectRecyclerView)localObject).scrollY)
        paramInt = localRect.top - ((ScrollRectRecyclerView)localObject).scrollY;
      if (localRect.bottom > ((ScrollRectRecyclerView)localObject).scrollY + ((ScrollRectRecyclerView)localObject).getMeasuredHeight())
        paramInt = localRect.bottom - (((ScrollRectRecyclerView)localObject).scrollY + ((ScrollRectRecyclerView)localObject).getMeasuredHeight());
      ((RecyclerView)localObject).a(j, paramInt, null);
      AppMethodBeat.o(63053);
      return;
    }
  }

  public final void NJ(int paramInt)
  {
    AppMethodBeat.i(63057);
    if (paramInt > 0)
    {
      ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "tab size changed ,so adjusting tab site.");
      com.tencent.mm.view.f.a locala = this.Aaj;
      String str = locala.Aeq;
      if (locala.AeE == null)
        break label96;
      paramInt = 0;
      if (paramInt >= locala.AeE.size())
        break label96;
      com.tencent.mm.view.c.a locala1 = (com.tencent.mm.view.c.a)locala.AeE.get(paramInt);
      if ((locala1 == null) || (!locala1.kWz.equals(str)))
        break label90;
    }
    while (true)
    {
      setTabSelected(paramInt);
      AppMethodBeat.o(63057);
      return;
      label90: paramInt++;
      break;
      label96: paramInt = 0;
    }
  }

  public final void QA(int paramInt)
  {
    try
    {
      AppMethodBeat.i(63056);
      Object localObject1;
      if (x.gu(this.Aaj.Gn))
        if (!this.Aaj.AeC)
        {
          localObject1 = this.Aaj;
          ((com.tencent.mm.view.f.a)localObject1).AeC = true;
          ((com.tencent.mm.view.f.a)localObject1).AeD = false;
        }
      while (true)
      {
        ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "catch Size & start deal");
        if (paramInt > 0)
        {
          localObject1 = this.mView;
          a.4 local4 = new com/tencent/mm/view/e/a$4;
          local4.<init>(this);
          ((View)localObject1).post(local4);
        }
        AppMethodBeat.o(63056);
        return;
        if (!this.Aaj.AeD)
        {
          localObject1 = this.Aaj;
          ((com.tencent.mm.view.f.a)localObject1).AeD = true;
          ((com.tencent.mm.view.f.a)localObject1).AeC = false;
        }
      }
    }
    finally
    {
    }
  }

  public final void Qz(int paramInt)
  {
    AppMethodBeat.i(63048);
    if (this.Adt != null)
    {
      int i = this.Adt.getCurrentItem();
      paramInt = this.Aaj.QI(i).jis + paramInt;
      if (paramInt != i)
      {
        Math.abs(paramInt - i);
        this.Adt.setCurrentItem(paramInt);
      }
      this.AdF = paramInt;
    }
    AppMethodBeat.o(63048);
  }

  public final void aRF()
  {
    AppMethodBeat.i(63037);
    com.tencent.mm.view.c.a locala1 = this.Aaj.dNr();
    com.tencent.mm.view.c.a locala2 = locala1;
    if (locala1 == null)
    {
      this.Aaj.setShowProductId("TAG_DEFAULT_TAB");
      locala2 = this.Aaj.dNr();
    }
    dNf();
    int i;
    if ((locala2 != null) && (this.Adt != null))
    {
      i = this.Aaj.Aer;
      int j;
      if (i >= 0)
      {
        j = i;
        if (i <= locala2.dMX() - 1);
      }
      else
      {
        j = locala2.dMX() - 1;
      }
      i = j;
      if (this.AdJ)
      {
        i = j + 1;
        this.AdJ = false;
      }
      if (this.Aaj.Aes)
        i = 0;
      this.AdF = (locala2.jis + i);
      this.Adt.setCurrentItem(this.AdF, false);
      if ((!this.Aaj.dNx()) || (!locala2.kWz.equals("TAG_DEFAULT_TAB")))
        break label206;
    }
    label206: for (boolean bool = true; ; bool = false)
    {
      if (!locala2.kWz.equals("TAG_STORE_TAB"))
      {
        ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "init set currentItem not default qq. ");
        g(locala2.dMX(), i, false, bool);
      }
      AppMethodBeat.o(63037);
      return;
    }
  }

  public final void dMY()
  {
    int i = 0;
    label163: label447: boolean bool;
    while (true)
    {
      long l1;
      long l2;
      Object localObject4;
      try
      {
        AppMethodBeat.i(63036);
        if ((this.mView == null) || (!this.Aaj.AeI))
        {
          ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "not view can't deal");
          AppMethodBeat.o(63036);
          return;
        }
        l1 = System.currentTimeMillis();
        this.Aaj.Aex = false;
        ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "initSmileyData");
        l2 = System.currentTimeMillis();
        com.tencent.mm.view.f.a locala = this.Aaj;
        if (locala.AeE == null)
          break label163;
        localObject3 = locala.AeE.iterator();
        if (!((Iterator)localObject3).hasNext())
          break label163;
        localObject4 = (com.tencent.mm.view.c.a)((Iterator)localObject3).next();
        if (localObject4 != null)
        {
          ab.v("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "removeAllGridViewListener listener: %s", new Object[] { ((com.tencent.mm.view.c.a)localObject4).kWz });
          continue;
        }
      }
      finally
      {
      }
      ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "removeAllGridViewListener already release: ..");
      continue;
      if (localObject1.AeE != null)
        localObject1.AeE.clear();
      Object localObject3 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().OD();
      com.tencent.mm.by.a.dmE();
      Object localObject2 = com.tencent.mm.by.a.xun;
      int j;
      int k;
      int m;
      int n;
      if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
      {
        j = com.tencent.mm.m.g.Nu().getInt("EmotionRecommandCount", 3);
        k = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().bjV();
        m = j - k;
        ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "recommend count :%d need recommend count:%d download count:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(k) });
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        if (!this.Aaj.Aet)
        {
          ((ArrayList)localObject2).add(com.tencent.mm.view.f.a.dNo());
          a(com.tencent.mm.view.f.a.dNo(), true);
        }
        if (this.Aaj.Aes)
          break label661;
        ((ArrayList)localObject2).add(com.tencent.mm.view.f.a.dNp());
        a(com.tencent.mm.view.f.a.dNp(), true);
        if ((this.Aaj.Aeu) && ((com.tencent.mm.view.f.a.QL(this.Aaj.gOW)) || (com.tencent.mm.emoji.a.a.OB().bZ(false).size() > 0)))
        {
          localObject4 = new com/tencent/mm/storage/emotion/EmojiGroupInfo;
          ((EmojiGroupInfo)localObject4).<init>();
          ((EmojiGroupInfo)localObject4).field_productID = "capture";
          ((ArrayList)localObject2).add(localObject4);
          a((EmojiGroupInfo)localObject4, true);
        }
        if (this.Aaj.gOW != ChatFooterPanel.vhi)
          break label580;
        n = 1;
        if (localObject3 == null)
          break label661;
        localObject4 = ((ArrayList)localObject3).iterator();
      }
      while (true)
      {
        if (!((Iterator)localObject4).hasNext())
          break label661;
        localObject3 = (EmojiGroupInfo)((Iterator)localObject4).next();
        k = i;
        if (localObject3 != null)
        {
          k = i;
          if (!bo.isNullOrNil(((EmojiGroupInfo)localObject3).field_productID))
          {
            bool = com.tencent.mm.view.f.a.e((EmojiGroupInfo)localObject3);
            if (((EmojiGroupInfo)localObject3).field_recommand == 1)
            {
              if ((i >= m) || (i >= j))
                continue;
              i++;
              if (!bool)
              {
                k = i;
                if (n == 0)
                  break label655;
              }
              a((EmojiGroupInfo)localObject3, bool);
              ((ArrayList)localObject2).add(localObject3);
              continue;
              j = ((a.c)localObject2).getInt("EmotionRecommandCount", 3);
              break;
              label580: n = 0;
              break label447;
            }
            k = i;
            if (!((EmojiGroupInfo)localObject3).field_productID.equalsIgnoreCase(String.valueOf(EmojiGroupInfo.yad)))
            {
              k = i;
              if (!((EmojiGroupInfo)localObject3).field_productID.equalsIgnoreCase("TAG_DEFAULT_TAB"))
                if (!bool)
                {
                  k = i;
                  if (n == 0);
                }
                else
                {
                  a((EmojiGroupInfo)localObject3, bool);
                  ((ArrayList)localObject2).add(localObject3);
                  k = i;
                }
            }
          }
        }
        label655: i = k;
      }
      label661: localObject3 = this.Adx;
      ((com.tencent.mm.view.a.j)localObject3).mData.clear();
      ((com.tencent.mm.view.a.j)localObject3).mData.addAll((Collection)localObject2);
      ((RecyclerView.a)localObject3).aop.notifyChanged();
      ab.i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "update %s, %s", new Object[] { Integer.valueOf(((com.tencent.mm.view.a.j)localObject3).mData.size()), Integer.valueOf(((ArrayList)localObject2).size()) });
      dNb();
      this.Aaj.dNt();
      localObject2 = this.Aaj.atl(String.valueOf(EmojiGroupInfo.yad));
      if (localObject2 != null)
        com.tencent.mm.emoji.c.a.OZ().ezn = ((com.tencent.mm.view.c.a)localObject2).aRz();
      ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "end initTabsGroup use time :%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "- deal View");
      if (this.Adt != null)
        break;
      ab.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "initPanelVP failed");
      aRF();
      this.Aaj.Aex = true;
      this.Aaj.Aez = true;
      if (!this.Aaj.zRn)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(406L, 6L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(406L, 8L, System.currentTimeMillis() - l1, false);
      }
      AppMethodBeat.o(63036);
    }
    if (this.Adu == null)
    {
      dNa();
      this.Aaj.dNr();
      this.Adt.setAdapter(this.Adu);
      this.Adt.setOffscreenPageLimit(1);
    }
    while (true)
    {
      this.AdK = com.tencent.mm.compatible.util.j.gu(this.Gn);
      break;
      bool = com.tencent.mm.compatible.util.j.gu(this.Gn);
      if (bool != this.AdK)
      {
        ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "orientation changed ".concat(String.valueOf(bool)));
        dNa();
        this.Adt.setAdapter(this.Adu);
      }
      this.Adu.Abw = true;
      this.Adu.refreshData();
      this.Adu.notifyDataSetChanged();
      this.Adu.Abw = false;
    }
  }

  public final void dMZ()
  {
    AppMethodBeat.i(63039);
    if (this.Adu != null)
    {
      ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "clearViewPagerCache");
      this.Adu.mCount = 0;
    }
    AppMethodBeat.o(63039);
  }

  public final void dNb()
  {
    AppMethodBeat.i(63042);
    if (this.Adz == null)
    {
      AppMethodBeat.o(63042);
      return;
    }
    if ((com.tencent.mm.view.f.a.dNj()) && (!this.Aaj.Aeq.equalsIgnoreCase("TAG_STORE_TAB")))
      this.AdA.setVisibility(0);
    while (true)
    {
      this.Adz.setContentDescription(this.Gn.getString(2131299199));
      AppMethodBeat.o(63042);
      break;
      this.AdA.setVisibility(8);
    }
  }

  public final ChatFooterPanel.a dNe()
  {
    AppMethodBeat.i(63049);
    ChatFooterPanel.a locala;
    if (this.AdE == null)
    {
      locala = null;
      AppMethodBeat.o(63049);
    }
    while (true)
    {
      return locala;
      locala = this.AdE.getTextOpListener();
      AppMethodBeat.o(63049);
    }
  }

  public final void dNg()
  {
    AppMethodBeat.i(63058);
    this.AdH = false;
    this.mHandler.removeMessages(1102);
    this.mHandler.sendEmptyMessageDelayed(1102, 100L);
    AppMethodBeat.o(63058);
  }

  public final View findViewById(int paramInt)
  {
    AppMethodBeat.i(63045);
    View localView = this.mView.findViewById(paramInt);
    AppMethodBeat.o(63045);
    return localView;
  }

  public final com.tencent.mm.pluginsdk.ui.chat.j getSmileyPanelCallback()
  {
    AppMethodBeat.i(63050);
    com.tencent.mm.pluginsdk.ui.chat.j localj;
    if (this.AdE == null)
    {
      localj = null;
      AppMethodBeat.o(63050);
    }
    while (true)
    {
      return localj;
      localj = this.AdE.getSmileyPanelCallback();
      AppMethodBeat.o(63050);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(63043);
    if (paramView == this.Adz)
    {
      paramView = new Intent();
      paramView.putExtra("preceding_scence", 13);
      paramView.putExtra("download_entrance_scene", 17);
      paramView.putExtra("check_clickflag", false);
      if (com.tencent.mm.view.f.a.dNi())
      {
        ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "called emoji store must refresh by net");
        paramView.putExtra("emoji_stroe_must_refresh_by_net", true);
      }
      if (!bo.isNullOrNil(this.Aaj.vmL))
        paramView.putExtra("to_talker_name", this.Aaj.vmL);
      com.tencent.mm.bp.d.b(this.Gn, "emoji", ".ui.v2.EmojiStoreV2UI", paramView);
      com.tencent.mm.plugin.report.service.h.pYm.e(11594, new Object[] { Integer.valueOf(2) });
      com.tencent.mm.plugin.report.service.h.pYm.e(12065, new Object[] { Integer.valueOf(8) });
      AppMethodBeat.o(63043);
    }
    while (true)
    {
      return;
      if (paramView == this.AdC)
      {
        if ((this.AdE != null) && (this.AdE.getTextOpListener() != null))
          this.AdE.getTextOpListener().aYY();
        AppMethodBeat.o(63043);
      }
      else
      {
        if ((paramView == this.AdB) && (this.AdE.getSmileyPanelCallback() != null))
          this.AdE.getSmileyPanelCallback().bOg();
        if (paramView == this.AdD)
          dNc();
        AppMethodBeat.o(63043);
      }
    }
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    AppMethodBeat.i(63051);
    SmileyPanelScrollView localSmileyPanelScrollView;
    if (this.Adv != null)
    {
      localSmileyPanelScrollView = this.Adv;
      localSmileyPanelScrollView.AaI = paramInt;
      if (paramInt != 0)
        break label91;
      localSmileyPanelScrollView.AaE = localSmileyPanelScrollView.Aar;
      localSmileyPanelScrollView.AaD = localSmileyPanelScrollView.Aar;
      localSmileyPanelScrollView.AaF = 0.0F;
      localSmileyPanelScrollView.invalidate();
      if (localSmileyPanelScrollView.AaG)
        localSmileyPanelScrollView.AaG = false;
    }
    while (true)
    {
      if ((paramInt == 0) || (paramInt == 1))
        this.AdF = this.Adt.getCurrentItem();
      AppMethodBeat.o(63051);
      return;
      label91: if (paramInt == 1)
      {
        localSmileyPanelScrollView.AaE = localSmileyPanelScrollView.Aar;
        localSmileyPanelScrollView.AaD = localSmileyPanelScrollView.Aar;
        localSmileyPanelScrollView.AaF = 0.0F;
      }
    }
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(63052);
    Object localObject1;
    if (this.Adu != null)
    {
      localObject1 = this.Adu;
      if (((i)localObject1).Abz != null)
      {
        localObject1 = ((i)localObject1).Abz;
        float f = paramInt1 + paramFloat;
        ((f)localObject1).Abr = Math.round(f);
        ((f)localObject1).bv(f);
      }
    }
    if ((this.Adv != null) && (paramFloat != 0.0F))
      if (paramFloat > 0.0F)
      {
        paramInt2 = 1;
        Object localObject2 = this.Aaj.QI(paramInt2 + paramInt1);
        localObject1 = this.Aaj.QI(paramInt1);
        if (localObject2 != localObject1)
          break label164;
        localObject2 = this.Adv;
        paramInt1 -= ((com.tencent.mm.view.c.a)localObject1).jis;
        ((SmileyPanelScrollView)localObject2).AaF = paramFloat;
        if (((SmileyPanelScrollView)localObject2).AaE != paramInt1)
          ((SmileyPanelScrollView)localObject2).AaE = paramInt1;
        ((SmileyPanelScrollView)localObject2).invalidate();
        this.AdG = true;
        AppMethodBeat.o(63052);
      }
    while (true)
    {
      return;
      paramInt2 = -1;
      break;
      label164: this.AdG = false;
      AppMethodBeat.o(63052);
    }
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(63054);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "cpan onPageSelected :%d", new Object[] { Integer.valueOf(paramInt) });
    f localf;
    if (this.Adu != null)
    {
      localObject = this.Adu;
      ((i)localObject).Abx = paramInt;
      if (((i)localObject).Abz != null)
      {
        localf = ((i)localObject).Abz;
        localf.Abr = paramInt;
        if (paramInt != 0)
          break label107;
        localf.bv(0.0F);
      }
      if ((paramInt != 0) && (((i)localObject).Aby))
      {
        ((i)localObject).aJ(((i)localObject).Abx, false);
        ((i)localObject).Aby = false;
      }
    }
    if (this.Aaj == null)
      AppMethodBeat.o(63054);
    while (true)
    {
      return;
      label107: localf.bv(1.0F);
      break;
      if (this.Aaj.AeI)
        break label134;
      AppMethodBeat.o(63054);
    }
    label134: Object localObject = this.Aaj.QI(paramInt);
    label253: int i;
    boolean bool1;
    label287: int j;
    int k;
    if (((com.tencent.mm.view.c.a)localObject).kWz.equals("TAG_STORE_TAB"))
    {
      this.Adz.setSelected(true);
      ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "show TAB: viewId: %d, tabProductId: %s", new Object[] { Integer.valueOf(this.Adz.getId()), "TAG_STORE_TAB" });
      this.Aaj.setShowProductId("TAG_STORE_TAB");
      com.tencent.mm.plugin.report.service.h.pYm.e(11594, new Object[] { Integer.valueOf(5) });
      com.tencent.mm.x.c.PK().bZ(262147, 266244);
      com.tencent.mm.x.c.PK().bZ(262149, 266244);
      dNb();
      i = paramInt - ((com.tencent.mm.view.c.a)localObject).jis;
      if ((!this.Aaj.dNx()) || (!((com.tencent.mm.view.c.a)localObject).kWz.equals("TAG_DEFAULT_TAB")))
        break label583;
      bool1 = true;
      j = ((com.tencent.mm.view.c.a)localObject).dMX();
      k = ((com.tencent.mm.view.c.a)localObject).jis;
      if (this.AdG)
        break label589;
    }
    label583: label589: for (boolean bool2 = true; ; bool2 = false)
    {
      g(j, paramInt - k, bool2, bool1);
      this.Aaj.Aer = i;
      this.Aaj.setShowProductId(((com.tencent.mm.view.c.a)localObject).kWz);
      ((com.tencent.mm.view.c.a)localObject).Adn = i;
      this.Aaj.eI(((com.tencent.mm.view.c.a)localObject).kWz, ((com.tencent.mm.view.c.a)localObject).Adn);
      paramInt = this.Aaj.QJ(paramInt);
      com.tencent.mm.emoji.c.a.OZ().ezl = paramInt;
      com.tencent.mm.emoji.c.a.OZ().ezm = i;
      setTabSelected(paramInt);
      dNf();
      if ((com.tencent.mm.view.f.a.QL(this.Aaj.gOW)) && (((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().OT()) && (i == 0) && (((com.tencent.mm.view.c.a)localObject).kWz.equals("capture")))
      {
        com.tencent.mm.cj.c.aNX();
        com.tencent.mm.plugin.report.service.h.pYm.e(15982, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      }
      if ((this.Aaj.gOW == ChatFooterPanel.vhi) && (((com.tencent.mm.view.c.a)localObject).kWz.equals(String.valueOf(EmojiGroupInfo.yad))) && (!b.afY().fAO))
      {
        ab.i("MicroMsg.FontResLogic", "check res early");
        com.tencent.mm.plugin.report.service.h.pYm.k(933L, 11L, 1L);
        b.aga();
      }
      AppMethodBeat.o(63054);
      break;
      this.Adz.setSelected(false);
      break label253;
      bool1 = false;
      break label287;
    }
  }

  public final void rk(boolean paramBoolean)
  {
    AppMethodBeat.i(63046);
    if (this.AdC == null)
      AppMethodBeat.o(63046);
    while (true)
    {
      return;
      if (this.AdC.getVisibility() == 0)
      {
        if (paramBoolean)
        {
          TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, this.AdC.getWidth(), 0.0F, 0.0F);
          localTranslateAnimation.setDuration(250L);
          this.AdC.startAnimation(localTranslateAnimation);
        }
        this.AdC.setVisibility(8);
      }
      AppMethodBeat.o(63046);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.e.a
 * JD-Core Version:    0.6.2
 */