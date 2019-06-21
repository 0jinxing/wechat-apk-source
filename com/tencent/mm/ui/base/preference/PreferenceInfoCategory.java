package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PreferenceInfoCategory extends Preference
{
  public View.OnClickListener yDo;
  public View.OnClickListener yDp;
  public int yfj;

  public PreferenceInfoCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PreferenceInfoCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107281);
    this.yDo = null;
    this.yDp = null;
    this.yfj = 0;
    setLayoutResource(2130970188);
    AppMethodBeat.o(107281);
  }

  protected final void onBindView(View paramView)
  {
    AppMethodBeat.i(107282);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(16908310);
    if (localTextView == null)
    {
      AppMethodBeat.o(107282);
      return;
    }
    if ((getTitle() == null) || (getTitle().length() <= 0))
      localTextView.setVisibility(8);
    while (true)
    {
      paramView = (ImageView)paramView.findViewById(2131826064);
      paramView.setOnClickListener(this.yDo);
      if (this.yfj > 0)
        paramView.setImageResource(this.yfj);
      AppMethodBeat.o(107282);
      break;
      localTextView.setVisibility(0);
      localTextView.setText(getTitle());
      localTextView.setOnClickListener(this.yDp);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.PreferenceInfoCategory
 * JD-Core Version:    0.6.2
 */