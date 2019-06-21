package com.tencent.mm.plugin.fav.ui.gallery;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.ui.f;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.plugin.fav.ui.widget.FavVideoView;
import com.tencent.mm.plugin.gif.d;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.n;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import java.util.ArrayList;
import java.util.List;

final class FavMediaGalleryUI$a extends BaseAdapter
{
  SparseBooleanArray mit;

  private FavMediaGalleryUI$a(FavMediaGalleryUI paramFavMediaGalleryUI)
  {
    AppMethodBeat.i(74519);
    this.mit = new SparseBooleanArray();
    AppMethodBeat.o(74519);
  }

  private Bitmap a(f paramf)
  {
    AppMethodBeat.i(74525);
    if (paramf != null)
    {
      paramf = l.a(paramf.cAv, paramf.mij);
      if (paramf != null)
        AppMethodBeat.o(74525);
    }
    while (true)
    {
      return paramf;
      paramf = com.tencent.mm.compatible.g.a.decodeResource(this.mnH.getResources(), 2131231218);
      AppMethodBeat.o(74525);
    }
  }

  private void a(FavMediaGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
  {
    AppMethodBeat.i(74524);
    paramb.progressBar.setVisibility(8);
    paramb.mix.setVisibility(8);
    paramb.miw.setVisibility(8);
    paramb.miu.setVisibility(0);
    paramb.miy.setVisibility(8);
    b(paramb, paramBitmap, paramString);
    AppMethodBeat.o(74524);
  }

  private void b(FavMediaGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
  {
    AppMethodBeat.i(74526);
    n.w(paramb.miv, paramBitmap.getWidth(), paramBitmap.getHeight());
    int i = paramb.miv.getWidth();
    int j = paramb.miv.getHeight();
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    float f1 = paramBitmap.getWidth() / paramBitmap.getHeight();
    float f2 = paramBitmap.getHeight() / paramBitmap.getWidth();
    ab.v("MicroMsg.FavMediaGalleryUI", "whDiv is " + f1 + " hwDiv is " + f2);
    if ((f2 >= 2.0F) && (paramBitmap.getHeight() >= 480))
    {
      f2 = paramBitmap.getWidth() / i;
      f1 = i / paramBitmap.getWidth();
      if (f2 > 1.0D)
      {
        ((Matrix)localObject).postScale(f1, f1);
        paramBitmap.getHeight();
        ((Matrix)localObject).postTranslate((i - f1 * paramBitmap.getWidth()) / 2.0F, 0.0F);
      }
    }
    while (true)
    {
      paramb.miv.setImageMatrix((Matrix)localObject);
      paramb.miv.bW(paramBitmap.getWidth(), paramBitmap.getHeight());
      paramb.miv.setMaxZoomDoubleTab(true);
      if (!bo.isNullOrNil(paramString))
        break label524;
      paramb.miv.setImageBitmap(paramBitmap);
      AppMethodBeat.o(74526);
      label245: return;
      ((Matrix)localObject).postScale(1.0F, 1.0F);
      ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth()) / 2, 0.0F);
      continue;
      if ((f1 < 2.0F) || (paramBitmap.getWidth() < 480))
        break;
      f2 = paramBitmap.getHeight() / 480.0F;
      f1 = 480.0F / paramBitmap.getHeight();
      if (f2 > 1.0D)
      {
        ((Matrix)localObject).postScale(f2, f1);
        ((Matrix)localObject).postTranslate(0.0F, (j - 480) / 2);
      }
      else
      {
        ((Matrix)localObject).postScale(1.0F, 1.0F);
        f2 = (j - paramBitmap.getHeight()) / 2;
        ab.d("MicroMsg.FavMediaGalleryUI", " offsety ".concat(String.valueOf(f2)));
        ((Matrix)localObject).postTranslate(0.0F, f2);
      }
    }
    f1 = i / paramBitmap.getWidth();
    f2 = j / paramBitmap.getHeight();
    label429: float f3;
    if (f1 < f2)
    {
      f2 = f1;
      f1 = paramBitmap.getWidth() / i;
      f3 = paramBitmap.getHeight() / j;
      if (f1 <= f3)
        break label517;
      label459: if (f1 <= 1.0D)
        break label642;
      ((Matrix)localObject).postScale(f2, f2);
    }
    while (true)
    {
      while (true)
      {
        ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth() * f2) / 2.0F, (j - f2 * paramBitmap.getHeight()) / 2.0F);
        break;
        break label429;
        label517: f1 = f3;
        break label459;
        try
        {
          label524: localObject = new com/tencent/mm/plugin/gif/d;
          ((d)localObject).<init>(paramString);
          paramb.miv.setGifDrawable((Drawable)localObject);
          paramb.miv.hk(com.tencent.mm.bz.a.gd(this.mnH.mController.ylL), com.tencent.mm.bz.a.ge(this.mnH.mController.ylL));
          paramb.miv.bW(((d)localObject).getIntrinsicWidth(), ((d)localObject).getIntrinsicHeight());
          paramb.miv.start();
          paramb.miv.dAp();
          AppMethodBeat.o(74526);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.FavMediaGalleryUI", bo.l(paramString));
          paramb.miv.setImageBitmap(paramBitmap);
          AppMethodBeat.o(74526);
        }
      }
      break label245;
      label642: f2 = 1.0F;
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(74521);
    int i = FavMediaGalleryUI.h(this.mnH).size();
    AppMethodBeat.o(74521);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(74520);
    if (paramInt > FavMediaGalleryUI.h(this.mnH).size())
    {
      paramInt = 2;
      AppMethodBeat.o(74520);
    }
    while (true)
    {
      return paramInt;
      paramInt = ((f)FavMediaGalleryUI.h(this.mnH).get(paramInt)).cAv.dataType;
      AppMethodBeat.o(74520);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(74523);
    f localf = vC(paramInt);
    if ((localf.cAv.dataType == 15) || (localf.cAv.dataType == 4))
    {
      if (paramView != null)
        break label1171;
      paramView = new FavVideoView(this.mnH.mController.ylL);
      FavMediaGalleryUI.i(this.mnH).add((FavVideoView)paramView);
    }
    label1171: 
    while (true)
    {
      paramViewGroup = (FavVideoView)paramView;
      paramViewGroup.mmZ.setVisibility(8);
      Object localObject1 = b.b(localf.cAv);
      Object localObject2;
      if (e.ct((String)localObject1))
      {
        paramViewGroup.setVideoData((String)localObject1);
        localObject2 = b.c(localf.cAv);
        if (!e.ct((String)localObject2))
          break label293;
        paramViewGroup.setThumbView((String)localObject2);
      }
      while (true)
      {
        AppMethodBeat.o(74523);
        return paramView;
        localObject2 = localf.cAv.mnd;
        c localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR((String)localObject2);
        if ((localc != null) && (localc.field_status == 1))
          break;
        if ((!bo.isNullOrNil(localf.cAv.wfZ)) && (!bo.isNullOrNil(localf.cAv.wgb)))
        {
          ab.d("MicroMsg.FavMediaGalleryUI", "getView, no video, start download, dataId:%s", new Object[] { localObject2 });
          b.a(localf.mij, localf.cAv, true);
          paramViewGroup.a((String)localObject1, true, (String)localObject2);
          break;
        }
        ab.d("MicroMsg.FavMediaGalleryUI", "getView, no video, cdn data invalid");
        paramViewGroup.a((String)localObject1, false, (String)localObject2);
        paramViewGroup.mmZ.setVisibility(0);
        break;
        label293: ab.i("MicroMsg.FavMediaGalleryUI", "getView, no thumb, start download, path:%s", new Object[] { localObject2 });
        b.a(localf.mij, localf.cAv);
      }
      if (paramView == null)
      {
        paramViewGroup = new FavMediaGalleryUI.b(this.mnH, (byte)0);
        paramView = View.inflate(this.mnH.mController.ylL, 2130969503, null);
        paramViewGroup.miu = paramView.findViewById(2131820630);
        paramViewGroup.miv = ((MultiTouchImageView)paramView.findViewById(2131820629));
        paramViewGroup.progressBar = ((ProgressBar)paramView.findViewById(2131822617));
        paramViewGroup.miw = ((ImageView)paramView.findViewById(2131821511));
        paramViewGroup.mix = ((TextView)paramView.findViewById(2131823911));
        paramViewGroup.miy = ((LinearLayout)paramView.findViewById(2131823884));
        paramViewGroup.miz = ((TextView)paramView.findViewById(2131823885));
        paramViewGroup.miz.setText(2131299600);
        paramView.setTag(paramViewGroup);
        label471: paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        boolean bool = this.mit.get(paramInt, true);
        this.mit.put(paramInt, false);
        localObject2 = l.a(localf.cAv, localf.mij, bool);
        if (localf.mij != null)
          ab.i("MicroMsg.FavMediaGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localf.mij.field_id), Long.valueOf(localf.mij.field_localId), Integer.valueOf(localf.mij.field_itemStatus) });
        if (localf.cAv != null)
          ab.i("MicroMsg.FavMediaGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", new Object[] { localf.cAv.mnd, localf.cAv.wfZ, localf.cAv.wgb, Long.valueOf(localf.cAv.wgu), localf.cAv.fgE, localf.cAv.wfV, Long.valueOf(localf.cAv.wgF) });
        if (localObject2 != null)
          break label1112;
        this.mnH.enableOptionMenu(false);
        ab.w("MicroMsg.FavMediaGalleryUI", "get big image fail");
        localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage();
        if (localf.cAv == null)
          break label878;
        localObject2 = localf.cAv.mnd;
        label750: localObject2 = ((com.tencent.mm.plugin.fav.a.q)localObject1).LR((String)localObject2);
        if (localObject2 != null)
          break label957;
        paramViewGroup.miy.setVisibility(8);
        if ((localf.mij == null) || (localf.mij.field_id >= 0))
          break label886;
        paramViewGroup.progressBar.setVisibility(0);
        paramViewGroup.mix.setVisibility(0);
        paramViewGroup.miw.setVisibility(0);
        paramViewGroup.miu.setVisibility(8);
        paramViewGroup.miw.setImageBitmap(a(localf));
        paramViewGroup.progressBar.setProgress(0);
        paramViewGroup.mix.setText("0%");
      }
      while (true)
      {
        AppMethodBeat.o(74523);
        break;
        paramViewGroup = (FavMediaGalleryUI.b)paramView.getTag();
        break label471;
        label878: localObject2 = "";
        break label750;
        label886: paramViewGroup.progressBar.setVisibility(8);
        paramViewGroup.mix.setVisibility(8);
        paramViewGroup.miw.setVisibility(8);
        paramViewGroup.miu.setVisibility(0);
        if (localf.cAv.whh != 0)
          paramViewGroup.miy.setVisibility(0);
        b(paramViewGroup, a(localf), "");
      }
      label957: ab.i("MicroMsg.FavMediaGalleryUI", "fav cdnInfo status %d", new Object[] { Integer.valueOf(((c)localObject2).field_status) });
      paramViewGroup.progressBar.setVisibility(0);
      paramViewGroup.mix.setVisibility(0);
      paramViewGroup.miw.setVisibility(0);
      paramViewGroup.miu.setVisibility(8);
      paramViewGroup.miw.setImageBitmap(a(localf));
      if (((c)localObject2).field_totalLen > 0);
      for (paramInt = ((c)localObject2).field_offset * 100 / ((c)localObject2).field_totalLen - 1; ; paramInt = 0)
      {
        int i = paramInt;
        if (paramInt < 0)
          i = 0;
        paramViewGroup.progressBar.setProgress(i);
        paramViewGroup.mix.setText(i + "%");
        AppMethodBeat.o(74523);
        break;
      }
      label1112: this.mnH.enableOptionMenu(true);
      if (r.amo(b.b(localf.cAv)))
        a(paramViewGroup, (Bitmap)localObject2, b.b(localf.cAv));
      while (true)
      {
        AppMethodBeat.o(74523);
        break;
        a(paramViewGroup, (Bitmap)localObject2, "");
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }

  public final f vC(int paramInt)
  {
    AppMethodBeat.i(74522);
    f localf;
    if (paramInt >= FavMediaGalleryUI.h(this.mnH).size())
    {
      ab.w("MicroMsg.FavMediaGalleryUI", "get item fail, position %d error", new Object[] { Integer.valueOf(paramInt) });
      localf = null;
      AppMethodBeat.o(74522);
    }
    while (true)
    {
      return localf;
      localf = (f)FavMediaGalleryUI.h(this.mnH).get(paramInt);
      AppMethodBeat.o(74522);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.a
 * JD-Core Version:    0.6.2
 */