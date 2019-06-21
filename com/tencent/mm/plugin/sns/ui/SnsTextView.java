package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class SnsTextView extends TextView
{
  private String nNj = "";
  private char rxN = (char)0;

  public SnsTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public int getBaseline()
  {
    AppMethodBeat.i(39397);
    try
    {
      i = super.getBaseline();
      AppMethodBeat.o(39397);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsTextView", localThrowable, "", new Object[0]);
        int i = -1;
        AppMethodBeat.o(39397);
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(39396);
    try
    {
      super.onDraw(paramCanvas);
      AppMethodBeat.o(39396);
      return;
    }
    catch (Throwable paramCanvas)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsTextView", paramCanvas, "", new Object[0]);
        AppMethodBeat.o(39396);
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(39394);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(39394);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39395);
    if ((q.etn.esi == 1) || (q.etn.esi == -1));
    while (true)
    {
      try
      {
        super.onMeasure(paramInt1, paramInt2);
        this.rxN = ((char)0);
        AppMethodBeat.o(39395);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
      {
        if (this.rxN < '\003')
        {
          try
          {
            Object localObject = getText();
            SpannableStringBuilder localSpannableStringBuilder = new android/text/SpannableStringBuilder;
            localSpannableStringBuilder.<init>((CharSequence)localObject);
            localObject = (MetricAffectingSpan[])localSpannableStringBuilder.getSpans(0, localSpannableStringBuilder.length(), MetricAffectingSpan.class);
            if ((localObject != null) && (localObject.length > 0))
            {
              localSpannableStringBuilder.insert(localSpannableStringBuilder.getSpanStart(localObject[0]) - 1, " ");
              this.rxN = ((char)(char)(this.rxN + '\001'));
              setText(localSpannableStringBuilder);
              onMeasure(paramInt1, paramInt2);
              AppMethodBeat.o(39395);
              continue;
            }
            this.rxN = ((char)100);
            continue;
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
          {
            ab.i("MicroMsg.SnsTextView", "tryToFix error set origintext " + bo.isNullOrNil(this.nNj));
            setText(this.nNj);
            onMeasure(paramInt1, paramInt2);
            this.rxN = ((char)(char)(this.rxN + '\001'));
            AppMethodBeat.o(39395);
          }
          continue;
        }
        if (this.rxN == '\003')
        {
          ab.i("MicroMsg.SnsTextView", "fix error set origintext " + bo.isNullOrNil(this.nNj));
          setText(this.nNj);
          onMeasure(paramInt1, paramInt2);
          this.rxN = ((char)(char)(this.rxN + '\001'));
          AppMethodBeat.o(39395);
          continue;
        }
        AppMethodBeat.o(39395);
        throw localIndexOutOfBoundsException2;
      }
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(39395);
    }
  }

  public boolean onPreDraw()
  {
    AppMethodBeat.i(39398);
    try
    {
      bool = super.onPreDraw();
      AppMethodBeat.o(39398);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = true;
        AppMethodBeat.o(39398);
      }
    }
  }

  public boolean onTextContextMenuItem(int paramInt)
  {
    AppMethodBeat.i(39393);
    boolean bool = super.onTextContextMenuItem(paramInt);
    AppMethodBeat.o(39393);
    return bool;
  }

  public void setOriginText(String paramString)
  {
    this.nNj = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTextView
 * JD-Core Version:    0.6.2
 */