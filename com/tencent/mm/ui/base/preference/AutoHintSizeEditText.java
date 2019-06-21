package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class AutoHintSizeEditText extends EditText
{
  private float yBi;
  private Paint yBj;
  private String yBk;
  private int yBl;
  private float yBm;

  public AutoHintSizeEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107125);
    this.yBk = "";
    this.yBl = -2147483648;
    init();
    AppMethodBeat.o(107125);
  }

  public AutoHintSizeEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107124);
    this.yBk = "";
    this.yBl = -2147483648;
    init();
    AppMethodBeat.o(107124);
  }

  private void a(Editable paramEditable, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(107127);
    if ((paramEditable != null) && (!bo.isNullOrNil(paramEditable.toString())))
    {
      if (getTextSize() != this.yBi)
      {
        ab.v("MicroMsg.AutoHintSizeEdittext", "content not null, reset text size %f", new Object[] { Float.valueOf(this.yBi) });
        setTextSize(0, this.yBi);
      }
      AppMethodBeat.o(107127);
    }
    while (true)
    {
      return;
      if ((paramCharSequence == null) || (bo.isNullOrNil(paramCharSequence.toString())))
      {
        if (getTextSize() != this.yBi)
        {
          ab.v("MicroMsg.AutoHintSizeEdittext", "hint is null, reset text size %f", new Object[] { Float.valueOf(this.yBi) });
          setTextSize(0, this.yBi);
        }
        AppMethodBeat.o(107127);
      }
      else
      {
        paramEditable = paramCharSequence.toString();
        if ((this.yBk.equals(paramEditable)) && (this.yBl == paramInt))
        {
          if (getTextSize() != this.yBm)
          {
            ab.v("MicroMsg.AutoHintSizeEdittext", "use last hint text size %f", new Object[] { Float.valueOf(this.yBm) });
            setTextSize(0, this.yBm);
          }
          AppMethodBeat.o(107127);
        }
        else
        {
          this.yBk = paramEditable;
          this.yBl = paramInt;
          if (getPaint().measureText(paramEditable) > paramInt)
          {
            int i = getResources().getDimensionPixelSize(2131427866);
            int j = a.fromDPToPix(getContext(), 1);
            int k = (int)this.yBi - j;
            while (true)
            {
              if (k <= i)
                break label347;
              this.yBj.setTextSize(k);
              if (this.yBj.measureText(paramEditable) < paramInt)
              {
                ab.v("MicroMsg.AutoHintSizeEdittext", "get new hint text size %d", new Object[] { Integer.valueOf(k) });
                this.yBm = k;
                setTextSize(0, k);
                AppMethodBeat.o(107127);
                break;
              }
              k -= j;
            }
          }
          label347: AppMethodBeat.o(107127);
        }
      }
    }
  }

  private void init()
  {
    AppMethodBeat.i(107126);
    this.yBi = getTextSize();
    this.yBm = this.yBi;
    this.yBj = new Paint(getPaint());
    addTextChangedListener(new AutoHintSizeEditText.1(this));
    AppMethodBeat.o(107126);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107128);
    ab.d("MicroMsg.AutoHintSizeEdittext", "on layout, changed %B", new Object[] { Boolean.valueOf(paramBoolean) });
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
      a(getText(), getHint(), paramInt3 - paramInt1 - getPaddingLeft() - getPaddingRight());
    AppMethodBeat.o(107128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.AutoHintSizeEditText
 * JD-Core Version:    0.6.2
 */