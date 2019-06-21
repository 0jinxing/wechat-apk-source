package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.choosemsgfile.b.c.g;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;

public class c extends a<l>
{
  private final long mTimeStamp;

  public c(g paramg, long paramLong)
  {
    super(paramg);
    this.mTimeStamp = paramLong;
  }

  public void a(l paraml, int paramInt)
  {
    AppMethodBeat.i(54292);
    if ((paramInt == this.kuj.getItemCount() - 1) || (b.hb(this.kuj.ts(paramInt + 1).getTimeStamp()) != b.hb(this.mTimeStamp)))
    {
      paraml.gnf.setVisibility(8);
      AppMethodBeat.o(54292);
    }
    while (true)
    {
      return;
      paraml.gnf.setVisibility(0);
      paraml.gnf.setText(b.ha(this.mTimeStamp));
      if (this.kuj.bfz())
      {
        paraml.kuE.setVisibility(0);
        AppMethodBeat.o(54292);
      }
      else
      {
        paraml.kuE.setVisibility(8);
        AppMethodBeat.o(54292);
      }
    }
  }

  public final long getTimeStamp()
  {
    return this.mTimeStamp;
  }

  public final int getType()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.c
 * JD-Core Version:    0.6.2
 */