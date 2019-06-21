package com.tencent.mm.plugin.appbrand.game.d;

import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.MBRuntime.MBParams;
import com.tencent.magicbrush.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.a.e;
import com.tencent.mm.plugin.appbrand.report.quality.i;
import com.tencent.mm.plugin.appbrand.report.quality.i.a;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.f;

final class c$1
  implements ap.a
{
  c$1(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(130171);
    if (c.a(this.hrG) == null)
    {
      AppMethodBeat.o(130171);
      return true;
    }
    Object localObject1 = c.a(this.hrG).getCurrentFps();
    c.a(this.hrG, Math.min(c.b(this.hrG), ((a.a)localObject1).bSi));
    Object localObject2 = c.a(this.hrG).getParams();
    c localc = this.hrG;
    double d1 = ((a.a)localObject1).bSi;
    double d2 = c.b(this.hrG);
    double d3 = ((a.a)localObject1).bSj;
    boolean bool = ((MBRuntime.MBParams)localObject2).use_command_buffer;
    localc.bot.setLength(0);
    localc.bot.append("MinFPS[").append(Math.round(d2)).append("] RT-FPS[").append(Math.round(d1)).append("] EX-FPS[").append(Math.round(d3)).append("]");
    if ((f.DEBUG) && (((Boolean)e.Aq("showmemory").Uw()).booleanValue()))
    {
      localObject1 = localc.bot.append(" MEMORY[");
      localObject2 = i.iCT;
      ((StringBuilder)localObject1).append(i.aLB().iCV).append("]");
    }
    if (f.DEBUG)
    {
      localObject1 = localc.bot.append("").append(" ");
      if (!bool)
        break label262;
    }
    label262: for (localObject2 = "CommandBuffer"; ; localObject2 = "")
    {
      ((StringBuilder)localObject1).append((String)localObject2);
      localc.setText(localc.bot);
      AppMethodBeat.o(130171);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.c.1
 * JD-Core Version:    0.6.2
 */