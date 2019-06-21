package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class p extends a
{
  public View jOS;
  public ImageView jOY;
  public View jPL;
  public TextView jPY;
  public ImageView jPZ;
  public MMNeat7extView jPi;
  public View jPj;
  public View jPk;
  public ImageView jQa;
  public MMNeat7extView jQb;

  public final View a(Context paramContext, com.tencent.mm.plugin.brandservice.ui.timeline.a parama)
  {
    AppMethodBeat.i(14279);
    super.b(paramContext, parama);
    if (this.jOR != null)
    {
      paramContext = this.jOR;
      AppMethodBeat.o(14279);
    }
    while (true)
    {
      return paramContext;
      this.jOR = View.inflate(paramContext, 2130968879, null);
      aWH();
      this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131821185));
      this.jPY = ((TextView)this.jOR.findViewById(2131821873));
      this.jOY = ((ImageView)this.jOR.findViewById(2131821876));
      this.jPL = this.jOR.findViewById(2131821875);
      this.jOS = this.jOR.findViewById(2131821838);
      this.jQb = ((MMNeat7extView)this.jOR.findViewById(2131821840));
      this.jPj = this.jOR.findViewById(2131821874);
      this.jPk = this.jOR.findViewById(2131821877);
      this.jPZ = ((ImageView)this.jOR.findViewById(2131821843));
      this.jQa = ((ImageView)this.jOR.findViewById(2131821842));
      paramContext = this.jOR;
      AppMethodBeat.o(14279);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.p
 * JD-Core Version:    0.6.2
 */