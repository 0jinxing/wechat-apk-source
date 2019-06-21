package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ah;
import com.tencent.mm.plugin.game.d.cx;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameRecomBlockView extends LinearLayout
  implements View.OnClickListener
{
  private ViewGroup mContainer;
  private Context mContext;
  private LayoutInflater mInflater;
  int mXC;

  public GameRecomBlockView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112150);
    setOrientation(1);
    this.mContext = paramContext;
    this.mInflater = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
    this.mContainer = this;
    AppMethodBeat.o(112150);
  }

  final void a(ah paramah, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112152);
    this.mContainer.removeAllViews();
    if (bo.ek(paramah.naO))
    {
      setVisibility(8);
      AppMethodBeat.o(112152);
    }
    while (true)
    {
      return;
      if (paramInt1 == 2)
        com.tencent.mm.plugin.game.e.a.a(this.mContext, 10, 1021, 0, null, paramInt2, com.tencent.mm.plugin.game.e.a.kY(paramah.mZL));
      this.mInflater.inflate(2130969663, this, true);
      Object localObject1 = (TextView)findViewById(2131824320);
      LinearLayout localLinearLayout = (LinearLayout)findViewById(2131824321);
      Object localObject2 = findViewById(2131824322);
      TextView localTextView1 = (TextView)findViewById(2131824323);
      label152: int i;
      int j;
      label190: int k;
      Object localObject3;
      TextView localTextView2;
      if (!bo.isNullOrNil(paramah.mZM))
      {
        ((TextView)localObject1).setText(paramah.mZM);
        if (bo.isNullOrNil(paramah.naP))
          break label499;
        localTextView1.setText(paramah.naP);
        ((View)localObject2).setTag(new GameRecomBlockView.a(null, 999, paramah.naQ, paramah.mZL, "game_center_mygame_more"));
        ((View)localObject2).setOnClickListener(this);
        i = 0;
        j = 0;
        if (j >= paramah.naO.size())
          break label579;
        localObject2 = (cx)paramah.naO.get(j);
        k = i;
        if (localObject2 != null)
        {
          if (localLinearLayout.getChildCount() >= 3)
            break label579;
          i++;
          localObject3 = (LinearLayout)this.mInflater.inflate(2130969664, this, false);
          ((LinearLayout)localObject3).setTag(new GameRecomBlockView.a(((cx)localObject2).fKh, i, ((cx)localObject2).mZj, ((cx)localObject2).mZL, "game_center_mygame_rank"));
          ((LinearLayout)localObject3).setOnClickListener(this);
          localLinearLayout.addView((View)localObject3, new LinearLayout.LayoutParams(-1, -2, 1.0F));
          localTextView2 = (TextView)((LinearLayout)localObject3).findViewById(2131824324);
          localObject1 = (ImageView)((LinearLayout)localObject3).findViewById(2131824325);
          localTextView1 = (TextView)((LinearLayout)localObject3).findViewById(2131824326);
          localObject3 = (TextView)((LinearLayout)localObject3).findViewById(2131824327);
          switch (j)
          {
          default:
            label384: localTextView2.setText(((cx)localObject2).Title);
            e.bFH().h((ImageView)localObject1, ((cx)localObject2).mZi);
            localTextView1.setText(((cx)localObject2).ncH);
            if (!bo.isNullOrNil(((cx)localObject2).Desc))
              ((TextView)localObject3).setText(((cx)localObject2).Desc);
            break;
          case 0:
          case 1:
          case 2:
          }
        }
      }
      while (true)
      {
        k = i;
        if (paramInt1 == 2)
        {
          com.tencent.mm.plugin.game.e.a.a(this.mContext, 10, 1021, i, ((cx)localObject2).fKh, paramInt2, com.tencent.mm.plugin.game.e.a.kY(((cx)localObject2).mZL));
          k = i;
        }
        j++;
        i = k;
        break label190;
        ((TextView)localObject1).setVisibility(8);
        break;
        label499: localTextView1.setVisibility(8);
        break label152;
        localTextView2.setTextColor(this.mContext.getResources().getColor(2131690097));
        break label384;
        localTextView2.setTextColor(this.mContext.getResources().getColor(2131690098));
        break label384;
        localTextView2.setTextColor(this.mContext.getResources().getColor(2131690099));
        break label384;
        ((TextView)localObject3).setVisibility(8);
      }
      label579: paramah = new View(getContext());
      paramah.setBackgroundColor(getContext().getResources().getColor(2131690081));
      addView(paramah, new LinearLayout.LayoutParams(-1, com.tencent.mm.bz.a.fromDPToPix(getContext(), 5)));
      AppMethodBeat.o(112152);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(112153);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof GameRecomBlockView.a)))
    {
      ab.w("MicroMsg.GameRecomBlockView", "getTag is null");
      AppMethodBeat.o(112153);
    }
    while (true)
    {
      return;
      paramView = (GameRecomBlockView.a)paramView.getTag();
      if (bo.isNullOrNil(paramView.jumpUrl))
      {
        ab.w("MicroMsg.GameRecomBlockView", "jumpUrl is null");
        AppMethodBeat.o(112153);
      }
      else
      {
        int i = c.t(this.mContext, paramView.jumpUrl, paramView.cMm);
        b.a(this.mContext, 10, 1021, paramView.mYy, i, paramView.appId, this.mXC, com.tencent.mm.plugin.game.e.a.kY(paramView.mVB));
        AppMethodBeat.o(112153);
      }
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112151);
    super.onFinishInflate();
    ab.i("MicroMsg.GameRecomBlockView", "initView finished");
    AppMethodBeat.o(112151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameRecomBlockView
 * JD-Core Version:    0.6.2
 */