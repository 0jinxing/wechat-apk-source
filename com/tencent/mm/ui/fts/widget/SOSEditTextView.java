package com.tencent.mm.ui.fts.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;

public class SOSEditTextView extends FTSEditTextView
{
  private View zyg;
  private View zyh;
  private View zyi;

  public SOSEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SOSEditTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void bBm()
  {
    AppMethodBeat.i(91594);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130970836, this, true);
    AppMethodBeat.o(91594);
  }

  public final void dJf()
  {
    AppMethodBeat.i(91596);
    getEditText().setOnFocusChangeListener(this.mLV);
    AppMethodBeat.o(91596);
  }

  @SuppressLint({"WrongViewCast"})
  public final void init()
  {
    AppMethodBeat.i(91595);
    super.init();
    this.zyg = findViewById(2131827948);
    this.zyh = findViewById(2131827950);
    this.zyi = findViewById(2131827949);
    getEditText().setOnFocusChangeListener(null);
    getEditText().setHintTextColor(getResources().getColor(2131690199));
    getEditText().setTextColor(getResources().getColor(2131690316));
    AppMethodBeat.o(91595);
  }

  public void setCancelTextViewClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(91602);
    if (this.zyh != null)
      this.zyh.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(91602);
  }

  public void setCancelTextViewVisibile(int paramInt)
  {
    AppMethodBeat.i(91601);
    if (this.zyh != null)
      this.zyh.setVisibility(paramInt);
    AppMethodBeat.o(91601);
  }

  public void setIconRes(Drawable paramDrawable)
  {
    AppMethodBeat.i(91597);
    getIconView().setImageDrawable(paramDrawable);
    AppMethodBeat.o(91597);
  }

  public void setSearchBarCancelTextContainerVisibile(int paramInt)
  {
    AppMethodBeat.i(91598);
    if (this.zyi != null)
      this.zyi.setVisibility(paramInt);
    AppMethodBeat.o(91598);
  }

  public void setVoiceBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(91600);
    if (this.zyg != null)
      this.zyg.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(91600);
  }

  public void setVoiceImageButtonVisibile(int paramInt)
  {
    AppMethodBeat.i(91599);
    if (this.zyg != null)
      this.zyg.setVisibility(paramInt);
    AppMethodBeat.o(91599);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.fts.widget.SOSEditTextView
 * JD-Core Version:    0.6.2
 */