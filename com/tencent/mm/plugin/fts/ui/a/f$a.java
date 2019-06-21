package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.sdk.platformtools.bo;

public class f$a extends com.tencent.mm.plugin.fts.a.d.a.a.b
{
  public f$a(f paramf)
  {
    super(paramf);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(61982);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969615, paramViewGroup, false);
    paramViewGroup = (f.b)this.mKs.mKr;
    paramViewGroup.mKt = ((TextView)paramContext.findViewById(2131824213));
    paramViewGroup.mKu = ((ImageView)paramContext.findViewById(2131824212));
    paramViewGroup.mKv = ((TextView)paramContext.findViewById(2131824216));
    paramViewGroup.mKw = ((ImageView)paramContext.findViewById(2131824215));
    paramViewGroup.mKx = ((TextView)paramContext.findViewById(2131824214));
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramViewGroup.mKk = paramContext.findViewById(2131820896);
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(61982);
    return paramContext;
  }

  public void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61983);
    paramContext = (f.b)parama;
    m.a(this.mKs.mKl, paramContext.mKt);
    com.tencent.mm.pluginsdk.ui.a.b.b(paramContext.mKu, this.mKs.mKm);
    m.a(this.mKs.mKn, paramContext.mKv);
    if (!bo.isNullOrNil(this.mKs.mKo))
    {
      paramContext.mKw.setVisibility(0);
      com.tencent.mm.pluginsdk.ui.a.b.b(paramContext.mKw, this.mKs.mKo);
      m.q(paramContext.contentView, this.mKs.mFk);
      if (this.mKs.position != 0)
        break label148;
      paramContext.mKk.setVisibility(8);
    }
    while (true)
    {
      paramContext.mKx.setVisibility(0);
      AppMethodBeat.o(61983);
      return;
      paramContext.mKw.setVisibility(8);
      break;
      label148: paramContext.mKk.setVisibility(0);
    }
  }

  public final boolean a(Context paramContext, a parama)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.f.a
 * JD-Core Version:    0.6.2
 */