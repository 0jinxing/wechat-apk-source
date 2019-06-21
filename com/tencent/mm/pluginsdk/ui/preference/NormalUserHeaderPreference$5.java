package com.tencent.mm.pluginsdk.ui.preference;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.b.a;

final class NormalUserHeaderPreference$5
  implements View.OnLongClickListener
{
  NormalUserHeaderPreference$5(NormalUserHeaderPreference paramNormalUserHeaderPreference)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(28078);
    if ((NormalUserHeaderPreference.d(this.vrk).getText() != null) && (NormalUserHeaderPreference.e(this.vrk) != null))
    {
      Object localObject = NormalUserHeaderPreference.d(this.vrk).getText().toString();
      int i = ((String)localObject).indexOf(':');
      paramView = (View)localObject;
      if (i >= 0)
      {
        paramView = (View)localObject;
        if (i < ((String)localObject).length())
          paramView = ((String)localObject).substring(i + 1).trim();
      }
      localObject = new SpannableString(NormalUserHeaderPreference.d(this.vrk).getText());
      ((SpannableString)localObject).setSpan(new BackgroundColorSpan(NormalUserHeaderPreference.b(this.vrk).getResources().getColor(2131690200)), i + 1, NormalUserHeaderPreference.d(this.vrk).getText().length(), 33);
      NormalUserHeaderPreference.d(this.vrk).setText((CharSequence)localObject);
      localObject = new a(NormalUserHeaderPreference.b(this.vrk), NormalUserHeaderPreference.d(this.vrk));
      ((a)localObject).zRZ = new NormalUserHeaderPreference.5.1(this);
      ((a)localObject).rBm = new NormalUserHeaderPreference.5.2(this, paramView);
      ((a)localObject).zHM = new NormalUserHeaderPreference.5.3(this);
      ((a)localObject).dn(0, 0);
    }
    AppMethodBeat.o(28078);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference.5
 * JD-Core Version:    0.6.2
 */