package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DanmuView extends View
{
  private int iaW;
  private int iaX;
  private int iaY;
  private float iaZ;
  private float iba;
  private boolean ibb;
  private boolean ibc;
  private c ibd;
  private HashMap<Integer, ArrayList<d>> ibe;
  public final Deque<d> ibf;
  public List<d> ibg;
  private int[] ibh;
  private volatile boolean ibi;
  private LinkedList<Long> ibj;
  private Paint ibk;
  private long ibl;
  private LinkedList<Float> ibm;
  private final Context mContext;
  private volatile int status;

  public DanmuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DanmuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(126604);
    this.iaW = 5;
    this.iaX = 500;
    this.iaY = 10;
    this.iaZ = 0.0F;
    this.iba = 0.6F;
    this.ibb = false;
    this.ibc = false;
    this.ibf = new LinkedList();
    this.ibg = new LinkedList();
    this.status = 3;
    this.ibl = 0L;
    this.mContext = paramContext;
    AppMethodBeat.o(126604);
  }

  private static void L(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(126605);
    IllegalArgumentException localIllegalArgumentException;
    if (paramFloat1 >= paramFloat2)
    {
      localIllegalArgumentException = new IllegalArgumentException("start_Y_offset must < end_Y_offset");
      AppMethodBeat.o(126605);
      throw localIllegalArgumentException;
    }
    if ((paramFloat1 < 0.0F) || (paramFloat1 >= 1.0F) || (paramFloat2 < 0.0F) || (paramFloat2 > 1.0F))
    {
      localIllegalArgumentException = new IllegalArgumentException("start_Y_offset and end_Y_offset must between 0 and 1)");
      AppMethodBeat.o(126605);
      throw localIllegalArgumentException;
    }
    AppMethodBeat.o(126605);
  }

  private void aGe()
  {
    AppMethodBeat.i(126607);
    aGf();
    aGg();
    AppMethodBeat.o(126607);
  }

  private void aGf()
  {
    AppMethodBeat.i(126608);
    this.ibe = new HashMap(this.iaW);
    for (int i = 0; i < this.iaW; i++)
    {
      ArrayList localArrayList = new ArrayList(this.iaY);
      this.ibe.put(Integer.valueOf(i), localArrayList);
    }
    AppMethodBeat.o(126608);
  }

  private void aGg()
  {
    int i = 0;
    AppMethodBeat.i(126609);
    this.ibh = new int[this.iaW];
    float f1 = b.cO(this.mContext);
    float f2 = getHeight();
    f2 = this.iaZ * f2;
    for (int j = 0; j < this.iaW; j++)
      this.ibh[j] = ((int)((j + 1) * f1 + f2 - 3.0F * f1 / 4.0F));
    if (this.ibc)
    {
      this.ibm.clear();
      this.ibm.add(Float.valueOf(f2));
      for (j = i; j < this.iaW; j++)
        this.ibm.add(Float.valueOf((j + 1) * f1 + f2));
    }
    AppMethodBeat.o(126609);
  }

  private void aGk()
  {
    AppMethodBeat.i(126620);
    if ((this.ibe != null) && (!this.ibe.isEmpty()))
      this.ibe.clear();
    AppMethodBeat.o(126620);
  }

  private void aGl()
  {
    AppMethodBeat.i(126621);
    synchronized (this.ibf)
    {
      if (!this.ibf.isEmpty())
        this.ibf.clear();
      AppMethodBeat.o(126621);
      return;
    }
  }

  private double aGn()
  {
    AppMethodBeat.i(126625);
    long l = System.nanoTime();
    this.ibj.addLast(Long.valueOf(l));
    double d = (l - ((Long)this.ibj.getFirst()).longValue()) / 1000000000.0D;
    if (this.ibj.size() > 100)
      this.ibj.removeFirst();
    if (d > 0.0D)
    {
      d = this.ibj.size() / d;
      AppMethodBeat.o(126625);
    }
    while (true)
    {
      return d;
      AppMethodBeat.o(126625);
      d = 0.0D;
    }
  }

  private int b(d paramd)
  {
    AppMethodBeat.i(126611);
    int i = 0;
    try
    {
      while (i < this.iaW)
      {
        int j = (i + 0) % this.iaW;
        ArrayList localArrayList = (ArrayList)this.ibe.get(Integer.valueOf(j));
        int k = localArrayList.size();
        if (k == 0)
          AppMethodBeat.o(126611);
        for (i = j; ; i = j)
        {
          return i;
          if (localArrayList.size() > this.iaY)
            break;
          boolean bool = paramd.a((d)localArrayList.get(localArrayList.size() - 1));
          if (bool)
            break;
          AppMethodBeat.o(126611);
        }
        i++;
      }
    }
    catch (Exception paramd)
    {
      while (true)
      {
        ab.w("MicroMsg.DanmuView", "findVacant,Exception:" + paramd.getMessage());
        i = -1;
        AppMethodBeat.o(126611);
      }
    }
  }

  private static boolean isMainThread()
  {
    AppMethodBeat.i(126626);
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      bool = true;
      AppMethodBeat.o(126626);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(126626);
    }
  }

  public final void aGh()
  {
    AppMethodBeat.i(126613);
    if (isMainThread())
    {
      this.ibi = true;
      AppMethodBeat.o(126613);
    }
    while (true)
    {
      return;
      post(new DanmuView.1(this));
      AppMethodBeat.o(126613);
    }
  }

  public final void aGi()
  {
    AppMethodBeat.i(126614);
    if (isMainThread())
    {
      this.ibi = false;
      invalidate();
      AppMethodBeat.o(126614);
    }
    while (true)
    {
      return;
      post(new DanmuView.2(this));
      AppMethodBeat.o(126614);
    }
  }

  public final void aGj()
  {
    AppMethodBeat.i(126619);
    aGk();
    aGl();
    AppMethodBeat.o(126619);
  }

  public final void aGm()
  {
    this.iaZ = 0.0F;
    this.iba = 0.8F;
  }

  public final void clear()
  {
    AppMethodBeat.i(126618);
    this.status = 3;
    aGj();
    this.ibg.clear();
    invalidate();
    AppMethodBeat.o(126618);
  }

  public float getYOffset()
  {
    return this.iba - this.iaZ;
  }

  public final void hide()
  {
    AppMethodBeat.i(126617);
    this.status = 4;
    invalidate();
    AppMethodBeat.o(126617);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(126610);
    super.onDraw(paramCanvas);
    if (this.ibi)
    {
      ab.i("MicroMsg.DanmuView", "inTransition");
      AppMethodBeat.o(126610);
      return;
    }
    int i;
    Object localObject2;
    label146: label158: label164: float f;
    if (this.status == 1)
      while (true)
      {
        try
        {
          paramCanvas.drawColor(0);
          i = 0;
          if (i >= this.ibe.size())
            break label164;
          ??? = ((ArrayList)this.ibe.get(Integer.valueOf(i))).iterator();
          if (!((Iterator)???).hasNext())
            break label158;
          localObject2 = (d)((Iterator)???).next();
          if (!((d)localObject2).aGb())
            break label146;
          ((Iterator)???).remove();
          continue;
        }
        catch (Exception paramCanvas)
        {
          ab.w("MicroMsg.DanmuView", "STATUS_RUNNING onDraw e=%s", new Object[] { paramCanvas });
          invalidate();
          AppMethodBeat.o(126610);
        }
        break;
        ((d)localObject2).b(paramCanvas, false);
        continue;
        i++;
        continue;
        if (System.currentTimeMillis() - this.ibl > this.iaX)
          this.ibl = System.currentTimeMillis();
        synchronized (this.ibf)
        {
          if (this.ibf.size() > 0)
          {
            localObject2 = (d)this.ibf.getFirst();
            i = this.ibd.afA();
            while ((localObject2 != null) && (((d)localObject2).oC(i)))
            {
              this.ibf.pollFirst();
              localObject2 = (d)this.ibf.getFirst();
            }
            if ((localObject2 != null) && (((d)localObject2).oB(i)))
            {
              i = b((d)localObject2);
              if (i >= 0)
              {
                ((d)localObject2).dg(paramCanvas.getWidth() - 2, this.ibh[i]);
                ((d)localObject2).b(paramCanvas, false);
                ((ArrayList)this.ibe.get(Integer.valueOf(i))).add(localObject2);
                this.ibf.pollFirst();
              }
            }
          }
          if ((this.ibb) && (this.ibj != null))
            paramCanvas.drawText("FPS:".concat(String.valueOf((int)aGn())), 5.0F, 20.0F, this.ibk);
          if ((this.ibc) && (this.ibm != null))
          {
            localObject2 = this.ibm.iterator();
            if (((Iterator)localObject2).hasNext())
            {
              f = ((Float)((Iterator)localObject2).next()).floatValue();
              paramCanvas.drawLine(0.0F, f, getWidth(), f, this.ibk);
            }
          }
        }
      }
    if (this.status == 2)
      try
      {
        paramCanvas.drawColor(0);
        i = 0;
        label498: if (i < this.ibe.size())
        {
          localObject2 = ((ArrayList)this.ibe.get(Integer.valueOf(i))).iterator();
          while (((Iterator)localObject2).hasNext())
            ((d)((Iterator)localObject2).next()).b(paramCanvas, true);
        }
      }
      catch (Exception paramCanvas)
      {
        ab.w("MicroMsg.DanmuView", "STATUS_PAUSE onDraw e=%s", new Object[] { paramCanvas });
      }
    while (true)
    {
      invalidate();
      AppMethodBeat.o(126610);
      break;
      i++;
      break label498;
      if ((this.ibb) && (this.ibj != null))
        paramCanvas.drawText("FPS:".concat(String.valueOf((int)aGn())), 5.0F, 20.0F, this.ibk);
      if ((this.ibc) && (this.ibm != null))
      {
        localObject2 = this.ibm.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          f = ((Float)((Iterator)localObject2).next()).floatValue();
          paramCanvas.drawLine(0.0F, f, getWidth(), f, this.ibk);
        }
      }
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(126612);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    aGg();
    AppMethodBeat.o(126612);
  }

  public final void pause()
  {
    AppMethodBeat.i(126616);
    this.status = 2;
    invalidate();
    AppMethodBeat.o(126616);
  }

  public final void prepare()
  {
    AppMethodBeat.i(126606);
    L(this.iaZ, this.iba);
    setBackgroundColor(0);
    setDrawingCacheBackgroundColor(0);
    aGe();
    AppMethodBeat.o(126606);
  }

  public void setDanmuViewCallBack(c paramc)
  {
    this.ibd = paramc;
  }

  public void setMaxRow(int paramInt)
  {
    AppMethodBeat.i(126622);
    this.iaW = paramInt;
    HashMap localHashMap;
    if (this.ibe != null)
    {
      localHashMap = this.ibe;
      paramInt = 0;
    }
    try
    {
      while (paramInt < this.ibe.size())
      {
        ArrayList localArrayList = (ArrayList)this.ibe.get(Integer.valueOf(paramInt));
        if (localArrayList != null)
          localArrayList.clear();
        paramInt++;
      }
      aGe();
      AppMethodBeat.o(126622);
      return;
    }
    finally
    {
      AppMethodBeat.o(126622);
    }
  }

  public void setMaxRunningPerRow(int paramInt)
  {
    this.iaY = paramInt;
  }

  public void setPickItemInterval(int paramInt)
  {
    this.iaX = paramInt;
  }

  public void setShowFps(boolean paramBoolean)
  {
    AppMethodBeat.i(126623);
    this.ibb = paramBoolean;
    if ((paramBoolean) && ((this.ibk == null) || (this.ibj == null)))
    {
      this.ibk = new TextPaint(1);
      this.ibk.setColor(-256);
      this.ibk.setTextSize(20.0F);
      this.ibj = new LinkedList();
    }
    AppMethodBeat.o(126623);
  }

  public void setShowLines(boolean paramBoolean)
  {
    AppMethodBeat.i(126624);
    this.ibc = paramBoolean;
    if ((paramBoolean) && (this.ibm == null))
      this.ibm = new LinkedList();
    AppMethodBeat.o(126624);
  }

  public final void show()
  {
    AppMethodBeat.i(126615);
    this.status = 1;
    invalidate();
    AppMethodBeat.o(126615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView
 * JD-Core Version:    0.6.2
 */