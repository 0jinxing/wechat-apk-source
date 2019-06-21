package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public class ExdeviceStepChartView extends View
{
  Paint aFY;
  private int iZn;
  private int iZo;
  private final int lDV;
  private final int lDW;
  private final int lDX;
  private final float lDY;
  private final float lDZ;
  private final int lEA;
  private final float lEB;
  private final int lEC;
  private final float lED;
  private final int lEE;
  private final float lEF;
  private final int lEG;
  private final float lEH;
  private final float lEI;
  private final float lEJ;
  private final float lEK;
  private final int lEL;
  private final int lEM;
  private final int lEN;
  private final int lEO;
  private final float lEP;
  private final int lEQ;
  private final float lER;
  private final int lES;
  private final float lET;
  private final int lEU;
  private final float lEV;
  private final int lEW;
  private final float lEX;
  private final int lEY;
  private final int lEZ;
  private final float lEa;
  private final float lEb;
  private final float lEc;
  private final int lEd;
  private final int lEe;
  private final int lEf;
  private final int lEg;
  private int lEh;
  private final float lEi;
  private final float lEj;
  private final int lEk;
  private final float lEl;
  private final int lEm;
  private final float lEn;
  private final int lEo;
  private final float lEp;
  private final int lEq;
  private final float lEr;
  private final int lEs;
  private final float lEt;
  private final int lEu;
  private final float lEv;
  private final int lEw;
  private final float lEx;
  private final int lEy;
  private final float lEz;
  private final int lFa;
  private final int lFb;
  private final int lFc;
  private final int lFd;
  private final int lFe;
  private final int lFf;
  private final int lFg;
  private int lFh;
  private final Typeface lFi;
  private final Typeface lFj;
  private int lFk;
  private int lFl;
  private int[] lFm;
  private final int lFn;
  private float[] lFo;
  private float[] lFp;
  private boolean[] lFq;
  Path lFr;
  Path lFs;
  List<String> lFt;
  private boolean lFu;
  PathEffect lFv;
  private int lFw;
  private boolean lFx;
  List<Point> points;
  private int startY;

  public ExdeviceStepChartView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(20223);
    this.lDV = -1;
    this.lDW = -1;
    this.lDX = getResources().getColor(2131689996);
    this.lDY = 12.0F;
    this.lDZ = 28.0F;
    this.lEa = 33.0F;
    this.lEb = 12.0F;
    this.lEc = 12.0F;
    this.lEd = getResources().getColor(2131689997);
    this.lEe = -1;
    this.lEf = getResources().getColor(2131689997);
    this.lEg = -1;
    this.lEh = 2147483647;
    this.iZn = 0;
    this.iZo = 0;
    this.lEi = 10.0F;
    this.lEj = 2.5F;
    this.lEk = ((int)m(1, 2.5F));
    this.lEl = 4.0F;
    this.lEm = ((int)m(1, 4.0F));
    this.lEn = 1.8F;
    this.lEo = ((int)m(1, 1.8F));
    this.lEp = 1.0F;
    this.lEq = ((int)m(1, 1.0F));
    this.lEr = 8.0F;
    this.lEs = ((int)m(1, 8.0F));
    this.lEt = 22.0F;
    this.lEu = ((int)m(1, 22.0F));
    this.lEv = 67.0F;
    this.lEw = ((int)m(1, 67.0F));
    this.lEx = 40.0F;
    this.lEy = ((int)m(1, 40.0F));
    this.lEz = 22.0F;
    this.lEA = ((int)m(1, 22.0F));
    this.lEB = 55.0F;
    this.lEC = ((int)m(1, 55.0F));
    this.lED = 35.0F;
    this.lEE = ((int)m(1, 35.0F));
    this.lEF = 45.0F;
    this.lEG = ((int)m(1, 45.0F));
    this.lEH = 8.0F;
    this.lEI = ((int)m(1, 8.0F));
    this.lEJ = 8.0F;
    this.lEK = ((int)m(1, 8.0F));
    this.lEL = 2;
    this.lEM = ((int)m(1, 2.0F));
    this.lEN = 15;
    this.lEO = ((int)m(1, 15.0F));
    this.lEP = 33.0F;
    this.lEQ = ((int)m(1, 33.0F));
    this.lER = 8.0F;
    this.lES = ((int)m(1, 8.0F));
    this.lET = 35.0F;
    this.lEU = ((int)m(1, 35.0F));
    this.lEV = 10.0F;
    this.lEW = ((int)m(1, 10.0F));
    this.lEX = 58.0F;
    this.lEY = ((int)m(1, 58.0F));
    this.lEZ = ((int)m(1, 1.0F));
    this.lFa = 102;
    this.lFb = 102;
    this.lFc = 153;
    this.lFd = 102;
    this.lFe = 102;
    this.lFf = 102;
    this.lFg = 204;
    this.lFh = 0;
    this.lFi = Typeface.create(Typeface.DEFAULT_BOLD, 0);
    this.lFj = Typeface.create(Typeface.DEFAULT_BOLD, 1);
    this.lFk = 0;
    this.lFl = 0;
    this.lFm = new int[] { 0, 0, 0, 0, 0, 0, 0 };
    this.lFn = 7;
    this.lFo = new float[7];
    this.lFp = new float[7];
    this.lFq = new boolean[7];
    this.lFu = false;
    this.lFv = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
    bqd();
    AppMethodBeat.o(20223);
  }

  public ExdeviceStepChartView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(20224);
    this.lDV = -1;
    this.lDW = -1;
    this.lDX = getResources().getColor(2131689996);
    this.lDY = 12.0F;
    this.lDZ = 28.0F;
    this.lEa = 33.0F;
    this.lEb = 12.0F;
    this.lEc = 12.0F;
    this.lEd = getResources().getColor(2131689997);
    this.lEe = -1;
    this.lEf = getResources().getColor(2131689997);
    this.lEg = -1;
    this.lEh = 2147483647;
    this.iZn = 0;
    this.iZo = 0;
    this.lEi = 10.0F;
    this.lEj = 2.5F;
    this.lEk = ((int)m(1, 2.5F));
    this.lEl = 4.0F;
    this.lEm = ((int)m(1, 4.0F));
    this.lEn = 1.8F;
    this.lEo = ((int)m(1, 1.8F));
    this.lEp = 1.0F;
    this.lEq = ((int)m(1, 1.0F));
    this.lEr = 8.0F;
    this.lEs = ((int)m(1, 8.0F));
    this.lEt = 22.0F;
    this.lEu = ((int)m(1, 22.0F));
    this.lEv = 67.0F;
    this.lEw = ((int)m(1, 67.0F));
    this.lEx = 40.0F;
    this.lEy = ((int)m(1, 40.0F));
    this.lEz = 22.0F;
    this.lEA = ((int)m(1, 22.0F));
    this.lEB = 55.0F;
    this.lEC = ((int)m(1, 55.0F));
    this.lED = 35.0F;
    this.lEE = ((int)m(1, 35.0F));
    this.lEF = 45.0F;
    this.lEG = ((int)m(1, 45.0F));
    this.lEH = 8.0F;
    this.lEI = ((int)m(1, 8.0F));
    this.lEJ = 8.0F;
    this.lEK = ((int)m(1, 8.0F));
    this.lEL = 2;
    this.lEM = ((int)m(1, 2.0F));
    this.lEN = 15;
    this.lEO = ((int)m(1, 15.0F));
    this.lEP = 33.0F;
    this.lEQ = ((int)m(1, 33.0F));
    this.lER = 8.0F;
    this.lES = ((int)m(1, 8.0F));
    this.lET = 35.0F;
    this.lEU = ((int)m(1, 35.0F));
    this.lEV = 10.0F;
    this.lEW = ((int)m(1, 10.0F));
    this.lEX = 58.0F;
    this.lEY = ((int)m(1, 58.0F));
    this.lEZ = ((int)m(1, 1.0F));
    this.lFa = 102;
    this.lFb = 102;
    this.lFc = 153;
    this.lFd = 102;
    this.lFe = 102;
    this.lFf = 102;
    this.lFg = 204;
    this.lFh = 0;
    this.lFi = Typeface.create(Typeface.DEFAULT_BOLD, 0);
    this.lFj = Typeface.create(Typeface.DEFAULT_BOLD, 1);
    this.lFk = 0;
    this.lFl = 0;
    this.lFm = new int[] { 0, 0, 0, 0, 0, 0, 0 };
    this.lFn = 7;
    this.lFo = new float[7];
    this.lFp = new float[7];
    this.lFq = new boolean[7];
    this.lFu = false;
    this.lFv = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
    bqd();
    AppMethodBeat.o(20224);
  }

  private void a(Canvas paramCanvas, List<String> paramList)
  {
    AppMethodBeat.i(20227);
    if ((paramList != null) && (paramList.size() == 7))
    {
      this.aFY.reset();
      this.aFY.setAntiAlias(true);
      this.aFY.setStrokeWidth(0.0F);
      this.aFY.setTextSize(m(2, 12.0F));
      this.aFY.setAlpha(153);
      int i = 0;
      if (i < paramList.size())
      {
        if (i == 0)
        {
          this.aFY.setTextAlign(Paint.Align.LEFT);
          label94: if (this.lFq[i] == 0)
            break label175;
          this.aFY.setColor(-1);
        }
        while (true)
        {
          paramCanvas.drawText((String)paramList.get(i), ((Point)this.points.get(i)).x, this.iZo - this.lEO, this.aFY);
          i++;
          break;
          this.aFY.setTextAlign(Paint.Align.CENTER);
          break label94;
          label175: this.aFY.setColor(this.lEd);
        }
      }
    }
    AppMethodBeat.o(20227);
  }

  private int aB(float paramFloat)
  {
    AppMethodBeat.i(20232);
    this.lEh = 2147483647;
    if (this.points.size() > 0);
    for (int i = 0; ; i++)
    {
      if (i < this.points.size())
      {
        if (i != 0)
          break label100;
        if ((paramFloat >= ((Point)this.points.get(i)).x + this.lFk / 2) || (paramFloat <= 0.0F))
          continue;
        this.lEh = i;
        invalidate();
      }
      while (true)
      {
        i = this.lEh;
        AppMethodBeat.o(20232);
        return i;
        label100: if ((i > 0) && (i < this.points.size() - 1))
        {
          if ((paramFloat >= ((Point)this.points.get(i)).x + this.lFk / 2) || (paramFloat <= ((Point)this.points.get(i)).x - this.lFk / 2))
            break;
          this.lEh = i;
          invalidate();
        }
        else if (i == this.points.size() - 1)
        {
          if ((paramFloat >= this.iZn) || (paramFloat <= ((Point)this.points.get(i)).x - this.lFk / 2))
            break;
          this.lEh = i;
          invalidate();
        }
        else
        {
          this.lEh = 2147483647;
        }
      }
    }
  }

  private void bqd()
  {
    AppMethodBeat.i(20228);
    this.aFY = new Paint();
    this.lFr = new Path();
    this.lFs = new Path();
    this.points = new LinkedList();
    this.lFt = new LinkedList();
    bqe();
    AppMethodBeat.o(20228);
  }

  private void bqe()
  {
    int i = 0;
    if (i < 7)
    {
      if (i == 6)
        this.lFq[i] = true;
      while (true)
      {
        i++;
        break;
        this.lFq[i] = false;
      }
    }
  }

  private void bqf()
  {
    AppMethodBeat.i(20229);
    this.aFY.reset();
    this.aFY.setAntiAlias(true);
    this.aFY.setStrokeWidth(this.lEo);
    this.aFY.setStyle(Paint.Style.STROKE);
    this.aFY.setColor(-1);
    AppMethodBeat.o(20229);
  }

  private void c(Canvas paramCanvas, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(20225);
    if (paramBoolean)
    {
      this.lFs.reset();
      this.lFs.moveTo(((Point)this.points.get(0)).x, ((Point)this.points.get(0)).y);
      for (i = 0; i < this.points.size(); i++)
        this.lFs.lineTo(((Point)this.points.get(i)).x, ((Point)this.points.get(i)).y);
      this.lFs.lineTo(this.lFo[(this.lFo.length - 1)], this.iZo - this.lEE - 1);
      this.lFs.lineTo(this.lEs, this.iZo - this.lEE - 1);
      this.lFs.lineTo(this.lEs, this.lFp[0]);
      paramCanvas.drawPath(this.lFs, this.aFY);
      AppMethodBeat.o(20225);
    }
    while (true)
    {
      return;
      this.lFs.reset();
      this.lFs.moveTo(((Point)this.points.get(0)).x, ((Point)this.points.get(0)).y);
      if (i < this.points.size())
      {
        if (i > 0)
          if (((Point)this.points.get(i - 1)).y == this.iZo - this.lEy)
          {
            this.aFY.reset();
            DashPathEffect localDashPathEffect = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
            this.aFY.setPathEffect(localDashPathEffect);
            this.aFY.setAntiAlias(true);
            this.aFY.setStrokeWidth(this.lEo);
            this.aFY.setStyle(Paint.Style.STROKE);
            this.aFY.setColor(-1);
          }
        while (true)
        {
          this.lFs.lineTo(((Point)this.points.get(i)).x, ((Point)this.points.get(i)).y);
          paramCanvas.drawPath(this.lFs, this.aFY);
          this.lFs.reset();
          this.lFs.moveTo(((Point)this.points.get(i)).x, ((Point)this.points.get(i)).y);
          i++;
          break;
          bqf();
          continue;
          bqf();
        }
      }
      AppMethodBeat.o(20225);
    }
  }

  private void getData()
  {
    int i = 0;
    AppMethodBeat.i(20231);
    this.points.clear();
    View localView = findViewById(2131823695);
    this.iZn = localView.getWidth();
    this.iZo = localView.getHeight();
    this.lFk = ((this.iZn - this.lEs - this.lEu) / 6);
    this.lFl = ((this.iZo - this.lEw - this.lEy) / 2);
    for (int j = 0; j < this.lFo.length; j++)
      this.lFo[j] = (this.lEs + this.lFk * j);
    j = this.lFm.length;
    int k = j;
    if (j > 7)
      k = 7;
    j = 0;
    int n;
    for (int m = 0; j < k; m = n)
    {
      if (this.lFm[j] > 100000)
        this.lFm[j] = 100000;
      if (this.lFm[j] < 0)
        this.lFm[j] = 0;
      n = m;
      if (this.lFm[j] > m)
        n = this.lFm[j];
      j++;
    }
    if ((m <= 15000) && (m >= 0))
      j = 15000;
    while (true)
    {
      this.lFh = ((this.iZo - this.lEw - this.lEy) * 10000 / j);
      this.lFh = (this.iZo - this.lEy - this.lFh);
      m = i;
      while (true)
        if (m < k)
        {
          this.lFp[m] = (this.iZo - this.lEy - this.lFm[m] / j * (this.iZo - this.lEw - this.lEy));
          this.points.add(new Point((int)this.lFo[m], (int)this.lFp[m]));
          m++;
          continue;
          if ((m <= 15000) || (m > 100000))
            break label431;
          j = m;
          if (m / 5000.0D <= m / 5000.0F)
            break;
          j = (m / 5000 + 1) * 5000;
          break;
        }
      AppMethodBeat.o(20231);
      return;
      label431: j = 0;
    }
  }

  private float m(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(20226);
    Object localObject = getContext();
    if (localObject == null);
    for (localObject = Resources.getSystem(); ; localObject = ((Context)localObject).getResources())
    {
      paramFloat = TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics());
      AppMethodBeat.o(20226);
      return paramFloat;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(20230);
    getData();
    super.onDraw(paramCanvas);
    int i;
    Object localObject;
    float f;
    if (!this.lFu)
    {
      this.aFY.reset();
      this.aFY.setAntiAlias(true);
      this.aFY.setColor(-1);
      this.aFY.setStrokeWidth(0.0F);
      this.aFY.setStyle(Paint.Style.FILL);
      i = 0;
      if (i < this.points.size())
      {
        localObject = (Point)this.points.get(i);
        if (i == this.points.size() - 1)
          paramCanvas.drawCircle(((Point)localObject).x, ((Point)localObject).y, this.lEm, this.aFY);
        while (true)
        {
          i++;
          break;
          paramCanvas.drawCircle(((Point)localObject).x, ((Point)localObject).y, this.lEk, this.aFY);
        }
      }
      if (this.lEh != 2147483647)
      {
        i = this.lEh;
        this.aFY.reset();
        this.aFY.setColor(this.lEd);
        this.aFY.setAntiAlias(true);
        this.aFY.setStrokeWidth(0.0F);
        this.aFY.setTextSize(m(2, 12.0F));
        this.aFY.setTextAlign(Paint.Align.CENTER);
        if ((i >= 0) && (i <= 6))
        {
          if (i == 0)
            this.aFY.setTextAlign(Paint.Align.LEFT);
          if (i == 6)
            this.aFY.setTextAlign(Paint.Align.RIGHT);
          if (!this.lFx)
          {
            this.lFw = (((Point)this.points.get(i)).y - this.lEY);
            this.startY = this.lFw;
            this.lFx = true;
          }
          if (this.lFx)
          {
            f = (float)(this.startY / 8.0D);
            if (this.lFw > 0)
              this.aFY.setAlpha((this.startY - this.lFw) * 255 / this.startY);
            paramCanvas.drawText(this.lFm[i], ((Point)this.points.get(i)).x, this.lFw + this.lEY, this.aFY);
            if (this.lFw <= 0)
              break label1246;
            if (this.lFw / this.startY > 1.0F / f)
              break label1218;
            this.lFw -= 1;
            invalidate();
          }
        }
      }
    }
    while (true)
    {
      i = this.lEh;
      if ((i >= 0) && (i <= 6))
        this.lFq[i] = true;
      this.aFY.reset();
      this.lFr.reset();
      localObject = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
      this.aFY.setPathEffect((PathEffect)localObject);
      this.aFY.setColor(this.lDX);
      this.aFY.setStrokeWidth(this.lEq);
      this.aFY.setAlpha(102);
      this.aFY.setStyle(Paint.Style.STROKE);
      if ((this.lFh != 0) && (!this.lFu))
      {
        this.lFr.moveTo(this.lEs, this.lFh);
        this.lFr.lineTo(this.iZn - this.lEA, this.lFh);
        paramCanvas.drawPath(this.lFr, this.aFY);
      }
      this.aFY.reset();
      this.lFr.reset();
      this.aFY.setColor(this.lDX);
      this.aFY.setStrokeWidth(this.lEq);
      this.aFY.setStyle(Paint.Style.STROKE);
      this.aFY.setAlpha(102);
      this.lFr.reset();
      this.lFr.moveTo(this.lEI, this.iZo - this.lEE);
      this.lFr.lineTo(this.iZn - this.lEK, this.iZo - this.lEE);
      this.lFr.moveTo(this.lEI, this.lEG);
      this.lFr.lineTo(this.iZn - this.lEK, this.lEG);
      paramCanvas.drawPath(this.lFr, this.aFY);
      if (!this.lFu)
      {
        this.aFY.reset();
        this.aFY.setColor(this.lEf);
        this.aFY.setAntiAlias(true);
        this.aFY.setAlpha(102);
        this.aFY.setStrokeWidth(0.0F);
        this.aFY.setTextSize(m(2, 12.0F));
        this.aFY.setTextAlign(Paint.Align.RIGHT);
        paramCanvas.drawText(getResources().getString(2131299361), this.iZn - this.lEM, (float)(this.lFh + this.aFY.getTextSize() * 0.34D), this.aFY);
      }
      this.aFY.reset();
      this.aFY.setColor(-1);
      this.aFY.setAntiAlias(true);
      this.aFY.setStrokeWidth(0.0F);
      this.aFY.setTypeface(this.lFi);
      this.aFY.setTextSize(m(2, 28.0F));
      paramCanvas.drawText(getResources().getString(2131299363), this.lES, this.lEQ, this.aFY);
      this.aFY.setTextAlign(Paint.Align.RIGHT);
      this.aFY.setTextSize(m(2, 33.0F));
      paramCanvas.drawText(this.lFm[(this.lFm.length - 1)], this.iZn - this.lEW, this.lEU, this.aFY);
      if (this.points.size() > 2)
      {
        this.aFY.reset();
        this.aFY.setAntiAlias(true);
        this.aFY.setStrokeWidth(0.0F);
        this.aFY.setAlpha(102);
        this.aFY.setStyle(Paint.Style.FILL_AND_STROKE);
        localObject = new LinearGradient(0.0F, 0.0F, 0.0F, this.iZo - this.lEE, -1, 16777215, Shader.TileMode.REPEAT);
        this.aFY.setShader((Shader)localObject);
        this.aFY.setColor(-1);
        c(paramCanvas, true);
        bqf();
        if (!this.lFu)
          c(paramCanvas, false);
      }
      a(paramCanvas, this.lFt);
      AppMethodBeat.o(20230);
      return;
      label1218: this.lFw = ((int)(this.lFw - this.lFw / this.startY * f));
      break;
      label1246: this.lFx = false;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(20233);
    float f = paramMotionEvent.getX();
    paramMotionEvent.getY();
    ab.i("MicroMsg.exdevice.ExdeviceStepChartView", "mOnTouchLinePsition:" + this.lEh);
    switch (paramMotionEvent.getAction())
    {
    default:
      ab.d("MicroMsg.exdevice.ExdeviceStepChartView", "default");
      AppMethodBeat.o(20233);
    case 0:
    case 1:
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.exdevice.ExdeviceStepChartView", "ACTION_DOWN");
      bool = true;
      AppMethodBeat.o(20233);
      continue;
      ab.d("MicroMsg.exdevice.ExdeviceStepChartView", "ACTION_UP");
      this.lEh = aB(f);
      bqe();
      this.lFx = false;
      invalidate();
      AppMethodBeat.o(20233);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceStepChartView
 * JD-Core Version:    0.6.2
 */