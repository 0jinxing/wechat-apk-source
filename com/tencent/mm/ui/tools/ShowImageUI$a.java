package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.gif.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class ShowImageUI$a extends BaseAdapter
{
  String imagePath;

  private ShowImageUI$a(ShowImageUI paramShowImageUI)
  {
  }

  public final int getCount()
  {
    return 1;
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(34995);
    Object localObject;
    if (r.amo(this.imagePath))
    {
      localObject = paramViewGroup.getContext();
      paramViewGroup = this.imagePath;
      new f(paramViewGroup);
      if ((paramView == null) || (!(paramView instanceof MMAnimateView)))
      {
        paramView = new MMAnimateView((Context)localObject);
        paramView.eE(paramViewGroup, paramViewGroup);
        paramView.a(paramViewGroup, new ShowImageUI.a.1(this, paramView));
        paramView.stop();
        paramView.start();
        AppMethodBeat.o(34995);
      }
    }
    while (true)
    {
      return paramView;
      paramView = (MMAnimateView)paramView;
      break;
      localObject = x.vv(this.imagePath);
      if (localObject != null)
        break label186;
      ab.w("MicroMsg.ShowImageUI", "get image fail");
      if (paramView != null)
      {
        localObject = paramView;
        if (!(paramView instanceof MultiTouchImageView));
      }
      else
      {
        localObject = View.inflate(paramViewGroup.getContext(), 2130970678, null);
      }
      ((ImageView)((View)localObject).findViewById(2131822184)).setImageResource(2131231218);
      ((View)localObject).setLayoutParams(new Gallery.LayoutParams(-1, -1));
      AppMethodBeat.o(34995);
      paramView = (View)localObject;
    }
    label186: paramViewGroup = paramViewGroup.getContext();
    if ((paramView == null) || (!(paramView instanceof MultiTouchImageView)))
      paramView = new MultiTouchImageView(paramViewGroup, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
    while (true)
    {
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      paramView.setImageBitmap((Bitmap)localObject);
      paramView.setMaxZoomDoubleTab(true);
      AppMethodBeat.o(34995);
      break;
      paramView = (MultiTouchImageView)paramView;
      paramView.bW(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShowImageUI.a
 * JD-Core Version:    0.6.2
 */