package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.c.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.ui.base.preference.Preference;

public final class f extends Preference
{
  private View.OnClickListener lDG;
  private View mView;
  private String mXp;
  private boolean mXt;
  private int peA;
  private int peB;
  private int peC;

  public f(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(43908);
    this.mView = null;
    this.peA = 2147483647;
    this.peB = -1;
    this.peC = -1;
    setLayoutResource(2130970046);
    AppMethodBeat.o(43908);
  }

  public final void Uz(String paramString)
  {
    AppMethodBeat.i(43911);
    try
    {
      this.peA = Color.parseColor(paramString);
      AppMethodBeat.o(43911);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        this.peA = 2147483647;
        AppMethodBeat.o(43911);
      }
    }
  }

  public final void a(String paramString, int paramInt1, int paramInt2, View.OnClickListener paramOnClickListener)
  {
    this.mXp = paramString;
    this.mXt = true;
    this.peB = paramInt1;
    this.peC = paramInt2;
    this.lDG = paramOnClickListener;
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43909);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(43909);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(43910);
    super.onBindView(paramView);
    Object localObject = (TextView)paramView.findViewById(2131825807);
    paramView = (TextView)paramView.findViewById(2131825808);
    ((TextView)localObject).setText(getTitle());
    if (this.peA != 2147483647)
      paramView.setTextColor(this.peA);
    if (this.mXt)
      if ((this.peB >= 0) && (this.peC > 0))
      {
        localObject = new a(this.mContext);
        SpannableString localSpannableString = new SpannableString(this.mXp);
        ((a)localObject).peT = new f.1(this);
        paramView.setMovementMethod(LinkMovementMethod.getInstance());
        localSpannableString.setSpan(localObject, this.peB, this.peC, 33);
        paramView.setText(localSpannableString);
        AppMethodBeat.o(43910);
      }
    while (true)
    {
      return;
      paramView.setTextColor(this.mContext.getResources().getColor(2131690261));
      paramView.setOnClickListener(this.lDG);
      paramView.setText(j.b(this.mContext, this.mXp, paramView.getTextSize()));
      AppMethodBeat.o(43910);
      continue;
      paramView.setOnClickListener(null);
      paramView.setText(j.b(this.mContext, this.mXp, paramView.getTextSize()));
      AppMethodBeat.o(43910);
    }
  }

  public final void setContent(String paramString)
  {
    this.mXp = paramString;
    this.mXt = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.f
 * JD-Core Version:    0.6.2
 */