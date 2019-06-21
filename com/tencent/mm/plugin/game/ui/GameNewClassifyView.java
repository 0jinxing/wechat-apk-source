package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.dh;
import com.tencent.mm.plugin.game.d.di;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameNewClassifyView extends LinearLayout
  implements View.OnClickListener
{
  private LayoutInflater ezi;
  private int mXC;
  private LinearLayout mpt;

  public GameNewClassifyView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(di paramdi, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112119);
    if ((paramdi == null) || (bo.ek(paramdi.naO)))
    {
      setVisibility(8);
      AppMethodBeat.o(112119);
    }
    while (true)
    {
      return;
      this.mXC = paramInt2;
      if (this.ezi == null)
        this.ezi = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
      this.mpt.removeAllViews();
      Object localObject;
      while (this.mpt.getChildCount() < paramdi.naO.size())
      {
        localObject = (LinearLayout)this.ezi.inflate(2130969762, this, false);
        ((LinearLayout)localObject).setOnClickListener(this);
        this.mpt.addView((View)localObject, new LinearLayout.LayoutParams(-2, -2, 1.0F));
      }
      paramInt2 = 0;
      if (paramInt2 < this.mpt.getChildCount())
      {
        if (paramInt2 < paramdi.naO.size())
          this.mpt.getChildAt(paramInt2).setVisibility(0);
        while (true)
        {
          paramInt2++;
          break;
          this.mpt.getChildAt(paramInt2).setVisibility(8);
        }
      }
      for (paramInt2 = 0; paramInt2 < paramdi.naO.size(); paramInt2++)
      {
        LinearLayout localLinearLayout = (LinearLayout)this.mpt.getChildAt(paramInt2);
        localObject = (ImageView)localLinearLayout.findViewById(2131824407);
        TextView localTextView = (TextView)localLinearLayout.findViewById(2131824408);
        e.bFH().h((ImageView)localObject, ((dh)paramdi.naO.get(paramInt2)).IconUrl);
        localTextView.setText(((dh)paramdi.naO.get(paramInt2)).Title);
        localLinearLayout.setTag(new GameNewClassifyView.a(((dh)paramdi.naO.get(paramInt2)).mZj, paramInt2 + 1, ((dh)paramdi.naO.get(paramInt2)).mZL));
      }
      setVisibility(0);
      if (paramInt1 == 2)
        a.a(getContext(), 10, 1019, 0, null, this.mXC, null);
      AppMethodBeat.o(112119);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(112120);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof GameNewClassifyView.a)))
      AppMethodBeat.o(112120);
    while (true)
    {
      return;
      paramView = (GameNewClassifyView.a)paramView.getTag();
      if (!bo.isNullOrNil(paramView.url))
      {
        c.ax(getContext(), paramView.url);
        b.a(getContext(), 10, 1019, paramView.position, 7, null, this.mXC, a.kY(paramView.extInfo));
      }
      AppMethodBeat.o(112120);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112118);
    super.onFinishInflate();
    this.ezi = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
    this.mpt = ((LinearLayout)findViewById(2131824406));
    AppMethodBeat.o(112118);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameNewClassifyView
 * JD-Core Version:    0.6.2
 */