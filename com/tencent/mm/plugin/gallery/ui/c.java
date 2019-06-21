package com.tencent.mm.plugin.gallery.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.n;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.WxImageView;
import com.tencent.mm.ui.base.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class c extends u
{
  private Bitmap cdX;
  Context mContext;
  ArrayList<GalleryItem.MediaItem> mOH;
  ArrayList<String> mQl;
  boolean mQm;
  private HashSet<String> mQn;
  int mQo;
  View mQp;
  boolean mQq;
  private HashMap<String, WeakReference<c.b>> mQr;
  public e mQs;
  public d mQt;

  public c(Context paramContext)
  {
    AppMethodBeat.i(21459);
    this.mQl = new ArrayList();
    this.mOH = new ArrayList();
    this.mQn = new HashSet();
    this.mQo = -1;
    this.mQp = null;
    this.mQq = false;
    this.cdX = null;
    this.mQr = new HashMap();
    this.mQs = new e(this);
    this.mQt = new d(this);
    this.mContext = paramContext;
    AppMethodBeat.o(21459);
  }

  @TargetApi(11)
  private static void a(MultiTouchImageView paramMultiTouchImageView, Bitmap paramBitmap)
  {
    AppMethodBeat.i(21468);
    paramMultiTouchImageView.setMaxZoomLimit(4.5F);
    paramMultiTouchImageView.setEnableHorLongBmpMode(false);
    if (Build.VERSION.SDK_INT == 20)
      paramMultiTouchImageView.setLayerType(1, null);
    while (true)
    {
      paramMultiTouchImageView.bW(paramBitmap.getWidth(), paramBitmap.getHeight());
      paramMultiTouchImageView.setImageBitmap(paramBitmap);
      paramMultiTouchImageView.requestLayout();
      AppMethodBeat.o(21468);
      return;
      n.w(paramMultiTouchImageView, paramBitmap.getWidth(), paramBitmap.getHeight());
    }
  }

  public final void E(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(21460);
    this.mQl.clear();
    this.mQl = new ArrayList();
    this.mQl.addAll(paramArrayList);
    reset();
    notifyDataSetChanged();
    AppMethodBeat.o(21460);
  }

  public final void a(MultiTouchImageView paramMultiTouchImageView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(21467);
    this.mQn.remove(paramString);
    c.b localb;
    if (paramMultiTouchImageView != null)
    {
      localb = (c.b)paramMultiTouchImageView.getTag();
      if (paramBitmap != null)
      {
        a(paramMultiTouchImageView, paramBitmap);
        if ((localb == null) || (!localb.mQv) || (localb.mQy == null))
          break label114;
        localb.mQy.setVisibility(8);
        AppMethodBeat.o(21467);
      }
    }
    while (true)
    {
      return;
      if ((localb != null) && (localb.mQv) && (localb.mQy != null))
      {
        localb.mQy.setText(paramString);
        localb.mQy.setVisibility(0);
      }
      label114: AppMethodBeat.o(21467);
    }
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(21462);
    if (!this.mQm)
      if (paramObject == null)
      {
        ab.e("MicroMsg.ImageAdapter", "[destroyItem] position:%s", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(21462);
      }
    while (true)
    {
      return;
      if (this.mQp != null)
        ab.i("MicroMsg.ImageAdapter", "[destroyItem] position:%s object:%s lastVisableView:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramObject.hashCode()), Integer.valueOf(this.mQp.hashCode()) });
      if ((paramObject != this.mQp) || (!this.mQq))
      {
        super.destroyItem(paramViewGroup, paramInt, paramObject);
        paramViewGroup.removeView((View)paramObject);
        AppMethodBeat.o(21462);
      }
      else
      {
        ab.d("MicroMsg.ImageAdapter", "[isSwap-destroyItem]");
        AppMethodBeat.o(21462);
        continue;
        super.destroyItem(paramViewGroup, paramInt, paramObject);
        AppMethodBeat.o(21462);
      }
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(21470);
    super.detach();
    this.mQt.detach();
    AppMethodBeat.o(21470);
  }

  public final int getCount()
  {
    AppMethodBeat.i(21463);
    int i;
    if (this.mQm)
    {
      i = this.mOH.size();
      AppMethodBeat.o(21463);
    }
    while (true)
    {
      return i;
      i = this.mQl.size();
      AppMethodBeat.o(21463);
    }
  }

  public final String getItem(int paramInt)
  {
    AppMethodBeat.i(21465);
    String str;
    if (this.mQm)
      if ((paramInt < 0) || (paramInt >= this.mOH.size()))
      {
        ab.w("MicroMsg.ImageAdapter", "error position %d, mediaitems size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mOH.size()) });
        str = "";
        AppMethodBeat.o(21465);
      }
    while (true)
    {
      return str;
      str = ((GalleryItem.MediaItem)this.mOH.get(paramInt)).fPT;
      AppMethodBeat.o(21465);
      continue;
      if ((paramInt < 0) || (paramInt >= this.mQl.size()))
      {
        ab.w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mQl.size()) });
        str = "";
        AppMethodBeat.o(21465);
      }
      else
      {
        str = (String)this.mQl.get(paramInt);
        AppMethodBeat.o(21465);
      }
    }
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(21461);
    if (!this.mQm)
    {
      ab.i("MicroMsg.ImageAdapter", "[instantiateItem] position:%s %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mQo) });
      if ((paramInt == this.mQo) && (this.mQq))
      {
        ab.d("MicroMsg.ImageAdapter", "[isSwap-instantiateItem]");
        this.yyK.put(this.mQp, Integer.valueOf(this.mQo));
        this.yyL.put(this.mQo, this.mQp);
        this.mQo = -1;
        this.mQq = false;
        paramViewGroup = this.mQp;
        AppMethodBeat.o(21461);
      }
    }
    while (true)
    {
      return paramViewGroup;
      paramViewGroup = super.instantiateItem(paramViewGroup, paramInt);
      AppMethodBeat.o(21461);
      continue;
      paramViewGroup = super.instantiateItem(paramViewGroup, paramInt);
      AppMethodBeat.o(21461);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(21469);
    detach();
    this.mQr.clear();
    this.mQn.clear();
    AppMethodBeat.o(21469);
  }

  public final MultiTouchImageView wx(int paramInt)
  {
    AppMethodBeat.i(21464);
    Object localObject = super.Fp(paramInt);
    if (localObject == null)
    {
      ab.e("MicroMsg.ImageAdapter", "position : %s getMultiTouchImageViewByPosition is null", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(21464);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      if ((localObject == null) || (((View)localObject).getVisibility() == 8))
      {
        AppMethodBeat.o(21464);
        localObject = null;
      }
      else
      {
        localObject = ((View)localObject).findViewById(2131820629);
        if (localObject == null)
        {
          AppMethodBeat.o(21464);
          localObject = null;
        }
        else
        {
          localObject = (MultiTouchImageView)localObject;
          AppMethodBeat.o(21464);
        }
      }
    }
  }

  public final WxImageView wy(int paramInt)
  {
    return null;
  }

  public final GalleryItem.MediaItem wz(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(21466);
    if (this.mQm)
      if ((paramInt < 0) || (paramInt >= this.mOH.size()))
      {
        ab.w("MicroMsg.ImageAdapter", "error position %d mediaitems size", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mOH.size()) });
        AppMethodBeat.o(21466);
      }
    while (true)
    {
      return localObject2;
      localObject2 = (GalleryItem.MediaItem)this.mOH.get(paramInt);
      AppMethodBeat.o(21466);
      continue;
      if ((paramInt < 0) || (paramInt >= this.mQl.size()))
      {
        ab.w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mQl.size()) });
        AppMethodBeat.o(21466);
      }
      else
      {
        String str = (String)this.mQl.get(paramInt);
        localObject2 = localObject1;
        if (com.tencent.mm.plugin.gallery.model.e.bCb() != null)
        {
          localObject2 = GalleryItem.MediaItem.a(0, 0L, str, str, "");
          paramInt = com.tencent.mm.plugin.gallery.model.e.bCb().indexOf(localObject2);
          localObject2 = localObject1;
          if (paramInt >= 0)
            localObject2 = (GalleryItem.MediaItem)com.tencent.mm.plugin.gallery.model.e.bCb().get(paramInt);
        }
        AppMethodBeat.o(21466);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.c
 * JD-Core Version:    0.6.2
 */