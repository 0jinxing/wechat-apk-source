package com.tencent.mm.plugin.appbrand.ui.banner;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class d extends com.tencent.mm.pluginsdk.ui.b.b
  implements View.OnClickListener, f
{
  private static boolean iKF = false;
  private TextView iKA;
  private ImageView iKB;
  private String iKC;
  private final Runnable iKD;
  private final b.i iKE;
  private View iKz;

  public static void aMO()
  {
    iKF = false;
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(133275);
    if (!iKF)
    {
      ((e)g.K(e.class)).b(this);
      ((e)g.K(e.class)).aMK();
      ((e)g.K(e.class)).a(this);
      iKF = true;
    }
    Object localObject1 = BannerModel.aMT();
    Object localObject2;
    boolean bool;
    if ((localObject1 != null) && (!bo.isNullOrNil(((BannerModel)localObject1).appId)))
    {
      String str = ((BannerModel)localObject1).appName;
      localObject2 = ((BannerModel)localObject1).iKV;
      localObject1 = ((BannerModel)localObject1).haO;
      if (bo.isNullOrNil((String)localObject2))
      {
        localObject2 = str;
        if (!bo.isNullOrNil((String)localObject2))
          break label119;
        AppMethodBeat.o(133275);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      break;
      label119: setVisibility(0);
      if (this.iKA != null)
        this.iKA.setText((CharSequence)localObject2);
      if (!bo.isNullOrNil((String)localObject1))
      {
        localObject2 = null;
        if (!bo.isNullOrNil(this.iKC))
          localObject2 = com.tencent.mm.modelappbrand.a.b.abR().pB(this.iKC);
        if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled()))
          break label201;
        this.iKE.x((Bitmap)localObject2);
      }
      while (true)
      {
        AppMethodBeat.o(133275);
        bool = true;
        break;
        label201: this.iKC = com.tencent.mm.modelappbrand.a.b.abR().a(this.iKE, (String)localObject1, com.tencent.mm.modelappbrand.a.f.fqH);
      }
      setVisibility(8);
      AppMethodBeat.o(133275);
      bool = false;
    }
  }

  public final void bg(String paramString, int paramInt)
  {
    AppMethodBeat.i(133279);
    al.d(this.iKD);
    AppMethodBeat.o(133279);
  }

  public final void destroy()
  {
    AppMethodBeat.i(133277);
    if (this.iKz != null)
    {
      ((ViewGroup)this.iKz).removeAllViews();
      this.iKz.setVisibility(8);
    }
    this.iKz = null;
    this.iKA = null;
    this.iKB = null;
    ((e)g.K(e.class)).b(this);
    AppMethodBeat.o(133277);
  }

  public final int getLayoutId()
  {
    return 2130969012;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133278);
    Object localObject = BannerModel.aMT();
    if (localObject == null)
      AppMethodBeat.o(133278);
    while (true)
    {
      return;
      String str = ((BannerModel)localObject).appId;
      int i = ((BannerModel)localObject).har;
      if (bo.isNullOrNil(str))
      {
        aMN();
        AppMethodBeat.o(133278);
      }
      else
      {
        localObject = new AppBrandStatObject();
        ((AppBrandStatObject)localObject).scene = 1022;
        ((com.tencent.mm.plugin.appbrand.service.e)g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(paramView.getContext(), null, str, i, -1, null, (AppBrandStatObject)localObject);
        AppMethodBeat.o(133278);
      }
    }
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(133276);
    if (this.iKz != null)
      this.iKz.setVisibility(paramInt);
    AppMethodBeat.o(133276);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.banner.d
 * JD-Core Version:    0.6.2
 */