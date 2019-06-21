package com.tencent.mm.ui.widget.sortlist;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

public class d
  implements DragSortListView.i
{
  private ImageView ikh;
  private ListView mListView;
  private Bitmap zWg;
  int zWh = -16777216;

  public d(ListView paramListView)
  {
    this.mListView = paramListView;
  }

  public final View Qw(int paramInt)
  {
    AppMethodBeat.i(113109);
    Object localObject = this.mListView;
    localObject = ((ListView)localObject).getChildAt(((ListView)localObject).getHeaderViewsCount() + paramInt - this.mListView.getFirstVisiblePosition());
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(113109);
    }
    while (true)
    {
      return localObject;
      ((View)localObject).setPressed(false);
      ((View)localObject).setDrawingCacheEnabled(true);
      this.zWg = Bitmap.createBitmap(((View)localObject).getDrawingCache());
      ((View)localObject).setDrawingCacheEnabled(false);
      if (this.ikh == null)
        this.ikh = new ImageView(this.mListView.getContext());
      this.ikh.setBackgroundColor(this.zWh);
      this.ikh.setPadding(0, 0, 0, 0);
      this.ikh.setImageBitmap(this.zWg);
      this.ikh.setLayoutParams(new ViewGroup.LayoutParams(((View)localObject).getWidth(), ((View)localObject).getHeight()));
      localObject = this.ikh;
      AppMethodBeat.o(113109);
    }
  }

  public final void fr(View paramView)
  {
    AppMethodBeat.i(113110);
    if ((paramView instanceof ImageView))
      ((ImageView)paramView).setImageDrawable(null);
    ai.i("MicroMsg.SimpleFloatViewManager", "bitmap recycle %s", new Object[] { this.zWg.toString() });
    this.zWg.recycle();
    this.zWg = null;
    AppMethodBeat.o(113110);
  }

  public void h(Point paramPoint)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.d
 * JD-Core Version:    0.6.2
 */