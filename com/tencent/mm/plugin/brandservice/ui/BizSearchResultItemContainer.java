package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b.h;
import com.tencent.mm.plugin.brandservice.b.i;
import com.tencent.mm.protocal.protobuf.bvh;
import com.tencent.mm.protocal.protobuf.mh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.List;

public class BizSearchResultItemContainer extends LinearLayout
  implements f
{
  private int gOW;
  private int jKX;
  private ListView jLm;
  c jLn;
  private TextView jLo;
  BizSearchResultItemContainer.c jLp;
  private BizSearchResultItemContainer.a jLq;
  i jLr;
  private BizSearchResultItemContainer.b jLs;
  private long[] jLt;
  int jLu;
  private boolean jLv;
  private int jLw;

  public BizSearchResultItemContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(13902);
    this.gOW = 0;
    paramContext = View.inflate(getContext(), 2130970574, this);
    this.jLp = new BizSearchResultItemContainer.c((byte)0);
    this.jLq = new BizSearchResultItemContainer.a((byte)0);
    this.jLo = ((TextView)paramContext.findViewById(2131827284));
    this.jLm = ((ListView)paramContext.findViewById(2131827285));
    AppMethodBeat.o(13902);
  }

  private void b(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(13904);
    this.jLp.jLC = true;
    g.Rg().a(1071, this);
    Object localObject1 = null;
    Object localObject2 = this.jLn.gD(this.jLt[(this.jLt.length - 1)]);
    if (localObject2 != null)
    {
      localObject2 = ((c.a)localObject2).jLl;
      if ((localObject2 != null) && (((List)localObject2).size() != 0))
        break label201;
      ab.i("MicroMsg.BrandService.BizSearchResultItemContainer", "Get business content by type failed.(keyword : %s, offset : %s, businessType : %s)", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      localObject2 = localObject1;
      label108: if (localObject2 == null)
        break label225;
    }
    label201: label225: for (localObject2 = ((mh)localObject2).vQg; ; localObject2 = "")
    {
      ab.d("MicroMsg.BrandService.BizSearchResultItemContainer", "keyword(%s), offset(%d), businessType(%d), searchId(%s).", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong), localObject2 });
      paramString = new h(paramString, paramLong, paramInt, this.gOW, (String)localObject2);
      g.Rg().a(paramString, 0);
      this.jLq.sd(1);
      AppMethodBeat.o(13904);
      return;
      localObject2 = null;
      break;
      localObject2 = (mh)((List)localObject2).get(((List)localObject2).size() - 1);
      break label108;
    }
  }

  public final void bH(String paramString, int paramInt)
  {
    AppMethodBeat.i(13909);
    if (this.jLn.isEmpty())
      this.jLo.setVisibility(8);
    if (paramString == null)
      AppMethodBeat.o(13909);
    while (true)
    {
      return;
      paramString = paramString.trim();
      if (("".equals(paramString)) || ((paramString.equals(this.jLp.ctj)) && (!this.jLv)))
      {
        AppMethodBeat.o(13909);
      }
      else
      {
        if (!this.jLp.jLC)
          break;
        AppMethodBeat.o(13909);
      }
    }
    reset();
    this.jLp.jLC = true;
    this.jLp.ctj = paramString;
    this.jLu = paramInt;
    if (this.jLw != 1)
    {
      g.Rg().a(1070, this);
      this.jLr = new i(this.jLp.ctj, this.jLp.jKC, this.gOW);
      g.Rg().a(this.jLr, 0);
    }
    while (true)
    {
      if (this.jLs != null)
        this.jLs.aWc();
      AppMethodBeat.o(13909);
      break;
      if (this.jLt.length == 0)
      {
        ab.i("MicroMsg.BrandService.BizSearchResultItemContainer", "business type size is 0.");
        AppMethodBeat.o(13909);
        break;
      }
      b(paramString, paramInt, this.jLt[0]);
      this.jLq.sd(0);
    }
  }

  public c getAdapter()
  {
    return this.jLn;
  }

  public BizSearchResultItemContainer.b getIOnSearchStateChangedListener()
  {
    return this.jLs;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 3;
    AppMethodBeat.i(13905);
    ab.i("MicroMsg.BrandService.BizSearchResultItemContainer", "errType (%d) , errCode (%d) , errMsg (errMsg)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.jLs != null)
      this.jLs.aWd();
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.jLp.jLC = false;
      this.jLv = true;
      Toast.makeText(getContext(), getContext().getString(2131299995, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      AppMethodBeat.o(13905);
    }
    while (true)
    {
      return;
      this.jLv = false;
      if (paramm != null)
        break;
      ab.e("MicroMsg.BrandService.BizSearchResultItemContainer", "scene is null.");
      AppMethodBeat.o(13905);
    }
    if (paramm.getType() == 1070)
    {
      ab.i("MicroMsg.BrandService.BizSearchResultItemContainer", "BizSearchHomePage.");
      g.Rg().b(1070, this);
      paramString = (i)paramm;
      if (paramString.jKD == null)
      {
        paramString = null;
        label192: this.jLn.h(this.jLp.ctj, paramString);
        paramm = this.jLn.gD(this.jLt[(this.jLt.length - 1)]);
        if ((paramm != null) && (!paramm.jLk))
          break label402;
        paramInt1 = 0;
        label243: if (paramInt1 != 0)
          break label411;
        paramInt2 = i;
        label250: if ((paramString != null) && (paramString.size() > 0))
        {
          paramString = (mh)paramString.get(paramString.size() - 1);
          if (paramString != null)
            this.jLp.offset = (paramString.vOq + this.jLu);
        }
        if (!this.jLn.isEmpty())
          break label581;
        new ak(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(13899);
            TextView localTextView = BizSearchResultItemContainer.e(BizSearchResultItemContainer.this);
            if (BizSearchResultItemContainer.d(BizSearchResultItemContainer.this).isEmpty());
            for (int i = 0; ; i = 8)
            {
              localTextView.setVisibility(i);
              AppMethodBeat.o(13899);
              return;
            }
          }
        });
      }
    }
    while (true)
    {
      this.jLp.jLh = paramInt1;
      this.jLq.sd(paramInt2);
      this.jLp.jLC = false;
      ab.v("MicroMsg.BrandService.BizSearchResultItemContainer", "The next load data offset is (%d).", new Object[] { Integer.valueOf(this.jLp.offset) });
      AppMethodBeat.o(13905);
      break;
      paramString = paramString.jKD.wWw;
      break label192;
      label402: paramInt1 = paramm.jLh;
      break label243;
      label411: paramInt2 = 2;
      break label250;
      if (paramm.getType() == 1071)
      {
        g.Rg().b(1071, this);
        ab.i("MicroMsg.BrandService.BizSearchResultItemContainer", "BizSearchDetailPage.");
        paramString = ((h)paramm).aVX();
        if ((paramString == null) || (paramString.naO == null))
          ab.e("MicroMsg.BrandService.BizSearchResultItemContainer", "BusinessContent or itemList is null.");
        if (paramString == null)
        {
          paramInt1 = 0;
          label479: if (paramInt1 != 0)
            break label544;
        }
        label544: for (paramInt2 = 3; ; paramInt2 = 2)
        {
          this.jLn.a(paramString, true);
          if (paramString != null)
          {
            ab.d("MicroMsg.BrandService.BizSearchResultItemContainer", "searchId : %s.", new Object[] { paramString.vQg });
            this.jLp.offset = (paramString.vOq + this.jLu);
          }
          break;
          paramInt1 = paramString.vQe;
          break label479;
        }
      }
      ab.e("MicroMsg.BrandService.BizSearchResultItemContainer", "Error type(%d).", new Object[] { Integer.valueOf(paramm.getType()) });
      AppMethodBeat.o(13905);
      break;
      label581: this.jLp.jLD = true;
    }
  }

  final void reset()
  {
    AppMethodBeat.i(13906);
    this.jLn.aWb();
    this.jLq.sd(0);
    this.jLp.jLD = false;
    this.jLp.jLC = false;
    this.jLp.offset = 0;
    this.jLp.ctj = null;
    this.jLp.jLh = 1;
    AppMethodBeat.o(13906);
  }

  public void setAdapter(c paramc)
  {
    AppMethodBeat.i(13903);
    this.jLn = paramc;
    if (this.jLn != null)
    {
      this.jLn.setScene(this.gOW);
      ListView localListView = this.jLm;
      BizSearchResultItemContainer.a locala = this.jLq;
      paramc = View.inflate(getContext(), 2130969940, null);
      locala.jLz = paramc.findViewById(2131825264);
      locala.jLA = paramc.findViewById(2131822252);
      locala.jLB = paramc.findViewById(2131825265);
      locala.jLz.setVisibility(8);
      locala.jLA.setVisibility(8);
      locala.jLB.setVisibility(8);
      localListView.addFooterView(paramc, null, false);
      this.jLm.setAdapter(this.jLn);
      this.jLm.setOnScrollListener(new BizSearchResultItemContainer.1(this));
      this.jLm.setOnItemClickListener(this.jLn);
      if (this.jLp.jKC != 0L)
        break label196;
      setBusinessTypes(new long[] { 1L });
      AppMethodBeat.o(13903);
    }
    while (true)
    {
      return;
      this.jLm.setAdapter(this.jLn);
      label196: AppMethodBeat.o(13903);
    }
  }

  public void setAddContactScene(int paramInt)
  {
    AppMethodBeat.i(13911);
    this.jKX = paramInt;
    this.jLn.setAddContactScene(paramInt);
    AppMethodBeat.o(13911);
  }

  public void setBusinessTypes(long[] paramArrayOfLong)
  {
    AppMethodBeat.i(13907);
    if ((paramArrayOfLong != null) && (paramArrayOfLong.length > 0))
    {
      this.jLt = paramArrayOfLong;
      this.jLp.jKC = 0L;
      for (int i = 0; i < paramArrayOfLong.length; i++)
      {
        BizSearchResultItemContainer.c localc = this.jLp;
        localc.jKC |= paramArrayOfLong[i];
      }
      this.jLn.c(paramArrayOfLong);
    }
    AppMethodBeat.o(13907);
  }

  public final void setDisplayArgs$25decb5(boolean paramBoolean)
  {
    AppMethodBeat.i(13912);
    this.jLn.v(paramBoolean, false);
    AppMethodBeat.o(13912);
  }

  public void setIOnSearchStateChangedListener(BizSearchResultItemContainer.b paramb)
  {
    this.jLs = paramb;
  }

  public void setMode(int paramInt)
  {
    this.jLw = paramInt;
  }

  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    AppMethodBeat.i(13913);
    super.setOnTouchListener(paramOnTouchListener);
    this.jLm.setOnTouchListener(paramOnTouchListener);
    AppMethodBeat.o(13913);
  }

  public void setReporter(c.b paramb)
  {
    AppMethodBeat.i(13908);
    if (this.jLn != null)
      this.jLn.setReporter(paramb);
    AppMethodBeat.o(13908);
  }

  public void setScene(int paramInt)
  {
    AppMethodBeat.i(13910);
    this.gOW = paramInt;
    this.jLn.setScene(this.gOW);
    AppMethodBeat.o(13910);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer
 * JD-Core Version:    0.6.2
 */