package com.tencent.mm.plugin.sns.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.b.a;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import java.util.HashMap;
import java.util.Map;

public final class ai extends a
{
  int alpha;
  long mSd;
  boolean mSe;
  private Map<String, Boolean> qMq;

  public ai(String paramString, n paramn, long paramLong)
  {
    super(paramString, paramn);
    AppMethodBeat.i(36535);
    this.mSe = false;
    this.alpha = 255;
    this.qMq = new HashMap();
    if (paramLong != 0L)
    {
      this.mSd = paramLong;
      this.qMq.put(paramString, Boolean.TRUE);
      this.mSe = true;
      AppMethodBeat.o(36535);
    }
    while (true)
    {
      return;
      if (!this.qMq.containsKey(paramString))
      {
        this.mSd = SystemClock.uptimeMillis();
        this.qMq.put(paramString, Boolean.TRUE);
        this.mSe = true;
      }
      AppMethodBeat.o(36535);
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(36536);
    Rect localRect = getBounds();
    Bitmap localBitmap = this.feQ.Xi();
    if (!i.B(localBitmap))
    {
      paramCanvas.drawColor(-1118482);
      this.mSd = 0L;
      AppMethodBeat.o(36536);
    }
    while (true)
    {
      return;
      float f;
      if (this.mSe)
      {
        f = (float)(SystemClock.uptimeMillis() - this.mSd) / 150.0F;
        if (this.mSd == 0L)
          f = 0.0F;
        if (f >= 1.0F)
          this.mSe = false;
      }
      else
      {
        this.feO.setAlpha(this.alpha);
        paramCanvas.drawBitmap(localBitmap, null, localRect, this.feO);
        AppMethodBeat.o(36536);
        continue;
      }
      int i = (int)(f * this.alpha);
      this.feO.setAlpha(i);
      paramCanvas.drawBitmap(localBitmap, null, localRect, this.feO);
      invalidateSelf();
      AppMethodBeat.o(36536);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ai
 * JD-Core Version:    0.6.2
 */