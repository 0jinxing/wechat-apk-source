package com.tencent.mm.plugin.appbrand.game.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.support.v7.widget.AppCompatTextView;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;

@SuppressLint({"ViewConstructor"})
public final class c extends AppCompatTextView
{
  private MBRuntime bSv;
  StringBuilder bot;
  ap gyS;
  private double hrF;

  public c(Context paramContext, MBRuntime paramMBRuntime)
  {
    super(paramContext);
    AppMethodBeat.i(130172);
    this.hrF = 60.0D;
    this.bot = new StringBuilder(100);
    this.gyS = new ap(Looper.getMainLooper(), new c.1(this), true);
    setTextSize(12.0F);
    setTextColor(-65536);
    setFocusable(false);
    setClickable(false);
    setOnClickListener(null);
    this.bSv = paramMBRuntime;
    this.gyS.ae(2000L, 2000L);
    AppMethodBeat.o(130172);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.c
 * JD-Core Version:    0.6.2
 */