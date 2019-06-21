package com.tencent.mm.plugin.ipcall.ui;

import android.graphics.Paint;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.protocal.protobuf.crw;
import com.tencent.mm.ui.MMActivity;
import java.util.Iterator;
import java.util.LinkedList;

final class b$2
  implements TextWatcher
{
  b$2(b paramb)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(21971);
    paramEditable = this.nAl.nzS.getText().toString().replace("+", "");
    if ((paramEditable.startsWith("0")) || (paramEditable.startsWith("*")) || (paramEditable.startsWith("#")))
    {
      this.nAl.nzS.setText("+");
      this.nAl.nAa = "+";
    }
    AppMethodBeat.o(21971);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21970);
    if (this.nAl.nzW.getLayoutParams() != null)
    {
      paramCharSequence = this.nAl.nzS.getPaint();
      if ("+".equals(this.nAl.nzS.getText().toString()))
      {
        paramInt1 = (int)paramCharSequence.measureText(this.nAl.nzS.getText().toString());
        this.nAl.nzU.setVisibility(8);
        this.nAl.nzX.setVisibility(8);
        paramCharSequence = (RelativeLayout.LayoutParams)this.nAl.nzW.getLayoutParams();
        paramCharSequence.width = paramInt1;
        this.nAl.nzW.setLayoutParams(paramCharSequence);
      }
    }
    else
    {
      paramCharSequence = this.nAl.nzS.getText().toString().replace("+", "");
      if (!a.Pt(paramCharSequence))
        break label364;
      this.nAl.nzX.setText(a.Pq(paramCharSequence));
      if ((this.nAl.nAd == null) || (this.nAl.nAd.size() <= 0))
        break label386;
      String str = a.Pr(paramCharSequence);
      Iterator localIterator = this.nAl.nAd.iterator();
      while (localIterator.hasNext())
      {
        crw localcrw = (crw)localIterator.next();
        if ((localcrw != null) && (localcrw.guW.equals(str)))
        {
          paramInt1 = 1;
          label255: if (paramInt1 == 0)
            break label391;
          this.nAl.nzY.setVisibility(0);
        }
      }
    }
    while (true)
    {
      if (this.nAl.nzQ != null)
        this.nAl.nzQ.Pa(paramCharSequence);
      AppMethodBeat.o(21970);
      return;
      paramInt1 = (int)paramCharSequence.measureText(this.nAl.nzS.getText() + "+");
      this.nAl.nzU.setVisibility(0);
      this.nAl.nzX.setVisibility(0);
      break;
      paramInt1 = 0;
      break label255;
      label364: this.nAl.nzX.setText(this.nAl.crP.getString(2131300721));
      label386: paramInt1 = 0;
      break label255;
      label391: this.nAl.nzY.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.2
 * JD-Core Version:    0.6.2
 */