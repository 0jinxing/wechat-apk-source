package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.ui.m;

public abstract class b$b extends com.tencent.mm.plugin.fts.a.d.a.a.b
{
  public b$b(b paramb)
  {
    super(paramb);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    paramContext = LayoutInflater.from(paramContext).inflate(2130969613, paramViewGroup, false);
    paramViewGroup = (b.a)this.mJX.mJV;
    paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
    paramViewGroup.gnB = ((TextView)paramContext.findViewById(2131821185));
    paramViewGroup.gnC = ((TextView)paramContext.findViewById(2131820991));
    paramViewGroup.mJW = ((TextView)paramContext.findViewById(2131824211));
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramContext.setTag(paramViewGroup);
    return paramContext;
  }

  public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    paramContext = (b.a)parama;
    parama = (b)parama1;
    m.p(paramContext.contentView, this.mJX.mFk);
    com.tencent.mm.pluginsdk.ui.a.b.b(paramContext.ejo, parama.username);
    m.a(parama.jMY, paramContext.gnB);
    m.a(parama.jMZ, paramContext.gnC);
    m.b(parama.mJU, paramContext.mJW);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.b.b
 * JD-Core Version:    0.6.2
 */