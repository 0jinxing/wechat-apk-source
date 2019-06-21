package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.game.d.dj;
import com.tencent.mm.plugin.game.d.dk;
import com.tencent.mm.plugin.game.model.aa;
import com.tencent.mm.plugin.game.model.aa.a;
import com.tencent.mm.sdk.platformtools.ab;

public class GameDetailRankLikeView extends LinearLayout
  implements View.OnClickListener
{
  String mAppId;
  private int mXC;
  aa ngr;
  aa.a ngs;
  private Drawable ngt;
  private Drawable ngu;
  private Animation ngv;
  private ImageView ngw;
  private TextView ngx;

  public GameDetailRankLikeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void hU(boolean paramBoolean)
  {
    AppMethodBeat.i(111820);
    if (paramBoolean)
    {
      this.ngw.setImageDrawable(this.ngt);
      AppMethodBeat.o(111820);
    }
    while (true)
    {
      return;
      this.ngw.setImageDrawable(this.ngu);
      AppMethodBeat.o(111820);
    }
  }

  private void setCount(int paramInt)
  {
    AppMethodBeat.i(111821);
    if (paramInt > 99)
    {
      this.ngx.setText("99+");
      AppMethodBeat.o(111821);
    }
    while (true)
    {
      return;
      if (paramInt == 0)
      {
        this.ngx.setText("");
        AppMethodBeat.o(111821);
      }
      else
      {
        this.ngx.setText(String.valueOf(paramInt));
        AppMethodBeat.o(111821);
      }
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111822);
    if (r.Yz().equals(this.ngs.cIS))
    {
      if (this.ngs.mXQ <= 0)
        break label246;
      paramView = new Intent(getContext(), GameDetailRankLikedUI.class);
      paramView.putExtra("extra_appdi", this.mAppId);
      getContext().startActivity(paramView);
      AppMethodBeat.o(111822);
    }
    while (true)
    {
      return;
      if (!this.ngs.mXR)
      {
        this.ngs.mXR = true;
        paramView = this.ngs;
        paramView.mXQ += 1;
        this.ngr.bEI();
        paramView = this.mAppId;
        String str = this.ngs.cIS;
        Object localObject = new b.a();
        ((b.a)localObject).fsJ = new dj();
        ((b.a)localObject).fsK = new dk();
        ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/upfriend";
        ((b.a)localObject).fsI = 1330;
        localObject = ((b.a)localObject).acD();
        dj localdj = (dj)((com.tencent.mm.ai.b)localObject).fsG.fsP;
        localdj.mZr = paramView;
        localdj.ndF = str;
        w.a((com.tencent.mm.ai.b)localObject, new w.a()
        {
          public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.b paramAnonymousb, m paramAnonymousm)
          {
            AppMethodBeat.i(111817);
            if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
            {
              ab.e("MicroMsg.GameDetailRankLikeView", "CGI return is not OK. (%d, %d)(%s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
              AppMethodBeat.o(111817);
            }
            while (true)
            {
              return 0;
              AppMethodBeat.o(111817);
            }
          }
        });
        com.tencent.mm.plugin.game.e.b.a(getContext(), 12, 1203, 1, 2, this.mAppId, this.mXC, null);
        resetState();
        this.ngw.startAnimation(this.ngv);
      }
      label246: AppMethodBeat.o(111822);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111818);
    super.onFinishInflate();
    this.ngt = getContext().getResources().getDrawable(2130838975);
    this.ngu = getContext().getResources().getDrawable(2130838974);
    this.ngv = AnimationUtils.loadAnimation(getContext(), 2131034245);
    inflate(getContext(), 2130969695, this);
    setOnClickListener(this);
    this.ngw = ((ImageView)findViewById(2131824459));
    this.ngx = ((TextView)findViewById(2131824460));
    AppMethodBeat.o(111818);
  }

  final void resetState()
  {
    AppMethodBeat.i(111819);
    if (this.ngs != null)
    {
      hU(this.ngs.mXR);
      setCount(this.ngs.mXQ);
      AppMethodBeat.o(111819);
    }
    while (true)
    {
      return;
      setVisibility(8);
      AppMethodBeat.o(111819);
    }
  }

  public void setSourceScene(int paramInt)
  {
    this.mXC = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailRankLikeView
 * JD-Core Version:    0.6.2
 */