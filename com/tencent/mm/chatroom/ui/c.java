package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.security.InvalidParameterException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

public final class c extends View
{
  protected static int eng = 32;
  protected static int enh;
  protected static int eni = 1;
  protected static int enj;
  protected static int enk = 10;
  protected static int enl;
  protected static int enm;
  protected static int enn;
  Collection<com.tencent.mm.chatroom.c.a> ejb;
  protected int enA;
  protected int enB;
  protected int enC;
  private final StringBuilder enD;
  protected boolean enE;
  protected boolean enF;
  protected int enG;
  protected int enH;
  protected int enI;
  protected int enJ;
  protected int enK;
  protected int enL;
  protected int enM;
  protected int enN;
  protected int enO;
  protected int enP;
  private int enQ;
  protected int enR;
  protected Boolean enS;
  protected int enT;
  protected int enU;
  protected int enV;
  final Time enW;
  private final Calendar enX;
  private final Calendar enY;
  private final Boolean enZ;
  protected int eno;
  protected Paint enp;
  protected Paint enq;
  protected Paint enr;
  protected Paint ens;
  protected Paint ent;
  protected int enu;
  protected int env;
  protected int enw;
  protected int enx;
  protected int eny;
  protected int enz;
  private DateFormatSymbols eoa;
  private c.a eob;
  public int fW;
  private Context mContext;
  protected int mWidth;

  public c(Context paramContext, TypedArray paramTypedArray)
  {
    super(paramContext);
    AppMethodBeat.i(104451);
    this.eno = 80;
    this.enE = false;
    this.enF = false;
    this.enG = -1;
    this.enH = -1;
    this.enI = -1;
    this.enJ = -1;
    this.enK = -1;
    this.enL = -1;
    this.enM = -1;
    this.enN = 1;
    this.enO = 7;
    this.enP = this.enO;
    this.enQ = 0;
    this.enT = eng;
    this.enU = 0;
    this.fW = 6;
    this.eoa = new DateFormatSymbols();
    this.ejb = new ArrayList();
    this.mContext = paramContext;
    paramContext = paramContext.getResources();
    this.enY = Calendar.getInstance();
    this.enX = Calendar.getInstance();
    this.enW = new Time(Time.getCurrentTimezone());
    this.enW.setToNow();
    this.enu = paramTypedArray.getColor(0, paramContext.getColor(2131690313));
    this.env = paramTypedArray.getColor(6, paramContext.getColor(2131690313));
    this.enw = paramTypedArray.getColor(7, paramContext.getColor(2131690313));
    this.enx = paramTypedArray.getColor(7, paramContext.getColor(2131690314));
    this.eny = paramTypedArray.getColor(5, paramContext.getColor(2131690313));
    this.enA = paramTypedArray.getColor(3, paramContext.getColor(2131690313));
    this.enB = paramTypedArray.getColor(4, paramContext.getColor(2131690270));
    this.enC = paramTypedArray.getColor(1, paramContext.getColor(2131690425));
    this.enz = paramTypedArray.getColor(2, paramContext.getColor(2131690426));
    this.enS = Boolean.valueOf(paramTypedArray.getBoolean(17, false));
    this.enD = new StringBuilder(50);
    enj = paramTypedArray.getDimensionPixelSize(8, paramContext.getDimensionPixelSize(2131428711));
    enn = paramTypedArray.getDimensionPixelSize(9, paramContext.getDimensionPixelSize(2131428713));
    enl = paramTypedArray.getDimensionPixelSize(10, paramContext.getDimensionPixelSize(2131428712));
    enm = paramTypedArray.getDimensionPixelOffset(11, paramContext.getDimensionPixelOffset(2131428435));
    enh = paramTypedArray.getDimensionPixelSize(12, paramContext.getDimensionPixelOffset(2131428619));
    this.enT = ((paramTypedArray.getDimensionPixelSize(13, paramContext.getDimensionPixelOffset(2131428145)) - enm) / 6);
    this.enU = paramTypedArray.getDimensionPixelSize(14, paramContext.getDimensionPixelOffset(2131428201));
    this.enZ = Boolean.valueOf(paramTypedArray.getBoolean(15, true));
    this.ens = new Paint();
    this.ens.setAntiAlias(true);
    this.ens.setTextSize(enn);
    this.ens.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
    this.ens.setColor(this.enx);
    this.ens.setTextAlign(Paint.Align.LEFT);
    this.ens.setStyle(Paint.Style.FILL);
    this.enr = new Paint();
    this.enr.setFakeBoldText(true);
    this.enr.setAntiAlias(true);
    this.enr.setColor(this.enz);
    this.enr.setTextAlign(Paint.Align.CENTER);
    this.enr.setStyle(Paint.Style.FILL);
    this.ent = new Paint();
    this.ent.setFakeBoldText(true);
    this.ent.setAntiAlias(true);
    this.ent.setColor(this.enC);
    this.ent.setTextAlign(Paint.Align.CENTER);
    this.ent.setStyle(Paint.Style.FILL);
    this.enp = new Paint();
    this.enp.setAntiAlias(true);
    this.enp.setTextSize(enl);
    this.enp.setColor(this.enx);
    this.enp.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
    this.enp.setStyle(Paint.Style.FILL);
    this.enp.setTextAlign(Paint.Align.CENTER);
    this.enp.setFakeBoldText(true);
    this.enq = new Paint();
    this.enq.setAntiAlias(true);
    this.enq.setTextSize(enj);
    this.enq.setStyle(Paint.Style.FILL);
    this.enq.setTextAlign(Paint.Align.CENTER);
    this.enq.setFakeBoldText(false);
    AppMethodBeat.o(104451);
  }

  private int KE()
  {
    if (this.enQ < this.enN);
    for (int i = this.enQ + this.enO; ; i = this.enQ)
      return i - this.enN;
  }

  private boolean a(int paramInt, Time paramTime)
  {
    if ((this.enV < paramTime.year) || ((this.enV == paramTime.year) && (this.enR < paramTime.month)) || ((this.enR == paramTime.month) && (paramInt < paramTime.monthDay)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void c(Canvas paramCanvas)
  {
    AppMethodBeat.i(104452);
    int i = enm;
    int j = enl / 2;
    int k = (this.mWidth - this.eno * 2) / (this.enO * 2);
    for (int m = 0; m < this.enO; m++)
    {
      int n = this.enN;
      int i1 = this.enO;
      int i2 = this.eno;
      this.enY.set(7, (n + m) % i1);
      paramCanvas.drawText(this.eoa.getShortWeekdays()[this.enY.get(7)].toUpperCase(Locale.getDefault()), (m * 2 + 1) * k + i2, i - j, this.enp);
    }
    AppMethodBeat.o(104452);
  }

  private void d(Canvas paramCanvas)
  {
    AppMethodBeat.i(104454);
    int i = (this.enT + enj) / 2 - eni + enm;
    int j = (this.mWidth - this.eno * 2) / (this.enO * 2);
    int k = KE();
    int m = 1;
    while ((m <= this.enP) && ((m <= this.enM) || (-1 == this.enM)))
    {
      int n = this.eno + (k * 2 + 1) * j;
      if (((this.enR == this.enI) && (this.enG == m) && (this.enK == this.enV)) || ((this.enR == this.enJ) && (this.enH == m) && (this.enL == this.enV)) || ((this.enE) && (this.enM == m) && (this.enG == -1)))
      {
        if (!this.enS.booleanValue())
          break label1369;
        paramCanvas.drawRoundRect(new RectF(n - enh, i - enj / 3 - enh, enh + n, i - enj / 3 + enh), 10.0F, 10.0F, this.ent);
      }
      while (true)
      {
        if ((this.enE) && (this.enM == m) && (this.enG == -1))
        {
          this.enq.setColor(this.enC);
          this.enq.setTypeface(Typeface.defaultFromStyle(0));
          this.enq.setTextSize(30.0F);
          paramCanvas.drawText(this.mContext.getResources().getString(2131304079), n, i + 12 + enh, this.enq);
        }
        this.enq.setTextSize(enj);
        if ((!this.enE) || (this.enM != m))
        {
          this.enq.setColor(this.eny);
          this.enq.setTypeface(Typeface.defaultFromStyle(0));
        }
        if ((this.enG != -1) && (this.enH != -1) && (this.enK == this.enL) && (this.enI == this.enJ) && (this.enG == this.enH) && (m == this.enG) && (this.enR == this.enI) && (this.enV == this.enK))
          this.enq.setColor(this.enC);
        if ((this.enG != -1) && (this.enH != -1) && (this.enK == this.enL) && (this.enK == this.enV) && (((this.enR == this.enI) && (this.enJ == this.enI) && (((this.enG < this.enH) && (m > this.enG) && (m < this.enH)) || ((this.enG > this.enH) && (m < this.enG) && (m > this.enH)))) || ((this.enI < this.enJ) && (this.enR == this.enI) && (m > this.enG)) || ((this.enI < this.enJ) && (this.enR == this.enJ) && (m < this.enH)) || ((this.enI > this.enJ) && (this.enR == this.enI) && (m < this.enG)) || ((this.enI > this.enJ) && (this.enR == this.enJ) && (m > this.enH))))
          this.enq.setColor(this.enC);
        if ((this.enG != -1) && (this.enH != -1) && (this.enK != this.enL) && (((this.enK == this.enV) && (this.enR == this.enI)) || ((this.enL == this.enV) && (this.enR == this.enJ) && (((this.enI < this.enJ) && (this.enR == this.enI) && (m < this.enG)) || ((this.enI < this.enJ) && (this.enR == this.enJ) && (m > this.enH)) || ((this.enI > this.enJ) && (this.enR == this.enI) && (m > this.enG)) || ((this.enI > this.enJ) && (this.enR == this.enJ) && (m < this.enH))))))
          this.enq.setColor(this.enC);
        if ((this.enG != -1) && (this.enH != -1) && (this.enK == this.enL) && (this.enV == this.enK) && (((this.enR > this.enI) && (this.enR < this.enJ) && (this.enI < this.enJ)) || ((this.enR < this.enI) && (this.enR > this.enJ) && (this.enI > this.enJ))))
          this.enq.setColor(this.enC);
        if ((this.enG != -1) && (this.enH != -1) && (this.enK != this.enL) && (((this.enK < this.enL) && (((this.enR > this.enI) && (this.enV == this.enK)) || ((this.enR < this.enJ) && (this.enV == this.enL)))) || ((this.enK > this.enL) && (((this.enR < this.enI) && (this.enV == this.enK)) || ((this.enR > this.enJ) && (this.enV == this.enL))))))
          this.enq.setColor(this.enC);
        if ((!this.enZ.booleanValue()) && (a(m, this.enW)) && (this.enW.month == this.enR) && (this.enW.year == this.enV))
        {
          this.enq.setColor(this.enA);
          this.enq.setTypeface(Typeface.defaultFromStyle(2));
        }
        Iterator localIterator = this.ejb.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.chatroom.c.a locala = (com.tencent.mm.chatroom.c.a)localIterator.next();
          if ((locala.ehf == m) && (locala.month == this.enR) && (locala.year == this.enV))
          {
            this.enq.setColor(this.enB);
            this.enq.setTypeface(Typeface.defaultFromStyle(0));
          }
        }
        label1369: paramCanvas.drawCircle(n, i - enj / 3, enh, this.ent);
      }
      if (((this.enR == this.enI) && (this.enG == m) && (this.enK == this.enV)) || ((this.enR == this.enJ) && (this.enH == m) && (this.enL == this.enV)) || ((this.enE) && (this.enM == m) && (this.enG == -1)))
      {
        this.enq.setTypeface(Typeface.defaultFromStyle(0));
        this.enq.setColor(-1);
      }
      paramCanvas.drawText(String.format("%d", new Object[] { Integer.valueOf(m) }), n, i, this.enq);
      int i1 = k + 1;
      k = i1;
      n = i;
      if (i1 == this.enO)
      {
        k = 0;
        n = i + this.enT;
      }
      m++;
      i = n;
    }
    AppMethodBeat.o(104454);
  }

  private String getMonthAndYearString()
  {
    AppMethodBeat.i(104453);
    this.enD.setLength(0);
    long l = this.enX.getTimeInMillis();
    String str = DateUtils.formatDateRange(getContext(), l, l, 52);
    AppMethodBeat.o(104453);
    return str;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(104455);
    int i = (this.mWidth - this.eno * 2) / (this.enO * 2);
    int j = this.eno;
    int k = enn / 2;
    int m = (enm - enn) / 2;
    int n = enn;
    StringBuilder localStringBuilder = new StringBuilder(getMonthAndYearString().toLowerCase());
    localStringBuilder.setCharAt(0, Character.toUpperCase(localStringBuilder.charAt(0)));
    paramCanvas.drawText(localStringBuilder.toString(), i + j - k, m + n, this.ens);
    paramCanvas.drawLine(0.0F, enm, this.mWidth, enm + 1, this.ens);
    c(paramCanvas);
    d(paramCanvas);
    AppMethodBeat.o(104455);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104456);
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), this.enT * this.fW + enm + this.enU);
    AppMethodBeat.o(104456);
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mWidth = paramInt1;
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(104457);
    float f1;
    float f2;
    int i;
    if (paramMotionEvent.getAction() == 1)
    {
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      i = this.eno;
      if ((f1 >= i) && (f1 <= this.mWidth - this.eno))
        break label136;
      paramMotionEvent = null;
    }
    while (true)
    {
      if ((paramMotionEvent != null) && (this.eob != null) && ((this.enZ.booleanValue()) || (paramMotionEvent.month != this.enW.month) || (paramMotionEvent.year != this.enW.year) || (paramMotionEvent.ehf >= this.enW.monthDay)))
        this.eob.b(paramMotionEvent);
      AppMethodBeat.o(104457);
      return true;
      label136: int j = (int)(f2 - enm) / this.enT;
      i = (int)((f1 - i) * this.enO / (this.mWidth - i - this.eno)) - KE() + 1 + j * this.enO;
      if ((this.enR > 11) || (this.enR < 0) || (com.tencent.mm.chatroom.f.a.bP(this.enR, this.enV) < i) || (i <= 0))
      {
        paramMotionEvent = null;
      }
      else
      {
        com.tencent.mm.chatroom.c.a locala = new com.tencent.mm.chatroom.c.a(this.enV, this.enR, i);
        Iterator localIterator = this.ejb.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            paramMotionEvent = (com.tencent.mm.chatroom.c.a)localIterator.next();
            if (paramMotionEvent.equals(locala))
              break;
          }
        paramMotionEvent = null;
      }
    }
  }

  public final void setMarkDate(Collection<com.tencent.mm.chatroom.c.a> paramCollection)
  {
    AppMethodBeat.i(104458);
    if (paramCollection != null)
    {
      this.ejb = paramCollection;
      AppMethodBeat.o(104458);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.SimpleMonthView", "markDateList is null");
      AppMethodBeat.o(104458);
    }
  }

  public final void setMonthParams(HashMap<String, Integer> paramHashMap)
  {
    int i = 0;
    AppMethodBeat.i(104459);
    if ((!paramHashMap.containsKey("month")) && (!paramHashMap.containsKey("year")))
    {
      paramHashMap = new InvalidParameterException("You must specify month and year for this view");
      AppMethodBeat.o(104459);
      throw paramHashMap;
    }
    setTag(paramHashMap);
    if (paramHashMap.containsKey("height"))
    {
      this.enT = ((Integer)paramHashMap.get("height")).intValue();
      if (this.enT < enk)
        this.enT = enk;
    }
    if (paramHashMap.containsKey("selected_begin_day"))
      this.enG = ((Integer)paramHashMap.get("selected_begin_day")).intValue();
    if (paramHashMap.containsKey("selected_last_day"))
      this.enH = ((Integer)paramHashMap.get("selected_last_day")).intValue();
    if (paramHashMap.containsKey("selected_begin_month"))
      this.enI = ((Integer)paramHashMap.get("selected_begin_month")).intValue();
    if (paramHashMap.containsKey("selected_last_month"))
      this.enJ = ((Integer)paramHashMap.get("selected_last_month")).intValue();
    if (paramHashMap.containsKey("selected_begin_year"))
      this.enK = ((Integer)paramHashMap.get("selected_begin_year")).intValue();
    if (paramHashMap.containsKey("selected_last_year"))
      this.enL = ((Integer)paramHashMap.get("selected_last_year")).intValue();
    this.enR = ((Integer)paramHashMap.get("month")).intValue();
    this.enV = ((Integer)paramHashMap.get("year")).intValue();
    this.enE = false;
    this.enM = -1;
    this.enX.set(2, this.enR);
    this.enX.set(1, this.enV);
    this.enX.set(5, 1);
    this.enQ = this.enX.get(7);
    if (paramHashMap.containsKey("week_start"))
    {
      this.enN = ((Integer)paramHashMap.get("week_start")).intValue();
      this.enP = com.tencent.mm.chatroom.f.a.bP(this.enR, this.enV);
      j = 0;
      label392: if (j >= this.enP)
        break label500;
      k = j + 1;
      paramHashMap = this.enW;
      if ((this.enV != paramHashMap.year) || (this.enR != paramHashMap.month) || (k != paramHashMap.monthDay))
        break label494;
    }
    label494: for (int m = 1; ; m = 0)
    {
      if (m != 0)
      {
        this.enE = true;
        this.enM = k;
      }
      this.enF = a(k, this.enW);
      j++;
      break label392;
      this.enN = this.enX.getFirstDayOfWeek();
      break;
    }
    label500: int k = KE();
    m = (this.enP + k) / this.enO;
    int j = i;
    if ((k + this.enP) % this.enO > 0)
      j = 1;
    this.fW = (m + j);
    AppMethodBeat.o(104459);
  }

  public final void setOnDayClickListener(c.a parama)
  {
    this.eob = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.c
 * JD-Core Version:    0.6.2
 */