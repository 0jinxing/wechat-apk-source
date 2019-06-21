package com.tencent.mm.plugin.appbrand.share.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.magicbrush.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.a;
import com.tencent.mm.at.o;
import com.tencent.mm.at.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.a.b.e;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.modelappbrand.ac;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.modelappbrand.i.a;
import com.tencent.mm.modelappbrand.i.b;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage;
import com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage.1;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class a
  implements i
{
  private final Map<String, SoftReference<b.e>> iDL;
  private final Map<String, SoftReference<b.f>> iDM;
  private final Map<Integer, a.a> iDN;
  private final Map<Integer, Bundle> iDO;

  public a()
  {
    AppMethodBeat.i(132743);
    this.iDL = new ConcurrentHashMap();
    this.iDM = new ConcurrentHashMap();
    this.iDN = new ConcurrentHashMap();
    this.iDO = new ConcurrentHashMap();
    a(1, new a.1(this));
    AppMethodBeat.o(132743);
  }

  private void a(int paramInt, a.a parama)
  {
    AppMethodBeat.i(132753);
    this.iDN.put(Integer.valueOf(paramInt), parama);
    if (this.iDO.containsKey(Integer.valueOf(paramInt)))
      parama.C((Bundle)this.iDO.get(Integer.valueOf(paramInt)));
    AppMethodBeat.o(132753);
  }

  private static void a(i.b paramb, int paramInt)
  {
    AppMethodBeat.i(132747);
    if (paramb != null)
      paramb.kQ(paramInt);
    AppMethodBeat.o(132747);
  }

  public final b.e a(int paramInt1, int paramInt2, i.a parama)
  {
    AppMethodBeat.i(132751);
    String str = String.format("%d-%d-dp", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject1 = (SoftReference)this.iDL.get(str);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = (b.e)((SoftReference)localObject1).get();
      localObject1 = localObject2;
      if (localObject2 != null)
        break label179;
    }
    try
    {
      localObject1 = (SoftReference)this.iDL.get(str);
      if (localObject1 != null)
      {
        localObject2 = (b.e)((SoftReference)localObject1).get();
        localObject1 = localObject2;
        if (localObject2 != null);
      }
      else
      {
        paramInt1 = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), paramInt1);
        paramInt2 = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), paramInt2);
        localObject1 = new com/tencent/mm/plugin/appbrand/share/a;
        ((com.tencent.mm.plugin.appbrand.share.a)localObject1).<init>(paramInt1, paramInt2);
        ((com.tencent.mm.plugin.appbrand.share.a)localObject1).iDJ = parama;
        parama = this.iDL;
        localObject2 = new java/lang/ref/SoftReference;
        ((SoftReference)localObject2).<init>(localObject1);
        parama.put(str, localObject2);
      }
      label179: return localObject1;
    }
    finally
    {
      AppMethodBeat.o(132751);
    }
    throw parama;
  }

  public final void a(String paramString, View paramView)
  {
    AppMethodBeat.i(132748);
    Assert.assertNotNull(paramView);
    if (!(paramView instanceof WxaShareMessagePage))
      AppMethodBeat.o(132748);
    while (true)
    {
      return;
      ab.i("MicroMsg.WxaShareMessageService", "onUnbindView(%s, %s)", new Object[] { paramString, Integer.valueOf(paramView.hashCode()) });
      paramView = (WxaShareMessagePage)paramView;
      ((e)g.K(e.class)).a(paramString, paramView.getWidgetPageView());
      this.iDN.remove(Integer.valueOf(2));
      AppMethodBeat.o(132748);
    }
  }

  public final boolean a(String paramString, View paramView, Bundle paramBundle)
  {
    AppMethodBeat.i(132745);
    boolean bool = a(paramString, paramView, paramBundle, null);
    AppMethodBeat.o(132745);
    return bool;
  }

  public final boolean a(String paramString, View paramView, Bundle paramBundle, i.b paramb)
  {
    AppMethodBeat.i(132746);
    Assert.assertNotNull(paramView);
    Assert.assertNotNull(paramBundle);
    if (!(paramView instanceof WxaShareMessagePage))
    {
      AppMethodBeat.o(132746);
      bool = false;
      return bool;
    }
    ab.i("MicroMsg.WxaShareMessageService", "onBindView(%s, %s)", new Object[] { paramString, Integer.valueOf(paramView.hashCode()) });
    paramView = (WxaShareMessagePage)paramView;
    boolean bool = paramBundle.getBoolean("is_dynamic_page");
    paramView.setTitle(paramBundle.getString("title", ""));
    Object localObject;
    if (bool)
    {
      paramView.getCoverImageView().setVisibility(4);
      localObject = paramView.getWidgetPageView();
      ((IPCDynamicPageView)localObject).setVisibility(0);
      paramBundle.putInt("view_init_width", paramView.getWidgetWidth());
      paramBundle.putInt("view_init_height", paramView.getWidgetHeight());
      ((e)g.K(e.class)).a(paramString, (View)localObject, paramBundle, new ac(new a.2(this, paramView)));
      a(paramb, 0);
    }
    while (true)
    {
      AppMethodBeat.o(132746);
      bool = true;
      break;
      paramView.getWidgetPageView().setVisibility(4);
      paramView.getCoverImageView().setVisibility(0);
      paramString = paramBundle.getByteArray("image_data");
      if ((paramString != null) && (paramString.length > 0))
      {
        paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
        if ((paramString != null) && (!paramString.isRecycled()))
        {
          paramView.setImageData(paramString);
          a(paramb, 0);
          AppMethodBeat.o(132746);
          bool = true;
          break;
        }
      }
      localObject = paramBundle.getString("delay_load_img_path");
      if (!bo.isNullOrNil((String)localObject))
      {
        paramString = null;
        if (((String)localObject).startsWith("delayLoadFile://"))
        {
          if (this.iDO.containsKey(Integer.valueOf(2)))
          {
            paramString = d.aml(((String)localObject).replace("delayLoadFile://", ""));
            ab.i("MicroMsg.WxaShareMessageService", "getBitmapNative(%s)", new Object[] { localObject });
          }
          label327: if (paramString == null)
            break label405;
          if (paramString.isRecycled())
            break label390;
          paramView.setImageData(paramString);
          a(paramb, 0);
        }
        while (true)
        {
          AppMethodBeat.o(132746);
          bool = true;
          break;
          paramString = com.tencent.mm.modelappbrand.a.b.abR().a((String)localObject, null);
          ab.i("MicroMsg.WxaShareMessageService", "findCachedLocal(%s)", new Object[] { localObject });
          break label327;
          label390: paramView.setOnLoadImageResult(paramb);
          paramView.setImageUrl((String)localObject);
        }
        label405: ab.i("MicroMsg.WxaShareMessageService", "delay loadImage(%s)", new Object[] { localObject });
        paramView.getLoadingView().setVisibility(0);
        paramView.getErrorImageView().setVisibility(4);
        paramView.getCoverImageView().setVisibility(4);
        paramView.getLoadingView().dKS();
        a(2, new a.3(this, paramView, paramb));
      }
      else
      {
        paramString = paramBundle.getString("image_url");
        if ((paramString != null) && ((paramString.startsWith("http://")) || (paramString.startsWith("https://"))))
        {
          paramView.setOnLoadImageResult(paramb);
          paramView.setImageUrl(paramString);
        }
        else
        {
          if ((paramString != null) && (paramString.startsWith("file://")))
          {
            paramString = com.tencent.mm.modelappbrand.a.b.abR().a(paramString, null);
            if ((paramString != null) && (!paramString.isRecycled()))
            {
              paramView.setImageData(paramString);
              a(paramb, 0);
              AppMethodBeat.o(132746);
              bool = true;
              break;
            }
          }
          paramView.mr();
          a(paramb, 1);
        }
      }
    }
  }

  public final b.f abB()
  {
    AppMethodBeat.i(132752);
    String str = String.format("%d-%d-dp", new Object[] { Integer.valueOf(112), Integer.valueOf(90) });
    Object localObject1 = (SoftReference)this.iDM.get(str);
    Object localObject3;
    if (localObject1 != null)
    {
      localObject3 = (b.f)((SoftReference)localObject1).get();
      localObject1 = localObject3;
      if (localObject3 != null)
        break label157;
    }
    try
    {
      localObject1 = (SoftReference)this.iDM.get(str);
      if (localObject1 != null)
      {
        localObject3 = (b.f)((SoftReference)localObject1).get();
        localObject1 = localObject3;
        if (localObject3 != null);
      }
      else
      {
        int i = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 112);
        int j = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 90);
        localObject1 = new com/tencent/mm/plugin/appbrand/share/b;
        ((com.tencent.mm.plugin.appbrand.share.b)localObject1).<init>(i, j);
        Map localMap = this.iDM;
        localObject3 = new java/lang/ref/SoftReference;
        ((SoftReference)localObject3).<init>(localObject1);
        localMap.put(str, localObject3);
      }
      label157: return localObject1;
    }
    finally
    {
      AppMethodBeat.o(132752);
    }
  }

  public final b.e cq(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(132750);
    b.e locale = a(paramInt1, paramInt2, i.a.fpF);
    AppMethodBeat.o(132750);
    return locale;
  }

  public final View d(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(132744);
    Assert.assertNotNull(paramContext);
    paramContext = new WxaShareMessagePage(paramContext);
    int i;
    Object localObject;
    if (paramBundle != null)
    {
      i = paramBundle.getInt("key_biz", j.a.fgj.ordinal());
      if (j.a.isValid(i))
      {
        paramContext.iEa = true;
        localObject = paramContext.hYX.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).width = com.tencent.mm.bz.a.fromDPToPix(paramContext.getContext(), 112);
        ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.bz.a.fromDPToPix(paramContext.getContext(), 63);
        paramContext.hYX.setLayoutParams((ViewGroup.LayoutParams)localObject);
        paramContext.hYX.setScaleType(ImageView.ScaleType.CENTER_CROP);
        localObject = paramContext.iDU.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).width = com.tencent.mm.bz.a.fromDPToPix(paramContext.getContext(), 112);
        ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.bz.a.fromDPToPix(paramContext.getContext(), 63);
        paramContext.iDU.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localObject = paramContext.qQ.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).width = com.tencent.mm.bz.a.fromDPToPix(paramContext.getContext(), 112);
        ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.bz.a.fromDPToPix(paramContext.getContext(), 63);
        paramContext.qQ.setLayoutParams((ViewGroup.LayoutParams)localObject);
        if (j.a.fgh.ordinal() != i)
          break label273;
        paramContext.iDX.setImageResource(2131231694);
        paramContext.iDU.setImageResource(2131230907);
        localObject = paramBundle.getString("key_footer_text", "");
        paramBundle = paramBundle.getString("key_footer_text_default", "");
        if (((String)localObject).isEmpty())
          break label321;
        paramContext.iDY.setText((CharSequence)localObject);
      }
    }
    while (true)
    {
      AppMethodBeat.o(132744);
      return paramContext;
      label273: if (j.a.fgi.ordinal() != i)
        break;
      localObject = paramBundle.getString("key_footer_icon", "");
      if (c.isNullOrNil((String)localObject))
        break;
      o.aho().a((String)localObject, new WxaShareMessagePage.1(paramContext));
      break;
      label321: if (!paramBundle.isEmpty())
        paramContext.iDY.setText(paramBundle);
    }
  }

  public final void d(int paramInt, Bundle paramBundle)
  {
    try
    {
      AppMethodBeat.i(132749);
      a.a locala = (a.a)this.iDN.get(Integer.valueOf(paramInt));
      if (locala != null)
        locala.C(paramBundle);
      this.iDO.put(Integer.valueOf(paramInt), paramBundle);
      ab.i("MicroMsg.WxaShareMessageService", "onAction(%d, %s)", new Object[] { Integer.valueOf(paramInt), paramBundle });
      AppMethodBeat.o(132749);
      return;
    }
    finally
    {
    }
    throw paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.share.a.a
 * JD-Core Version:    0.6.2
 */