package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k$a extends a.b
{
  public k$a(k paramk)
  {
    super(paramk);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(105303);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130970611, paramViewGroup, false);
    paramContext = (k.b)this.zqm.zql;
    paramContext.gnB = ((TextView)paramViewGroup.findViewById(2131821185));
    paramContext.contentView = paramViewGroup.findViewById(2131826213);
    paramContext.gnD = ((CheckBox)paramViewGroup.findViewById(2131821593));
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(105303);
    return paramViewGroup;
  }

  public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105304);
    paramContext = (k.b)parama;
    paramContext.gnB.setText(2131302882);
    paramContext.gnD.setBackgroundResource(2130839525);
    paramContext.gnD.setChecked(paramBoolean2);
    paramContext.gnD.setEnabled(true);
    paramContext.gnD.setVisibility(0);
    paramContext.contentView.setBackgroundResource(2130838398);
    AppMethodBeat.o(105304);
  }

  public final boolean aov()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.k.a
 * JD-Core Version:    0.6.2
 */