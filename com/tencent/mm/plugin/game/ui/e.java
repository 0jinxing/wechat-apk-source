package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.af;
import com.tencent.mm.plugin.game.d.db;
import com.tencent.mm.plugin.game.d.i;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e.a.a;
import com.tencent.mm.plugin.game.widget.EllipsizingTextView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class e extends LinearLayout
  implements View.OnClickListener
{
  private String mAppId;
  private Context mContext;
  private LayoutInflater mInflater;
  private int mXC;

  public e(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(111736);
    this.mContext = paramContext;
    this.mInflater = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    setOrientation(1);
    AppMethodBeat.o(111736);
  }

  private void n(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(111739);
    ImageView localImageView = (ImageView)this.mInflater.inflate(2130969702, paramViewGroup, false);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)localImageView.getLayoutParams();
    localMarginLayoutParams.leftMargin = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 20);
    localImageView.setLayoutParams(localMarginLayoutParams);
    paramViewGroup.addView(localImageView);
    AppMethodBeat.o(111739);
  }

  public final void a(af paramaf, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111737);
    if ((paramaf == null) || (bo.ek(paramaf.naO)))
    {
      setVisibility(8);
      AppMethodBeat.o(111737);
    }
    while (true)
    {
      return;
      this.mAppId = paramString;
      this.mXC = paramInt2;
      Iterator localIterator = paramaf.naO.iterator();
      while (localIterator.hasNext())
      {
        i locali = (i)localIterator.next();
        if (locali != null)
        {
          paramaf = new e.a.a();
          label112: Object localObject1;
          TextView localTextView2;
          Object localObject2;
          Object localObject3;
          switch (locali.mZQ)
          {
          default:
            if (paramInt1 == 2)
              com.tencent.mm.plugin.game.e.a.a(this.mContext, 10, 1002, locali.mZN, paramString, paramInt2, com.tencent.mm.plugin.game.e.a.kY(locali.mZL));
            break;
          case 1:
            if (locali.mZO != null)
            {
              n(this);
              localObject1 = this.mInflater.inflate(2130969658, this, false);
              TextView localTextView1 = (TextView)((View)localObject1).findViewById(2131824306);
              localTextView2 = (TextView)((View)localObject1).findViewById(2131824307);
              localObject2 = (EllipsizingTextView)((View)localObject1).findViewById(2131824308);
              ((EllipsizingTextView)localObject2).setMaxLines(2);
              localObject3 = (ImageView)((View)localObject1).findViewById(2131824305);
              localTextView1.setText(j.b(this.mContext, locali.mZM, localTextView1.getTextSize()));
              localTextView2.setText(j.b(this.mContext, locali.mZO.Title, localTextView2.getTextSize()));
              ((EllipsizingTextView)localObject2).setText(j.b(this.mContext, locali.mZO.Desc, ((EllipsizingTextView)localObject2).getTextSize()));
              if (!bo.isNullOrNil(locali.mZO.mZi))
                com.tencent.mm.plugin.game.f.e.bFH().a((ImageView)localObject3, locali.mZO.mZi, paramaf.bFI());
              while (true)
              {
                ((View)localObject1).setTag(new e.a(locali.mZN, locali.mZO.mZj, locali.mZL));
                ((View)localObject1).setOnClickListener(this);
                addView((View)localObject1);
                break;
                ((ImageView)localObject3).setVisibility(8);
              }
            }
            break;
          case 2:
            if (locali.mZP != null)
            {
              n(this);
              localObject3 = this.mInflater.inflate(2130969659, this, false);
              localTextView2 = (TextView)((View)localObject3).findViewById(2131824310);
              localObject2 = (TextView)((View)localObject3).findViewById(2131824312);
              localObject1 = (ImageView)((View)localObject3).findViewById(2131824311);
              localTextView2.setText(j.b(this.mContext, locali.mZM, localTextView2.getTextSize()));
              ((TextView)localObject2).setText(j.b(this.mContext, locali.mZP.Title, ((TextView)localObject2).getTextSize()));
              if (!bo.isNullOrNil(locali.mZP.mZi))
                if (locali.mZP.ndC == 1)
                {
                  paramaf.nnP = true;
                  paramaf.nnS = 2130838914;
                  label535: com.tencent.mm.plugin.game.f.e.bFH().a((ImageView)localObject1, locali.mZP.mZi, paramaf.bFI());
                }
              while (true)
              {
                ((View)localObject3).setTag(new e.a(locali.mZN, locali.mZP.mZj, locali.mZL));
                ((View)localObject3).setOnClickListener(this);
                addView((View)localObject3);
                break label112;
                break;
                paramaf.eQf = true;
                paramaf.nnS = 2130838913;
                break label535;
                ((ImageView)localObject1).setVisibility(8);
              }
            }
            break;
          }
        }
      }
      AppMethodBeat.o(111737);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111738);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof e.a)))
    {
      ab.w("MicroMsg.GameBlockContentView", "getTag is null");
      AppMethodBeat.o(111738);
    }
    while (true)
    {
      return;
      paramView = (e.a)paramView.getTag();
      if (bo.isNullOrNil(paramView.jumpUrl))
      {
        ab.w("MicroMsg.GameBlockContentView", "jumpUrl is null");
        AppMethodBeat.o(111738);
      }
      else
      {
        int i = c.t(this.mContext, paramView.jumpUrl, "game_center_mygame_comm");
        b.a(this.mContext, 10, 1002, paramView.mYy, i, this.mAppId, this.mXC, com.tencent.mm.plugin.game.e.a.kY(paramView.mVB));
        AppMethodBeat.o(111738);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.e
 * JD-Core Version:    0.6.2
 */