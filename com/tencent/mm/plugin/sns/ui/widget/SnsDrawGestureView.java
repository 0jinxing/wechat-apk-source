package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SnsDrawGestureView extends ImageView
{
  private List<PointF> points;
  private SnsDrawGestureView.a rNb;
  private int rNc;
  private Paint rNd;
  private Paint rNe;

  public SnsDrawGestureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public SnsDrawGestureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(40506);
    this.points = new ArrayList();
    this.rNc = -1;
    this.rNd = new Paint();
    this.rNe = new Paint();
    this.rNd.setColor(this.rNc);
    this.rNd.setStyle(Paint.Style.STROKE);
    this.rNd.setStrokeWidth(a.fromDPToPix(getContext(), 8));
    this.rNd.setPathEffect(new CornerPathEffect(a.fromDPToPix(getContext(), 4)));
    this.rNd.setAntiAlias(true);
    this.rNe.setColor(this.rNc);
    this.rNe.setStyle(Paint.Style.FILL);
    this.rNe.setAntiAlias(true);
    if (d.fP(21))
      setLayerType(1, null);
    AppMethodBeat.o(40506);
  }

  private List<PointF> cvz()
  {
    AppMethodBeat.i(40509);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.points.iterator();
    while (localIterator.hasNext())
    {
      PointF localPointF = (PointF)localIterator.next();
      localArrayList.add(new PointF(localPointF.x, localPointF.y));
    }
    AppMethodBeat.o(40509);
    return localArrayList;
  }

  public final void cvA()
  {
    AppMethodBeat.i(40511);
    this.points.clear();
    postInvalidate();
    AppMethodBeat.o(40511);
  }

  public SnsDrawGestureView.a getOnGestureListener()
  {
    return this.rNb;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(40508);
    super.onDraw(paramCanvas);
    if (this.points.size() > 0)
    {
      Path localPath = new Path();
      localPath.moveTo(((PointF)this.points.get(0)).x, ((PointF)this.points.get(0)).y);
      paramCanvas.drawCircle(((PointF)this.points.get(0)).x, ((PointF)this.points.get(0)).y, a.fromDPToPix(getContext(), 8) / 2.0F, this.rNe);
      for (int i = 1; i < this.points.size(); i++)
        localPath.lineTo(((PointF)this.points.get(i)).x, ((PointF)this.points.get(i)).y);
      paramCanvas.drawPath(localPath, this.rNd);
      paramCanvas.drawCircle(((PointF)this.points.get(this.points.size() - 1)).x, ((PointF)this.points.get(this.points.size() - 1)).y, a.fromDPToPix(getContext(), 8) / 2.0F, this.rNe);
    }
    AppMethodBeat.o(40508);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(40507);
    if (paramMotionEvent.getActionMasked() == 0)
    {
      if (this.rNb != null)
        this.rNb.cuU();
      this.points.clear();
      paramMotionEvent = new PointF(paramMotionEvent.getX(), paramMotionEvent.getY());
      this.points.add(paramMotionEvent);
    }
    while (true)
    {
      AppMethodBeat.o(40507);
      return true;
      if (paramMotionEvent.getActionMasked() == 2)
      {
        paramMotionEvent = new PointF(paramMotionEvent.getX(), paramMotionEvent.getY());
        this.points.add(paramMotionEvent);
        postInvalidate();
      }
      else if (paramMotionEvent.getActionMasked() == 1)
      {
        ab.i("MicroMsg.SnsDrawGestureViewView", "point count %d", new Object[] { Integer.valueOf(this.points.size()) });
        if (this.points.size() < 6)
        {
          this.points.clear();
          if (this.rNb != null)
            this.rNb.onClick();
        }
        else if (this.rNb != null)
        {
          this.rNb.dv(cvz());
        }
      }
      else if (this.rNb != null)
      {
        this.rNb.dv(cvz());
      }
    }
  }

  public void setOnGestureListener(SnsDrawGestureView.a parama)
  {
    this.rNb = parama;
  }

  public void setPaintColor(int paramInt)
  {
    AppMethodBeat.i(40510);
    this.rNc = paramInt;
    this.rNd.setColor(this.rNc);
    this.rNe.setColor(this.rNc);
    AppMethodBeat.o(40510);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView
 * JD-Core Version:    0.6.2
 */