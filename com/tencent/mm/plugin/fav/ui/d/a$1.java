package com.tencent.mm.plugin.fav.ui.d;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import java.util.Map;

final class a$1
  implements CompoundButton.OnCheckedChangeListener
{
  a$1(a parama)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(74612);
    if (paramCompoundButton.getTag() == null)
    {
      AppMethodBeat.o(74612);
      return;
    }
    paramCompoundButton = (com.tencent.mm.plugin.fav.a.g)paramCompoundButton.getTag();
    if (paramBoolean)
    {
      com.tencent.mm.plugin.fav.a.g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramCompoundButton.field_localId);
      this.moF.moE.mli.put(Long.valueOf(paramCompoundButton.field_localId), localg);
    }
    while (true)
    {
      if (this.moF.moE.moG != null)
        this.moF.moE.moG.iI(paramCompoundButton.field_localId);
      AppMethodBeat.o(74612);
      break;
      this.moF.moE.mli.remove(Long.valueOf(paramCompoundButton.field_localId));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.a.1
 * JD-Core Version:    0.6.2
 */