package com.tencent.mm.ui.widget.textview;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.neattextview.textview.view.NeatTextView;
import java.util.ArrayList;

final class a$2
  implements View.OnLongClickListener
{
  a$2(a parama)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(138207);
    ai.d("SelectableTextHelper", "onLongClick", new Object[0]);
    this.zWL.zWA = false;
    int j;
    if (this.zWL.zWn != null)
    {
      this.zWL.zWE = true;
      this.zWL.zWF = false;
      this.zWL.zWG = false;
      Object localObject1 = b.fs(this.zWL.zWm);
      if ((localObject1 instanceof SpannableString))
      {
        localObject2 = this.zWL;
        localObject1 = (SpannableString)localObject1;
        ((a)localObject2).zWK = new ArrayList();
        i = 0;
        if (i < ((SpannableString)localObject1).length())
        {
          j = ((SpannableString)localObject1).nextSpanTransition(i, ((SpannableString)localObject1).length(), ImageSpan.class);
          Object localObject3 = (ImageSpan[])((SpannableString)localObject1).getSpans(i, j, ImageSpan.class);
          if (1 == localObject3.length)
          {
            localObject3 = new a.c((a)localObject2);
            ((a.c)localObject3).start = i;
            ((a.c)localObject3).end = j;
            ((a)localObject2).zWK.add(localObject3);
          }
          while (true)
          {
            ai.d("SelectableTextHelper", "spans from %d to %d.", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            i = j;
            break;
            ai.e("SelectableTextHelper", "other situation occur! length: %d.", new Object[] { Integer.valueOf(localObject3.length) });
          }
        }
        ai.d("SelectableTextHelper", ((a)localObject2).zWK.toString(), new Object[0]);
      }
      this.zWL.dLL();
      if ((this.zWL.zWy > 0) && (this.zWL.zWy < b.fs(this.zWL.zWm).length()))
      {
        a.a(this.zWL, this.zWL.zWy);
        this.zWL.zWC = false;
        this.zWL.zWD = false;
        this.zWL.dLS();
        this.zWL.dLO();
      }
      while (true)
      {
        AppMethodBeat.o(138207);
        return true;
        a.a(this.zWL, b.fs(this.zWL.zWm).length());
        this.zWL.zWC = true;
        this.zWL.zWD = false;
        this.zWL.dLO();
        this.zWL.zWn.eR(paramView);
      }
    }
    this.zWL.zWE = false;
    paramView = this.zWL;
    int k = this.zWL.zWr;
    int i = this.zWL.zWs;
    Object localObject2 = paramView.zWm;
    if ((localObject2 instanceof NeatTextView))
    {
      localObject2 = ((NeatTextView)localObject2).getLayout();
      if (localObject2 == null)
        break label588;
      i = ((com.tencent.neattextview.textview.layout.a)localObject2).hQ(k, i);
    }
    while (true)
    {
      paramView.hG(i, i + 1);
      this.zWL.dLL();
      this.zWL.zWC = false;
      this.zWL.zWD = false;
      this.zWL.dLS();
      this.zWL.dLO();
      break;
      if ((localObject2 instanceof TextView))
      {
        localObject2 = ((TextView)localObject2).getLayout();
        if (localObject2 != null)
        {
          j = ((Layout)localObject2).getOffsetForHorizontal(((Layout)localObject2).getLineForVertical(i), k);
          i = j;
          if ((int)((Layout)localObject2).getPrimaryHorizontal(j) > k)
            i = ((Layout)localObject2).getOffsetToLeftOf(j);
        }
        else
        {
          i = -1;
        }
      }
      else
      {
        label588: i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.2
 * JD-Core Version:    0.6.2
 */