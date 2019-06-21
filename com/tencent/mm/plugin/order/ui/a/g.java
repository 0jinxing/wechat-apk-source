package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class g extends Preference
{
  private static int peE;
  private static float peF = 16.0F;
  f iFE;
  private View mView;
  String peG;
  private String[] peH;
  private TextUtils.TruncateAt peI;
  private boolean peJ;

  public g(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(43913);
    this.mView = null;
    this.peJ = false;
    setLayoutResource(2130970047);
    peE = paramContext.getResources().getColor(2131690268);
    AppMethodBeat.o(43913);
  }

  public final void a(String[] paramArrayOfString, TextUtils.TruncateAt paramTruncateAt)
  {
    this.peH = paramArrayOfString;
    this.peI = paramTruncateAt;
    this.peJ = true;
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43914);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(43914);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(43915);
    super.onBindView(paramView);
    TextView localTextView1 = (TextView)paramView.findViewById(2131825809);
    TextView localTextView2 = (TextView)paramView.findViewById(2131825811);
    paramView = (LinearLayout)paramView.findViewById(2131825810);
    localTextView1.setText(getTitle());
    if ((this.peH == null) || (this.peH.length <= 1))
      localTextView2.setTextColor(peE);
    while (true)
    {
      localTextView2.setText(this.peG);
      AppMethodBeat.o(43915);
      return;
      localTextView2.setOnClickListener(new g.1(this, localTextView2, paramView));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.g
 * JD-Core Version:    0.6.2
 */