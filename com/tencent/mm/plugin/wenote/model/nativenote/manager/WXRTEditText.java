package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView.v;
import android.text.Editable;
import android.text.Layout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ParagraphStyle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.b.c;
import com.tencent.mm.plugin.wenote.model.nativenote.c.d;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.k;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.m;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.n;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.edittext.PasterEditText;
import java.util.ArrayList;

public class WXRTEditText extends PasterEditText
  implements SpanWatcher
{
  public int aaF;
  private ap gyS;
  public boolean uOb;
  public int uOd;
  c uPG;
  private int uPH;
  private int uPI;
  private boolean uPJ;
  private boolean uPK;
  private int uPL;
  private int uPM;
  private String uPN;
  public String uPO;
  private Spannable uPP;
  int uPQ;
  private WXRTEditText uPR;
  public RecyclerView.v uPS;
  private boolean uPT;
  private boolean uPU;
  private boolean uPV;
  private boolean uPW;
  private boolean uPX;
  private boolean uPY;
  private boolean uPZ;
  private j uQa;
  public boolean uQb;
  public boolean uQc;
  private int uQd;
  private Paint uQe;
  private com.tencent.mm.plugin.wenote.model.nativenote.c.b uQf;
  private boolean uQg;
  private Path uQh;
  private int uQi;
  private int uQj;
  private int uQk;
  private boolean uQl;
  TextWatcher uQm;
  int uQn;

  public WXRTEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(26789);
    this.uPH = -1;
    this.uPI = -1;
    this.uPJ = false;
    this.uPO = "";
    this.uPQ = 0;
    this.uPR = null;
    this.aaF = 0;
    this.uOb = false;
    this.uPY = false;
    this.uQb = false;
    this.uOd = 0;
    this.uQc = false;
    this.uQd = -1;
    this.uQe = null;
    this.gyS = null;
    this.uQf = null;
    this.uQg = false;
    this.uQh = null;
    this.uQi = -1;
    this.uQj = -1;
    this.uQk = -1;
    this.uQl = false;
    this.uQm = new WXRTEditText.2(this);
    this.uQn = 0;
    init();
    AppMethodBeat.o(26789);
  }

  public WXRTEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(26790);
    this.uPH = -1;
    this.uPI = -1;
    this.uPJ = false;
    this.uPO = "";
    this.uPQ = 0;
    this.uPR = null;
    this.aaF = 0;
    this.uOb = false;
    this.uPY = false;
    this.uQb = false;
    this.uOd = 0;
    this.uQc = false;
    this.uQd = -1;
    this.uQe = null;
    this.gyS = null;
    this.uQf = null;
    this.uQg = false;
    this.uQh = null;
    this.uQi = -1;
    this.uQj = -1;
    this.uQk = -1;
    this.uQl = false;
    this.uQm = new WXRTEditText.2(this);
    this.uQn = 0;
    init();
    AppMethodBeat.o(26790);
  }

  private void b(Spannable paramSpannable)
  {
    AppMethodBeat.i(26807);
    int i = getSelectionStart();
    com.tencent.mm.cb.g localg = com.tencent.mm.cb.g.dqQ();
    getContext();
    setSpannableText(localg.b(paramSpannable, getTextSize()));
    int j = getText().length() - paramSpannable.length();
    if (j > 0)
    {
      j = i + j;
      if (j <= getText().length())
        setSelection(j);
      AppMethodBeat.o(26807);
    }
    while (true)
    {
      return;
      setSelection(i);
      AppMethodBeat.o(26807);
    }
  }

  private void deP()
  {
    AppMethodBeat.i(26812);
    Editable localEditable = getText();
    if (localEditable.getSpans(0, localEditable.length(), getClass()) != null)
      localEditable.setSpan(this, 0, localEditable.length(), 18);
    AppMethodBeat.o(26812);
  }

  private void deQ()
  {
    AppMethodBeat.i(26820);
    if (this.gyS == null)
    {
      this.gyS = new ap(new WXRTEditText.3(this), false);
      AppMethodBeat.o(26820);
    }
    while (true)
    {
      return;
      this.gyS.stopTimer();
      AppMethodBeat.o(26820);
    }
  }

  private void deR()
  {
    AppMethodBeat.i(26822);
    if (this.uQf == null)
    {
      this.uQf = new com.tencent.mm.plugin.wenote.model.nativenote.c.b();
      AppMethodBeat.o(26822);
    }
    while (true)
    {
      return;
      this.uQf.reset();
      AppMethodBeat.o(26822);
    }
  }

  private void gI(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26823);
    if (this.uPQ == 2)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().H(this.uQd, 1, this.uQd, 1);
      AppMethodBeat.o(26823);
    }
    while (true)
    {
      return;
      if (this.uPQ == 1)
      {
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().H(this.uQd, 0, this.uQd, 0);
        AppMethodBeat.o(26823);
      }
      else
      {
        com.tencent.mm.plugin.wenote.model.nativenote.c.e locale = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb();
        int i = this.uQd;
        locale.H(i, paramInt1, i, paramInt2);
        AppMethodBeat.o(26823);
      }
    }
  }

  private j getRTLayout()
  {
    AppMethodBeat.i(26815);
    try
    {
      if ((this.uQa == null) || (this.uPZ))
      {
        localj = new com/tencent/mm/plugin/wenote/model/nativenote/manager/j;
        localj.<init>(getText());
        this.uQa = localj;
        this.uPZ = false;
      }
      j localj = this.uQa;
      return localj;
    }
    finally
    {
      AppMethodBeat.o(26815);
    }
  }

  private void init()
  {
    AppMethodBeat.i(26792);
    this.uPR = this;
    removeTextChangedListener(this.uQm);
    addTextChangedListener(this.uQm);
    setMovementMethod(com.tencent.mm.plugin.wenote.model.nativenote.spans.i.dfD());
    this.uQd = -1;
    this.uQe = new Paint(1);
    this.uQe.setColor(1347529272);
    this.uQf = new com.tencent.mm.plugin.wenote.model.nativenote.c.b();
    this.uQh = new Path();
    this.uQi = -1;
    this.uQj = -1;
    this.uQk = -1;
    if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled())
    {
      setHighlightColor(0);
      setCustomSelectionActionModeCallback(new WXRTEditText.1(this));
    }
    AppMethodBeat.o(26792);
  }

  private void setParagraphsAreUp2Date(boolean paramBoolean)
  {
    try
    {
      if (!this.uPX)
        this.uPW = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String a(i parami)
  {
    AppMethodBeat.i(26804);
    if (parami == i.uQq)
    {
      parami = getText().toString();
      AppMethodBeat.o(26804);
    }
    while (true)
    {
      return parami;
      if (parami == i.uQr)
      {
        parami = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(getText());
        AppMethodBeat.o(26804);
      }
      else
      {
        parami = "";
        AppMethodBeat.o(26804);
      }
    }
  }

  public final <V, C extends com.tencent.mm.plugin.wenote.model.nativenote.spans.g<V>> void a(t<V, C> paramt, V paramV)
  {
    AppMethodBeat.i(26811);
    Spannable localSpannable;
    if ((!this.uPY) && (!this.uPV))
      if (this.uPK)
      {
        localSpannable = null;
        paramt.a(this, paramV);
      }
    while (true)
    {
      try
      {
        if ((this.uPG != null) && (!this.uPK))
        {
          paramt = deK();
          paramV = this.uPG;
          getSelectionStart();
          getSelectionEnd();
          getSelectionStart();
          paramV.a(this, localSpannable, paramt, getSelectionEnd());
        }
        this.uPZ = true;
        return;
        localSpannable = deK();
        break;
      }
      finally
      {
        AppMethodBeat.o(26811);
      }
      AppMethodBeat.o(26811);
    }
  }

  public final void ax(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(26821);
    Editable localEditable = getText();
    if (localEditable == null)
      AppMethodBeat.o(26821);
    Layout localLayout;
    int i;
    while (true)
    {
      return;
      localLayout = getLayout();
      if (localLayout == null)
      {
        AppMethodBeat.o(26821);
      }
      else
      {
        i = localEditable.length();
        if ((paramInt >= 0) && (paramInt <= i))
          break;
        AppMethodBeat.o(26821);
      }
    }
    int j;
    if (i == 0)
    {
      paramInt = 0;
      j = 0;
    }
    while (true)
    {
      if ((j < 0) || (j > i) || (paramInt < 0) || (paramInt > i))
      {
        AppMethodBeat.o(26821);
        break;
        if (paramInt < i)
        {
          if ((!paramBoolean) && (localEditable.charAt(paramInt) == '\n'))
            break label255;
          k = localLayout.getOffsetToRightOf(paramInt);
          j = paramInt;
          paramInt = k;
          continue;
        }
        if ((paramInt != i) || (!paramBoolean))
          break label255;
        j = localLayout.getOffsetToLeftOf(paramInt);
        continue;
      }
      if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().isEditable())
      {
        requestFocus();
        setIgnoreSelectChangeByMultiSelect(true);
        setSelection(j, paramInt);
        setIgnoreSelectChangeByMultiSelect(false);
        if (this.uPG != null)
        {
          this.uPG.g(true, 50L);
          this.uPG.Kb(1);
        }
      }
      gI(j, paramInt);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().ab(true, true);
      AppMethodBeat.o(26821);
      break;
      label255: j = paramInt;
      int k = paramInt;
      paramInt = j;
      j = k;
    }
  }

  public final void deJ()
  {
    AppMethodBeat.i(26797);
    if (this.uPG != null)
    {
      this.uPG.g(true, 50L);
      this.uPG.Kb(1);
    }
    AppMethodBeat.o(26797);
  }

  public final Spannable deK()
  {
    AppMethodBeat.i(26801);
    Object localObject = super.getText();
    if (localObject != null);
    while (true)
    {
      localObject = new a((CharSequence)localObject);
      AppMethodBeat.o(26801);
      return localObject;
      localObject = "";
    }
  }

  public final void deL()
  {
    try
    {
      this.uPK = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void deM()
  {
    try
    {
      this.uPK = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void deN()
  {
    try
    {
      this.uPJ = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void deO()
  {
    try
    {
      this.uPJ = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(26798);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(26798);
    return bool;
  }

  public m[] getCurrentEditorCursorNumberSpan()
  {
    AppMethodBeat.i(26817);
    Object localObject = getParagraphsInSelection();
    localObject = (m[])getText().getSpans(((e)localObject).aqm, ((e)localObject).Ls, m.class);
    AppMethodBeat.o(26817);
    return localObject;
  }

  public String getCurrentEditorCursorParagraphStr()
  {
    AppMethodBeat.i(26816);
    Object localObject = getParagraphsInSelection();
    localObject = getText().subSequence(((e)localObject).aqm, ((e)localObject).Ls).toString().trim();
    AppMethodBeat.o(26816);
    return localObject;
  }

  public int getEditTextType()
  {
    return this.uPQ;
  }

  public ArrayList<n> getParagraphs()
  {
    AppMethodBeat.i(26814);
    ArrayList localArrayList = getRTLayout().uQu;
    AppMethodBeat.o(26814);
    return localArrayList;
  }

  public e getParagraphsInSelection()
  {
    int i = 0;
    AppMethodBeat.i(26813);
    j localj = getRTLayout();
    e locale = new e(this);
    int j = localj.getLineForOffset(locale.aqm);
    int k;
    int m;
    if (locale.isEmpty())
    {
      k = locale.Ls;
      m = localj.getLineForOffset(k);
      if ((localj.uQt != 0) && (j >= 0))
        break label117;
      k = 0;
      label68: j = i;
      if (localj.uQt != 0)
      {
        if (m >= 0)
          break label172;
        j = i;
      }
    }
    while (true)
    {
      locale = new e(k, j);
      AppMethodBeat.o(26813);
      return locale;
      k = locale.Ls - 1;
      break;
      label117: if (j < localj.uQt)
      {
        k = ((n)localj.uQu.get(j)).aqm;
        break label68;
      }
      k = ((n)localj.uQu.get(localj.uQt - 1)).Ls - 1;
      break label68;
      label172: if (m < localj.uQt)
        j = ((n)localj.uQu.get(m)).Ls;
      else
        j = ((n)localj.uQu.get(localj.uQt - 1)).Ls - 1;
    }
  }

  public int getPosInDataList()
  {
    return this.uQd;
  }

  public int getRecyclerItemPosition()
  {
    AppMethodBeat.i(26805);
    int i;
    if (this.uPS.ki() == -1)
    {
      i = 0;
      AppMethodBeat.o(26805);
    }
    while (true)
    {
      return i;
      i = this.uPS.ki();
      AppMethodBeat.o(26805);
    }
  }

  public String getSelectedText()
  {
    AppMethodBeat.i(26802);
    Object localObject = getText();
    e locale = getSelection();
    if ((locale.aqm >= 0) && (locale.Ls >= 0) && (locale.Ls <= ((Spannable)localObject).length()))
    {
      localObject = ((Spannable)localObject).subSequence(locale.aqm, locale.Ls).toString();
      AppMethodBeat.o(26802);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(26802);
    }
  }

  public e getSelection()
  {
    AppMethodBeat.i(26803);
    e locale = new e(getSelectionStart(), getSelectionEnd());
    AppMethodBeat.o(26803);
    return locale;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(26818);
    Editable localEditable;
    Object localObject;
    int i;
    int j;
    int k;
    int m;
    if ((com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled()) && (this.uPQ == 0))
    {
      localEditable = getText();
      if (localEditable != null)
      {
        localObject = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfd();
        i = -1;
        j = 0;
        switch (com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().Kh(this.uQd))
        {
        default:
          k = 0;
          m = 0;
          if ((i >= 0) && (m <= localEditable.length()) && (i <= m))
            break;
        case 1:
        case 2:
        case 4:
        case 3:
        }
      }
    }
    do
    {
      do
      {
        super.onDraw(paramCanvas);
        AppMethodBeat.o(26818);
        return;
      }
      while (((d)localObject).startOffset == ((d)localObject).uRf);
      i = ((d)localObject).startOffset;
      m = ((d)localObject).uRf;
      k = 0;
      break;
      i = 0;
      m = localEditable.length();
      j = 1;
      k = 1;
      break;
      i = ((d)localObject).startOffset;
      m = localEditable.length();
      j = 1;
      k = 0;
      break;
      i = 0;
      m = ((d)localObject).uRf;
      k = 1;
      break;
      localObject = getLayout();
    }
    while (localObject == null);
    if (this.uQi == -1)
      this.uQi = getPaddingLeft();
    if (this.uQj == -1)
      this.uQj = getPaddingTop();
    if (this.uQk == -1)
      this.uQk = getPaddingBottom();
    if (this.uQh == null)
      this.uQh = new Path();
    this.uQh.reset();
    label522: label818: 
    while (true)
    {
      int n;
      int i1;
      int i2;
      float f1;
      float f2;
      float f3;
      float f4;
      float f5;
      float f6;
      try
      {
        n = ((Layout)localObject).getLineForOffset(i);
        i1 = ((Layout)localObject).getLineForOffset(m);
        if (n > i1)
          break;
        i2 = ((Layout)localObject).getWidth();
        f1 = ((Layout)localObject).getPrimaryHorizontal(i) + this.uQi;
        f2 = ((Layout)localObject).getLineTop(n) + this.uQj;
        f3 = ((Layout)localObject).getLineBottom(n) + this.uQj;
        f4 = ((Layout)localObject).getPrimaryHorizontal(m) + this.uQi;
        f5 = ((Layout)localObject).getLineTop(i1) + this.uQj;
        f6 = ((Layout)localObject).getLineBottom(i1) + this.uQj;
        if ((k == 0) || (j == 0))
          break label522;
        this.uQh.addRect(this.uQi, 0.0F, this.uQi + i2, f6 + this.uQk, Path.Direction.CW);
        if (this.uQh.isEmpty())
          break;
        if (this.uQe == null)
        {
          localObject = new android/graphics/Paint;
          ((Paint)localObject).<init>(1);
          this.uQe = ((Paint)localObject);
          this.uQe.setColor(1347529272);
        }
        paramCanvas.drawPath(this.uQh, this.uQe);
      }
      catch (Exception localException)
      {
        ab.e("noteeditor.WXRTEditText", "tryDrawCover: ", new Object[] { localException });
      }
      break;
      if (n == i1)
      {
        if (k != 0)
          this.uQh.addRect(this.uQi, 0.0F, f4, f6, Path.Direction.CW);
        else if (j != 0)
          this.uQh.addRect(f1, f2, this.uQi + i2, f6 + this.uQk, Path.Direction.CW);
        else
          this.uQh.addRect(f1, f2, f4, f6, Path.Direction.CW);
      }
      else
      {
        if (k != 0)
        {
          this.uQh.addRect(this.uQi, 0.0F, this.uQi + i2, f3, Path.Direction.CW);
          this.uQh.addRect(this.uQi, f5, f4, f6, Path.Direction.CW);
        }
        while (true)
        {
          if (i1 - n <= 1)
            break label818;
          this.uQh.addRect(this.uQi, f3, this.uQi + i2, f5, Path.Direction.CW);
          break;
          if (j != 0)
          {
            this.uQh.addRect(f1, f2, this.uQi + i2, f3, Path.Direction.CW);
            this.uQh.addRect(this.uQi, f5, this.uQi + i2, f6 + this.uQk, Path.Direction.CW);
          }
          else
          {
            this.uQh.addRect(f1, f2, this.uQi + i2, f3, Path.Direction.CW);
            this.uQh.addRect(this.uQi, f5, f4, f6, Path.Direction.CW);
          }
        }
      }
    }
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    AppMethodBeat.i(26799);
    this.uQl = false;
    this.uPH = -1;
    this.uPI = -1;
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (this.uPG != null)
      this.uPG.a(this, paramBoolean, getRecyclerItemPosition());
    if ((paramBoolean) && (!this.uQl))
      onSelectionChanged(getSelectionStart(), getSelectionEnd());
    AppMethodBeat.o(26799);
  }

  protected void onSelectionChanged(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26800);
    try
    {
      if (this.uPJ);
      while (true)
      {
        return;
        this.uQl = true;
        if (paramInt1 >= 0)
          break;
        AppMethodBeat.o(26800);
      }
    }
    finally
    {
      AppMethodBeat.o(26800);
    }
    if ((this.uPH != paramInt1) || (this.uPI != paramInt2))
    {
      this.uPH = paramInt1;
      this.uPI = paramInt2;
      super.onSelectionChanged(paramInt1, paramInt2);
      if (paramInt2 <= paramInt1)
        break label247;
    }
    label247: for (boolean bool = true; ; bool = false)
    {
      this.uPU = bool;
      if ((!this.uPV) && (!this.uPW))
      {
        this.uPX = true;
        u.a(this, new t[0]);
        this.uPX = false;
        setParagraphsAreUp2Date(true);
      }
      if (this.uPG != null)
      {
        this.uPY = true;
        this.uPG.a(this, paramInt1, paramInt2);
        this.uPY = false;
      }
      if ((com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled()) && (!this.uQg) && (hasFocus()) && (this.uQd >= 0))
      {
        gI(paramInt1, paramInt2);
        if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().Kh(this.uQd) == 1)
        {
          com.tencent.mm.plugin.wenote.model.nativenote.c.e locale = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb();
          if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit)
          {
            locale.h(true, 0L);
            locale.dfj();
            locale.dfh();
          }
        }
      }
      AppMethodBeat.o(26800);
      break;
    }
  }

  public void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26808);
    this.uPT = true;
    if (((paramObject instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.g)) && ((paramObject instanceof ParagraphStyle)))
      setParagraphsAreUp2Date(false);
    AppMethodBeat.o(26808);
  }

  public void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(26810);
    this.uPT = true;
    if (((paramObject instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.g)) && ((paramObject instanceof ParagraphStyle)))
      setParagraphsAreUp2Date(false);
    AppMethodBeat.o(26810);
  }

  public void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26809);
    this.uPT = true;
    if (((paramObject instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.g)) && ((paramObject instanceof ParagraphStyle)))
      setParagraphsAreUp2Date(false);
    AppMethodBeat.o(26809);
  }

  // ERROR //
  public boolean onTextContextMenuItem(int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: sipush 26806
    //   5: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: iload_1
    //   9: ldc_w 627
    //   12: if_icmpne +20 -> 32
    //   15: aload_0
    //   16: getfield 238	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uPG	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   19: invokeinterface 630 1 0
    //   24: sipush 26806
    //   27: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: iload_2
    //   31: ireturn
    //   32: iload_1
    //   33: ldc_w 631
    //   36: if_icmpeq +10 -> 46
    //   39: iload_1
    //   40: ldc_w 632
    //   43: if_icmpne +90 -> 133
    //   46: invokestatic 637	com/tencent/mm/plugin/wenote/model/nativenote/manager/f:clearData	()V
    //   49: aload_0
    //   50: iload_1
    //   51: invokespecial 639	com/tencent/mm/ui/widget/edittext/PasterEditText:onTextContextMenuItem	(I)Z
    //   54: istore_2
    //   55: iload_1
    //   56: ldc_w 640
    //   59: if_icmpne +18 -> 77
    //   62: aload_0
    //   63: iconst_0
    //   64: putfield 122	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uQn	I
    //   67: aload_0
    //   68: invokevirtual 179	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getText	()Landroid/text/Editable;
    //   71: astore_3
    //   72: aload_0
    //   73: aload_3
    //   74: invokespecial 642	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:b	(Landroid/text/Spannable;)V
    //   77: iload_1
    //   78: ldc_w 640
    //   81: if_icmpne +43 -> 124
    //   84: aload_0
    //   85: getfield 85	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uOb	Z
    //   88: ifeq +36 -> 124
    //   91: aload_0
    //   92: getfield 238	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uPG	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   95: ifnull +24 -> 119
    //   98: aload_0
    //   99: getfield 238	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uPG	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   102: iconst_0
    //   103: lconst_0
    //   104: invokeinterface 401 4 0
    //   109: aload_0
    //   110: getfield 238	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uPG	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   113: iconst_0
    //   114: invokeinterface 404 2 0
    //   119: aload_0
    //   120: iconst_0
    //   121: putfield 85	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uOb	Z
    //   124: sipush 26806
    //   127: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: goto -100 -> 30
    //   133: iload_1
    //   134: ldc_w 640
    //   137: if_icmpne -88 -> 49
    //   140: aload_0
    //   141: invokevirtual 164	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getContext	()Landroid/content/Context;
    //   144: pop
    //   145: invokestatic 645	com/tencent/mm/plugin/wenote/model/nativenote/manager/f:deC	()I
    //   148: istore 4
    //   150: iload 4
    //   152: iconst_2
    //   153: if_icmpne +9 -> 162
    //   156: invokestatic 637	com/tencent/mm/plugin/wenote/model/nativenote/manager/f:clearData	()V
    //   159: goto -110 -> 49
    //   162: iload 4
    //   164: iconst_3
    //   165: if_icmpne -116 -> 49
    //   168: aload_0
    //   169: getfield 238	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uPG	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   172: aload_0
    //   173: invokeinterface 647 2 0
    //   178: sipush 26806
    //   181: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: goto -154 -> 30
    //   187: astore_3
    //   188: ldc_w 567
    //   191: ldc_w 649
    //   194: iconst_1
    //   195: anewarray 197	java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: aload_3
    //   201: aastore
    //   202: invokestatic 574	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: sipush 26806
    //   208: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   211: iconst_0
    //   212: istore_2
    //   213: goto -183 -> 30
    //   216: astore 5
    //   218: ldc_w 567
    //   221: ldc_w 651
    //   224: iconst_1
    //   225: anewarray 197	java/lang/Object
    //   228: dup
    //   229: iconst_0
    //   230: aload_0
    //   231: getfield 122	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uQn	I
    //   234: invokestatic 657	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   237: aastore
    //   238: invokestatic 574	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   241: aload_0
    //   242: getfield 122	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uQn	I
    //   245: iconst_3
    //   246: if_icmpge +44 -> 290
    //   249: aload_0
    //   250: aload_0
    //   251: getfield 122	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uQn	I
    //   254: iconst_1
    //   255: iadd
    //   256: putfield 122	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:uQn	I
    //   259: aload_0
    //   260: new 659	android/text/SpannableStringBuilder
    //   263: dup
    //   264: iconst_2
    //   265: anewarray 451	java/lang/CharSequence
    //   268: dup
    //   269: iconst_0
    //   270: ldc_w 661
    //   273: aastore
    //   274: dup
    //   275: iconst_1
    //   276: aload_3
    //   277: aastore
    //   278: invokestatic 667	android/text/TextUtils:concat	([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   281: invokespecial 668	android/text/SpannableStringBuilder:<init>	(Ljava/lang/CharSequence;)V
    //   284: invokespecial 642	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:b	(Landroid/text/Spannable;)V
    //   287: goto -210 -> 77
    //   290: sipush 26806
    //   293: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   296: aload 5
    //   298: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   49	55	187	java/lang/NullPointerException
    //   72	77	216	java/lang/IndexOutOfBoundsException
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(26819);
    Object localObject1;
    boolean bool3;
    int j;
    if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled())
    {
      localObject1 = getText();
      if (localObject1 == null)
      {
        deR();
        AppMethodBeat.o(26819);
      }
      int i;
      for (bool3 = bool2; ; bool3 = bool2)
      {
        return bool3;
        i = ((Editable)localObject1).length();
        j = getOffsetForPosition(paramMotionEvent.getX(), paramMotionEvent.getY());
        if ((i >= 0) && (j >= 0) && (j <= i))
          break;
        deR();
        AppMethodBeat.o(26819);
      }
      switch (paramMotionEvent.getAction())
      {
      case 2:
      default:
      case 0:
      case 3:
      case 1:
      }
      label132: label407: 
      do
      {
        do
        {
          while (true)
          {
            AppMethodBeat.o(26819);
            bool3 = bool2;
            break;
            i = (int)paramMotionEvent.getX();
            int k = (int)paramMotionEvent.getY();
            Object localObject2 = getLayout();
            k = ((Layout)localObject2).getOffsetForHorizontal(((Layout)localObject2).getLineForVertical(k), i);
            localObject2 = (k[])getText().getSpans(k, k + 1, k.class);
            if ((com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().isEditable()) && (i < b.del()) && (localObject2.length != 0))
            {
              ab.i("noteeditor.WXRTEditText", "clicked todo");
              this.uPG.deg();
              localObject2[0].a(this, (Spannable)localObject1, paramMotionEvent, localObject2[0]);
            }
            else
            {
              deR();
              this.uQf.a(1, paramMotionEvent.getRawX(), paramMotionEvent.getRawY(), paramMotionEvent.getX(), paramMotionEvent.getY(), j);
              deQ();
              this.gyS.ae(500L, 0L);
              continue;
              deR();
              deQ();
            }
          }
          deQ();
        }
        while (this.uQf == null);
        localObject1 = this.uQf;
        float f1 = paramMotionEvent.getRawX();
        float f2 = paramMotionEvent.getRawY();
        float f3 = paramMotionEvent.getX();
        float f4 = paramMotionEvent.getY();
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).uQX = f1;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).uQY = f2;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).uQZ = f3;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).uRa = f4;
        if (((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).klY != 1)
          break label533;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).uRb = j;
        i = this.uQf.getType();
        deR();
      }
      while (i != 2);
      if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().isEditable())
        if (hasFocus())
        {
          if ((getSelectionStart() != getSelectionEnd()) || (j != getSelectionStart()))
            break label716;
          bool3 = true;
          bool1 = true;
        }
    }
    while (true)
    {
      setIgnoreSelectChangeByMultiSelect(true);
      setSelection(j);
      setIgnoreSelectChangeByMultiSelect(false);
      if (this.uPG != null)
      {
        this.uPG.g(true, 50L);
        this.uPG.Kb(1);
      }
      gI(j, j);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().ab(bool1, bool3);
      break label132;
      label533: ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).uRb = 0;
      break label407;
      requestFocus();
      bool3 = false;
      bool1 = false;
      continue;
      paramMotionEvent = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfd();
      bool3 = bool1;
      if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfi())
      {
        bool3 = bool1;
        if (paramMotionEvent.dfa() == 1)
        {
          bool3 = bool1;
          if (paramMotionEvent.coc == this.uQd)
          {
            bool3 = bool1;
            if (paramMotionEvent.startOffset == j)
              bool3 = true;
          }
        }
      }
      gI(j, j);
      paramMotionEvent = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb();
      if (!com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit)
        break label132;
      paramMotionEvent.dfj();
      paramMotionEvent.dfh();
      paramMotionEvent.h(true, 50L);
      paramMotionEvent.oq(true);
      paramMotionEvent.op(bool3);
      break label132;
      if ((paramMotionEvent.getAction() == 1) && (this.uPG != null))
      {
        this.uPG.g(true, 300L);
        this.uPG.Kb(1);
      }
      bool3 = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(26819);
      break;
      label716: bool3 = false;
      bool1 = true;
    }
  }

  public void setEditTextType(int paramInt)
  {
    this.uPQ = paramInt;
  }

  public void setIgnoreSelectChangeByMultiSelect(boolean paramBoolean)
  {
    this.uQg = paramBoolean;
  }

  public void setMaxHeight(int paramInt)
  {
    AppMethodBeat.i(26791);
    super.setMaxHeight(paramInt);
    AppMethodBeat.o(26791);
  }

  public void setPosInDataList(int paramInt)
  {
    this.uQd = paramInt;
  }

  public void setRichTextEditing(String paramString)
  {
    AppMethodBeat.i(26793);
    deL();
    if (!bo.isNullOrNil(paramString))
      setSpannableText(com.tencent.mm.plugin.wenote.model.nativenote.a.a.ahb(paramString));
    while (true)
    {
      deM();
      AppMethodBeat.o(26793);
      return;
      setText("");
    }
  }

  public void setSpannableText(Spanned paramSpanned)
  {
    AppMethodBeat.i(26794);
    deL();
    deN();
    super.setText(paramSpanned, TextView.BufferType.EDITABLE);
    deO();
    deP();
    u.a(this, new t[0]);
    deM();
    AppMethodBeat.o(26794);
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(26795);
    deL();
    super.setText(paramString);
    deM();
    AppMethodBeat.o(26795);
  }

  public void setTextWithoutIgnore(String paramString)
  {
    AppMethodBeat.i(26796);
    super.setText(paramString);
    AppMethodBeat.o(26796);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText
 * JD-Core Version:    0.6.2
 */