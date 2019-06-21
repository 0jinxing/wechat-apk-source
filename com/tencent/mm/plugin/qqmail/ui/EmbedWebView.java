package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;

public class EmbedWebView extends MMWebView
{
  private GestureDetector pxH;
  private boolean pxI;
  private float[] pxJ;
  private float[] pxK;
  private float[] pxL;
  private float[] pxM;

  public EmbedWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(68280);
    this.pxI = false;
    this.pxJ = new float[2];
    this.pxK = new float[2];
    this.pxL = new float[2];
    this.pxM = new float[2];
    this.pxH = new GestureDetector(new EmbedWebView.1(this));
    postDelayed(new EmbedWebView.2(this), 100L);
    AppMethodBeat.o(68280);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int i = 0;
    int j = 0;
    AppMethodBeat.i(68281);
    this.pxH.onTouchEvent(paramMotionEvent);
    int k;
    int m;
    if (this.pxI)
    {
      k = paramMotionEvent.getAction();
      m = paramMotionEvent.getPointerCount();
      if (m != 2)
        if (j != 0)
          break label365;
    }
    else
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(68281);
    }
    while (true)
    {
      return bool;
      j = i;
      switch (k & 0xFF)
      {
      case 3:
      case 4:
      default:
        j = 1;
        break;
      case 5:
        while (j < m)
        {
          this.pxJ[j] = paramMotionEvent.getX(j);
          this.pxK[j] = paramMotionEvent.getY(j);
          j++;
        }
      case 2:
        for (j = 0; j < m; j++)
        {
          this.pxL[j] = paramMotionEvent.getX(j);
          this.pxM[j] = paramMotionEvent.getY(j);
        }
        float f1 = (float)(Math.pow(this.pxJ[1] - this.pxJ[0], 2.0D) + Math.pow(this.pxK[1] - this.pxK[0], 2.0D));
        float f2 = (float)(Math.pow(this.pxL[1] - this.pxL[0], 2.0D) + Math.pow(this.pxM[1] - this.pxM[0], 2.0D));
        if (f1 - f2 > 20000.0F)
          zoomOut();
        while (true)
        {
          this.pxJ[0] = this.pxL[0];
          this.pxJ[1] = this.pxL[1];
          this.pxK[0] = this.pxM[0];
          this.pxK[1] = this.pxM[1];
          break;
          if (f2 - f1 > 20000.0F)
            zoomIn();
        }
        label365: AppMethodBeat.o(68281);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.EmbedWebView
 * JD-Core Version:    0.6.2
 */