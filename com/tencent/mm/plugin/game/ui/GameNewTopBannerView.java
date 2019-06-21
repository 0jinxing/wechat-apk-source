package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class GameNewTopBannerView extends FrameLayout
  implements View.OnClickListener
{
  String hxK = null;
  Context mContext;
  int mXC;
  ImageView nfJ;
  ImageView nfK;
  int nlw;
  int nlx;
  String nly = "";
  private String nlz = "";

  public GameNewTopBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  static void bFw()
  {
    AppMethodBeat.i(112124);
    GameIndexListView.setDefaultPadding(0);
    GameIndexListView.setInitPadding(0);
    GameIndexListView.setCanPulldown(false);
    AppMethodBeat.o(112124);
  }

  final int b(ImageView paramImageView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112122);
    int i = c.getScreenWidth(this.mContext);
    ViewGroup.LayoutParams localLayoutParams = paramImageView.getLayoutParams();
    if (localLayoutParams == null)
    {
      ab.e("MicroMsg.GameTopBannerView", "resizeGameThemePic, params is null");
      paramInt1 = 0;
      AppMethodBeat.o(112122);
    }
    while (true)
    {
      return paramInt1;
      float f = paramInt1 / paramInt2;
      localLayoutParams.height = ((int)(i * f));
      paramImageView.setLayoutParams(localLayoutParams);
      paramImageView.setScaleType(ImageView.ScaleType.FIT_XY);
      paramInt1 = localLayoutParams.height;
      AppMethodBeat.o(112122);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(112123);
    if ((paramView.getTag() != null) && ((paramView.getTag() instanceof String)))
    {
      paramView = (String)paramView.getTag();
      if (!bo.isNullOrNil(paramView))
      {
        int i = c.t(this.mContext, paramView, "game_center_top_banner");
        b.a(this.mContext, 10, 1017, 1, i, 0, null, this.mXC, 0, null, null, this.hxK);
      }
    }
    AppMethodBeat.o(112123);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112121);
    super.onFinishInflate();
    this.nfJ = ((ImageView)findViewById(2131824486));
    this.nfK = ((ImageView)findViewById(2131824535));
    ab.i("MicroMsg.GameTopBannerView", "initView finished");
    AppMethodBeat.o(112121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameNewTopBannerView
 * JD-Core Version:    0.6.2
 */