package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ag;
import com.tencent.mm.plugin.game.d.j;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class f extends LinearLayout
  implements View.OnClickListener
{
  private String mAppId;
  private Context mContext;
  private LayoutInflater mInflater;
  private int mXC;

  public f(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(111740);
    this.mContext = paramContext;
    this.mInflater = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    setOrientation(0);
    AppMethodBeat.o(111740);
  }

  public final void a(ag paramag, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111741);
    if ((paramag == null) || (bo.ek(paramag.naO)))
    {
      setVisibility(8);
      AppMethodBeat.o(111741);
    }
    while (true)
    {
      return;
      if (paramag.naO.size() == 1)
      {
        paramag.naO.add(null);
        paramag.naO.add(null);
      }
      LinearLayout localLinearLayout;
      ImageView localImageView;
      TextView localTextView1;
      TextView localTextView2;
      while (true)
      {
        this.mAppId = paramString;
        this.mXC = paramInt2;
        Iterator localIterator = paramag.naO.iterator();
        while (true)
        {
          if (!localIterator.hasNext())
            break label334;
          paramag = (j)localIterator.next();
          localLinearLayout = (LinearLayout)this.mInflater.inflate(2130969660, this, false);
          addView(localLinearLayout, new LinearLayout.LayoutParams(-2, -2, 1.0F));
          localImageView = (ImageView)localLinearLayout.findViewById(2131824313);
          localTextView1 = (TextView)localLinearLayout.findViewById(2131824314);
          localTextView2 = (TextView)localLinearLayout.findViewById(2131824315);
          if (paramag != null)
            break;
          localImageView.setImageResource(2130838996);
          localTextView1.setText(2131300360);
          localTextView1.setTextColor(this.mContext.getResources().getColor(2131690105));
        }
        if (paramag.naO.size() == 2)
          paramag.naO.add(null);
      }
      localLinearLayout.setOnClickListener(this);
      e.bFH().h(localImageView, paramag.IconUrl);
      localTextView1.setText(paramag.Title);
      if (!bo.isNullOrNil(paramag.Desc))
      {
        localTextView2.setText(paramag.Desc);
        localTextView2.setVisibility(0);
      }
      while (true)
      {
        localLinearLayout.setTag(paramag);
        if (paramInt1 != 2)
          break;
        a.a(this.mContext, 10, 1002, paramag.mZN, paramString, paramInt2, a.kY(paramag.mZL));
        break;
        localTextView2.setVisibility(8);
      }
      label334: AppMethodBeat.o(111741);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111742);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof j)))
    {
      ab.w("MicroMsg.GameBlockEntranceView", "getTag is null");
      AppMethodBeat.o(111742);
    }
    while (true)
    {
      return;
      paramView = (j)paramView.getTag();
      if (bo.isNullOrNil(paramView.mZj))
      {
        ab.w("MicroMsg.GameBlockEntranceView", "jumpUrl is null");
        AppMethodBeat.o(111742);
      }
      else
      {
        int i = c.t(this.mContext, paramView.mZj, "game_center_mygame_comm");
        b.a(this.mContext, 10, 1002, paramView.mZN, i, this.mAppId, this.mXC, a.kY(paramView.mZL));
        AppMethodBeat.o(111742);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.f
 * JD-Core Version:    0.6.2
 */