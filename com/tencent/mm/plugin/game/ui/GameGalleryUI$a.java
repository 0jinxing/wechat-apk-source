package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;

final class GameGalleryUI$a extends p
{
  Context mContext;
  private String[] njb;
  private View[] njc;

  public GameGalleryUI$a(Context paramContext, String[] paramArrayOfString)
  {
    AppMethodBeat.i(111964);
    this.njb = new String[0];
    this.mContext = paramContext;
    if (paramArrayOfString != null)
      this.njb = paramArrayOfString;
    this.njc = new View[this.njb.length];
    AppMethodBeat.o(111964);
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(111966);
    paramViewGroup.removeView((View)paramObject);
    AppMethodBeat.o(111966);
  }

  public final int getCount()
  {
    return this.njb.length;
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(111965);
    Object localObject1 = this.njc[paramInt];
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = View.inflate(this.mContext, 2130969719, null);
      this.njc[paramInt] = localObject2;
      ImageView localImageView = (ImageView)((View)localObject2).findViewById(2131824511);
      localObject1 = (ProgressBar)((View)localObject2).findViewById(2131824512);
      ((ProgressBar)localObject1).setVisibility(0);
      a locala = o.ahp();
      String str = this.njb[paramInt];
      c.a locala1 = new c.a();
      locala1.ePG = true;
      locala.a(str, localImageView, locala1.ahG(), new GameGalleryUI.a.1(this, (ProgressBar)localObject1));
    }
    paramViewGroup.addView((View)localObject2);
    ((View)localObject2).setOnClickListener(new GameGalleryUI.a.2(this));
    AppMethodBeat.o(111965);
    return localObject2;
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameGalleryUI.a
 * JD-Core Version:    0.6.2
 */