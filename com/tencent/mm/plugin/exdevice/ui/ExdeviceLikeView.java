package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class ExdeviceLikeView extends RelativeLayout
{
  private int lBb;
  private ExdeviceLikeView.a lBc;
  private int lBd;
  private TextView lBe;
  private ImageView lBf;
  private ProgressBar lBg;
  private Context mContext;

  public ExdeviceLikeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public ExdeviceLikeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(19977);
    this.lBd = 2;
    this.mContext = paramContext;
    paramContext = LayoutInflater.from(this.mContext).inflate(2130969424, this, true);
    this.lBe = ((TextView)paramContext.findViewById(2131823663));
    this.lBf = ((ImageView)paramContext.findViewById(2131823664));
    this.lBg = ((ProgressBar)paramContext.findViewById(2131823665));
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(19976);
        if (ExdeviceLikeView.a(ExdeviceLikeView.this) != null)
        {
          paramAnonymousView = ExdeviceLikeView.a(ExdeviceLikeView.this);
          ExdeviceLikeView.b(ExdeviceLikeView.this);
          if ((!paramAnonymousView.bpL()) && (ExdeviceLikeView.b(ExdeviceLikeView.this) == 0))
          {
            ab.d("MicroMsg.ExdeviceLikeView", "click listener is not null");
            ExdeviceLikeView.this.setSelfLikeState(ExdeviceLikeView.uS(ExdeviceLikeView.b(ExdeviceLikeView.this)));
            if (ExdeviceLikeView.b(ExdeviceLikeView.this) == 1)
              ExdeviceLikeView.c(ExdeviceLikeView.this);
            if (ExdeviceLikeView.a(ExdeviceLikeView.this) == null)
              break label136;
            ExdeviceLikeView.a(ExdeviceLikeView.this).iE(ExdeviceLikeView.b(ExdeviceLikeView.this));
            AppMethodBeat.o(19976);
          }
        }
        while (true)
        {
          return;
          ab.d("MicroMsg.ExdeviceLikeView", "hy: loading or has liked or consumed. abort event");
          label136: AppMethodBeat.o(19976);
        }
      }
    });
    AppMethodBeat.o(19977);
  }

  public void setLikeNum(int paramInt)
  {
    AppMethodBeat.i(19978);
    this.lBb = paramInt;
    String str = this.lBb;
    if (this.lBb < 0)
    {
      ab.w("MicroMsg.ExdeviceLikeView", "hy: like num is negative. set to 0");
      str = "0";
      if (this.lBb > 0)
        break label97;
      this.lBe.setVisibility(8);
    }
    while (true)
    {
      this.lBe.setText(str);
      AppMethodBeat.o(19978);
      return;
      if (paramInt <= 999)
        break;
      ab.d("MicroMsg.ExdeviceLikeView", "hy: like num exceeded the limit. put plus");
      str = "999+";
      break;
      label97: this.lBe.setVisibility(0);
    }
  }

  public void setOnLikeViewClickListener(ExdeviceLikeView.a parama)
  {
    this.lBc = parama;
  }

  public void setSelfLikeState(int paramInt)
  {
    AppMethodBeat.i(19979);
    this.lBd = paramInt;
    if (this.lBd == 1)
    {
      this.lBg.setVisibility(8);
      this.lBe.setVisibility(0);
      this.lBf.setVisibility(0);
      this.lBf.setImageResource(2131231212);
      AppMethodBeat.o(19979);
    }
    while (true)
    {
      return;
      if (this.lBd == 0)
      {
        this.lBg.setVisibility(8);
        this.lBe.setVisibility(0);
        this.lBf.setVisibility(0);
        this.lBf.setImageResource(2131231213);
        AppMethodBeat.o(19979);
      }
      else if (this.lBd == 2)
      {
        this.lBe.setVisibility(8);
        this.lBg.setVisibility(0);
        this.lBf.setVisibility(8);
        AppMethodBeat.o(19979);
      }
      else
      {
        ab.w("MicroMsg.ExdeviceLikeView", "hy: error state");
        AppMethodBeat.o(19979);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView
 * JD-Core Version:    0.6.2
 */