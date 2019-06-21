package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class MMCollapsibleTextView extends LinearLayout
{
  private int cNE;
  private Context context;
  private TextView gKl;
  private boolean hasCheck;
  private Runnable mhD;
  private TextView rhT;
  private String rhU;
  private String rhV;
  private SparseIntArray ytX;

  public MMCollapsibleTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106520);
    this.hasCheck = true;
    this.ytX = new SparseIntArray();
    this.mhD = new MMCollapsibleTextView.2(this);
    this.context = paramContext;
    this.rhU = this.context.getString(2131303900);
    this.rhV = this.context.getString(2131303535);
    paramContext = inflate(this.context, 2130970107, this);
    paramContext.setPadding(0, -3, 0, 0);
    this.gKl = ((TextView)paramContext.findViewById(2131820991));
    this.rhT = ((TextView)paramContext.findViewById(2131822813));
    this.rhT.setOnClickListener(new MMCollapsibleTextView.1(this));
    AppMethodBeat.o(106520);
  }

  public int getSpreadHeight()
  {
    AppMethodBeat.i(106521);
    ab.e("MicroMsg.CollapsibleTextView", "count:" + this.gKl.getLineCount() + "  height:" + this.gKl.getLineHeight());
    int i = this.gKl.getLineCount();
    int j = this.gKl.getLineHeight();
    AppMethodBeat.o(106521);
    return (i - 10) * j;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106523);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.hasCheck)
      AppMethodBeat.o(106523);
    while (true)
    {
      return;
      this.hasCheck = true;
      if (this.gKl.getLineCount() <= 10)
      {
        this.ytX.put(this.cNE, 0);
        AppMethodBeat.o(106523);
      }
      else
      {
        this.ytX.put(this.cNE, 1);
        post(this.mhD);
        AppMethodBeat.o(106523);
      }
    }
  }

  public void setOpClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106522);
    this.rhT.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(106522);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMCollapsibleTextView
 * JD-Core Version:    0.6.2
 */