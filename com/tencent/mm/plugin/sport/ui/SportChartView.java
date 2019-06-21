package com.tencent.mm.plugin.sport.ui;

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
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sport.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SportChartView extends View
{
  Paint aFY;
  private int iZn;
  private int iZo;
  private GestureDetector lCs;
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
  Path lFr;
  Path lFs;
  private int lFw;
  private boolean lFx;
  private int nWb;
  private SimpleDateFormat rPW;
  private SimpleDateFormat rPX;
  private boolean rPY;
  private int rPZ;
  private int rQa;
  private SportChartView.a rQb;
  private int rQc;
  private List<e> rQd;
  private SportChartView.b[] rQe;
  private int rQf;
  private boolean rQg;
  private GestureDetector.OnGestureListener rQh;
  private int startY;

  public SportChartView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(65428);
    this.rPW = new SimpleDateFormat(getResources().getString(2131303897));
    this.rPX = new SimpleDateFormat("d");
    this.lDV = -1;
    this.lDW = -1;
    this.lDX = getResources().getColor(2131690509);
    this.lDY = 12.0F;
    this.lDZ = 24.0F;
    this.lEa = 28.0F;
    this.lEb = 12.0F;
    this.lEc = 12.0F;
    this.lEd = getResources().getColor(2131690510);
    this.lEe = -1;
    this.lEf = getResources().getColor(2131690510);
    this.lEg = -1;
    this.nWb = 2147483647;
    this.iZn = 0;
    this.iZo = 0;
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
    this.rPZ = -1;
    this.rQa = -1;
    this.rQb = SportChartView.a.rQk;
    this.rQc = 7;
    this.rQe = new SportChartView.b[this.rQc];
    this.rQh = new SportChartView.1(this);
    bqd();
    AppMethodBeat.o(65428);
  }

  public SportChartView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(65429);
    this.rPW = new SimpleDateFormat(getResources().getString(2131303897));
    this.rPX = new SimpleDateFormat("d");
    this.lDV = -1;
    this.lDW = -1;
    this.lDX = getResources().getColor(2131690509);
    this.lDY = 12.0F;
    this.lDZ = 24.0F;
    this.lEa = 28.0F;
    this.lEb = 12.0F;
    this.lEc = 12.0F;
    this.lEd = getResources().getColor(2131690510);
    this.lEe = -1;
    this.lEf = getResources().getColor(2131690510);
    this.lEg = -1;
    this.nWb = 2147483647;
    this.iZn = 0;
    this.iZo = 0;
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
    this.rPZ = -1;
    this.rQa = -1;
    this.rQb = SportChartView.a.rQk;
    this.rQc = 7;
    this.rQe = new SportChartView.b[this.rQc];
    this.rQh = new SportChartView.1(this);
    bqd();
    AppMethodBeat.o(65429);
  }

  private void bqd()
  {
    AppMethodBeat.i(65435);
    this.aFY = new Paint();
    this.lFr = new Path();
    this.lFs = new Path();
    this.rQe = new SportChartView.b[this.rQc];
    cwI();
    cwJ();
    this.lCs = new GestureDetector(getContext(), this.rQh);
    AppMethodBeat.o(65435);
  }

  private void bqf()
  {
    AppMethodBeat.i(65436);
    this.aFY.reset();
    this.aFY.setAntiAlias(true);
    this.aFY.setStrokeWidth(this.lEo);
    this.aFY.setStyle(Paint.Style.STROKE);
    this.aFY.setColor(-1);
    AppMethodBeat.o(65436);
  }

  private void c(Canvas paramCanvas, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(65430);
    if (paramBoolean)
    {
      this.lFs.reset();
      this.lFs.moveTo(this.rQe[0].x, this.rQe[0].y);
      for (i = 0; i < this.rQe.length; i++)
        this.lFs.lineTo(this.rQe[i].x, this.rQe[i].y);
      this.lFs.lineTo(this.rQe[(this.rQe.length - 1)].x, this.iZo - this.lEE - 1);
      this.lFs.lineTo(this.lEs, this.iZo - this.lEE - 1);
      this.lFs.lineTo(this.lEs, this.rQe[0].y);
      paramCanvas.drawPath(this.lFs, this.aFY);
      AppMethodBeat.o(65430);
    }
    while (true)
    {
      return;
      this.lFs.reset();
      this.lFs.moveTo(this.rQe[0].x, this.rQe[0].y);
      if (i < this.rQe.length)
      {
        if (i > 0)
          if (this.rQe[(i - 1)].y == this.iZo - this.lEy)
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
          this.lFs.lineTo(this.rQe[i].x, this.rQe[i].y);
          paramCanvas.drawPath(this.lFs, this.aFY);
          this.lFs.reset();
          this.lFs.moveTo(this.rQe[i].x, this.rQe[i].y);
          i++;
          break;
          bqf();
          continue;
          bqf();
        }
      }
      AppMethodBeat.o(65430);
    }
  }

  private void cwI()
  {
    AppMethodBeat.i(65427);
    for (int i = 0; i < this.rQe.length; i++)
      this.rQe[i] = new SportChartView.b(this, 0);
    AppMethodBeat.o(65427);
  }

  private void cwJ()
  {
    int i = 0;
    if (i < this.rQc)
    {
      if (i == this.rQc - 1);
      for (this.rQe[i].rQn = true; ; this.rQe[i].rQn = false)
      {
        i++;
        break;
      }
    }
  }

  private void k(Canvas paramCanvas)
  {
    AppMethodBeat.i(65431);
    this.aFY.reset();
    this.aFY.setAntiAlias(true);
    this.aFY.setColor(-1);
    this.aFY.setStrokeWidth(0.0F);
    this.aFY.setStyle(Paint.Style.FILL);
    int i = 0;
    if (i < this.rQe.length)
    {
      if (i == this.rQe.length - 1)
        paramCanvas.drawCircle(this.rQe[i].x, this.rQe[i].y, this.lEm, this.aFY);
      while (true)
      {
        i++;
        break;
        paramCanvas.drawCircle(this.rQe[i].x, this.rQe[i].y, this.lEk, this.aFY);
      }
    }
    AppMethodBeat.o(65431);
  }

  private void l(Canvas paramCanvas)
  {
    AppMethodBeat.i(65434);
    this.aFY.reset();
    this.aFY.setAntiAlias(true);
    this.aFY.setStrokeWidth(0.0F);
    this.aFY.setTextSize(m(2, 12.0F));
    this.aFY.setAlpha(153);
    int i = 0;
    if (i < this.rQe.length)
    {
      if (i == 0)
      {
        this.aFY.setTextAlign(Paint.Align.LEFT);
        label78: if (!this.rQe[i].rQn)
          break label153;
        this.aFY.setColor(-1);
      }
      while (true)
      {
        paramCanvas.drawText(this.rQe[i].qkq, this.rQe[i].x, this.iZo - this.lEO, this.aFY);
        i++;
        break;
        this.aFY.setTextAlign(Paint.Align.CENTER);
        break label78;
        label153: this.aFY.setColor(this.lEd);
      }
    }
    AppMethodBeat.o(65434);
  }

  private void lq(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(65438);
    this.nWb = 2147483647;
    Object localObject1 = Calendar.getInstance();
    this.rQe = new SportChartView.b[this.rQc];
    cwI();
    int j;
    if ((this.rQd == null) || (this.rQd.size() <= 0))
    {
      this.rPY = true;
      ((Calendar)localObject1).add(5, -this.rQc);
      for (j = 0; j < this.rQe.length; j++)
      {
        ((Calendar)localObject1).add(5, 1);
        this.rQe[j].timestamp = ((Calendar)localObject1).getTimeInMillis();
        this.rQe[j].hzv = 0;
      }
      AppMethodBeat.o(65438);
    }
    while (true)
    {
      return;
      this.rPY = false;
      Object localObject2 = new ArrayList();
      ((List)localObject2).addAll(this.rQd);
      Collections.sort((List)localObject2);
      int k = ((List)localObject2).size();
      if ((paramBoolean) || (this.rQa == -1))
      {
        j = k / this.rQc;
        if (k % this.rQc == 0)
          break label421;
      }
      label421: for (this.rQa = (j + 1); ; this.rQa = j)
      {
        if (this.rQa > 4)
          this.rQa = 4;
        this.rPZ = this.rQa;
        int m = k - this.rQc * (this.rQa - this.rPZ + 1);
        j = m;
        if (m < 0)
          j = 0;
        m = k - this.rQc * (this.rQa - this.rPZ);
        ab.i("MicroMsg.Sport.SportChartView", "updateViewItems beginIndex:%d endIndex:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(m) });
        localObject2 = ((List)localObject2).subList(j, m);
        k = ((List)localObject2).size();
        j = i;
        if (k >= this.rQc)
          break;
        ((Calendar)localObject1).setTimeInMillis(((e)((List)localObject2).get(0)).field_timestamp);
        for (m = 0; ; m++)
        {
          j = i;
          if (m >= this.rQc - k)
            break;
          ((Calendar)localObject1).add(5, -1);
          e locale = new e();
          locale.field_timestamp = ((Calendar)localObject1).getTimeInMillis();
          locale.field_step = 0;
          ((List)localObject2).add(0, locale);
        }
      }
      while (j < this.rQc)
      {
        localObject1 = (e)((List)localObject2).get(j);
        this.rQe[j].hzv = ((e)localObject1).field_step;
        this.rQe[j].timestamp = ((e)localObject1).field_timestamp;
        j++;
      }
      AppMethodBeat.o(65438);
    }
  }

  private float m(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(65433);
    Object localObject = getContext();
    if (localObject == null);
    for (localObject = Resources.getSystem(); ; localObject = ((Context)localObject).getResources())
    {
      paramFloat = TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics());
      AppMethodBeat.o(65433);
      return paramFloat;
    }
  }

  public final void a(SportChartView.a parama)
  {
    AppMethodBeat.i(65426);
    this.rQb = parama;
    if (parama == SportChartView.a.rQk);
    for (this.rQc = 7; ; this.rQc = 30)
    {
      this.rQe = new SportChartView.b[this.rQc];
      cwI();
      AppMethodBeat.o(65426);
      return;
    }
  }

  public final void dD(List<e> paramList)
  {
    AppMethodBeat.i(65432);
    this.rQd = paramList;
    lq(true);
    invalidate();
    AppMethodBeat.o(65432);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(65437);
    this.iZn = getWidth();
    this.iZo = getHeight();
    this.lFk = ((this.iZn - this.lEs - this.lEu) / (this.rQc - 1));
    this.lFl = ((this.iZo - this.lEw - this.lEy) / 2);
    for (int i = 0; i < this.rQe.length; i++)
      this.rQe[i].x = (this.lEs + this.lFk * i);
    i = this.rQe.length;
    int j = i;
    if (i > this.rQc)
      j = this.rQc;
    int k = 0;
    i = 0;
    while (i < j)
    {
      if (this.rQe[i].hzv > 100000)
        this.rQe[i].hzv = 100000;
      if (this.rQe[i].hzv < 0)
        this.rQe[i].hzv = 0;
      int m = k;
      if (this.rQe[i].hzv > k)
        m = this.rQe[i].hzv;
      i++;
      k = m;
    }
    if ((k <= 15000) && (k >= 0))
      i = 15000;
    while (true)
    {
      this.lFh = ((this.iZo - this.lEw - this.lEy) * 10000 / i);
      this.lFh = (this.iZo - this.lEy - this.lFh);
      k = 0;
      while (true)
        if (k < j)
        {
          this.rQe[k].y = (this.iZo - this.lEy - this.rQe[k].hzv / i * (this.iZo - this.lEw - this.lEy));
          k++;
          continue;
          if ((k <= 15000) || (k > 100000))
            break label1998;
          i = k;
          if (k / 5000.0D <= k / 5000.0F)
            break;
          i = (k / 5000 + 1) * 5000;
          break;
        }
      i = 0;
      if (i < j)
      {
        if (i == 0)
          this.rQe[i].qkq = this.rPW.format(new Date(this.rQe[i].timestamp));
        while (true)
        {
          i++;
          break;
          if (this.rQb == SportChartView.a.rQl)
          {
            if (i % 6 == 5)
              this.rQe[i].qkq = this.rPX.format(new Date(this.rQe[i].timestamp));
            else
              this.rQe[i].qkq = "";
          }
          else
            this.rQe[i].qkq = this.rPX.format(new Date(this.rQe[i].timestamp));
        }
      }
      super.onDraw(paramCanvas);
      float f;
      if (!this.rPY)
      {
        k(paramCanvas);
        if (this.nWb != 2147483647)
        {
          i = this.nWb;
          if ((i >= 0) && (i <= this.rQc - 1))
          {
            this.aFY.reset();
            this.aFY.setColor(this.lEd);
            this.aFY.setAntiAlias(true);
            this.aFY.setStrokeWidth(0.0F);
            this.aFY.setTextSize(m(2, 12.0F));
            this.aFY.setTextAlign(Paint.Align.CENTER);
            if (i == 0)
              this.aFY.setTextAlign(Paint.Align.LEFT);
            if (i == this.rQc - 1)
              this.aFY.setTextAlign(Paint.Align.RIGHT);
            if (!this.lFx)
            {
              this.lFw = ((int)this.rQe[i].y - this.lEY);
              this.startY = this.lFw;
              this.lFx = true;
            }
            if (this.lFx)
            {
              f = (float)(this.startY / 8.0D);
              if (this.lFw > 0)
                this.aFY.setAlpha((this.startY - this.lFw) * 255 / this.startY);
              paramCanvas.drawText(this.rQe[i].hzv, this.rQe[i].x, this.lFw + this.lEY, this.aFY);
              if (this.rQb == SportChartView.a.rQl)
              {
                this.aFY.reset();
                this.lFr.reset();
                localObject = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
                this.aFY.setPathEffect((PathEffect)localObject);
                this.aFY.setColor(this.lDX);
                this.aFY.setStrokeWidth(this.lEq);
                this.aFY.setStyle(Paint.Style.STROKE);
                this.aFY.setAlpha(102);
                this.lFr.moveTo(this.rQe[i].x, this.iZo - this.lEE);
                this.lFr.lineTo(this.rQe[i].x, this.lFw + this.lEY + this.lEm);
                paramCanvas.drawPath(this.lFr, this.aFY);
              }
              if (this.lFw <= 0)
                break label1838;
              if (this.lFw / this.startY > 1.0F / f)
                break label1810;
              this.lFw -= 1;
              invalidate();
            }
          }
          label1041: i = this.nWb;
          if ((i >= 0) && (i <= this.rQc - 1))
            this.rQe[i].rQn = true;
        }
      }
      this.aFY.reset();
      this.lFr.reset();
      Object localObject = new DashPathEffect(new float[] { 5.0F, 5.0F }, 0.0F);
      this.aFY.setPathEffect((PathEffect)localObject);
      this.aFY.setColor(this.lDX);
      this.aFY.setStrokeWidth(this.lEq);
      this.aFY.setAlpha(102);
      this.aFY.setStyle(Paint.Style.STROKE);
      if ((this.lFh != 0) && (!this.rPY))
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
      if (!this.rPY)
      {
        this.aFY.reset();
        this.aFY.setColor(this.lEf);
        this.aFY.setAntiAlias(true);
        this.aFY.setAlpha(102);
        this.aFY.setStrokeWidth(0.0F);
        this.aFY.setTextSize(m(2, 12.0F));
        this.aFY.setTextAlign(Paint.Align.RIGHT);
        paramCanvas.drawText(getResources().getString(2131303896), this.iZn - this.lEM, (float)(this.lFh + this.aFY.getTextSize() * 0.34D), this.aFY);
      }
      if (this.rQg)
      {
        this.aFY.reset();
        this.aFY.setColor(-1);
        this.aFY.setAntiAlias(true);
        this.aFY.setStrokeWidth(0.0F);
        this.aFY.setTypeface(this.lFi);
        this.aFY.setTextAlign(Paint.Align.RIGHT);
        this.aFY.setTextSize(m(2, 28.0F));
        localObject = String.valueOf(this.rQf);
        paramCanvas.drawText((String)localObject, this.iZn - this.lEW, this.lEU, this.aFY);
        f = this.aFY.measureText((String)localObject);
        this.aFY.setTextSize(m(2, 24.0F));
        paramCanvas.drawText(getResources().getString(2131303899), this.iZn - this.lEW - f, this.lEQ, this.aFY);
      }
      while (true)
      {
        if (this.rQe.length > 2)
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
          if (!this.rPY)
            c(paramCanvas, false);
        }
        l(paramCanvas);
        AppMethodBeat.o(65437);
        return;
        label1810: this.lFw = ((int)(this.lFw - f * (this.lFw / this.startY)));
        break;
        label1838: this.lFx = false;
        break label1041;
        this.aFY.reset();
        this.aFY.setColor(-1);
        this.aFY.setAntiAlias(true);
        this.aFY.setStrokeWidth(0.0F);
        this.aFY.setTypeface(this.lFi);
        this.aFY.setTextSize(m(2, 24.0F));
        paramCanvas.drawText(getResources().getString(2131303898), this.lES, this.lEQ, this.aFY);
        this.aFY.setTextAlign(Paint.Align.RIGHT);
        this.aFY.setTextSize(m(2, 28.0F));
        paramCanvas.drawText(this.rQf, this.iZn - this.lEW, this.lEU, this.aFY);
      }
      label1998: i = 0;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(65439);
    this.lCs.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(65439);
    return true;
  }

  public void setHasSwitchBtn(boolean paramBoolean)
  {
    this.rQg = paramBoolean;
  }

  public void setTodayStep(int paramInt)
  {
    this.rQf = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.ui.SportChartView
 * JD-Core Version:    0.6.2
 */