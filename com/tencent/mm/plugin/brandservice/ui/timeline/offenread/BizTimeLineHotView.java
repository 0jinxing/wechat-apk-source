package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.at;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.chc;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.v;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BizTimeLineHotView extends LinearLayout
  implements f, n.b
{
  private int iWJ;
  public e jQg;
  WeakReference<Activity> jQk;
  private BizTimeLineHotListView jQl;
  private boolean jQm;
  private List<b> jQn;
  private c jQo;
  private int jQp;
  public com.tencent.mm.sdk.b.c jQq;
  private boolean jQr;
  private MessageQueue.IdleHandler jQs;
  private TextView jao;

  public BizTimeLineHotView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(14314);
    this.iWJ = 0;
    this.jQm = false;
    this.jQn = new ArrayList();
    this.jQg = new e();
    this.jQp = 0;
    this.jQq = new BizTimeLineHotView.2(this);
    this.jQr = true;
    this.jQs = new BizTimeLineHotView.7(this);
    init(paramContext);
    AppMethodBeat.o(14314);
  }

  public BizTimeLineHotView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(14315);
    this.iWJ = 0;
    this.jQm = false;
    this.jQn = new ArrayList();
    this.jQg = new e();
    this.jQp = 0;
    this.jQq = new BizTimeLineHotView.2(this);
    this.jQr = true;
    this.jQs = new BizTimeLineHotView.7(this);
    init(paramContext);
    AppMethodBeat.o(14315);
  }

  private void FF(String paramString)
  {
    AppMethodBeat.i(14317);
    com.tencent.mm.plugin.brandservice.b.a("BrandServiceWorkerThread", new BizTimeLineHotView.1(this, paramString), 0L);
    AppMethodBeat.o(14317);
  }

  private void a(chc paramchc)
  {
    AppMethodBeat.i(14325);
    if (paramchc != null)
    {
      com.tencent.mm.plugin.brandservice.ui.b.a.gP(paramchc.xfZ * 1000);
      com.tencent.mm.plugin.brandservice.ui.b.a.gQ(paramchc.xfX);
    }
    if ((paramchc == null) || (bo.ek(paramchc.xfW)))
    {
      if (bo.ek(this.jQn))
        setVisibility(8);
      ab.i("MicroMsg.BizTimeLineHotList", "initOftenReadList size is null");
      AppMethodBeat.o(14325);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BizTimeLineHotList", "initOftenReadList size %d,server_rank:%d,display_ctrl_flag:%d", new Object[] { Integer.valueOf(paramchc.xfW.size()), Integer.valueOf(paramchc.xfY), Integer.valueOf(paramchc.xfX) });
      if (com.tencent.mm.plugin.brandservice.ui.b.a.sG(4))
      {
        setVisibility(8);
        AppMethodBeat.o(14325);
      }
      else
      {
        com.tencent.mm.plugin.brandservice.b.a("BrandServiceWorkerThread", new BizTimeLineHotView.4(this, paramchc), 0L);
        AppMethodBeat.o(14325);
      }
    }
  }

  public static boolean a(b paramb)
  {
    AppMethodBeat.i(14327);
    long l = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoP(paramb.vGE);
    Object localObject = com.tencent.mm.aj.z.aeX().mE(l);
    boolean bool;
    if (localObject == null)
    {
      AppMethodBeat.o(14327);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramb.jrh = ((q)localObject).field_createTime;
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XR().aoZ(paramb.vGE);
      bool = paramb.jQz;
      paramb.jQz = false;
      if ((localObject != null) && (((at)localObject).field_unReadCount > 0) && (System.currentTimeMillis() - paramb.jrh < com.tencent.mm.plugin.brandservice.ui.b.a.aYQ()))
      {
        int i = com.tencent.mm.aj.z.aeY().mN(l);
        if (((at)localObject).field_unReadCount > i)
          paramb.jQz = true;
      }
      if (bool != paramb.jQz)
      {
        AppMethodBeat.o(14327);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(14327);
        bool = false;
      }
    }
  }

  private void getLocalOftenReadData()
  {
    AppMethodBeat.i(14323);
    if (!bo.ek(this.jQn))
      AppMethodBeat.o(14323);
    while (true)
    {
      return;
      a(d.aWL());
      AppMethodBeat.o(14323);
    }
  }

  private void getOftenRead()
  {
    AppMethodBeat.i(14324);
    com.tencent.mm.plugin.brandservice.b.a("BrandServiceWorkerThread", new BizTimeLineHotView.3(this), 0L);
    AppMethodBeat.o(14324);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(14320);
    com.tencent.mm.kernel.g.Rg().a(2768, this);
    this.jQk = new WeakReference((Activity)paramContext);
    a.init(paramContext);
    this.iWJ = getItemPadding();
    View localView = v.hu(paramContext).inflate(2130968862, this);
    this.jQl = ((BizTimeLineHotListView)localView.findViewById(2131821819));
    this.jao = ((TextView)localView.findViewById(2131821817));
    this.jQo = new c(this.iWJ);
    this.jQl.b(this.jQo);
    this.jQl.a(paramContext, this.jQn, this.jQg);
    getLocalOftenReadData();
    getOftenRead();
    ((j)com.tencent.mm.kernel.g.K(j.class)).XR().a(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.jQq);
    AppMethodBeat.o(14320);
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(14318);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.e("MicroMsg.BizTimeLineHotList", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(14318);
    }
    while (true)
    {
      return;
      FF((String)paramObject);
      AppMethodBeat.o(14318);
    }
  }

  public final void aWJ()
  {
    AppMethodBeat.i(14328);
    if ((getVisibility() != 0) || (bo.ek(this.jQn)))
      AppMethodBeat.o(14328);
    while (true)
    {
      return;
      this.jQl.aWJ();
      AppMethodBeat.o(14328);
    }
  }

  public final void aWK()
  {
    AppMethodBeat.i(14326);
    if (bo.ek(this.jQn))
      AppMethodBeat.o(14326);
    while (true)
    {
      return;
      Iterator localIterator = this.jQn.iterator();
      while (localIterator.hasNext())
        a((b)localIterator.next());
      AppMethodBeat.o(14326);
    }
  }

  public final void d(q paramq)
  {
    AppMethodBeat.i(14316);
    if (paramq != null)
    {
      q localq = com.tencent.mm.aj.z.aeX().mE(paramq.field_talkerId);
      if ((localq != null) && (localq.field_msgId == paramq.field_msgId))
      {
        ((j)com.tencent.mm.kernel.g.K(j.class)).XR().apb(paramq.field_talker);
        FF(paramq.field_talker);
      }
    }
    AppMethodBeat.o(14316);
  }

  public int getItemPadding()
  {
    AppMethodBeat.i(14319);
    int i = a.dj(getContext());
    AppMethodBeat.o(14319);
    return i;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(14321);
    super.onConfigurationChanged(paramConfiguration);
    if (this.jQp != paramConfiguration.orientation)
    {
      if (this.jQo != null)
      {
        this.iWJ = getItemPadding();
        this.jQo.padding = this.iWJ;
      }
      this.jQp = paramConfiguration.orientation;
      Looper.myQueue().addIdleHandler(this.jQs);
    }
    AppMethodBeat.o(14321);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(14329);
    ab.i("MicroMsg.BizTimeLineHotList", "onSceneEnd, type %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
      AppMethodBeat.o(14329);
    while (true)
    {
      return;
      if ((paramm instanceof g))
      {
        paramString = (chc)((g)paramm).ehh.fsH.fsP;
        if ((this.jQk.get() != null) && (((Activity)this.jQk.get()).isFinishing()))
        {
          AppMethodBeat.o(14329);
          continue;
        }
        if (com.tencent.mm.plugin.brandservice.ui.b.c.b(paramString, d.aWL()))
        {
          ab.d("MicroMsg.BizTimeLineHotList", "onSceneEnd nothing change");
          AppMethodBeat.o(14329);
          continue;
        }
        d.jQA = paramString;
      }
      try
      {
        paramm = Base64.encodeToString(paramString.toByteArray(), 0);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVn, paramm);
        a(paramString);
        AppMethodBeat.o(14329);
      }
      catch (IOException paramm)
      {
        while (true)
        {
          ab.e("MicroMsg.BizTimeLineOftenReadHelper", "resetOftenRead exp: %s", new Object[] { paramm.getMessage() });
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVn, "");
        }
      }
    }
  }

  public void setTitlePaddingLeft(int paramInt)
  {
    AppMethodBeat.i(14322);
    if (this.jao != null)
    {
      TextView localTextView = this.jao;
      localTextView.setPadding(paramInt, localTextView.getPaddingTop(), this.jao.getPaddingRight(), this.jao.getPaddingBottom());
    }
    AppMethodBeat.o(14322);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView
 * JD-Core Version:    0.6.2
 */