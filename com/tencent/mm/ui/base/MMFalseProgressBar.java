package com.tencent.mm.ui.base;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;

public class MMFalseProgressBar extends ProgressBar
{
  private float Yn;
  private float iUf;
  private float iUg;
  private float iUh;
  private float iUi;
  public boolean iUj;
  private ak mHandler;
  private boolean mIsStart;

  public MMFalseProgressBar(Context paramContext)
  {
    this(paramContext, null);
    AppMethodBeat.i(106534);
    dzG();
    AppMethodBeat.o(106534);
  }

  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106535);
    this.mIsStart = false;
    this.Yn = 0.0F;
    this.iUj = true;
    this.mHandler = new ak(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(106533);
        switch (paramAnonymousMessage.what)
        {
        default:
        case 1000:
        case 1001:
        case 1002:
        case 1003:
        }
        while (true)
        {
          AppMethodBeat.o(106533);
          while (true)
          {
            return;
            MMFalseProgressBar.a(MMFalseProgressBar.this);
            AppMethodBeat.o(106533);
            continue;
            MMFalseProgressBar.b(MMFalseProgressBar.this);
            AppMethodBeat.o(106533);
            continue;
            MMFalseProgressBar.c(MMFalseProgressBar.this);
            AppMethodBeat.o(106533);
          }
          MMFalseProgressBar.d(MMFalseProgressBar.this);
        }
      }
    };
    setMax(1000);
    dzG();
    AppMethodBeat.o(106535);
  }

  private void dzG()
  {
    AppMethodBeat.i(106538);
    if (at.gH(ah.getContext()))
    {
      this.iUf = 4.0F;
      this.iUg = 1.0F;
      this.iUh = 0.3F;
      this.iUi = 50.0F;
      AppMethodBeat.o(106538);
    }
    while (true)
    {
      return;
      this.iUf = 2.0F;
      this.iUg = 0.5F;
      this.iUh = 0.15F;
      this.iUi = 50.0F;
      AppMethodBeat.o(106538);
    }
  }

  public final void finish()
  {
    AppMethodBeat.i(106537);
    ab.d("MicroMsg.MMFalseProgressBar", "[cpan] finish");
    if (this.mHandler != null)
      this.mHandler.sendEmptyMessage(1002);
    AppMethodBeat.o(106537);
  }

  public final void start()
  {
    AppMethodBeat.i(106536);
    ab.d("MicroMsg.MMFalseProgressBar", "[cpan] start");
    if (!this.iUj)
      AppMethodBeat.o(106536);
    while (true)
    {
      return;
      if (this.mIsStart)
      {
        AppMethodBeat.o(106536);
      }
      else
      {
        this.mIsStart = true;
        dzG();
        if (this.mHandler != null)
        {
          this.mHandler.sendEmptyMessage(1000);
          this.mHandler.sendEmptyMessage(1001);
        }
        AppMethodBeat.o(106536);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFalseProgressBar
 * JD-Core Version:    0.6.2
 */