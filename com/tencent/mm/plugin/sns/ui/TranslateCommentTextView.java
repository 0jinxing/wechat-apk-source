package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TranslateCommentTextView extends LinearLayout
{
  public MaskTextView rDZ;
  public SnsTranslateResultView rrm;

  public TranslateCommentTextView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(39904);
    init();
    AppMethodBeat.o(39904);
  }

  public TranslateCommentTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(39905);
    init();
    AppMethodBeat.o(39905);
  }

  private void init()
  {
    AppMethodBeat.i(39906);
    LayoutInflater.from(getContext()).inflate(2130970925, this);
    this.rDZ = ((MaskTextView)findViewById(2131828231));
    this.rrm = ((SnsTranslateResultView)findViewById(2131827715));
    this.rrm.setVisibility(8);
    AppMethodBeat.o(39906);
  }

  public TextView getOriginCommentTextView()
  {
    return this.rDZ;
  }

  public SnsTranslateResultView getTranslateResultView()
  {
    return this.rrm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.TranslateCommentTextView
 * JD-Core Version:    0.6.2
 */