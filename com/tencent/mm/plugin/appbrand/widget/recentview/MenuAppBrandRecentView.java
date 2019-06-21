package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.b;

public class MenuAppBrandRecentView extends BaseAppBrandRecentView
{
  private static final int jof = b.iWq - 1;
  private static final int jog = b.iWq;
  private AppBrandRecentView.b jas;

  public MenuAppBrandRecentView(Context paramContext)
  {
    super(paramContext);
  }

  public MenuAppBrandRecentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(BaseAppBrandRecentView.c paramc, a parama, int paramInt)
  {
    AppMethodBeat.i(134385);
    super.a(paramc, parama, paramInt);
    paramc.gne.setTextColor(-1728053248);
    if ((parama != null) && (parama.type == 2))
    {
      paramc.gne.setVisibility(0);
      paramc.iYd.setVisibility(8);
      paramc.gne.setText(2131301585);
      paramc.iqT.setImageResource(2131230839);
      AppMethodBeat.o(134385);
    }
    while (true)
    {
      return;
      if ((parama != null) && (parama.type == -1))
        paramc.iqT.setImageResource(2131231172);
      AppMethodBeat.o(134385);
    }
  }

  public int getLayoutId()
  {
    return 2130968767;
  }

  protected int getLoadCount()
  {
    return jog;
  }

  protected int getShowCount()
  {
    return jof;
  }

  protected String getType()
  {
    AppMethodBeat.i(134384);
    String str = MenuAppBrandRecentView.class.getSimpleName();
    AppMethodBeat.o(134384);
    return str;
  }

  protected final void init(Context paramContext)
  {
    AppMethodBeat.i(134386);
    super.init(paramContext);
    super.setOnItemClickListener(new MenuAppBrandRecentView.1(this));
    AppMethodBeat.o(134386);
  }

  public void setOnItemClickListener(AppBrandRecentView.b paramb)
  {
    this.jas = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.MenuAppBrandRecentView
 * JD-Core Version:    0.6.2
 */