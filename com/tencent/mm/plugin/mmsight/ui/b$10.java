package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.mm.plugin.mmsight.segment.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class b$10
  implements c.a
{
  b$10(b paramb)
  {
  }

  public final void iY(boolean paramBoolean)
  {
    AppMethodBeat.i(55156);
    if (paramBoolean)
    {
      ab.e("MicroMsg.MMSightVideoEditor", "Not Supported init SegmentSeekBar failed.");
      al.d(new b.10.1(this));
      AppMethodBeat.o(55156);
    }
    while (true)
    {
      return;
      if (b.w(this.oBV) != null)
      {
        b.c(this.oBV, b.w(this.oBV).getDurationMs());
        ab.i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared success %d", new Object[] { Integer.valueOf(b.d(this.oBV)) });
        try
        {
          if (b.f(this.oBV) != null)
          {
            b.a(this.oBV, Math.round(b.d(this.oBV) * b.w(this.oBV).bQa()));
            b.b(this.oBV, Math.round(b.d(this.oBV) * b.w(this.oBV).bQb()));
            if (b.c(this.oBV) <= 0)
            {
              if (b.d(this.oBV) > b.l(this.oBV).duration * 1000 + 500)
                break label273;
              b.b(this.oBV, b.d(this.oBV));
            }
          }
          while (true)
          {
            ab.i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared, start: %s, end: %s, duration: %s", new Object[] { Integer.valueOf(b.s(this.oBV)), Integer.valueOf(b.c(this.oBV)), Integer.valueOf(b.d(this.oBV)) });
            b.x(this.oBV);
            AppMethodBeat.o(55156);
            break;
            label273: b.b(this.oBV, b.l(this.oBV).duration * 1000);
          }
        }
        catch (Exception localException)
        {
        }
      }
      else
      {
        AppMethodBeat.o(55156);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.10
 * JD-Core Version:    0.6.2
 */