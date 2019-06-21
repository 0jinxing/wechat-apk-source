package com.tencent.mm.plugin.subapp.ui.gallery;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.SpinnerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.x;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.n;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.vfs.e;
import java.util.List;

final class GestureGalleryUI$a extends BaseAdapter
{
  public GestureGalleryUI$a(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  private View Fp(int paramInt)
  {
    AppMethodBeat.i(25399);
    int i = GestureGalleryUI.a(this.sum).getFirstVisiblePosition();
    int j = GestureGalleryUI.a(this.sum).getChildCount();
    View localView;
    if ((paramInt < i) || (paramInt > j + i - 1))
    {
      localView = GestureGalleryUI.a(this.sum).getAdapter().getView(paramInt, null, GestureGalleryUI.a(this.sum));
      AppMethodBeat.o(25399);
    }
    while (true)
    {
      return localView;
      localView = GestureGalleryUI.a(this.sum).getChildAt(paramInt - i);
      AppMethodBeat.o(25399);
    }
  }

  public final View cDI()
  {
    AppMethodBeat.i(25398);
    View localView = Fp(this.sum.stT.getSelectedItemPosition());
    AppMethodBeat.o(25398);
    return localView;
  }

  public final int getCount()
  {
    AppMethodBeat.i(25396);
    ab.d("MicroMsg.GestureGalleryUI", "lstpicurl:" + GestureGalleryUI.q(this.sum).size());
    int i = GestureGalleryUI.q(this.sum).size();
    AppMethodBeat.o(25396);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(25397);
    AppMethodBeat.o(25397);
    return Integer.valueOf(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(25400);
    GestureGalleryUI.a.a locala;
    if (paramView == null)
    {
      locala = new GestureGalleryUI.a.a(this);
      paramView = View.inflate(this.sum, 2130970459, null);
      locala.rte = ((ProgressBar)paramView.findViewById(2131821219));
      locala.suq = ((MMAnimateView)paramView.findViewById(2131820629));
      paramView.setTag(locala);
    }
    Object localObject1;
    while (true)
    {
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      paramViewGroup = (String)GestureGalleryUI.q(this.sum).get(paramInt);
      localObject1 = paramViewGroup;
      if (!e.ct(paramViewGroup))
        localObject1 = GestureGalleryUI.t(this.sum).c(paramViewGroup, GestureGalleryUI.r(this.sum), paramInt, GestureGalleryUI.s(this.sum));
      if (bo.isNullOrNil((String)localObject1))
        break label610;
      locala.rte.setVisibility(8);
      if (localObject1 != null)
        break;
      paramViewGroup = null;
      if ((!GestureGalleryUI.u(this.sum)) || ((paramViewGroup != null) && (!paramViewGroup.isRecycled())))
        break label355;
      this.sum.finish();
      AppMethodBeat.o(25400);
      return paramView;
      locala = (GestureGalleryUI.a.a)paramView.getTag();
    }
    paramViewGroup = new BitmapFactory.Options();
    paramViewGroup.inJustDecodeBounds = true;
    paramViewGroup = BitmapFactory.decodeFile((String)localObject1, paramViewGroup);
    if (paramViewGroup != null)
    {
      ab.i("MicroMsg.GestureGalleryUI", "recycle bitmap:%s", new Object[] { paramViewGroup.toString() });
      paramViewGroup.recycle();
    }
    paramViewGroup = d.aml((String)localObject1);
    Object localObject2 = paramViewGroup;
    if (paramViewGroup == null)
    {
      localObject2 = paramViewGroup;
      if (MMNativeJpeg.IsJpegFile((String)localObject1))
      {
        localObject2 = paramViewGroup;
        if (MMNativeJpeg.isProgressive((String)localObject1))
        {
          localObject2 = MMNativeJpeg.decodeAsBitmap((String)localObject1);
          if (localObject2 != null)
            break label349;
        }
      }
    }
    label349: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.GestureGalleryUI", "Progressive jpeg, result isNull:%b", new Object[] { Boolean.valueOf(bool) });
      paramViewGroup = (ViewGroup)localObject2;
      if (localObject2 != null)
        break;
      ab.e("MicroMsg.GestureGalleryUI", "getSuitableBmp fail, temBmp is null, filePath = ".concat(String.valueOf(localObject1)));
      paramViewGroup = null;
      break;
    }
    label355: if ((paramViewGroup != null) && (!paramViewGroup.isRecycled()) && ((paramViewGroup.getWidth() > 1024) || (paramViewGroup.getHeight() > 1024)));
    for (int i = 1; ; i = 0)
    {
      if ((i == 0) && (r.amo((String)localObject1)))
        if (paramInt == GestureGalleryUI.v(this.sum))
          GestureGalleryUI.w(this.sum);
      while (true)
      {
        try
        {
          MMAnimateView localMMAnimateView = locala.suq;
          localObject2 = new android/widget/LinearLayout$LayoutParams;
          ((LinearLayout.LayoutParams)localObject2).<init>(-1, -1);
          localMMAnimateView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          locala.suq.setVisibility(0);
          locala.suq.setImageFilePath((String)localObject1);
          AppMethodBeat.o(25400);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.GestureGalleryUI", bo.l(localException));
          locala.suq.setVisibility(0);
          locala.suq.setImageBitmap(paramViewGroup);
          continue;
        }
        if ((paramViewGroup != null) && (!paramViewGroup.isRecycled()))
        {
          locala.suq.setVisibility(8);
          paramView = new MultiTouchImageView(this.sum, paramViewGroup.getWidth(), paramViewGroup.getHeight());
          if (Build.VERSION.SDK_INT == 20)
            paramView.setLayerType(1, null);
          while (true)
          {
            paramView.setEnableHorLongBmpMode(false);
            paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            paramView.setImageBitmap(paramViewGroup);
            AppMethodBeat.o(25400);
            break;
            n.w(paramView, paramViewGroup.getWidth(), paramViewGroup.getHeight());
          }
          label610: locala.rte.setVisibility(0);
          locala.suq.setVisibility(8);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.a
 * JD-Core Version:    0.6.2
 */