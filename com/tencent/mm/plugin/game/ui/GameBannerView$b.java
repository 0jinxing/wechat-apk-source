package com.tencent.mm.plugin.game.ui;

import android.graphics.drawable.Drawable;
import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class GameBannerView$b extends p
{
  private GameBannerView$b(GameBannerView paramGameBannerView)
  {
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(111719);
    int i = GameBannerView.b(this.neI).size();
    paramViewGroup.removeView((View)paramObject);
    ab.i("MicroMsg.GameBannerView", "destroyItem : new positon = %d, now position = %d", new Object[] { Integer.valueOf(paramInt % i), Integer.valueOf(paramInt) });
    AppMethodBeat.o(111719);
  }

  public final int getCount()
  {
    AppMethodBeat.i(111721);
    int i;
    if (GameBannerView.b(this.neI).size() <= 1)
    {
      i = GameBannerView.b(this.neI).size();
      AppMethodBeat.o(111721);
    }
    while (true)
    {
      return i;
      i = GameBannerView.b(this.neI).size() * 1000 * 2;
      AppMethodBeat.o(111721);
    }
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(111720);
    int i = paramInt % GameBannerView.b(this.neI).size();
    View localView = View.inflate(GameBannerView.d(this.neI), 2130969652, null);
    localView.setTag(GameBannerView.b(this.neI).get(i));
    localView.setOnClickListener(this.neI);
    ImageView localImageView = (ImageView)localView.findViewById(2131824294);
    String str = ((GameBannerView.a)GameBannerView.b(this.neI).get(i)).fqw;
    Drawable localDrawable = localImageView.getDrawable();
    if ((localDrawable != null) && ((localDrawable instanceof j)))
      ((j)localDrawable).setUrl(str);
    try
    {
      while (true)
      {
        paramViewGroup.addView(localView, 0);
        ab.i("MicroMsg.GameBannerView", "instantiateItem : new positon = %d, now position = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
        AppMethodBeat.o(111720);
        return localView;
        localImageView.setImageDrawable(new j(str, (byte)0));
      }
    }
    catch (Exception paramViewGroup)
    {
      while (true)
        ab.e("MicroMsg.GameBannerView", "add view failed, " + paramViewGroup.getMessage());
    }
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameBannerView.b
 * JD-Core Version:    0.6.2
 */