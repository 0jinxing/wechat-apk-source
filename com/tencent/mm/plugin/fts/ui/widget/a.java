package com.tencent.mm.plugin.fts.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends LinearLayout
{
  private View mMp;
  private FTSEditTextView mMq;
  private a.a mMr;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(62158);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130969604, this, true);
    this.mMp = findViewById(2131820977);
    this.mMp.setOnClickListener(new a.1(this));
    this.mMq = ((FTSEditTextView)findViewById(2131824183));
    AppMethodBeat.o(62158);
  }

  public final FTSEditTextView getFtsEditText()
  {
    return this.mMq;
  }

  public final void setSearchViewListener(a.a parama)
  {
    this.mMr = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.a
 * JD-Core Version:    0.6.2
 */