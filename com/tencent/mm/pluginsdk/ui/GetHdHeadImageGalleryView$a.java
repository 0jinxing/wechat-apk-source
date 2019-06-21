package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class GetHdHeadImageGalleryView$a extends BaseAdapter
{
  private GetHdHeadImageGalleryView$a(GetHdHeadImageGalleryView paramGetHdHeadImageGalleryView)
  {
  }

  public final int getCount()
  {
    return 1;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(79681);
    AppMethodBeat.o(79681);
    return Integer.valueOf(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(79682);
    if (paramView == null)
    {
      paramViewGroup = new GetHdHeadImageGalleryView.a.a(this);
      paramView = View.inflate(this.vhx.getContext(), 2130971002, null);
      paramViewGroup.rte = ((ProgressBar)paramView.findViewById(2131828435));
      paramViewGroup.cDh = ((ImageView)paramView.findViewById(2131828433));
      paramViewGroup.vhy = paramView.findViewById(2131828434);
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      if (GetHdHeadImageGalleryView.d(this.vhx) == null)
        break;
      paramViewGroup.rte.setVisibility(8);
      paramViewGroup.cDh.setVisibility(8);
      paramViewGroup.vhy.setVisibility(8);
      paramView = new MultiTouchImageView(this.vhx.getContext(), GetHdHeadImageGalleryView.d(this.vhx).getWidth(), GetHdHeadImageGalleryView.d(this.vhx).getHeight());
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      paramView.setImageBitmap(GetHdHeadImageGalleryView.d(this.vhx));
      paramView.setMaxZoomLimit(2.0F);
      paramView.setMaxZoomDoubleTab(true);
      AppMethodBeat.o(79682);
      return paramView;
      paramViewGroup = (GetHdHeadImageGalleryView.a.a)paramView.getTag();
    }
    paramViewGroup.rte.setVisibility(0);
    paramViewGroup.vhy.setVisibility(0);
    if (GetHdHeadImageGalleryView.e(this.vhx) != null)
    {
      paramViewGroup.cDh.setVisibility(0);
      paramViewGroup.cDh.setImageBitmap(GetHdHeadImageGalleryView.e(this.vhx));
    }
    while (true)
    {
      AppMethodBeat.o(79682);
      break;
      paramViewGroup.cDh.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView.a
 * JD-Core Version:    0.6.2
 */