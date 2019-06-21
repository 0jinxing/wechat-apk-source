package com.tencent.mm.view;

import android.view.View;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SmileySubGrid$a extends SmileySubGrid.d
  implements Runnable
{
  private SmileySubGrid$a(SmileySubGrid paramSmileySubGrid)
  {
    super(paramSmileySubGrid, (byte)0);
  }

  public final void run()
  {
    AppMethodBeat.i(62955);
    ab.i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "LongPress run");
    int i = this.Abc.aia;
    Object localObject = this.Abc;
    localObject = ((SmileySubGrid)localObject).getChildAt(i - ((SmileySubGrid)localObject).getFirstVisiblePosition());
    if (localObject != null)
    {
      int j = this.Abc.aia;
      long l = this.Abc.getAdapter().getItemId(this.Abc.aia);
      if (dJl())
      {
        ab.i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "CheckForLongPress performLongPress position:[%d] id:[%d]", new Object[] { Integer.valueOf(j), Long.valueOf(l) });
        SmileySubGrid.a(this.Abc, (View)localObject, i);
        this.Abc.ath = -1;
        this.Abc.yto = 5;
        this.Abc.setScrollEnable(false);
      }
    }
    AppMethodBeat.o(62955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileySubGrid.a
 * JD-Core Version:    0.6.2
 */