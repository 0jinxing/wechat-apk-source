package com.tencent.mm.plugin.sns.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.av;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.story.api.k.b;
import com.tencent.mm.plugin.story.api.k.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.cfc;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.StoryAvatarDotsView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class SnsStoryHeaderView extends FrameLayout
  implements k.b
{
  public boolean cAY;
  private boolean cNN;
  private String cvF;
  private List<String> fxt;
  private View jOT;
  private String qSf;
  private int rMi;
  private int rMj;
  public boolean rMk;
  private TextView rMl;
  private StoryAvatarDotsView rMm;
  private TextView rMn;
  private TextView rMo;
  private int rMp;
  private int rMq;
  private String rMr;
  private int rMs;
  private SnsStoryHeaderView.a rMt;

  public SnsStoryHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SnsStoryHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(40423);
    this.rMj = 10000;
    this.fxt = new LinkedList();
    this.cvF = null;
    this.qSf = null;
    this.cAY = false;
    this.rMk = false;
    this.rMp = 0;
    this.rMq = 0;
    this.rMr = "";
    this.rMs = 0;
    this.cNN = true;
    paramInt = com.tencent.mm.kernel.g.RP().Ry().getInt(ac.a.xWR, 0);
    if (paramInt > 0);
    for (this.rMj = paramInt; ; this.rMj = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGh, 10000))
    {
      if (((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUserInfo().xeE == 1)
        this.rMj = 10001;
      ab.i("MicroMsg.SnsStoryHeaderView", "init: headerType %s configType %s", new Object[] { Integer.valueOf(this.rMj), Integer.valueOf(paramInt) });
      inflate(getContext(), 2130970802, this);
      this.jOT = findViewById(2131827851);
      this.rMl = ((TextView)findViewById(2131827855));
      this.rMm = ((StoryAvatarDotsView)findViewById(2131827854));
      this.rMn = ((TextView)findViewById(2131827853));
      this.rMo = ((TextView)findViewById(2131827856));
      this.jOT.setOnClickListener(new SnsStoryHeaderView.1(this));
      AppMethodBeat.o(40423);
      return;
    }
  }

  private void cvq()
  {
    AppMethodBeat.i(40425);
    this.fxt.clear();
    if ((this.rMi != 1) || (this.rMj == 10000) || (this.rMj == 10001))
    {
      this.jOT.setVisibility(8);
      this.rMk = false;
      if (this.fxt.size() != 0)
        break label203;
      this.jOT.setVisibility(8);
      this.rMk = false;
      label82: if (!((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().cxa().isEmpty())
        break label225;
      this.rMo.setVisibility(8);
      AppMethodBeat.o(40425);
    }
    while (true)
    {
      return;
      if (this.rMj == 2)
      {
        cvs();
        ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().a(this);
        break;
      }
      h.pYm.k(1006L, 0L, 1L);
      h.pYm.k(1015L, 0L, 1L);
      cvr();
      ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().a(this);
      break;
      label203: this.jOT.setVisibility(0);
      if (this.cAY)
        break label82;
      cvt();
      break label82;
      label225: this.rMo.setVisibility(0);
      this.rMo.setText(String.valueOf(((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().cxb()));
      AppMethodBeat.o(40425);
    }
  }

  private void cvr()
  {
    AppMethodBeat.i(40426);
    List localList1 = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().cwY();
    List localList2 = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().cwZ();
    int i;
    if (localList1.size() > 0)
    {
      i = localList1.size();
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().cxa().keySet());
      this.rMq = i;
      this.fxt.addAll(localList1);
      this.fxt.addAll(localList2);
      this.fxt.addAll(localArrayList);
      this.rMl.setText(getResources().getString(2131303779));
      dA(localList1);
      this.rMn.setTextColor(getContext().getResources().getColor(2131689483));
      int j = com.tencent.mm.m.g.Nu().getInt("StoryEntranceShouldShowInTimelineOfUnreadCount", 3);
      ab.i("MicroMsg.SnsStoryHeaderView", "initTypeNew %s", new Object[] { Integer.valueOf(j) });
      if (localList1.size() <= 0)
        break label323;
      h.pYm.k(1015L, 1L, 1L);
      label231: if (this.fxt.size() == 0)
        h.pYm.k(1015L, 3L, 1L);
      if (i <= j)
        break label339;
      j = BackwardSupportUtil.b.b(getContext(), 4.0F);
      this.rMn.setPadding(j, 0, j, 0);
      this.rMn.setText(String.format("%s", new Object[] { Integer.valueOf(i) }));
      AppMethodBeat.o(40426);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label323: h.pYm.k(1015L, 2L, 1L);
      break label231;
      label339: this.rMn.setPadding(0, 0, 0, 0);
      this.rMn.setText("");
      AppMethodBeat.o(40426);
    }
  }

  private void cvs()
  {
    AppMethodBeat.i(40427);
    List localList1 = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().cwY();
    List localList2 = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().cxc();
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().cxa().keySet());
    this.fxt.addAll(localList1);
    this.fxt.addAll(localList2);
    this.fxt.addAll(localArrayList);
    this.rMl.setText(getResources().getString(2131303777));
    dA(localList1);
    AppMethodBeat.o(40427);
  }

  private void cvu()
  {
    AppMethodBeat.i(40430);
    ab.i("MicroMsg.SnsStoryHeaderView", "reportExpose: ");
    if (this.fxt.size() <= 0)
      AppMethodBeat.o(40430);
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      if (this.rMp > 0)
        localStringBuilder.append((String)this.fxt.get(0));
      for (int i = 1; i < this.rMp; i++)
        localStringBuilder.append("|").append((String)this.fxt.get(i));
      av localav = new av();
      localav.fH(this.qSf);
      this.rMr = "99_".concat(String.valueOf(System.currentTimeMillis()));
      localav.fI(this.rMr);
      localav.dam = this.rMp;
      localav.fJ(localStringBuilder.toString());
      localav.dao = this.rMq;
      localav.ajK();
      this.rMs += 1;
      AppMethodBeat.o(40430);
    }
  }

  private void dA(List<String> paramList)
  {
    AppMethodBeat.i(40428);
    this.rMm.setIconSize(com.tencent.mm.bz.a.fromDPToPix(getContext(), 26));
    this.rMm.setIconGap(com.tencent.mm.bz.a.fromDPToPix(getContext(), 16));
    this.rMp = 0;
    if (paramList.size() > 0)
    {
      this.rMm.setVisibility(0);
      this.rMm.setIconLayerCount(Math.min(paramList.size(), 3));
      this.rMp = this.rMm.getChildCount();
      for (int i = 0; i < this.rMm.getChildCount(); i++)
      {
        a.b.a(this.rMm.qf(i), (String)paramList.get(i), 0.5F, false);
        this.rMm.qf(i).setBackground(getResources().getDrawable(2130840299));
        this.rMm.qf(i).setPadding(com.tencent.mm.bz.a.fromDPToPix(getContext(), 1), com.tencent.mm.bz.a.fromDPToPix(getContext(), 1), com.tencent.mm.bz.a.fromDPToPix(getContext(), 1), com.tencent.mm.bz.a.fromDPToPix(getContext(), 1));
      }
      AppMethodBeat.o(40428);
    }
    while (true)
    {
      return;
      this.rMm.setVisibility(8);
      AppMethodBeat.o(40428);
    }
  }

  public final void cvt()
  {
    AppMethodBeat.i(40429);
    if (!this.cNN)
    {
      this.jOT.setVisibility(8);
      AppMethodBeat.o(40429);
      return;
    }
    if (this.jOT.getVisibility() == 0)
    {
      int[] arrayOfInt = new int[2];
      this.jOT.getLocationOnScreen(arrayOfInt);
      if (arrayOfInt[1] <= 0)
        break label104;
      if (!this.rMk)
      {
        this.rMk = true;
        cvu();
      }
    }
    while (true)
    {
      ab.i("MicroMsg.SnsStoryHeaderView", "checkExpose: %s", new Object[] { Boolean.valueOf(this.rMk) });
      AppMethodBeat.o(40429);
      break;
      label104: this.rMk = false;
    }
  }

  public final void cvv()
  {
    AppMethodBeat.i(40431);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(40422);
        SnsStoryHeaderView.d(SnsStoryHeaderView.this);
        if (SnsStoryHeaderView.e(SnsStoryHeaderView.this).size() > 0)
          ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).preloadForSnsUser((String)SnsStoryHeaderView.e(SnsStoryHeaderView.this).get(0), false);
        AppMethodBeat.o(40422);
      }
    });
    AppMethodBeat.o(40431);
  }

  public void setEnterObjectId(String paramString)
  {
    this.qSf = paramString;
  }

  public void setSessionId(String paramString)
  {
    this.cvF = paramString;
  }

  public void setSnsType(int paramInt)
  {
    AppMethodBeat.i(40424);
    this.rMi = paramInt;
    cvq();
    if (this.fxt.size() > 0)
      ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).preloadForSnsUser((String)this.fxt.get(0), true);
    AppMethodBeat.o(40424);
  }

  public void setStoryAction(SnsStoryHeaderView.a parama)
  {
    this.rMt = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView
 * JD-Core Version:    0.6.2
 */