package com.tencent.mm.ui.contact;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.util.List;

public final class u extends LinearLayout
{
  private Context context;
  private LinearLayout mpt;
  private List<String> zog;
  private u.a zoh;
  private u.b zoi;

  public u(Context paramContext, u.a parama)
  {
    super(paramContext);
    AppMethodBeat.i(33807);
    this.mpt = null;
    this.context = paramContext;
    this.zoh = parama;
    reset();
    AppMethodBeat.o(33807);
  }

  public final int getOpenIMCount()
  {
    AppMethodBeat.i(33808);
    int i;
    if (this.zog == null)
    {
      i = 0;
      AppMethodBeat.o(33808);
    }
    while (true)
    {
      return i;
      i = this.zog.size();
      AppMethodBeat.o(33808);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(33809);
    aw.ZK();
    this.zog = c.XM().dsq();
    if ((this.zog == null) || (this.zog.size() <= 0))
    {
      ab.i("MicroMsg.OpenIMListHeaderView", "openimIdList is null");
      AppMethodBeat.o(33809);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.OpenIMListHeaderView", "openim list size = %s", new Object[] { Integer.valueOf(this.zog.size()) });
      if (this.mpt == null)
      {
        View.inflate(getContext(), 2130970337, this);
        this.mpt = ((LinearLayout)findViewById(2131821064));
      }
      this.mpt.removeAllViews();
      int i = 0;
      if (i < this.zog.size())
      {
        Object localObject = (String)this.zog.get(i);
        localObject = new v(getContext(), (String)localObject);
        this.mpt.addView((View)localObject);
        if (i == this.zog.size() - 1)
        {
          localObject = ((v)localObject).findViewById(2131823612);
          int j = ((View)localObject).getPaddingLeft();
          ((View)localObject).setBackgroundResource(2130839162);
          ((View)localObject).setPadding(j, 0, 0, 0);
        }
        while (true)
        {
          i++;
          break;
          ((v)localObject).findViewById(2131823612).setBackground(null);
          ((v)localObject).findViewById(2131823612).findViewById(2131826449).setBackgroundResource(2130839162);
        }
      }
      AppMethodBeat.o(33809);
    }
  }

  public final void setOnVisibilityChangeListener(u.b paramb)
  {
    this.zoi = paramb;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(33810);
    u.b localb;
    if ((this.zoi != null) && (paramInt != getVisibility()))
    {
      localb = this.zoi;
      if (paramInt != 0)
        break label49;
    }
    label49: for (boolean bool = true; ; bool = false)
    {
      localb.qB(bool);
      super.setVisibility(paramInt);
      AppMethodBeat.o(33810);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.u
 * JD-Core Version:    0.6.2
 */