package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ay;

public abstract class s$e
  implements View.OnClickListener
{
  public a yJI;

  public s$e(a parama)
  {
    this.yJI = parama;
  }

  public abstract void a(View paramView, a parama, bi parambi);

  public final void onClick(View paramView)
  {
    bi localbi = ((ay)paramView.getTag()).cKd;
    if (localbi == null);
    while (true)
    {
      return;
      a(paramView, this.yJI, localbi);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.e
 * JD-Core Version:    0.6.2
 */