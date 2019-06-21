package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class VoiceSearchEditText extends EditText
{
  private Context context;
  public String jjo;
  private View.OnClickListener qqV;
  final Drawable yAZ;
  final Drawable yBa;
  final Drawable yBb;
  private VoiceSearchEditText.a yBc;
  private boolean yBd;
  private boolean yBe;
  private boolean yBf;

  public VoiceSearchEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107091);
    this.jjo = "";
    this.yAZ = getResources().getDrawable(2130840572);
    this.yBa = null;
    this.yBb = getResources().getDrawable(2130840093);
    this.yBd = true;
    this.yBe = false;
    this.yBf = false;
    init(paramContext);
    AppMethodBeat.o(107091);
  }

  public VoiceSearchEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107092);
    this.jjo = "";
    this.yAZ = getResources().getDrawable(2130840572);
    this.yBa = null;
    this.yBb = getResources().getDrawable(2130840093);
    this.yBd = true;
    this.yBe = false;
    this.yBf = false;
    init(paramContext);
    AppMethodBeat.o(107092);
  }

  private void dAv()
  {
    AppMethodBeat.i(107095);
    this.yBd = true;
    if (this.yBe)
    {
      setCompoundDrawables(this.yBa, getCompoundDrawables()[1], this.yAZ, getCompoundDrawables()[3]);
      AppMethodBeat.o(107095);
    }
    while (true)
    {
      return;
      if (getText().toString().length() > 0)
      {
        setCompoundDrawables(this.yBa, getCompoundDrawables()[1], this.yBb, getCompoundDrawables()[3]);
        AppMethodBeat.o(107095);
      }
      else
      {
        setCompoundDrawables(this.yBa, getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
        AppMethodBeat.o(107095);
      }
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(107094);
    this.context = paramContext;
    this.yBe = false;
    this.yAZ.setBounds(0, 0, this.yAZ.getIntrinsicWidth(), this.yAZ.getIntrinsicHeight());
    this.yBb.setBounds(0, 0, this.yBb.getIntrinsicWidth(), this.yBb.getIntrinsicHeight());
    dAv();
    setOnTouchListener(new VoiceSearchEditText.1(this));
    addTextChangedListener(new VoiceSearchEditText.2(this));
    setOnFocusChangeListener(new VoiceSearchEditText.3(this));
    if ((paramContext instanceof Activity))
    {
      paramContext = ((Activity)paramContext).getCurrentFocus();
      if ((paramContext == null) || (paramContext != this))
        break label141;
    }
    label141: for (this.yBf = true; ; this.yBf = false)
    {
      requestFocus();
      AppMethodBeat.o(107094);
      return;
    }
  }

  public void setNeedIcon(boolean paramBoolean)
  {
  }

  public void setOnContentClearListener(VoiceSearchEditText.a parama)
  {
    this.yBc = parama;
  }

  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(107093);
    this.qqV = paramOnClickListener;
    this.yBe = true;
    dAv();
    AppMethodBeat.o(107093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.VoiceSearchEditText
 * JD-Core Version:    0.6.2
 */