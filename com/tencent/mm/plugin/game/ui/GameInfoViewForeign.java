package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.sdk.platformtools.ab;

public class GameInfoViewForeign extends RelativeLayout
{
  private int edE;
  private Context mContext;
  private int mXC;
  private TextView njq;
  private int njr;
  private View.OnClickListener njs;

  public GameInfoViewForeign(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(111993);
    this.mXC = 0;
    this.edE = 0;
    this.njr = 2;
    this.njs = new GameInfoViewForeign.1(this);
    this.mContext = paramContext;
    AppMethodBeat.o(111993);
  }

  public final void bFo()
  {
    AppMethodBeat.i(111995);
    this.edE = ((c)g.K(c.class)).bCY().bEw();
    if ((this.edE > 0) && (this.edE <= 99))
    {
      this.njq.setVisibility(0);
      this.njq.setText(this.edE);
      AppMethodBeat.o(111995);
    }
    while (true)
    {
      return;
      if (this.edE > 99)
      {
        this.njq.setVisibility(0);
        this.njq.setText("99+");
        this.njq.setTextSize(1, 9.0F);
        AppMethodBeat.o(111995);
      }
      else
      {
        this.njq.setVisibility(4);
        AppMethodBeat.o(111995);
      }
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111994);
    super.onFinishInflate();
    setOnClickListener(this.njs);
    this.njq = ((TextView)findViewById(2131824385));
    bFo();
    ab.i("MicroMsg.GameInfoViewForeign", "initView finished");
    AppMethodBeat.o(111994);
  }

  public void setSourceScene(int paramInt)
  {
    this.mXC = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameInfoViewForeign
 * JD-Core Version:    0.6.2
 */