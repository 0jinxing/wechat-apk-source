package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.ui.widget.b.a;

final class d$1
  implements View.OnLongClickListener
{
  d$1(d paramd, b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(24370);
    TextView localTextView = (TextView)paramView;
    Object localObject = new SpannableString(localTextView.getText());
    ((SpannableString)localObject).setSpan(new BackgroundColorSpan(this.pLh.context.getResources().getColor(2131690200)), 0, localTextView.getText().length(), 33);
    localTextView.setText((CharSequence)localObject);
    localObject = new a(this.pLh.context, localTextView);
    ((a)localObject).zRZ = new d.1.1(this);
    ((a)localObject).rBm = new d.1.2(this, localTextView);
    ((a)localObject).zHM = new d.1.3(this, localTextView);
    if ((paramView.getTag(2131820679) instanceof int[]))
    {
      paramView = (int[])paramView.getTag(2131820679);
      ((a)localObject).dn(paramView[0], paramView[1]);
    }
    while (true)
    {
      AppMethodBeat.o(24370);
      return true;
      ((a)localObject).dn(this.pLh.jLX, this.pLh.jLY);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.d.1
 * JD-Core Version:    0.6.2
 */