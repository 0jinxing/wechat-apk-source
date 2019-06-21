package com.tencent.mm.plugin.mmsight.ui.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader.TileMode;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MMSightProgressBar extends View
{
  public static final int lEk;
  public static final int oDH;
  private static final int[] oDI;
  private Paint aFY;
  private boolean cFy;
  private int centerX;
  private int centerY;
  private ak handler;
  private List<a> oDJ;
  private int oDK;
  private b oDL;
  private boolean oDM;
  private MMSightProgressBar.a oDN;

  static
  {
    AppMethodBeat.i(55340);
    lEk = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 3);
    oDH = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 5);
    oDI = new int[] { -1, -1, Color.parseColor("#F5B3B2"), Color.parseColor("#EB6866"), Color.parseColor("#E64340") };
    AppMethodBeat.o(55340);
  }

  public MMSightProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(55336);
    this.oDJ = new ArrayList(5);
    this.oDK = 0;
    this.centerX = 0;
    this.centerY = 0;
    this.handler = null;
    this.cFy = false;
    this.oDM = false;
    init();
    AppMethodBeat.o(55336);
  }

  public MMSightProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(55337);
    this.oDJ = new ArrayList(5);
    this.oDK = 0;
    this.centerX = 0;
    this.centerY = 0;
    this.handler = null;
    this.cFy = false;
    this.oDM = false;
    init();
    AppMethodBeat.o(55337);
  }

  private void init()
  {
    AppMethodBeat.i(55338);
    this.aFY = new Paint();
    this.aFY.setColor(-65536);
    this.aFY.setAntiAlias(true);
    this.handler = new MMSightProgressBar.1(this, Looper.getMainLooper());
    Log.i("MicroMsg.MMSightProgressBar", "init, pointRadius: %s, pointDistance: %s", new Object[] { Integer.valueOf(lEk), Integer.valueOf(oDH) });
    AppMethodBeat.o(55338);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(55339);
    super.onDraw(paramCanvas);
    int i;
    int m;
    Object localObject1;
    if ((this.cFy) && ((this.centerX <= 0) || (this.centerY <= 0)))
    {
      i = getLeft();
      j = getRight();
      int k = getTop();
      m = getBottom();
      this.centerX = ((j - i) / 2);
      this.centerY = ((m - k) / 2);
      Log.i("MicroMsg.MMSightProgressBar", "left: %s, right: %s, top: %s, bottom: %s, centerX: %s, centerY: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(this.centerX), Integer.valueOf(this.centerY) });
      Log.i("MicroMsg.MMSightProgressBar", "add init point");
      localObject1 = new a(0, this.centerX, this.centerY, -1);
      this.oDJ.add(localObject1);
    }
    int j = paramCanvas.save();
    this.oDK = this.oDJ.size();
    float f1;
    float f3;
    if (this.oDK % 2 == 0)
    {
      f1 = -(oDH / 2.0F + (this.oDK / 2 - 1) * oDH + this.oDK / 2 * lEk);
      f2 = f1;
      if (this.oDL != null)
      {
        f2 = f1;
        if (this.oDL.oDW)
        {
          i = this.oDK + 1;
          if (i % 2 != 0)
            break label1197;
          f2 = oDH / 2.0F;
          f3 = (i / 2 - 1) * oDH;
        }
      }
    }
    for (float f2 = -(i / 2 * lEk + (f2 + f3)); ; f2 = -(i / 2 * lEk + (f3 + f2)))
    {
      Log.d("MicroMsg.MMSightProgressBar", "add translateX for splitting, dstTranslateX: %s, progress: %s", new Object[] { Float.valueOf(f2), Float.valueOf(this.oDL.progress) });
      f3 = this.oDL.progress / 100.0F;
      f2 = f1 - (Math.abs(f2) - Math.abs(f1)) * f3;
      Log.d("MicroMsg.MMSightProgressBar", "draw, translateX: %s, currentPointCount: %s", new Object[] { Float.valueOf(f2), Integer.valueOf(this.oDK) });
      paramCanvas.translate(f2, 0.0F);
      Object localObject2;
      if ((this.oDL != null) && (this.oDL.oDW))
      {
        localObject2 = this.oDL;
        localObject1 = this.aFY;
        f1 = (oDH + lEk * 2) * (((b)localObject2).progress / 100.0F);
        ab.d("MicroMsg.MMSightProgressPointSplitter", "drawForSplitProgress, progress: %s, rightPointXOffset: %s", new Object[] { Float.valueOf(((b)localObject2).progress), Float.valueOf(f1) });
        if (((b)localObject2).oEe > ((b)localObject2).oEg)
        {
          f2 = ((b)localObject2).oDU.oDQ - lEk;
          f3 = ((b)localObject2).oDU.oDR - lEk;
          ((Paint)localObject1).setColor(((b)localObject2).oDV.color);
          ((b)localObject2).oEi.reset();
          ((b)localObject2).oEi.moveTo(((b)localObject2).oDY.x + f2, ((b)localObject2).oDY.y + f3);
          ((b)localObject2).oEi.quadTo(((b)localObject2).oDZ.x + f2, ((b)localObject2).oDZ.y + f3, ((b)localObject2).oEa.x + f2, ((b)localObject2).oEa.y + f3);
          ((b)localObject2).oEi.lineTo(((b)localObject2).oEd.x + f2, ((b)localObject2).oEd.y + f3);
          ((b)localObject2).oEi.quadTo(((b)localObject2).oEc.x + f2, ((b)localObject2).oEc.y + f3, ((b)localObject2).oEb.x + f2, f3 + ((b)localObject2).oEb.y);
          if (((b)localObject2).oDV.color != ((b)localObject2).oDU.color)
          {
            float f4 = ((b)localObject2).oDY.x;
            f3 = ((b)localObject2).oDU.oDR;
            float f5 = lEk;
            float f6 = ((b)localObject2).oEa.x;
            float f7 = ((b)localObject2).oDU.oDR;
            float f8 = lEk;
            m = ((b)localObject2).oDU.color;
            i = ((b)localObject2).oDV.color;
            localObject3 = Shader.TileMode.REPEAT;
            ((Paint)localObject1).setShader(new LinearGradient(f4 + f2, f3 - f5, f2 + f6, f7 - f8, new int[] { m, i }, null, (Shader.TileMode)localObject3));
          }
          paramCanvas.drawPath(((b)localObject2).oEi, (Paint)localObject1);
          ((Paint)localObject1).setShader(null);
        }
        localObject2 = ((b)localObject2).oDV;
        ((Paint)localObject1).setColor(((a)localObject2).color);
        ((a)localObject2).oDR = ((a)localObject2).oDT;
        ((a)localObject2).oDQ = (((a)localObject2).oDS + (((a)localObject2).index - 1) * (oDH + lEk * 2) + f1);
        Log.d("MicroMsg.MMSightProgressPoint", "drawWithOffset, index: %s, offset: %s, pointX: %s", new Object[] { Integer.valueOf(((a)localObject2).index), Float.valueOf(f1), Float.valueOf(((a)localObject2).oDQ) });
        paramCanvas.drawCircle(((a)localObject2).oDQ, ((a)localObject2).oDR, lEk, (Paint)localObject1);
        ((Paint)localObject1).setShader(null);
      }
      Object localObject3 = this.oDJ.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (a)((Iterator)localObject3).next();
        localObject2 = this.aFY;
        ((Paint)localObject2).setColor(((a)localObject1).color);
        ((a)localObject1).oDQ = (((a)localObject1).oDS + ((a)localObject1).index * (oDH + lEk * 2));
        ((a)localObject1).oDR = ((a)localObject1).oDT;
        Log.d("MicroMsg.MMSightProgressPoint", "draw, index: %s, pointX: %s", new Object[] { Integer.valueOf(((a)localObject1).index), Float.valueOf(((a)localObject1).oDQ) });
        paramCanvas.drawCircle(((a)localObject1).oDQ, ((a)localObject1).oDR, lEk, (Paint)localObject2);
        ((Paint)localObject2).setShader(null);
      }
      f1 = -(lEk / 2.0F + this.oDK / 2 * oDH + this.oDK / 2 * lEk);
      break;
      label1197: f3 = lEk / 2.0F;
      f2 = i / 2 * oDH;
    }
    paramCanvas.restoreToCount(j);
    if ((this.cFy) && (!this.oDM) && (this.oDJ.size() > 0))
    {
      Log.i("MicroMsg.MMSightProgressBar", "start handler loop");
      this.oDM = true;
      this.handler.sendEmptyMessage(233);
    }
    AppMethodBeat.o(55339);
  }

  public void setProgressCallback(MMSightProgressBar.a parama)
  {
    this.oDN = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.progressbar.MMSightProgressBar
 * JD-Core Version:    0.6.2
 */