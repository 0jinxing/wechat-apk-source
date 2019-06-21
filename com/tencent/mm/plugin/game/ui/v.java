package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.n.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class v
  implements View.OnClickListener
{
  private int gOW;
  private Context mContext;
  private int mPosition;
  private int mXC;
  private int nne;

  public v(Context paramContext)
  {
    this.mContext = paramContext;
    this.gOW = 13;
  }

  public final void em(int paramInt1, int paramInt2)
  {
    this.mXC = paramInt1;
    this.nne = 1301;
    this.mPosition = paramInt2;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112217);
    if (paramView.getTag() == null)
      AppMethodBeat.o(112217);
    while (true)
    {
      return;
      int i;
      if ((paramView.getTag() instanceof n))
      {
        paramView = (n)paramView.getTag();
        if (!bo.ek(paramView.mWp))
        {
          String str = ((n.i)paramView.mWp.get(0)).mXv;
          if (!bo.isNullOrNil(str))
          {
            i = c.ax(this.mContext, str);
            b.a(this.mContext, this.gOW, this.nne, this.mPosition, i, 0, paramView.field_appId, this.mXC, paramView.field_msgType, paramView.field_gameMsgId, paramView.mXc, null);
            AppMethodBeat.o(112217);
          }
          else
          {
            ab.e("MicroMsg.GameURLClickListener", "message's jumpurl is null");
          }
        }
        else
        {
          AppMethodBeat.o(112217);
        }
      }
      else if ((paramView.getTag() instanceof String))
      {
        paramView = (String)paramView.getTag();
        if (bo.isNullOrNil(paramView))
        {
          AppMethodBeat.o(112217);
        }
        else
        {
          i = c.ax(this.mContext, paramView);
          b.a(this.mContext, this.gOW, this.nne, this.mPosition, i, this.mXC, null);
        }
      }
      else
      {
        AppMethodBeat.o(112217);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.v
 * JD-Core Version:    0.6.2
 */