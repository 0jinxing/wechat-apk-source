package com.tencent.mm.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.SmileyPanel;
import com.tencent.mm.by.a.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.view.a.i;
import com.tencent.mm.view.e.a.3;
import com.tencent.mm.view.e.a.5;
import com.tencent.mm.view.e.a.a;
import com.tencent.mm.view.f.a.1;
import java.util.ArrayList;
import java.util.Iterator;

public final class c extends SmileyPanel
  implements a.a
{
  private com.tencent.mm.view.e.a Aai;
  private com.tencent.mm.view.f.a Aaj;
  private final String TAG;
  private boolean jgc;

  public c(Context paramContext, boolean paramBoolean)
  {
    this(paramContext, paramBoolean, (byte)0);
  }

  private c(Context paramContext, boolean paramBoolean, byte paramByte)
  {
  }

  public final void AC()
  {
    this.vhf = null;
  }

  public final void AD()
  {
    AppMethodBeat.i(62931);
    ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideCustomBtn, %s", new Object[] { bo.dpG() });
    this.Aaj.Aes = true;
    AppMethodBeat.o(62931);
  }

  public final void AE()
  {
    AppMethodBeat.i(62932);
    ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "[hideDefaultBtn]");
    this.Aaj.Aet = true;
    AppMethodBeat.o(62932);
  }

  public final void AF()
  {
    AppMethodBeat.i(62940);
    Object localObject;
    if (this.Aai != null)
    {
      localObject = this.Aai;
      if ((((com.tencent.mm.view.e.a)localObject).Adt != null) && (((com.tencent.mm.view.e.a)localObject).Aaj != null))
        break label57;
    }
    while (true)
    {
      if (this.Aaj != null)
      {
        com.tencent.mm.by.a.dmE();
        localObject = com.tencent.mm.by.a.xum;
        a.b.alW("TAG_DEFAULT_TAB");
      }
      AppMethodBeat.o(62940);
      return;
      label57: if (!((com.tencent.mm.view.e.a)localObject).AdH)
      {
        ((com.tencent.mm.view.e.a)localObject).AdI = "TAG_DEFAULT_TAB";
      }
      else
      {
        ((com.tencent.mm.view.e.a)localObject).AdI = null;
        ((com.tencent.mm.view.e.a)localObject).Adt.post(new a.5((com.tencent.mm.view.e.a)localObject, "TAG_DEFAULT_TAB"));
      }
    }
  }

  public final void AG()
  {
    this.Aaj.AeA = true;
  }

  public final void bf(boolean paramBoolean)
  {
    AppMethodBeat.i(62934);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideSendButton:B", new Object[] { Boolean.valueOf(paramBoolean) });
    this.Aai.rk(paramBoolean);
    this.Aaj.Aey = true;
    AppMethodBeat.o(62934);
  }

  public final void destroy()
  {
    AppMethodBeat.i(62927);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onDestroy");
    this.vhf = null;
    Object localObject;
    if (this.Aai != null)
    {
      ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "ui clear");
      localObject = this.Aai;
      ((com.tencent.mm.view.e.a)localObject).dMZ();
      ((com.tencent.mm.view.e.a)localObject).jiq = null;
      if (((com.tencent.mm.view.e.a)localObject).Adt != null)
        ((com.tencent.mm.view.e.a)localObject).Adt.setAdapter(null);
      ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager destroy remove listener.");
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().i(((com.tencent.mm.view.e.a)localObject).AdM);
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().g(((com.tencent.mm.view.e.a)localObject).xYF);
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().k(((com.tencent.mm.view.e.a)localObject).AdO);
      com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.view.e.a)localObject).xYG);
      com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.view.e.a)localObject).AdN);
      this.Aai = null;
    }
    if (this.Aaj != null)
    {
      ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "stg clear");
      if (this.Aaj.zRn)
        this.Aaj.onPause();
      localObject = this.Aaj;
      Iterator localIterator = ((com.tencent.mm.view.f.a)localObject).AeE.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.view.c.a locala = (com.tencent.mm.view.c.a)localIterator.next();
        if (locala != null)
        {
          locala.Aaj = null;
          locala.Adi = null;
        }
      }
      ((com.tencent.mm.view.f.a)localObject).dNu();
    }
    ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().onDestroy();
    AppMethodBeat.o(62927);
  }

  public final int getBottomHeightPx()
  {
    return this.Aaj.Aei;
  }

  public final com.tencent.mm.pluginsdk.ui.chat.j getSmileyPanelCallback()
  {
    return (com.tencent.mm.pluginsdk.ui.chat.j)this.vhg;
  }

  public final ChatFooterPanel.a getTextOpListener()
  {
    return this.vhf;
  }

  public final void j(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(62933);
    ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideSmiley: %B, hideEmojiSmiley: %B", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    this.Aaj.Aev = paramBoolean1;
    this.Aaj.Aew = paramBoolean2;
    AppMethodBeat.o(62933);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62939);
    if (this.jgc)
    {
      setVisibility(8);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(62939);
  }

  public final void onPause()
  {
    AppMethodBeat.i(62926);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onPause");
    this.Aaj.onPause();
    AppMethodBeat.o(62926);
  }

  public final void onResume()
  {
    AppMethodBeat.i(62924);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onResume");
    Object localObject = this.Aaj;
    ((com.tencent.mm.view.f.a)localObject).zRn = true;
    ((com.tencent.mm.view.f.a)localObject).dNv();
    ((com.tencent.mm.view.f.a)localObject).dNm();
    localObject = this.Aai;
    if ((((com.tencent.mm.view.e.a)localObject).Adu != null) && (((com.tencent.mm.view.e.a)localObject).Adt != null))
      ((com.tencent.mm.view.e.a)localObject).Adu.aJ(((com.tencent.mm.view.e.a)localObject).Adt.getCurrentItem(), true);
    ((com.tencent.mm.view.e.a)localObject).dNb();
    AppMethodBeat.o(62924);
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(62936);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(62936);
  }

  public final void refresh()
  {
    AppMethodBeat.i(62930);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "refresh");
    try
    {
      if (this.Aaj != null)
      {
        com.tencent.mm.view.e.a locala = this.Aai;
        if (locala != null);
      }
      else
      {
        AppMethodBeat.o(62930);
      }
      while (true)
      {
        return;
        this.Aai.dNg();
        AppMethodBeat.o(62930);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.emoji.SmileyPanel.SmileyPanel", localException, "", new Object[0]);
        AppMethodBeat.o(62930);
      }
    }
  }

  public final void setCallback(com.tencent.mm.pluginsdk.ui.chat.f paramf)
  {
    AppMethodBeat.i(62928);
    super.setCallback(paramf);
    AppMethodBeat.o(62928);
  }

  public final void setDefaultEmojiByDetail(String paramString)
  {
    AppMethodBeat.i(62938);
    com.tencent.mm.view.f.a locala = this.Aaj;
    locala.setShowProductId(paramString);
    locala.dNl();
    if (locala.AeH == null)
      locala.AeH = new a.1(locala);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "add succeed send listener");
    com.tencent.mm.sdk.b.a.xxA.c(locala.AeH);
    AppMethodBeat.o(62938);
  }

  public final void setEntranceScene(int paramInt)
  {
    AppMethodBeat.i(62941);
    com.tencent.mm.emoji.c.a.OZ().scene = paramInt;
    if (this.Aaj != null)
      this.Aaj.gOW = paramInt;
    AppMethodBeat.o(62941);
  }

  public final void setHide(boolean paramBoolean)
  {
    this.jgc = paramBoolean;
  }

  public final void setPortHeightPx(int paramInt)
  {
    AppMethodBeat.i(62935);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "setPortHeightPx: %d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.view.f.a locala = this.Aaj;
    if (locala.Aei != paramInt)
    {
      locala.AeD = false;
      locala.AeC = false;
    }
    locala.Aei = paramInt;
    this.Aaj.dNl();
    locala = this.Aaj;
    locala.QH(paramInt - locala.AdY);
    this.Aaj.jiM = 0;
    AppMethodBeat.o(62935);
  }

  public final void setSendButtonEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(62929);
    com.tencent.mm.view.e.a locala = this.Aai;
    if (locala.AdC != null)
      locala.AdC.setEnabled(paramBoolean);
    AppMethodBeat.o(62929);
  }

  public final void setShowProductId(String paramString)
  {
    AppMethodBeat.i(62925);
    this.Aaj.setShowProductId(paramString);
    AppMethodBeat.o(62925);
  }

  public final void setTalkerName(String paramString)
  {
    this.Aaj.vmL = paramString;
  }

  public final void setVisibility(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(62937);
    super.setVisibility(paramInt);
    com.tencent.mm.view.e.a locala;
    Object localObject;
    if (paramInt == 0)
    {
      this.jgc = false;
      if (this.Aai != null)
      {
        locala = this.Aai;
        ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "initView begin");
        localObject = com.tencent.mm.emoji.c.a.OZ();
        ((com.tencent.mm.emoji.c.a)localObject).ezk = System.currentTimeMillis();
        ((com.tencent.mm.emoji.c.a)localObject).clickCount = 0;
        if ((locala.mView != null) && (getChildCount() > 0))
        {
          ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "already load view --- pass");
          if ((locala.Adu != null) && (locala.Adt != null))
          {
            locala.Adu.aJ(locala.Adt.getCurrentItem(), true);
            localObject = locala.Aaj.atl("capture");
            if ((localObject != null) && (((com.tencent.mm.view.c.a)localObject).jis == locala.Adt.getCurrentItem()) && (com.tencent.mm.view.f.a.QL(locala.Aaj.gOW)) && (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().OT()))
            {
              h.pYm.e(15982, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
              com.tencent.mm.cj.c.aNX();
            }
          }
          locala.aRF();
          AppMethodBeat.o(62937);
        }
      }
    }
    while (true)
    {
      return;
      if (locala.Aaj == null)
      {
        ab.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "mPanelStg is null");
        AppMethodBeat.o(62937);
      }
      else
      {
        locala.Aaj.AeI = false;
        if (locala.mView == null)
        {
          locala.mView = LayoutInflater.from(getContext()).inflate(2130970705, null);
          label297: locala.Adt = ((SmileyPanelViewPager)locala.findViewById(2131821506));
          locala.Adt.setPanelStg(locala.Aaj);
          locala.Adt.setSmileyPanelViewPagerLayoutListener(locala);
          locala.Adt.setOnPageChangeListener(locala);
          locala.Adt.setOffscreenPageLimit(3);
          locala.Aaj.jiM = locala.Adt.getWidth();
          locala.Adv = ((SmileyPanelScrollView)locala.findViewById(2131821505));
          locala.Adv.setOnPageSelectListener(locala);
          locala.Adv.setSmileyPanelStg(locala.Aaj);
          locala.Adw = ((ScrollRectRecyclerView)locala.findViewById(2131827588));
          locala.Adx = new com.tencent.mm.view.a.j(locala.jiq, locala.Aaj);
          locala.Adx.AbO = locala.AdP;
          locala.Adw.setLayoutManager(new LinearLayoutManager(0));
          locala.Adw.setAdapter(locala.Adx);
          locala.Adw.setItemAnimator(null);
          locala.AdC = ((TextView)locala.findViewById(2131826268));
          locala.Adz = ((ImageView)locala.findViewById(2131827591));
          locala.Adz.setOnClickListener(locala);
          locala.Ady = locala.findViewById(2131827587);
          locala.AdA = ((ImageView)locala.findViewById(2131827592));
          locala.AdC.setOnClickListener(locala);
          localObject = locala.AdC;
          if (!locala.Aaj.dNq())
            break label895;
          paramInt = 0;
          label558: ((TextView)localObject).setVisibility(paramInt);
          addView(locala.mView, new LinearLayout.LayoutParams(-1, -1));
          locala.Aaj.AeI = true;
          localObject = locala.Ady;
          if ((!locala.Aaj.Aes) && (!locala.Aaj.Aet))
            break label901;
          paramInt = 8;
          label618: ((View)localObject).setVisibility(paramInt);
          locala.AdB = ((ImageButton)locala.findViewById(2131827590));
          locala.AdB.setOnClickListener(locala);
          localObject = locala.AdB;
          if (!locala.Aaj.Aet)
            break label911;
          com.tencent.mm.view.f.a locala1 = locala.Aaj;
          if ((locala1.gOW != ChatFooterPanel.vhk) && (locala1.gOW != ChatFooterPanel.vhl) && (locala1.gOW != ChatFooterPanel.vhn) && (locala1.gOW != ChatFooterPanel.vhp) && (locala1.gOW != ChatFooterPanel.vho) && (locala1.gOW != ChatFooterPanel.vhq) && (locala1.gOW != ChatFooterPanel.vhs) && (locala1.gOW != ChatFooterPanel.vhr))
            break label906;
          paramInt = 1;
          label758: if (paramInt == 0)
            break label911;
          paramInt = 0;
          label764: ((ImageButton)localObject).setVisibility(paramInt);
          locala.AdD = ((ImageView)locala.findViewById(2131827589));
          localObject = locala.AdD;
          if ((locala.Aaj.gOW != ChatFooterPanel.vhi) || (locala.Aaj.Aet))
            break label917;
        }
        label901: label906: label911: label917: for (paramInt = i; ; paramInt = 8)
        {
          ((ImageView)localObject).setVisibility(paramInt);
          locala.AdD.setOnClickListener(locala);
          if ((bp.dpL()) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED))
            locala.AdD.setOnLongClickListener(new a.3(locala));
          AppMethodBeat.o(62937);
          break;
          if (locala.mView.getParent() == null)
            break label297;
          ((ViewGroup)locala.mView.getParent()).removeView(locala.mView);
          break label297;
          label895: paramInt = 8;
          break label558;
          paramInt = 0;
          break label618;
          paramInt = 0;
          break label758;
          paramInt = 8;
          break label764;
        }
        ab.w("MicroMsg.emoji.SmileyPanel.SmileyPanel", "Smiley Panel Manager is null.");
        AppMethodBeat.o(62937);
        continue;
        if (this.Aaj != null)
        {
          this.Aaj.dNu();
          AppMethodBeat.o(62937);
        }
        else
        {
          ab.w("MicroMsg.emoji.SmileyPanel.SmileyPanel", "Smiley PanelStg Manager is null.");
          AppMethodBeat.o(62937);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.c
 * JD-Core Version:    0.6.2
 */