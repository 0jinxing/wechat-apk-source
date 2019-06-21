package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public final class e extends Preference
{
  private View kRR;
  public View.OnClickListener lDG;
  private View mView;
  public String mXp;
  public boolean mXt;
  public int peA;
  private int peB;
  private int peC;

  public e(Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(47126);
    this.mView = null;
    this.peA = 2147483647;
    this.peB = -1;
    this.peC = -1;
    setLayoutResource(2130969911);
    AppMethodBeat.o(47126);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47127);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(47127);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(47128);
    super.onBindView(paramView);
    Object localObject = (TextView)paramView.findViewById(2131825197);
    TextView localTextView = (TextView)paramView.findViewById(2131825198);
    ((TextView)localObject).setText(getTitle());
    this.kRR = paramView;
    if (this.peA != 2147483647)
      localTextView.setTextColor(this.peA);
    if (this.mXt)
      if ((this.peB >= 0) && (this.peC > 0))
      {
        paramView = new j(this.mContext);
        localObject = new SpannableString(this.mXp);
        paramView.tHw = new e.1(this);
        localTextView.setMovementMethod(LinkMovementMethod.getInstance());
        ((SpannableString)localObject).setSpan(paramView, this.peB, this.peC, 33);
        localTextView.setText((CharSequence)localObject);
        AppMethodBeat.o(47128);
      }
    while (true)
    {
      return;
      if (this.peA != 2147483647)
        localTextView.setTextColor(this.peA);
      while (true)
      {
        localTextView.setOnClickListener(this.lDG);
        localTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, this.mXp, localTextView.getTextSize()));
        AppMethodBeat.o(47128);
        break;
        localTextView.setTextColor(this.mContext.getResources().getColor(2131690261));
      }
      localTextView.setOnClickListener(null);
      localTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, this.mXp, localTextView.getTextSize()));
      AppMethodBeat.o(47128);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.e
 * JD-Core Version:    0.6.2
 */