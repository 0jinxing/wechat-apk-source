package com.tencent.mm.plugin.card.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class CardGiftImageUI$a extends BaseAdapter
{
  private CardGiftImageUI$a(CardGiftImageUI paramCardGiftImageUI)
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
    AppMethodBeat.i(88402);
    Object localObject = x.vv(CardGiftImageUI.b(this.kkv));
    if (localObject == null)
    {
      ab.w("MicroMsg.CardGiftImageUI", "get image fail");
      if (paramView != null)
      {
        localObject = paramView;
        if (!(paramView instanceof MultiTouchImageView));
      }
      else
      {
        localObject = View.inflate(paramViewGroup.getContext(), 2130968942, null);
        ((ImageView)((View)localObject).findViewById(2131822184)).setImageResource(2131231218);
        ((View)localObject).setLayoutParams(new Gallery.LayoutParams(-1, -1));
      }
      AppMethodBeat.o(88402);
      paramView = (View)localObject;
      return paramView;
    }
    paramViewGroup = paramViewGroup.getContext();
    if ((paramView == null) || (!(paramView instanceof MultiTouchImageView)))
      paramView = new MultiTouchImageView(paramViewGroup, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
    while (true)
    {
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      paramView.setImageBitmap((Bitmap)localObject);
      paramView.setMaxZoomDoubleTab(true);
      AppMethodBeat.o(88402);
      break;
      paramView = (MultiTouchImageView)paramView;
      paramView.bW(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftImageUI.a
 * JD-Core Version:    0.6.2
 */