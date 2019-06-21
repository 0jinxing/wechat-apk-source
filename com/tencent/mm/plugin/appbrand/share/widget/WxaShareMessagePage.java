package com.tencent.mm.plugin.appbrand.share.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.modelappbrand.i.a;
import com.tencent.mm.modelappbrand.i.b;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.r.n;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

public class WxaShareMessagePage extends LinearLayout
  implements b.i
{
  public ImageView hYX;
  TextView iDT;
  public ImageView iDU;
  IPCDynamicPageView iDV;
  ThreeDotsLoadingView iDW;
  public ImageView iDX;
  public TextView iDY;
  i.b iDZ;
  public boolean iEa;
  public View qQ;

  public WxaShareMessagePage(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(132757);
    init(paramContext);
    AppMethodBeat.o(132757);
  }

  public WxaShareMessagePage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(132758);
    init(paramContext);
    AppMethodBeat.o(132758);
  }

  public WxaShareMessagePage(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(132759);
    init(paramContext);
    AppMethodBeat.o(132759);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(132760);
    View localView = View.inflate(paramContext, 2130971248, this);
    this.qQ = localView.findViewById(2131829238);
    this.hYX = ((ImageView)localView.findViewById(2131821842));
    this.iDU = ((ImageView)localView.findViewById(2131822521));
    this.iDV = ((IPCDynamicPageView)localView.findViewById(2131829239));
    this.iDT = ((TextView)localView.findViewById(2131821185));
    this.iDW = ((ThreeDotsLoadingView)localView.findViewById(2131821325));
    paramContext = LayoutInflater.from(paramContext).inflate(2130969925, (ViewGroup)localView, false);
    this.iDX = ((ImageView)paramContext.findViewById(2131825240));
    this.iDY = ((TextView)paramContext.findViewById(2131825241));
    ((ViewGroup)localView.findViewById(2131821064)).addView(paramContext);
    setGravity(17);
    AppMethodBeat.o(132760);
  }

  public final void abU()
  {
  }

  public ImageView getCoverImageView()
  {
    return this.hYX;
  }

  public ImageView getErrorImageView()
  {
    return this.iDU;
  }

  public ThreeDotsLoadingView getLoadingView()
  {
    return this.iDW;
  }

  public int getWidgetHeight()
  {
    AppMethodBeat.i(132768);
    int i = com.tencent.mm.plugin.appbrand.r.g.qb(180);
    AppMethodBeat.o(132768);
    return i;
  }

  public IPCDynamicPageView getWidgetPageView()
  {
    return this.iDV;
  }

  public int getWidgetWidth()
  {
    AppMethodBeat.i(132767);
    int i = com.tencent.mm.plugin.appbrand.r.g.qb(224);
    AppMethodBeat.o(132767);
    return i;
  }

  public final void mr()
  {
    AppMethodBeat.i(132762);
    this.iDW.setVisibility(4);
    this.iDW.dKT();
    this.hYX.setImageBitmap(null);
    this.iDU.setVisibility(0);
    if (this.iDZ != null)
      this.iDZ.kQ(1);
    AppMethodBeat.o(132762);
  }

  public void setImageData(Bitmap paramBitmap)
  {
    AppMethodBeat.i(132765);
    this.hYX.setVisibility(0);
    this.iDW.setVisibility(4);
    this.iDU.setVisibility(4);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      b.f localf = ((i)com.tencent.mm.kernel.g.K(i.class)).abB();
      this.hYX.setImageBitmap(localf.y(paramBitmap));
      AppMethodBeat.o(132765);
    }
    while (true)
    {
      return;
      this.hYX.setImageBitmap(null);
      AppMethodBeat.o(132765);
    }
  }

  public void setImageUrl(String paramString)
  {
    AppMethodBeat.i(132764);
    this.iDW.setVisibility(0);
    this.iDW.dKS();
    this.iDU.setVisibility(4);
    this.hYX.setVisibility(0);
    if (this.iEa)
    {
      b.abR().a(this, paramString, null, ((i)com.tencent.mm.kernel.g.K(i.class)).a(112, 90, i.a.fpG));
      AppMethodBeat.o(132764);
    }
    while (true)
    {
      return;
      b.abR().a(this, paramString, null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(112, 90));
      AppMethodBeat.o(132764);
    }
  }

  public void setOnLoadImageResult(i.b paramb)
  {
    this.iDZ = paramb;
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(132766);
    this.iDT.setText(paramString);
    AppMethodBeat.o(132766);
  }

  public final String wP()
  {
    AppMethodBeat.i(132763);
    String str = n.bE(this);
    AppMethodBeat.o(132763);
    return str;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(132761);
    this.iDW.setVisibility(4);
    this.iDW.dKT();
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.hYX.setImageBitmap(paramBitmap);
      this.iDU.setVisibility(4);
    }
    while (true)
    {
      if (this.iDZ != null)
        this.iDZ.kQ(0);
      AppMethodBeat.o(132761);
      return;
      this.hYX.setImageBitmap(null);
      this.iDU.setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage
 * JD-Core Version:    0.6.2
 */