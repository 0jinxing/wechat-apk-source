package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class d extends a
{
  public View jOS;
  public ImageView jPf;
  public ImageView jPg;
  public ImageView jPh;
  public MMNeat7extView jPi;
  public View jPj;
  public View jPk;

  public final View a(Context paramContext, com.tencent.mm.plugin.brandservice.ui.timeline.a parama)
  {
    AppMethodBeat.i(14247);
    super.b(paramContext, parama);
    if (this.jOR != null)
    {
      paramContext = this.jOR;
      AppMethodBeat.o(14247);
    }
    while (true)
    {
      return paramContext;
      this.jOR = View.inflate(paramContext, 2130968864, null);
      aWH();
      this.jPf = ((ImageView)this.jOR.findViewById(2131821827));
      this.jPg = ((ImageView)this.jOR.findViewById(2131821828));
      this.jPh = ((ImageView)this.jOR.findViewById(2131821842));
      this.jOS = this.jOR.findViewById(2131821838);
      this.jPj = this.jOR.findViewById(2131821826);
      this.jPk = this.jOR.findViewById(2131821825);
      this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131821840));
      paramContext = this.jOR;
      AppMethodBeat.o(14247);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.d
 * JD-Core Version:    0.6.2
 */