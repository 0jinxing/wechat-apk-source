package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.model.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;

public class LyricView extends View
{
  public static int oOi;
  public static int oOj;
  private int bCp;
  private float faK;
  private float faL;
  private long fnZ;
  private int height;
  private GestureDetector lCs;
  private com.tencent.mm.plugin.music.model.a oOc;
  private TextPaint oOd;
  private TextPaint oOe;
  private int oOf;
  private int oOg;
  private int oOh;
  private int oOk;
  private boolean oOl;
  private boolean oOm;
  private int oOn;
  private int width;

  static
  {
    AppMethodBeat.i(105054);
    oOi = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 16);
    oOj = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 10);
    AppMethodBeat.o(105054);
  }

  public LyricView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105046);
    this.oOh = -1;
    this.oOk = (oOi + oOj);
    this.bCp = this.oOk;
    initView();
    AppMethodBeat.o(105046);
  }

  public LyricView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(105047);
    this.oOh = -1;
    this.oOk = (oOi + oOj);
    this.bCp = this.oOk;
    initView();
    AppMethodBeat.o(105047);
  }

  private void initView()
  {
    AppMethodBeat.i(105048);
    this.oOd = new TextPaint();
    this.oOd.setTextSize(oOi);
    this.oOd.setColor(-1);
    this.oOd.setAntiAlias(true);
    this.oOd.setTextAlign(Paint.Align.CENTER);
    this.oOe = new TextPaint();
    this.oOe.setTextSize(oOi);
    this.oOe.setColor(-1);
    this.oOe.setAlpha(127);
    this.oOe.setAntiAlias(true);
    this.oOe.setTextAlign(Paint.Align.CENTER);
    this.lCs = new GestureDetector(getContext(), new LyricView.a(this, (byte)0));
    AppMethodBeat.o(105048);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(105050);
    super.onDraw(paramCanvas);
    if (this.oOc == null)
    {
      ab.v("MicroMsg.Music.LyricView", "lyricObj is null");
      AppMethodBeat.o(105050);
    }
    while (true)
    {
      return;
      if ((this.height == 0) || (this.width == 0))
      {
        this.height = getMeasuredHeight();
        this.width = getMeasuredWidth();
      }
      if (this.oOh >= 0)
        break;
      AppMethodBeat.o(105050);
    }
    int i = this.bCp;
    if ((this.oOc == null) || (this.oOc.oMj.size() <= this.oOh))
      label104: if (this.oOl)
        if (this.bCp == 0)
          break label367;
    label367: for (i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.bCp = ((int)(this.bCp * 0.9F));
        invalidate();
      }
      AppMethodBeat.o(105050);
      break;
      int j = this.height / 2 - i;
      if ((j < this.height) && (j > 0))
        paramCanvas.drawText(this.oOc.zJ(this.oOh).content, this.width / 2, j, this.oOd);
      int k;
      for (i = this.oOh - 1; i >= 0; i--)
      {
        k = j - (this.oOh - i) * (oOi + oOj);
        if ((k > 0) && (k < this.height))
          paramCanvas.drawText(this.oOc.zJ(i).content, this.width / 2, k, this.oOe);
      }
      for (i = this.oOh + 1; i < this.oOc.oMj.size(); i++)
      {
        k = (i - this.oOh) * (oOi + oOj) + j;
        if ((k < this.height) && (k > 0))
          paramCanvas.drawText(this.oOc.zJ(i).content, this.width / 2, k, this.oOe);
      }
      break label104;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(105051);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.height = paramInt2;
    this.width = paramInt1;
    AppMethodBeat.o(105051);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105052);
    this.lCs.onTouchEvent(paramMotionEvent);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(105052);
      return true;
      this.faL = paramMotionEvent.getY();
      this.faK = paramMotionEvent.getX();
      this.oOn = this.bCp;
      this.oOm = true;
      this.oOl = false;
      continue;
      int i = (int)(paramMotionEvent.getX() - this.faK);
      int j = (int)(paramMotionEvent.getY() - this.faL);
      int k = this.oOn - j;
      if (k > 0)
      {
        if (k > this.oOg);
        for (m = this.oOg; ; m = k)
        {
          this.bCp = m;
          invalidate();
          ab.d("MicroMsg.Music.LyricView", "xDistance: %d yDisntance: %d tempYOffset: %d baseYOffset: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(this.oOn) });
          break;
        }
      }
      if (k < -this.oOf);
      for (int m = -this.oOf; ; m = k)
      {
        this.bCp = m;
        break;
      }
      this.oOm = false;
    }
  }

  public void setCurrentTime(long paramLong)
  {
    AppMethodBeat.i(105045);
    if (this.fnZ != paramLong)
    {
      this.fnZ = paramLong;
      if ((this.oOc == null) || (this.oOc.oMj.size() == 0))
        AppMethodBeat.o(105045);
    }
    while (true)
    {
      return;
      int i = -1;
      for (int j = 0; (j < this.oOc.oMj.size()) && (this.oOc.zJ(j).timestamp < paramLong); j++)
        if (!this.oOc.zJ(j).oMp)
          i = j;
      if ((!this.oOm) && (i != this.oOh))
      {
        this.oOh = i;
        this.oOf = ((oOi + oOj) * this.oOh);
        this.oOg = ((oOi + oOj) * (this.oOc.oMj.size() - this.oOh - 1));
        if (this.bCp == 0)
          this.bCp = (-this.oOk);
        this.oOl = true;
        invalidate();
      }
      AppMethodBeat.o(105045);
    }
  }

  public void setLyricColor(int paramInt)
  {
    AppMethodBeat.i(105049);
    this.oOd.setColor(paramInt);
    this.oOd.setAlpha(255);
    this.oOe.setColor(paramInt);
    this.oOe.setAlpha(127);
    AppMethodBeat.o(105049);
  }

  public void setLyricObj(com.tencent.mm.plugin.music.model.a parama)
  {
    AppMethodBeat.i(105044);
    this.oOc = parama;
    invalidate();
    AppMethodBeat.o(105044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.LyricView
 * JD-Core Version:    0.6.2
 */