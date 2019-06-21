package com.tencent.mm.ui.chatting.a;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.sdk.platformtools.bo;

public class c$a extends RecyclerView.v
{
  public ImageView ejo;
  public TextView enf;
  public TextView gnB;
  public TextView gxi;
  public View mRR;

  public c$a(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(31151);
    this.mRR = paramView;
    this.ejo = ((ImageView)paramView.findViewById(2131820599));
    this.gxi = ((TextView)paramView.findViewById(2131820611));
    this.enf = ((TextView)paramView.findViewById(2131820618));
    this.gnB = ((TextView)paramView.findViewById(2131820619));
    this.gnB.setSingleLine(false);
    this.gnB.setMaxLines(2);
    paramView.setOnClickListener(new c.a.1(this));
    paramView.setOnLongClickListener(new c.a.2(this));
    AppMethodBeat.o(31151);
  }

  public static void c(TextView paramTextView, String paramString)
  {
    AppMethodBeat.i(31152);
    if (!bo.isNullOrNil(paramString))
    {
      paramTextView.getContext();
      paramTextView.setText(f.a(paramTextView.getText(), paramString));
    }
    AppMethodBeat.o(31152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.c.a
 * JD-Core Version:    0.6.2
 */