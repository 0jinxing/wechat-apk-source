package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.q;

public class HelperHeaderPreference extends Preference
{
  private HelperHeaderPreference.a vqE;

  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(79801);
    this.vqE = new HelperHeaderPreference.a();
    AppMethodBeat.o(79801);
  }

  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(79802);
    this.vqE = new HelperHeaderPreference.a();
    AppMethodBeat.o(79802);
  }

  public final void ay(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(79804);
    this.vqE.cIS = paramString1;
    this.vqE.eoz = paramString2;
    this.vqE.hint = paramString3;
    super.callChangeListener(null);
    AppMethodBeat.o(79804);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(79803);
    ImageView localImageView = (ImageView)paramView.findViewById(2131821183);
    TextView localTextView1 = (TextView)paramView.findViewById(2131824202);
    TextView localTextView2 = (TextView)paramView.findViewById(2131823149);
    TextView localTextView3 = (TextView)paramView.findViewById(2131826545);
    ((TextView)paramView.findViewById(2131826544)).setText(2131299772);
    if (localImageView != null)
      a.b.b(localImageView, this.vqE.cIS);
    if (localTextView1 != null)
      switch (this.vqE.status)
      {
      default:
      case 1:
      case 0:
      case 2:
      }
    while (true)
    {
      if (localTextView2 != null)
        localTextView2.setText(this.vqE.eoz);
      if (localTextView3 != null)
        localTextView3.setText(this.vqE.hint);
      super.onBindView(paramView);
      AppMethodBeat.o(79803);
      return;
      localTextView1.setVisibility(0);
      localTextView1.setTextColor(q.ii(this.mContext));
      localTextView1.setText(2131303211);
      continue;
      localTextView1.setVisibility(0);
      localTextView1.setTextColor(q.ij(this.mContext));
      localTextView1.setText(2131303219);
      continue;
      localTextView1.setVisibility(8);
    }
  }

  public final void sd(int paramInt)
  {
    AppMethodBeat.i(79805);
    this.vqE.status = paramInt;
    super.callChangeListener(null);
    AppMethodBeat.o(79805);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference
 * JD-Core Version:    0.6.2
 */