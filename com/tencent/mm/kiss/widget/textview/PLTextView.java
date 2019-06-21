package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class PLTextView extends StaticTextView
{
  private static long eNl = 0L;
  private static int eNm = 0;
  private static long eNn = -2147483648L;
  private static long eNo = 0L;
  private static int eNp = 0;
  private static long eNq = -2147483648L;
  private static long eNr = 0L;
  private static int eNs = 0;
  private static long eNt = -2147483648L;
  private static boolean eNu = false;

  public PLTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public PLTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(105708);
    super.onConfigurationChanged(paramConfiguration);
    if (getLayoutWrapper() != null)
      getLayoutWrapper().eNL = false;
    AppMethodBeat.o(105708);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(105706);
    long l = 0L;
    if (eNu)
      l = System.currentTimeMillis();
    super.onDraw(paramCanvas);
    if (eNu)
    {
      l = System.currentTimeMillis() - l;
      eNr += l;
      eNs += 1;
      if (l > eNt)
        eNt = l;
    }
    AppMethodBeat.o(105706);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105705);
    long l = 0L;
    if (eNu)
      l = System.currentTimeMillis();
    super.onMeasure(paramInt1, paramInt2);
    if (eNu)
    {
      l = System.currentTimeMillis() - l;
      eNo += l;
      eNp += 1;
      if (l > eNq)
        eNq = l;
    }
    AppMethodBeat.o(105705);
  }

  public void setText(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(105704);
    if (bo.ac(paramCharSequence))
    {
      if (h.DEBUG)
        ab.d("MicroMsg.PLTextView", "set null text");
      AppMethodBeat.o(105704);
      return;
    }
    long l1 = 0L;
    long l2 = 0L;
    if (h.DEBUG)
      l1 = System.currentTimeMillis();
    if ((getLayoutWrapper() != null) && (getLayoutWrapper().eNL))
      c.eNj.a(getConfig(), getLayoutWrapper());
    f localf = c.eNj.a(getConfig(), paramCharSequence);
    boolean bool;
    if (localf != null)
    {
      bool = true;
      w(paramCharSequence);
      setTextLayout(localf);
    }
    while (true)
    {
      if (h.DEBUG)
      {
        l2 = System.currentTimeMillis();
        ab.d("MicroMsg.PLTextView", "setText used %fms, hitCache: %b, hashCode: %d, text: %s hitCache %s", new Object[] { Double.valueOf((l2 - l1) / 1000000.0D), Boolean.valueOf(bool), Integer.valueOf(hashCode()), paramCharSequence, Boolean.valueOf(bool) });
      }
      if (eNu)
      {
        l1 = l2 - l1;
        eNl += l1;
        eNm += 1;
        if (l1 > eNn)
          eNn = l1;
      }
      AppMethodBeat.o(105704);
      break;
      bool = false;
      v(paramCharSequence);
    }
  }

  protected void v(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(105707);
    super.setText(paramCharSequence, false);
    AppMethodBeat.o(105707);
  }

  protected void w(CharSequence paramCharSequence)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.PLTextView
 * JD-Core Version:    0.6.2
 */