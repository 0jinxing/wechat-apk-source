package com.tencent.mm.plugin.fts.ui;

import android.text.TextPaint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class b$c
{
  public static final int mHA;
  public static final TextPaint mHB;
  public static final int mHu;
  public static final TextPaint mHv;
  public static final int mHw;
  public static final TextPaint mHx;
  public static final int mHy;
  public static final TextPaint mHz;

  static
  {
    AppMethodBeat.i(61719);
    mHu = a.al(ah.getContext(), 2131427505);
    mHv = new TextPaint();
    mHw = a.al(ah.getContext(), 2131427813);
    mHx = new TextPaint();
    mHy = a.al(ah.getContext(), 2131427762);
    mHz = new TextPaint();
    mHA = a.al(ah.getContext(), 2131427864);
    mHB = new TextPaint();
    mHv.setTextSize(mHu);
    mHx.setTextSize(mHw);
    mHz.setTextSize(mHy);
    mHB.setTextSize(mHA);
    AppMethodBeat.o(61719);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.b.c
 * JD-Core Version:    0.6.2
 */